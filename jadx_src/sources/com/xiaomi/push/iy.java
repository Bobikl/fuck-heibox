package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* JADX INFO: loaded from: classes4.dex */
public class iy implements jy<iy, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f625a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f626a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f627a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f628a = new BitSet(6);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f629a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public int f630b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public boolean f631b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public int f632c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final ko f624a = new ko("OnlineConfigItem");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final kg f107532a = new kg("", (byte) 8, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final kg f107533b = new kg("", (byte) 8, 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final kg f107534c = new kg("", (byte) 2, 3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final kg f107535d = new kg("", (byte) 8, 4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final kg f107536e = new kg("", (byte) 10, 5);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final kg f107537f = new kg("", (byte) 11, 6);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final kg f107538g = new kg("", (byte) 2, 7);

    public int a() {
        return this.f625a;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(iy iyVar) {
        int iA;
        int iA2;
        int iA3;
        int iA4;
        int iA5;
        int iA6;
        int iA7;
        if (!getClass().equals(iyVar.getClass())) {
            return getClass().getName().compareTo(iyVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m507a()).compareTo(Boolean.valueOf(iyVar.m507a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m507a() && (iA7 = jz.a(this.f625a, iyVar.f625a)) != 0) {
            return iA7;
        }
        int iCompareTo2 = Boolean.valueOf(m509b()).compareTo(Boolean.valueOf(iyVar.m509b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m509b() && (iA6 = jz.a(this.f630b, iyVar.f630b)) != 0) {
            return iA6;
        }
        int iCompareTo3 = Boolean.valueOf(m510c()).compareTo(Boolean.valueOf(iyVar.m510c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m510c() && (iA5 = jz.a(this.f629a, iyVar.f629a)) != 0) {
            return iA5;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(iyVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iA4 = jz.a(this.f632c, iyVar.f632c)) != 0) {
            return iA4;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(iyVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iA3 = jz.a(this.f626a, iyVar.f626a)) != 0) {
            return iA3;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(iyVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iA2 = jz.a(this.f627a, iyVar.f627a)) != 0) {
            return iA2;
        }
        int iCompareTo7 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(iyVar.h()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (!h() || (iA = jz.a(this.f631b, iyVar.f631b)) == 0) {
            return 0;
        }
        return iA;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public long m504a() {
        return this.f626a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m505a() {
        return this.f627a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m506a() {
    }

    @Override // com.xiaomi.push.jy
    public void a(kj kjVar) {
        kjVar.mo645a();
        while (true) {
            kg kgVarMo641a = kjVar.mo641a();
            byte b10 = kgVarMo641a.f107793a;
            if (b10 == 0) {
                kjVar.f();
                m506a();
                return;
            }
            switch (kgVarMo641a.f925a) {
                case 1:
                    if (b10 != 8) {
                        km.a(kjVar, b10);
                    } else {
                        this.f625a = kjVar.mo639a();
                        a(true);
                    }
                    break;
                case 2:
                    if (b10 != 8) {
                        km.a(kjVar, b10);
                    } else {
                        this.f630b = kjVar.mo639a();
                        b(true);
                    }
                    break;
                case 3:
                    if (b10 != 2) {
                        km.a(kjVar, b10);
                    } else {
                        this.f629a = kjVar.mo651a();
                        c(true);
                    }
                    break;
                case 4:
                    if (b10 != 8) {
                        km.a(kjVar, b10);
                    } else {
                        this.f632c = kjVar.mo639a();
                        d(true);
                    }
                    break;
                case 5:
                    if (b10 != 10) {
                        km.a(kjVar, b10);
                    } else {
                        this.f626a = kjVar.mo640a();
                        e(true);
                    }
                    break;
                case 6:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f627a = kjVar.mo646a();
                    }
                    break;
                case 7:
                    if (b10 != 2) {
                        km.a(kjVar, b10);
                    } else {
                        this.f631b = kjVar.mo651a();
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
        this.f628a.set(0, z10);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m507a() {
        return this.f628a.get(0);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m508a(iy iyVar) {
        if (iyVar == null) {
            return false;
        }
        boolean zM507a = m507a();
        boolean zM507a2 = iyVar.m507a();
        if ((zM507a || zM507a2) && !(zM507a && zM507a2 && this.f625a == iyVar.f625a)) {
            return false;
        }
        boolean zM509b = m509b();
        boolean zM509b2 = iyVar.m509b();
        if ((zM509b || zM509b2) && !(zM509b && zM509b2 && this.f630b == iyVar.f630b)) {
            return false;
        }
        boolean zM510c = m510c();
        boolean zM510c2 = iyVar.m510c();
        if ((zM510c || zM510c2) && !(zM510c && zM510c2 && this.f629a == iyVar.f629a)) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = iyVar.d();
        if ((zD || zD2) && !(zD && zD2 && this.f632c == iyVar.f632c)) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = iyVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.f626a == iyVar.f626a)) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = iyVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f627a.equals(iyVar.f627a))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = iyVar.h();
        if (zH || zH2) {
            return zH && zH2 && this.f631b == iyVar.f631b;
        }
        return true;
    }

    public int b() {
        return this.f630b;
    }

    @Override // com.xiaomi.push.jy
    public void b(kj kjVar) {
        m506a();
        kjVar.a(f624a);
        if (m507a()) {
            kjVar.a(f107532a);
            kjVar.mo650a(this.f625a);
            kjVar.b();
        }
        if (m509b()) {
            kjVar.a(f107533b);
            kjVar.mo650a(this.f630b);
            kjVar.b();
        }
        if (m510c()) {
            kjVar.a(f107534c);
            kjVar.a(this.f629a);
            kjVar.b();
        }
        if (d()) {
            kjVar.a(f107535d);
            kjVar.mo650a(this.f632c);
            kjVar.b();
        }
        if (e()) {
            kjVar.a(f107536e);
            kjVar.a(this.f626a);
            kjVar.b();
        }
        if (this.f627a != null && f()) {
            kjVar.a(f107537f);
            kjVar.a(this.f627a);
            kjVar.b();
        }
        if (h()) {
            kjVar.a(f107538g);
            kjVar.a(this.f631b);
            kjVar.b();
        }
        kjVar.c();
        kjVar.mo649a();
    }

    public void b(boolean z10) {
        this.f628a.set(1, z10);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m509b() {
        return this.f628a.get(1);
    }

    public int c() {
        return this.f632c;
    }

    public void c(boolean z10) {
        this.f628a.set(2, z10);
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m510c() {
        return this.f628a.get(2);
    }

    public void d(boolean z10) {
        this.f628a.set(3, z10);
    }

    public boolean d() {
        return this.f628a.get(3);
    }

    public void e(boolean z10) {
        this.f628a.set(4, z10);
    }

    public boolean e() {
        return this.f628a.get(4);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof iy)) {
            return m508a((iy) obj);
        }
        return false;
    }

    public void f(boolean z10) {
        this.f628a.set(5, z10);
    }

    public boolean f() {
        return this.f627a != null;
    }

    public boolean g() {
        return this.f631b;
    }

    public boolean h() {
        return this.f628a.get(5);
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("OnlineConfigItem(");
        boolean z11 = false;
        if (m507a()) {
            sb2.append("key:");
            sb2.append(this.f625a);
            z10 = false;
        } else {
            z10 = true;
        }
        if (m509b()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append("type:");
            sb2.append(this.f630b);
            z10 = false;
        }
        if (m510c()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append("clear:");
            sb2.append(this.f629a);
            z10 = false;
        }
        if (d()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append("intValue:");
            sb2.append(this.f632c);
            z10 = false;
        }
        if (e()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append("longValue:");
            sb2.append(this.f626a);
            z10 = false;
        }
        if (f()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append("stringValue:");
            String str = this.f627a;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
        } else {
            z11 = z10;
        }
        if (h()) {
            if (!z11) {
                sb2.append(", ");
            }
            sb2.append("boolValue:");
            sb2.append(this.f631b);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
