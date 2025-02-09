package com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes;

sealed class SettingsRoutes(val route: String) {
    data object SettingsScreen : SettingsRoutes(route = "settingsscreen")
    data object GeneralSettings : SettingsRoutes(route = "generalsettingsscreen")
    data object AppUpdateScreen : SettingsRoutes(route = "appupdatescreen")
    data object AboutCodeMasterScreen :SettingsRoutes(route = "aboutcodemasterscreen")
    data object AboutUsScreen :SettingsRoutes(route = "abourusscreen")
}