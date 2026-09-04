package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.i0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.b2;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: TapGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0093\u0001\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012/\b\u0002\u0010\u000b\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0086@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u0003*\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0014\u001a\u0004\u0018\u00010\u0012*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001ac\u0010\u0016\u001a\u00020\u0003*\u00020\u00002/\b\u0002\u0010\u000b\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0080@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a!\u0010\u001a\u001a\u00020\u0012*\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a'\u0010\u001e\u001a\u00020\u0012*\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0018H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0019\u0010 \u001a\u0004\u0018\u00010\u0012*\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b \u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Landroidx/compose/ui/input/pointer/i0;", "Lkotlin/Function1;", "Lb1/f;", "Lkotlin/b2;", "onDoubleTap", "onLongPress", "Lkotlin/Function3;", "Landroidx/compose/foundation/gestures/k;", "Lkotlin/coroutines/c;", "", "Lkotlin/t;", "onPress", "onTap", "k", "(Landroidx/compose/ui/input/pointer/i0;Lyh/l;Lyh/l;Lyh/q;Lyh/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/d;", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/compose/ui/input/pointer/d;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/y;", "firstUp", "g", "(Landroidx/compose/ui/input/pointer/d;Landroidx/compose/ui/input/pointer/y;Lkotlin/coroutines/c;)Ljava/lang/Object;", "i", "(Landroidx/compose/ui/input/pointer/i0;Lyh/q;Lyh/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "requireUnconsumed", "d", "(Landroidx/compose/ui/input/pointer/d;ZLkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "f", "(Landroidx/compose/ui/input/pointer/d;Landroidx/compose/ui/input/pointer/PointerEventPass;ZLkotlin/coroutines/c;)Ljava/lang/Object;", "m", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class TapGestureDetectorKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final yh.q<k, b1.f, kotlin.coroutines.c<? super b2>, Object> f5597a = new TapGestureDetectorKt$NoPressGesture$1(null);

    @dl.e
    public static final Object d(@dl.d androidx.compose.ui.input.pointer.d dVar, boolean z10, @dl.d kotlin.coroutines.c<? super PointerInputChange> cVar) {
        return f(dVar, PointerEventPass.Main, z10, cVar);
    }

    public static /* synthetic */ Object e(androidx.compose.ui.input.pointer.d dVar, boolean z10, kotlin.coroutines.c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return d(dVar, z10, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    /* JADX WARN: Code duplicated, block: B:23:0x006b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[LOOP:0: B:19:0x005c->B:26:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004d -> B:18:0x0050). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @dl.e
    public static final java.lang.Object f(@dl.d androidx.compose.ui.input.pointer.d r9, @dl.d androidx.compose.ui.input.pointer.PointerEventPass r10, boolean r11, @dl.d kotlin.coroutines.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDownOnPass$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDownOnPass$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDownOnPass$1) r0
            int r1 = r0.f5603f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5603f = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDownOnPass$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDownOnPass$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f5602e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r0.f5603f
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            boolean r9 = r0.f5601d
            java.lang.Object r10 = r0.f5600c
            androidx.compose.ui.input.pointer.PointerEventPass r10 = (androidx.compose.ui.input.pointer.PointerEventPass) r10
            java.lang.Object r11 = r0.f5599b
            androidx.compose.ui.input.pointer.d r11 = (androidx.compose.ui.input.pointer.d) r11
            kotlin.t0.n(r12)
            r8 = r11
            r11 = r9
            r9 = r8
            goto L50
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            kotlin.t0.n(r12)
        L41:
            r0.f5599b = r9
            r0.f5600c = r10
            r0.f5601d = r11
            r0.f5603f = r3
            java.lang.Object r12 = r9.r1(r10, r0)
            if (r12 != r1) goto L50
            return r1
        L50:
            androidx.compose.ui.input.pointer.p r12 = (androidx.compose.ui.input.pointer.p) r12
            java.util.List r2 = r12.e()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L5c:
            if (r6 >= r4) goto L76
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.y r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            if (r11 == 0) goto L6b
            boolean r7 = androidx.compose.ui.input.pointer.q.b(r7)
            goto L6f
        L6b:
            boolean r7 = androidx.compose.ui.input.pointer.q.c(r7)
        L6f:
            if (r7 != 0) goto L73
            r2 = r5
            goto L77
        L73:
            int r6 = r6 + 1
            goto L5c
        L76:
            r2 = r3
        L77:
            if (r2 == 0) goto L41
            java.util.List r9 = r12.e()
            java.lang.Object r9 = r9.get(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.f(androidx.compose.ui.input.pointer.d, androidx.compose.ui.input.pointer.PointerEventPass, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object g(androidx.compose.ui.input.pointer.d dVar, PointerInputChange pointerInputChange, kotlin.coroutines.c<? super PointerInputChange> cVar) {
        return dVar.j1(dVar.getViewConfiguration().c(), new TapGestureDetectorKt$awaitSecondDown$2(pointerInputChange, null), cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x0077 A[LOOP:1: B:22:0x0067->B:26:0x0077, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object h(androidx.compose.ui.input.pointer.d r8, kotlin.coroutines.c<? super kotlin.b2> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1) r0
            int r1 = r0.f5610d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5610d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f5609c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r0.f5610d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.f5608b
            androidx.compose.ui.input.pointer.d r8 = (androidx.compose.ui.input.pointer.d) r8
            kotlin.t0.n(r9)
            goto L44
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.t0.n(r9)
        L38:
            r0.f5608b = r8
            r0.f5610d = r3
            r9 = 0
            java.lang.Object r9 = androidx.compose.ui.input.pointer.c.t(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L44
            return r1
        L44:
            androidx.compose.ui.input.pointer.p r9 = (androidx.compose.ui.input.pointer.p) r9
            java.util.List r2 = r9.e()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L50:
            if (r6 >= r4) goto L5e
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.y r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            r7.a()
            int r6 = r6 + 1
            goto L50
        L5e:
            java.util.List r9 = r9.e()
            int r2 = r9.size()
            r4 = r5
        L67:
            if (r4 >= r2) goto L7a
            java.lang.Object r6 = r9.get(r4)
            androidx.compose.ui.input.pointer.y r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
            boolean r6 = r6.getPressed()
            if (r6 == 0) goto L77
            r5 = r3
            goto L7a
        L77:
            int r4 = r4 + 1
            goto L67
        L7a:
            if (r5 != 0) goto L38
            kotlin.b2 r8 = kotlin.b2.f124493a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.h(androidx.compose.ui.input.pointer.d, kotlin.coroutines.c):java.lang.Object");
    }

    @dl.e
    public static final Object i(@dl.d i0 i0Var, @dl.d yh.q<? super k, ? super b1.f, ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar, @dl.e yh.l<? super b1.f, b2> lVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objD = ForEachGestureKt.d(i0Var, new TapGestureDetectorKt$detectTapAndPress$2(new PressGestureScopeImpl(i0Var), qVar, lVar, null), cVar);
        return objD == kotlin.coroutines.intrinsics.b.h() ? objD : b2.f124493a;
    }

    public static /* synthetic */ Object j(i0 i0Var, yh.q qVar, yh.l lVar, kotlin.coroutines.c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qVar = f5597a;
        }
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        return i(i0Var, qVar, lVar, cVar);
    }

    @dl.e
    public static final Object k(@dl.d i0 i0Var, @dl.e yh.l<? super b1.f, b2> lVar, @dl.e yh.l<? super b1.f, b2> lVar2, @dl.d yh.q<? super k, ? super b1.f, ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar, @dl.e yh.l<? super b1.f, b2> lVar3, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objG = r0.g(new TapGestureDetectorKt$detectTapGestures$2(i0Var, qVar, lVar2, lVar, lVar3, null), cVar);
        return objG == kotlin.coroutines.intrinsics.b.h() ? objG : b2.f124493a;
    }

    public static /* synthetic */ Object l(i0 i0Var, yh.l lVar, yh.l lVar2, yh.q qVar, yh.l lVar3, kotlin.coroutines.c cVar, int i10, Object obj) {
        yh.l lVar4 = (i10 & 1) != 0 ? null : lVar;
        yh.l lVar5 = (i10 & 2) != 0 ? null : lVar2;
        if ((i10 & 4) != 0) {
            qVar = f5597a;
        }
        return k(i0Var, lVar4, lVar5, qVar, (i10 & 8) != 0 ? null : lVar3, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:25:0x006e A[LOOP:1: B:21:0x005e->B:25:0x006e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x006c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00bb -> B:48:0x00be). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @dl.e
    public static final java.lang.Object m(@dl.d androidx.compose.ui.input.pointer.d r13, @dl.d kotlin.coroutines.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r14) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.m(androidx.compose.ui.input.pointer.d, kotlin.coroutines.c):java.lang.Object");
    }
}
