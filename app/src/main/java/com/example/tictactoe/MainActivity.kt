package com.example.tictactoe

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Directional Button References
        val nwButton = findViewById<Button>(R.id.NWButton)
        val neButton = findViewById<Button>(R.id.NEButton)
        val swButton = findViewById<Button>(R.id.SWButton)
        val seButton = findViewById<Button>(R.id.SEButton)
        val nButton = findViewById<Button>(R.id.NButton)
        val eButton = findViewById<Button>(R.id.EButton)
        val wButton = findViewById<Button>(R.id.WButton)
        val sButton = findViewById<Button>(R.id.SButton)
        val mButton = findViewById<Button>(R.id.MButton)

        // New Game Button Reference
        val newGameButton = findViewById<Button>(R.id.NewGameButton)

        // Player Turn Reference
        val playerTurnText = findViewById<TextView>(R.id.PlayerTurnText)
        var playerTurn = true;



        // Win Conditions
        var nw  = 0
        var ne = 0
        var sw = 0
        var se = 0
        var n = 0
        var e = 0
        var w = 0
        var s = 0
        var m = 0
        var limit = 0
        var gameWon = false

        // Determine if win
        fun checkWin() {
        // debug system print for button values
        /*System.out.println("NW: " + nw.toString() + " NE: " + ne.toString() + " SW: " +
        sw.toString() + " SE: " + se.toString() + " N: " + n.toString() + " W: " +
        w.toString() + " E: " + e.toString() + " S: " + s.toString() + " M: " +
        m.toString())*/
            System.out.println("Current limit val: " + limit)

            if (nw == 1 && ne == 1 && n == 1) {
                playerTurnText.text = "Winner: Player 1"
                gameWon = true
            }
            if (nw == 2 && ne == 2 && n == 2) {
                playerTurnText.text = "Winner: Player 2"
                gameWon = true
            }

            if (w == 1 && m == 1 && e == 1) {
                playerTurnText.text = "Winner: Player 1"
                gameWon = true
            }
            if (w == 2 && m == 2 && e == 2) {
                playerTurnText.text = "Winner: Player 2"
                gameWon = true
            }

            if (sw == 1 && s == 1 && se == 1) {
                playerTurnText.text = "Winner: Player 1"
                gameWon = true
            }
            if (sw == 2 && s == 2 && se == 2) {
                playerTurnText.text = "Winner: Player 2"
                gameWon = true
            }

            if (nw == 1 && m == 1 && se == 1) {
                playerTurnText.text = "Winner: Player 1"
                gameWon = true
            }
            if (nw == 2 && m == 2 && se == 2) {
                playerTurnText.text = "Winner: Player 2"
                gameWon = true
            }

            if(ne == 1 && m == 1 && sw == 1) {
                playerTurnText.text = "Winner: Player 1"
                gameWon = true
            }
            if(ne == 2 && m == 2 && sw == 2) {
                playerTurnText.text = "Winner: Player 2"
                gameWon = true
            }
            if(limit == 8){
                if(!gameWon){
                    playerTurnText.text = "Draw"
                    gameWon = true
                }

            }
        }

        // Button onclick listeners
        //north west button
        nwButton.setOnClickListener {
            if(!gameWon) {
                if (nwButton.text.isBlank()) {
                    if (playerTurn) {
                        playerTurnText.text = "Player 2's Turn"
                        nwButton.text = "X"
                        playerTurn = false
                        nw = 1
                    } else {
                        playerTurnText.text = "Player 1's Turn"
                        nwButton.text = "O"
                        playerTurn = true
                        nw = 2
                    }
                }
                checkWin()
                limit++
            }
        }

        // north east button
        neButton.setOnClickListener {
            if(!gameWon) {
                if (neButton.text.isBlank()) {
                    if (playerTurn) {
                        playerTurnText.text = "Player 2's Turn"
                        neButton.text = "X"
                        playerTurn = false
                        ne = 1
                    } else {
                        playerTurnText.text = "Player 1's Turn"
                        neButton.text = "O"
                        playerTurn = true
                        ne = 2
                    }
                }
                checkWin()
                limit++
            }
        }

        // south west button
        swButton.setOnClickListener {
            if(!gameWon) {
                if (swButton.text.isBlank()) {
                    if (playerTurn) {
                        playerTurnText.text = "Player 2's Turn"
                        swButton.text = "X"
                        playerTurn = false
                        sw = 1
                    } else {
                        playerTurnText.text = "Player 1's Turn"
                        swButton.text = "O"
                        playerTurn = true
                        sw = 2
                    }
                }
                checkWin()
                limit++
            }
        }

        // south east button
        seButton.setOnClickListener {
            if(!gameWon) {
                if (seButton.text.isBlank()) {
                    if (playerTurn) {
                        playerTurnText.text = "Player 2's Turn"
                        seButton.text = "X"
                        playerTurn = false
                        se = 1
                    } else {
                        playerTurnText.text = "Player 1's Turn"
                        seButton.text = "O"
                        playerTurn = true
                        se = 2
                    }
                }
                checkWin()
                limit++
            }
        }

        // north button
        nButton.setOnClickListener {
            if(!gameWon) {
                if(nButton.text.isBlank()) {
                    if (playerTurn) {
                        playerTurnText.text = "Player 2's Turn"
                        nButton.text = "X"
                        playerTurn = false
                        n = 1
                    } else {
                        playerTurnText.text = "Player 1's Turn"
                        nButton.text = "O"
                        playerTurn = true
                        n = 2
                    }
                }
                checkWin()
                limit++
            }
        }

        // east button
        eButton.setOnClickListener {
            if(!gameWon) {
                if(eButton.text.isBlank()) {
                    if (playerTurn) {
                        playerTurnText.text = "Player 2's Turn"
                        eButton.text = "X"
                        playerTurn = false
                        e = 1
                    } else {
                        playerTurnText.text = "Player 1's Turn"
                        eButton.text = "O"
                        playerTurn = true
                        e = 2
                    }
                }
                checkWin()
                limit++
            }
        }

        // west button
        wButton.setOnClickListener {
            if (!gameWon) {
                if(wButton.text.isBlank()) {
                    if (playerTurn) {
                        playerTurnText.text = "Player 2's Turn"
                        wButton.text = "X"
                        playerTurn = false
                        w = 1
                    } else {
                        playerTurnText.text = "Player 1's Turn"
                        wButton.text = "O"
                        playerTurn = true
                        w = 2
                    }
                }
                checkWin()
                limit++
            }
        }

        // south button
        sButton.setOnClickListener {
            if(!gameWon) {
                if (sButton.text.isBlank()) {
                    if (playerTurn) {
                        playerTurnText.text = "Player 2's Turn"
                        sButton.text = "X"
                        playerTurn = false
                        s = 1
                    } else {
                        playerTurnText.text = "Player 1's Turn"
                        sButton.text = "O"
                        playerTurn = true
                        s = 2
                    }
                }
                checkWin()
                limit++
            }
        }

        // middle button
        mButton.setOnClickListener {
            if(!gameWon) {
                if (mButton.text.isBlank()) {
                    if (playerTurn) {
                        playerTurnText.text = "Player 2's Turn"
                        mButton.text = "X"
                        playerTurn = false
                        m = 1
                    } else {
                        playerTurnText.text = "Player 1's Turn"
                        mButton.text = "O"
                        playerTurn = true
                        m = 2
                    }
                }
                checkWin()
                limit++
            }
        }

        // new game button
        newGameButton.setOnClickListener {
            nwButton.text = ""
            neButton.text = ""
            swButton.text = ""
            seButton.text = ""
            nButton.text = ""
            eButton.text = ""
            wButton.text = ""
            sButton.text = ""
            mButton.text = ""
            playerTurn = true
            playerTurnText.text = "Player 1's Turn"
            ne = 0
            nw = 0
            se = 0
            sw = 0
            n = 0
            e = 0
            w = 0
            s = 0
            gameWon = false
            limit = 0
        }


    }
}