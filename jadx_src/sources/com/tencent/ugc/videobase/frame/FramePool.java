package com.tencent.ugc.videobase.frame;

import android.os.SystemClock;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.videobase.frame.RefCounted;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FramePool<T extends RefCounted> {
    private static final long MAX_TIME_OUT = TimeUnit.SECONDS.toMillis(1);
    private static final String TAG = "FramePool";
    private final Map<Key, Deque<T>> mDequeMap = new HashMap();
    private volatile boolean mIsDestroyed = false;
    private final com.tencent.liteav.base.b.a mEvictThrottler = new com.tencent.liteav.base.b.a(MAX_TIME_OUT);
    private final IRecycler<T> mRecycler = a.a(this);
    private final String mStackTrace = null;

    public interface Key {
        boolean equals(Object obj);

        int hashCode();
    }

    protected FramePool() {
    }

    private void evictOverdueObjectsUnlock() {
        T tPeekLast;
        if (this.mEvictThrottler.a()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ArrayList arrayList = new ArrayList();
            synchronized (this.mDequeMap) {
                for (Deque<T> deque : this.mDequeMap.values()) {
                    while (!deque.isEmpty() && ((tPeekLast = deque.peekLast()) == null || jElapsedRealtime - tPeekLast.getLastUsedTimestamp() >= MAX_TIME_OUT)) {
                        deque.pollLast();
                        arrayList.add(tPeekLast);
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                destroyInstance((RefCounted) it.next());
            }
        }
    }

    private Deque<T> findDequeUnlock(Key key) {
        Deque<T> deque = this.mDequeMap.get(key);
        if (deque != null) {
            return deque;
        }
        LinkedList linkedList = new LinkedList();
        this.mDequeMap.put(key, linkedList);
        return linkedList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void lambda$new$0(FramePool framePool, RefCounted refCounted) {
        if (refCounted == 0) {
            return;
        }
        synchronized (framePool.mDequeMap) {
            if (framePool.mIsDestroyed) {
                framePool.destroyInstance(refCounted);
                return;
            }
            Deque<T> dequeFindDequeUnlock = framePool.findDequeUnlock(framePool.keyForObject(refCounted));
            refCounted.updateLastUsedTimestamp(SystemClock.elapsedRealtime());
            dequeFindDequeUnlock.addFirst(refCounted);
        }
    }

    protected abstract T createInstance(IRecycler<T> iRecycler, Key key);

    public void destroy() {
        this.mIsDestroyed = true;
        evictAll();
    }

    protected abstract void destroyInstance(T t10);

    public void evictAll() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.mDequeMap) {
            Iterator<Deque<T>> it = this.mDequeMap.values().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next());
            }
            this.mDequeMap.clear();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            destroyInstance((RefCounted) it2.next());
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.mIsDestroyed) {
            return;
        }
        LiteavLog.e(TAG, "%s must call destroy() before finalize()!\n%s", getClass().getName(), this.mStackTrace);
    }

    protected abstract Key keyForObject(T t10);

    protected T obtain(Key key) {
        T tRemoveFirst;
        synchronized (this.mDequeMap) {
            Deque<T> dequeFindDequeUnlock = findDequeUnlock(key);
            tRemoveFirst = !dequeFindDequeUnlock.isEmpty() ? dequeFindDequeUnlock.removeFirst() : null;
        }
        evictOverdueObjectsUnlock();
        if (tRemoveFirst == null) {
            tRemoveFirst = (T) createInstance(this.mRecycler, key);
        }
        if (tRemoveFirst.retain() != 1) {
            LiteavLog.e(TAG, "invalid reference count for %s", tRemoveFirst);
        }
        return tRemoveFirst;
    }
}
