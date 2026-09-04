package com.google.common.hash;

import com.google.common.base.w;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.Checksum;
import javax.annotation.CheckForNull;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes7.dex */
@com.google.common.hash.h
public final class Hashing {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f58475a = (int) System.currentTimeMillis();

    @s9.j
    public enum ChecksumType implements p<Checksum> {
        CRC_32("Hashing.crc32()") { // from class: com.google.common.hash.Hashing.ChecksumType.1
            @Override // com.google.common.base.c0
            public Checksum get() {
                return new CRC32();
            }
        },
        ADLER_32("Hashing.adler32()") { // from class: com.google.common.hash.Hashing.ChecksumType.2
            @Override // com.google.common.base.c0
            public Checksum get() {
                return new Adler32();
            }
        };

        public final k hashFunction;

        ChecksumType(String str) {
            this.hashFunction = new ChecksumHashFunction(this, 32, str);
        }
    }

    public static final class b extends com.google.common.hash.b {
        private b(k... kVarArr) {
            super(kVarArr);
            for (k kVar : kVarArr) {
                w.o(kVar.h() % 8 == 0, "the number of bits (%s) in hashFunction (%s) must be divisible by 8", kVar.h(), kVar);
            }
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof b) {
                return Arrays.equals(this.f58558b, ((b) obj).f58558b);
            }
            return false;
        }

        @Override // com.google.common.hash.k
        public int h() {
            int iH = 0;
            for (k kVar : this.f58558b) {
                iH += kVar.h();
            }
            return iH;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f58558b);
        }

        @Override // com.google.common.hash.b
        HashCode m(m[] mVarArr) {
            byte[] bArr = new byte[h() / 8];
            int iN = 0;
            for (m mVar : mVarArr) {
                HashCode hashCodeN = mVar.n();
                iN += hashCodeN.n(bArr, iN, hashCodeN.d() / 8);
            }
            return HashCode.h(bArr);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f58476a;

        public c(long j10) {
            this.f58476a = j10;
        }

        public double a() {
            long j10 = (this.f58476a * 2862933555777941757L) + 1;
            this.f58476a = j10;
            return ((double) (((int) (j10 >>> 33)) + 1)) / 2.147483648E9d;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final k f58477a = new MessageDigestHashFunction("MD5", "Hashing.md5()");

        private d() {
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final k f58478a = new MessageDigestHashFunction("SHA-1", "Hashing.sha1()");

        private e() {
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final k f58479a = new MessageDigestHashFunction("SHA-256", "Hashing.sha256()");

        private f() {
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final k f58480a = new MessageDigestHashFunction("SHA-384", "Hashing.sha384()");

        private g() {
        }
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final k f58481a = new MessageDigestHashFunction("SHA-512", "Hashing.sha512()");

        private h() {
        }
    }

    private Hashing() {
    }

    @Deprecated
    public static k A(int i10) {
        return new Murmur3_32HashFunction(i10, false);
    }

    public static k B() {
        return Murmur3_32HashFunction.f58505e;
    }

    public static k C(int i10) {
        return new Murmur3_32HashFunction(i10, true);
    }

    @Deprecated
    public static k D() {
        return e.f58478a;
    }

    public static k E() {
        return f.f58479a;
    }

    public static k F() {
        return g.f58480a;
    }

    public static k G() {
        return h.f58481a;
    }

    public static k H() {
        return SipHashFunction.f58517f;
    }

    public static k I(long j10, long j11) {
        return new SipHashFunction(2, 4, j10, j11);
    }

    public static k a() {
        return ChecksumType.ADLER_32.hashFunction;
    }

    static int b(int i10) {
        w.e(i10 > 0, "Number of bits must be positive");
        return (i10 + 31) & (-32);
    }

    public static HashCode c(Iterable<HashCode> iterable) {
        Iterator<HashCode> it = iterable.iterator();
        w.e(it.hasNext(), "Must be at least 1 hash code to combine.");
        int iD = it.next().d() / 8;
        byte[] bArr = new byte[iD];
        Iterator<HashCode> it2 = iterable.iterator();
        while (it2.hasNext()) {
            byte[] bArrA = it2.next().a();
            w.e(bArrA.length == iD, "All hashcodes must have the same bit length.");
            for (int i10 = 0; i10 < bArrA.length; i10++) {
                bArr[i10] = (byte) ((bArr[i10] * 37) ^ bArrA[i10]);
            }
        }
        return HashCode.h(bArr);
    }

    public static HashCode d(Iterable<HashCode> iterable) {
        Iterator<HashCode> it = iterable.iterator();
        w.e(it.hasNext(), "Must be at least 1 hash code to combine.");
        int iD = it.next().d() / 8;
        byte[] bArr = new byte[iD];
        Iterator<HashCode> it2 = iterable.iterator();
        while (it2.hasNext()) {
            byte[] bArrA = it2.next().a();
            w.e(bArrA.length == iD, "All hashcodes must have the same bit length.");
            for (int i10 = 0; i10 < bArrA.length; i10++) {
                bArr[i10] = (byte) (bArr[i10] + bArrA[i10]);
            }
        }
        return HashCode.h(bArr);
    }

    public static k e(k kVar, k kVar2, k... kVarArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(kVar);
        arrayList.add(kVar2);
        Collections.addAll(arrayList, kVarArr);
        return new b((k[]) arrayList.toArray(new k[0]));
    }

    public static k f(Iterable<k> iterable) {
        w.E(iterable);
        ArrayList arrayList = new ArrayList();
        Iterator<k> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        w.k(!arrayList.isEmpty(), "number of hash functions (%s) must be > 0", arrayList.size());
        return new b((k[]) arrayList.toArray(new k[0]));
    }

    public static int g(long j10, int i10) {
        int i11 = 0;
        w.k(i10 > 0, "buckets must be positive: %s", i10);
        c cVar = new c(j10);
        while (true) {
            int iA = (int) (((double) (i11 + 1)) / cVar.a());
            if (iA < 0 || iA >= i10) {
                break;
            }
            i11 = iA;
        }
        return i11;
    }

    public static int h(HashCode hashCode, int i10) {
        return g(hashCode.m(), i10);
    }

    public static k i() {
        return ChecksumType.CRC_32.hashFunction;
    }

    public static k j() {
        return com.google.common.hash.g.f58566b;
    }

    public static k k() {
        return i.f58576b;
    }

    public static k l() {
        return j.f58580b;
    }

    public static k m(int i10) {
        int iB = b(i10);
        if (iB == 32) {
            return Murmur3_32HashFunction.f58506f;
        }
        if (iB <= 128) {
            return Murmur3_128HashFunction.f58496d;
        }
        int i11 = (iB + 127) / 128;
        k[] kVarArr = new k[i11];
        kVarArr[0] = Murmur3_128HashFunction.f58496d;
        int i12 = f58475a;
        for (int i13 = 1; i13 < i11; i13++) {
            i12 += 1500450271;
            kVarArr[i13] = y(i12);
        }
        return new b(kVarArr);
    }

    public static k n(Key key) {
        return new s("HmacMD5", key, v("hmacMd5", key));
    }

    public static k o(byte[] bArr) {
        return n(new SecretKeySpec((byte[]) w.E(bArr), "HmacMD5"));
    }

    public static k p(Key key) {
        return new s("HmacSHA1", key, v("hmacSha1", key));
    }

    public static k q(byte[] bArr) {
        return p(new SecretKeySpec((byte[]) w.E(bArr), "HmacSHA1"));
    }

    public static k r(Key key) {
        return new s("HmacSHA256", key, v("hmacSha256", key));
    }

    public static k s(byte[] bArr) {
        return r(new SecretKeySpec((byte[]) w.E(bArr), "HmacSHA256"));
    }

    public static k t(Key key) {
        return new s("HmacSHA512", key, v("hmacSha512", key));
    }

    public static k u(byte[] bArr) {
        return t(new SecretKeySpec((byte[]) w.E(bArr), "HmacSHA512"));
    }

    private static String v(String str, Key key) {
        return String.format("Hashing.%s(Key[algorithm=%s, format=%s])", str, key.getAlgorithm(), key.getFormat());
    }

    @Deprecated
    public static k w() {
        return d.f58477a;
    }

    public static k x() {
        return Murmur3_128HashFunction.f58495c;
    }

    public static k y(int i10) {
        return new Murmur3_128HashFunction(i10);
    }

    @Deprecated
    public static k z() {
        return Murmur3_32HashFunction.f58504d;
    }
}
