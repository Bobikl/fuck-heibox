package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.i0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: LongPressTextDragObserver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001f\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001f\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Landroidx/compose/ui/input/pointer/i0;", "Landroidx/compose/foundation/text/r;", "observer", "Lkotlin/b2;", "d", "(Landroidx/compose/ui/input/pointer/i0;Landroidx/compose/foundation/text/r;Lkotlin/coroutines/c;)Ljava/lang/Object;", ak.aF, "f", "e", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class LongPressTextDragObserverKt {
    @dl.e
    public static final Object c(@dl.d i0 i0Var, @dl.d r rVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objG = r0.g(new LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2(i0Var, rVar, null), cVar);
        return objG == kotlin.coroutines.intrinsics.b.h() ? objG : b2.f124493a;
    }

    @dl.e
    public static final Object d(@dl.d i0 i0Var, @dl.d final r rVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objQ = DragGestureDetectorKt.q(i0Var, new yh.l<b1.f, b2>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$2
            {
                super(1);
            }

            public final void a(long j10) {
                rVar.c(j10);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(b1.f fVar) {
                a(fVar.getF30368a());
                return b2.f124493a;
            }
        }, new yh.a<b2>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$3
            {
                super(0);
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                rVar.onStop();
            }
        }, new yh.a<b2>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$4
            {
                super(0);
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                rVar.onCancel();
            }
        }, new yh.p<PointerInputChange, b1.f, b2>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$5
            {
                super(2);
            }

            public final void a(@dl.d PointerInputChange pointerInputChange, long j10) {
                f0.p(pointerInputChange, "<anonymous parameter 0>");
                rVar.b(j10);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(PointerInputChange pointerInputChange, b1.f fVar) {
                a(pointerInputChange, fVar.getF30368a());
                return b2.f124493a;
            }
        }, cVar);
        return objQ == kotlin.coroutines.intrinsics.b.h() ? objQ : b2.f124493a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object e(i0 i0Var, final r rVar, kotlin.coroutines.c<? super b2> cVar) {
        Object objO = DragGestureDetectorKt.o(i0Var, new yh.l<b1.f, b2>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesWithObserver$2
            {
                super(1);
            }

            public final void a(long j10) {
                rVar.c(j10);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(b1.f fVar) {
                a(fVar.getF30368a());
                return b2.f124493a;
            }
        }, new yh.a<b2>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesWithObserver$3
            {
                super(0);
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                rVar.onStop();
            }
        }, new yh.a<b2>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesWithObserver$4
            {
                super(0);
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                rVar.onCancel();
            }
        }, new yh.p<PointerInputChange, b1.f, b2>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesWithObserver$5
            {
                super(2);
            }

            public final void a(@dl.d PointerInputChange pointerInputChange, long j10) {
                f0.p(pointerInputChange, "<anonymous parameter 0>");
                rVar.b(j10);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(PointerInputChange pointerInputChange, b1.f fVar) {
                a(pointerInputChange, fVar.getF30368a());
                return b2.f124493a;
            }
        }, cVar);
        return objO == kotlin.coroutines.intrinsics.b.h() ? objO : b2.f124493a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(i0 i0Var, r rVar, kotlin.coroutines.c<? super b2> cVar) {
        Object objD = ForEachGestureKt.d(i0Var, new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(rVar, null), cVar);
        return objD == kotlin.coroutines.intrinsics.b.h() ? objD : b2.f124493a;
    }
}
