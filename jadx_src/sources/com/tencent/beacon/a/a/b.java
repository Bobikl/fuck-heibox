package com.tencent.beacon.a.a;

import android.util.SparseArray;
import androidx.annotation.n0;
import com.tencent.beacon.a.b.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: BeaconBus.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile b f98733a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f98735c = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AtomicBoolean f98738f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray<List<d>> f98734b = new SparseArray<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseArray<List<c>> f98736d = new SparseArray<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseArray<Object> f98737e = new SparseArray<>();

    private b() {
    }

    public static b a() {
        if (f98733a == null) {
            synchronized (b.class) {
                if (f98733a == null) {
                    f98733a = new b();
                }
            }
        }
        return f98733a;
    }

    private Object b(int i10) {
        Object obj;
        synchronized (this.f98735c) {
            obj = this.f98737e.get(i10);
            if (obj == null) {
                obj = new Object();
                this.f98737e.put(i10, obj);
            }
        }
        return obj;
    }

    private List<d> c(int i10) {
        List<d> list = this.f98734b.get(i10);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list;
    }

    private void c(c cVar) {
        d(cVar);
        synchronized (b(cVar.f98739a)) {
            try {
                List<d> listC = c(cVar.f98739a);
                if (listC == null) {
                    return;
                }
                Iterator<d> it = listC.iterator();
                while (it.hasNext()) {
                    try {
                        it.next().a(cVar);
                    } catch (Throwable th2) {
                        com.tencent.beacon.base.util.c.a(th2);
                        if (this.f98738f.compareAndSet(false, true)) {
                            g.e().a("512", "dispatchEvent error", th2);
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private void d(c cVar) {
    }

    public void a(int i10) {
        synchronized (b(i10)) {
            this.f98736d.remove(i10);
        }
    }

    public void a(int i10, d dVar) {
        synchronized (b(i10)) {
            List<d> arrayList = this.f98734b.get(i10);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f98734b.put(i10, arrayList);
            }
            if (arrayList.contains(dVar)) {
                return;
            }
            arrayList.add(dVar);
            List<c> list = this.f98736d.get(i10);
            if (list != null) {
                Iterator<c> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        dVar.a(it.next());
                    } catch (Throwable th2) {
                        com.tencent.beacon.base.util.c.a(th2);
                    }
                }
                if (i10 == 6 || i10 == 12) {
                    a(i10);
                }
            }
        }
    }

    public void a(@n0 c cVar) {
        com.tencent.beacon.a.b.a.a().a(new a(this, cVar));
    }

    public void b(@n0 c cVar) {
        synchronized (b(cVar.f98739a)) {
            c cVar2 = new c(cVar.f98739a, cVar.f98740b);
            List<c> arrayList = this.f98736d.get(cVar2.f98739a);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f98736d.put(cVar2.f98739a, arrayList);
            }
            arrayList.add(cVar2);
            c(cVar);
        }
    }
}
