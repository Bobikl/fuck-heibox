package androidx.compose.material3;

import androidx.compose.runtime.CompositionLocalKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: ContentColor.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\" \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/j1;", "Landroidx/compose/ui/graphics/l0;", ak.av, "Landroidx/compose/runtime/j1;", "()Landroidx/compose/runtime/j1;", "LocalContentColor", "material3_release"}, k = 2, mv = {1, 7, 1})
public final class ContentColorKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.j1<androidx.compose.ui.graphics.l0> f9335a = CompositionLocalKt.d(null, new yh.a<androidx.compose.ui.graphics.l0>() { // from class: androidx.compose.material3.ContentColorKt$LocalContentColor$1
        public final long a() {
            return androidx.compose.ui.graphics.l0.INSTANCE.a();
        }

        @Override // yh.a
        public /* bridge */ /* synthetic */ androidx.compose.ui.graphics.l0 invoke() {
            return androidx.compose.ui.graphics.l0.n(a());
        }
    }, 1, null);

    @dl.d
    public static final androidx.compose.runtime.j1<androidx.compose.ui.graphics.l0> a() {
        return f9335a;
    }
}
