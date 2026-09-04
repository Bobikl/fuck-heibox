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
import kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes7.dex */
@b
@o9.b(emulated = true)
public final class Shorts extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f59062a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final short f59063b = 16384;

    public enum LexicographicalComparator implements Comparator<short[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(short[] sArr, short[] sArr2) {
            int iMin = Math.min(sArr.length, sArr2.length);
            for (int i10 = 0; i10 < iMin; i10++) {
                int iE = Shorts.e(sArr[i10], sArr2[i10]);
                if (iE != 0) {
                    return iE;
                }
            }
            return sArr.length - sArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Shorts.lexicographicalComparator()";
        }
    }

    @o9.b
    public static class ShortArrayAsList extends AbstractList<Short> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final short[] f59064b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f59065c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f59066d;

        ShortArrayAsList(short[] sArr) {
            this(sArr, 0, sArr.length);
        }

        ShortArrayAsList(short[] sArr, int i10, int i11) {
            this.f59064b = sArr;
            this.f59065c = i10;
            this.f59066d = i11;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Short get(int i10) {
            w.C(i10, size());
            return Short.valueOf(this.f59064b[this.f59065c + i10]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Short set(int i10, Short sh2) {
            w.C(i10, size());
            short[] sArr = this.f59064b;
            int i11 = this.f59065c;
            short s10 = sArr[i11 + i10];
            sArr[i11 + i10] = ((Short) w.E(sh2)).shortValue();
            return Short.valueOf(s10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object obj) {
            return (obj instanceof Short) && Shorts.n(this.f59064b, ((Short) obj).shortValue(), this.f59065c, this.f59066d) != -1;
        }

        short[] e() {
            return Arrays.copyOfRange(this.f59064b, this.f59065c, this.f59066d);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShortArrayAsList)) {
                return super.equals(obj);
            }
            ShortArrayAsList shortArrayAsList = (ShortArrayAsList) obj;
            int size = size();
            if (shortArrayAsList.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f59064b[this.f59065c + i10] != shortArrayAsList.f59064b[shortArrayAsList.f59065c + i10]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iL = 1;
            for (int i10 = this.f59065c; i10 < this.f59066d; i10++) {
                iL = (iL * 31) + Shorts.l(this.f59064b[i10]);
            }
            return iL;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object obj) {
            int iN;
            if (!(obj instanceof Short) || (iN = Shorts.n(this.f59064b, ((Short) obj).shortValue(), this.f59065c, this.f59066d)) < 0) {
                return -1;
            }
            return iN - this.f59065c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object obj) {
            int iR;
            if (!(obj instanceof Short) || (iR = Shorts.r(this.f59064b, ((Short) obj).shortValue(), this.f59065c, this.f59066d)) < 0) {
                return -1;
            }
            return iR - this.f59065c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f59066d - this.f59065c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Short> subList(int i10, int i11) {
            w.f0(i10, i11, size());
            if (i10 == i11) {
                return Collections.emptyList();
            }
            short[] sArr = this.f59064b;
            int i12 = this.f59065c;
            return new ShortArrayAsList(sArr, i10 + i12, i12 + i11);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 6);
            sb2.append('[');
            sb2.append((int) this.f59064b[this.f59065c]);
            int i10 = this.f59065c;
            while (true) {
                i10++;
                if (i10 >= this.f59066d) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append((int) this.f59064b[i10]);
            }
        }
    }

    public static final class ShortConverter extends Converter<String, Short> implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final ShortConverter f59067d = new ShortConverter();
        private static final long serialVersionUID = 1;

        private ShortConverter() {
        }

        private Object q() {
            return f59067d;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public String h(Short sh2) {
            return sh2.toString();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Short i(String str) {
            return Short.decode(str);
        }

        public String toString() {
            return "Shorts.stringConverter()";
        }
    }

    private Shorts() {
    }

    @o9.a
    public static Converter<String, Short> A() {
        return ShortConverter.f59067d;
    }

    public static short[] B(Collection<? extends Number> collection) {
        if (collection instanceof ShortArrayAsList) {
            return ((ShortArrayAsList) collection).e();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        short[] sArr = new short[length];
        for (int i10 = 0; i10 < length; i10++) {
            sArr[i10] = ((Number) w.E(array[i10])).shortValue();
        }
        return sArr;
    }

    @o9.c
    public static byte[] C(short s10) {
        return new byte[]{(byte) (s10 >> 8), (byte) s10};
    }

    public static List<Short> c(short... sArr) {
        return sArr.length == 0 ? Collections.emptyList() : new ShortArrayAsList(sArr);
    }

    public static short d(long j10) {
        short s10 = (short) j10;
        w.p(((long) s10) == j10, "Out of range: %s", j10);
        return s10;
    }

    public static int e(short s10, short s11) {
        return s10 - s11;
    }

    public static short[] f(short[]... sArr) {
        int length = 0;
        for (short[] sArr2 : sArr) {
            length += sArr2.length;
        }
        short[] sArr3 = new short[length];
        int length2 = 0;
        for (short[] sArr4 : sArr) {
            System.arraycopy(sArr4, 0, sArr3, length2, sArr4.length);
            length2 += sArr4.length;
        }
        return sArr3;
    }

    @o9.a
    public static short g(short s10, short s11, short s12) {
        w.m(s11 <= s12, "min (%s) must be less than or equal to max (%s)", s11, s12);
        if (s10 < s11) {
            return s11;
        }
        return s10 < s12 ? s10 : s12;
    }

    public static boolean h(short[] sArr, short s10) {
        for (short s11 : sArr) {
            if (s11 == s10) {
                return true;
            }
        }
        return false;
    }

    public static short[] i(short[] sArr, int i10, int i11) {
        w.k(i10 >= 0, "Invalid minLength: %s", i10);
        w.k(i11 >= 0, "Invalid padding: %s", i11);
        return sArr.length < i10 ? Arrays.copyOf(sArr, i10 + i11) : sArr;
    }

    @o9.c
    public static short j(byte[] bArr) {
        w.m(bArr.length >= 2, "array too small: %s < %s", bArr.length, 2);
        return k(bArr[0], bArr[1]);
    }

    @o9.c
    public static short k(byte b10, byte b11) {
        return (short) ((b10 << 8) | (b11 & 255));
    }

    public static int l(short s10) {
        return s10;
    }

    public static int m(short[] sArr, short s10) {
        return n(sArr, s10, 0, sArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int n(short[] sArr, short s10, int i10, int i11) {
        while (i10 < i11) {
            if (sArr[i10] == s10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int o(short[] sArr, short[] sArr2) {
        w.F(sArr, "array");
        w.F(sArr2, "target");
        if (sArr2.length == 0) {
            return 0;
        }
        for (int i10 = 0; i10 < (sArr.length - sArr2.length) + 1; i10++) {
            for (int i11 = 0; i11 < sArr2.length; i11++) {
                if (sArr[i10 + i11] != sArr2[i11]) {
                }
            }
            return i10;
        }
        return -1;
    }

    public static String p(String str, short... sArr) {
        w.E(str);
        if (sArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(sArr.length * 6);
        sb2.append((int) sArr[0]);
        for (int i10 = 1; i10 < sArr.length; i10++) {
            sb2.append(str);
            sb2.append((int) sArr[i10]);
        }
        return sb2.toString();
    }

    public static int q(short[] sArr, short s10) {
        return r(sArr, s10, 0, sArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int r(short[] sArr, short s10, int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            if (sArr[i12] == s10) {
                return i12;
            }
        }
        return -1;
    }

    public static Comparator<short[]> s() {
        return LexicographicalComparator.INSTANCE;
    }

    @o9.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static short t(short... sArr) {
        w.d(sArr.length > 0);
        short s10 = sArr[0];
        for (int i10 = 1; i10 < sArr.length; i10++) {
            short s11 = sArr[i10];
            if (s11 > s10) {
                s10 = s11;
            }
        }
        return s10;
    }

    @o9.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static short u(short... sArr) {
        w.d(sArr.length > 0);
        short s10 = sArr[0];
        for (int i10 = 1; i10 < sArr.length; i10++) {
            short s11 = sArr[i10];
            if (s11 < s10) {
                s10 = s11;
            }
        }
        return s10;
    }

    public static void v(short[] sArr) {
        w.E(sArr);
        w(sArr, 0, sArr.length);
    }

    public static void w(short[] sArr, int i10, int i11) {
        w.E(sArr);
        w.f0(i10, i11, sArr.length);
        for (int i12 = i11 - 1; i10 < i12; i12--) {
            short s10 = sArr[i10];
            sArr[i10] = sArr[i12];
            sArr[i12] = s10;
            i10++;
        }
    }

    public static short x(long j10) {
        if (j10 > 32767) {
            return r0.f124964c;
        }
        return j10 < -32768 ? r0.f124963b : (short) j10;
    }

    public static void y(short[] sArr) {
        w.E(sArr);
        z(sArr, 0, sArr.length);
    }

    public static void z(short[] sArr, int i10, int i11) {
        w.E(sArr);
        w.f0(i10, i11, sArr.length);
        Arrays.sort(sArr, i10, i11);
        w(sArr, i10, i11);
    }
}
