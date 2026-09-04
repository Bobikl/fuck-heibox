package androidx.compose.foundation.lazy;

import androidx.compose.runtime.a1;
import androidx.compose.runtime.h2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyListScrollPosition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\bJ%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ#\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0007R4\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00028F@FX\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00048F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001b\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/foundation/lazy/x;", "", "Landroidx/compose/foundation/lazy/b;", UCropPlusActivity.ARG_INDEX, "", "scrollOffset", "Lkotlin/b2;", "f", "(II)V", "Landroidx/compose/foundation/lazy/r;", "measureResult", "g", ak.aF, "Landroidx/compose/foundation/lazy/o;", "itemProvider", RXScreenCaptureService.KEY_HEIGHT, "<set-?>", ak.av, "Landroidx/compose/runtime/a1;", "()I", "d", "(I)V", "b", "e", "", "Z", "hadFirstNotEmptyLayout", "Ljava/lang/Object;", "lastKnownFirstItemKey", "initialIndex", "initialScrollOffset", "<init>", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 index;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 scrollOffset;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean hadFirstNotEmptyLayout;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Object lastKnownFirstItemKey;

    /* JADX WARN: Illegal instructions before constructor call */
    public x() {
        int i10 = 0;
        this(i10, i10, 3, null);
    }

    public x(int i10, int i11) {
        this.index = h2.g(b.a(b.c(i10)), null, 2, null);
        this.scrollOffset = h2.g(Integer.valueOf(i11), null, 2, null);
    }

    public /* synthetic */ x(int i10, int i11, int i12, kotlin.jvm.internal.u uVar) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }

    private final void e(int i10) {
        this.scrollOffset.setValue(Integer.valueOf(i10));
    }

    private final void f(int index, int scrollOffset) {
        if (!(((float) index) >= 0.0f)) {
            throw new IllegalArgumentException(("Index should be non-negative (" + index + ')').toString());
        }
        if (!b.f(index, a())) {
            d(index);
        }
        if (scrollOffset != b()) {
            e(scrollOffset);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int a() {
        return ((b) this.index.getValue()).n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int b() {
        return ((Number) this.scrollOffset.getValue()).intValue();
    }

    public final void c(int index, int scrollOffset) {
        f(index, scrollOffset);
        this.lastKnownFirstItemKey = null;
    }

    public final void d(int i10) {
        this.index.setValue(b.a(i10));
    }

    public final void g(@dl.d r measureResult) {
        f0.p(measureResult, "measureResult");
        y firstVisibleItem = measureResult.getFirstVisibleItem();
        this.lastKnownFirstItemKey = firstVisibleItem != null ? firstVisibleItem.getKey() : null;
        if (this.hadFirstNotEmptyLayout || measureResult.getTotalItemsCount() > 0) {
            this.hadFirstNotEmptyLayout = true;
            int firstVisibleItemScrollOffset = measureResult.getFirstVisibleItemScrollOffset();
            if (!(((float) firstVisibleItemScrollOffset) >= 0.0f)) {
                throw new IllegalStateException(("scrollOffset should be non-negative (" + firstVisibleItemScrollOffset + ')').toString());
            }
            androidx.compose.runtime.snapshots.f fVarA = androidx.compose.runtime.snapshots.f.INSTANCE.a();
            try {
                androidx.compose.runtime.snapshots.f fVarP = fVarA.p();
                try {
                    y firstVisibleItem2 = measureResult.getFirstVisibleItem();
                    f(b.c(firstVisibleItem2 != null ? firstVisibleItem2.getIndex() : 0), firstVisibleItemScrollOffset);
                    b2 b2Var = b2.f124493a;
                    fVarA.w(fVarP);
                    fVarA.d();
                } catch (Throwable th2) {
                    fVarA.w(fVarP);
                    throw th2;
                }
            } catch (Throwable th3) {
                fVarA.d();
                throw th3;
            }
        }
    }

    @androidx.compose.foundation.t
    public final void h(@dl.d o itemProvider) {
        f0.p(itemProvider, "itemProvider");
        androidx.compose.runtime.snapshots.f fVarA = androidx.compose.runtime.snapshots.f.INSTANCE.a();
        try {
            androidx.compose.runtime.snapshots.f fVarP = fVarA.p();
            try {
                f(b.c(androidx.compose.foundation.lazy.layout.j.c(itemProvider, this.lastKnownFirstItemKey, a())), b());
                b2 b2Var = b2.f124493a;
                fVarA.w(fVarP);
                fVarA.d();
            } catch (Throwable th2) {
                fVarA.w(fVarP);
                throw th2;
            }
        } catch (Throwable th3) {
            fVarA.d();
            throw th3;
        }
    }
}
