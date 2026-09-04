package com.huawei.hmf.tasks.a;

import com.huawei.hmf.tasks.OnCanceledListener;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes7.dex */
public final class e<TResult> implements OnCanceledListener, OnFailureListener, OnSuccessListener<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f60199a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f60200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i<Void> f60201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f60202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Exception f60203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f60204f;

    e(int i10, i<Void> iVar) {
        this.f60200b = i10;
        this.f60201c = iVar;
    }

    private void a() {
        if (this.f60202d >= this.f60200b) {
            if (this.f60203e != null) {
                this.f60201c.a(new ExecutionException("a task failed", this.f60203e));
            } else if (this.f60204f) {
                this.f60201c.a();
            } else {
                this.f60201c.a((Void) null);
            }
        }
    }

    @Override // com.huawei.hmf.tasks.OnCanceledListener
    public final void onCanceled() {
        synchronized (this.f60199a) {
            this.f60202d++;
            this.f60204f = true;
            a();
        }
    }

    @Override // com.huawei.hmf.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        synchronized (this.f60199a) {
            this.f60202d++;
            this.f60203e = exc;
            a();
        }
    }

    @Override // com.huawei.hmf.tasks.OnSuccessListener
    public final void onSuccess(TResult tresult) {
        synchronized (this.f60199a) {
            this.f60202d++;
            a();
        }
    }
}
