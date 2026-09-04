package androidx.compose.ui.graphics;

import android.graphics.ColorFilter;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: ColorFilter.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u0004B\u0015\b\u0000\u0012\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\b\u0010\tR\u001e\u0010\u0007\u001a\u00060\u0002j\u0002`\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/m0;", "", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", ak.av, "Landroid/graphics/ColorFilter;", "()Landroid/graphics/ColorFilter;", "nativeColorFilter", "<init>", "(Landroid/graphics/ColorFilter;)V", "b", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final ColorFilter nativeColorFilter;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.m0$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ColorFilter.kt */
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/graphics/m0$a;", "", "Landroidx/compose/ui/graphics/l0;", "color", "Landroidx/compose/ui/graphics/x;", "blendMode", "Landroidx/compose/ui/graphics/m0;", ak.aF, "(JI)Landroidx/compose/ui/graphics/m0;", "Landroidx/compose/ui/graphics/o0;", "colorMatrix", ak.av, "([F)Landroidx/compose/ui/graphics/m0;", "multiply", "add", "b", "(JJ)Landroidx/compose/ui/graphics/m0;", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        public static /* synthetic */ m0 d(Companion companion, long j10, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = x.INSTANCE.z();
            }
            return companion.c(j10, i10);
        }

        @androidx.compose.runtime.j2
        @dl.d
        public final m0 a(@dl.d float[] colorMatrix) {
            kotlin.jvm.internal.f0.p(colorMatrix, "colorMatrix");
            return d.a(colorMatrix);
        }

        @androidx.compose.runtime.j2
        @dl.d
        public final m0 b(long multiply, long add) {
            return d.b(multiply, add);
        }

        @androidx.compose.runtime.j2
        @dl.d
        public final m0 c(long color, int blendMode) {
            return d.c(color, blendMode);
        }
    }

    public m0(@dl.d ColorFilter nativeColorFilter) {
        kotlin.jvm.internal.f0.p(nativeColorFilter, "nativeColorFilter");
        this.nativeColorFilter = nativeColorFilter;
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ColorFilter getNativeColorFilter() {
        return this.nativeColorFilter;
    }
}
