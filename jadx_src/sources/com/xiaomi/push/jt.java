package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* JADX INFO: loaded from: classes4.dex */
public class jt implements jy<jt, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f871a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public jc f872a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f873a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f874a = new BitSet(2);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f875a = true;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f876b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f877c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f878d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public String f879e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public String f880f;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    public String f881g;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    public String f882h;

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    public String f883i;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final ko f870a = new ko("XmPushActionUnRegistration");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final kg f107741a = new kg("", (byte) 11, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final kg f107742b = new kg("", (byte) 12, 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final kg f107743c = new kg("", (byte) 11, 3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final kg f107744d = new kg("", (byte) 11, 4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final kg f107745e = new kg("", (byte) 11, 5);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final kg f107746f = new kg("", (byte) 11, 6);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final kg f107747g = new kg("", (byte) 11, 7);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final kg f107748h = new kg("", (byte) 11, 8);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final kg f107749i = new kg("", (byte) 11, 9);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final kg f107750j = new kg("", (byte) 11, 10);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final kg f107751k = new kg("", (byte) 2, 11);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final kg f107752l = new kg("", (byte) 10, 12);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(jt jtVar) {
        int iA;
        int iA2;
        int iA3;
        int iA4;
        int iA5;
        int iA6;
        int iA7;
        int iA8;
        int iA9;
        int iA10;
        int iA11;
        int iA12;
        if (!getClass().equals(jtVar.getClass())) {
            return getClass().getName().compareTo(jtVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m618a()).compareTo(Boolean.valueOf(jtVar.m618a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m618a() && (iA12 = jz.a(this.f873a, jtVar.f873a)) != 0) {
            return iA12;
        }
        int iCompareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(jtVar.b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (b() && (iA11 = jz.a(this.f872a, jtVar.f872a)) != 0) {
            return iA11;
        }
        int iCompareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(jtVar.c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (c() && (iA10 = jz.a(this.f876b, jtVar.f876b)) != 0) {
            return iA10;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jtVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iA9 = jz.a(this.f877c, jtVar.f877c)) != 0) {
            return iA9;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jtVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iA8 = jz.a(this.f878d, jtVar.f878d)) != 0) {
            return iA8;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jtVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iA7 = jz.a(this.f879e, jtVar.f879e)) != 0) {
            return iA7;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jtVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iA6 = jz.a(this.f880f, jtVar.f880f)) != 0) {
            return iA6;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jtVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iA5 = jz.a(this.f881g, jtVar.f881g)) != 0) {
            return iA5;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jtVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (i() && (iA4 = jz.a(this.f882h, jtVar.f882h)) != 0) {
            return iA4;
        }
        int iCompareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(jtVar.j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (j() && (iA3 = jz.a(this.f883i, jtVar.f883i)) != 0) {
            return iA3;
        }
        int iCompareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(jtVar.k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (k() && (iA2 = jz.a(this.f875a, jtVar.f875a)) != 0) {
            return iA2;
        }
        int iCompareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(jtVar.l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (!l() || (iA = jz.a(this.f871a, jtVar.f871a)) == 0) {
            return 0;
        }
        return iA;
    }

    public jt a(String str) {
        this.f876b = str;
        return this;
    }

    public void a() throws kk {
        if (this.f876b == null) {
            throw new kk("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f877c != null) {
            return;
        }
        throw new kk("Required field 'appId' was not present! Struct: " + toString());
    }

    @Override // com.xiaomi.push.jy
    public void a(kj kjVar) throws kk {
        kjVar.mo645a();
        while (true) {
            kg kgVarMo641a = kjVar.mo641a();
            byte b10 = kgVarMo641a.f107793a;
            if (b10 == 0) {
                kjVar.f();
                a();
                return;
            }
            switch (kgVarMo641a.f925a) {
                case 1:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f873a = kjVar.mo646a();
                    }
                    break;
                case 2:
                    if (b10 != 12) {
                        km.a(kjVar, b10);
                    } else {
                        jc jcVar = new jc();
                        this.f872a = jcVar;
                        jcVar.a(kjVar);
                    }
                    break;
                case 3:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f876b = kjVar.mo646a();
                    }
                    break;
                case 4:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f877c = kjVar.mo646a();
                    }
                    break;
                case 5:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f878d = kjVar.mo646a();
                    }
                    break;
                case 6:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f879e = kjVar.mo646a();
                    }
                    break;
                case 7:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f880f = kjVar.mo646a();
                    }
                    break;
                case 8:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f881g = kjVar.mo646a();
                    }
                    break;
                case 9:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f882h = kjVar.mo646a();
                    }
                    break;
                case 10:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f883i = kjVar.mo646a();
                    }
                    break;
                case 11:
                    if (b10 != 2) {
                        km.a(kjVar, b10);
                    } else {
                        this.f875a = kjVar.mo651a();
                        a(true);
                    }
                    break;
                case 12:
                    if (b10 != 10) {
                        km.a(kjVar, b10);
                    } else {
                        this.f871a = kjVar.mo640a();
                        b(true);
                    }
                    break;
                default:
                    km.a(kjVar, b10);
                    break;
            }
            kjVar.g();
        }
    }

    public void a(boolean z10) {
        this.f874a.set(0, z10);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m618a() {
        return this.f873a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m619a(jt jtVar) {
        if (jtVar == null) {
            return false;
        }
        boolean zM618a = m618a();
        boolean zM618a2 = jtVar.m618a();
        if ((zM618a || zM618a2) && !(zM618a && zM618a2 && this.f873a.equals(jtVar.f873a))) {
            return false;
        }
        boolean zB = b();
        boolean zB2 = jtVar.b();
        if ((zB || zB2) && !(zB && zB2 && this.f872a.m542a(jtVar.f872a))) {
            return false;
        }
        boolean zC = c();
        boolean zC2 = jtVar.c();
        if ((zC || zC2) && !(zC && zC2 && this.f876b.equals(jtVar.f876b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = jtVar.d();
        if ((zD || zD2) && !(zD && zD2 && this.f877c.equals(jtVar.f877c))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = jtVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.f878d.equals(jtVar.f878d))) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = jtVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f879e.equals(jtVar.f879e))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = jtVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f880f.equals(jtVar.f880f))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = jtVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f881g.equals(jtVar.f881g))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = jtVar.i();
        if ((zI || zI2) && !(zI && zI2 && this.f882h.equals(jtVar.f882h))) {
            return false;
        }
        boolean zJ = j();
        boolean zJ2 = jtVar.j();
        if ((zJ || zJ2) && !(zJ && zJ2 && this.f883i.equals(jtVar.f883i))) {
            return false;
        }
        boolean zK = k();
        boolean zK2 = jtVar.k();
        if ((zK || zK2) && !(zK && zK2 && this.f875a == jtVar.f875a)) {
            return false;
        }
        boolean zL = l();
        boolean zL2 = jtVar.l();
        if (zL || zL2) {
            return zL && zL2 && this.f871a == jtVar.f871a;
        }
        return true;
    }

    public jt b(String str) {
        this.f877c = str;
        return this;
    }

    @Override // com.xiaomi.push.jy
    public void b(kj kjVar) throws kk {
        a();
        kjVar.a(f870a);
        if (this.f873a != null && m618a()) {
            kjVar.a(f107741a);
            kjVar.a(this.f873a);
            kjVar.b();
        }
        if (this.f872a != null && b()) {
            kjVar.a(f107742b);
            this.f872a.b(kjVar);
            kjVar.b();
        }
        if (this.f876b != null) {
            kjVar.a(f107743c);
            kjVar.a(this.f876b);
            kjVar.b();
        }
        if (this.f877c != null) {
            kjVar.a(f107744d);
            kjVar.a(this.f877c);
            kjVar.b();
        }
        if (this.f878d != null && e()) {
            kjVar.a(f107745e);
            kjVar.a(this.f878d);
            kjVar.b();
        }
        if (this.f879e != null && f()) {
            kjVar.a(f107746f);
            kjVar.a(this.f879e);
            kjVar.b();
        }
        if (this.f880f != null && g()) {
            kjVar.a(f107747g);
            kjVar.a(this.f880f);
            kjVar.b();
        }
        if (this.f881g != null && h()) {
            kjVar.a(f107748h);
            kjVar.a(this.f881g);
            kjVar.b();
        }
        if (this.f882h != null && i()) {
            kjVar.a(f107749i);
            kjVar.a(this.f882h);
            kjVar.b();
        }
        if (this.f883i != null && j()) {
            kjVar.a(f107750j);
            kjVar.a(this.f883i);
            kjVar.b();
        }
        if (k()) {
            kjVar.a(f107751k);
            kjVar.a(this.f875a);
            kjVar.b();
        }
        if (l()) {
            kjVar.a(f107752l);
            kjVar.a(this.f871a);
            kjVar.b();
        }
        kjVar.c();
        kjVar.mo649a();
    }

    public void b(boolean z10) {
        this.f874a.set(1, z10);
    }

    public boolean b() {
        return this.f872a != null;
    }

    public jt c(String str) {
        this.f878d = str;
        return this;
    }

    public boolean c() {
        return this.f876b != null;
    }

    public jt d(String str) {
        this.f880f = str;
        return this;
    }

    public boolean d() {
        return this.f877c != null;
    }

    public jt e(String str) {
        this.f881g = str;
        return this;
    }

    public boolean e() {
        return this.f878d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jt)) {
            return m619a((jt) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f879e != null;
    }

    public boolean g() {
        return this.f880f != null;
    }

    public boolean h() {
        return this.f881g != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f882h != null;
    }

    public boolean j() {
        return this.f883i != null;
    }

    public boolean k() {
        return this.f874a.get(0);
    }

    public boolean l() {
        return this.f874a.get(1);
    }

    public String toString() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("XmPushActionUnRegistration(");
        boolean z11 = false;
        if (m618a()) {
            sb2.append("debug:");
            String str = this.f873a;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            z10 = false;
        } else {
            z10 = true;
        }
        if (b()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append("target:");
            jc jcVar = this.f872a;
            if (jcVar == null) {
                sb2.append("null");
            } else {
                sb2.append(jcVar);
            }
        } else {
            z11 = z10;
        }
        if (!z11) {
            sb2.append(", ");
        }
        sb2.append("id:");
        String str2 = this.f876b;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(", ");
        sb2.append("appId:");
        String str3 = this.f877c;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        if (e()) {
            sb2.append(", ");
            sb2.append("regId:");
            String str4 = this.f878d;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (f()) {
            sb2.append(", ");
            sb2.append("appVersion:");
            String str5 = this.f879e;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (g()) {
            sb2.append(", ");
            sb2.append("packageName:");
            String str6 = this.f880f;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
        }
        if (h()) {
            sb2.append(", ");
            sb2.append("token:");
            String str7 = this.f881g;
            if (str7 == null) {
                sb2.append("null");
            } else {
                sb2.append(str7);
            }
        }
        if (i()) {
            sb2.append(", ");
            sb2.append("deviceId:");
            String str8 = this.f882h;
            if (str8 == null) {
                sb2.append("null");
            } else {
                sb2.append(str8);
            }
        }
        if (j()) {
            sb2.append(", ");
            sb2.append("aliasName:");
            String str9 = this.f883i;
            if (str9 == null) {
                sb2.append("null");
            } else {
                sb2.append(str9);
            }
        }
        if (k()) {
            sb2.append(", ");
            sb2.append("needAck:");
            sb2.append(this.f875a);
        }
        if (l()) {
            sb2.append(", ");
            sb2.append("createdTs:");
            sb2.append(this.f871a);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
