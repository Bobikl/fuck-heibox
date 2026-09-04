package androidx.constraintlayout.core.parser;

import java.util.ArrayList;

/* JADX INFO: compiled from: CLKey.java */
/* JADX INFO: loaded from: classes.dex */
public class d extends b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static ArrayList<String> f18073j;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        f18073j = arrayList;
        arrayList.add("ConstraintSets");
        f18073j.add("Variables");
        f18073j.add("Generate");
        f18073j.add("Transitions");
        f18073j.add("KeyFrames");
        f18073j.add("KeyAttributes");
        f18073j.add("KeyPositions");
        f18073j.add("KeyCycles");
    }

    public d(char[] cArr) {
        super(cArr);
    }

    public static c D(char[] cArr) {
        return new d(cArr);
    }

    public static c k0(String str, c cVar) {
        d dVar = new d(str.toCharArray());
        dVar.x(0L);
        dVar.v(str.length() - 1);
        dVar.q0(cVar);
        return dVar;
    }

    @Override // androidx.constraintlayout.core.parser.c
    protected String A() {
        if (this.f18065i.size() <= 0) {
            return g() + b() + ": <> ";
        }
        return g() + b() + ": " + this.f18065i.get(0).A();
    }

    public String l0() {
        return b();
    }

    public c n0() {
        if (this.f18065i.size() > 0) {
            return this.f18065i.get(0);
        }
        return null;
    }

    public void q0(c cVar) {
        if (this.f18065i.size() > 0) {
            this.f18065i.set(0, cVar);
        } else {
            this.f18065i.add(cVar);
        }
    }

    @Override // androidx.constraintlayout.core.parser.c
    protected String y(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder(g());
        a(sb2, i10);
        String strB = b();
        if (this.f18065i.size() <= 0) {
            return strB + ": <> ";
        }
        sb2.append(strB);
        sb2.append(": ");
        if (f18073j.contains(strB)) {
            i11 = 3;
        }
        if (i11 > 0) {
            sb2.append(this.f18065i.get(0).y(i10, i11 - 1));
        } else {
            String strA = this.f18065i.get(0).A();
            if (strA.length() + i10 < c.f18066g) {
                sb2.append(strA);
            } else {
                sb2.append(this.f18065i.get(0).y(i10, i11 - 1));
            }
        }
        return sb2.toString();
    }
}
