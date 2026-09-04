package com.airbnb.lottie.animation.keyframe;

import java.util.List;

/* JADX INFO: compiled from: ColorKeyframeAnimation.java */
/* JADX INFO: loaded from: classes6.dex */
public class b extends g<Integer> {
    public b(List<com.airbnb.lottie.value.a<Integer>> list) {
        super(list);
    }

    public int p() {
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
    public int q(com.airbnb.lottie.value.a<Integer> aVar, float f10) {
        Integer num;
        Integer num2 = aVar.f37854b;
        if (num2 == null || aVar.f37855c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int iIntValue = num2.intValue();
        int iIntValue2 = aVar.f37855c.intValue();
        com.airbnb.lottie.value.j<A> jVar = this.f37255e;
        return (jVar == 0 || (num = (Integer) jVar.b(aVar.f37859g, aVar.f37860h.floatValue(), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), f10, e(), f())) == null) ? com.airbnb.lottie.utils.d.c(com.airbnb.lottie.utils.i.c(f10, 0.0f, 1.0f), iIntValue, iIntValue2) : num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Integer i(com.airbnb.lottie.value.a<Integer> aVar, float f10) {
        return Integer.valueOf(q(aVar, f10));
    }
}
