package com.codemaster.codemasterapp.main.utils

import android.content.SharedPreferences
import com.codemaster.codemasterapp.main.ui.userProfileDetails.settings.CompilerOption
import com.codemaster.codemasterapp.main.ui.userProfileDetails.settings.MiddleButtonAction
import com.google.gson.Gson
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SharedPreferencesHelper @Inject constructor(
    private val sharedPreferences: SharedPreferences,
    private val gson: Gson
) {

    companion object {
        private const val KEY_IS_FIRST_TIME = "is_first_time"
        private const val KEY_IS_SIGNED_UP = "is_signed_up"
        private const val KEY_SELECTED_COMPILER_OPTION = "selected_compiler_option"
        private const val KEY_SELECTED_MIDDLE_BUTTON_OPTION = "selected_middle_button_option"
    }

    // Function to save and retrieve isFirstTime flag
    fun setIsFirstTime(isFirstTime: Boolean) {
        sharedPreferences.edit().putBoolean(KEY_IS_FIRST_TIME, isFirstTime).apply()
    }

    fun isFirstTime(): Boolean {
        return sharedPreferences.getBoolean(KEY_IS_FIRST_TIME, true) // Default is true
    }

    // Function to save and retrieve isSignedUp flag
    fun setIsSignedUp(isSignedUp: Boolean) {
        sharedPreferences.edit().putBoolean(KEY_IS_SIGNED_UP, isSignedUp).apply()
    }

    fun isSignedUp(): Boolean {
        return sharedPreferences.getBoolean(KEY_IS_SIGNED_UP, false) // Default is false
    }

    // Function to save and retrieve CompilerOption
    fun setSelectedCompilerOption(option: CompilerOption) {
        sharedPreferences.edit().putString(KEY_SELECTED_COMPILER_OPTION, option.name).apply()
    }

    fun getSelectedCompilerOption(): CompilerOption {
        val optionName = sharedPreferences.getString(KEY_SELECTED_COMPILER_OPTION, CompilerOption.ONLINE_COMPILER_1.name)
        return CompilerOption.valueOf(optionName ?: CompilerOption.ONLINE_COMPILER_1.name)
    }

    // Function to save and retrieve MiddleButtonAction
    fun setSelectedMiddleButtonOption(option: MiddleButtonAction) {
        sharedPreferences.edit().putString(KEY_SELECTED_MIDDLE_BUTTON_OPTION, option.name).apply()
    }

    fun getSelectedMiddleButtonOption(): MiddleButtonAction {
        val optionName = sharedPreferences.getString(KEY_SELECTED_MIDDLE_BUTTON_OPTION, MiddleButtonAction.COMPILER.name)
        return MiddleButtonAction.valueOf(optionName ?: MiddleButtonAction.COMPILER.name)
    }
}
