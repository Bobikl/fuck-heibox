package com.lzy.okserver.task;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: PriorityRunnable.java */
/* JADX INFO: loaded from: classes6.dex */
public class b extends a<Runnable> implements Runnable {
    public static ChangeQuickRedirect changeQuickRedirect;

    public b(int i10, Runnable runnable) {
        super(i10, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30750ke, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ((Runnable) this.f64895c).run();
    }
}
