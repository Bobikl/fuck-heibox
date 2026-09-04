package com.google.android.play.core.splitinstall.internal;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.b0("this")
    protected final Set f56316a = new HashSet();

    public final synchronized void a(k9.a aVar) {
        this.f56316a.add(aVar);
    }

    public final synchronized void b(k9.a aVar) {
        this.f56316a.remove(aVar);
    }

    public final synchronized void c(Object obj) {
        Iterator it = this.f56316a.iterator();
        while (it.hasNext()) {
            ((k9.a) it.next()).onStateUpdate(obj);
        }
    }
}
