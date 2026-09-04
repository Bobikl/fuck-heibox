package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* JADX INFO: loaded from: classes4.dex */
public class gf implements jy<gf, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public byte f454a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f455a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f456a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f457a = new BitSet(6);

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public int f458b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f459b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public int f460c;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f461c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public int f462d;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f463d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public int f464e;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final ko f453a = new ko("StatsEvent");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final kg f107198a = new kg("", (byte) 3, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final kg f107199b = new kg("", (byte) 8, 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final kg f107200c = new kg("", (byte) 8, 3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final kg f107201d = new kg("", (byte) 11, 4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final kg f107202e = new kg("", (byte) 11, 5);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final kg f107203f = new kg("", (byte) 8, 6);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final kg f107204g = new kg("", (byte) 11, 7);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final kg f107205h = new kg("", (byte) 11, 8);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final kg f107206i = new kg("", (byte) 8, 9);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final kg f107207j = new kg("", (byte) 8, 10);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(gf gfVar) {
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
        if (!getClass().equals(gfVar.getClass())) {
            return getClass().getName().compareTo(gfVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m400a()).compareTo(Boolean.valueOf(gfVar.m400a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m400a() && (iA10 = jz.a(this.f454a, gfVar.f454a)) != 0) {
            return iA10;
        }
        int iCompareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(gfVar.b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (b() && (iA9 = jz.a(this.f455a, gfVar.f455a)) != 0) {
            return iA9;
        }
        int iCompareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(gfVar.c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (c() && (iA8 = jz.a(this.f458b, gfVar.f458b)) != 0) {
            return iA8;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(gfVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iA7 = jz.a(this.f456a, gfVar.f456a)) != 0) {
            return iA7;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(gfVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iA6 = jz.a(this.f459b, gfVar.f459b)) != 0) {
            return iA6;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(gfVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iA5 = jz.a(this.f460c, gfVar.f460c)) != 0) {
            return iA5;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(gfVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iA4 = jz.a(this.f461c, gfVar.f461c)) != 0) {
            return iA4;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(gfVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iA3 = jz.a(this.f463d, gfVar.f463d)) != 0) {
            return iA3;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(gfVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (i() && (iA2 = jz.a(this.f462d, gfVar.f462d)) != 0) {
            return iA2;
        }
        int iCompareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(gfVar.j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (!j() || (iA = jz.a(this.f464e, gfVar.f464e)) == 0) {
            return 0;
        }
        return iA;
    }

    public gf a(byte b10) {
        this.f454a = b10;
        a(true);
        return this;
    }

    public gf a(int i10) {
        this.f455a = i10;
        b(true);
        return this;
    }

    public gf a(String str) {
        this.f456a = str;
        return this;
    }

    public void a() throws kk {
        if (this.f456a != null) {
            return;
        }
        throw new kk("Required field 'connpt' was not present! Struct: " + toString());
    }

    @Override // com.xiaomi.push.jy
    public void a(kj kjVar) throws kk {
        kjVar.mo645a();
        while (true) {
            kg kgVarMo641a = kjVar.mo641a();
            byte b10 = kgVarMo641a.f107793a;
            if (b10 == 0) {
                kjVar.f();
                if (!m400a()) {
                    throw new kk("Required field 'chid' was not found in serialized data! Struct: " + toString());
                }
                if (!b()) {
                    throw new kk("Required field 'type' was not found in serialized data! Struct: " + toString());
                }
                if (c()) {
                    a();
                    return;
                }
                throw new kk("Required field 'value' was not found in serialized data! Struct: " + toString());
            }
            switch (kgVarMo641a.f925a) {
                case 1:
                    if (b10 != 3) {
                        km.a(kjVar, b10);
                    } else {
                        this.f454a = kjVar.a();
                        a(true);
                    }
                    break;
                case 2:
                    if (b10 != 8) {
                        km.a(kjVar, b10);
                    } else {
                        this.f455a = kjVar.mo639a();
                        b(true);
                    }
                    break;
                case 3:
                    if (b10 != 8) {
                        km.a(kjVar, b10);
                    } else {
                        this.f458b = kjVar.mo639a();
                        c(true);
                    }
                    break;
                case 4:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f456a = kjVar.mo646a();
                    }
                    break;
                case 5:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f459b = kjVar.mo646a();
                    }
                    break;
                case 6:
                    if (b10 != 8) {
                        km.a(kjVar, b10);
                    } else {
                        this.f460c = kjVar.mo639a();
                        d(true);
                    }
                    break;
                case 7:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f461c = kjVar.mo646a();
                    }
                    break;
                case 8:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f463d = kjVar.mo646a();
                    }
                    break;
                case 9:
                    if (b10 != 8) {
                        km.a(kjVar, b10);
                    } else {
                        this.f462d = kjVar.mo639a();
                        e(true);
                    }
                    break;
                case 10:
                    if (b10 != 8) {
                        km.a(kjVar, b10);
                    } else {
                        this.f464e = kjVar.mo639a();
                        f(true);
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
        this.f457a.set(0, z10);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m400a() {
        return this.f457a.get(0);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m401a(gf gfVar) {
        if (gfVar == null || this.f454a != gfVar.f454a || this.f455a != gfVar.f455a || this.f458b != gfVar.f458b) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = gfVar.d();
        if ((zD || zD2) && !(zD && zD2 && this.f456a.equals(gfVar.f456a))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = gfVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.f459b.equals(gfVar.f459b))) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = gfVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f460c == gfVar.f460c)) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = gfVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f461c.equals(gfVar.f461c))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = gfVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f463d.equals(gfVar.f463d))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = gfVar.i();
        if ((zI || zI2) && !(zI && zI2 && this.f462d == gfVar.f462d)) {
            return false;
        }
        boolean zJ = j();
        boolean zJ2 = gfVar.j();
        if (zJ || zJ2) {
            return zJ && zJ2 && this.f464e == gfVar.f464e;
        }
        return true;
    }

    public gf b(int i10) {
        this.f458b = i10;
        c(true);
        return this;
    }

    public gf b(String str) {
        this.f459b = str;
        return this;
    }

    @Override // com.xiaomi.push.jy
    public void b(kj kjVar) {
        a();
        kjVar.a(f453a);
        kjVar.a(f107198a);
        kjVar.a(this.f454a);
        kjVar.b();
        kjVar.a(f107199b);
        kjVar.mo650a(this.f455a);
        kjVar.b();
        kjVar.a(f107200c);
        kjVar.mo650a(this.f458b);
        kjVar.b();
        if (this.f456a != null) {
            kjVar.a(f107201d);
            kjVar.a(this.f456a);
            kjVar.b();
        }
        if (this.f459b != null && e()) {
            kjVar.a(f107202e);
            kjVar.a(this.f459b);
            kjVar.b();
        }
        if (f()) {
            kjVar.a(f107203f);
            kjVar.mo650a(this.f460c);
            kjVar.b();
        }
        if (this.f461c != null && g()) {
            kjVar.a(f107204g);
            kjVar.a(this.f461c);
            kjVar.b();
        }
        if (this.f463d != null && h()) {
            kjVar.a(f107205h);
            kjVar.a(this.f463d);
            kjVar.b();
        }
        if (i()) {
            kjVar.a(f107206i);
            kjVar.mo650a(this.f462d);
            kjVar.b();
        }
        if (j()) {
            kjVar.a(f107207j);
            kjVar.mo650a(this.f464e);
            kjVar.b();
        }
        kjVar.c();
        kjVar.mo649a();
    }

    public void b(boolean z10) {
        this.f457a.set(1, z10);
    }

    public boolean b() {
        return this.f457a.get(1);
    }

    public gf c(int i10) {
        this.f460c = i10;
        d(true);
        return this;
    }

    public gf c(String str) {
        this.f461c = str;
        return this;
    }

    public void c(boolean z10) {
        this.f457a.set(2, z10);
    }

    public boolean c() {
        return this.f457a.get(2);
    }

    public gf d(int i10) {
        this.f462d = i10;
        e(true);
        return this;
    }

    public gf d(String str) {
        this.f463d = str;
        return this;
    }

    public void d(boolean z10) {
        this.f457a.set(3, z10);
    }

    public boolean d() {
        return this.f456a != null;
    }

    public void e(boolean z10) {
        this.f457a.set(4, z10);
    }

    public boolean e() {
        return this.f459b != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof gf)) {
            return m401a((gf) obj);
        }
        return false;
    }

    public void f(boolean z10) {
        this.f457a.set(5, z10);
    }

    public boolean f() {
        return this.f457a.get(3);
    }

    public boolean g() {
        return this.f461c != null;
    }

    public boolean h() {
        return this.f463d != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f457a.get(4);
    }

    public boolean j() {
        return this.f457a.get(5);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("StatsEvent(");
        sb2.append("chid:");
        sb2.append((int) this.f454a);
        sb2.append(", ");
        sb2.append("type:");
        sb2.append(this.f455a);
        sb2.append(", ");
        sb2.append("value:");
        sb2.append(this.f458b);
        sb2.append(", ");
        sb2.append("connpt:");
        String str = this.f456a;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        if (e()) {
            sb2.append(", ");
            sb2.append("host:");
            String str2 = this.f459b;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        if (f()) {
            sb2.append(", ");
            sb2.append("subvalue:");
            sb2.append(this.f460c);
        }
        if (g()) {
            sb2.append(", ");
            sb2.append("annotation:");
            String str3 = this.f461c;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        if (h()) {
            sb2.append(", ");
            sb2.append("user:");
            String str4 = this.f463d;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (i()) {
            sb2.append(", ");
            sb2.append("time:");
            sb2.append(this.f462d);
        }
        if (j()) {
            sb2.append(", ");
            sb2.append("clientIp:");
            sb2.append(this.f464e);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
