package androidx.core.text;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.w0;
import java.util.Locale;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Locale.kt */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ClassVerificationFailure"})
public final class i {
    @w0(17)
    public static final int a(@dl.d Locale locale) {
        f0.p(locale, "<this>");
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
