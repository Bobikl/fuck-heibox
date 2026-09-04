package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class je implements jy<je, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public jc f703a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f704a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public Map<String, String> f706a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f707b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f708c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f709d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public String f710e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public String f711f;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    public String f712g;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final ko f701a = new ko("XmPushActionAckNotification");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final kg f107601a = new kg("", (byte) 11, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final kg f107602b = new kg("", (byte) 12, 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final kg f107603c = new kg("", (byte) 11, 3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final kg f107604d = new kg("", (byte) 11, 4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final kg f107605e = new kg("", (byte) 11, 5);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final kg f107606f = new kg("", (byte) 10, 7);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final kg f107607g = new kg("", (byte) 11, 8);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final kg f107608h = new kg("", (byte) 13, 9);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final kg f107609i = new kg("", (byte) 11, 10);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final kg f107610j = new kg("", (byte) 11, 11);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f705a = new BitSet(1);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f702a = 0;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(je jeVar) {
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
        if (!getClass().equals(jeVar.getClass())) {
            return getClass().getName().compareTo(jeVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m547a()).compareTo(Boolean.valueOf(jeVar.m547a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m547a() && (iA10 = jz.a(this.f704a, jeVar.f704a)) != 0) {
            return iA10;
        }
        int iCompareTo2 = Boolean.valueOf(m549b()).compareTo(Boolean.valueOf(jeVar.m549b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m549b() && (iA9 = jz.a(this.f703a, jeVar.f703a)) != 0) {
            return iA9;
        }
        int iCompareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(jeVar.c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (c() && (iA8 = jz.a(this.f707b, jeVar.f707b)) != 0) {
            return iA8;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jeVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iA7 = jz.a(this.f708c, jeVar.f708c)) != 0) {
            return iA7;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jeVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iA6 = jz.a(this.f709d, jeVar.f709d)) != 0) {
            return iA6;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jeVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iA5 = jz.a(this.f702a, jeVar.f702a)) != 0) {
            return iA5;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jeVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iA4 = jz.a(this.f710e, jeVar.f710e)) != 0) {
            return iA4;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jeVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iA3 = jz.a(this.f706a, jeVar.f706a)) != 0) {
            return iA3;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jeVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (i() && (iA2 = jz.a(this.f711f, jeVar.f711f)) != 0) {
            return iA2;
        }
        int iCompareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(jeVar.j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (!j() || (iA = jz.a(this.f712g, jeVar.f712g)) == 0) {
            return 0;
        }
        return iA;
    }

    public je a(long j10) {
        this.f702a = j10;
        a(true);
        return this;
    }

    public je a(jc jcVar) {
        this.f703a = jcVar;
        return this;
    }

    public je a(String str) {
        this.f707b = str;
        return this;
    }

    public String a() {
        return this.f707b;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public Map<String, String> m545a() {
        return this.f706a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m546a() throws kk {
        if (this.f707b != null) {
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
                m546a();
                return;
            }
            switch (kgVarMo641a.f925a) {
                case 1:
                    if (b10 == 11) {
                        this.f704a = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 2:
                    if (b10 == 12) {
                        jc jcVar = new jc();
                        this.f703a = jcVar;
                        jcVar.a(kjVar);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 3:
                    if (b10 == 11) {
                        this.f707b = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 4:
                    if (b10 == 11) {
                        this.f708c = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 5:
                    if (b10 == 11) {
                        this.f709d = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 6:
                default:
                    km.a(kjVar, b10);
                    break;
                case 7:
                    if (b10 == 10) {
                        this.f702a = kjVar.mo640a();
                        a(true);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 8:
                    if (b10 == 11) {
                        this.f710e = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 9:
                    if (b10 == 13) {
                        ki kiVarMo643a = kjVar.mo643a();
                        this.f706a = new HashMap(kiVarMo643a.f927a * 2);
                        for (int i10 = 0; i10 < kiVarMo643a.f927a; i10++) {
                            this.f706a.put(kjVar.mo646a(), kjVar.mo646a());
                        }
                        kjVar.h();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 10:
                    if (b10 == 11) {
                        this.f711f = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 11:
                    if (b10 == 11) {
                        this.f712g = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
            }
            kjVar.g();
        }
    }

    public void a(boolean z10) {
        this.f705a.set(0, z10);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m547a() {
        return this.f704a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m548a(je jeVar) {
        if (jeVar == null) {
            return false;
        }
        boolean zM547a = m547a();
        boolean zM547a2 = jeVar.m547a();
        if ((zM547a || zM547a2) && !(zM547a && zM547a2 && this.f704a.equals(jeVar.f704a))) {
            return false;
        }
        boolean zM549b = m549b();
        boolean zM549b2 = jeVar.m549b();
        if ((zM549b || zM549b2) && !(zM549b && zM549b2 && this.f703a.m542a(jeVar.f703a))) {
            return false;
        }
        boolean zC = c();
        boolean zC2 = jeVar.c();
        if ((zC || zC2) && !(zC && zC2 && this.f707b.equals(jeVar.f707b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = jeVar.d();
        if ((zD || zD2) && !(zD && zD2 && this.f708c.equals(jeVar.f708c))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = jeVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.f709d.equals(jeVar.f709d))) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = jeVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f702a == jeVar.f702a)) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = jeVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f710e.equals(jeVar.f710e))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = jeVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f706a.equals(jeVar.f706a))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = jeVar.i();
        if ((zI || zI2) && !(zI && zI2 && this.f711f.equals(jeVar.f711f))) {
            return false;
        }
        boolean zJ = j();
        boolean zJ2 = jeVar.j();
        if (zJ || zJ2) {
            return zJ && zJ2 && this.f712g.equals(jeVar.f712g);
        }
        return true;
    }

    public je b(String str) {
        this.f708c = str;
        return this;
    }

    public String b() {
        return this.f709d;
    }

    @Override // com.xiaomi.push.jy
    public void b(kj kjVar) throws kk {
        m546a();
        kjVar.a(f701a);
        if (this.f704a != null && m547a()) {
            kjVar.a(f107601a);
            kjVar.a(this.f704a);
            kjVar.b();
        }
        if (this.f703a != null && m549b()) {
            kjVar.a(f107602b);
            this.f703a.b(kjVar);
            kjVar.b();
        }
        if (this.f707b != null) {
            kjVar.a(f107603c);
            kjVar.a(this.f707b);
            kjVar.b();
        }
        if (this.f708c != null && d()) {
            kjVar.a(f107604d);
            kjVar.a(this.f708c);
            kjVar.b();
        }
        if (this.f709d != null && e()) {
            kjVar.a(f107605e);
            kjVar.a(this.f709d);
            kjVar.b();
        }
        if (f()) {
            kjVar.a(f107606f);
            kjVar.a(this.f702a);
            kjVar.b();
        }
        if (this.f710e != null && g()) {
            kjVar.a(f107607g);
            kjVar.a(this.f710e);
            kjVar.b();
        }
        if (this.f706a != null && h()) {
            kjVar.a(f107608h);
            kjVar.a(new ki((byte) 11, (byte) 11, this.f706a.size()));
            for (Map.Entry<String, String> entry : this.f706a.entrySet()) {
                kjVar.a(entry.getKey());
                kjVar.a(entry.getValue());
            }
            kjVar.d();
            kjVar.b();
        }
        if (this.f711f != null && i()) {
            kjVar.a(f107609i);
            kjVar.a(this.f711f);
            kjVar.b();
        }
        if (this.f712g != null && j()) {
            kjVar.a(f107610j);
            kjVar.a(this.f712g);
            kjVar.b();
        }
        kjVar.c();
        kjVar.mo649a();
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m549b() {
        return this.f703a != null;
    }

    public je c(String str) {
        this.f709d = str;
        return this;
    }

    public boolean c() {
        return this.f707b != null;
    }

    public je d(String str) {
        this.f710e = str;
        return this;
    }

    public boolean d() {
        return this.f708c != null;
    }

    public je e(String str) {
        this.f711f = str;
        return this;
    }

    public boolean e() {
        return this.f709d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof je)) {
            return m548a((je) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f705a.get(0);
    }

    public boolean g() {
        return this.f710e != null;
    }

    public boolean h() {
        return this.f706a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f711f != null;
    }

    public boolean j() {
        return this.f712g != null;
    }

    public String toString() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("XmPushActionAckNotification(");
        boolean z11 = false;
        if (m547a()) {
            sb2.append("debug:");
            String str = this.f704a;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            z10 = false;
        } else {
            z10 = true;
        }
        if (m549b()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append("target:");
            jc jcVar = this.f703a;
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
        String str2 = this.f707b;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        if (d()) {
            sb2.append(", ");
            sb2.append("appId:");
            String str3 = this.f708c;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        if (e()) {
            sb2.append(", ");
            sb2.append("type:");
            String str4 = this.f709d;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (f()) {
            sb2.append(", ");
            sb2.append("errorCode:");
            sb2.append(this.f702a);
        }
        if (g()) {
            sb2.append(", ");
            sb2.append("reason:");
            String str5 = this.f710e;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (h()) {
            sb2.append(", ");
            sb2.append("extra:");
            Map<String, String> map = this.f706a;
            if (map == null) {
                sb2.append("null");
            } else {
                sb2.append(map);
            }
        }
        if (i()) {
            sb2.append(", ");
            sb2.append("packageName:");
            String str6 = this.f711f;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
        }
        if (j()) {
            sb2.append(", ");
            sb2.append("category:");
            String str7 = this.f712g;
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
