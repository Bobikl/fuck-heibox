package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.t0;

/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {androidx.exifinterface.media.a.f23244d5, "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class FlowKt__LimitKt$dropWhile$1$1<T> implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Ref.BooleanRef f129470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ f<T> f129471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ yh.p<T, kotlin.coroutines.c<? super Boolean>, Object> f129472d;

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__LimitKt$dropWhile$1$1(Ref.BooleanRef booleanRef, f<? super T> fVar, yh.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar) {
        this.f129470b = booleanRef;
        this.f129471c = fVar;
        this.f129472d = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    /* JADX WARN: Code duplicated, block: B:33:0x0087 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
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
        FlowKt__LimitKt$dropWhile$1$1$emit$1 flowKt__LimitKt$dropWhile$1$1$emit$1;
        FlowKt__LimitKt$dropWhile$1$1<T> flowKt__LimitKt$dropWhile$1$1;
        f<T> fVar;
        if (cVar instanceof FlowKt__LimitKt$dropWhile$1$1$emit$1) {
            flowKt__LimitKt$dropWhile$1$1$emit$1 = (FlowKt__LimitKt$dropWhile$1$1$emit$1) cVar;
            int i10 = flowKt__LimitKt$dropWhile$1$1$emit$1.f129477f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$dropWhile$1$1$emit$1.f129477f = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$dropWhile$1$1$emit$1 = new FlowKt__LimitKt$dropWhile$1$1$emit$1(this, cVar);
            }
        } else {
            flowKt__LimitKt$dropWhile$1$1$emit$1 = new FlowKt__LimitKt$dropWhile$1$1$emit$1(this, cVar);
        }
        Object objInvoke = flowKt__LimitKt$dropWhile$1$1$emit$1.f129475d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = flowKt__LimitKt$dropWhile$1$1$emit$1.f129477f;
        if (i11 == 0) {
            t0.n(objInvoke);
            if (this.f129470b.f124884b) {
                f<T> fVar2 = this.f129471c;
                flowKt__LimitKt$dropWhile$1$1$emit$1.f129477f = 1;
                if (fVar2.emit(t10, flowKt__LimitKt$dropWhile$1$1$emit$1) == objH) {
                    return objH;
                }
                return b2.f124493a;
            }
            yh.p<T, kotlin.coroutines.c<? super Boolean>, Object> pVar = this.f129472d;
            flowKt__LimitKt$dropWhile$1$1$emit$1.f129473b = this;
            flowKt__LimitKt$dropWhile$1$1$emit$1.f129474c = t10;
            flowKt__LimitKt$dropWhile$1$1$emit$1.f129477f = 2;
            objInvoke = pVar.invoke(t10, flowKt__LimitKt$dropWhile$1$1$emit$1);
            if (objInvoke == objH) {
                return objH;
            }
            flowKt__LimitKt$dropWhile$1$1 = this;
            if (!((Boolean) objInvoke).booleanValue()) {
                return b2.f124493a;
            }
            flowKt__LimitKt$dropWhile$1$1.f129470b.f124884b = true;
            fVar = flowKt__LimitKt$dropWhile$1$1.f129471c;
            flowKt__LimitKt$dropWhile$1$1$emit$1.f129473b = null;
            flowKt__LimitKt$dropWhile$1$1$emit$1.f129474c = null;
            flowKt__LimitKt$dropWhile$1$1$emit$1.f129477f = 3;
            if (fVar.emit(t10, flowKt__LimitKt$dropWhile$1$1$emit$1) == objH) {
                return objH;
            }
        } else {
            if (i11 == 1) {
                t0.n(objInvoke);
                return b2.f124493a;
            }
            if (i11 == 2) {
                t10 = (T) flowKt__LimitKt$dropWhile$1$1$emit$1.f129474c;
                flowKt__LimitKt$dropWhile$1$1 = (FlowKt__LimitKt$dropWhile$1$1) flowKt__LimitKt$dropWhile$1$1$emit$1.f129473b;
                t0.n(objInvoke);
                if (!((Boolean) objInvoke).booleanValue()) {
                    return b2.f124493a;
                }
                flowKt__LimitKt$dropWhile$1$1.f129470b.f124884b = true;
                fVar = flowKt__LimitKt$dropWhile$1$1.f129471c;
                flowKt__LimitKt$dropWhile$1$1$emit$1.f129473b = null;
                flowKt__LimitKt$dropWhile$1$1$emit$1.f129474c = null;
                flowKt__LimitKt$dropWhile$1$1$emit$1.f129477f = 3;
                if (fVar.emit(t10, flowKt__LimitKt$dropWhile$1$1$emit$1) == objH) {
                    return objH;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(objInvoke);
            }
        }
        return b2.f124493a;
    }
}
