package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidFontLoader.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(26)
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/font/y0;", "", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Landroidx/compose/ui/text/font/x0;", UiKitSpanObj.TYPE_FONT, "Landroid/graphics/Typeface;", ak.av, "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final y0 f16637a = new y0();

    private y0() {
    }

    @androidx.annotation.u
    @dl.d
    public final Typeface a(@dl.d Context context, @dl.d ResourceFont font) {
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(font, "font");
        Typeface font2 = context.getResources().getFont(font.getResId());
        kotlin.jvm.internal.f0.o(font2, "context.resources.getFont(font.resId)");
        return font2;
    }
}
