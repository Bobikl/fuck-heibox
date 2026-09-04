package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* JADX INFO: loaded from: classes4.dex */
public class js implements jy<js, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f860a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public jc f861a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f862a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f863a = new BitSet(1);

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f864b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f865c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f866d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public String f867e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public String f868f;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    public String f869g;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final ko f859a = new ko("XmPushActionSubscriptionResult");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final kg f107732a = new kg("", (byte) 11, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final kg f107733b = new kg("", (byte) 12, 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final kg f107734c = new kg("", (byte) 11, 3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final kg f107735d = new kg("", (byte) 11, 4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final kg f107736e = new kg("", (byte) 10, 6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final kg f107737f = new kg("", (byte) 11, 7);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final kg f107738g = new kg("", (byte) 11, 8);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final kg f107739h = new kg("", (byte) 11, 9);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final kg f107740i = new kg("", (byte) 11, 10);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(js jsVar) {
        int iA;
        int iA2;
        int iA3;
        int iA4;
        int iA5;
        int iA6;
        int iA7;
        int iA8;
        int iA9;
        if (!getClass().equals(jsVar.getClass())) {
            return getClass().getName().compareTo(jsVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m614a()).compareTo(Boolean.valueOf(jsVar.m614a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m614a() && (iA9 = jz.a(this.f862a, jsVar.f862a)) != 0) {
            return iA9;
        }
        int iCompareTo2 = Boolean.valueOf(m616b()).compareTo(Boolean.valueOf(jsVar.m616b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m616b() && (iA8 = jz.a(this.f861a, jsVar.f861a)) != 0) {
            return iA8;
        }
        int iCompareTo3 = Boolean.valueOf(m617c()).compareTo(Boolean.valueOf(jsVar.m617c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m617c() && (iA7 = jz.a(this.f864b, jsVar.f864b)) != 0) {
            return iA7;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jsVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iA6 = jz.a(this.f865c, jsVar.f865c)) != 0) {
            return iA6;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jsVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iA5 = jz.a(this.f860a, jsVar.f860a)) != 0) {
            return iA5;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jsVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iA4 = jz.a(this.f866d, jsVar.f866d)) != 0) {
            return iA4;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jsVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iA3 = jz.a(this.f867e, jsVar.f867e)) != 0) {
            return iA3;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jsVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iA2 = jz.a(this.f868f, jsVar.f868f)) != 0) {
            return iA2;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jsVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (!i() || (iA = jz.a(this.f869g, jsVar.f869g)) == 0) {
            return 0;
        }
        return iA;
    }

    public String a() {
        return this.f864b;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m613a() throws kk {
        if (this.f864b != null) {
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
                m613a();
                return;
            }
            switch (kgVarMo641a.f925a) {
                case 1:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f862a = kjVar.mo646a();
                    }
                    break;
                case 2:
                    if (b10 != 12) {
                        km.a(kjVar, b10);
                    } else {
                        jc jcVar = new jc();
                        this.f861a = jcVar;
                        jcVar.a(kjVar);
                    }
                    break;
                case 3:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f864b = kjVar.mo646a();
                    }
                    break;
                case 4:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f865c = kjVar.mo646a();
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
                        this.f860a = kjVar.mo640a();
                        a(true);
                    }
                    break;
                case 7:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f866d = kjVar.mo646a();
                    }
                    break;
                case 8:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f867e = kjVar.mo646a();
                    }
                    break;
                case 9:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f868f = kjVar.mo646a();
                    }
                    break;
                case 10:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f869g = kjVar.mo646a();
                    }
                    break;
            }
            kjVar.g();
        }
    }

    public void a(boolean z10) {
        this.f863a.set(0, z10);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m614a() {
        return this.f862a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m615a(js jsVar) {
        if (jsVar == null) {
            return false;
        }
        boolean zM614a = m614a();
        boolean zM614a2 = jsVar.m614a();
        if ((zM614a || zM614a2) && !(zM614a && zM614a2 && this.f862a.equals(jsVar.f862a))) {
            return false;
        }
        boolean zM616b = m616b();
        boolean zM616b2 = jsVar.m616b();
        if ((zM616b || zM616b2) && !(zM616b && zM616b2 && this.f861a.m542a(jsVar.f861a))) {
            return false;
        }
        boolean zM617c = m617c();
        boolean zM617c2 = jsVar.m617c();
        if ((zM617c || zM617c2) && !(zM617c && zM617c2 && this.f864b.equals(jsVar.f864b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = jsVar.d();
        if ((zD || zD2) && !(zD && zD2 && this.f865c.equals(jsVar.f865c))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = jsVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.f860a == jsVar.f860a)) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = jsVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f866d.equals(jsVar.f866d))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = jsVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f867e.equals(jsVar.f867e))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = jsVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f868f.equals(jsVar.f868f))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = jsVar.i();
        if (zI || zI2) {
            return zI && zI2 && this.f869g.equals(jsVar.f869g);
        }
        return true;
    }

    public String b() {
        return this.f867e;
    }

    @Override // com.xiaomi.push.jy
    public void b(kj kjVar) throws kk {
        m613a();
        kjVar.a(f859a);
        if (this.f862a != null && m614a()) {
            kjVar.a(f107732a);
            kjVar.a(this.f862a);
            kjVar.b();
        }
        if (this.f861a != null && m616b()) {
            kjVar.a(f107733b);
            this.f861a.b(kjVar);
            kjVar.b();
        }
        if (this.f864b != null) {
            kjVar.a(f107734c);
            kjVar.a(this.f864b);
            kjVar.b();
        }
        if (this.f865c != null && d()) {
            kjVar.a(f107735d);
            kjVar.a(this.f865c);
            kjVar.b();
        }
        if (e()) {
            kjVar.a(f107736e);
            kjVar.a(this.f860a);
            kjVar.b();
        }
        if (this.f866d != null && f()) {
            kjVar.a(f107737f);
            kjVar.a(this.f866d);
            kjVar.b();
        }
        if (this.f867e != null && g()) {
            kjVar.a(f107738g);
            kjVar.a(this.f867e);
            kjVar.b();
        }
        if (this.f868f != null && h()) {
            kjVar.a(f107739h);
            kjVar.a(this.f868f);
            kjVar.b();
        }
        if (this.f869g != null && i()) {
            kjVar.a(f107740i);
            kjVar.a(this.f869g);
            kjVar.b();
        }
        kjVar.c();
        kjVar.mo649a();
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m616b() {
        return this.f861a != null;
    }

    public String c() {
        return this.f869g;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m617c() {
        return this.f864b != null;
    }

    public boolean d() {
        return this.f865c != null;
    }

    public boolean e() {
        return this.f863a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof js)) {
            return m615a((js) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f866d != null;
    }

    public boolean g() {
        return this.f867e != null;
    }

    public boolean h() {
        return this.f868f != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f869g != null;
    }

    public String toString() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("XmPushActionSubscriptionResult(");
        boolean z11 = false;
        if (m614a()) {
            sb2.append("debug:");
            String str = this.f862a;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            z10 = false;
        } else {
            z10 = true;
        }
        if (m616b()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append("target:");
            jc jcVar = this.f861a;
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
        String str2 = this.f864b;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        if (d()) {
            sb2.append(", ");
            sb2.append("appId:");
            String str3 = this.f865c;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        if (e()) {
            sb2.append(", ");
            sb2.append("errorCode:");
            sb2.append(this.f860a);
        }
        if (f()) {
            sb2.append(", ");
            sb2.append("reason:");
            String str4 = this.f866d;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (g()) {
            sb2.append(", ");
            sb2.append("topic:");
            String str5 = this.f867e;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (h()) {
            sb2.append(", ");
            sb2.append("packageName:");
            String str6 = this.f868f;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
        }
        if (i()) {
            sb2.append(", ");
            sb2.append("category:");
            String str7 = this.f869g;
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
