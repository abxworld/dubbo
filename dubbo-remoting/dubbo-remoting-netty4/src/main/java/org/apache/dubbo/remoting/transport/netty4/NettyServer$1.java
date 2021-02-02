//
///*
// * Decompiled with CFR.
// *
// * Could not load the following classes:
// *  org.apache.dubbo.common.URL
// *  org.apache.dubbo.remoting.ChannelHandler
// *  org.apache.dubbo.remoting.transport.netty4.NettyCodecAdapter
// *  org.apache.dubbo.remoting.transport.netty4.NettyServer
// *  org.apache.dubbo.remoting.transport.netty4.NettyServerHandler
// *  org.apache.dubbo.remoting.transport.netty4.SslHandlerInitializer
// *  org.apache.dubbo.remoting.utils.UrlUtils
// */
//package org.apache.dubbo.remoting.transport.netty4;
//
//import io.netty.channel.ChannelInitializer;
//import io.netty.channel.socket.SocketChannel;
//import io.netty.handler.timeout.IdleStateHandler;
//
//import java.util.concurrent.TimeUnit;
//
//import org.apache.dubbo.common.URL;
//import org.apache.dubbo.remoting.ChannelHandler;
//import org.apache.dubbo.remoting.transport.netty4.NettyCodecAdapter;
//import org.apache.dubbo.remoting.transport.netty4.NettyServer;
//import org.apache.dubbo.remoting.transport.netty4.NettyServerHandler;
//import org.apache.dubbo.remoting.transport.netty4.SslHandlerInitializer;
//import org.apache.dubbo.remoting.utils.UrlUtils;
//
///*
// * Exception performing whole class analysis ignored.
// */
//public class NettyServer$1
//        extends ChannelInitializer<SocketChannel> {
//    final /* synthetic */ NettyServerHandler val$nettyServerHandler;
//
//    NettyServer$1(NettyServerHandler nettyServerHandler) {
//        this.val$nettyServerHandler = nettyServerHandler;
//    }
//
//    @Override
//    protected void initChannel(SocketChannel ch) throws Exception {
//        int idleTimeout = UrlUtils.getIdleTimeout((URL) NettyServer.this.getUrl());
//        NettyCodecAdapter adapter = new NettyCodecAdapter(NettyServer.access$000((NettyServer) NettyServer.this), NettyServer.this.getUrl(), (ChannelHandler) NettyServer.this);
//        if (NettyServer.this.getUrl().getParameter("ssl-enabled", false)) {
//            ch.pipeline().addLast("negotiation", (io.netty.channel.ChannelHandler) SslHandlerInitializer.sslServerHandler((URL) NettyServer.this.getUrl(), (NettyServerHandler) this.val$nettyServerHandler));
//        }
//        ch.pipeline().addLast("decoder", adapter.getDecoder()).addLast("encoder", adapter.getEncoder()).addLast("server-idle-handler", (io.netty.channel.ChannelHandler) new IdleStateHandler(0L, 0L, idleTimeout, TimeUnit.MILLISECONDS)).addLast("handler", (io.netty.channel.ChannelHandler) this.val$nettyServerHandler);
//    }
//}
//
