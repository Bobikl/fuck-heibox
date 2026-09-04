package com.huawei.hms.scankit.p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: ParticleAnimators.java */
/* JADX INFO: loaded from: classes7.dex */
public class x5 implements f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<f4> f62550a = new ArrayList();

    public void a(@androidx.annotation.n0 f4 f4Var) {
        if (this.f62550a == null) {
            this.f62550a = new ArrayList();
        }
        this.f62550a.add(f4Var);
    }

    @Override // com.huawei.hms.scankit.p.f4
    public void a(@androidx.annotation.n0 w5 w5Var, long j10) {
        Iterator<f4> it = this.f62550a.iterator();
        while (it.hasNext()) {
            it.next().a(w5Var, j10);
        }
    }
}
