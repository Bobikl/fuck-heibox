package kotlin.reflect.jvm.internal;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference2;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference2;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.ReflectLambdaKt;

/* JADX INFO: compiled from: ReflectionFactoryImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class o extends o0 {
    public static void u() {
        CachesKt.a();
        m.a();
    }

    private static KDeclarationContainerImpl v(CallableReference callableReference) {
        kotlin.reflect.h owner = callableReference.getOwner();
        return owner instanceof KDeclarationContainerImpl ? (KDeclarationContainerImpl) owner : f.f125319e;
    }

    @Override // kotlin.jvm.internal.o0
    public kotlin.reflect.d a(Class cls) {
        return new KClassImpl(cls);
    }

    @Override // kotlin.jvm.internal.o0
    public kotlin.reflect.d b(Class cls, String str) {
        return new KClassImpl(cls);
    }

    @Override // kotlin.jvm.internal.o0
    public kotlin.reflect.i c(FunctionReference functionReference) {
        return new KFunctionImpl(v(functionReference), functionReference.getName(), functionReference.getSignature(), functionReference.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.o0
    public kotlin.reflect.d d(Class cls) {
        return CachesKt.d(cls);
    }

    @Override // kotlin.jvm.internal.o0
    public kotlin.reflect.d e(Class cls, String str) {
        return CachesKt.d(cls);
    }

    @Override // kotlin.jvm.internal.o0
    public kotlin.reflect.h f(Class cls, String str) {
        return CachesKt.e(cls);
    }

    @Override // kotlin.jvm.internal.o0
    public kotlin.reflect.r g(kotlin.reflect.r rVar) {
        return q.a(rVar);
    }

    @Override // kotlin.jvm.internal.o0
    public kotlin.reflect.k h(MutablePropertyReference0 mutablePropertyReference0) {
        return new KMutableProperty0Impl(v(mutablePropertyReference0), mutablePropertyReference0.getName(), mutablePropertyReference0.getSignature(), mutablePropertyReference0.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.o0
    public kotlin.reflect.l i(MutablePropertyReference1 mutablePropertyReference1) {
        return new KMutableProperty1Impl(v(mutablePropertyReference1), mutablePropertyReference1.getName(), mutablePropertyReference1.getSignature(), mutablePropertyReference1.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.o0
    public kotlin.reflect.m j(MutablePropertyReference2 mutablePropertyReference2) {
        return new KMutableProperty2Impl(v(mutablePropertyReference2), mutablePropertyReference2.getName(), mutablePropertyReference2.getSignature());
    }

    @Override // kotlin.jvm.internal.o0
    public kotlin.reflect.r k(kotlin.reflect.r rVar) {
        return q.b(rVar);
    }

    @Override // kotlin.jvm.internal.o0
    public kotlin.reflect.r l(kotlin.reflect.r rVar, kotlin.reflect.r rVar2) {
        return q.c(rVar, rVar2);
    }

    @Override // kotlin.jvm.internal.o0
    public kotlin.reflect.o m(PropertyReference0 propertyReference0) {
        return new KProperty0Impl(v(propertyReference0), propertyReference0.getName(), propertyReference0.getSignature(), propertyReference0.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.o0
    public kotlin.reflect.p n(PropertyReference1 propertyReference1) {
        return new KProperty1Impl(v(propertyReference1), propertyReference1.getName(), propertyReference1.getSignature(), propertyReference1.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.o0
    public kotlin.reflect.q o(PropertyReference2 propertyReference2) {
        return new KProperty2Impl(v(propertyReference2), propertyReference2.getName(), propertyReference2.getSignature());
    }

    @Override // kotlin.jvm.internal.o0
    public String p(b0 b0Var) {
        KFunctionImpl kFunctionImplC;
        kotlin.reflect.i iVarA = ReflectLambdaKt.a(b0Var);
        return (iVarA == null || (kFunctionImplC = s.c(iVarA)) == null) ? super.p(b0Var) : ReflectionObjectRenderer.f125266a.e(kFunctionImplC.H());
    }

    @Override // kotlin.jvm.internal.o0
    public String q(Lambda lambda) {
        return p(lambda);
    }

    @Override // kotlin.jvm.internal.o0
    public void r(kotlin.reflect.s sVar, List<kotlin.reflect.r> list) {
    }

    @Override // kotlin.jvm.internal.o0
    public kotlin.reflect.r s(kotlin.reflect.g gVar, List<kotlin.reflect.t> list, boolean z10) {
        return gVar instanceof kotlin.jvm.internal.r ? CachesKt.b(((kotlin.jvm.internal.r) gVar).i(), list, z10) : kotlin.reflect.full.e.b(gVar, list, z10, Collections.emptyList());
    }

    @Override // kotlin.jvm.internal.o0
    public kotlin.reflect.s t(Object obj, String str, KVariance kVariance, boolean z10) {
        List<kotlin.reflect.s> typeParameters;
        if (obj instanceof kotlin.reflect.d) {
            typeParameters = ((kotlin.reflect.d) obj).getTypeParameters();
        } else {
            if (!(obj instanceof kotlin.reflect.c)) {
                throw new IllegalArgumentException("Type parameter container must be a class or a callable: " + obj);
            }
            typeParameters = ((kotlin.reflect.c) obj).getTypeParameters();
        }
        for (kotlin.reflect.s sVar : typeParameters) {
            if (sVar.getName().equals(str)) {
                return sVar;
            }
        }
        throw new IllegalArgumentException("Type parameter " + str + " is not found in container: " + obj);
    }
}
