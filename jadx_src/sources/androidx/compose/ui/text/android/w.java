package androidx.compose.ui.text.android;

import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: StaticLayoutFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(33)
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0007¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/android/w;", "", "Landroid/text/StaticLayout;", com.google.android.exoplayer2.text.ttml.d.f49813w, "", ak.av, "Landroid/text/StaticLayout$Builder;", "builder", "", "lineBreakStyle", "lineBreakWordStyle", "Lkotlin/b2;", "b", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final w f16355a = new w();

    private w() {
    }

    @androidx.annotation.u
    @xh.m
    public static final boolean a(@dl.d StaticLayout layout) {
        kotlin.jvm.internal.f0.p(layout, "layout");
        return layout.isFallbackLineSpacingEnabled();
    }

    @androidx.annotation.u
    @xh.m
    public static final void b(@dl.d StaticLayout.Builder builder, int i10, int i11) {
        kotlin.jvm.internal.f0.p(builder, "builder");
        LineBreakConfig lineBreakConfigBuild = new LineBreakConfig.Builder().setLineBreakStyle(i10).setLineBreakWordStyle(i11).build();
        kotlin.jvm.internal.f0.o(lineBreakConfigBuild, "Builder()\n              …\n                .build()");
        builder.setLineBreakConfig(lineBreakConfigBuild);
    }
}
