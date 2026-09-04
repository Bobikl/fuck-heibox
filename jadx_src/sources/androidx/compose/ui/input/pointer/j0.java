package androidx.compose.ui.input.pointer;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: PointerInputTestUtil.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u001a.\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0000\u001a(\u0010\b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0000\u001a(\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\f\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001aG\u0010\u0015\u001a\u00020\u0011*\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\rj\u0002`\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u0010H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001aO\u0010\u0018\u001a\u00020\u0011*\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\rj\u0002`\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u0010H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a[\u0010\u001c\u001a\u00020\u0011*\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\rj\u0002`\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0012\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u001a\"\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u0010H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001aU\u0010\u001f\u001a\u00020\u0011*\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\rj\u0002`\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001e2\b\b\u0002\u0010\u0014\u001a\u00020\u0010H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 *<\b\u0000\u0010!\"\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\r2\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, d2 = {"", "id", "durationMillis", "", "x", "y", "Landroidx/compose/ui/input/pointer/y;", ak.av, "m", "dx", "dy", "k", "o", "Lkotlin/Function3;", "Landroidx/compose/ui/input/pointer/p;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "Ls1/r;", "Lkotlin/b2;", "Landroidx/compose/ui/input/pointer/PointerInputHandler;", "pointerEvent", UiKitSpanObj.TYPE_SIZE, ak.aF, "(Lyh/q;Landroidx/compose/ui/input/pointer/p;J)V", "pointerEventPass", "e", "(Lyh/q;Landroidx/compose/ui/input/pointer/p;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "", "pointerEventPasses", RXScreenCaptureService.KEY_HEIGHT, "(Lyh/q;Landroidx/compose/ui/input/pointer/p;[Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "", "g", "(Lyh/q;Landroidx/compose/ui/input/pointer/p;Ljava/util/List;J)V", "PointerInputHandler", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class j0 {
    @dl.d
    public static final PointerInputChange a(long j10, long j11, float f10, float f11) {
        return new PointerInputChange(x.b(j10), j11, b1.g.a(f10, f11), true, 1.0f, j11, b1.g.a(f10, f11), false, false, 0, 0L, bb.c.b.Cq, (kotlin.jvm.internal.u) null);
    }

    public static /* synthetic */ PointerInputChange b(long j10, long j11, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j11 = 0;
        }
        return a(j10, j11, (i10 & 4) != 0 ? 0.0f : f10, (i10 & 8) != 0 ? 0.0f : f11);
    }

    public static final void c(@dl.d yh.q<? super p, ? super PointerEventPass, ? super s1.r, b2> invokeOverAllPasses, @dl.d p pointerEvent, long j10) {
        kotlin.jvm.internal.f0.p(invokeOverAllPasses, "$this$invokeOverAllPasses");
        kotlin.jvm.internal.f0.p(pointerEvent, "pointerEvent");
        g(invokeOverAllPasses, pointerEvent, CollectionsKt__CollectionsKt.L(PointerEventPass.Initial, PointerEventPass.Main, PointerEventPass.Final), j10);
    }

    public static /* synthetic */ void d(yh.q qVar, p pVar, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = s1.s.a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        c(qVar, pVar, j10);
    }

    public static final void e(@dl.d yh.q<? super p, ? super PointerEventPass, ? super s1.r, b2> invokeOverPass, @dl.d p pointerEvent, @dl.d PointerEventPass pointerEventPass, long j10) {
        kotlin.jvm.internal.f0.p(invokeOverPass, "$this$invokeOverPass");
        kotlin.jvm.internal.f0.p(pointerEvent, "pointerEvent");
        kotlin.jvm.internal.f0.p(pointerEventPass, "pointerEventPass");
        g(invokeOverPass, pointerEvent, kotlin.collections.s.k(pointerEventPass), j10);
    }

    public static /* synthetic */ void f(yh.q qVar, p pVar, PointerEventPass pointerEventPass, long j10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j10 = s1.s.a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        e(qVar, pVar, pointerEventPass, j10);
    }

    public static final void g(@dl.d yh.q<? super p, ? super PointerEventPass, ? super s1.r, b2> invokeOverPasses, @dl.d p pointerEvent, @dl.d List<? extends PointerEventPass> pointerEventPasses, long j10) {
        kotlin.jvm.internal.f0.p(invokeOverPasses, "$this$invokeOverPasses");
        kotlin.jvm.internal.f0.p(pointerEvent, "pointerEvent");
        kotlin.jvm.internal.f0.p(pointerEventPasses, "pointerEventPasses");
        if (!(!pointerEvent.e().isEmpty())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(!pointerEventPasses.isEmpty())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int size = pointerEventPasses.size();
        for (int i10 = 0; i10 < size; i10++) {
            invokeOverPasses.invoke(pointerEvent, pointerEventPasses.get(i10), s1.r.b(j10));
        }
    }

    public static final void h(@dl.d yh.q<? super p, ? super PointerEventPass, ? super s1.r, b2> invokeOverPasses, @dl.d p pointerEvent, @dl.d PointerEventPass[] pointerEventPasses, long j10) {
        kotlin.jvm.internal.f0.p(invokeOverPasses, "$this$invokeOverPasses");
        kotlin.jvm.internal.f0.p(pointerEvent, "pointerEvent");
        kotlin.jvm.internal.f0.p(pointerEventPasses, "pointerEventPasses");
        g(invokeOverPasses, pointerEvent, ArraysKt___ArraysKt.kz(pointerEventPasses), j10);
    }

    public static /* synthetic */ void i(yh.q qVar, p pVar, List list, long j10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j10 = s1.s.a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        g(qVar, pVar, list, j10);
    }

    public static /* synthetic */ void j(yh.q qVar, p pVar, PointerEventPass[] pointerEventPassArr, long j10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j10 = s1.s.a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        h(qVar, pVar, pointerEventPassArr, j10);
    }

    @dl.d
    public static final PointerInputChange k(@dl.d PointerInputChange pointerInputChange, long j10, float f10, float f11) {
        kotlin.jvm.internal.f0.p(pointerInputChange, "<this>");
        long id2 = pointerInputChange.getId();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new PointerInputChange(id2, pointerInputChange.getUptimeMillis() + j10, b1.g.a(b1.f.p(pointerInputChange.getPosition()) + f10, b1.f.r(pointerInputChange.getPosition()) + f11), true, 1.0f, uptimeMillis, pointerInputChange.getPosition(), pressed, false, 0, 0L, bb.c.b.Cq, (kotlin.jvm.internal.u) null);
    }

    public static /* synthetic */ PointerInputChange l(PointerInputChange pointerInputChange, long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        return k(pointerInputChange, j10, f10, f11);
    }

    @dl.d
    public static final PointerInputChange m(@dl.d PointerInputChange pointerInputChange, long j10, float f10, float f11) {
        kotlin.jvm.internal.f0.p(pointerInputChange, "<this>");
        long id2 = pointerInputChange.getId();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new PointerInputChange(id2, j10, b1.g.a(f10, f11), true, 1.0f, uptimeMillis, pointerInputChange.getPosition(), pressed, false, 0, 0L, bb.c.b.Cq, (kotlin.jvm.internal.u) null);
    }

    public static /* synthetic */ PointerInputChange n(PointerInputChange pointerInputChange, long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        return m(pointerInputChange, j10, f10, f11);
    }

    @dl.d
    public static final PointerInputChange o(@dl.d PointerInputChange pointerInputChange, long j10) {
        kotlin.jvm.internal.f0.p(pointerInputChange, "<this>");
        long id2 = pointerInputChange.getId();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new PointerInputChange(id2, j10, pointerInputChange.getPosition(), false, 1.0f, uptimeMillis, pointerInputChange.getPosition(), pressed, false, 0, 0L, bb.c.b.Cq, (kotlin.jvm.internal.u) null);
    }
}
