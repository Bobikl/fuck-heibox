package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.i0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: TextSelectionMouseDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\r\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/input/pointer/i0;", "Landroidx/compose/foundation/text/selection/e;", "observer", "Lkotlin/b2;", ak.aF, "(Landroidx/compose/ui/input/pointer/i0;Landroidx/compose/foundation/text/selection/e;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/d;", "Landroidx/compose/ui/input/pointer/p;", "b", "(Landroidx/compose/ui/input/pointer/d;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", ak.av, "D", "ClicksSlop", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class TextSelectionMouseDetectorKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f8327a = 100.0d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0073  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f A[LOOP:0: B:21:0x005b->B:30:0x007f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0083 A[EDGE_INSN: B:35:0x0083->B:32:0x0083 BREAK  A[LOOP:0: B:21:0x005b->B:30:0x007f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(androidx.compose.ui.input.pointer.d r10, kotlin.coroutines.c<? super androidx.compose.ui.input.pointer.p> r11) {
        /*
            boolean r0 = r11 instanceof androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1 r0 = (androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1) r0
            int r1 = r0.f8330d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8330d = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1 r0 = new androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f8329c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r0.f8330d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r10 = r0.f8328b
            androidx.compose.ui.input.pointer.d r10 = (androidx.compose.ui.input.pointer.d) r10
            kotlin.t0.n(r11)
            goto L45
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            kotlin.t0.n(r11)
        L38:
            androidx.compose.ui.input.pointer.PointerEventPass r11 = androidx.compose.ui.input.pointer.PointerEventPass.Main
            r0.f8328b = r10
            r0.f8330d = r3
            java.lang.Object r11 = r10.r1(r11, r0)
            if (r11 != r1) goto L45
            return r1
        L45:
            androidx.compose.ui.input.pointer.p r11 = (androidx.compose.ui.input.pointer.p) r11
            int r2 = r11.getButtons()
            boolean r2 = androidx.compose.ui.input.pointer.s.o(r2)
            if (r2 == 0) goto L38
            java.util.List r2 = r11.e()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L5b:
            if (r6 >= r4) goto L82
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.y r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            int r8 = r7.getType()
            androidx.compose.ui.input.pointer.m0$a r9 = androidx.compose.ui.input.pointer.m0.INSTANCE
            int r9 = r9.b()
            boolean r8 = androidx.compose.ui.input.pointer.m0.i(r8, r9)
            if (r8 == 0) goto L7b
            boolean r7 = androidx.compose.ui.input.pointer.q.b(r7)
            if (r7 == 0) goto L7b
            r7 = r3
            goto L7c
        L7b:
            r7 = r5
        L7c:
            if (r7 != 0) goto L7f
            goto L83
        L7f:
            int r6 = r6 + 1
            goto L5b
        L82:
            r5 = r3
        L83:
            if (r5 == 0) goto L38
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt.b(androidx.compose.ui.input.pointer.d, kotlin.coroutines.c):java.lang.Object");
    }

    @dl.e
    public static final Object c(@dl.d i0 i0Var, @dl.d e eVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objD = ForEachGestureKt.d(i0Var, new TextSelectionMouseDetectorKt$mouseSelectionDetector$2(eVar, null), cVar);
        return objD == kotlin.coroutines.intrinsics.b.h() ? objD : b2.f124493a;
    }
}
