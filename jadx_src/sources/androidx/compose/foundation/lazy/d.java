package androidx.compose.foundation.lazy;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: LazyListItemPlacementAnimator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0007R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R+\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/lazy/d;", "", "", ak.av, "I", "()I", "d", "(I)V", UCropPlusActivity.ARG_INDEX, "Ls1/n;", "b", "J", "()J", "e", "(J)V", "notAnimatableDelta", "", "Landroidx/compose/foundation/lazy/c0;", ak.aF, "Ljava/util/List;", "()Ljava/util/List;", "placeables", "<init>", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int index;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long notAnimatableDelta = s1.n.f139237b.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<c0> placeables = new ArrayList();

    public d(int i10) {
        this.index = i10;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getNotAnimatableDelta() {
        return this.notAnimatableDelta;
    }

    @dl.d
    public final List<c0> c() {
        return this.placeables;
    }

    public final void d(int i10) {
        this.index = i10;
    }

    public final void e(long j10) {
        this.notAnimatableDelta = j10;
    }
}
