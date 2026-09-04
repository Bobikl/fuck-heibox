package androidx.compose.ui.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.LineBreak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidParagraph.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u001a\u001f\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\u001f\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0014\u0010\u0016\u001a\u00020\u0002*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0002\u001a\u0018\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u001a\f\u0010\u001d\u001a\u00020\u001c*\u00020\u001cH\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/text/style/h;", "align", "", "l", "(Landroidx/compose/ui/text/style/h;)I", "Landroidx/compose/ui/text/style/e;", "hyphens", "n", "Landroidx/compose/ui/text/style/f$b;", "breakStrategy", "m", "(Landroidx/compose/ui/text/style/f$b;)I", "Landroidx/compose/ui/text/style/f$c;", "lineBreakStrictness", "o", "(Landroidx/compose/ui/text/style/f$c;)I", "Landroidx/compose/ui/text/style/f$d;", "lineBreakWordStyle", "p", "(Landroidx/compose/ui/text/style/f$d;)I", "Landroidx/compose/ui/text/android/TextLayout;", "maxHeight", "j", "Landroidx/compose/ui/text/q0;", "textStyle", "", "ellipsis", "k", "", "i", "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence i(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
        SpannableExtensions_androidKt.r(spannableString, new n1.c(), spannableString.length() - 1, spannableString.length() - 1);
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(TextLayout textLayout, int i10) {
        int lineCount = textLayout.getLineCount();
        for (int i11 = 0; i11 < lineCount; i11++) {
            if (textLayout.p(i11) > i10) {
                return i11;
            }
        }
        return textLayout.getLineCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(TextStyle textStyle, boolean z10) {
        if (!z10 || s1.u.j(textStyle.y(), s1.v.m(0)) || s1.u.j(textStyle.y(), s1.u.f139249b.b()) || textStyle.I() == null) {
            return false;
        }
        androidx.compose.ui.text.style.h hVarI = textStyle.I();
        androidx.compose.ui.text.style.h.Companion companion = androidx.compose.ui.text.style.h.INSTANCE;
        if (hVarI == null ? false : androidx.compose.ui.text.style.h.j(hVarI.getValue(), companion.f())) {
            return false;
        }
        androidx.compose.ui.text.style.h hVarI2 = textStyle.I();
        return !(hVarI2 == null ? false : androidx.compose.ui.text.style.h.j(hVarI2.getValue(), companion.c()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(androidx.compose.ui.text.style.h hVar) {
        androidx.compose.ui.text.style.h.Companion companion = androidx.compose.ui.text.style.h.INSTANCE;
        if (hVar == null ? false : androidx.compose.ui.text.style.h.j(hVar.getValue(), companion.d())) {
            return 3;
        }
        if (hVar == null ? false : androidx.compose.ui.text.style.h.j(hVar.getValue(), companion.e())) {
            return 4;
        }
        if (hVar == null ? false : androidx.compose.ui.text.style.h.j(hVar.getValue(), companion.a())) {
            return 2;
        }
        if (hVar == null ? false : androidx.compose.ui.text.style.h.j(hVar.getValue(), companion.f())) {
            return 0;
        }
        return hVar == null ? false : androidx.compose.ui.text.style.h.j(hVar.getValue(), companion.b()) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m(LineBreak.b bVar) {
        LineBreak.b.Companion companion = LineBreak.b.INSTANCE;
        if (bVar == null ? false : LineBreak.b.g(bVar.getValue(), companion.c())) {
            return 0;
        }
        if (bVar == null ? false : LineBreak.b.g(bVar.getValue(), companion.b())) {
            return 1;
        }
        return bVar == null ? false : LineBreak.b.g(bVar.getValue(), companion.a()) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int n(androidx.compose.ui.text.style.e eVar) {
        androidx.compose.ui.text.style.e.Companion companion = androidx.compose.ui.text.style.e.INSTANCE;
        if (kotlin.jvm.internal.f0.g(eVar, companion.a())) {
            return Build.VERSION.SDK_INT <= 32 ? 1 : 3;
        }
        kotlin.jvm.internal.f0.g(eVar, companion.b());
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(LineBreak.c cVar) {
        LineBreak.c.Companion companion = LineBreak.c.INSTANCE;
        if (cVar == null ? false : LineBreak.c.h(cVar.getValue(), companion.a())) {
            return 0;
        }
        if (cVar == null ? false : LineBreak.c.h(cVar.getValue(), companion.b())) {
            return 1;
        }
        if (cVar == null ? false : LineBreak.c.h(cVar.getValue(), companion.c())) {
            return 2;
        }
        return cVar == null ? false : LineBreak.c.h(cVar.getValue(), companion.d()) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(LineBreak.d dVar) {
        LineBreak.d.Companion companion = LineBreak.d.INSTANCE;
        if (dVar == null ? false : LineBreak.d.f(dVar.getValue(), companion.a())) {
            return 0;
        }
        return dVar == null ? false : LineBreak.d.f(dVar.getValue(), companion.b()) ? 1 : 0;
    }
}
