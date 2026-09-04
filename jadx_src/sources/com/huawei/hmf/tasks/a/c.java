package com.huawei.hmf.tasks.a;

import com.huawei.hmf.tasks.CancellationToken;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends CancellationToken {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Runnable> f60191a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f60192b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f60193c = false;

    @Override // com.huawei.hmf.tasks.CancellationToken
    public final boolean isCancellationRequested() {
        return this.f60193c;
    }

    @Override // com.huawei.hmf.tasks.CancellationToken
    public final CancellationToken register(Runnable runnable) {
        synchronized (this.f60192b) {
            if (this.f60193c) {
                runnable.run();
            } else {
                this.f60191a.add(runnable);
            }
        }
        return this;
    }
}
