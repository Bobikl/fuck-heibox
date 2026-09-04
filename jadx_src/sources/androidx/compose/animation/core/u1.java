package androidx.compose.animation.core;

import androidx.compose.animation.core.p;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\t\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0016"}, d2 = {"Landroidx/compose/animation/core/u1;", "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "Landroidx/compose/animation/core/m1;", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "e", "(JLandroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;)Landroidx/compose/animation/core/p;", "d", "", ak.av, "I", "f", "()I", "delayMillis", "g", "durationMillis", "<init>", "(I)V", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public final class u1<V extends p> implements m1<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f4526b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int delayMillis;

    public u1() {
        this(0, 1, null);
    }

    public u1(int i10) {
        this.delayMillis = i10;
    }

    public /* synthetic */ u1(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 0 : i10);
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
        return initialVelocity;
    }

    @Override // androidx.compose.animation.core.i1
    @dl.d
    public V e(long playTimeNanos, @dl.d V initialValue, @dl.d V targetValue, @dl.d V initialVelocity) {
        kotlin.jvm.internal.f0.p(initialValue, "initialValue");
        kotlin.jvm.internal.f0.p(targetValue, "targetValue");
        kotlin.jvm.internal.f0.p(initialVelocity, "initialVelocity");
        return playTimeNanos < ((long) getDelayMillis()) * 1000000 ? initialValue : targetValue;
    }

    @Override // androidx.compose.animation.core.m1
    /* JADX INFO: renamed from: f, reason: from getter */
    public int getDelayMillis() {
        return this.delayMillis;
    }

    @Override // androidx.compose.animation.core.m1
    public int g() {
        return 0;
    }
}
