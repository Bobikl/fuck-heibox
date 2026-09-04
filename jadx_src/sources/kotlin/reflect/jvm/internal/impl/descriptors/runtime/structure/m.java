package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import mi.b0;

/* JADX INFO: compiled from: ReflectJavaConstructor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class m extends r implements mi.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Constructor<?> f125925a;

    public m(@dl.d Constructor<?> member) {
        f0.p(member, "member");
        this.f125925a = member;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.r
    @dl.d
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public Constructor<?> Q() {
        return this.f125925a;
    }

    @Override // mi.z
    @dl.d
    public List<y> getTypeParameters() {
        TypeVariable<Constructor<?>>[] typeParameters = Q().getTypeParameters();
        f0.o(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Constructor<?>> typeVariable : typeParameters) {
            arrayList.add(new y(typeVariable));
        }
        return arrayList;
    }

    @Override // mi.k
    @dl.d
    public List<b0> i() {
        Type[] realTypes = Q().getGenericParameterTypes();
        f0.o(realTypes, "types");
        if (realTypes.length == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        Class<?> declaringClass = Q().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            realTypes = (Type[]) kotlin.collections.m.M1(realTypes, 1, realTypes.length);
        }
        Annotation[][] realAnnotations = Q().getParameterAnnotations();
        if (realAnnotations.length < realTypes.length) {
            throw new IllegalStateException("Illegal generic signature: " + Q());
        }
        if (realAnnotations.length > realTypes.length) {
            f0.o(realAnnotations, "annotations");
            realAnnotations = (Annotation[][]) kotlin.collections.m.M1(realAnnotations, realAnnotations.length - realTypes.length, realAnnotations.length);
        }
        f0.o(realTypes, "realTypes");
        f0.o(realAnnotations, "realAnnotations");
        return R(realTypes, realAnnotations, Q().isVarArgs());
    }
}
