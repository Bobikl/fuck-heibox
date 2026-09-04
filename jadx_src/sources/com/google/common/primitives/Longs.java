package com.google.common.primitives;

import com.google.common.base.Converter;
import com.google.common.base.w;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@b
@o9.b
public final class Longs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f59055a = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f59056b = 4611686018427387904L;

    public enum LexicographicalComparator implements Comparator<long[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(long[] jArr, long[] jArr2) {
            int iMin = Math.min(jArr.length, jArr2.length);
            for (int i10 = 0; i10 < iMin; i10++) {
                int iD = Longs.d(jArr[i10], jArr2[i10]);
                if (iD != 0) {
                    return iD;
                }
            }
            return jArr.length - jArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Longs.lexicographicalComparator()";
        }
    }

    @o9.b
    public static class LongArrayAsList extends AbstractList<Long> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long[] f59057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f59058c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f59059d;

        LongArrayAsList(long[] jArr) {
            this(jArr, 0, jArr.length);
        }

        LongArrayAsList(long[] jArr, int i10, int i11) {
            this.f59057b = jArr;
            this.f59058c = i10;
            this.f59059d = i11;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long get(int i10) {
            w.C(i10, size());
            return Long.valueOf(this.f59057b[this.f59058c + i10]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long set(int i10, Long l10) {
            w.C(i10, size());
            long[] jArr = this.f59057b;
            int i11 = this.f59058c;
            long j10 = jArr[i11 + i10];
            jArr[i11 + i10] = ((Long) w.E(l10)).longValue();
            return Long.valueOf(j10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object obj) {
            return (obj instanceof Long) && Longs.m(this.f59057b, ((Long) obj).longValue(), this.f59058c, this.f59059d) != -1;
        }

        long[] e() {
            return Arrays.copyOfRange(this.f59057b, this.f59058c, this.f59059d);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LongArrayAsList)) {
                return super.equals(obj);
            }
            LongArrayAsList longArrayAsList = (LongArrayAsList) obj;
            int size = size();
            if (longArrayAsList.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f59057b[this.f59058c + i10] != longArrayAsList.f59057b[longArrayAsList.f59058c + i10]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iK = 1;
            for (int i10 = this.f59058c; i10 < this.f59059d; i10++) {
                iK = (iK * 31) + Longs.k(this.f59057b[i10]);
            }
            return iK;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object obj) {
            int iM;
            if (!(obj instanceof Long) || (iM = Longs.m(this.f59057b, ((Long) obj).longValue(), this.f59058c, this.f59059d)) < 0) {
                return -1;
            }
            return iM - this.f59058c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object obj) {
            int iQ;
            if (!(obj instanceof Long) || (iQ = Longs.q(this.f59057b, ((Long) obj).longValue(), this.f59058c, this.f59059d)) < 0) {
                return -1;
            }
            return iQ - this.f59058c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f59059d - this.f59058c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int i10, int i11) {
            w.f0(i10, i11, size());
            if (i10 == i11) {
                return Collections.emptyList();
            }
            long[] jArr = this.f59057b;
            int i12 = this.f59058c;
            return new LongArrayAsList(jArr, i10 + i12, i12 + i11);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 10);
            sb2.append('[');
            sb2.append(this.f59057b[this.f59058c]);
            int i10 = this.f59058c;
            while (true) {
                i10++;
                if (i10 >= this.f59059d) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append(this.f59057b[i10]);
            }
        }
    }

    public static final class LongConverter extends Converter<String, Long> implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final LongConverter f59060d = new LongConverter();
        private static final long serialVersionUID = 1;

        private LongConverter() {
        }

        private Object q() {
            return f59060d;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public String h(Long l10) {
            return l10.toString();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Long i(String str) {
            return Long.decode(str);
        }

        public String toString() {
            return "Longs.stringConverter()";
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final byte[] f59061a;

        static {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i10 = 0; i10 < 10; i10++) {
                bArr[i10 + 48] = (byte) i10;
            }
            for (int i11 = 0; i11 < 26; i11++) {
                byte b10 = (byte) (i11 + 10);
                bArr[i11 + 65] = b10;
                bArr[i11 + 97] = b10;
            }
            f59061a = bArr;
        }

        private a() {
        }

        static int a(char c10) {
            if (c10 < 128) {
                return f59061a[c10];
            }
            return -1;
        }
    }

    private Longs() {
    }

    public static byte[] A(long j10) {
        byte[] bArr = new byte[8];
        for (int i10 = 7; i10 >= 0; i10--) {
            bArr[i10] = (byte) (255 & j10);
            j10 >>= 8;
        }
        return bArr;
    }

    @o9.a
    @CheckForNull
    public static Long B(String str) {
        return C(str, 10);
    }

    @o9.a
    @CheckForNull
    public static Long C(String str, int i10) {
        if (((String) w.E(str)).isEmpty()) {
            return null;
        }
        if (i10 < 2 || i10 > 36) {
            StringBuilder sb2 = new StringBuilder(65);
            sb2.append("radix must be between MIN_RADIX and MAX_RADIX but was ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        int i11 = str.charAt(0) == '-' ? 1 : 0;
        if (i11 == str.length()) {
            return null;
        }
        int i12 = i11 + 1;
        int iA = a.a(str.charAt(i11));
        if (iA < 0 || iA >= i10) {
            return null;
        }
        long j10 = -iA;
        long j11 = i10;
        long j12 = Long.MIN_VALUE / j11;
        while (i12 < str.length()) {
            int i13 = i12 + 1;
            int iA2 = a.a(str.charAt(i12));
            if (iA2 < 0 || iA2 >= i10 || j10 < j12) {
                return null;
            }
            long j13 = j10 * j11;
            long j14 = iA2;
            if (j13 < j14 - Long.MIN_VALUE) {
                return null;
            }
            j10 = j13 - j14;
            i12 = i13;
        }
        if (i11 != 0) {
            return Long.valueOf(j10);
        }
        if (j10 == Long.MIN_VALUE) {
            return null;
        }
        return Long.valueOf(-j10);
    }

    public static List<Long> c(long... jArr) {
        return jArr.length == 0 ? Collections.emptyList() : new LongArrayAsList(jArr);
    }

    public static int d(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 > j11 ? 1 : 0;
    }

    public static long[] e(long[]... jArr) {
        int length = 0;
        for (long[] jArr2 : jArr) {
            length += jArr2.length;
        }
        long[] jArr3 = new long[length];
        int length2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, length2, jArr4.length);
            length2 += jArr4.length;
        }
        return jArr3;
    }

    @o9.a
    public static long f(long j10, long j11, long j12) {
        w.s(j11 <= j12, "min (%s) must be less than or equal to max (%s)", j11, j12);
        return Math.min(Math.max(j10, j11), j12);
    }

    public static boolean g(long[] jArr, long j10) {
        for (long j11 : jArr) {
            if (j11 == j10) {
                return true;
            }
        }
        return false;
    }

    public static long[] h(long[] jArr, int i10, int i11) {
        w.k(i10 >= 0, "Invalid minLength: %s", i10);
        w.k(i11 >= 0, "Invalid padding: %s", i11);
        return jArr.length < i10 ? Arrays.copyOf(jArr, i10 + i11) : jArr;
    }

    public static long i(byte[] bArr) {
        w.m(bArr.length >= 8, "array too small: %s < %s", bArr.length, 8);
        return j(bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5], bArr[6], bArr[7]);
    }

    public static long j(byte b10, byte b11, byte b12, byte b13, byte b14, byte b15, byte b16, byte b17) {
        return ((((long) b11) & 255) << 48) | ((((long) b10) & 255) << 56) | ((((long) b12) & 255) << 40) | ((((long) b13) & 255) << 32) | ((((long) b14) & 255) << 24) | ((((long) b15) & 255) << 16) | ((((long) b16) & 255) << 8) | (((long) b17) & 255);
    }

    public static int k(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static int l(long[] jArr, long j10) {
        return m(jArr, j10, 0, jArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(long[] jArr, long j10, int i10, int i11) {
        while (i10 < i11) {
            if (jArr[i10] == j10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int n(long[] jArr, long[] jArr2) {
        w.F(jArr, "array");
        w.F(jArr2, "target");
        if (jArr2.length == 0) {
            return 0;
        }
        for (int i10 = 0; i10 < (jArr.length - jArr2.length) + 1; i10++) {
            for (int i11 = 0; i11 < jArr2.length; i11++) {
                if (jArr[i10 + i11] != jArr2[i11]) {
                }
            }
            return i10;
        }
        return -1;
    }

    public static String o(String str, long... jArr) {
        w.E(str);
        if (jArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(jArr.length * 10);
        sb2.append(jArr[0]);
        for (int i10 = 1; i10 < jArr.length; i10++) {
            sb2.append(str);
            sb2.append(jArr[i10]);
        }
        return sb2.toString();
    }

    public static int p(long[] jArr, long j10) {
        return q(jArr, j10, 0, jArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int q(long[] jArr, long j10, int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            if (jArr[i12] == j10) {
                return i12;
            }
        }
        return -1;
    }

    public static Comparator<long[]> r() {
        return LexicographicalComparator.INSTANCE;
    }

    public static long s(long... jArr) {
        w.d(jArr.length > 0);
        long j10 = jArr[0];
        for (int i10 = 1; i10 < jArr.length; i10++) {
            long j11 = jArr[i10];
            if (j11 > j10) {
                j10 = j11;
            }
        }
        return j10;
    }

    public static long t(long... jArr) {
        w.d(jArr.length > 0);
        long j10 = jArr[0];
        for (int i10 = 1; i10 < jArr.length; i10++) {
            long j11 = jArr[i10];
            if (j11 < j10) {
                j10 = j11;
            }
        }
        return j10;
    }

    public static void u(long[] jArr) {
        w.E(jArr);
        v(jArr, 0, jArr.length);
    }

    public static void v(long[] jArr, int i10, int i11) {
        w.E(jArr);
        w.f0(i10, i11, jArr.length);
        for (int i12 = i11 - 1; i10 < i12; i12--) {
            long j10 = jArr[i10];
            jArr[i10] = jArr[i12];
            jArr[i12] = j10;
            i10++;
        }
    }

    public static void w(long[] jArr) {
        w.E(jArr);
        x(jArr, 0, jArr.length);
    }

    public static void x(long[] jArr, int i10, int i11) {
        w.E(jArr);
        w.f0(i10, i11, jArr.length);
        Arrays.sort(jArr, i10, i11);
        v(jArr, i10, i11);
    }

    @o9.a
    public static Converter<String, Long> y() {
        return LongConverter.f59060d;
    }

    public static long[] z(Collection<? extends Number> collection) {
        if (collection instanceof LongArrayAsList) {
            return ((LongArrayAsList) collection).e();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            jArr[i10] = ((Number) w.E(array[i10])).longValue();
        }
        return jArr;
    }
}
