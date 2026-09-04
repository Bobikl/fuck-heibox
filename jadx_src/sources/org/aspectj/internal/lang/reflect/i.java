package org.aspectj.internal.lang.reflect;

/* JADX INFO: compiled from: InterTypeDeclarationImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class i implements zj.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private zj.c<?> f137635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f137636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private zj.c<?> f137637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f137638d;

    public i(zj.c<?> cVar, String str, int i10) {
        this.f137635a = cVar;
        this.f137636b = str;
        this.f137638d = i10;
        try {
            this.f137637c = (zj.c) q.c(str, cVar.J());
        } catch (ClassNotFoundException unused) {
        }
    }

    public i(zj.c<?> cVar, zj.c<?> cVar2, int i10) {
        this.f137635a = cVar;
        this.f137637c = cVar2;
        this.f137636b = cVar2.getName();
        this.f137638d = i10;
    }

    @Override // zj.o
    public zj.c<?> a() {
        return this.f137635a;
    }

    @Override // zj.o
    public zj.c<?> g() throws ClassNotFoundException {
        zj.c<?> cVar = this.f137637c;
        if (cVar != null) {
            return cVar;
        }
        throw new ClassNotFoundException(this.f137636b);
    }

    @Override // zj.o
    public int getModifiers() {
        return this.f137638d;
    }
}
