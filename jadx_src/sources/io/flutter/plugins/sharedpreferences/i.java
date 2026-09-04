package io.flutter.plugins.sharedpreferences;

import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: Messages.java */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i {
    @n0
    public static MessageCodec<Object> a() {
        return new StandardMessageCodec();
    }

    public static /* synthetic */ void b(Messages.SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, sharedPreferencesApi.remove((String) ((ArrayList) obj).get(0)));
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void c(Messages.SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, sharedPreferencesApi.setBool((String) arrayList2.get(0), (Boolean) arrayList2.get(1)));
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void d(Messages.SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, sharedPreferencesApi.setString((String) arrayList2.get(0), (String) arrayList2.get(1)));
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void e(Messages.SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
        Long lValueOf;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        String str = (String) arrayList2.get(0);
        Number number = (Number) arrayList2.get(1);
        if (number == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(number.longValue());
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
        }
        arrayList.add(0, sharedPreferencesApi.setInt(str, lValueOf));
        reply.reply(arrayList);
    }

    public static /* synthetic */ void f(Messages.SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, sharedPreferencesApi.setDouble((String) arrayList2.get(0), (Double) arrayList2.get(1)));
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void g(Messages.SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, sharedPreferencesApi.setStringList((String) arrayList2.get(0), (List) arrayList2.get(1)));
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void h(Messages.SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, sharedPreferencesApi.clear((String) arrayList2.get(0), (List) arrayList2.get(1)));
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void i(Messages.SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, sharedPreferencesApi.getAll((String) arrayList2.get(0), (List) arrayList2.get(1)));
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        reply.reply(arrayList);
    }

    public static void j(@n0 BinaryMessenger binaryMessenger, @p0 final Messages.SharedPreferencesApi sharedPreferencesApi) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.SharedPreferencesApi.remove", a(), binaryMessenger.makeBackgroundTaskQueue());
        if (sharedPreferencesApi != null) {
            basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.a
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    i.b(sharedPreferencesApi, obj, reply);
                }
            });
        } else {
            basicMessageChannel.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.SharedPreferencesApi.setBool", a(), binaryMessenger.makeBackgroundTaskQueue());
        if (sharedPreferencesApi != null) {
            basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.b
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    i.c(sharedPreferencesApi, obj, reply);
                }
            });
        } else {
            basicMessageChannel2.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.SharedPreferencesApi.setString", a(), binaryMessenger.makeBackgroundTaskQueue());
        if (sharedPreferencesApi != null) {
            basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.c
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    i.d(sharedPreferencesApi, obj, reply);
                }
            });
        } else {
            basicMessageChannel3.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.SharedPreferencesApi.setInt", a(), binaryMessenger.makeBackgroundTaskQueue());
        if (sharedPreferencesApi != null) {
            basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.d
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    i.e(sharedPreferencesApi, obj, reply);
                }
            });
        } else {
            basicMessageChannel4.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.SharedPreferencesApi.setDouble", a(), binaryMessenger.makeBackgroundTaskQueue());
        if (sharedPreferencesApi != null) {
            basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.e
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    i.f(sharedPreferencesApi, obj, reply);
                }
            });
        } else {
            basicMessageChannel5.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.SharedPreferencesApi.setStringList", a(), binaryMessenger.makeBackgroundTaskQueue());
        if (sharedPreferencesApi != null) {
            basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.f
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    i.g(sharedPreferencesApi, obj, reply);
                }
            });
        } else {
            basicMessageChannel6.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.SharedPreferencesApi.clear", a(), binaryMessenger.makeBackgroundTaskQueue());
        if (sharedPreferencesApi != null) {
            basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.g
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    i.h(sharedPreferencesApi, obj, reply);
                }
            });
        } else {
            basicMessageChannel7.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.SharedPreferencesApi.getAll", a(), binaryMessenger.makeBackgroundTaskQueue());
        if (sharedPreferencesApi != null) {
            basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.h
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    i.i(sharedPreferencesApi, obj, reply);
                }
            });
        } else {
            basicMessageChannel8.setMessageHandler(null);
        }
    }
}
