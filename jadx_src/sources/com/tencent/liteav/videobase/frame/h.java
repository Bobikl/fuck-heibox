package com.tencent.liteav.videobase.frame;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.frame.j;
import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h<T extends j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Deque<T> f100372a = new LinkedList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f100374c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g<T> f100375d = (g<T>) new g<T>() { // from class: com.tencent.liteav.videobase.frame.h.1
        @Override // com.tencent.liteav.videobase.frame.g
        public final void a(T t10) {
            h.this.f100373b.release();
            synchronized (h.this) {
                if (h.this.f100374c) {
                    return;
                }
                h.this.f100372a.addFirst(t10);
            }
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Semaphore f100373b = new Semaphore(1);

    protected h() {
    }

    public final T a() throws InterruptedException {
        T tRemoveFirst;
        this.f100373b.acquire();
        synchronized (this) {
            tRemoveFirst = !this.f100372a.isEmpty() ? this.f100372a.removeFirst() : (T) a(this.f100375d);
        }
        if (tRemoveFirst.retain() != 1) {
            LiteavLog.e("LimitedFramePool", "invalid reference count for %s", tRemoveFirst);
        }
        return tRemoveFirst;
    }

    protected abstract T a(g<T> gVar);
}
