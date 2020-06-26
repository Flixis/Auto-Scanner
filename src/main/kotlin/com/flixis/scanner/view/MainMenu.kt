package com.flixis.scanner.view

import javafx.geometry.Pos
import javafx.scene.paint.Color
import javafx.scene.text.Font
import tornadofx.*


class MainMenu : View() {
    //Declaring button names
    val calibrate = "Calibrate"
    val manualcontrol = "Manual control"
    val select = "M-Project Select"
    val create = "M-Project Create"
    val settings = "Settings"
    var margintopbottomforbutton = 5.0


    init {
        title = "Main menu"
    }

    override val root = gridpane {


        row {
            textflow {
                text("Tornado") {
                    fill = Color.PURPLE
                    font = Font(20.0)
                }
                text("FX") {
                    fill = Color.ORANGE
                    font = Font(28.0)
                }
            }
        }


        //Align buttons to the middle of the gridpane
        alignment = Pos.CENTER


        row {
            button(calibrate) {
                useMaxWidth = true
                gridpaneConstraints {
                    marginTopBottom(margintopbottomforbutton)
                }
            }
        }

        row {
            button(manualcontrol) {
                useMaxWidth = true
            }
            gridpaneConstraints {
                marginTopBottom(margintopbottomforbutton)
            }
        }

        row {
            button(select) {
                useMaxWidth = true
            }
            gridpaneConstraints {
                marginTopBottom(margintopbottomforbutton)
            }
        }

        row {
            button(create) {
                useMaxWidth = true
            }
            gridpaneConstraints {
                marginTopBottom(margintopbottomforbutton)
            }
        }

        row {
            button(settings) {
                useMaxWidth = true
            }
            gridpaneConstraints {
                marginTopBottom(margintopbottomforbutton)
            }
        }
    }
}
