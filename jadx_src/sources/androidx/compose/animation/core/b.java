package androidx.compose.animation.core;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Animatable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000¨\u0006\u0006"}, d2 = {"", "initialValue", "visibilityThreshold", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/l;", ak.av, "animation-core_release"}, k = 2, mv = {1, 7, 1})
public final class b {
    @dl.d
    public static final Animatable<Float, l> a(float f10, float f11) {
        return new Animatable<>(Float.valueOf(f10), VectorConvertersKt.e(kotlin.jvm.internal.y.f124996a), Float.valueOf(f11), null, 8, null);
    }

    public static /* synthetic */ Animatable b(float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.01f;
        }
        return a(f10, f11);
    }
}
