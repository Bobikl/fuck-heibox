package com.huawei.hmf.tasks.a;

import com.huawei.hmf.tasks.ExecuteResult;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public final class f<TResult> implements ExecuteResult<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OnFailureListener f60205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Executor f60206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f60207c = new Object();

    f(Executor executor, OnFailureListener onFailureListener) {
        this.f60205a = onFailureListener;
        this.f60206b = executor;
    }

    @Override // com.huawei.hmf.tasks.ExecuteResult
    public final void cancel() {
        synchronized (this.f60207c) {
            this.f60205a = null;
        }
    }

    @Override // com.huawei.hmf.tasks.ExecuteResult
    public final void onComplete(final Task<TResult> task) {
        if (task.isSuccessful() || task.isCanceled()) {
            return;
        }
        this.f60206b.execute(new Runnable() { // from class: com.huawei.hmf.tasks.a.f.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (f.this.f60207c) {
                    if (f.this.f60205a != null) {
                        f.this.f60205a.onFailure(task.getException());
                    }
                }
            }
        });
    }
}
