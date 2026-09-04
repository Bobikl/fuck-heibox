package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
import androidx.collection.z0;
import androidx.compose.ui.text.font.ResourceFont;
import androidx.compose.ui.text.font.u;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AndroidFontListTypeface.android.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.k(message = "Duplicate cache")
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/platform/o;", "", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Landroidx/compose/ui/text/font/u;", UiKitSpanObj.TYPE_FONT, "Landroid/graphics/Typeface;", "b", "", ak.av, "Landroidx/collection/z0;", "Landroidx/collection/z0;", "cache", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final o f16868a = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final z0<String, Typeface> cache = new z0<>(16);

    private o() {
    }

    @dl.e
    public final String a(@dl.d Context context, @dl.d u font) {
        f0.p(context, "context");
        f0.p(font, "font");
        if (!(font instanceof ResourceFont)) {
            if (font instanceof androidx.compose.ui.text.font.i) {
                return ((androidx.compose.ui.text.font.i) font).getCacheKey();
            }
            throw new IllegalArgumentException("Unknown font type: " + font);
        }
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(((ResourceFont) font).getResId(), typedValue, true);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("res:");
        CharSequence charSequence = typedValue.string;
        String string = charSequence != null ? charSequence.toString() : null;
        f0.m(string);
        sb2.append(string);
        return sb2.toString();
    }

    @dl.d
    public final Typeface b(@dl.d Context context, @dl.d u font) {
        Typeface typefaceA;
        Typeface it;
        f0.p(context, "context");
        f0.p(font, "font");
        String strA = a(context, font);
        if (strA != null && (it = cache.f(strA)) != null) {
            f0.o(it, "it");
            return it;
        }
        if (font instanceof ResourceFont) {
            if (Build.VERSION.SDK_INT >= 26) {
                typefaceA = i.f16862a.a(context, ((ResourceFont) font).getResId());
            } else {
                typefaceA = androidx.core.content.res.i.j(context, ((ResourceFont) font).getResId());
                f0.m(typefaceA);
                f0.o(typefaceA, "{\n                    Re…esId)!!\n                }");
            }
        } else {
            if (!(font instanceof androidx.compose.ui.text.font.d)) {
                throw new IllegalArgumentException("Unknown font type: " + font);
            }
            androidx.compose.ui.text.font.d dVar = (androidx.compose.ui.text.font.d) font;
            typefaceA = dVar.getTypefaceLoader().a(context, dVar);
        }
        if (typefaceA != null) {
            if (strA != null) {
                cache.j(strA, typefaceA);
            }
            return typefaceA;
        }
        throw new IllegalArgumentException("Unable to load font " + font);
    }
}
