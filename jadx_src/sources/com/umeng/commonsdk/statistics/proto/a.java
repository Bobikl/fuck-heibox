package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.aq;
import com.umeng.analytics.pro.at;
import com.umeng.analytics.pro.az;
import com.umeng.analytics.pro.ba;
import com.umeng.analytics.pro.bf;
import com.umeng.analytics.pro.bg;
import com.umeng.analytics.pro.bm;
import com.umeng.analytics.pro.bn;
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
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: IdJournal.java */
/* JADX INFO: loaded from: classes4.dex */
public class a implements at<a, e>, Serializable, Cloneable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Map<e, bf> f105397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f105398f = 9132678615281394583L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final bx f105399g = new bx("IdJournal");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final bn f105400h = new bn("domain", (byte) 11, 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final bn f105401i = new bn("old_id", (byte) 11, 2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final bn f105402j = new bn("new_id", (byte) 11, 3);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final bn f105403k = new bn("ts", (byte) 10, 4);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Map<Class<? extends ca>, cb> f105404l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f105405m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f105406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f105407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f105408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f105409d;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte f105410n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private e[] f105411o;

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: IdJournal.java */
    public static class C1044a extends cc<a> {
        private C1044a() {
        }

        @Override // com.umeng.analytics.pro.ca
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(bs bsVar, a aVar) throws az {
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
                            if (s10 != 4) {
                                bv.a(bsVar, b10);
                            } else if (b10 == 10) {
                                aVar.f105409d = bsVar.x();
                                aVar.d(true);
                            } else {
                                bv.a(bsVar, b10);
                            }
                        } else if (b10 == 11) {
                            aVar.f105408c = bsVar.z();
                            aVar.c(true);
                        } else {
                            bv.a(bsVar, b10);
                        }
                    } else if (b10 == 11) {
                        aVar.f105407b = bsVar.z();
                        aVar.b(true);
                    } else {
                        bv.a(bsVar, b10);
                    }
                } else if (b10 == 11) {
                    aVar.f105406a = bsVar.z();
                    aVar.a(true);
                } else {
                    bv.a(bsVar, b10);
                }
                bsVar.m();
            }
            bsVar.k();
            if (aVar.m()) {
                aVar.n();
                return;
            }
            throw new bt("Required field 'ts' was not found in serialized data! Struct: " + toString());
        }

        @Override // com.umeng.analytics.pro.ca
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(bs bsVar, a aVar) throws az {
            aVar.n();
            bsVar.a(a.f105399g);
            if (aVar.f105406a != null) {
                bsVar.a(a.f105400h);
                bsVar.a(aVar.f105406a);
                bsVar.c();
            }
            if (aVar.f105407b != null && aVar.g()) {
                bsVar.a(a.f105401i);
                bsVar.a(aVar.f105407b);
                bsVar.c();
            }
            if (aVar.f105408c != null) {
                bsVar.a(a.f105402j);
                bsVar.a(aVar.f105408c);
                bsVar.c();
            }
            bsVar.a(a.f105403k);
            bsVar.a(aVar.f105409d);
            bsVar.c();
            bsVar.d();
            bsVar.b();
        }
    }

    /* JADX INFO: compiled from: IdJournal.java */
    public static class b implements cb {
        private b() {
        }

        @Override // com.umeng.analytics.pro.cb
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1044a b() {
            return new C1044a();
        }
    }

    /* JADX INFO: compiled from: IdJournal.java */
    public static class c extends cd<a> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.ca
        public void a(bs bsVar, a aVar) throws az {
            by byVar = (by) bsVar;
            byVar.a(aVar.f105406a);
            byVar.a(aVar.f105408c);
            byVar.a(aVar.f105409d);
            BitSet bitSet = new BitSet();
            if (aVar.g()) {
                bitSet.set(0);
            }
            byVar.a(bitSet, 1);
            if (aVar.g()) {
                byVar.a(aVar.f105407b);
            }
        }

        @Override // com.umeng.analytics.pro.ca
        public void b(bs bsVar, a aVar) throws az {
            by byVar = (by) bsVar;
            aVar.f105406a = byVar.z();
            aVar.a(true);
            aVar.f105408c = byVar.z();
            aVar.c(true);
            aVar.f105409d = byVar.x();
            aVar.d(true);
            if (byVar.b(1).get(0)) {
                aVar.f105407b = byVar.z();
                aVar.b(true);
            }
        }
    }

    /* JADX INFO: compiled from: IdJournal.java */
    public static class d implements cb {
        private d() {
        }

        @Override // com.umeng.analytics.pro.cb
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c b() {
            return new c();
        }
    }

    /* JADX INFO: compiled from: IdJournal.java */
    public enum e implements ba {
        DOMAIN(1, "domain"),
        OLD_ID(2, "old_id"),
        NEW_ID(3, "new_id"),
        TS(4, "ts");


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Map<String, e> f105416e = new HashMap();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final short f105418f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f105419g;

        static {
            for (e eVar : EnumSet.allOf(e.class)) {
                f105416e.put(eVar.b(), eVar);
            }
        }

        e(short s10, String str) {
            this.f105418f = s10;
            this.f105419g = str;
        }

        public static e a(int i10) {
            if (i10 == 1) {
                return DOMAIN;
            }
            if (i10 == 2) {
                return OLD_ID;
            }
            if (i10 == 3) {
                return NEW_ID;
            }
            if (i10 != 4) {
                return null;
            }
            return TS;
        }

        public static e a(String str) {
            return f105416e.get(str);
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
            return this.f105418f;
        }

        @Override // com.umeng.analytics.pro.ba
        public String b() {
            return this.f105419g;
        }
    }

    static {
        HashMap map = new HashMap();
        f105404l = map;
        map.put(cc.class, new b());
        map.put(cd.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.DOMAIN, new bf("domain", (byte) 1, new bg((byte) 11)));
        enumMap.put(e.OLD_ID, new bf("old_id", (byte) 2, new bg((byte) 11)));
        enumMap.put(e.NEW_ID, new bf("new_id", (byte) 1, new bg((byte) 11)));
        enumMap.put(e.TS, new bf("ts", (byte) 1, new bg((byte) 10)));
        Map<e, bf> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        f105397e = mapUnmodifiableMap;
        bf.a(a.class, mapUnmodifiableMap);
    }

    public a() {
        this.f105410n = (byte) 0;
        this.f105411o = new e[]{e.OLD_ID};
    }

    public a(a aVar) {
        this.f105410n = (byte) 0;
        this.f105411o = new e[]{e.OLD_ID};
        this.f105410n = aVar.f105410n;
        if (aVar.d()) {
            this.f105406a = aVar.f105406a;
        }
        if (aVar.g()) {
            this.f105407b = aVar.f105407b;
        }
        if (aVar.j()) {
            this.f105408c = aVar.f105408c;
        }
        this.f105409d = aVar.f105409d;
    }

    public a(String str, String str2, long j10) {
        this();
        this.f105406a = str;
        this.f105408c = str2;
        this.f105409d = j10;
        d(true);
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f105410n = (byte) 0;
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
    public a deepCopy() {
        return new a(this);
    }

    public a a(long j10) {
        this.f105409d = j10;
        d(true);
        return this;
    }

    public a a(String str) {
        this.f105406a = str;
        return this;
    }

    public void a(boolean z10) {
        if (z10) {
            return;
        }
        this.f105406a = null;
    }

    public a b(String str) {
        this.f105407b = str;
        return this;
    }

    public String b() {
        return this.f105406a;
    }

    public void b(boolean z10) {
        if (z10) {
            return;
        }
        this.f105407b = null;
    }

    public a c(String str) {
        this.f105408c = str;
        return this;
    }

    public void c() {
        this.f105406a = null;
    }

    public void c(boolean z10) {
        if (z10) {
            return;
        }
        this.f105408c = null;
    }

    @Override // com.umeng.analytics.pro.at
    public void clear() {
        this.f105406a = null;
        this.f105407b = null;
        this.f105408c = null;
        d(false);
        this.f105409d = 0L;
    }

    public void d(boolean z10) {
        this.f105410n = aq.a(this.f105410n, 0, z10);
    }

    public boolean d() {
        return this.f105406a != null;
    }

    public String e() {
        return this.f105407b;
    }

    public void f() {
        this.f105407b = null;
    }

    public boolean g() {
        return this.f105407b != null;
    }

    public String h() {
        return this.f105408c;
    }

    public void i() {
        this.f105408c = null;
    }

    public boolean j() {
        return this.f105408c != null;
    }

    public long k() {
        return this.f105409d;
    }

    public void l() {
        this.f105410n = aq.b(this.f105410n, 0);
    }

    public boolean m() {
        return aq.a(this.f105410n, 0);
    }

    public void n() throws az {
        if (this.f105406a == null) {
            throw new bt("Required field 'domain' was not present! Struct: " + toString());
        }
        if (this.f105408c != null) {
            return;
        }
        throw new bt("Required field 'new_id' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.at
    public void read(bs bsVar) throws az {
        f105404l.get(bsVar.D()).b().b(bsVar, this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("IdJournal(");
        sb2.append("domain:");
        String str = this.f105406a;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        if (g()) {
            sb2.append(", ");
            sb2.append("old_id:");
            String str2 = this.f105407b;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        sb2.append(", ");
        sb2.append("new_id:");
        String str3 = this.f105408c;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(", ");
        sb2.append("ts:");
        sb2.append(this.f105409d);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.umeng.analytics.pro.at
    public void write(bs bsVar) throws az {
        f105404l.get(bsVar.D()).b().a(bsVar, this);
    }
}
