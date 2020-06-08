package com.flixis.scanner.app

import javafx.scene.paint.Color
import tornadofx.*

class Styles : Stylesheet() {
    companion object {
        val wrapper by cssclass()
        val row by cssclass()
        val button by cssclass()
    }

    init {
        val flat = mixin {
            backgroundInsets += box(0.px)
            borderColor += box(Color.DARKGRAY)
        }

        s(wrapper) {
            s(label) {
                minWidth = 100.px
            }

            padding = box(15.px)
            backgroundColor += Color.LIGHTGRAY

            s(row) {
                padding = box(5.px)
            }
        }

        s(button) {
            padding = box(5.px)
        }

        s(button, textInput) {
            +flat
        }

    }
}