package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.aq;
import com.umeng.analytics.pro.at;
import com.umeng.analytics.pro.az;
import com.umeng.analytics.pro.ba;
import com.umeng.analytics.pro.bf;
import com.umeng.analytics.pro.bg;
import com.umeng.analytics.pro.bi;
import com.umeng.analytics.pro.bk;
import com.umeng.analytics.pro.bm;
import com.umeng.analytics.pro.bn;
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
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import org.apache.tools.ant.taskdefs.condition.a0;

/* JADX INFO: compiled from: Imprint.java */
/* JADX INFO: loaded from: classes4.dex */
public class d implements at<d, e>, Serializable, Cloneable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map<e, bf> f105458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f105459e = 2846460275012375038L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final bx f105460f = new bx("Imprint");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final bn f105461g = new bn(a0.f133862j, (byte) 13, 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final bn f105462h = new bn("version", (byte) 8, 2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final bn f105463i = new bn("checksum", (byte) 11, 3);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Map<Class<? extends ca>, cb> f105464j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f105465k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, com.umeng.commonsdk.statistics.proto.e> f105466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f105467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f105468c;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private byte f105469l;

    /* JADX INFO: compiled from: Imprint.java */
    public static class a extends cc<d> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.ca
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(bs bsVar, d dVar) throws az {
            bsVar.j();
            while (true) {
                bn bnVarL = bsVar.l();
                byte b10 = bnVarL.f104628b;
                if (b10 == 0) {
                    break;
                }
                short s10 = bnVarL.f104629c;
                if (s10 != 1) {
                    if (s10 != 2) {
                        if (s10 != 3) {
                            bv.a(bsVar, b10);
                        } else if (b10 == 11) {
                            dVar.f105468c = bsVar.z();
                            dVar.c(true);
                        } else {
                            bv.a(bsVar, b10);
                        }
                    } else if (b10 == 8) {
                        dVar.f105467b = bsVar.w();
                        dVar.b(true);
                    } else {
                        bv.a(bsVar, b10);
                    }
                } else if (b10 == 13) {
                    bp bpVarN = bsVar.n();
                    dVar.f105466a = new HashMap(bpVarN.f104634c * 2);
                    for (int i10 = 0; i10 < bpVarN.f104634c; i10++) {
                        String strZ = bsVar.z();
                        com.umeng.commonsdk.statistics.proto.e eVar = new com.umeng.commonsdk.statistics.proto.e();
                        eVar.read(bsVar);
                        dVar.f105466a.put(strZ, eVar);
                    }
                    bsVar.o();
                    dVar.a(true);
                } else {
                    bv.a(bsVar, b10);
                }
                bsVar.m();
            }
            bsVar.k();
            if (dVar.h()) {
                dVar.l();
                return;
            }
            throw new bt("Required field 'version' was not found in serialized data! Struct: " + toString());
        }

        @Override // com.umeng.analytics.pro.ca
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(bs bsVar, d dVar) throws az {
            dVar.l();
            bsVar.a(d.f105460f);
            if (dVar.f105466a != null) {
                bsVar.a(d.f105461g);
                bsVar.a(new bp((byte) 11, (byte) 12, dVar.f105466a.size()));
                for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.e> entry : dVar.f105466a.entrySet()) {
                    bsVar.a(entry.getKey());
                    entry.getValue().write(bsVar);
                }
                bsVar.e();
                bsVar.c();
            }
            bsVar.a(d.f105462h);
            bsVar.a(dVar.f105467b);
            bsVar.c();
            if (dVar.f105468c != null) {
                bsVar.a(d.f105463i);
                bsVar.a(dVar.f105468c);
                bsVar.c();
            }
            bsVar.d();
            bsVar.b();
        }
    }

    /* JADX INFO: compiled from: Imprint.java */
    public static class b implements cb {
        private b() {
        }

        @Override // com.umeng.analytics.pro.cb
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b() {
            return new a();
        }
    }

    /* JADX INFO: compiled from: Imprint.java */
    public static class c extends cd<d> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.ca
        public void a(bs bsVar, d dVar) throws az {
            by byVar = (by) bsVar;
            byVar.a(dVar.f105466a.size());
            for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.e> entry : dVar.f105466a.entrySet()) {
                byVar.a(entry.getKey());
                entry.getValue().write(byVar);
            }
            byVar.a(dVar.f105467b);
            byVar.a(dVar.f105468c);
        }

        @Override // com.umeng.analytics.pro.ca
        public void b(bs bsVar, d dVar) throws az {
            by byVar = (by) bsVar;
            bp bpVar = new bp((byte) 11, (byte) 12, byVar.w());
            dVar.f105466a = new HashMap(bpVar.f104634c * 2);
            for (int i10 = 0; i10 < bpVar.f104634c; i10++) {
                String strZ = byVar.z();
                com.umeng.commonsdk.statistics.proto.e eVar = new com.umeng.commonsdk.statistics.proto.e();
                eVar.read(byVar);
                dVar.f105466a.put(strZ, eVar);
            }
            dVar.a(true);
            dVar.f105467b = byVar.w();
            dVar.b(true);
            dVar.f105468c = byVar.z();
            dVar.c(true);
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Imprint.java */
    public static class C1047d implements cb {
        private C1047d() {
        }

        @Override // com.umeng.analytics.pro.cb
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c b() {
            return new c();
        }
    }

    /* JADX INFO: compiled from: Imprint.java */
    public enum e implements ba {
        PROPERTY(1, a0.f133862j),
        VERSION(2, "version"),
        CHECKSUM(3, "checksum");


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Map<String, e> f105473d = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final short f105475e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f105476f;

        static {
            for (e eVar : EnumSet.allOf(e.class)) {
                f105473d.put(eVar.b(), eVar);
            }
        }

        e(short s10, String str) {
            this.f105475e = s10;
            this.f105476f = str;
        }

        public static e a(int i10) {
            if (i10 == 1) {
                return PROPERTY;
            }
            if (i10 == 2) {
                return VERSION;
            }
            if (i10 != 3) {
                return null;
            }
            return CHECKSUM;
        }

        public static e a(String str) {
            return f105473d.get(str);
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
            return this.f105475e;
        }

        @Override // com.umeng.analytics.pro.ba
        public String b() {
            return this.f105476f;
        }
    }

    static {
        HashMap map = new HashMap();
        f105464j = map;
        map.put(cc.class, new b());
        map.put(cd.class, new C1047d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.PROPERTY, new bf(a0.f133862j, (byte) 1, new bi((byte) 13, new bg((byte) 11), new bk((byte) 12, com.umeng.commonsdk.statistics.proto.e.class))));
        enumMap.put(e.VERSION, new bf("version", (byte) 1, new bg((byte) 8)));
        enumMap.put(e.CHECKSUM, new bf("checksum", (byte) 1, new bg((byte) 11)));
        Map<e, bf> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        f105458d = mapUnmodifiableMap;
        bf.a(d.class, mapUnmodifiableMap);
    }

    public d() {
        this.f105469l = (byte) 0;
    }

    public d(d dVar) {
        this.f105469l = (byte) 0;
        this.f105469l = dVar.f105469l;
        if (dVar.e()) {
            HashMap map = new HashMap();
            for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.e> entry : dVar.f105466a.entrySet()) {
                map.put(entry.getKey(), new com.umeng.commonsdk.statistics.proto.e(entry.getValue()));
            }
            this.f105466a = map;
        }
        this.f105467b = dVar.f105467b;
        if (dVar.k()) {
            this.f105468c = dVar.f105468c;
        }
    }

    public d(Map<String, com.umeng.commonsdk.statistics.proto.e> map, int i10, String str) {
        this();
        this.f105466a = map;
        this.f105467b = i10;
        b(true);
        this.f105468c = str;
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f105469l = (byte) 0;
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
    public d deepCopy() {
        return new d(this);
    }

    public d a(int i10) {
        this.f105467b = i10;
        b(true);
        return this;
    }

    public d a(String str) {
        this.f105468c = str;
        return this;
    }

    public d a(Map<String, com.umeng.commonsdk.statistics.proto.e> map) {
        this.f105466a = map;
        return this;
    }

    public void a(String str, com.umeng.commonsdk.statistics.proto.e eVar) {
        if (this.f105466a == null) {
            this.f105466a = new HashMap();
        }
        this.f105466a.put(str, eVar);
    }

    public void a(boolean z10) {
        if (z10) {
            return;
        }
        this.f105466a = null;
    }

    public int b() {
        Map<String, com.umeng.commonsdk.statistics.proto.e> map = this.f105466a;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    @Override // com.umeng.analytics.pro.at
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i10) {
        return e.a(i10);
    }

    public void b(boolean z10) {
        this.f105469l = aq.a(this.f105469l, 0, z10);
    }

    public Map<String, com.umeng.commonsdk.statistics.proto.e> c() {
        return this.f105466a;
    }

    public void c(boolean z10) {
        if (z10) {
            return;
        }
        this.f105468c = null;
    }

    @Override // com.umeng.analytics.pro.at
    public void clear() {
        this.f105466a = null;
        b(false);
        this.f105467b = 0;
        this.f105468c = null;
    }

    public void d() {
        this.f105466a = null;
    }

    public boolean e() {
        return this.f105466a != null;
    }

    public int f() {
        return this.f105467b;
    }

    public void g() {
        this.f105469l = aq.b(this.f105469l, 0);
    }

    public boolean h() {
        return aq.a(this.f105469l, 0);
    }

    public String i() {
        return this.f105468c;
    }

    public void j() {
        this.f105468c = null;
    }

    public boolean k() {
        return this.f105468c != null;
    }

    public void l() throws az {
        if (this.f105466a == null) {
            throw new bt("Required field 'property' was not present! Struct: " + toString());
        }
        if (this.f105468c != null) {
            return;
        }
        throw new bt("Required field 'checksum' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.at
    public void read(bs bsVar) throws az {
        f105464j.get(bsVar.D()).b().b(bsVar, this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Imprint(");
        sb2.append("property:");
        Map<String, com.umeng.commonsdk.statistics.proto.e> map = this.f105466a;
        if (map == null) {
            sb2.append("null");
        } else {
            sb2.append(map);
        }
        sb2.append(", ");
        sb2.append("version:");
        sb2.append(this.f105467b);
        sb2.append(", ");
        sb2.append("checksum:");
        String str = this.f105468c;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.umeng.analytics.pro.at
    public void write(bs bsVar) throws az {
        f105464j.get(bsVar.D()).b().a(bsVar, this);
    }
}
