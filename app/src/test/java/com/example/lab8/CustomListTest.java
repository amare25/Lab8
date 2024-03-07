package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
//
// import org.junit.Before;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;


    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>()); return list;
    }
    @Test
    public void addCityTest(){
        MockCityList();
        int listSize = list.getCount(); list.addCity(new City("Estevan", "SK")); assertEquals(list.getCount(),listSize + 1);
    }

    @Test

    public void hasCityTest(){
        MockCityList();
        City city = new City("Estevan", "SK");
        list.addCity(city);
        list.hasCity(city);
        assertTrue(list.hasCity(city));
    }

    @Test
    public void deleteCityTest(){
        MockCityList();
        City city = new City("Estevan", "SK");
        list.addCity(city);
        list.deleteCity(city);
        Assertions.assertFalse(list.hasCity(city));
        assertEquals(list.getCount(),0);

    }

    @Test
    public void countCityTest(){
        MockCityList();
        assertEquals(list.getCount(), list.countCity());
    }




}
