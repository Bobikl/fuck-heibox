package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: PlatformTypefaces.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/t0;", "", "Landroidx/compose/ui/text/font/k0;", com.google.android.exoplayer2.text.ttml.d.L, "Landroidx/compose/ui/text/font/g0;", com.google.android.exoplayer2.text.ttml.d.I, "Landroid/graphics/Typeface;", "b", "(Landroidx/compose/ui/text/font/k0;I)Landroid/graphics/Typeface;", "Landroidx/compose/ui/text/font/m0;", "name", ak.av, "(Landroidx/compose/ui/text/font/m0;Landroidx/compose/ui/text/font/k0;I)Landroid/graphics/Typeface;", "", "familyName", "weight", "style", "Landroidx/compose/ui/text/font/j0$e;", "variationSettings", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, ak.aF, "(Ljava/lang/String;Landroidx/compose/ui/text/font/k0;ILandroidx/compose/ui/text/font/j0$e;Landroid/content/Context;)Landroid/graphics/Typeface;", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public interface t0 {
    @dl.d
    Typeface a(@dl.d m0 name, @dl.d FontWeight fontWeight, int fontStyle);

    @dl.d
    Typeface b(@dl.d FontWeight fontWeight, int fontStyle);

    @dl.e
    Typeface c(@dl.d String familyName, @dl.d FontWeight weight, int style, @dl.d j0.e variationSettings, @dl.d Context context);
}
