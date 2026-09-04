package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: GlobalSnapshotManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", i = {0}, l = {63}, m = "invokeSuspend", n = {"$this$consume$iv$iv"}, s = {"L$0"})
public final class GlobalSnapshotManager$ensureStarted$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f15643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f15644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f15645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.channels.k<kotlin.b2> f15646e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GlobalSnapshotManager$ensureStarted$1(kotlinx.coroutines.channels.k<kotlin.b2> kVar, kotlin.coroutines.c<? super GlobalSnapshotManager$ensureStarted$1> cVar) {
        super(2, cVar);
        this.f15646e = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new GlobalSnapshotManager$ensureStarted$1(this.f15646e, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((GlobalSnapshotManager$ensureStarted$1) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    /* JADX WARN: Code duplicated, block: B:19:0x004a A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:17:0x0042, B:19:0x004a), top: B:30:0x0042 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003b -> B:16:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.h()
            int r1 = r7.f15645d
            r2 = 1
            if (r1 == 0) goto L23
            if (r1 != r2) goto L1b
            java.lang.Object r1 = r7.f15644c
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r3 = r7.f15643b
            kotlinx.coroutines.channels.ReceiveChannel r3 = (kotlinx.coroutines.channels.ReceiveChannel) r3
            kotlin.t0.n(r8)     // Catch: java.lang.Throwable -> L63
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r7
            goto L41
        L1b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L23:
            kotlin.t0.n(r8)
            kotlinx.coroutines.channels.k<kotlin.b2> r3 = r7.f15646e
            kotlinx.coroutines.channels.ChannelIterator r8 = r3.iterator()     // Catch: java.lang.Throwable -> L63
            r1 = r8
            r8 = r7
        L2e:
            r8.f15643b = r3     // Catch: java.lang.Throwable -> L63
            r8.f15644c = r1     // Catch: java.lang.Throwable -> L63
            r8.f15645d = r2     // Catch: java.lang.Throwable -> L63
            java.lang.Object r4 = r1.b(r8)     // Catch: java.lang.Throwable -> L63
            if (r4 != r0) goto L3b
            return r0
        L3b:
            r6 = r0
            r0 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r6
        L41:
            r5 = 0
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L60
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L60
            if (r8 == 0) goto L5a
            java.lang.Object r8 = r3.next()     // Catch: java.lang.Throwable -> L60
            kotlin.b2 r8 = (kotlin.b2) r8     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.f$a r8 = androidx.compose.runtime.snapshots.f.INSTANCE     // Catch: java.lang.Throwable -> L60
            r8.l()     // Catch: java.lang.Throwable -> L60
            r8 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L2e
        L5a:
            kotlinx.coroutines.channels.o.b(r4, r5)
            kotlin.b2 r8 = kotlin.b2.f124493a
            return r8
        L60:
            r8 = move-exception
            r3 = r4
            goto L64
        L63:
            r8 = move-exception
        L64:
            throw r8     // Catch: java.lang.Throwable -> L65
        L65:
            r0 = move-exception
            kotlinx.coroutines.channels.o.b(r3, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
