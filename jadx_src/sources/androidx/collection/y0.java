package androidx.collection;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.DeprecationLevel;

/* JADX INFO: compiled from: LongSparseArray.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nLongSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n*L\n1#1,606:1\n256#1,6:607\n256#1,6:613\n328#1,18:619\n328#1,18:637\n328#1,18:655\n328#1,18:673\n328#1,18:691\n328#1,18:709\n328#1,18:727\n328#1,18:745\n*S KotlinDebug\n*F\n+ 1 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n*L\n243#1:607,6\n248#1:613,6\n360#1:619,18\n410#1:637,18\n425#1:655,18\n437#1:673,18\n451#1:691,18\n459#1:709,18\n467#1:727,18\n505#1:745,18\n*E\n"})
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final Object f3746a = new Object();

    /* JADX INFO: compiled from: LongSparseArray.kt */
    public static final class a extends kotlin.collections.l0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3747b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ x0<T> f3748c;

        a(x0<T> x0Var) {
            this.f3748c = x0Var;
        }

        public final int a() {
            return this.f3747b;
        }

        public final void b(int i10) {
            this.f3747b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3747b < this.f3748c.v();
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.collections.l0
        public long nextLong() {
            x0<T> x0Var = this.f3748c;
            int i10 = this.f3747b;
            this.f3747b = i10 + 1;
            return x0Var.l(i10);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: LongSparseArray.kt */
    public static final class b<T> implements Iterator<T>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3749b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ x0<T> f3750c;

        b(x0<T> x0Var) {
            this.f3750c = x0Var;
        }

        public final int a() {
            return this.f3749b;
        }

        public final void b(int i10) {
            this.f3749b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3749b < this.f3750c.v();
        }

        @Override // java.util.Iterator
        public T next() {
            x0<T> x0Var = this.f3750c;
            int i10 = this.f3749b;
            this.f3749b = i10 + 1;
            return x0Var.w(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> void A(@dl.d x0<T> x0Var, @dl.d yh.p<? super Long, ? super T, kotlin.b2> action) {
        kotlin.jvm.internal.f0.p(x0Var, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        int iV = x0Var.v();
        for (int i10 = 0; i10 < iV; i10++) {
            action.invoke(Long.valueOf(x0Var.l(i10)), x0Var.w(i10));
        }
    }

    public static final <T> T B(@dl.d x0<T> x0Var, long j10, T t10) {
        kotlin.jvm.internal.f0.p(x0Var, "<this>");
        return x0Var.h(j10, t10);
    }

    public static final <T> T C(@dl.d x0<T> x0Var, long j10, @dl.d yh.a<? extends T> defaultValue) {
        kotlin.jvm.internal.f0.p(x0Var, "<this>");
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        T tG = x0Var.g(j10);
        return tG == null ? defaultValue.invoke() : tG;
    }

    public static final <T> int D(@dl.d x0<T> x0Var) {
        kotlin.jvm.internal.f0.p(x0Var, "<this>");
        return x0Var.v();
    }

    public static /* synthetic */ void E(x0 x0Var) {
    }

    public static final <T> boolean F(@dl.d x0<T> x0Var) {
        kotlin.jvm.internal.f0.p(x0Var, "<this>");
        return !x0Var.k();
    }

    @dl.d
    public static final <T> kotlin.collections.l0 G(@dl.d x0<T> x0Var) {
        kotlin.jvm.internal.f0.p(x0Var, "<this>");
        return new a(x0Var);
    }

    @dl.d
    public static final <T> x0<T> H(@dl.d x0<T> x0Var, @dl.d x0<T> other) {
        kotlin.jvm.internal.f0.p(x0Var, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        x0<T> x0Var2 = new x0<>(x0Var.v() + other.v());
        x0Var2.n(x0Var);
        x0Var2.n(other);
        return x0Var2;
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Replaced with member function. Remove extension import!")
    public static final /* synthetic */ boolean I(x0 x0Var, long j10, Object obj) {
        kotlin.jvm.internal.f0.p(x0Var, "<this>");
        return x0Var.q(j10, obj);
    }

    public static final <T> void J(@dl.d x0<T> x0Var, long j10, T t10) {
        kotlin.jvm.internal.f0.p(x0Var, "<this>");
        x0Var.m(j10, t10);
    }

    @dl.d
    public static final <T> Iterator<T> K(@dl.d x0<T> x0Var) {
        kotlin.jvm.internal.f0.p(x0Var, "<this>");
        return new b(x0Var);
    }

    public static final <E> void b(@dl.d x0<E> x0Var, long j10, E e10) {
        kotlin.jvm.internal.f0.p(x0Var, "<this>");
        int i10 = x0Var.f3737e;
        if (i10 != 0 && j10 <= x0Var.f3735c[i10 - 1]) {
            x0Var.m(j10, e10);
            return;
        }
        if (x0Var.f3734b) {
            long[] jArr = x0Var.f3735c;
            if (i10 >= jArr.length) {
                Object[] objArr = x0Var.f3736d;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj = objArr[i12];
                    if (obj != f3746a) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr[i11] = obj;
                            objArr[i12] = null;
                        }
                        i11++;
                    }
                }
                x0Var.f3734b = false;
                x0Var.f3737e = i11;
            }
        }
        int i13 = x0Var.f3737e;
        if (i13 >= x0Var.f3735c.length) {
            int iF = i0.a.f(i13 + 1);
            long[] jArrCopyOf = Arrays.copyOf(x0Var.f3735c, iF);
            kotlin.jvm.internal.f0.o(jArrCopyOf, "copyOf(this, newSize)");
            x0Var.f3735c = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(x0Var.f3736d, iF);
            kotlin.jvm.internal.f0.o(objArrCopyOf, "copyOf(this, newSize)");
            x0Var.f3736d = objArrCopyOf;
        }
        x0Var.f3735c[i13] = j10;
        x0Var.f3736d[i13] = e10;
        x0Var.f3737e = i13 + 1;
    }

    public static final <E> void c(@dl.d x0<E> x0Var) {
        kotlin.jvm.internal.f0.p(x0Var, "<this>");
        int i10 = x0Var.f3737e;
        Object[] objArr = x0Var.f3736d;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        x0Var.f3737e = 0;
        x0Var.f3734b = false;
    }

    public static final <E> boolean d(@dl.d x0<E> x0Var, long j10) {
        kotlin.jvm.internal.f0.p(x0Var, "<this>");
        return x0Var.i(j10) >= 0;
    }

    public static final <E> boolean e(@dl.d x0<E> x0Var, E e10) {
        kotlin.jvm.internal.f0.p(x0Var, "<this>");
        return x0Var.j(e10) >= 0;
    }

    public static final <E> void f(@dl.d x0<E> x0Var) {
        kotlin.jvm.internal.f0.p(x0Var, "<this>");
        int i10 = x0Var.f3737e;
        long[] jArr = x0Var.f3735c;
        Object[] objArr = x0Var.f3736d;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f3746a) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        x0Var.f3734b = false;
        x0Var.f3737e = i11;
    }

    @dl.e
    public static final <E> E g(@dl.d x0<E> x0Var, long j10) {
        kotlin.jvm.internal.f0.p(x0Var, "<this>");
        int iB = i0.a.b(x0Var.f3735c, x0Var.f3737e, j10);
        if (iB < 0 || x0Var.f3736d[iB] == f3746a) {
            return null;
        }
        return (E) x0Var.f3736d[iB];
    }

    public static final <E> E h(@dl.d x0<E> x0Var, long j10, E e10) {
        kotlin.jvm.internal.f0.p(x0Var, "<this>");
        int iB = i0.a.b(x0Var.f3735c, x0Var.f3737e, j10);
        return (iB < 0 || x0Var.f3736d[iB] == f3746a) ? e10 : (E) x0Var.f3736d[iB];
    }

    public static final <T extends E, E> T i(@dl.d x0<E> x0Var, long j10, T t10) {
        kotlin.jvm.internal.f0.p(x0Var, "<this>");
        int iB = i0.a.b(x0Var.f3735c, x0Var.f3737e, j10);
        return (iB < 0 || x0Var.f3736d[iB] == f3746a) ? t10 : (T) x0Var.f3736d[iB];
    }

    public static final <E> int j(@dl.d x0<E> x0Var, long j10) {
        kotlin.jvm.internal.f0.p(x0Var, "<this>");
        if (x0Var.f3734b) {
            int i10 = x0Var.f3737e;
            long[] jArr = x0Var.f3735c;
            Object[] objArr = x0Var.f3736d;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != f3746a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            x0Var.f3734b = false;
            x0Var.f3737e = i11;
        }
        return i0.a.b(x0Var.f3735c, x0Var.f3737e, j10);
    }

    public static final <E> int k(@dl.d x0<E> x0Var, E e10) {
        kotlin.jvm.internal.f0.p(x0Var, "<this>");
        if (x0Var.f3734b) {
            int i10 = x0Var.f3737e;
            long[] jArr = x0Var.f3735c;
            Object[] objArr = x0Var.f3736d;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != f3746a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            x0Var.f3734b = false;
            x0Var.f3737e = i11;
        }
        int i13 = x0Var.f3737e;
        for (int i14 = 0; i14 < i13; i14++) {
            if (x0Var.f3736d[i14] == e10) {
                return i14;
            }
        }
        return -1;
    }

    public static final <E> boolean l(@dl.d x0<E> x0Var) {
        kotlin.jvm.internal.f0.p(x0Var, "<this>");
        return x0Var.v() == 0;
    }

    public static final <E> long m(@dl.d x0<E> x0Var, int i10) {
        kotlin.jvm.internal.f0.p(x0Var, "<this>");
        if (!(i10 >= 0 && i10 < x0Var.f3737e)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
        }
        if (x0Var.f3734b) {
            int i11 = x0Var.f3737e;
            long[] jArr = x0Var.f3735c;
            Object[] objArr = x0Var.f3736d;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != f3746a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            x0Var.f3734b = false;
            x0Var.f3737e = i12;
        }
        return x0Var.f3735c[i10];
    }

    public static final <E> void n(@dl.d x0<E> x0Var, long j10, E e10) {
        kotlin.jvm.internal.f0.p(x0Var, "<this>");
        int iB = i0.a.b(x0Var.f3735c, x0Var.f3737e, j10);
        if (iB >= 0) {
            x0Var.f3736d[iB] = e10;
            return;
        }
        int i10 = ~iB;
        if (i10 < x0Var.f3737e && x0Var.f3736d[i10] == f3746a) {
            x0Var.f3735c[i10] = j10;
            x0Var.f3736d[i10] = e10;
            return;
        }
        if (x0Var.f3734b) {
            int i11 = x0Var.f3737e;
            long[] jArr = x0Var.f3735c;
            if (i11 >= jArr.length) {
                Object[] objArr = x0Var.f3736d;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj = objArr[i13];
                    if (obj != f3746a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                x0Var.f3734b = false;
                x0Var.f3737e = i12;
                i10 = ~i0.a.b(x0Var.f3735c, i12, j10);
            }
        }
        int i14 = x0Var.f3737e;
        if (i14 >= x0Var.f3735c.length) {
            int iF = i0.a.f(i14 + 1);
            long[] jArrCopyOf = Arrays.copyOf(x0Var.f3735c, iF);
            kotlin.jvm.internal.f0.o(jArrCopyOf, "copyOf(this, newSize)");
            x0Var.f3735c = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(x0Var.f3736d, iF);
            kotlin.jvm.internal.f0.o(objArrCopyOf, "copyOf(this, newSize)");
            x0Var.f3736d = objArrCopyOf;
        }
        int i15 = x0Var.f3737e;
        if (i15 - i10 != 0) {
            long[] jArr2 = x0Var.f3735c;
            int i16 = i10 + 1;
            kotlin.collections.m.b1(jArr2, jArr2, i16, i10, i15);
            Object[] objArr2 = x0Var.f3736d;
            kotlin.collections.m.c1(objArr2, objArr2, i16, i10, x0Var.f3737e);
        }
        x0Var.f3735c[i10] = j10;
        x0Var.f3736d[i10] = e10;
        x0Var.f3737e++;
    }

    public static final <E> void o(@dl.d x0<E> x0Var, @dl.d x0<? extends E> other) {
        kotlin.jvm.internal.f0.p(x0Var, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        int iV = other.v();
        for (int i10 = 0; i10 < iV; i10++) {
            x0Var.m(other.l(i10), other.w(i10));
        }
    }

    @dl.e
    public static final <E> E p(@dl.d x0<E> x0Var, long j10, E e10) {
        kotlin.jvm.internal.f0.p(x0Var, "<this>");
        E eG = x0Var.g(j10);
        if (eG == null) {
            x0Var.m(j10, e10);
        }
        return eG;
    }

    public static final <E> void q(@dl.d x0<E> x0Var, long j10) {
        kotlin.jvm.internal.f0.p(x0Var, "<this>");
        int iB = i0.a.b(x0Var.f3735c, x0Var.f3737e, j10);
        if (iB < 0 || x0Var.f3736d[iB] == f3746a) {
            return;
        }
        x0Var.f3736d[iB] = f3746a;
        x0Var.f3734b = true;
    }

    public static final <E> boolean r(@dl.d x0<E> x0Var, long j10, E e10) {
        kotlin.jvm.internal.f0.p(x0Var, "<this>");
        int i10 = x0Var.i(j10);
        if (i10 < 0 || !kotlin.jvm.internal.f0.g(e10, x0Var.w(i10))) {
            return false;
        }
        x0Var.r(i10);
        return true;
    }

    public static final <E> void s(@dl.d x0<E> x0Var, int i10) {
        kotlin.jvm.internal.f0.p(x0Var, "<this>");
        if (x0Var.f3736d[i10] != f3746a) {
            x0Var.f3736d[i10] = f3746a;
            x0Var.f3734b = true;
        }
    }

    @dl.e
    public static final <E> E t(@dl.d x0<E> x0Var, long j10, E e10) {
        kotlin.jvm.internal.f0.p(x0Var, "<this>");
        int i10 = x0Var.i(j10);
        if (i10 < 0) {
            return null;
        }
        Object[] objArr = x0Var.f3736d;
        E e11 = (E) objArr[i10];
        objArr[i10] = e10;
        return e11;
    }

    public static final <E> boolean u(@dl.d x0<E> x0Var, long j10, E e10, E e11) {
        kotlin.jvm.internal.f0.p(x0Var, "<this>");
        int i10 = x0Var.i(j10);
        if (i10 < 0 || !kotlin.jvm.internal.f0.g(x0Var.f3736d[i10], e10)) {
            return false;
        }
        x0Var.f3736d[i10] = e11;
        return true;
    }

    public static final <E> void v(@dl.d x0<E> x0Var, int i10, E e10) {
        kotlin.jvm.internal.f0.p(x0Var, "<this>");
        if (!(i10 >= 0 && i10 < x0Var.f3737e)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
        }
        if (x0Var.f3734b) {
            int i11 = x0Var.f3737e;
            long[] jArr = x0Var.f3735c;
            Object[] objArr = x0Var.f3736d;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != f3746a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            x0Var.f3734b = false;
            x0Var.f3737e = i12;
        }
        x0Var.f3736d[i10] = e10;
    }

    public static final <E> int w(@dl.d x0<E> x0Var) {
        kotlin.jvm.internal.f0.p(x0Var, "<this>");
        if (x0Var.f3734b) {
            int i10 = x0Var.f3737e;
            long[] jArr = x0Var.f3735c;
            Object[] objArr = x0Var.f3736d;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != f3746a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            x0Var.f3734b = false;
            x0Var.f3737e = i11;
        }
        return x0Var.f3737e;
    }

    @dl.d
    public static final <E> String x(@dl.d x0<E> x0Var) {
        kotlin.jvm.internal.f0.p(x0Var, "<this>");
        if (x0Var.v() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(x0Var.f3737e * 28);
        sb2.append('{');
        int i10 = x0Var.f3737e;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(x0Var.l(i11));
            sb2.append(n5.a.f132013h);
            E eW = x0Var.w(i11);
            if (eW != sb2) {
                sb2.append(eW);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public static final <E> E y(@dl.d x0<E> x0Var, int i10) {
        kotlin.jvm.internal.f0.p(x0Var, "<this>");
        if (!(i10 >= 0 && i10 < x0Var.f3737e)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
        }
        if (x0Var.f3734b) {
            int i11 = x0Var.f3737e;
            long[] jArr = x0Var.f3735c;
            Object[] objArr = x0Var.f3736d;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != f3746a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            x0Var.f3734b = false;
            x0Var.f3737e = i12;
        }
        return (E) x0Var.f3736d[i10];
    }

    public static final <T> boolean z(@dl.d x0<T> x0Var, long j10) {
        kotlin.jvm.internal.f0.p(x0Var, "<this>");
        return x0Var.d(j10);
    }
}
