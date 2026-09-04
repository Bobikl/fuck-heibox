package androidx.compose.material.ripple;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.j1;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: RippleTheme.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\"\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\"\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t\"\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\t¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/j1;", "Landroidx/compose/material/ripple/k;", ak.av, "Landroidx/compose/runtime/j1;", "d", "()Landroidx/compose/runtime/j1;", "LocalRippleTheme", "Landroidx/compose/material/ripple/e;", "b", "Landroidx/compose/material/ripple/e;", "LightThemeHighContrastRippleAlpha", ak.aF, "LightThemeLowContrastRippleAlpha", "DarkThemeRippleAlpha", "material-ripple_release"}, k = 2, mv = {1, 7, 1})
public final class RippleThemeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final j1<k> f8490a = CompositionLocalKt.e(new yh.a<k>() { // from class: androidx.compose.material.ripple.RippleThemeKt$LocalRippleTheme$1
        @Override // yh.a
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k invoke() {
            return b.f8507b;
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final RippleAlpha f8491b = new RippleAlpha(0.16f, 0.24f, 0.08f, 0.24f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final RippleAlpha f8492c = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.12f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final RippleAlpha f8493d = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.1f);

    @dl.d
    public static final j1<k> d() {
        return f8490a;
    }
}
