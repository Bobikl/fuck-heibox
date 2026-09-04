package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.c1;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.r;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.f1;

/* JADX INFO: compiled from: ErrorClassDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends kotlin.reflect.jvm.internal.impl.descriptors.impl.g {
    /* JADX WARN: Illegal instructions before constructor call */
    public a(@dl.d kotlin.reflect.jvm.internal.impl.name.f name) {
        f0.p(name, "name");
        h hVar = h.f128123a;
        d0 d0VarI = hVar.i();
        Modality modality = Modality.OPEN;
        ClassKind classKind = ClassKind.CLASS;
        List listE = CollectionsKt__CollectionsKt.E();
        t0 t0Var = t0.f125942a;
        super(d0VarI, name, modality, classKind, listE, t0Var, false, LockBasedStorageManager.f127923e);
        kotlin.reflect.jvm.internal.impl.descriptors.impl.e eVarO1 = kotlin.reflect.jvm.internal.impl.descriptors.impl.e.o1(this, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b(), true, t0Var);
        eVarO1.r1(CollectionsKt__CollectionsKt.E(), r.f125867d);
        f0.o(eVarO1, "create(this, Annotations…          )\n            }");
        ErrorScopeKind errorScopeKind = ErrorScopeKind.SCOPE_FOR_ERROR_CLASS;
        String string = eVarO1.getName().toString();
        f0.o(string, "errorConstructor.name.toString()");
        MemberScope memberScopeB = h.b(errorScopeKind, string, "");
        ErrorTypeKind errorTypeKind = ErrorTypeKind.ERROR_CLASS;
        eVarO1.h1(new f(hVar.e(errorTypeKind, new String[0]), memberScopeB, errorTypeKind, null, false, new String[0], 24, null));
        L0(memberScopeB, c1.f(eVarO1), eVarO1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.a, kotlin.reflect.jvm.internal.impl.descriptors.v0
    @dl.d
    /* JADX INFO: renamed from: K0 */
    public kotlin.reflect.jvm.internal.impl.descriptors.d d(@dl.d TypeSubstitutor substitutor) {
        f0.p(substitutor, "substitutor");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.a, kotlin.reflect.jvm.internal.impl.descriptors.impl.r
    @dl.d
    public MemberScope Z(@dl.d f1 typeSubstitution, @dl.d kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypeRefiner) {
        f0.p(typeSubstitution, "typeSubstitution");
        f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        ErrorScopeKind errorScopeKind = ErrorScopeKind.SCOPE_FOR_ERROR_CLASS;
        String string = getName().toString();
        f0.o(string, "name.toString()");
        return h.b(errorScopeKind, string, typeSubstitution.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.g
    @dl.d
    public String toString() {
        String strB = getName().b();
        f0.o(strB, "name.asString()");
        return strB;
    }
}
