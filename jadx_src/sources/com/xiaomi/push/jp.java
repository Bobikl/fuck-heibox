package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* JADX INFO: loaded from: classes4.dex */
public class jp implements jy<jp, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f828a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public jc f829a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f830a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f831a = new BitSet(1);

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f832b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f833c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f834d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public String f835e;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final ko f827a = new ko("XmPushActionSendFeedbackResult");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final kg f107705a = new kg("", (byte) 11, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final kg f107706b = new kg("", (byte) 12, 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final kg f107707c = new kg("", (byte) 11, 3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final kg f107708d = new kg("", (byte) 11, 4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final kg f107709e = new kg("", (byte) 10, 6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final kg f107710f = new kg("", (byte) 11, 7);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final kg f107711g = new kg("", (byte) 11, 8);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(jp jpVar) {
        int iA;
        int iA2;
        int iA3;
        int iA4;
        int iA5;
        int iA6;
        int iA7;
        if (!getClass().equals(jpVar.getClass())) {
            return getClass().getName().compareTo(jpVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m600a()).compareTo(Boolean.valueOf(jpVar.m600a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m600a() && (iA7 = jz.a(this.f830a, jpVar.f830a)) != 0) {
            return iA7;
        }
        int iCompareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(jpVar.b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (b() && (iA6 = jz.a(this.f829a, jpVar.f829a)) != 0) {
            return iA6;
        }
        int iCompareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(jpVar.c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (c() && (iA5 = jz.a(this.f832b, jpVar.f832b)) != 0) {
            return iA5;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jpVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iA4 = jz.a(this.f833c, jpVar.f833c)) != 0) {
            return iA4;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jpVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iA3 = jz.a(this.f828a, jpVar.f828a)) != 0) {
            return iA3;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jpVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iA2 = jz.a(this.f834d, jpVar.f834d)) != 0) {
            return iA2;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jpVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (!g() || (iA = jz.a(this.f835e, jpVar.f835e)) == 0) {
            return 0;
        }
        return iA;
    }

    public void a() throws kk {
        if (this.f832b == null) {
            throw new kk("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f833c != null) {
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
                if (e()) {
                    a();
                    return;
                }
                throw new kk("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
            }
            switch (kgVarMo641a.f925a) {
                case 1:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f830a = kjVar.mo646a();
                    }
                    break;
                case 2:
                    if (b10 != 12) {
                        km.a(kjVar, b10);
                    } else {
                        jc jcVar = new jc();
                        this.f829a = jcVar;
                        jcVar.a(kjVar);
                    }
                    break;
                case 3:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f832b = kjVar.mo646a();
                    }
                    break;
                case 4:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f833c = kjVar.mo646a();
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
                        this.f828a = kjVar.mo640a();
                        a(true);
                    }
                    break;
                case 7:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f834d = kjVar.mo646a();
                    }
                    break;
                case 8:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f835e = kjVar.mo646a();
                    }
                    break;
            }
            kjVar.g();
        }
    }

    public void a(boolean z10) {
        this.f831a.set(0, z10);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m600a() {
        return this.f830a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m601a(jp jpVar) {
        if (jpVar == null) {
            return false;
        }
        boolean zM600a = m600a();
        boolean zM600a2 = jpVar.m600a();
        if ((zM600a || zM600a2) && !(zM600a && zM600a2 && this.f830a.equals(jpVar.f830a))) {
            return false;
        }
        boolean zB = b();
        boolean zB2 = jpVar.b();
        if ((zB || zB2) && !(zB && zB2 && this.f829a.m542a(jpVar.f829a))) {
            return false;
        }
        boolean zC = c();
        boolean zC2 = jpVar.c();
        if ((zC || zC2) && !(zC && zC2 && this.f832b.equals(jpVar.f832b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = jpVar.d();
        if (((zD || zD2) && !(zD && zD2 && this.f833c.equals(jpVar.f833c))) || this.f828a != jpVar.f828a) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = jpVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f834d.equals(jpVar.f834d))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = jpVar.g();
        if (zG || zG2) {
            return zG && zG2 && this.f835e.equals(jpVar.f835e);
        }
        return true;
    }

    @Override // com.xiaomi.push.jy
    public void b(kj kjVar) throws kk {
        a();
        kjVar.a(f827a);
        if (this.f830a != null && m600a()) {
            kjVar.a(f107705a);
            kjVar.a(this.f830a);
            kjVar.b();
        }
        if (this.f829a != null && b()) {
            kjVar.a(f107706b);
            this.f829a.b(kjVar);
            kjVar.b();
        }
        if (this.f832b != null) {
            kjVar.a(f107707c);
            kjVar.a(this.f832b);
            kjVar.b();
        }
        if (this.f833c != null) {
            kjVar.a(f107708d);
            kjVar.a(this.f833c);
            kjVar.b();
        }
        kjVar.a(f107709e);
        kjVar.a(this.f828a);
        kjVar.b();
        if (this.f834d != null && f()) {
            kjVar.a(f107710f);
            kjVar.a(this.f834d);
            kjVar.b();
        }
        if (this.f835e != null && g()) {
            kjVar.a(f107711g);
            kjVar.a(this.f835e);
            kjVar.b();
        }
        kjVar.c();
        kjVar.mo649a();
    }

    public boolean b() {
        return this.f829a != null;
    }

    public boolean c() {
        return this.f832b != null;
    }

    public boolean d() {
        return this.f833c != null;
    }

    public boolean e() {
        return this.f831a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jp)) {
            return m601a((jp) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f834d != null;
    }

    public boolean g() {
        return this.f835e != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("XmPushActionSendFeedbackResult(");
        boolean z11 = false;
        if (m600a()) {
            sb2.append("debug:");
            String str = this.f830a;
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
            jc jcVar = this.f829a;
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
        String str2 = this.f832b;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(", ");
        sb2.append("appId:");
        String str3 = this.f833c;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(", ");
        sb2.append("errorCode:");
        sb2.append(this.f828a);
        if (f()) {
            sb2.append(", ");
            sb2.append("reason:");
            String str4 = this.f834d;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (g()) {
            sb2.append(", ");
            sb2.append("category:");
            String str5 = this.f835e;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        sb2.append(")");
        return sb2.toString();
    }
}
