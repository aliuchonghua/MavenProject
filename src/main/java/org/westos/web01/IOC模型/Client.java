package org.westos.web01.IOC模型;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Client {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException {
        A a=(A)Factory.create("aobj");
        a.dosomething();
    }
}
