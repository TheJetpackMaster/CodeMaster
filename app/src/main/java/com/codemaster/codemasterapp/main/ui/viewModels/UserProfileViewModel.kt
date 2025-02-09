package com.codemaster.codemasterapp.main.ui.viewModels


import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.codemaster.codemasterapp.main.DataBase.userProfileDB.UserProfile
import com.codemaster.codemasterapp.main.DataBase.userProfileDB.UserProfileRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserProfileViewModel @Inject constructor(
    private val userProfileRepository: UserProfileRepository
) : ViewModel() {

    // StateFlow for the latest guest profile
    private val _guestProfile = MutableStateFlow<UserProfile?>(null)
    val guestProfile: StateFlow<UserProfile?> = _guestProfile

    init {
        fetchLatestGuestProfile()
    }

    // Create or update the guest profile
    fun createOrUpdateGuestProfile(name: String, profilePictureUrl: ByteArray? = null) {
        viewModelScope.launch {
            userProfileRepository.createOrUpdateGuestProfile(name, profilePictureUrl)
            fetchLatestGuestProfile() // Refresh the latest guest profile
        }
    }

    //Update Guest
    fun updateGuestProfile(name: String, profilePictureUrl: ByteArray? = null) {
        viewModelScope.launch {
            userProfileRepository.updateGuestProfile(name, profilePictureUrl)
            fetchLatestGuestProfile() // Refresh the latest guest profile
        }
    }

    // Fetch the latest guest profile
    private fun fetchLatestGuestProfile() {
        viewModelScope.launch {
            val guest = userProfileRepository.getLatestGuestProfile()
            _guestProfile.value = guest
            Log.d("UserProfileViewModel", "Latest guest profile: $guest")
        }
    }
}
