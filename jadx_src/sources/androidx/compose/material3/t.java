package androidx.compose.material3;

import android.content.Context;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: DynamicTonalPalette.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u001a\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u001a\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¨\u0006\u0007"}, d2 = {"Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Landroidx/compose/material3/a2;", ak.aF, "Landroidx/compose/material3/o;", "b", ak.av, "material3_release"}, k = 2, mv = {1, 7, 1})
public final class t {
    @dl.d
    @androidx.annotation.w0(31)
    public static final ColorScheme a(@dl.d Context context) {
        kotlin.jvm.internal.f0.p(context, "context");
        a2 a2VarC = c(context);
        return ColorSchemeKt.e(a2VarC.getPrimary80(), a2VarC.getPrimary20(), a2VarC.getPrimary30(), a2VarC.getPrimary90(), a2VarC.getPrimary40(), a2VarC.getSecondary80(), a2VarC.getSecondary20(), a2VarC.getSecondary30(), a2VarC.getSecondary90(), a2VarC.getTertiary80(), a2VarC.getTertiary20(), a2VarC.getTertiary30(), a2VarC.getTertiary90(), a2VarC.getNeutral10(), a2VarC.getNeutral90(), a2VarC.getNeutral10(), a2VarC.getNeutral90(), a2VarC.getNeutralVariant30(), a2VarC.getNeutralVariant80(), 0L, a2VarC.getNeutral90(), a2VarC.getNeutral20(), 0L, 0L, 0L, 0L, a2VarC.getNeutralVariant60(), 0L, 0L, 466092032, null);
    }

    @dl.d
    @androidx.annotation.w0(31)
    public static final ColorScheme b(@dl.d Context context) {
        kotlin.jvm.internal.f0.p(context, "context");
        a2 a2VarC = c(context);
        return ColorSchemeKt.i(a2VarC.getPrimary40(), a2VarC.getPrimary100(), a2VarC.getPrimary90(), a2VarC.getPrimary10(), a2VarC.getPrimary80(), a2VarC.getSecondary40(), a2VarC.getSecondary100(), a2VarC.getSecondary90(), a2VarC.getSecondary10(), a2VarC.getTertiary40(), a2VarC.getTertiary100(), a2VarC.getTertiary90(), a2VarC.getTertiary10(), a2VarC.getNeutral99(), a2VarC.getNeutral10(), a2VarC.getNeutral99(), a2VarC.getNeutral10(), a2VarC.getNeutralVariant90(), a2VarC.getNeutralVariant30(), 0L, a2VarC.getNeutral20(), a2VarC.getNeutral95(), 0L, 0L, 0L, 0L, a2VarC.getNeutralVariant50(), 0L, 0L, 466092032, null);
    }

    @dl.d
    @androidx.annotation.w0(31)
    public static final a2 c(@dl.d Context context) {
        kotlin.jvm.internal.f0.p(context, "context");
        n nVar = n.f12031a;
        return new a2(nVar.a(context, android.R.color.system_neutral1_0), nVar.a(context, android.R.color.system_neutral1_10), nVar.a(context, android.R.color.system_neutral1_50), nVar.a(context, android.R.color.system_neutral1_100), nVar.a(context, android.R.color.system_neutral1_200), nVar.a(context, android.R.color.system_neutral1_300), nVar.a(context, android.R.color.system_neutral1_400), nVar.a(context, android.R.color.system_neutral1_500), nVar.a(context, android.R.color.system_neutral1_600), nVar.a(context, android.R.color.system_neutral1_700), nVar.a(context, android.R.color.system_neutral1_800), nVar.a(context, android.R.color.system_neutral1_900), nVar.a(context, android.R.color.system_neutral1_1000), nVar.a(context, android.R.color.system_neutral2_0), nVar.a(context, android.R.color.system_neutral2_10), nVar.a(context, android.R.color.system_neutral2_50), nVar.a(context, android.R.color.system_neutral2_100), nVar.a(context, android.R.color.system_neutral2_200), nVar.a(context, android.R.color.system_neutral2_300), nVar.a(context, android.R.color.system_neutral2_400), nVar.a(context, android.R.color.system_neutral2_500), nVar.a(context, android.R.color.system_neutral2_600), nVar.a(context, android.R.color.system_neutral2_700), nVar.a(context, android.R.color.system_neutral2_800), nVar.a(context, android.R.color.system_neutral2_900), nVar.a(context, android.R.color.system_neutral2_1000), nVar.a(context, android.R.color.system_accent1_0), nVar.a(context, android.R.color.system_accent1_10), nVar.a(context, android.R.color.system_accent1_50), nVar.a(context, android.R.color.system_accent1_100), nVar.a(context, android.R.color.system_accent1_200), nVar.a(context, android.R.color.system_accent1_300), nVar.a(context, android.R.color.system_accent1_400), nVar.a(context, android.R.color.system_accent1_500), nVar.a(context, android.R.color.system_accent1_600), nVar.a(context, android.R.color.system_accent1_700), nVar.a(context, android.R.color.system_accent1_800), nVar.a(context, android.R.color.system_accent1_900), nVar.a(context, android.R.color.system_accent1_1000), nVar.a(context, android.R.color.system_accent2_0), nVar.a(context, android.R.color.system_accent2_10), nVar.a(context, android.R.color.system_accent2_50), nVar.a(context, android.R.color.system_accent2_100), nVar.a(context, android.R.color.system_accent2_200), nVar.a(context, android.R.color.system_accent2_300), nVar.a(context, android.R.color.system_accent2_400), nVar.a(context, android.R.color.system_accent2_500), nVar.a(context, android.R.color.system_accent2_600), nVar.a(context, android.R.color.system_accent2_700), nVar.a(context, android.R.color.system_accent2_800), nVar.a(context, android.R.color.system_accent2_900), nVar.a(context, android.R.color.system_accent2_1000), nVar.a(context, android.R.color.system_accent3_0), nVar.a(context, android.R.color.system_accent3_10), nVar.a(context, android.R.color.system_accent3_50), nVar.a(context, android.R.color.system_accent3_100), nVar.a(context, android.R.color.system_accent3_200), nVar.a(context, android.R.color.system_accent3_300), nVar.a(context, android.R.color.system_accent3_400), nVar.a(context, android.R.color.system_accent3_500), nVar.a(context, android.R.color.system_accent3_600), nVar.a(context, android.R.color.system_accent3_700), nVar.a(context, android.R.color.system_accent3_800), nVar.a(context, android.R.color.system_accent3_900), nVar.a(context, android.R.color.system_accent3_1000), null);
    }
}
