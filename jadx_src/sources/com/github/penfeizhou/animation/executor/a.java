package com.github.penfeizhou.animation.executor;

import android.os.HandlerThread;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: FrameDecoderExecutor.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f43280c = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<HandlerThread> f43281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicInteger f43282b;

    /* JADX INFO: compiled from: FrameDecoderExecutor.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final a f43283a = new a();

        b() {
        }
    }

    private a() {
        this.f43281a = new ArrayList<>();
        this.f43282b = new AtomicInteger(0);
    }

    public static a b() {
        return b.f43283a;
    }

    public int a() {
        return this.f43282b.getAndIncrement();
    }

    public Looper c(int i10) {
        Looper looper;
        int i11 = i10 % f43280c;
        if (i11 < this.f43281a.size()) {
            return (this.f43281a.get(i11) == null || (looper = this.f43281a.get(i11).getLooper()) == null) ? Looper.getMainLooper() : looper;
        }
        HandlerThread handlerThread = new HandlerThread("FrameDecoderExecutor-" + i11);
        handlerThread.start();
        this.f43281a.add(handlerThread);
        Looper looper2 = handlerThread.getLooper();
        return looper2 != null ? looper2 : Looper.getMainLooper();
    }

    public void d(int i10) {
        f43280c = i10;
    }
}
