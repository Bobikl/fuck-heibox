package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.text.style.TypefaceSpan;
import androidx.annotation.u;
import androidx.annotation.w0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AndroidAccessibilitySpannableString.android.kt */
/* JADX INFO: loaded from: classes.dex */
@w0(28)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/platform/q;", "", "Landroid/graphics/Typeface;", "typeface", "Landroid/text/style/TypefaceSpan;", ak.av, "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final q f16872a = new q();

    private q() {
    }

    @u
    @dl.d
    public final TypefaceSpan a(@dl.d Typeface typeface) {
        f0.p(typeface, "typeface");
        return new TypefaceSpan(typeface);
    }
}
