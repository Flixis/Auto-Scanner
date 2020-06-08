package com.flixis.scanner.view

import com.flixis.scanner.app.Styles
import javafx.geometry.Pos
import javafx.scene.text.Font
import tornadofx.*

class MainMenu : View() {
    override val root = gridpane()

    init {
        title = "Main Menu"

        setWindowMinSize(200, 400)

        with(root) {
            addClass(Styles.wrapper)
            alignment = Pos.CENTER

            row {
                text("Main Menu") {
                    gridpaneConstraints {
                        marginBottom = 10.0
                        columnSpan = 2
                    }
                    font = Font(30.0)
                }
            }

            row {
                button("Calibrate") {
                    action {
                        replaceWith(Calibrate::class)
                    }
                    gridpaneConstraints {
                        columnRowIndex(1, 1)
                        useMaxWidth = true
                        marginBottom = 10.0
                        columnSpan = 2
                    }
                }

            }

            row {
                button("Manual Control") {
                    action {
                        replaceWith(Manual_Control::class)
                    }
                    gridpaneConstraints {
                        useMaxWidth = true
                        marginBottom = 10.0
                        columnSpan = 2
                    }
                }

            }

            row {
                button("M-Project Select") {
                    action {
                        replaceWith(`M-Project_Select`::class)
                    }
                    gridpaneConstraints {
                        useMaxWidth = true
                        marginBottom = 10.0
                        columnSpan = 2
                    }
                }

            }

            row {
                button("M-Project Create") {
                    action {
                        replaceWith(`M-Project_Create`::class)
                    }
                    gridpaneConstraints {
                        useMaxWidth = true
                        marginBottom = 10.0
                        columnSpan = 2
                    }
                }

            }

            row {
                button("Settings") {
                    action {
                        replaceWith(Settings::class)
                    }
                    gridpaneConstraints {
                        useMaxWidth = true
                        marginBottom = 10.0
                        columnSpan = 2
                    }
                }

            }

            row {
                button("Github") {
                    action {

                    }
                    gridpaneConstraints {
                        useMaxWidth = true
                        marginBottom = 10.0
                        columnSpan = 2
                    }
                }

            }

            row {
                button("Debug") {

                    action {
                        replaceWith(Debug::class)
                    }
                    gridpaneConstraints {
                        useMaxWidth = true
                        marginBottom = 10.0
                        columnSpan = 2
                    }
                }

            }

        }

    }


}
