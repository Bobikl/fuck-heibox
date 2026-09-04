package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;
import mi.b0;

/* JADX INFO: compiled from: ReflectJavaMethod.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class s extends r implements mi.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Method f125929a;

    public s(@dl.d Method member) {
        f0.p(member, "member");
        this.f125929a = member;
    }

    @Override // mi.r
    public boolean O() {
        return u() != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.r
    @dl.d
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public Method Q() {
        return this.f125929a;
    }

    @Override // mi.r
    @dl.d
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public x getReturnType() {
        x.a aVar = x.f125935a;
        Type genericReturnType = Q().getGenericReturnType();
        f0.o(genericReturnType, "member.genericReturnType");
        return aVar.a(genericReturnType);
    }

    @Override // mi.z
    @dl.d
    public List<y> getTypeParameters() {
        TypeVariable<Method>[] typeParameters = Q().getTypeParameters();
        f0.o(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new y(typeVariable));
        }
        return arrayList;
    }

    @Override // mi.r
    @dl.d
    public List<b0> i() {
        Type[] genericParameterTypes = Q().getGenericParameterTypes();
        f0.o(genericParameterTypes, "member.genericParameterTypes");
        Annotation[][] parameterAnnotations = Q().getParameterAnnotations();
        f0.o(parameterAnnotations, "member.parameterAnnotations");
        return R(genericParameterTypes, parameterAnnotations, Q().isVarArgs());
    }

    @Override // mi.r
    @dl.e
    public mi.b u() {
        Object defaultValue = Q().getDefaultValue();
        if (defaultValue != null) {
            return e.f125914b.a(defaultValue, null);
        }
        return null;
    }
}
