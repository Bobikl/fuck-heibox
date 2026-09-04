package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class jv implements jy<jv, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public jc f896a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f897a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public List<String> f898a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f899b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f900c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f901d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public String f902e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public String f903f;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final ko f895a = new ko("XmPushActionUnSubscription");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final kg f107762a = new kg("", (byte) 11, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final kg f107763b = new kg("", (byte) 12, 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final kg f107764c = new kg("", (byte) 11, 3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final kg f107765d = new kg("", (byte) 11, 4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final kg f107766e = new kg("", (byte) 11, 5);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final kg f107767f = new kg("", (byte) 11, 6);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final kg f107768g = new kg("", (byte) 11, 7);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final kg f107769h = new kg("", (byte) 15, 8);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(jv jvVar) {
        int iA;
        int iA2;
        int iA3;
        int iA4;
        int iA5;
        int iA6;
        int iA7;
        int iA8;
        if (!getClass().equals(jvVar.getClass())) {
            return getClass().getName().compareTo(jvVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m623a()).compareTo(Boolean.valueOf(jvVar.m623a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m623a() && (iA8 = jz.a(this.f897a, jvVar.f897a)) != 0) {
            return iA8;
        }
        int iCompareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(jvVar.b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (b() && (iA7 = jz.a(this.f896a, jvVar.f896a)) != 0) {
            return iA7;
        }
        int iCompareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(jvVar.c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (c() && (iA6 = jz.a(this.f899b, jvVar.f899b)) != 0) {
            return iA6;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jvVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iA5 = jz.a(this.f900c, jvVar.f900c)) != 0) {
            return iA5;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jvVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iA4 = jz.a(this.f901d, jvVar.f901d)) != 0) {
            return iA4;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jvVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iA3 = jz.a(this.f902e, jvVar.f902e)) != 0) {
            return iA3;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jvVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iA2 = jz.a(this.f903f, jvVar.f903f)) != 0) {
            return iA2;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jvVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (!h() || (iA = jz.a(this.f898a, jvVar.f898a)) == 0) {
            return 0;
        }
        return iA;
    }

    public jv a(String str) {
        this.f899b = str;
        return this;
    }

    public void a() throws kk {
        if (this.f899b == null) {
            throw new kk("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f900c == null) {
            throw new kk("Required field 'appId' was not present! Struct: " + toString());
        }
        if (this.f901d != null) {
            return;
        }
        throw new kk("Required field 'topic' was not present! Struct: " + toString());
    }

    @Override // com.xiaomi.push.jy
    public void a(kj kjVar) throws kk {
        kjVar.mo645a();
        while (true) {
            kg kgVarMo641a = kjVar.mo641a();
            byte b10 = kgVarMo641a.f107793a;
            if (b10 == 0) {
                kjVar.f();
                a();
                return;
            }
            switch (kgVarMo641a.f925a) {
                case 1:
                    if (b10 == 11) {
                        this.f897a = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 2:
                    if (b10 == 12) {
                        jc jcVar = new jc();
                        this.f896a = jcVar;
                        jcVar.a(kjVar);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 3:
                    if (b10 == 11) {
                        this.f899b = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 4:
                    if (b10 == 11) {
                        this.f900c = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 5:
                    if (b10 == 11) {
                        this.f901d = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 6:
                    if (b10 == 11) {
                        this.f902e = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 7:
                    if (b10 == 11) {
                        this.f903f = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 8:
                    if (b10 == 15) {
                        kh khVarMo642a = kjVar.mo642a();
                        this.f898a = new ArrayList(khVarMo642a.f926a);
                        for (int i10 = 0; i10 < khVarMo642a.f926a; i10++) {
                            this.f898a.add(kjVar.mo646a());
                        }
                        kjVar.i();
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

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m623a() {
        return this.f897a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m624a(jv jvVar) {
        if (jvVar == null) {
            return false;
        }
        boolean zM623a = m623a();
        boolean zM623a2 = jvVar.m623a();
        if ((zM623a || zM623a2) && !(zM623a && zM623a2 && this.f897a.equals(jvVar.f897a))) {
            return false;
        }
        boolean zB = b();
        boolean zB2 = jvVar.b();
        if ((zB || zB2) && !(zB && zB2 && this.f896a.m542a(jvVar.f896a))) {
            return false;
        }
        boolean zC = c();
        boolean zC2 = jvVar.c();
        if ((zC || zC2) && !(zC && zC2 && this.f899b.equals(jvVar.f899b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = jvVar.d();
        if ((zD || zD2) && !(zD && zD2 && this.f900c.equals(jvVar.f900c))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = jvVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.f901d.equals(jvVar.f901d))) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = jvVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f902e.equals(jvVar.f902e))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = jvVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f903f.equals(jvVar.f903f))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = jvVar.h();
        if (zH || zH2) {
            return zH && zH2 && this.f898a.equals(jvVar.f898a);
        }
        return true;
    }

    public jv b(String str) {
        this.f900c = str;
        return this;
    }

    @Override // com.xiaomi.push.jy
    public void b(kj kjVar) throws kk {
        a();
        kjVar.a(f895a);
        if (this.f897a != null && m623a()) {
            kjVar.a(f107762a);
            kjVar.a(this.f897a);
            kjVar.b();
        }
        if (this.f896a != null && b()) {
            kjVar.a(f107763b);
            this.f896a.b(kjVar);
            kjVar.b();
        }
        if (this.f899b != null) {
            kjVar.a(f107764c);
            kjVar.a(this.f899b);
            kjVar.b();
        }
        if (this.f900c != null) {
            kjVar.a(f107765d);
            kjVar.a(this.f900c);
            kjVar.b();
        }
        if (this.f901d != null) {
            kjVar.a(f107766e);
            kjVar.a(this.f901d);
            kjVar.b();
        }
        if (this.f902e != null && f()) {
            kjVar.a(f107767f);
            kjVar.a(this.f902e);
            kjVar.b();
        }
        if (this.f903f != null && g()) {
            kjVar.a(f107768g);
            kjVar.a(this.f903f);
            kjVar.b();
        }
        if (this.f898a != null && h()) {
            kjVar.a(f107769h);
            kjVar.a(new kh((byte) 11, this.f898a.size()));
            Iterator<String> it = this.f898a.iterator();
            while (it.hasNext()) {
                kjVar.a(it.next());
            }
            kjVar.e();
            kjVar.b();
        }
        kjVar.c();
        kjVar.mo649a();
    }

    public boolean b() {
        return this.f896a != null;
    }

    public jv c(String str) {
        this.f901d = str;
        return this;
    }

    public boolean c() {
        return this.f899b != null;
    }

    public jv d(String str) {
        this.f902e = str;
        return this;
    }

    public boolean d() {
        return this.f900c != null;
    }

    public jv e(String str) {
        this.f903f = str;
        return this;
    }

    public boolean e() {
        return this.f901d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jv)) {
            return m624a((jv) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f902e != null;
    }

    public boolean g() {
        return this.f903f != null;
    }

    public boolean h() {
        return this.f898a != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("XmPushActionUnSubscription(");
        boolean z11 = false;
        if (m623a()) {
            sb2.append("debug:");
            String str = this.f897a;
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
            jc jcVar = this.f896a;
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
        String str2 = this.f899b;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(", ");
        sb2.append("appId:");
        String str3 = this.f900c;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(", ");
        sb2.append("topic:");
        String str4 = this.f901d;
        if (str4 == null) {
            sb2.append("null");
        } else {
            sb2.append(str4);
        }
        if (f()) {
            sb2.append(", ");
            sb2.append("packageName:");
            String str5 = this.f902e;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (g()) {
            sb2.append(", ");
            sb2.append("category:");
            String str6 = this.f903f;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
        }
        if (h()) {
            sb2.append(", ");
            sb2.append("aliases:");
            List<String> list = this.f898a;
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
