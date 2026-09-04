package androidx.core.text;

import android.text.TextUtils;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: String.kt */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    @dl.d
    public static final String a(@dl.d String str) {
        f0.p(str, "<this>");
        String strHtmlEncode = TextUtils.htmlEncode(str);
        f0.o(strHtmlEncode, "htmlEncode(this)");
        return strHtmlEncode;
    }
}
