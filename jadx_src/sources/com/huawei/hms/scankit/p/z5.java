package com.huawei.hms.scankit.p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: ParticleProperties.java */
/* JADX INFO: loaded from: classes7.dex */
public class z5 implements g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<g4> f62619a = new ArrayList();

    public void a(@androidx.annotation.n0 g4 g4Var) {
        if (this.f62619a == null) {
            this.f62619a = new ArrayList();
        }
        this.f62619a.add(g4Var);
    }

    @Override // com.huawei.hms.scankit.p.g4
    public void a(@androidx.annotation.n0 w5 w5Var) {
        Iterator<g4> it = this.f62619a.iterator();
        while (it.hasNext()) {
            it.next().a(w5Var);
        }
    }
}
