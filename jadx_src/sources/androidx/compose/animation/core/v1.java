package androidx.compose.animation.core;

import androidx.compose.animation.core.p;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B!\b\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eB)\b\u0016\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001d\u0010 J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\b\u0010\tJ(\u0010\n\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\r\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\u000f\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0017\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00188VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0019¨\u0006!"}, d2 = {"Landroidx/compose/animation/core/v1;", "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "Landroidx/compose/animation/core/o1;", "initialValue", "targetValue", "initialVelocity", "", "b", "(Landroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;)J", ak.aF, "(Landroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;)Landroidx/compose/animation/core/p;", "playTimeNanos", "e", "(JLandroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;)Landroidx/compose/animation/core/p;", "d", "", ak.av, "F", RXScreenCaptureService.KEY_HEIGHT, "()F", "dampingRatio", "i", "stiffness", "", "()Z", "isInfinite", "Landroidx/compose/animation/core/r;", "anims", "<init>", "(FFLandroidx/compose/animation/core/r;)V", "visibilityThreshold", "(FFLandroidx/compose/animation/core/p;)V", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public final class v1<V extends p> implements o1<V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f4533d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float dampingRatio;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float stiffness;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ p1<V> f4536c;

    public v1(float f10, float f11, @dl.e V v10) {
        this(f10, f11, j1.d(v10, f10, f11));
    }

    public /* synthetic */ v1(float f10, float f11, p pVar, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1500.0f : f11, (i10 & 4) != 0 ? null : pVar);
    }

    private v1(float f10, float f11, r rVar) {
        this.dampingRatio = f10;
        this.stiffness = f11;
        this.f4536c = new p1<>(rVar);
    }

    @Override // androidx.compose.animation.core.o1, androidx.compose.animation.core.i1
    public boolean a() {
        return this.f4536c.a();
    }

    @Override // androidx.compose.animation.core.i1
    public long b(@dl.d V initialValue, @dl.d V targetValue, @dl.d V initialVelocity) {
        kotlin.jvm.internal.f0.p(initialValue, "initialValue");
        kotlin.jvm.internal.f0.p(targetValue, "targetValue");
        kotlin.jvm.internal.f0.p(initialVelocity, "initialVelocity");
        return this.f4536c.b(initialValue, targetValue, initialVelocity);
    }

    @Override // androidx.compose.animation.core.i1
    @dl.d
    public V c(@dl.d V initialValue, @dl.d V targetValue, @dl.d V initialVelocity) {
        kotlin.jvm.internal.f0.p(initialValue, "initialValue");
        kotlin.jvm.internal.f0.p(targetValue, "targetValue");
        kotlin.jvm.internal.f0.p(initialVelocity, "initialVelocity");
        return (V) this.f4536c.c(initialValue, targetValue, initialVelocity);
    }

    @Override // androidx.compose.animation.core.i1
    @dl.d
    public V d(long playTimeNanos, @dl.d V initialValue, @dl.d V targetValue, @dl.d V initialVelocity) {
        kotlin.jvm.internal.f0.p(initialValue, "initialValue");
        kotlin.jvm.internal.f0.p(targetValue, "targetValue");
        kotlin.jvm.internal.f0.p(initialVelocity, "initialVelocity");
        return (V) this.f4536c.d(playTimeNanos, initialValue, targetValue, initialVelocity);
    }

    @Override // androidx.compose.animation.core.i1
    @dl.d
    public V e(long playTimeNanos, @dl.d V initialValue, @dl.d V targetValue, @dl.d V initialVelocity) {
        kotlin.jvm.internal.f0.p(initialValue, "initialValue");
        kotlin.jvm.internal.f0.p(targetValue, "targetValue");
        kotlin.jvm.internal.f0.p(initialVelocity, "initialVelocity");
        return (V) this.f4536c.e(playTimeNanos, initialValue, targetValue, initialVelocity);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final float getStiffness() {
        return this.stiffness;
    }
}
