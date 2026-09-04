package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: ResourceRecycler.java */
/* JADX INFO: loaded from: classes6.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f41294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f41295b = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: compiled from: ResourceRecycler.java */
    public static final class a implements Handler.Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f41296b = 1;

        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((s) message.obj).recycle();
            return true;
        }
    }

    v() {
    }

    synchronized void a(s<?> sVar, boolean z10) {
        if (this.f41294a || z10) {
            this.f41295b.obtainMessage(1, sVar).sendToTarget();
        } else {
            this.f41294a = true;
            sVar.recycle();
            this.f41294a = false;
        }
    }
}
