package org.jsoup.select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: CombiningEvaluator.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List<d> f138002a;

    /* JADX INFO: compiled from: CombiningEvaluator.java */
    public static final class a extends b {
        a(Collection<d> collection) {
            super(collection);
        }

        a(d... dVarArr) {
            this(Arrays.asList(dVarArr));
        }

        @Override // org.jsoup.select.d
        public boolean a(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            for (int i10 = 0; i10 < this.f138002a.size(); i10++) {
                if (!this.f138002a.get(i10).a(fVar, fVar2)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return org.jsoup.helper.c.e(this.f138002a, " ");
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CombiningEvaluator.java */
    public static final class C1249b extends b {
        C1249b() {
        }

        C1249b(Collection<d> collection) {
            if (collection.size() > 1) {
                this.f138002a.add(new a(collection));
            } else {
                this.f138002a.addAll(collection);
            }
        }

        @Override // org.jsoup.select.d
        public boolean a(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            for (int i10 = 0; i10 < this.f138002a.size(); i10++) {
                if (this.f138002a.get(i10).a(fVar, fVar2)) {
                    return true;
                }
            }
            return false;
        }

        public void d(d dVar) {
            this.f138002a.add(dVar);
        }

        public String toString() {
            return String.format(":or%s", this.f138002a);
        }
    }

    b() {
        this.f138002a = new ArrayList();
    }

    b(Collection<d> collection) {
        this();
        this.f138002a.addAll(collection);
    }

    void b(d dVar) {
        List<d> list = this.f138002a;
        list.set(list.size() - 1, dVar);
    }

    d c() {
        if (this.f138002a.size() <= 0) {
            return null;
        }
        List<d> list = this.f138002a;
        return list.get(list.size() - 1);
    }
}
