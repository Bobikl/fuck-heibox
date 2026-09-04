package com.google.common.reflect;

import com.google.common.base.w;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.CheckForNull;
import kotlin.text.y;

/* JADX INFO: compiled from: TypeResolver.java */
/* JADX INFO: loaded from: classes7.dex */
@com.google.common.reflect.d
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f59149a;

    /* JADX INFO: compiled from: TypeResolver.java */
    public class a extends q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f59150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Type f59151c;

        a(Map map, Type type) {
            this.f59150b = map;
            this.f59151c = type;
        }

        @Override // com.google.common.reflect.q
        void b(Class<?> cls) {
            if (this.f59151c instanceof WildcardType) {
                return;
            }
            String strValueOf = String.valueOf(cls);
            String strValueOf2 = String.valueOf(this.f59151c);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 25 + strValueOf2.length());
            sb2.append("No type mapping from ");
            sb2.append(strValueOf);
            sb2.append(" to ");
            sb2.append(strValueOf2);
            throw new IllegalArgumentException(sb2.toString());
        }

        @Override // com.google.common.reflect.q
        void c(GenericArrayType genericArrayType) {
            Type type = this.f59151c;
            if (type instanceof WildcardType) {
                return;
            }
            Type typeI = Types.i(type);
            w.u(typeI != null, "%s is not an array type.", this.f59151c);
            n.g(this.f59150b, genericArrayType.getGenericComponentType(), typeI);
        }

        @Override // com.google.common.reflect.q
        void d(ParameterizedType parameterizedType) {
            Type type = this.f59151c;
            if (type instanceof WildcardType) {
                return;
            }
            ParameterizedType parameterizedType2 = (ParameterizedType) n.e(ParameterizedType.class, type);
            if (parameterizedType.getOwnerType() != null && parameterizedType2.getOwnerType() != null) {
                n.g(this.f59150b, parameterizedType.getOwnerType(), parameterizedType2.getOwnerType());
            }
            w.y(parameterizedType.getRawType().equals(parameterizedType2.getRawType()), "Inconsistent raw type: %s vs. %s", parameterizedType, this.f59151c);
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
            w.y(actualTypeArguments.length == actualTypeArguments2.length, "%s not compatible with %s", parameterizedType, parameterizedType2);
            for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
                n.g(this.f59150b, actualTypeArguments[i10], actualTypeArguments2[i10]);
            }
        }

        @Override // com.google.common.reflect.q
        void e(TypeVariable<?> typeVariable) {
            this.f59150b.put(new d(typeVariable), this.f59151c);
        }

        @Override // com.google.common.reflect.q
        void f(WildcardType wildcardType) {
            Type type = this.f59151c;
            if (type instanceof WildcardType) {
                WildcardType wildcardType2 = (WildcardType) type;
                Type[] upperBounds = wildcardType.getUpperBounds();
                Type[] upperBounds2 = wildcardType2.getUpperBounds();
                Type[] lowerBounds = wildcardType.getLowerBounds();
                Type[] lowerBounds2 = wildcardType2.getLowerBounds();
                w.y(upperBounds.length == upperBounds2.length && lowerBounds.length == lowerBounds2.length, "Incompatible type: %s vs. %s", wildcardType, this.f59151c);
                for (int i10 = 0; i10 < upperBounds.length; i10++) {
                    n.g(this.f59150b, upperBounds[i10], upperBounds2[i10]);
                }
                for (int i11 = 0; i11 < lowerBounds.length; i11++) {
                    n.g(this.f59150b, lowerBounds[i11], lowerBounds2[i11]);
                }
            }
        }
    }

    /* JADX INFO: compiled from: TypeResolver.java */
    public static final class b extends q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<d, Type> f59152b = Maps.Y();

        private b() {
        }

        static ImmutableMap<d, Type> g(Type type) {
            w.E(type);
            b bVar = new b();
            bVar.a(type);
            return ImmutableMap.g(bVar.f59152b);
        }

        private void h(d dVar, Type type) {
            if (this.f59152b.containsKey(dVar)) {
                return;
            }
            Type type2 = type;
            while (type2 != null) {
                if (dVar.a(type2)) {
                    while (type != null) {
                        type = this.f59152b.remove(d.c(type));
                    }
                    return;
                }
                type2 = this.f59152b.get(d.c(type2));
            }
            this.f59152b.put(dVar, type);
        }

        @Override // com.google.common.reflect.q
        void b(Class<?> cls) {
            a(cls.getGenericSuperclass());
            a(cls.getGenericInterfaces());
        }

        @Override // com.google.common.reflect.q
        void d(ParameterizedType parameterizedType) {
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            w.g0(typeParameters.length == actualTypeArguments.length);
            for (int i10 = 0; i10 < typeParameters.length; i10++) {
                h(new d(typeParameters[i10]), actualTypeArguments[i10]);
            }
            a(cls);
            a(parameterizedType.getOwnerType());
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

    /* JADX INFO: compiled from: TypeResolver.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ImmutableMap<d, Type> f59153a;

        /* JADX INFO: compiled from: TypeResolver.java */
        public class a extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TypeVariable f59154b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ c f59155c;

            a(c cVar, TypeVariable typeVariable, c cVar2) {
                this.f59154b = typeVariable;
                this.f59155c = cVar2;
            }

            @Override // com.google.common.reflect.n.c
            public Type b(TypeVariable<?> typeVariable, c cVar) {
                return typeVariable.getGenericDeclaration().equals(this.f59154b.getGenericDeclaration()) ? typeVariable : this.f59155c.b(typeVariable, cVar);
            }
        }

        c() {
            this.f59153a = ImmutableMap.v();
        }

        private c(ImmutableMap<d, Type> immutableMap) {
            this.f59153a = immutableMap;
        }

        final Type a(TypeVariable<?> typeVariable) {
            return b(typeVariable, new a(this, typeVariable, this));
        }

        Type b(TypeVariable<?> typeVariable, c cVar) {
            Type type = this.f59153a.get(new d(typeVariable));
            a aVar = null;
            if (type != null) {
                return new n(cVar, aVar).j(type);
            }
            Type[] bounds = typeVariable.getBounds();
            if (bounds.length == 0) {
                return typeVariable;
            }
            Type[] typeArrK = new n(cVar, aVar).k(bounds);
            return (Types.b.f59118a && Arrays.equals(bounds, typeArrK)) ? typeVariable : Types.k(typeVariable.getGenericDeclaration(), typeVariable.getName(), typeArrK);
        }

        final c c(Map<d, ? extends Type> map) {
            ImmutableMap.b bVarB = ImmutableMap.b();
            bVarB.l(this.f59153a);
            for (Map.Entry<d, ? extends Type> entry : map.entrySet()) {
                d key = entry.getKey();
                Type value = entry.getValue();
                w.u(!key.a(value), "Type variable %s bound to itself", key);
                bVarB.i(key, value);
            }
            return new c(bVarB.d());
        }
    }

    /* JADX INFO: compiled from: TypeResolver.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TypeVariable<?> f59156a;

        d(TypeVariable<?> typeVariable) {
            this.f59156a = (TypeVariable) w.E(typeVariable);
        }

        private boolean b(TypeVariable<?> typeVariable) {
            return this.f59156a.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && this.f59156a.getName().equals(typeVariable.getName());
        }

        @CheckForNull
        static d c(Type type) {
            if (type instanceof TypeVariable) {
                return new d((TypeVariable) type);
            }
            return null;
        }

        boolean a(Type type) {
            if (type instanceof TypeVariable) {
                return b((TypeVariable) type);
            }
            return false;
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof d) {
                return b(((d) obj).f59156a);
            }
            return false;
        }

        public int hashCode() {
            return com.google.common.base.s.b(this.f59156a.getGenericDeclaration(), this.f59156a.getName());
        }

        public String toString() {
            return this.f59156a.toString();
        }
    }

    /* JADX INFO: compiled from: TypeResolver.java */
    public static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final e f59157b = new e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f59158a;

        /* JADX INFO: compiled from: TypeResolver.java */
        public class a extends e {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TypeVariable f59159c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, AtomicInteger atomicInteger, TypeVariable typeVariable) {
                super(atomicInteger, null);
                this.f59159c = typeVariable;
            }

            @Override // com.google.common.reflect.n.e
            TypeVariable<?> b(Type[] typeArr) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(typeArr));
                linkedHashSet.addAll(Arrays.asList(this.f59159c.getBounds()));
                if (linkedHashSet.size() > 1) {
                    linkedHashSet.remove(Object.class);
                }
                return super.b((Type[]) linkedHashSet.toArray(new Type[0]));
            }
        }

        private e() {
            this(new AtomicInteger());
        }

        private e(AtomicInteger atomicInteger) {
            this.f59158a = atomicInteger;
        }

        /* synthetic */ e(AtomicInteger atomicInteger, a aVar) {
            this(atomicInteger);
        }

        @CheckForNull
        private Type c(@CheckForNull Type type) {
            if (type == null) {
                return null;
            }
            return a(type);
        }

        private e d(TypeVariable<?> typeVariable) {
            return new a(this, this.f59158a, typeVariable);
        }

        private e e() {
            return new e(this.f59158a);
        }

        final Type a(Type type) {
            w.E(type);
            if ((type instanceof Class) || (type instanceof TypeVariable)) {
                return type;
            }
            if (type instanceof GenericArrayType) {
                return Types.j(e().a(((GenericArrayType) type).getGenericComponentType()));
            }
            if (!(type instanceof ParameterizedType)) {
                if (!(type instanceof WildcardType)) {
                    throw new AssertionError("must have been one of the known types");
                }
                WildcardType wildcardType = (WildcardType) type;
                return wildcardType.getLowerBounds().length == 0 ? b(wildcardType.getUpperBounds()) : type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable<?>[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
                actualTypeArguments[i10] = d(typeParameters[i10]).a(actualTypeArguments[i10]);
            }
            return Types.m(e().c(parameterizedType.getOwnerType()), cls, actualTypeArguments);
        }

        TypeVariable<?> b(Type[] typeArr) {
            int iIncrementAndGet = this.f59158a.incrementAndGet();
            String strN = com.google.common.base.p.o(y.f128595d).n(typeArr);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strN).length() + 33);
            sb2.append("capture#");
            sb2.append(iIncrementAndGet);
            sb2.append("-of ? extends ");
            sb2.append(strN);
            return Types.k(e.class, sb2.toString(), typeArr);
        }
    }

    public n() {
        this.f59149a = new c();
    }

    private n(c cVar) {
        this.f59149a = cVar;
    }

    /* synthetic */ n(c cVar, a aVar) {
        this(cVar);
    }

    static n d(Type type) {
        return new n().o(b.g(type));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T e(Class<T> cls, Object obj) {
        try {
            return cls.cast(obj);
        } catch (ClassCastException unused) {
            String strValueOf = String.valueOf(obj);
            String simpleName = cls.getSimpleName();
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 10 + simpleName.length());
            sb2.append(strValueOf);
            sb2.append(" is not a ");
            sb2.append(simpleName);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    static n f(Type type) {
        return new n().o(b.g(e.f59157b.a(type)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(Map<d, Type> map, Type type, Type type2) {
        if (type.equals(type2)) {
            return;
        }
        new a(map, type2).a(type);
    }

    private Type h(GenericArrayType genericArrayType) {
        return Types.j(j(genericArrayType.getGenericComponentType()));
    }

    private ParameterizedType i(ParameterizedType parameterizedType) {
        Type ownerType = parameterizedType.getOwnerType();
        return Types.m(ownerType == null ? null : j(ownerType), (Class) j(parameterizedType.getRawType()), k(parameterizedType.getActualTypeArguments()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Type[] k(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i10 = 0; i10 < typeArr.length; i10++) {
            typeArr2[i10] = j(typeArr[i10]);
        }
        return typeArr2;
    }

    private WildcardType m(WildcardType wildcardType) {
        return new Types.WildcardTypeImpl(k(wildcardType.getLowerBounds()), k(wildcardType.getUpperBounds()));
    }

    public Type j(Type type) {
        w.E(type);
        if (type instanceof TypeVariable) {
            return this.f59149a.a((TypeVariable) type);
        }
        if (type instanceof ParameterizedType) {
            return i((ParameterizedType) type);
        }
        if (type instanceof GenericArrayType) {
            return h((GenericArrayType) type);
        }
        return type instanceof WildcardType ? m((WildcardType) type) : type;
    }

    Type[] l(Type[] typeArr) {
        for (int i10 = 0; i10 < typeArr.length; i10++) {
            typeArr[i10] = j(typeArr[i10]);
        }
        return typeArr;
    }

    public n n(Type type, Type type2) {
        HashMap mapY = Maps.Y();
        g(mapY, (Type) w.E(type), (Type) w.E(type2));
        return o(mapY);
    }

    n o(Map<d, ? extends Type> map) {
        return new n(this.f59149a.c(map));
    }
}
