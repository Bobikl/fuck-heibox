package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.at;
import com.umeng.analytics.pro.az;
import com.umeng.analytics.pro.ba;
import com.umeng.analytics.pro.bf;
import com.umeng.analytics.pro.bg;
import com.umeng.analytics.pro.bh;
import com.umeng.analytics.pro.bi;
import com.umeng.analytics.pro.bk;
import com.umeng.analytics.pro.bm;
import com.umeng.analytics.pro.bn;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.bp;
import com.umeng.analytics.pro.bs;
import com.umeng.analytics.pro.bt;
import com.umeng.analytics.pro.bv;
import com.umeng.analytics.pro.bx;
import com.umeng.analytics.pro.by;
import com.umeng.analytics.pro.ca;
import com.umeng.analytics.pro.cb;
import com.umeng.analytics.pro.cc;
import com.umeng.analytics.pro.cd;
import com.umeng.analytics.pro.ce;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: IdTracking.java */
/* JADX INFO: loaded from: classes4.dex */
public class c implements at<c, e>, Serializable, Cloneable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map<e, bf> f105440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f105441e = -5764118265293965743L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final bx f105442f = new bx("IdTracking");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final bn f105443g = new bn("snapshots", (byte) 13, 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final bn f105444h = new bn("journals", (byte) 15, 2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final bn f105445i = new bn("checksum", (byte) 11, 3);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Map<Class<? extends ca>, cb> f105446j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, com.umeng.commonsdk.statistics.proto.b> f105447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<com.umeng.commonsdk.statistics.proto.a> f105448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f105449c;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private e[] f105450k;

    /* JADX INFO: compiled from: IdTracking.java */
    public static class a extends cc<c> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.ca
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(bs bsVar, c cVar) throws az {
            bsVar.j();
            while (true) {
                bn bnVarL = bsVar.l();
                byte b10 = bnVarL.f104628b;
                if (b10 == 0) {
                    bsVar.k();
                    cVar.n();
                    return;
                }
                short s10 = bnVarL.f104629c;
                int i10 = 0;
                if (s10 != 1) {
                    if (s10 != 2) {
                        if (s10 != 3) {
                            bv.a(bsVar, b10);
                        } else if (b10 == 11) {
                            cVar.f105449c = bsVar.z();
                            cVar.c(true);
                        } else {
                            bv.a(bsVar, b10);
                        }
                    } else if (b10 == 15) {
                        bo boVarP = bsVar.p();
                        cVar.f105448b = new ArrayList(boVarP.f104631b);
                        while (i10 < boVarP.f104631b) {
                            com.umeng.commonsdk.statistics.proto.a aVar = new com.umeng.commonsdk.statistics.proto.a();
                            aVar.read(bsVar);
                            cVar.f105448b.add(aVar);
                            i10++;
                        }
                        bsVar.q();
                        cVar.b(true);
                    } else {
                        bv.a(bsVar, b10);
                    }
                } else if (b10 == 13) {
                    bp bpVarN = bsVar.n();
                    cVar.f105447a = new HashMap(bpVarN.f104634c * 2);
                    while (i10 < bpVarN.f104634c) {
                        String strZ = bsVar.z();
                        com.umeng.commonsdk.statistics.proto.b bVar = new com.umeng.commonsdk.statistics.proto.b();
                        bVar.read(bsVar);
                        cVar.f105447a.put(strZ, bVar);
                        i10++;
                    }
                    bsVar.o();
                    cVar.a(true);
                } else {
                    bv.a(bsVar, b10);
                }
                bsVar.m();
            }
        }

        @Override // com.umeng.analytics.pro.ca
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(bs bsVar, c cVar) throws az {
            cVar.n();
            bsVar.a(c.f105442f);
            if (cVar.f105447a != null) {
                bsVar.a(c.f105443g);
                bsVar.a(new bp((byte) 11, (byte) 12, cVar.f105447a.size()));
                for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.b> entry : cVar.f105447a.entrySet()) {
                    bsVar.a(entry.getKey());
                    entry.getValue().write(bsVar);
                }
                bsVar.e();
                bsVar.c();
            }
            if (cVar.f105448b != null && cVar.j()) {
                bsVar.a(c.f105444h);
                bsVar.a(new bo((byte) 12, cVar.f105448b.size()));
                Iterator<com.umeng.commonsdk.statistics.proto.a> it = cVar.f105448b.iterator();
                while (it.hasNext()) {
                    it.next().write(bsVar);
                }
                bsVar.f();
                bsVar.c();
            }
            if (cVar.f105449c != null && cVar.m()) {
                bsVar.a(c.f105445i);
                bsVar.a(cVar.f105449c);
                bsVar.c();
            }
            bsVar.d();
            bsVar.b();
        }
    }

    /* JADX INFO: compiled from: IdTracking.java */
    public static class b implements cb {
        private b() {
        }

        @Override // com.umeng.analytics.pro.cb
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b() {
            return new a();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: IdTracking.java */
    public static class C1046c extends cd<c> {
        private C1046c() {
        }

        @Override // com.umeng.analytics.pro.ca
        public void a(bs bsVar, c cVar) throws az {
            by byVar = (by) bsVar;
            byVar.a(cVar.f105447a.size());
            for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.b> entry : cVar.f105447a.entrySet()) {
                byVar.a(entry.getKey());
                entry.getValue().write(byVar);
            }
            BitSet bitSet = new BitSet();
            if (cVar.j()) {
                bitSet.set(0);
            }
            if (cVar.m()) {
                bitSet.set(1);
            }
            byVar.a(bitSet, 2);
            if (cVar.j()) {
                byVar.a(cVar.f105448b.size());
                Iterator<com.umeng.commonsdk.statistics.proto.a> it = cVar.f105448b.iterator();
                while (it.hasNext()) {
                    it.next().write(byVar);
                }
            }
            if (cVar.m()) {
                byVar.a(cVar.f105449c);
            }
        }

        @Override // com.umeng.analytics.pro.ca
        public void b(bs bsVar, c cVar) throws az {
            by byVar = (by) bsVar;
            bp bpVar = new bp((byte) 11, (byte) 12, byVar.w());
            cVar.f105447a = new HashMap(bpVar.f104634c * 2);
            for (int i10 = 0; i10 < bpVar.f104634c; i10++) {
                String strZ = byVar.z();
                com.umeng.commonsdk.statistics.proto.b bVar = new com.umeng.commonsdk.statistics.proto.b();
                bVar.read(byVar);
                cVar.f105447a.put(strZ, bVar);
            }
            cVar.a(true);
            BitSet bitSetB = byVar.b(2);
            if (bitSetB.get(0)) {
                bo boVar = new bo((byte) 12, byVar.w());
                cVar.f105448b = new ArrayList(boVar.f104631b);
                for (int i11 = 0; i11 < boVar.f104631b; i11++) {
                    com.umeng.commonsdk.statistics.proto.a aVar = new com.umeng.commonsdk.statistics.proto.a();
                    aVar.read(byVar);
                    cVar.f105448b.add(aVar);
                }
                cVar.b(true);
            }
            if (bitSetB.get(1)) {
                cVar.f105449c = byVar.z();
                cVar.c(true);
            }
        }
    }

    /* JADX INFO: compiled from: IdTracking.java */
    public static class d implements cb {
        private d() {
        }

        @Override // com.umeng.analytics.pro.cb
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1046c b() {
            return new C1046c();
        }
    }

    /* JADX INFO: compiled from: IdTracking.java */
    public enum e implements ba {
        SNAPSHOTS(1, "snapshots"),
        JOURNALS(2, "journals"),
        CHECKSUM(3, "checksum");


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Map<String, e> f105454d = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final short f105456e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f105457f;

        static {
            for (e eVar : EnumSet.allOf(e.class)) {
                f105454d.put(eVar.b(), eVar);
            }
        }

        e(short s10, String str) {
            this.f105456e = s10;
            this.f105457f = str;
        }

        public static e a(int i10) {
            if (i10 == 1) {
                return SNAPSHOTS;
            }
            if (i10 == 2) {
                return JOURNALS;
            }
            if (i10 != 3) {
                return null;
            }
            return CHECKSUM;
        }

        public static e a(String str) {
            return f105454d.get(str);
        }

        public static e b(int i10) {
            e eVarA = a(i10);
            if (eVarA != null) {
                return eVarA;
            }
            throw new IllegalArgumentException("Field " + i10 + " doesn't exist!");
        }

        @Override // com.umeng.analytics.pro.ba
        public short a() {
            return this.f105456e;
        }

        @Override // com.umeng.analytics.pro.ba
        public String b() {
            return this.f105457f;
        }
    }

    static {
        HashMap map = new HashMap();
        f105446j = map;
        map.put(cc.class, new b());
        map.put(cd.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.SNAPSHOTS, new bf("snapshots", (byte) 1, new bi((byte) 13, new bg((byte) 11), new bk((byte) 12, com.umeng.commonsdk.statistics.proto.b.class))));
        enumMap.put(e.JOURNALS, new bf("journals", (byte) 2, new bh((byte) 15, new bk((byte) 12, com.umeng.commonsdk.statistics.proto.a.class))));
        enumMap.put(e.CHECKSUM, new bf("checksum", (byte) 2, new bg((byte) 11)));
        Map<e, bf> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        f105440d = mapUnmodifiableMap;
        bf.a(c.class, mapUnmodifiableMap);
    }

    public c() {
        this.f105450k = new e[]{e.JOURNALS, e.CHECKSUM};
    }

    public c(c cVar) {
        this.f105450k = new e[]{e.JOURNALS, e.CHECKSUM};
        if (cVar.e()) {
            HashMap map = new HashMap();
            for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.b> entry : cVar.f105447a.entrySet()) {
                map.put(entry.getKey(), new com.umeng.commonsdk.statistics.proto.b(entry.getValue()));
            }
            this.f105447a = map;
        }
        if (cVar.j()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.umeng.commonsdk.statistics.proto.a> it = cVar.f105448b.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.umeng.commonsdk.statistics.proto.a(it.next()));
            }
            this.f105448b = arrayList;
        }
        if (cVar.m()) {
            this.f105449c = cVar.f105449c;
        }
    }

    public c(Map<String, com.umeng.commonsdk.statistics.proto.b> map) {
        this();
        this.f105447a = map;
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            read(new bm(new ce(objectInputStream)));
        } catch (az e10) {
            throw new IOException(e10.getMessage());
        }
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new bm(new ce(objectOutputStream)));
        } catch (az e10) {
            throw new IOException(e10.getMessage());
        }
    }

    @Override // com.umeng.analytics.pro.at
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i10) {
        return e.a(i10);
    }

    @Override // com.umeng.analytics.pro.at
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c deepCopy() {
        return new c(this);
    }

    public c a(String str) {
        this.f105449c = str;
        return this;
    }

    public c a(List<com.umeng.commonsdk.statistics.proto.a> list) {
        this.f105448b = list;
        return this;
    }

    public c a(Map<String, com.umeng.commonsdk.statistics.proto.b> map) {
        this.f105447a = map;
        return this;
    }

    public void a(com.umeng.commonsdk.statistics.proto.a aVar) {
        if (this.f105448b == null) {
            this.f105448b = new ArrayList();
        }
        this.f105448b.add(aVar);
    }

    public void a(String str, com.umeng.commonsdk.statistics.proto.b bVar) {
        if (this.f105447a == null) {
            this.f105447a = new HashMap();
        }
        this.f105447a.put(str, bVar);
    }

    public void a(boolean z10) {
        if (z10) {
            return;
        }
        this.f105447a = null;
    }

    public int b() {
        Map<String, com.umeng.commonsdk.statistics.proto.b> map = this.f105447a;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public void b(boolean z10) {
        if (z10) {
            return;
        }
        this.f105448b = null;
    }

    public Map<String, com.umeng.commonsdk.statistics.proto.b> c() {
        return this.f105447a;
    }

    public void c(boolean z10) {
        if (z10) {
            return;
        }
        this.f105449c = null;
    }

    @Override // com.umeng.analytics.pro.at
    public void clear() {
        this.f105447a = null;
        this.f105448b = null;
        this.f105449c = null;
    }

    public void d() {
        this.f105447a = null;
    }

    public boolean e() {
        return this.f105447a != null;
    }

    public int f() {
        List<com.umeng.commonsdk.statistics.proto.a> list = this.f105448b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public Iterator<com.umeng.commonsdk.statistics.proto.a> g() {
        List<com.umeng.commonsdk.statistics.proto.a> list = this.f105448b;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public List<com.umeng.commonsdk.statistics.proto.a> h() {
        return this.f105448b;
    }

    public void i() {
        this.f105448b = null;
    }

    public boolean j() {
        return this.f105448b != null;
    }

    public String k() {
        return this.f105449c;
    }

    public void l() {
        this.f105449c = null;
    }

    public boolean m() {
        return this.f105449c != null;
    }

    public void n() throws az {
        if (this.f105447a != null) {
            return;
        }
        throw new bt("Required field 'snapshots' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.at
    public void read(bs bsVar) throws az {
        f105446j.get(bsVar.D()).b().b(bsVar, this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("IdTracking(");
        sb2.append("snapshots:");
        Map<String, com.umeng.commonsdk.statistics.proto.b> map = this.f105447a;
        if (map == null) {
            sb2.append("null");
        } else {
            sb2.append(map);
        }
        if (j()) {
            sb2.append(", ");
            sb2.append("journals:");
            List<com.umeng.commonsdk.statistics.proto.a> list = this.f105448b;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
        }
        if (m()) {
            sb2.append(", ");
            sb2.append("checksum:");
            String str = this.f105449c;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
        }
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.umeng.analytics.pro.at
    public void write(bs bsVar) throws az {
        f105446j.get(bsVar.D()).b().a(bsVar, this);
    }
}
