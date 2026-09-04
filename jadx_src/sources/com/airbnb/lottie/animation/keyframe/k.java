package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: PointKeyframeAnimation.java */
/* JADX INFO: loaded from: classes6.dex */
public class k extends g<PointF> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final PointF f37285i;

    public k(List<com.airbnb.lottie.value.a<PointF>> list) {
        super(list);
        this.f37285i = new PointF();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public PointF i(com.airbnb.lottie.value.a<PointF> aVar, float f10) {
        return j(aVar, f10, f10, f10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
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
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF j(com.airbnb.lottie.value.a<PointF> aVar, float f10, float f11, float f12) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = aVar.f37854b;
        if (pointF3 == null || (pointF = aVar.f37855c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF4 = pointF3;
        PointF pointF5 = pointF;
        com.airbnb.lottie.value.j<A> jVar = this.f37255e;
        if (jVar != 0 && (pointF2 = (PointF) jVar.b(aVar.f37859g, aVar.f37860h.floatValue(), pointF4, pointF5, f10, e(), f())) != null) {
            return pointF2;
        }
        PointF pointF6 = this.f37285i;
        float f13 = pointF4.x;
        float f14 = f13 + (f11 * (pointF5.x - f13));
        float f15 = pointF4.y;
        pointF6.set(f14, f15 + (f12 * (pointF5.y - f15)));
        return this.f37285i;
    }
}
