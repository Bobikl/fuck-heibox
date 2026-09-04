package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.graphics.n0;
import androidx.compose.ui.text.SpanStyleKt;
import com.lzy.okgo.model.Progress;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TextForegroundStyle.kt */
/* JADX INFO: loaded from: classes.dex */
@xh.h(name = "TextDrawStyleKt")
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a!\u0010\b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001a\u0010\f\u001a\u00020\u0003*\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/style/l;", com.google.android.exoplayer2.text.ttml.d.f49798o0, "stop", "", Progress.G, "b", "Landroidx/compose/ui/graphics/l0;", "alpha", ak.aF, "(JF)J", "Lkotlin/Function0;", "block", "d", "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class k {
    @dl.d
    public static final l b(@dl.d l start, @dl.d l stop, float f10) {
        f0.p(start, "start");
        f0.p(stop, "stop");
        boolean z10 = start instanceof BrushStyle;
        if (z10 || (stop instanceof BrushStyle)) {
            return (z10 && (stop instanceof BrushStyle)) ? l.INSTANCE.a((a0) SpanStyleKt.c(((BrushStyle) start).e(), ((BrushStyle) stop).e(), f10), u1.d.a(start.getAlpha(), stop.getAlpha(), f10)) : (l) SpanStyleKt.c(start, stop, f10);
        }
        return l.INSTANCE.b(n0.o(start.a(), stop.a(), f10));
    }

    public static final long c(long j10, float f10) {
        return (Float.isNaN(f10) || f10 >= 1.0f) ? j10 : l0.w(j10, l0.A(j10) * f10, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(float f10, yh.a<Float> aVar) {
        return Float.isNaN(f10) ? aVar.invoke().floatValue() : f10;
    }
}
