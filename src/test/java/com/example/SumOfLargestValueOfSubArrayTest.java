package com.example;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class SumOfLargestValueOfSubArrayTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void sumOfSubArraysTest1() {
        //Given
        List <Integer> arrList = new ArrayList<>(Arrays.asList(3,4,5,-1,0,-2,-4));
        List <Integer> expected = new ArrayList<>(Arrays.asList(5,9,11,12,12,9,5));

        //When
        List <Integer> actual = new ArrayList<>(Arrays.asList(SumOfLargestValueOfSubArrays.sumOfSubArrays(arrList)));

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void sumOfSubArraysTest2() {
        //Given
        List <Integer> arrList = new ArrayList<>(Arrays.asList(9,8,7,6,5,0,0,-1));
        List <Integer> expected = new ArrayList<>(Arrays.asList(34,35,35,35,30,24,17,9));

        //When
        List <Integer> actual = new ArrayList<>(Arrays.asList(SumOfLargestValueOfSubArrays.sumOfSubArrays(arrList)));

        //Then
        assertEquals(expected, actual);
    }
}
