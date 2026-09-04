package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;
import yh.p;
import yh.q;

/* JADX INFO: compiled from: FlowCoroutine.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
public final class FlowCoroutineKt$scopedFlow$1$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f130049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f130050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ q<q0, kotlinx.coroutines.flow.f<? super R>, kotlin.coroutines.c<? super b2>, Object> f130051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.flow.f<R> f130052e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowCoroutineKt$scopedFlow$1$1(q<? super q0, ? super kotlinx.coroutines.flow.f<? super R>, ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar, kotlinx.coroutines.flow.f<? super R> fVar, kotlin.coroutines.c<? super FlowCoroutineKt$scopedFlow$1$1> cVar) {
        super(2, cVar);
        this.f130051d = qVar;
        this.f130052e = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        FlowCoroutineKt$scopedFlow$1$1 flowCoroutineKt$scopedFlow$1$1 = new FlowCoroutineKt$scopedFlow$1$1(this.f130051d, this.f130052e, cVar);
        flowCoroutineKt$scopedFlow$1$1.f130050c = obj;
        return flowCoroutineKt$scopedFlow$1$1;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((FlowCoroutineKt$scopedFlow$1$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
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
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f130049b;
        if (i10 == 0) {
            t0.n(obj);
            q0 q0Var = (q0) this.f130050c;
            q<q0, kotlinx.coroutines.flow.f<? super R>, kotlin.coroutines.c<? super b2>, Object> qVar = this.f130051d;
            Object obj2 = this.f130052e;
            this.f130049b = 1;
            if (qVar.invoke(q0Var, obj2, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return b2.f124493a;
    }
}
