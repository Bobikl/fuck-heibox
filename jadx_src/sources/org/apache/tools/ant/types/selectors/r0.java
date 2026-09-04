package org.apache.tools.ant.types.selectors;

import java.io.File;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: compiled from: TokenizedPattern.java */
/* JADX INFO: loaded from: classes5.dex */
public class r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r0 f136618c = new r0("", new String[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f136619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String[] f136620b;

    public r0(String str) {
        this(str, m0.t(str));
    }

    r0(String str, String[] strArr) {
        this.f136619a = str;
        this.f136620b = strArr;
    }

    public boolean a(String str) {
        return Stream.of((Object[]) this.f136620b).anyMatch(Predicate.isEqual(str));
    }

    public int b() {
        return this.f136620b.length;
    }

    public boolean c(String str) {
        String[] strArr = this.f136620b;
        return strArr.length > 0 && strArr[strArr.length - 1].equals(str);
    }

    public String d() {
        return this.f136619a;
    }

    public boolean e(q0 q0Var, boolean z10) {
        return m0.l(this.f136620b, q0Var.d(), z10);
    }

    public boolean equals(Object obj) {
        return (obj instanceof r0) && this.f136619a.equals(((r0) obj).f136619a);
    }

    public boolean f(q0 q0Var, boolean z10) {
        return m0.o(this.f136620b, q0Var.d(), z10);
    }

    public q0 g() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            String[] strArr = this.f136620b;
            if (i10 >= strArr.length || m0.d(strArr[i10])) {
                break;
            }
            if (i10 > 0 && sb2.charAt(sb2.length() - 1) != File.separatorChar) {
                sb2.append(File.separator);
            }
            sb2.append(this.f136620b[i10]);
            i10++;
        }
        if (i10 == 0) {
            return q0.f136612c;
        }
        String[] strArr2 = new String[i10];
        System.arraycopy(this.f136620b, 0, strArr2, 0, i10);
        return new q0(sb2.toString(), strArr2);
    }

    public r0 h() {
        String[] strArr = this.f136620b;
        if (strArr.length == 0) {
            throw new IllegalStateException("can't strip a token from nothing");
        }
        if (strArr.length == 1) {
            return f136618c;
        }
        int iLastIndexOf = this.f136619a.lastIndexOf(strArr[strArr.length - 1]);
        String[] strArr2 = this.f136620b;
        String[] strArr3 = new String[strArr2.length - 1];
        System.arraycopy(strArr2, 0, strArr3, 0, strArr2.length - 1);
        return new r0(this.f136619a.substring(0, iLastIndexOf), strArr3);
    }

    public int hashCode() {
        return this.f136619a.hashCode();
    }

    public String toString() {
        return this.f136619a;
    }
}
