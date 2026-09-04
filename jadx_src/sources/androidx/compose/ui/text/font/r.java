package androidx.compose.ui.text.font;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: DeviceFontFamilyNameFont.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/font/p;", "familyName", "Landroidx/compose/ui/text/font/k0;", "weight", "Landroidx/compose/ui/text/font/g0;", "style", "Landroidx/compose/ui/text/font/j0$e;", "variationSettings", "Landroidx/compose/ui/text/font/u;", ak.av, "(Ljava/lang/String;Landroidx/compose/ui/text/font/k0;ILandroidx/compose/ui/text/font/j0$e;)Landroidx/compose/ui/text/font/u;", "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class r {
    @dl.d
    @androidx.compose.ui.text.g
    public static final u a(@dl.d String familyName, @dl.d FontWeight weight, int i10, @dl.d j0.e variationSettings) {
        kotlin.jvm.internal.f0.p(familyName, "familyName");
        kotlin.jvm.internal.f0.p(weight, "weight");
        kotlin.jvm.internal.f0.p(variationSettings, "variationSettings");
        return new Font(familyName, weight, i10, variationSettings, null);
    }

    public static /* synthetic */ u b(String str, FontWeight fontWeight, int i10, j0.e eVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.m();
        }
        if ((i11 & 4) != 0) {
            i10 = g0.INSTANCE.b();
        }
        if ((i11 & 8) != 0) {
            eVar = new j0.e(new j0.a[0]);
        }
        return a(str, fontWeight, i10, eVar);
    }
}
