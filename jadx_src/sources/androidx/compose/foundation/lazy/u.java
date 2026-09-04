package androidx.compose.foundation.lazy;

import androidx.compose.ui.layout.e1;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: LazyMeasuredItem.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B$\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\b\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/lazy/u;", "", "Ls1/n;", ak.av, "J", "()J", androidx.constraintlayout.core.motion.utils.w.c.R, "Landroidx/compose/ui/layout/e1;", "b", "Landroidx/compose/ui/layout/e1;", ak.aF, "()Landroidx/compose/ui/layout/e1;", "placeable", "Ljava/lang/Object;", "()Ljava/lang/Object;", "parentData", "<init>", "(JLandroidx/compose/ui/layout/e1;Ljava/lang/Object;Lkotlin/jvm/internal/u;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long offset;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final e1 placeable;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final Object parentData;

    private u(long j10, e1 e1Var, Object obj) {
        this.offset = j10;
        this.placeable = e1Var;
        this.parentData = obj;
    }

    public /* synthetic */ u(long j10, e1 e1Var, Object obj, kotlin.jvm.internal.u uVar) {
        this(j10, e1Var, obj);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getOffset() {
        return this.offset;
    }

    @dl.e
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Object getParentData() {
        return this.parentData;
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final e1 getPlaceable() {
        return this.placeable;
    }
}
