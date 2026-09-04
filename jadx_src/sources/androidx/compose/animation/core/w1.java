package androidx.compose.animation.core;

import androidx.compose.animation.core.p;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\f\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010\t\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001c¨\u0006 "}, d2 = {"Landroidx/compose/animation/core/w1;", "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "Landroidx/compose/animation/core/m1;", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "e", "(JLandroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;)Landroidx/compose/animation/core/p;", "d", "", ak.av, "I", "g", "()I", "durationMillis", "b", "f", "delayMillis", "Landroidx/compose/animation/core/b0;", ak.aF, "Landroidx/compose/animation/core/b0;", RXScreenCaptureService.KEY_HEIGHT, "()Landroidx/compose/animation/core/b0;", "easing", "Landroidx/compose/animation/core/p1;", "Landroidx/compose/animation/core/p1;", "anim", "<init>", "(IILandroidx/compose/animation/core/b0;)V", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public final class w1<V extends p> implements m1<V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f4559e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int durationMillis;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int delayMillis;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final b0 easing;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final p1<V> anim;

    public w1() {
        this(0, 0, null, 7, null);
    }

    public w1(int i10, int i11, @dl.d b0 easing) {
        kotlin.jvm.internal.f0.p(easing, "easing");
        this.durationMillis = i10;
        this.delayMillis = i11;
        this.easing = easing;
        this.anim = new p1<>(new m0(getDurationMillis(), getDelayMillis(), easing));
    }

    public /* synthetic */ w1(int i10, int i11, b0 b0Var, int i12, kotlin.jvm.internal.u uVar) {
        this((i12 & 1) != 0 ? 300 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? d0.b() : b0Var);
    }

    @Override // androidx.compose.animation.core.o1, androidx.compose.animation.core.i1
    public /* synthetic */ boolean a() {
        return n1.a(this);
    }

    @Override // androidx.compose.animation.core.m1, androidx.compose.animation.core.i1
    public /* synthetic */ long b(p pVar, p pVar2, p pVar3) {
        return l1.a(this, pVar, pVar2, pVar3);
    }

    @Override // androidx.compose.animation.core.i1
    public /* synthetic */ p c(p pVar, p pVar2, p pVar3) {
        return h1.a(this, pVar, pVar2, pVar3);
    }

    @Override // androidx.compose.animation.core.i1
    @dl.d
    public V d(long playTimeNanos, @dl.d V initialValue, @dl.d V targetValue, @dl.d V initialVelocity) {
        kotlin.jvm.internal.f0.p(initialValue, "initialValue");
        kotlin.jvm.internal.f0.p(targetValue, "targetValue");
        kotlin.jvm.internal.f0.p(initialVelocity, "initialVelocity");
        return (V) this.anim.d(playTimeNanos, initialValue, targetValue, initialVelocity);
    }

    @Override // androidx.compose.animation.core.i1
    @dl.d
    public V e(long playTimeNanos, @dl.d V initialValue, @dl.d V targetValue, @dl.d V initialVelocity) {
        kotlin.jvm.internal.f0.p(initialValue, "initialValue");
        kotlin.jvm.internal.f0.p(targetValue, "targetValue");
        kotlin.jvm.internal.f0.p(initialVelocity, "initialVelocity");
        return (V) this.anim.e(playTimeNanos, initialValue, targetValue, initialVelocity);
    }

    @Override // androidx.compose.animation.core.m1
    /* JADX INFO: renamed from: f, reason: from getter */
    public int getDelayMillis() {
        return this.delayMillis;
    }

    @Override // androidx.compose.animation.core.m1
    /* JADX INFO: renamed from: g, reason: from getter */
    public int getDurationMillis() {
        return this.durationMillis;
    }

    @dl.d
    /* JADX INFO: renamed from: h, reason: from getter */
    public final b0 getEasing() {
        return this.easing;
    }
}
