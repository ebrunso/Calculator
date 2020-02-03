package com.example.calculator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnZero.setOnClickListener(){
            evaluateExpression("0", clear = true)
        }

        btnOne.setOnClickListener() {
            evaluateExpression("1", clear = true)
        }

        btnTwo.setOnClickListener() {
            evaluateExpression("2", clear = true)
        }

        btnThree.setOnClickListener() {
            evaluateExpression("3", clear = true)
        }

        btnFour.setOnClickListener() {
            evaluateExpression("4", clear = true)
        }

        btnFive.setOnClickListener() {
            evaluateExpression("5", clear = true)
        }

        btnSix.setOnClickListener() {
            evaluateExpression("6", clear = true)
        }

        btnSeven.setOnClickListener() {
            evaluateExpression("7", clear = true)
        }

        btnEight.setOnClickListener() {
            evaluateExpression("8", clear = true)
        }

        btnNine.setOnClickListener() {
            evaluateExpression("9", clear = true)
        }

        btnDecimal.setOnClickListener() {
            evaluateExpression(".", clear = true)
        }

        btnAddition.setOnClickListener() {
            evaluateExpression("+", clear = true)
        }

        btnSubtract.setOnClickListener() {
            evaluateExpression("-", clear = true)
        }

        btnMultiply.setOnClickListener() {
            evaluateExpression("*", clear = true)
        }

        btnDivide.setOnClickListener() {
            evaluateExpression("/", clear = true)
        }

        btnAbs.setOnClickListener() {
            evaluateExpression("abs", clear = true)
        }

        btnSqrt.setOnClickListener() {
            evaluateExpression("sqrt", clear = true)
        }

        btnLog10.setOnClickListener() {
            evaluateExpression("log10", clear = true)
        }

        btnCubed.setOnClickListener() {
            evaluateExpression("cbrt", clear = true)
        }


        btnEquals.setOnClickListener {
            val text = tvInput.text.toString()
            val expression = ExpressionBuilder(text).build()

            val result = expression.evaluate()
            val longResult = result.toLong()
            if (result == longResult.toDouble()) {
                tvOutput.text = longResult.toString()
            } else {
                tvOutput.text = result.toString()
            }
        }

        btnClear.setOnClickListener {
            tvInput.text = ""
            tvOutput.text = ""
        }
    }

    fun evaluateExpression(string: String, clear: Boolean) {
        if(clear) {
            tvOutput.text = ""
            tvInput.append(string)
        } else {
            tvInput.append(tvOutput.text)
            tvInput.append(string)
            tvOutput.text = ""
        }
    }
}


