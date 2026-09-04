package org.apache.tools.ant.taskdefs.email;

/* JADX INFO: compiled from: EmailAddress.java */
/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f134098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f134099b;

    public a() {
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0048 A[PHI: r8
  0x0048: PHI (r8v5 int) = (r8v1 int), (r8v6 int) binds: [B:35:0x0068, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    public a(String str) {
        int length = str.length();
        if (length > 9 && ((str.charAt(0) == '<' || str.charAt(1) == '<') && (str.charAt(length - 1) == '>' || str.charAt(length - 2) == '>'))) {
            this.f134099b = e(str, true);
            return;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '(') {
                i13++;
                if (i14 == 0) {
                    i11 = i10;
                }
            } else if (cCharAt == ')') {
                i13--;
                if (i11 == 0) {
                    i14 = i10 + 1;
                    i12 = i10;
                }
            } else if (i13 == 0 && cCharAt == '<') {
                i12 = i14 == 0 ? i10 : i12;
                i14 = i10 + 1;
            } else if (i13 == 0 && cCharAt == '>') {
                i15 = i10 != length + (-1) ? i10 + 1 : i15;
                i11 = i10;
            }
            i10++;
        }
        i11 = i11 == 0 ? length : i11;
        i12 = i12 == 0 ? length : i12;
        this.f134099b = e(str.substring(i14, i11), true);
        String strE = e(str.substring(i15, i12), false);
        this.f134098a = strE;
        if (strE.length() + this.f134099b.length() > length) {
            this.f134098a = null;
        }
    }

    private String e(String str, boolean z10) {
        boolean z11;
        boolean z12;
        int length = str.length();
        int i10 = 0;
        do {
            int i11 = length - 1;
            z11 = true;
            if (str.charAt(i11) == ')' || ((str.charAt(i11) == '>' && z10) || ((str.charAt(i11) == '\"' && str.charAt(length - 2) != '\\') || str.charAt(i11) <= ' '))) {
                length--;
                z12 = true;
            } else {
                z12 = false;
            }
            if (str.charAt(i10) == '(' || ((str.charAt(i10) == '<' && z10) || str.charAt(i10) == '\"' || str.charAt(i10) <= ' ')) {
                i10++;
            } else {
                z11 = z12;
            }
        } while (z11);
        return str.substring(i10, length);
    }

    public String a() {
        return this.f134099b;
    }

    public String b() {
        return this.f134098a;
    }

    public void c(String str) {
        this.f134099b = str;
    }

    public void d(String str) {
        this.f134098a = str;
    }

    public String toString() {
        if (this.f134098a == null) {
            return this.f134099b;
        }
        return this.f134098a + " <" + this.f134099b + ">";
    }
}
