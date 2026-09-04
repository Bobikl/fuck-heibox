package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class jr implements jy<jr, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public jc f851a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f852a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public List<String> f853a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f854b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f855c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f856d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public String f857e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public String f858f;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final ko f850a = new ko("XmPushActionSubscription");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final kg f107724a = new kg("", (byte) 11, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final kg f107725b = new kg("", (byte) 12, 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final kg f107726c = new kg("", (byte) 11, 3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final kg f107727d = new kg("", (byte) 11, 4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final kg f107728e = new kg("", (byte) 11, 5);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final kg f107729f = new kg("", (byte) 11, 6);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final kg f107730g = new kg("", (byte) 11, 7);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final kg f107731h = new kg("", (byte) 15, 8);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(jr jrVar) {
        int iA;
        int iA2;
        int iA3;
        int iA4;
        int iA5;
        int iA6;
        int iA7;
        int iA8;
        if (!getClass().equals(jrVar.getClass())) {
            return getClass().getName().compareTo(jrVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m611a()).compareTo(Boolean.valueOf(jrVar.m611a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m611a() && (iA8 = jz.a(this.f852a, jrVar.f852a)) != 0) {
            return iA8;
        }
        int iCompareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(jrVar.b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (b() && (iA7 = jz.a(this.f851a, jrVar.f851a)) != 0) {
            return iA7;
        }
        int iCompareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(jrVar.c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (c() && (iA6 = jz.a(this.f854b, jrVar.f854b)) != 0) {
            return iA6;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jrVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iA5 = jz.a(this.f855c, jrVar.f855c)) != 0) {
            return iA5;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jrVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iA4 = jz.a(this.f856d, jrVar.f856d)) != 0) {
            return iA4;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jrVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iA3 = jz.a(this.f857e, jrVar.f857e)) != 0) {
            return iA3;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jrVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iA2 = jz.a(this.f858f, jrVar.f858f)) != 0) {
            return iA2;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jrVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (!h() || (iA = jz.a(this.f853a, jrVar.f853a)) == 0) {
            return 0;
        }
        return iA;
    }

    public jr a(String str) {
        this.f854b = str;
        return this;
    }

    public void a() throws kk {
        if (this.f854b == null) {
            throw new kk("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f855c == null) {
            throw new kk("Required field 'appId' was not present! Struct: " + toString());
        }
        if (this.f856d != null) {
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
                        this.f852a = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 2:
                    if (b10 == 12) {
                        jc jcVar = new jc();
                        this.f851a = jcVar;
                        jcVar.a(kjVar);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 3:
                    if (b10 == 11) {
                        this.f854b = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 4:
                    if (b10 == 11) {
                        this.f855c = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 5:
                    if (b10 == 11) {
                        this.f856d = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 6:
                    if (b10 == 11) {
                        this.f857e = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 7:
                    if (b10 == 11) {
                        this.f858f = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 8:
                    if (b10 == 15) {
                        kh khVarMo642a = kjVar.mo642a();
                        this.f853a = new ArrayList(khVarMo642a.f926a);
                        for (int i10 = 0; i10 < khVarMo642a.f926a; i10++) {
                            this.f853a.add(kjVar.mo646a());
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
    public boolean m611a() {
        return this.f852a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m612a(jr jrVar) {
        if (jrVar == null) {
            return false;
        }
        boolean zM611a = m611a();
        boolean zM611a2 = jrVar.m611a();
        if ((zM611a || zM611a2) && !(zM611a && zM611a2 && this.f852a.equals(jrVar.f852a))) {
            return false;
        }
        boolean zB = b();
        boolean zB2 = jrVar.b();
        if ((zB || zB2) && !(zB && zB2 && this.f851a.m542a(jrVar.f851a))) {
            return false;
        }
        boolean zC = c();
        boolean zC2 = jrVar.c();
        if ((zC || zC2) && !(zC && zC2 && this.f854b.equals(jrVar.f854b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = jrVar.d();
        if ((zD || zD2) && !(zD && zD2 && this.f855c.equals(jrVar.f855c))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = jrVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.f856d.equals(jrVar.f856d))) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = jrVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f857e.equals(jrVar.f857e))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = jrVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f858f.equals(jrVar.f858f))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = jrVar.h();
        if (zH || zH2) {
            return zH && zH2 && this.f853a.equals(jrVar.f853a);
        }
        return true;
    }

    public jr b(String str) {
        this.f855c = str;
        return this;
    }

    @Override // com.xiaomi.push.jy
    public void b(kj kjVar) throws kk {
        a();
        kjVar.a(f850a);
        if (this.f852a != null && m611a()) {
            kjVar.a(f107724a);
            kjVar.a(this.f852a);
            kjVar.b();
        }
        if (this.f851a != null && b()) {
            kjVar.a(f107725b);
            this.f851a.b(kjVar);
            kjVar.b();
        }
        if (this.f854b != null) {
            kjVar.a(f107726c);
            kjVar.a(this.f854b);
            kjVar.b();
        }
        if (this.f855c != null) {
            kjVar.a(f107727d);
            kjVar.a(this.f855c);
            kjVar.b();
        }
        if (this.f856d != null) {
            kjVar.a(f107728e);
            kjVar.a(this.f856d);
            kjVar.b();
        }
        if (this.f857e != null && f()) {
            kjVar.a(f107729f);
            kjVar.a(this.f857e);
            kjVar.b();
        }
        if (this.f858f != null && g()) {
            kjVar.a(f107730g);
            kjVar.a(this.f858f);
            kjVar.b();
        }
        if (this.f853a != null && h()) {
            kjVar.a(f107731h);
            kjVar.a(new kh((byte) 11, this.f853a.size()));
            Iterator<String> it = this.f853a.iterator();
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
        return this.f851a != null;
    }

    public jr c(String str) {
        this.f856d = str;
        return this;
    }

    public boolean c() {
        return this.f854b != null;
    }

    public jr d(String str) {
        this.f857e = str;
        return this;
    }

    public boolean d() {
        return this.f855c != null;
    }

    public jr e(String str) {
        this.f858f = str;
        return this;
    }

    public boolean e() {
        return this.f856d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jr)) {
            return m612a((jr) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f857e != null;
    }

    public boolean g() {
        return this.f858f != null;
    }

    public boolean h() {
        return this.f853a != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("XmPushActionSubscription(");
        boolean z11 = false;
        if (m611a()) {
            sb2.append("debug:");
            String str = this.f852a;
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
            jc jcVar = this.f851a;
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
        String str2 = this.f854b;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(", ");
        sb2.append("appId:");
        String str3 = this.f855c;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(", ");
        sb2.append("topic:");
        String str4 = this.f856d;
        if (str4 == null) {
            sb2.append("null");
        } else {
            sb2.append(str4);
        }
        if (f()) {
            sb2.append(", ");
            sb2.append("packageName:");
            String str5 = this.f857e;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (g()) {
            sb2.append(", ");
            sb2.append("category:");
            String str6 = this.f858f;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
        }
        if (h()) {
            sb2.append(", ");
            sb2.append("aliases:");
            List<String> list = this.f853a;
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
