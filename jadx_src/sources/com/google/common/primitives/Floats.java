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
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@b
@o9.b(emulated = true)
public final class Floats extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f59023a = 4;

    @o9.b
    public static class FloatArrayAsList extends AbstractList<Float> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float[] f59024b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f59025c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f59026d;

        FloatArrayAsList(float[] fArr) {
            this(fArr, 0, fArr.length);
        }

        FloatArrayAsList(float[] fArr, int i10, int i11) {
            this.f59024b = fArr;
            this.f59025c = i10;
            this.f59026d = i11;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(int i10) {
            w.C(i10, size());
            return Float.valueOf(this.f59024b[this.f59025c + i10]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Float set(int i10, Float f10) {
            w.C(i10, size());
            float[] fArr = this.f59024b;
            int i11 = this.f59025c;
            float f11 = fArr[i11 + i10];
            fArr[i11 + i10] = ((Float) w.E(f10)).floatValue();
            return Float.valueOf(f11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object obj) {
            return (obj instanceof Float) && Floats.k(this.f59024b, ((Float) obj).floatValue(), this.f59025c, this.f59026d) != -1;
        }

        float[] e() {
            return Arrays.copyOfRange(this.f59024b, this.f59025c, this.f59026d);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FloatArrayAsList)) {
                return super.equals(obj);
            }
            FloatArrayAsList floatArrayAsList = (FloatArrayAsList) obj;
            int size = size();
            if (floatArrayAsList.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f59024b[this.f59025c + i10] != floatArrayAsList.f59024b[floatArrayAsList.f59025c + i10]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i10 = 1;
            for (int i11 = this.f59025c; i11 < this.f59026d; i11++) {
                i10 = (i10 * 31) + Floats.i(this.f59024b[i11]);
            }
            return i10;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object obj) {
            int iK;
            if (!(obj instanceof Float) || (iK = Floats.k(this.f59024b, ((Float) obj).floatValue(), this.f59025c, this.f59026d)) < 0) {
                return -1;
            }
            return iK - this.f59025c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object obj) {
            int iP;
            if (!(obj instanceof Float) || (iP = Floats.p(this.f59024b, ((Float) obj).floatValue(), this.f59025c, this.f59026d)) < 0) {
                return -1;
            }
            return iP - this.f59025c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f59026d - this.f59025c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Float> subList(int i10, int i11) {
            w.f0(i10, i11, size());
            if (i10 == i11) {
                return Collections.emptyList();
            }
            float[] fArr = this.f59024b;
            int i12 = this.f59025c;
            return new FloatArrayAsList(fArr, i10 + i12, i12 + i11);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 12);
            sb2.append('[');
            sb2.append(this.f59024b[this.f59025c]);
            int i10 = this.f59025c;
            while (true) {
                i10++;
                if (i10 >= this.f59026d) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append(this.f59024b[i10]);
            }
        }
    }

    public static final class FloatConverter extends Converter<String, Float> implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final FloatConverter f59027d = new FloatConverter();
        private static final long serialVersionUID = 1;

        private FloatConverter() {
        }

        private Object q() {
            return f59027d;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public String h(Float f10) {
            return f10.toString();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Float i(String str) {
            return Float.valueOf(str);
        }

        public String toString() {
            return "Floats.stringConverter()";
        }
    }

    public enum LexicographicalComparator implements Comparator<float[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(float[] fArr, float[] fArr2) {
            int iMin = Math.min(fArr.length, fArr2.length);
            for (int i10 = 0; i10 < iMin; i10++) {
                int iCompare = Float.compare(fArr[i10], fArr2[i10]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return fArr.length - fArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Floats.lexicographicalComparator()";
        }
    }

    private Floats() {
    }

    public static List<Float> c(float... fArr) {
        return fArr.length == 0 ? Collections.emptyList() : new FloatArrayAsList(fArr);
    }

    public static int d(float f10, float f11) {
        return Float.compare(f10, f11);
    }

    public static float[] e(float[]... fArr) {
        int length = 0;
        for (float[] fArr2 : fArr) {
            length += fArr2.length;
        }
        float[] fArr3 = new float[length];
        int length2 = 0;
        for (float[] fArr4 : fArr) {
            System.arraycopy(fArr4, 0, fArr3, length2, fArr4.length);
            length2 += fArr4.length;
        }
        return fArr3;
    }

    @o9.a
    public static float f(float f10, float f11, float f12) {
        if (f11 <= f12) {
            return Math.min(Math.max(f10, f11), f12);
        }
        throw new IllegalArgumentException(b0.e("min (%s) must be less than or equal to max (%s)", Float.valueOf(f11), Float.valueOf(f12)));
    }

    public static boolean g(float[] fArr, float f10) {
        for (float f11 : fArr) {
            if (f11 == f10) {
                return true;
            }
        }
        return false;
    }

    public static float[] h(float[] fArr, int i10, int i11) {
        w.k(i10 >= 0, "Invalid minLength: %s", i10);
        w.k(i11 >= 0, "Invalid padding: %s", i11);
        return fArr.length < i10 ? Arrays.copyOf(fArr, i10 + i11) : fArr;
    }

    public static int i(float f10) {
        return Float.valueOf(f10).hashCode();
    }

    public static int j(float[] fArr, float f10) {
        return k(fArr, f10, 0, fArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(float[] fArr, float f10, int i10, int i11) {
        while (i10 < i11) {
            if (fArr[i10] == f10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int l(float[] fArr, float[] fArr2) {
        w.F(fArr, "array");
        w.F(fArr2, "target");
        if (fArr2.length == 0) {
            return 0;
        }
        for (int i10 = 0; i10 < (fArr.length - fArr2.length) + 1; i10++) {
            for (int i11 = 0; i11 < fArr2.length; i11++) {
                if (fArr[i10 + i11] != fArr2[i11]) {
                }
            }
            return i10;
        }
        return -1;
    }

    public static boolean m(float f10) {
        return Float.NEGATIVE_INFINITY < f10 && f10 < Float.POSITIVE_INFINITY;
    }

    public static String n(String str, float... fArr) {
        w.E(str);
        if (fArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(fArr.length * 12);
        sb2.append(fArr[0]);
        for (int i10 = 1; i10 < fArr.length; i10++) {
            sb2.append(str);
            sb2.append(fArr[i10]);
        }
        return sb2.toString();
    }

    public static int o(float[] fArr, float f10) {
        return p(fArr, f10, 0, fArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int p(float[] fArr, float f10, int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            if (fArr[i12] == f10) {
                return i12;
            }
        }
        return -1;
    }

    public static Comparator<float[]> q() {
        return LexicographicalComparator.INSTANCE;
    }

    @o9.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static float r(float... fArr) {
        w.d(fArr.length > 0);
        float fMax = fArr[0];
        for (int i10 = 1; i10 < fArr.length; i10++) {
            fMax = Math.max(fMax, fArr[i10]);
        }
        return fMax;
    }

    @o9.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static float s(float... fArr) {
        w.d(fArr.length > 0);
        float fMin = fArr[0];
        for (int i10 = 1; i10 < fArr.length; i10++) {
            fMin = Math.min(fMin, fArr[i10]);
        }
        return fMin;
    }

    public static void t(float[] fArr) {
        w.E(fArr);
        u(fArr, 0, fArr.length);
    }

    public static void u(float[] fArr, int i10, int i11) {
        w.E(fArr);
        w.f0(i10, i11, fArr.length);
        for (int i12 = i11 - 1; i10 < i12; i12--) {
            float f10 = fArr[i10];
            fArr[i10] = fArr[i12];
            fArr[i12] = f10;
            i10++;
        }
    }

    public static void v(float[] fArr) {
        w.E(fArr);
        w(fArr, 0, fArr.length);
    }

    public static void w(float[] fArr, int i10, int i11) {
        w.E(fArr);
        w.f0(i10, i11, fArr.length);
        Arrays.sort(fArr, i10, i11);
        u(fArr, i10, i11);
    }

    @o9.a
    public static Converter<String, Float> x() {
        return FloatConverter.f59027d;
    }

    public static float[] y(Collection<? extends Number> collection) {
        if (collection instanceof FloatArrayAsList) {
            return ((FloatArrayAsList) collection).e();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        float[] fArr = new float[length];
        for (int i10 = 0; i10 < length; i10++) {
            fArr[i10] = ((Number) w.E(array[i10])).floatValue();
        }
        return fArr;
    }

    @o9.a
    @CheckForNull
    @o9.c
    public static Float z(String str) {
        if (!Doubles.f59018b.matcher(str).matches()) {
            return null;
        }
        try {
            return Float.valueOf(Float.parseFloat(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
