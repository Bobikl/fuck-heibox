package androidx.coordinatorlayout.widget;

import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.collection.j2;
import androidx.core.util.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: DirectedAcyclicGraph.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n.a<ArrayList<T>> f19820a = new n.b(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j2<T, ArrayList<T>> f19821b = new j2<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<T> f19822c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<T> f19823d = new HashSet<>();

    private void e(T t10, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t10)) {
            return;
        }
        if (hashSet.contains(t10)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t10);
        ArrayList<T> arrayList2 = this.f19821b.get(t10);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                e(arrayList2.get(i10), arrayList, hashSet);
            }
        }
        hashSet.remove(t10);
        arrayList.add(t10);
    }

    @n0
    private ArrayList<T> f() {
        ArrayList<T> arrayListA = this.f19820a.a();
        return arrayListA == null ? new ArrayList<>() : arrayListA;
    }

    private void k(@n0 ArrayList<T> arrayList) {
        arrayList.clear();
        this.f19820a.b(arrayList);
    }

    public void a(@n0 T t10, @n0 T t11) {
        if (!this.f19821b.containsKey(t10) || !this.f19821b.containsKey(t11)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayListF = this.f19821b.get(t10);
        if (arrayListF == null) {
            arrayListF = f();
            this.f19821b.put(t10, arrayListF);
        }
        arrayListF.add(t11);
    }

    public void b(@n0 T t10) {
        if (this.f19821b.containsKey(t10)) {
            return;
        }
        this.f19821b.put(t10, null);
    }

    public void c() {
        int size = this.f19821b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> arrayListK = this.f19821b.k(i10);
            if (arrayListK != null) {
                k(arrayListK);
            }
        }
        this.f19821b.clear();
    }

    public boolean d(@n0 T t10) {
        return this.f19821b.containsKey(t10);
    }

    @p0
    public List g(@n0 T t10) {
        return this.f19821b.get(t10);
    }

    @p0
    public List<T> h(@n0 T t10) {
        int size = this.f19821b.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> arrayListK = this.f19821b.k(i10);
            if (arrayListK != null && arrayListK.contains(t10)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f19821b.g(i10));
            }
        }
        return arrayList;
    }

    @n0
    public ArrayList<T> i() {
        this.f19822c.clear();
        this.f19823d.clear();
        int size = this.f19821b.size();
        for (int i10 = 0; i10 < size; i10++) {
            e(this.f19821b.g(i10), this.f19822c, this.f19823d);
        }
        return this.f19822c;
    }

    public boolean j(@n0 T t10) {
        int size = this.f19821b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> arrayListK = this.f19821b.k(i10);
            if (arrayListK != null && arrayListK.contains(t10)) {
                return true;
            }
        }
        return false;
    }

    int l() {
        return this.f19821b.size();
    }
}
