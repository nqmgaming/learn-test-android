package com.nqmgaming.learntest

import org.junit.Assert.*
import org.junit.Test

class HomeworkTest{
    @Test
    fun `fibonacci number at position 0 is 0`(){
        val result = Homework.fib(0)
        assertEquals(0, result)
    }

    @Test
    fun `fibonacci number at position 1 is 1`(){
        val result = Homework.fib(1)
        assertEquals(1, result)
    }

    @Test
    fun `fibonacci number at position 2 is 1`(){
        val result = Homework.fib(2)
        assertEquals(1, result)
    }

    @Test
    fun `fibonacci number at position 3 is 2`(){
        val result = Homework.fib(3)
        assertEquals(2, result)
    }

    @Test
    fun `fibonacci number at position 4 is 3`(){
        val result = Homework.fib(4)
        assertEquals(3, result)
    }
}