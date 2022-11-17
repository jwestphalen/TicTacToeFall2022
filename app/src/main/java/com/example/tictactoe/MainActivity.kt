package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

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

        // Button onclick listeners
        //north west button
        nwButton.setOnClickListener {
            if(nwButton.text.isBlank()) {
                if (playerTurn) {
                    playerTurnText.text = "Player 2's Turn"
                    nwButton.text = "X"
                    playerTurn = false
                } else {
                    playerTurnText.text = "Player 1's Turn"
                    nwButton.text = "O"
                    playerTurn = true
                }
            }
        }

        // north east button
        neButton.setOnClickListener {
            if(neButton.text.isBlank()) {
                if (playerTurn) {
                    playerTurnText.text = "Player 2's Turn"
                    neButton.text = "X"
                    playerTurn = false
                } else {
                    playerTurnText.text = "Player 1's Turn"
                    neButton.text = "O"
                    playerTurn = true
                }
            }
        }

        // south west button
        swButton.setOnClickListener {
            if(swButton.text.isBlank()) {
                if (playerTurn) {
                    playerTurnText.text = "Player 2's Turn"
                    swButton.text = "X"
                    playerTurn = false
                } else {
                    playerTurnText.text = "Player 1's Turn"
                    swButton.text = "O"
                    playerTurn = true
                }
            }
        }

        // south east button
        seButton.setOnClickListener {
            if(seButton.text.isBlank()) {
                if (playerTurn) {
                    playerTurnText.text = "Player 2's Turn"
                    seButton.text = "X"
                    playerTurn = false
                } else {
                    playerTurnText.text = "Player 1's Turn"
                    seButton.text = "O"
                    playerTurn = true
                }
            }
        }

        // north button
        nButton.setOnClickListener {
            if(nButton.text.isBlank()) {
                if (playerTurn) {
                    playerTurnText.text = "Player 2's Turn"
                    nButton.text = "X"
                    playerTurn = false
                } else {
                    playerTurnText.text = "Player 1's Turn"
                    nButton.text = "O"
                    playerTurn = true
                }
            }
        }

        // east button
        eButton.setOnClickListener {
            if(eButton.text.isBlank()) {
                if (playerTurn) {
                    playerTurnText.text = "Player 2's Turn"
                    eButton.text = "X"
                    playerTurn = false
                } else {
                    playerTurnText.text = "Player 1's Turn"
                    eButton.text = "O"
                    playerTurn = true
                }
            }
        }

        // west button
        wButton.setOnClickListener {
            if(wButton.text.isBlank()) {
                if (playerTurn) {
                    playerTurnText.text = "Player 2's Turn"
                    wButton.text = "X"
                    playerTurn = false
                } else {
                    playerTurnText.text = "Player 1's Turn"
                    wButton.text = "O"
                    playerTurn = true
                }
            }
        }

        // south button
        sButton.setOnClickListener {
            if(sButton.text.isBlank()) {
                if (playerTurn) {
                    playerTurnText.text = "Player 2's Turn"
                    sButton.text = "X"
                    playerTurn = false
                } else {
                    playerTurnText.text = "Player 1's Turn"
                    sButton.text = "O"
                    playerTurn = true
                }
            }
        }

        // middle button
        mButton.setOnClickListener {
            if(mButton.text.isBlank()) {
                if (playerTurn) {
                    playerTurnText.text = "Player 2's Turn"
                    mButton.text = "X"
                    playerTurn = false
                } else {
                    playerTurnText.text = "Player 1's Turn"
                    mButton.text = "O"
                    playerTurn = true
                }
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
        }
    }
}