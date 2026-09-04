package androidx.compose.ui.graphics;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Canvas.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u001e\u0010\u0007\u001a\u00020\u0005*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\bø\u0001\u0000\u001a.\u0010\f\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\bø\u0001\u0000\u001a\"\u0010\u0011\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r\u001a&\u0010\u0013\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r\u001a,\u0010\u0016\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/graphics/y0;", "image", "Landroidx/compose/ui/graphics/d0;", ak.av, "Lkotlin/Function0;", "Lkotlin/b2;", "block", "g", "Lb1/i;", "bounds", "Landroidx/compose/ui/graphics/h1;", "paint", RXScreenCaptureService.KEY_HEIGHT, "", "degrees", "pivotX", "pivotY", "b", "radians", ak.aF, "sx", "sy", "e", "ui-graphics_release"}, k = 2, mv = {1, 7, 1})
public final class f0 {
    @dl.d
    public static final d0 a(@dl.d y0 image) {
        kotlin.jvm.internal.f0.p(image, "image");
        return c.a(image);
    }

    public static final void b(@dl.d d0 d0Var, float f10, float f11, float f12) {
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        if (f10 == 0.0f) {
            return;
        }
        d0Var.b(f11, f12);
        d0Var.z(f10);
        d0Var.b(-f11, -f12);
    }

    public static final void c(@dl.d d0 d0Var, float f10, float f11, float f12) {
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        b(d0Var, p0.a(f10), f11, f12);
    }

    public static /* synthetic */ void d(d0 d0Var, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        c(d0Var, f10, f11, f12);
    }

    public static final void e(@dl.d d0 d0Var, float f10, float f11, float f12, float f13) {
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        if (f10 == 1.0f) {
            if (f11 == 1.0f) {
                return;
            }
        }
        d0Var.b(f12, f13);
        d0Var.q(f10, f11);
        d0Var.b(-f12, -f13);
    }

    public static /* synthetic */ void f(d0 d0Var, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = f10;
        }
        e(d0Var, f10, f11, f12, f13);
    }

    public static final void g(@dl.d d0 d0Var, @dl.d yh.a<kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        kotlin.jvm.internal.f0.p(block, "block");
        try {
            d0Var.f();
            block.invoke();
        } finally {
            kotlin.jvm.internal.c0.d(1);
            d0Var.u();
            kotlin.jvm.internal.c0.c(1);
        }
    }

    public static final void h(@dl.d d0 d0Var, @dl.d b1.i bounds, @dl.d h1 paint, @dl.d yh.a<kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        kotlin.jvm.internal.f0.p(bounds, "bounds");
        kotlin.jvm.internal.f0.p(paint, "paint");
        kotlin.jvm.internal.f0.p(block, "block");
        try {
            d0Var.l(bounds, paint);
            block.invoke();
        } finally {
            kotlin.jvm.internal.c0.d(1);
            d0Var.u();
            kotlin.jvm.internal.c0.c(1);
        }
    }
}
