package org.aspectj.internal.lang.reflect;

import com.xiaomi.mipush.sdk.Constants;
import java.util.StringTokenizer;
import zj.a0;

/* JADX INFO: compiled from: DeclarePrecedenceImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class f implements zj.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private zj.c<?> f137627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a0[] f137628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f137629c;

    public f(String str, zj.c cVar) {
        this.f137627a = cVar;
        this.f137629c = str;
        StringTokenizer stringTokenizer = new StringTokenizer(str.startsWith("(") ? str.substring(1, str.length() - 1) : str, Constants.ACCEPT_TIME_SEPARATOR_SP);
        this.f137628b = new a0[stringTokenizer.countTokens()];
        int i10 = 0;
        while (true) {
            a0[] a0VarArr = this.f137628b;
            if (i10 >= a0VarArr.length) {
                return;
            }
            a0VarArr[i10] = new s(stringTokenizer.nextToken().trim());
            i10++;
        }
    }

    @Override // zj.j
    public zj.c a() {
        return this.f137627a;
    }

    @Override // zj.j
    public a0[] b() {
        return this.f137628b;
    }

    public String toString() {
        return "declare precedence : " + this.f137629c;
    }
}
