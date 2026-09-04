package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SnapshotFlow.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/f;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {134, 138, 160}, m = "invokeSuspend", n = {"$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "found", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
public final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1<T> extends SuspendLambda implements yh.p<kotlinx.coroutines.flow.f<? super T>, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f12578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f12579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f12580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f12581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Object f12582f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f12583g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f12584h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private /* synthetic */ Object f12585i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ yh.a<T> f12586j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(yh.a<? extends T> aVar, kotlin.coroutines.c<? super SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1> cVar) {
        super(2, cVar);
        this.f12586j = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 snapshotStateKt__SnapshotFlowKt$snapshotFlow$1 = new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(this.f12586j, cVar);
        snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.f12585i = obj;
        return snapshotStateKt__SnapshotFlowKt$snapshotFlow$1;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.flow.f<? super T> fVar, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1) create(fVar, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00db A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e8 A[Catch: all -> 0x0053, TryCatch #2 {all -> 0x0053, blocks: (B:34:0x00e4, B:36:0x00e8, B:41:0x00f2, B:44:0x0100, B:48:0x0116, B:50:0x011f, B:59:0x0142, B:60:0x0145, B:11:0x004b, B:45:0x010b, B:47:0x0113, B:56:0x013d, B:57:0x0140, B:46:0x010f), top: B:75:0x004b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:44:0x0100 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #2 {all -> 0x0053, blocks: (B:34:0x00e4, B:36:0x00e8, B:41:0x00f2, B:44:0x0100, B:48:0x0116, B:50:0x011f, B:59:0x0142, B:60:0x0145, B:11:0x004b, B:45:0x010b, B:47:0x0113, B:56:0x013d, B:57:0x0140, B:46:0x010f), top: B:75:0x004b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x011f A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #2 {all -> 0x0053, blocks: (B:34:0x00e4, B:36:0x00e8, B:41:0x00f2, B:44:0x0100, B:48:0x0116, B:50:0x011f, B:59:0x0142, B:60:0x0145, B:11:0x004b, B:45:0x010b, B:47:0x0113, B:56:0x013d, B:57:0x0140, B:46:0x010f), top: B:75:0x004b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0133 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x0134  */
    /* JADX WARN: Path cross not found for [B:44:0x0100, B:61:0x0146], limit reached: 83 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
