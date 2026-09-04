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
@o9.b(emulated = true)
public final class Ints extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f59049a = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f59050b = 1073741824;

    @o9.b
    public static class IntArrayAsList extends AbstractList<Integer> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int[] f59051b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f59052c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f59053d;

        IntArrayAsList(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        IntArrayAsList(int[] iArr, int i10, int i11) {
            this.f59051b = iArr;
            this.f59052c = i10;
            this.f59053d = i11;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(int i10) {
            w.C(i10, size());
            return Integer.valueOf(this.f59051b[this.f59052c + i10]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer set(int i10, Integer num) {
            w.C(i10, size());
            int[] iArr = this.f59051b;
            int i11 = this.f59052c;
            int i12 = iArr[i11 + i10];
            iArr[i11 + i10] = ((Integer) w.E(num)).intValue();
            return Integer.valueOf(i12);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object obj) {
            return (obj instanceof Integer) && Ints.n(this.f59051b, ((Integer) obj).intValue(), this.f59052c, this.f59053d) != -1;
        }

        int[] e() {
            return Arrays.copyOfRange(this.f59051b, this.f59052c, this.f59053d);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IntArrayAsList)) {
                return super.equals(obj);
            }
            IntArrayAsList intArrayAsList = (IntArrayAsList) obj;
            int size = size();
            if (intArrayAsList.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f59051b[this.f59052c + i10] != intArrayAsList.f59051b[intArrayAsList.f59052c + i10]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iL = 1;
            for (int i10 = this.f59052c; i10 < this.f59053d; i10++) {
                iL = (iL * 31) + Ints.l(this.f59051b[i10]);
            }
            return iL;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object obj) {
            int iN;
            if (!(obj instanceof Integer) || (iN = Ints.n(this.f59051b, ((Integer) obj).intValue(), this.f59052c, this.f59053d)) < 0) {
                return -1;
            }
            return iN - this.f59052c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object obj) {
            int iR;
            if (!(obj instanceof Integer) || (iR = Ints.r(this.f59051b, ((Integer) obj).intValue(), this.f59052c, this.f59053d)) < 0) {
                return -1;
            }
            return iR - this.f59052c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f59053d - this.f59052c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i10, int i11) {
            w.f0(i10, i11, size());
            if (i10 == i11) {
                return Collections.emptyList();
            }
            int[] iArr = this.f59051b;
            int i12 = this.f59052c;
            return new IntArrayAsList(iArr, i10 + i12, i12 + i11);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append('[');
            sb2.append(this.f59051b[this.f59052c]);
            int i10 = this.f59052c;
            while (true) {
                i10++;
                if (i10 >= this.f59053d) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append(this.f59051b[i10]);
            }
        }
    }

    public static final class IntConverter extends Converter<String, Integer> implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final IntConverter f59054d = new IntConverter();
        private static final long serialVersionUID = 1;

        private IntConverter() {
        }

        private Object q() {
            return f59054d;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public String h(Integer num) {
            return num.toString();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Integer i(String str) {
            return Integer.decode(str);
        }

        public String toString() {
            return "Ints.stringConverter()";
        }
    }

    public enum LexicographicalComparator implements Comparator<int[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(int[] iArr, int[] iArr2) {
            int iMin = Math.min(iArr.length, iArr2.length);
            for (int i10 = 0; i10 < iMin; i10++) {
                int iE = Ints.e(iArr[i10], iArr2[i10]);
                if (iE != 0) {
                    return iE;
                }
            }
            return iArr.length - iArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Ints.lexicographicalComparator()";
        }
    }

    private Ints() {
    }

    @o9.a
    public static Converter<String, Integer> A() {
        return IntConverter.f59054d;
    }

    public static int[] B(Collection<? extends Number> collection) {
        if (collection instanceof IntArrayAsList) {
            return ((IntArrayAsList) collection).e();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = ((Number) w.E(array[i10])).intValue();
        }
        return iArr;
    }

    public static byte[] C(int i10) {
        return new byte[]{(byte) (i10 >> 24), (byte) (i10 >> 16), (byte) (i10 >> 8), (byte) i10};
    }

    @o9.a
    @CheckForNull
    public static Integer D(String str) {
        return E(str, 10);
    }

    @o9.a
    @CheckForNull
    public static Integer E(String str, int i10) {
        Long lC = Longs.C(str, i10);
        if (lC == null || lC.longValue() != lC.intValue()) {
            return null;
        }
        return Integer.valueOf(lC.intValue());
    }

    public static List<Integer> c(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new IntArrayAsList(iArr);
    }

    public static int d(long j10) {
        int i10 = (int) j10;
        w.p(((long) i10) == j10, "Out of range: %s", j10);
        return i10;
    }

    public static int e(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }

    public static int[] f(int[]... iArr) {
        int length = 0;
        for (int[] iArr2 : iArr) {
            length += iArr2.length;
        }
        int[] iArr3 = new int[length];
        int length2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, length2, iArr4.length);
            length2 += iArr4.length;
        }
        return iArr3;
    }

    @o9.a
    public static int g(int i10, int i11, int i12) {
        w.m(i11 <= i12, "min (%s) must be less than or equal to max (%s)", i11, i12);
        return Math.min(Math.max(i10, i11), i12);
    }

    public static boolean h(int[] iArr, int i10) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static int[] i(int[] iArr, int i10, int i11) {
        w.k(i10 >= 0, "Invalid minLength: %s", i10);
        w.k(i11 >= 0, "Invalid padding: %s", i11);
        return iArr.length < i10 ? Arrays.copyOf(iArr, i10 + i11) : iArr;
    }

    public static int j(byte[] bArr) {
        w.m(bArr.length >= 4, "array too small: %s < %s", bArr.length, 4);
        return k(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int k(byte b10, byte b11, byte b12, byte b13) {
        return (b10 << com.google.common.base.a.B) | ((b11 & 255) << 16) | ((b12 & 255) << 8) | (b13 & 255);
    }

    public static int l(int i10) {
        return i10;
    }

    public static int m(int[] iArr, int i10) {
        return n(iArr, i10, 0, iArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int n(int[] iArr, int i10, int i11, int i12) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static int o(int[] iArr, int[] iArr2) {
        w.F(iArr, "array");
        w.F(iArr2, "target");
        if (iArr2.length == 0) {
            return 0;
        }
        for (int i10 = 0; i10 < (iArr.length - iArr2.length) + 1; i10++) {
            for (int i11 = 0; i11 < iArr2.length; i11++) {
                if (iArr[i10 + i11] != iArr2[i11]) {
                }
            }
            return i10;
        }
        return -1;
    }

    public static String p(String str, int... iArr) {
        w.E(str);
        if (iArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(iArr.length * 5);
        sb2.append(iArr[0]);
        for (int i10 = 1; i10 < iArr.length; i10++) {
            sb2.append(str);
            sb2.append(iArr[i10]);
        }
        return sb2.toString();
    }

    public static int q(int[] iArr, int i10) {
        return r(iArr, i10, 0, iArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int r(int[] iArr, int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            if (iArr[i13] == i10) {
                return i13;
            }
        }
        return -1;
    }

    public static Comparator<int[]> s() {
        return LexicographicalComparator.INSTANCE;
    }

    @o9.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static int t(int... iArr) {
        w.d(iArr.length > 0);
        int i10 = iArr[0];
        for (int i11 = 1; i11 < iArr.length; i11++) {
            int i12 = iArr[i11];
            if (i12 > i10) {
                i10 = i12;
            }
        }
        return i10;
    }

    @o9.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static int u(int... iArr) {
        w.d(iArr.length > 0);
        int i10 = iArr[0];
        for (int i11 = 1; i11 < iArr.length; i11++) {
            int i12 = iArr[i11];
            if (i12 < i10) {
                i10 = i12;
            }
        }
        return i10;
    }

    public static void v(int[] iArr) {
        w.E(iArr);
        w(iArr, 0, iArr.length);
    }

    public static void w(int[] iArr, int i10, int i11) {
        w.E(iArr);
        w.f0(i10, i11, iArr.length);
        for (int i12 = i11 - 1; i10 < i12; i12--) {
            int i13 = iArr[i10];
            iArr[i10] = iArr[i12];
            iArr[i12] = i13;
            i10++;
        }
    }

    public static int x(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public static void y(int[] iArr) {
        w.E(iArr);
        z(iArr, 0, iArr.length);
    }

    public static void z(int[] iArr, int i10, int i11) {
        w.E(iArr);
        w.f0(i10, i11, iArr.length);
        Arrays.sort(iArr, i10, i11);
        w(iArr, i10, i11);
    }
}
