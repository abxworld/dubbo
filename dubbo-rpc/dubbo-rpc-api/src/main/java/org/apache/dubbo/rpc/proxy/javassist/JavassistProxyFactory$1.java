
/*
 * Decompiled with CFR.
 *
 * Could not load the following classes:
 *  org.apache.dubbo.common.URL
 *  org.apache.dubbo.common.bytecode.Wrapper
 *  org.apache.dubbo.rpc.proxy.AbstractProxyInvoker
 */
package org.apache.dubbo.rpc.proxy.javassist;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.bytecode.Wrapper;
import org.apache.dubbo.rpc.proxy.AbstractProxyInvoker;

public class JavassistProxyFactory$1<T> extends AbstractProxyInvoker<T> {
    final /* synthetic */ Wrapper val$wrapper;

    public JavassistProxyFactory$1(T proxy, Class type, URL url, Wrapper wrapper) {
        super(proxy, type, url);
        this.val$wrapper = wrapper;
    }

    protected Object doInvoke(T proxy, String methodName, Class<?>[] parameterTypes, Object[] arguments) throws Throwable {
        return this.val$wrapper.invokeMethod(proxy, methodName, (Class[]) parameterTypes, arguments);
    }
}

