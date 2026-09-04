package androidx.compose.foundation.layout;

import androidx.compose.runtime.j2;
import androidx.compose.ui.platform.InspectableValueKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Offset.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0005\u001a&\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nø\u0001\u0001\u001a&\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nø\u0001\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/n;", "Ls1/h;", "x", "y", "e", "(Landroidx/compose/ui/n;FF)Landroidx/compose/ui/n;", "b", "Lkotlin/Function1;", "Ls1/e;", "Ls1/n;", "Lkotlin/t;", androidx.constraintlayout.core.motion.utils.w.c.R, "d", ak.av, "foundation-layout_release"}, k = 2, mv = {1, 7, 1})
public final class OffsetKt {
    @dl.d
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, @dl.d final yh.l<? super s1.e, s1.n> offset) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(offset, "offset");
        return nVar.s0(new OffsetPxModifier(offset, false, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.OffsetKt$absoluteOffset$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("absoluteOffset");
                x0Var.getProperties().c(androidx.constraintlayout.core.motion.utils.w.c.R, offset);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b()));
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n b(@dl.d androidx.compose.ui.n absoluteOffset, final float f10, final float f11) {
        kotlin.jvm.internal.f0.p(absoluteOffset, "$this$absoluteOffset");
        return absoluteOffset.s0(new OffsetModifier(f10, f11, false, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.OffsetKt$absoluteOffset-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("absoluteOffset");
                x0Var.getProperties().c("x", s1.h.d(f10));
                x0Var.getProperties().c("y", s1.h.d(f11));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), null));
    }

    public static /* synthetic */ androidx.compose.ui.n c(androidx.compose.ui.n nVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = s1.h.g(0);
        }
        if ((i10 & 2) != 0) {
            f11 = s1.h.g(0);
        }
        return b(nVar, f10, f11);
    }

    @dl.d
    public static final androidx.compose.ui.n d(@dl.d androidx.compose.ui.n nVar, @dl.d final yh.l<? super s1.e, s1.n> offset) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(offset, "offset");
        return nVar.s0(new OffsetPxModifier(offset, true, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.OffsetKt$offset$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d(androidx.constraintlayout.core.motion.utils.w.c.R);
                x0Var.getProperties().c(androidx.constraintlayout.core.motion.utils.w.c.R, offset);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b()));
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n e(@dl.d androidx.compose.ui.n offset, final float f10, final float f11) {
        kotlin.jvm.internal.f0.p(offset, "$this$offset");
        return offset.s0(new OffsetModifier(f10, f11, true, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.OffsetKt$offset-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d(androidx.constraintlayout.core.motion.utils.w.c.R);
                x0Var.getProperties().c("x", s1.h.d(f10));
                x0Var.getProperties().c("y", s1.h.d(f11));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), null));
    }

    public static /* synthetic */ androidx.compose.ui.n f(androidx.compose.ui.n nVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = s1.h.g(0);
        }
        if ((i10 & 2) != 0) {
            f11 = s1.h.g(0);
        }
        return e(nVar, f10, f11);
    }
}
