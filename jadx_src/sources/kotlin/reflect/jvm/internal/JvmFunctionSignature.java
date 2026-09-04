package kotlin.reflect.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* JADX INFO: compiled from: RuntimeTypeMapper.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class JvmFunctionSignature {

    /* JADX INFO: compiled from: RuntimeTypeMapper.kt */
    public static final class FakeJavaAnnotationConstructor extends JvmFunctionSignature {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final Class<?> f125082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final List<Method> f125083b;

        /* JADX INFO: compiled from: Comparisons.kt */
        public static final class a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return kotlin.comparisons.g.l(((Method) t10).getName(), ((Method) t11).getName());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FakeJavaAnnotationConstructor(@dl.d Class<?> jClass) {
            super(null);
            f0.p(jClass, "jClass");
            this.f125082a = jClass;
            Method[] declaredMethods = jClass.getDeclaredMethods();
            f0.o(declaredMethods, "jClass.declaredMethods");
            this.f125083b = ArraysKt___ArraysKt.mw(declaredMethods, new a());
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        @dl.d
        public String a() {
            return CollectionsKt___CollectionsKt.h3(this.f125083b, "", "<init>(", ")V", 0, null, new yh.l<Method, CharSequence>() { // from class: kotlin.reflect.jvm.internal.JvmFunctionSignature$FakeJavaAnnotationConstructor$asString$1
                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CharSequence invoke(Method method) {
                    Class<?> returnType = method.getReturnType();
                    f0.o(returnType, "it.returnType");
                    return ReflectClassUtilKt.b(returnType);
                }
            }, 24, null);
        }

        @dl.d
        public final List<Method> b() {
            return this.f125083b;
        }
    }

    /* JADX INFO: compiled from: RuntimeTypeMapper.kt */
    public static final class JavaConstructor extends JvmFunctionSignature {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final Constructor<?> f125085a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JavaConstructor(@dl.d Constructor<?> constructor) {
            super(null);
            f0.p(constructor, "constructor");
            this.f125085a = constructor;
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        @dl.d
        public String a() {
            Class<?>[] parameterTypes = this.f125085a.getParameterTypes();
            f0.o(parameterTypes, "constructor.parameterTypes");
            return ArraysKt___ArraysKt.Mh(parameterTypes, "", "<init>(", ")V", 0, null, new yh.l<Class<?>, CharSequence>() { // from class: kotlin.reflect.jvm.internal.JvmFunctionSignature$JavaConstructor$asString$1
                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CharSequence invoke(Class<?> it) {
                    f0.o(it, "it");
                    return ReflectClassUtilKt.b(it);
                }
            }, 24, null);
        }

        @dl.d
        public final Constructor<?> b() {
            return this.f125085a;
        }
    }

    /* JADX INFO: compiled from: RuntimeTypeMapper.kt */
    public static final class a extends JvmFunctionSignature {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final Method f125087a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@dl.d Method method) {
            super(null);
            f0.p(method, "method");
            this.f125087a = method;
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        @dl.d
        public String a() {
            return RuntimeTypeMapperKt.b(this.f125087a);
        }

        @dl.d
        public final Method b() {
            return this.f125087a;
        }
    }

    /* JADX INFO: compiled from: RuntimeTypeMapper.kt */
    public static final class b extends JvmFunctionSignature {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d.b f125088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final String f125089b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@dl.d kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d.b signature) {
            super(null);
            f0.p(signature, "signature");
            this.f125088a = signature;
            this.f125089b = signature.a();
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        @dl.d
        public String a() {
            return this.f125089b;
        }

        @dl.d
        public final String b() {
            return this.f125088a.b();
        }
    }

    /* JADX INFO: compiled from: RuntimeTypeMapper.kt */
    public static final class c extends JvmFunctionSignature {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d.b f125090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final String f125091b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@dl.d kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d.b signature) {
            super(null);
            f0.p(signature, "signature");
            this.f125090a = signature;
            this.f125091b = signature.a();
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        @dl.d
        public String a() {
            return this.f125091b;
        }

        @dl.d
        public final String b() {
            return this.f125090a.b();
        }

        @dl.d
        public final String c() {
            return this.f125090a.c();
        }
    }

    private JvmFunctionSignature() {
    }

    public /* synthetic */ JvmFunctionSignature(u uVar) {
        this();
    }

    @dl.d
    public abstract String a();
}
