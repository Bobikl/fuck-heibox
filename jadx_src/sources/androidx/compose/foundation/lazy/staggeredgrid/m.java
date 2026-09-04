package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.ui.layout.e1;
import androidx.constraintlayout.core.motion.utils.w;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: LazyStaggeredGridMeasure.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001BP\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u0006\u0010!\u001a\u00020\u0006\u0012\u0006\u0010%\u001a\u00020\"ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R#\u0010\u000b\u001a\u00020\u00068\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\r\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u001a\u001a\u00020\u00188\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\b\u001a\u0004\b\u0007\u0010\nR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b \u0010\bR\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/m;", "Landroidx/compose/foundation/lazy/staggeredgrid/e;", "Landroidx/compose/ui/layout/e1$a;", "scope", "Lkotlin/b2;", "d", "Ls1/n;", ak.av, "J", ak.aF, "()J", w.c.R, "", "b", "I", "getIndex", "()I", UCropPlusActivity.ARG_INDEX, "lane", "", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "key", "Ls1/r;", "e", UiKitSpanObj.TYPE_SIZE, "", "Landroidx/compose/ui/layout/e1;", "f", "Ljava/util/List;", "placeables", "g", "contentOffset", "", RXScreenCaptureService.KEY_HEIGHT, "Z", "isVertical", "<init>", "(JIILjava/lang/Object;JLjava/util/List;JZLkotlin/jvm/internal/u;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class m implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long offset;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int lane;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Object key;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long size;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<e1> placeables;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long contentOffset;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* JADX WARN: Multi-variable type inference failed */
    private m(long j10, int i10, int i11, Object obj, long j11, List<? extends e1> list, long j12, boolean z10) {
        this.offset = j10;
        this.index = i10;
        this.lane = i11;
        this.key = obj;
        this.size = j11;
        this.placeables = list;
        this.contentOffset = j12;
        this.isVertical = z10;
    }

    public /* synthetic */ m(long j10, int i10, int i11, Object obj, long j11, List list, long j12, boolean z10, u uVar) {
        this(j10, i10, i11, obj, j11, list, j12, z10);
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.e
    /* JADX INFO: renamed from: a, reason: from getter */
    public long getSize() {
        return this.size;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.e
    /* JADX INFO: renamed from: b, reason: from getter */
    public int getLane() {
        return this.lane;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.e
    /* JADX INFO: renamed from: c, reason: from getter */
    public long getOffset() {
        return this.offset;
    }

    public final void d(@dl.d e1.a scope) {
        f0.p(scope, "scope");
        List<e1> list = this.placeables;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            e1 e1Var = list.get(i10);
            if (this.isVertical) {
                long offset = getOffset();
                long j10 = this.contentOffset;
                e1.a.F(scope, e1Var, s1.o.a(s1.n.m(offset) + s1.n.m(j10), s1.n.o(offset) + s1.n.o(j10)), 0.0f, null, 6, null);
            } else {
                long offset2 = getOffset();
                long j11 = this.contentOffset;
                e1.a.B(scope, e1Var, s1.o.a(s1.n.m(offset2) + s1.n.m(j11), s1.n.o(offset2) + s1.n.o(j11)), 0.0f, null, 6, null);
            }
        }
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.e
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.e
    @dl.d
    public Object getKey() {
        return this.key;
    }
}
