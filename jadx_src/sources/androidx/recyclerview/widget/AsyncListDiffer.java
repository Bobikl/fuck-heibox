package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public class AsyncListDiffer<T> {
    private static final Executor sMainThreadExecutor = new MainThreadExecutor();
    final AsyncDifferConfig<T> mConfig;

    @p0
    private List<T> mList;
    private final List<ListListener<T>> mListeners;
    Executor mMainThreadExecutor;
    int mMaxScheduledGeneration;

    @n0
    private List<T> mReadOnlyList;
    private final ListUpdateCallback mUpdateCallback;

    public interface ListListener<T> {
        void onCurrentListChanged(@n0 List<T> list, @n0 List<T> list2);
    }

    public static class MainThreadExecutor implements Executor {
        final Handler mHandler = new Handler(Looper.getMainLooper());

        MainThreadExecutor() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@n0 Runnable runnable) {
            this.mHandler.post(runnable);
        }
    }

    public AsyncListDiffer(@n0 ListUpdateCallback listUpdateCallback, @n0 AsyncDifferConfig<T> asyncDifferConfig) {
        this.mListeners = new CopyOnWriteArrayList();
        this.mReadOnlyList = Collections.emptyList();
        this.mUpdateCallback = listUpdateCallback;
        this.mConfig = asyncDifferConfig;
        if (asyncDifferConfig.getMainThreadExecutor() != null) {
            this.mMainThreadExecutor = asyncDifferConfig.getMainThreadExecutor();
        } else {
            this.mMainThreadExecutor = sMainThreadExecutor;
        }
    }

    public AsyncListDiffer(@n0 RecyclerView.Adapter adapter, @n0 DiffUtil.ItemCallback<T> itemCallback) {
        this(new AdapterListUpdateCallback(adapter), new AsyncDifferConfig.Builder(itemCallback).build());
    }

    private void onCurrentListChanged(@n0 List<T> list, @p0 Runnable runnable) {
        Iterator<ListListener<T>> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onCurrentListChanged(list, this.mReadOnlyList);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void addListListener(@n0 ListListener<T> listListener) {
        this.mListeners.add(listListener);
    }

    @n0
    public List<T> getCurrentList() {
        return this.mReadOnlyList;
    }

    void latchList(@n0 List<T> list, @n0 DiffUtil.DiffResult diffResult, @p0 Runnable runnable) {
        List<T> list2 = this.mReadOnlyList;
        this.mList = list;
        this.mReadOnlyList = Collections.unmodifiableList(list);
        diffResult.dispatchUpdatesTo(this.mUpdateCallback);
        onCurrentListChanged(list2, runnable);
    }

    public void removeListListener(@n0 ListListener<T> listListener) {
        this.mListeners.remove(listListener);
    }

    public void submitList(@p0 List<T> list) {
        submitList(list, null);
    }

    public void submitList(@p0 final List<T> list, @p0 final Runnable runnable) {
        final int i10 = this.mMaxScheduledGeneration + 1;
        this.mMaxScheduledGeneration = i10;
        final List<T> list2 = this.mList;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.mReadOnlyList;
        if (list == null) {
            int size = list2.size();
            this.mList = null;
            this.mReadOnlyList = Collections.emptyList();
            this.mUpdateCallback.onRemoved(0, size);
            onCurrentListChanged(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.mConfig.getBackgroundThreadExecutor().execute(new Runnable() { // from class: androidx.recyclerview.widget.AsyncListDiffer.1
                @Override // java.lang.Runnable
                public void run() {
                    final DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new DiffUtil.Callback() { // from class: androidx.recyclerview.widget.AsyncListDiffer.1.1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // androidx.recyclerview.widget.DiffUtil.Callback
                        public boolean areContentsTheSame(int i11, int i12) {
                            Object obj = list2.get(i11);
                            Object obj2 = list.get(i12);
                            if (obj != null && obj2 != null) {
                                return AsyncListDiffer.this.mConfig.getDiffCallback().areContentsTheSame(obj, obj2);
                            }
                            if (obj == null && obj2 == null) {
                                return true;
                            }
                            throw new AssertionError();
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // androidx.recyclerview.widget.DiffUtil.Callback
                        public boolean areItemsTheSame(int i11, int i12) {
                            Object obj = list2.get(i11);
                            Object obj2 = list.get(i12);
                            if (obj == null || obj2 == null) {
                                return obj == null && obj2 == null;
                            }
                            return AsyncListDiffer.this.mConfig.getDiffCallback().areItemsTheSame(obj, obj2);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // androidx.recyclerview.widget.DiffUtil.Callback
                        @p0
                        public Object getChangePayload(int i11, int i12) {
                            Object obj = list2.get(i11);
                            Object obj2 = list.get(i12);
                            if (obj == null || obj2 == null) {
                                throw new AssertionError();
                            }
                            return AsyncListDiffer.this.mConfig.getDiffCallback().getChangePayload(obj, obj2);
                        }

                        @Override // androidx.recyclerview.widget.DiffUtil.Callback
                        public int getNewListSize() {
                            return list.size();
                        }

                        @Override // androidx.recyclerview.widget.DiffUtil.Callback
                        public int getOldListSize() {
                            return list2.size();
                        }
                    });
                    AsyncListDiffer.this.mMainThreadExecutor.execute(new Runnable() { // from class: androidx.recyclerview.widget.AsyncListDiffer.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            AsyncListDiffer asyncListDiffer = AsyncListDiffer.this;
                            if (asyncListDiffer.mMaxScheduledGeneration == i10) {
                                asyncListDiffer.latchList(list, diffResultCalculateDiff, runnable);
                            }
                        }
                    });
                }
            });
            return;
        }
        this.mList = list;
        this.mReadOnlyList = Collections.unmodifiableList(list);
        this.mUpdateCallback.onInserted(0, list.size());
        onCurrentListChanged(list3, runnable);
    }
}
