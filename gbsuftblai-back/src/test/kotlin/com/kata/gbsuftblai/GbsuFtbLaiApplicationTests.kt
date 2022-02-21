package com.kata.gbsuftblai

import com.kata.gbsuftblai.services.GbsuFtbLaiService
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest


@SpringBootTest
class GbsuFtbLaiApplicationTests(@Autowired val gbsuFtbLaiService: GbsuFtbLaiService) {

    @Test
    fun contextLoads() {
    }

    @ParameterizedTest(name = "convertNumber should return {1}")
    @CsvSource(
            "1,1",
            "3,GbsuGbsu",
            "5,FtbFtb",
            "7,Lai",
            "9,Gbsu",
            "51,GbsuFtb",
            "53,FtbGbsu",
            "33,GbsuGbsuGbsu",
            "27,GbsuLai",
            "15,GbsuFtbFtb")
    fun convertNumber(input: Int, expected: String) {
        assertEquals(expected, gbsuFtbLaiService.convertNumber(input))
    }
}