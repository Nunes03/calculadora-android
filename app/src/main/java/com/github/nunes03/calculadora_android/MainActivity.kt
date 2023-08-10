package com.github.nunes03.calculadora_android

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

private val TEXT_DISPLAY_ID = R.id.textDysplay;

private val BUTTON_ONE_ID = R.id.buttonNumberOne;

private val BUTTON_TWO_ID = R.id.buttonNumberTwo;

private val BUTTON_THREE_ID = R.id.buttonNumberThree;

private val BUTTON_FOUR_ID = R.id.buttonNumberFour;

private val BUTTON_FIVE_ID = R.id.buttonNumberFive;

private val BUTTON_SIX_ID = R.id.buttonNumberSix;

private val BUTTON_SEVEN_ID = R.id.buttonNumberSeven;

private val BUTTON_EIGHT_ID = R.id.buttonNumberEight;

private val BUTTON_NINE_ID = R.id.buttonNumberNine;

private val BUTTON_OPERATOR_PLUS_ID = R.id.buttonOperatorPlus;

private val BUTTON_OPERATOR_SUBTRACTION_ID = R.id.buttonOperatorSubtraction;

private val BUTTON_OPERATOR_EQUAL_ID = R.id.buttonOperatorEqual;

private val BUTTON_CLEAR_ID = R.id.buttonClear;

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addZero(view: View) {
        addInDisplay(0);
    }

    fun addOne(view: View) {
        addInDisplay(1);
    }

    fun addTwo(view: View) {
        addInDisplay(2);
    }

    fun addThree(view: View) {
        addInDisplay(3);
    }

    fun addFour(view: View) {
        addInDisplay(4);
    }

    fun addFive(view: View) {
        addInDisplay(5);
    }

    fun addSix(view: View) {
        addInDisplay(6);
    }

    fun addSeven(view: View) {
        addInDisplay(7);
    }

    fun addEight(view: View) {
        addInDisplay(8);
    }

    fun addNine(view: View) {
        addInDisplay(9);
    }

    fun clear() {
        val textDisplay = findViewById<TextView>(TEXT_DISPLAY_ID);
        textDisplay.text = "";
    }

    private fun addInDisplay(number: Number) {
        val textDisplay = findViewById<TextView>(TEXT_DISPLAY_ID);
        textDisplay.text = textDisplay.text.toString() + number.toString();
    }
}
