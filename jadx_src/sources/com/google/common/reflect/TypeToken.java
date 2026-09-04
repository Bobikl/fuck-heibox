package com.google.common.reflect;

import com.google.common.base.w;
import com.google.common.base.x;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.google.common.collect.a1;
import com.google.common.collect.b3;
import com.google.common.collect.f0;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@com.google.common.reflect.d
public abstract class TypeToken<T> extends l<T> implements Serializable {
    private static final long serialVersionUID = 3637540370352322684L;

    @CheckForNull
    private transient n covariantTypeResolver;

    @CheckForNull
    private transient n invariantTypeResolver;
    private final Type runtimeType;

    public final class ClassSet extends TypeToken<T>.TypeSet {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @CheckForNull
        private transient ImmutableSet<TypeToken<? super T>> f59092d;

        private ClassSet() {
            super();
        }

        /* synthetic */ ClassSet(TypeToken typeToken, a aVar) {
            this();
        }

        private Object f1() {
            return TypeToken.this.getTypes().b1();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.a1, com.google.common.collect.h0
        public Set<TypeToken<? super T>> X0() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.f59092d;
            if (immutableSet != null) {
                return immutableSet;
            }
            ImmutableSet<TypeToken<? super T>> immutableSetS = f0.y(f.f59105a.a().d(TypeToken.this)).t(TypeFilter.IGNORE_TYPE_VARIABLE_OR_WILDCARD).S();
            this.f59092d = immutableSetS;
            return immutableSetS;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public TypeToken<T>.TypeSet b1() {
            return this;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public TypeToken<T>.TypeSet c1() {
            throw new UnsupportedOperationException("classes().interfaces() not supported.");
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public Set<Class<? super T>> e1() {
            return ImmutableSet.w(f.f59106b.a().c(TypeToken.this.getRawTypes()));
        }
    }

    public final class InterfaceSet extends TypeToken<T>.TypeSet {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient TypeToken<T>.TypeSet f59094d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @CheckForNull
        private transient ImmutableSet<TypeToken<? super T>> f59095e;

        InterfaceSet(TypeToken<T>.TypeSet typeSet) {
            super();
            this.f59094d = typeSet;
        }

        private Object f1() {
            return TypeToken.this.getTypes().c1();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.a1, com.google.common.collect.h0
        public Set<TypeToken<? super T>> X0() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.f59095e;
            if (immutableSet != null) {
                return immutableSet;
            }
            ImmutableSet<TypeToken<? super T>> immutableSetS = f0.y(this.f59094d).t(TypeFilter.INTERFACE_ONLY).S();
            this.f59095e = immutableSetS;
            return immutableSetS;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public TypeToken<T>.TypeSet b1() {
            throw new UnsupportedOperationException("interfaces().classes() not supported.");
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public TypeToken<T>.TypeSet c1() {
            return this;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public Set<Class<? super T>> e1() {
            return f0.y(f.f59106b.c(TypeToken.this.getRawTypes())).t(new x() { // from class: com.google.common.reflect.p
                @Override // com.google.common.base.x
                public final boolean apply(Object obj) {
                    return ((Class) obj).isInterface();
                }
            }).S();
        }
    }

    public static final class SimpleTypeToken<T> extends TypeToken<T> {
        private static final long serialVersionUID = 0;

        SimpleTypeToken(Type type) {
            super(type, null);
        }
    }

    public enum TypeFilter implements x<TypeToken<?>> {
        IGNORE_TYPE_VARIABLE_OR_WILDCARD { // from class: com.google.common.reflect.TypeToken.TypeFilter.1
            @Override // com.google.common.base.x
            public boolean apply(TypeToken<?> typeToken) {
                return ((((TypeToken) typeToken).runtimeType instanceof TypeVariable) || (((TypeToken) typeToken).runtimeType instanceof WildcardType)) ? false : true;
            }
        },
        INTERFACE_ONLY { // from class: com.google.common.reflect.TypeToken.TypeFilter.2
            @Override // com.google.common.base.x
            public boolean apply(TypeToken<?> typeToken) {
                return typeToken.getRawType().isInterface();
            }
        };

        /* synthetic */ TypeFilter(a aVar) {
            this();
        }
    }

    public class TypeSet extends a1<TypeToken<? super T>> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @CheckForNull
        private transient ImmutableSet<TypeToken<? super T>> f59097b;

        TypeSet() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.a1, com.google.common.collect.h0
        public Set<TypeToken<? super T>> X0() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.f59097b;
            if (immutableSet != null) {
                return immutableSet;
            }
            ImmutableSet<TypeToken<? super T>> immutableSetS = f0.y(f.f59105a.d(TypeToken.this)).t(TypeFilter.IGNORE_TYPE_VARIABLE_OR_WILDCARD).S();
            this.f59097b = immutableSetS;
            return immutableSetS;
        }

        public TypeToken<T>.TypeSet b1() {
            return new ClassSet(TypeToken.this, null);
        }

        public TypeToken<T>.TypeSet c1() {
            return new InterfaceSet(this);
        }

        public Set<Class<? super T>> e1() {
            return ImmutableSet.w(f.f59106b.c(TypeToken.this.getRawTypes()));
        }
    }

    public class a extends com.google.common.reflect.f.b<T> {
        a(Method method) {
            super(method);
        }

        @Override // com.google.common.reflect.f.b, com.google.common.reflect.f
        Type[] j0() {
            return TypeToken.this.getCovariantTypeResolver().l(super.j0());
        }

        @Override // com.google.common.reflect.f.b, com.google.common.reflect.f
        Type[] k0() {
            return TypeToken.this.getInvariantTypeResolver().l(super.k0());
        }

        @Override // com.google.common.reflect.f.b, com.google.common.reflect.f
        Type l0() {
            return TypeToken.this.getCovariantTypeResolver().j(super.l0());
        }

        @Override // com.google.common.reflect.f
        public TypeToken<T> m0() {
            return TypeToken.this;
        }

        @Override // com.google.common.reflect.f
        public String toString() {
            String strValueOf = String.valueOf(m0());
            String string = super.toString();
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + String.valueOf(string).length());
            sb2.append(strValueOf);
            sb2.append(".");
            sb2.append(string);
            return sb2.toString();
        }
    }

    public class b extends com.google.common.reflect.f.a<T> {
        b(Constructor constructor) {
            super(constructor);
        }

        @Override // com.google.common.reflect.f.a, com.google.common.reflect.f
        Type[] j0() {
            return TypeToken.this.getCovariantTypeResolver().l(super.j0());
        }

        @Override // com.google.common.reflect.f.a, com.google.common.reflect.f
        Type[] k0() {
            return TypeToken.this.getInvariantTypeResolver().l(super.k0());
        }

        @Override // com.google.common.reflect.f.a, com.google.common.reflect.f
        Type l0() {
            return TypeToken.this.getCovariantTypeResolver().j(super.l0());
        }

        @Override // com.google.common.reflect.f
        public TypeToken<T> m0() {
            return TypeToken.this;
        }

        @Override // com.google.common.reflect.f
        public String toString() {
            String strValueOf = String.valueOf(m0());
            String strN = com.google.common.base.p.p(", ").n(k0());
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 2 + String.valueOf(strN).length());
            sb2.append(strValueOf);
            sb2.append("(");
            sb2.append(strN);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public class c extends q {
        c() {
        }

        @Override // com.google.common.reflect.q
        void c(GenericArrayType genericArrayType) {
            a(genericArrayType.getGenericComponentType());
        }

        @Override // com.google.common.reflect.q
        void d(ParameterizedType parameterizedType) {
            a(parameterizedType.getActualTypeArguments());
            a(parameterizedType.getOwnerType());
        }

        @Override // com.google.common.reflect.q
        void e(TypeVariable<?> typeVariable) {
            String strValueOf = String.valueOf(TypeToken.this.runtimeType);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 58);
            sb2.append(strValueOf);
            sb2.append("contains a type variable and is not safe for the operation");
            throw new IllegalArgumentException(sb2.toString());
        }

        @Override // com.google.common.reflect.q
        void f(WildcardType wildcardType) {
            a(wildcardType.getLowerBounds());
            a(wildcardType.getUpperBounds());
        }
    }

    public class d extends q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImmutableSet.a f59102b;

        d(TypeToken typeToken, ImmutableSet.a aVar) {
            this.f59102b = aVar;
        }

        @Override // com.google.common.reflect.q
        void b(Class<?> cls) {
            this.f59102b.g(cls);
        }

        @Override // com.google.common.reflect.q
        void c(GenericArrayType genericArrayType) {
            this.f59102b.g(Types.h(TypeToken.of(genericArrayType.getGenericComponentType()).getRawType()));
        }

        @Override // com.google.common.reflect.q
        void d(ParameterizedType parameterizedType) {
            this.f59102b.g((Class) parameterizedType.getRawType());
        }

        @Override // com.google.common.reflect.q
        void e(TypeVariable<?> typeVariable) {
            a(typeVariable.getBounds());
        }

        @Override // com.google.common.reflect.q
        void f(WildcardType wildcardType) {
            a(wildcardType.getUpperBounds());
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Type[] f59103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f59104b;

        e(Type[] typeArr, boolean z10) {
            this.f59103a = typeArr;
            this.f59104b = z10;
        }

        boolean a(Type type) {
            for (Type type2 : this.f59103a) {
                boolean zIsSubtypeOf = TypeToken.of(type2).isSubtypeOf(type);
                boolean z10 = this.f59104b;
                if (zIsSubtypeOf == z10) {
                    return z10;
                }
            }
            return !this.f59104b;
        }

        boolean b(Type type) {
            TypeToken<?> typeTokenOf = TypeToken.of(type);
            for (Type type2 : this.f59103a) {
                boolean zIsSubtypeOf = typeTokenOf.isSubtypeOf(type2);
                boolean z10 = this.f59104b;
                if (zIsSubtypeOf == z10) {
                    return z10;
                }
            }
            return !this.f59104b;
        }
    }

    public static abstract class f<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final f<TypeToken<?>> f59105a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final f<Class<?>> f59106b = new b();

        public class a extends f<TypeToken<?>> {
            a() {
                super(null);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeToken.f
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public Iterable<? extends TypeToken<?>> e(TypeToken<?> typeToken) {
                return typeToken.getGenericInterfaces();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeToken.f
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public Class<?> f(TypeToken<?> typeToken) {
                return typeToken.getRawType();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeToken.f
            @CheckForNull
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public TypeToken<?> g(TypeToken<?> typeToken) {
                return typeToken.getGenericSuperclass();
            }
        }

        public class b extends f<Class<?>> {
            b() {
                super(null);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeToken.f
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public Iterable<? extends Class<?>> e(Class<?> cls) {
                return Arrays.asList(cls.getInterfaces());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeToken.f
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public Class<?> f(Class<?> cls) {
                return cls;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeToken.f
            @CheckForNull
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public Class<?> g(Class<?> cls) {
                return cls.getSuperclass();
            }
        }

        public class c extends e<K> {
            c(f fVar, f fVar2) {
                super(fVar2);
            }

            @Override // com.google.common.reflect.TypeToken.f
            ImmutableList<K> c(Iterable<? extends K> iterable) {
                ImmutableList.a aVarQ = ImmutableList.q();
                for (K k10 : iterable) {
                    if (!f(k10).isInterface()) {
                        aVarQ.a(k10);
                    }
                }
                return super.c(aVarQ.e());
            }

            @Override // com.google.common.reflect.TypeToken.f.e, com.google.common.reflect.TypeToken.f
            Iterable<? extends K> e(K k10) {
                return ImmutableSet.D();
            }
        }

        public class d extends Ordering<K> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Comparator f59107d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Map f59108e;

            d(Comparator comparator, Map map) {
                this.f59107d = comparator;
                this.f59108e = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.Ordering, java.util.Comparator
            public int compare(K k10, K k11) {
                Comparator comparator = this.f59107d;
                Object obj = this.f59108e.get(k10);
                Objects.requireNonNull(obj);
                Object obj2 = this.f59108e.get(k11);
                Objects.requireNonNull(obj2);
                return comparator.compare(obj, obj2);
            }
        }

        public static class e<K> extends f<K> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final f<K> f59109c;

            e(f<K> fVar) {
                super(null);
                this.f59109c = fVar;
            }

            @Override // com.google.common.reflect.TypeToken.f
            Iterable<? extends K> e(K k10) {
                return this.f59109c.e(k10);
            }

            @Override // com.google.common.reflect.TypeToken.f
            Class<?> f(K k10) {
                return this.f59109c.f(k10);
            }

            @Override // com.google.common.reflect.TypeToken.f
            @CheckForNull
            K g(K k10) {
                return this.f59109c.g(k10);
            }
        }

        private f() {
        }

        /* synthetic */ f(a aVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @s9.a
        private int b(K k10, Map<? super K, Integer> map) {
            Integer num = map.get(k10);
            if (num != null) {
                return num.intValue();
            }
            boolean zIsInterface = f(k10).isInterface();
            Iterator<? extends K> it = e(k10).iterator();
            int iMax = zIsInterface;
            while (it.hasNext()) {
                iMax = Math.max(iMax, b(it.next(), map));
            }
            K kG = g(k10);
            int iMax2 = iMax;
            if (kG != null) {
                iMax2 = Math.max(iMax, b(kG, map));
            }
            int i10 = iMax2 + 1;
            map.put(k10, Integer.valueOf(i10));
            return i10;
        }

        private static <K, V> ImmutableList<K> h(Map<K, V> map, Comparator<? super V> comparator) {
            return (ImmutableList<K>) new d(comparator, map).l(map.keySet());
        }

        final f<K> a() {
            return new c(this, this);
        }

        ImmutableList<K> c(Iterable<? extends K> iterable) {
            HashMap mapY = Maps.Y();
            Iterator<? extends K> it = iterable.iterator();
            while (it.hasNext()) {
                b(it.next(), mapY);
            }
            return h(mapY, Ordering.z().E());
        }

        final ImmutableList<K> d(K k10) {
            return c(ImmutableList.D(k10));
        }

        abstract Iterable<? extends K> e(K k10);

        abstract Class<?> f(K k10);

        @CheckForNull
        abstract K g(K k10);
    }

    protected TypeToken() {
        Type typeCapture = capture();
        this.runtimeType = typeCapture;
        w.x0(!(typeCapture instanceof TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", typeCapture);
    }

    protected TypeToken(Class<?> cls) {
        Type typeCapture = super.capture();
        if (typeCapture instanceof Class) {
            this.runtimeType = typeCapture;
        } else {
            this.runtimeType = n.d(cls).j(typeCapture);
        }
    }

    private TypeToken(Type type) {
        this.runtimeType = (Type) w.E(type);
    }

    /* synthetic */ TypeToken(Type type, a aVar) {
        this(type);
    }

    private static e any(Type[] typeArr) {
        return new e(typeArr, true);
    }

    @CheckForNull
    private TypeToken<? super T> boundAsSuperclass(Type type) {
        TypeToken<? super T> typeToken = (TypeToken<? super T>) of(type);
        if (typeToken.getRawType().isInterface()) {
            return null;
        }
        return typeToken;
    }

    private ImmutableList<TypeToken<? super T>> boundsAsInterfaces(Type[] typeArr) {
        ImmutableList.a aVarQ = ImmutableList.q();
        for (Type type : typeArr) {
            TypeToken<?> typeTokenOf = of(type);
            if (typeTokenOf.getRawType().isInterface()) {
                aVarQ.a(typeTokenOf);
            }
        }
        return aVarQ.e();
    }

    private static Type canonicalizeTypeArg(TypeVariable<?> typeVariable, Type type) {
        return type instanceof WildcardType ? canonicalizeWildcardType(typeVariable, (WildcardType) type) : canonicalizeWildcardsInType(type);
    }

    private static WildcardType canonicalizeWildcardType(TypeVariable<?> typeVariable, WildcardType wildcardType) {
        Type[] bounds = typeVariable.getBounds();
        ArrayList arrayList = new ArrayList();
        for (Type type : wildcardType.getUpperBounds()) {
            if (!any(bounds).a(type)) {
                arrayList.add(canonicalizeWildcardsInType(type));
            }
        }
        return new Types.WildcardTypeImpl(wildcardType.getLowerBounds(), (Type[]) arrayList.toArray(new Type[0]));
    }

    private static ParameterizedType canonicalizeWildcardsInParameterizedType(ParameterizedType parameterizedType) {
        Class cls = (Class) parameterizedType.getRawType();
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
            actualTypeArguments[i10] = canonicalizeTypeArg(typeParameters[i10], actualTypeArguments[i10]);
        }
        return Types.m(parameterizedType.getOwnerType(), cls, actualTypeArguments);
    }

    private static Type canonicalizeWildcardsInType(Type type) {
        if (type instanceof ParameterizedType) {
            return canonicalizeWildcardsInParameterizedType((ParameterizedType) type);
        }
        return type instanceof GenericArrayType ? Types.j(canonicalizeWildcardsInType(((GenericArrayType) type).getGenericComponentType())) : type;
    }

    private static e every(Type[] typeArr) {
        return new e(typeArr, false);
    }

    private TypeToken<? extends T> getArraySubtype(Class<?> cls) {
        Class<?> componentType = cls.getComponentType();
        if (componentType != null) {
            TypeToken<?> componentType2 = getComponentType();
            Objects.requireNonNull(componentType2);
            return (TypeToken<? extends T>) of(newArrayClassOrGenericArrayType(componentType2.getSubtype(componentType).runtimeType));
        }
        String strValueOf = String.valueOf(cls);
        String strValueOf2 = String.valueOf(this);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 36 + strValueOf2.length());
        sb2.append(strValueOf);
        sb2.append(" does not appear to be a subtype of ");
        sb2.append(strValueOf2);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TypeToken<? super T> getArraySupertype(Class<? super T> cls) {
        TypeToken<?> componentType = getComponentType();
        if (componentType != 0) {
            Class<?> componentType2 = cls.getComponentType();
            Objects.requireNonNull(componentType2);
            return (TypeToken<? super T>) of(newArrayClassOrGenericArrayType(componentType.getSupertype(componentType2).runtimeType));
        }
        String strValueOf = String.valueOf(cls);
        String strValueOf2 = String.valueOf(this);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 23 + strValueOf2.length());
        sb2.append(strValueOf);
        sb2.append(" isn't a super type of ");
        sb2.append(strValueOf2);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public n getCovariantTypeResolver() {
        n nVar = this.covariantTypeResolver;
        if (nVar != null) {
            return nVar;
        }
        n nVarD = n.d(this.runtimeType);
        this.covariantTypeResolver = nVarD;
        return nVarD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public n getInvariantTypeResolver() {
        n nVar = this.invariantTypeResolver;
        if (nVar != null) {
            return nVar;
        }
        n nVarF = n.f(this.runtimeType);
        this.invariantTypeResolver = nVarF;
        return nVarF;
    }

    @CheckForNull
    private Type getOwnerTypeIfPresent() {
        Type type = this.runtimeType;
        if (type instanceof ParameterizedType) {
            return ((ParameterizedType) type).getOwnerType();
        }
        if (type instanceof Class) {
            return ((Class) type).getEnclosingClass();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ImmutableSet<Class<? super T>> getRawTypes() {
        ImmutableSet.a aVarQ = ImmutableSet.q();
        new d(this, aVarQ).a(this.runtimeType);
        return aVarQ.e();
    }

    private TypeToken<? extends T> getSubtypeFromLowerBounds(Class<?> cls, Type[] typeArr) {
        if (typeArr.length > 0) {
            return (TypeToken<? extends T>) of(typeArr[0]).getSubtype(cls);
        }
        String strValueOf = String.valueOf(cls);
        String strValueOf2 = String.valueOf(this);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 21 + strValueOf2.length());
        sb2.append(strValueOf);
        sb2.append(" isn't a subclass of ");
        sb2.append(strValueOf2);
        throw new IllegalArgumentException(sb2.toString());
    }

    private TypeToken<? super T> getSupertypeFromUpperBounds(Class<? super T> cls, Type[] typeArr) {
        for (Type type : typeArr) {
            TypeToken<?> typeTokenOf = of(type);
            if (typeTokenOf.isSubtypeOf(cls)) {
                return (TypeToken<? super T>) typeTokenOf.getSupertype(cls);
            }
        }
        String strValueOf = String.valueOf(cls);
        String strValueOf2 = String.valueOf(this);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 23 + strValueOf2.length());
        sb2.append(strValueOf);
        sb2.append(" isn't a super type of ");
        sb2.append(strValueOf2);
        throw new IllegalArgumentException(sb2.toString());
    }

    private boolean is(Type type, TypeVariable<?> typeVariable) {
        if (this.runtimeType.equals(type)) {
            return true;
        }
        if (!(type instanceof WildcardType)) {
            return canonicalizeWildcardsInType(this.runtimeType).equals(canonicalizeWildcardsInType(type));
        }
        WildcardType wildcardTypeCanonicalizeWildcardType = canonicalizeWildcardType(typeVariable, (WildcardType) type);
        return every(wildcardTypeCanonicalizeWildcardType.getUpperBounds()).b(this.runtimeType) && every(wildcardTypeCanonicalizeWildcardType.getLowerBounds()).a(this.runtimeType);
    }

    private boolean isOwnedBySubtypeOf(Type type) {
        Iterator<TypeToken<? super T>> it = getTypes().iterator();
        while (it.hasNext()) {
            Type ownerTypeIfPresent = it.next().getOwnerTypeIfPresent();
            if (ownerTypeIfPresent != null && of(ownerTypeIfPresent).isSubtypeOf(type)) {
                return true;
            }
        }
        return false;
    }

    private boolean isSubtypeOfArrayType(GenericArrayType genericArrayType) {
        Type type = this.runtimeType;
        if (!(type instanceof Class)) {
            if (type instanceof GenericArrayType) {
                return of(((GenericArrayType) type).getGenericComponentType()).isSubtypeOf(genericArrayType.getGenericComponentType());
            }
            return false;
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            return of((Class) cls.getComponentType()).isSubtypeOf(genericArrayType.getGenericComponentType());
        }
        return false;
    }

    private boolean isSubtypeOfParameterizedType(ParameterizedType parameterizedType) {
        Class<? super Object> rawType = of(parameterizedType).getRawType();
        if (!someRawTypeIsSubclassOf(rawType)) {
            return false;
        }
        TypeVariable<Class<? super Object>>[] typeParameters = rawType.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i10 = 0; i10 < typeParameters.length; i10++) {
            if (!of(getCovariantTypeResolver().j(typeParameters[i10])).is(actualTypeArguments[i10], typeParameters[i10])) {
                return false;
            }
        }
        return Modifier.isStatic(((Class) parameterizedType.getRawType()).getModifiers()) || parameterizedType.getOwnerType() == null || isOwnedBySubtypeOf(parameterizedType.getOwnerType());
    }

    private boolean isSupertypeOfArray(GenericArrayType genericArrayType) {
        Type type = this.runtimeType;
        if (type instanceof Class) {
            Class cls = (Class) type;
            return !cls.isArray() ? cls.isAssignableFrom(Object[].class) : of(genericArrayType.getGenericComponentType()).isSubtypeOf(cls.getComponentType());
        }
        if (type instanceof GenericArrayType) {
            return of(genericArrayType.getGenericComponentType()).isSubtypeOf(((GenericArrayType) this.runtimeType).getGenericComponentType());
        }
        return false;
    }

    private boolean isWrapper() {
        return com.google.common.primitives.h.c().contains(this.runtimeType);
    }

    private static Type newArrayClassOrGenericArrayType(Type type) {
        return Types.JavaVersion.JAVA7.newArrayType(type);
    }

    public static <T> TypeToken<T> of(Class<T> cls) {
        return new SimpleTypeToken(cls);
    }

    public static TypeToken<?> of(Type type) {
        return new SimpleTypeToken(type);
    }

    private TypeToken<?> resolveSupertype(Type type) {
        TypeToken<?> typeTokenOf = of(getCovariantTypeResolver().j(type));
        typeTokenOf.covariantTypeResolver = this.covariantTypeResolver;
        typeTokenOf.invariantTypeResolver = this.invariantTypeResolver;
        return typeTokenOf;
    }

    private Type resolveTypeArgsForSubclass(Class<?> cls) {
        if ((this.runtimeType instanceof Class) && (cls.getTypeParameters().length == 0 || getRawType().getTypeParameters().length != 0)) {
            return cls;
        }
        TypeToken genericType = toGenericType(cls);
        return new n().n(genericType.getSupertype(getRawType()).runtimeType, this.runtimeType).j(genericType.runtimeType);
    }

    private boolean someRawTypeIsSubclassOf(Class<?> cls) {
        b3<Class<? super T>> it = getRawTypes().iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(it.next())) {
                return true;
            }
        }
        return false;
    }

    @o9.d
    static <T> TypeToken<? extends T> toGenericType(Class<T> cls) {
        if (cls.isArray()) {
            return (TypeToken<? extends T>) of(Types.j(toGenericType(cls.getComponentType()).runtimeType));
        }
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        Type type = (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) ? null : toGenericType(cls.getEnclosingClass()).runtimeType;
        return (typeParameters.length > 0 || !(type == null || type == cls.getEnclosingClass())) ? (TypeToken<? extends T>) of(Types.m(type, cls, typeParameters)) : of((Class) cls);
    }

    @o9.a
    public final com.google.common.reflect.f<T, T> constructor(Constructor<?> constructor) {
        w.y(constructor.getDeclaringClass() == getRawType(), "%s not declared by %s", constructor, getRawType());
        return new b(constructor);
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj instanceof TypeToken) {
            return this.runtimeType.equals(((TypeToken) obj).runtimeType);
        }
        return false;
    }

    @CheckForNull
    public final TypeToken<?> getComponentType() {
        Type typeI = Types.i(this.runtimeType);
        if (typeI == null) {
            return null;
        }
        return of(typeI);
    }

    final ImmutableList<TypeToken<? super T>> getGenericInterfaces() {
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return boundsAsInterfaces(((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return boundsAsInterfaces(((WildcardType) type).getUpperBounds());
        }
        ImmutableList.a aVarQ = ImmutableList.q();
        for (Type type2 : getRawType().getGenericInterfaces()) {
            aVarQ.a(resolveSupertype(type2));
        }
        return aVarQ.e();
    }

    @CheckForNull
    final TypeToken<? super T> getGenericSuperclass() {
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return boundAsSuperclass(((TypeVariable) type).getBounds()[0]);
        }
        if (type instanceof WildcardType) {
            return boundAsSuperclass(((WildcardType) type).getUpperBounds()[0]);
        }
        Type genericSuperclass = getRawType().getGenericSuperclass();
        if (genericSuperclass == null) {
            return null;
        }
        return (TypeToken<? super T>) resolveSupertype(genericSuperclass);
    }

    public final Class<? super T> getRawType() {
        return getRawTypes().iterator().next();
    }

    public final TypeToken<? extends T> getSubtype(Class<?> cls) {
        w.u(!(this.runtimeType instanceof TypeVariable), "Cannot get subtype of type variable <%s>", this);
        Type type = this.runtimeType;
        if (type instanceof WildcardType) {
            return getSubtypeFromLowerBounds(cls, ((WildcardType) type).getLowerBounds());
        }
        if (isArray()) {
            return getArraySubtype(cls);
        }
        w.y(getRawType().isAssignableFrom(cls), "%s isn't a subclass of %s", cls, this);
        TypeToken<? extends T> typeToken = (TypeToken<? extends T>) of(resolveTypeArgsForSubclass(cls));
        w.y(typeToken.isSubtypeOf((TypeToken<?>) this), "%s does not appear to be a subtype of %s", typeToken, this);
        return typeToken;
    }

    public final TypeToken<? super T> getSupertype(Class<? super T> cls) {
        w.y(someRawTypeIsSubclassOf(cls), "%s is not a super class of %s", cls, this);
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return getSupertypeFromUpperBounds(cls, ((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return getSupertypeFromUpperBounds(cls, ((WildcardType) type).getUpperBounds());
        }
        return cls.isArray() ? getArraySupertype(cls) : (TypeToken<? super T>) resolveSupertype(toGenericType(cls).runtimeType);
    }

    public final Type getType() {
        return this.runtimeType;
    }

    public final TypeToken<T>.TypeSet getTypes() {
        return new TypeSet();
    }

    public int hashCode() {
        return this.runtimeType.hashCode();
    }

    public final boolean isArray() {
        return getComponentType() != null;
    }

    public final boolean isPrimitive() {
        Type type = this.runtimeType;
        return (type instanceof Class) && ((Class) type).isPrimitive();
    }

    public final boolean isSubtypeOf(TypeToken<?> typeToken) {
        return isSubtypeOf(typeToken.getType());
    }

    public final boolean isSubtypeOf(Type type) {
        w.E(type);
        if (type instanceof WildcardType) {
            return any(((WildcardType) type).getLowerBounds()).b(this.runtimeType);
        }
        Type type2 = this.runtimeType;
        if (type2 instanceof WildcardType) {
            return any(((WildcardType) type2).getUpperBounds()).a(type);
        }
        if (type2 instanceof TypeVariable) {
            return type2.equals(type) || any(((TypeVariable) this.runtimeType).getBounds()).a(type);
        }
        if (type2 instanceof GenericArrayType) {
            return of(type).isSupertypeOfArray((GenericArrayType) this.runtimeType);
        }
        if (type instanceof Class) {
            return someRawTypeIsSubclassOf((Class) type);
        }
        if (type instanceof ParameterizedType) {
            return isSubtypeOfParameterizedType((ParameterizedType) type);
        }
        if (type instanceof GenericArrayType) {
            return isSubtypeOfArrayType((GenericArrayType) type);
        }
        return false;
    }

    public final boolean isSupertypeOf(TypeToken<?> typeToken) {
        return typeToken.isSubtypeOf(getType());
    }

    public final boolean isSupertypeOf(Type type) {
        return of(type).isSubtypeOf(getType());
    }

    @o9.a
    public final com.google.common.reflect.f<T, Object> method(Method method) {
        w.y(someRawTypeIsSubclassOf(method.getDeclaringClass()), "%s not declared by %s", method, this);
        return new a(method);
    }

    @s9.a
    final TypeToken<T> rejectTypeVariables() {
        new c().a(this.runtimeType);
        return this;
    }

    public final TypeToken<?> resolveType(Type type) {
        w.E(type);
        return of(getInvariantTypeResolver().j(type));
    }

    public String toString() {
        return Types.s(this.runtimeType);
    }

    public final TypeToken<T> unwrap() {
        return isWrapper() ? of(com.google.common.primitives.h.e((Class) this.runtimeType)) : this;
    }

    public final <X> TypeToken<T> where(m<X> mVar, TypeToken<X> typeToken) {
        return new SimpleTypeToken(new n().o(ImmutableMap.w(new n.d(mVar.f59148b), typeToken.runtimeType)).j(this.runtimeType));
    }

    public final <X> TypeToken<T> where(m<X> mVar, Class<X> cls) {
        return where(mVar, of((Class) cls));
    }

    public final TypeToken<T> wrap() {
        return isPrimitive() ? of(com.google.common.primitives.h.f((Class) this.runtimeType)) : this;
    }

    protected Object writeReplace() {
        return of(new n().j(this.runtimeType));
    }
}
