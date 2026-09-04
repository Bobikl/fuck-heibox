package com.huawei.hmf.tasks;

import com.huawei.hmf.tasks.a.c;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class CancellationTokenSource {
    private c impl = new c();

    public void cancel() {
        c cVar = this.impl;
        if (cVar.f60193c) {
            return;
        }
        synchronized (cVar.f60192b) {
            cVar.f60193c = true;
            Iterator<Runnable> it = cVar.f60191a.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }
    }

    public CancellationToken getToken() {
        return this.impl;
    }
}
