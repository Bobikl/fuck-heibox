package androidx.compose.ui.text;

import com.lzy.okgo.model.Progress;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidTextStyle.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001c\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u001e\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b\u001a\u001e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b\"\u0014\u0010\u000e\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/z;", "spanStyle", "Landroidx/compose/ui/text/y;", "paragraphStyle", "Landroidx/compose/ui/text/b0;", ak.av, com.google.android.exoplayer2.text.ttml.d.f49798o0, "stop", "", Progress.G, "b", ak.aF, "", "Z", "DefaultIncludeFontPadding", "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f16365a = true;

    @dl.d
    public static final PlatformTextStyle a(@dl.e z zVar, @dl.e PlatformParagraphStyle platformParagraphStyle) {
        return new PlatformTextStyle(zVar, platformParagraphStyle);
    }

    @dl.d
    public static final PlatformParagraphStyle b(@dl.d PlatformParagraphStyle start, @dl.d PlatformParagraphStyle stop, float f10) {
        kotlin.jvm.internal.f0.p(start, "start");
        kotlin.jvm.internal.f0.p(stop, "stop");
        return start.getIncludeFontPadding() == stop.getIncludeFontPadding() ? start : new PlatformParagraphStyle(((Boolean) SpanStyleKt.c(Boolean.valueOf(start.getIncludeFontPadding()), Boolean.valueOf(stop.getIncludeFontPadding()), f10)).booleanValue());
    }

    @dl.d
    public static final z c(@dl.d z start, @dl.d z stop, float f10) {
        kotlin.jvm.internal.f0.p(start, "start");
        kotlin.jvm.internal.f0.p(stop, "stop");
        return start;
    }
}
