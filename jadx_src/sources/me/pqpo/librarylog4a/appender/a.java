package me.pqpo.librarylog4a.appender;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: AbsAppender.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f131883d = 4063;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f131884a = 4063;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<jj.a> f131885b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private jj.b f131886c;

    public a() {
        jj.b bVar = new jj.b();
        this.f131886c = bVar;
        c(bVar);
    }

    private void d(int i10, String str, String str2) {
        if (str2.length() <= this.f131884a) {
            e(i10, str, str2);
            return;
        }
        int length = str2.length();
        int i11 = 0;
        int iMin = this.f131884a + 0;
        while (i11 < length) {
            e(i10, str, str2.substring(i11, iMin));
            int i12 = iMin;
            iMin = Math.min(this.f131884a + iMin, length);
            i11 = i12;
        }
    }

    @Override // me.pqpo.librarylog4a.appender.c
    public void a(int i10, String str, String str2) {
        hj.d dVarB = hj.d.b(i10, str, str2);
        Iterator<jj.a> it = this.f131885b.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (!it.next().a(dVarB)) {
                z10 = true;
            }
        }
        if (!z10) {
            d(dVarB.f119200a, dVarB.f119201b, dVarB.f119202c);
        }
        dVarB.c();
    }

    public void b(List<jj.a> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.f131885b.addAll(list);
    }

    public void c(jj.a aVar) {
        if (aVar != null) {
            this.f131885b.add(aVar);
        }
    }

    protected abstract void e(int i10, String str, String str2);

    public void f(int i10) {
        this.f131886c.b(i10);
    }

    @Override // me.pqpo.librarylog4a.appender.c
    public void flush() {
    }

    public void g(int i10) {
        this.f131884a = i10;
    }

    @Override // me.pqpo.librarylog4a.appender.c
    public void release() {
    }
}
