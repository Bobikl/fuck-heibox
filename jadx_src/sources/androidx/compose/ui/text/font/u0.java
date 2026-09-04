package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.j1;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: PlatformTypefaces.kt */
/* JADX INFO: loaded from: classes.dex */
@j1
@androidx.annotation.w0(28)
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ1\u0010\u000e\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\nJ?\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0015\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/text/font/u0;", "Landroidx/compose/ui/text/font/t0;", "", "familyName", "Landroidx/compose/ui/text/font/k0;", "weight", "Landroidx/compose/ui/text/font/g0;", "style", "Landroid/graphics/Typeface;", "f", "(Ljava/lang/String;Landroidx/compose/ui/text/font/k0;I)Landroid/graphics/Typeface;", "genericFontFamily", com.google.android.exoplayer2.text.ttml.d.L, com.google.android.exoplayer2.text.ttml.d.I, "d", "Landroidx/compose/ui/text/font/j0$e;", "variationSettings", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, ak.aF, "(Ljava/lang/String;Landroidx/compose/ui/text/font/k0;ILandroidx/compose/ui/text/font/j0$e;Landroid/content/Context;)Landroid/graphics/Typeface;", "b", "(Landroidx/compose/ui/text/font/k0;I)Landroid/graphics/Typeface;", "Landroidx/compose/ui/text/font/m0;", "name", ak.av, "(Landroidx/compose/ui/text/font/m0;Landroidx/compose/ui/text/font/k0;I)Landroid/graphics/Typeface;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class u0 implements t0 {
    private final Typeface d(String genericFontFamily, FontWeight fontWeight, int fontStyle) {
        g0.Companion companion = g0.INSTANCE;
        if (g0.f(fontStyle, companion.b()) && kotlin.jvm.internal.f0.g(fontWeight, FontWeight.INSTANCE.m())) {
            if (genericFontFamily == null || genericFontFamily.length() == 0) {
                Typeface DEFAULT = Typeface.DEFAULT;
                kotlin.jvm.internal.f0.o(DEFAULT, "DEFAULT");
                return DEFAULT;
            }
        }
        Typeface typefaceCreate = Typeface.create(genericFontFamily == null ? Typeface.DEFAULT : Typeface.create(genericFontFamily, 0), fontWeight.w(), g0.f(fontStyle, companion.a()));
        kotlin.jvm.internal.f0.o(typefaceCreate, "create(\n            fami…ontStyle.Italic\n        )");
        return typefaceCreate;
    }

    static /* synthetic */ Typeface e(u0 u0Var, String str, FontWeight fontWeight, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        return u0Var.d(str, fontWeight, i10);
    }

    private final Typeface f(String familyName, FontWeight weight, int style) {
        if (familyName.length() == 0) {
            return null;
        }
        Typeface typefaceD = d(familyName, weight, style);
        boolean zF = g0.f(style, g0.INSTANCE.a());
        d1 d1Var = d1.f16533a;
        Typeface DEFAULT = Typeface.DEFAULT;
        kotlin.jvm.internal.f0.o(DEFAULT, "DEFAULT");
        if ((kotlin.jvm.internal.f0.g(typefaceD, d1Var.a(DEFAULT, weight.w(), zF)) || kotlin.jvm.internal.f0.g(typefaceD, d(null, weight, style))) ? false : true) {
            return typefaceD;
        }
        return null;
    }

    @Override // androidx.compose.ui.text.font.t0
    @dl.d
    public Typeface a(@dl.d m0 name, @dl.d FontWeight fontWeight, int fontStyle) {
        kotlin.jvm.internal.f0.p(name, "name");
        kotlin.jvm.internal.f0.p(fontWeight, "fontWeight");
        return d(name.getName(), fontWeight, fontStyle);
    }

    @Override // androidx.compose.ui.text.font.t0
    @dl.d
    public Typeface b(@dl.d FontWeight fontWeight, int fontStyle) {
        kotlin.jvm.internal.f0.p(fontWeight, "fontWeight");
        return d(null, fontWeight, fontStyle);
    }

    @Override // androidx.compose.ui.text.font.t0
    @dl.e
    public Typeface c(@dl.d String familyName, @dl.d FontWeight weight, int style, @dl.d j0.e variationSettings, @dl.d Context context) {
        Typeface typefaceA;
        kotlin.jvm.internal.f0.p(familyName, "familyName");
        kotlin.jvm.internal.f0.p(weight, "weight");
        kotlin.jvm.internal.f0.p(variationSettings, "variationSettings");
        kotlin.jvm.internal.f0.p(context, "context");
        v.Companion companion = v.INSTANCE;
        if (kotlin.jvm.internal.f0.g(familyName, companion.d().getName())) {
            typefaceA = a(companion.d(), weight, style);
        } else if (kotlin.jvm.internal.f0.g(familyName, companion.e().getName())) {
            typefaceA = a(companion.e(), weight, style);
        } else if (kotlin.jvm.internal.f0.g(familyName, companion.c().getName())) {
            typefaceA = a(companion.c(), weight, style);
        } else {
            typefaceA = kotlin.jvm.internal.f0.g(familyName, companion.a().getName()) ? a(companion.a(), weight, style) : f(familyName, weight, style);
        }
        return w0.c(typefaceA, variationSettings, context);
    }
}
