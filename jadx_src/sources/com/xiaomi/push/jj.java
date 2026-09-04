package com.xiaomi.push;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;

/* JADX INFO: loaded from: classes4.dex */
public class jj implements jy<jj, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public in f744a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public ja f745a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public jc f746a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f747a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public ByteBuffer f748a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f751b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final ko f743a = new ko("XmPushActionContainer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final kg f107634a = new kg("", (byte) 8, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final kg f107635b = new kg("", (byte) 2, 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final kg f107636c = new kg("", (byte) 2, 3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final kg f107637d = new kg("", (byte) 11, 4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final kg f107638e = new kg("", (byte) 11, 5);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final kg f107639f = new kg("", (byte) 11, 6);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final kg f107640g = new kg("", (byte) 12, 7);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final kg f107641h = new kg("", (byte) 12, 8);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f749a = new BitSet(2);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f750a = true;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public boolean f752b = true;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(jj jjVar) {
        int iA;
        int iA2;
        int iA3;
        int iA4;
        int iA5;
        int iA6;
        int iA7;
        int iA8;
        if (!getClass().equals(jjVar.getClass())) {
            return getClass().getName().compareTo(jjVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m568a()).compareTo(Boolean.valueOf(jjVar.m568a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m568a() && (iA8 = jz.a(this.f744a, jjVar.f744a)) != 0) {
            return iA8;
        }
        int iCompareTo2 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(jjVar.c()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (c() && (iA7 = jz.a(this.f750a, jjVar.f750a)) != 0) {
            return iA7;
        }
        int iCompareTo3 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jjVar.d()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (d() && (iA6 = jz.a(this.f752b, jjVar.f752b)) != 0) {
            return iA6;
        }
        int iCompareTo4 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jjVar.e()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (e() && (iA5 = jz.a(this.f748a, jjVar.f748a)) != 0) {
            return iA5;
        }
        int iCompareTo5 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jjVar.f()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (f() && (iA4 = jz.a(this.f747a, jjVar.f747a)) != 0) {
            return iA4;
        }
        int iCompareTo6 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jjVar.g()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (g() && (iA3 = jz.a(this.f751b, jjVar.f751b)) != 0) {
            return iA3;
        }
        int iCompareTo7 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jjVar.h()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (h() && (iA2 = jz.a(this.f746a, jjVar.f746a)) != 0) {
            return iA2;
        }
        int iCompareTo8 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jjVar.i()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (!i() || (iA = jz.a(this.f745a, jjVar.f745a)) == 0) {
            return 0;
        }
        return iA;
    }

    public in a() {
        return this.f744a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public ja m564a() {
        return this.f745a;
    }

    public jj a(in inVar) {
        this.f744a = inVar;
        return this;
    }

    public jj a(ja jaVar) {
        this.f745a = jaVar;
        return this;
    }

    public jj a(jc jcVar) {
        this.f746a = jcVar;
        return this;
    }

    public jj a(String str) {
        this.f747a = str;
        return this;
    }

    public jj a(ByteBuffer byteBuffer) {
        this.f748a = byteBuffer;
        return this;
    }

    public jj a(boolean z10) {
        this.f750a = z10;
        m567a(true);
        return this;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m565a() {
        return this.f747a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m566a() throws kk {
        if (this.f744a == null) {
            throw new kk("Required field 'action' was not present! Struct: " + toString());
        }
        if (this.f748a == null) {
            throw new kk("Required field 'pushAction' was not present! Struct: " + toString());
        }
        if (this.f746a != null) {
            return;
        }
        throw new kk("Required field 'target' was not present! Struct: " + toString());
    }

    @Override // com.xiaomi.push.jy
    public void a(kj kjVar) throws kk {
        kjVar.mo645a();
        while (true) {
            kg kgVarMo641a = kjVar.mo641a();
            byte b10 = kgVarMo641a.f107793a;
            if (b10 == 0) {
                kjVar.f();
                if (!c()) {
                    throw new kk("Required field 'encryptAction' was not found in serialized data! Struct: " + toString());
                }
                if (d()) {
                    m566a();
                    return;
                }
                throw new kk("Required field 'isRequest' was not found in serialized data! Struct: " + toString());
            }
            switch (kgVarMo641a.f925a) {
                case 1:
                    if (b10 != 8) {
                        km.a(kjVar, b10);
                    } else {
                        this.f744a = in.a(kjVar.mo639a());
                    }
                    break;
                case 2:
                    if (b10 != 2) {
                        km.a(kjVar, b10);
                    } else {
                        this.f750a = kjVar.mo651a();
                        m567a(true);
                    }
                    break;
                case 3:
                    if (b10 != 2) {
                        km.a(kjVar, b10);
                    } else {
                        this.f752b = kjVar.mo651a();
                        m571b(true);
                    }
                    break;
                case 4:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f748a = kjVar.mo647a();
                    }
                    break;
                case 5:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f747a = kjVar.mo646a();
                    }
                    break;
                case 6:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f751b = kjVar.mo646a();
                    }
                    break;
                case 7:
                    if (b10 != 12) {
                        km.a(kjVar, b10);
                    } else {
                        jc jcVar = new jc();
                        this.f746a = jcVar;
                        jcVar.a(kjVar);
                    }
                    break;
                case 8:
                    if (b10 != 12) {
                        km.a(kjVar, b10);
                    } else {
                        ja jaVar = new ja();
                        this.f745a = jaVar;
                        jaVar.a(kjVar);
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
    public void m567a(boolean z10) {
        this.f749a.set(0, z10);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m568a() {
        return this.f744a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m569a(jj jjVar) {
        if (jjVar == null) {
            return false;
        }
        boolean zM568a = m568a();
        boolean zM568a2 = jjVar.m568a();
        if (((zM568a || zM568a2) && (!zM568a || !zM568a2 || !this.f744a.equals(jjVar.f744a))) || this.f750a != jjVar.f750a || this.f752b != jjVar.f752b) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = jjVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.f748a.equals(jjVar.f748a))) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = jjVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f747a.equals(jjVar.f747a))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = jjVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f751b.equals(jjVar.f751b))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = jjVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f746a.m542a(jjVar.f746a))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = jjVar.i();
        if (zI || zI2) {
            return zI && zI2 && this.f745a.m534a(jjVar.f745a);
        }
        return true;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public byte[] m570a() {
        a(jz.a(this.f748a));
        return this.f748a.array();
    }

    public jj b(String str) {
        this.f751b = str;
        return this;
    }

    public jj b(boolean z10) {
        this.f752b = z10;
        m571b(true);
        return this;
    }

    public String b() {
        return this.f751b;
    }

    @Override // com.xiaomi.push.jy
    public void b(kj kjVar) throws kk {
        m566a();
        kjVar.a(f743a);
        if (this.f744a != null) {
            kjVar.a(f107634a);
            kjVar.mo650a(this.f744a.a());
            kjVar.b();
        }
        kjVar.a(f107635b);
        kjVar.a(this.f750a);
        kjVar.b();
        kjVar.a(f107636c);
        kjVar.a(this.f752b);
        kjVar.b();
        if (this.f748a != null) {
            kjVar.a(f107637d);
            kjVar.a(this.f748a);
            kjVar.b();
        }
        if (this.f747a != null && f()) {
            kjVar.a(f107638e);
            kjVar.a(this.f747a);
            kjVar.b();
        }
        if (this.f751b != null && g()) {
            kjVar.a(f107639f);
            kjVar.a(this.f751b);
            kjVar.b();
        }
        if (this.f746a != null) {
            kjVar.a(f107640g);
            this.f746a.b(kjVar);
            kjVar.b();
        }
        if (this.f745a != null && i()) {
            kjVar.a(f107641h);
            this.f745a.b(kjVar);
            kjVar.b();
        }
        kjVar.c();
        kjVar.mo649a();
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public void m571b(boolean z10) {
        this.f749a.set(1, z10);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m572b() {
        return this.f750a;
    }

    public boolean c() {
        return this.f749a.get(0);
    }

    public boolean d() {
        return this.f749a.get(1);
    }

    public boolean e() {
        return this.f748a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jj)) {
            return m569a((jj) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f747a != null;
    }

    public boolean g() {
        return this.f751b != null;
    }

    public boolean h() {
        return this.f746a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f745a != null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("XmPushActionContainer(");
        sb2.append("action:");
        in inVar = this.f744a;
        if (inVar == null) {
            sb2.append("null");
        } else {
            sb2.append(inVar);
        }
        sb2.append(", ");
        sb2.append("encryptAction:");
        sb2.append(this.f750a);
        sb2.append(", ");
        sb2.append("isRequest:");
        sb2.append(this.f752b);
        if (f()) {
            sb2.append(", ");
            sb2.append("appid:");
            String str = this.f747a;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
        }
        if (g()) {
            sb2.append(", ");
            sb2.append("packageName:");
            String str2 = this.f751b;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        sb2.append(", ");
        sb2.append("target:");
        jc jcVar = this.f746a;
        if (jcVar == null) {
            sb2.append("null");
        } else {
            sb2.append(jcVar);
        }
        if (i()) {
            sb2.append(", ");
            sb2.append("metaInfo:");
            ja jaVar = this.f745a;
            if (jaVar == null) {
                sb2.append("null");
            } else {
                sb2.append(jaVar);
            }
        }
        sb2.append(")");
        return sb2.toString();
    }
}
