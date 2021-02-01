package com.shenjies88.practice.sharding

import org.junit.jupiter.api.Test

class GroovyTest {

    @Test
    void test() {
        def date = new Date().parse("yyyy-MM-dd HH:mm:ss", '2021-01-01 00:00:00')
        println(date.getMonth() + 1)
    }
}
