
/*
 * Decompiled with CFR.
 *
 * Could not load the following classes:
 *  org.apache.dubbo.common.URL
 *  org.apache.dubbo.common.extension.ExtensionLoader
 *  org.apache.dubbo.remoting.ChannelHandler
 *  org.apache.dubbo.remoting.Dispatcher
 */
package org.apache.dubbo.remoting;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.remoting.ChannelHandler;
import org.apache.dubbo.remoting.Dispatcher;

public class Dispatcher$Adaptive implements Dispatcher {
    public ChannelHandler dispatch(ChannelHandler channelHandler, URL uRL) {
        if (uRL == null) {
            throw new IllegalArgumentException("url == null");
        }
        URL uRL2 = uRL;
        String string = uRL2.getParameter("dispatcher", uRL2.getParameter("dispather", uRL2.getParameter("channel.handler", "all")));
        if (string == null) {
            throw new IllegalStateException(new StringBuffer().append("Failed to get extension (org.apache.dubbo.remoting.Dispatcher) name from url (").append(uRL2.toString()).append(") use keys([dispatcher, dispather, channel.handler])").toString());
        }
        Dispatcher dispatcher = (Dispatcher) ExtensionLoader.getExtensionLoader(Dispatcher.class).getExtension(string);
        return dispatcher.dispatch(channelHandler, uRL);
    }
}

