package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.q0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/q0;", "Lkotlinx/coroutines/flow/f;", "downstream", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {bb.c.b.f30829o1, bb.c.b.R3}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "timeoutMillis", "downstream", "values", "lastValue", "timeoutMillis"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
public final class FlowKt__DelayKt$debounceInternal$1<T> extends SuspendLambda implements yh.q<q0, f<? super T>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f129319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f129320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f129321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f129322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f129323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ yh.l<T, Long> f129324g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ e<T> f129325h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__DelayKt$debounceInternal$1(yh.l<? super T, Long> lVar, e<? extends T> eVar, kotlin.coroutines.c<? super FlowKt__DelayKt$debounceInternal$1> cVar) {
        super(3, cVar);
        this.f129324g = lVar;
        this.f129325h = eVar;
    }

    @Override // yh.q
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d q0 q0Var, @dl.d f<? super T> fVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1 = new FlowKt__DelayKt$debounceInternal$1(this.f129324g, this.f129325h, cVar);
        flowKt__DelayKt$debounceInternal$1.f129322e = q0Var;
        flowKt__DelayKt$debounceInternal$1.f129323f = fVar;
        return flowKt__DelayKt$debounceInternal$1.invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0075  */
    /* JADX WARN: Code duplicated, block: B:15:0x007e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0084  */
    /* JADX WARN: Code duplicated, block: B:20:0x0097  */
    /* JADX WARN: Code duplicated, block: B:21:0x0099  */
    /* JADX WARN: Code duplicated, block: B:23:0x009c  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e0 A[Catch: all -> 0x00f7, TryCatch #0 {all -> 0x00f7, blocks: (B:36:0x00dc, B:38:0x00e0, B:39:0x00ea), top: B:51:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0105  */
    /* JADX WARN: Code duplicated, block: B:47:0x010a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x010b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x010b -> B:11:0x006f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
