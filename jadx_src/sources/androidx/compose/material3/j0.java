package androidx.compose.material3;

import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: IncludeFontPaddingHelper.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/q0;", "style", "", "includeFontPadding", ak.av, "material3_release"}, k = 2, mv = {1, 7, 1})
public final class j0 {
    @dl.d
    public static final TextStyle a(@dl.d TextStyle style, boolean z10) {
        kotlin.jvm.internal.f0.p(style, "style");
        return style.d((786431 & 1) != 0 ? style.spanStyle.m() : 0L, (786431 & 2) != 0 ? style.spanStyle.getFontSize() : 0L, (786431 & 4) != 0 ? style.spanStyle.getFontWeight() : null, (786431 & 8) != 0 ? style.spanStyle.getFontStyle() : null, (786431 & 16) != 0 ? style.spanStyle.getFontSynthesis() : null, (786431 & 32) != 0 ? style.spanStyle.getFontFamily() : null, (786431 & 64) != 0 ? style.spanStyle.getFontFeatureSettings() : null, (786431 & 128) != 0 ? style.spanStyle.getLetterSpacing() : 0L, (786431 & 256) != 0 ? style.spanStyle.getBaselineShift() : null, (786431 & 512) != 0 ? style.spanStyle.getTextGeometricTransform() : null, (786431 & 1024) != 0 ? style.spanStyle.getLocaleList() : null, (786431 & 2048) != 0 ? style.spanStyle.getBackground() : 0L, (786431 & 4096) != 0 ? style.spanStyle.getTextDecoration() : null, (786431 & 8192) != 0 ? style.spanStyle.getShadow() : null, (786431 & 16384) != 0 ? style.paragraphStyle.getTextAlign() : null, (786431 & 32768) != 0 ? style.paragraphStyle.getTextDirection() : null, (786431 & 65536) != 0 ? style.paragraphStyle.getLineHeight() : 0L, (786431 & 131072) != 0 ? style.paragraphStyle.getTextIndent() : null, (786431 & 262144) != 0 ? style.platformStyle : new PlatformTextStyle(z10), (786431 & 524288) != 0 ? style.paragraphStyle.getLineHeightStyle() : null);
    }
}
