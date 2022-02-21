package com.kata.gbsuftblai.services

import org.springframework.stereotype.Component

@Component
class GbsuFtbLaiService {

    companion object {
        val DIV_NUMBER_KEYS = mapOf(3 to "Gbsu", 5 to "Ftb")
        val CONTAIN_NUMBER_KEYS = mapOf(3 to "Gbsu", 5 to "Ftb", 7 to "Lai")
    }

    fun convertNumber(inputNumber: Int): String {
        val response = StringBuilder()

        // Number divisible
        DIV_NUMBER_KEYS.forEach{ (k, v) ->
            if (inputNumber % k == 0) {
                response.append(v)
            }
        }

        // Number is present
        val inputStr = inputNumber.toString()
        for (c in inputStr) {
            CONTAIN_NUMBER_KEYS.forEach { (k, v) ->
                if (c.toString().toInt() == k) {
                    response.append(v)
                }
            }
        }

        // NO MATCH ?
        if (response.isBlank()) {
            return inputStr
        }
        return response.toString()
    }

}