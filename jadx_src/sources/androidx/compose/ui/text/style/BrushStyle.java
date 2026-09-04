package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.c2;
import androidx.compose.ui.graphics.l0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: renamed from: androidx.compose.ui.text.style.c, reason: from toString */
/* JADX INFO: compiled from: TextForegroundStyle.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/ui/text/style/c;", "Landroidx/compose/ui/text/style/l;", "Landroidx/compose/ui/graphics/c2;", "f", "", "g", "value", "alpha", RXScreenCaptureService.KEY_HEIGHT, "", "toString", "", "hashCode", "", "other", "", "equals", "b", "Landroidx/compose/ui/graphics/c2;", "j", "()Landroidx/compose/ui/graphics/c2;", ak.aF, "F", "d", "()F", "Landroidx/compose/ui/graphics/l0;", ak.av, "()J", "color", "Landroidx/compose/ui/graphics/a0;", "e", "()Landroidx/compose/ui/graphics/a0;", "brush", "<init>", "(Landroidx/compose/ui/graphics/c2;F)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class BrushStyle implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final c2 value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float alpha;

    public BrushStyle(@dl.d c2 value, float f10) {
        f0.p(value, "value");
        this.value = value;
        this.alpha = f10;
    }

    public static /* synthetic */ BrushStyle i(BrushStyle brushStyle, c2 c2Var, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c2Var = brushStyle.value;
        }
        if ((i10 & 2) != 0) {
            f10 = brushStyle.getAlpha();
        }
        return brushStyle.h(c2Var, f10);
    }

    @Override // androidx.compose.ui.text.style.l
    public long a() {
        return l0.INSTANCE.u();
    }

    @Override // androidx.compose.ui.text.style.l
    public /* synthetic */ l b(yh.a aVar) {
        return TextForegroundStyle$CC.b(this, aVar);
    }

    @Override // androidx.compose.ui.text.style.l
    public /* synthetic */ l c(l lVar) {
        return TextForegroundStyle$CC.a(this, lVar);
    }

    @Override // androidx.compose.ui.text.style.l
    /* JADX INFO: renamed from: d, reason: from getter */
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.text.style.l
    @dl.d
    public a0 e() {
        return this.value;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrushStyle)) {
            return false;
        }
        BrushStyle brushStyle = (BrushStyle) other;
        return f0.g(this.value, brushStyle.value) && f0.g(Float.valueOf(getAlpha()), Float.valueOf(brushStyle.getAlpha()));
    }

    @dl.d
    /* JADX INFO: renamed from: f, reason: from getter */
    public final c2 getValue() {
        return this.value;
    }

    public final float g() {
        return getAlpha();
    }

    @dl.d
    public final BrushStyle h(@dl.d c2 value, float alpha) {
        f0.p(value, "value");
        return new BrushStyle(value, alpha);
    }

    public int hashCode() {
        return (this.value.hashCode() * 31) + Float.floatToIntBits(getAlpha());
    }

    @dl.d
    public final c2 j() {
        return this.value;
    }

    @dl.d
    public String toString() {
        return "BrushStyle(value=" + this.value + ", alpha=" + getAlpha() + ')';
    }
}
