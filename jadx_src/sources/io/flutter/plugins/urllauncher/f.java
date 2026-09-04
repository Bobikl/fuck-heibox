package io.flutter.plugins.urllauncher;

import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: Messages.java */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f {
    @n0
    public static MessageCodec<Object> a() {
        return Messages.UrlLauncherApiCodec.INSTANCE;
    }

    public static /* synthetic */ void b(Messages.UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, urlLauncherApi.canLaunchUrl((String) ((ArrayList) obj).get(0)));
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void c(Messages.UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, urlLauncherApi.launchUrl((String) arrayList2.get(0), (Map) arrayList2.get(1)));
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void d(Messages.UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, urlLauncherApi.openUrlInApp((String) arrayList2.get(0), (Boolean) arrayList2.get(1), (Messages.WebViewOptions) arrayList2.get(2), (Messages.BrowserOptions) arrayList2.get(3)));
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void e(Messages.UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, urlLauncherApi.supportsCustomTabs());
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void f(Messages.UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            urlLauncherApi.closeWebView();
            arrayList.add(0, null);
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        reply.reply(arrayList);
    }

    public static void g(@n0 BinaryMessenger binaryMessenger, @p0 final Messages.UrlLauncherApi urlLauncherApi) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl", a());
        if (urlLauncherApi != null) {
            basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.urllauncher.a
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    f.b(urlLauncherApi, obj, reply);
                }
            });
        } else {
            basicMessageChannel.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl", a());
        if (urlLauncherApi != null) {
            basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.urllauncher.b
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    f.c(urlLauncherApi, obj, reply);
                }
            });
        } else {
            basicMessageChannel2.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp", a());
        if (urlLauncherApi != null) {
            basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.urllauncher.c
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    f.d(urlLauncherApi, obj, reply);
                }
            });
        } else {
            basicMessageChannel3.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs", a());
        if (urlLauncherApi != null) {
            basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.urllauncher.d
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    f.e(urlLauncherApi, obj, reply);
                }
            });
        } else {
            basicMessageChannel4.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView", a());
        if (urlLauncherApi != null) {
            basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.urllauncher.e
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    f.f(urlLauncherApi, obj, reply);
                }
            });
        } else {
            basicMessageChannel5.setMessageHandler(null);
        }
    }
}
