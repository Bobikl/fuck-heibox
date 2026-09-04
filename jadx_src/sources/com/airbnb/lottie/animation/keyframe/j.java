package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: PathKeyframeAnimation.java */
/* JADX INFO: loaded from: classes6.dex */
public class j extends g<PointF> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final PointF f37281i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float[] f37282j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final PathMeasure f37283k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private i f37284l;

    public j(List<? extends com.airbnb.lottie.value.a<PointF>> list) {
        super(list);
        this.f37281i = new PointF();
        this.f37282j = new float[2];
        this.f37283k = new PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public PointF i(com.airbnb.lottie.value.a<PointF> aVar, float f10) {
        PointF pointF;
        i iVar = (i) aVar;
        Path pathJ = iVar.j();
        if (pathJ == null) {
            return aVar.f37854b;
        }
        com.airbnb.lottie.value.j<A> jVar = this.f37255e;
        if (jVar != 0 && (pointF = (PointF) jVar.b(iVar.f37859g, iVar.f37860h.floatValue(), iVar.f37854b, iVar.f37855c, e(), f10, f())) != null) {
            return pointF;
        }
        if (this.f37284l != iVar) {
            this.f37283k.setPath(pathJ, false);
            this.f37284l = iVar;
        }
        PathMeasure pathMeasure = this.f37283k;
        pathMeasure.getPosTan(f10 * pathMeasure.getLength(), this.f37282j, null);
        PointF pointF2 = this.f37281i;
        float[] fArr = this.f37282j;
        pointF2.set(fArr[0], fArr[1]);
        return this.f37281i;
    }
}
