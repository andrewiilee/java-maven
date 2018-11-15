/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Copyright (C) 2018
 * United Services Automobile Association
 * All Rights Reserved
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
package com.example.simple;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class SimpleGenericTest {

  @Test
  public void generic_should_return_object() {
    SimpleGenerics<String> stringObject = new SimpleGenerics<>("someValue");
    assertEquals("someValue", stringObject.getObject());

    SimpleGenerics<Boolean> booleanObject = new SimpleGenerics<>(true);
    assertTrue(booleanObject.getObject());
  }

  @Test
  public void generic_should_return_string() {
    SimpleGenerics<Long> longObject = new SimpleGenerics<>(1092L);
    assertTrue(longObject.genericPrint(19357L).contains("19357"));
  }
  @Test
  public void generic_should_accept_integer_or_string() {
      List<Object> arrayList = new ArrayList<>();
      arrayList.add("String");
      arrayList.add(1);
      arrayList.add(true);

    assertTrue(arrayList.contains("String"));
    assertTrue(arrayList.contains(1));
    assertTrue(arrayList.contains(true));
  }
}
