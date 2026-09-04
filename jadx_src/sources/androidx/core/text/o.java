package androidx.core.text;

import android.text.Spanned;
import android.text.SpannedString;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SpannedString.kt */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public static final /* synthetic */ <T> T[] a(Spanned spanned, int i10, int i11) {
        f0.p(spanned, "<this>");
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        T[] tArr = (T[]) spanned.getSpans(i10, i11, Object.class);
        f0.o(tArr, "getSpans(start, end, T::class.java)");
        return tArr;
    }

    public static /* synthetic */ Object[] b(Spanned spanned, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = spanned.length();
        }
        f0.p(spanned, "<this>");
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        Object[] spans = spanned.getSpans(i10, i11, Object.class);
        f0.o(spans, "getSpans(start, end, T::class.java)");
        return spans;
    }

    @dl.d
    public static final Spanned c(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        SpannedString spannedStringValueOf = SpannedString.valueOf(charSequence);
        f0.o(spannedStringValueOf, "valueOf(this)");
        return spannedStringValueOf;
    }
}
