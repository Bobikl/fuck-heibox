package com.google.common.reflect;

import com.google.common.base.Predicates;
import com.google.common.base.w;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.b3;
import com.google.common.collect.l1;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.AccessControlException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.CheckForNull;
import kotlin.text.y;
import okhttp3.t;

/* JADX INFO: loaded from: classes7.dex */
@com.google.common.reflect.d
public final class Types {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.common.base.p f59110a = com.google.common.base.p.p(", ").s("null");

    public enum ClassOwnership {
        OWNED_BY_ENCLOSING_CLASS { // from class: com.google.common.reflect.Types.ClassOwnership.1
            @Override // com.google.common.reflect.Types.ClassOwnership
            @CheckForNull
            Class<?> getOwnerType(Class<?> cls) {
                return cls.getEnclosingClass();
            }
        },
        LOCAL_CLASS_HAS_NO_OWNER { // from class: com.google.common.reflect.Types.ClassOwnership.2
            @Override // com.google.common.reflect.Types.ClassOwnership
            @CheckForNull
            Class<?> getOwnerType(Class<?> cls) {
                if (cls.isLocalClass()) {
                    return null;
                }
                return cls.getEnclosingClass();
            }
        };

        static final ClassOwnership JVM_BEHAVIOR = detectJvmBehavior();

        public class a<T> {
            a() {
            }
        }

        public class b extends a<String> {
            b() {
            }
        }

        /* synthetic */ ClassOwnership(a aVar) {
            this();
        }

        private static ClassOwnership detectJvmBehavior() {
            new b();
            ParameterizedType parameterizedType = (ParameterizedType) b.class.getGenericSuperclass();
            Objects.requireNonNull(parameterizedType);
            ParameterizedType parameterizedType2 = parameterizedType;
            for (ClassOwnership classOwnership : values()) {
                if (classOwnership.getOwnerType(a.class) == parameterizedType2.getOwnerType()) {
                    return classOwnership;
                }
            }
            throw new AssertionError();
        }

        @CheckForNull
        abstract Class<?> getOwnerType(Class<?> cls);
    }

    public static final class GenericArrayTypeImpl implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Type f59111b;

        GenericArrayTypeImpl(Type type) {
            this.f59111b = JavaVersion.CURRENT.usedInGenericType(type);
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof GenericArrayType) {
                return com.google.common.base.s.a(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
            }
            return false;
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f59111b;
        }

        public int hashCode() {
            return this.f59111b.hashCode();
        }

        public String toString() {
            return String.valueOf(Types.s(this.f59111b)).concat(t.f132643o);
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.google.common.reflect.Types$JavaVersion, still in use, count: 1, list:
  (r0v0 com.google.common.reflect.Types$JavaVersion) from 0x0063: SPUT (r0v0 com.google.common.reflect.Types$JavaVersion) com.google.common.reflect.Types.JavaVersion.CURRENT com.google.common.reflect.Types$JavaVersion
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static abstract class JavaVersion {
        JAVA6 { // from class: com.google.common.reflect.Types.JavaVersion.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.Types.JavaVersion
            public GenericArrayType newArrayType(Type type) {
                return new GenericArrayTypeImpl(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            Type usedInGenericType(Type type) {
                w.E(type);
                if (!(type instanceof Class)) {
                    return type;
                }
                Class cls = (Class) type;
                return cls.isArray() ? new GenericArrayTypeImpl(cls.getComponentType()) : type;
            }
        },
        JAVA7 { // from class: com.google.common.reflect.Types.JavaVersion.2
            @Override // com.google.common.reflect.Types.JavaVersion
            Type newArrayType(Type type) {
                return type instanceof Class ? Types.h((Class) type) : new GenericArrayTypeImpl(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            Type usedInGenericType(Type type) {
                return (Type) w.E(type);
            }
        },
        JAVA8 { // from class: com.google.common.reflect.Types.JavaVersion.3
            @Override // com.google.common.reflect.Types.JavaVersion
            Type newArrayType(Type type) {
                return JavaVersion.JAVA7.newArrayType(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            String typeName(Type type) {
                try {
                    return (String) Type.class.getMethod("getTypeName", new Class[0]).invoke(type, new Object[0]);
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException(e10);
                } catch (NoSuchMethodException unused) {
                    throw new AssertionError("Type.getTypeName should be available in Java 8");
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException(e11);
                }
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            Type usedInGenericType(Type type) {
                return JavaVersion.JAVA7.usedInGenericType(type);
            }
        },
        JAVA9 { // from class: com.google.common.reflect.Types.JavaVersion.4
            @Override // com.google.common.reflect.Types.JavaVersion
            boolean jdkTypeDuplicatesOwnerName() {
                return false;
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            Type newArrayType(Type type) {
                return JavaVersion.JAVA8.newArrayType(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            String typeName(Type type) {
                return JavaVersion.JAVA8.typeName(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            Type usedInGenericType(Type type) {
                return JavaVersion.JAVA8.usedInGenericType(type);
            }
        };

        static final JavaVersion CURRENT;

        public class a extends l<Map.Entry<String, int[][]>> {
            a() {
            }
        }

        public class b extends l<int[]> {
            b() {
            }
        }

        static {
            if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
                if (new a().capture().toString().contains("java.util.Map.java.util.Map")) {
                    CURRENT = javaVersion;
                    return;
                } else {
                    CURRENT = javaVersion;
                    return;
                }
            }
            if (new b().capture() instanceof Class) {
                CURRENT = javaVersion;
            } else {
                CURRENT = javaVersion;
            }
        }

        private JavaVersion(String str, int i10) {
            super(str, i10);
        }

        /* synthetic */ JavaVersion(String str, int i10, a aVar) {
            this(str, i10);
        }

        public static JavaVersion valueOf(String str) {
            return (JavaVersion) Enum.valueOf(JavaVersion.class, str);
        }

        public static JavaVersion[] values() {
            return (JavaVersion[]) $VALUES.clone();
        }

        boolean jdkTypeDuplicatesOwnerName() {
            return true;
        }

        abstract Type newArrayType(Type type);

        String typeName(Type type) {
            return Types.s(type);
        }

        final ImmutableList<Type> usedInGenericType(Type[] typeArr) {
            ImmutableList.a aVarQ = ImmutableList.q();
            for (Type type : typeArr) {
                aVarQ.a(usedInGenericType(type));
            }
            return aVarQ.e();
        }

        abstract Type usedInGenericType(Type type);
    }

    public static final class ParameterizedTypeImpl implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @CheckForNull
        private final Type f59112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ImmutableList<Type> f59113c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Class<?> f59114d;

        ParameterizedTypeImpl(@CheckForNull Type type, Class<?> cls, Type[] typeArr) {
            w.E(cls);
            w.d(typeArr.length == cls.getTypeParameters().length);
            Types.f(typeArr, "type parameter");
            this.f59112b = type;
            this.f59114d = cls;
            this.f59113c = JavaVersion.CURRENT.usedInGenericType(typeArr);
        }

        public boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            return getRawType().equals(parameterizedType.getRawType()) && com.google.common.base.s.a(getOwnerType(), parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return Types.r(this.f59113c);
        }

        @Override // java.lang.reflect.ParameterizedType
        @CheckForNull
        public Type getOwnerType() {
            return this.f59112b;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f59114d;
        }

        public int hashCode() {
            Type type = this.f59112b;
            return ((type == null ? 0 : type.hashCode()) ^ this.f59113c.hashCode()) ^ this.f59114d.hashCode();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            if (this.f59112b != null) {
                JavaVersion javaVersion = JavaVersion.CURRENT;
                if (javaVersion.jdkTypeDuplicatesOwnerName()) {
                    sb2.append(javaVersion.typeName(this.f59112b));
                    sb2.append(lg.a.f131414g);
                }
            }
            sb2.append(this.f59114d.getName());
            sb2.append(y.f128596e);
            com.google.common.base.p pVar = Types.f59110a;
            ImmutableList<Type> immutableList = this.f59113c;
            final JavaVersion javaVersion2 = JavaVersion.CURRENT;
            Objects.requireNonNull(javaVersion2);
            sb2.append(pVar.k(l1.U(immutableList, new com.google.common.base.n() { // from class: com.google.common.reflect.r
                @Override // com.google.common.base.n
                public final Object apply(Object obj) {
                    return javaVersion2.typeName((Type) obj);
                }
            })));
            sb2.append(y.f128597f);
            return sb2.toString();
        }
    }

    public static final class WildcardTypeImpl implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ImmutableList<Type> f59115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ImmutableList<Type> f59116c;

        WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            Types.f(typeArr, "lower bound for wildcard");
            Types.f(typeArr2, "upper bound for wildcard");
            JavaVersion javaVersion = JavaVersion.CURRENT;
            this.f59115b = javaVersion.usedInGenericType(typeArr);
            this.f59116c = javaVersion.usedInGenericType(typeArr2);
        }

        public boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) obj;
            return this.f59115b.equals(Arrays.asList(wildcardType.getLowerBounds())) && this.f59116c.equals(Arrays.asList(wildcardType.getUpperBounds()));
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            return Types.r(this.f59115b);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return Types.r(this.f59116c);
        }

        public int hashCode() {
            return this.f59115b.hashCode() ^ this.f59116c.hashCode();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("?");
            b3<Type> it = this.f59115b.iterator();
            while (it.hasNext()) {
                Type next = it.next();
                sb2.append(" super ");
                sb2.append(JavaVersion.CURRENT.typeName(next));
            }
            for (Type type : Types.g(this.f59116c)) {
                sb2.append(" extends ");
                sb2.append(JavaVersion.CURRENT.typeName(type));
            }
            return sb2.toString();
        }
    }

    public class a extends q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicReference f59117b;

        a(AtomicReference atomicReference) {
            this.f59117b = atomicReference;
        }

        @Override // com.google.common.reflect.q
        void b(Class<?> cls) {
            this.f59117b.set(cls.getComponentType());
        }

        @Override // com.google.common.reflect.q
        void c(GenericArrayType genericArrayType) {
            this.f59117b.set(genericArrayType.getGenericComponentType());
        }

        @Override // com.google.common.reflect.q
        void e(TypeVariable<?> typeVariable) {
            this.f59117b.set(Types.p(typeVariable.getBounds()));
        }

        @Override // com.google.common.reflect.q
        void f(WildcardType wildcardType) {
            this.f59117b.set(Types.p(wildcardType.getUpperBounds()));
        }
    }

    public static final class b<X> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final boolean f59118a = !b.class.getTypeParameters()[0].equals(Types.k(b.class, "X", new Type[0]));

        b() {
        }
    }

    public static final class c<D extends GenericDeclaration> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final D f59119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f59120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ImmutableList<Type> f59121c;

        c(D d10, String str, Type[] typeArr) {
            Types.f(typeArr, "bound for type variable");
            this.f59119a = (D) w.E(d10);
            this.f59120b = (String) w.E(str);
            this.f59121c = ImmutableList.x(typeArr);
        }

        public Type[] a() {
            return Types.r(this.f59121c);
        }

        public D b() {
            return this.f59119a;
        }

        public String c() {
            return this.f59120b;
        }

        public String d() {
            return this.f59120b;
        }

        public boolean equals(@CheckForNull Object obj) {
            if (!b.f59118a) {
                if (!(obj instanceof TypeVariable)) {
                    return false;
                }
                TypeVariable typeVariable = (TypeVariable) obj;
                return this.f59120b.equals(typeVariable.getName()) && this.f59119a.equals(typeVariable.getGenericDeclaration());
            }
            if (obj == null || !Proxy.isProxyClass(obj.getClass()) || !(Proxy.getInvocationHandler(obj) instanceof d)) {
                return false;
            }
            c cVar = ((d) Proxy.getInvocationHandler(obj)).f59123b;
            return this.f59120b.equals(cVar.c()) && this.f59119a.equals(cVar.b()) && this.f59121c.equals(cVar.f59121c);
        }

        public int hashCode() {
            return this.f59119a.hashCode() ^ this.f59120b.hashCode();
        }

        public String toString() {
            return this.f59120b;
        }
    }

    public static final class d implements InvocationHandler {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final ImmutableMap<String, Method> f59122c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c<?> f59123b;

        static {
            ImmutableMap.b bVarB = ImmutableMap.b();
            for (Method method : c.class.getMethods()) {
                if (method.getDeclaringClass().equals(c.class)) {
                    try {
                        method.setAccessible(true);
                    } catch (AccessControlException unused) {
                    }
                    bVarB.i(method.getName(), method);
                }
            }
            f59122c = bVarB.c();
        }

        d(c<?> cVar) {
            this.f59123b = cVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        @CheckForNull
        public Object invoke(Object obj, Method method, @CheckForNull Object[] objArr) throws Throwable {
            String name = method.getName();
            Method method2 = f59122c.get(name);
            if (method2 == null) {
                throw new UnsupportedOperationException(name);
            }
            try {
                return method2.invoke(this.f59123b, objArr);
            } catch (InvocationTargetException e10) {
                throw e10.getCause();
            }
        }
    }

    private Types() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(Type[] typeArr, String str) {
        for (Type type : typeArr) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                w.y(!cls.isPrimitive(), "Primitive type '%s' used as %s", cls, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Iterable<Type> g(Iterable<Type> iterable) {
        return l1.o(iterable, Predicates.q(Predicates.m(Object.class)));
    }

    static Class<?> h(Class<?> cls) {
        return Array.newInstance(cls, 0).getClass();
    }

    @CheckForNull
    static Type i(Type type) {
        w.E(type);
        AtomicReference atomicReference = new AtomicReference();
        new a(atomicReference).a(type);
        return (Type) atomicReference.get();
    }

    static Type j(Type type) {
        if (!(type instanceof WildcardType)) {
            return JavaVersion.CURRENT.newArrayType(type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        w.e(lowerBounds.length <= 1, "Wildcard cannot have more than one lower bounds.");
        if (lowerBounds.length == 1) {
            return q(j(lowerBounds[0]));
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        w.e(upperBounds.length == 1, "Wildcard should have only one upper bound.");
        return o(j(upperBounds[0]));
    }

    static <D extends GenericDeclaration> TypeVariable<D> k(D d10, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        return n(d10, str, typeArr);
    }

    static ParameterizedType l(Class<?> cls, Type... typeArr) {
        return new ParameterizedTypeImpl(ClassOwnership.JVM_BEHAVIOR.getOwnerType(cls), cls, typeArr);
    }

    static ParameterizedType m(@CheckForNull Type type, Class<?> cls, Type... typeArr) {
        if (type == null) {
            return l(cls, typeArr);
        }
        w.E(typeArr);
        w.u(cls.getEnclosingClass() != null, "Owner type for unenclosed %s", cls);
        return new ParameterizedTypeImpl(type, cls, typeArr);
    }

    private static <D extends GenericDeclaration> TypeVariable<D> n(D d10, String str, Type[] typeArr) {
        return (TypeVariable) k.d(TypeVariable.class, new d(new c(d10, str, typeArr)));
    }

    @o9.d
    static WildcardType o(Type type) {
        return new WildcardTypeImpl(new Type[0], new Type[]{type});
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CheckForNull
    public static Type p(Type[] typeArr) {
        for (Type type : typeArr) {
            Type typeI = i(type);
            if (typeI != null) {
                if (typeI instanceof Class) {
                    Class cls = (Class) typeI;
                    if (cls.isPrimitive()) {
                        return cls;
                    }
                }
                return o(typeI);
            }
        }
        return null;
    }

    @o9.d
    static WildcardType q(Type type) {
        return new WildcardTypeImpl(new Type[]{type}, new Type[]{Object.class});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Type[] r(Collection<Type> collection) {
        return (Type[]) collection.toArray(new Type[0]);
    }

    static String s(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
