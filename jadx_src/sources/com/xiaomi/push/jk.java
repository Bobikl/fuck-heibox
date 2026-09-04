package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class jk implements jy<jk, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public List<iy> f754a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final ko f753a = new ko("XmPushActionCustomConfig");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final kg f107642a = new kg("", (byte) 15, 1);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(jk jkVar) {
        int iA;
        if (!getClass().equals(jkVar.getClass())) {
            return getClass().getName().compareTo(jkVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m574a()).compareTo(Boolean.valueOf(jkVar.m574a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (!m574a() || (iA = jz.a(this.f754a, jkVar.f754a)) == 0) {
            return 0;
        }
        return iA;
    }

    public List<iy> a() {
        return this.f754a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m573a() throws kk {
        if (this.f754a != null) {
            return;
        }
        throw new kk("Required field 'customConfigs' was not present! Struct: " + toString());
    }

    @Override // com.xiaomi.push.jy
    public void a(kj kjVar) throws kk {
        kjVar.mo645a();
        while (true) {
            kg kgVarMo641a = kjVar.mo641a();
            byte b10 = kgVarMo641a.f107793a;
            if (b10 == 0) {
                kjVar.f();
                m573a();
                return;
            }
            if (kgVarMo641a.f925a != 1) {
                km.a(kjVar, b10);
            } else if (b10 == 15) {
                kh khVarMo642a = kjVar.mo642a();
                this.f754a = new ArrayList(khVarMo642a.f926a);
                for (int i10 = 0; i10 < khVarMo642a.f926a; i10++) {
                    iy iyVar = new iy();
                    iyVar.a(kjVar);
                    this.f754a.add(iyVar);
                }
                kjVar.i();
            } else {
                km.a(kjVar, b10);
            }
            kjVar.g();
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m574a() {
        return this.f754a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m575a(jk jkVar) {
        if (jkVar == null) {
            return false;
        }
        boolean zM574a = m574a();
        boolean zM574a2 = jkVar.m574a();
        if (zM574a || zM574a2) {
            return zM574a && zM574a2 && this.f754a.equals(jkVar.f754a);
        }
        return true;
    }

    @Override // com.xiaomi.push.jy
    public void b(kj kjVar) throws kk {
        m573a();
        kjVar.a(f753a);
        if (this.f754a != null) {
            kjVar.a(f107642a);
            kjVar.a(new kh((byte) 12, this.f754a.size()));
            Iterator<iy> it = this.f754a.iterator();
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
        if (obj != null && (obj instanceof jk)) {
            return m575a((jk) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("XmPushActionCustomConfig(");
        sb2.append("customConfigs:");
        List<iy> list = this.f754a;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
