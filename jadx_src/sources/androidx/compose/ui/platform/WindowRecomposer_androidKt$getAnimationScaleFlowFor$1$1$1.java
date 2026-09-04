package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: WindowRecomposer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/f;", "", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", i = {0, 1}, l = {116, 122}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
public final class WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.flow.f<? super Float>, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f15759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f15760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f15761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ ContentResolver f15762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ Uri f15763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ WindowRecomposer_androidKt.b f15764g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.channels.k<kotlin.b2> f15765h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ Context f15766i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(ContentResolver contentResolver, Uri uri, WindowRecomposer_androidKt.b bVar, kotlinx.coroutines.channels.k<kotlin.b2> kVar, Context context, kotlin.coroutines.c<? super WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1> cVar) {
        super(2, cVar);
        this.f15762e = contentResolver;
        this.f15763f = uri;
        this.f15764g = bVar;
        this.f15765h = kVar;
        this.f15766i = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 = new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(this.f15762e, this.f15763f, this.f15764g, this.f15765h, this.f15766i, cVar);
        windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.f15761d = obj;
        return windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.flow.f<? super Float> fVar, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1) create(fVar, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    /* JADX WARN: Code duplicated, block: B:23:0x0061 A[Catch: all -> 0x008f, TRY_LEAVE, TryCatch #1 {all -> 0x008f, blocks: (B:17:0x0049, B:21:0x0059, B:23:0x0061), top: B:36:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0083  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0083 -> B:36:0x0049). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.h()
            int r1 = r9.f15760c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L31
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1b
            java.lang.Object r1 = r9.f15759b
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r9.f15761d
            kotlinx.coroutines.flow.f r4 = (kotlinx.coroutines.flow.f) r4
            kotlin.t0.n(r10)     // Catch: java.lang.Throwable -> L91
            r10 = r4
            goto L48
        L1b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L23:
            java.lang.Object r1 = r9.f15759b
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r9.f15761d
            kotlinx.coroutines.flow.f r4 = (kotlinx.coroutines.flow.f) r4
            kotlin.t0.n(r10)     // Catch: java.lang.Throwable -> L91
            r5 = r4
            r4 = r9
            goto L59
        L31:
            kotlin.t0.n(r10)
            java.lang.Object r10 = r9.f15761d
            kotlinx.coroutines.flow.f r10 = (kotlinx.coroutines.flow.f) r10
            android.content.ContentResolver r1 = r9.f15762e
            android.net.Uri r4 = r9.f15763f
            r5 = 0
            androidx.compose.ui.platform.WindowRecomposer_androidKt$b r6 = r9.f15764g
            r1.registerContentObserver(r4, r5, r6)
            kotlinx.coroutines.channels.k<kotlin.b2> r1 = r9.f15765h     // Catch: java.lang.Throwable -> L91
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L91
        L48:
            r4 = r9
        L49:
            r4.f15761d = r10     // Catch: java.lang.Throwable -> L8f
            r4.f15759b = r1     // Catch: java.lang.Throwable -> L8f
            r4.f15760c = r3     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r5 = r1.b(r4)     // Catch: java.lang.Throwable -> L8f
            if (r5 != r0) goto L56
            return r0
        L56:
            r8 = r5
            r5 = r10
            r10 = r8
        L59:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L8f
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L8f
            if (r10 == 0) goto L85
            r1.next()     // Catch: java.lang.Throwable -> L8f
            android.content.Context r10 = r4.f15766i     // Catch: java.lang.Throwable -> L8f
            android.content.ContentResolver r10 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L8f
            java.lang.String r6 = "animator_duration_scale"
            r7 = 1065353216(0x3f800000, float:1.0)
            float r10 = android.provider.Settings.Global.getFloat(r10, r6, r7)     // Catch: java.lang.Throwable -> L8f
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.a.e(r10)     // Catch: java.lang.Throwable -> L8f
            r4.f15761d = r5     // Catch: java.lang.Throwable -> L8f
            r4.f15759b = r1     // Catch: java.lang.Throwable -> L8f
            r4.f15760c = r2     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r10 = r5.emit(r10, r4)     // Catch: java.lang.Throwable -> L8f
            if (r10 != r0) goto L83
            return r0
        L83:
            r10 = r5
            goto L49
        L85:
            android.content.ContentResolver r10 = r4.f15762e
            androidx.compose.ui.platform.WindowRecomposer_androidKt$b r0 = r4.f15764g
            r10.unregisterContentObserver(r0)
            kotlin.b2 r10 = kotlin.b2.f124493a
            return r10
        L8f:
            r10 = move-exception
            goto L93
        L91:
            r10 = move-exception
            r4 = r9
        L93:
            android.content.ContentResolver r0 = r4.f15762e
            androidx.compose.ui.platform.WindowRecomposer_androidKt$b r1 = r4.f15764g
            r0.unregisterContentObserver(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
