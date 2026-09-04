package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: PlatformTypefaces.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(26)
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0003J$\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0007R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceCompatApi26;", "", "Landroidx/compose/ui/text/font/j0$e;", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "", "b", "Landroid/graphics/Typeface;", "typeface", "variationSettings", ak.av, "Ljava/lang/ThreadLocal;", "Landroid/graphics/Paint;", "Ljava/lang/ThreadLocal;", "threadLocalPaint", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class TypefaceCompatApi26 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final TypefaceCompatApi26 f16512a = new TypefaceCompatApi26();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static ThreadLocal<Paint> threadLocalPaint = new ThreadLocal<>();

    private TypefaceCompatApi26() {
    }

    @androidx.compose.ui.text.g
    private final String b(j0.e eVar, Context context) {
        final s1.e eVarA = s1.a.a(context);
        return androidx.compose.ui.text.f0.l(eVar.b(), null, null, null, 0, null, new yh.l<j0.a, CharSequence>() { // from class: androidx.compose.ui.text.font.TypefaceCompatApi26$toAndroidString$1
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(@dl.d j0.a setting) {
                kotlin.jvm.internal.f0.p(setting, "setting");
                return '\'' + setting.getAxisName() + "' " + setting.c(eVarA);
            }
        }, 31, null);
    }

    @dl.e
    @androidx.compose.ui.text.g
    public final Typeface a(@dl.e Typeface typeface, @dl.d j0.e variationSettings, @dl.d Context context) {
        kotlin.jvm.internal.f0.p(variationSettings, "variationSettings");
        kotlin.jvm.internal.f0.p(context, "context");
        if (typeface == null) {
            return null;
        }
        if (variationSettings.b().isEmpty()) {
            return typeface;
        }
        Paint paint = threadLocalPaint.get();
        if (paint == null) {
            paint = new Paint();
            threadLocalPaint.set(paint);
        }
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(b(variationSettings, context));
        return paint.getTypeface();
    }
}
