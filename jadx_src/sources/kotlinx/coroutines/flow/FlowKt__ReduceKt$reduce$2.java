package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.t0;

/* JADX INFO: compiled from: Reduce.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {androidx.exifinterface.media.a.R4, androidx.exifinterface.media.a.f23244d5, "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class FlowKt__ReduceKt$reduce$2<T> implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef<Object> f129615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ yh.q<S, T, kotlin.coroutines.c<? super S>, Object> f129616c;

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__ReduceKt$reduce$2(Ref.ObjectRef<Object> objectRef, yh.q<? super S, ? super T, ? super kotlin.coroutines.c<? super S>, ? extends Object> qVar) {
        this.f129615b = objectRef;
        this.f129616c = qVar;
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
        FlowKt__ReduceKt$reduce$2$emit$1 flowKt__ReduceKt$reduce$2$emit$1;
        Ref.ObjectRef<Object> objectRef;
        Ref.ObjectRef<Object> objectRef2;
        if (cVar instanceof FlowKt__ReduceKt$reduce$2$emit$1) {
            flowKt__ReduceKt$reduce$2$emit$1 = (FlowKt__ReduceKt$reduce$2$emit$1) cVar;
            int i10 = flowKt__ReduceKt$reduce$2$emit$1.f129620e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$reduce$2$emit$1.f129620e = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$reduce$2$emit$1 = new FlowKt__ReduceKt$reduce$2$emit$1(this, cVar);
            }
        } else {
            flowKt__ReduceKt$reduce$2$emit$1 = new FlowKt__ReduceKt$reduce$2$emit$1(this, cVar);
        }
        Object obj = flowKt__ReduceKt$reduce$2$emit$1.f129618c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = flowKt__ReduceKt$reduce$2$emit$1.f129620e;
        if (i11 == 0) {
            t0.n(obj);
            objectRef = this.f129615b;
            Object obj2 = objectRef.f124891b;
            if (obj2 != kotlinx.coroutines.flow.internal.l.f130082a) {
                yh.q<S, T, kotlin.coroutines.c<? super S>, Object> qVar = this.f129616c;
                flowKt__ReduceKt$reduce$2$emit$1.f129617b = objectRef;
                flowKt__ReduceKt$reduce$2$emit$1.f129620e = 1;
                Object objInvoke = qVar.invoke((S) obj2, t10, flowKt__ReduceKt$reduce$2$emit$1);
                if (objInvoke == objH) {
                    return objH;
                }
                obj = objInvoke;
                objectRef2 = objectRef;
            }
            objectRef.f124891b = t10;
            return b2.f124493a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        objectRef2 = (Ref.ObjectRef) flowKt__ReduceKt$reduce$2$emit$1.f129617b;
        t0.n(obj);
        Object obj3 = obj;
        objectRef = objectRef2;
        t10 = (T) obj3;
        objectRef.f124891b = t10;
        return b2.f124493a;
    }
}
