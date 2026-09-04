package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* JADX INFO: loaded from: classes4.dex */
public class jw implements jy<jw, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f905a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public jc f906a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f907a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f908a = new BitSet(1);

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f909b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f910c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f911d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public String f912e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public String f913f;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    public String f914g;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final ko f904a = new ko("XmPushActionUnSubscriptionResult");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final kg f107770a = new kg("", (byte) 11, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final kg f107771b = new kg("", (byte) 12, 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final kg f107772c = new kg("", (byte) 11, 3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final kg f107773d = new kg("", (byte) 11, 4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final kg f107774e = new kg("", (byte) 10, 6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final kg f107775f = new kg("", (byte) 11, 7);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final kg f107776g = new kg("", (byte) 11, 8);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final kg f107777h = new kg("", (byte) 11, 9);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final kg f107778i = new kg("", (byte) 11, 10);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(jw jwVar) {
        int iA;
        int iA2;
        int iA3;
        int iA4;
        int iA5;
        int iA6;
        int iA7;
        int iA8;
        int iA9;
        if (!getClass().equals(jwVar.getClass())) {
            return getClass().getName().compareTo(jwVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m626a()).compareTo(Boolean.valueOf(jwVar.m626a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m626a() && (iA9 = jz.a(this.f907a, jwVar.f907a)) != 0) {
            return iA9;
        }
        int iCompareTo2 = Boolean.valueOf(m628b()).compareTo(Boolean.valueOf(jwVar.m628b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m628b() && (iA8 = jz.a(this.f906a, jwVar.f906a)) != 0) {
            return iA8;
        }
        int iCompareTo3 = Boolean.valueOf(m629c()).compareTo(Boolean.valueOf(jwVar.m629c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m629c() && (iA7 = jz.a(this.f909b, jwVar.f909b)) != 0) {
            return iA7;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jwVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iA6 = jz.a(this.f910c, jwVar.f910c)) != 0) {
            return iA6;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jwVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iA5 = jz.a(this.f905a, jwVar.f905a)) != 0) {
            return iA5;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jwVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iA4 = jz.a(this.f911d, jwVar.f911d)) != 0) {
            return iA4;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jwVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iA3 = jz.a(this.f912e, jwVar.f912e)) != 0) {
            return iA3;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jwVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iA2 = jz.a(this.f913f, jwVar.f913f)) != 0) {
            return iA2;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jwVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (!i() || (iA = jz.a(this.f914g, jwVar.f914g)) == 0) {
            return 0;
        }
        return iA;
    }

    public String a() {
        return this.f909b;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m625a() throws kk {
        if (this.f909b != null) {
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
                m625a();
                return;
            }
            switch (kgVarMo641a.f925a) {
                case 1:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f907a = kjVar.mo646a();
                    }
                    break;
                case 2:
                    if (b10 != 12) {
                        km.a(kjVar, b10);
                    } else {
                        jc jcVar = new jc();
                        this.f906a = jcVar;
                        jcVar.a(kjVar);
                    }
                    break;
                case 3:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f909b = kjVar.mo646a();
                    }
                    break;
                case 4:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f910c = kjVar.mo646a();
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
                        this.f905a = kjVar.mo640a();
                        a(true);
                    }
                    break;
                case 7:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f911d = kjVar.mo646a();
                    }
                    break;
                case 8:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f912e = kjVar.mo646a();
                    }
                    break;
                case 9:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f913f = kjVar.mo646a();
                    }
                    break;
                case 10:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f914g = kjVar.mo646a();
                    }
                    break;
            }
            kjVar.g();
        }
    }

    public void a(boolean z10) {
        this.f908a.set(0, z10);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m626a() {
        return this.f907a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m627a(jw jwVar) {
        if (jwVar == null) {
            return false;
        }
        boolean zM626a = m626a();
        boolean zM626a2 = jwVar.m626a();
        if ((zM626a || zM626a2) && !(zM626a && zM626a2 && this.f907a.equals(jwVar.f907a))) {
            return false;
        }
        boolean zM628b = m628b();
        boolean zM628b2 = jwVar.m628b();
        if ((zM628b || zM628b2) && !(zM628b && zM628b2 && this.f906a.m542a(jwVar.f906a))) {
            return false;
        }
        boolean zM629c = m629c();
        boolean zM629c2 = jwVar.m629c();
        if ((zM629c || zM629c2) && !(zM629c && zM629c2 && this.f909b.equals(jwVar.f909b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = jwVar.d();
        if ((zD || zD2) && !(zD && zD2 && this.f910c.equals(jwVar.f910c))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = jwVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.f905a == jwVar.f905a)) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = jwVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f911d.equals(jwVar.f911d))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = jwVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f912e.equals(jwVar.f912e))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = jwVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f913f.equals(jwVar.f913f))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = jwVar.i();
        if (zI || zI2) {
            return zI && zI2 && this.f914g.equals(jwVar.f914g);
        }
        return true;
    }

    public String b() {
        return this.f912e;
    }

    @Override // com.xiaomi.push.jy
    public void b(kj kjVar) throws kk {
        m625a();
        kjVar.a(f904a);
        if (this.f907a != null && m626a()) {
            kjVar.a(f107770a);
            kjVar.a(this.f907a);
            kjVar.b();
        }
        if (this.f906a != null && m628b()) {
            kjVar.a(f107771b);
            this.f906a.b(kjVar);
            kjVar.b();
        }
        if (this.f909b != null) {
            kjVar.a(f107772c);
            kjVar.a(this.f909b);
            kjVar.b();
        }
        if (this.f910c != null && d()) {
            kjVar.a(f107773d);
            kjVar.a(this.f910c);
            kjVar.b();
        }
        if (e()) {
            kjVar.a(f107774e);
            kjVar.a(this.f905a);
            kjVar.b();
        }
        if (this.f911d != null && f()) {
            kjVar.a(f107775f);
            kjVar.a(this.f911d);
            kjVar.b();
        }
        if (this.f912e != null && g()) {
            kjVar.a(f107776g);
            kjVar.a(this.f912e);
            kjVar.b();
        }
        if (this.f913f != null && h()) {
            kjVar.a(f107777h);
            kjVar.a(this.f913f);
            kjVar.b();
        }
        if (this.f914g != null && i()) {
            kjVar.a(f107778i);
            kjVar.a(this.f914g);
            kjVar.b();
        }
        kjVar.c();
        kjVar.mo649a();
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m628b() {
        return this.f906a != null;
    }

    public String c() {
        return this.f914g;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m629c() {
        return this.f909b != null;
    }

    public boolean d() {
        return this.f910c != null;
    }

    public boolean e() {
        return this.f908a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jw)) {
            return m627a((jw) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f911d != null;
    }

    public boolean g() {
        return this.f912e != null;
    }

    public boolean h() {
        return this.f913f != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f914g != null;
    }

    public String toString() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("XmPushActionUnSubscriptionResult(");
        boolean z11 = false;
        if (m626a()) {
            sb2.append("debug:");
            String str = this.f907a;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            z10 = false;
        } else {
            z10 = true;
        }
        if (m628b()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append("target:");
            jc jcVar = this.f906a;
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
        String str2 = this.f909b;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        if (d()) {
            sb2.append(", ");
            sb2.append("appId:");
            String str3 = this.f910c;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        if (e()) {
            sb2.append(", ");
            sb2.append("errorCode:");
            sb2.append(this.f905a);
        }
        if (f()) {
            sb2.append(", ");
            sb2.append("reason:");
            String str4 = this.f911d;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (g()) {
            sb2.append(", ");
            sb2.append("topic:");
            String str5 = this.f912e;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (h()) {
            sb2.append(", ");
            sb2.append("packageName:");
            String str6 = this.f913f;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
        }
        if (i()) {
            sb2.append(", ");
            sb2.append("category:");
            String str7 = this.f914g;
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
