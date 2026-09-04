package androidx.compose.ui.graphics;

import androidx.compose.ui.unit.LayoutDirection;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: RectangleShape.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0007\" \u0010\u0006\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/graphics/g2;", ak.av, "Landroidx/compose/ui/graphics/g2;", "()Landroidx/compose/ui/graphics/g2;", "getRectangleShape$annotations", "()V", "RectangleShape", "ui-graphics_release"}, k = 2, mv = {1, 7, 1})
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final g2 f14434a = new a();

    /* JADX INFO: compiled from: RectangleShape.kt */
    @Metadata(bv = {}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"androidx/compose/ui/graphics/x1$a", "Landroidx/compose/ui/graphics/g2;", "Lb1/m;", UiKitSpanObj.TYPE_SIZE, "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Ls1/e;", "density", "Landroidx/compose/ui/graphics/f1$b;", "b", "(JLandroidx/compose/ui/unit/LayoutDirection;Ls1/e;)Landroidx/compose/ui/graphics/f1$b;", "", "toString", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements g2 {
        a() {
        }

        @Override // androidx.compose.ui.graphics.g2
        @dl.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f1.b a(long size, @dl.d LayoutDirection layoutDirection, @dl.d s1.e density) {
            kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.f0.p(density, "density");
            return new f1.b(b1.n.m(size));
        }

        @dl.d
        public String toString() {
            return "RectangleShape";
        }
    }

    @dl.d
    public static final g2 a() {
        return f14434a;
    }

    @androidx.compose.runtime.j2
    public static /* synthetic */ void b() {
    }
}
