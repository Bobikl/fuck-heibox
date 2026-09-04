package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* JADX INFO: loaded from: classes4.dex */
public class iv implements jy<iv, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f613a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public ip f614a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f615a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f616a = new BitSet(1);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final ko f612a = new ko("DataCollectionItem");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final kg f107493a = new kg("", (byte) 10, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final kg f107494b = new kg("", (byte) 8, 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final kg f107495c = new kg("", (byte) 11, 3);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(iv ivVar) {
        int iA;
        int iA2;
        int iA3;
        if (!getClass().equals(ivVar.getClass())) {
            return getClass().getName().compareTo(ivVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m498a()).compareTo(Boolean.valueOf(ivVar.m498a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m498a() && (iA3 = jz.a(this.f613a, ivVar.f613a)) != 0) {
            return iA3;
        }
        int iCompareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(ivVar.b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (b() && (iA2 = jz.a(this.f614a, ivVar.f614a)) != 0) {
            return iA2;
        }
        int iCompareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(ivVar.c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (!c() || (iA = jz.a(this.f615a, ivVar.f615a)) == 0) {
            return 0;
        }
        return iA;
    }

    public iv a(long j10) {
        this.f613a = j10;
        a(true);
        return this;
    }

    public iv a(ip ipVar) {
        this.f614a = ipVar;
        return this;
    }

    public iv a(String str) {
        this.f615a = str;
        return this;
    }

    public String a() {
        return this.f615a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m497a() throws kk {
        if (this.f614a == null) {
            throw new kk("Required field 'collectionType' was not present! Struct: " + toString());
        }
        if (this.f615a != null) {
            return;
        }
        throw new kk("Required field 'content' was not present! Struct: " + toString());
    }

    @Override // com.xiaomi.push.jy
    public void a(kj kjVar) throws kk {
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
                        km.a(kjVar, b10);
                    } else if (b10 == 11) {
                        this.f615a = kjVar.mo646a();
                    } else {
                        km.a(kjVar, b10);
                    }
                } else if (b10 == 8) {
                    this.f614a = ip.a(kjVar.mo639a());
                } else {
                    km.a(kjVar, b10);
                }
            } else if (b10 == 10) {
                this.f613a = kjVar.mo640a();
                a(true);
            } else {
                km.a(kjVar, b10);
            }
            kjVar.g();
        }
        kjVar.f();
        if (m498a()) {
            m497a();
            return;
        }
        throw new kk("Required field 'collectedAt' was not found in serialized data! Struct: " + toString());
    }

    public void a(boolean z10) {
        this.f616a.set(0, z10);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m498a() {
        return this.f616a.get(0);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m499a(iv ivVar) {
        if (ivVar == null || this.f613a != ivVar.f613a) {
            return false;
        }
        boolean zB = b();
        boolean zB2 = ivVar.b();
        if ((zB || zB2) && !(zB && zB2 && this.f614a.equals(ivVar.f614a))) {
            return false;
        }
        boolean zC = c();
        boolean zC2 = ivVar.c();
        if (zC || zC2) {
            return zC && zC2 && this.f615a.equals(ivVar.f615a);
        }
        return true;
    }

    @Override // com.xiaomi.push.jy
    public void b(kj kjVar) throws kk {
        m497a();
        kjVar.a(f612a);
        kjVar.a(f107493a);
        kjVar.a(this.f613a);
        kjVar.b();
        if (this.f614a != null) {
            kjVar.a(f107494b);
            kjVar.mo650a(this.f614a.a());
            kjVar.b();
        }
        if (this.f615a != null) {
            kjVar.a(f107495c);
            kjVar.a(this.f615a);
            kjVar.b();
        }
        kjVar.c();
        kjVar.mo649a();
    }

    public boolean b() {
        return this.f614a != null;
    }

    public boolean c() {
        return this.f615a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof iv)) {
            return m499a((iv) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DataCollectionItem(");
        sb2.append("collectedAt:");
        sb2.append(this.f613a);
        sb2.append(", ");
        sb2.append("collectionType:");
        ip ipVar = this.f614a;
        if (ipVar == null) {
            sb2.append("null");
        } else {
            sb2.append(ipVar);
        }
        sb2.append(", ");
        sb2.append("content:");
        String str = this.f615a;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
