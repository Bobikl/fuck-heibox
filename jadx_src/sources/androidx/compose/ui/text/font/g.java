package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidFontResolveInterceptor.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¨\u0006\u0004"}, d2 = {"Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Landroidx/compose/ui/text/font/f;", ak.av, "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class g {
    @dl.d
    public static final AndroidFontResolveInterceptor a(@dl.d Context context) {
        kotlin.jvm.internal.f0.p(context, "context");
        return new AndroidFontResolveInterceptor(Build.VERSION.SDK_INT >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0);
    }
}
