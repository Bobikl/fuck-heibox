package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.h2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: LazyGridItemPlacementAnimator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u000b\u0012\u0006\u0010\t\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0003\u0010\u000fR+\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R+\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0019\u001a\u0004\b\r\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/foundation/lazy/grid/d0;", "", "", ak.av, "I", ak.aF, "()I", "f", "(I)V", "mainAxisSize", "Landroidx/compose/animation/core/Animatable;", "Ls1/n;", "Landroidx/compose/animation/core/m;", "b", "Landroidx/compose/animation/core/Animatable;", "()Landroidx/compose/animation/core/Animatable;", "animatedOffset", "J", "d", "()J", "g", "(J)V", "targetOffset", "", "<set-?>", "Landroidx/compose/runtime/a1;", "()Z", "e", "(Z)V", "inProgress", "initialOffset", "<init>", "(JILkotlin/jvm/internal/u;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int mainAxisSize;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Animatable<s1.n, androidx.compose.animation.core.m> animatedOffset;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long targetOffset;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 inProgress;

    private d0(long j10, int i10) {
        this.mainAxisSize = i10;
        this.animatedOffset = new Animatable<>(s1.n.b(j10), VectorConvertersKt.i(s1.n.f139237b), null, 4, null);
        this.targetOffset = j10;
        this.inProgress = h2.g(Boolean.FALSE, null, 2, null);
    }

    public /* synthetic */ d0(long j10, int i10, kotlin.jvm.internal.u uVar) {
        this(j10, i10);
    }

    @dl.d
    public final Animatable<s1.n, androidx.compose.animation.core.m> a() {
        return this.animatedOffset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b() {
        return ((Boolean) this.inProgress.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getTargetOffset() {
        return this.targetOffset;
    }

    public final void e(boolean z10) {
        this.inProgress.setValue(Boolean.valueOf(z10));
    }

    public final void f(int i10) {
        this.mainAxisSize = i10;
    }

    public final void g(long j10) {
        this.targetOffset = j10;
    }
}
