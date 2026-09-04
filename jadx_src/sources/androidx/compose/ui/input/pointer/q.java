package androidx.compose.ui.input.pointer;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.s0;

/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0000\u001a\u0014\u0010\t\u001a\u00020\b*\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0014\u0010\u000b\u001a\u00020\b*\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\n\u001a \u0010\r\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\f\u0010\u000f\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\f\u0010\u0010\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\f\u0010\u0012\u001a\u00020\u0011*\u00020\u0000H\u0007\u001a\f\u0010\u0013\u001a\u00020\u0011*\u00020\u0000H\u0007\u001a\f\u0010\u0014\u001a\u00020\u0011*\u00020\u0000H\u0007\u001a!\u0010\u0017\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u001b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/input/pointer/y;", "", "b", ak.aF, "d", "e", "p", "q", "Lb1/f;", "k", "(Landroidx/compose/ui/input/pointer/y;)J", "m", "ignoreConsumed", "n", "(Landroidx/compose/ui/input/pointer/y;Z)J", "l", ak.av, "Lkotlin/b2;", "g", RXScreenCaptureService.KEY_HEIGHT, "f", "Ls1/r;", UiKitSpanObj.TYPE_SIZE, "i", "(Landroidx/compose/ui/input/pointer/y;J)Z", "Lb1/m;", "extendedTouchPadding", "j", "(Landroidx/compose/ui/input/pointer/y;JJ)Z", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class q {
    @kotlin.k(message = "Partial consumption has been deprecated. Use isConsumed instead", replaceWith = @s0(expression = "isConsumed", imports = {}))
    public static final boolean a(@dl.d PointerInputChange yVar) {
        kotlin.jvm.internal.f0.p(yVar, "<this>");
        return yVar.A();
    }

    public static final boolean b(@dl.d PointerInputChange yVar) {
        kotlin.jvm.internal.f0.p(yVar, "<this>");
        return (yVar.A() || yVar.getPreviousPressed() || !yVar.getPressed()) ? false : true;
    }

    public static final boolean c(@dl.d PointerInputChange yVar) {
        kotlin.jvm.internal.f0.p(yVar, "<this>");
        return !yVar.getPreviousPressed() && yVar.getPressed();
    }

    public static final boolean d(@dl.d PointerInputChange yVar) {
        kotlin.jvm.internal.f0.p(yVar, "<this>");
        return (yVar.A() || !yVar.getPreviousPressed() || yVar.getPressed()) ? false : true;
    }

    public static final boolean e(@dl.d PointerInputChange yVar) {
        kotlin.jvm.internal.f0.p(yVar, "<this>");
        return yVar.getPreviousPressed() && !yVar.getPressed();
    }

    @kotlin.k(message = "Use consume() instead", replaceWith = @s0(expression = "consume()", imports = {}))
    public static final void f(@dl.d PointerInputChange yVar) {
        kotlin.jvm.internal.f0.p(yVar, "<this>");
        yVar.a();
    }

    @kotlin.k(message = "Partial consumption has been deprecated. Use consume() instead.", replaceWith = @s0(expression = "if (pressed != previousPressed) consume()", imports = {}))
    public static final void g(@dl.d PointerInputChange yVar) {
        kotlin.jvm.internal.f0.p(yVar, "<this>");
        if (yVar.getPressed() != yVar.getPreviousPressed()) {
            yVar.a();
        }
    }

    @kotlin.k(message = "Partial consumption has been deprecated. Use consume() instead.", replaceWith = @s0(expression = "if (positionChange() != Offset.Zero) consume()", imports = {}))
    public static final void h(@dl.d PointerInputChange yVar) {
        kotlin.jvm.internal.f0.p(yVar, "<this>");
        if (b1.f.l(k(yVar), b1.f.f30364b.e())) {
            return;
        }
        yVar.a();
    }

    @kotlin.k(message = "Use isOutOfBounds() that supports minimum touch target", replaceWith = @s0(expression = "this.isOutOfBounds(size, extendedTouchPadding)", imports = {}))
    public static final boolean i(@dl.d PointerInputChange isOutOfBounds, long j10) {
        kotlin.jvm.internal.f0.p(isOutOfBounds, "$this$isOutOfBounds");
        long jQ = isOutOfBounds.getPosition();
        float fP = b1.f.p(jQ);
        float fR = b1.f.r(jQ);
        return fP < 0.0f || fP > ((float) s1.r.m(j10)) || fR < 0.0f || fR > ((float) s1.r.j(j10));
    }

    public static final boolean j(@dl.d PointerInputChange isOutOfBounds, long j10, long j11) {
        kotlin.jvm.internal.f0.p(isOutOfBounds, "$this$isOutOfBounds");
        if (!m0.i(isOutOfBounds.getType(), m0.INSTANCE.d())) {
            return i(isOutOfBounds, j10);
        }
        long jQ = isOutOfBounds.getPosition();
        float fP = b1.f.p(jQ);
        float fR = b1.f.r(jQ);
        return fP < (-b1.m.t(j11)) || fP > ((float) s1.r.m(j10)) + b1.m.t(j11) || fR < (-b1.m.m(j11)) || fR > ((float) s1.r.j(j10)) + b1.m.m(j11);
    }

    public static final long k(@dl.d PointerInputChange yVar) {
        kotlin.jvm.internal.f0.p(yVar, "<this>");
        return n(yVar, false);
    }

    @kotlin.k(message = "Partial consumption has been deprecated. Use isConsumed instead", replaceWith = @s0(expression = "isConsumed", imports = {}))
    public static final boolean l(@dl.d PointerInputChange yVar) {
        kotlin.jvm.internal.f0.p(yVar, "<this>");
        return yVar.A();
    }

    public static final long m(@dl.d PointerInputChange yVar) {
        kotlin.jvm.internal.f0.p(yVar, "<this>");
        return n(yVar, true);
    }

    private static final long n(PointerInputChange yVar, boolean z10) {
        long jU = b1.f.u(yVar.getPosition(), yVar.getPreviousPosition());
        return (z10 || !yVar.A()) ? jU : b1.f.f30364b.e();
    }

    static /* synthetic */ long o(PointerInputChange yVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return n(yVar, z10);
    }

    public static final boolean p(@dl.d PointerInputChange yVar) {
        kotlin.jvm.internal.f0.p(yVar, "<this>");
        return !b1.f.l(n(yVar, false), b1.f.f30364b.e());
    }

    public static final boolean q(@dl.d PointerInputChange yVar) {
        kotlin.jvm.internal.f0.p(yVar, "<this>");
        return !b1.f.l(n(yVar, true), b1.f.f30364b.e());
    }
}
