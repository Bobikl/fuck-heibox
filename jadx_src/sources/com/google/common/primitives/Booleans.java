package com.google.common.primitives;

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
public final class Booleans {

    @o9.b
    public static class BooleanArrayAsList extends AbstractList<Boolean> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean[] f59007b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f59008c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f59009d;

        BooleanArrayAsList(boolean[] zArr) {
            this(zArr, 0, zArr.length);
        }

        BooleanArrayAsList(boolean[] zArr, int i10, int i11) {
            this.f59007b = zArr;
            this.f59008c = i10;
            this.f59009d = i11;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean get(int i10) {
            w.C(i10, size());
            return Boolean.valueOf(this.f59007b[this.f59008c + i10]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean set(int i10, Boolean bool) {
            w.C(i10, size());
            boolean[] zArr = this.f59007b;
            int i11 = this.f59008c;
            boolean z10 = zArr[i11 + i10];
            zArr[i11 + i10] = ((Boolean) w.E(bool)).booleanValue();
            return Boolean.valueOf(z10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object obj) {
            return (obj instanceof Boolean) && Booleans.l(this.f59007b, ((Boolean) obj).booleanValue(), this.f59008c, this.f59009d) != -1;
        }

        boolean[] e() {
            return Arrays.copyOfRange(this.f59007b, this.f59008c, this.f59009d);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BooleanArrayAsList)) {
                return super.equals(obj);
            }
            BooleanArrayAsList booleanArrayAsList = (BooleanArrayAsList) obj;
            int size = size();
            if (booleanArrayAsList.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f59007b[this.f59008c + i10] != booleanArrayAsList.f59007b[booleanArrayAsList.f59008c + i10]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iJ = 1;
            for (int i10 = this.f59008c; i10 < this.f59009d; i10++) {
                iJ = (iJ * 31) + Booleans.j(this.f59007b[i10]);
            }
            return iJ;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object obj) {
            int iL;
            if (!(obj instanceof Boolean) || (iL = Booleans.l(this.f59007b, ((Boolean) obj).booleanValue(), this.f59008c, this.f59009d)) < 0) {
                return -1;
            }
            return iL - this.f59008c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object obj) {
            int iP;
            if (!(obj instanceof Boolean) || (iP = Booleans.p(this.f59007b, ((Boolean) obj).booleanValue(), this.f59008c, this.f59009d)) < 0) {
                return -1;
            }
            return iP - this.f59008c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f59009d - this.f59008c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Boolean> subList(int i10, int i11) {
            w.f0(i10, i11, size());
            if (i10 == i11) {
                return Collections.emptyList();
            }
            boolean[] zArr = this.f59007b;
            int i12 = this.f59008c;
            return new BooleanArrayAsList(zArr, i10 + i12, i12 + i11);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 7);
            sb2.append(this.f59007b[this.f59008c] ? "[true" : "[false");
            int i10 = this.f59008c;
            while (true) {
                i10++;
                if (i10 >= this.f59009d) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(this.f59007b[i10] ? ", true" : ", false");
            }
        }
    }

    public enum BooleanComparator implements Comparator<Boolean> {
        TRUE_FIRST(1, "Booleans.trueFirst()"),
        FALSE_FIRST(-1, "Booleans.falseFirst()");

        private final String toString;
        private final int trueValue;

        BooleanComparator(int i10, String str) {
            this.trueValue = i10;
            this.toString = str;
        }

        @Override // java.util.Comparator
        public int compare(Boolean bool, Boolean bool2) {
            return (bool2.booleanValue() ? this.trueValue : 0) - (bool.booleanValue() ? this.trueValue : 0);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.toString;
        }
    }

    public enum LexicographicalComparator implements Comparator<boolean[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(boolean[] zArr, boolean[] zArr2) {
            int iMin = Math.min(zArr.length, zArr2.length);
            for (int i10 = 0; i10 < iMin; i10++) {
                int iD = Booleans.d(zArr[i10], zArr2[i10]);
                if (iD != 0) {
                    return iD;
                }
            }
            return zArr.length - zArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Booleans.lexicographicalComparator()";
        }
    }

    private Booleans() {
    }

    public static List<Boolean> c(boolean... zArr) {
        return zArr.length == 0 ? Collections.emptyList() : new BooleanArrayAsList(zArr);
    }

    public static int d(boolean z10, boolean z11) {
        if (z10 == z11) {
            return 0;
        }
        return z10 ? 1 : -1;
    }

    public static boolean[] e(boolean[]... zArr) {
        int length = 0;
        for (boolean[] zArr2 : zArr) {
            length += zArr2.length;
        }
        boolean[] zArr3 = new boolean[length];
        int length2 = 0;
        for (boolean[] zArr4 : zArr) {
            System.arraycopy(zArr4, 0, zArr3, length2, zArr4.length);
            length2 += zArr4.length;
        }
        return zArr3;
    }

    public static boolean f(boolean[] zArr, boolean z10) {
        for (boolean z11 : zArr) {
            if (z11 == z10) {
                return true;
            }
        }
        return false;
    }

    @o9.a
    public static int g(boolean... zArr) {
        int i10 = 0;
        for (boolean z10 : zArr) {
            if (z10) {
                i10++;
            }
        }
        return i10;
    }

    public static boolean[] h(boolean[] zArr, int i10, int i11) {
        w.k(i10 >= 0, "Invalid minLength: %s", i10);
        w.k(i11 >= 0, "Invalid padding: %s", i11);
        return zArr.length < i10 ? Arrays.copyOf(zArr, i10 + i11) : zArr;
    }

    @o9.a
    public static Comparator<Boolean> i() {
        return BooleanComparator.FALSE_FIRST;
    }

    public static int j(boolean z10) {
        if (z10) {
            return 1231;
        }
        return bb.c.b.Pk;
    }

    public static int k(boolean[] zArr, boolean z10) {
        return l(zArr, z10, 0, zArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(boolean[] zArr, boolean z10, int i10, int i11) {
        while (i10 < i11) {
            if (zArr[i10] == z10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int m(boolean[] zArr, boolean[] zArr2) {
        w.F(zArr, "array");
        w.F(zArr2, "target");
        if (zArr2.length == 0) {
            return 0;
        }
        for (int i10 = 0; i10 < (zArr.length - zArr2.length) + 1; i10++) {
            for (int i11 = 0; i11 < zArr2.length; i11++) {
                if (zArr[i10 + i11] != zArr2[i11]) {
                }
            }
            return i10;
        }
        return -1;
    }

    public static String n(String str, boolean... zArr) {
        w.E(str);
        if (zArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(zArr.length * 7);
        sb2.append(zArr[0]);
        for (int i10 = 1; i10 < zArr.length; i10++) {
            sb2.append(str);
            sb2.append(zArr[i10]);
        }
        return sb2.toString();
    }

    public static int o(boolean[] zArr, boolean z10) {
        return p(zArr, z10, 0, zArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int p(boolean[] zArr, boolean z10, int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            if (zArr[i12] == z10) {
                return i12;
            }
        }
        return -1;
    }

    public static Comparator<boolean[]> q() {
        return LexicographicalComparator.INSTANCE;
    }

    public static void r(boolean[] zArr) {
        w.E(zArr);
        s(zArr, 0, zArr.length);
    }

    public static void s(boolean[] zArr, int i10, int i11) {
        w.E(zArr);
        w.f0(i10, i11, zArr.length);
        for (int i12 = i11 - 1; i10 < i12; i12--) {
            boolean z10 = zArr[i10];
            zArr[i10] = zArr[i12];
            zArr[i12] = z10;
            i10++;
        }
    }

    public static boolean[] t(Collection<Boolean> collection) {
        if (collection instanceof BooleanArrayAsList) {
            return ((BooleanArrayAsList) collection).e();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            zArr[i10] = ((Boolean) w.E(array[i10])).booleanValue();
        }
        return zArr;
    }

    @o9.a
    public static Comparator<Boolean> u() {
        return BooleanComparator.TRUE_FIRST;
    }
}
