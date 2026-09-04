package androidx.core.text;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.UnderlineSpan;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: SpannableStringBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@t0({"SMAP\nSpannableStringBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableStringBuilder.kt\nandroidx/core/text/SpannableStringBuilderKt\n*L\n1#1,163:1\n74#1,4:164\n74#1,4:168\n74#1,4:172\n74#1,4:176\n74#1,4:180\n74#1,4:184\n74#1,4:188\n74#1,4:192\n74#1,4:196\n*S KotlinDebug\n*F\n+ 1 SpannableStringBuilder.kt\nandroidx/core/text/SpannableStringBuilderKt\n*L\n87#1:164,4\n96#1:168,4\n105#1:172,4\n115#1:176,4\n125#1:180,4\n134#1:184,4\n144#1:188,4\n153#1:192,4\n162#1:196,4\n*E\n"})
public final class m {
    @dl.d
    public static final SpannableStringBuilder a(@dl.d SpannableStringBuilder spannableStringBuilder, @androidx.annotation.l int i10, @dl.d yh.l<? super SpannableStringBuilder, b2> builderAction) {
        f0.p(spannableStringBuilder, "<this>");
        f0.p(builderAction, "builderAction");
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(i10);
        int length = spannableStringBuilder.length();
        builderAction.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(backgroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @dl.d
    public static final SpannableStringBuilder b(@dl.d SpannableStringBuilder spannableStringBuilder, @dl.d yh.l<? super SpannableStringBuilder, b2> builderAction) {
        f0.p(spannableStringBuilder, "<this>");
        f0.p(builderAction, "builderAction");
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        builderAction.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @dl.d
    public static final SpannedString c(@dl.d yh.l<? super SpannableStringBuilder, b2> builderAction) {
        f0.p(builderAction, "builderAction");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        builderAction.invoke(spannableStringBuilder);
        return new SpannedString(spannableStringBuilder);
    }

    @dl.d
    public static final SpannableStringBuilder d(@dl.d SpannableStringBuilder spannableStringBuilder, @androidx.annotation.l int i10, @dl.d yh.l<? super SpannableStringBuilder, b2> builderAction) {
        f0.p(spannableStringBuilder, "<this>");
        f0.p(builderAction, "builderAction");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i10);
        int length = spannableStringBuilder.length();
        builderAction.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @dl.d
    public static final SpannableStringBuilder e(@dl.d SpannableStringBuilder spannableStringBuilder, @dl.d Object span, @dl.d yh.l<? super SpannableStringBuilder, b2> builderAction) {
        f0.p(spannableStringBuilder, "<this>");
        f0.p(span, "span");
        f0.p(builderAction, "builderAction");
        int length = spannableStringBuilder.length();
        builderAction.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(span, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @dl.d
    public static final SpannableStringBuilder f(@dl.d SpannableStringBuilder spannableStringBuilder, @dl.d Object[] spans, @dl.d yh.l<? super SpannableStringBuilder, b2> builderAction) {
        f0.p(spannableStringBuilder, "<this>");
        f0.p(spans, "spans");
        f0.p(builderAction, "builderAction");
        int length = spannableStringBuilder.length();
        builderAction.invoke(spannableStringBuilder);
        for (Object obj : spans) {
            spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        }
        return spannableStringBuilder;
    }

    @dl.d
    public static final SpannableStringBuilder g(@dl.d SpannableStringBuilder spannableStringBuilder, @dl.d yh.l<? super SpannableStringBuilder, b2> builderAction) {
        f0.p(spannableStringBuilder, "<this>");
        f0.p(builderAction, "builderAction");
        StyleSpan styleSpan = new StyleSpan(2);
        int length = spannableStringBuilder.length();
        builderAction.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @dl.d
    public static final SpannableStringBuilder h(@dl.d SpannableStringBuilder spannableStringBuilder, float f10, @dl.d yh.l<? super SpannableStringBuilder, b2> builderAction) {
        f0.p(spannableStringBuilder, "<this>");
        f0.p(builderAction, "builderAction");
        RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(f10);
        int length = spannableStringBuilder.length();
        builderAction.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(relativeSizeSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @dl.d
    public static final SpannableStringBuilder i(@dl.d SpannableStringBuilder spannableStringBuilder, @dl.d yh.l<? super SpannableStringBuilder, b2> builderAction) {
        f0.p(spannableStringBuilder, "<this>");
        f0.p(builderAction, "builderAction");
        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
        int length = spannableStringBuilder.length();
        builderAction.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(strikethroughSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @dl.d
    public static final SpannableStringBuilder j(@dl.d SpannableStringBuilder spannableStringBuilder, @dl.d yh.l<? super SpannableStringBuilder, b2> builderAction) {
        f0.p(spannableStringBuilder, "<this>");
        f0.p(builderAction, "builderAction");
        SubscriptSpan subscriptSpan = new SubscriptSpan();
        int length = spannableStringBuilder.length();
        builderAction.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(subscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @dl.d
    public static final SpannableStringBuilder k(@dl.d SpannableStringBuilder spannableStringBuilder, @dl.d yh.l<? super SpannableStringBuilder, b2> builderAction) {
        f0.p(spannableStringBuilder, "<this>");
        f0.p(builderAction, "builderAction");
        SuperscriptSpan superscriptSpan = new SuperscriptSpan();
        int length = spannableStringBuilder.length();
        builderAction.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(superscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @dl.d
    public static final SpannableStringBuilder l(@dl.d SpannableStringBuilder spannableStringBuilder, @dl.d yh.l<? super SpannableStringBuilder, b2> builderAction) {
        f0.p(spannableStringBuilder, "<this>");
        f0.p(builderAction, "builderAction");
        UnderlineSpan underlineSpan = new UnderlineSpan();
        int length = spannableStringBuilder.length();
        builderAction.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(underlineSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
}
