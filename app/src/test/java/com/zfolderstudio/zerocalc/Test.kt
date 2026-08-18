package com.zfolderstudio.zerocalc

import com.zfolderstudio.zerocalc.calculator.Calculator
import com.zfolderstudio.zerocalc.calculator.parser.Expression

fun main() {
    val inputs = listOf("1+1", "2A-3", "2A2", "4^'1", "sin(30)")
    val expr = Expression()
    for (input in inputs) {
        val clean = expr.getCleanExpression(input, ".", ",")
        val result = Calculator(10).evaluate(clean, true)
        println("Input: $input -> Clean: $clean -> Result: $result")
    }
}
