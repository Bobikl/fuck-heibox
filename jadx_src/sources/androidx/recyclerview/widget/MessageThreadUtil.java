package androidx.recyclerview.widget;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class MessageThreadUtil<T> implements ThreadUtil<T> {

    /* JADX INFO: renamed from: androidx.recyclerview.widget.MessageThreadUtil$1, reason: invalid class name */
    public class AnonymousClass1 implements ThreadUtil.MainThreadCallback<T> {
        static final int ADD_TILE = 2;
        static final int REMOVE_TILE = 3;
        static final int UPDATE_ITEM_COUNT = 1;
        final /* synthetic */ ThreadUtil.MainThreadCallback val$callback;
        final MessageQueue mQueue = new MessageQueue();
        private final Handler mMainThreadHandler = new Handler(Looper.getMainLooper());
        private Runnable mMainThreadRunnable = new Runnable() { // from class: androidx.recyclerview.widget.MessageThreadUtil.1.1
            @Override // java.lang.Runnable
            public void run() {
                SyncQueueItem next = AnonymousClass1.this.mQueue.next();
                while (next != null) {
                    int i10 = next.what;
                    if (i10 == 1) {
                        AnonymousClass1.this.val$callback.updateItemCount(next.arg1, next.arg2);
                    } else if (i10 == 2) {
                        AnonymousClass1.this.val$callback.addTile(next.arg1, (TileList.Tile) next.data);
                    } else if (i10 != 3) {
                        Log.e("ThreadUtil", "Unsupported message, what=" + next.what);
                    } else {
                        AnonymousClass1.this.val$callback.removeTile(next.arg1, next.arg2);
                    }
                    next = AnonymousClass1.this.mQueue.next();
                }
            }
        };

        AnonymousClass1(ThreadUtil.MainThreadCallback mainThreadCallback) {
            this.val$callback = mainThreadCallback;
        }

        private void sendMessage(SyncQueueItem syncQueueItem) {
            this.mQueue.sendMessage(syncQueueItem);
            this.mMainThreadHandler.post(this.mMainThreadRunnable);
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void addTile(int i10, TileList.Tile<T> tile) {
            sendMessage(SyncQueueItem.obtainMessage(2, i10, tile));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void removeTile(int i10, int i11) {
            sendMessage(SyncQueueItem.obtainMessage(3, i10, i11));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void updateItemCount(int i10, int i11) {
            sendMessage(SyncQueueItem.obtainMessage(1, i10, i11));
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.MessageThreadUtil$2, reason: invalid class name */
    public class AnonymousClass2 implements ThreadUtil.BackgroundCallback<T> {
        static final int LOAD_TILE = 3;
        static final int RECYCLE_TILE = 4;
        static final int REFRESH = 1;
        static final int UPDATE_RANGE = 2;
        final /* synthetic */ ThreadUtil.BackgroundCallback val$callback;
        final MessageQueue mQueue = new MessageQueue();
        private final Executor mExecutor = AsyncTask.THREAD_POOL_EXECUTOR;
        AtomicBoolean mBackgroundRunning = new AtomicBoolean(false);
        private Runnable mBackgroundRunnable = new Runnable() { // from class: androidx.recyclerview.widget.MessageThreadUtil.2.1
            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    SyncQueueItem next = AnonymousClass2.this.mQueue.next();
                    if (next == null) {
                        AnonymousClass2.this.mBackgroundRunning.set(false);
                        return;
                    }
                    int i10 = next.what;
                    if (i10 == 1) {
                        AnonymousClass2.this.mQueue.removeMessages(1);
                        AnonymousClass2.this.val$callback.refresh(next.arg1);
                    } else if (i10 == 2) {
                        AnonymousClass2.this.mQueue.removeMessages(2);
                        AnonymousClass2.this.mQueue.removeMessages(3);
                        AnonymousClass2.this.val$callback.updateRange(next.arg1, next.arg2, next.arg3, next.arg4, next.arg5);
                    } else if (i10 == 3) {
                        AnonymousClass2.this.val$callback.loadTile(next.arg1, next.arg2);
                    } else if (i10 != 4) {
                        Log.e("ThreadUtil", "Unsupported message, what=" + next.what);
                    } else {
                        AnonymousClass2.this.val$callback.recycleTile((TileList.Tile) next.data);
                    }
                }
            }
        };

        AnonymousClass2(ThreadUtil.BackgroundCallback backgroundCallback) {
            this.val$callback = backgroundCallback;
        }

        private void maybeExecuteBackgroundRunnable() {
            if (this.mBackgroundRunning.compareAndSet(false, true)) {
                this.mExecutor.execute(this.mBackgroundRunnable);
            }
        }

        private void sendMessage(SyncQueueItem syncQueueItem) {
            this.mQueue.sendMessage(syncQueueItem);
            maybeExecuteBackgroundRunnable();
        }

        private void sendMessageAtFrontOfQueue(SyncQueueItem syncQueueItem) {
            this.mQueue.sendMessageAtFrontOfQueue(syncQueueItem);
            maybeExecuteBackgroundRunnable();
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void loadTile(int i10, int i11) {
            sendMessage(SyncQueueItem.obtainMessage(3, i10, i11));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void recycleTile(TileList.Tile<T> tile) {
            sendMessage(SyncQueueItem.obtainMessage(4, 0, tile));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void refresh(int i10) {
            sendMessageAtFrontOfQueue(SyncQueueItem.obtainMessage(1, i10, (Object) null));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void updateRange(int i10, int i11, int i12, int i13, int i14) {
            sendMessageAtFrontOfQueue(SyncQueueItem.obtainMessage(2, i10, i11, i12, i13, i14, null));
        }
    }

    public static class MessageQueue {
        private SyncQueueItem mRoot;

        MessageQueue() {
        }

        synchronized SyncQueueItem next() {
            SyncQueueItem syncQueueItem = this.mRoot;
            if (syncQueueItem == null) {
                return null;
            }
            this.mRoot = syncQueueItem.next;
            return syncQueueItem;
        }

        synchronized void removeMessages(int i10) {
            SyncQueueItem syncQueueItem;
            while (true) {
                syncQueueItem = this.mRoot;
                if (syncQueueItem == null || syncQueueItem.what != i10) {
                    break;
                }
                this.mRoot = syncQueueItem.next;
                syncQueueItem.recycle();
            }
            if (syncQueueItem != null) {
                SyncQueueItem syncQueueItem2 = syncQueueItem.next;
                while (syncQueueItem2 != null) {
                    SyncQueueItem syncQueueItem3 = syncQueueItem2.next;
                    if (syncQueueItem2.what == i10) {
                        syncQueueItem.next = syncQueueItem3;
                        syncQueueItem2.recycle();
                    } else {
                        syncQueueItem = syncQueueItem2;
                    }
                    syncQueueItem2 = syncQueueItem3;
                }
            }
        }

        synchronized void sendMessage(SyncQueueItem syncQueueItem) {
            SyncQueueItem syncQueueItem2 = this.mRoot;
            if (syncQueueItem2 == null) {
                this.mRoot = syncQueueItem;
                return;
            }
            while (true) {
                SyncQueueItem syncQueueItem3 = syncQueueItem2.next;
                if (syncQueueItem3 == null) {
                    syncQueueItem2.next = syncQueueItem;
                    return;
                }
                syncQueueItem2 = syncQueueItem3;
            }
        }

        synchronized void sendMessageAtFrontOfQueue(SyncQueueItem syncQueueItem) {
            syncQueueItem.next = this.mRoot;
            this.mRoot = syncQueueItem;
        }
    }

    public static class SyncQueueItem {
        private static SyncQueueItem sPool;
        private static final Object sPoolLock = new Object();
        public int arg1;
        public int arg2;
        public int arg3;
        public int arg4;
        public int arg5;
        public Object data;
        SyncQueueItem next;
        public int what;

        SyncQueueItem() {
        }

        static SyncQueueItem obtainMessage(int i10, int i11, int i12) {
            return obtainMessage(i10, i11, i12, 0, 0, 0, null);
        }

        static SyncQueueItem obtainMessage(int i10, int i11, int i12, int i13, int i14, int i15, Object obj) {
            SyncQueueItem syncQueueItem;
            synchronized (sPoolLock) {
                syncQueueItem = sPool;
                if (syncQueueItem == null) {
                    syncQueueItem = new SyncQueueItem();
                } else {
                    sPool = syncQueueItem.next;
                    syncQueueItem.next = null;
                }
                syncQueueItem.what = i10;
                syncQueueItem.arg1 = i11;
                syncQueueItem.arg2 = i12;
                syncQueueItem.arg3 = i13;
                syncQueueItem.arg4 = i14;
                syncQueueItem.arg5 = i15;
                syncQueueItem.data = obj;
            }
            return syncQueueItem;
        }

        static SyncQueueItem obtainMessage(int i10, int i11, Object obj) {
            return obtainMessage(i10, i11, 0, 0, 0, 0, obj);
        }

        void recycle() {
            this.next = null;
            this.arg5 = 0;
            this.arg4 = 0;
            this.arg3 = 0;
            this.arg2 = 0;
            this.arg1 = 0;
            this.what = 0;
            this.data = null;
            synchronized (sPoolLock) {
                SyncQueueItem syncQueueItem = sPool;
                if (syncQueueItem != null) {
                    this.next = syncQueueItem;
                }
                sPool = this;
            }
        }
    }

    MessageThreadUtil() {
    }

    @Override // androidx.recyclerview.widget.ThreadUtil
    public ThreadUtil.BackgroundCallback<T> getBackgroundProxy(ThreadUtil.BackgroundCallback<T> backgroundCallback) {
        return new AnonymousClass2(backgroundCallback);
    }

    @Override // androidx.recyclerview.widget.ThreadUtil
    public ThreadUtil.MainThreadCallback<T> getMainThreadProxy(ThreadUtil.MainThreadCallback<T> mainThreadCallback) {
        return new AnonymousClass1(mainThreadCallback);
    }
}
