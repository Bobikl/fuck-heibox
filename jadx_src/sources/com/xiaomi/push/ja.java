package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class ja implements jy<ja, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f655a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f656a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f657a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f658a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public Map<String, String> f659a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f660a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public int f661b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f662b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public Map<String, String> f663b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public int f664c;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f665c;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public Map<String, String> f666c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f667d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public String f668e;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final ko f654a = new ko("PushMetaInfo");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final kg f107559a = new kg("", (byte) 11, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final kg f107560b = new kg("", (byte) 10, 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final kg f107561c = new kg("", (byte) 11, 3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final kg f107562d = new kg("", (byte) 11, 4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final kg f107563e = new kg("", (byte) 11, 5);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final kg f107564f = new kg("", (byte) 8, 6);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final kg f107565g = new kg("", (byte) 11, 7);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final kg f107566h = new kg("", (byte) 8, 8);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final kg f107567i = new kg("", (byte) 8, 9);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final kg f107568j = new kg("", (byte) 13, 10);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final kg f107569k = new kg("", (byte) 13, 11);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final kg f107570l = new kg("", (byte) 2, 12);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final kg f107571m = new kg("", (byte) 13, 13);

    public ja() {
        this.f658a = new BitSet(5);
        this.f660a = false;
    }

    public ja(ja jaVar) {
        BitSet bitSet = new BitSet(5);
        this.f658a = bitSet;
        bitSet.clear();
        this.f658a.or(jaVar.f658a);
        if (jaVar.m533a()) {
            this.f657a = jaVar.f657a;
        }
        this.f656a = jaVar.f656a;
        if (jaVar.m539c()) {
            this.f662b = jaVar.f662b;
        }
        if (jaVar.m540d()) {
            this.f665c = jaVar.f665c;
        }
        if (jaVar.e()) {
            this.f667d = jaVar.f667d;
        }
        this.f655a = jaVar.f655a;
        if (jaVar.g()) {
            this.f668e = jaVar.f668e;
        }
        this.f661b = jaVar.f661b;
        this.f664c = jaVar.f664c;
        if (jaVar.j()) {
            HashMap map = new HashMap();
            for (Map.Entry<String, String> entry : jaVar.f659a.entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
            this.f659a = map;
        }
        if (jaVar.k()) {
            HashMap map2 = new HashMap();
            for (Map.Entry<String, String> entry2 : jaVar.f663b.entrySet()) {
                map2.put(entry2.getKey(), entry2.getValue());
            }
            this.f663b = map2;
        }
        this.f660a = jaVar.f660a;
        if (jaVar.n()) {
            HashMap map3 = new HashMap();
            for (Map.Entry<String, String> entry3 : jaVar.f666c.entrySet()) {
                map3.put(entry3.getKey(), entry3.getValue());
            }
            this.f666c = map3;
        }
    }

    public int a() {
        return this.f655a;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ja jaVar) {
        int iA;
        int iA2;
        int iA3;
        int iA4;
        int iA5;
        int iA6;
        int iA7;
        int iA8;
        int iA9;
        int iA10;
        int iA11;
        int iA12;
        int iA13;
        if (!getClass().equals(jaVar.getClass())) {
            return getClass().getName().compareTo(jaVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m533a()).compareTo(Boolean.valueOf(jaVar.m533a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m533a() && (iA13 = jz.a(this.f657a, jaVar.f657a)) != 0) {
            return iA13;
        }
        int iCompareTo2 = Boolean.valueOf(m537b()).compareTo(Boolean.valueOf(jaVar.m537b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m537b() && (iA12 = jz.a(this.f656a, jaVar.f656a)) != 0) {
            return iA12;
        }
        int iCompareTo3 = Boolean.valueOf(m539c()).compareTo(Boolean.valueOf(jaVar.m539c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m539c() && (iA11 = jz.a(this.f662b, jaVar.f662b)) != 0) {
            return iA11;
        }
        int iCompareTo4 = Boolean.valueOf(m540d()).compareTo(Boolean.valueOf(jaVar.m540d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m540d() && (iA10 = jz.a(this.f665c, jaVar.f665c)) != 0) {
            return iA10;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jaVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iA9 = jz.a(this.f667d, jaVar.f667d)) != 0) {
            return iA9;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jaVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iA8 = jz.a(this.f655a, jaVar.f655a)) != 0) {
            return iA8;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jaVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iA7 = jz.a(this.f668e, jaVar.f668e)) != 0) {
            return iA7;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jaVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iA6 = jz.a(this.f661b, jaVar.f661b)) != 0) {
            return iA6;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jaVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (i() && (iA5 = jz.a(this.f664c, jaVar.f664c)) != 0) {
            return iA5;
        }
        int iCompareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(jaVar.j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (j() && (iA4 = jz.a(this.f659a, jaVar.f659a)) != 0) {
            return iA4;
        }
        int iCompareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(jaVar.k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (k() && (iA3 = jz.a(this.f663b, jaVar.f663b)) != 0) {
            return iA3;
        }
        int iCompareTo12 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(jaVar.m()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (m() && (iA2 = jz.a(this.f660a, jaVar.f660a)) != 0) {
            return iA2;
        }
        int iCompareTo13 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(jaVar.n()));
        if (iCompareTo13 != 0) {
            return iCompareTo13;
        }
        if (!n() || (iA = jz.a(this.f666c, jaVar.f666c)) == 0) {
            return 0;
        }
        return iA;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public long m528a() {
        return this.f656a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public ja m529a() {
        return new ja(this);
    }

    public ja a(int i10) {
        this.f655a = i10;
        b(true);
        return this;
    }

    public ja a(String str) {
        this.f657a = str;
        return this;
    }

    public ja a(Map<String, String> map) {
        this.f659a = map;
        return this;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m530a() {
        return this.f657a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public Map<String, String> m531a() {
        return this.f659a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m532a() throws kk {
        if (this.f657a != null) {
            return;
        }
        throw new kk("Required field 'id' was not present! Struct: " + toString());
    }

    @Override // com.xiaomi.push.jy
    public void a(kj kjVar) throws kk {
        kjVar.mo645a();
        while (true) {
            kg kgVarMo641a = kjVar.mo641a();
            byte b10 = kgVarMo641a.f107793a;
            if (b10 == 0) {
                kjVar.f();
                if (m537b()) {
                    m532a();
                    return;
                }
                throw new kk("Required field 'messageTs' was not found in serialized data! Struct: " + toString());
            }
            int i10 = 0;
            switch (kgVarMo641a.f925a) {
                case 1:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f657a = kjVar.mo646a();
                    }
                    break;
                case 2:
                    if (b10 != 10) {
                        km.a(kjVar, b10);
                    } else {
                        this.f656a = kjVar.mo640a();
                        a(true);
                    }
                    break;
                case 3:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f662b = kjVar.mo646a();
                    }
                    break;
                case 4:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f665c = kjVar.mo646a();
                    }
                    break;
                case 5:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f667d = kjVar.mo646a();
                    }
                    break;
                case 6:
                    if (b10 != 8) {
                        km.a(kjVar, b10);
                    } else {
                        this.f655a = kjVar.mo639a();
                        b(true);
                    }
                    break;
                case 7:
                    if (b10 != 11) {
                        km.a(kjVar, b10);
                    } else {
                        this.f668e = kjVar.mo646a();
                    }
                    break;
                case 8:
                    if (b10 != 8) {
                        km.a(kjVar, b10);
                    } else {
                        this.f661b = kjVar.mo639a();
                        c(true);
                    }
                    break;
                case 9:
                    if (b10 != 8) {
                        km.a(kjVar, b10);
                    } else {
                        this.f664c = kjVar.mo639a();
                        d(true);
                    }
                    break;
                case 10:
                    if (b10 != 13) {
                        km.a(kjVar, b10);
                    } else {
                        ki kiVarMo643a = kjVar.mo643a();
                        this.f659a = new HashMap(kiVarMo643a.f927a * 2);
                        while (i10 < kiVarMo643a.f927a) {
                            this.f659a.put(kjVar.mo646a(), kjVar.mo646a());
                            i10++;
                        }
                        kjVar.h();
                    }
                    break;
                case 11:
                    if (b10 != 13) {
                        km.a(kjVar, b10);
                    } else {
                        ki kiVarMo643a2 = kjVar.mo643a();
                        this.f663b = new HashMap(kiVarMo643a2.f927a * 2);
                        while (i10 < kiVarMo643a2.f927a) {
                            this.f663b.put(kjVar.mo646a(), kjVar.mo646a());
                            i10++;
                        }
                        kjVar.h();
                    }
                    break;
                case 12:
                    if (b10 != 2) {
                        km.a(kjVar, b10);
                    } else {
                        this.f660a = kjVar.mo651a();
                        e(true);
                    }
                    break;
                case 13:
                    if (b10 != 13) {
                        km.a(kjVar, b10);
                    } else {
                        ki kiVarMo643a3 = kjVar.mo643a();
                        this.f666c = new HashMap(kiVarMo643a3.f927a * 2);
                        while (i10 < kiVarMo643a3.f927a) {
                            this.f666c.put(kjVar.mo646a(), kjVar.mo646a());
                            i10++;
                        }
                        kjVar.h();
                    }
                    break;
                default:
                    km.a(kjVar, b10);
                    break;
            }
            kjVar.g();
        }
    }

    public void a(String str, String str2) {
        if (this.f659a == null) {
            this.f659a = new HashMap();
        }
        this.f659a.put(str, str2);
    }

    public void a(boolean z10) {
        this.f658a.set(0, z10);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m533a() {
        return this.f657a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m534a(ja jaVar) {
        if (jaVar == null) {
            return false;
        }
        boolean zM533a = m533a();
        boolean zM533a2 = jaVar.m533a();
        if (((zM533a || zM533a2) && !(zM533a && zM533a2 && this.f657a.equals(jaVar.f657a))) || this.f656a != jaVar.f656a) {
            return false;
        }
        boolean zM539c = m539c();
        boolean zM539c2 = jaVar.m539c();
        if ((zM539c || zM539c2) && !(zM539c && zM539c2 && this.f662b.equals(jaVar.f662b))) {
            return false;
        }
        boolean zM540d = m540d();
        boolean zM540d2 = jaVar.m540d();
        if ((zM540d || zM540d2) && !(zM540d && zM540d2 && this.f665c.equals(jaVar.f665c))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = jaVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.f667d.equals(jaVar.f667d))) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = jaVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f655a == jaVar.f655a)) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = jaVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f668e.equals(jaVar.f668e))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = jaVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f661b == jaVar.f661b)) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = jaVar.i();
        if ((zI || zI2) && !(zI && zI2 && this.f664c == jaVar.f664c)) {
            return false;
        }
        boolean zJ = j();
        boolean zJ2 = jaVar.j();
        if ((zJ || zJ2) && !(zJ && zJ2 && this.f659a.equals(jaVar.f659a))) {
            return false;
        }
        boolean zK = k();
        boolean zK2 = jaVar.k();
        if ((zK || zK2) && !(zK && zK2 && this.f663b.equals(jaVar.f663b))) {
            return false;
        }
        boolean zM = m();
        boolean zM2 = jaVar.m();
        if ((zM || zM2) && !(zM && zM2 && this.f660a == jaVar.f660a)) {
            return false;
        }
        boolean zN = n();
        boolean zN2 = jaVar.n();
        if (zN || zN2) {
            return zN && zN2 && this.f666c.equals(jaVar.f666c);
        }
        return true;
    }

    public int b() {
        return this.f661b;
    }

    public ja b(int i10) {
        this.f661b = i10;
        c(true);
        return this;
    }

    public ja b(String str) {
        this.f662b = str;
        return this;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public String m535b() {
        return this.f662b;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public Map<String, String> m536b() {
        return this.f663b;
    }

    @Override // com.xiaomi.push.jy
    public void b(kj kjVar) throws kk {
        m532a();
        kjVar.a(f654a);
        if (this.f657a != null) {
            kjVar.a(f107559a);
            kjVar.a(this.f657a);
            kjVar.b();
        }
        kjVar.a(f107560b);
        kjVar.a(this.f656a);
        kjVar.b();
        if (this.f662b != null && m539c()) {
            kjVar.a(f107561c);
            kjVar.a(this.f662b);
            kjVar.b();
        }
        if (this.f665c != null && m540d()) {
            kjVar.a(f107562d);
            kjVar.a(this.f665c);
            kjVar.b();
        }
        if (this.f667d != null && e()) {
            kjVar.a(f107563e);
            kjVar.a(this.f667d);
            kjVar.b();
        }
        if (f()) {
            kjVar.a(f107564f);
            kjVar.mo650a(this.f655a);
            kjVar.b();
        }
        if (this.f668e != null && g()) {
            kjVar.a(f107565g);
            kjVar.a(this.f668e);
            kjVar.b();
        }
        if (h()) {
            kjVar.a(f107566h);
            kjVar.mo650a(this.f661b);
            kjVar.b();
        }
        if (i()) {
            kjVar.a(f107567i);
            kjVar.mo650a(this.f664c);
            kjVar.b();
        }
        if (this.f659a != null && j()) {
            kjVar.a(f107568j);
            kjVar.a(new ki((byte) 11, (byte) 11, this.f659a.size()));
            for (Map.Entry<String, String> entry : this.f659a.entrySet()) {
                kjVar.a(entry.getKey());
                kjVar.a(entry.getValue());
            }
            kjVar.d();
            kjVar.b();
        }
        if (this.f663b != null && k()) {
            kjVar.a(f107569k);
            kjVar.a(new ki((byte) 11, (byte) 11, this.f663b.size()));
            for (Map.Entry<String, String> entry2 : this.f663b.entrySet()) {
                kjVar.a(entry2.getKey());
                kjVar.a(entry2.getValue());
            }
            kjVar.d();
            kjVar.b();
        }
        if (m()) {
            kjVar.a(f107570l);
            kjVar.a(this.f660a);
            kjVar.b();
        }
        if (this.f666c != null && n()) {
            kjVar.a(f107571m);
            kjVar.a(new ki((byte) 11, (byte) 11, this.f666c.size()));
            for (Map.Entry<String, String> entry3 : this.f666c.entrySet()) {
                kjVar.a(entry3.getKey());
                kjVar.a(entry3.getValue());
            }
            kjVar.d();
            kjVar.b();
        }
        kjVar.c();
        kjVar.mo649a();
    }

    public void b(String str, String str2) {
        if (this.f663b == null) {
            this.f663b = new HashMap();
        }
        this.f663b.put(str, str2);
    }

    public void b(boolean z10) {
        this.f658a.set(1, z10);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m537b() {
        return this.f658a.get(0);
    }

    public int c() {
        return this.f664c;
    }

    public ja c(int i10) {
        this.f664c = i10;
        d(true);
        return this;
    }

    public ja c(String str) {
        this.f665c = str;
        return this;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public String m538c() {
        return this.f665c;
    }

    public void c(boolean z10) {
        this.f658a.set(2, z10);
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m539c() {
        return this.f662b != null;
    }

    public ja d(String str) {
        this.f667d = str;
        return this;
    }

    public String d() {
        return this.f667d;
    }

    public void d(boolean z10) {
        this.f658a.set(3, z10);
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public boolean m540d() {
        return this.f665c != null;
    }

    public void e(boolean z10) {
        this.f658a.set(4, z10);
    }

    public boolean e() {
        return this.f667d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ja)) {
            return m534a((ja) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f658a.get(1);
    }

    public boolean g() {
        return this.f668e != null;
    }

    public boolean h() {
        return this.f658a.get(2);
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f658a.get(3);
    }

    public boolean j() {
        return this.f659a != null;
    }

    public boolean k() {
        return this.f663b != null;
    }

    public boolean l() {
        return this.f660a;
    }

    public boolean m() {
        return this.f658a.get(4);
    }

    public boolean n() {
        return this.f666c != null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PushMetaInfo(");
        sb2.append("id:");
        String str = this.f657a;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(com.xiaomi.push.service.bc.a(str));
        }
        sb2.append(", ");
        sb2.append("messageTs:");
        sb2.append(this.f656a);
        if (m539c()) {
            sb2.append(", ");
            sb2.append("topic:");
            String str2 = this.f662b;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        if (m540d()) {
            sb2.append(", ");
            sb2.append("title:");
            String str3 = this.f665c;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        if (e()) {
            sb2.append(", ");
            sb2.append("description:");
            String str4 = this.f667d;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (f()) {
            sb2.append(", ");
            sb2.append("notifyType:");
            sb2.append(this.f655a);
        }
        if (g()) {
            sb2.append(", ");
            sb2.append("url:");
            String str5 = this.f668e;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (h()) {
            sb2.append(", ");
            sb2.append("passThrough:");
            sb2.append(this.f661b);
        }
        if (i()) {
            sb2.append(", ");
            sb2.append("notifyId:");
            sb2.append(this.f664c);
        }
        if (j()) {
            sb2.append(", ");
            sb2.append("extra:");
            Map<String, String> map = this.f659a;
            if (map == null) {
                sb2.append("null");
            } else {
                sb2.append(map);
            }
        }
        if (k()) {
            sb2.append(", ");
            sb2.append("internal:");
            Map<String, String> map2 = this.f663b;
            if (map2 == null) {
                sb2.append("null");
            } else {
                sb2.append(map2);
            }
        }
        if (m()) {
            sb2.append(", ");
            sb2.append("ignoreRegInfo:");
            sb2.append(this.f660a);
        }
        if (n()) {
            sb2.append(", ");
            sb2.append("apsProperFields:");
            Map<String, String> map3 = this.f666c;
            if (map3 == null) {
                sb2.append("null");
            } else {
                sb2.append(map3);
            }
        }
        sb2.append(")");
        return sb2.toString();
    }
}
