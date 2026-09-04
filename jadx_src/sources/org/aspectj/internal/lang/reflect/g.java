package org.aspectj.internal.lang.reflect;

import zj.x;

/* JADX INFO: compiled from: DeclareSoftImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class g implements zj.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private zj.c<?> f137630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private x f137631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private zj.c<?> f137632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f137633d;

    public g(zj.c<?> cVar, String str, String str2) {
        this.f137630a = cVar;
        this.f137631b = new n(str);
        try {
            this.f137632c = zj.d.a(Class.forName(str2, false, cVar.J().getClassLoader()));
        } catch (ClassNotFoundException unused) {
            this.f137633d = str2;
        }
    }

    @Override // zj.k
    public zj.c a() {
        return this.f137630a;
    }

    @Override // zj.k
    public zj.c b() throws ClassNotFoundException {
        if (this.f137633d == null) {
            return this.f137632c;
        }
        throw new ClassNotFoundException(this.f137633d);
    }

    @Override // zj.k
    public x d() {
        return this.f137631b;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("declare soft : ");
        String str = this.f137633d;
        if (str != null) {
            stringBuffer.append(this.f137632c.getName());
        } else {
            stringBuffer.append(str);
        }
        stringBuffer.append(" : ");
        stringBuffer.append(d().a());
        return stringBuffer.toString();
    }
}
