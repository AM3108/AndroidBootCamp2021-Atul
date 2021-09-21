package com.example.androidbootcamp2021_atul.excersise1

fun calCharPercentages() {
    val str = "atul@TTN*&^#PASSword"
    val totalStrLength = str.length

    var lowerCase = 0
    var upperCase = 0
    var specialAndDigitChar = 0

    for (i in 0 until totalStrLength) {
        when {
            str[i].isLowerCase() -> lowerCase++
            str[i].isUpperCase() -> upperCase++
            else -> specialAndDigitChar++
        }
    }

    println("\nNumber of lower case characters: $lowerCase, Percentage: ${(lowerCase.toFloat()/totalStrLength.toFloat())*100}%")
    println("Number of upper case characters: $upperCase, Percentage: ${(upperCase.toFloat()/totalStrLength.toFloat())*100}%")
    println("Number of special characters and digits: $specialAndDigitChar, Percentage: ${(specialAndDigitChar.toFloat()/totalStrLength.toFloat())*100}%\n")
}