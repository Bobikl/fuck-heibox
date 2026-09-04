package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* JADX INFO: loaded from: classes4.dex */
public class iz implements jy<iz, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f634a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public ja f635a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public jc f636a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f637a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f638a = new BitSet(4);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f639a = false;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public long f640b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f641b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public long f642c;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f643c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f644d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public String f645e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public String f646f;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    public String f647g;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    public String f648h;

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    public String f649i;

    /* JADX INFO: renamed from: j, reason: collision with other field name */
    public String f650j;

    /* JADX INFO: renamed from: k, reason: collision with other field name */
    public String f651k;

    /* JADX INFO: renamed from: l, reason: collision with other field name */
    public String f652l;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final ko f633a = new ko("PushMessage");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final kg f107539a = new kg("", (byte) 12, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final kg f107540b = new kg("", (byte) 11, 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final kg f107541c = new kg("", (byte) 11, 3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final kg f107542d = new kg("", (byte) 11, 4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final kg f107543e = new kg("", (byte) 10, 5);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final kg f107544f = new kg("", (byte) 10, 6);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final kg f107545g = new kg("", (byte) 11, 7);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final kg f107546h = new kg("", (byte) 11, 8);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final kg f107547i = new kg("", (byte) 11, 9);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final kg f107548j = new kg("", (byte) 11, 10);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final kg f107549k = new kg("", (byte) 11, 11);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final kg f107550l = new kg("", (byte) 12, 12);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final kg f107551m = new kg("", (byte) 11, 13);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final kg f107552n = new kg("", (byte) 2, 14);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final kg f107553o = new kg("", (byte) 11, 15);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final kg f107554p = new kg("", (byte) 10, 16);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final kg f107555q = new kg("", (byte) 11, 20);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final kg f107556r = new kg("", (byte) 11, 21);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(iz izVar) {
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
        int iA13;
        int iA14;
        int iA15;
        int iA16;
        int iA17;
        int iA18;
        if (!getClass().equals(izVar.getClass())) {
            return getClass().getName().compareTo(izVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m513a()).compareTo(Boolean.valueOf(izVar.m513a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m513a() && (iA18 = jz.a(this.f636a, izVar.f636a)) != 0) {
            return iA18;
        }
        int iCompareTo2 = Boolean.valueOf(m515b()).compareTo(Boolean.valueOf(izVar.m515b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m515b() && (iA17 = jz.a(this.f637a, izVar.f637a)) != 0) {
            return iA17;
        }
        int iCompareTo3 = Boolean.valueOf(m516c()).compareTo(Boolean.valueOf(izVar.m516c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m516c() && (iA16 = jz.a(this.f641b, izVar.f641b)) != 0) {
            return iA16;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(izVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iA15 = jz.a(this.f643c, izVar.f643c)) != 0) {
            return iA15;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(izVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iA14 = jz.a(this.f634a, izVar.f634a)) != 0) {
            return iA14;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(izVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iA13 = jz.a(this.f640b, izVar.f640b)) != 0) {
            return iA13;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(izVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iA12 = jz.a(this.f644d, izVar.f644d)) != 0) {
            return iA12;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(izVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iA11 = jz.a(this.f645e, izVar.f645e)) != 0) {
            return iA11;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(izVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (i() && (iA10 = jz.a(this.f646f, izVar.f646f)) != 0) {
            return iA10;
        }
        int iCompareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(izVar.j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (j() && (iA9 = jz.a(this.f647g, izVar.f647g)) != 0) {
            return iA9;
        }
        int iCompareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(izVar.k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (k() && (iA8 = jz.a(this.f648h, izVar.f648h)) != 0) {
            return iA8;
        }
        int iCompareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(izVar.l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (l() && (iA7 = jz.a(this.f635a, izVar.f635a)) != 0) {
            return iA7;
        }
        int iCompareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(izVar.m()));
        if (iCompareTo13 != 0) {
            return iCompareTo13;
        }
        if (m() && (iA6 = jz.a(this.f649i, izVar.f649i)) != 0) {
            return iA6;
        }
        int iCompareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(izVar.n()));
        if (iCompareTo14 != 0) {
            return iCompareTo14;
        }
        if (n() && (iA5 = jz.a(this.f639a, izVar.f639a)) != 0) {
            return iA5;
        }
        int iCompareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(izVar.o()));
        if (iCompareTo15 != 0) {
            return iCompareTo15;
        }
        if (o() && (iA4 = jz.a(this.f650j, izVar.f650j)) != 0) {
            return iA4;
        }
        int iCompareTo16 = Boolean.valueOf(p()).compareTo(Boolean.valueOf(izVar.p()));
        if (iCompareTo16 != 0) {
            return iCompareTo16;
        }
        if (p() && (iA3 = jz.a(this.f642c, izVar.f642c)) != 0) {
            return iA3;
        }
        int iCompareTo17 = Boolean.valueOf(q()).compareTo(Boolean.valueOf(izVar.q()));
        if (iCompareTo17 != 0) {
            return iCompareTo17;
        }
        if (q() && (iA2 = jz.a(this.f651k, izVar.f651k)) != 0) {
            return iA2;
        }
        int iCompareTo18 = Boolean.valueOf(r()).compareTo(Boolean.valueOf(izVar.r()));
        if (iCompareTo18 != 0) {
            return iCompareTo18;
        }
        if (!r() || (iA = jz.a(this.f652l, izVar.f652l)) == 0) {
            return 0;
        }
        return iA;
    }

    public long a() {
        return this.f634a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m511a() {
        return this.f637a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m512a() throws kk {
        if (this.f637a == null) {
            throw new kk("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f641b == null) {
            throw new kk("Required field 'appId' was not present! Struct: " + toString());
        }
        if (this.f643c != null) {
            return;
        }
        throw new kk("Required field 'payload' was not present! Struct: " + toString());
    }

    @Override // com.xiaomi.push.jy
    public void a(kj kjVar) throws kk {
        kjVar.mo645a();
        while (true) {
            kg kgVarMo641a = kjVar.mo641a();
            byte b10 = kgVarMo641a.f107793a;
            if (b10 == 0) {
                kjVar.f();
                m512a();
                return;
            }
            short s10 = kgVarMo641a.f925a;
            if (s10 != 20) {
                if (s10 != 21) {
                    switch (s10) {
                        case 1:
                            if (b10 != 12) {
                                km.a(kjVar, b10);
                            } else {
                                jc jcVar = new jc();
                                this.f636a = jcVar;
                                jcVar.a(kjVar);
                            }
                            break;
                        case 2:
                            if (b10 != 11) {
                                km.a(kjVar, b10);
                            } else {
                                this.f637a = kjVar.mo646a();
                            }
                            break;
                        case 3:
                            if (b10 != 11) {
                                km.a(kjVar, b10);
                            } else {
                                this.f641b = kjVar.mo646a();
                            }
                            break;
                        case 4:
                            if (b10 != 11) {
                                km.a(kjVar, b10);
                            } else {
                                this.f643c = kjVar.mo646a();
                            }
                            break;
                        case 5:
                            if (b10 != 10) {
                                km.a(kjVar, b10);
                            } else {
                                this.f634a = kjVar.mo640a();
                                a(true);
                            }
                            break;
                        case 6:
                            if (b10 != 10) {
                                km.a(kjVar, b10);
                            } else {
                                this.f640b = kjVar.mo640a();
                                b(true);
                            }
                            break;
                        case 7:
                            if (b10 != 11) {
                                km.a(kjVar, b10);
                            } else {
                                this.f644d = kjVar.mo646a();
                            }
                            break;
                        case 8:
                            if (b10 != 11) {
                                km.a(kjVar, b10);
                            } else {
                                this.f645e = kjVar.mo646a();
                            }
                            break;
                        case 9:
                            if (b10 != 11) {
                                km.a(kjVar, b10);
                            } else {
                                this.f646f = kjVar.mo646a();
                            }
                            break;
                        case 10:
                            if (b10 != 11) {
                                km.a(kjVar, b10);
                            } else {
                                this.f647g = kjVar.mo646a();
                            }
                            break;
                        case 11:
                            if (b10 != 11) {
                                km.a(kjVar, b10);
                            } else {
                                this.f648h = kjVar.mo646a();
                            }
                            break;
                        case 12:
                            if (b10 != 12) {
                                km.a(kjVar, b10);
                            } else {
                                ja jaVar = new ja();
                                this.f635a = jaVar;
                                jaVar.a(kjVar);
                            }
                            break;
                        case 13:
                            if (b10 != 11) {
                                km.a(kjVar, b10);
                            } else {
                                this.f649i = kjVar.mo646a();
                            }
                            break;
                        case 14:
                            if (b10 != 2) {
                                km.a(kjVar, b10);
                            } else {
                                this.f639a = kjVar.mo651a();
                                c(true);
                            }
                            break;
                        case 15:
                            if (b10 != 11) {
                                km.a(kjVar, b10);
                            } else {
                                this.f650j = kjVar.mo646a();
                            }
                            break;
                        case 16:
                            if (b10 != 10) {
                                km.a(kjVar, b10);
                            } else {
                                this.f642c = kjVar.mo640a();
                                d(true);
                            }
                            break;
                        default:
                            km.a(kjVar, b10);
                            break;
                    }
                } else if (b10 == 11) {
                    this.f652l = kjVar.mo646a();
                } else {
                    km.a(kjVar, b10);
                }
            } else if (b10 == 11) {
                this.f651k = kjVar.mo646a();
            } else {
                km.a(kjVar, b10);
            }
            kjVar.g();
        }
    }

    public void a(boolean z10) {
        this.f638a.set(0, z10);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m513a() {
        return this.f636a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m514a(iz izVar) {
        if (izVar == null) {
            return false;
        }
        boolean zM513a = m513a();
        boolean zM513a2 = izVar.m513a();
        if ((zM513a || zM513a2) && !(zM513a && zM513a2 && this.f636a.m542a(izVar.f636a))) {
            return false;
        }
        boolean zM515b = m515b();
        boolean zM515b2 = izVar.m515b();
        if ((zM515b || zM515b2) && !(zM515b && zM515b2 && this.f637a.equals(izVar.f637a))) {
            return false;
        }
        boolean zM516c = m516c();
        boolean zM516c2 = izVar.m516c();
        if ((zM516c || zM516c2) && !(zM516c && zM516c2 && this.f641b.equals(izVar.f641b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = izVar.d();
        if ((zD || zD2) && !(zD && zD2 && this.f643c.equals(izVar.f643c))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = izVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.f634a == izVar.f634a)) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = izVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f640b == izVar.f640b)) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = izVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f644d.equals(izVar.f644d))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = izVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f645e.equals(izVar.f645e))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = izVar.i();
        if ((zI || zI2) && !(zI && zI2 && this.f646f.equals(izVar.f646f))) {
            return false;
        }
        boolean zJ = j();
        boolean zJ2 = izVar.j();
        if ((zJ || zJ2) && !(zJ && zJ2 && this.f647g.equals(izVar.f647g))) {
            return false;
        }
        boolean zK = k();
        boolean zK2 = izVar.k();
        if ((zK || zK2) && !(zK && zK2 && this.f648h.equals(izVar.f648h))) {
            return false;
        }
        boolean zL = l();
        boolean zL2 = izVar.l();
        if ((zL || zL2) && !(zL && zL2 && this.f635a.m534a(izVar.f635a))) {
            return false;
        }
        boolean zM = m();
        boolean zM2 = izVar.m();
        if ((zM || zM2) && !(zM && zM2 && this.f649i.equals(izVar.f649i))) {
            return false;
        }
        boolean zN = n();
        boolean zN2 = izVar.n();
        if ((zN || zN2) && !(zN && zN2 && this.f639a == izVar.f639a)) {
            return false;
        }
        boolean zO = o();
        boolean zO2 = izVar.o();
        if ((zO || zO2) && !(zO && zO2 && this.f650j.equals(izVar.f650j))) {
            return false;
        }
        boolean zP = p();
        boolean zP2 = izVar.p();
        if ((zP || zP2) && !(zP && zP2 && this.f642c == izVar.f642c)) {
            return false;
        }
        boolean zQ = q();
        boolean zQ2 = izVar.q();
        if ((zQ || zQ2) && !(zQ && zQ2 && this.f651k.equals(izVar.f651k))) {
            return false;
        }
        boolean zR = r();
        boolean zR2 = izVar.r();
        if (zR || zR2) {
            return zR && zR2 && this.f652l.equals(izVar.f652l);
        }
        return true;
    }

    public String b() {
        return this.f641b;
    }

    @Override // com.xiaomi.push.jy
    public void b(kj kjVar) throws kk {
        m512a();
        kjVar.a(f633a);
        if (this.f636a != null && m513a()) {
            kjVar.a(f107539a);
            this.f636a.b(kjVar);
            kjVar.b();
        }
        if (this.f637a != null) {
            kjVar.a(f107540b);
            kjVar.a(this.f637a);
            kjVar.b();
        }
        if (this.f641b != null) {
            kjVar.a(f107541c);
            kjVar.a(this.f641b);
            kjVar.b();
        }
        if (this.f643c != null) {
            kjVar.a(f107542d);
            kjVar.a(this.f643c);
            kjVar.b();
        }
        if (e()) {
            kjVar.a(f107543e);
            kjVar.a(this.f634a);
            kjVar.b();
        }
        if (f()) {
            kjVar.a(f107544f);
            kjVar.a(this.f640b);
            kjVar.b();
        }
        if (this.f644d != null && g()) {
            kjVar.a(f107545g);
            kjVar.a(this.f644d);
            kjVar.b();
        }
        if (this.f645e != null && h()) {
            kjVar.a(f107546h);
            kjVar.a(this.f645e);
            kjVar.b();
        }
        if (this.f646f != null && i()) {
            kjVar.a(f107547i);
            kjVar.a(this.f646f);
            kjVar.b();
        }
        if (this.f647g != null && j()) {
            kjVar.a(f107548j);
            kjVar.a(this.f647g);
            kjVar.b();
        }
        if (this.f648h != null && k()) {
            kjVar.a(f107549k);
            kjVar.a(this.f648h);
            kjVar.b();
        }
        if (this.f635a != null && l()) {
            kjVar.a(f107550l);
            this.f635a.b(kjVar);
            kjVar.b();
        }
        if (this.f649i != null && m()) {
            kjVar.a(f107551m);
            kjVar.a(this.f649i);
            kjVar.b();
        }
        if (n()) {
            kjVar.a(f107552n);
            kjVar.a(this.f639a);
            kjVar.b();
        }
        if (this.f650j != null && o()) {
            kjVar.a(f107553o);
            kjVar.a(this.f650j);
            kjVar.b();
        }
        if (p()) {
            kjVar.a(f107554p);
            kjVar.a(this.f642c);
            kjVar.b();
        }
        if (this.f651k != null && q()) {
            kjVar.a(f107555q);
            kjVar.a(this.f651k);
            kjVar.b();
        }
        if (this.f652l != null && r()) {
            kjVar.a(f107556r);
            kjVar.a(this.f652l);
            kjVar.b();
        }
        kjVar.c();
        kjVar.mo649a();
    }

    public void b(boolean z10) {
        this.f638a.set(1, z10);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m515b() {
        return this.f637a != null;
    }

    public String c() {
        return this.f643c;
    }

    public void c(boolean z10) {
        this.f638a.set(2, z10);
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m516c() {
        return this.f641b != null;
    }

    public void d(boolean z10) {
        this.f638a.set(3, z10);
    }

    public boolean d() {
        return this.f643c != null;
    }

    public boolean e() {
        return this.f638a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof iz)) {
            return m514a((iz) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f638a.get(1);
    }

    public boolean g() {
        return this.f644d != null;
    }

    public boolean h() {
        return this.f645e != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f646f != null;
    }

    public boolean j() {
        return this.f647g != null;
    }

    public boolean k() {
        return this.f648h != null;
    }

    public boolean l() {
        return this.f635a != null;
    }

    public boolean m() {
        return this.f649i != null;
    }

    public boolean n() {
        return this.f638a.get(2);
    }

    public boolean o() {
        return this.f650j != null;
    }

    public boolean p() {
        return this.f638a.get(3);
    }

    public boolean q() {
        return this.f651k != null;
    }

    public boolean r() {
        return this.f652l != null;
    }

    public String toString() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("PushMessage(");
        if (m513a()) {
            sb2.append("to:");
            jc jcVar = this.f636a;
            if (jcVar == null) {
                sb2.append("null");
            } else {
                sb2.append(jcVar);
            }
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            sb2.append(", ");
        }
        sb2.append("id:");
        String str = this.f637a;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(", ");
        sb2.append("appId:");
        String str2 = this.f641b;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(", ");
        sb2.append("payload:");
        String str3 = this.f643c;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        if (e()) {
            sb2.append(", ");
            sb2.append("createAt:");
            sb2.append(this.f634a);
        }
        if (f()) {
            sb2.append(", ");
            sb2.append("ttl:");
            sb2.append(this.f640b);
        }
        if (g()) {
            sb2.append(", ");
            sb2.append("collapseKey:");
            String str4 = this.f644d;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (h()) {
            sb2.append(", ");
            sb2.append("packageName:");
            String str5 = this.f645e;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (i()) {
            sb2.append(", ");
            sb2.append("regId:");
            String str6 = this.f646f;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
        }
        if (j()) {
            sb2.append(", ");
            sb2.append("category:");
            String str7 = this.f647g;
            if (str7 == null) {
                sb2.append("null");
            } else {
                sb2.append(str7);
            }
        }
        if (k()) {
            sb2.append(", ");
            sb2.append("topic:");
            String str8 = this.f648h;
            if (str8 == null) {
                sb2.append("null");
            } else {
                sb2.append(str8);
            }
        }
        if (l()) {
            sb2.append(", ");
            sb2.append("metaInfo:");
            ja jaVar = this.f635a;
            if (jaVar == null) {
                sb2.append("null");
            } else {
                sb2.append(jaVar);
            }
        }
        if (m()) {
            sb2.append(", ");
            sb2.append("aliasName:");
            String str9 = this.f649i;
            if (str9 == null) {
                sb2.append("null");
            } else {
                sb2.append(str9);
            }
        }
        if (n()) {
            sb2.append(", ");
            sb2.append("isOnline:");
            sb2.append(this.f639a);
        }
        if (o()) {
            sb2.append(", ");
            sb2.append("userAccount:");
            String str10 = this.f650j;
            if (str10 == null) {
                sb2.append("null");
            } else {
                sb2.append(str10);
            }
        }
        if (p()) {
            sb2.append(", ");
            sb2.append("miid:");
            sb2.append(this.f642c);
        }
        if (q()) {
            sb2.append(", ");
            sb2.append("imeiMd5:");
            String str11 = this.f651k;
            if (str11 == null) {
                sb2.append("null");
            } else {
                sb2.append(str11);
            }
        }
        if (r()) {
            sb2.append(", ");
            sb2.append("deviceId:");
            String str12 = this.f652l;
            if (str12 == null) {
                sb2.append("null");
            } else {
                sb2.append(str12);
            }
        }
        sb2.append(")");
        return sb2.toString();
    }
}
