package androidx.lifecycle;

import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: CoroutineLiveData.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2", f = "CoroutineLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CoroutineLiveDataKt$addDisposableSource$2 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super EmittedSource>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f23979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ g0<T> f23980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ LiveData<T> f23981d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutineLiveDataKt$addDisposableSource$2(g0<T> g0Var, LiveData<T> liveData, kotlin.coroutines.c<? super CoroutineLiveDataKt$addDisposableSource$2> cVar) {
        super(2, cVar);
        this.f23980c = g0Var;
        this.f23981d = liveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new CoroutineLiveDataKt$addDisposableSource$2(this.f23980c, this.f23981d, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super EmittedSource> cVar) {
        return ((CoroutineLiveDataKt$addDisposableSource$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
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
        kotlin.coroutines.intrinsics.b.h();
        if (this.f23979b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        final g0<T> g0Var = this.f23980c;
        g0Var.s(this.f23981d, new CoroutineLiveDataKt.a(new yh.l<T, b2>() { // from class: androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Object obj2) {
                invoke2(obj2);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(T t10) {
                g0Var.r(t10);
            }
        }));
        return new EmittedSource(this.f23981d, this.f23980c);
    }
}
