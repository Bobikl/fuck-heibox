package com.umeng.analytics.pro;

import com.google.android.exoplayer2.source.rtsp.k0;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: UMEnvelope.java */
/* JADX INFO: loaded from: classes4.dex */
public class al implements at<al, e>, Serializable, Cloneable {
    private static final int A = 2;
    private static final int B = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Map<e, bf> f104467k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f104468l = 420342210744516016L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final bx f104469m = new bx("UMEnvelope");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final bn f104470n = new bn("version", (byte) 11, 1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final bn f104471o = new bn("address", (byte) 11, 2);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final bn f104472p = new bn("signature", (byte) 11, 3);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final bn f104473q = new bn("serial_num", (byte) 8, 4);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final bn f104474r = new bn("ts_secs", (byte) 8, 5);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final bn f104475s = new bn(k0.f48801p, (byte) 8, 6);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final bn f104476t = new bn("entity", (byte) 11, 7);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final bn f104477u = new bn(TPDownloadProxyEnum.USER_GUID, (byte) 11, 8);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final bn f104478v = new bn("checksum", (byte) 11, 9);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final bn f104479w = new bn("codex", (byte) 8, 10);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Map<Class<? extends ca>, cb> f104480x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f104481y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f104482z = 1;
    private byte C;
    private e[] D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f104483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f104484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f104485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f104486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f104487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f104488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f104489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f104490h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f104491i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f104492j;

    /* JADX INFO: compiled from: UMEnvelope.java */
    public static class a extends cc<al> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.ca
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(bs bsVar, al alVar) throws az {
            bsVar.j();
            while (true) {
                bn bnVarL = bsVar.l();
                byte b10 = bnVarL.f104628b;
                if (b10 == 0) {
                    bsVar.k();
                    if (!alVar.m()) {
                        throw new bt("Required field 'serial_num' was not found in serialized data! Struct: " + toString());
                    }
                    if (!alVar.p()) {
                        throw new bt("Required field 'ts_secs' was not found in serialized data! Struct: " + toString());
                    }
                    if (alVar.s()) {
                        alVar.G();
                        return;
                    }
                    throw new bt("Required field 'length' was not found in serialized data! Struct: " + toString());
                }
                switch (bnVarL.f104629c) {
                    case 1:
                        if (b10 != 11) {
                            bv.a(bsVar, b10);
                        } else {
                            alVar.f104483a = bsVar.z();
                            alVar.a(true);
                        }
                        break;
                    case 2:
                        if (b10 != 11) {
                            bv.a(bsVar, b10);
                        } else {
                            alVar.f104484b = bsVar.z();
                            alVar.b(true);
                        }
                        break;
                    case 3:
                        if (b10 != 11) {
                            bv.a(bsVar, b10);
                        } else {
                            alVar.f104485c = bsVar.z();
                            alVar.c(true);
                        }
                        break;
                    case 4:
                        if (b10 != 8) {
                            bv.a(bsVar, b10);
                        } else {
                            alVar.f104486d = bsVar.w();
                            alVar.d(true);
                        }
                        break;
                    case 5:
                        if (b10 != 8) {
                            bv.a(bsVar, b10);
                        } else {
                            alVar.f104487e = bsVar.w();
                            alVar.e(true);
                        }
                        break;
                    case 6:
                        if (b10 != 8) {
                            bv.a(bsVar, b10);
                        } else {
                            alVar.f104488f = bsVar.w();
                            alVar.f(true);
                        }
                        break;
                    case 7:
                        if (b10 != 11) {
                            bv.a(bsVar, b10);
                        } else {
                            alVar.f104489g = bsVar.A();
                            alVar.g(true);
                        }
                        break;
                    case 8:
                        if (b10 != 11) {
                            bv.a(bsVar, b10);
                        } else {
                            alVar.f104490h = bsVar.z();
                            alVar.h(true);
                        }
                        break;
                    case 9:
                        if (b10 != 11) {
                            bv.a(bsVar, b10);
                        } else {
                            alVar.f104491i = bsVar.z();
                            alVar.i(true);
                        }
                        break;
                    case 10:
                        if (b10 != 8) {
                            bv.a(bsVar, b10);
                        } else {
                            alVar.f104492j = bsVar.w();
                            alVar.j(true);
                        }
                        break;
                    default:
                        bv.a(bsVar, b10);
                        break;
                }
                bsVar.m();
            }
        }

        @Override // com.umeng.analytics.pro.ca
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(bs bsVar, al alVar) throws az {
            alVar.G();
            bsVar.a(al.f104469m);
            if (alVar.f104483a != null) {
                bsVar.a(al.f104470n);
                bsVar.a(alVar.f104483a);
                bsVar.c();
            }
            if (alVar.f104484b != null) {
                bsVar.a(al.f104471o);
                bsVar.a(alVar.f104484b);
                bsVar.c();
            }
            if (alVar.f104485c != null) {
                bsVar.a(al.f104472p);
                bsVar.a(alVar.f104485c);
                bsVar.c();
            }
            bsVar.a(al.f104473q);
            bsVar.a(alVar.f104486d);
            bsVar.c();
            bsVar.a(al.f104474r);
            bsVar.a(alVar.f104487e);
            bsVar.c();
            bsVar.a(al.f104475s);
            bsVar.a(alVar.f104488f);
            bsVar.c();
            if (alVar.f104489g != null) {
                bsVar.a(al.f104476t);
                bsVar.a(alVar.f104489g);
                bsVar.c();
            }
            if (alVar.f104490h != null) {
                bsVar.a(al.f104477u);
                bsVar.a(alVar.f104490h);
                bsVar.c();
            }
            if (alVar.f104491i != null) {
                bsVar.a(al.f104478v);
                bsVar.a(alVar.f104491i);
                bsVar.c();
            }
            if (alVar.F()) {
                bsVar.a(al.f104479w);
                bsVar.a(alVar.f104492j);
                bsVar.c();
            }
            bsVar.d();
            bsVar.b();
        }
    }

    /* JADX INFO: compiled from: UMEnvelope.java */
    public static class b implements cb {
        private b() {
        }

        @Override // com.umeng.analytics.pro.cb
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b() {
            return new a();
        }
    }

    /* JADX INFO: compiled from: UMEnvelope.java */
    public static class c extends cd<al> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.ca
        public void a(bs bsVar, al alVar) throws az {
            by byVar = (by) bsVar;
            byVar.a(alVar.f104483a);
            byVar.a(alVar.f104484b);
            byVar.a(alVar.f104485c);
            byVar.a(alVar.f104486d);
            byVar.a(alVar.f104487e);
            byVar.a(alVar.f104488f);
            byVar.a(alVar.f104489g);
            byVar.a(alVar.f104490h);
            byVar.a(alVar.f104491i);
            BitSet bitSet = new BitSet();
            if (alVar.F()) {
                bitSet.set(0);
            }
            byVar.a(bitSet, 1);
            if (alVar.F()) {
                byVar.a(alVar.f104492j);
            }
        }

        @Override // com.umeng.analytics.pro.ca
        public void b(bs bsVar, al alVar) throws az {
            by byVar = (by) bsVar;
            alVar.f104483a = byVar.z();
            alVar.a(true);
            alVar.f104484b = byVar.z();
            alVar.b(true);
            alVar.f104485c = byVar.z();
            alVar.c(true);
            alVar.f104486d = byVar.w();
            alVar.d(true);
            alVar.f104487e = byVar.w();
            alVar.e(true);
            alVar.f104488f = byVar.w();
            alVar.f(true);
            alVar.f104489g = byVar.A();
            alVar.g(true);
            alVar.f104490h = byVar.z();
            alVar.h(true);
            alVar.f104491i = byVar.z();
            alVar.i(true);
            if (byVar.b(1).get(0)) {
                alVar.f104492j = byVar.w();
                alVar.j(true);
            }
        }
    }

    /* JADX INFO: compiled from: UMEnvelope.java */
    public static class d implements cb {
        private d() {
        }

        @Override // com.umeng.analytics.pro.cb
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c b() {
            return new c();
        }
    }

    /* JADX INFO: compiled from: UMEnvelope.java */
    public enum e implements ba {
        VERSION(1, "version"),
        ADDRESS(2, "address"),
        SIGNATURE(3, "signature"),
        SERIAL_NUM(4, "serial_num"),
        TS_SECS(5, "ts_secs"),
        LENGTH(6, k0.f48801p),
        ENTITY(7, "entity"),
        GUID(8, TPDownloadProxyEnum.USER_GUID),
        CHECKSUM(9, "checksum"),
        CODEX(10, "codex");


        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final Map<String, e> f104503k = new HashMap();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final short f104505l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final String f104506m;

        static {
            for (e eVar : EnumSet.allOf(e.class)) {
                f104503k.put(eVar.b(), eVar);
            }
        }

        e(short s10, String str) {
            this.f104505l = s10;
            this.f104506m = str;
        }

        public static e a(int i10) {
            switch (i10) {
                case 1:
                    return VERSION;
                case 2:
                    return ADDRESS;
                case 3:
                    return SIGNATURE;
                case 4:
                    return SERIAL_NUM;
                case 5:
                    return TS_SECS;
                case 6:
                    return LENGTH;
                case 7:
                    return ENTITY;
                case 8:
                    return GUID;
                case 9:
                    return CHECKSUM;
                case 10:
                    return CODEX;
                default:
                    return null;
            }
        }

        public static e a(String str) {
            return f104503k.get(str);
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
            return this.f104505l;
        }

        @Override // com.umeng.analytics.pro.ba
        public String b() {
            return this.f104506m;
        }
    }

    static {
        HashMap map = new HashMap();
        f104480x = map;
        map.put(cc.class, new b());
        map.put(cd.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.VERSION, new bf("version", (byte) 1, new bg((byte) 11)));
        enumMap.put(e.ADDRESS, new bf("address", (byte) 1, new bg((byte) 11)));
        enumMap.put(e.SIGNATURE, new bf("signature", (byte) 1, new bg((byte) 11)));
        enumMap.put(e.SERIAL_NUM, new bf("serial_num", (byte) 1, new bg((byte) 8)));
        enumMap.put(e.TS_SECS, new bf("ts_secs", (byte) 1, new bg((byte) 8)));
        enumMap.put(e.LENGTH, new bf(k0.f48801p, (byte) 1, new bg((byte) 8)));
        enumMap.put(e.ENTITY, new bf("entity", (byte) 1, new bg((byte) 11, true)));
        enumMap.put(e.GUID, new bf(TPDownloadProxyEnum.USER_GUID, (byte) 1, new bg((byte) 11)));
        enumMap.put(e.CHECKSUM, new bf("checksum", (byte) 1, new bg((byte) 11)));
        enumMap.put(e.CODEX, new bf("codex", (byte) 2, new bg((byte) 8)));
        Map<e, bf> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        f104467k = mapUnmodifiableMap;
        bf.a(al.class, mapUnmodifiableMap);
    }

    public al() {
        this.C = (byte) 0;
        this.D = new e[]{e.CODEX};
    }

    public al(al alVar) {
        this.C = (byte) 0;
        this.D = new e[]{e.CODEX};
        this.C = alVar.C;
        if (alVar.d()) {
            this.f104483a = alVar.f104483a;
        }
        if (alVar.g()) {
            this.f104484b = alVar.f104484b;
        }
        if (alVar.j()) {
            this.f104485c = alVar.f104485c;
        }
        this.f104486d = alVar.f104486d;
        this.f104487e = alVar.f104487e;
        this.f104488f = alVar.f104488f;
        if (alVar.w()) {
            this.f104489g = au.d(alVar.f104489g);
        }
        if (alVar.z()) {
            this.f104490h = alVar.f104490h;
        }
        if (alVar.C()) {
            this.f104491i = alVar.f104491i;
        }
        this.f104492j = alVar.f104492j;
    }

    public al(String str, String str2, String str3, int i10, int i11, int i12, ByteBuffer byteBuffer, String str4, String str5) {
        this();
        this.f104483a = str;
        this.f104484b = str2;
        this.f104485c = str3;
        this.f104486d = i10;
        d(true);
        this.f104487e = i11;
        e(true);
        this.f104488f = i12;
        f(true);
        this.f104489g = byteBuffer;
        this.f104490h = str4;
        this.f104491i = str5;
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.C = (byte) 0;
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

    public String A() {
        return this.f104491i;
    }

    public void B() {
        this.f104491i = null;
    }

    public boolean C() {
        return this.f104491i != null;
    }

    public int D() {
        return this.f104492j;
    }

    public void E() {
        this.C = aq.b(this.C, 3);
    }

    public boolean F() {
        return aq.a(this.C, 3);
    }

    public void G() throws az {
        if (this.f104483a == null) {
            throw new bt("Required field 'version' was not present! Struct: " + toString());
        }
        if (this.f104484b == null) {
            throw new bt("Required field 'address' was not present! Struct: " + toString());
        }
        if (this.f104485c == null) {
            throw new bt("Required field 'signature' was not present! Struct: " + toString());
        }
        if (this.f104489g == null) {
            throw new bt("Required field 'entity' was not present! Struct: " + toString());
        }
        if (this.f104490h == null) {
            throw new bt("Required field 'guid' was not present! Struct: " + toString());
        }
        if (this.f104491i != null) {
            return;
        }
        throw new bt("Required field 'checksum' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.at
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public al deepCopy() {
        return new al(this);
    }

    public al a(int i10) {
        this.f104486d = i10;
        d(true);
        return this;
    }

    public al a(String str) {
        this.f104483a = str;
        return this;
    }

    public al a(ByteBuffer byteBuffer) {
        this.f104489g = byteBuffer;
        return this;
    }

    public al a(byte[] bArr) {
        a(bArr == null ? null : ByteBuffer.wrap(bArr));
        return this;
    }

    public void a(boolean z10) {
        if (z10) {
            return;
        }
        this.f104483a = null;
    }

    public al b(int i10) {
        this.f104487e = i10;
        e(true);
        return this;
    }

    public al b(String str) {
        this.f104484b = str;
        return this;
    }

    public String b() {
        return this.f104483a;
    }

    public void b(boolean z10) {
        if (z10) {
            return;
        }
        this.f104484b = null;
    }

    public al c(int i10) {
        this.f104488f = i10;
        f(true);
        return this;
    }

    public al c(String str) {
        this.f104485c = str;
        return this;
    }

    public void c() {
        this.f104483a = null;
    }

    public void c(boolean z10) {
        if (z10) {
            return;
        }
        this.f104485c = null;
    }

    @Override // com.umeng.analytics.pro.at
    public void clear() {
        this.f104483a = null;
        this.f104484b = null;
        this.f104485c = null;
        d(false);
        this.f104486d = 0;
        e(false);
        this.f104487e = 0;
        f(false);
        this.f104488f = 0;
        this.f104489g = null;
        this.f104490h = null;
        this.f104491i = null;
        j(false);
        this.f104492j = 0;
    }

    public al d(int i10) {
        this.f104492j = i10;
        j(true);
        return this;
    }

    public al d(String str) {
        this.f104490h = str;
        return this;
    }

    public void d(boolean z10) {
        this.C = aq.a(this.C, 0, z10);
    }

    public boolean d() {
        return this.f104483a != null;
    }

    @Override // com.umeng.analytics.pro.at
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i10) {
        return e.a(i10);
    }

    public al e(String str) {
        this.f104491i = str;
        return this;
    }

    public String e() {
        return this.f104484b;
    }

    public void e(boolean z10) {
        this.C = aq.a(this.C, 1, z10);
    }

    public void f() {
        this.f104484b = null;
    }

    public void f(boolean z10) {
        this.C = aq.a(this.C, 2, z10);
    }

    public void g(boolean z10) {
        if (z10) {
            return;
        }
        this.f104489g = null;
    }

    public boolean g() {
        return this.f104484b != null;
    }

    public String h() {
        return this.f104485c;
    }

    public void h(boolean z10) {
        if (z10) {
            return;
        }
        this.f104490h = null;
    }

    public void i() {
        this.f104485c = null;
    }

    public void i(boolean z10) {
        if (z10) {
            return;
        }
        this.f104491i = null;
    }

    public void j(boolean z10) {
        this.C = aq.a(this.C, 3, z10);
    }

    public boolean j() {
        return this.f104485c != null;
    }

    public int k() {
        return this.f104486d;
    }

    public void l() {
        this.C = aq.b(this.C, 0);
    }

    public boolean m() {
        return aq.a(this.C, 0);
    }

    public int n() {
        return this.f104487e;
    }

    public void o() {
        this.C = aq.b(this.C, 1);
    }

    public boolean p() {
        return aq.a(this.C, 1);
    }

    public int q() {
        return this.f104488f;
    }

    public void r() {
        this.C = aq.b(this.C, 2);
    }

    @Override // com.umeng.analytics.pro.at
    public void read(bs bsVar) throws az {
        f104480x.get(bsVar.D()).b().b(bsVar, this);
    }

    public boolean s() {
        return aq.a(this.C, 2);
    }

    public byte[] t() {
        a(au.c(this.f104489g));
        ByteBuffer byteBuffer = this.f104489g;
        if (byteBuffer == null) {
            return null;
        }
        return byteBuffer.array();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UMEnvelope(");
        sb2.append("version:");
        String str = this.f104483a;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(", ");
        sb2.append("address:");
        String str2 = this.f104484b;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(", ");
        sb2.append("signature:");
        String str3 = this.f104485c;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(", ");
        sb2.append("serial_num:");
        sb2.append(this.f104486d);
        sb2.append(", ");
        sb2.append("ts_secs:");
        sb2.append(this.f104487e);
        sb2.append(", ");
        sb2.append("length:");
        sb2.append(this.f104488f);
        sb2.append(", ");
        sb2.append("entity:");
        ByteBuffer byteBuffer = this.f104489g;
        if (byteBuffer == null) {
            sb2.append("null");
        } else {
            au.a(byteBuffer, sb2);
        }
        sb2.append(", ");
        sb2.append("guid:");
        String str4 = this.f104490h;
        if (str4 == null) {
            sb2.append("null");
        } else {
            sb2.append(str4);
        }
        sb2.append(", ");
        sb2.append("checksum:");
        String str5 = this.f104491i;
        if (str5 == null) {
            sb2.append("null");
        } else {
            sb2.append(str5);
        }
        if (F()) {
            sb2.append(", ");
            sb2.append("codex:");
            sb2.append(this.f104492j);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public ByteBuffer u() {
        return this.f104489g;
    }

    public void v() {
        this.f104489g = null;
    }

    public boolean w() {
        return this.f104489g != null;
    }

    @Override // com.umeng.analytics.pro.at
    public void write(bs bsVar) throws az {
        f104480x.get(bsVar.D()).b().a(bsVar, this);
    }

    public String x() {
        return this.f104490h;
    }

    public void y() {
        this.f104490h = null;
    }

    public boolean z() {
        return this.f104490h != null;
    }
}
