package com.tencent.liteav.base.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f99741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f99742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f99743c;

    public interface a {
        void onTimeout();
    }

    public x(Looper looper, a aVar) {
        super(looper);
        this.f99742b = false;
        this.f99743c = aVar;
    }

    public final synchronized void a() {
        while (hasMessages(0)) {
            removeMessages(0);
        }
        this.f99742b = false;
    }

    public final synchronized void a(int i10) {
        a();
        this.f99741a = i10;
        this.f99742b = true;
        sendEmptyMessageDelayed(0, 0L);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        synchronized (this) {
            if (this.f99742b) {
                removeMessages(0);
                sendEmptyMessageDelayed(0, this.f99741a);
                a aVar = this.f99743c;
                if (aVar != null) {
                    aVar.onTimeout();
                }
            }
        }
    }
}
