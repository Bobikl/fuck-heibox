package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: SharedValues.java */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f19743c = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SparseIntArray f19744a = new SparseIntArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap<Integer, HashSet<WeakReference<a>>> f19745b = new HashMap<>();

    /* JADX INFO: compiled from: SharedValues.java */
    public interface a {
        void a(int i10, int i11, int i12);
    }

    public void a(int i10, a aVar) {
        HashSet<WeakReference<a>> hashSet = this.f19745b.get(Integer.valueOf(i10));
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.f19745b.put(Integer.valueOf(i10), hashSet);
        }
        hashSet.add(new WeakReference<>(aVar));
    }

    public void b() {
        this.f19745b.clear();
    }

    public void c(int i10, int i11) {
        int i12 = this.f19744a.get(i10, -1);
        if (i12 == i11) {
            return;
        }
        this.f19744a.put(i10, i11);
        HashSet<WeakReference<a>> hashSet = this.f19745b.get(Integer.valueOf(i10));
        if (hashSet == null) {
            return;
        }
        Iterator<WeakReference<a>> it = hashSet.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            a aVar = it.next().get();
            if (aVar != null) {
                aVar.a(i10, i11, i12);
            } else {
                z10 = true;
            }
        }
        if (z10) {
            ArrayList arrayList = new ArrayList();
            for (WeakReference<a> weakReference : hashSet) {
                if (weakReference.get() == null) {
                    arrayList.add(weakReference);
                }
            }
            hashSet.removeAll(arrayList);
        }
    }

    public int d(int i10) {
        return this.f19744a.get(i10, -1);
    }

    public void e(int i10, a aVar) {
        HashSet<WeakReference<a>> hashSet = this.f19745b.get(Integer.valueOf(i10));
        if (hashSet == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (WeakReference<a> weakReference : hashSet) {
            a aVar2 = weakReference.get();
            if (aVar2 == null || aVar2 == aVar) {
                arrayList.add(weakReference);
            }
        }
        hashSet.removeAll(arrayList);
    }

    public void f(a aVar) {
        Iterator<Integer> it = this.f19745b.keySet().iterator();
        while (it.hasNext()) {
            e(it.next().intValue(), aVar);
        }
    }
}
