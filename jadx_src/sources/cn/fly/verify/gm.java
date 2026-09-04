package cn.fly.verify;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes6.dex */
public class gm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Handler f36800a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Message f36801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler.Callback f36802b;

        public a(Message message, Handler.Callback callback) {
            this.f36801a = message;
            this.f36802b = callback;
        }
    }

    private static Message a(Message message, Handler.Callback callback) {
        Message message2 = new Message();
        message2.obj = new a(message, callback);
        return message2;
    }

    private static synchronized void a() {
        if (f36800a == null) {
            b();
        }
    }

    public static boolean a(int i10, Handler.Callback callback) {
        a();
        return f36800a.sendMessage(b(i10, callback));
    }

    private static Message b(int i10, Handler.Callback callback) {
        Message message = new Message();
        message.what = i10;
        return a(message, callback);
    }

    private static void b() {
        f36800a = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: cn.fly.verify.gm.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                gm.b(message);
                return false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Message message) {
        a aVar = (a) message.obj;
        Message message2 = aVar.f36801a;
        Handler.Callback callback = aVar.f36802b;
        if (callback != null) {
            callback.handleMessage(message2);
        }
    }
}
