package androidx.window.java.layout;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: WindowInfoTrackerCallbackAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@d(c = "androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1", f = "WindowInfoTrackerCallbackAdapter.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
public final class WindowInfoTrackerCallbackAdapter$addListener$1$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f28568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ e<T> f28569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.core.util.d<T> f28570d;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Collect.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
    public static final class a<T> implements f<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.core.util.d f28571b;

        public a(androidx.core.util.d dVar) {
            this.f28571b = dVar;
        }

        @Override // kotlinx.coroutines.flow.f
        @dl.e
        public Object emit(T t10, @dl.d c<? super b2> cVar) {
            this.f28571b.accept(t10);
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    WindowInfoTrackerCallbackAdapter$addListener$1$1(e<? extends T> eVar, androidx.core.util.d<T> dVar, c<? super WindowInfoTrackerCallbackAdapter$addListener$1$1> cVar) {
        super(2, cVar);
        this.f28569c = eVar;
        this.f28570d = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@dl.e Object obj, @dl.d c<?> cVar) {
        return new WindowInfoTrackerCallbackAdapter$addListener$1$1(this.f28569c, this.f28570d, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e c<? super b2> cVar) {
        return ((WindowInfoTrackerCallbackAdapter$addListener$1$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.c to androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1 for r4v1 'this'  kotlin.coroutines.c
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.h()
            int r1 = r4.f28568b
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.t0.n(r5)
            goto L2c
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L17:
            kotlin.t0.n(r5)
            kotlinx.coroutines.flow.e<T> r5 = r4.f28569c
            androidx.core.util.d<T> r1 = r4.f28570d
            androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1$a r3 = new androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1$a
            r3.<init>(r1)
            r4.f28568b = r2
            java.lang.Object r5 = r5.a(r3, r4)
            if (r5 != r0) goto L2c
            return r0
        L2c:
            kotlin.b2 r5 = kotlin.b2.f124493a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
