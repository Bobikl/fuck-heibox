package androidx.compose.animation.core;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: DecayAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ,\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000e"}, d2 = {"Landroidx/compose/animation/core/y;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/animation/core/x;", "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "Landroidx/compose/animation/core/f1;", "typeConverter", "Landroidx/compose/animation/core/k1;", ak.av, "Landroidx/compose/animation/core/i0;", "Landroidx/compose/animation/core/i0;", "floatDecaySpec", "<init>", "(Landroidx/compose/animation/core/i0;)V", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public final class y<T> implements x<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final i0 floatDecaySpec;

    public y(@dl.d i0 floatDecaySpec) {
        kotlin.jvm.internal.f0.p(floatDecaySpec, "floatDecaySpec");
        this.floatDecaySpec = floatDecaySpec;
    }

    @Override // androidx.compose.animation.core.x
    @dl.d
    public <V extends p> k1<V> a(@dl.d f1<T, V> typeConverter) {
        kotlin.jvm.internal.f0.p(typeConverter, "typeConverter");
        return new q1(this.floatDecaySpec);
    }
}
