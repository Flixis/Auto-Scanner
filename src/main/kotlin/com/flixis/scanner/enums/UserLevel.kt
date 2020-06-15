package com.flixis.scanner.enums


enum class UserLevel {
    Default,
    Moderator,
    Admin;

    companion object {
        var SetLvl = UserLevel.Default
    }
}