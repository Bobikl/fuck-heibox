package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class jq implements jy<jq, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public iz f837a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public jc f838a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f839a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public Map<String, String> f841a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f843b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f844c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f845d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public String f846e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public String f847f;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    public String f848g;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    public String f849h;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final ko f836a = new ko("XmPushActionSendMessage");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final kg f107712a = new kg("", (byte) 11, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final kg f107713b = new kg("", (byte) 12, 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final kg f107714c = new kg("", (byte) 11, 3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final kg f107715d = new kg("", (byte) 11, 4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final kg f107716e = new kg("", (byte) 11, 5);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final kg f107717f = new kg("", (byte) 11, 6);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final kg f107718g = new kg("", (byte) 11, 7);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final kg f107719h = new kg("", (byte) 12, 8);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final kg f107720i = new kg("", (byte) 2, 9);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final kg f107721j = new kg("", (byte) 13, 10);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final kg f107722k = new kg("", (byte) 11, 11);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final kg f107723l = new kg("", (byte) 11, 12);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f840a = new BitSet(1);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f842a = true;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(jq jqVar) {
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
        if (!getClass().equals(jqVar.getClass())) {
            return getClass().getName().compareTo(jqVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m604a()).compareTo(Boolean.valueOf(jqVar.m604a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m604a() && (iA12 = jz.a(this.f839a, jqVar.f839a)) != 0) {
            return iA12;
        }
        int iCompareTo2 = Boolean.valueOf(m606b()).compareTo(Boolean.valueOf(jqVar.m606b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m606b() && (iA11 = jz.a(this.f838a, jqVar.f838a)) != 0) {
            return iA11;
        }
        int iCompareTo3 = Boolean.valueOf(m607c()).compareTo(Boolean.valueOf(jqVar.m607c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m607c() && (iA10 = jz.a(this.f843b, jqVar.f843b)) != 0) {
            return iA10;
        }
        int iCompareTo4 = Boolean.valueOf(m608d()).compareTo(Boolean.valueOf(jqVar.m608d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m608d() && (iA9 = jz.a(this.f844c, jqVar.f844c)) != 0) {
            return iA9;
        }
        int iCompareTo5 = Boolean.valueOf(m609e()).compareTo(Boolean.valueOf(jqVar.m609e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m609e() && (iA8 = jz.a(this.f845d, jqVar.f845d)) != 0) {
            return iA8;
        }
        int iCompareTo6 = Boolean.valueOf(m610f()).compareTo(Boolean.valueOf(jqVar.m610f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m610f() && (iA7 = jz.a(this.f846e, jqVar.f846e)) != 0) {
            return iA7;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jqVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iA6 = jz.a(this.f847f, jqVar.f847f)) != 0) {
            return iA6;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jqVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iA5 = jz.a(this.f837a, jqVar.f837a)) != 0) {
            return iA5;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jqVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (i() && (iA4 = jz.a(this.f842a, jqVar.f842a)) != 0) {
            return iA4;
        }
        int iCompareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(jqVar.j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (j() && (iA3 = jz.a(this.f841a, jqVar.f841a)) != 0) {
            return iA3;
        }
        int iCompareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(jqVar.k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (k() && (iA2 = jz.a(this.f848g, jqVar.f848g)) != 0) {
            return iA2;
        }
        int iCompareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(jqVar.l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (!l() || (iA = jz.a(this.f849h, jqVar.f849h)) == 0) {
            return 0;
        }
        return iA;
    }

    public iz a() {
        return this.f837a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m602a() {
        return this.f843b;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m603a() throws kk {
        if (this.f843b == null) {
            throw new kk("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f844c != null) {
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
                m603a();
                return;
            }
            switch (kgVarMo641a.f925a) {
                case 1:
                    if (b10 == 11) {
                        this.f839a = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 2:
                    if (b10 == 12) {
                        jc jcVar = new jc();
                        this.f838a = jcVar;
                        jcVar.a(kjVar);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 3:
                    if (b10 == 11) {
                        this.f843b = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 4:
                    if (b10 == 11) {
                        this.f844c = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 5:
                    if (b10 == 11) {
                        this.f845d = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 6:
                    if (b10 == 11) {
                        this.f846e = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 7:
                    if (b10 == 11) {
                        this.f847f = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 8:
                    if (b10 == 12) {
                        iz izVar = new iz();
                        this.f837a = izVar;
                        izVar.a(kjVar);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 9:
                    if (b10 == 2) {
                        this.f842a = kjVar.mo651a();
                        a(true);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 10:
                    if (b10 == 13) {
                        ki kiVarMo643a = kjVar.mo643a();
                        this.f841a = new HashMap(kiVarMo643a.f927a * 2);
                        for (int i10 = 0; i10 < kiVarMo643a.f927a; i10++) {
                            this.f841a.put(kjVar.mo646a(), kjVar.mo646a());
                        }
                        kjVar.h();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 11:
                    if (b10 == 11) {
                        this.f848g = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 12:
                    if (b10 == 11) {
                        this.f849h = kjVar.mo646a();
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

    public void a(boolean z10) {
        this.f840a.set(0, z10);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m604a() {
        return this.f839a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m605a(jq jqVar) {
        if (jqVar == null) {
            return false;
        }
        boolean zM604a = m604a();
        boolean zM604a2 = jqVar.m604a();
        if ((zM604a || zM604a2) && !(zM604a && zM604a2 && this.f839a.equals(jqVar.f839a))) {
            return false;
        }
        boolean zM606b = m606b();
        boolean zM606b2 = jqVar.m606b();
        if ((zM606b || zM606b2) && !(zM606b && zM606b2 && this.f838a.m542a(jqVar.f838a))) {
            return false;
        }
        boolean zM607c = m607c();
        boolean zM607c2 = jqVar.m607c();
        if ((zM607c || zM607c2) && !(zM607c && zM607c2 && this.f843b.equals(jqVar.f843b))) {
            return false;
        }
        boolean zM608d = m608d();
        boolean zM608d2 = jqVar.m608d();
        if ((zM608d || zM608d2) && !(zM608d && zM608d2 && this.f844c.equals(jqVar.f844c))) {
            return false;
        }
        boolean zM609e = m609e();
        boolean zM609e2 = jqVar.m609e();
        if ((zM609e || zM609e2) && !(zM609e && zM609e2 && this.f845d.equals(jqVar.f845d))) {
            return false;
        }
        boolean zM610f = m610f();
        boolean zM610f2 = jqVar.m610f();
        if ((zM610f || zM610f2) && !(zM610f && zM610f2 && this.f846e.equals(jqVar.f846e))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = jqVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f847f.equals(jqVar.f847f))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = jqVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f837a.m514a(jqVar.f837a))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = jqVar.i();
        if ((zI || zI2) && !(zI && zI2 && this.f842a == jqVar.f842a)) {
            return false;
        }
        boolean zJ = j();
        boolean zJ2 = jqVar.j();
        if ((zJ || zJ2) && !(zJ && zJ2 && this.f841a.equals(jqVar.f841a))) {
            return false;
        }
        boolean zK = k();
        boolean zK2 = jqVar.k();
        if ((zK || zK2) && !(zK && zK2 && this.f848g.equals(jqVar.f848g))) {
            return false;
        }
        boolean zL = l();
        boolean zL2 = jqVar.l();
        if (zL || zL2) {
            return zL && zL2 && this.f849h.equals(jqVar.f849h);
        }
        return true;
    }

    public String b() {
        return this.f844c;
    }

    @Override // com.xiaomi.push.jy
    public void b(kj kjVar) throws kk {
        m603a();
        kjVar.a(f836a);
        if (this.f839a != null && m604a()) {
            kjVar.a(f107712a);
            kjVar.a(this.f839a);
            kjVar.b();
        }
        if (this.f838a != null && m606b()) {
            kjVar.a(f107713b);
            this.f838a.b(kjVar);
            kjVar.b();
        }
        if (this.f843b != null) {
            kjVar.a(f107714c);
            kjVar.a(this.f843b);
            kjVar.b();
        }
        if (this.f844c != null) {
            kjVar.a(f107715d);
            kjVar.a(this.f844c);
            kjVar.b();
        }
        if (this.f845d != null && m609e()) {
            kjVar.a(f107716e);
            kjVar.a(this.f845d);
            kjVar.b();
        }
        if (this.f846e != null && m610f()) {
            kjVar.a(f107717f);
            kjVar.a(this.f846e);
            kjVar.b();
        }
        if (this.f847f != null && g()) {
            kjVar.a(f107718g);
            kjVar.a(this.f847f);
            kjVar.b();
        }
        if (this.f837a != null && h()) {
            kjVar.a(f107719h);
            this.f837a.b(kjVar);
            kjVar.b();
        }
        if (i()) {
            kjVar.a(f107720i);
            kjVar.a(this.f842a);
            kjVar.b();
        }
        if (this.f841a != null && j()) {
            kjVar.a(f107721j);
            kjVar.a(new ki((byte) 11, (byte) 11, this.f841a.size()));
            for (Map.Entry<String, String> entry : this.f841a.entrySet()) {
                kjVar.a(entry.getKey());
                kjVar.a(entry.getValue());
            }
            kjVar.d();
            kjVar.b();
        }
        if (this.f848g != null && k()) {
            kjVar.a(f107722k);
            kjVar.a(this.f848g);
            kjVar.b();
        }
        if (this.f849h != null && l()) {
            kjVar.a(f107723l);
            kjVar.a(this.f849h);
            kjVar.b();
        }
        kjVar.c();
        kjVar.mo649a();
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m606b() {
        return this.f838a != null;
    }

    public String c() {
        return this.f846e;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m607c() {
        return this.f843b != null;
    }

    public String d() {
        return this.f847f;
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public boolean m608d() {
        return this.f844c != null;
    }

    public String e() {
        return this.f848g;
    }

    /* JADX INFO: renamed from: e, reason: collision with other method in class */
    public boolean m609e() {
        return this.f845d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jq)) {
            return m605a((jq) obj);
        }
        return false;
    }

    public String f() {
        return this.f849h;
    }

    /* JADX INFO: renamed from: f, reason: collision with other method in class */
    public boolean m610f() {
        return this.f846e != null;
    }

    public boolean g() {
        return this.f847f != null;
    }

    public boolean h() {
        return this.f837a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f840a.get(0);
    }

    public boolean j() {
        return this.f841a != null;
    }

    public boolean k() {
        return this.f848g != null;
    }

    public boolean l() {
        return this.f849h != null;
    }

    public String toString() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("XmPushActionSendMessage(");
        boolean z11 = false;
        if (m604a()) {
            sb2.append("debug:");
            String str = this.f839a;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            z10 = false;
        } else {
            z10 = true;
        }
        if (m606b()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append("target:");
            jc jcVar = this.f838a;
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
        String str2 = this.f843b;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(", ");
        sb2.append("appId:");
        String str3 = this.f844c;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        if (m609e()) {
            sb2.append(", ");
            sb2.append("packageName:");
            String str4 = this.f845d;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (m610f()) {
            sb2.append(", ");
            sb2.append("topic:");
            String str5 = this.f846e;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (g()) {
            sb2.append(", ");
            sb2.append("aliasName:");
            String str6 = this.f847f;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
        }
        if (h()) {
            sb2.append(", ");
            sb2.append("message:");
            iz izVar = this.f837a;
            if (izVar == null) {
                sb2.append("null");
            } else {
                sb2.append(izVar);
            }
        }
        if (i()) {
            sb2.append(", ");
            sb2.append("needAck:");
            sb2.append(this.f842a);
        }
        if (j()) {
            sb2.append(", ");
            sb2.append("params:");
            Map<String, String> map = this.f841a;
            if (map == null) {
                sb2.append("null");
            } else {
                sb2.append(map);
            }
        }
        if (k()) {
            sb2.append(", ");
            sb2.append("category:");
            String str7 = this.f848g;
            if (str7 == null) {
                sb2.append("null");
            } else {
                sb2.append(str7);
            }
        }
        if (l()) {
            sb2.append(", ");
            sb2.append("userAccount:");
            String str8 = this.f849h;
            if (str8 == null) {
                sb2.append("null");
            } else {
                sb2.append(str8);
            }
        }
        sb2.append(")");
        return sb2.toString();
    }
}
