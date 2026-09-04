package com.efs.sdk.base.core.e;

import com.efs.sdk.base.core.util.Log;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.efs.sdk.base.core.e.a.a f42527a;

    public abstract com.efs.sdk.base.core.e.a.a a();

    public final void a(com.efs.sdk.base.core.d.b bVar) {
        try {
            if (this.f42527a == null) {
                synchronized (this) {
                    if (this.f42527a == null) {
                        com.efs.sdk.base.core.e.a.a aVarA = a();
                        this.f42527a = aVarA;
                        if (aVarA == null) {
                            return;
                        }
                    }
                }
            }
            this.f42527a.a(bVar);
        } catch (Throwable th2) {
            Log.e("efs.processor", "log handle error", th2);
        }
    }
}
