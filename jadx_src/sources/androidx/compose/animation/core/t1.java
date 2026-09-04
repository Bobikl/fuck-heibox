package androidx.compose.animation.core;

import androidx.compose.animation.core.p;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.DeprecationLevel;
import kotlin.Metadata;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B)\b\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b#\u0010$B4\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001a\u0012\b\b\u0002\u0010&\u001a\u00020%ø\u0001\u0000¢\u0006\u0004\b#\u0010'J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J/\u0010\n\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ/\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u000bJ'\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Landroidx/compose/animation/core/t1;", "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "Landroidx/compose/animation/core/o1;", "", "playTimeNanos", "i", com.google.android.exoplayer2.text.ttml.d.f49798o0, "startVelocity", com.google.android.exoplayer2.text.ttml.d.f49800p0, "j", "(JLandroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;)Landroidx/compose/animation/core/p;", "initialValue", "targetValue", "initialVelocity", "e", "d", "b", "(Landroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;)J", "", ak.av, "I", "iterations", "Landroidx/compose/animation/core/m1;", "Landroidx/compose/animation/core/m1;", "animation", "Landroidx/compose/animation/core/RepeatMode;", ak.aF, "Landroidx/compose/animation/core/RepeatMode;", "repeatMode", "J", RXScreenCaptureService.KEY_HEIGHT, "()J", "durationNanos", "initialOffsetNanos", "<init>", "(ILandroidx/compose/animation/core/m1;Landroidx/compose/animation/core/RepeatMode;)V", "Landroidx/compose/animation/core/a1;", "initialStartOffset", "(ILandroidx/compose/animation/core/m1;Landroidx/compose/animation/core/RepeatMode;JLkotlin/jvm/internal/u;)V", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public final class t1<V extends p> implements o1<V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f4516f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int iterations;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final m1<V> animation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final RepeatMode repeatMode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long durationNanos;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long initialOffsetNanos;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "This method has been deprecated in favor of the constructor that accepts start offset.")
    public /* synthetic */ t1(int i10, m1 animation, RepeatMode repeatMode) {
        this(i10, animation, repeatMode, a1.d(0, 0, 2, null), (kotlin.jvm.internal.u) null);
        kotlin.jvm.internal.f0.p(animation, "animation");
        kotlin.jvm.internal.f0.p(repeatMode, "repeatMode");
    }

    public /* synthetic */ t1(int i10, m1 m1Var, RepeatMode repeatMode, int i11, kotlin.jvm.internal.u uVar) {
        this(i10, m1Var, (i11 & 4) != 0 ? RepeatMode.Restart : repeatMode);
    }

    private t1(int i10, m1<V> m1Var, RepeatMode repeatMode, long j10) {
        this.iterations = i10;
        this.animation = m1Var;
        this.repeatMode = repeatMode;
        if (i10 < 1) {
            throw new IllegalArgumentException("Iterations count can't be less than 1");
        }
        this.durationNanos = ((long) (m1Var.getDelayMillis() + m1Var.g())) * 1000000;
        this.initialOffsetNanos = j10 * 1000000;
    }

    public /* synthetic */ t1(int i10, m1 m1Var, RepeatMode repeatMode, long j10, int i11, kotlin.jvm.internal.u uVar) {
        this(i10, m1Var, (i11 & 4) != 0 ? RepeatMode.Restart : repeatMode, (i11 & 8) != 0 ? a1.d(0, 0, 2, null) : j10, (kotlin.jvm.internal.u) null);
    }

    public /* synthetic */ t1(int i10, m1 m1Var, RepeatMode repeatMode, long j10, kotlin.jvm.internal.u uVar) {
        this(i10, m1Var, repeatMode, j10);
    }

    private final long i(long playTimeNanos) {
        long j10 = this.initialOffsetNanos;
        if (playTimeNanos + j10 <= 0) {
            return 0L;
        }
        long j11 = playTimeNanos + j10;
        long jMin = Math.min(j11 / this.durationNanos, ((long) this.iterations) - 1);
        return (this.repeatMode == RepeatMode.Restart || jMin % ((long) 2) == 0) ? j11 - (jMin * this.durationNanos) : ((jMin + 1) * this.durationNanos) - j11;
    }

    private final V j(long playTimeNanos, V start, V startVelocity, V end) {
        long j10 = this.initialOffsetNanos;
        long j11 = playTimeNanos + j10;
        long j12 = this.durationNanos;
        return j11 > j12 ? (V) d(j12 - j10, start, startVelocity, end) : startVelocity;
    }

    @Override // androidx.compose.animation.core.o1, androidx.compose.animation.core.i1
    public /* synthetic */ boolean a() {
        return n1.a(this);
    }

    @Override // androidx.compose.animation.core.i1
    public long b(@dl.d V initialValue, @dl.d V targetValue, @dl.d V initialVelocity) {
        kotlin.jvm.internal.f0.p(initialValue, "initialValue");
        kotlin.jvm.internal.f0.p(targetValue, "targetValue");
        kotlin.jvm.internal.f0.p(initialVelocity, "initialVelocity");
        return (((long) this.iterations) * this.durationNanos) - this.initialOffsetNanos;
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
        return this.animation.d(i(playTimeNanos), initialValue, targetValue, j(playTimeNanos, initialValue, initialVelocity, targetValue));
    }

    @Override // androidx.compose.animation.core.i1
    @dl.d
    public V e(long playTimeNanos, @dl.d V initialValue, @dl.d V targetValue, @dl.d V initialVelocity) {
        kotlin.jvm.internal.f0.p(initialValue, "initialValue");
        kotlin.jvm.internal.f0.p(targetValue, "targetValue");
        kotlin.jvm.internal.f0.p(initialVelocity, "initialVelocity");
        return this.animation.e(i(playTimeNanos), initialValue, targetValue, j(playTimeNanos, initialValue, initialVelocity, targetValue));
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getDurationNanos() {
        return this.durationNanos;
    }
}
