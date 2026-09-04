package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* JADX INFO: loaded from: classes4.dex */
public class jf implements jy<jf, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f714a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f715a = new BitSet(2);

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public int f716b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final ko f713a = new ko("XmPushActionCheckClientInfo");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final kg f107611a = new kg("", (byte) 8, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final kg f107612b = new kg("", (byte) 8, 2);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(jf jfVar) {
        int iA;
        int iA2;
        if (!getClass().equals(jfVar.getClass())) {
            return getClass().getName().compareTo(jfVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m550a()).compareTo(Boolean.valueOf(jfVar.m550a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m550a() && (iA2 = jz.a(this.f714a, jfVar.f714a)) != 0) {
            return iA2;
        }
        int iCompareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(jfVar.b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (!b() || (iA = jz.a(this.f716b, jfVar.f716b)) == 0) {
            return 0;
        }
        return iA;
    }

    public jf a(int i10) {
        this.f714a = i10;
        a(true);
        return this;
    }

    public void a() {
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
                    km.a(kjVar, b10);
                } else if (b10 == 8) {
                    this.f716b = kjVar.mo639a();
                    b(true);
                } else {
                    km.a(kjVar, b10);
                }
            } else if (b10 == 8) {
                this.f714a = kjVar.mo639a();
                a(true);
            } else {
                km.a(kjVar, b10);
            }
            kjVar.g();
        }
        kjVar.f();
        if (!m550a()) {
            throw new kk("Required field 'miscConfigVersion' was not found in serialized data! Struct: " + toString());
        }
        if (b()) {
            a();
            return;
        }
        throw new kk("Required field 'pluginConfigVersion' was not found in serialized data! Struct: " + toString());
    }

    public void a(boolean z10) {
        this.f715a.set(0, z10);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m550a() {
        return this.f715a.get(0);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m551a(jf jfVar) {
        return jfVar != null && this.f714a == jfVar.f714a && this.f716b == jfVar.f716b;
    }

    public jf b(int i10) {
        this.f716b = i10;
        b(true);
        return this;
    }

    @Override // com.xiaomi.push.jy
    public void b(kj kjVar) {
        a();
        kjVar.a(f713a);
        kjVar.a(f107611a);
        kjVar.mo650a(this.f714a);
        kjVar.b();
        kjVar.a(f107612b);
        kjVar.mo650a(this.f716b);
        kjVar.b();
        kjVar.c();
        kjVar.mo649a();
    }

    public void b(boolean z10) {
        this.f715a.set(1, z10);
    }

    public boolean b() {
        return this.f715a.get(1);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jf)) {
            return m551a((jf) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "XmPushActionCheckClientInfo(miscConfigVersion:" + this.f714a + ", pluginConfigVersion:" + this.f716b + ")";
    }
}
