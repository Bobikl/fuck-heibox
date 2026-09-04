package androidx.compose.animation.core;

import androidx.compose.animation.core.p;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.m2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.animation.core.j, reason: from toString */
/* JADX INFO: compiled from: AnimationState.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004BM\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010/\u001a\u00028\u0000\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00018\u0001\u0012\b\b\u0002\u0010\"\u001a\u00020\u001c\u0012\b\b\u0002\u0010%\u001a\u00020\u001c\u0012\b\b\u0002\u0010,\u001a\u00020&¢\u0006\u0004\b1\u00102J\b\u0010\u0006\u001a\u00020\u0005H\u0016R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR+\u0010\u0014\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u001b\u001a\u00028\u00012\u0006\u0010\r\u001a\u00028\u00018\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010\"\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8F@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f\"\u0004\b \u0010!R*\u0010%\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8F@@X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001e\u001a\u0004\b\u000e\u0010\u001f\"\u0004\b$\u0010!R*\u0010,\u001a\u00020&2\u0006\u0010\r\u001a\u00020&8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0011\u0010.\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b-\u0010\u0011¨\u00063"}, d2 = {"Landroidx/compose/animation/core/j;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "Landroidx/compose/runtime/m2;", "", "toString", "Landroidx/compose/animation/core/f1;", "b", "Landroidx/compose/animation/core/f1;", "g", "()Landroidx/compose/animation/core/f1;", "typeConverter", "<set-?>", ak.aF, "Landroidx/compose/runtime/a1;", "getValue", "()Ljava/lang/Object;", "q", "(Ljava/lang/Object;)V", "value", "d", "Landroidx/compose/animation/core/p;", "i", "()Landroidx/compose/animation/core/p;", "r", "(Landroidx/compose/animation/core/p;)V", "velocityVector", "", "e", "J", "()J", "m", "(J)V", "lastFrameTimeNanos", "f", "l", "finishedTimeNanos", "", "Z", "j", "()Z", "p", "(Z)V", "isRunning", RXScreenCaptureService.KEY_HEIGHT, "velocity", "initialValue", "initialVelocityVector", "<init>", "(Landroidx/compose/animation/core/f1;Ljava/lang/Object;Landroidx/compose/animation/core/p;JJZ)V", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public final class AnimationState<T, V extends p> implements m2<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f4433h = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f1<T, V> typeConverter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 value;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private V velocityVector;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private long lastFrameTimeNanos;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private long finishedTimeNanos;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isRunning;

    public AnimationState(@dl.d f1<T, V> typeConverter, T t10, @dl.e V v10, long j10, long j11, boolean z10) {
        V v11;
        kotlin.jvm.internal.f0.p(typeConverter, "typeConverter");
        this.typeConverter = typeConverter;
        this.value = h2.g(t10, null, 2, null);
        this.velocityVector = (v10 == null || (v11 = (V) q.e(v10)) == null) ? (V) k.i(typeConverter, t10) : v11;
        this.lastFrameTimeNanos = j10;
        this.finishedTimeNanos = j11;
        this.isRunning = z10;
    }

    public /* synthetic */ AnimationState(f1 f1Var, Object obj, p pVar, long j10, long j11, boolean z10, int i10, kotlin.jvm.internal.u uVar) {
        this(f1Var, obj, (i10 & 4) != 0 ? null : pVar, (i10 & 8) != 0 ? Long.MIN_VALUE : j10, (i10 & 16) != 0 ? Long.MIN_VALUE : j11, (i10 & 32) != 0 ? false : z10);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getFinishedTimeNanos() {
        return this.finishedTimeNanos;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getLastFrameTimeNanos() {
        return this.lastFrameTimeNanos;
    }

    @dl.d
    public final f1<T, V> g() {
        return this.typeConverter;
    }

    @Override // androidx.compose.runtime.m2
    public T getValue() {
        return this.value.getValue();
    }

    public final T h() {
        return this.typeConverter.b().invoke(this.velocityVector);
    }

    @dl.d
    public final V i() {
        return this.velocityVector;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsRunning() {
        return this.isRunning;
    }

    public final void l(long j10) {
        this.finishedTimeNanos = j10;
    }

    public final void m(long j10) {
        this.lastFrameTimeNanos = j10;
    }

    public final void p(boolean z10) {
        this.isRunning = z10;
    }

    public void q(T t10) {
        this.value.setValue(t10);
    }

    public final void r(@dl.d V v10) {
        kotlin.jvm.internal.f0.p(v10, "<set-?>");
        this.velocityVector = v10;
    }

    @dl.d
    public String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + h() + ", isRunning=" + this.isRunning + ", lastFrameTimeNanos=" + this.lastFrameTimeNanos + ", finishedTimeNanos=" + this.finishedTimeNanos + ')';
    }
}
