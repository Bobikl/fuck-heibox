package androidx.constraintlayout.core.parser;

import com.meituan.robust.Constants;

/* JADX INFO: compiled from: CLArray.java */
/* JADX INFO: loaded from: classes.dex */
public class a extends b {
    public a(char[] cArr) {
        super(cArr);
    }

    public static c D(char[] cArr) {
        return new a(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.c
    protected String A() {
        StringBuilder sb2 = new StringBuilder(g() + Constants.ARRAY_TYPE);
        boolean z10 = true;
        for (int i10 = 0; i10 < this.f18065i.size(); i10++) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(this.f18065i.get(i10).A());
        }
        return ((Object) sb2) + "]";
    }

    @Override // androidx.constraintlayout.core.parser.c
    protected String y(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        String strA = A();
        if (i11 > 0 || strA.length() + i10 >= c.f18066g) {
            sb2.append("[\n");
            boolean z10 = true;
            for (c cVar : this.f18065i) {
                if (z10) {
                    z10 = false;
                } else {
                    sb2.append(",\n");
                }
                a(sb2, c.f18067h + i10);
                sb2.append(cVar.y(c.f18067h + i10, i11 - 1));
            }
            sb2.append("\n");
            a(sb2, i10);
            sb2.append("]");
        } else {
            sb2.append(strA);
        }
        return sb2.toString();
    }
}
