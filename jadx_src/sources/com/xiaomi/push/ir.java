package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class ir implements jy<ir, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f594a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f595a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f596a = new BitSet(3);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public Map<String, String> f597a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f598a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public long f599b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f600b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f601c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f602d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public String f603e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public String f604f;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    public String f605g;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final ko f593a = new ko("ClientUploadDataItem");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final kg f107426a = new kg("", (byte) 11, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final kg f107427b = new kg("", (byte) 11, 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final kg f107428c = new kg("", (byte) 11, 3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final kg f107429d = new kg("", (byte) 10, 4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final kg f107430e = new kg("", (byte) 10, 5);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final kg f107431f = new kg("", (byte) 2, 6);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final kg f107432g = new kg("", (byte) 11, 7);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final kg f107433h = new kg("", (byte) 11, 8);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final kg f107434i = new kg("", (byte) 11, 9);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final kg f107435j = new kg("", (byte) 13, 10);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final kg f107436k = new kg("", (byte) 11, 11);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ir irVar) {
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
        if (!getClass().equals(irVar.getClass())) {
            return getClass().getName().compareTo(irVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m491a()).compareTo(Boolean.valueOf(irVar.m491a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m491a() && (iA11 = jz.a(this.f595a, irVar.f595a)) != 0) {
            return iA11;
        }
        int iCompareTo2 = Boolean.valueOf(m493b()).compareTo(Boolean.valueOf(irVar.m493b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m493b() && (iA10 = jz.a(this.f600b, irVar.f600b)) != 0) {
            return iA10;
        }
        int iCompareTo3 = Boolean.valueOf(m494c()).compareTo(Boolean.valueOf(irVar.m494c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m494c() && (iA9 = jz.a(this.f601c, irVar.f601c)) != 0) {
            return iA9;
        }
        int iCompareTo4 = Boolean.valueOf(m495d()).compareTo(Boolean.valueOf(irVar.m495d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m495d() && (iA8 = jz.a(this.f594a, irVar.f594a)) != 0) {
            return iA8;
        }
        int iCompareTo5 = Boolean.valueOf(m496e()).compareTo(Boolean.valueOf(irVar.m496e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m496e() && (iA7 = jz.a(this.f599b, irVar.f599b)) != 0) {
            return iA7;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(irVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iA6 = jz.a(this.f598a, irVar.f598a)) != 0) {
            return iA6;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(irVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iA5 = jz.a(this.f602d, irVar.f602d)) != 0) {
            return iA5;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(irVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iA4 = jz.a(this.f603e, irVar.f603e)) != 0) {
            return iA4;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(irVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (i() && (iA3 = jz.a(this.f604f, irVar.f604f)) != 0) {
            return iA3;
        }
        int iCompareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(irVar.j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (j() && (iA2 = jz.a(this.f597a, irVar.f597a)) != 0) {
            return iA2;
        }
        int iCompareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(irVar.k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (!k() || (iA = jz.a(this.f605g, irVar.f605g)) == 0) {
            return 0;
        }
        return iA;
    }

    public long a() {
        return this.f599b;
    }

    public ir a(long j10) {
        this.f594a = j10;
        m490a(true);
        return this;
    }

    public ir a(String str) {
        this.f595a = str;
        return this;
    }

    public ir a(Map<String, String> map) {
        this.f597a = map;
        return this;
    }

    public ir a(boolean z10) {
        this.f598a = z10;
        c(true);
        return this;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m487a() {
        return this.f595a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public Map<String, String> m488a() {
        return this.f597a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m489a() {
    }

    @Override // com.xiaomi.push.jy
    public void a(kj kjVar) {
        kjVar.mo645a();
        while (true) {
            kg kgVarMo641a = kjVar.mo641a();
            byte b10 = kgVarMo641a.f107793a;
            if (b10 == 0) {
                kjVar.f();
                m489a();
                return;
            }
            switch (kgVarMo641a.f925a) {
                case 1:
                    if (b10 == 11) {
                        this.f595a = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 2:
                    if (b10 == 11) {
                        this.f600b = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 3:
                    if (b10 == 11) {
                        this.f601c = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 4:
                    if (b10 == 10) {
                        this.f594a = kjVar.mo640a();
                        m490a(true);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 5:
                    if (b10 == 10) {
                        this.f599b = kjVar.mo640a();
                        b(true);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 6:
                    if (b10 == 2) {
                        this.f598a = kjVar.mo651a();
                        c(true);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 7:
                    if (b10 == 11) {
                        this.f602d = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 8:
                    if (b10 == 11) {
                        this.f603e = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 9:
                    if (b10 == 11) {
                        this.f604f = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 10:
                    if (b10 == 13) {
                        ki kiVarMo643a = kjVar.mo643a();
                        this.f597a = new HashMap(kiVarMo643a.f927a * 2);
                        for (int i10 = 0; i10 < kiVarMo643a.f927a; i10++) {
                            this.f597a.put(kjVar.mo646a(), kjVar.mo646a());
                        }
                        kjVar.h();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 11:
                    if (b10 == 11) {
                        this.f605g = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                default:
                    km.a(kjVar, b10);
                    break;
            }
            kjVar.g();
        }
    }

    public void a(String str, String str2) {
        if (this.f597a == null) {
            this.f597a = new HashMap();
        }
        this.f597a.put(str, str2);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m490a(boolean z10) {
        this.f596a.set(0, z10);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m491a() {
        return this.f595a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m492a(ir irVar) {
        if (irVar == null) {
            return false;
        }
        boolean zM491a = m491a();
        boolean zM491a2 = irVar.m491a();
        if ((zM491a || zM491a2) && !(zM491a && zM491a2 && this.f595a.equals(irVar.f595a))) {
            return false;
        }
        boolean zM493b = m493b();
        boolean zM493b2 = irVar.m493b();
        if ((zM493b || zM493b2) && !(zM493b && zM493b2 && this.f600b.equals(irVar.f600b))) {
            return false;
        }
        boolean zM494c = m494c();
        boolean zM494c2 = irVar.m494c();
        if ((zM494c || zM494c2) && !(zM494c && zM494c2 && this.f601c.equals(irVar.f601c))) {
            return false;
        }
        boolean zM495d = m495d();
        boolean zM495d2 = irVar.m495d();
        if ((zM495d || zM495d2) && !(zM495d && zM495d2 && this.f594a == irVar.f594a)) {
            return false;
        }
        boolean zM496e = m496e();
        boolean zM496e2 = irVar.m496e();
        if ((zM496e || zM496e2) && !(zM496e && zM496e2 && this.f599b == irVar.f599b)) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = irVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f598a == irVar.f598a)) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = irVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f602d.equals(irVar.f602d))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = irVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f603e.equals(irVar.f603e))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = irVar.i();
        if ((zI || zI2) && !(zI && zI2 && this.f604f.equals(irVar.f604f))) {
            return false;
        }
        boolean zJ = j();
        boolean zJ2 = irVar.j();
        if ((zJ || zJ2) && !(zJ && zJ2 && this.f597a.equals(irVar.f597a))) {
            return false;
        }
        boolean zK = k();
        boolean zK2 = irVar.k();
        if (zK || zK2) {
            return zK && zK2 && this.f605g.equals(irVar.f605g);
        }
        return true;
    }

    public ir b(long j10) {
        this.f599b = j10;
        b(true);
        return this;
    }

    public ir b(String str) {
        this.f600b = str;
        return this;
    }

    public String b() {
        return this.f601c;
    }

    @Override // com.xiaomi.push.jy
    public void b(kj kjVar) {
        m489a();
        kjVar.a(f593a);
        if (this.f595a != null && m491a()) {
            kjVar.a(f107426a);
            kjVar.a(this.f595a);
            kjVar.b();
        }
        if (this.f600b != null && m493b()) {
            kjVar.a(f107427b);
            kjVar.a(this.f600b);
            kjVar.b();
        }
        if (this.f601c != null && m494c()) {
            kjVar.a(f107428c);
            kjVar.a(this.f601c);
            kjVar.b();
        }
        if (m495d()) {
            kjVar.a(f107429d);
            kjVar.a(this.f594a);
            kjVar.b();
        }
        if (m496e()) {
            kjVar.a(f107430e);
            kjVar.a(this.f599b);
            kjVar.b();
        }
        if (f()) {
            kjVar.a(f107431f);
            kjVar.a(this.f598a);
            kjVar.b();
        }
        if (this.f602d != null && g()) {
            kjVar.a(f107432g);
            kjVar.a(this.f602d);
            kjVar.b();
        }
        if (this.f603e != null && h()) {
            kjVar.a(f107433h);
            kjVar.a(this.f603e);
            kjVar.b();
        }
        if (this.f604f != null && i()) {
            kjVar.a(f107434i);
            kjVar.a(this.f604f);
            kjVar.b();
        }
        if (this.f597a != null && j()) {
            kjVar.a(f107435j);
            kjVar.a(new ki((byte) 11, (byte) 11, this.f597a.size()));
            for (Map.Entry<String, String> entry : this.f597a.entrySet()) {
                kjVar.a(entry.getKey());
                kjVar.a(entry.getValue());
            }
            kjVar.d();
            kjVar.b();
        }
        if (this.f605g != null && k()) {
            kjVar.a(f107436k);
            kjVar.a(this.f605g);
            kjVar.b();
        }
        kjVar.c();
        kjVar.mo649a();
    }

    public void b(boolean z10) {
        this.f596a.set(1, z10);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m493b() {
        return this.f600b != null;
    }

    public ir c(String str) {
        this.f601c = str;
        return this;
    }

    public String c() {
        return this.f603e;
    }

    public void c(boolean z10) {
        this.f596a.set(2, z10);
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m494c() {
        return this.f601c != null;
    }

    public ir d(String str) {
        this.f602d = str;
        return this;
    }

    public String d() {
        return this.f604f;
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public boolean m495d() {
        return this.f596a.get(0);
    }

    public ir e(String str) {
        this.f603e = str;
        return this;
    }

    public String e() {
        return this.f605g;
    }

    /* JADX INFO: renamed from: e, reason: collision with other method in class */
    public boolean m496e() {
        return this.f596a.get(1);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ir)) {
            return m492a((ir) obj);
        }
        return false;
    }

    public ir f(String str) {
        this.f604f = str;
        return this;
    }

    public boolean f() {
        return this.f596a.get(2);
    }

    public ir g(String str) {
        this.f605g = str;
        return this;
    }

    public boolean g() {
        return this.f602d != null;
    }

    public boolean h() {
        return this.f603e != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f604f != null;
    }

    public boolean j() {
        return this.f597a != null;
    }

    public boolean k() {
        return this.f605g != null;
    }

    public String toString() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("ClientUploadDataItem(");
        boolean z11 = false;
        if (m491a()) {
            sb2.append("channel:");
            String str = this.f595a;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            z10 = false;
        } else {
            z10 = true;
        }
        if (m493b()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append("data:");
            String str2 = this.f600b;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
            z10 = false;
        }
        if (m494c()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append("name:");
            String str3 = this.f601c;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
            z10 = false;
        }
        if (m495d()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append("counter:");
            sb2.append(this.f594a);
            z10 = false;
        }
        if (m496e()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append("timestamp:");
            sb2.append(this.f599b);
            z10 = false;
        }
        if (f()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append("fromSdk:");
            sb2.append(this.f598a);
            z10 = false;
        }
        if (g()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append("category:");
            String str4 = this.f602d;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
            z10 = false;
        }
        if (h()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append("sourcePackage:");
            String str5 = this.f603e;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
            z10 = false;
        }
        if (i()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append("id:");
            String str6 = this.f604f;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
            z10 = false;
        }
        if (j()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append("extra:");
            Map<String, String> map = this.f597a;
            if (map == null) {
                sb2.append("null");
            } else {
                sb2.append(map);
            }
        } else {
            z11 = z10;
        }
        if (k()) {
            if (!z11) {
                sb2.append(", ");
            }
            sb2.append("pkgName:");
            String str7 = this.f605g;
            if (str7 == null) {
                sb2.append("null");
            } else {
                sb2.append(str7);
            }
        }
        sb2.append(")");
        return sb2.toString();
    }
}
