package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Landroidx/compose/runtime/w0;", "parentFrameClock", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 1}, l = {bb.c.b.f30562cb, bb.c.b.f31017wb, bb.c.b.f31039xb}, m = "invokeSuspend", n = {"recomposeCoroutineScope", "frameSignal", "frameLoop", "frameLoop"}, s = {"L$0", "L$1", "L$2", "L$0"})
public final class Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 extends SuspendLambda implements yh.q<kotlinx.coroutines.q0, w0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f12518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f12519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f12520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f12521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ CoroutineContext f12522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ Recomposer f12523g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(CoroutineContext coroutineContext, Recomposer recomposer, kotlin.coroutines.c<? super Recomposer$runRecomposeConcurrentlyAndApplyChanges$2> cVar) {
        super(3, cVar);
        this.f12522f = coroutineContext;
        this.f12523g = recomposer;
    }

    @Override // yh.q
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.d w0 w0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 recomposer$runRecomposeConcurrentlyAndApplyChanges$2 = new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(this.f12522f, this.f12523g, cVar);
        recomposer$runRecomposeConcurrentlyAndApplyChanges$2.f12520d = q0Var;
        recomposer$runRecomposeConcurrentlyAndApplyChanges$2.f12521e = w0Var;
        return recomposer$runRecomposeConcurrentlyAndApplyChanges$2.invokeSuspend(kotlin.b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0099  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c0 A[Catch: all -> 0x016c, TryCatch #0 {, blocks: (B:27:0x00b5, B:29:0x00c0, B:31:0x00cb, B:33:0x00dc, B:34:0x00eb, B:35:0x00f1, B:36:0x00f8, B:38:0x0103, B:39:0x012f, B:41:0x013f, B:43:0x0145, B:50:0x0160, B:51:0x016b), top: B:65:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00cb A[Catch: all -> 0x016c, TryCatch #0 {, blocks: (B:27:0x00b5, B:29:0x00c0, B:31:0x00cb, B:33:0x00dc, B:34:0x00eb, B:35:0x00f1, B:36:0x00f8, B:38:0x0103, B:39:0x012f, B:41:0x013f, B:43:0x0145, B:50:0x0160, B:51:0x016b), top: B:65:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00dc A[Catch: all -> 0x016c, LOOP:1: B:32:0x00da->B:33:0x00dc, LOOP_END, TryCatch #0 {, blocks: (B:27:0x00b5, B:29:0x00c0, B:31:0x00cb, B:33:0x00dc, B:34:0x00eb, B:35:0x00f1, B:36:0x00f8, B:38:0x0103, B:39:0x012f, B:41:0x013f, B:43:0x0145, B:50:0x0160, B:51:0x016b), top: B:65:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0103 A[Catch: all -> 0x016c, LOOP:2: B:37:0x0101->B:38:0x0103, LOOP_END, TryCatch #0 {, blocks: (B:27:0x00b5, B:29:0x00c0, B:31:0x00cb, B:33:0x00dc, B:34:0x00eb, B:35:0x00f1, B:36:0x00f8, B:38:0x0103, B:39:0x012f, B:41:0x013f, B:43:0x0145, B:50:0x0160, B:51:0x016b), top: B:65:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x013f A[Catch: all -> 0x016c, TryCatch #0 {, blocks: (B:27:0x00b5, B:29:0x00c0, B:31:0x00cb, B:33:0x00dc, B:34:0x00eb, B:35:0x00f1, B:36:0x00f8, B:38:0x0103, B:39:0x012f, B:41:0x013f, B:43:0x0145, B:50:0x0160, B:51:0x016b), top: B:65:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0145 A[Catch: all -> 0x016c, TRY_LEAVE, TryCatch #0 {, blocks: (B:27:0x00b5, B:29:0x00c0, B:31:0x00cb, B:33:0x00dc, B:34:0x00eb, B:35:0x00f1, B:36:0x00f8, B:38:0x0103, B:39:0x012f, B:41:0x013f, B:43:0x0145, B:50:0x0160, B:51:0x016b), top: B:65:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x014a  */
    /* JADX WARN: Code duplicated, block: B:48:0x014e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0160 A[Catch: all -> 0x016c, TRY_ENTER, TryCatch #0 {, blocks: (B:27:0x00b5, B:29:0x00c0, B:31:0x00cb, B:33:0x00dc, B:34:0x00eb, B:35:0x00f1, B:36:0x00f8, B:38:0x0103, B:39:0x012f, B:41:0x013f, B:43:0x0145, B:50:0x0160, B:51:0x016b), top: B:65:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00aa -> B:25:0x00ac). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
