package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.t0;

/* JADX INFO: compiled from: Transform.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {androidx.exifinterface.media.a.f23244d5, "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class FlowKt__TransformKt$runningReduce$1$1<T> implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef<Object> f129738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ yh.q<T, T, kotlin.coroutines.c<? super T>, Object> f129739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ f<T> f129740d;

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__TransformKt$runningReduce$1$1(Ref.ObjectRef<Object> objectRef, yh.q<? super T, ? super T, ? super kotlin.coroutines.c<? super T>, ? extends Object> qVar, f<? super T> fVar) {
        this.f129738b = objectRef;
        this.f129739c = qVar;
        this.f129740d = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0078 A[RETURN] */
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
        FlowKt__TransformKt$runningReduce$1$1$emit$1 flowKt__TransformKt$runningReduce$1$1$emit$1;
        Ref.ObjectRef<Object> objectRef;
        FlowKt__TransformKt$runningReduce$1$1<T> flowKt__TransformKt$runningReduce$1$1;
        Ref.ObjectRef<Object> objectRef2;
        f<T> fVar;
        T t11;
        if (cVar instanceof FlowKt__TransformKt$runningReduce$1$1$emit$1) {
            flowKt__TransformKt$runningReduce$1$1$emit$1 = (FlowKt__TransformKt$runningReduce$1$1$emit$1) cVar;
            int i10 = flowKt__TransformKt$runningReduce$1$1$emit$1.f129745f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__TransformKt$runningReduce$1$1$emit$1.f129745f = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__TransformKt$runningReduce$1$1$emit$1 = new FlowKt__TransformKt$runningReduce$1$1$emit$1(this, cVar);
            }
        } else {
            flowKt__TransformKt$runningReduce$1$1$emit$1 = new FlowKt__TransformKt$runningReduce$1$1$emit$1(this, cVar);
        }
        Object obj = flowKt__TransformKt$runningReduce$1$1$emit$1.f129743d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = flowKt__TransformKt$runningReduce$1$1$emit$1.f129745f;
        if (i11 != 0) {
            if (i11 == 1) {
                objectRef2 = (Ref.ObjectRef) flowKt__TransformKt$runningReduce$1$1$emit$1.f129742c;
                flowKt__TransformKt$runningReduce$1$1 = (FlowKt__TransformKt$runningReduce$1$1) flowKt__TransformKt$runningReduce$1$1$emit$1.f129741b;
                t0.n(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            return b2.f124493a;
        }
        t0.n(obj);
        objectRef = this.f129738b;
        Object obj2 = objectRef.f124891b;
        if (obj2 == kotlinx.coroutines.flow.internal.l.f130082a) {
            flowKt__TransformKt$runningReduce$1$1 = this;
        } else {
            yh.q<T, T, kotlin.coroutines.c<? super T>, Object> qVar = this.f129739c;
            flowKt__TransformKt$runningReduce$1$1$emit$1.f129741b = this;
            flowKt__TransformKt$runningReduce$1$1$emit$1.f129742c = objectRef;
            flowKt__TransformKt$runningReduce$1$1$emit$1.f129745f = 1;
            Object objInvoke = qVar.invoke((T) obj2, t10, flowKt__TransformKt$runningReduce$1$1$emit$1);
            if (objInvoke == objH) {
                return objH;
            }
            flowKt__TransformKt$runningReduce$1$1 = this;
            obj = objInvoke;
            objectRef2 = objectRef;
        }
        objectRef.f124891b = t10;
        fVar = flowKt__TransformKt$runningReduce$1$1.f129740d;
        t11 = flowKt__TransformKt$runningReduce$1$1.f129738b.f124891b;
        flowKt__TransformKt$runningReduce$1$1$emit$1.f129741b = null;
        flowKt__TransformKt$runningReduce$1$1$emit$1.f129742c = null;
        flowKt__TransformKt$runningReduce$1$1$emit$1.f129745f = 2;
        if (fVar.emit(t11, flowKt__TransformKt$runningReduce$1$1$emit$1) == objH) {
            return objH;
        }
        return b2.f124493a;
        Object obj3 = obj;
        objectRef = objectRef2;
        t10 = (T) obj3;
        objectRef.f124891b = t10;
        fVar = flowKt__TransformKt$runningReduce$1$1.f129740d;
        t11 = flowKt__TransformKt$runningReduce$1$1.f129738b.f124891b;
        flowKt__TransformKt$runningReduce$1$1$emit$1.f129741b = null;
        flowKt__TransformKt$runningReduce$1$1$emit$1.f129742c = null;
        flowKt__TransformKt$runningReduce$1$1$emit$1.f129745f = 2;
        if (fVar.emit(t11, flowKt__TransformKt$runningReduce$1$1$emit$1) == objH) {
            return objH;
        }
        return b2.f124493a;
    }
}
