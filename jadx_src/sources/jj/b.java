package jj;

import hj.d;

/* JADX INFO: compiled from: LevelInterceptor.java */
/* JADX INFO: loaded from: classes5.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f124359a = 2;

    @Override // jj.a
    public boolean a(d dVar) {
        return dVar != null && dVar.f119200a >= this.f124359a;
    }

    public void b(int i10) {
        this.f124359a = i10;
    }
}
