/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Copyright (C) 2018
 * United Services Automobile Association
 * All Rights Reserved
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
package com.example.simple;

public class SimpleGenerics<T> {
  // An object of type T is declared
  private T obj;

  SimpleGenerics(T obj) {
    this.obj = obj;
  }  // constructor

  T getObject() {
    return this.obj;
  }

  String genericPrint(T element) {
    return element.getClass().getSimpleName() + " = " + element;
  }
}
