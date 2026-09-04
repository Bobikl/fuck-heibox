package androidx.constraintlayout.core.parser;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: CLContainer.java */
/* JADX INFO: loaded from: classes.dex */
public class b extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ArrayList<c> f18065i;

    public b(char[] cArr) {
        super(cArr);
        this.f18065i = new ArrayList<>();
    }

    public static c D(char[] cArr) {
        return new b(cArr);
    }

    public void B(c cVar) {
        this.f18065i.add(cVar);
        if (CLParser.f18051d) {
            System.out.println("added element " + cVar + " to " + this);
        }
    }

    public c E(int i10) throws CLParsingException {
        if (i10 >= 0 && i10 < this.f18065i.size()) {
            return this.f18065i.get(i10);
        }
        throw new CLParsingException("no element at index " + i10, this);
    }

    public c F(String str) throws CLParsingException {
        Iterator<c> it = this.f18065i.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.b().equals(str)) {
                return dVar.n0();
            }
        }
        throw new CLParsingException("no element for key <" + str + ">", this);
    }

    public a G(int i10) throws CLParsingException {
        c cVarE = E(i10);
        if (cVarE instanceof a) {
            return (a) cVarE;
        }
        throw new CLParsingException("no array at index " + i10, this);
    }

    public a H(String str) throws CLParsingException {
        c cVarF = F(str);
        if (cVarF instanceof a) {
            return (a) cVarF;
        }
        throw new CLParsingException("no array found for key <" + str + ">, found [" + cVarF.o() + "] : " + cVarF, this);
    }

    public a I(String str) {
        c cVarV = V(str);
        if (cVarV instanceof a) {
            return (a) cVarV;
        }
        return null;
    }

    public boolean J(String str) throws CLParsingException {
        c cVarF = F(str);
        if (cVarF instanceof CLToken) {
            return ((CLToken) cVarF).D();
        }
        throw new CLParsingException("no boolean found for key <" + str + ">, found [" + cVarF.o() + "] : " + cVarF, this);
    }

    public float L(String str) throws CLParsingException {
        c cVarF = F(str);
        if (cVarF != null) {
            return cVarF.i();
        }
        throw new CLParsingException("no float found for key <" + str + ">, found [" + cVarF.o() + "] : " + cVarF, this);
    }

    public float N(String str) {
        c cVarV = V(str);
        if (cVarV instanceof e) {
            return cVarV.i();
        }
        return Float.NaN;
    }

    public int Q(String str) throws CLParsingException {
        c cVarF = F(str);
        if (cVarF != null) {
            return cVarF.j();
        }
        throw new CLParsingException("no int found for key <" + str + ">, found [" + cVarF.o() + "] : " + cVarF, this);
    }

    public f R(int i10) throws CLParsingException {
        c cVarE = E(i10);
        if (cVarE instanceof f) {
            return (f) cVarE;
        }
        throw new CLParsingException("no object at index " + i10, this);
    }

    public f S(String str) throws CLParsingException {
        c cVarF = F(str);
        if (cVarF instanceof f) {
            return (f) cVarF;
        }
        throw new CLParsingException("no object found for key <" + str + ">, found [" + cVarF.o() + "] : " + cVarF, this);
    }

    public f T(String str) {
        c cVarV = V(str);
        if (cVarV instanceof f) {
            return (f) cVarV;
        }
        return null;
    }

    public c U(int i10) {
        if (i10 < 0 || i10 >= this.f18065i.size()) {
            return null;
        }
        return this.f18065i.get(i10);
    }

    public c V(String str) {
        Iterator<c> it = this.f18065i.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.b().equals(str)) {
                return dVar.n0();
            }
        }
        return null;
    }

    public String W(int i10) throws CLParsingException {
        c cVarE = E(i10);
        if (cVarE instanceof g) {
            return cVarE.b();
        }
        throw new CLParsingException("no string at index " + i10, this);
    }

    public String X(String str) throws CLParsingException {
        c cVarF = F(str);
        if (cVarF instanceof g) {
            return cVarF.b();
        }
        throw new CLParsingException("no string found for key <" + str + ">, found [" + (cVarF != null ? cVarF.o() : null) + "] : " + cVarF, this);
    }

    public String Y(int i10) {
        c cVarU = U(i10);
        if (cVarU instanceof g) {
            return cVarU.b();
        }
        return null;
    }

    public String Z(String str) {
        c cVarV = V(str);
        if (cVarV instanceof g) {
            return cVarV.b();
        }
        return null;
    }

    public boolean a0(String str) {
        for (c cVar : this.f18065i) {
            if ((cVar instanceof d) && ((d) cVar).b().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<String> b0() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (c cVar : this.f18065i) {
            if (cVar instanceof d) {
                arrayList.add(((d) cVar).b());
            }
        }
        return arrayList;
    }

    public void d0(String str, c cVar) {
        Iterator<c> it = this.f18065i.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.b().equals(str)) {
                dVar.q0(cVar);
                return;
            }
        }
        this.f18065i.add((d) d.k0(str, cVar));
    }

    public boolean getBoolean(int i10) throws CLParsingException {
        c cVarE = E(i10);
        if (cVarE instanceof CLToken) {
            return ((CLToken) cVarE).D();
        }
        throw new CLParsingException("no boolean at index " + i10, this);
    }

    public float getFloat(int i10) throws CLParsingException {
        c cVarE = E(i10);
        if (cVarE != null) {
            return cVarE.i();
        }
        throw new CLParsingException("no float at index " + i10, this);
    }

    public int getInt(int i10) throws CLParsingException {
        c cVarE = E(i10);
        if (cVarE != null) {
            return cVarE.j();
        }
        throw new CLParsingException("no int at index " + i10, this);
    }

    public void h0(String str, float f10) {
        d0(str, new e(f10));
    }

    public void i0(String str) {
        ArrayList arrayList = new ArrayList();
        for (c cVar : this.f18065i) {
            if (((d) cVar).b().equals(str)) {
                arrayList.add(cVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f18065i.remove((c) it.next());
        }
    }

    public int size() {
        return this.f18065i.size();
    }

    @Override // androidx.constraintlayout.core.parser.c
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (c cVar : this.f18065i) {
            if (sb2.length() > 0) {
                sb2.append("; ");
            }
            sb2.append(cVar);
        }
        return super.toString() + " = <" + ((Object) sb2) + " >";
    }
}
