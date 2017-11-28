package com.example;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 * Reflection Test
 */
public class ReflectionTest {

    //Invoking private methods
    @Test
    public void reflectionTest() throws Exception {
        Reflection ref = new Reflection();

        Method method = Reflection.class.getDeclaredMethod("helloWorld", String.class);
        method.setAccessible(true);
        String response = (String) method.invoke(ref,"myTestString");
        assertThat("Response does not match", response, is("myTestString"));
    }


    //Invoking multi parameter
    @Test
    public void reflectionParameterTest() throws Exception {
        Reflection ref = new Reflection();

        Object[] obj = {"message", "multiTest"};
        Class<?> params[] = new Class[obj.length];
        params[0] = String.class;
        params[1] = String.class;

        Method method = Reflection.class.getDeclaredMethod("multiWorld", params);
        method.setAccessible(true);
        String response = (String) method.invoke(ref,obj);
        assertThat("Response does not match", response, is("multiTest"));
    }

    //Get a field
    @Test
    public void reflectionField() throws Exception {
        Reflection ref = new Reflection();

        Field field = Reflection.class.getDeclaredField("HELLO");
        field.setAccessible(true);
        Object value = field.get(ref);
        assertThat("Response does not match", value, is("HELLO"));
    }
}
