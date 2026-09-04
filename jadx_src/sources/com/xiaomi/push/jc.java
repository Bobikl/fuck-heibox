package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* JADX INFO: loaded from: classes4.dex */
public class jc implements jy<jc, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f673a;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f678d;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final ko f671a = new ko("Target");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final kg f107575a = new kg("", (byte) 10, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final kg f107576b = new kg("", (byte) 11, 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final kg f107577c = new kg("", (byte) 11, 3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final kg f107578d = new kg("", (byte) 11, 4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final kg f107579e = new kg("", (byte) 2, 5);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final kg f107580f = new kg("", (byte) 11, 7);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f674a = new BitSet(2);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f672a = 5;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f676b = "xiaomi.com";

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f677c = "";

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f675a = false;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(jc jcVar) {
        int iA;
        int iA2;
        int iA3;
        int iA4;
        int iA5;
        int iA6;
        if (!getClass().equals(jcVar.getClass())) {
            return getClass().getName().compareTo(jcVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m541a()).compareTo(Boolean.valueOf(jcVar.m541a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m541a() && (iA6 = jz.a(this.f672a, jcVar.f672a)) != 0) {
            return iA6;
        }
        int iCompareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(jcVar.b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (b() && (iA5 = jz.a(this.f673a, jcVar.f673a)) != 0) {
            return iA5;
        }
        int iCompareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(jcVar.c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (c() && (iA4 = jz.a(this.f676b, jcVar.f676b)) != 0) {
            return iA4;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jcVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iA3 = jz.a(this.f677c, jcVar.f677c)) != 0) {
            return iA3;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jcVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iA2 = jz.a(this.f675a, jcVar.f675a)) != 0) {
            return iA2;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jcVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (!f() || (iA = jz.a(this.f678d, jcVar.f678d)) == 0) {
            return 0;
        }
        return iA;
    }

    public void a() throws kk {
        if (this.f673a != null) {
            return;
        }
        throw new kk("Required field 'userId' was not present! Struct: " + toString());
    }

    @Override // com.xiaomi.push.jy
    public void a(kj kjVar) {
        kjVar.mo645a();
        while (true) {
            kg kgVarMo641a = kjVar.mo641a();
            byte b10 = kgVarMo641a.f107793a;
            if (b10 == 0) {
                break;
            }
            short s10 = kgVarMo641a.f925a;
            if (s10 != 1) {
                if (s10 != 2) {
                    if (s10 != 3) {
                        if (s10 != 4) {
                            if (s10 != 5) {
                                if (s10 != 7) {
                                    km.a(kjVar, b10);
                                } else if (b10 == 11) {
                                    this.f678d = kjVar.mo646a();
                                } else {
                                    km.a(kjVar, b10);
                                }
                            } else if (b10 == 2) {
                                this.f675a = kjVar.mo651a();
                                b(true);
                            } else {
                                km.a(kjVar, b10);
                            }
                        } else if (b10 == 11) {
                            this.f677c = kjVar.mo646a();
                        } else {
                            km.a(kjVar, b10);
                        }
                    } else if (b10 == 11) {
                        this.f676b = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                } else if (b10 == 11) {
                    this.f673a = kjVar.mo646a();
                } else {
                    km.a(kjVar, b10);
                }
            } else if (b10 == 10) {
                this.f672a = kjVar.mo640a();
                a(true);
            } else {
                km.a(kjVar, b10);
            }
            kjVar.g();
        }
        kjVar.f();
        if (m541a()) {
            a();
            return;
        }
        throw new kk("Required field 'channelId' was not found in serialized data! Struct: " + toString());
    }

    public void a(boolean z10) {
        this.f674a.set(0, z10);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m541a() {
        return this.f674a.get(0);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m542a(jc jcVar) {
        if (jcVar == null || this.f672a != jcVar.f672a) {
            return false;
        }
        boolean zB = b();
        boolean zB2 = jcVar.b();
        if ((zB || zB2) && !(zB && zB2 && this.f673a.equals(jcVar.f673a))) {
            return false;
        }
        boolean zC = c();
        boolean zC2 = jcVar.c();
        if ((zC || zC2) && !(zC && zC2 && this.f676b.equals(jcVar.f676b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = jcVar.d();
        if ((zD || zD2) && !(zD && zD2 && this.f677c.equals(jcVar.f677c))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = jcVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.f675a == jcVar.f675a)) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = jcVar.f();
        if (zF || zF2) {
            return zF && zF2 && this.f678d.equals(jcVar.f678d);
        }
        return true;
    }

    @Override // com.xiaomi.push.jy
    public void b(kj kjVar) {
        a();
        kjVar.a(f671a);
        kjVar.a(f107575a);
        kjVar.a(this.f672a);
        kjVar.b();
        if (this.f673a != null) {
            kjVar.a(f107576b);
            kjVar.a(this.f673a);
            kjVar.b();
        }
        if (this.f676b != null && c()) {
            kjVar.a(f107577c);
            kjVar.a(this.f676b);
            kjVar.b();
        }
        if (this.f677c != null && d()) {
            kjVar.a(f107578d);
            kjVar.a(this.f677c);
            kjVar.b();
        }
        if (e()) {
            kjVar.a(f107579e);
            kjVar.a(this.f675a);
            kjVar.b();
        }
        if (this.f678d != null && f()) {
            kjVar.a(f107580f);
            kjVar.a(this.f678d);
            kjVar.b();
        }
        kjVar.c();
        kjVar.mo649a();
    }

    public void b(boolean z10) {
        this.f674a.set(1, z10);
    }

    public boolean b() {
        return this.f673a != null;
    }

    public boolean c() {
        return this.f676b != null;
    }

    public boolean d() {
        return this.f677c != null;
    }

    public boolean e() {
        return this.f674a.get(1);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jc)) {
            return m542a((jc) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f678d != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Target(");
        sb2.append("channelId:");
        sb2.append(this.f672a);
        sb2.append(", ");
        sb2.append("userId:");
        String str = this.f673a;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        if (c()) {
            sb2.append(", ");
            sb2.append("server:");
            String str2 = this.f676b;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        if (d()) {
            sb2.append(", ");
            sb2.append("resource:");
            String str3 = this.f677c;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        if (e()) {
            sb2.append(", ");
            sb2.append("isPreview:");
            sb2.append(this.f675a);
        }
        if (f()) {
            sb2.append(", ");
            sb2.append("token:");
            String str4 = this.f678d;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        sb2.append(")");
        return sb2.toString();
    }
}
