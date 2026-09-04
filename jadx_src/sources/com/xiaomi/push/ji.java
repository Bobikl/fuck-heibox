package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ji implements jy<ji, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f732a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public jc f733a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f734a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public List<String> f736a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f738b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f739c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f740d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public String f741e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public String f742f;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final ko f731a = new ko("XmPushActionCommandResult");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final kg f107624a = new kg("", (byte) 12, 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final kg f107625b = new kg("", (byte) 11, 3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final kg f107626c = new kg("", (byte) 11, 4);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final kg f107627d = new kg("", (byte) 11, 5);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final kg f107628e = new kg("", (byte) 10, 7);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final kg f107629f = new kg("", (byte) 11, 8);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final kg f107630g = new kg("", (byte) 11, 9);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final kg f107631h = new kg("", (byte) 15, 10);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final kg f107632i = new kg("", (byte) 11, 12);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final kg f107633j = new kg("", (byte) 2, 13);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f735a = new BitSet(2);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f737a = true;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ji jiVar) {
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
        if (!getClass().equals(jiVar.getClass())) {
            return getClass().getName().compareTo(jiVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m560a()).compareTo(Boolean.valueOf(jiVar.m560a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m560a() && (iA10 = jz.a(this.f733a, jiVar.f733a)) != 0) {
            return iA10;
        }
        int iCompareTo2 = Boolean.valueOf(m562b()).compareTo(Boolean.valueOf(jiVar.m562b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m562b() && (iA9 = jz.a(this.f734a, jiVar.f734a)) != 0) {
            return iA9;
        }
        int iCompareTo3 = Boolean.valueOf(m563c()).compareTo(Boolean.valueOf(jiVar.m563c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m563c() && (iA8 = jz.a(this.f738b, jiVar.f738b)) != 0) {
            return iA8;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jiVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iA7 = jz.a(this.f739c, jiVar.f739c)) != 0) {
            return iA7;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jiVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iA6 = jz.a(this.f732a, jiVar.f732a)) != 0) {
            return iA6;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jiVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iA5 = jz.a(this.f740d, jiVar.f740d)) != 0) {
            return iA5;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jiVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iA4 = jz.a(this.f741e, jiVar.f741e)) != 0) {
            return iA4;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jiVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iA3 = jz.a(this.f736a, jiVar.f736a)) != 0) {
            return iA3;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jiVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (i() && (iA2 = jz.a(this.f742f, jiVar.f742f)) != 0) {
            return iA2;
        }
        int iCompareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(jiVar.j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (!j() || (iA = jz.a(this.f737a, jiVar.f737a)) == 0) {
            return 0;
        }
        return iA;
    }

    public String a() {
        return this.f734a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public List<String> m558a() {
        return this.f736a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m559a() throws kk {
        if (this.f734a == null) {
            throw new kk("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f738b == null) {
            throw new kk("Required field 'appId' was not present! Struct: " + toString());
        }
        if (this.f739c != null) {
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
                if (e()) {
                    m559a();
                    return;
                }
                throw new kk("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
            }
            switch (kgVarMo641a.f925a) {
                case 2:
                    if (b10 == 12) {
                        jc jcVar = new jc();
                        this.f733a = jcVar;
                        jcVar.a(kjVar);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 3:
                    if (b10 == 11) {
                        this.f734a = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 4:
                    if (b10 == 11) {
                        this.f738b = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 5:
                    if (b10 == 11) {
                        this.f739c = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 6:
                case 11:
                default:
                    km.a(kjVar, b10);
                    break;
                case 7:
                    if (b10 == 10) {
                        this.f732a = kjVar.mo640a();
                        a(true);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 8:
                    if (b10 == 11) {
                        this.f740d = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 9:
                    if (b10 == 11) {
                        this.f741e = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 10:
                    if (b10 == 15) {
                        kh khVarMo642a = kjVar.mo642a();
                        this.f736a = new ArrayList(khVarMo642a.f926a);
                        for (int i10 = 0; i10 < khVarMo642a.f926a; i10++) {
                            this.f736a.add(kjVar.mo646a());
                        }
                        kjVar.i();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 12:
                    if (b10 == 11) {
                        this.f742f = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
                case 13:
                    if (b10 == 2) {
                        this.f737a = kjVar.mo651a();
                        b(true);
                    } else {
                        km.a(kjVar, b10);
                    }
                    break;
            }
            kjVar.g();
        }
    }

    public void a(boolean z10) {
        this.f735a.set(0, z10);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m560a() {
        return this.f733a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m561a(ji jiVar) {
        if (jiVar == null) {
            return false;
        }
        boolean zM560a = m560a();
        boolean zM560a2 = jiVar.m560a();
        if ((zM560a || zM560a2) && !(zM560a && zM560a2 && this.f733a.m542a(jiVar.f733a))) {
            return false;
        }
        boolean zM562b = m562b();
        boolean zM562b2 = jiVar.m562b();
        if ((zM562b || zM562b2) && !(zM562b && zM562b2 && this.f734a.equals(jiVar.f734a))) {
            return false;
        }
        boolean zM563c = m563c();
        boolean zM563c2 = jiVar.m563c();
        if ((zM563c || zM563c2) && !(zM563c && zM563c2 && this.f738b.equals(jiVar.f738b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = jiVar.d();
        if (((zD || zD2) && !(zD && zD2 && this.f739c.equals(jiVar.f739c))) || this.f732a != jiVar.f732a) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = jiVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f740d.equals(jiVar.f740d))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = jiVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f741e.equals(jiVar.f741e))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = jiVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f736a.equals(jiVar.f736a))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = jiVar.i();
        if ((zI || zI2) && !(zI && zI2 && this.f742f.equals(jiVar.f742f))) {
            return false;
        }
        boolean zJ = j();
        boolean zJ2 = jiVar.j();
        if (zJ || zJ2) {
            return zJ && zJ2 && this.f737a == jiVar.f737a;
        }
        return true;
    }

    public String b() {
        return this.f739c;
    }

    @Override // com.xiaomi.push.jy
    public void b(kj kjVar) throws kk {
        m559a();
        kjVar.a(f731a);
        if (this.f733a != null && m560a()) {
            kjVar.a(f107624a);
            this.f733a.b(kjVar);
            kjVar.b();
        }
        if (this.f734a != null) {
            kjVar.a(f107625b);
            kjVar.a(this.f734a);
            kjVar.b();
        }
        if (this.f738b != null) {
            kjVar.a(f107626c);
            kjVar.a(this.f738b);
            kjVar.b();
        }
        if (this.f739c != null) {
            kjVar.a(f107627d);
            kjVar.a(this.f739c);
            kjVar.b();
        }
        kjVar.a(f107628e);
        kjVar.a(this.f732a);
        kjVar.b();
        if (this.f740d != null && f()) {
            kjVar.a(f107629f);
            kjVar.a(this.f740d);
            kjVar.b();
        }
        if (this.f741e != null && g()) {
            kjVar.a(f107630g);
            kjVar.a(this.f741e);
            kjVar.b();
        }
        if (this.f736a != null && h()) {
            kjVar.a(f107631h);
            kjVar.a(new kh((byte) 11, this.f736a.size()));
            Iterator<String> it = this.f736a.iterator();
            while (it.hasNext()) {
                kjVar.a(it.next());
            }
            kjVar.e();
            kjVar.b();
        }
        if (this.f742f != null && i()) {
            kjVar.a(f107632i);
            kjVar.a(this.f742f);
            kjVar.b();
        }
        if (j()) {
            kjVar.a(f107633j);
            kjVar.a(this.f737a);
            kjVar.b();
        }
        kjVar.c();
        kjVar.mo649a();
    }

    public void b(boolean z10) {
        this.f735a.set(1, z10);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m562b() {
        return this.f734a != null;
    }

    public String c() {
        return this.f742f;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m563c() {
        return this.f738b != null;
    }

    public boolean d() {
        return this.f739c != null;
    }

    public boolean e() {
        return this.f735a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ji)) {
            return m561a((ji) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f740d != null;
    }

    public boolean g() {
        return this.f741e != null;
    }

    public boolean h() {
        return this.f736a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f742f != null;
    }

    public boolean j() {
        return this.f735a.get(1);
    }

    public String toString() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("XmPushActionCommandResult(");
        if (m560a()) {
            sb2.append("target:");
            jc jcVar = this.f733a;
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
        String str = this.f734a;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(", ");
        sb2.append("appId:");
        String str2 = this.f738b;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(", ");
        sb2.append("cmdName:");
        String str3 = this.f739c;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(", ");
        sb2.append("errorCode:");
        sb2.append(this.f732a);
        if (f()) {
            sb2.append(", ");
            sb2.append("reason:");
            String str4 = this.f740d;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (g()) {
            sb2.append(", ");
            sb2.append("packageName:");
            String str5 = this.f741e;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (h()) {
            sb2.append(", ");
            sb2.append("cmdArgs:");
            List<String> list = this.f736a;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
        }
        if (i()) {
            sb2.append(", ");
            sb2.append("category:");
            String str6 = this.f742f;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
        }
        if (j()) {
            sb2.append(", ");
            sb2.append("response2Client:");
            sb2.append(this.f737a);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
