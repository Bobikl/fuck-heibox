package androidx.compose.ui.text;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextMeasurerHelper.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0006\u001a\u00020\u00008\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"", "cacheSize", "Landroidx/compose/ui/text/j0;", ak.av, "(ILandroidx/compose/runtime/p;II)Landroidx/compose/ui/text/j0;", "I", "DefaultCacheSize", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f16819a = 8;

    @dl.d
    @androidx.compose.runtime.h
    @g
    public static final j0 a(int i10, @dl.e androidx.compose.runtime.p pVar, int i11, int i12) {
        pVar.T(1538166871);
        if ((i12 & 1) != 0) {
            i10 = f16819a;
        }
        if (ComposerKt.g0()) {
            ComposerKt.w0(1538166871, i11, -1, "androidx.compose.ui.text.rememberTextMeasurer (TextMeasurerHelper.kt:41)");
        }
        androidx.compose.ui.text.font.v.b bVar = (androidx.compose.ui.text.font.v.b) pVar.K(CompositionLocalsKt.k());
        s1.e eVar = (s1.e) pVar.K(CompositionLocalsKt.i());
        LayoutDirection layoutDirection = (LayoutDirection) pVar.K(CompositionLocalsKt.p());
        Object[] objArr = {bVar, eVar, layoutDirection, Integer.valueOf(i10)};
        pVar.T(-568225417);
        boolean zS = false;
        for (int i13 = 0; i13 < 4; i13++) {
            zS |= pVar.s(objArr[i13]);
        }
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = new j0(bVar, eVar, layoutDirection, i10);
            pVar.N(objU);
        }
        pVar.c0();
        j0 j0Var = (j0) objU;
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return j0Var;
    }
}
