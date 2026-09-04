package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: Channels.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/q0;", "Lkotlinx/coroutines/channels/n;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
public final class ChannelsKt__ChannelsKt$trySendBlocking$2 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super n<? extends b2>>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f128783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f128784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ b0<E> f128785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ E f128786e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChannelsKt__ChannelsKt$trySendBlocking$2(b0<? super E> b0Var, E e10, kotlin.coroutines.c<? super ChannelsKt__ChannelsKt$trySendBlocking$2> cVar) {
        super(2, cVar);
        this.f128785d = b0Var;
        this.f128786e = e10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        ChannelsKt__ChannelsKt$trySendBlocking$2 channelsKt__ChannelsKt$trySendBlocking$2 = new ChannelsKt__ChannelsKt$trySendBlocking$2(this.f128785d, this.f128786e, cVar);
        channelsKt__ChannelsKt$trySendBlocking$2.f128784c = obj;
        return channelsKt__ChannelsKt$trySendBlocking$2;
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super n<? extends b2>> cVar) {
        return invoke2(q0Var, (kotlin.coroutines.c<? super n<b2>>) cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super n<b2>> cVar) {
        return ((ChannelsKt__ChannelsKt$trySendBlocking$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
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
        Object objB;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f128783b;
        try {
            if (i10 == 0) {
                t0.n(obj);
                b0<E> b0Var = this.f128785d;
                E e10 = this.f128786e;
                Result.a aVar = Result.f124476c;
                this.f128783b = 1;
                if (b0Var.X(e10, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            objB = Result.b(b2.f124493a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            objB = Result.b(t0.a(th2));
        }
        return n.b(Result.j(objB) ? n.INSTANCE.c(b2.f124493a) : n.INSTANCE.a(Result.e(objB)));
    }
}
