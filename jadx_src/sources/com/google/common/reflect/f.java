package com.google.common.reflect;

import com.google.common.base.w;
import com.google.common.collect.ImmutableList;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Invokable.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.a
@d
public abstract class f<T, R> implements AnnotatedElement, Member {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AccessibleObject f59137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Member f59138c;

    /* JADX INFO: compiled from: Invokable.java */
    public static class a<T> extends f<T, T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Constructor<?> f59139d;

        a(Constructor<?> constructor) {
            super(constructor);
            this.f59139d = constructor;
        }

        private boolean K0() {
            Class<?> declaringClass = this.f59139d.getDeclaringClass();
            if (declaringClass.getEnclosingConstructor() != null) {
                return true;
            }
            Method enclosingMethod = declaringClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                return !Modifier.isStatic(enclosingMethod.getModifiers());
            }
            return (declaringClass.getEnclosingClass() == null || Modifier.isStatic(declaringClass.getModifiers())) ? false : true;
        }

        @Override // com.google.common.reflect.f
        public final boolean E0() {
            return this.f59139d.isVarArgs();
        }

        @Override // com.google.common.reflect.f
        public final TypeVariable<?>[] getTypeParameters() {
            TypeVariable<Class<? super T>>[] typeParameters = getDeclaringClass().getTypeParameters();
            TypeVariable<Constructor<?>>[] typeParameters2 = this.f59139d.getTypeParameters();
            TypeVariable<?>[] typeVariableArr = new TypeVariable[typeParameters.length + typeParameters2.length];
            System.arraycopy(typeParameters, 0, typeVariableArr, 0, typeParameters.length);
            System.arraycopy(typeParameters2, 0, typeVariableArr, typeParameters.length, typeParameters2.length);
            return typeVariableArr;
        }

        @Override // com.google.common.reflect.f
        Type[] j0() {
            return this.f59139d.getGenericExceptionTypes();
        }

        @Override // com.google.common.reflect.f
        Type[] k0() {
            Type[] genericParameterTypes = this.f59139d.getGenericParameterTypes();
            if (genericParameterTypes.length <= 0 || !K0()) {
                return genericParameterTypes;
            }
            Class<?>[] parameterTypes = this.f59139d.getParameterTypes();
            return (genericParameterTypes.length == parameterTypes.length && parameterTypes[0] == getDeclaringClass().getEnclosingClass()) ? (Type[]) Arrays.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length) : genericParameterTypes;
        }

        @Override // com.google.common.reflect.f
        Type l0() {
            Class<? super T> declaringClass = getDeclaringClass();
            TypeVariable<Class<? super T>>[] typeParameters = declaringClass.getTypeParameters();
            return typeParameters.length > 0 ? Types.l(declaringClass, typeParameters) : declaringClass;
        }

        @Override // com.google.common.reflect.f
        final Annotation[][] n0() {
            return this.f59139d.getParameterAnnotations();
        }

        @Override // com.google.common.reflect.f
        final Object r0(@CheckForNull Object obj, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
            try {
                return this.f59139d.newInstance(objArr);
            } catch (InstantiationException e10) {
                String strValueOf = String.valueOf(this.f59139d);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 8);
                sb2.append(strValueOf);
                sb2.append(" failed.");
                throw new RuntimeException(sb2.toString(), e10);
            }
        }

        @Override // com.google.common.reflect.f
        public final boolean w0() {
            return false;
        }
    }

    /* JADX INFO: compiled from: Invokable.java */
    public static class b<T> extends f<T, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Method f59140d;

        b(Method method) {
            super(method);
            this.f59140d = method;
        }

        @Override // com.google.common.reflect.f
        public final boolean E0() {
            return this.f59140d.isVarArgs();
        }

        @Override // com.google.common.reflect.f
        public final TypeVariable<?>[] getTypeParameters() {
            return this.f59140d.getTypeParameters();
        }

        @Override // com.google.common.reflect.f
        Type[] j0() {
            return this.f59140d.getGenericExceptionTypes();
        }

        @Override // com.google.common.reflect.f
        Type[] k0() {
            return this.f59140d.getGenericParameterTypes();
        }

        @Override // com.google.common.reflect.f
        Type l0() {
            return this.f59140d.getGenericReturnType();
        }

        @Override // com.google.common.reflect.f
        final Annotation[][] n0() {
            return this.f59140d.getParameterAnnotations();
        }

        @Override // com.google.common.reflect.f
        @CheckForNull
        final Object r0(@CheckForNull Object obj, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
            return this.f59140d.invoke(obj, objArr);
        }

        @Override // com.google.common.reflect.f
        public final boolean w0() {
            return (u0() || y0() || B0() || Modifier.isFinal(getDeclaringClass().getModifiers())) ? false : true;
        }
    }

    <M extends AccessibleObject & Member> f(M m10) {
        w.E(m10);
        this.f59137b = m10;
        this.f59138c = m10;
    }

    public static <T> f<T, T> g0(Constructor<T> constructor) {
        return new a(constructor);
    }

    public static f<?, Object> h0(Method method) {
        return new b(method);
    }

    public final boolean A0() {
        return Modifier.isPublic(getModifiers());
    }

    public final boolean B0() {
        return Modifier.isStatic(getModifiers());
    }

    public final boolean C0() {
        return Modifier.isSynchronized(getModifiers());
    }

    final boolean D0() {
        return Modifier.isTransient(getModifiers());
    }

    public abstract boolean E0();

    final boolean F0() {
        return Modifier.isVolatile(getModifiers());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R1 extends R> f<T, R1> G0(TypeToken<R1> typeToken) {
        if (typeToken.isSupertypeOf(p0())) {
            return this;
        }
        String strValueOf = String.valueOf(p0());
        String strValueOf2 = String.valueOf(typeToken);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 35 + strValueOf2.length());
        sb2.append("Invokable is known to return ");
        sb2.append(strValueOf);
        sb2.append(", not ");
        sb2.append(strValueOf2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public final <R1 extends R> f<T, R1> H0(Class<R1> cls) {
        return G0(TypeToken.of((Class) cls));
    }

    public final void I0(boolean z10) {
        this.f59137b.setAccessible(z10);
    }

    public final boolean J0() {
        try {
            this.f59137b.setAccessible(true);
            return true;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    public boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return m0().equals(fVar.m0()) && this.f59138c.equals(fVar.f59138c);
    }

    @Override // java.lang.reflect.AnnotatedElement
    @CheckForNull
    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this.f59137b.getAnnotation(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getAnnotations() {
        return this.f59137b.getAnnotations();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getDeclaredAnnotations() {
        return this.f59137b.getDeclaredAnnotations();
    }

    @Override // java.lang.reflect.Member
    public final Class<? super T> getDeclaringClass() {
        return (Class<? super T>) this.f59138c.getDeclaringClass();
    }

    @Override // java.lang.reflect.Member
    public final int getModifiers() {
        return this.f59138c.getModifiers();
    }

    @Override // java.lang.reflect.Member
    public final String getName() {
        return this.f59138c.getName();
    }

    public abstract TypeVariable<?>[] getTypeParameters();

    public int hashCode() {
        return this.f59138c.hashCode();
    }

    public final ImmutableList<TypeToken<? extends Throwable>> i0() {
        ImmutableList.a aVarQ = ImmutableList.q();
        for (Type type : j0()) {
            aVarQ.a(TypeToken.of(type));
        }
        return aVarQ.e();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        return this.f59137b.isAnnotationPresent(cls);
    }

    @Override // java.lang.reflect.Member
    public final boolean isSynthetic() {
        return this.f59138c.isSynthetic();
    }

    abstract Type[] j0();

    abstract Type[] k0();

    abstract Type l0();

    public TypeToken<T> m0() {
        return TypeToken.of((Class) getDeclaringClass());
    }

    abstract Annotation[][] n0();

    public final ImmutableList<i> o0() {
        Type[] typeArrK0 = k0();
        Annotation[][] annotationArrN0 = n0();
        ImmutableList.a aVarQ = ImmutableList.q();
        for (int i10 = 0; i10 < typeArrK0.length; i10++) {
            aVarQ.a(new i(this, i10, TypeToken.of(typeArrK0[i10]), annotationArrN0[i10]));
        }
        return aVarQ.e();
    }

    public final TypeToken<? extends R> p0() {
        return (TypeToken<? extends R>) TypeToken.of(l0());
    }

    @s9.a
    @CheckForNull
    public final R q0(@CheckForNull T t10, Object... objArr) throws IllegalAccessException, InvocationTargetException {
        return (R) r0(t10, (Object[]) w.E(objArr));
    }

    @CheckForNull
    abstract Object r0(@CheckForNull Object obj, Object[] objArr) throws IllegalAccessException, InvocationTargetException;

    public final boolean s0() {
        return Modifier.isAbstract(getModifiers());
    }

    public final boolean t0() {
        return this.f59137b.isAccessible();
    }

    public String toString() {
        return this.f59138c.toString();
    }

    public final boolean u0() {
        return Modifier.isFinal(getModifiers());
    }

    public final boolean v0() {
        return Modifier.isNative(getModifiers());
    }

    public abstract boolean w0();

    public final boolean x0() {
        return (y0() || A0() || z0()) ? false : true;
    }

    public final boolean y0() {
        return Modifier.isPrivate(getModifiers());
    }

    public final boolean z0() {
        return Modifier.isProtected(getModifiers());
    }
}
