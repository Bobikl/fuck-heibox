package org.aspectj.internal.lang.reflect;

import zj.x;

/* JADX INFO: compiled from: DeclareErrorOrWarningImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class d implements zj.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private x f137616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f137617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f137618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private zj.c f137619d;

    public d(String str, String str2, boolean z10, zj.c cVar) {
        this.f137616a = new n(str);
        this.f137617b = str2;
        this.f137618c = z10;
        this.f137619d = cVar;
    }

    @Override // zj.h
    public zj.c a() {
        return this.f137619d;
    }

    @Override // zj.h
    public String b() {
        return this.f137617b;
    }

    @Override // zj.h
    public x d() {
        return this.f137616a;
    }

    @Override // zj.h
    public boolean isError() {
        return this.f137618c;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("declare ");
        stringBuffer.append(isError() ? "error : " : "warning : ");
        stringBuffer.append(d().a());
        stringBuffer.append(" : ");
        stringBuffer.append("\"");
        stringBuffer.append(b());
        stringBuffer.append("\"");
        return stringBuffer.toString();
    }
}
