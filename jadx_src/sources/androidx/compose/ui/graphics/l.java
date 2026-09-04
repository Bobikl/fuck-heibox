package androidx.compose.ui.graphics;

import android.graphics.ComposePathEffect;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.PathDashPathEffect;
import android.graphics.PathEffect;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidPathEffect.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0000*\u00020\u0001\u001a\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0000\u001a\u0018\u0010\r\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0000\u001a5\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0016\u001a\u00020\u0015*\u00020\u0011H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/graphics/m1;", "Landroid/graphics/PathEffect;", "e", "g", "", "radius", "b", "", "intervals", androidx.constraintlayout.core.motion.utils.w.c.S, ak.aF, "outer", ak.au, ak.av, "Landroidx/compose/ui/graphics/l1;", "shape", "advance", "Landroidx/compose/ui/graphics/i2;", "style", "d", "(Landroidx/compose/ui/graphics/l1;FFI)Landroidx/compose/ui/graphics/m1;", "Landroid/graphics/PathDashPathEffect$Style;", "f", "(I)Landroid/graphics/PathDashPathEffect$Style;", "ui-graphics_release"}, k = 2, mv = {1, 7, 1})
public final class l {
    @dl.d
    public static final m1 a(@dl.d m1 outer, @dl.d m1 inner) {
        kotlin.jvm.internal.f0.p(outer, "outer");
        kotlin.jvm.internal.f0.p(inner, "inner");
        return new k(new ComposePathEffect(((k) outer).getNativePathEffect(), ((k) inner).getNativePathEffect()));
    }

    @dl.d
    public static final m1 b(float f10) {
        return new k(new CornerPathEffect(f10));
    }

    @dl.d
    public static final m1 c(@dl.d float[] intervals, float f10) {
        kotlin.jvm.internal.f0.p(intervals, "intervals");
        return new k(new DashPathEffect(intervals, f10));
    }

    @dl.d
    public static final m1 d(@dl.d l1 shape, float f10, float f11, int i10) {
        kotlin.jvm.internal.f0.p(shape, "shape");
        if (shape instanceof j) {
            return new k(new PathDashPathEffect(((j) shape).getInternalPath(), f10, f11, f(i10)));
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @dl.d
    public static final PathEffect e(@dl.d m1 m1Var) {
        kotlin.jvm.internal.f0.p(m1Var, "<this>");
        return ((k) m1Var).getNativePathEffect();
    }

    @dl.d
    public static final PathDashPathEffect.Style f(int i10) {
        i2.Companion aVar = i2.INSTANCE;
        if (i2.g(i10, aVar.a())) {
            return PathDashPathEffect.Style.MORPH;
        }
        if (i2.g(i10, aVar.b())) {
            return PathDashPathEffect.Style.ROTATE;
        }
        return i2.g(i10, aVar.c()) ? PathDashPathEffect.Style.TRANSLATE : PathDashPathEffect.Style.TRANSLATE;
    }

    @dl.d
    public static final m1 g(@dl.d PathEffect pathEffect) {
        kotlin.jvm.internal.f0.p(pathEffect, "<this>");
        return new k(pathEffect);
    }
}
