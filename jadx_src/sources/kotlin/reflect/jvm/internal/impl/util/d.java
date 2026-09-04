package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ArrayMap.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d<T> extends c<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    public static final a f128227d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private Object[] f128228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f128229c;

    /* JADX INFO: compiled from: ArrayMap.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: ArrayMap.kt */
    public static final class b extends kotlin.collections.a<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f128230d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ d<T> f128231e;

        b(d<T> dVar) {
            this.f128231e = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.collections.a
        protected void a() {
            do {
                int i10 = this.f128230d + 1;
                this.f128230d = i10;
                if (i10 >= ((d) this.f128231e).f128228b.length) {
                    break;
                }
            } while (((d) this.f128231e).f128228b[this.f128230d] == null);
            if (this.f128230d >= ((d) this.f128231e).f128228b.length) {
                b();
                return;
            }
            Object obj = ((d) this.f128231e).f128228b[this.f128230d];
            f0.n(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
            c(obj);
        }
    }

    public d() {
        this(new Object[20], 0);
    }

    private d(Object[] objArr, int i10) {
        super(null);
        this.f128228b = objArr;
        this.f128229c = i10;
    }

    private final void g(int i10) {
        Object[] objArr = this.f128228b;
        if (objArr.length <= i10) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length * 2);
            f0.o(objArrCopyOf, "copyOf(this, newSize)");
            this.f128228b = objArrCopyOf;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    public int a() {
        return this.f128229c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    public void b(int i10, @dl.d T value) {
        f0.p(value, "value");
        g(i10);
        if (this.f128228b[i10] == null) {
            this.f128229c = a() + 1;
        }
        this.f128228b[i10] = value;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    @dl.e
    public T get(int i10) {
        return (T) ArraysKt___ArraysKt.qf(this.f128228b, i10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c, java.lang.Iterable
    @dl.d
    public Iterator<T> iterator() {
        return new b(this);
    }
}
