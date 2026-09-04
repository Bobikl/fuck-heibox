package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class jh implements jy<jh, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f720a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public jc f721a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f722a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public List<String> f724a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f726b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f728c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f729d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public String f730e;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final ko f719a = new ko("XmPushActionCommand");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final kg f107614a = new kg("", (byte) 12, 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final kg f107615b = new kg("", (byte) 11, 3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final kg f107616c = new kg("", (byte) 11, 4);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final kg f107617d = new kg("", (byte) 11, 5);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final kg f107618e = new kg("", (byte) 15, 6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final kg f107619f = new kg("", (byte) 11, 7);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final kg f107620g = new kg("", (byte) 11, 9);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final kg f107621h = new kg("", (byte) 2, 10);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final kg f107622i = new kg("", (byte) 2, 11);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final kg f107623j = new kg("", (byte) 10, 12);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f723a = new BitSet(3);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f725a = false;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public boolean f727b = true;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(jh jhVar) {
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
        if (!getClass().equals(jhVar.getClass())) {
            return getClass().getName().compareTo(jhVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m556a()).compareTo(Boolean.valueOf(jhVar.m556a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m556a() && (iA10 = jz.a(this.f721a, jhVar.f721a)) != 0) {
            return iA10;
        }
        int iCompareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(jhVar.b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (b() && (iA9 = jz.a(this.f722a, jhVar.f722a)) != 0) {
            return iA9;
        }
        int iCompareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(jhVar.c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (c() && (iA8 = jz.a(this.f726b, jhVar.f726b)) != 0) {
            return iA8;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jhVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iA7 = jz.a(this.f728c, jhVar.f728c)) != 0) {
            return iA7;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jhVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iA6 = jz.a(this.f724a, jhVar.f724a)) != 0) {
            return iA6;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jhVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iA5 = jz.a(this.f729d, jhVar.f729d)) != 0) {
            return iA5;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jhVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iA4 = jz.a(this.f730e, jhVar.f730e)) != 0) {
            return iA4;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jhVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iA3 = jz.a(this.f725a, jhVar.f725a)) != 0) {
            return iA3;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jhVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (i() && (iA2 = jz.a(this.f727b, jhVar.f727b)) != 0) {
            return iA2;
        }
        int iCompareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(jhVar.j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (!j() || (iA = jz.a(this.f720a, jhVar.f720a)) == 0) {
            return 0;
        }
        return iA;
    }

    public jh a(String str) {
        this.f722a = str;
        return this;
    }

    public String a() {
        return this.f728c;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m554a() throws kk {
        if (this.f722a == null) {
            throw new kk("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f726b == null) {
            throw new kk("Required field 'appId' was not present! Struct: " + toString());
        }
        if (this.f728c != null) {
            return;
        }
        throw new kk("Required field 'cmdName' was not present! Struct: " + toString());
    }

    @Override // com.xiaomi.push.jy
    public void a(kj kjVar) throws kk {
        kjVar.mo645a();
        while (true) {
            kg kgVarMo641a = kjVar.mo641a();
            byte b10 = kgVarMo641a.f107793a;
            if (b10 == 0) {
                kjVar.f();
                m554a();
                return;
            }
            switch (kgVarMo641a.f925a) {
                case 2:
                    if (b10 == 12) {
                        jc jcVar = new jc();
                        this.f721a = jcVar;
                        jcVar.a(kjVar);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 3:
                    if (b10 == 11) {
                        this.f722a = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 4:
                    if (b10 == 11) {
                        this.f726b = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 5:
                    if (b10 == 11) {
                        this.f728c = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 6:
                    if (b10 == 15) {
                        kh khVarMo642a = kjVar.mo642a();
                        this.f724a = new ArrayList(khVarMo642a.f926a);
                        for (int i10 = 0; i10 < khVarMo642a.f926a; i10++) {
                            this.f724a.add(kjVar.mo646a());
                        }
                        kjVar.i();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 7:
                    if (b10 == 11) {
                        this.f729d = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 8:
                default:
                    km.a(kjVar, b10);
                    break;
                case 9:
                    if (b10 == 11) {
                        this.f730e = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 10:
                    if (b10 == 2) {
                        this.f725a = kjVar.mo651a();
                        a(true);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 11:
                    if (b10 == 2) {
                        this.f727b = kjVar.mo651a();
                        b(true);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 12:
                    if (b10 == 10) {
                        this.f720a = kjVar.mo640a();
                        c(true);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
            }
            kjVar.g();
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m555a(String str) {
        if (this.f724a == null) {
            this.f724a = new ArrayList();
        }
        this.f724a.add(str);
    }

    public void a(boolean z10) {
        this.f723a.set(0, z10);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m556a() {
        return this.f721a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m557a(jh jhVar) {
        if (jhVar == null) {
            return false;
        }
        boolean zM556a = m556a();
        boolean zM556a2 = jhVar.m556a();
        if ((zM556a || zM556a2) && !(zM556a && zM556a2 && this.f721a.m542a(jhVar.f721a))) {
            return false;
        }
        boolean zB = b();
        boolean zB2 = jhVar.b();
        if ((zB || zB2) && !(zB && zB2 && this.f722a.equals(jhVar.f722a))) {
            return false;
        }
        boolean zC = c();
        boolean zC2 = jhVar.c();
        if ((zC || zC2) && !(zC && zC2 && this.f726b.equals(jhVar.f726b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = jhVar.d();
        if ((zD || zD2) && !(zD && zD2 && this.f728c.equals(jhVar.f728c))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = jhVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.f724a.equals(jhVar.f724a))) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = jhVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f729d.equals(jhVar.f729d))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = jhVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f730e.equals(jhVar.f730e))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = jhVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f725a == jhVar.f725a)) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = jhVar.i();
        if ((zI || zI2) && !(zI && zI2 && this.f727b == jhVar.f727b)) {
            return false;
        }
        boolean zJ = j();
        boolean zJ2 = jhVar.j();
        if (zJ || zJ2) {
            return zJ && zJ2 && this.f720a == jhVar.f720a;
        }
        return true;
    }

    public jh b(String str) {
        this.f726b = str;
        return this;
    }

    @Override // com.xiaomi.push.jy
    public void b(kj kjVar) throws kk {
        m554a();
        kjVar.a(f719a);
        if (this.f721a != null && m556a()) {
            kjVar.a(f107614a);
            this.f721a.b(kjVar);
            kjVar.b();
        }
        if (this.f722a != null) {
            kjVar.a(f107615b);
            kjVar.a(this.f722a);
            kjVar.b();
        }
        if (this.f726b != null) {
            kjVar.a(f107616c);
            kjVar.a(this.f726b);
            kjVar.b();
        }
        if (this.f728c != null) {
            kjVar.a(f107617d);
            kjVar.a(this.f728c);
            kjVar.b();
        }
        if (this.f724a != null && e()) {
            kjVar.a(f107618e);
            kjVar.a(new kh((byte) 11, this.f724a.size()));
            Iterator<String> it = this.f724a.iterator();
            while (it.hasNext()) {
                kjVar.a(it.next());
            }
            kjVar.e();
            kjVar.b();
        }
        if (this.f729d != null && f()) {
            kjVar.a(f107619f);
            kjVar.a(this.f729d);
            kjVar.b();
        }
        if (this.f730e != null && g()) {
            kjVar.a(f107620g);
            kjVar.a(this.f730e);
            kjVar.b();
        }
        if (h()) {
            kjVar.a(f107621h);
            kjVar.a(this.f725a);
            kjVar.b();
        }
        if (i()) {
            kjVar.a(f107622i);
            kjVar.a(this.f727b);
            kjVar.b();
        }
        if (j()) {
            kjVar.a(f107623j);
            kjVar.a(this.f720a);
            kjVar.b();
        }
        kjVar.c();
        kjVar.mo649a();
    }

    public void b(boolean z10) {
        this.f723a.set(1, z10);
    }

    public boolean b() {
        return this.f722a != null;
    }

    public jh c(String str) {
        this.f728c = str;
        return this;
    }

    public void c(boolean z10) {
        this.f723a.set(2, z10);
    }

    public boolean c() {
        return this.f726b != null;
    }

    public jh d(String str) {
        this.f729d = str;
        return this;
    }

    public boolean d() {
        return this.f728c != null;
    }

    public jh e(String str) {
        this.f730e = str;
        return this;
    }

    public boolean e() {
        return this.f724a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jh)) {
            return m557a((jh) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f729d != null;
    }

    public boolean g() {
        return this.f730e != null;
    }

    public boolean h() {
        return this.f723a.get(0);
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f723a.get(1);
    }

    public boolean j() {
        return this.f723a.get(2);
    }

    public String toString() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("XmPushActionCommand(");
        if (m556a()) {
            sb2.append("target:");
            jc jcVar = this.f721a;
            if (jcVar == null) {
                sb2.append("null");
            } else {
                sb2.append(jcVar);
            }
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            sb2.append(", ");
        }
        sb2.append("id:");
        String str = this.f722a;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(", ");
        sb2.append("appId:");
        String str2 = this.f726b;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(", ");
        sb2.append("cmdName:");
        String str3 = this.f728c;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        if (e()) {
            sb2.append(", ");
            sb2.append("cmdArgs:");
            List<String> list = this.f724a;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
        }
        if (f()) {
            sb2.append(", ");
            sb2.append("packageName:");
            String str4 = this.f729d;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (g()) {
            sb2.append(", ");
            sb2.append("category:");
            String str5 = this.f730e;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (h()) {
            sb2.append(", ");
            sb2.append("updateCache:");
            sb2.append(this.f725a);
        }
        if (i()) {
            sb2.append(", ");
            sb2.append("response2Client:");
            sb2.append(this.f727b);
        }
        if (j()) {
            sb2.append(", ");
            sb2.append("createdTs:");
            sb2.append(this.f720a);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
