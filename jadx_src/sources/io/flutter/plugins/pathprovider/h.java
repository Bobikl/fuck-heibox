package io.flutter.plugins.pathprovider;

import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.util.ArrayList;

/* JADX INFO: compiled from: Messages.java */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h {
    @n0
    public static MessageCodec<Object> a() {
        return new StandardMessageCodec();
    }

    public static /* synthetic */ void b(Messages.PathProviderApi pathProviderApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, pathProviderApi.getTemporaryPath());
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void c(Messages.PathProviderApi pathProviderApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, pathProviderApi.getApplicationSupportPath());
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void d(Messages.PathProviderApi pathProviderApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, pathProviderApi.getApplicationDocumentsPath());
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void e(Messages.PathProviderApi pathProviderApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, pathProviderApi.getApplicationCachePath());
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void f(Messages.PathProviderApi pathProviderApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, pathProviderApi.getExternalStoragePath());
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void g(Messages.PathProviderApi pathProviderApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, pathProviderApi.getExternalCachePaths());
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void h(Messages.PathProviderApi pathProviderApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, pathProviderApi.getExternalStoragePaths(arrayList2.get(0) == null ? null : Messages.StorageDirectory.values()[((Integer) arrayList2.get(0)).intValue()]));
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        reply.reply(arrayList);
    }

    public static void i(@n0 BinaryMessenger binaryMessenger, @p0 final Messages.PathProviderApi pathProviderApi) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PathProviderApi.getTemporaryPath", a(), binaryMessenger.makeBackgroundTaskQueue());
        if (pathProviderApi != null) {
            basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.pathprovider.a
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    h.b(pathProviderApi, obj, reply);
                }
            });
        } else {
            basicMessageChannel.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PathProviderApi.getApplicationSupportPath", a(), binaryMessenger.makeBackgroundTaskQueue());
        if (pathProviderApi != null) {
            basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.pathprovider.b
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    h.c(pathProviderApi, obj, reply);
                }
            });
        } else {
            basicMessageChannel2.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PathProviderApi.getApplicationDocumentsPath", a(), binaryMessenger.makeBackgroundTaskQueue());
        if (pathProviderApi != null) {
            basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.pathprovider.c
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    h.d(pathProviderApi, obj, reply);
                }
            });
        } else {
            basicMessageChannel3.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PathProviderApi.getApplicationCachePath", a(), binaryMessenger.makeBackgroundTaskQueue());
        if (pathProviderApi != null) {
            basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.pathprovider.d
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    h.e(pathProviderApi, obj, reply);
                }
            });
        } else {
            basicMessageChannel4.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePath", a(), binaryMessenger.makeBackgroundTaskQueue());
        if (pathProviderApi != null) {
            basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.pathprovider.e
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    h.f(pathProviderApi, obj, reply);
                }
            });
        } else {
            basicMessageChannel5.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PathProviderApi.getExternalCachePaths", a(), binaryMessenger.makeBackgroundTaskQueue());
        if (pathProviderApi != null) {
            basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.pathprovider.f
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    h.g(pathProviderApi, obj, reply);
                }
            });
        } else {
            basicMessageChannel6.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePaths", a(), binaryMessenger.makeBackgroundTaskQueue());
        if (pathProviderApi != null) {
            basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.pathprovider.g
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    h.h(pathProviderApi, obj, reply);
                }
            });
        } else {
            basicMessageChannel7.setMessageHandler(null);
        }
    }
}
