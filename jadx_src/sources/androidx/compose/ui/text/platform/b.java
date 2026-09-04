package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.d1;
import androidx.compose.ui.text.font.g0;
import androidx.compose.ui.text.font.v;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AndroidDefaultTypeface.android.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.k(message = "This path for preloading fonts is not supported")
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/platform/b;", "Landroidx/compose/ui/text/platform/n;", "Landroidx/compose/ui/text/font/k0;", com.google.android.exoplayer2.text.ttml.d.L, "Landroidx/compose/ui/text/font/g0;", com.google.android.exoplayer2.text.ttml.d.I, "Landroidx/compose/ui/text/font/h0;", "synthesis", "Landroid/graphics/Typeface;", "b", "(Landroidx/compose/ui/text/font/k0;II)Landroid/graphics/Typeface;", "Landroidx/compose/ui/text/font/v;", ak.av, "Landroidx/compose/ui/text/font/v;", "()Landroidx/compose/ui/text/font/v;", com.google.android.exoplayer2.text.ttml.d.K, "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final v fontFamily = v.INSTANCE.b();

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
        if (Build.VERSION.SDK_INT < 28) {
            Typeface typefaceDefaultFromStyle = Typeface.defaultFromStyle(androidx.compose.ui.text.font.h.c(fontWeight, fontStyle));
            f0.o(typefaceDefaultFromStyle, "{\n            Typeface.d…)\n            )\n        }");
            return typefaceDefaultFromStyle;
        }
        d1 d1Var = d1.f16533a;
        Typeface DEFAULT = Typeface.DEFAULT;
        f0.o(DEFAULT, "DEFAULT");
        return d1Var.a(DEFAULT, fontWeight.w(), g0.f(fontStyle, g0.INSTANCE.a()));
    }
}
