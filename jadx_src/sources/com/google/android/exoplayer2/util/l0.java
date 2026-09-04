package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: SystemHandlerWrapper.java */
/* JADX INFO: loaded from: classes7.dex */
public final class l0 implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f51449b = 50;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.b0("messagePool")
    private static final List<b> f51450c = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f51451a;

    /* JADX INFO: compiled from: SystemHandlerWrapper.java */
    public static final class b implements p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        private Message f51452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private l0 f51453b;

        private b() {
        }

        private void b() {
            this.f51452a = null;
            this.f51453b = null;
            l0.q(this);
        }

        @Override // com.google.android.exoplayer2.util.p.a
        public void a() {
            ((Message) com.google.android.exoplayer2.util.a.g(this.f51452a)).sendToTarget();
            b();
        }

        public boolean c(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) com.google.android.exoplayer2.util.a.g(this.f51452a));
            b();
            return zSendMessageAtFrontOfQueue;
        }

        public b d(Message message, l0 l0Var) {
            this.f51452a = message;
            this.f51453b = l0Var;
            return this;
        }

        @Override // com.google.android.exoplayer2.util.p.a
        public p getTarget() {
            return (p) com.google.android.exoplayer2.util.a.g(this.f51453b);
        }
    }

    public l0(Handler handler) {
        this.f51451a = handler;
    }

    private static b p() {
        b bVar;
        List<b> list = f51450c;
        synchronized (list) {
            bVar = list.isEmpty() ? new b() : list.remove(list.size() - 1);
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(b bVar) {
        List<b> list = f51450c;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(bVar);
            }
        }
    }

    @Override // com.google.android.exoplayer2.util.p
    public boolean a(int i10, int i11) {
        return this.f51451a.sendEmptyMessageDelayed(i10, i11);
    }

    @Override // com.google.android.exoplayer2.util.p
    public boolean b(Runnable runnable) {
        return this.f51451a.postAtFrontOfQueue(runnable);
    }

    @Override // com.google.android.exoplayer2.util.p
    public p.a c(int i10) {
        return p().d(this.f51451a.obtainMessage(i10), this);
    }

    @Override // com.google.android.exoplayer2.util.p
    public boolean d(int i10) {
        return this.f51451a.hasMessages(i10);
    }

    @Override // com.google.android.exoplayer2.util.p
    public p.a e(int i10, @androidx.annotation.p0 Object obj) {
        return p().d(this.f51451a.obtainMessage(i10, obj), this);
    }

    @Override // com.google.android.exoplayer2.util.p
    public void f(@androidx.annotation.p0 Object obj) {
        this.f51451a.removeCallbacksAndMessages(obj);
    }

    @Override // com.google.android.exoplayer2.util.p
    public p.a g(int i10, int i11, int i12) {
        return p().d(this.f51451a.obtainMessage(i10, i11, i12), this);
    }

    @Override // com.google.android.exoplayer2.util.p
    public boolean h(p.a aVar) {
        return ((b) aVar).c(this.f51451a);
    }

    @Override // com.google.android.exoplayer2.util.p
    public p.a i(int i10, int i11, int i12, @androidx.annotation.p0 Object obj) {
        return p().d(this.f51451a.obtainMessage(i10, i11, i12, obj), this);
    }

    @Override // com.google.android.exoplayer2.util.p
    public Looper j() {
        return this.f51451a.getLooper();
    }

    @Override // com.google.android.exoplayer2.util.p
    public boolean k(Runnable runnable) {
        return this.f51451a.post(runnable);
    }

    @Override // com.google.android.exoplayer2.util.p
    public boolean l(int i10) {
        return this.f51451a.sendEmptyMessage(i10);
    }

    @Override // com.google.android.exoplayer2.util.p
    public boolean m(int i10, long j10) {
        return this.f51451a.sendEmptyMessageAtTime(i10, j10);
    }

    @Override // com.google.android.exoplayer2.util.p
    public void n(int i10) {
        this.f51451a.removeMessages(i10);
    }

    @Override // com.google.android.exoplayer2.util.p
    public boolean postDelayed(Runnable runnable, long j10) {
        return this.f51451a.postDelayed(runnable, j10);
    }
}
