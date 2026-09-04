package androidx.compose.ui.text.style;

import kotlin.jvm.internal.f0;

/* JADX INFO: renamed from: androidx.compose.ui.text.style.TextForegroundStyle$-CC, reason: invalid class name */
/* JADX INFO: compiled from: TextForegroundStyle.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class TextForegroundStyle$CC {
    @dl.d
    public static l a(final l lVar, @dl.d l other) {
        f0.p(other, "other");
        boolean z10 = other instanceof BrushStyle;
        if (z10 && (lVar instanceof BrushStyle)) {
            return new BrushStyle(((BrushStyle) other).j(), k.d(other.getAlpha(), new yh.a<Float>() { // from class: androidx.compose.ui.text.style.TextForegroundStyle$merge$1
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Float invoke() {
                    return Float.valueOf(lVar.getAlpha());
                }
            }));
        }
        if (!z10 || (lVar instanceof BrushStyle)) {
            return (z10 || !(lVar instanceof BrushStyle)) ? other.b(new yh.a<l>() { // from class: androidx.compose.ui.text.style.TextForegroundStyle$merge$2
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final l invoke() {
                    return lVar;
                }
            }) : lVar;
        }
        return other;
    }

    @dl.d
    public static l b(l lVar, @dl.d yh.a other) {
        f0.p(other, "other");
        return !f0.g(lVar, l.b.f16959b) ? lVar : (l) other.invoke();
    }
}
