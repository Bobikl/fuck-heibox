package androidx.compose.ui.text.font;

import android.graphics.Typeface;
import android.os.Build;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: FontSynthesis.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\t\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/font/h0;", "", "typeface", "Landroidx/compose/ui/text/font/u;", UiKitSpanObj.TYPE_FONT, "Landroidx/compose/ui/text/font/k0;", "requestedWeight", "Landroidx/compose/ui/text/font/g0;", "requestedStyle", ak.av, "(ILjava/lang/Object;Landroidx/compose/ui/text/font/u;Landroidx/compose/ui/text/font/k0;I)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class i0 {
    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    @dl.d
    public static final Object a(int i10, @dl.d Object typeface, @dl.d u font, @dl.d FontWeight requestedWeight, int i11) {
        boolean z10;
        Typeface typefaceA;
        kotlin.jvm.internal.f0.p(typeface, "typeface");
        kotlin.jvm.internal.f0.p(font, "font");
        kotlin.jvm.internal.f0.p(requestedWeight, "requestedWeight");
        if (!(typeface instanceof Typeface)) {
            return typeface;
        }
        if (!h0.k(i10) || kotlin.jvm.internal.f0.g(font.getWeight(), requestedWeight)) {
            z10 = false;
        } else {
            FontWeight.Companion companion = FontWeight.INSTANCE;
            if (requestedWeight.compareTo(h.a(companion)) < 0 || font.getWeight().compareTo(h.a(companion)) >= 0) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        boolean z11 = h0.j(i10) && !g0.f(i11, font.getStyle());
        if (!z11 && !z10) {
            return typeface;
        }
        if (Build.VERSION.SDK_INT < 28) {
            typefaceA = Typeface.create((Typeface) typeface, h.b(z10, z11 && g0.f(i11, g0.INSTANCE.a())));
        } else {
            typefaceA = d1.f16533a.a((Typeface) typeface, z10 ? requestedWeight.w() : font.getWeight().w(), z11 ? g0.f(i11, g0.INSTANCE.a()) : g0.f(font.getStyle(), g0.INSTANCE.a()));
        }
        kotlin.jvm.internal.f0.o(typefaceA, "if (Build.VERSION.SDK_IN…ht, finalFontStyle)\n    }");
        return typefaceA;
    }
}
