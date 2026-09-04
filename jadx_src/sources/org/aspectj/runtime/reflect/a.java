package org.aspectj.runtime.reflect;

import java.lang.reflect.Method;
import java.util.StringTokenizer;

/* JADX INFO: compiled from: AdviceSignatureImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class a extends c implements zj.b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    Class f137717p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Method f137718q;

    a(int i10, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2, Class cls2) {
        super(i10, str, cls, clsArr, strArr, clsArr2);
        this.f137718q = null;
        this.f137717p = cls2;
    }

    a(String str) {
        super(str);
        this.f137718q = null;
    }

    private String E(String str) {
        if (str.indexOf(36) == -1) {
            return str;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, "$");
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            if (strNextToken.startsWith(com.google.android.exoplayer2.text.ttml.d.f49784c0) || strNextToken.startsWith(com.google.android.exoplayer2.text.ttml.d.f49785d0) || strNextToken.startsWith("around")) {
                return strNextToken;
            }
        }
        return str;
    }

    @Override // zj.b
    public Class getReturnType() {
        if (this.f137717p == null) {
            this.f137717p = u(6);
        }
        return this.f137717p;
    }

    @Override // zj.b
    public Method m() {
        if (this.f137718q == null) {
            try {
                this.f137718q = a().getDeclaredMethod(getName(), c());
            } catch (Exception unused) {
            }
        }
        return this.f137718q;
    }

    @Override // org.aspectj.runtime.reflect.l
    protected String q(n nVar) {
        StringBuffer stringBuffer = new StringBuffer();
        if (nVar.f137769b) {
            stringBuffer.append(nVar.g(getReturnType()));
        }
        if (nVar.f137769b) {
            stringBuffer.append(" ");
        }
        stringBuffer.append(nVar.f(a(), k()));
        stringBuffer.append(".");
        stringBuffer.append(E(getName()));
        nVar.a(stringBuffer, c());
        nVar.b(stringBuffer, e());
        return stringBuffer.toString();
    }
}
