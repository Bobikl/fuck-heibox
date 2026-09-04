package com.efs.sdk.base.core.util.concurrent;

import androidx.annotation.n0;
import com.efs.sdk.base.core.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class d<T> implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<b<T>> f42577a = new ArrayList(5);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c<T> f42578b;

    public d(@n0 c<T> cVar) {
        this.f42578b = cVar;
    }

    public final T a() {
        T tA = null;
        try {
            Iterator<b<T>> it = this.f42577a.iterator();
            while (it.hasNext()) {
                it.next();
            }
            tA = this.f42578b.a();
            Iterator<b<T>> it2 = this.f42577a.iterator();
            while (it2.hasNext()) {
                it2.next().a(this.f42578b, tA);
            }
            Iterator<b<T>> it3 = this.f42577a.iterator();
            while (it3.hasNext()) {
                it3.next().result(tA);
            }
        } catch (Throwable th2) {
            Log.w("efs.util.concurrent", th2);
            Iterator<b<T>> it4 = this.f42577a.iterator();
            while (it4.hasNext()) {
                it4.next();
            }
        }
        return tA;
    }

    public final void a(@n0 List<b<T>> list) {
        this.f42577a.addAll(list);
    }

    @Override // java.lang.Runnable
    public void run() {
        a();
    }
}
