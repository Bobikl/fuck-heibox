package org.aspectj.internal.lang.reflect;

import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.Method;
import java.util.StringTokenizer;
import zj.v;
import zj.x;

/* JADX INFO: compiled from: PointcutImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class o implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f137654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f137655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Method f137656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zj.c f137657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String[] f137658e;

    protected o(String str, String str2, Method method, zj.c cVar, String str3) {
        this.f137658e = new String[0];
        this.f137654a = str;
        this.f137655b = new n(str2);
        this.f137656c = method;
        this.f137657d = cVar;
        this.f137658e = b(str3);
    }

    private String[] b(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, Constants.ACCEPT_TIME_SEPARATOR_SP);
        int iCountTokens = stringTokenizer.countTokens();
        String[] strArr = new String[iCountTokens];
        for (int i10 = 0; i10 < iCountTokens; i10++) {
            strArr[i10] = stringTokenizer.nextToken().trim();
        }
        return strArr;
    }

    @Override // zj.v
    public zj.c a() {
        return this.f137657d;
    }

    @Override // zj.v
    public zj.c<?>[] c() {
        Class<?>[] parameterTypes = this.f137656c.getParameterTypes();
        int length = parameterTypes.length;
        zj.c<?>[] cVarArr = new zj.c[length];
        for (int i10 = 0; i10 < length; i10++) {
            cVarArr[i10] = zj.d.a(parameterTypes[i10]);
        }
        return cVarArr;
    }

    @Override // zj.v
    public x d() {
        return this.f137655b;
    }

    @Override // zj.v
    public int getModifiers() {
        return this.f137656c.getModifiers();
    }

    @Override // zj.v
    public String getName() {
        return this.f137654a;
    }

    @Override // zj.v
    public String[] getParameterNames() {
        return this.f137658e;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getName());
        stringBuffer.append("(");
        zj.c<?>[] cVarArrC = c();
        int i10 = 0;
        while (i10 < cVarArrC.length) {
            stringBuffer.append(cVarArrC[i10].getName());
            String[] strArr = this.f137658e;
            if (strArr != null && strArr[i10] != null) {
                stringBuffer.append(" ");
                stringBuffer.append(this.f137658e[i10]);
            }
            i10++;
            if (i10 < cVarArrC.length) {
                stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
        }
        stringBuffer.append(") : ");
        stringBuffer.append(d().a());
        return stringBuffer.toString();
    }
}
