package com.google.android.gms.tasks;

import java.util.concurrent.ExecutionException;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* JADX INFO: loaded from: classes7.dex */
public final class u<T> implements t<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f52799a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f52800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q0 f52801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @GuardedBy("mLock")
    private int f52802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @GuardedBy("mLock")
    private int f52803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @GuardedBy("mLock")
    private int f52804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @GuardedBy("mLock")
    private Exception f52805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @GuardedBy("mLock")
    private boolean f52806h;

    public u(int i10, q0 q0Var) {
        this.f52800b = i10;
        this.f52801c = q0Var;
    }

    @GuardedBy("mLock")
    private final void a() {
        if (this.f52802d + this.f52803e + this.f52804f == this.f52800b) {
            if (this.f52805g == null) {
                if (this.f52806h) {
                    this.f52801c.A();
                    return;
                } else {
                    this.f52801c.z(null);
                    return;
                }
            }
            this.f52801c.y(new ExecutionException(this.f52803e + " out of " + this.f52800b + " underlying tasks failed", this.f52805g));
        }
    }

    @Override // com.google.android.gms.tasks.d
    public final void onCanceled() {
        synchronized (this.f52799a) {
            this.f52804f++;
            this.f52806h = true;
            a();
        }
    }

    @Override // com.google.android.gms.tasks.f
    public final void onFailure(@androidx.annotation.n0 Exception exc) {
        synchronized (this.f52799a) {
            this.f52803e++;
            this.f52805g = exc;
            a();
        }
    }

    @Override // com.google.android.gms.tasks.g
    public final void onSuccess(T t10) {
        synchronized (this.f52799a) {
            this.f52802d++;
            a();
        }
    }
}
