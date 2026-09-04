package com.google.common.primitives;

import com.google.common.base.Converter;
import com.google.common.base.b0;
import com.google.common.base.w;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.regex.Pattern;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@b
@o9.b(emulated = true)
public final class Doubles extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f59017a = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @o9.c
    static final Pattern f59018b = i();

    @o9.b
    public static class DoubleArrayAsList extends AbstractList<Double> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final double[] f59019b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f59020c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f59021d;

        DoubleArrayAsList(double[] dArr) {
            this(dArr, 0, dArr.length);
        }

        DoubleArrayAsList(double[] dArr, int i10, int i11) {
            this.f59019b = dArr;
            this.f59020c = i10;
            this.f59021d = i11;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Double get(int i10) {
            w.C(i10, size());
            return Double.valueOf(this.f59019b[this.f59020c + i10]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Double set(int i10, Double d10) {
            w.C(i10, size());
            double[] dArr = this.f59019b;
            int i11 = this.f59020c;
            double d11 = dArr[i11 + i10];
            dArr[i11 + i10] = ((Double) w.E(d10)).doubleValue();
            return Double.valueOf(d11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object obj) {
            return (obj instanceof Double) && Doubles.l(this.f59019b, ((Double) obj).doubleValue(), this.f59020c, this.f59021d) != -1;
        }

        double[] e() {
            return Arrays.copyOfRange(this.f59019b, this.f59020c, this.f59021d);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DoubleArrayAsList)) {
                return super.equals(obj);
            }
            DoubleArrayAsList doubleArrayAsList = (DoubleArrayAsList) obj;
            int size = size();
            if (doubleArrayAsList.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f59019b[this.f59020c + i10] != doubleArrayAsList.f59019b[doubleArrayAsList.f59020c + i10]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iJ = 1;
            for (int i10 = this.f59020c; i10 < this.f59021d; i10++) {
                iJ = (iJ * 31) + Doubles.j(this.f59019b[i10]);
            }
            return iJ;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object obj) {
            int iL;
            if (!(obj instanceof Double) || (iL = Doubles.l(this.f59019b, ((Double) obj).doubleValue(), this.f59020c, this.f59021d)) < 0) {
                return -1;
            }
            return iL - this.f59020c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object obj) {
            int iQ;
            if (!(obj instanceof Double) || (iQ = Doubles.q(this.f59019b, ((Double) obj).doubleValue(), this.f59020c, this.f59021d)) < 0) {
                return -1;
            }
            return iQ - this.f59020c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f59021d - this.f59020c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Double> subList(int i10, int i11) {
            w.f0(i10, i11, size());
            if (i10 == i11) {
                return Collections.emptyList();
            }
            double[] dArr = this.f59019b;
            int i12 = this.f59020c;
            return new DoubleArrayAsList(dArr, i10 + i12, i12 + i11);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 12);
            sb2.append('[');
            sb2.append(this.f59019b[this.f59020c]);
            int i10 = this.f59020c;
            while (true) {
                i10++;
                if (i10 >= this.f59021d) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append(this.f59019b[i10]);
            }
        }
    }

    public static final class DoubleConverter extends Converter<String, Double> implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final DoubleConverter f59022d = new DoubleConverter();
        private static final long serialVersionUID = 1;

        private DoubleConverter() {
        }

        private Object q() {
            return f59022d;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public String h(Double d10) {
            return d10.toString();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Double i(String str) {
            return Double.valueOf(str);
        }

        public String toString() {
            return "Doubles.stringConverter()";
        }
    }

    public enum LexicographicalComparator implements Comparator<double[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(double[] dArr, double[] dArr2) {
            int iMin = Math.min(dArr.length, dArr2.length);
            for (int i10 = 0; i10 < iMin; i10++) {
                int iCompare = Double.compare(dArr[i10], dArr2[i10]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return dArr.length - dArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Doubles.lexicographicalComparator()";
        }
    }

    private Doubles() {
    }

    @o9.a
    @CheckForNull
    @o9.c
    public static Double A(String str) {
        if (!f59018b.matcher(str).matches()) {
            return null;
        }
        try {
            return Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static List<Double> c(double... dArr) {
        return dArr.length == 0 ? Collections.emptyList() : new DoubleArrayAsList(dArr);
    }

    public static int d(double d10, double d11) {
        return Double.compare(d10, d11);
    }

    public static double[] e(double[]... dArr) {
        int length = 0;
        for (double[] dArr2 : dArr) {
            length += dArr2.length;
        }
        double[] dArr3 = new double[length];
        int length2 = 0;
        for (double[] dArr4 : dArr) {
            System.arraycopy(dArr4, 0, dArr3, length2, dArr4.length);
            length2 += dArr4.length;
        }
        return dArr3;
    }

    @o9.a
    public static double f(double d10, double d11, double d12) {
        if (d11 <= d12) {
            return Math.min(Math.max(d10, d11), d12);
        }
        throw new IllegalArgumentException(b0.e("min (%s) must be less than or equal to max (%s)", Double.valueOf(d11), Double.valueOf(d12)));
    }

    public static boolean g(double[] dArr, double d10) {
        for (double d11 : dArr) {
            if (d11 == d10) {
                return true;
            }
        }
        return false;
    }

    public static double[] h(double[] dArr, int i10, int i11) {
        w.k(i10 >= 0, "Invalid minLength: %s", i10);
        w.k(i11 >= 0, "Invalid padding: %s", i11);
        return dArr.length < i10 ? Arrays.copyOf(dArr, i10 + i11) : dArr;
    }

    @o9.c
    private static Pattern i() {
        String strConcat = "(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)".concat("(?:[eE][+-]?\\d+#)?[fFdD]?");
        StringBuilder sb2 = new StringBuilder("(?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)".length() + 25);
        sb2.append("0[xX]");
        sb2.append("(?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)");
        sb2.append("[pP][+-]?\\d+#[fFdD]?");
        String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder(String.valueOf(strConcat).length() + 23 + String.valueOf(string).length());
        sb3.append("[+-]?(?:NaN|Infinity|");
        sb3.append(strConcat);
        sb3.append("|");
        sb3.append(string);
        sb3.append(")");
        return Pattern.compile(sb3.toString().replace("#", "+"));
    }

    public static int j(double d10) {
        return Double.valueOf(d10).hashCode();
    }

    public static int k(double[] dArr, double d10) {
        return l(dArr, d10, 0, dArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(double[] dArr, double d10, int i10, int i11) {
        while (i10 < i11) {
            if (dArr[i10] == d10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int m(double[] dArr, double[] dArr2) {
        w.F(dArr, "array");
        w.F(dArr2, "target");
        if (dArr2.length == 0) {
            return 0;
        }
        for (int i10 = 0; i10 < (dArr.length - dArr2.length) + 1; i10++) {
            for (int i11 = 0; i11 < dArr2.length; i11++) {
                if (dArr[i10 + i11] != dArr2[i11]) {
                }
            }
            return i10;
        }
        return -1;
    }

    public static boolean n(double d10) {
        return Double.NEGATIVE_INFINITY < d10 && d10 < Double.POSITIVE_INFINITY;
    }

    public static String o(String str, double... dArr) {
        w.E(str);
        if (dArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(dArr.length * 12);
        sb2.append(dArr[0]);
        for (int i10 = 1; i10 < dArr.length; i10++) {
            sb2.append(str);
            sb2.append(dArr[i10]);
        }
        return sb2.toString();
    }

    public static int p(double[] dArr, double d10) {
        return q(dArr, d10, 0, dArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int q(double[] dArr, double d10, int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            if (dArr[i12] == d10) {
                return i12;
            }
        }
        return -1;
    }

    public static Comparator<double[]> r() {
        return LexicographicalComparator.INSTANCE;
    }

    @o9.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static double s(double... dArr) {
        w.d(dArr.length > 0);
        double dMax = dArr[0];
        for (int i10 = 1; i10 < dArr.length; i10++) {
            dMax = Math.max(dMax, dArr[i10]);
        }
        return dMax;
    }

    @o9.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static double t(double... dArr) {
        w.d(dArr.length > 0);
        double dMin = dArr[0];
        for (int i10 = 1; i10 < dArr.length; i10++) {
            dMin = Math.min(dMin, dArr[i10]);
        }
        return dMin;
    }

    public static void u(double[] dArr) {
        w.E(dArr);
        v(dArr, 0, dArr.length);
    }

    public static void v(double[] dArr, int i10, int i11) {
        w.E(dArr);
        w.f0(i10, i11, dArr.length);
        for (int i12 = i11 - 1; i10 < i12; i12--) {
            double d10 = dArr[i10];
            dArr[i10] = dArr[i12];
            dArr[i12] = d10;
            i10++;
        }
    }

    public static void w(double[] dArr) {
        w.E(dArr);
        x(dArr, 0, dArr.length);
    }

    public static void x(double[] dArr, int i10, int i11) {
        w.E(dArr);
        w.f0(i10, i11, dArr.length);
        Arrays.sort(dArr, i10, i11);
        v(dArr, i10, i11);
    }

    @o9.a
    public static Converter<String, Double> y() {
        return DoubleConverter.f59022d;
    }

    public static double[] z(Collection<? extends Number> collection) {
        if (collection instanceof DoubleArrayAsList) {
            return ((DoubleArrayAsList) collection).e();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        double[] dArr = new double[length];
        for (int i10 = 0; i10 < length; i10++) {
            dArr[i10] = ((Number) w.E(array[i10])).doubleValue();
        }
        return dArr;
    }
}
