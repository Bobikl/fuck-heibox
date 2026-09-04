package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* JADX INFO: loaded from: classes4.dex */
public class ju implements jy<ju, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f885a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public jc f886a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f887a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f888a = new BitSet(3);

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public long f889b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f890b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public long f891c;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f892c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f893d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public String f894e;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final ko f884a = new ko("XmPushActionUnRegistrationResult");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final kg f107753a = new kg("", (byte) 11, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final kg f107754b = new kg("", (byte) 12, 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final kg f107755c = new kg("", (byte) 11, 3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final kg f107756d = new kg("", (byte) 11, 4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final kg f107757e = new kg("", (byte) 10, 6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final kg f107758f = new kg("", (byte) 11, 7);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final kg f107759g = new kg("", (byte) 11, 8);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final kg f107760h = new kg("", (byte) 10, 9);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final kg f107761i = new kg("", (byte) 10, 10);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ju juVar) {
        int iA;
        int iA2;
        int iA3;
        int iA4;
        int iA5;
        int iA6;
        int iA7;
        int iA8;
        int iA9;
        if (!getClass().equals(juVar.getClass())) {
            return getClass().getName().compareTo(juVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m621a()).compareTo(Boolean.valueOf(juVar.m621a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m621a() && (iA9 = jz.a(this.f887a, juVar.f887a)) != 0) {
            return iA9;
        }
        int iCompareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(juVar.b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (b() && (iA8 = jz.a(this.f886a, juVar.f886a)) != 0) {
            return iA8;
        }
        int iCompareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(juVar.c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (c() && (iA7 = jz.a(this.f890b, juVar.f890b)) != 0) {
            return iA7;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(juVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iA6 = jz.a(this.f892c, juVar.f892c)) != 0) {
            return iA6;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(juVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iA5 = jz.a(this.f885a, juVar.f885a)) != 0) {
            return iA5;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(juVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iA4 = jz.a(this.f893d, juVar.f893d)) != 0) {
            return iA4;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(juVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iA3 = jz.a(this.f894e, juVar.f894e)) != 0) {
            return iA3;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(juVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iA2 = jz.a(this.f889b, juVar.f889b)) != 0) {
            return iA2;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(juVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (!i() || (iA = jz.a(this.f891c, juVar.f891c)) == 0) {
            return 0;
        }
        return iA;
    }

    public String a() {
        return this.f894e;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m620a() throws kk {
        if (this.f890b == null) {
            throw new kk("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f892c != null) {
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
                    m620a();
                    return;
                }
                throw new kk("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
            }
            switch (kgVarMo641a.f925a) {
                case 1:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f887a = kjVar.mo646a();
                    }
                    break;
                case 2:
                    if (b10 != 12) {
                        km.a(kjVar, b10);
                    } else {
                        jc jcVar = new jc();
                        this.f886a = jcVar;
                        jcVar.a(kjVar);
                    }
                    break;
                case 3:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f890b = kjVar.mo646a();
                    }
                    break;
                case 4:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f892c = kjVar.mo646a();
                    }
                    break;
                case 5:
                default:
                    km.a(kjVar, b10);
                    break;
                case 6:
                    if (b10 != 10) {
                        km.a(kjVar, b10);
                    } else {
                        this.f885a = kjVar.mo640a();
                        a(true);
                    }
                    break;
                case 7:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f893d = kjVar.mo646a();
                    }
                    break;
                case 8:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f894e = kjVar.mo646a();
                    }
                    break;
                case 9:
                    if (b10 != 10) {
                        km.a(kjVar, b10);
                    } else {
                        this.f889b = kjVar.mo640a();
                        b(true);
                    }
                    break;
                case 10:
                    if (b10 != 10) {
                        km.a(kjVar, b10);
                    } else {
                        this.f891c = kjVar.mo640a();
                        c(true);
                    }
                    break;
            }
            kjVar.g();
        }
    }

    public void a(boolean z10) {
        this.f888a.set(0, z10);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m621a() {
        return this.f887a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m622a(ju juVar) {
        if (juVar == null) {
            return false;
        }
        boolean zM621a = m621a();
        boolean zM621a2 = juVar.m621a();
        if ((zM621a || zM621a2) && !(zM621a && zM621a2 && this.f887a.equals(juVar.f887a))) {
            return false;
        }
        boolean zB = b();
        boolean zB2 = juVar.b();
        if ((zB || zB2) && !(zB && zB2 && this.f886a.m542a(juVar.f886a))) {
            return false;
        }
        boolean zC = c();
        boolean zC2 = juVar.c();
        if ((zC || zC2) && !(zC && zC2 && this.f890b.equals(juVar.f890b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = juVar.d();
        if (((zD || zD2) && !(zD && zD2 && this.f892c.equals(juVar.f892c))) || this.f885a != juVar.f885a) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = juVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f893d.equals(juVar.f893d))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = juVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f894e.equals(juVar.f894e))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = juVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f889b == juVar.f889b)) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = juVar.i();
        if (zI || zI2) {
            return zI && zI2 && this.f891c == juVar.f891c;
        }
        return true;
    }

    @Override // com.xiaomi.push.jy
    public void b(kj kjVar) throws kk {
        m620a();
        kjVar.a(f884a);
        if (this.f887a != null && m621a()) {
            kjVar.a(f107753a);
            kjVar.a(this.f887a);
            kjVar.b();
        }
        if (this.f886a != null && b()) {
            kjVar.a(f107754b);
            this.f886a.b(kjVar);
            kjVar.b();
        }
        if (this.f890b != null) {
            kjVar.a(f107755c);
            kjVar.a(this.f890b);
            kjVar.b();
        }
        if (this.f892c != null) {
            kjVar.a(f107756d);
            kjVar.a(this.f892c);
            kjVar.b();
        }
        kjVar.a(f107757e);
        kjVar.a(this.f885a);
        kjVar.b();
        if (this.f893d != null && f()) {
            kjVar.a(f107758f);
            kjVar.a(this.f893d);
            kjVar.b();
        }
        if (this.f894e != null && g()) {
            kjVar.a(f107759g);
            kjVar.a(this.f894e);
            kjVar.b();
        }
        if (h()) {
            kjVar.a(f107760h);
            kjVar.a(this.f889b);
            kjVar.b();
        }
        if (i()) {
            kjVar.a(f107761i);
            kjVar.a(this.f891c);
            kjVar.b();
        }
        kjVar.c();
        kjVar.mo649a();
    }

    public void b(boolean z10) {
        this.f888a.set(1, z10);
    }

    public boolean b() {
        return this.f886a != null;
    }

    public void c(boolean z10) {
        this.f888a.set(2, z10);
    }

    public boolean c() {
        return this.f890b != null;
    }

    public boolean d() {
        return this.f892c != null;
    }

    public boolean e() {
        return this.f888a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ju)) {
            return m622a((ju) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f893d != null;
    }

    public boolean g() {
        return this.f894e != null;
    }

    public boolean h() {
        return this.f888a.get(1);
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f888a.get(2);
    }

    public String toString() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("XmPushActionUnRegistrationResult(");
        boolean z11 = false;
        if (m621a()) {
            sb2.append("debug:");
            String str = this.f887a;
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
            jc jcVar = this.f886a;
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
        String str2 = this.f890b;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(", ");
        sb2.append("appId:");
        String str3 = this.f892c;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(", ");
        sb2.append("errorCode:");
        sb2.append(this.f885a);
        if (f()) {
            sb2.append(", ");
            sb2.append("reason:");
            String str4 = this.f893d;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (g()) {
            sb2.append(", ");
            sb2.append("packageName:");
            String str5 = this.f894e;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (h()) {
            sb2.append(", ");
            sb2.append("unRegisteredAt:");
            sb2.append(this.f889b);
        }
        if (i()) {
            sb2.append(", ");
            sb2.append("costTime:");
            sb2.append(this.f891c);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
