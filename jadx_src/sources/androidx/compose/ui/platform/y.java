package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.ui.text.font.ResourceFont;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidFontResourceLoader.android.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.k(message = "Replaced with PlatformFontLoader during the introduction of async fonts, all usages should be replaced", replaceWith = @kotlin.s0(expression = "PlatformFontLoader", imports = {}))
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/platform/y;", "Landroidx/compose/ui/text/font/u$b;", "Landroidx/compose/ui/text/font/u;", UiKitSpanObj.TYPE_FONT, "Landroid/graphics/Typeface;", "b", "Landroid/content/Context;", ak.av, "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "<init>", "(Landroid/content/Context;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class y implements androidx.compose.ui.text.font.u.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Context context;

    public y(@dl.d Context context) {
        kotlin.jvm.internal.f0.p(context, "context");
        this.context = context;
    }

    @Override // androidx.compose.ui.text.font.u.b
    @dl.d
    @kotlin.k(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @kotlin.s0(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Typeface a(@dl.d androidx.compose.ui.text.font.u font) {
        kotlin.jvm.internal.f0.p(font, "font");
        if (!(font instanceof ResourceFont)) {
            throw new IllegalArgumentException("Unknown font type: " + font);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return a0.f15810a.a(this.context, ((ResourceFont) font).getResId());
        }
        Typeface typefaceJ = androidx.core.content.res.i.j(this.context, ((ResourceFont) font).getResId());
        kotlin.jvm.internal.f0.m(typefaceJ);
        kotlin.jvm.internal.f0.o(typefaceJ, "{\n                    Re…esId)!!\n                }");
        return typefaceJ;
    }
}
