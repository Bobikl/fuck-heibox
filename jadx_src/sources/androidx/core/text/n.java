package androidx.core.text;

import android.annotation.SuppressLint;
import android.text.Spannable;
import android.text.SpannableString;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: SpannableString.kt */
/* JADX INFO: loaded from: classes.dex */
@t0({"SMAP\nSpannableString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableString.kt\nandroidx/core/text/SpannableStringKt\n+ 2 SpannedString.kt\nandroidx/core/text/SpannedStringKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,68:1\n31#2,4:69\n13579#3,2:73\n*S KotlinDebug\n*F\n+ 1 SpannableString.kt\nandroidx/core/text/SpannableStringKt\n*L\n34#1:69,4\n34#1:73,2\n*E\n"})
public final class n {
    @SuppressLint({"SyntheticAccessor"})
    public static final void a(@dl.d Spannable spannable) {
        f0.p(spannable, "<this>");
        Object[] spans = spannable.getSpans(0, spannable.length(), Object.class);
        f0.o(spans, "getSpans(start, end, T::class.java)");
        for (Object obj : spans) {
            spannable.removeSpan(obj);
        }
    }

    public static final void b(@dl.d Spannable spannable, int i10, int i11, @dl.d Object span) {
        f0.p(spannable, "<this>");
        f0.p(span, "span");
        spannable.setSpan(span, i10, i11, 17);
    }

    public static final void c(@dl.d Spannable spannable, @dl.d fi.l range, @dl.d Object span) {
        f0.p(spannable, "<this>");
        f0.p(range, "range");
        f0.p(span, "span");
        spannable.setSpan(span, range.D().intValue(), range.e().intValue(), 17);
    }

    @dl.d
    public static final Spannable d(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
        f0.o(spannableStringValueOf, "valueOf(this)");
        return spannableStringValueOf;
    }
}
