package com.max.xiaoheihe.okflutter.pigeon;

import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import java.util.ArrayList;

/* JADX INFO: compiled from: IHybridRoute.java */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class r {
    @n0
    public static MessageCodec<Object> a() {
        return IHybridRoute.HostRouterMethodCodec.INSTANCE;
    }

    public static /* synthetic */ void b(IHybridRoute.HostRouterMethod hostRouterMethod, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            hostRouterMethod.push((IHybridRoute.HybridRouteInfo) ((ArrayList) obj).get(0));
            arrayList.add(0, null);
        } catch (Throwable th2) {
            arrayList = IHybridRoute.wrapError(th2);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void c(IHybridRoute.HostRouterMethod hostRouterMethod, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            hostRouterMethod.pop((IHybridRoute.HybridRouteInfo) ((ArrayList) obj).get(0));
            arrayList.add(0, null);
        } catch (Throwable th2) {
            arrayList = IHybridRoute.wrapError(th2);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void d(IHybridRoute.HostRouterMethod hostRouterMethod, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            hostRouterMethod.bringToFront((String) arrayList2.get(0), (String) arrayList2.get(1));
            arrayList.add(0, null);
        } catch (Throwable th2) {
            arrayList = IHybridRoute.wrapError(th2);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void e(IHybridRoute.HostRouterMethod hostRouterMethod, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            hostRouterMethod.disablePopGesture((String) ((ArrayList) obj).get(0));
            arrayList.add(0, null);
        } catch (Throwable th2) {
            arrayList = IHybridRoute.wrapError(th2);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void f(IHybridRoute.HostRouterMethod hostRouterMethod, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            hostRouterMethod.enablePopGesture((String) ((ArrayList) obj).get(0));
            arrayList.add(0, null);
        } catch (Throwable th2) {
            arrayList = IHybridRoute.wrapError(th2);
        }
        reply.reply(arrayList);
    }

    public static void g(@n0 BinaryMessenger binaryMessenger, @p0 IHybridRoute.HostRouterMethod hostRouterMethod) {
        h(binaryMessenger, "", hostRouterMethod);
    }

    public static void h(@n0 BinaryMessenger binaryMessenger, @n0 String str, @p0 final IHybridRoute.HostRouterMethod hostRouterMethod) {
        String str2;
        if (str.isEmpty()) {
            str2 = "";
        } else {
            str2 = "." + str;
        }
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.heybox_okflutter.HostRouterMethod.push" + str2, a());
        if (hostRouterMethod != null) {
            basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: com.max.xiaoheihe.okflutter.pigeon.m
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    r.b(hostRouterMethod, obj, reply);
                }
            });
        } else {
            basicMessageChannel.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.heybox_okflutter.HostRouterMethod.pop" + str2, a());
        if (hostRouterMethod != null) {
            basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: com.max.xiaoheihe.okflutter.pigeon.n
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    r.c(hostRouterMethod, obj, reply);
                }
            });
        } else {
            basicMessageChannel2.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.heybox_okflutter.HostRouterMethod.bringToFront" + str2, a());
        if (hostRouterMethod != null) {
            basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: com.max.xiaoheihe.okflutter.pigeon.o
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    r.d(hostRouterMethod, obj, reply);
                }
            });
        } else {
            basicMessageChannel3.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.heybox_okflutter.HostRouterMethod.disablePopGesture" + str2, a());
        if (hostRouterMethod != null) {
            basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: com.max.xiaoheihe.okflutter.pigeon.p
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    r.e(hostRouterMethod, obj, reply);
                }
            });
        } else {
            basicMessageChannel4.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.heybox_okflutter.HostRouterMethod.enablePopGesture" + str2, a());
        if (hostRouterMethod != null) {
            basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: com.max.xiaoheihe.okflutter.pigeon.q
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    r.f(hostRouterMethod, obj, reply);
                }
            });
        } else {
            basicMessageChannel5.setMessageHandler(null);
        }
    }
}
