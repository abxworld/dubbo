//package org.apache.dubbo.common.bytecode;
//
//import org.apache.dubbo.demo.DemoService;
//import org.apache.dubbo.rpc.service.Destroyable;
//import org.apache.dubbo.rpc.service.EchoService;
//
//import java.lang.reflect.InvocationHandler;
//import java.lang.reflect.Method;
//import java.util.concurrent.CompletableFuture;
//
///**
// * program: dubbo-parent
// * author: bsworld.xie
// * create: 2021-01-29 11:36
// * description:
// */
//@SuppressWarnings("uncheck")
//public class proxy0 implements ClassGenerator.DC, Destroyable, EchoService, DemoService {
//    public static Method[] methods;
//    private InvocationHandler handler;
//
//    public Object $echo(Object object) {
//        Object[] arrobject = new Object[]{object};
//        Object object2 = null;
//        try {
//            object2 = this.handler.invoke(this, methods[0], arrobject);
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        }
//        return object2;
//    }
//
//    @Override
//    public String sayHello(String string) {
//        Object[] arrobject = new Object[]{string};
//        Object object = null;
//        try {
//            object = this.handler.invoke(this, methods[1], arrobject);
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        }
//        return (String) object;
//    }
//
//    public CompletableFuture sayHelloAsync(String string) {
//        Object[] arrobject = new Object[]{string};
//        Object object = null;
//        try {
//            object = this.handler.invoke(this, methods[2], arrobject);
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        }
//        return (CompletableFuture) object;
//    }
//
//    public void $destroy() {
//        Object[] arrobject = new Object[]{};
//        try {
//            Object object = this.handler.invoke(this, methods[3], arrobject);
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        }
//    }
//
//    public proxy0() {
//    }
//
//    public proxy0(InvocationHandler invocationHandler) {
//        this.handler = invocationHandler;
//    }
//}