package androidx.compose.ui.graphics;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: PathEffect.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/graphics/m1;", "", ak.av, "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public interface m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f13917a;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.m1$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: PathEffect.kt */
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0002J\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004J3\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/graphics/m1$a;", "", "", "radius", "Landroidx/compose/ui/graphics/m1;", "b", "", "intervals", androidx.constraintlayout.core.motion.utils.w.c.S, ak.aF, "outer", ak.au, ak.av, "Landroidx/compose/ui/graphics/l1;", "shape", "advance", "Landroidx/compose/ui/graphics/i2;", "style", "e", "(Landroidx/compose/ui/graphics/l1;FFI)Landroidx/compose/ui/graphics/m1;", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f13917a = new Companion();

        private Companion() {
        }

        public static /* synthetic */ m1 d(Companion companion, float[] fArr, float f10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            return companion.c(fArr, f10);
        }

        @dl.d
        public final m1 a(@dl.d m1 outer, @dl.d m1 inner) {
            kotlin.jvm.internal.f0.p(outer, "outer");
            kotlin.jvm.internal.f0.p(inner, "inner");
            return l.a(outer, inner);
        }

        @dl.d
        public final m1 b(float radius) {
            return l.b(radius);
        }

        @dl.d
        public final m1 c(@dl.d float[] intervals, float phase) {
            kotlin.jvm.internal.f0.p(intervals, "intervals");
            return l.c(intervals, phase);
        }

        @dl.d
        public final m1 e(@dl.d l1 shape, float advance, float phase, int style) {
            kotlin.jvm.internal.f0.p(shape, "shape");
            return l.d(shape, advance, phase, style);
        }
    }
}
