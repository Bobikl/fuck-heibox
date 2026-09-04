package androidx.compose.animation;

import androidx.compose.runtime.m0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@m0
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/compose/animation/g;", "Landroidx/compose/animation/f;", "Landroidx/compose/animation/x;", ak.aF, "Landroidx/compose/animation/x;", "b", "()Landroidx/compose/animation/x;", "data", "<init>", "(Landroidx/compose/animation/x;)V", "animation_release"}, k = 1, mv = {1, 7, 1})
public final class g extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final TransitionData data;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@dl.d TransitionData data) {
        super(null);
        f0.p(data, "data");
        this.data = data;
    }

    @Override // androidx.compose.animation.f
    @dl.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public TransitionData getData() {
        return this.data;
    }
}
