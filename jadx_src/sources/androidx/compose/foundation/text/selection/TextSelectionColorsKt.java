package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.j1;
import androidx.compose.runtime.j2;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.graphics.n0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextSelectionColors.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\"\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0017\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\b\u0010\t\"\u001a\u0010\u000e\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u0012\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/j1;", "Landroidx/compose/foundation/text/selection/v;", ak.av, "Landroidx/compose/runtime/j1;", ak.aF, "()Landroidx/compose/runtime/j1;", "LocalTextSelectionColors", "Landroidx/compose/ui/graphics/l0;", "b", "J", "DefaultSelectionColor", "Landroidx/compose/foundation/text/selection/v;", "getDefaultTextSelectionColors$annotations", "()V", "DefaultTextSelectionColors", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class TextSelectionColorsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final j1<SelectionColors> f8323a = CompositionLocalKt.d(null, new yh.a<SelectionColors>() { // from class: androidx.compose.foundation.text.selection.TextSelectionColorsKt$LocalTextSelectionColors$1
        @Override // yh.a
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SelectionColors invoke() {
            return TextSelectionColorsKt.f8325c;
        }
    }, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f8324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final SelectionColors f8325c;

    static {
        long jD = n0.d(4282550004L);
        f8324b = jD;
        f8325c = new SelectionColors(jD, l0.w(jD, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    @j2
    private static /* synthetic */ void b() {
    }

    @dl.d
    public static final j1<SelectionColors> c() {
        return f8323a;
    }
}
