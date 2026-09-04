package androidx.compose.ui.text.font;

import androidx.compose.runtime.j2;
import com.umeng.analytics.pro.ak;
import kotlin.DeprecationLevel;
import kotlin.Metadata;

/* JADX INFO: compiled from: Font.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a;\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aE\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\f\u0010\u0012\u001a\u00020\u0011*\u00020\u0006H\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"", "resId", "Landroidx/compose/ui/text/font/k0;", "weight", "Landroidx/compose/ui/text/font/g0;", "style", "Landroidx/compose/ui/text/font/u;", ak.aF, "(ILandroidx/compose/ui/text/font/k0;I)Landroidx/compose/ui/text/font/u;", "Landroidx/compose/ui/text/font/e0;", "loadingStrategy", "e", "(ILandroidx/compose/ui/text/font/k0;II)Landroidx/compose/ui/text/font/u;", "Landroidx/compose/ui/text/font/j0$e;", "variationSettings", ak.av, "(ILandroidx/compose/ui/text/font/k0;IILandroidx/compose/ui/text/font/j0$e;)Landroidx/compose/ui/text/font/u;", "Landroidx/compose/ui/text/font/v;", "g", "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class b0 {
    @dl.d
    @androidx.compose.ui.text.g
    public static final u a(int i10, @dl.d FontWeight weight, int i11, int i12, @dl.d j0.e variationSettings) {
        kotlin.jvm.internal.f0.p(weight, "weight");
        kotlin.jvm.internal.f0.p(variationSettings, "variationSettings");
        return new ResourceFont(i10, weight, i11, variationSettings, i12, null);
    }

    public static /* synthetic */ u b(int i10, FontWeight fontWeight, int i11, int i12, j0.e eVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.m();
        }
        if ((i13 & 4) != 0) {
            i11 = g0.INSTANCE.b();
        }
        if ((i13 & 8) != 0) {
            i12 = e0.INSTANCE.b();
        }
        if ((i13 & 16) != 0) {
            eVar = j0.f16565a.b(fontWeight, i11, new j0.a[0]);
        }
        return a(i10, fontWeight, i11, i12, eVar);
    }

    @j2
    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility until Compose 1.3.", replaceWith = @kotlin.s0(expression = "Font(resId, weight, style)", imports = {}))
    public static final /* synthetic */ u c(int i10, FontWeight weight, int i11) {
        kotlin.jvm.internal.f0.p(weight, "weight");
        return new ResourceFont(i10, weight, i11, null, e0.INSTANCE.b(), 8, null);
    }

    public static /* synthetic */ u d(int i10, FontWeight fontWeight, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.m();
        }
        if ((i12 & 4) != 0) {
            i11 = g0.INSTANCE.b();
        }
        return c(i10, fontWeight, i11);
    }

    @j2
    @dl.d
    public static final u e(int i10, @dl.d FontWeight weight, int i11, int i12) {
        kotlin.jvm.internal.f0.p(weight, "weight");
        return new ResourceFont(i10, weight, i11, new j0.e(new j0.a[0]), i12, null);
    }

    public static /* synthetic */ u f(int i10, FontWeight fontWeight, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.m();
        }
        if ((i13 & 4) != 0) {
            i11 = g0.INSTANCE.b();
        }
        if ((i13 & 8) != 0) {
            i12 = e0.INSTANCE.b();
        }
        return e(i10, fontWeight, i11, i12);
    }

    @j2
    @dl.d
    public static final v g(@dl.d u uVar) {
        kotlin.jvm.internal.f0.p(uVar, "<this>");
        return x.c(uVar);
    }
}
