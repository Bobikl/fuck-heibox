package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import androidx.annotation.j1;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: PlatformTypefaces.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0000\u001a \u0010\u0007\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0001\u001a\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/font/t0;", ak.av, "Landroid/graphics/Typeface;", "Landroidx/compose/ui/text/font/j0$e;", "variationSettings", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, ak.aF, "", "name", "Landroidx/compose/ui/text/font/k0;", com.google.android.exoplayer2.text.ttml.d.L, "b", "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class w0 {
    @dl.d
    public static final t0 a() {
        return Build.VERSION.SDK_INT >= 28 ? new u0() : new v0();
    }

    @j1
    @dl.d
    public static final String b(@dl.d String name, @dl.d FontWeight fontWeight) {
        kotlin.jvm.internal.f0.p(name, "name");
        kotlin.jvm.internal.f0.p(fontWeight, "fontWeight");
        int iW = fontWeight.w() / 100;
        if (iW >= 0 && iW < 2) {
            return name + "-thin";
        }
        if (2 <= iW && iW < 4) {
            return name + "-light";
        }
        if (iW == 4) {
            return name;
        }
        if (iW == 5) {
            return name + "-medium";
        }
        if (6 <= iW && iW < 8) {
            return name;
        }
        if (!(8 <= iW && iW < 11)) {
            return name;
        }
        return name + "-black";
    }

    @dl.e
    @androidx.compose.ui.text.g
    public static final Typeface c(@dl.e Typeface typeface, @dl.d j0.e variationSettings, @dl.d Context context) {
        kotlin.jvm.internal.f0.p(variationSettings, "variationSettings");
        kotlin.jvm.internal.f0.p(context, "context");
        return Build.VERSION.SDK_INT >= 26 ? TypefaceCompatApi26.f16512a.a(typeface, variationSettings, context) : typeface;
    }
}
