package androidx.compose.ui.text.font;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidFontUtils.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000\"\u0018\u0010\u000e\u001a\u00020\u0000*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/font/k0;", com.google.android.exoplayer2.text.ttml.d.L, "Landroidx/compose/ui/text/font/g0;", com.google.android.exoplayer2.text.ttml.d.I, "", ak.aF, "(Landroidx/compose/ui/text/font/k0;I)I", "", "isBold", "isItalic", "b", "Landroidx/compose/ui/text/font/k0$a;", ak.av, "(Landroidx/compose/ui/text/font/k0$a;)Landroidx/compose/ui/text/font/k0;", "AndroidBold", "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class h {
    @dl.d
    public static final FontWeight a(@dl.d FontWeight.Companion companion) {
        kotlin.jvm.internal.f0.p(companion, "<this>");
        return companion.D();
    }

    public static final int b(boolean z10, boolean z11) {
        if (z11 && z10) {
            return 3;
        }
        if (z10) {
            return 1;
        }
        return z11 ? 2 : 0;
    }

    public static final int c(@dl.d FontWeight fontWeight, int i10) {
        kotlin.jvm.internal.f0.p(fontWeight, "fontWeight");
        return b(fontWeight.compareTo(a(FontWeight.INSTANCE)) >= 0, g0.f(i10, g0.INSTANCE.a()));
    }
}
