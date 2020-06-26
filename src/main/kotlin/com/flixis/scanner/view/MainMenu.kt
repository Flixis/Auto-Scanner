package com.flixis.scanner.view

import com.flixis.scanner.enums.EnumUserLevel
import javafx.geometry.Pos
import javafx.scene.paint.Color
import javafx.scene.text.Font
import tornadofx.*


class MainMenu : View() {
    //Declaring button names
    private val calibrate = "Calibrate"
    private val manualcontrol = "Manual control"
    private val select = "M-Project Select"
    private val create = "M-Project Create"
    private val settings = "Settings"
    private val logout = "Logout"
    private val debug = "Debug"

    //Declaring button vars
    private var margintopbottomforbutton = 2.5

    companion object {
        var userlvl = EnumUserLevel.Default
    }


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
                gridpaneConstraints {
                    marginTopBottom(margintopbottomforbutton)
                }
            }
        }

        row {
            button(select) {
                useMaxWidth = true
                gridpaneConstraints {
                    marginTopBottom(margintopbottomforbutton)
                }
            }

        }

        row {
            button(create) {
                useMaxWidth = true
                gridpaneConstraints {
                    marginTopBottom(margintopbottomforbutton)
                }
            }
        }

        row {
            button(settings) {
                useMaxWidth = true
                gridpaneConstraints {
                    marginTopBottom(margintopbottomforbutton)
                }
            }
        }

        row {
            button(logout) {
                useMaxWidth = true
                gridpaneConstraints {
                    marginTopBottom(margintopbottomforbutton)
                }
                action {
                    userlvl = EnumUserLevel.Default
                    replaceWith(LoginScreen::class)
                }
            }
        }


        //check to see if user is >Default user lvl before displaying debug button
        if (userlvl != EnumUserLevel.Default) {
            row {
                button(debug) {
                    useMaxWidth = true
                    gridpaneConstraints {
                        marginTopBottom(margintopbottomforbutton)
                    }
                    action {
                        text("This Worked")
                    }
                }
            }
        } else {
            row {
                button(debug) {
                    isDisable = true
                    useMaxWidth = true
                    gridpaneConstraints {
                        marginTopBottom(margintopbottomforbutton)
                    }
                }
            }
        }
    }
}
