package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.m;
import kotlin.collections.s;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: InternalUnderlyingValOfInlineClass.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class h implements c<Method> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Method f125311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final List<Type> f125312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final Type f125313c;

    /* JADX INFO: compiled from: InternalUnderlyingValOfInlineClass.kt */
    public static final class a extends h implements kotlin.reflect.jvm.internal.calls.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.e
        private final Object f125314d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@dl.d Method unboxMethod, @dl.e Object obj) {
            super(unboxMethod, CollectionsKt__CollectionsKt.E(), null);
            f0.p(unboxMethod, "unboxMethod");
            this.f125314d = obj;
        }

        @Override // kotlin.reflect.jvm.internal.calls.c
        @dl.e
        public Object call(@dl.d Object[] args) {
            f0.p(args, "args");
            b(args);
            return a(this.f125314d, args);
        }
    }

    /* JADX INFO: compiled from: InternalUnderlyingValOfInlineClass.kt */
    public static final class b extends h {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@dl.d Method unboxMethod) {
            super(unboxMethod, s.k(unboxMethod.getDeclaringClass()), null);
            f0.p(unboxMethod, "unboxMethod");
        }

        @Override // kotlin.reflect.jvm.internal.calls.c
        @dl.e
        public Object call(@dl.d Object[] args) {
            f0.p(args, "args");
            b(args);
            Object obj = args[0];
            d.C1134d c1134d = d.f125292e;
            return a(obj, args.length <= 1 ? new Object[0] : m.M1(args, 1, args.length));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private h(Method method, List<? extends Type> list) {
        this.f125311a = method;
        this.f125312b = list;
        Class<?> returnType = method.getReturnType();
        f0.o(returnType, "unboxMethod.returnType");
        this.f125313c = returnType;
    }

    public /* synthetic */ h(Method method, List list, u uVar) {
        this(method, list);
    }

    @dl.e
    protected final Object a(@dl.e Object obj, @dl.d Object[] args) {
        f0.p(args, "args");
        return this.f125311a.invoke(obj, Arrays.copyOf(args, args.length));
    }

    public void b(@dl.d Object[] objArr) {
        c.a.a(this, objArr);
    }

    @Override // kotlin.reflect.jvm.internal.calls.c
    @dl.d
    public final List<Type> c() {
        return this.f125312b;
    }

    @Override // kotlin.reflect.jvm.internal.calls.c
    @dl.e
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Method d() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.calls.c
    @dl.d
    public final Type getReturnType() {
        return this.f125313c;
    }
}
