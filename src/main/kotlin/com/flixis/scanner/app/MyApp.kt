package com.flixis.scanner.app

import com.flixis.scanner.view.MainMenu
import tornadofx.*

class MyApp : App() {
    override val primaryView = MainMenu::class


    init {
        reloadViewsOnFocus()
        reloadStylesheetsOnFocus()
        importStylesheet(Styles::class)
    }

}
