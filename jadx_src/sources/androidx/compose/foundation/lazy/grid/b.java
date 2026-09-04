package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: LazyGridState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0012\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\rR#\u0010\u0017\u001a\u00020\u00138\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\n\u0010\u001aR\u001a\u0010!\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\"\u0010\u000b\u001a\u0004\b\u001d\u0010\rR\u001a\u0010$\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b\u0004\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/compose/foundation/lazy/grid/b;", "Landroidx/compose/foundation/lazy/grid/n;", "", "Landroidx/compose/foundation/lazy/grid/h;", "b", "Ljava/util/List;", "f", "()Ljava/util/List;", "visibleItemsInfo", "", ak.aF, "I", "e", "()I", "viewportStartOffset", "d", "g", "viewportEndOffset", "totalItemsCount", "Ls1/r;", "J", ak.av, "()J", "viewportSize", "Landroidx/compose/foundation/gestures/Orientation;", "Landroidx/compose/foundation/gestures/Orientation;", "()Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", RXScreenCaptureService.KEY_HEIGHT, "Z", "j", "()Z", "reverseLayout", "i", "beforeContentPadding", "afterContentPadding", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class b implements n {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final int viewportStartOffset = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final int viewportEndOffset = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final int totalItemsCount = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final boolean reverseLayout = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final int beforeContentPadding = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final int afterContentPadding = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final b f6880a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final List<h> visibleItemsInfo = CollectionsKt__CollectionsKt.E();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final long viewportSize = s1.r.f139246b.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final Orientation orientation = Orientation.Vertical;

    private b() {
    }

    @Override // androidx.compose.foundation.lazy.grid.n
    public long a() {
        return viewportSize;
    }

    @Override // androidx.compose.foundation.lazy.grid.n
    public int b() {
        return afterContentPadding;
    }

    @Override // androidx.compose.foundation.lazy.grid.n
    @dl.d
    public Orientation c() {
        return orientation;
    }

    @Override // androidx.compose.foundation.lazy.grid.n
    public int d() {
        return totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.grid.n
    public int e() {
        return viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.grid.n
    @dl.d
    public List<h> f() {
        return visibleItemsInfo;
    }

    @Override // androidx.compose.foundation.lazy.grid.n
    public int g() {
        return viewportEndOffset;
    }

    @Override // androidx.compose.foundation.lazy.grid.n
    public int h() {
        return beforeContentPadding;
    }

    @Override // androidx.compose.foundation.lazy.grid.n
    public boolean j() {
        return reverseLayout;
    }
}
