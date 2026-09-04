package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.graphics.f1;
import androidx.compose.ui.graphics.g2;
import androidx.compose.ui.unit.LayoutDirection;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: ClipScrollableContainer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0012\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\"\u001d\u0010\b\u001a\u00020\u00048\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0014\u0010\n\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\t\"\u0014\u0010\f\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Landroidx/compose/ui/n;", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", ak.av, "Ls1/h;", "F", "b", "()F", "MaxSupportedElevation", "Landroidx/compose/ui/n;", "HorizontalScrollableClipModifier", ak.aF, "VerticalScrollableClipModifier", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f5874a = s1.h.g(30);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.ui.n f5875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.ui.n f5876c;

    /* JADX INFO: compiled from: ClipScrollableContainer.kt */
    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"androidx/compose/foundation/j$a", "Landroidx/compose/ui/graphics/g2;", "Lb1/m;", UiKitSpanObj.TYPE_SIZE, "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Ls1/e;", "density", "Landroidx/compose/ui/graphics/f1;", ak.av, "(JLandroidx/compose/ui/unit/LayoutDirection;Ls1/e;)Landroidx/compose/ui/graphics/f1;", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements g2 {
        a() {
        }

        @Override // androidx.compose.ui.graphics.g2
        @dl.d
        public f1 a(long size, @dl.d LayoutDirection layoutDirection, @dl.d s1.e density) {
            kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.f0.p(density, "density");
            float fE1 = density.e1(j.b());
            return new f1.b(new b1.i(0.0f, -fE1, b1.m.t(size), b1.m.m(size) + fE1));
        }
    }

    /* JADX INFO: compiled from: ClipScrollableContainer.kt */
    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"androidx/compose/foundation/j$b", "Landroidx/compose/ui/graphics/g2;", "Lb1/m;", UiKitSpanObj.TYPE_SIZE, "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Ls1/e;", "density", "Landroidx/compose/ui/graphics/f1;", ak.av, "(JLandroidx/compose/ui/unit/LayoutDirection;Ls1/e;)Landroidx/compose/ui/graphics/f1;", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements g2 {
        b() {
        }

        @Override // androidx.compose.ui.graphics.g2
        @dl.d
        public f1 a(long size, @dl.d LayoutDirection layoutDirection, @dl.d s1.e density) {
            kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.f0.p(density, "density");
            float fE1 = density.e1(j.b());
            return new f1.b(new b1.i(-fE1, 0.0f, b1.m.t(size) + fE1, b1.m.m(size)));
        }
    }

    static {
        androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
        f5875b = androidx.compose.ui.draw.d.a(companion, new a());
        f5876c = androidx.compose.ui.draw.d.a(companion, new b());
    }

    @dl.d
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, @dl.d Orientation orientation) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(orientation, "orientation");
        return nVar.s0(orientation == Orientation.Vertical ? f5876c : f5875b);
    }

    public static final float b() {
        return f5874a;
    }
}
