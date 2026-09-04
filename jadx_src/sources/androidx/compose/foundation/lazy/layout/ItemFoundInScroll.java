package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationState;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyAnimateScroll.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0004\u0010\u000e¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll;", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/CancellationException;", "", "b", "I", ak.av, "()I", "itemOffset", "Landroidx/compose/animation/core/j;", "", "Landroidx/compose/animation/core/l;", ak.aF, "Landroidx/compose/animation/core/j;", "()Landroidx/compose/animation/core/j;", "previousAnimation", "<init>", "(ILandroidx/compose/animation/core/j;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class ItemFoundInScroll extends CancellationException {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int itemOffset;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final AnimationState<Float, androidx.compose.animation.core.l> previousAnimation;

    public ItemFoundInScroll(int i10, @dl.d AnimationState<Float, androidx.compose.animation.core.l> previousAnimation) {
        f0.p(previousAnimation, "previousAnimation");
        this.itemOffset = i10;
        this.previousAnimation = previousAnimation;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getItemOffset() {
        return this.itemOffset;
    }

    @dl.d
    public final AnimationState<Float, androidx.compose.animation.core.l> b() {
        return this.previousAnimation;
    }
}
