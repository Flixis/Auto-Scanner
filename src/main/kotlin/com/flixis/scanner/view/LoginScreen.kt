package com.flixis.scanner.view

import com.flixis.scanner.app.Styles
import com.flixis.scanner.enums.UserLevel
import javafx.scene.control.PasswordField
import javafx.scene.input.KeyCombination
import javafx.scene.layout.VBox
import tornadofx.*
import kotlin.system.exitProcess

class LoginScreen : View() {

    override val root = VBox()

    var usernamefield: javafx.scene.control.TextField by singleAssign()
    var passwordfield: PasswordField by singleAssign()


    init {
        title = "Login"
        setWindowMinSize(300, 175)
        setWindowMaxSize(300, 175)



        with(root) {
            addClass(Styles.wrapper)
            hbox {
                label("Username")
                usernamefield = textfield()
            }

            hbox {
                label("Password")
                passwordfield = passwordfield()
            }

            hbox(10) {
                button("Login") {
                    shortcut(KeyCombination.valueOf("enter"))
                    action {
                        println("Loggin in as USER: ${usernamefield.text} , PASS: ${passwordfield.text}")
                        println("Replacing User state:")
                        if (usernamefield.text == "test" && passwordfield.text == "test") {
                            UserLevel.SetLvl = UserLevel.Admin
                            println(UserLevel.SetLvl)
                            replaceWith(MainMenu::class)
                        } else {
                            println(UserLevel.SetLvl)
                            replaceWith(MainMenu::class)
                        }
                    }
                }

                button("Quit") {
                    action {
                        exitProcess(0)
                    }
                }
                children.addClass(Styles.button)
            }

            children.addClass(Styles.row)
        }

    }

}