package androidx.core.text;

import android.text.Html;
import android.text.Spanned;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Html.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    @dl.d
    public static final Spanned a(@dl.d String str, int i10, @dl.e Html.ImageGetter imageGetter, @dl.e Html.TagHandler tagHandler) {
        f0.p(str, "<this>");
        Spanned spannedB = f.b(str, i10, imageGetter, tagHandler);
        f0.o(spannedB, "fromHtml(this, flags, imageGetter, tagHandler)");
        return spannedB;
    }

    public static /* synthetic */ Spanned b(String str, int i10, Html.ImageGetter imageGetter, Html.TagHandler tagHandler, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            imageGetter = null;
        }
        if ((i11 & 4) != 0) {
            tagHandler = null;
        }
        f0.p(str, "<this>");
        Spanned spannedB = f.b(str, i10, imageGetter, tagHandler);
        f0.o(spannedB, "fromHtml(this, flags, imageGetter, tagHandler)");
        return spannedB;
    }

    @dl.d
    public static final String c(@dl.d Spanned spanned, int i10) {
        f0.p(spanned, "<this>");
        String strC = f.c(spanned, i10);
        f0.o(strC, "toHtml(this, option)");
        return strC;
    }

    public static /* synthetic */ String d(Spanned spanned, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        f0.p(spanned, "<this>");
        String strC = f.c(spanned, i10);
        f0.o(strC, "toHtml(this, option)");
        return strC;
    }
}
