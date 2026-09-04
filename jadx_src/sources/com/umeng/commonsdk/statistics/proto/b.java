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
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: IdSnapshot.java */
/* JADX INFO: loaded from: classes4.dex */
public class b implements at<b, e>, Serializable, Cloneable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map<e, bf> f105420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f105421e = -6496538196005191531L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final bx f105422f = new bx("IdSnapshot");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final bn f105423g = new bn("identity", (byte) 11, 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final bn f105424h = new bn("ts", (byte) 10, 2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final bn f105425i = new bn("version", (byte) 8, 3);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Map<Class<? extends ca>, cb> f105426j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f105427k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f105428l = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f105429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f105430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f105431c;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private byte f105432m;

    /* JADX INFO: compiled from: IdSnapshot.java */
    public static class a extends cc<b> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.ca
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(bs bsVar, b bVar) throws az {
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
                        } else if (b10 == 8) {
                            bVar.f105431c = bsVar.w();
                            bVar.c(true);
                        } else {
                            bv.a(bsVar, b10);
                        }
                    } else if (b10 == 10) {
                        bVar.f105430b = bsVar.x();
                        bVar.b(true);
                    } else {
                        bv.a(bsVar, b10);
                    }
                } else if (b10 == 11) {
                    bVar.f105429a = bsVar.z();
                    bVar.a(true);
                } else {
                    bv.a(bsVar, b10);
                }
                bsVar.m();
            }
            bsVar.k();
            if (!bVar.g()) {
                throw new bt("Required field 'ts' was not found in serialized data! Struct: " + toString());
            }
            if (bVar.j()) {
                bVar.k();
                return;
            }
            throw new bt("Required field 'version' was not found in serialized data! Struct: " + toString());
        }

        @Override // com.umeng.analytics.pro.ca
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(bs bsVar, b bVar) throws az {
            bVar.k();
            bsVar.a(b.f105422f);
            if (bVar.f105429a != null) {
                bsVar.a(b.f105423g);
                bsVar.a(bVar.f105429a);
                bsVar.c();
            }
            bsVar.a(b.f105424h);
            bsVar.a(bVar.f105430b);
            bsVar.c();
            bsVar.a(b.f105425i);
            bsVar.a(bVar.f105431c);
            bsVar.c();
            bsVar.d();
            bsVar.b();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: IdSnapshot.java */
    public static class C1045b implements cb {
        private C1045b() {
        }

        @Override // com.umeng.analytics.pro.cb
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b() {
            return new a();
        }
    }

    /* JADX INFO: compiled from: IdSnapshot.java */
    public static class c extends cd<b> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.ca
        public void a(bs bsVar, b bVar) throws az {
            by byVar = (by) bsVar;
            byVar.a(bVar.f105429a);
            byVar.a(bVar.f105430b);
            byVar.a(bVar.f105431c);
        }

        @Override // com.umeng.analytics.pro.ca
        public void b(bs bsVar, b bVar) throws az {
            by byVar = (by) bsVar;
            bVar.f105429a = byVar.z();
            bVar.a(true);
            bVar.f105430b = byVar.x();
            bVar.b(true);
            bVar.f105431c = byVar.w();
            bVar.c(true);
        }
    }

    /* JADX INFO: compiled from: IdSnapshot.java */
    public static class d implements cb {
        private d() {
        }

        @Override // com.umeng.analytics.pro.cb
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c b() {
            return new c();
        }
    }

    /* JADX INFO: compiled from: IdSnapshot.java */
    public enum e implements ba {
        IDENTITY(1, "identity"),
        TS(2, "ts"),
        VERSION(3, "version");


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Map<String, e> f105436d = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final short f105438e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f105439f;

        static {
            for (e eVar : EnumSet.allOf(e.class)) {
                f105436d.put(eVar.b(), eVar);
            }
        }

        e(short s10, String str) {
            this.f105438e = s10;
            this.f105439f = str;
        }

        public static e a(int i10) {
            if (i10 == 1) {
                return IDENTITY;
            }
            if (i10 == 2) {
                return TS;
            }
            if (i10 != 3) {
                return null;
            }
            return VERSION;
        }

        public static e a(String str) {
            return f105436d.get(str);
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
            return this.f105438e;
        }

        @Override // com.umeng.analytics.pro.ba
        public String b() {
            return this.f105439f;
        }
    }

    static {
        HashMap map = new HashMap();
        f105426j = map;
        map.put(cc.class, new C1045b());
        map.put(cd.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.IDENTITY, new bf("identity", (byte) 1, new bg((byte) 11)));
        enumMap.put(e.TS, new bf("ts", (byte) 1, new bg((byte) 10)));
        enumMap.put(e.VERSION, new bf("version", (byte) 1, new bg((byte) 8)));
        Map<e, bf> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        f105420d = mapUnmodifiableMap;
        bf.a(b.class, mapUnmodifiableMap);
    }

    public b() {
        this.f105432m = (byte) 0;
    }

    public b(b bVar) {
        this.f105432m = (byte) 0;
        this.f105432m = bVar.f105432m;
        if (bVar.d()) {
            this.f105429a = bVar.f105429a;
        }
        this.f105430b = bVar.f105430b;
        this.f105431c = bVar.f105431c;
    }

    public b(String str, long j10, int i10) {
        this();
        this.f105429a = str;
        this.f105430b = j10;
        b(true);
        this.f105431c = i10;
        c(true);
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f105432m = (byte) 0;
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
    public b deepCopy() {
        return new b(this);
    }

    public b a(int i10) {
        this.f105431c = i10;
        c(true);
        return this;
    }

    public b a(long j10) {
        this.f105430b = j10;
        b(true);
        return this;
    }

    public b a(String str) {
        this.f105429a = str;
        return this;
    }

    public void a(boolean z10) {
        if (z10) {
            return;
        }
        this.f105429a = null;
    }

    @Override // com.umeng.analytics.pro.at
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i10) {
        return e.a(i10);
    }

    public String b() {
        return this.f105429a;
    }

    public void b(boolean z10) {
        this.f105432m = aq.a(this.f105432m, 0, z10);
    }

    public void c() {
        this.f105429a = null;
    }

    public void c(boolean z10) {
        this.f105432m = aq.a(this.f105432m, 1, z10);
    }

    @Override // com.umeng.analytics.pro.at
    public void clear() {
        this.f105429a = null;
        b(false);
        this.f105430b = 0L;
        c(false);
        this.f105431c = 0;
    }

    public boolean d() {
        return this.f105429a != null;
    }

    public long e() {
        return this.f105430b;
    }

    public void f() {
        this.f105432m = aq.b(this.f105432m, 0);
    }

    public boolean g() {
        return aq.a(this.f105432m, 0);
    }

    public int h() {
        return this.f105431c;
    }

    public void i() {
        this.f105432m = aq.b(this.f105432m, 1);
    }

    public boolean j() {
        return aq.a(this.f105432m, 1);
    }

    public void k() throws az {
        if (this.f105429a != null) {
            return;
        }
        throw new bt("Required field 'identity' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.at
    public void read(bs bsVar) throws az {
        f105426j.get(bsVar.D()).b().b(bsVar, this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("IdSnapshot(");
        sb2.append("identity:");
        String str = this.f105429a;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(", ");
        sb2.append("ts:");
        sb2.append(this.f105430b);
        sb2.append(", ");
        sb2.append("version:");
        sb2.append(this.f105431c);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.umeng.analytics.pro.at
    public void write(bs bsVar) throws az {
        f105426j.get(bsVar.D()).b().a(bsVar, this);
    }
}
