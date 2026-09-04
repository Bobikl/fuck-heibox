package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class jl implements jy<jl, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public List<iw> f756a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final ko f755a = new ko("XmPushActionNormalConfig");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final kg f107643a = new kg("", (byte) 15, 1);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(jl jlVar) {
        int iA;
        if (!getClass().equals(jlVar.getClass())) {
            return getClass().getName().compareTo(jlVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m577a()).compareTo(Boolean.valueOf(jlVar.m577a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (!m577a() || (iA = jz.a(this.f756a, jlVar.f756a)) == 0) {
            return 0;
        }
        return iA;
    }

    public List<iw> a() {
        return this.f756a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m576a() throws kk {
        if (this.f756a != null) {
            return;
        }
        throw new kk("Required field 'normalConfigs' was not present! Struct: " + toString());
    }

    @Override // com.xiaomi.push.jy
    public void a(kj kjVar) throws kk {
        kjVar.mo645a();
        while (true) {
            kg kgVarMo641a = kjVar.mo641a();
            byte b10 = kgVarMo641a.f107793a;
            if (b10 == 0) {
                kjVar.f();
                m576a();
                return;
            }
            if (kgVarMo641a.f925a != 1) {
                km.a(kjVar, b10);
            } else if (b10 == 15) {
                kh khVarMo642a = kjVar.mo642a();
                this.f756a = new ArrayList(khVarMo642a.f926a);
                for (int i10 = 0; i10 < khVarMo642a.f926a; i10++) {
                    iw iwVar = new iw();
                    iwVar.a(kjVar);
                    this.f756a.add(iwVar);
                }
                kjVar.i();
            } else {
                km.a(kjVar, b10);
            }
            kjVar.g();
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m577a() {
        return this.f756a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m578a(jl jlVar) {
        if (jlVar == null) {
            return false;
        }
        boolean zM577a = m577a();
        boolean zM577a2 = jlVar.m577a();
        if (zM577a || zM577a2) {
            return zM577a && zM577a2 && this.f756a.equals(jlVar.f756a);
        }
        return true;
    }

    @Override // com.xiaomi.push.jy
    public void b(kj kjVar) throws kk {
        m576a();
        kjVar.a(f755a);
        if (this.f756a != null) {
            kjVar.a(f107643a);
            kjVar.a(new kh((byte) 12, this.f756a.size()));
            Iterator<iw> it = this.f756a.iterator();
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
        if (obj != null && (obj instanceof jl)) {
            return m578a((jl) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("XmPushActionNormalConfig(");
        sb2.append("normalConfigs:");
        List<iw> list = this.f756a;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
