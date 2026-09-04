package com.bumptech.glide.load.engine.bitmap_recycle;

import com.bumptech.glide.load.engine.bitmap_recycle.m;
import java.util.Queue;

/* JADX INFO: compiled from: BaseKeyPool.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class d<T extends m> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f40978b = 20;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue<T> f40979a = com.bumptech.glide.util.o.g(20);

    d() {
    }

    abstract T a();

    T b() {
        T tPoll = this.f40979a.poll();
        return tPoll == null ? (T) a() : tPoll;
    }

    public void c(T t10) {
        if (this.f40979a.size() < 20) {
            this.f40979a.offer(t10);
        }
    }
}
