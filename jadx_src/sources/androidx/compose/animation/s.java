package androidx.compose.animation;

import androidx.compose.animation.core.f0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AnimatedContent.kt */
/* JADX INFO: loaded from: classes.dex */
@j
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001BR\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012<\u0010\u0011\u001a8\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u000eø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fRP\u0010\u0011\u001a8\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u000e8\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\t\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/compose/animation/s;", "Landroidx/compose/animation/r;", "Ls1/r;", "initialSize", "targetSize", "Landroidx/compose/animation/core/f0;", "f", "(JJ)Landroidx/compose/animation/core/f0;", "", ak.av, "Z", "e", "()Z", "clip", "Lkotlin/Function2;", "Lkotlin/m0;", "name", "sizeAnimationSpec", "Lyh/p;", "()Lyh/p;", "<init>", "(ZLyh/p;)V", "animation_release"}, k = 1, mv = {1, 7, 1})
public final class s implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean clip;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.p<s1.r, s1.r, f0<s1.r>> f4611b;

    /* JADX WARN: Multi-variable type inference failed */
    public s(boolean z10, @dl.d yh.p<? super s1.r, ? super s1.r, ? extends f0<s1.r>> sizeAnimationSpec) {
        kotlin.jvm.internal.f0.p(sizeAnimationSpec, "sizeAnimationSpec");
        this.clip = z10;
        this.f4611b = sizeAnimationSpec;
    }

    public /* synthetic */ s(boolean z10, yh.p pVar, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? true : z10, pVar);
    }

    @dl.d
    public final yh.p<s1.r, s1.r, f0<s1.r>> a() {
        return this.f4611b;
    }

    @Override // androidx.compose.animation.r
    /* JADX INFO: renamed from: e, reason: from getter */
    public boolean getClip() {
        return this.clip;
    }

    @Override // androidx.compose.animation.r
    @dl.d
    public f0<s1.r> f(long initialSize, long targetSize) {
        return this.f4611b.invoke(s1.r.b(initialSize), s1.r.b(targetSize));
    }
}
