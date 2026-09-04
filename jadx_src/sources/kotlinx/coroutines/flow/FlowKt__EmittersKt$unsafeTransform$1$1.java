package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.c0;
import kotlin.t0;

/* JADX INFO: compiled from: Emitters.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class FlowKt__EmittersKt$unsafeTransform$1$1<T> implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ yh.q<f<? super R>, T, kotlin.coroutines.c<? super b2>, Object> f129415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ f<R> f129416c;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__EmittersKt$unsafeTransform$1$1(yh.q<? super f<? super R>, ? super T, ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar, f<? super R> fVar) {
        this.f129415b = qVar;
        this.f129416c = fVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @dl.e
    public final Object a(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        c0.e(4);
        new FlowKt__EmittersKt$unsafeTransform$1$1$emit$1(this, cVar);
        c0.e(5);
        this.f129415b.invoke(this.f129416c, t10, cVar);
        return b2.f124493a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlinx.coroutines.flow.f
    @dl.e
    public final Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        FlowKt__EmittersKt$unsafeTransform$1$1$emit$1 flowKt__EmittersKt$unsafeTransform$1$1$emit$1;
        if (cVar instanceof FlowKt__EmittersKt$unsafeTransform$1$1$emit$1) {
            flowKt__EmittersKt$unsafeTransform$1$1$emit$1 = (FlowKt__EmittersKt$unsafeTransform$1$1$emit$1) cVar;
            int i10 = flowKt__EmittersKt$unsafeTransform$1$1$emit$1.f129419d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__EmittersKt$unsafeTransform$1$1$emit$1.f129419d = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__EmittersKt$unsafeTransform$1$1$emit$1 = new FlowKt__EmittersKt$unsafeTransform$1$1$emit$1(this, cVar);
            }
        } else {
            flowKt__EmittersKt$unsafeTransform$1$1$emit$1 = new FlowKt__EmittersKt$unsafeTransform$1$1$emit$1(this, cVar);
        }
        Object obj = flowKt__EmittersKt$unsafeTransform$1$1$emit$1.f129417b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = flowKt__EmittersKt$unsafeTransform$1$1$emit$1.f129419d;
        if (i11 == 0) {
            t0.n(obj);
            yh.q<f<? super R>, T, kotlin.coroutines.c<? super b2>, Object> qVar = this.f129415b;
            Object obj2 = this.f129416c;
            flowKt__EmittersKt$unsafeTransform$1$1$emit$1.f129419d = 1;
            if (qVar.invoke(obj2, t10, flowKt__EmittersKt$unsafeTransform$1$1$emit$1) == objH) {
                return objH;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return b2.f124493a;
    }
}
