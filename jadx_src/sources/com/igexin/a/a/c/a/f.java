package com.igexin.a.a.c.a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.igexin.push.core.x;

/* JADX INFO: loaded from: classes7.dex */
public class f extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f63202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Messenger f63203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private StringBuffer f63204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Messenger f63205d;

    private f() {
        super(Looper.getMainLooper());
        this.f63202a = "LOG-" + f.class.getSimpleName();
        this.f63203b = new Messenger(this);
        this.f63204c = new StringBuffer();
    }

    public static f a() {
        return h.f63206a;
    }

    private void a(Message message) {
        this.f63205d = message.replyTo;
        if (c()) {
            b(this.f63204c.toString());
            this.f63204c.setLength(0);
        }
    }

    private void b(String str) {
        try {
            Message message = new Message();
            message.what = 2;
            Bundle bundle = new Bundle();
            bundle.putString("log_data", str);
            message.setData(bundle);
            this.f63205d.send(message);
        } catch (Exception e10) {
            com.igexin.a.a.c.b.a(this.f63202a + "|send message error = " + e10, new Object[0]);
        }
    }

    private boolean c() {
        return this.f63204c.length() > 0;
    }

    public void a(String str) {
        Context context = x.f63788a;
        if (context == null || !com.igexin.push.util.a.c(context)) {
            return;
        }
        if (this.f63205d != null) {
            b(str);
            return;
        }
        if (this.f63204c.length() + str.length() < 5120) {
            StringBuffer stringBuffer = this.f63204c;
            stringBuffer.append(str);
            stringBuffer.append("\n");
        } else {
            if (this.f63204c.length() > 5120 || this.f63204c.length() + 135 <= 5120) {
                return;
            }
            StringBuffer stringBuffer2 = this.f63204c;
            stringBuffer2.append("Warning! the log cache is too long to show the full content,we suggest you call initialize and setDebugLogger in a short time interval.");
            stringBuffer2.append("\n");
        }
    }

    public IBinder b() {
        return this.f63203b.getBinder();
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message.what != 1) {
            super.handleMessage(message);
        } else {
            a(message);
        }
    }
}
