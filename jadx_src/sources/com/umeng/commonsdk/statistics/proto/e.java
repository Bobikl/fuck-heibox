package com.umeng.commonsdk.statistics.proto;

import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
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

/* JADX INFO: compiled from: ImprintValue.java */
/* JADX INFO: loaded from: classes4.dex */
public class e implements at<e, EnumC1048e>, Serializable, Cloneable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map<EnumC1048e, bf> f105477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f105478e = 7501688097813630241L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final bx f105479f = new bx("ImprintValue");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final bn f105480g = new bn("value", (byte) 11, 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final bn f105481h = new bn("ts", (byte) 10, 2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final bn f105482i = new bn(TPDownloadProxyEnum.USER_GUID, (byte) 11, 3);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Map<Class<? extends ca>, cb> f105483j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f105484k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f105485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f105486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f105487c;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private byte f105488l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private EnumC1048e[] f105489m;

    /* JADX INFO: compiled from: ImprintValue.java */
    public static class a extends cc<e> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.ca
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(bs bsVar, e eVar) throws az {
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
                            eVar.f105487c = bsVar.z();
                            eVar.c(true);
                        } else {
                            bv.a(bsVar, b10);
                        }
                    } else if (b10 == 10) {
                        eVar.f105486b = bsVar.x();
                        eVar.b(true);
                    } else {
                        bv.a(bsVar, b10);
                    }
                } else if (b10 == 11) {
                    eVar.f105485a = bsVar.z();
                    eVar.a(true);
                } else {
                    bv.a(bsVar, b10);
                }
                bsVar.m();
            }
            bsVar.k();
            if (eVar.g()) {
                eVar.k();
                return;
            }
            throw new bt("Required field 'ts' was not found in serialized data! Struct: " + toString());
        }

        @Override // com.umeng.analytics.pro.ca
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(bs bsVar, e eVar) throws az {
            eVar.k();
            bsVar.a(e.f105479f);
            if (eVar.f105485a != null && eVar.d()) {
                bsVar.a(e.f105480g);
                bsVar.a(eVar.f105485a);
                bsVar.c();
            }
            bsVar.a(e.f105481h);
            bsVar.a(eVar.f105486b);
            bsVar.c();
            if (eVar.f105487c != null) {
                bsVar.a(e.f105482i);
                bsVar.a(eVar.f105487c);
                bsVar.c();
            }
            bsVar.d();
            bsVar.b();
        }
    }

    /* JADX INFO: compiled from: ImprintValue.java */
    public static class b implements cb {
        private b() {
        }

        @Override // com.umeng.analytics.pro.cb
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b() {
            return new a();
        }
    }

    /* JADX INFO: compiled from: ImprintValue.java */
    public static class c extends cd<e> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.ca
        public void a(bs bsVar, e eVar) throws az {
            by byVar = (by) bsVar;
            byVar.a(eVar.f105486b);
            byVar.a(eVar.f105487c);
            BitSet bitSet = new BitSet();
            if (eVar.d()) {
                bitSet.set(0);
            }
            byVar.a(bitSet, 1);
            if (eVar.d()) {
                byVar.a(eVar.f105485a);
            }
        }

        @Override // com.umeng.analytics.pro.ca
        public void b(bs bsVar, e eVar) throws az {
            by byVar = (by) bsVar;
            eVar.f105486b = byVar.x();
            eVar.b(true);
            eVar.f105487c = byVar.z();
            eVar.c(true);
            if (byVar.b(1).get(0)) {
                eVar.f105485a = byVar.z();
                eVar.a(true);
            }
        }
    }

    /* JADX INFO: compiled from: ImprintValue.java */
    public static class d implements cb {
        private d() {
        }

        @Override // com.umeng.analytics.pro.cb
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c b() {
            return new c();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ImprintValue.java */
    public enum EnumC1048e implements ba {
        VALUE(1, "value"),
        TS(2, "ts"),
        GUID(3, TPDownloadProxyEnum.USER_GUID);


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Map<String, EnumC1048e> f105493d = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final short f105495e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f105496f;

        static {
            for (EnumC1048e enumC1048e : EnumSet.allOf(EnumC1048e.class)) {
                f105493d.put(enumC1048e.b(), enumC1048e);
            }
        }

        EnumC1048e(short s10, String str) {
            this.f105495e = s10;
            this.f105496f = str;
        }

        public static EnumC1048e a(int i10) {
            if (i10 == 1) {
                return VALUE;
            }
            if (i10 == 2) {
                return TS;
            }
            if (i10 != 3) {
                return null;
            }
            return GUID;
        }

        public static EnumC1048e a(String str) {
            return f105493d.get(str);
        }

        public static EnumC1048e b(int i10) {
            EnumC1048e enumC1048eA = a(i10);
            if (enumC1048eA != null) {
                return enumC1048eA;
            }
            throw new IllegalArgumentException("Field " + i10 + " doesn't exist!");
        }

        @Override // com.umeng.analytics.pro.ba
        public short a() {
            return this.f105495e;
        }

        @Override // com.umeng.analytics.pro.ba
        public String b() {
            return this.f105496f;
        }
    }

    static {
        HashMap map = new HashMap();
        f105483j = map;
        map.put(cc.class, new b());
        map.put(cd.class, new d());
        EnumMap enumMap = new EnumMap(EnumC1048e.class);
        enumMap.put(EnumC1048e.VALUE, new bf("value", (byte) 2, new bg((byte) 11)));
        enumMap.put(EnumC1048e.TS, new bf("ts", (byte) 1, new bg((byte) 10)));
        enumMap.put(EnumC1048e.GUID, new bf(TPDownloadProxyEnum.USER_GUID, (byte) 1, new bg((byte) 11)));
        Map<EnumC1048e, bf> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        f105477d = mapUnmodifiableMap;
        bf.a(e.class, mapUnmodifiableMap);
    }

    public e() {
        this.f105488l = (byte) 0;
        this.f105489m = new EnumC1048e[]{EnumC1048e.VALUE};
    }

    public e(long j10, String str) {
        this();
        this.f105486b = j10;
        b(true);
        this.f105487c = str;
    }

    public e(e eVar) {
        this.f105488l = (byte) 0;
        this.f105489m = new EnumC1048e[]{EnumC1048e.VALUE};
        this.f105488l = eVar.f105488l;
        if (eVar.d()) {
            this.f105485a = eVar.f105485a;
        }
        this.f105486b = eVar.f105486b;
        if (eVar.j()) {
            this.f105487c = eVar.f105487c;
        }
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f105488l = (byte) 0;
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
    public EnumC1048e fieldForId(int i10) {
        return EnumC1048e.a(i10);
    }

    @Override // com.umeng.analytics.pro.at
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e deepCopy() {
        return new e(this);
    }

    public e a(long j10) {
        this.f105486b = j10;
        b(true);
        return this;
    }

    public e a(String str) {
        this.f105485a = str;
        return this;
    }

    public void a(boolean z10) {
        if (z10) {
            return;
        }
        this.f105485a = null;
    }

    public e b(String str) {
        this.f105487c = str;
        return this;
    }

    public String b() {
        return this.f105485a;
    }

    public void b(boolean z10) {
        this.f105488l = aq.a(this.f105488l, 0, z10);
    }

    public void c() {
        this.f105485a = null;
    }

    public void c(boolean z10) {
        if (z10) {
            return;
        }
        this.f105487c = null;
    }

    @Override // com.umeng.analytics.pro.at
    public void clear() {
        this.f105485a = null;
        b(false);
        this.f105486b = 0L;
        this.f105487c = null;
    }

    public boolean d() {
        return this.f105485a != null;
    }

    public long e() {
        return this.f105486b;
    }

    public void f() {
        this.f105488l = aq.b(this.f105488l, 0);
    }

    public boolean g() {
        return aq.a(this.f105488l, 0);
    }

    public String h() {
        return this.f105487c;
    }

    public void i() {
        this.f105487c = null;
    }

    public boolean j() {
        return this.f105487c != null;
    }

    public void k() throws az {
        if (this.f105487c != null) {
            return;
        }
        throw new bt("Required field 'guid' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.at
    public void read(bs bsVar) throws az {
        f105483j.get(bsVar.D()).b().b(bsVar, this);
    }

    public String toString() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("ImprintValue(");
        if (d()) {
            sb2.append("value:");
            String str = this.f105485a;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            sb2.append(", ");
        }
        sb2.append("ts:");
        sb2.append(this.f105486b);
        sb2.append(", ");
        sb2.append("guid:");
        String str2 = this.f105487c;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.umeng.analytics.pro.at
    public void write(bs bsVar) throws az {
        f105483j.get(bsVar.D()).b().a(bsVar, this);
    }
}
