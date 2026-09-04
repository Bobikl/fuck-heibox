package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.d1;
import androidx.compose.ui.text.font.g0;
import androidx.compose.ui.text.font.m0;
import androidx.compose.ui.text.font.v;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AndroidGenericFontFamilyTypeface.android.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.k(message = "This path for preloading loading fonts is not supported.")
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ-\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/platform/d;", "Landroidx/compose/ui/text/platform/n;", "Landroidx/compose/ui/text/font/k0;", com.google.android.exoplayer2.text.ttml.d.L, "Landroidx/compose/ui/text/font/g0;", com.google.android.exoplayer2.text.ttml.d.I, "Landroid/graphics/Typeface;", "kotlin.jvm.PlatformType", ak.aF, "(Landroidx/compose/ui/text/font/k0;I)Landroid/graphics/Typeface;", "Landroidx/compose/ui/text/font/h0;", "synthesis", "b", "(Landroidx/compose/ui/text/font/k0;II)Landroid/graphics/Typeface;", "Landroidx/compose/ui/text/font/v;", ak.av, "Landroidx/compose/ui/text/font/v;", "()Landroidx/compose/ui/text/font/v;", com.google.android.exoplayer2.text.ttml.d.K, "Landroid/graphics/Typeface;", "nativeTypeface", "Landroidx/compose/ui/text/font/m0;", "<init>", "(Landroidx/compose/ui/text/font/m0;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class d implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final v fontFamily;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Typeface nativeTypeface;

    public d(@dl.d m0 fontFamily) {
        f0.p(fontFamily, "fontFamily");
        this.fontFamily = fontFamily;
        Typeface typefaceCreate = Typeface.create(fontFamily.getName(), 0);
        f0.m(typefaceCreate);
        this.nativeTypeface = typefaceCreate;
    }

    private final Typeface c(FontWeight fontWeight, int fontStyle) {
        return Build.VERSION.SDK_INT < 28 ? Typeface.create(this.nativeTypeface, androidx.compose.ui.text.font.h.c(fontWeight, fontStyle)) : d1.f16533a.a(this.nativeTypeface, fontWeight.w(), g0.f(fontStyle, g0.INSTANCE.a()));
    }

    @Override // androidx.compose.ui.text.font.a1
    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public v getFontFamily() {
        return this.fontFamily;
    }

    @Override // androidx.compose.ui.text.platform.n
    @dl.d
    public Typeface b(@dl.d FontWeight fontWeight, int fontStyle, int synthesis) {
        f0.p(fontWeight, "fontWeight");
        Typeface typefaceC = c(fontWeight, fontStyle);
        f0.o(typefaceC, "buildStyledTypeface(fontWeight, fontStyle)");
        return typefaceC;
    }
}
