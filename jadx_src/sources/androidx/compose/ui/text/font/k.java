package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;

/* JADX INFO: compiled from: AndroidTypeface.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0018\u00010\u0004H\u0007ø\u0001\u0000\u001a\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b\u001a\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Landroidx/compose/ui/text/font/v;", com.google.android.exoplayer2.text.ttml.d.K, "", "Lkotlin/Pair;", "Landroidx/compose/ui/text/font/k0;", "Landroidx/compose/ui/text/font/g0;", "styles", "Landroidx/compose/ui/text/font/a1;", "b", "Landroid/graphics/Typeface;", "typeface", ak.aF, ak.av, "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class k {
    @dl.d
    public static final v a(@dl.d Typeface typeface) {
        kotlin.jvm.internal.f0.p(typeface, "typeface");
        return x.a(c(typeface));
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.WARNING, message = "This API is deprecated with the introduction of async fonts which cannot resolve in this context. To preload fonts, use FontFamily.Resolver.", replaceWith = @kotlin.s0(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    public static final a1 b(@dl.d Context context, @dl.d v fontFamily, @dl.e List<Pair<FontWeight, g0>> list) {
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(fontFamily, "fontFamily");
        if (fontFamily instanceof FontListFontFamily) {
            return new androidx.compose.ui.text.platform.c((FontListFontFamily) fontFamily, context, list, null, 8, null);
        }
        if (fontFamily instanceof m0) {
            return new androidx.compose.ui.text.platform.d((m0) fontFamily);
        }
        if (fontFamily instanceof l) {
            return new androidx.compose.ui.text.platform.b();
        }
        if (fontFamily instanceof LoadedFontFamily) {
            return ((LoadedFontFamily) fontFamily).getTypeface();
        }
        throw new NoWhenBranchMatchedException();
    }

    @dl.d
    public static final a1 c(@dl.d Typeface typeface) {
        kotlin.jvm.internal.f0.p(typeface, "typeface");
        return new androidx.compose.ui.text.platform.p(typeface);
    }

    public static /* synthetic */ a1 d(Context context, v vVar, List list, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = null;
        }
        return b(context, vVar, list);
    }
}
