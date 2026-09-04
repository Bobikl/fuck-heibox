package com.airbnb.lottie.animation.keyframe;

import java.util.List;

/* JADX INFO: compiled from: FloatKeyframeAnimation.java */
/* JADX INFO: loaded from: classes6.dex */
public class d extends g<Float> {
    public d(List<com.airbnb.lottie.value.a<Float>> list) {
        super(list);
    }

    public float p() {
        return q(b(), d());
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
    float q(com.airbnb.lottie.value.a<Float> aVar, float f10) {
        Float f11;
        if (aVar.f37854b == null || aVar.f37855c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.airbnb.lottie.value.j<A> jVar = this.f37255e;
        return (jVar == 0 || (f11 = (Float) jVar.b(aVar.f37859g, aVar.f37860h.floatValue(), aVar.f37854b, aVar.f37855c, f10, e(), f())) == null) ? com.airbnb.lottie.utils.i.k(aVar.f(), aVar.c(), f10) : f11.floatValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Float i(com.airbnb.lottie.value.a<Float> aVar, float f10) {
        return Float.valueOf(q(aVar, f10));
    }
}
