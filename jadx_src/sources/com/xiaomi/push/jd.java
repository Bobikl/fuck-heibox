package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class jd implements jy<jd, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f680a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f681a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public jc f682a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public jq f683a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f684a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public Map<String, String> f686a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public short f687a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f689b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public short f690b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f691c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f692d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public String f693e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public String f694f;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    public String f695g;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    public String f696h;

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    public String f697i;

    /* JADX INFO: renamed from: j, reason: collision with other field name */
    public String f698j;

    /* JADX INFO: renamed from: k, reason: collision with other field name */
    public String f699k;

    /* JADX INFO: renamed from: l, reason: collision with other field name */
    public String f700l;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final ko f679a = new ko("XmPushActionAckMessage");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final kg f107581a = new kg("", (byte) 11, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final kg f107582b = new kg("", (byte) 12, 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final kg f107583c = new kg("", (byte) 11, 3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final kg f107584d = new kg("", (byte) 11, 4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final kg f107585e = new kg("", (byte) 10, 5);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final kg f107586f = new kg("", (byte) 11, 6);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final kg f107587g = new kg("", (byte) 11, 7);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final kg f107588h = new kg("", (byte) 12, 8);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final kg f107589i = new kg("", (byte) 11, 9);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final kg f107590j = new kg("", (byte) 11, 10);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final kg f107591k = new kg("", (byte) 2, 11);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final kg f107592l = new kg("", (byte) 11, 12);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final kg f107593m = new kg("", (byte) 11, 13);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final kg f107594n = new kg("", (byte) 11, 14);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final kg f107595o = new kg("", (byte) 6, 15);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final kg f107596p = new kg("", (byte) 6, 16);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final kg f107597q = new kg("", (byte) 11, 20);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final kg f107598r = new kg("", (byte) 11, 21);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final kg f107599s = new kg("", (byte) 8, 22);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final kg f107600t = new kg("", (byte) 13, 23);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f685a = new BitSet(5);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f688a = false;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(jd jdVar) {
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
        int iA19;
        int iA20;
        if (!getClass().equals(jdVar.getClass())) {
            return getClass().getName().compareTo(jdVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m543a()).compareTo(Boolean.valueOf(jdVar.m543a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m543a() && (iA20 = jz.a(this.f684a, jdVar.f684a)) != 0) {
            return iA20;
        }
        int iCompareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(jdVar.b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (b() && (iA19 = jz.a(this.f682a, jdVar.f682a)) != 0) {
            return iA19;
        }
        int iCompareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(jdVar.c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (c() && (iA18 = jz.a(this.f689b, jdVar.f689b)) != 0) {
            return iA18;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jdVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iA17 = jz.a(this.f691c, jdVar.f691c)) != 0) {
            return iA17;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jdVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iA16 = jz.a(this.f681a, jdVar.f681a)) != 0) {
            return iA16;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jdVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iA15 = jz.a(this.f692d, jdVar.f692d)) != 0) {
            return iA15;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jdVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iA14 = jz.a(this.f693e, jdVar.f693e)) != 0) {
            return iA14;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jdVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iA13 = jz.a(this.f683a, jdVar.f683a)) != 0) {
            return iA13;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jdVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (i() && (iA12 = jz.a(this.f694f, jdVar.f694f)) != 0) {
            return iA12;
        }
        int iCompareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(jdVar.j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (j() && (iA11 = jz.a(this.f695g, jdVar.f695g)) != 0) {
            return iA11;
        }
        int iCompareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(jdVar.k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (k() && (iA10 = jz.a(this.f688a, jdVar.f688a)) != 0) {
            return iA10;
        }
        int iCompareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(jdVar.l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (l() && (iA9 = jz.a(this.f696h, jdVar.f696h)) != 0) {
            return iA9;
        }
        int iCompareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(jdVar.m()));
        if (iCompareTo13 != 0) {
            return iCompareTo13;
        }
        if (m() && (iA8 = jz.a(this.f697i, jdVar.f697i)) != 0) {
            return iA8;
        }
        int iCompareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(jdVar.n()));
        if (iCompareTo14 != 0) {
            return iCompareTo14;
        }
        if (n() && (iA7 = jz.a(this.f698j, jdVar.f698j)) != 0) {
            return iA7;
        }
        int iCompareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(jdVar.o()));
        if (iCompareTo15 != 0) {
            return iCompareTo15;
        }
        if (o() && (iA6 = jz.a(this.f687a, jdVar.f687a)) != 0) {
            return iA6;
        }
        int iCompareTo16 = Boolean.valueOf(p()).compareTo(Boolean.valueOf(jdVar.p()));
        if (iCompareTo16 != 0) {
            return iCompareTo16;
        }
        if (p() && (iA5 = jz.a(this.f690b, jdVar.f690b)) != 0) {
            return iA5;
        }
        int iCompareTo17 = Boolean.valueOf(q()).compareTo(Boolean.valueOf(jdVar.q()));
        if (iCompareTo17 != 0) {
            return iCompareTo17;
        }
        if (q() && (iA4 = jz.a(this.f699k, jdVar.f699k)) != 0) {
            return iA4;
        }
        int iCompareTo18 = Boolean.valueOf(r()).compareTo(Boolean.valueOf(jdVar.r()));
        if (iCompareTo18 != 0) {
            return iCompareTo18;
        }
        if (r() && (iA3 = jz.a(this.f700l, jdVar.f700l)) != 0) {
            return iA3;
        }
        int iCompareTo19 = Boolean.valueOf(s()).compareTo(Boolean.valueOf(jdVar.s()));
        if (iCompareTo19 != 0) {
            return iCompareTo19;
        }
        if (s() && (iA2 = jz.a(this.f680a, jdVar.f680a)) != 0) {
            return iA2;
        }
        int iCompareTo20 = Boolean.valueOf(t()).compareTo(Boolean.valueOf(jdVar.t()));
        if (iCompareTo20 != 0) {
            return iCompareTo20;
        }
        if (!t() || (iA = jz.a(this.f686a, jdVar.f686a)) == 0) {
            return 0;
        }
        return iA;
    }

    public jd a(long j10) {
        this.f681a = j10;
        a(true);
        return this;
    }

    public jd a(String str) {
        this.f689b = str;
        return this;
    }

    public jd a(short s10) {
        this.f687a = s10;
        c(true);
        return this;
    }

    public void a() throws kk {
        if (this.f689b == null) {
            throw new kk("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f691c != null) {
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
                if (e()) {
                    a();
                    return;
                }
                throw new kk("Required field 'messageTs' was not found in serialized data! Struct: " + toString());
            }
            switch (kgVarMo641a.f925a) {
                case 1:
                    if (b10 == 11) {
                        this.f684a = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 2:
                    if (b10 == 12) {
                        jc jcVar = new jc();
                        this.f682a = jcVar;
                        jcVar.a(kjVar);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 3:
                    if (b10 == 11) {
                        this.f689b = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 4:
                    if (b10 == 11) {
                        this.f691c = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 5:
                    if (b10 == 10) {
                        this.f681a = kjVar.mo640a();
                        a(true);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 6:
                    if (b10 == 11) {
                        this.f692d = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 7:
                    if (b10 == 11) {
                        this.f693e = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 8:
                    if (b10 == 12) {
                        jq jqVar = new jq();
                        this.f683a = jqVar;
                        jqVar.a(kjVar);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 9:
                    if (b10 == 11) {
                        this.f694f = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 10:
                    if (b10 == 11) {
                        this.f695g = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 11:
                    if (b10 == 2) {
                        this.f688a = kjVar.mo651a();
                        b(true);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 12:
                    if (b10 == 11) {
                        this.f696h = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 13:
                    if (b10 == 11) {
                        this.f697i = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 14:
                    if (b10 == 11) {
                        this.f698j = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 15:
                    if (b10 == 6) {
                        this.f687a = kjVar.mo648a();
                        c(true);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 16:
                    if (b10 == 6) {
                        this.f690b = kjVar.mo648a();
                        d(true);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 17:
                case 18:
                case 19:
                default:
                    km.a(kjVar, b10);
                    break;
                case 20:
                    if (b10 == 11) {
                        this.f699k = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 21:
                    if (b10 == 11) {
                        this.f700l = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 22:
                    if (b10 == 8) {
                        this.f680a = kjVar.mo639a();
                        e(true);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 23:
                    if (b10 == 13) {
                        ki kiVarMo643a = kjVar.mo643a();
                        this.f686a = new HashMap(kiVarMo643a.f927a * 2);
                        for (int i10 = 0; i10 < kiVarMo643a.f927a; i10++) {
                            this.f686a.put(kjVar.mo646a(), kjVar.mo646a());
                        }
                        kjVar.h();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
            }
            kjVar.g();
        }
    }

    public void a(boolean z10) {
        this.f685a.set(0, z10);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m543a() {
        return this.f684a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m544a(jd jdVar) {
        if (jdVar == null) {
            return false;
        }
        boolean zM543a = m543a();
        boolean zM543a2 = jdVar.m543a();
        if ((zM543a || zM543a2) && !(zM543a && zM543a2 && this.f684a.equals(jdVar.f684a))) {
            return false;
        }
        boolean zB = b();
        boolean zB2 = jdVar.b();
        if ((zB || zB2) && !(zB && zB2 && this.f682a.m542a(jdVar.f682a))) {
            return false;
        }
        boolean zC = c();
        boolean zC2 = jdVar.c();
        if ((zC || zC2) && !(zC && zC2 && this.f689b.equals(jdVar.f689b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = jdVar.d();
        if (((zD || zD2) && !(zD && zD2 && this.f691c.equals(jdVar.f691c))) || this.f681a != jdVar.f681a) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = jdVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f692d.equals(jdVar.f692d))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = jdVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f693e.equals(jdVar.f693e))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = jdVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f683a.m605a(jdVar.f683a))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = jdVar.i();
        if ((zI || zI2) && !(zI && zI2 && this.f694f.equals(jdVar.f694f))) {
            return false;
        }
        boolean zJ = j();
        boolean zJ2 = jdVar.j();
        if ((zJ || zJ2) && !(zJ && zJ2 && this.f695g.equals(jdVar.f695g))) {
            return false;
        }
        boolean zK = k();
        boolean zK2 = jdVar.k();
        if ((zK || zK2) && !(zK && zK2 && this.f688a == jdVar.f688a)) {
            return false;
        }
        boolean zL = l();
        boolean zL2 = jdVar.l();
        if ((zL || zL2) && !(zL && zL2 && this.f696h.equals(jdVar.f696h))) {
            return false;
        }
        boolean zM = m();
        boolean zM2 = jdVar.m();
        if ((zM || zM2) && !(zM && zM2 && this.f697i.equals(jdVar.f697i))) {
            return false;
        }
        boolean zN = n();
        boolean zN2 = jdVar.n();
        if ((zN || zN2) && !(zN && zN2 && this.f698j.equals(jdVar.f698j))) {
            return false;
        }
        boolean zO = o();
        boolean zO2 = jdVar.o();
        if ((zO || zO2) && !(zO && zO2 && this.f687a == jdVar.f687a)) {
            return false;
        }
        boolean zP = p();
        boolean zP2 = jdVar.p();
        if ((zP || zP2) && !(zP && zP2 && this.f690b == jdVar.f690b)) {
            return false;
        }
        boolean zQ = q();
        boolean zQ2 = jdVar.q();
        if ((zQ || zQ2) && !(zQ && zQ2 && this.f699k.equals(jdVar.f699k))) {
            return false;
        }
        boolean zR = r();
        boolean zR2 = jdVar.r();
        if ((zR || zR2) && !(zR && zR2 && this.f700l.equals(jdVar.f700l))) {
            return false;
        }
        boolean zS = s();
        boolean zS2 = jdVar.s();
        if ((zS || zS2) && !(zS && zS2 && this.f680a == jdVar.f680a)) {
            return false;
        }
        boolean zT = t();
        boolean zT2 = jdVar.t();
        if (zT || zT2) {
            return zT && zT2 && this.f686a.equals(jdVar.f686a);
        }
        return true;
    }

    public jd b(String str) {
        this.f691c = str;
        return this;
    }

    @Override // com.xiaomi.push.jy
    public void b(kj kjVar) throws kk {
        a();
        kjVar.a(f679a);
        if (this.f684a != null && m543a()) {
            kjVar.a(f107581a);
            kjVar.a(this.f684a);
            kjVar.b();
        }
        if (this.f682a != null && b()) {
            kjVar.a(f107582b);
            this.f682a.b(kjVar);
            kjVar.b();
        }
        if (this.f689b != null) {
            kjVar.a(f107583c);
            kjVar.a(this.f689b);
            kjVar.b();
        }
        if (this.f691c != null) {
            kjVar.a(f107584d);
            kjVar.a(this.f691c);
            kjVar.b();
        }
        kjVar.a(f107585e);
        kjVar.a(this.f681a);
        kjVar.b();
        if (this.f692d != null && f()) {
            kjVar.a(f107586f);
            kjVar.a(this.f692d);
            kjVar.b();
        }
        if (this.f693e != null && g()) {
            kjVar.a(f107587g);
            kjVar.a(this.f693e);
            kjVar.b();
        }
        if (this.f683a != null && h()) {
            kjVar.a(f107588h);
            this.f683a.b(kjVar);
            kjVar.b();
        }
        if (this.f694f != null && i()) {
            kjVar.a(f107589i);
            kjVar.a(this.f694f);
            kjVar.b();
        }
        if (this.f695g != null && j()) {
            kjVar.a(f107590j);
            kjVar.a(this.f695g);
            kjVar.b();
        }
        if (k()) {
            kjVar.a(f107591k);
            kjVar.a(this.f688a);
            kjVar.b();
        }
        if (this.f696h != null && l()) {
            kjVar.a(f107592l);
            kjVar.a(this.f696h);
            kjVar.b();
        }
        if (this.f697i != null && m()) {
            kjVar.a(f107593m);
            kjVar.a(this.f697i);
            kjVar.b();
        }
        if (this.f698j != null && n()) {
            kjVar.a(f107594n);
            kjVar.a(this.f698j);
            kjVar.b();
        }
        if (o()) {
            kjVar.a(f107595o);
            kjVar.a(this.f687a);
            kjVar.b();
        }
        if (p()) {
            kjVar.a(f107596p);
            kjVar.a(this.f690b);
            kjVar.b();
        }
        if (this.f699k != null && q()) {
            kjVar.a(f107597q);
            kjVar.a(this.f699k);
            kjVar.b();
        }
        if (this.f700l != null && r()) {
            kjVar.a(f107598r);
            kjVar.a(this.f700l);
            kjVar.b();
        }
        if (s()) {
            kjVar.a(f107599s);
            kjVar.mo650a(this.f680a);
            kjVar.b();
        }
        if (this.f686a != null && t()) {
            kjVar.a(f107600t);
            kjVar.a(new ki((byte) 11, (byte) 11, this.f686a.size()));
            for (Map.Entry<String, String> entry : this.f686a.entrySet()) {
                kjVar.a(entry.getKey());
                kjVar.a(entry.getValue());
            }
            kjVar.d();
            kjVar.b();
        }
        kjVar.c();
        kjVar.mo649a();
    }

    public void b(boolean z10) {
        this.f685a.set(1, z10);
    }

    public boolean b() {
        return this.f682a != null;
    }

    public jd c(String str) {
        this.f692d = str;
        return this;
    }

    public void c(boolean z10) {
        this.f685a.set(2, z10);
    }

    public boolean c() {
        return this.f689b != null;
    }

    public jd d(String str) {
        this.f693e = str;
        return this;
    }

    public void d(boolean z10) {
        this.f685a.set(3, z10);
    }

    public boolean d() {
        return this.f691c != null;
    }

    public void e(boolean z10) {
        this.f685a.set(4, z10);
    }

    public boolean e() {
        return this.f685a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jd)) {
            return m544a((jd) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f692d != null;
    }

    public boolean g() {
        return this.f693e != null;
    }

    public boolean h() {
        return this.f683a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f694f != null;
    }

    public boolean j() {
        return this.f695g != null;
    }

    public boolean k() {
        return this.f685a.get(1);
    }

    public boolean l() {
        return this.f696h != null;
    }

    public boolean m() {
        return this.f697i != null;
    }

    public boolean n() {
        return this.f698j != null;
    }

    public boolean o() {
        return this.f685a.get(2);
    }

    public boolean p() {
        return this.f685a.get(3);
    }

    public boolean q() {
        return this.f699k != null;
    }

    public boolean r() {
        return this.f700l != null;
    }

    public boolean s() {
        return this.f685a.get(4);
    }

    public boolean t() {
        return this.f686a != null;
    }

    public String toString() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("XmPushActionAckMessage(");
        boolean z11 = false;
        if (m543a()) {
            sb2.append("debug:");
            String str = this.f684a;
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
            jc jcVar = this.f682a;
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
        String str2 = this.f689b;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(", ");
        sb2.append("appId:");
        String str3 = this.f691c;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(", ");
        sb2.append("messageTs:");
        sb2.append(this.f681a);
        if (f()) {
            sb2.append(", ");
            sb2.append("topic:");
            String str4 = this.f692d;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (g()) {
            sb2.append(", ");
            sb2.append("aliasName:");
            String str5 = this.f693e;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (h()) {
            sb2.append(", ");
            sb2.append("request:");
            jq jqVar = this.f683a;
            if (jqVar == null) {
                sb2.append("null");
            } else {
                sb2.append(jqVar);
            }
        }
        if (i()) {
            sb2.append(", ");
            sb2.append("packageName:");
            String str6 = this.f694f;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
        }
        if (j()) {
            sb2.append(", ");
            sb2.append("category:");
            String str7 = this.f695g;
            if (str7 == null) {
                sb2.append("null");
            } else {
                sb2.append(str7);
            }
        }
        if (k()) {
            sb2.append(", ");
            sb2.append("isOnline:");
            sb2.append(this.f688a);
        }
        if (l()) {
            sb2.append(", ");
            sb2.append("regId:");
            String str8 = this.f696h;
            if (str8 == null) {
                sb2.append("null");
            } else {
                sb2.append(str8);
            }
        }
        if (m()) {
            sb2.append(", ");
            sb2.append("callbackUrl:");
            String str9 = this.f697i;
            if (str9 == null) {
                sb2.append("null");
            } else {
                sb2.append(str9);
            }
        }
        if (n()) {
            sb2.append(", ");
            sb2.append("userAccount:");
            String str10 = this.f698j;
            if (str10 == null) {
                sb2.append("null");
            } else {
                sb2.append(str10);
            }
        }
        if (o()) {
            sb2.append(", ");
            sb2.append("deviceStatus:");
            sb2.append((int) this.f687a);
        }
        if (p()) {
            sb2.append(", ");
            sb2.append("geoMsgStatus:");
            sb2.append((int) this.f690b);
        }
        if (q()) {
            sb2.append(", ");
            sb2.append("imeiMd5:");
            String str11 = this.f699k;
            if (str11 == null) {
                sb2.append("null");
            } else {
                sb2.append(str11);
            }
        }
        if (r()) {
            sb2.append(", ");
            sb2.append("deviceId:");
            String str12 = this.f700l;
            if (str12 == null) {
                sb2.append("null");
            } else {
                sb2.append(str12);
            }
        }
        if (s()) {
            sb2.append(", ");
            sb2.append("passThrough:");
            sb2.append(this.f680a);
        }
        if (t()) {
            sb2.append(", ");
            sb2.append("extra:");
            Map<String, String> map = this.f686a;
            if (map == null) {
                sb2.append("null");
            } else {
                sb2.append(map);
            }
        }
        sb2.append(")");
        return sb2.toString();
    }
}
