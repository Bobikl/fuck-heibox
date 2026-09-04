package androidx.compose.foundation.lazy.staggeredgrid;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: LazyStaggeredGridMeasureResult.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR#\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0014\u0010\rR\u001a\u0010\u0017\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u0016\u0010\rR\u001a\u0010\u0019\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0018\u0010\rR\u001a\u0010\u001a\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0004\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/a;", "Landroidx/compose/foundation/lazy/staggeredgrid/h;", "", "Landroidx/compose/foundation/lazy/staggeredgrid/e;", "b", "Ljava/util/List;", "f", "()Ljava/util/List;", "visibleItemsInfo", "", ak.aF, "I", "d", "()I", "totalItemsCount", "Ls1/r;", "J", ak.av, "()J", "viewportSize", "e", "viewportStartOffset", "g", "viewportEndOffset", RXScreenCaptureService.KEY_HEIGHT, "beforeContentPadding", "afterContentPadding", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class a implements h {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final int totalItemsCount = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final int viewportStartOffset = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final int viewportEndOffset = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final int beforeContentPadding = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final int afterContentPadding = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f7326a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final List<e> visibleItemsInfo = CollectionsKt__CollectionsKt.E();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final long viewportSize = s1.r.f139246b.a();

    private a() {
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.h
    /* JADX INFO: renamed from: a */
    public long getViewportSize() {
        return viewportSize;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.h
    /* JADX INFO: renamed from: b */
    public int getAfterContentPadding() {
        return afterContentPadding;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.h
    /* JADX INFO: renamed from: d */
    public int getTotalItemsCount() {
        return totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.h
    /* JADX INFO: renamed from: e */
    public int getViewportStartOffset() {
        return viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.h
    @dl.d
    public List<e> f() {
        return visibleItemsInfo;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.h
    /* JADX INFO: renamed from: g */
    public int getViewportEndOffset() {
        return viewportEndOffset;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.h
    /* JADX INFO: renamed from: h */
    public int getBeforeContentPadding() {
        return beforeContentPadding;
    }
}
