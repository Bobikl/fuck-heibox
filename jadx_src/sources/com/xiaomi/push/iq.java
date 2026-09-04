package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class iq implements jy<iq, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public List<ir> f592a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final ko f591a = new ko("ClientUploadData");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final kg f107425a = new kg("", (byte) 15, 1);

    public int a() {
        List<ir> list = this.f592a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(iq iqVar) {
        int iA;
        if (!getClass().equals(iqVar.getClass())) {
            return getClass().getName().compareTo(iqVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m485a()).compareTo(Boolean.valueOf(iqVar.m485a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (!m485a() || (iA = jz.a(this.f592a, iqVar.f592a)) == 0) {
            return 0;
        }
        return iA;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m484a() throws kk {
        if (this.f592a != null) {
            return;
        }
        throw new kk("Required field 'uploadDataItems' was not present! Struct: " + toString());
    }

    public void a(ir irVar) {
        if (this.f592a == null) {
            this.f592a = new ArrayList();
        }
        this.f592a.add(irVar);
    }

    @Override // com.xiaomi.push.jy
    public void a(kj kjVar) throws kk {
        kjVar.mo645a();
        while (true) {
            kg kgVarMo641a = kjVar.mo641a();
            byte b10 = kgVarMo641a.f107793a;
            if (b10 == 0) {
                kjVar.f();
                m484a();
                return;
            }
            if (kgVarMo641a.f925a != 1) {
                km.a(kjVar, b10);
            } else if (b10 == 15) {
                kh khVarMo642a = kjVar.mo642a();
                this.f592a = new ArrayList(khVarMo642a.f926a);
                for (int i10 = 0; i10 < khVarMo642a.f926a; i10++) {
                    ir irVar = new ir();
                    irVar.a(kjVar);
                    this.f592a.add(irVar);
                }
                kjVar.i();
            } else {
                km.a(kjVar, b10);
            }
            kjVar.g();
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m485a() {
        return this.f592a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m486a(iq iqVar) {
        if (iqVar == null) {
            return false;
        }
        boolean zM485a = m485a();
        boolean zM485a2 = iqVar.m485a();
        if (zM485a || zM485a2) {
            return zM485a && zM485a2 && this.f592a.equals(iqVar.f592a);
        }
        return true;
    }

    @Override // com.xiaomi.push.jy
    public void b(kj kjVar) throws kk {
        m484a();
        kjVar.a(f591a);
        if (this.f592a != null) {
            kjVar.a(f107425a);
            kjVar.a(new kh((byte) 12, this.f592a.size()));
            Iterator<ir> it = this.f592a.iterator();
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
        if (obj != null && (obj instanceof iq)) {
            return m486a((iq) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ClientUploadData(");
        sb2.append("uploadDataItems:");
        List<ir> list = this.f592a;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
