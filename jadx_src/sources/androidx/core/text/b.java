package androidx.core.text;

import android.text.TextUtils;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CharSequence.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final boolean a(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        return TextUtils.isDigitsOnly(charSequence);
    }

    public static final int b(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        return TextUtils.getTrimmedLength(charSequence);
    }
}
