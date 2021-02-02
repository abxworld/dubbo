package org.apache.dubbo.common.bytecode;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.apache.dubbo.common.bytecode.ClassGenerator;
import org.apache.dubbo.common.bytecode.NoSuchMethodException;
import org.apache.dubbo.common.bytecode.NoSuchPropertyException;
import org.apache.dubbo.common.bytecode.Wrapper;
//import org.apache.dubbo.demo.provider.DemoServiceImpl;

public class Wrapper1$ extends Wrapper implements ClassGenerator.DC {
    public static String[] pns;
    public static Map pts;
    public static String[] mns;
    public static String[] dmns;
    public static Class[] mts0;
    public static Class[] mts1;
    public static Class[] mts2;

    public String[] getPropertyNames() {
        return pns;
    }

    public boolean hasProperty(String string) {
        return pts.containsKey(string);
    }

    public Class getPropertyType(String string) {
        return (Class)pts.get(string);
    }

    public String[] getMethodNames() {
        return mns;
    }

    public String[] getDeclaredMethodNames() {
        return dmns;
    }

    public void setPropertyValue(Object object, String string, Object object2) {
//        try {
//            DemoServiceImpl demoServiceImpl = (DemoServiceImpl)object;
//        }
//        catch (Throwable throwable) {
//            throw new IllegalArgumentException(throwable);
//        }
//        throw new NoSuchPropertyException(new StringBuffer().append("Not found property \"").append(string).append("\" field or setter method in class org.apache.dubbo.demo.provider.DemoServiceImpl.").toString());
    }

    public Object getPropertyValue(Object object, String string) {
//        try {
//            DemoServiceImpl demoServiceImpl = (DemoServiceImpl)object;
//        }
//        catch (Throwable throwable) {
//            throw new IllegalArgumentException(throwable);
//        }
//        throw new NoSuchPropertyException(new StringBuffer().append("Not found property \"").append(string).append("\" field or setter method in class org.apache.dubbo.demo.provider.DemoServiceImpl.").toString());
        //todo return null; 不是生成的，只是注释了真正生成的代码后因为有返回值，所以我自行添加的
        return null;
    }

    public Object invokeMethod(Object object, String string, Class[] arrclass, Object[] arrobject) throws InvocationTargetException {
//        DemoServiceImpl demoServiceImpl;
//        try {
//            demoServiceImpl = (DemoServiceImpl)object;
//        }
//        catch (Throwable throwable) {
//            throw new IllegalArgumentException(throwable);
//        }
//        try {
//            if ("sayOther".equals(string) && arrclass.length == 1) {
//                return demoServiceImpl.sayOther((String)arrobject[0]);
//            }
//            if ("sayHelloAsync".equals(string) && arrclass.length == 1) {
//                return demoServiceImpl.sayHelloAsync((String)arrobject[0]);
//            }
//            if ("sayHello".equals(string) && arrclass.length == 1) {
//                return demoServiceImpl.sayHello((String)arrobject[0]);
//            }
//        }
//        catch (Throwable throwable) {
//            throw new InvocationTargetException(throwable);
//        }
//        throw new NoSuchMethodException(new StringBuffer().append("Not found method \"").append(string).append("\" in class org.apache.dubbo.demo.provider.DemoServiceImpl.").toString());
        //todo return null; 不是生成的，只是注释了真正生成的代码后因为有返回值，所以我自行添加的
        return null;
    }
}

