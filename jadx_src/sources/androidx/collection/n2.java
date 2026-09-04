package androidx.collection;

import java.util.Iterator;
import kotlin.DeprecationLevel;

/* JADX INFO: compiled from: SparseArray.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n2 {

    /* JADX INFO: compiled from: SparseArray.kt */
    public static final class a extends kotlin.collections.k0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l2<T> f3669c;

        a(l2<T> l2Var) {
            this.f3669c = l2Var;
        }

        public final int a() {
            return this.f3668b;
        }

        public final void b(int i10) {
            this.f3668b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3668b < this.f3669c.x();
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
        @Override // kotlin.collections.k0
        public int nextInt() {
            l2<T> l2Var = this.f3669c;
            int i10 = this.f3668b;
            this.f3668b = i10 + 1;
            return l2Var.m(i10);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SparseArray.kt */
    public static final class b<T> implements Iterator<T>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3670b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l2<T> f3671c;

        b(l2<T> l2Var) {
            this.f3671c = l2Var;
        }

        public final int a() {
            return this.f3670b;
        }

        public final void b(int i10) {
            this.f3670b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3670b < this.f3671c.x();
        }

        @Override // java.util.Iterator
        public T next() {
            l2<T> l2Var = this.f3671c;
            int i10 = this.f3670b;
            this.f3670b = i10 + 1;
            return l2Var.y(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> boolean a(@dl.d l2<T> l2Var, int i10) {
        kotlin.jvm.internal.f0.p(l2Var, "<this>");
        return l2Var.d(i10);
    }

    public static final <T> void b(@dl.d l2<T> l2Var, @dl.d yh.p<? super Integer, ? super T, kotlin.b2> action) {
        kotlin.jvm.internal.f0.p(l2Var, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        int iX = l2Var.x();
        for (int i10 = 0; i10 < iX; i10++) {
            action.invoke(Integer.valueOf(l2Var.m(i10)), l2Var.y(i10));
        }
    }

    public static final <T> T c(@dl.d l2<T> l2Var, int i10, T t10) {
        kotlin.jvm.internal.f0.p(l2Var, "<this>");
        return l2Var.h(i10, t10);
    }

    public static final <T> T d(@dl.d l2<T> l2Var, int i10, @dl.d yh.a<? extends T> defaultValue) {
        kotlin.jvm.internal.f0.p(l2Var, "<this>");
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        T tG = l2Var.g(i10);
        return tG == null ? defaultValue.invoke() : tG;
    }

    public static final <T> int e(@dl.d l2<T> l2Var) {
        kotlin.jvm.internal.f0.p(l2Var, "<this>");
        return l2Var.x();
    }

    public static final <T> boolean f(@dl.d l2<T> l2Var) {
        kotlin.jvm.internal.f0.p(l2Var, "<this>");
        return !l2Var.l();
    }

    @dl.d
    public static final <T> kotlin.collections.k0 g(@dl.d l2<T> l2Var) {
        kotlin.jvm.internal.f0.p(l2Var, "<this>");
        return new a(l2Var);
    }

    @dl.d
    public static final <T> l2<T> h(@dl.d l2<T> l2Var, @dl.d l2<T> other) {
        kotlin.jvm.internal.f0.p(l2Var, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        l2<T> l2Var2 = new l2<>(l2Var.x() + other.x());
        l2Var2.o(l2Var);
        l2Var2.o(other);
        return l2Var2;
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Replaced with member function. Remove extension import!")
    public static final /* synthetic */ boolean i(l2 l2Var, int i10, Object obj) {
        kotlin.jvm.internal.f0.p(l2Var, "<this>");
        return l2Var.r(i10, obj);
    }

    public static final <T> void j(@dl.d l2<T> l2Var, int i10, T t10) {
        kotlin.jvm.internal.f0.p(l2Var, "<this>");
        l2Var.n(i10, t10);
    }

    @dl.d
    public static final <T> Iterator<T> k(@dl.d l2<T> l2Var) {
        kotlin.jvm.internal.f0.p(l2Var, "<this>");
        return new b(l2Var);
    }
}
