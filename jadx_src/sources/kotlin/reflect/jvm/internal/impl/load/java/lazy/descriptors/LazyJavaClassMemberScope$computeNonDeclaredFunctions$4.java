package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.h;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.name.f;
import yh.l;

/* JADX INFO: compiled from: LazyJavaClassMemberScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class LazyJavaClassMemberScope$computeNonDeclaredFunctions$4 extends FunctionReference implements l<f, Collection<? extends s0>> {
    LazyJavaClassMemberScope$computeNonDeclaredFunctions$4(Object obj) {
        super(1, obj);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.c
    @dl.d
    public final String getName() {
        return "searchMethodsInSupertypesWithoutBuiltinMagic";
    }

    @Override // kotlin.jvm.internal.CallableReference
    @dl.d
    public final h getOwner() {
        return n0.d(LazyJavaClassMemberScope.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    @dl.d
    public final String getSignature() {
        return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
    }

    @Override // yh.l
    @dl.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Collection<s0> invoke(@dl.d f p10) {
        f0.p(p10, "p0");
        return ((LazyJavaClassMemberScope) this.receiver).K0(p10);
    }
}
