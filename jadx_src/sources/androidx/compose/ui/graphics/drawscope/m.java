package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.p0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: DrawTransform.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a!\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0086\b\u001a\u0015\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001H\u0086\b\u001a,\u0010\u000b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\tH\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a,\u0010\u000e\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\tH\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/l;", "", "horizontal", "vertical", "Lkotlin/b2;", "b", "inset", ak.av, "radians", "Lb1/f;", "pivot", "d", "(Landroidx/compose/ui/graphics/drawscope/l;FJ)V", "scale", "f", "ui-graphics_release"}, k = 2, mv = {1, 7, 1})
public final class m {
    public static final void a(@dl.d l lVar, float f10) {
        f0.p(lVar, "<this>");
        lVar.h(f10, f10, f10, f10);
    }

    public static final void b(@dl.d l lVar, float f10, float f11) {
        f0.p(lVar, "<this>");
        lVar.h(f10, f11, f10, f11);
    }

    public static /* synthetic */ void c(l lVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        f0.p(lVar, "<this>");
        lVar.h(f10, f11, f10, f11);
    }

    public static final void d(@dl.d l rotateRad, float f10, long j10) {
        f0.p(rotateRad, "$this$rotateRad");
        rotateRad.g(p0.a(f10), j10);
    }

    public static /* synthetic */ void e(l rotateRad, float f10, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = rotateRad.I();
        }
        f0.p(rotateRad, "$this$rotateRad");
        rotateRad.g(p0.a(f10), j10);
    }

    public static final void f(@dl.d l scale, float f10, long j10) {
        f0.p(scale, "$this$scale");
        scale.f(f10, f10, j10);
    }

    public static /* synthetic */ void g(l scale, float f10, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = scale.I();
        }
        f0.p(scale, "$this$scale");
        scale.f(f10, f10, j10);
    }
}
