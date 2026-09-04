package androidx.recyclerview.widget;

import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
public final class AsyncDifferConfig<T> {

    @n0
    private final Executor mBackgroundThreadExecutor;

    @n0
    private final DiffUtil.ItemCallback<T> mDiffCallback;

    @p0
    private final Executor mMainThreadExecutor;

    public static final class Builder<T> {
        private static Executor sDiffExecutor;
        private static final Object sExecutorLock = new Object();
        private Executor mBackgroundThreadExecutor;
        private final DiffUtil.ItemCallback<T> mDiffCallback;

        @p0
        private Executor mMainThreadExecutor;

        public Builder(@n0 DiffUtil.ItemCallback<T> itemCallback) {
            this.mDiffCallback = itemCallback;
        }

        @n0
        public AsyncDifferConfig<T> build() {
            if (this.mBackgroundThreadExecutor == null) {
                synchronized (sExecutorLock) {
                    if (sDiffExecutor == null) {
                        sDiffExecutor = Executors.newFixedThreadPool(2);
                    }
                }
                this.mBackgroundThreadExecutor = sDiffExecutor;
            }
            return new AsyncDifferConfig<>(this.mMainThreadExecutor, this.mBackgroundThreadExecutor, this.mDiffCallback);
        }

        @n0
        public Builder<T> setBackgroundThreadExecutor(Executor executor) {
            this.mBackgroundThreadExecutor = executor;
            return this;
        }

        @n0
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public Builder<T> setMainThreadExecutor(Executor executor) {
            this.mMainThreadExecutor = executor;
            return this;
        }
    }

    AsyncDifferConfig(@p0 Executor executor, @n0 Executor executor2, @n0 DiffUtil.ItemCallback<T> itemCallback) {
        this.mMainThreadExecutor = executor;
        this.mBackgroundThreadExecutor = executor2;
        this.mDiffCallback = itemCallback;
    }

    @n0
    public Executor getBackgroundThreadExecutor() {
        return this.mBackgroundThreadExecutor;
    }

    @n0
    public DiffUtil.ItemCallback<T> getDiffCallback() {
        return this.mDiffCallback;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @p0
    public Executor getMainThreadExecutor() {
        return this.mMainThreadExecutor;
    }
}
