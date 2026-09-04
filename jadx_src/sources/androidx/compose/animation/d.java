package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.h2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AnimatedVisibility.kt */
/* JADX INFO: loaded from: classes.dex */
@j
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0011\u0010\tR(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/animation/d;", "Landroidx/compose/animation/c;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", ak.av, "Landroidx/compose/animation/core/Transition;", "b", "()Landroidx/compose/animation/core/Transition;", "d", "(Landroidx/compose/animation/core/Transition;)V", "transition", "Landroidx/compose/runtime/a1;", "Ls1/r;", "Landroidx/compose/runtime/a1;", ak.aF, "()Landroidx/compose/runtime/a1;", "targetSize", "<init>", "animation_release"}, k = 1, mv = {1, 7, 1})
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private Transition<EnterExitState> transition;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1<s1.r> targetSize;

    public d(@dl.d Transition<EnterExitState> transition) {
        f0.p(transition, "transition");
        this.transition = transition;
        this.targetSize = h2.g(s1.r.b(s1.r.f139246b.a()), null, 2, null);
    }

    @Override // androidx.compose.animation.c
    public /* synthetic */ androidx.compose.ui.n a(androidx.compose.ui.n nVar, f fVar, h hVar, String str) {
        return AnimatedVisibilityScope$CC.a(this, nVar, fVar, hVar, str);
    }

    @Override // androidx.compose.animation.c
    @dl.d
    public Transition<EnterExitState> b() {
        return this.transition;
    }

    @dl.d
    public final a1<s1.r> c() {
        return this.targetSize;
    }

    public void d(@dl.d Transition<EnterExitState> transition) {
        f0.p(transition, "<set-?>");
        this.transition = transition;
    }
}
