package com.tencent.thumbplayer.tcmedia.core.drm.reuse;

import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLog;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
public class TPDoubleQueueCachedPool<T> {
    private static final int DEFAULT_CORE_POOL_SIZE = 2;
    private static final String TAG = "[PlayerCore][TPDoubleQueueCachedPool]";
    private final int mCorePoolSize;
    private ITPObjectLifecycleMgr<T> mObjectLifecycleMgr;
    private final List<T> mIdleCacheList = new ArrayList();
    private final List<T> mBusyCacheList = new ArrayList();

    public interface ITPObjectLifecycleMgr<T> {
        T create(TPDoubleQueueCachedPool<T> tPDoubleQueueCachedPool);

        void release(TPDoubleQueueCachedPool<T> tPDoubleQueueCachedPool, T t10);

        boolean reset(TPDoubleQueueCachedPool<T> tPDoubleQueueCachedPool, T t10);
    }

    public TPDoubleQueueCachedPool(int i10, int i11, ITPObjectLifecycleMgr<T> iTPObjectLifecycleMgr) {
        this.mCorePoolSize = i11 <= 0 ? 2 : i11;
        i10 = i10 <= 0 ? 2 : i10;
        this.mObjectLifecycleMgr = iTPObjectLifecycleMgr;
        for (int i12 = 0; i12 < i10; i12++) {
            T tCreate = iTPObjectLifecycleMgr.create(this);
            if (tCreate == null) {
                TPNativeLog.printLog(3, TAG, "TPDoubleQueueCachedPool, createObject failed.");
            } else {
                this.mIdleCacheList.add(tCreate);
            }
        }
        TPNativeLog.printLog(2, TAG, "TPDoubleQueueCachedPool init size:" + this.mIdleCacheList.size());
    }

    public synchronized T allocObject() {
        T tRemove;
        if (this.mIdleCacheList.isEmpty()) {
            tRemove = this.mObjectLifecycleMgr.create(this);
            if (tRemove == null) {
                return null;
            }
        } else {
            tRemove = this.mIdleCacheList.remove(0);
        }
        this.mBusyCacheList.add(tRemove);
        return tRemove;
    }

    public synchronized void freeObject(T t10) {
        this.mBusyCacheList.remove(t10);
        this.mObjectLifecycleMgr.release(this, t10);
    }

    public synchronized void recycleObject(T t10) {
        if (this.mBusyCacheList.remove(t10) && this.mIdleCacheList.size() < this.mCorePoolSize && this.mObjectLifecycleMgr.reset(this, t10)) {
            this.mIdleCacheList.add(t10);
        } else {
            this.mObjectLifecycleMgr.release(this, t10);
        }
    }

    public synchronized void release() {
        ListIterator<T> listIterator = this.mBusyCacheList.listIterator();
        while (listIterator.hasNext()) {
            this.mObjectLifecycleMgr.release(this, listIterator.next());
            listIterator.remove();
        }
        ListIterator<T> listIterator2 = this.mIdleCacheList.listIterator();
        while (listIterator2.hasNext()) {
            this.mObjectLifecycleMgr.release(this, listIterator2.next());
            listIterator2.remove();
        }
        this.mObjectLifecycleMgr = null;
    }
}
