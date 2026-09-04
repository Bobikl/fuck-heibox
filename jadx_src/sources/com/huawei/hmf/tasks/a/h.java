package com.huawei.hmf.tasks.a;

import com.huawei.hmf.tasks.ExecuteResult;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public final class h<TResult> implements ExecuteResult<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OnSuccessListener<TResult> f60212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Executor f60213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f60214c = new Object();

    h(Executor executor, OnSuccessListener<TResult> onSuccessListener) {
        this.f60212a = onSuccessListener;
        this.f60213b = executor;
    }

    @Override // com.huawei.hmf.tasks.ExecuteResult
    public final void cancel() {
        synchronized (this.f60214c) {
            this.f60212a = null;
        }
    }

    @Override // com.huawei.hmf.tasks.ExecuteResult
    public final void onComplete(final Task<TResult> task) {
        if (!task.isSuccessful() || task.isCanceled()) {
            return;
        }
        this.f60213b.execute(new Runnable() { // from class: com.huawei.hmf.tasks.a.h.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (h.this.f60214c) {
                    if (h.this.f60212a != null) {
                        h.this.f60212a.onSuccess(task.getResult());
                    }
                }
            }
        });
    }
}
