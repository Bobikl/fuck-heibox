package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Typeface;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidFontResourceLoader.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(26)
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/a0;", "", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "", "resourceId", "Landroid/graphics/Typeface;", ak.av, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a0 f15810a = new a0();

    private a0() {
    }

    @androidx.annotation.u
    @dl.d
    @androidx.annotation.w0(26)
    public final Typeface a(@dl.d Context context, int resourceId) {
        kotlin.jvm.internal.f0.p(context, "context");
        Typeface font = context.getResources().getFont(resourceId);
        kotlin.jvm.internal.f0.o(font, "context.resources.getFont(resourceId)");
        return font;
    }
}
