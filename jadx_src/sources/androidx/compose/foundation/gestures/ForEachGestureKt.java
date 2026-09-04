package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.i0;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ForEachGesture.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a@\u0010\u0007\u001a\u00020\u0003*\u00020\u00002'\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001¢\u0006\u0002\b\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\f\u0010\u000b\u001a\u00020\n*\u00020\tH\u0000\u001a\u0017\u0010\f\u001a\u00020\u0003*\u00020\u0000H\u0080@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000e\u001a\u00020\u0003*\u00020\tH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/input/pointer/i0;", "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "", "Lkotlin/t;", "block", "d", "(Landroidx/compose/ui/input/pointer/i0;Lyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/d;", "", ak.av, ak.aF, "(Landroidx/compose/ui/input/pointer/i0;Lkotlin/coroutines/c;)Ljava/lang/Object;", "b", "(Landroidx/compose/ui/input/pointer/d;Lkotlin/coroutines/c;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class ForEachGestureKt {
    public static final boolean a(@dl.d androidx.compose.ui.input.pointer.d dVar) {
        f0.p(dVar, "<this>");
        List<PointerInputChange> listE = dVar.s1().e();
        int size = listE.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            if (listE.get(i10).getPressed()) {
                z10 = true;
                break;
            }
        }
        return !z10;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:24:0x0067 A[LOOP:0: B:20:0x0057->B:24:0x0067, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:19:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @dl.e
    public static final java.lang.Object b(@dl.d androidx.compose.ui.input.pointer.d r7, @dl.d kotlin.coroutines.c<? super kotlin.b2> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = (androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3) r0
            int r1 = r0.f5482d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5482d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f5481c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r0.f5482d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f5480b
            androidx.compose.ui.input.pointer.d r7 = (androidx.compose.ui.input.pointer.d) r7
            kotlin.t0.n(r8)
            goto L4b
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.t0.n(r8)
            boolean r8 = a(r7)
            if (r8 != 0) goto L6c
        L3e:
            androidx.compose.ui.input.pointer.PointerEventPass r8 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            r0.f5480b = r7
            r0.f5482d = r3
            java.lang.Object r8 = r7.r1(r8, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            androidx.compose.ui.input.pointer.p r8 = (androidx.compose.ui.input.pointer.p) r8
            java.util.List r8 = r8.e()
            int r2 = r8.size()
            r4 = 0
            r5 = r4
        L57:
            if (r5 >= r2) goto L6a
            java.lang.Object r6 = r8.get(r5)
            androidx.compose.ui.input.pointer.y r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
            boolean r6 = r6.getPressed()
            if (r6 == 0) goto L67
            r4 = r3
            goto L6a
        L67:
            int r5 = r5 + 1
            goto L57
        L6a:
            if (r4 != 0) goto L3e
        L6c:
            kotlin.b2 r7 = kotlin.b2.f124493a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.b(androidx.compose.ui.input.pointer.d, kotlin.coroutines.c):java.lang.Object");
    }

    @dl.e
    public static final Object c(@dl.d i0 i0Var, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objN1 = i0Var.n1(new ForEachGestureKt$awaitAllPointersUp$2(null), cVar);
        return objN1 == kotlin.coroutines.intrinsics.b.h() ? objN1 : b2.f124493a;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0083  */
    /* JADX WARN: Code duplicated, block: B:33:0x0093 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.input.pointer.i0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.input.pointer.i0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.compose.ui.input.pointer.i0] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0091 -> B:18:0x0052). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00ab -> B:18:0x0052). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @dl.e
    public static final java.lang.Object d(@dl.d androidx.compose.ui.input.pointer.i0 r8, @dl.d yh.p<? super androidx.compose.ui.input.pointer.i0, ? super kotlin.coroutines.c<? super kotlin.b2>, ? extends java.lang.Object> r9, @dl.d kotlin.coroutines.c<? super kotlin.b2> r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1 r0 = (androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1) r0
            int r1 = r0.f5487f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5487f = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f5486e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r0.f5487f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L67
            if (r2 == r5) goto L55
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r8 = r0.f5485d
            kotlin.coroutines.CoroutineContext r8 = (kotlin.coroutines.CoroutineContext) r8
            java.lang.Object r9 = r0.f5484c
            yh.p r9 = (yh.p) r9
            java.lang.Object r2 = r0.f5483b
            androidx.compose.ui.input.pointer.i0 r2 = (androidx.compose.ui.input.pointer.i0) r2
            kotlin.t0.n(r10)
            goto L52
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            java.lang.Object r8 = r0.f5485d
            kotlin.coroutines.CoroutineContext r8 = (kotlin.coroutines.CoroutineContext) r8
            java.lang.Object r9 = r0.f5484c
            yh.p r9 = (yh.p) r9
            java.lang.Object r2 = r0.f5483b
            androidx.compose.ui.input.pointer.i0 r2 = (androidx.compose.ui.input.pointer.i0) r2
            kotlin.t0.n(r10)     // Catch: java.util.concurrent.CancellationException -> L65
        L52:
            r10 = r8
            r8 = r2
            goto L6e
        L55:
            java.lang.Object r8 = r0.f5485d
            kotlin.coroutines.CoroutineContext r8 = (kotlin.coroutines.CoroutineContext) r8
            java.lang.Object r9 = r0.f5484c
            yh.p r9 = (yh.p) r9
            java.lang.Object r2 = r0.f5483b
            androidx.compose.ui.input.pointer.i0 r2 = (androidx.compose.ui.input.pointer.i0) r2
            kotlin.t0.n(r10)     // Catch: java.util.concurrent.CancellationException -> L65
            goto L85
        L65:
            r10 = move-exception
            goto L99
        L67:
            kotlin.t0.n(r10)
            kotlin.coroutines.CoroutineContext r10 = r0.getContext()
        L6e:
            boolean r2 = kotlinx.coroutines.g2.C(r10)
            if (r2 == 0) goto Laf
            r0.f5483b = r8     // Catch: java.util.concurrent.CancellationException -> L94
            r0.f5484c = r9     // Catch: java.util.concurrent.CancellationException -> L94
            r0.f5485d = r10     // Catch: java.util.concurrent.CancellationException -> L94
            r0.f5487f = r5     // Catch: java.util.concurrent.CancellationException -> L94
            java.lang.Object r2 = r9.invoke(r8, r0)     // Catch: java.util.concurrent.CancellationException -> L94
            if (r2 != r1) goto L83
            return r1
        L83:
            r2 = r8
            r8 = r10
        L85:
            r0.f5483b = r2     // Catch: java.util.concurrent.CancellationException -> L65
            r0.f5484c = r9     // Catch: java.util.concurrent.CancellationException -> L65
            r0.f5485d = r8     // Catch: java.util.concurrent.CancellationException -> L65
            r0.f5487f = r4     // Catch: java.util.concurrent.CancellationException -> L65
            java.lang.Object r10 = c(r2, r0)     // Catch: java.util.concurrent.CancellationException -> L65
            if (r10 != r1) goto L52
            return r1
        L94:
            r2 = move-exception
            r7 = r2
            r2 = r8
            r8 = r10
            r10 = r7
        L99:
            boolean r6 = kotlinx.coroutines.g2.C(r8)
            if (r6 == 0) goto Lae
            r0.f5483b = r2
            r0.f5484c = r9
            r0.f5485d = r8
            r0.f5487f = r3
            java.lang.Object r10 = c(r2, r0)
            if (r10 != r1) goto L52
            return r1
        Lae:
            throw r10
        Laf:
            kotlin.b2 r8 = kotlin.b2.f124493a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.d(androidx.compose.ui.input.pointer.i0, yh.p, kotlin.coroutines.c):java.lang.Object");
    }
}
