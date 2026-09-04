package androidx.constraintlayout.core.parser;

/* JADX INFO: compiled from: CLString.java */
/* JADX INFO: loaded from: classes.dex */
public class g extends c {
    public g(char[] cArr) {
        super(cArr);
    }

    public static c B(char[] cArr) {
        return new g(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.c
    protected String A() {
        return "'" + b() + "'";
    }

    @Override // androidx.constraintlayout.core.parser.c
    protected String y(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        a(sb2, i10);
        sb2.append("'");
        sb2.append(b());
        sb2.append("'");
        return sb2.toString();
    }
}
