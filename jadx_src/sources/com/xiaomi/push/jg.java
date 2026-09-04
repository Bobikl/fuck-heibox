package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class jg implements jy<jg, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public List<iv> f718a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final ko f717a = new ko("XmPushActionCollectData");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final kg f107613a = new kg("", (byte) 15, 1);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(jg jgVar) {
        int iA;
        if (!getClass().equals(jgVar.getClass())) {
            return getClass().getName().compareTo(jgVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m552a()).compareTo(Boolean.valueOf(jgVar.m552a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (!m552a() || (iA = jz.a(this.f718a, jgVar.f718a)) == 0) {
            return 0;
        }
        return iA;
    }

    public jg a(List<iv> list) {
        this.f718a = list;
        return this;
    }

    public void a() throws kk {
        if (this.f718a != null) {
            return;
        }
        throw new kk("Required field 'dataCollectionItems' was not present! Struct: " + toString());
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
            if (kgVarMo641a.f925a != 1) {
                km.a(kjVar, b10);
            } else if (b10 == 15) {
                kh khVarMo642a = kjVar.mo642a();
                this.f718a = new ArrayList(khVarMo642a.f926a);
                for (int i10 = 0; i10 < khVarMo642a.f926a; i10++) {
                    iv ivVar = new iv();
                    ivVar.a(kjVar);
                    this.f718a.add(ivVar);
                }
                kjVar.i();
            } else {
                km.a(kjVar, b10);
            }
            kjVar.g();
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m552a() {
        return this.f718a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m553a(jg jgVar) {
        if (jgVar == null) {
            return false;
        }
        boolean zM552a = m552a();
        boolean zM552a2 = jgVar.m552a();
        if (zM552a || zM552a2) {
            return zM552a && zM552a2 && this.f718a.equals(jgVar.f718a);
        }
        return true;
    }

    @Override // com.xiaomi.push.jy
    public void b(kj kjVar) throws kk {
        a();
        kjVar.a(f717a);
        if (this.f718a != null) {
            kjVar.a(f107613a);
            kjVar.a(new kh((byte) 12, this.f718a.size()));
            Iterator<iv> it = this.f718a.iterator();
            while (it.hasNext()) {
                it.next().b(kjVar);
            }
            kjVar.e();
            kjVar.b();
        }
        kjVar.c();
        kjVar.mo649a();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jg)) {
            return m553a((jg) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("XmPushActionCollectData(");
        sb2.append("dataCollectionItems:");
        List<iv> list = this.f718a;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
