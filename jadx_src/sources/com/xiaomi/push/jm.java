package com.xiaomi.push;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class jm implements jy<jm, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f758a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public jc f759a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f760a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public ByteBuffer f761a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f762a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public Map<String, String> f763a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f764a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f765b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public boolean f766b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f767c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f768d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public String f769e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public String f770f;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    public String f771g;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    public String f772h;

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    public String f773i;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final ko f757a = new ko("XmPushActionNotification");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final kg f107644a = new kg("", (byte) 11, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final kg f107645b = new kg("", (byte) 12, 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final kg f107646c = new kg("", (byte) 11, 3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final kg f107647d = new kg("", (byte) 11, 4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final kg f107648e = new kg("", (byte) 11, 5);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final kg f107649f = new kg("", (byte) 2, 6);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final kg f107650g = new kg("", (byte) 11, 7);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final kg f107651h = new kg("", (byte) 13, 8);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final kg f107652i = new kg("", (byte) 11, 9);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final kg f107653j = new kg("", (byte) 11, 10);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final kg f107654k = new kg("", (byte) 11, 12);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final kg f107655l = new kg("", (byte) 11, 13);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final kg f107656m = new kg("", (byte) 11, 14);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final kg f107657n = new kg("", (byte) 10, 15);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final kg f107658o = new kg("", (byte) 2, 20);

    public jm() {
        this.f762a = new BitSet(3);
        this.f764a = true;
        this.f766b = false;
    }

    public jm(String str, boolean z10) {
        this();
        this.f765b = str;
        this.f764a = z10;
        m582a(true);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(jm jmVar) {
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
        if (!getClass().equals(jmVar.getClass())) {
            return getClass().getName().compareTo(jmVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m583a()).compareTo(Boolean.valueOf(jmVar.m583a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m583a() && (iA15 = jz.a(this.f760a, jmVar.f760a)) != 0) {
            return iA15;
        }
        int iCompareTo2 = Boolean.valueOf(m586b()).compareTo(Boolean.valueOf(jmVar.m586b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m586b() && (iA14 = jz.a(this.f759a, jmVar.f759a)) != 0) {
            return iA14;
        }
        int iCompareTo3 = Boolean.valueOf(m587c()).compareTo(Boolean.valueOf(jmVar.m587c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m587c() && (iA13 = jz.a(this.f765b, jmVar.f765b)) != 0) {
            return iA13;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jmVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iA12 = jz.a(this.f767c, jmVar.f767c)) != 0) {
            return iA12;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jmVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iA11 = jz.a(this.f768d, jmVar.f768d)) != 0) {
            return iA11;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jmVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iA10 = jz.a(this.f764a, jmVar.f764a)) != 0) {
            return iA10;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jmVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iA9 = jz.a(this.f769e, jmVar.f769e)) != 0) {
            return iA9;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jmVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iA8 = jz.a(this.f763a, jmVar.f763a)) != 0) {
            return iA8;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jmVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (i() && (iA7 = jz.a(this.f770f, jmVar.f770f)) != 0) {
            return iA7;
        }
        int iCompareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(jmVar.j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (j() && (iA6 = jz.a(this.f771g, jmVar.f771g)) != 0) {
            return iA6;
        }
        int iCompareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(jmVar.k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (k() && (iA5 = jz.a(this.f772h, jmVar.f772h)) != 0) {
            return iA5;
        }
        int iCompareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(jmVar.l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (l() && (iA4 = jz.a(this.f773i, jmVar.f773i)) != 0) {
            return iA4;
        }
        int iCompareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(jmVar.m()));
        if (iCompareTo13 != 0) {
            return iCompareTo13;
        }
        if (m() && (iA3 = jz.a(this.f761a, jmVar.f761a)) != 0) {
            return iA3;
        }
        int iCompareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(jmVar.n()));
        if (iCompareTo14 != 0) {
            return iCompareTo14;
        }
        if (n() && (iA2 = jz.a(this.f758a, jmVar.f758a)) != 0) {
            return iA2;
        }
        int iCompareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(jmVar.o()));
        if (iCompareTo15 != 0) {
            return iCompareTo15;
        }
        if (!o() || (iA = jz.a(this.f766b, jmVar.f766b)) == 0) {
            return 0;
        }
        return iA;
    }

    public jc a() {
        return this.f759a;
    }

    public jm a(String str) {
        this.f765b = str;
        return this;
    }

    public jm a(ByteBuffer byteBuffer) {
        this.f761a = byteBuffer;
        return this;
    }

    public jm a(Map<String, String> map) {
        this.f763a = map;
        return this;
    }

    public jm a(boolean z10) {
        this.f764a = z10;
        m582a(true);
        return this;
    }

    public jm a(byte[] bArr) {
        a(ByteBuffer.wrap(bArr));
        return this;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m579a() {
        return this.f765b;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public Map<String, String> m580a() {
        return this.f763a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m581a() throws kk {
        if (this.f765b != null) {
            return;
        }
        throw new kk("Required field 'id' was not present! Struct: " + toString());
    }

    @Override // com.xiaomi.push.jy
    public void a(kj kjVar) throws kk {
        kjVar.mo645a();
        while (true) {
            kg kgVarMo641a = kjVar.mo641a();
            byte b10 = kgVarMo641a.f107793a;
            if (b10 == 0) {
                kjVar.f();
                if (f()) {
                    m581a();
                    return;
                }
                throw new kk("Required field 'requireAck' was not found in serialized data! Struct: " + toString());
            }
            switch (kgVarMo641a.f925a) {
                case 1:
                    if (b10 == 11) {
                        this.f760a = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 2:
                    if (b10 == 12) {
                        jc jcVar = new jc();
                        this.f759a = jcVar;
                        jcVar.a(kjVar);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 3:
                    if (b10 == 11) {
                        this.f765b = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 4:
                    if (b10 == 11) {
                        this.f767c = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 5:
                    if (b10 == 11) {
                        this.f768d = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 6:
                    if (b10 == 2) {
                        this.f764a = kjVar.mo651a();
                        m582a(true);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 7:
                    if (b10 == 11) {
                        this.f769e = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 8:
                    if (b10 == 13) {
                        ki kiVarMo643a = kjVar.mo643a();
                        this.f763a = new HashMap(kiVarMo643a.f927a * 2);
                        for (int i10 = 0; i10 < kiVarMo643a.f927a; i10++) {
                            this.f763a.put(kjVar.mo646a(), kjVar.mo646a());
                        }
                        kjVar.h();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 9:
                    if (b10 == 11) {
                        this.f770f = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 10:
                    if (b10 == 11) {
                        this.f771g = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 11:
                case 16:
                case 17:
                case 18:
                case 19:
                default:
                    km.a(kjVar, b10);
                    break;
                case 12:
                    if (b10 == 11) {
                        this.f772h = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 13:
                    if (b10 == 11) {
                        this.f773i = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 14:
                    if (b10 == 11) {
                        this.f761a = kjVar.mo647a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 15:
                    if (b10 == 10) {
                        this.f758a = kjVar.mo640a();
                        b(true);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 20:
                    if (b10 == 2) {
                        this.f766b = kjVar.mo651a();
                        c(true);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
            }
            kjVar.g();
        }
    }

    public void a(String str, String str2) {
        if (this.f763a == null) {
            this.f763a = new HashMap();
        }
        this.f763a.put(str, str2);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m582a(boolean z10) {
        this.f762a.set(0, z10);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m583a() {
        return this.f760a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m584a(jm jmVar) {
        if (jmVar == null) {
            return false;
        }
        boolean zM583a = m583a();
        boolean zM583a2 = jmVar.m583a();
        if ((zM583a || zM583a2) && !(zM583a && zM583a2 && this.f760a.equals(jmVar.f760a))) {
            return false;
        }
        boolean zM586b = m586b();
        boolean zM586b2 = jmVar.m586b();
        if ((zM586b || zM586b2) && !(zM586b && zM586b2 && this.f759a.m542a(jmVar.f759a))) {
            return false;
        }
        boolean zM587c = m587c();
        boolean zM587c2 = jmVar.m587c();
        if ((zM587c || zM587c2) && !(zM587c && zM587c2 && this.f765b.equals(jmVar.f765b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = jmVar.d();
        if ((zD || zD2) && !(zD && zD2 && this.f767c.equals(jmVar.f767c))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = jmVar.e();
        if (((zE || zE2) && !(zE && zE2 && this.f768d.equals(jmVar.f768d))) || this.f764a != jmVar.f764a) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = jmVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f769e.equals(jmVar.f769e))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = jmVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f763a.equals(jmVar.f763a))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = jmVar.i();
        if ((zI || zI2) && !(zI && zI2 && this.f770f.equals(jmVar.f770f))) {
            return false;
        }
        boolean zJ = j();
        boolean zJ2 = jmVar.j();
        if ((zJ || zJ2) && !(zJ && zJ2 && this.f771g.equals(jmVar.f771g))) {
            return false;
        }
        boolean zK = k();
        boolean zK2 = jmVar.k();
        if ((zK || zK2) && !(zK && zK2 && this.f772h.equals(jmVar.f772h))) {
            return false;
        }
        boolean zL = l();
        boolean zL2 = jmVar.l();
        if ((zL || zL2) && !(zL && zL2 && this.f773i.equals(jmVar.f773i))) {
            return false;
        }
        boolean zM = m();
        boolean zM2 = jmVar.m();
        if ((zM || zM2) && !(zM && zM2 && this.f761a.equals(jmVar.f761a))) {
            return false;
        }
        boolean zN = n();
        boolean zN2 = jmVar.n();
        if ((zN || zN2) && !(zN && zN2 && this.f758a == jmVar.f758a)) {
            return false;
        }
        boolean zO = o();
        boolean zO2 = jmVar.o();
        if (zO || zO2) {
            return zO && zO2 && this.f766b == jmVar.f766b;
        }
        return true;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public byte[] m585a() {
        a(jz.a(this.f761a));
        return this.f761a.array();
    }

    public jm b(String str) {
        this.f767c = str;
        return this;
    }

    public String b() {
        return this.f767c;
    }

    @Override // com.xiaomi.push.jy
    public void b(kj kjVar) throws kk {
        m581a();
        kjVar.a(f757a);
        if (this.f760a != null && m583a()) {
            kjVar.a(f107644a);
            kjVar.a(this.f760a);
            kjVar.b();
        }
        if (this.f759a != null && m586b()) {
            kjVar.a(f107645b);
            this.f759a.b(kjVar);
            kjVar.b();
        }
        if (this.f765b != null) {
            kjVar.a(f107646c);
            kjVar.a(this.f765b);
            kjVar.b();
        }
        if (this.f767c != null && d()) {
            kjVar.a(f107647d);
            kjVar.a(this.f767c);
            kjVar.b();
        }
        if (this.f768d != null && e()) {
            kjVar.a(f107648e);
            kjVar.a(this.f768d);
            kjVar.b();
        }
        kjVar.a(f107649f);
        kjVar.a(this.f764a);
        kjVar.b();
        if (this.f769e != null && g()) {
            kjVar.a(f107650g);
            kjVar.a(this.f769e);
            kjVar.b();
        }
        if (this.f763a != null && h()) {
            kjVar.a(f107651h);
            kjVar.a(new ki((byte) 11, (byte) 11, this.f763a.size()));
            for (Map.Entry<String, String> entry : this.f763a.entrySet()) {
                kjVar.a(entry.getKey());
                kjVar.a(entry.getValue());
            }
            kjVar.d();
            kjVar.b();
        }
        if (this.f770f != null && i()) {
            kjVar.a(f107652i);
            kjVar.a(this.f770f);
            kjVar.b();
        }
        if (this.f771g != null && j()) {
            kjVar.a(f107653j);
            kjVar.a(this.f771g);
            kjVar.b();
        }
        if (this.f772h != null && k()) {
            kjVar.a(f107654k);
            kjVar.a(this.f772h);
            kjVar.b();
        }
        if (this.f773i != null && l()) {
            kjVar.a(f107655l);
            kjVar.a(this.f773i);
            kjVar.b();
        }
        if (this.f761a != null && m()) {
            kjVar.a(f107656m);
            kjVar.a(this.f761a);
            kjVar.b();
        }
        if (n()) {
            kjVar.a(f107657n);
            kjVar.a(this.f758a);
            kjVar.b();
        }
        if (o()) {
            kjVar.a(f107658o);
            kjVar.a(this.f766b);
            kjVar.b();
        }
        kjVar.c();
        kjVar.mo649a();
    }

    public void b(boolean z10) {
        this.f762a.set(1, z10);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m586b() {
        return this.f759a != null;
    }

    public jm c(String str) {
        this.f768d = str;
        return this;
    }

    public String c() {
        return this.f770f;
    }

    public void c(boolean z10) {
        this.f762a.set(2, z10);
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m587c() {
        return this.f765b != null;
    }

    public jm d(String str) {
        this.f770f = str;
        return this;
    }

    public boolean d() {
        return this.f767c != null;
    }

    public boolean e() {
        return this.f768d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jm)) {
            return m584a((jm) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f762a.get(0);
    }

    public boolean g() {
        return this.f769e != null;
    }

    public boolean h() {
        return this.f763a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f770f != null;
    }

    public boolean j() {
        return this.f771g != null;
    }

    public boolean k() {
        return this.f772h != null;
    }

    public boolean l() {
        return this.f773i != null;
    }

    public boolean m() {
        return this.f761a != null;
    }

    public boolean n() {
        return this.f762a.get(1);
    }

    public boolean o() {
        return this.f762a.get(2);
    }

    public String toString() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("XmPushActionNotification(");
        boolean z11 = false;
        if (m583a()) {
            sb2.append("debug:");
            String str = this.f760a;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            z10 = false;
        } else {
            z10 = true;
        }
        if (m586b()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append("target:");
            jc jcVar = this.f759a;
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
        String str2 = this.f765b;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        if (d()) {
            sb2.append(", ");
            sb2.append("appId:");
            String str3 = this.f767c;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        if (e()) {
            sb2.append(", ");
            sb2.append("type:");
            String str4 = this.f768d;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        sb2.append(", ");
        sb2.append("requireAck:");
        sb2.append(this.f764a);
        if (g()) {
            sb2.append(", ");
            sb2.append("payload:");
            String str5 = this.f769e;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (h()) {
            sb2.append(", ");
            sb2.append("extra:");
            Map<String, String> map = this.f763a;
            if (map == null) {
                sb2.append("null");
            } else {
                sb2.append(map);
            }
        }
        if (i()) {
            sb2.append(", ");
            sb2.append("packageName:");
            String str6 = this.f770f;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
        }
        if (j()) {
            sb2.append(", ");
            sb2.append("category:");
            String str7 = this.f771g;
            if (str7 == null) {
                sb2.append("null");
            } else {
                sb2.append(str7);
            }
        }
        if (k()) {
            sb2.append(", ");
            sb2.append("regId:");
            String str8 = this.f772h;
            if (str8 == null) {
                sb2.append("null");
            } else {
                sb2.append(str8);
            }
        }
        if (l()) {
            sb2.append(", ");
            sb2.append("aliasName:");
            String str9 = this.f773i;
            if (str9 == null) {
                sb2.append("null");
            } else {
                sb2.append(str9);
            }
        }
        if (m()) {
            sb2.append(", ");
            sb2.append("binaryExtra:");
            ByteBuffer byteBuffer = this.f761a;
            if (byteBuffer == null) {
                sb2.append("null");
            } else {
                jz.a(byteBuffer, sb2);
            }
        }
        if (n()) {
            sb2.append(", ");
            sb2.append("createdTs:");
            sb2.append(this.f758a);
        }
        if (o()) {
            sb2.append(", ");
            sb2.append("alreadyLogClickInXmq:");
            sb2.append(this.f766b);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
