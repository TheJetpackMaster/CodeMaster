package com.codemaster.codemasterapp.main.ui.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.codemaster.codemasterapp.main.ui.userProfileDetails.settings.CompilerOption
import com.codemaster.codemasterapp.main.ui.userProfileDetails.settings.MiddleButtonAction
import com.codemaster.codemasterapp.main.utils.SharedPreferencesHelper
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val sharedPreferencesHelper: SharedPreferencesHelper
) : ViewModel() {

    // MutableStateFlow to observe changes in UI
    private val _isFirstTime = MutableStateFlow(false)
    val isFirstTime: StateFlow<Boolean> get() = _isFirstTime

    private val _isSignedUp = MutableStateFlow(false)
    val isSignedUp: StateFlow<Boolean> get() = _isSignedUp

    // MutableStateFlow for CompilerOption and MiddleButtonAction
    private val _selectedCompilerOption = MutableStateFlow(CompilerOption.ONLINE_COMPILER_1)
    val selectedCompilerOption: StateFlow<CompilerOption> get() = _selectedCompilerOption

    private val _selectedMiddleButtonOption = MutableStateFlow(MiddleButtonAction.COMPILER)
    val selectedMiddleButtonOption: StateFlow<MiddleButtonAction> get() = _selectedMiddleButtonOption

    private val _isUpdateDialogShown = MutableStateFlow(false)
    val isUpdateDialogShown: StateFlow<Boolean> get() = _isUpdateDialogShown

    init {
        loadPreferences()
    }

    private fun loadPreferences() {
        viewModelScope.launch {
            _isFirstTime.value = sharedPreferencesHelper.isFirstTime()
            _isSignedUp.value = sharedPreferencesHelper.isSignedUp()
            // Load saved enums
            _selectedCompilerOption.value = sharedPreferencesHelper.getSelectedCompilerOption()
            _selectedMiddleButtonOption.value = sharedPreferencesHelper.getSelectedMiddleButtonOption()
        }
    }

    // Function to set isFirstTime
    fun setIsFirstTime(isFirstTime: Boolean) {
        viewModelScope.launch {
            sharedPreferencesHelper.setIsFirstTime(isFirstTime)
            _isFirstTime.value = isFirstTime
        }
    }

    // Function to set isSignedUp
    fun setIsSignedUp(isSignedUp: Boolean) {
        viewModelScope.launch {
            sharedPreferencesHelper.setIsSignedUp(isSignedUp)
            _isSignedUp.value = isSignedUp
        }
    }

    // Function to set selected CompilerOption
    fun setSelectedCompilerOption(option: CompilerOption) {
        viewModelScope.launch {
            sharedPreferencesHelper.setSelectedCompilerOption(option)
            _selectedCompilerOption.value = option
        }
    }

    // Function to set selected MiddleButtonAction
    fun setSelectedMiddleButtonOption(option: MiddleButtonAction) {
        viewModelScope.launch {
            sharedPreferencesHelper.setSelectedMiddleButtonOption(option)
            _selectedMiddleButtonOption.value = option
        }
    }

    //
    fun isUpdateDialogueShown(isDialogShown: Boolean){
        _isUpdateDialogShown.value = isDialogShown
    }
}
