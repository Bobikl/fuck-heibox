package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class iw implements jy<iw, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f618a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public it f619a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f620a = new BitSet(1);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public List<iy> f621a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final ko f617a = new ko("NormalConfig");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final kg f107496a = new kg("", (byte) 8, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final kg f107497b = new kg("", (byte) 15, 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final kg f107498c = new kg("", (byte) 8, 3);

    public int a() {
        return this.f618a;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(iw iwVar) {
        int iA;
        int iA2;
        int iA3;
        if (!getClass().equals(iwVar.getClass())) {
            return getClass().getName().compareTo(iwVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m502a()).compareTo(Boolean.valueOf(iwVar.m502a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m502a() && (iA3 = jz.a(this.f618a, iwVar.f618a)) != 0) {
            return iA3;
        }
        int iCompareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(iwVar.b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (b() && (iA2 = jz.a(this.f621a, iwVar.f621a)) != 0) {
            return iA2;
        }
        int iCompareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(iwVar.c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (!c() || (iA = jz.a(this.f619a, iwVar.f619a)) == 0) {
            return 0;
        }
        return iA;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public it m500a() {
        return this.f619a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m501a() throws kk {
        if (this.f621a != null) {
            return;
        }
        throw new kk("Required field 'configItems' was not present! Struct: " + toString());
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
                    } else if (b10 == 8) {
                        this.f619a = it.a(kjVar.mo639a());
                    } else {
                        km.a(kjVar, b10);
                    }
                } else if (b10 == 15) {
                    kh khVarMo642a = kjVar.mo642a();
                    this.f621a = new ArrayList(khVarMo642a.f926a);
                    for (int i10 = 0; i10 < khVarMo642a.f926a; i10++) {
                        iy iyVar = new iy();
                        iyVar.a(kjVar);
                        this.f621a.add(iyVar);
                    }
                    kjVar.i();
                } else {
                    km.a(kjVar, b10);
                }
            } else if (b10 == 8) {
                this.f618a = kjVar.mo639a();
                a(true);
            } else {
                km.a(kjVar, b10);
            }
            kjVar.g();
        }
        kjVar.f();
        if (m502a()) {
            m501a();
            return;
        }
        throw new kk("Required field 'version' was not found in serialized data! Struct: " + toString());
    }

    public void a(boolean z10) {
        this.f620a.set(0, z10);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m502a() {
        return this.f620a.get(0);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m503a(iw iwVar) {
        if (iwVar == null || this.f618a != iwVar.f618a) {
            return false;
        }
        boolean zB = b();
        boolean zB2 = iwVar.b();
        if ((zB || zB2) && !(zB && zB2 && this.f621a.equals(iwVar.f621a))) {
            return false;
        }
        boolean zC = c();
        boolean zC2 = iwVar.c();
        if (zC || zC2) {
            return zC && zC2 && this.f619a.equals(iwVar.f619a);
        }
        return true;
    }

    @Override // com.xiaomi.push.jy
    public void b(kj kjVar) throws kk {
        m501a();
        kjVar.a(f617a);
        kjVar.a(f107496a);
        kjVar.mo650a(this.f618a);
        kjVar.b();
        if (this.f621a != null) {
            kjVar.a(f107497b);
            kjVar.a(new kh((byte) 12, this.f621a.size()));
            Iterator<iy> it = this.f621a.iterator();
            while (it.hasNext()) {
                it.next().b(kjVar);
            }
            kjVar.e();
            kjVar.b();
        }
        if (this.f619a != null && c()) {
            kjVar.a(f107498c);
            kjVar.mo650a(this.f619a.a());
            kjVar.b();
        }
        kjVar.c();
        kjVar.mo649a();
    }

    public boolean b() {
        return this.f621a != null;
    }

    public boolean c() {
        return this.f619a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof iw)) {
            return m503a((iw) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NormalConfig(");
        sb2.append("version:");
        sb2.append(this.f618a);
        sb2.append(", ");
        sb2.append("configItems:");
        List<iy> list = this.f621a;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        if (c()) {
            sb2.append(", ");
            sb2.append("type:");
            it itVar = this.f619a;
            if (itVar == null) {
                sb2.append("null");
            } else {
                sb2.append(itVar);
            }
        }
        sb2.append(")");
        return sb2.toString();
    }
}
