package com.example.calculator

sealed class CalculatorOperation(val symbol : String)  {
    object Add : CalculatorOperation("+")
    object Subtract : CalculatorOperation("-")
    object Div : CalculatorOperation("/")
    object Multiply : CalculatorOperation("*")

}
