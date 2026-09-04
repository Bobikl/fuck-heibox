package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: PointerInteropUtils.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a5\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a5\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\b\u001a&\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000\u001a=\u0010\u000f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/input/pointer/p;", "Lb1/f;", androidx.constraintlayout.core.motion.utils.w.c.R, "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "Lkotlin/b2;", "block", "d", "(Landroidx/compose/ui/input/pointer/p;JLyh/l;)V", ak.aF, "", "nowMillis", ak.av, "", "cancel", "e", "(Landroidx/compose/ui/input/pointer/p;JLyh/l;Z)V", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class k0 {
    public static final void a(long j10, @dl.d yh.l<? super MotionEvent, b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        MotionEvent motionEvent = MotionEvent.obtain(j10, j10, 3, 0.0f, 0.0f, 0);
        motionEvent.setSource(0);
        kotlin.jvm.internal.f0.o(motionEvent, "motionEvent");
        block.invoke(motionEvent);
        motionEvent.recycle();
    }

    public static /* synthetic */ void b(long j10, yh.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = SystemClock.uptimeMillis();
        }
        a(j10, lVar);
    }

    public static final void c(@dl.d p toCancelMotionEventScope, long j10, @dl.d yh.l<? super MotionEvent, b2> block) {
        kotlin.jvm.internal.f0.p(toCancelMotionEventScope, "$this$toCancelMotionEventScope");
        kotlin.jvm.internal.f0.p(block, "block");
        e(toCancelMotionEventScope, j10, block, true);
    }

    public static final void d(@dl.d p toMotionEventScope, long j10, @dl.d yh.l<? super MotionEvent, b2> block) {
        kotlin.jvm.internal.f0.p(toMotionEventScope, "$this$toMotionEventScope");
        kotlin.jvm.internal.f0.p(block, "block");
        e(toMotionEventScope, j10, block, false);
    }

    private static final void e(p pVar, long j10, yh.l<? super MotionEvent, b2> lVar, boolean z10) {
        MotionEvent motionEventH = pVar.h();
        if (motionEventH == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.".toString());
        }
        int action = motionEventH.getAction();
        if (z10) {
            motionEventH.setAction(3);
        }
        motionEventH.offsetLocation(-b1.f.p(j10), -b1.f.r(j10));
        lVar.invoke(motionEventH);
        motionEventH.offsetLocation(b1.f.p(j10), b1.f.r(j10));
        motionEventH.setAction(action);
    }
}
