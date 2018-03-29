package com.example;


import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LinkListTest {

    @Test
    void link_list_adds_and_gets() {
        List<String> myList = new AndrewLinkList<>();

        myList.add("one");
        myList.add("two");
        myList.add("three");

        assertEquals("one", myList.get(0));
        assertEquals("two", myList.get(1));
        assertEquals("three", myList.get(2));
        assertThrows(NullPointerException.class, () -> System.out.println(myList.get(3)));

        System.out.println("result: " + myList.toString());

        myList.remove("one");
        myList.add("four");
        myList.remove("three");
        assertEquals("two", myList.get(0));
        assertEquals("four", myList.get(1));

        assertTrue(myList.remove("not in list"));

        System.out.println("result: " + myList.toString());

        myList.remove("four");

        System.out.println("result: " + myList.toString());

        myList.remove("two");

        System.out.println("result: " + myList.toString());

    }
}
