package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class jo implements jy<jo, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f806a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f807a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public jc f808a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f809a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public List<String> f811a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public int f813b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public long f814b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f815b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public long f816c;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f817c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f818d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public String f819e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public String f820f;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    public String f821g;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    public String f822h;

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    public String f823i;

    /* JADX INFO: renamed from: j, reason: collision with other field name */
    public String f824j;

    /* JADX INFO: renamed from: k, reason: collision with other field name */
    public String f825k;

    /* JADX INFO: renamed from: l, reason: collision with other field name */
    public String f826l;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final ko f805a = new ko("XmPushActionRegistrationResult");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final kg f107685a = new kg("", (byte) 11, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final kg f107686b = new kg("", (byte) 12, 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final kg f107687c = new kg("", (byte) 11, 3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final kg f107688d = new kg("", (byte) 11, 4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final kg f107689e = new kg("", (byte) 10, 6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final kg f107690f = new kg("", (byte) 11, 7);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final kg f107691g = new kg("", (byte) 11, 8);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final kg f107692h = new kg("", (byte) 11, 9);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final kg f107693i = new kg("", (byte) 11, 10);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final kg f107694j = new kg("", (byte) 10, 11);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final kg f107695k = new kg("", (byte) 11, 12);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final kg f107696l = new kg("", (byte) 11, 13);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final kg f107697m = new kg("", (byte) 10, 14);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final kg f107698n = new kg("", (byte) 11, 15);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final kg f107699o = new kg("", (byte) 8, 16);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final kg f107700p = new kg("", (byte) 11, 17);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final kg f107701q = new kg("", (byte) 8, 18);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final kg f107702r = new kg("", (byte) 11, 19);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final kg f107703s = new kg("", (byte) 2, 20);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final kg f107704t = new kg("", (byte) 15, 21);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f810a = new BitSet(6);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f812a = false;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(jo joVar) {
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
        if (!getClass().equals(joVar.getClass())) {
            return getClass().getName().compareTo(joVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m596a()).compareTo(Boolean.valueOf(joVar.m596a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m596a() && (iA20 = jz.a(this.f809a, joVar.f809a)) != 0) {
            return iA20;
        }
        int iCompareTo2 = Boolean.valueOf(m598b()).compareTo(Boolean.valueOf(joVar.m598b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m598b() && (iA19 = jz.a(this.f808a, joVar.f808a)) != 0) {
            return iA19;
        }
        int iCompareTo3 = Boolean.valueOf(m599c()).compareTo(Boolean.valueOf(joVar.m599c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m599c() && (iA18 = jz.a(this.f815b, joVar.f815b)) != 0) {
            return iA18;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(joVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iA17 = jz.a(this.f817c, joVar.f817c)) != 0) {
            return iA17;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(joVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iA16 = jz.a(this.f807a, joVar.f807a)) != 0) {
            return iA16;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(joVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iA15 = jz.a(this.f818d, joVar.f818d)) != 0) {
            return iA15;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(joVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iA14 = jz.a(this.f819e, joVar.f819e)) != 0) {
            return iA14;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(joVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iA13 = jz.a(this.f820f, joVar.f820f)) != 0) {
            return iA13;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(joVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (i() && (iA12 = jz.a(this.f821g, joVar.f821g)) != 0) {
            return iA12;
        }
        int iCompareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(joVar.j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (j() && (iA11 = jz.a(this.f814b, joVar.f814b)) != 0) {
            return iA11;
        }
        int iCompareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(joVar.k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (k() && (iA10 = jz.a(this.f822h, joVar.f822h)) != 0) {
            return iA10;
        }
        int iCompareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(joVar.l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (l() && (iA9 = jz.a(this.f823i, joVar.f823i)) != 0) {
            return iA9;
        }
        int iCompareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(joVar.m()));
        if (iCompareTo13 != 0) {
            return iCompareTo13;
        }
        if (m() && (iA8 = jz.a(this.f816c, joVar.f816c)) != 0) {
            return iA8;
        }
        int iCompareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(joVar.n()));
        if (iCompareTo14 != 0) {
            return iCompareTo14;
        }
        if (n() && (iA7 = jz.a(this.f824j, joVar.f824j)) != 0) {
            return iA7;
        }
        int iCompareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(joVar.o()));
        if (iCompareTo15 != 0) {
            return iCompareTo15;
        }
        if (o() && (iA6 = jz.a(this.f806a, joVar.f806a)) != 0) {
            return iA6;
        }
        int iCompareTo16 = Boolean.valueOf(p()).compareTo(Boolean.valueOf(joVar.p()));
        if (iCompareTo16 != 0) {
            return iCompareTo16;
        }
        if (p() && (iA5 = jz.a(this.f825k, joVar.f825k)) != 0) {
            return iA5;
        }
        int iCompareTo17 = Boolean.valueOf(q()).compareTo(Boolean.valueOf(joVar.q()));
        if (iCompareTo17 != 0) {
            return iCompareTo17;
        }
        if (q() && (iA4 = jz.a(this.f813b, joVar.f813b)) != 0) {
            return iA4;
        }
        int iCompareTo18 = Boolean.valueOf(r()).compareTo(Boolean.valueOf(joVar.r()));
        if (iCompareTo18 != 0) {
            return iCompareTo18;
        }
        if (r() && (iA3 = jz.a(this.f826l, joVar.f826l)) != 0) {
            return iA3;
        }
        int iCompareTo19 = Boolean.valueOf(s()).compareTo(Boolean.valueOf(joVar.s()));
        if (iCompareTo19 != 0) {
            return iCompareTo19;
        }
        if (s() && (iA2 = jz.a(this.f812a, joVar.f812a)) != 0) {
            return iA2;
        }
        int iCompareTo20 = Boolean.valueOf(t()).compareTo(Boolean.valueOf(joVar.t()));
        if (iCompareTo20 != 0) {
            return iCompareTo20;
        }
        if (!t() || (iA = jz.a(this.f811a, joVar.f811a)) == 0) {
            return 0;
        }
        return iA;
    }

    public long a() {
        return this.f807a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m593a() {
        return this.f815b;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public List<String> m594a() {
        return this.f811a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m595a() throws kk {
        if (this.f815b == null) {
            throw new kk("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f817c != null) {
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
                    m595a();
                    return;
                }
                throw new kk("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
            }
            switch (kgVarMo641a.f925a) {
                case 1:
                    if (b10 == 11) {
                        this.f809a = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 2:
                    if (b10 == 12) {
                        jc jcVar = new jc();
                        this.f808a = jcVar;
                        jcVar.a(kjVar);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 3:
                    if (b10 == 11) {
                        this.f815b = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 4:
                    if (b10 == 11) {
                        this.f817c = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 5:
                default:
                    km.a(kjVar, b10);
                    break;
                case 6:
                    if (b10 == 10) {
                        this.f807a = kjVar.mo640a();
                        a(true);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 7:
                    if (b10 == 11) {
                        this.f818d = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 8:
                    if (b10 == 11) {
                        this.f819e = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 9:
                    if (b10 == 11) {
                        this.f820f = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 10:
                    if (b10 == 11) {
                        this.f821g = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 11:
                    if (b10 == 10) {
                        this.f814b = kjVar.mo640a();
                        b(true);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 12:
                    if (b10 == 11) {
                        this.f822h = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 13:
                    if (b10 == 11) {
                        this.f823i = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 14:
                    if (b10 == 10) {
                        this.f816c = kjVar.mo640a();
                        c(true);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 15:
                    if (b10 == 11) {
                        this.f824j = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 16:
                    if (b10 == 8) {
                        this.f806a = kjVar.mo639a();
                        d(true);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 17:
                    if (b10 == 11) {
                        this.f825k = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 18:
                    if (b10 == 8) {
                        this.f813b = kjVar.mo639a();
                        e(true);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 19:
                    if (b10 == 11) {
                        this.f826l = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 20:
                    if (b10 == 2) {
                        this.f812a = kjVar.mo651a();
                        f(true);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 21:
                    if (b10 == 15) {
                        kh khVarMo642a = kjVar.mo642a();
                        this.f811a = new ArrayList(khVarMo642a.f926a);
                        for (int i10 = 0; i10 < khVarMo642a.f926a; i10++) {
                            this.f811a.add(kjVar.mo646a());
                        }
                        kjVar.i();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
            }
            kjVar.g();
        }
    }

    public void a(boolean z10) {
        this.f810a.set(0, z10);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m596a() {
        return this.f809a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m597a(jo joVar) {
        if (joVar == null) {
            return false;
        }
        boolean zM596a = m596a();
        boolean zM596a2 = joVar.m596a();
        if ((zM596a || zM596a2) && !(zM596a && zM596a2 && this.f809a.equals(joVar.f809a))) {
            return false;
        }
        boolean zM598b = m598b();
        boolean zM598b2 = joVar.m598b();
        if ((zM598b || zM598b2) && !(zM598b && zM598b2 && this.f808a.m542a(joVar.f808a))) {
            return false;
        }
        boolean zM599c = m599c();
        boolean zM599c2 = joVar.m599c();
        if ((zM599c || zM599c2) && !(zM599c && zM599c2 && this.f815b.equals(joVar.f815b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = joVar.d();
        if (((zD || zD2) && !(zD && zD2 && this.f817c.equals(joVar.f817c))) || this.f807a != joVar.f807a) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = joVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f818d.equals(joVar.f818d))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = joVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f819e.equals(joVar.f819e))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = joVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f820f.equals(joVar.f820f))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = joVar.i();
        if ((zI || zI2) && !(zI && zI2 && this.f821g.equals(joVar.f821g))) {
            return false;
        }
        boolean zJ = j();
        boolean zJ2 = joVar.j();
        if ((zJ || zJ2) && !(zJ && zJ2 && this.f814b == joVar.f814b)) {
            return false;
        }
        boolean zK = k();
        boolean zK2 = joVar.k();
        if ((zK || zK2) && !(zK && zK2 && this.f822h.equals(joVar.f822h))) {
            return false;
        }
        boolean zL = l();
        boolean zL2 = joVar.l();
        if ((zL || zL2) && !(zL && zL2 && this.f823i.equals(joVar.f823i))) {
            return false;
        }
        boolean zM = m();
        boolean zM2 = joVar.m();
        if ((zM || zM2) && !(zM && zM2 && this.f816c == joVar.f816c)) {
            return false;
        }
        boolean zN = n();
        boolean zN2 = joVar.n();
        if ((zN || zN2) && !(zN && zN2 && this.f824j.equals(joVar.f824j))) {
            return false;
        }
        boolean zO = o();
        boolean zO2 = joVar.o();
        if ((zO || zO2) && !(zO && zO2 && this.f806a == joVar.f806a)) {
            return false;
        }
        boolean zP = p();
        boolean zP2 = joVar.p();
        if ((zP || zP2) && !(zP && zP2 && this.f825k.equals(joVar.f825k))) {
            return false;
        }
        boolean zQ = q();
        boolean zQ2 = joVar.q();
        if ((zQ || zQ2) && !(zQ && zQ2 && this.f813b == joVar.f813b)) {
            return false;
        }
        boolean zR = r();
        boolean zR2 = joVar.r();
        if ((zR || zR2) && !(zR && zR2 && this.f826l.equals(joVar.f826l))) {
            return false;
        }
        boolean zS = s();
        boolean zS2 = joVar.s();
        if ((zS || zS2) && !(zS && zS2 && this.f812a == joVar.f812a)) {
            return false;
        }
        boolean zT = t();
        boolean zT2 = joVar.t();
        if (zT || zT2) {
            return zT && zT2 && this.f811a.equals(joVar.f811a);
        }
        return true;
    }

    public String b() {
        return this.f820f;
    }

    @Override // com.xiaomi.push.jy
    public void b(kj kjVar) throws kk {
        m595a();
        kjVar.a(f805a);
        if (this.f809a != null && m596a()) {
            kjVar.a(f107685a);
            kjVar.a(this.f809a);
            kjVar.b();
        }
        if (this.f808a != null && m598b()) {
            kjVar.a(f107686b);
            this.f808a.b(kjVar);
            kjVar.b();
        }
        if (this.f815b != null) {
            kjVar.a(f107687c);
            kjVar.a(this.f815b);
            kjVar.b();
        }
        if (this.f817c != null) {
            kjVar.a(f107688d);
            kjVar.a(this.f817c);
            kjVar.b();
        }
        kjVar.a(f107689e);
        kjVar.a(this.f807a);
        kjVar.b();
        if (this.f818d != null && f()) {
            kjVar.a(f107690f);
            kjVar.a(this.f818d);
            kjVar.b();
        }
        if (this.f819e != null && g()) {
            kjVar.a(f107691g);
            kjVar.a(this.f819e);
            kjVar.b();
        }
        if (this.f820f != null && h()) {
            kjVar.a(f107692h);
            kjVar.a(this.f820f);
            kjVar.b();
        }
        if (this.f821g != null && i()) {
            kjVar.a(f107693i);
            kjVar.a(this.f821g);
            kjVar.b();
        }
        if (j()) {
            kjVar.a(f107694j);
            kjVar.a(this.f814b);
            kjVar.b();
        }
        if (this.f822h != null && k()) {
            kjVar.a(f107695k);
            kjVar.a(this.f822h);
            kjVar.b();
        }
        if (this.f823i != null && l()) {
            kjVar.a(f107696l);
            kjVar.a(this.f823i);
            kjVar.b();
        }
        if (m()) {
            kjVar.a(f107697m);
            kjVar.a(this.f816c);
            kjVar.b();
        }
        if (this.f824j != null && n()) {
            kjVar.a(f107698n);
            kjVar.a(this.f824j);
            kjVar.b();
        }
        if (o()) {
            kjVar.a(f107699o);
            kjVar.mo650a(this.f806a);
            kjVar.b();
        }
        if (this.f825k != null && p()) {
            kjVar.a(f107700p);
            kjVar.a(this.f825k);
            kjVar.b();
        }
        if (q()) {
            kjVar.a(f107701q);
            kjVar.mo650a(this.f813b);
            kjVar.b();
        }
        if (this.f826l != null && r()) {
            kjVar.a(f107702r);
            kjVar.a(this.f826l);
            kjVar.b();
        }
        if (s()) {
            kjVar.a(f107703s);
            kjVar.a(this.f812a);
            kjVar.b();
        }
        if (this.f811a != null && t()) {
            kjVar.a(f107704t);
            kjVar.a(new kh((byte) 11, this.f811a.size()));
            Iterator<String> it = this.f811a.iterator();
            while (it.hasNext()) {
                kjVar.a(it.next());
            }
            kjVar.e();
            kjVar.b();
        }
        kjVar.c();
        kjVar.mo649a();
    }

    public void b(boolean z10) {
        this.f810a.set(1, z10);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m598b() {
        return this.f808a != null;
    }

    public String c() {
        return this.f821g;
    }

    public void c(boolean z10) {
        this.f810a.set(2, z10);
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m599c() {
        return this.f815b != null;
    }

    public void d(boolean z10) {
        this.f810a.set(3, z10);
    }

    public boolean d() {
        return this.f817c != null;
    }

    public void e(boolean z10) {
        this.f810a.set(4, z10);
    }

    public boolean e() {
        return this.f810a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jo)) {
            return m597a((jo) obj);
        }
        return false;
    }

    public void f(boolean z10) {
        this.f810a.set(5, z10);
    }

    public boolean f() {
        return this.f818d != null;
    }

    public boolean g() {
        return this.f819e != null;
    }

    public boolean h() {
        return this.f820f != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f821g != null;
    }

    public boolean j() {
        return this.f810a.get(1);
    }

    public boolean k() {
        return this.f822h != null;
    }

    public boolean l() {
        return this.f823i != null;
    }

    public boolean m() {
        return this.f810a.get(2);
    }

    public boolean n() {
        return this.f824j != null;
    }

    public boolean o() {
        return this.f810a.get(3);
    }

    public boolean p() {
        return this.f825k != null;
    }

    public boolean q() {
        return this.f810a.get(4);
    }

    public boolean r() {
        return this.f826l != null;
    }

    public boolean s() {
        return this.f810a.get(5);
    }

    public boolean t() {
        return this.f811a != null;
    }

    public String toString() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("XmPushActionRegistrationResult(");
        boolean z11 = false;
        if (m596a()) {
            sb2.append("debug:");
            String str = this.f809a;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            z10 = false;
        } else {
            z10 = true;
        }
        if (m598b()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append("target:");
            jc jcVar = this.f808a;
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
        String str2 = this.f815b;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(com.xiaomi.push.service.bc.a(str2));
        }
        sb2.append(", ");
        sb2.append("appId:");
        String str3 = this.f817c;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(", ");
        sb2.append("errorCode:");
        sb2.append(this.f807a);
        if (f()) {
            sb2.append(", ");
            sb2.append("reason:");
            String str4 = this.f818d;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (g()) {
            sb2.append(", ");
            sb2.append("regId:");
            String str5 = this.f819e;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (i()) {
            sb2.append(", ");
            sb2.append("packageName:");
            String str6 = this.f821g;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
        }
        if (j()) {
            sb2.append(", ");
            sb2.append("registeredAt:");
            sb2.append(this.f814b);
        }
        if (k()) {
            sb2.append(", ");
            sb2.append("aliasName:");
            String str7 = this.f822h;
            if (str7 == null) {
                sb2.append("null");
            } else {
                sb2.append(str7);
            }
        }
        if (l()) {
            sb2.append(", ");
            sb2.append("clientId:");
            String str8 = this.f823i;
            if (str8 == null) {
                sb2.append("null");
            } else {
                sb2.append(str8);
            }
        }
        if (m()) {
            sb2.append(", ");
            sb2.append("costTime:");
            sb2.append(this.f816c);
        }
        if (n()) {
            sb2.append(", ");
            sb2.append("appVersion:");
            String str9 = this.f824j;
            if (str9 == null) {
                sb2.append("null");
            } else {
                sb2.append(str9);
            }
        }
        if (o()) {
            sb2.append(", ");
            sb2.append("pushSdkVersionCode:");
            sb2.append(this.f806a);
        }
        if (p()) {
            sb2.append(", ");
            sb2.append("hybridPushEndpoint:");
            String str10 = this.f825k;
            if (str10 == null) {
                sb2.append("null");
            } else {
                sb2.append(str10);
            }
        }
        if (q()) {
            sb2.append(", ");
            sb2.append("appVersionCode:");
            sb2.append(this.f813b);
        }
        if (r()) {
            sb2.append(", ");
            sb2.append("region:");
            String str11 = this.f826l;
            if (str11 == null) {
                sb2.append("null");
            } else {
                sb2.append(str11);
            }
        }
        if (s()) {
            sb2.append(", ");
            sb2.append("isHybridFrame:");
            sb2.append(this.f812a);
        }
        if (t()) {
            sb2.append(", ");
            sb2.append("autoMarkPkgs:");
            List<String> list = this.f811a;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
        }
        sb2.append(")");
        return sb2.toString();
    }
}
