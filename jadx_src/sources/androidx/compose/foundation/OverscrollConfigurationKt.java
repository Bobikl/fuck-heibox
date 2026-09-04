package androidx.compose.foundation;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.j1;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: OverscrollConfiguration.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\"(\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00008GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/j1;", "Landroidx/compose/foundation/e0;", ak.av, "Landroidx/compose/runtime/j1;", "()Landroidx/compose/runtime/j1;", "getLocalOverscrollConfiguration$annotations", "()V", "LocalOverscrollConfiguration", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class OverscrollConfigurationKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final j1<OverscrollConfiguration> f5030a = CompositionLocalKt.d(null, new yh.a<OverscrollConfiguration>() { // from class: androidx.compose.foundation.OverscrollConfigurationKt$LocalOverscrollConfiguration$1
        @Override // yh.a
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OverscrollConfiguration invoke() {
            return new OverscrollConfiguration(0L, null, 3, null);
        }
    }, 1, null);

    @t
    @dl.d
    public static final j1<OverscrollConfiguration> a() {
        return f5030a;
    }

    @t
    public static /* synthetic */ void b() {
    }
}
