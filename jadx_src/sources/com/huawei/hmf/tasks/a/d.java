package com.huawei.hmf.tasks.a;

import com.huawei.hmf.tasks.ExecuteResult;
import com.huawei.hmf.tasks.OnCompleteListener;
import com.huawei.hmf.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public final class d<TResult> implements ExecuteResult<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Executor f60194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OnCompleteListener<TResult> f60195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f60196c = new Object();

    d(Executor executor, OnCompleteListener<TResult> onCompleteListener) {
        this.f60195b = onCompleteListener;
        this.f60194a = executor;
    }

    @Override // com.huawei.hmf.tasks.ExecuteResult
    public final void cancel() {
        synchronized (this.f60196c) {
            this.f60195b = null;
        }
    }

    @Override // com.huawei.hmf.tasks.ExecuteResult
    public final void onComplete(final Task<TResult> task) {
        this.f60194a.execute(new Runnable() { // from class: com.huawei.hmf.tasks.a.d.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (d.this.f60196c) {
                    if (d.this.f60195b != null) {
                        d.this.f60195b.onComplete(task);
                    }
                }
            }
        });
    }
}
