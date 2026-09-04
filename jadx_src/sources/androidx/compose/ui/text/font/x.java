package androidx.compose.ui.text.font;

import androidx.compose.runtime.j2;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: FontFamily.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007\u001a#\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0005\"\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\u000b"}, d2 = {"", "Landroidx/compose/ui/text/font/u;", "fonts", "Landroidx/compose/ui/text/font/v;", "b", "", ak.aF, "([Landroidx/compose/ui/text/font/u;)Landroidx/compose/ui/text/font/v;", "Landroidx/compose/ui/text/font/a1;", "typeface", ak.av, "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class x {
    @j2
    @dl.d
    public static final v a(@dl.d a1 typeface) {
        kotlin.jvm.internal.f0.p(typeface, "typeface");
        return new LoadedFontFamily(typeface);
    }

    @j2
    @dl.d
    public static final v b(@dl.d List<? extends u> fonts) {
        kotlin.jvm.internal.f0.p(fonts, "fonts");
        return new FontListFontFamily(fonts);
    }

    @j2
    @dl.d
    public static final v c(@dl.d u... fonts) {
        kotlin.jvm.internal.f0.p(fonts, "fonts");
        return new FontListFontFamily(kotlin.collections.m.t(fonts));
    }
}
