package org.example._2023_09_28.proxy.dynProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public interface MyInterface {
    void doSmth();
    void doSmth2();
}

interface I1 extends MyInterface {}
interface I2 extends MyInterface {}

class RealObject implements  MyInterface {

    @Override
    public void doSmth() {
        System.out.println("class RealObject. @Override public void doSmth()");
    }

    @Override
    public void doSmth2() {
        System.out.println("class RealObject. @Override public void doSmth22222222222()");
    }
}

class InvocationHandlerImpl implements InvocationHandler {
    private final Object realObject;

    public InvocationHandlerImpl(Object realObject) {
        this.realObject = realObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws InvocationTargetException,
            IllegalAccessException {

        System.out.println("BEFORE: public Object invoke");
        Object result = method.invoke(realObject, args);
        System.out.println("AFTER: public Object invoke");

        return result;
    }
}

class Main {
    public static void main(String[] args) {
        MyInterface realObject = new RealObject();

        MyInterface proxy = (MyInterface) Proxy.newProxyInstance(
                MyInterface.class.getClassLoader(),
                new Class<?>[] {I1.class, I2.class},
                new InvocationHandlerImpl(realObject)
        );
        proxy.doSmth();
        proxy.doSmth2();
    }
}