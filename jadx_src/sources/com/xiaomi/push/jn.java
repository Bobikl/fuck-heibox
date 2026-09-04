package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class jn implements jy<jn, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f775a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f776a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public jb f777a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public jc f778a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f779a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public Map<String, String> f781a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public int f783b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public long f784b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f785b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public int f787c;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f788c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f790d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public String f791e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public String f792f;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    public String f793g;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    public String f794h;

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    public String f795i;

    /* JADX INFO: renamed from: j, reason: collision with other field name */
    public String f796j;

    /* JADX INFO: renamed from: k, reason: collision with other field name */
    public String f797k;

    /* JADX INFO: renamed from: l, reason: collision with other field name */
    public String f798l;

    /* JADX INFO: renamed from: m, reason: collision with other field name */
    public String f799m;

    /* JADX INFO: renamed from: n, reason: collision with other field name */
    public String f800n;

    /* JADX INFO: renamed from: o, reason: collision with other field name */
    public String f801o;

    /* JADX INFO: renamed from: p, reason: collision with other field name */
    public String f802p;

    /* JADX INFO: renamed from: q, reason: collision with other field name */
    public String f803q;

    /* JADX INFO: renamed from: r, reason: collision with other field name */
    public String f804r;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final ko f774a = new ko("XmPushActionRegistration");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final kg f107659a = new kg("", (byte) 11, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final kg f107660b = new kg("", (byte) 12, 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final kg f107661c = new kg("", (byte) 11, 3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final kg f107662d = new kg("", (byte) 11, 4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final kg f107663e = new kg("", (byte) 11, 5);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final kg f107664f = new kg("", (byte) 11, 6);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final kg f107665g = new kg("", (byte) 11, 7);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final kg f107666h = new kg("", (byte) 11, 8);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final kg f107667i = new kg("", (byte) 11, 9);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final kg f107668j = new kg("", (byte) 11, 10);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final kg f107669k = new kg("", (byte) 11, 11);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final kg f107670l = new kg("", (byte) 11, 12);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final kg f107671m = new kg("", (byte) 8, 13);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final kg f107672n = new kg("", (byte) 8, 14);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final kg f107673o = new kg("", (byte) 11, 15);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final kg f107674p = new kg("", (byte) 11, 16);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final kg f107675q = new kg("", (byte) 11, 17);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final kg f107676r = new kg("", (byte) 11, 18);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final kg f107677s = new kg("", (byte) 8, 19);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final kg f107678t = new kg("", (byte) 8, 20);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final kg f107679u = new kg("", (byte) 2, 21);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final kg f107680v = new kg("", (byte) 10, 22);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final kg f107681w = new kg("", (byte) 10, 23);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final kg f107682x = new kg("", (byte) 11, 24);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final kg f107683y = new kg("", (byte) 11, 25);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final kg f107684z = new kg("", (byte) 2, 26);
    private static final kg A = new kg("", (byte) 13, 100);
    private static final kg B = new kg("", (byte) 2, 101);
    private static final kg C = new kg("", (byte) 11, 102);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f780a = new BitSet(8);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f782a = true;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public boolean f789c = false;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public boolean f786b = false;

    public boolean A() {
        return this.f781a != null;
    }

    public boolean B() {
        return this.f780a.get(7);
    }

    public boolean C() {
        return this.f804r != null;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(jn jnVar) {
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
        int iA21;
        int iA22;
        int iA23;
        int iA24;
        int iA25;
        int iA26;
        int iA27;
        int iA28;
        int iA29;
        if (!getClass().equals(jnVar.getClass())) {
            return getClass().getName().compareTo(jnVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m589a()).compareTo(Boolean.valueOf(jnVar.m589a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m589a() && (iA29 = jz.a(this.f779a, jnVar.f779a)) != 0) {
            return iA29;
        }
        int iCompareTo2 = Boolean.valueOf(m591b()).compareTo(Boolean.valueOf(jnVar.m591b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m591b() && (iA28 = jz.a(this.f778a, jnVar.f778a)) != 0) {
            return iA28;
        }
        int iCompareTo3 = Boolean.valueOf(m592c()).compareTo(Boolean.valueOf(jnVar.m592c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m592c() && (iA27 = jz.a(this.f785b, jnVar.f785b)) != 0) {
            return iA27;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jnVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iA26 = jz.a(this.f788c, jnVar.f788c)) != 0) {
            return iA26;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jnVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iA25 = jz.a(this.f790d, jnVar.f790d)) != 0) {
            return iA25;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jnVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iA24 = jz.a(this.f791e, jnVar.f791e)) != 0) {
            return iA24;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jnVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iA23 = jz.a(this.f792f, jnVar.f792f)) != 0) {
            return iA23;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jnVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iA22 = jz.a(this.f793g, jnVar.f793g)) != 0) {
            return iA22;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jnVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (i() && (iA21 = jz.a(this.f794h, jnVar.f794h)) != 0) {
            return iA21;
        }
        int iCompareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(jnVar.j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (j() && (iA20 = jz.a(this.f795i, jnVar.f795i)) != 0) {
            return iA20;
        }
        int iCompareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(jnVar.k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (k() && (iA19 = jz.a(this.f796j, jnVar.f796j)) != 0) {
            return iA19;
        }
        int iCompareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(jnVar.l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (l() && (iA18 = jz.a(this.f797k, jnVar.f797k)) != 0) {
            return iA18;
        }
        int iCompareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(jnVar.m()));
        if (iCompareTo13 != 0) {
            return iCompareTo13;
        }
        if (m() && (iA17 = jz.a(this.f775a, jnVar.f775a)) != 0) {
            return iA17;
        }
        int iCompareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(jnVar.n()));
        if (iCompareTo14 != 0) {
            return iCompareTo14;
        }
        if (n() && (iA16 = jz.a(this.f783b, jnVar.f783b)) != 0) {
            return iA16;
        }
        int iCompareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(jnVar.o()));
        if (iCompareTo15 != 0) {
            return iCompareTo15;
        }
        if (o() && (iA15 = jz.a(this.f798l, jnVar.f798l)) != 0) {
            return iA15;
        }
        int iCompareTo16 = Boolean.valueOf(p()).compareTo(Boolean.valueOf(jnVar.p()));
        if (iCompareTo16 != 0) {
            return iCompareTo16;
        }
        if (p() && (iA14 = jz.a(this.f799m, jnVar.f799m)) != 0) {
            return iA14;
        }
        int iCompareTo17 = Boolean.valueOf(q()).compareTo(Boolean.valueOf(jnVar.q()));
        if (iCompareTo17 != 0) {
            return iCompareTo17;
        }
        if (q() && (iA13 = jz.a(this.f800n, jnVar.f800n)) != 0) {
            return iA13;
        }
        int iCompareTo18 = Boolean.valueOf(r()).compareTo(Boolean.valueOf(jnVar.r()));
        if (iCompareTo18 != 0) {
            return iCompareTo18;
        }
        if (r() && (iA12 = jz.a(this.f801o, jnVar.f801o)) != 0) {
            return iA12;
        }
        int iCompareTo19 = Boolean.valueOf(s()).compareTo(Boolean.valueOf(jnVar.s()));
        if (iCompareTo19 != 0) {
            return iCompareTo19;
        }
        if (s() && (iA11 = jz.a(this.f787c, jnVar.f787c)) != 0) {
            return iA11;
        }
        int iCompareTo20 = Boolean.valueOf(t()).compareTo(Boolean.valueOf(jnVar.t()));
        if (iCompareTo20 != 0) {
            return iCompareTo20;
        }
        if (t() && (iA10 = jz.a(this.f777a, jnVar.f777a)) != 0) {
            return iA10;
        }
        int iCompareTo21 = Boolean.valueOf(u()).compareTo(Boolean.valueOf(jnVar.u()));
        if (iCompareTo21 != 0) {
            return iCompareTo21;
        }
        if (u() && (iA9 = jz.a(this.f782a, jnVar.f782a)) != 0) {
            return iA9;
        }
        int iCompareTo22 = Boolean.valueOf(v()).compareTo(Boolean.valueOf(jnVar.v()));
        if (iCompareTo22 != 0) {
            return iCompareTo22;
        }
        if (v() && (iA8 = jz.a(this.f776a, jnVar.f776a)) != 0) {
            return iA8;
        }
        int iCompareTo23 = Boolean.valueOf(w()).compareTo(Boolean.valueOf(jnVar.w()));
        if (iCompareTo23 != 0) {
            return iCompareTo23;
        }
        if (w() && (iA7 = jz.a(this.f784b, jnVar.f784b)) != 0) {
            return iA7;
        }
        int iCompareTo24 = Boolean.valueOf(x()).compareTo(Boolean.valueOf(jnVar.x()));
        if (iCompareTo24 != 0) {
            return iCompareTo24;
        }
        if (x() && (iA6 = jz.a(this.f802p, jnVar.f802p)) != 0) {
            return iA6;
        }
        int iCompareTo25 = Boolean.valueOf(y()).compareTo(Boolean.valueOf(jnVar.y()));
        if (iCompareTo25 != 0) {
            return iCompareTo25;
        }
        if (y() && (iA5 = jz.a(this.f803q, jnVar.f803q)) != 0) {
            return iA5;
        }
        int iCompareTo26 = Boolean.valueOf(z()).compareTo(Boolean.valueOf(jnVar.z()));
        if (iCompareTo26 != 0) {
            return iCompareTo26;
        }
        if (z() && (iA4 = jz.a(this.f786b, jnVar.f786b)) != 0) {
            return iA4;
        }
        int iCompareTo27 = Boolean.valueOf(A()).compareTo(Boolean.valueOf(jnVar.A()));
        if (iCompareTo27 != 0) {
            return iCompareTo27;
        }
        if (A() && (iA3 = jz.a(this.f781a, jnVar.f781a)) != 0) {
            return iA3;
        }
        int iCompareTo28 = Boolean.valueOf(B()).compareTo(Boolean.valueOf(jnVar.B()));
        if (iCompareTo28 != 0) {
            return iCompareTo28;
        }
        if (B() && (iA2 = jz.a(this.f789c, jnVar.f789c)) != 0) {
            return iA2;
        }
        int iCompareTo29 = Boolean.valueOf(C()).compareTo(Boolean.valueOf(jnVar.C()));
        if (iCompareTo29 != 0) {
            return iCompareTo29;
        }
        if (!C() || (iA = jz.a(this.f804r, jnVar.f804r)) == 0) {
            return 0;
        }
        return iA;
    }

    public jn a(int i10) {
        this.f775a = i10;
        a(true);
        return this;
    }

    public jn a(jb jbVar) {
        this.f777a = jbVar;
        return this;
    }

    public jn a(String str) {
        this.f785b = str;
        return this;
    }

    public String a() {
        return this.f785b;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m588a() throws kk {
        if (this.f785b == null) {
            throw new kk("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f788c == null) {
            throw new kk("Required field 'appId' was not present! Struct: " + toString());
        }
        if (this.f792f != null) {
            return;
        }
        throw new kk("Required field 'token' was not present! Struct: " + toString());
    }

    @Override // com.xiaomi.push.jy
    public void a(kj kjVar) throws kk {
        kjVar.mo645a();
        while (true) {
            kg kgVarMo641a = kjVar.mo641a();
            byte b10 = kgVarMo641a.f107793a;
            if (b10 == 0) {
                kjVar.f();
                m588a();
                return;
            }
            short s10 = kgVarMo641a.f925a;
            switch (s10) {
                case 1:
                    if (b10 == 11) {
                        this.f779a = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 2:
                    if (b10 == 12) {
                        jc jcVar = new jc();
                        this.f778a = jcVar;
                        jcVar.a(kjVar);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 3:
                    if (b10 == 11) {
                        this.f785b = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 4:
                    if (b10 == 11) {
                        this.f788c = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 5:
                    if (b10 == 11) {
                        this.f790d = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 6:
                    if (b10 == 11) {
                        this.f791e = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 7:
                    if (b10 == 11) {
                        this.f792f = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 8:
                    if (b10 == 11) {
                        this.f793g = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 9:
                    if (b10 == 11) {
                        this.f794h = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 10:
                    if (b10 == 11) {
                        this.f795i = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 11:
                    if (b10 == 11) {
                        this.f796j = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 12:
                    if (b10 == 11) {
                        this.f797k = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 13:
                    if (b10 == 8) {
                        this.f775a = kjVar.mo639a();
                        a(true);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 14:
                    if (b10 == 8) {
                        this.f783b = kjVar.mo639a();
                        b(true);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 15:
                    if (b10 == 11) {
                        this.f798l = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 16:
                    if (b10 == 11) {
                        this.f799m = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 17:
                    if (b10 == 11) {
                        this.f800n = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 18:
                    if (b10 == 11) {
                        this.f801o = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 19:
                    if (b10 == 8) {
                        this.f787c = kjVar.mo639a();
                        c(true);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 20:
                    if (b10 == 8) {
                        this.f777a = jb.a(kjVar.mo639a());
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 21:
                    if (b10 == 2) {
                        this.f782a = kjVar.mo651a();
                        d(true);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 22:
                    if (b10 == 10) {
                        this.f776a = kjVar.mo640a();
                        e(true);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 23:
                    if (b10 == 10) {
                        this.f784b = kjVar.mo640a();
                        f(true);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 24:
                    if (b10 == 11) {
                        this.f802p = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 25:
                    if (b10 == 11) {
                        this.f803q = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 26:
                    if (b10 == 2) {
                        this.f786b = kjVar.mo651a();
                        g(true);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                default:
                    switch (s10) {
                        case 100:
                            if (b10 == 13) {
                                ki kiVarMo643a = kjVar.mo643a();
                                this.f781a = new HashMap(kiVarMo643a.f927a * 2);
                                for (int i10 = 0; i10 < kiVarMo643a.f927a; i10++) {
                                    this.f781a.put(kjVar.mo646a(), kjVar.mo646a());
                                }
                                kjVar.h();
                            } else {
                                km.a(kjVar, b10);
                            }
                            break;
                        case 101:
                            if (b10 == 2) {
                                this.f789c = kjVar.mo651a();
                                h(true);
                            } else {
                                km.a(kjVar, b10);
                            }
                            break;
                        case 102:
                            if (b10 == 11) {
                                this.f804r = kjVar.mo646a();
                            } else {
                                km.a(kjVar, b10);
                            }
                            break;
                        default:
                            km.a(kjVar, b10);
                            break;
                    }
                    break;
            }
            kjVar.g();
        }
    }

    public void a(boolean z10) {
        this.f780a.set(0, z10);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m589a() {
        return this.f779a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m590a(jn jnVar) {
        if (jnVar == null) {
            return false;
        }
        boolean zM589a = m589a();
        boolean zM589a2 = jnVar.m589a();
        if ((zM589a || zM589a2) && !(zM589a && zM589a2 && this.f779a.equals(jnVar.f779a))) {
            return false;
        }
        boolean zM591b = m591b();
        boolean zM591b2 = jnVar.m591b();
        if ((zM591b || zM591b2) && !(zM591b && zM591b2 && this.f778a.m542a(jnVar.f778a))) {
            return false;
        }
        boolean zM592c = m592c();
        boolean zM592c2 = jnVar.m592c();
        if ((zM592c || zM592c2) && !(zM592c && zM592c2 && this.f785b.equals(jnVar.f785b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = jnVar.d();
        if ((zD || zD2) && !(zD && zD2 && this.f788c.equals(jnVar.f788c))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = jnVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.f790d.equals(jnVar.f790d))) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = jnVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f791e.equals(jnVar.f791e))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = jnVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f792f.equals(jnVar.f792f))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = jnVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f793g.equals(jnVar.f793g))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = jnVar.i();
        if ((zI || zI2) && !(zI && zI2 && this.f794h.equals(jnVar.f794h))) {
            return false;
        }
        boolean zJ = j();
        boolean zJ2 = jnVar.j();
        if ((zJ || zJ2) && !(zJ && zJ2 && this.f795i.equals(jnVar.f795i))) {
            return false;
        }
        boolean zK = k();
        boolean zK2 = jnVar.k();
        if ((zK || zK2) && !(zK && zK2 && this.f796j.equals(jnVar.f796j))) {
            return false;
        }
        boolean zL = l();
        boolean zL2 = jnVar.l();
        if ((zL || zL2) && !(zL && zL2 && this.f797k.equals(jnVar.f797k))) {
            return false;
        }
        boolean zM = m();
        boolean zM2 = jnVar.m();
        if ((zM || zM2) && !(zM && zM2 && this.f775a == jnVar.f775a)) {
            return false;
        }
        boolean zN = n();
        boolean zN2 = jnVar.n();
        if ((zN || zN2) && !(zN && zN2 && this.f783b == jnVar.f783b)) {
            return false;
        }
        boolean zO = o();
        boolean zO2 = jnVar.o();
        if ((zO || zO2) && !(zO && zO2 && this.f798l.equals(jnVar.f798l))) {
            return false;
        }
        boolean zP = p();
        boolean zP2 = jnVar.p();
        if ((zP || zP2) && !(zP && zP2 && this.f799m.equals(jnVar.f799m))) {
            return false;
        }
        boolean zQ = q();
        boolean zQ2 = jnVar.q();
        if ((zQ || zQ2) && !(zQ && zQ2 && this.f800n.equals(jnVar.f800n))) {
            return false;
        }
        boolean zR = r();
        boolean zR2 = jnVar.r();
        if ((zR || zR2) && !(zR && zR2 && this.f801o.equals(jnVar.f801o))) {
            return false;
        }
        boolean zS = s();
        boolean zS2 = jnVar.s();
        if ((zS || zS2) && !(zS && zS2 && this.f787c == jnVar.f787c)) {
            return false;
        }
        boolean zT = t();
        boolean zT2 = jnVar.t();
        if ((zT || zT2) && !(zT && zT2 && this.f777a.equals(jnVar.f777a))) {
            return false;
        }
        boolean zU = u();
        boolean zU2 = jnVar.u();
        if ((zU || zU2) && !(zU && zU2 && this.f782a == jnVar.f782a)) {
            return false;
        }
        boolean zV = v();
        boolean zV2 = jnVar.v();
        if ((zV || zV2) && !(zV && zV2 && this.f776a == jnVar.f776a)) {
            return false;
        }
        boolean zW = w();
        boolean zW2 = jnVar.w();
        if ((zW || zW2) && !(zW && zW2 && this.f784b == jnVar.f784b)) {
            return false;
        }
        boolean zX = x();
        boolean zX2 = jnVar.x();
        if ((zX || zX2) && !(zX && zX2 && this.f802p.equals(jnVar.f802p))) {
            return false;
        }
        boolean zY = y();
        boolean zY2 = jnVar.y();
        if ((zY || zY2) && !(zY && zY2 && this.f803q.equals(jnVar.f803q))) {
            return false;
        }
        boolean z10 = z();
        boolean z11 = jnVar.z();
        if ((z10 || z11) && !(z10 && z11 && this.f786b == jnVar.f786b)) {
            return false;
        }
        boolean zA = A();
        boolean zA2 = jnVar.A();
        if ((zA || zA2) && !(zA && zA2 && this.f781a.equals(jnVar.f781a))) {
            return false;
        }
        boolean zB = B();
        boolean zB2 = jnVar.B();
        if ((zB || zB2) && !(zB && zB2 && this.f789c == jnVar.f789c)) {
            return false;
        }
        boolean zC = C();
        boolean zC2 = jnVar.C();
        if (zC || zC2) {
            return zC && zC2 && this.f804r.equals(jnVar.f804r);
        }
        return true;
    }

    public jn b(int i10) {
        this.f783b = i10;
        b(true);
        return this;
    }

    public jn b(String str) {
        this.f788c = str;
        return this;
    }

    public String b() {
        return this.f788c;
    }

    @Override // com.xiaomi.push.jy
    public void b(kj kjVar) throws kk {
        m588a();
        kjVar.a(f774a);
        if (this.f779a != null && m589a()) {
            kjVar.a(f107659a);
            kjVar.a(this.f779a);
            kjVar.b();
        }
        if (this.f778a != null && m591b()) {
            kjVar.a(f107660b);
            this.f778a.b(kjVar);
            kjVar.b();
        }
        if (this.f785b != null) {
            kjVar.a(f107661c);
            kjVar.a(this.f785b);
            kjVar.b();
        }
        if (this.f788c != null) {
            kjVar.a(f107662d);
            kjVar.a(this.f788c);
            kjVar.b();
        }
        if (this.f790d != null && e()) {
            kjVar.a(f107663e);
            kjVar.a(this.f790d);
            kjVar.b();
        }
        if (this.f791e != null && f()) {
            kjVar.a(f107664f);
            kjVar.a(this.f791e);
            kjVar.b();
        }
        if (this.f792f != null) {
            kjVar.a(f107665g);
            kjVar.a(this.f792f);
            kjVar.b();
        }
        if (this.f793g != null && h()) {
            kjVar.a(f107666h);
            kjVar.a(this.f793g);
            kjVar.b();
        }
        if (this.f794h != null && i()) {
            kjVar.a(f107667i);
            kjVar.a(this.f794h);
            kjVar.b();
        }
        if (this.f795i != null && j()) {
            kjVar.a(f107668j);
            kjVar.a(this.f795i);
            kjVar.b();
        }
        if (this.f796j != null && k()) {
            kjVar.a(f107669k);
            kjVar.a(this.f796j);
            kjVar.b();
        }
        if (this.f797k != null && l()) {
            kjVar.a(f107670l);
            kjVar.a(this.f797k);
            kjVar.b();
        }
        if (m()) {
            kjVar.a(f107671m);
            kjVar.mo650a(this.f775a);
            kjVar.b();
        }
        if (n()) {
            kjVar.a(f107672n);
            kjVar.mo650a(this.f783b);
            kjVar.b();
        }
        if (this.f798l != null && o()) {
            kjVar.a(f107673o);
            kjVar.a(this.f798l);
            kjVar.b();
        }
        if (this.f799m != null && p()) {
            kjVar.a(f107674p);
            kjVar.a(this.f799m);
            kjVar.b();
        }
        if (this.f800n != null && q()) {
            kjVar.a(f107675q);
            kjVar.a(this.f800n);
            kjVar.b();
        }
        if (this.f801o != null && r()) {
            kjVar.a(f107676r);
            kjVar.a(this.f801o);
            kjVar.b();
        }
        if (s()) {
            kjVar.a(f107677s);
            kjVar.mo650a(this.f787c);
            kjVar.b();
        }
        if (this.f777a != null && t()) {
            kjVar.a(f107678t);
            kjVar.mo650a(this.f777a.a());
            kjVar.b();
        }
        if (u()) {
            kjVar.a(f107679u);
            kjVar.a(this.f782a);
            kjVar.b();
        }
        if (v()) {
            kjVar.a(f107680v);
            kjVar.a(this.f776a);
            kjVar.b();
        }
        if (w()) {
            kjVar.a(f107681w);
            kjVar.a(this.f784b);
            kjVar.b();
        }
        if (this.f802p != null && x()) {
            kjVar.a(f107682x);
            kjVar.a(this.f802p);
            kjVar.b();
        }
        if (this.f803q != null && y()) {
            kjVar.a(f107683y);
            kjVar.a(this.f803q);
            kjVar.b();
        }
        if (z()) {
            kjVar.a(f107684z);
            kjVar.a(this.f786b);
            kjVar.b();
        }
        if (this.f781a != null && A()) {
            kjVar.a(A);
            kjVar.a(new ki((byte) 11, (byte) 11, this.f781a.size()));
            for (Map.Entry<String, String> entry : this.f781a.entrySet()) {
                kjVar.a(entry.getKey());
                kjVar.a(entry.getValue());
            }
            kjVar.d();
            kjVar.b();
        }
        if (B()) {
            kjVar.a(B);
            kjVar.a(this.f789c);
            kjVar.b();
        }
        if (this.f804r != null && C()) {
            kjVar.a(C);
            kjVar.a(this.f804r);
            kjVar.b();
        }
        kjVar.c();
        kjVar.mo649a();
    }

    public void b(boolean z10) {
        this.f780a.set(1, z10);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m591b() {
        return this.f778a != null;
    }

    public jn c(int i10) {
        this.f787c = i10;
        c(true);
        return this;
    }

    public jn c(String str) {
        this.f790d = str;
        return this;
    }

    public String c() {
        return this.f792f;
    }

    public void c(boolean z10) {
        this.f780a.set(2, z10);
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m592c() {
        return this.f785b != null;
    }

    public jn d(String str) {
        this.f791e = str;
        return this;
    }

    public void d(boolean z10) {
        this.f780a.set(3, z10);
    }

    public boolean d() {
        return this.f788c != null;
    }

    public jn e(String str) {
        this.f792f = str;
        return this;
    }

    public void e(boolean z10) {
        this.f780a.set(4, z10);
    }

    public boolean e() {
        return this.f790d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jn)) {
            return m590a((jn) obj);
        }
        return false;
    }

    public jn f(String str) {
        this.f793g = str;
        return this;
    }

    public void f(boolean z10) {
        this.f780a.set(5, z10);
    }

    public boolean f() {
        return this.f791e != null;
    }

    public jn g(String str) {
        this.f794h = str;
        return this;
    }

    public void g(boolean z10) {
        this.f780a.set(6, z10);
    }

    public boolean g() {
        return this.f792f != null;
    }

    public jn h(String str) {
        this.f797k = str;
        return this;
    }

    public void h(boolean z10) {
        this.f780a.set(7, z10);
    }

    public boolean h() {
        return this.f793g != null;
    }

    public int hashCode() {
        return 0;
    }

    public jn i(String str) {
        this.f801o = str;
        return this;
    }

    public boolean i() {
        return this.f794h != null;
    }

    public boolean j() {
        return this.f795i != null;
    }

    public boolean k() {
        return this.f796j != null;
    }

    public boolean l() {
        return this.f797k != null;
    }

    public boolean m() {
        return this.f780a.get(0);
    }

    public boolean n() {
        return this.f780a.get(1);
    }

    public boolean o() {
        return this.f798l != null;
    }

    public boolean p() {
        return this.f799m != null;
    }

    public boolean q() {
        return this.f800n != null;
    }

    public boolean r() {
        return this.f801o != null;
    }

    public boolean s() {
        return this.f780a.get(2);
    }

    public boolean t() {
        return this.f777a != null;
    }

    public String toString() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("XmPushActionRegistration(");
        boolean z11 = false;
        if (m589a()) {
            sb2.append("debug:");
            String str = this.f779a;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            z10 = false;
        } else {
            z10 = true;
        }
        if (m591b()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append("target:");
            jc jcVar = this.f778a;
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
        String str2 = this.f785b;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(com.xiaomi.push.service.bc.a(str2));
        }
        sb2.append(", ");
        sb2.append("appId:");
        String str3 = this.f788c;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        if (e()) {
            sb2.append(", ");
            sb2.append("appVersion:");
            String str4 = this.f790d;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (f()) {
            sb2.append(", ");
            sb2.append("packageName:");
            String str5 = this.f791e;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        sb2.append(", ");
        sb2.append("token:");
        String str6 = this.f792f;
        if (str6 == null) {
            sb2.append("null");
        } else {
            sb2.append(str6);
        }
        if (h()) {
            sb2.append(", ");
            sb2.append("deviceId:");
            String str7 = this.f793g;
            if (str7 == null) {
                sb2.append("null");
            } else {
                sb2.append(str7);
            }
        }
        if (i()) {
            sb2.append(", ");
            sb2.append("aliasName:");
            String str8 = this.f794h;
            if (str8 == null) {
                sb2.append("null");
            } else {
                sb2.append(str8);
            }
        }
        if (j()) {
            sb2.append(", ");
            sb2.append("sdkVersion:");
            String str9 = this.f795i;
            if (str9 == null) {
                sb2.append("null");
            } else {
                sb2.append(str9);
            }
        }
        if (k()) {
            sb2.append(", ");
            sb2.append("regId:");
            String str10 = this.f796j;
            if (str10 == null) {
                sb2.append("null");
            } else {
                sb2.append(str10);
            }
        }
        if (l()) {
            sb2.append(", ");
            sb2.append("pushSdkVersionName:");
            String str11 = this.f797k;
            if (str11 == null) {
                sb2.append("null");
            } else {
                sb2.append(str11);
            }
        }
        if (m()) {
            sb2.append(", ");
            sb2.append("pushSdkVersionCode:");
            sb2.append(this.f775a);
        }
        if (n()) {
            sb2.append(", ");
            sb2.append("appVersionCode:");
            sb2.append(this.f783b);
        }
        if (o()) {
            sb2.append(", ");
            sb2.append("androidId:");
            String str12 = this.f798l;
            if (str12 == null) {
                sb2.append("null");
            } else {
                sb2.append(str12);
            }
        }
        if (p()) {
            sb2.append(", ");
            sb2.append("imei:");
            String str13 = this.f799m;
            if (str13 == null) {
                sb2.append("null");
            } else {
                sb2.append(str13);
            }
        }
        if (q()) {
            sb2.append(", ");
            sb2.append("serial:");
            String str14 = this.f800n;
            if (str14 == null) {
                sb2.append("null");
            } else {
                sb2.append(str14);
            }
        }
        if (r()) {
            sb2.append(", ");
            sb2.append("imeiMd5:");
            String str15 = this.f801o;
            if (str15 == null) {
                sb2.append("null");
            } else {
                sb2.append(str15);
            }
        }
        if (s()) {
            sb2.append(", ");
            sb2.append("spaceId:");
            sb2.append(this.f787c);
        }
        if (t()) {
            sb2.append(", ");
            sb2.append("reason:");
            jb jbVar = this.f777a;
            if (jbVar == null) {
                sb2.append("null");
            } else {
                sb2.append(jbVar);
            }
        }
        if (u()) {
            sb2.append(", ");
            sb2.append("validateToken:");
            sb2.append(this.f782a);
        }
        if (v()) {
            sb2.append(", ");
            sb2.append("miid:");
            sb2.append(this.f776a);
        }
        if (w()) {
            sb2.append(", ");
            sb2.append("createdTs:");
            sb2.append(this.f784b);
        }
        if (x()) {
            sb2.append(", ");
            sb2.append("subImei:");
            String str16 = this.f802p;
            if (str16 == null) {
                sb2.append("null");
            } else {
                sb2.append(str16);
            }
        }
        if (y()) {
            sb2.append(", ");
            sb2.append("subImeiMd5:");
            String str17 = this.f803q;
            if (str17 == null) {
                sb2.append("null");
            } else {
                sb2.append(str17);
            }
        }
        if (z()) {
            sb2.append(", ");
            sb2.append("isHybridFrame:");
            sb2.append(this.f786b);
        }
        if (A()) {
            sb2.append(", ");
            sb2.append("connectionAttrs:");
            Map<String, String> map = this.f781a;
            if (map == null) {
                sb2.append("null");
            } else {
                sb2.append(map);
            }
        }
        if (B()) {
            sb2.append(", ");
            sb2.append("cleanOldRegInfo:");
            sb2.append(this.f789c);
        }
        if (C()) {
            sb2.append(", ");
            sb2.append("oldRegId:");
            String str18 = this.f804r;
            if (str18 == null) {
                sb2.append("null");
            } else {
                sb2.append(str18);
            }
        }
        sb2.append(")");
        return sb2.toString();
    }

    public boolean u() {
        return this.f780a.get(3);
    }

    public boolean v() {
        return this.f780a.get(4);
    }

    public boolean w() {
        return this.f780a.get(5);
    }

    public boolean x() {
        return this.f802p != null;
    }

    public boolean y() {
        return this.f803q != null;
    }

    public boolean z() {
        return this.f780a.get(6);
    }
}
