package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class gg implements jy<gg, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f466a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public List<gf> f467a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f468b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final ko f465a = new ko("StatsEvents");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final kg f107208a = new kg("", (byte) 11, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final kg f107209b = new kg("", (byte) 11, 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final kg f107210c = new kg("", (byte) 15, 3);

    public gg() {
    }

    public gg(String str, List<gf> list) {
        this();
        this.f466a = str;
        this.f467a = list;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(gg ggVar) {
        int iA;
        int iA2;
        int iA3;
        if (!getClass().equals(ggVar.getClass())) {
            return getClass().getName().compareTo(ggVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m402a()).compareTo(Boolean.valueOf(ggVar.m402a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m402a() && (iA3 = jz.a(this.f466a, ggVar.f466a)) != 0) {
            return iA3;
        }
        int iCompareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(ggVar.b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (b() && (iA2 = jz.a(this.f468b, ggVar.f468b)) != 0) {
            return iA2;
        }
        int iCompareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(ggVar.c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (!c() || (iA = jz.a(this.f467a, ggVar.f467a)) == 0) {
            return 0;
        }
        return iA;
    }

    public gg a(String str) {
        this.f468b = str;
        return this;
    }

    public void a() throws kk {
        if (this.f466a == null) {
            throw new kk("Required field 'uuid' was not present! Struct: " + toString());
        }
        if (this.f467a != null) {
            return;
        }
        throw new kk("Required field 'events' was not present! Struct: " + toString());
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
            short s10 = kgVarMo641a.f925a;
            if (s10 != 1) {
                if (s10 != 2) {
                    if (s10 != 3) {
                        km.a(kjVar, b10);
                    } else if (b10 == 15) {
                        kh khVarMo642a = kjVar.mo642a();
                        this.f467a = new ArrayList(khVarMo642a.f926a);
                        for (int i10 = 0; i10 < khVarMo642a.f926a; i10++) {
                            gf gfVar = new gf();
                            gfVar.a(kjVar);
                            this.f467a.add(gfVar);
                        }
                        kjVar.i();
                    } else {
                        km.a(kjVar, b10);
                    }
                } else if (b10 == 11) {
                    this.f468b = kjVar.mo646a();
                } else {
                    km.a(kjVar, b10);
                }
            } else if (b10 == 11) {
                this.f466a = kjVar.mo646a();
            } else {
                km.a(kjVar, b10);
            }
            kjVar.g();
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m402a() {
        return this.f466a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m403a(gg ggVar) {
        if (ggVar == null) {
            return false;
        }
        boolean zM402a = m402a();
        boolean zM402a2 = ggVar.m402a();
        if ((zM402a || zM402a2) && !(zM402a && zM402a2 && this.f466a.equals(ggVar.f466a))) {
            return false;
        }
        boolean zB = b();
        boolean zB2 = ggVar.b();
        if ((zB || zB2) && !(zB && zB2 && this.f468b.equals(ggVar.f468b))) {
            return false;
        }
        boolean zC = c();
        boolean zC2 = ggVar.c();
        if (zC || zC2) {
            return zC && zC2 && this.f467a.equals(ggVar.f467a);
        }
        return true;
    }

    @Override // com.xiaomi.push.jy
    public void b(kj kjVar) {
        a();
        kjVar.a(f465a);
        if (this.f466a != null) {
            kjVar.a(f107208a);
            kjVar.a(this.f466a);
            kjVar.b();
        }
        if (this.f468b != null && b()) {
            kjVar.a(f107209b);
            kjVar.a(this.f468b);
            kjVar.b();
        }
        if (this.f467a != null) {
            kjVar.a(f107210c);
            kjVar.a(new kh((byte) 12, this.f467a.size()));
            Iterator<gf> it = this.f467a.iterator();
            while (it.hasNext()) {
                it.next().b(kjVar);
            }
            kjVar.e();
            kjVar.b();
        }
        kjVar.c();
        kjVar.mo649a();
    }

    public boolean b() {
        return this.f468b != null;
    }

    public boolean c() {
        return this.f467a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof gg)) {
            return m403a((gg) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("StatsEvents(");
        sb2.append("uuid:");
        String str = this.f466a;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        if (b()) {
            sb2.append(", ");
            sb2.append("operator:");
            String str2 = this.f468b;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        sb2.append(", ");
        sb2.append("events:");
        List<gf> list = this.f467a;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
