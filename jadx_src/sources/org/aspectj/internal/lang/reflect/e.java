package org.aspectj.internal.lang.reflect;

import java.lang.reflect.Type;
import zj.a0;

/* JADX INFO: compiled from: DeclareParentsImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class e implements zj.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private zj.c<?> f137620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a0 f137621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Type[] f137622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f137623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f137624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f137625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f137626g;

    public e(String str, String str2, boolean z10, zj.c<?> cVar) {
        this.f137626g = false;
        this.f137621b = new s(str);
        this.f137625f = z10;
        this.f137620a = cVar;
        this.f137623d = str2;
        try {
            this.f137622c = q.a(str2, cVar.J());
        } catch (ClassNotFoundException e10) {
            this.f137626g = true;
            this.f137624e = e10.getMessage();
        }
    }

    @Override // zj.i
    public zj.c a() {
        return this.f137620a;
    }

    @Override // zj.i
    public boolean b() {
        return !this.f137625f;
    }

    @Override // zj.i
    public Type[] c() throws ClassNotFoundException {
        if (this.f137626g) {
            throw new ClassNotFoundException(this.f137624e);
        }
        return this.f137622c;
    }

    @Override // zj.i
    public a0 d() {
        return this.f137621b;
    }

    @Override // zj.i
    public boolean isExtends() {
        return this.f137625f;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("declare parents : ");
        stringBuffer.append(d().a());
        stringBuffer.append(isExtends() ? " extends " : " implements ");
        stringBuffer.append(this.f137623d);
        return stringBuffer.toString();
    }
}
