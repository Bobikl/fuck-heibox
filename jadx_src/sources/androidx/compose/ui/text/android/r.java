package androidx.compose.ui.text.android;

import android.os.Build;
import android.text.StaticLayout;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: StaticLayoutFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(23)
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0017¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/android/r;", "Landroidx/compose/ui/text/android/z;", "Landroidx/compose/ui/text/android/b0;", "params", "Landroid/text/StaticLayout;", ak.av, com.google.android.exoplayer2.text.ttml.d.f49813w, "", "useFallbackLineSpacing", "b", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class r implements z {
    @Override // androidx.compose.ui.text.android.z
    @androidx.annotation.u
    @dl.d
    public StaticLayout a(@dl.d b0 params) {
        kotlin.jvm.internal.f0.p(params, "params");
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(params.getText(), params.getCom.google.android.exoplayer2.text.ttml.d.o0 java.lang.String(), params.getEnd(), params.getPaint(), params.getWidth());
        builderObtain.setTextDirection(params.getTextDir());
        builderObtain.setAlignment(params.getAlignment());
        builderObtain.setMaxLines(params.getMaxLines());
        builderObtain.setEllipsize(params.getEllipsize());
        builderObtain.setEllipsizedWidth(params.getEllipsizedWidth());
        builderObtain.setLineSpacing(params.getLineSpacingExtra(), params.getLineSpacingMultiplier());
        builderObtain.setIncludePad(params.getIncludePadding());
        builderObtain.setBreakStrategy(params.getBreakStrategy());
        builderObtain.setHyphenationFrequency(params.getHyphenationFrequency());
        builderObtain.setIndents(params.getLeftIndents(), params.getRightIndents());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            kotlin.jvm.internal.f0.o(builderObtain, "this");
            t.a(builderObtain, params.getJustificationMode());
        }
        if (i10 >= 28) {
            kotlin.jvm.internal.f0.o(builderObtain, "this");
            v.a(builderObtain, params.getUseFallbackLineSpacing());
        }
        if (i10 >= 33) {
            kotlin.jvm.internal.f0.o(builderObtain, "this");
            w.b(builderObtain, params.getLineBreakStyle(), params.getLineBreakWordStyle());
        }
        StaticLayout staticLayoutBuild = builderObtain.build();
        kotlin.jvm.internal.f0.o(staticLayoutBuild, "obtain(params.text, para…  }\n            }.build()");
        return staticLayoutBuild;
    }

    @Override // androidx.compose.ui.text.android.z
    @androidx.annotation.r0(markerClass = {androidx.core.os.a.b.class})
    public boolean b(@dl.d StaticLayout layout, boolean useFallbackLineSpacing) {
        kotlin.jvm.internal.f0.p(layout, "layout");
        if (androidx.core.os.a.k()) {
            return w.a(layout);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return useFallbackLineSpacing;
        }
        return false;
    }
}
