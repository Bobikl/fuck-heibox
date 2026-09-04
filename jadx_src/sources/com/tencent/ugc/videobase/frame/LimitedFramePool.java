package com.tencent.ugc.videobase.frame;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.videobase.frame.RefCounted;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes4.dex */
public abstract class LimitedFramePool<T extends RefCounted> {
    private static final String TAG = "LimitedFramePool";
    private final Deque<T> mDeque = new LinkedList();
    private volatile boolean mIsDestroyed = false;
    private final IRecycler<T> mRecycler = (IRecycler<T>) new IRecycler<T>() { // from class: com.tencent.ugc.videobase.frame.LimitedFramePool.1
        @Override // com.tencent.ugc.videobase.frame.IRecycler
        public final void recycle(T t10) {
            if (t10 == null) {
                return;
            }
            LimitedFramePool.this.mSemaphore.release();
            synchronized (LimitedFramePool.this) {
                if (LimitedFramePool.this.mIsDestroyed) {
                    LimitedFramePool.this.destroyInstance(t10);
                } else {
                    LimitedFramePool.this.mDeque.addFirst(t10);
                }
            }
        }
    };
    private final Semaphore mSemaphore;

    protected LimitedFramePool(int i10) {
        this.mSemaphore = new Semaphore(i10);
    }

    protected abstract T createInstance(IRecycler<T> iRecycler);

    public void destroy() {
        this.mIsDestroyed = true;
        evictAll();
    }

    protected abstract void destroyInstance(T t10);

    public void evictAll() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.mDeque);
            this.mDeque.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            destroyInstance((RefCounted) it.next());
        }
    }

    public T obtain() throws InterruptedException {
        T tRemoveFirst;
        this.mSemaphore.acquire();
        synchronized (this) {
            tRemoveFirst = !this.mDeque.isEmpty() ? this.mDeque.removeFirst() : (T) createInstance(this.mRecycler);
        }
        if (tRemoveFirst.retain() != 1) {
            LiteavLog.e(TAG, "invalid reference count for %s", tRemoveFirst);
        }
        return tRemoveFirst;
    }
}
