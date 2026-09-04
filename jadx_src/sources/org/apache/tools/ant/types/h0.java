package org.apache.tools.ant.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: compiled from: FilterSetCollection.java */
/* JADX INFO: loaded from: classes5.dex */
public class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<f0> f136165a = new ArrayList();

    public h0() {
    }

    public h0(f0 f0Var) {
        a(f0Var);
    }

    public void a(f0 f0Var) {
        this.f136165a.add(f0Var);
    }

    public boolean b() {
        return this.f136165a.stream().anyMatch(new Predicate() { // from class: org.apache.tools.ant.types.g0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((f0) obj).t2();
            }
        });
    }

    public String c(String str) {
        Iterator<f0> it = this.f136165a.iterator();
        while (it.hasNext()) {
            str = it.next().z2(str);
        }
        return str;
    }
}
