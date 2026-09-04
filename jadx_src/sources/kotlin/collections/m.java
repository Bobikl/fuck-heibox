package kotlin.collections;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: compiled from: _ArraysJvm.kt */
/* JADX INFO: loaded from: classes5.dex */
public class m extends l {

    /* JADX INFO: compiled from: _ArraysJvm.kt */
    public static final class a extends kotlin.collections.b<Byte> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte[] f124628b;

        a(byte[] bArr) {
            this.f124628b = bArr;
        }

        public boolean a(byte b10) {
            return ArraysKt___ArraysKt.N8(this.f124628b, b10);
        }

        @Override // kotlin.collections.b, java.util.List
        @dl.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Byte get(int i10) {
            return Byte.valueOf(this.f124628b[i10]);
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Byte) {
                return a(((Number) obj).byteValue());
            }
            return false;
        }

        public int e(byte b10) {
            return ArraysKt___ArraysKt.dg(this.f124628b, b10);
        }

        public int g(byte b10) {
            return ArraysKt___ArraysKt.hi(this.f124628b, b10);
        }

        @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
        /* JADX INFO: renamed from: getSize */
        public int getF140741e() {
            return this.f124628b.length;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Byte) {
                return e(((Number) obj).byteValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f124628b.length == 0;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Byte) {
                return g(((Number) obj).byteValue());
            }
            return -1;
        }
    }

    /* JADX INFO: compiled from: _ArraysJvm.kt */
    public static final class b extends kotlin.collections.b<Short> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ short[] f124629b;

        b(short[] sArr) {
            this.f124629b = sArr;
        }

        public boolean a(short s10) {
            return ArraysKt___ArraysKt.U8(this.f124629b, s10);
        }

        @Override // kotlin.collections.b, java.util.List
        @dl.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Short get(int i10) {
            return Short.valueOf(this.f124629b[i10]);
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Short) {
                return a(((Number) obj).shortValue());
            }
            return false;
        }

        public int e(short s10) {
            return ArraysKt___ArraysKt.kg(this.f124629b, s10);
        }

        public int g(short s10) {
            return ArraysKt___ArraysKt.oi(this.f124629b, s10);
        }

        @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
        /* JADX INFO: renamed from: getSize */
        public int getF140741e() {
            return this.f124629b.length;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Short) {
                return e(((Number) obj).shortValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f124629b.length == 0;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Short) {
                return g(((Number) obj).shortValue());
            }
            return -1;
        }
    }

    /* JADX INFO: compiled from: _ArraysJvm.kt */
    public static final class c extends kotlin.collections.b<Integer> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f124630b;

        c(int[] iArr) {
            this.f124630b = iArr;
        }

        public boolean a(int i10) {
            return ArraysKt___ArraysKt.R8(this.f124630b, i10);
        }

        @Override // kotlin.collections.b, java.util.List
        @dl.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer get(int i10) {
            return Integer.valueOf(this.f124630b[i10]);
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Integer) {
                return a(((Number) obj).intValue());
            }
            return false;
        }

        public int e(int i10) {
            return ArraysKt___ArraysKt.hg(this.f124630b, i10);
        }

        public int g(int i10) {
            return ArraysKt___ArraysKt.li(this.f124630b, i10);
        }

        @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
        /* JADX INFO: renamed from: getSize */
        public int getF140741e() {
            return this.f124630b.length;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return e(((Number) obj).intValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f124630b.length == 0;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return g(((Number) obj).intValue());
            }
            return -1;
        }
    }

    /* JADX INFO: compiled from: _ArraysJvm.kt */
    public static final class d extends kotlin.collections.b<Long> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long[] f124631b;

        d(long[] jArr) {
            this.f124631b = jArr;
        }

        public boolean a(long j10) {
            return ArraysKt___ArraysKt.S8(this.f124631b, j10);
        }

        @Override // kotlin.collections.b, java.util.List
        @dl.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long get(int i10) {
            return Long.valueOf(this.f124631b[i10]);
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Long) {
                return a(((Number) obj).longValue());
            }
            return false;
        }

        public int e(long j10) {
            return ArraysKt___ArraysKt.ig(this.f124631b, j10);
        }

        public int g(long j10) {
            return ArraysKt___ArraysKt.mi(this.f124631b, j10);
        }

        @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
        /* JADX INFO: renamed from: getSize */
        public int getF140741e() {
            return this.f124631b.length;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Long) {
                return e(((Number) obj).longValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f124631b.length == 0;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Long) {
                return g(((Number) obj).longValue());
            }
            return -1;
        }
    }

    /* JADX INFO: compiled from: _ArraysJvm.kt */
    public static final class e extends kotlin.collections.b<Float> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float[] f124632b;

        e(float[] fArr) {
            this.f124632b = fArr;
        }

        public boolean a(float f10) {
            for (float f11 : this.f124632b) {
                if (Float.floatToIntBits(f11) == Float.floatToIntBits(f10)) {
                    return true;
                }
            }
            return false;
        }

        @Override // kotlin.collections.b, java.util.List
        @dl.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Float get(int i10) {
            return Float.valueOf(this.f124632b[i10]);
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Float) {
                return a(((Number) obj).floatValue());
            }
            return false;
        }

        public int e(float f10) {
            float[] fArr = this.f124632b;
            int length = fArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (Float.floatToIntBits(fArr[i10]) == Float.floatToIntBits(f10)) {
                    return i10;
                }
            }
            return -1;
        }

        public int g(float f10) {
            float[] fArr = this.f124632b;
            int length = fArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i10 = length - 1;
                if (Float.floatToIntBits(fArr[length]) == Float.floatToIntBits(f10)) {
                    return length;
                }
                if (i10 < 0) {
                    return -1;
                }
                length = i10;
            }
        }

        @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
        /* JADX INFO: renamed from: getSize */
        public int getF140741e() {
            return this.f124632b.length;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Float) {
                return e(((Number) obj).floatValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f124632b.length == 0;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Float) {
                return g(((Number) obj).floatValue());
            }
            return -1;
        }
    }

    /* JADX INFO: compiled from: _ArraysJvm.kt */
    public static final class f extends kotlin.collections.b<Double> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ double[] f124633b;

        f(double[] dArr) {
            this.f124633b = dArr;
        }

        public boolean a(double d10) {
            for (double d11 : this.f124633b) {
                if (Double.doubleToLongBits(d11) == Double.doubleToLongBits(d10)) {
                    return true;
                }
            }
            return false;
        }

        @Override // kotlin.collections.b, java.util.List
        @dl.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Double get(int i10) {
            return Double.valueOf(this.f124633b[i10]);
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Double) {
                return a(((Number) obj).doubleValue());
            }
            return false;
        }

        public int e(double d10) {
            double[] dArr = this.f124633b;
            int length = dArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (Double.doubleToLongBits(dArr[i10]) == Double.doubleToLongBits(d10)) {
                    return i10;
                }
            }
            return -1;
        }

        public int g(double d10) {
            double[] dArr = this.f124633b;
            int length = dArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i10 = length - 1;
                if (Double.doubleToLongBits(dArr[length]) == Double.doubleToLongBits(d10)) {
                    return length;
                }
                if (i10 < 0) {
                    return -1;
                }
                length = i10;
            }
        }

        @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
        /* JADX INFO: renamed from: getSize */
        public int getF140741e() {
            return this.f124633b.length;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Double) {
                return e(((Number) obj).doubleValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f124633b.length == 0;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Double) {
                return g(((Number) obj).doubleValue());
            }
            return -1;
        }
    }

    /* JADX INFO: compiled from: _ArraysJvm.kt */
    public static final class g extends kotlin.collections.b<Boolean> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean[] f124634b;

        g(boolean[] zArr) {
            this.f124634b = zArr;
        }

        public boolean a(boolean z10) {
            return ArraysKt___ArraysKt.V8(this.f124634b, z10);
        }

        @Override // kotlin.collections.b, java.util.List
        @dl.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean get(int i10) {
            return Boolean.valueOf(this.f124634b[i10]);
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Boolean) {
                return a(((Boolean) obj).booleanValue());
            }
            return false;
        }

        public int e(boolean z10) {
            return ArraysKt___ArraysKt.lg(this.f124634b, z10);
        }

        public int g(boolean z10) {
            return ArraysKt___ArraysKt.pi(this.f124634b, z10);
        }

        @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
        /* JADX INFO: renamed from: getSize */
        public int getF140741e() {
            return this.f124634b.length;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Boolean) {
                return e(((Boolean) obj).booleanValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f124634b.length == 0;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Boolean) {
                return g(((Boolean) obj).booleanValue());
            }
            return -1;
        }
    }

    /* JADX INFO: compiled from: _ArraysJvm.kt */
    public static final class h extends kotlin.collections.b<Character> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ char[] f124635b;

        h(char[] cArr) {
            this.f124635b = cArr;
        }

        public boolean a(char c10) {
            return ArraysKt___ArraysKt.O8(this.f124635b, c10);
        }

        @Override // kotlin.collections.b, java.util.List
        @dl.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Character get(int i10) {
            return Character.valueOf(this.f124635b[i10]);
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Character) {
                return a(((Character) obj).charValue());
            }
            return false;
        }

        public int e(char c10) {
            return ArraysKt___ArraysKt.eg(this.f124635b, c10);
        }

        public int g(char c10) {
            return ArraysKt___ArraysKt.ii(this.f124635b, c10);
        }

        @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
        /* JADX INFO: renamed from: getSize */
        public int getF140741e() {
            return this.f124635b.length;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Character) {
                return e(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f124635b.length == 0;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Character) {
                return g(((Character) obj).charValue());
            }
            return -1;
        }
    }

    public static final int A(@dl.d int[] iArr, int i10, int i11, int i12) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        return Arrays.binarySearch(iArr, i11, i12, i10);
    }

    @kotlin.u0(version = "1.4")
    @xh.h(name = "contentHashCodeNullable")
    @sh.f
    private static final int A0(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    @sh.f
    private static final <T> T[] A1(T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        kotlin.jvm.internal.f0.o(tArr2, "copyOf(this, size)");
        return tArr2;
    }

    @dl.d
    public static final <C extends Collection<? super R>, R> C A2(@dl.d Object[] objArr, @dl.d C destination, @dl.d Class<R> klass) {
        kotlin.jvm.internal.f0.p(objArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(klass, "klass");
        for (Object obj : objArr) {
            if (klass.isInstance(obj)) {
                destination.add(obj);
            }
        }
        return destination;
    }

    @kotlin.k(message = "Use minWithOrNull instead.", replaceWith = @kotlin.s0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Float A3(float[] fArr, Comparator comparator) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        return ArraysKt___ArraysKt.eo(fArr, comparator);
    }

    public static /* synthetic */ void A4(char[] cArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = cArr.length;
        }
        k4(cArr, i10, i11);
    }

    public static final int B(@dl.d long[] jArr, long j10, int i10, int i11) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        return Arrays.binarySearch(jArr, i10, i11, j10);
    }

    @kotlin.u0(version = "1.4")
    @xh.h(name = "contentHashCodeNullable")
    @sh.f
    private static final <T> int B0(T[] tArr) {
        return Arrays.hashCode(tArr);
    }

    @sh.f
    private static final <T> T[] B1(T[] tArr, int i10) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i10);
        kotlin.jvm.internal.f0.o(tArr2, "copyOf(this, newSize)");
        return tArr2;
    }

    @kotlin.k(message = "Use maxOrNull instead.", replaceWith = @kotlin.s0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Byte B2(byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        return ArraysKt___ArraysKt.il(bArr);
    }

    @kotlin.k(message = "Use minWithOrNull instead.", replaceWith = @kotlin.s0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Integer B3(int[] iArr, Comparator comparator) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        return ArraysKt___ArraysKt.fo(iArr, comparator);
    }

    public static /* synthetic */ void B4(double[] dArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = dArr.length;
        }
        m4(dArr, i10, i11);
    }

    public static final <T> int C(@dl.d T[] tArr, T t10, int i10, int i11) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        return Arrays.binarySearch(tArr, i10, i11, t10);
    }

    @kotlin.u0(version = "1.4")
    @xh.h(name = "contentHashCodeNullable")
    @sh.f
    private static final int C0(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    @sh.f
    private static final short[] C1(short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        kotlin.jvm.internal.f0.o(sArrCopyOf, "copyOf(this, size)");
        return sArrCopyOf;
    }

    @kotlin.k(message = "Use maxOrNull instead.", replaceWith = @kotlin.s0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Character C2(char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        return ArraysKt___ArraysKt.jl(cArr);
    }

    @kotlin.k(message = "Use minWithOrNull instead.", replaceWith = @kotlin.s0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Long C3(long[] jArr, Comparator comparator) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        return ArraysKt___ArraysKt.go(jArr, comparator);
    }

    public static /* synthetic */ void C4(float[] fArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = fArr.length;
        }
        o4(fArr, i10, i11);
    }

    public static final <T> int D(@dl.d T[] tArr, T t10, @dl.d Comparator<? super T> comparator, int i10, int i11) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        return Arrays.binarySearch(tArr, i10, i11, t10, comparator);
    }

    @kotlin.u0(version = "1.4")
    @xh.h(name = "contentHashCodeNullable")
    @sh.f
    private static final int D0(boolean[] zArr) {
        return Arrays.hashCode(zArr);
    }

    @sh.f
    private static final short[] D1(short[] sArr, int i10) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        short[] sArrCopyOf = Arrays.copyOf(sArr, i10);
        kotlin.jvm.internal.f0.o(sArrCopyOf, "copyOf(this, newSize)");
        return sArrCopyOf;
    }

    @kotlin.k(message = "Use maxOrNull instead.", replaceWith = @kotlin.s0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Comparable D2(Comparable[] comparableArr) {
        kotlin.jvm.internal.f0.p(comparableArr, "<this>");
        return ArraysKt___ArraysKt.kl(comparableArr);
    }

    @kotlin.k(message = "Use minWithOrNull instead.", replaceWith = @kotlin.s0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Object D3(Object[] objArr, Comparator comparator) {
        kotlin.jvm.internal.f0.p(objArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        return ArraysKt___ArraysKt.ho(objArr, comparator);
    }

    public static /* synthetic */ void D4(int[] iArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = iArr.length;
        }
        q4(iArr, i10, i11);
    }

    public static final int E(@dl.d short[] sArr, short s10, int i10, int i11) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        return Arrays.binarySearch(sArr, i10, i11, s10);
    }

    @kotlin.u0(version = "1.1")
    @kotlin.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @kotlin.l(hiddenSince = "1.4")
    @sh.f
    private static final /* synthetic */ String E0(byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        String string = Arrays.toString(bArr);
        kotlin.jvm.internal.f0.o(string, "toString(this)");
        return string;
    }

    @sh.f
    private static final boolean[] E1(boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, zArr.length);
        kotlin.jvm.internal.f0.o(zArrCopyOf, "copyOf(this, size)");
        return zArrCopyOf;
    }

    @kotlin.k(message = "Use maxOrNull instead.", replaceWith = @kotlin.s0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Double E2(double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        return ArraysKt___ArraysKt.ll(dArr);
    }

    @kotlin.k(message = "Use minWithOrNull instead.", replaceWith = @kotlin.s0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Short E3(short[] sArr, Comparator comparator) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        return ArraysKt___ArraysKt.io(sArr, comparator);
    }

    public static /* synthetic */ void E4(long[] jArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = jArr.length;
        }
        s4(jArr, i10, i11);
    }

    public static /* synthetic */ int F(byte[] bArr, byte b10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return w(bArr, b10, i10, i11);
    }

    @kotlin.u0(version = "1.1")
    @kotlin.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @kotlin.l(hiddenSince = "1.4")
    @sh.f
    private static final /* synthetic */ String F0(char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        String string = Arrays.toString(cArr);
        kotlin.jvm.internal.f0.o(string, "toString(this)");
        return string;
    }

    @sh.f
    private static final boolean[] F1(boolean[] zArr, int i10) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, i10);
        kotlin.jvm.internal.f0.o(zArrCopyOf, "copyOf(this, newSize)");
        return zArrCopyOf;
    }

    @kotlin.u0(version = "1.1")
    @kotlin.k(message = "Use maxOrNull instead.", replaceWith = @kotlin.s0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Double F2(Double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        return ArraysKt___ArraysKt.ml(dArr);
    }

    @dl.d
    public static final byte[] F3(@dl.d byte[] bArr, byte b10) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        int length = bArr.length;
        byte[] result = Arrays.copyOf(bArr, length + 1);
        result[length] = b10;
        kotlin.jvm.internal.f0.o(result, "result");
        return result;
    }

    public static /* synthetic */ void F4(Comparable[] comparableArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = comparableArr.length;
        }
        u4(comparableArr, i10, i11);
    }

    public static /* synthetic */ int G(char[] cArr, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = cArr.length;
        }
        return x(cArr, c10, i10, i11);
    }

    @kotlin.u0(version = "1.1")
    @kotlin.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @kotlin.l(hiddenSince = "1.4")
    @sh.f
    private static final /* synthetic */ String G0(double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        String string = Arrays.toString(dArr);
        kotlin.jvm.internal.f0.o(string, "toString(this)");
        return string;
    }

    @kotlin.u0(version = "1.3")
    @dl.d
    @kotlin.r0
    @xh.h(name = "copyOfRange")
    public static final byte[] G1(@dl.d byte[] bArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        k.c(i11, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        kotlin.jvm.internal.f0.o(bArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return bArrCopyOfRange;
    }

    @kotlin.k(message = "Use maxOrNull instead.", replaceWith = @kotlin.s0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Float G2(float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        return ArraysKt___ArraysKt.nl(fArr);
    }

    @dl.d
    public static final byte[] G3(@dl.d byte[] bArr, @dl.d Collection<Byte> elements) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        int length = bArr.length;
        byte[] result = Arrays.copyOf(bArr, elements.size() + length);
        Iterator<Byte> it = elements.iterator();
        while (it.hasNext()) {
            result[length] = it.next().byteValue();
            length++;
        }
        kotlin.jvm.internal.f0.o(result, "result");
        return result;
    }

    public static /* synthetic */ void G4(Object[] objArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = objArr.length;
        }
        w4(objArr, i10, i11);
    }

    public static /* synthetic */ int H(double[] dArr, double d10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = dArr.length;
        }
        return y(dArr, d10, i10, i11);
    }

    @kotlin.u0(version = "1.1")
    @kotlin.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @kotlin.l(hiddenSince = "1.4")
    @sh.f
    private static final /* synthetic */ String H0(float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        String string = Arrays.toString(fArr);
        kotlin.jvm.internal.f0.o(string, "toString(this)");
        return string;
    }

    @kotlin.u0(version = "1.3")
    @dl.d
    @kotlin.r0
    @xh.h(name = "copyOfRange")
    public static final char[] H1(@dl.d char[] cArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        k.c(i11, cArr.length);
        char[] cArrCopyOfRange = Arrays.copyOfRange(cArr, i10, i11);
        kotlin.jvm.internal.f0.o(cArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return cArrCopyOfRange;
    }

    @kotlin.u0(version = "1.1")
    @kotlin.k(message = "Use maxOrNull instead.", replaceWith = @kotlin.s0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Float H2(Float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        return ArraysKt___ArraysKt.ol(fArr);
    }

    @dl.d
    public static final byte[] H3(@dl.d byte[] bArr, @dl.d byte[] elements) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] result = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        kotlin.jvm.internal.f0.o(result, "result");
        return result;
    }

    public static /* synthetic */ void H4(short[] sArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = sArr.length;
        }
        y4(sArr, i10, i11);
    }

    public static /* synthetic */ int I(float[] fArr, float f10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length;
        }
        return z(fArr, f10, i10, i11);
    }

    @kotlin.u0(version = "1.1")
    @kotlin.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @kotlin.l(hiddenSince = "1.4")
    @sh.f
    private static final /* synthetic */ String I0(int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        String string = Arrays.toString(iArr);
        kotlin.jvm.internal.f0.o(string, "toString(this)");
        return string;
    }

    @kotlin.u0(version = "1.3")
    @dl.d
    @kotlin.r0
    @xh.h(name = "copyOfRange")
    public static final double[] I1(@dl.d double[] dArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        k.c(i11, dArr.length);
        double[] dArrCopyOfRange = Arrays.copyOfRange(dArr, i10, i11);
        kotlin.jvm.internal.f0.o(dArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return dArrCopyOfRange;
    }

    @kotlin.k(message = "Use maxOrNull instead.", replaceWith = @kotlin.s0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Integer I2(int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        return ArraysKt___ArraysKt.pl(iArr);
    }

    @dl.d
    public static final char[] I3(@dl.d char[] cArr, char c10) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        int length = cArr.length;
        char[] result = Arrays.copyOf(cArr, length + 1);
        result[length] = c10;
        kotlin.jvm.internal.f0.o(result, "result");
        return result;
    }

    public static final <T> void I4(@dl.d T[] tArr, @dl.d Comparator<? super T> comparator) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    public static /* synthetic */ int J(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = iArr.length;
        }
        return A(iArr, i10, i11, i12);
    }

    @kotlin.u0(version = "1.1")
    @kotlin.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @kotlin.l(hiddenSince = "1.4")
    @sh.f
    private static final /* synthetic */ String J0(long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        String string = Arrays.toString(jArr);
        kotlin.jvm.internal.f0.o(string, "toString(this)");
        return string;
    }

    @kotlin.u0(version = "1.3")
    @dl.d
    @kotlin.r0
    @xh.h(name = "copyOfRange")
    public static final float[] J1(@dl.d float[] fArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        k.c(i11, fArr.length);
        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, i10, i11);
        kotlin.jvm.internal.f0.o(fArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return fArrCopyOfRange;
    }

    @kotlin.k(message = "Use maxOrNull instead.", replaceWith = @kotlin.s0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Long J2(long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        return ArraysKt___ArraysKt.ql(jArr);
    }

    @dl.d
    public static final char[] J3(@dl.d char[] cArr, @dl.d Collection<Character> elements) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        int length = cArr.length;
        char[] result = Arrays.copyOf(cArr, elements.size() + length);
        Iterator<Character> it = elements.iterator();
        while (it.hasNext()) {
            result[length] = it.next().charValue();
            length++;
        }
        kotlin.jvm.internal.f0.o(result, "result");
        return result;
    }

    public static final <T> void J4(@dl.d T[] tArr, @dl.d Comparator<? super T> comparator, int i10, int i11) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        Arrays.sort(tArr, i10, i11, comparator);
    }

    public static /* synthetic */ int K(long[] jArr, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length;
        }
        return B(jArr, j10, i10, i11);
    }

    @kotlin.u0(version = "1.1")
    @kotlin.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @kotlin.l(hiddenSince = "1.4")
    @sh.f
    private static final /* synthetic */ <T> String K0(T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        String string = Arrays.toString(tArr);
        kotlin.jvm.internal.f0.o(string, "toString(this)");
        return string;
    }

    @kotlin.u0(version = "1.3")
    @dl.d
    @kotlin.r0
    @xh.h(name = "copyOfRange")
    public static final int[] K1(@dl.d int[] iArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        k.c(i11, iArr.length);
        int[] iArrCopyOfRange = Arrays.copyOfRange(iArr, i10, i11);
        kotlin.jvm.internal.f0.o(iArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return iArrCopyOfRange;
    }

    @kotlin.k(message = "Use maxOrNull instead.", replaceWith = @kotlin.s0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Short K2(short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        return ArraysKt___ArraysKt.rl(sArr);
    }

    @dl.d
    public static final char[] K3(@dl.d char[] cArr, @dl.d char[] elements) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        int length = cArr.length;
        int length2 = elements.length;
        char[] result = Arrays.copyOf(cArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        kotlin.jvm.internal.f0.o(result, "result");
        return result;
    }

    public static /* synthetic */ void K4(Object[] objArr, Comparator comparator, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        J4(objArr, comparator, i10, i11);
    }

    public static /* synthetic */ int L(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        return C(objArr, obj, i10, i11);
    }

    @kotlin.u0(version = "1.1")
    @kotlin.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @kotlin.l(hiddenSince = "1.4")
    @sh.f
    private static final /* synthetic */ String L0(short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        String string = Arrays.toString(sArr);
        kotlin.jvm.internal.f0.o(string, "toString(this)");
        return string;
    }

    @kotlin.u0(version = "1.3")
    @dl.d
    @kotlin.r0
    @xh.h(name = "copyOfRange")
    public static final long[] L1(@dl.d long[] jArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        k.c(i11, jArr.length);
        long[] jArrCopyOfRange = Arrays.copyOfRange(jArr, i10, i11);
        kotlin.jvm.internal.f0.o(jArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return jArrCopyOfRange;
    }

    @kotlin.k(message = "Use maxByOrNull instead.", replaceWith = @kotlin.s0(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean L2(boolean[] zArr, yh.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z10 = zArr[0];
        int iZe = ArraysKt___ArraysKt.Ze(zArr);
        if (iZe == 0) {
            return Boolean.valueOf(z10);
        }
        R rInvoke = selector.invoke(Boolean.valueOf(z10));
        k0 it = new fi.l(1, iZe).iterator();
        while (it.hasNext()) {
            boolean z11 = zArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Boolean.valueOf(z11));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                z10 = z11;
                rInvoke = rInvoke2;
            }
        }
        return Boolean.valueOf(z10);
    }

    @dl.d
    public static final double[] L3(@dl.d double[] dArr, double d10) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        int length = dArr.length;
        double[] result = Arrays.copyOf(dArr, length + 1);
        result[length] = d10;
        kotlin.jvm.internal.f0.o(result, "result");
        return result;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfBigDecimal")
    @sh.f
    private static final BigDecimal L4(byte[] bArr, yh.l<? super Byte, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.f0.o(bigDecimalValueOf, "valueOf(this.toLong())");
        for (byte b10 : bArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Byte.valueOf(b10)));
            kotlin.jvm.internal.f0.o(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    public static /* synthetic */ int M(Object[] objArr, Object obj, Comparator comparator, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = objArr.length;
        }
        return D(objArr, obj, comparator, i10, i11);
    }

    @kotlin.u0(version = "1.1")
    @kotlin.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @kotlin.l(hiddenSince = "1.4")
    @sh.f
    private static final /* synthetic */ String M0(boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        String string = Arrays.toString(zArr);
        kotlin.jvm.internal.f0.o(string, "toString(this)");
        return string;
    }

    @kotlin.u0(version = "1.3")
    @dl.d
    @kotlin.r0
    @xh.h(name = "copyOfRange")
    public static final <T> T[] M1(@dl.d T[] tArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        k.c(i11, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i10, i11);
        kotlin.jvm.internal.f0.o(tArr2, "copyOfRange(this, fromIndex, toIndex)");
        return tArr2;
    }

    @kotlin.k(message = "Use maxByOrNull instead.", replaceWith = @kotlin.s0(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte M2(byte[] bArr, yh.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int iRe = ArraysKt___ArraysKt.Re(bArr);
        if (iRe == 0) {
            return Byte.valueOf(b10);
        }
        R rInvoke = selector.invoke(Byte.valueOf(b10));
        k0 it = new fi.l(1, iRe).iterator();
        while (it.hasNext()) {
            byte b11 = bArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Byte.valueOf(b11));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                b10 = b11;
                rInvoke = rInvoke2;
            }
        }
        return Byte.valueOf(b10);
    }

    @dl.d
    public static final double[] M3(@dl.d double[] dArr, @dl.d Collection<Double> elements) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        int length = dArr.length;
        double[] result = Arrays.copyOf(dArr, elements.size() + length);
        Iterator<Double> it = elements.iterator();
        while (it.hasNext()) {
            result[length] = it.next().doubleValue();
            length++;
        }
        kotlin.jvm.internal.f0.o(result, "result");
        return result;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfBigDecimal")
    @sh.f
    private static final BigDecimal M4(char[] cArr, yh.l<? super Character, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.f0.o(bigDecimalValueOf, "valueOf(this.toLong())");
        for (char c10 : cArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Character.valueOf(c10)));
            kotlin.jvm.internal.f0.o(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    public static /* synthetic */ int N(short[] sArr, short s10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = sArr.length;
        }
        return E(sArr, s10, i10, i11);
    }

    @kotlin.u0(version = "1.4")
    @xh.h(name = "contentToStringNullable")
    @sh.f
    private static final String N0(byte[] bArr) {
        String string = Arrays.toString(bArr);
        kotlin.jvm.internal.f0.o(string, "toString(this)");
        return string;
    }

    @kotlin.u0(version = "1.3")
    @dl.d
    @kotlin.r0
    @xh.h(name = "copyOfRange")
    public static final short[] N1(@dl.d short[] sArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        k.c(i11, sArr.length);
        short[] sArrCopyOfRange = Arrays.copyOfRange(sArr, i10, i11);
        kotlin.jvm.internal.f0.o(sArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return sArrCopyOfRange;
    }

    @kotlin.k(message = "Use maxByOrNull instead.", replaceWith = @kotlin.s0(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character N2(char[] cArr, yh.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        int iSe = ArraysKt___ArraysKt.Se(cArr);
        if (iSe == 0) {
            return Character.valueOf(c10);
        }
        R rInvoke = selector.invoke(Character.valueOf(c10));
        k0 it = new fi.l(1, iSe).iterator();
        while (it.hasNext()) {
            char c11 = cArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Character.valueOf(c11));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                c10 = c11;
                rInvoke = rInvoke2;
            }
        }
        return Character.valueOf(c10);
    }

    @dl.d
    public static final double[] N3(@dl.d double[] dArr, @dl.d double[] elements) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        int length = dArr.length;
        int length2 = elements.length;
        double[] result = Arrays.copyOf(dArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        kotlin.jvm.internal.f0.o(result, "result");
        return result;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfBigDecimal")
    @sh.f
    private static final BigDecimal N4(double[] dArr, yh.l<? super Double, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.f0.o(bigDecimalValueOf, "valueOf(this.toLong())");
        for (double d10 : dArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Double.valueOf(d10)));
            kotlin.jvm.internal.f0.o(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @kotlin.u0(version = "1.1")
    @sh.h
    @xh.h(name = "contentDeepEqualsInline")
    @sh.f
    private static final <T> boolean O(T[] tArr, T[] other) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        return l.g(tArr, other);
    }

    @kotlin.u0(version = "1.4")
    @xh.h(name = "contentToStringNullable")
    @sh.f
    private static final String O0(char[] cArr) {
        String string = Arrays.toString(cArr);
        kotlin.jvm.internal.f0.o(string, "toString(this)");
        return string;
    }

    @kotlin.u0(version = "1.3")
    @dl.d
    @kotlin.r0
    @xh.h(name = "copyOfRange")
    public static final boolean[] O1(@dl.d boolean[] zArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        k.c(i11, zArr.length);
        boolean[] zArrCopyOfRange = Arrays.copyOfRange(zArr, i10, i11);
        kotlin.jvm.internal.f0.o(zArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return zArrCopyOfRange;
    }

    @kotlin.k(message = "Use maxByOrNull instead.", replaceWith = @kotlin.s0(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Double O2(double[] dArr, yh.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d10 = dArr[0];
        int iTe = ArraysKt___ArraysKt.Te(dArr);
        if (iTe == 0) {
            return Double.valueOf(d10);
        }
        R rInvoke = selector.invoke(Double.valueOf(d10));
        k0 it = new fi.l(1, iTe).iterator();
        while (it.hasNext()) {
            double d11 = dArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Double.valueOf(d11));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                d10 = d11;
            }
        }
        return Double.valueOf(d10);
    }

    @dl.d
    public static final float[] O3(@dl.d float[] fArr, float f10) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        int length = fArr.length;
        float[] result = Arrays.copyOf(fArr, length + 1);
        result[length] = f10;
        kotlin.jvm.internal.f0.o(result, "result");
        return result;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfBigDecimal")
    @sh.f
    private static final BigDecimal O4(float[] fArr, yh.l<? super Float, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.f0.o(bigDecimalValueOf, "valueOf(this.toLong())");
        for (float f10 : fArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Float.valueOf(f10)));
            kotlin.jvm.internal.f0.o(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @kotlin.u0(version = "1.4")
    @xh.h(name = "contentDeepEqualsNullable")
    @sh.f
    private static final <T> boolean P(T[] tArr, T[] tArr2) {
        return sh.m.a(1, 3, 0) ? l.g(tArr, tArr2) : Arrays.deepEquals(tArr, tArr2);
    }

    @kotlin.u0(version = "1.4")
    @xh.h(name = "contentToStringNullable")
    @sh.f
    private static final String P0(double[] dArr) {
        String string = Arrays.toString(dArr);
        kotlin.jvm.internal.f0.o(string, "toString(this)");
        return string;
    }

    @xh.h(name = "copyOfRangeInline")
    @sh.f
    private static final byte[] P1(byte[] bArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        if (sh.m.a(1, 3, 0)) {
            return G1(bArr, i10, i11);
        }
        if (i11 <= bArr.length) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
            kotlin.jvm.internal.f0.o(bArrCopyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return bArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i11 + ", size: " + bArr.length);
    }

    @kotlin.k(message = "Use maxByOrNull instead.", replaceWith = @kotlin.s0(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Float P2(float[] fArr, yh.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f10 = fArr[0];
        int iUe = ArraysKt___ArraysKt.Ue(fArr);
        if (iUe == 0) {
            return Float.valueOf(f10);
        }
        R rInvoke = selector.invoke(Float.valueOf(f10));
        k0 it = new fi.l(1, iUe).iterator();
        while (it.hasNext()) {
            float f11 = fArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Float.valueOf(f11));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                f10 = f11;
                rInvoke = rInvoke2;
            }
        }
        return Float.valueOf(f10);
    }

    @dl.d
    public static final float[] P3(@dl.d float[] fArr, @dl.d Collection<Float> elements) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        int length = fArr.length;
        float[] result = Arrays.copyOf(fArr, elements.size() + length);
        Iterator<Float> it = elements.iterator();
        while (it.hasNext()) {
            result[length] = it.next().floatValue();
            length++;
        }
        kotlin.jvm.internal.f0.o(result, "result");
        return result;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfBigDecimal")
    @sh.f
    private static final BigDecimal P4(int[] iArr, yh.l<? super Integer, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.f0.o(bigDecimalValueOf, "valueOf(this.toLong())");
        for (int i10 : iArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Integer.valueOf(i10)));
            kotlin.jvm.internal.f0.o(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @kotlin.u0(version = "1.1")
    @sh.h
    @xh.h(name = "contentDeepHashCodeInline")
    @sh.f
    private static final <T> int Q(T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        return k.b(tArr);
    }

    @kotlin.u0(version = "1.4")
    @xh.h(name = "contentToStringNullable")
    @sh.f
    private static final String Q0(float[] fArr) {
        String string = Arrays.toString(fArr);
        kotlin.jvm.internal.f0.o(string, "toString(this)");
        return string;
    }

    @xh.h(name = "copyOfRangeInline")
    @sh.f
    private static final char[] Q1(char[] cArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        if (sh.m.a(1, 3, 0)) {
            return H1(cArr, i10, i11);
        }
        if (i11 <= cArr.length) {
            char[] cArrCopyOfRange = Arrays.copyOfRange(cArr, i10, i11);
            kotlin.jvm.internal.f0.o(cArrCopyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return cArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i11 + ", size: " + cArr.length);
    }

    @kotlin.k(message = "Use maxByOrNull instead.", replaceWith = @kotlin.s0(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer Q2(int[] iArr, yh.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int iVe = ArraysKt___ArraysKt.Ve(iArr);
        if (iVe == 0) {
            return Integer.valueOf(i10);
        }
        R rInvoke = selector.invoke(Integer.valueOf(i10));
        k0 it = new fi.l(1, iVe).iterator();
        while (it.hasNext()) {
            int i11 = iArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Integer.valueOf(i11));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                i10 = i11;
                rInvoke = rInvoke2;
            }
        }
        return Integer.valueOf(i10);
    }

    @dl.d
    public static final float[] Q3(@dl.d float[] fArr, @dl.d float[] elements) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        int length = fArr.length;
        int length2 = elements.length;
        float[] result = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        kotlin.jvm.internal.f0.o(result, "result");
        return result;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfBigDecimal")
    @sh.f
    private static final BigDecimal Q4(long[] jArr, yh.l<? super Long, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.f0.o(bigDecimalValueOf, "valueOf(this.toLong())");
        for (long j10 : jArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Long.valueOf(j10)));
            kotlin.jvm.internal.f0.o(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @kotlin.u0(version = "1.4")
    @xh.h(name = "contentDeepHashCodeNullable")
    @sh.f
    private static final <T> int R(T[] tArr) {
        return sh.m.a(1, 3, 0) ? k.b(tArr) : Arrays.deepHashCode(tArr);
    }

    @kotlin.u0(version = "1.4")
    @xh.h(name = "contentToStringNullable")
    @sh.f
    private static final String R0(int[] iArr) {
        String string = Arrays.toString(iArr);
        kotlin.jvm.internal.f0.o(string, "toString(this)");
        return string;
    }

    @xh.h(name = "copyOfRangeInline")
    @sh.f
    private static final double[] R1(double[] dArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        if (sh.m.a(1, 3, 0)) {
            return I1(dArr, i10, i11);
        }
        if (i11 <= dArr.length) {
            double[] dArrCopyOfRange = Arrays.copyOfRange(dArr, i10, i11);
            kotlin.jvm.internal.f0.o(dArrCopyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return dArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i11 + ", size: " + dArr.length);
    }

    @kotlin.k(message = "Use maxByOrNull instead.", replaceWith = @kotlin.s0(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Long R2(long[] jArr, yh.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int iWe = ArraysKt___ArraysKt.We(jArr);
        if (iWe == 0) {
            return Long.valueOf(j10);
        }
        R rInvoke = selector.invoke(Long.valueOf(j10));
        k0 it = new fi.l(1, iWe).iterator();
        while (it.hasNext()) {
            long j11 = jArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Long.valueOf(j11));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                j10 = j11;
            }
        }
        return Long.valueOf(j10);
    }

    @dl.d
    public static final int[] R3(@dl.d int[] iArr, int i10) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        int length = iArr.length;
        int[] result = Arrays.copyOf(iArr, length + 1);
        result[length] = i10;
        kotlin.jvm.internal.f0.o(result, "result");
        return result;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfBigDecimal")
    @sh.f
    private static final <T> BigDecimal R4(T[] tArr, yh.l<? super T, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.f0.o(bigDecimalValueOf, "valueOf(this.toLong())");
        for (T t10 : tArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(t10));
            kotlin.jvm.internal.f0.o(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @kotlin.u0(version = "1.1")
    @sh.h
    @xh.h(name = "contentDeepToStringInline")
    @sh.f
    private static final <T> String S(T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        return l.h(tArr);
    }

    @kotlin.u0(version = "1.4")
    @xh.h(name = "contentToStringNullable")
    @sh.f
    private static final String S0(long[] jArr) {
        String string = Arrays.toString(jArr);
        kotlin.jvm.internal.f0.o(string, "toString(this)");
        return string;
    }

    @xh.h(name = "copyOfRangeInline")
    @sh.f
    private static final float[] S1(float[] fArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        if (sh.m.a(1, 3, 0)) {
            return J1(fArr, i10, i11);
        }
        if (i11 <= fArr.length) {
            float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, i10, i11);
            kotlin.jvm.internal.f0.o(fArrCopyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return fArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i11 + ", size: " + fArr.length);
    }

    @kotlin.k(message = "Use maxByOrNull instead.", replaceWith = @kotlin.s0(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T S2(T[] tArr, yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        int iXe = ArraysKt___ArraysKt.Xe(tArr);
        if (iXe != 0) {
            R rInvoke = selector.invoke(t10);
            k0 it = new fi.l(1, iXe).iterator();
            while (it.hasNext()) {
                T t11 = tArr[it.nextInt()];
                R rInvoke2 = selector.invoke(t11);
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    t10 = t11;
                    rInvoke = rInvoke2;
                }
            }
        }
        return t10;
    }

    @dl.d
    public static final int[] S3(@dl.d int[] iArr, @dl.d Collection<Integer> elements) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        int length = iArr.length;
        int[] result = Arrays.copyOf(iArr, elements.size() + length);
        Iterator<Integer> it = elements.iterator();
        while (it.hasNext()) {
            result[length] = it.next().intValue();
            length++;
        }
        kotlin.jvm.internal.f0.o(result, "result");
        return result;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfBigDecimal")
    @sh.f
    private static final BigDecimal S4(short[] sArr, yh.l<? super Short, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.f0.o(bigDecimalValueOf, "valueOf(this.toLong())");
        for (short s10 : sArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Short.valueOf(s10)));
            kotlin.jvm.internal.f0.o(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @kotlin.u0(version = "1.4")
    @xh.h(name = "contentDeepToStringNullable")
    @sh.f
    private static final <T> String T(T[] tArr) {
        if (sh.m.a(1, 3, 0)) {
            return l.h(tArr);
        }
        String strDeepToString = Arrays.deepToString(tArr);
        kotlin.jvm.internal.f0.o(strDeepToString, "deepToString(this)");
        return strDeepToString;
    }

    @kotlin.u0(version = "1.4")
    @xh.h(name = "contentToStringNullable")
    @sh.f
    private static final <T> String T0(T[] tArr) {
        String string = Arrays.toString(tArr);
        kotlin.jvm.internal.f0.o(string, "toString(this)");
        return string;
    }

    @xh.h(name = "copyOfRangeInline")
    @sh.f
    private static final int[] T1(int[] iArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        if (sh.m.a(1, 3, 0)) {
            return K1(iArr, i10, i11);
        }
        if (i11 <= iArr.length) {
            int[] iArrCopyOfRange = Arrays.copyOfRange(iArr, i10, i11);
            kotlin.jvm.internal.f0.o(iArrCopyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return iArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i11 + ", size: " + iArr.length);
    }

    @kotlin.k(message = "Use maxByOrNull instead.", replaceWith = @kotlin.s0(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Short T2(short[] sArr, yh.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        int iYe = ArraysKt___ArraysKt.Ye(sArr);
        if (iYe == 0) {
            return Short.valueOf(s10);
        }
        R rInvoke = selector.invoke(Short.valueOf(s10));
        k0 it = new fi.l(1, iYe).iterator();
        while (it.hasNext()) {
            short s11 = sArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Short.valueOf(s11));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                s10 = s11;
                rInvoke = rInvoke2;
            }
        }
        return Short.valueOf(s10);
    }

    @dl.d
    public static final int[] T3(@dl.d int[] iArr, @dl.d int[] elements) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        int length = iArr.length;
        int length2 = elements.length;
        int[] result = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        kotlin.jvm.internal.f0.o(result, "result");
        return result;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfBigDecimal")
    @sh.f
    private static final BigDecimal T4(boolean[] zArr, yh.l<? super Boolean, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.f0.o(bigDecimalValueOf, "valueOf(this.toLong())");
        for (boolean z10 : zArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Boolean.valueOf(z10)));
            kotlin.jvm.internal.f0.o(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @kotlin.u0(version = "1.1")
    @kotlin.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @kotlin.l(hiddenSince = "1.4")
    @sh.f
    private static final /* synthetic */ boolean U(byte[] bArr, byte[] other) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        return Arrays.equals(bArr, other);
    }

    @kotlin.u0(version = "1.4")
    @xh.h(name = "contentToStringNullable")
    @sh.f
    private static final String U0(short[] sArr) {
        String string = Arrays.toString(sArr);
        kotlin.jvm.internal.f0.o(string, "toString(this)");
        return string;
    }

    @xh.h(name = "copyOfRangeInline")
    @sh.f
    private static final long[] U1(long[] jArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        if (sh.m.a(1, 3, 0)) {
            return L1(jArr, i10, i11);
        }
        if (i11 <= jArr.length) {
            long[] jArrCopyOfRange = Arrays.copyOfRange(jArr, i10, i11);
            kotlin.jvm.internal.f0.o(jArrCopyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return jArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i11 + ", size: " + jArr.length);
    }

    @kotlin.k(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.s0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Boolean U2(boolean[] zArr, Comparator comparator) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        return ArraysKt___ArraysKt.Cl(zArr, comparator);
    }

    @dl.d
    public static final long[] U3(@dl.d long[] jArr, long j10) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        int length = jArr.length;
        long[] result = Arrays.copyOf(jArr, length + 1);
        result[length] = j10;
        kotlin.jvm.internal.f0.o(result, "result");
        return result;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfBigInteger")
    @sh.f
    private static final BigInteger U4(byte[] bArr, yh.l<? super Byte, ? extends BigInteger> selector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.f0.o(bigIntegerValueOf, "valueOf(this.toLong())");
        for (byte b10 : bArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Byte.valueOf(b10)));
            kotlin.jvm.internal.f0.o(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @kotlin.u0(version = "1.1")
    @kotlin.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @kotlin.l(hiddenSince = "1.4")
    @sh.f
    private static final /* synthetic */ boolean V(char[] cArr, char[] other) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        return Arrays.equals(cArr, other);
    }

    @kotlin.u0(version = "1.4")
    @xh.h(name = "contentToStringNullable")
    @sh.f
    private static final String V0(boolean[] zArr) {
        String string = Arrays.toString(zArr);
        kotlin.jvm.internal.f0.o(string, "toString(this)");
        return string;
    }

    @xh.h(name = "copyOfRangeInline")
    @sh.f
    private static final <T> T[] V1(T[] tArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        if (sh.m.a(1, 3, 0)) {
            return (T[]) M1(tArr, i10, i11);
        }
        if (i11 <= tArr.length) {
            T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i10, i11);
            kotlin.jvm.internal.f0.o(tArr2, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return tArr2;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i11 + ", size: " + tArr.length);
    }

    @kotlin.k(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.s0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Byte V2(byte[] bArr, Comparator comparator) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        return ArraysKt___ArraysKt.Dl(bArr, comparator);
    }

    @dl.d
    public static final long[] V3(@dl.d long[] jArr, @dl.d Collection<Long> elements) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        int length = jArr.length;
        long[] result = Arrays.copyOf(jArr, elements.size() + length);
        Iterator<Long> it = elements.iterator();
        while (it.hasNext()) {
            result[length] = it.next().longValue();
            length++;
        }
        kotlin.jvm.internal.f0.o(result, "result");
        return result;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfBigInteger")
    @sh.f
    private static final BigInteger V4(char[] cArr, yh.l<? super Character, ? extends BigInteger> selector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.f0.o(bigIntegerValueOf, "valueOf(this.toLong())");
        for (char c10 : cArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Character.valueOf(c10)));
            kotlin.jvm.internal.f0.o(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @kotlin.u0(version = "1.1")
    @kotlin.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @kotlin.l(hiddenSince = "1.4")
    @sh.f
    private static final /* synthetic */ boolean W(double[] dArr, double[] other) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        return Arrays.equals(dArr, other);
    }

    @kotlin.u0(version = "1.3")
    @dl.d
    public static final byte[] W0(@dl.d byte[] bArr, @dl.d byte[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        System.arraycopy(bArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    @xh.h(name = "copyOfRangeInline")
    @sh.f
    private static final short[] W1(short[] sArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        if (sh.m.a(1, 3, 0)) {
            return N1(sArr, i10, i11);
        }
        if (i11 <= sArr.length) {
            short[] sArrCopyOfRange = Arrays.copyOfRange(sArr, i10, i11);
            kotlin.jvm.internal.f0.o(sArrCopyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return sArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i11 + ", size: " + sArr.length);
    }

    @kotlin.k(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.s0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Character W2(char[] cArr, Comparator comparator) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        return ArraysKt___ArraysKt.El(cArr, comparator);
    }

    @dl.d
    public static final long[] W3(@dl.d long[] jArr, @dl.d long[] elements) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        int length = jArr.length;
        int length2 = elements.length;
        long[] result = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        kotlin.jvm.internal.f0.o(result, "result");
        return result;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfBigInteger")
    @sh.f
    private static final BigInteger W4(double[] dArr, yh.l<? super Double, ? extends BigInteger> selector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.f0.o(bigIntegerValueOf, "valueOf(this.toLong())");
        for (double d10 : dArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Double.valueOf(d10)));
            kotlin.jvm.internal.f0.o(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @kotlin.u0(version = "1.1")
    @kotlin.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @kotlin.l(hiddenSince = "1.4")
    @sh.f
    private static final /* synthetic */ boolean X(float[] fArr, float[] other) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        return Arrays.equals(fArr, other);
    }

    @kotlin.u0(version = "1.3")
    @dl.d
    public static final char[] X0(@dl.d char[] cArr, @dl.d char[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        System.arraycopy(cArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    @xh.h(name = "copyOfRangeInline")
    @sh.f
    private static final boolean[] X1(boolean[] zArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        if (sh.m.a(1, 3, 0)) {
            return O1(zArr, i10, i11);
        }
        if (i11 <= zArr.length) {
            boolean[] zArrCopyOfRange = Arrays.copyOfRange(zArr, i10, i11);
            kotlin.jvm.internal.f0.o(zArrCopyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return zArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i11 + ", size: " + zArr.length);
    }

    @kotlin.k(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.s0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Double X2(double[] dArr, Comparator comparator) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        return ArraysKt___ArraysKt.Fl(dArr, comparator);
    }

    @dl.d
    public static final <T> T[] X3(@dl.d T[] tArr, T t10) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        int length = tArr.length;
        T[] result = (T[]) Arrays.copyOf(tArr, length + 1);
        result[length] = t10;
        kotlin.jvm.internal.f0.o(result, "result");
        return result;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfBigInteger")
    @sh.f
    private static final BigInteger X4(float[] fArr, yh.l<? super Float, ? extends BigInteger> selector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.f0.o(bigIntegerValueOf, "valueOf(this.toLong())");
        for (float f10 : fArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Float.valueOf(f10)));
            kotlin.jvm.internal.f0.o(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @kotlin.u0(version = "1.1")
    @kotlin.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @kotlin.l(hiddenSince = "1.4")
    @sh.f
    private static final /* synthetic */ boolean Y(int[] iArr, int[] other) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        return Arrays.equals(iArr, other);
    }

    @kotlin.u0(version = "1.3")
    @dl.d
    public static final double[] Y0(@dl.d double[] dArr, @dl.d double[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        System.arraycopy(dArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    @sh.f
    private static final byte Y1(byte[] bArr, int i10) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        return bArr[i10];
    }

    @kotlin.k(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.s0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Float Y2(float[] fArr, Comparator comparator) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        return ArraysKt___ArraysKt.Gl(fArr, comparator);
    }

    @dl.d
    public static final <T> T[] Y3(@dl.d T[] tArr, @dl.d Collection<? extends T> elements) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        int length = tArr.length;
        T[] result = (T[]) Arrays.copyOf(tArr, elements.size() + length);
        Iterator<? extends T> it = elements.iterator();
        while (it.hasNext()) {
            result[length] = it.next();
            length++;
        }
        kotlin.jvm.internal.f0.o(result, "result");
        return result;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfBigInteger")
    @sh.f
    private static final BigInteger Y4(int[] iArr, yh.l<? super Integer, ? extends BigInteger> selector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.f0.o(bigIntegerValueOf, "valueOf(this.toLong())");
        for (int i10 : iArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Integer.valueOf(i10)));
            kotlin.jvm.internal.f0.o(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @kotlin.u0(version = "1.1")
    @kotlin.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @kotlin.l(hiddenSince = "1.4")
    @sh.f
    private static final /* synthetic */ boolean Z(long[] jArr, long[] other) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        return Arrays.equals(jArr, other);
    }

    @kotlin.u0(version = "1.3")
    @dl.d
    public static final float[] Z0(@dl.d float[] fArr, @dl.d float[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        System.arraycopy(fArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    @sh.f
    private static final char Z1(char[] cArr, int i10) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        return cArr[i10];
    }

    @kotlin.k(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.s0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Integer Z2(int[] iArr, Comparator comparator) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        return ArraysKt___ArraysKt.Hl(iArr, comparator);
    }

    @dl.d
    public static final <T> T[] Z3(@dl.d T[] tArr, @dl.d T[] elements) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        int length = tArr.length;
        int length2 = elements.length;
        T[] result = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        kotlin.jvm.internal.f0.o(result, "result");
        return result;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfBigInteger")
    @sh.f
    private static final BigInteger Z4(long[] jArr, yh.l<? super Long, ? extends BigInteger> selector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.f0.o(bigIntegerValueOf, "valueOf(this.toLong())");
        for (long j10 : jArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Long.valueOf(j10)));
            kotlin.jvm.internal.f0.o(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @kotlin.u0(version = "1.1")
    @kotlin.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @kotlin.l(hiddenSince = "1.4")
    @sh.f
    private static final /* synthetic */ <T> boolean a0(T[] tArr, T[] other) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        return Arrays.equals(tArr, other);
    }

    @kotlin.u0(version = "1.3")
    @dl.d
    public static final int[] a1(@dl.d int[] iArr, @dl.d int[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        System.arraycopy(iArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    @sh.f
    private static final double a2(double[] dArr, int i10) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        return dArr[i10];
    }

    @kotlin.k(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.s0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Long a3(long[] jArr, Comparator comparator) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        return ArraysKt___ArraysKt.Il(jArr, comparator);
    }

    @dl.d
    public static final short[] a4(@dl.d short[] sArr, @dl.d Collection<Short> elements) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        int length = sArr.length;
        short[] result = Arrays.copyOf(sArr, elements.size() + length);
        Iterator<Short> it = elements.iterator();
        while (it.hasNext()) {
            result[length] = it.next().shortValue();
            length++;
        }
        kotlin.jvm.internal.f0.o(result, "result");
        return result;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfBigInteger")
    @sh.f
    private static final <T> BigInteger a5(T[] tArr, yh.l<? super T, ? extends BigInteger> selector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.f0.o(bigIntegerValueOf, "valueOf(this.toLong())");
        for (T t10 : tArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(t10));
            kotlin.jvm.internal.f0.o(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @kotlin.u0(version = "1.1")
    @kotlin.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @kotlin.l(hiddenSince = "1.4")
    @sh.f
    private static final /* synthetic */ boolean b0(short[] sArr, short[] other) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        return Arrays.equals(sArr, other);
    }

    @kotlin.u0(version = "1.3")
    @dl.d
    public static final long[] b1(@dl.d long[] jArr, @dl.d long[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        System.arraycopy(jArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    @sh.f
    private static final float b2(float[] fArr, int i10) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        return fArr[i10];
    }

    @kotlin.k(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.s0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Object b3(Object[] objArr, Comparator comparator) {
        kotlin.jvm.internal.f0.p(objArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        return ArraysKt___ArraysKt.Jl(objArr, comparator);
    }

    @dl.d
    public static final short[] b4(@dl.d short[] sArr, short s10) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        int length = sArr.length;
        short[] result = Arrays.copyOf(sArr, length + 1);
        result[length] = s10;
        kotlin.jvm.internal.f0.o(result, "result");
        return result;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfBigInteger")
    @sh.f
    private static final BigInteger b5(short[] sArr, yh.l<? super Short, ? extends BigInteger> selector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.f0.o(bigIntegerValueOf, "valueOf(this.toLong())");
        for (short s10 : sArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Short.valueOf(s10)));
            kotlin.jvm.internal.f0.o(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @kotlin.u0(version = "1.1")
    @kotlin.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @kotlin.l(hiddenSince = "1.4")
    @sh.f
    private static final /* synthetic */ boolean c0(boolean[] zArr, boolean[] other) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        return Arrays.equals(zArr, other);
    }

    @kotlin.u0(version = "1.3")
    @dl.d
    public static final <T> T[] c1(@dl.d T[] tArr, @dl.d T[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        System.arraycopy(tArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    @sh.f
    private static final int c2(int[] iArr, int i10) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        return iArr[i10];
    }

    @kotlin.k(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.s0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Short c3(short[] sArr, Comparator comparator) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        return ArraysKt___ArraysKt.Kl(sArr, comparator);
    }

    @dl.d
    public static final short[] c4(@dl.d short[] sArr, @dl.d short[] elements) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        int length = sArr.length;
        int length2 = elements.length;
        short[] result = Arrays.copyOf(sArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        kotlin.jvm.internal.f0.o(result, "result");
        return result;
    }

    @kotlin.u0(version = "1.4")
    @kotlin.l0
    @xh.h(name = "sumOfBigInteger")
    @sh.f
    private static final BigInteger c5(boolean[] zArr, yh.l<? super Boolean, ? extends BigInteger> selector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.f0.o(bigIntegerValueOf, "valueOf(this.toLong())");
        for (boolean z10 : zArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Boolean.valueOf(z10)));
            kotlin.jvm.internal.f0.o(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @kotlin.u0(version = "1.4")
    @xh.h(name = "contentEqualsNullable")
    @sh.f
    private static final boolean d0(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    @kotlin.u0(version = "1.3")
    @dl.d
    public static final short[] d1(@dl.d short[] sArr, @dl.d short[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        System.arraycopy(sArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    @sh.f
    private static final long d2(long[] jArr, int i10) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        return jArr[i10];
    }

    @kotlin.k(message = "Use minOrNull instead.", replaceWith = @kotlin.s0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Byte d3(byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        return ArraysKt___ArraysKt.Gn(bArr);
    }

    @dl.d
    public static final boolean[] d4(@dl.d boolean[] zArr, @dl.d Collection<Boolean> elements) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        int length = zArr.length;
        boolean[] result = Arrays.copyOf(zArr, elements.size() + length);
        Iterator<Boolean> it = elements.iterator();
        while (it.hasNext()) {
            result[length] = it.next().booleanValue();
            length++;
        }
        kotlin.jvm.internal.f0.o(result, "result");
        return result;
    }

    @dl.d
    public static final SortedSet<Byte> d5(@dl.d byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.Jy(bArr, new TreeSet());
    }

    @kotlin.u0(version = "1.4")
    @xh.h(name = "contentEqualsNullable")
    @sh.f
    private static final boolean e0(char[] cArr, char[] cArr2) {
        return Arrays.equals(cArr, cArr2);
    }

    @kotlin.u0(version = "1.3")
    @dl.d
    public static final boolean[] e1(@dl.d boolean[] zArr, @dl.d boolean[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        System.arraycopy(zArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    @sh.f
    private static final <T> T e2(T[] tArr, int i10) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        return tArr[i10];
    }

    @kotlin.k(message = "Use minOrNull instead.", replaceWith = @kotlin.s0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Character e3(char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        return ArraysKt___ArraysKt.Hn(cArr);
    }

    @dl.d
    public static final boolean[] e4(@dl.d boolean[] zArr, boolean z10) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        int length = zArr.length;
        boolean[] result = Arrays.copyOf(zArr, length + 1);
        result[length] = z10;
        kotlin.jvm.internal.f0.o(result, "result");
        return result;
    }

    @dl.d
    public static final SortedSet<Character> e5(@dl.d char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.Ky(cArr, new TreeSet());
    }

    @kotlin.u0(version = "1.4")
    @xh.h(name = "contentEqualsNullable")
    @sh.f
    private static final boolean f0(double[] dArr, double[] dArr2) {
        return Arrays.equals(dArr, dArr2);
    }

    public static /* synthetic */ byte[] f1(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        return W0(bArr, bArr2, i10, i11, i12);
    }

    @sh.f
    private static final short f2(short[] sArr, int i10) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        return sArr[i10];
    }

    @kotlin.k(message = "Use minOrNull instead.", replaceWith = @kotlin.s0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Comparable f3(Comparable[] comparableArr) {
        kotlin.jvm.internal.f0.p(comparableArr, "<this>");
        return ArraysKt___ArraysKt.In(comparableArr);
    }

    @dl.d
    public static final boolean[] f4(@dl.d boolean[] zArr, @dl.d boolean[] elements) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        int length = zArr.length;
        int length2 = elements.length;
        boolean[] result = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        kotlin.jvm.internal.f0.o(result, "result");
        return result;
    }

    @dl.d
    public static final SortedSet<Double> f5(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.Ly(dArr, new TreeSet());
    }

    @kotlin.u0(version = "1.4")
    @xh.h(name = "contentEqualsNullable")
    @sh.f
    private static final boolean g0(float[] fArr, float[] fArr2) {
        return Arrays.equals(fArr, fArr2);
    }

    public static /* synthetic */ char[] g1(char[] cArr, char[] cArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = cArr.length;
        }
        return X0(cArr, cArr2, i10, i11, i12);
    }

    @sh.f
    private static final boolean g2(boolean[] zArr, int i10) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        return zArr[i10];
    }

    @kotlin.k(message = "Use minOrNull instead.", replaceWith = @kotlin.s0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Double g3(double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        return ArraysKt___ArraysKt.Jn(dArr);
    }

    @sh.f
    private static final <T> T[] g4(T[] tArr, T t10) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        return (T[]) X3(tArr, t10);
    }

    @dl.d
    public static final SortedSet<Float> g5(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.My(fArr, new TreeSet());
    }

    @kotlin.u0(version = "1.4")
    @xh.h(name = "contentEqualsNullable")
    @sh.f
    private static final boolean h0(int[] iArr, int[] iArr2) {
        return Arrays.equals(iArr, iArr2);
    }

    public static /* synthetic */ double[] h1(double[] dArr, double[] dArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = dArr.length;
        }
        return Y0(dArr, dArr2, i10, i11, i12);
    }

    public static final void h2(@dl.d byte[] bArr, byte b10, int i10, int i11) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        Arrays.fill(bArr, i10, i11, b10);
    }

    @kotlin.u0(version = "1.1")
    @kotlin.k(message = "Use minOrNull instead.", replaceWith = @kotlin.s0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Double h3(Double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        return ArraysKt___ArraysKt.Kn(dArr);
    }

    public static final void h4(@dl.d byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        if (bArr.length > 1) {
            Arrays.sort(bArr);
        }
    }

    @dl.d
    public static final SortedSet<Integer> h5(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.Ny(iArr, new TreeSet());
    }

    @kotlin.u0(version = "1.4")
    @xh.h(name = "contentEqualsNullable")
    @sh.f
    private static final boolean i0(long[] jArr, long[] jArr2) {
        return Arrays.equals(jArr, jArr2);
    }

    public static /* synthetic */ float[] i1(float[] fArr, float[] fArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = fArr.length;
        }
        return Z0(fArr, fArr2, i10, i11, i12);
    }

    public static final void i2(@dl.d char[] cArr, char c10, int i10, int i11) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        Arrays.fill(cArr, i10, i11, c10);
    }

    @kotlin.k(message = "Use minOrNull instead.", replaceWith = @kotlin.s0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Float i3(float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        return ArraysKt___ArraysKt.Ln(fArr);
    }

    public static final void i4(@dl.d byte[] bArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        Arrays.sort(bArr, i10, i11);
    }

    @dl.d
    public static final SortedSet<Long> i5(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.Oy(jArr, new TreeSet());
    }

    @kotlin.u0(version = "1.4")
    @xh.h(name = "contentEqualsNullable")
    @sh.f
    private static final <T> boolean j0(T[] tArr, T[] tArr2) {
        return Arrays.equals(tArr, tArr2);
    }

    public static /* synthetic */ int[] j1(int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = iArr.length;
        }
        return a1(iArr, iArr2, i10, i11, i12);
    }

    public static final void j2(@dl.d double[] dArr, double d10, int i10, int i11) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        Arrays.fill(dArr, i10, i11, d10);
    }

    @kotlin.u0(version = "1.1")
    @kotlin.k(message = "Use minOrNull instead.", replaceWith = @kotlin.s0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Float j3(Float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        return ArraysKt___ArraysKt.Mn(fArr);
    }

    public static final void j4(@dl.d char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        if (cArr.length > 1) {
            Arrays.sort(cArr);
        }
    }

    @dl.d
    public static final <T extends Comparable<? super T>> SortedSet<T> j5(@dl.d T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.Py(tArr, new TreeSet());
    }

    @kotlin.u0(version = "1.4")
    @xh.h(name = "contentEqualsNullable")
    @sh.f
    private static final boolean k0(short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    public static /* synthetic */ long[] k1(long[] jArr, long[] jArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = jArr.length;
        }
        return b1(jArr, jArr2, i10, i11, i12);
    }

    public static final void k2(@dl.d float[] fArr, float f10, int i10, int i11) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        Arrays.fill(fArr, i10, i11, f10);
    }

    @kotlin.k(message = "Use minOrNull instead.", replaceWith = @kotlin.s0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Integer k3(int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        return ArraysKt___ArraysKt.Nn(iArr);
    }

    public static final void k4(@dl.d char[] cArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        Arrays.sort(cArr, i10, i11);
    }

    @dl.d
    public static final <T> SortedSet<T> k5(@dl.d T[] tArr, @dl.d Comparator<? super T> comparator) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        return (SortedSet) ArraysKt___ArraysKt.Py(tArr, new TreeSet(comparator));
    }

    @kotlin.u0(version = "1.4")
    @xh.h(name = "contentEqualsNullable")
    @sh.f
    private static final boolean l0(boolean[] zArr, boolean[] zArr2) {
        return Arrays.equals(zArr, zArr2);
    }

    public static /* synthetic */ Object[] l1(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return c1(objArr, objArr2, i10, i11, i12);
    }

    public static final void l2(@dl.d int[] iArr, int i10, int i11, int i12) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        Arrays.fill(iArr, i11, i12, i10);
    }

    @kotlin.k(message = "Use minOrNull instead.", replaceWith = @kotlin.s0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Long l3(long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        return ArraysKt___ArraysKt.On(jArr);
    }

    public static final void l4(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        if (dArr.length > 1) {
            Arrays.sort(dArr);
        }
    }

    @dl.d
    public static final SortedSet<Short> l5(@dl.d short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.Qy(sArr, new TreeSet());
    }

    @kotlin.u0(version = "1.1")
    @kotlin.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @kotlin.l(hiddenSince = "1.4")
    @sh.f
    private static final /* synthetic */ int m0(byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        return Arrays.hashCode(bArr);
    }

    public static /* synthetic */ short[] m1(short[] sArr, short[] sArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = sArr.length;
        }
        return d1(sArr, sArr2, i10, i11, i12);
    }

    public static final void m2(@dl.d long[] jArr, long j10, int i10, int i11) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        Arrays.fill(jArr, i10, i11, j10);
    }

    @kotlin.k(message = "Use minOrNull instead.", replaceWith = @kotlin.s0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Short m3(short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        return ArraysKt___ArraysKt.Pn(sArr);
    }

    public static final void m4(@dl.d double[] dArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        Arrays.sort(dArr, i10, i11);
    }

    @dl.d
    public static final SortedSet<Boolean> m5(@dl.d boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.Ry(zArr, new TreeSet());
    }

    @dl.d
    public static final List<Byte> n(@dl.d byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        return new a(bArr);
    }

    @kotlin.u0(version = "1.1")
    @kotlin.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @kotlin.l(hiddenSince = "1.4")
    @sh.f
    private static final /* synthetic */ int n0(char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        return Arrays.hashCode(cArr);
    }

    public static /* synthetic */ boolean[] n1(boolean[] zArr, boolean[] zArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = zArr.length;
        }
        return e1(zArr, zArr2, i10, i11, i12);
    }

    public static final <T> void n2(@dl.d T[] tArr, T t10, int i10, int i11) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        Arrays.fill(tArr, i10, i11, t10);
    }

    @kotlin.k(message = "Use minByOrNull instead.", replaceWith = @kotlin.s0(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean n3(boolean[] zArr, yh.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z10 = zArr[0];
        int iZe = ArraysKt___ArraysKt.Ze(zArr);
        if (iZe == 0) {
            return Boolean.valueOf(z10);
        }
        R rInvoke = selector.invoke(Boolean.valueOf(z10));
        k0 it = new fi.l(1, iZe).iterator();
        while (it.hasNext()) {
            boolean z11 = zArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Boolean.valueOf(z11));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                z10 = z11;
                rInvoke = rInvoke2;
            }
        }
        return Boolean.valueOf(z10);
    }

    public static final void n4(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        if (fArr.length > 1) {
            Arrays.sort(fArr);
        }
    }

    @dl.d
    public static final Boolean[] n5(@dl.d boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        Boolean[] boolArr = new Boolean[zArr.length];
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            boolArr[i10] = Boolean.valueOf(zArr[i10]);
        }
        return boolArr;
    }

    @dl.d
    public static final List<Character> o(@dl.d char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        return new h(cArr);
    }

    @kotlin.u0(version = "1.1")
    @kotlin.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @kotlin.l(hiddenSince = "1.4")
    @sh.f
    private static final /* synthetic */ int o0(double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        return Arrays.hashCode(dArr);
    }

    @sh.f
    private static final byte[] o1(byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.f0.o(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public static final void o2(@dl.d short[] sArr, short s10, int i10, int i11) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        Arrays.fill(sArr, i10, i11, s10);
    }

    @kotlin.k(message = "Use minByOrNull instead.", replaceWith = @kotlin.s0(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte o3(byte[] bArr, yh.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int iRe = ArraysKt___ArraysKt.Re(bArr);
        if (iRe == 0) {
            return Byte.valueOf(b10);
        }
        R rInvoke = selector.invoke(Byte.valueOf(b10));
        k0 it = new fi.l(1, iRe).iterator();
        while (it.hasNext()) {
            byte b11 = bArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Byte.valueOf(b11));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                b10 = b11;
                rInvoke = rInvoke2;
            }
        }
        return Byte.valueOf(b10);
    }

    public static final void o4(@dl.d float[] fArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        Arrays.sort(fArr, i10, i11);
    }

    @dl.d
    public static final Byte[] o5(@dl.d byte[] bArr) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        Byte[] bArr2 = new Byte[bArr.length];
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            bArr2[i10] = Byte.valueOf(bArr[i10]);
        }
        return bArr2;
    }

    @dl.d
    public static final List<Double> p(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        return new f(dArr);
    }

    @kotlin.u0(version = "1.1")
    @kotlin.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @kotlin.l(hiddenSince = "1.4")
    @sh.f
    private static final /* synthetic */ int p0(float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        return Arrays.hashCode(fArr);
    }

    @sh.f
    private static final byte[] p1(byte[] bArr, int i10) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
        kotlin.jvm.internal.f0.o(bArrCopyOf, "copyOf(this, newSize)");
        return bArrCopyOf;
    }

    public static final void p2(@dl.d boolean[] zArr, boolean z10, int i10, int i11) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        Arrays.fill(zArr, i10, i11, z10);
    }

    @kotlin.k(message = "Use minByOrNull instead.", replaceWith = @kotlin.s0(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character p3(char[] cArr, yh.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        int iSe = ArraysKt___ArraysKt.Se(cArr);
        if (iSe == 0) {
            return Character.valueOf(c10);
        }
        R rInvoke = selector.invoke(Character.valueOf(c10));
        k0 it = new fi.l(1, iSe).iterator();
        while (it.hasNext()) {
            char c11 = cArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Character.valueOf(c11));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                c10 = c11;
                rInvoke = rInvoke2;
            }
        }
        return Character.valueOf(c10);
    }

    public static final void p4(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        if (iArr.length > 1) {
            Arrays.sort(iArr);
        }
    }

    @dl.d
    public static final Character[] p5(@dl.d char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        Character[] chArr = new Character[cArr.length];
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            chArr[i10] = Character.valueOf(cArr[i10]);
        }
        return chArr;
    }

    @dl.d
    public static final List<Float> q(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        return new e(fArr);
    }

    @kotlin.u0(version = "1.1")
    @kotlin.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @kotlin.l(hiddenSince = "1.4")
    @sh.f
    private static final /* synthetic */ int q0(int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        return Arrays.hashCode(iArr);
    }

    @sh.f
    private static final char[] q1(char[] cArr) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length);
        kotlin.jvm.internal.f0.o(cArrCopyOf, "copyOf(this, size)");
        return cArrCopyOf;
    }

    public static /* synthetic */ void q2(byte[] bArr, byte b10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        h2(bArr, b10, i10, i11);
    }

    @kotlin.k(message = "Use minByOrNull instead.", replaceWith = @kotlin.s0(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Double q3(double[] dArr, yh.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d10 = dArr[0];
        int iTe = ArraysKt___ArraysKt.Te(dArr);
        if (iTe == 0) {
            return Double.valueOf(d10);
        }
        R rInvoke = selector.invoke(Double.valueOf(d10));
        k0 it = new fi.l(1, iTe).iterator();
        while (it.hasNext()) {
            double d11 = dArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Double.valueOf(d11));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                d10 = d11;
            }
        }
        return Double.valueOf(d10);
    }

    public static final void q4(@dl.d int[] iArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        Arrays.sort(iArr, i10, i11);
    }

    @dl.d
    public static final Double[] q5(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        Double[] dArr2 = new Double[dArr.length];
        int length = dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            dArr2[i10] = Double.valueOf(dArr[i10]);
        }
        return dArr2;
    }

    @dl.d
    public static final List<Integer> r(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        return new c(iArr);
    }

    @kotlin.u0(version = "1.1")
    @kotlin.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @kotlin.l(hiddenSince = "1.4")
    @sh.f
    private static final /* synthetic */ int r0(long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        return Arrays.hashCode(jArr);
    }

    @sh.f
    private static final char[] r1(char[] cArr, int i10) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        char[] cArrCopyOf = Arrays.copyOf(cArr, i10);
        kotlin.jvm.internal.f0.o(cArrCopyOf, "copyOf(this, newSize)");
        return cArrCopyOf;
    }

    public static /* synthetic */ void r2(char[] cArr, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = cArr.length;
        }
        i2(cArr, c10, i10, i11);
    }

    @kotlin.k(message = "Use minByOrNull instead.", replaceWith = @kotlin.s0(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Float r3(float[] fArr, yh.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f10 = fArr[0];
        int iUe = ArraysKt___ArraysKt.Ue(fArr);
        if (iUe == 0) {
            return Float.valueOf(f10);
        }
        R rInvoke = selector.invoke(Float.valueOf(f10));
        k0 it = new fi.l(1, iUe).iterator();
        while (it.hasNext()) {
            float f11 = fArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Float.valueOf(f11));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                f10 = f11;
                rInvoke = rInvoke2;
            }
        }
        return Float.valueOf(f10);
    }

    public static final void r4(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        if (jArr.length > 1) {
            Arrays.sort(jArr);
        }
    }

    @dl.d
    public static final Float[] r5(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            fArr2[i10] = Float.valueOf(fArr[i10]);
        }
        return fArr2;
    }

    @dl.d
    public static final List<Long> s(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        return new d(jArr);
    }

    @kotlin.u0(version = "1.1")
    @kotlin.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @kotlin.l(hiddenSince = "1.4")
    @sh.f
    private static final /* synthetic */ <T> int s0(T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        return Arrays.hashCode(tArr);
    }

    @sh.f
    private static final double[] s1(double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        double[] dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
        kotlin.jvm.internal.f0.o(dArrCopyOf, "copyOf(this, size)");
        return dArrCopyOf;
    }

    public static /* synthetic */ void s2(double[] dArr, double d10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = dArr.length;
        }
        j2(dArr, d10, i10, i11);
    }

    @kotlin.k(message = "Use minByOrNull instead.", replaceWith = @kotlin.s0(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer s3(int[] iArr, yh.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int iVe = ArraysKt___ArraysKt.Ve(iArr);
        if (iVe == 0) {
            return Integer.valueOf(i10);
        }
        R rInvoke = selector.invoke(Integer.valueOf(i10));
        k0 it = new fi.l(1, iVe).iterator();
        while (it.hasNext()) {
            int i11 = iArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Integer.valueOf(i11));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                i10 = i11;
                rInvoke = rInvoke2;
            }
        }
        return Integer.valueOf(i10);
    }

    public static final void s4(@dl.d long[] jArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        Arrays.sort(jArr, i10, i11);
    }

    @dl.d
    public static final Integer[] s5(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            numArr[i10] = Integer.valueOf(iArr[i10]);
        }
        return numArr;
    }

    @dl.d
    public static final <T> List<T> t(@dl.d T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        List<T> listA = n.a(tArr);
        kotlin.jvm.internal.f0.o(listA, "asList(this)");
        return listA;
    }

    @kotlin.u0(version = "1.1")
    @kotlin.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @kotlin.l(hiddenSince = "1.4")
    @sh.f
    private static final /* synthetic */ int t0(short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        return Arrays.hashCode(sArr);
    }

    @sh.f
    private static final double[] t1(double[] dArr, int i10) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        double[] dArrCopyOf = Arrays.copyOf(dArr, i10);
        kotlin.jvm.internal.f0.o(dArrCopyOf, "copyOf(this, newSize)");
        return dArrCopyOf;
    }

    public static /* synthetic */ void t2(float[] fArr, float f10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length;
        }
        k2(fArr, f10, i10, i11);
    }

    @kotlin.k(message = "Use minByOrNull instead.", replaceWith = @kotlin.s0(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Long t3(long[] jArr, yh.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int iWe = ArraysKt___ArraysKt.We(jArr);
        if (iWe == 0) {
            return Long.valueOf(j10);
        }
        R rInvoke = selector.invoke(Long.valueOf(j10));
        k0 it = new fi.l(1, iWe).iterator();
        while (it.hasNext()) {
            long j11 = jArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Long.valueOf(j11));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                j10 = j11;
            }
        }
        return Long.valueOf(j10);
    }

    @sh.f
    private static final <T extends Comparable<? super T>> void t4(T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        v4(tArr);
    }

    @dl.d
    public static final Long[] t5(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        Long[] lArr = new Long[jArr.length];
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            lArr[i10] = Long.valueOf(jArr[i10]);
        }
        return lArr;
    }

    @dl.d
    public static final List<Short> u(@dl.d short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        return new b(sArr);
    }

    @kotlin.u0(version = "1.1")
    @kotlin.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @kotlin.l(hiddenSince = "1.4")
    @sh.f
    private static final /* synthetic */ int u0(boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        return Arrays.hashCode(zArr);
    }

    @sh.f
    private static final float[] u1(float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        kotlin.jvm.internal.f0.o(fArrCopyOf, "copyOf(this, size)");
        return fArrCopyOf;
    }

    public static /* synthetic */ void u2(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = iArr.length;
        }
        l2(iArr, i10, i11, i12);
    }

    @kotlin.k(message = "Use minByOrNull instead.", replaceWith = @kotlin.s0(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T u3(T[] tArr, yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        int iXe = ArraysKt___ArraysKt.Xe(tArr);
        if (iXe != 0) {
            R rInvoke = selector.invoke(t10);
            k0 it = new fi.l(1, iXe).iterator();
            while (it.hasNext()) {
                T t11 = tArr[it.nextInt()];
                R rInvoke2 = selector.invoke(t11);
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    t10 = t11;
                    rInvoke = rInvoke2;
                }
            }
        }
        return t10;
    }

    @kotlin.u0(version = "1.4")
    public static final <T extends Comparable<? super T>> void u4(@dl.d T[] tArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        Arrays.sort(tArr, i10, i11);
    }

    @dl.d
    public static final Short[] u5(@dl.d short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        Short[] shArr = new Short[sArr.length];
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            shArr[i10] = Short.valueOf(sArr[i10]);
        }
        return shArr;
    }

    @dl.d
    public static final List<Boolean> v(@dl.d boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        return new g(zArr);
    }

    @kotlin.u0(version = "1.4")
    @xh.h(name = "contentHashCodeNullable")
    @sh.f
    private static final int v0(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    @sh.f
    private static final float[] v1(float[] fArr, int i10) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        float[] fArrCopyOf = Arrays.copyOf(fArr, i10);
        kotlin.jvm.internal.f0.o(fArrCopyOf, "copyOf(this, newSize)");
        return fArrCopyOf;
    }

    public static /* synthetic */ void v2(long[] jArr, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length;
        }
        m2(jArr, j10, i10, i11);
    }

    @kotlin.k(message = "Use minByOrNull instead.", replaceWith = @kotlin.s0(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Short v3(short[] sArr, yh.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        int iYe = ArraysKt___ArraysKt.Ye(sArr);
        if (iYe == 0) {
            return Short.valueOf(s10);
        }
        R rInvoke = selector.invoke(Short.valueOf(s10));
        k0 it = new fi.l(1, iYe).iterator();
        while (it.hasNext()) {
            short s11 = sArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Short.valueOf(s11));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                s10 = s11;
                rInvoke = rInvoke2;
            }
        }
        return Short.valueOf(s10);
    }

    public static final <T> void v4(@dl.d T[] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static final int w(@dl.d byte[] bArr, byte b10, int i10, int i11) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        return Arrays.binarySearch(bArr, i10, i11, b10);
    }

    @kotlin.u0(version = "1.4")
    @xh.h(name = "contentHashCodeNullable")
    @sh.f
    private static final int w0(char[] cArr) {
        return Arrays.hashCode(cArr);
    }

    @sh.f
    private static final int[] w1(int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        kotlin.jvm.internal.f0.o(iArrCopyOf, "copyOf(this, size)");
        return iArrCopyOf;
    }

    public static /* synthetic */ void w2(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        n2(objArr, obj, i10, i11);
    }

    @kotlin.k(message = "Use minWithOrNull instead.", replaceWith = @kotlin.s0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Boolean w3(boolean[] zArr, Comparator comparator) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        return ArraysKt___ArraysKt.ao(zArr, comparator);
    }

    public static final <T> void w4(@dl.d T[] tArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        Arrays.sort(tArr, i10, i11);
    }

    public static final int x(@dl.d char[] cArr, char c10, int i10, int i11) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        return Arrays.binarySearch(cArr, i10, i11, c10);
    }

    @kotlin.u0(version = "1.4")
    @xh.h(name = "contentHashCodeNullable")
    @sh.f
    private static final int x0(double[] dArr) {
        return Arrays.hashCode(dArr);
    }

    @sh.f
    private static final int[] x1(int[] iArr, int i10) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
        kotlin.jvm.internal.f0.o(iArrCopyOf, "copyOf(this, newSize)");
        return iArrCopyOf;
    }

    public static /* synthetic */ void x2(short[] sArr, short s10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = sArr.length;
        }
        o2(sArr, s10, i10, i11);
    }

    @kotlin.k(message = "Use minWithOrNull instead.", replaceWith = @kotlin.s0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Byte x3(byte[] bArr, Comparator comparator) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        return ArraysKt___ArraysKt.bo(bArr, comparator);
    }

    public static final void x4(@dl.d short[] sArr) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        if (sArr.length > 1) {
            Arrays.sort(sArr);
        }
    }

    public static final int y(@dl.d double[] dArr, double d10, int i10, int i11) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        return Arrays.binarySearch(dArr, i10, i11, d10);
    }

    @kotlin.u0(version = "1.4")
    @xh.h(name = "contentHashCodeNullable")
    @sh.f
    private static final int y0(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    @sh.f
    private static final long[] y1(long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        kotlin.jvm.internal.f0.o(jArrCopyOf, "copyOf(this, size)");
        return jArrCopyOf;
    }

    public static /* synthetic */ void y2(boolean[] zArr, boolean z10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = zArr.length;
        }
        p2(zArr, z10, i10, i11);
    }

    @kotlin.k(message = "Use minWithOrNull instead.", replaceWith = @kotlin.s0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Character y3(char[] cArr, Comparator comparator) {
        kotlin.jvm.internal.f0.p(cArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        return ArraysKt___ArraysKt.co(cArr, comparator);
    }

    public static final void y4(@dl.d short[] sArr, int i10, int i11) {
        kotlin.jvm.internal.f0.p(sArr, "<this>");
        Arrays.sort(sArr, i10, i11);
    }

    public static final int z(@dl.d float[] fArr, float f10, int i10, int i11) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        return Arrays.binarySearch(fArr, i10, i11, f10);
    }

    @kotlin.u0(version = "1.4")
    @xh.h(name = "contentHashCodeNullable")
    @sh.f
    private static final int z0(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    @sh.f
    private static final long[] z1(long[] jArr, int i10) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
        kotlin.jvm.internal.f0.o(jArrCopyOf, "copyOf(this, newSize)");
        return jArrCopyOf;
    }

    @dl.d
    public static final <R> List<R> z2(@dl.d Object[] objArr, @dl.d Class<R> klass) {
        kotlin.jvm.internal.f0.p(objArr, "<this>");
        kotlin.jvm.internal.f0.p(klass, "klass");
        return (List) A2(objArr, new ArrayList(), klass);
    }

    @kotlin.k(message = "Use minWithOrNull instead.", replaceWith = @kotlin.s0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Double z3(double[] dArr, Comparator comparator) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        return ArraysKt___ArraysKt.m782do(dArr, comparator);
    }

    public static /* synthetic */ void z4(byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = bArr.length;
        }
        i4(bArr, i10, i11);
    }
}
