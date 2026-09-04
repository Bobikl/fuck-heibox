package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.b2;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.m;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.u0;

/* JADX INFO: compiled from: CallerImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class d<M extends Member> implements kotlin.reflect.jvm.internal.calls.c<M> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final C1134d f125292e = new C1134d(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final M f125293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Type f125294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final Class<?> f125295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final List<Type> f125296d;

    /* JADX INFO: compiled from: CallerImpl.kt */
    public static final class a extends d<Constructor<?>> implements kotlin.reflect.jvm.internal.calls.b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @dl.e
        private final Object f125297f;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(@dl.d Constructor<?> constructor, @dl.e Object obj) {
            f0.p(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            f0.o(declaringClass, "constructor.declaringClass");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            f0.o(genericParameterTypes, "constructor.genericParameterTypes");
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 2 ? new Type[0] : m.M1(genericParameterTypes, 1, genericParameterTypes.length - 1)), null);
            this.f125297f = obj;
        }

        @Override // kotlin.reflect.jvm.internal.calls.c
        @dl.e
        public Object call(@dl.d Object[] args) {
            f0.p(args, "args");
            a(args);
            Constructor<?> constructorD = d();
            u0 u0Var = new u0(3);
            u0Var.a(this.f125297f);
            u0Var.b(args);
            u0Var.a(null);
            return constructorD.newInstance(u0Var.d(new Object[u0Var.c()]));
        }
    }

    /* JADX INFO: compiled from: CallerImpl.kt */
    public static final class b extends d<Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        public b(@dl.d Constructor<?> constructor) {
            f0.p(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            f0.o(declaringClass, "constructor.declaringClass");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            f0.o(genericParameterTypes, "constructor.genericParameterTypes");
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : m.M1(genericParameterTypes, 0, genericParameterTypes.length - 1)), null);
        }

        @Override // kotlin.reflect.jvm.internal.calls.c
        @dl.e
        public Object call(@dl.d Object[] args) {
            f0.p(args, "args");
            a(args);
            Constructor<?> constructorD = d();
            u0 u0Var = new u0(2);
            u0Var.b(args);
            u0Var.a(null);
            return constructorD.newInstance(u0Var.d(new Object[u0Var.c()]));
        }
    }

    /* JADX INFO: compiled from: CallerImpl.kt */
    public static final class c extends d<Constructor<?>> implements kotlin.reflect.jvm.internal.calls.b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @dl.e
        private final Object f125298f;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(@dl.d Constructor<?> constructor, @dl.e Object obj) {
            f0.p(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            f0.o(declaringClass, "constructor.declaringClass");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            f0.o(genericParameterTypes, "constructor.genericParameterTypes");
            super(constructor, declaringClass, null, genericParameterTypes, null);
            this.f125298f = obj;
        }

        @Override // kotlin.reflect.jvm.internal.calls.c
        @dl.e
        public Object call(@dl.d Object[] args) {
            f0.p(args, "args");
            a(args);
            Constructor<?> constructorD = d();
            u0 u0Var = new u0(2);
            u0Var.a(this.f125298f);
            u0Var.b(args);
            return constructorD.newInstance(u0Var.d(new Object[u0Var.c()]));
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.calls.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CallerImpl.kt */
    public static final class C1134d {
        private C1134d() {
        }

        public /* synthetic */ C1134d(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: CallerImpl.kt */
    public static final class e extends d<Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        public e(@dl.d Constructor<?> constructor) {
            f0.p(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            f0.o(declaringClass, "constructor.declaringClass");
            Class<?> declaringClass2 = constructor.getDeclaringClass();
            Class<?> declaringClass3 = declaringClass2.getDeclaringClass();
            Class<?> cls = (declaringClass3 == null || Modifier.isStatic(declaringClass2.getModifiers())) ? null : declaringClass3;
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            f0.o(genericParameterTypes, "constructor.genericParameterTypes");
            super(constructor, declaringClass, cls, genericParameterTypes, null);
        }

        @Override // kotlin.reflect.jvm.internal.calls.c
        @dl.e
        public Object call(@dl.d Object[] args) {
            f0.p(args, "args");
            a(args);
            return d().newInstance(Arrays.copyOf(args, args.length));
        }
    }

    /* JADX INFO: compiled from: CallerImpl.kt */
    public static abstract class f extends d<Field> {

        /* JADX INFO: compiled from: CallerImpl.kt */
        public static final class a extends f implements kotlin.reflect.jvm.internal.calls.b {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @dl.e
            private final Object f125299f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@dl.d Field field, @dl.e Object obj) {
                super(field, false, null);
                f0.p(field, "field");
                this.f125299f = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.d.f, kotlin.reflect.jvm.internal.calls.c
            @dl.e
            public Object call(@dl.d Object[] args) {
                f0.p(args, "args");
                a(args);
                return d().get(this.f125299f);
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        public static final class b extends f implements kotlin.reflect.jvm.internal.calls.b {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@dl.d Field field) {
                super(field, false, null);
                f0.p(field, "field");
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        public static final class c extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@dl.d Field field) {
                super(field, true, null);
                f0.p(field, "field");
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.calls.d$f$d, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CallerImpl.kt */
        public static final class C1135d extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1135d(@dl.d Field field) {
                super(field, true, null);
                f0.p(field, "field");
            }

            @Override // kotlin.reflect.jvm.internal.calls.d
            public void a(@dl.d Object[] args) {
                f0.p(args, "args");
                super.a(args);
                b(ArraysKt___ArraysKt.Oc(args));
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        public static final class e extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(@dl.d Field field) {
                super(field, false, null);
                f0.p(field, "field");
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private f(Field field, boolean z10) {
            Type genericType = field.getGenericType();
            f0.o(genericType, "field.genericType");
            super(field, genericType, z10 ? field.getDeclaringClass() : null, new Type[0], null);
        }

        public /* synthetic */ f(Field field, boolean z10, u uVar) {
            this(field, z10);
        }

        @Override // kotlin.reflect.jvm.internal.calls.c
        @dl.e
        public Object call(@dl.d Object[] args) {
            f0.p(args, "args");
            a(args);
            return d().get(e() != null ? ArraysKt___ArraysKt.sc(args) : null);
        }
    }

    /* JADX INFO: compiled from: CallerImpl.kt */
    public static abstract class g extends d<Field> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f125300f;

        /* JADX INFO: compiled from: CallerImpl.kt */
        public static final class a extends g implements kotlin.reflect.jvm.internal.calls.b {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            @dl.e
            private final Object f125301g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@dl.d Field field, boolean z10, @dl.e Object obj) {
                super(field, z10, false, null);
                f0.p(field, "field");
                this.f125301g = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.d.g, kotlin.reflect.jvm.internal.calls.c
            @dl.d
            public Object call(@dl.d Object[] args) throws IllegalAccessException {
                f0.p(args, "args");
                a(args);
                d().set(this.f125301g, ArraysKt___ArraysKt.sc(args));
                return b2.f124493a;
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        public static final class b extends g implements kotlin.reflect.jvm.internal.calls.b {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@dl.d Field field, boolean z10) {
                super(field, z10, false, null);
                f0.p(field, "field");
            }

            @Override // kotlin.reflect.jvm.internal.calls.d.g, kotlin.reflect.jvm.internal.calls.c
            @dl.d
            public Object call(@dl.d Object[] args) throws IllegalAccessException {
                f0.p(args, "args");
                a(args);
                d().set(null, ArraysKt___ArraysKt.bi(args));
                return b2.f124493a;
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        public static final class c extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@dl.d Field field, boolean z10) {
                super(field, z10, true, null);
                f0.p(field, "field");
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.calls.d$g$d, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CallerImpl.kt */
        public static final class C1136d extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1136d(@dl.d Field field, boolean z10) {
                super(field, z10, true, null);
                f0.p(field, "field");
            }

            @Override // kotlin.reflect.jvm.internal.calls.d.g, kotlin.reflect.jvm.internal.calls.d
            public void a(@dl.d Object[] args) {
                f0.p(args, "args");
                super.a(args);
                b(ArraysKt___ArraysKt.Oc(args));
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        public static final class e extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(@dl.d Field field, boolean z10) {
                super(field, z10, false, null);
                f0.p(field, "field");
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private g(Field field, boolean z10, boolean z11) {
            Class TYPE = Void.TYPE;
            f0.o(TYPE, "TYPE");
            Class<?> declaringClass = z11 ? field.getDeclaringClass() : null;
            Type genericType = field.getGenericType();
            f0.o(genericType, "field.genericType");
            super(field, TYPE, declaringClass, new Type[]{genericType}, null);
            this.f125300f = z10;
        }

        public /* synthetic */ g(Field field, boolean z10, boolean z11, u uVar) {
            this(field, z10, z11);
        }

        @Override // kotlin.reflect.jvm.internal.calls.d
        public void a(@dl.d Object[] args) {
            f0.p(args, "args");
            super.a(args);
            if (this.f125300f && ArraysKt___ArraysKt.bi(args) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        @Override // kotlin.reflect.jvm.internal.calls.c
        @dl.e
        public Object call(@dl.d Object[] args) throws IllegalAccessException {
            f0.p(args, "args");
            a(args);
            d().set(e() != null ? ArraysKt___ArraysKt.sc(args) : null, ArraysKt___ArraysKt.bi(args));
            return b2.f124493a;
        }
    }

    /* JADX INFO: compiled from: CallerImpl.kt */
    public static abstract class h extends d<Method> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f125302f;

        /* JADX INFO: compiled from: CallerImpl.kt */
        public static final class a extends h implements kotlin.reflect.jvm.internal.calls.b {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            @dl.e
            private final Object f125303g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@dl.d Method method, @dl.e Object obj) {
                super(method, false, null, 4, null);
                f0.p(method, "method");
                this.f125303g = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.c
            @dl.e
            public Object call(@dl.d Object[] args) {
                f0.p(args, "args");
                a(args);
                return f(this.f125303g, args);
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        public static final class b extends h implements kotlin.reflect.jvm.internal.calls.b {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@dl.d Method method) {
                super(method, false, null, 4, null);
                f0.p(method, "method");
            }

            @Override // kotlin.reflect.jvm.internal.calls.c
            @dl.e
            public Object call(@dl.d Object[] args) {
                f0.p(args, "args");
                a(args);
                return f(null, args);
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        public static final class c extends h implements kotlin.reflect.jvm.internal.calls.b {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            @dl.e
            private final Object f125304g;

            /* JADX WARN: Illegal instructions before constructor call */
            public c(@dl.d Method method, @dl.e Object obj) {
                f0.p(method, "method");
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                f0.o(genericParameterTypes, "method.genericParameterTypes");
                super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : m.M1(genericParameterTypes, 1, genericParameterTypes.length)), null);
                this.f125304g = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.c
            @dl.e
            public Object call(@dl.d Object[] args) {
                f0.p(args, "args");
                a(args);
                u0 u0Var = new u0(2);
                u0Var.a(this.f125304g);
                u0Var.b(args);
                return f(null, u0Var.d(new Object[u0Var.c()]));
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.calls.d$h$d, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CallerImpl.kt */
        public static final class C1137d extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1137d(@dl.d Method method) {
                super(method, false, null, 6, null);
                f0.p(method, "method");
            }

            @Override // kotlin.reflect.jvm.internal.calls.c
            @dl.e
            public Object call(@dl.d Object[] args) {
                f0.p(args, "args");
                a(args);
                return f(args[0], args.length <= 1 ? new Object[0] : m.M1(args, 1, args.length));
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        public static final class e extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(@dl.d Method method) {
                super(method, true, null, 4, null);
                f0.p(method, "method");
            }

            @Override // kotlin.reflect.jvm.internal.calls.c
            @dl.e
            public Object call(@dl.d Object[] args) {
                f0.p(args, "args");
                a(args);
                b(ArraysKt___ArraysKt.Oc(args));
                return f(null, args.length <= 1 ? new Object[0] : m.M1(args, 1, args.length));
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        public static final class f extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(@dl.d Method method) {
                super(method, false, null, 6, null);
                f0.p(method, "method");
            }

            @Override // kotlin.reflect.jvm.internal.calls.c
            @dl.e
            public Object call(@dl.d Object[] args) {
                f0.p(args, "args");
                a(args);
                return f(null, args);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private h(Method method, boolean z10, Type[] typeArr) {
            Type genericReturnType = method.getGenericReturnType();
            f0.o(genericReturnType, "method.genericReturnType");
            super(method, genericReturnType, z10 ? method.getDeclaringClass() : null, typeArr, null);
            this.f125302f = f0.g(getReturnType(), Void.TYPE);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ h(Method method, boolean z10, Type[] typeArr, int i10, u uVar) {
            z10 = (i10 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z10;
            if ((i10 & 4) != 0) {
                typeArr = method.getGenericParameterTypes();
                f0.o(typeArr, "method.genericParameterTypes");
            }
            this(method, z10, typeArr, null);
        }

        public /* synthetic */ h(Method method, boolean z10, Type[] typeArr, u uVar) {
            this(method, z10, typeArr);
        }

        @dl.e
        protected final Object f(@dl.e Object obj, @dl.d Object[] args) {
            f0.p(args, "args");
            return this.f125302f ? b2.f124493a : d().invoke(obj, Arrays.copyOf(args, args.length));
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0027  */
    private d(M m10, Type type, Class<?> cls, Type[] typeArr) {
        List<Type> listKz;
        this.f125293a = m10;
        this.f125294b = type;
        this.f125295c = cls;
        if (cls != null) {
            u0 u0Var = new u0(2);
            u0Var.a(cls);
            u0Var.b(typeArr);
            listKz = CollectionsKt__CollectionsKt.L(u0Var.d(new Type[u0Var.c()]));
            listKz = listKz == null ? ArraysKt___ArraysKt.kz(typeArr) : listKz;
        }
        this.f125296d = listKz;
    }

    public /* synthetic */ d(Member member, Type type, Class cls, Type[] typeArr, u uVar) {
        this(member, type, cls, typeArr);
    }

    public void a(@dl.d Object[] objArr) {
        kotlin.reflect.jvm.internal.calls.c.a.a(this, objArr);
    }

    protected final void b(@dl.e Object obj) {
        if (obj == null || !this.f125293a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // kotlin.reflect.jvm.internal.calls.c
    @dl.d
    public List<Type> c() {
        return this.f125296d;
    }

    @Override // kotlin.reflect.jvm.internal.calls.c
    @dl.d
    public final M d() {
        return this.f125293a;
    }

    @dl.e
    public final Class<?> e() {
        return this.f125295c;
    }

    @Override // kotlin.reflect.jvm.internal.calls.c
    @dl.d
    public final Type getReturnType() {
        return this.f125294b;
    }
}
