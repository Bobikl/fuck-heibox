package com.vivo.push;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: Worker.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f106630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Handler f106631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f106632c = new Object();

    /* JADX INFO: compiled from: Worker.java */
    public final class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            q.this.b(message);
        }
    }

    public q() {
        HandlerThread handlerThread = new HandlerThread(getClass().getSimpleName(), 1);
        handlerThread.start();
        this.f106631b = new a(handlerThread.getLooper());
    }

    public final void a(Context context) {
        this.f106630a = context;
    }

    public final void a(Message message) {
        synchronized (this.f106632c) {
            Handler handler = this.f106631b;
            if (handler == null) {
                String str = "Dead worker dropping a message: " + message.what;
                com.vivo.push.util.p.e(getClass().getSimpleName(), str + " (Thread " + Thread.currentThread().getId() + ")");
            } else {
                handler.sendMessage(message);
            }
        }
    }

    public abstract void b(Message message);
}
