package com.huawei.hmf.tasks.a;

import com.huawei.hmf.tasks.ExecuteResult;
import com.huawei.hmf.tasks.OnCanceledListener;
import com.huawei.hmf.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public final class b<TResult> implements ExecuteResult<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OnCanceledListener f60187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Executor f60188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f60189c = new Object();

    b(Executor executor, OnCanceledListener onCanceledListener) {
        this.f60187a = onCanceledListener;
        this.f60188b = executor;
    }

    @Override // com.huawei.hmf.tasks.ExecuteResult
    public final void cancel() {
        synchronized (this.f60189c) {
            this.f60187a = null;
        }
    }

    @Override // com.huawei.hmf.tasks.ExecuteResult
    public final void onComplete(Task<TResult> task) {
        if (task.isCanceled()) {
            this.f60188b.execute(new Runnable() { // from class: com.huawei.hmf.tasks.a.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (b.this.f60189c) {
                        if (b.this.f60187a != null) {
                            b.this.f60187a.onCanceled();
                        }
                    }
                }
            });
        }
    }
}
