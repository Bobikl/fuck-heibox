package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.FunctionReference;

/* JADX INFO: compiled from: findClassInModule.kt */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1 extends FunctionReference implements yh.l<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1 f125555d = new FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1();

    FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1() {
        super(1);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.c
    @dl.d
    public final String getName() {
        return "getOuterClassId";
    }

    @Override // kotlin.jvm.internal.CallableReference
    @dl.d
    public final kotlin.reflect.h getOwner() {
        return kotlin.jvm.internal.n0.d(kotlin.reflect.jvm.internal.impl.name.b.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    @dl.d
    public final String getSignature() {
        return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
    }

    @Override // yh.l
    @dl.e
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final kotlin.reflect.jvm.internal.impl.name.b invoke(@dl.d kotlin.reflect.jvm.internal.impl.name.b p10) {
        kotlin.jvm.internal.f0.p(p10, "p0");
        return p10.g();
    }
}
