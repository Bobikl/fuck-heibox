package androidx.compose.foundation.lazy.grid;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: LazyGridItemPlacementAnimator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006\"\u0004\b\r\u0010\bR+\u0010\u0015\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/lazy/grid/f;", "", "", ak.av, "I", ak.aF, "()I", RXScreenCaptureService.KEY_HEIGHT, "(I)V", UCropPlusActivity.ARG_INDEX, "b", "g", "crossAxisSize", "f", "crossAxisOffset", "Ls1/n;", "d", "J", "()J", "i", "(J)V", "notAnimatableDelta", "", "Landroidx/compose/foundation/lazy/grid/d0;", "e", "Ljava/util/List;", "()Ljava/util/List;", "placeables", "<init>", "(III)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int index;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int crossAxisSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int crossAxisOffset;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long notAnimatableDelta = s1.n.f139237b.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<d0> placeables = new ArrayList();

    public f(int i10, int i11, int i12) {
        this.index = i10;
        this.crossAxisSize = i11;
        this.crossAxisOffset = i12;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCrossAxisOffset() {
        return this.crossAxisOffset;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getNotAnimatableDelta() {
        return this.notAnimatableDelta;
    }

    @dl.d
    public final List<d0> e() {
        return this.placeables;
    }

    public final void f(int i10) {
        this.crossAxisOffset = i10;
    }

    public final void g(int i10) {
        this.crossAxisSize = i10;
    }

    public final void h(int i10) {
        this.index = i10;
    }

    public final void i(long j10) {
        this.notAnimatableDelta = j10;
    }
}
