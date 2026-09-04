package com.airbnb.lottie.animation.keyframe;

import java.util.List;

/* JADX INFO: compiled from: ScaleKeyframeAnimation.java */
/* JADX INFO: loaded from: classes6.dex */
public class l extends g<com.airbnb.lottie.value.k> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.value.k f37286i;

    public l(List<com.airbnb.lottie.value.a<com.airbnb.lottie.value.k>> list) {
        super(list);
        this.f37286i = new com.airbnb.lottie.value.k();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.value.k i(com.airbnb.lottie.value.a<com.airbnb.lottie.value.k> aVar, float f10) {
        com.airbnb.lottie.value.k kVar;
        com.airbnb.lottie.value.k kVar2;
        com.airbnb.lottie.value.k kVar3 = aVar.f37854b;
        if (kVar3 == null || (kVar = aVar.f37855c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.airbnb.lottie.value.k kVar4 = kVar3;
        com.airbnb.lottie.value.k kVar5 = kVar;
        com.airbnb.lottie.value.j<A> jVar = this.f37255e;
        if (jVar != 0 && (kVar2 = (com.airbnb.lottie.value.k) jVar.b(aVar.f37859g, aVar.f37860h.floatValue(), kVar4, kVar5, f10, e(), f())) != null) {
            return kVar2;
        }
        this.f37286i.d(com.airbnb.lottie.utils.i.k(kVar4.b(), kVar5.b(), f10), com.airbnb.lottie.utils.i.k(kVar4.c(), kVar5.c(), f10));
        return this.f37286i;
    }
}
