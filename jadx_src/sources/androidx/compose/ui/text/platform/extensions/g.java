package androidx.compose.ui.text.platform.extensions;

import android.text.style.URLSpan;
import androidx.compose.ui.text.UrlAnnotation;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: UrlAnnotationExtensions.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/t0;", "Landroid/text/style/URLSpan;", ak.av, "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class g {
    @dl.d
    @androidx.compose.ui.text.g
    public static final URLSpan a(@dl.d UrlAnnotation urlAnnotation) {
        f0.p(urlAnnotation, "<this>");
        return new URLSpan(urlAnnotation.getUrl());
    }
}
