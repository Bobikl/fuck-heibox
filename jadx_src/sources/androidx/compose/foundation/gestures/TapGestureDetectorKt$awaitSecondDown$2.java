package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: compiled from: TapGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/d;", "Landroidx/compose/ui/input/pointer/y;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", i = {0, 0}, l = {198}, m = "invokeSuspend", n = {"$this$withTimeoutOrNull", "minUptime"}, s = {"L$0", "J$0"})
public final class TapGestureDetectorKt$awaitSecondDown$2 extends RestrictedSuspendLambda implements yh.p<androidx.compose.ui.input.pointer.d, kotlin.coroutines.c<? super PointerInputChange>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f5604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f5605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f5606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ PointerInputChange f5607f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TapGestureDetectorKt$awaitSecondDown$2(PointerInputChange pointerInputChange, kotlin.coroutines.c<? super TapGestureDetectorKt$awaitSecondDown$2> cVar) {
        super(2, cVar);
        this.f5607f = pointerInputChange;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d androidx.compose.ui.input.pointer.d dVar, @dl.e kotlin.coroutines.c<? super PointerInputChange> cVar) {
        return ((TapGestureDetectorKt$awaitSecondDown$2) create(dVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        TapGestureDetectorKt$awaitSecondDown$2 tapGestureDetectorKt$awaitSecondDown$2 = new TapGestureDetectorKt$awaitSecondDown$2(this.f5607f, cVar);
        tapGestureDetectorKt$awaitSecondDown$2.f5606e = obj;
        return tapGestureDetectorKt$awaitSecondDown$2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0047 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0048  */
    /* JADX WARN: Code duplicated, block: B:15:0x0058 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0059  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0048 -> B:13:0x004e). Please report as a decompilation issue!!! */
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
            int r1 = r9.f5605d
            r2 = 1
            if (r1 == 0) goto L21
            if (r1 != r2) goto L19
            long r3 = r9.f5604c
            java.lang.Object r1 = r9.f5606e
            androidx.compose.ui.input.pointer.d r1 = (androidx.compose.ui.input.pointer.d) r1
            kotlin.t0.n(r10)
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            goto L4e
        L19:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L21:
            kotlin.t0.n(r10)
            java.lang.Object r10 = r9.f5606e
            androidx.compose.ui.input.pointer.d r10 = (androidx.compose.ui.input.pointer.d) r10
            androidx.compose.ui.input.pointer.y r1 = r9.f5607f
            long r3 = r1.getUptimeMillis()
            androidx.compose.ui.platform.d2 r1 = r10.getViewConfiguration()
            long r5 = r1.a()
            long r3 = r3 + r5
            r1 = r10
            r10 = r9
        L39:
            r5 = 0
            r6 = 0
            r10.f5606e = r1
            r10.f5604c = r3
            r10.f5605d = r2
            java.lang.Object r5 = androidx.compose.foundation.gestures.TapGestureDetectorKt.e(r1, r5, r10, r2, r6)
            if (r5 != r0) goto L48
            return r0
        L48:
            r8 = r0
            r0 = r10
            r10 = r5
            r4 = r3
            r3 = r1
            r1 = r8
        L4e:
            androidx.compose.ui.input.pointer.y r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
            long r6 = r10.getUptimeMillis()
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 < 0) goto L59
            return r10
        L59:
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
