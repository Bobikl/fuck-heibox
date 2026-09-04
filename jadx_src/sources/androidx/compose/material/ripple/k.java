package androidx.compose.material.ripple;

import androidx.compose.runtime.p;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.graphics.n0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: RippleTheme.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003J\u0018\u0010\u0003\u001a\u00020\u0002H'ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0003\u0082\u0002\u0015\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/material/ripple/k;", "", "Landroidx/compose/ui/graphics/l0;", ak.av, "(Landroidx/compose/runtime/p;I)J", "Landroidx/compose/material/ripple/e;", "b", "(Landroidx/compose/runtime/p;I)Landroidx/compose/material/ripple/e;", "material-ripple_release"}, k = 1, mv = {1, 7, 1})
public interface k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f8522a;

    /* JADX INFO: renamed from: androidx.compose.material.ripple.k$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: RippleTheme.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Landroidx/compose/material/ripple/k$a;", "", "Landroidx/compose/ui/graphics/l0;", "contentColor", "", "lightTheme", "b", "(JZ)J", "Landroidx/compose/material/ripple/e;", ak.av, "(JZ)Landroidx/compose/material/ripple/e;", "<init>", "()V", "material-ripple_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f8522a = new Companion();

        private Companion() {
        }

        @dl.d
        public final RippleAlpha a(long contentColor, boolean lightTheme) {
            if (lightTheme) {
                return ((double) n0.p(contentColor)) > 0.5d ? RippleThemeKt.f8491b : RippleThemeKt.f8492c;
            }
            return RippleThemeKt.f8493d;
        }

        public final long b(long contentColor, boolean lightTheme) {
            return (lightTheme || ((double) n0.p(contentColor)) >= 0.5d) ? contentColor : l0.INSTANCE.w();
        }
    }

    @androidx.compose.runtime.h
    long a(@dl.e p pVar, int i10);

    @dl.d
    @androidx.compose.runtime.h
    RippleAlpha b(@dl.e p pVar, int i10);
}
