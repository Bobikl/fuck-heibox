package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.a0;
import androidx.constraintlayout.core.motion.utils.w;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AndroidStringDelegate.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/platform/j;", "Landroidx/compose/ui/text/a0;", "", w.b.f17895e, "Lp1/g;", "locale", "b", ak.av, "d", ak.aF, "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class j implements a0 {
    @Override // androidx.compose.ui.text.a0
    @dl.d
    public String a(@dl.d String string, @dl.d p1.g locale) {
        f0.p(string, "string");
        f0.p(locale, "locale");
        String lowerCase = string.toLowerCase(((p1.a) locale).getF138134a());
        f0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @Override // androidx.compose.ui.text.a0
    @dl.d
    public String b(@dl.d String string, @dl.d p1.g locale) {
        f0.p(string, "string");
        f0.p(locale, "locale");
        String upperCase = string.toUpperCase(((p1.a) locale).getF138134a());
        f0.o(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    @Override // androidx.compose.ui.text.a0
    @dl.d
    public String c(@dl.d String string, @dl.d p1.g locale) {
        f0.p(string, "string");
        f0.p(locale, "locale");
        if (!(string.length() > 0)) {
            return string;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) kotlin.text.b.t(string.charAt(0), ((p1.a) locale).getF138134a()));
        String strSubstring = string.substring(1);
        f0.o(strSubstring, "this as java.lang.String).substring(startIndex)");
        sb2.append(strSubstring);
        return sb2.toString();
    }

    @Override // androidx.compose.ui.text.a0
    @dl.d
    public String d(@dl.d String string, @dl.d p1.g locale) {
        f0.p(string, "string");
        f0.p(locale, "locale");
        if (!(string.length() > 0)) {
            return string;
        }
        StringBuilder sb2 = new StringBuilder();
        char cCharAt = string.charAt(0);
        sb2.append((Object) (Character.isLowerCase(cCharAt) ? kotlin.text.b.v(cCharAt, ((p1.a) locale).getF138134a()) : String.valueOf(cCharAt)));
        String strSubstring = string.substring(1);
        f0.o(strSubstring, "this as java.lang.String).substring(startIndex)");
        sb2.append(strSubstring);
        return sb2.toString();
    }
}
