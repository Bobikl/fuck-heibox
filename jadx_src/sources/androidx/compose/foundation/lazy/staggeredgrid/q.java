package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.a1;
import androidx.compose.runtime.h2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyStaggeredGridScrollPosition.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.foundation.t
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u00126\u0010%\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110\n¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00020 ¢\u0006\u0004\b&\u0010'J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nJ\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0007R+\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R+\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015\"\u0004\b\u0018\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001c¨\u0006("}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/q;", "", "", "indices", "offsets", "Lkotlin/b2;", "f", "Landroidx/compose/foundation/lazy/staggeredgrid/k;", "measureResult", "g", "", UCropPlusActivity.ARG_INDEX, "scrollOffset", ak.aF, "Landroidx/compose/foundation/lazy/layout/i;", "itemProvider", RXScreenCaptureService.KEY_HEIGHT, "<set-?>", "b", "Landroidx/compose/runtime/a1;", ak.av, "()[I", "d", "([I)V", "e", "", "Z", "hadFirstNotEmptyLayout", "Ljava/lang/Object;", "lastKnownFirstItemKey", "initialIndices", "initialOffsets", "Lkotlin/Function2;", "Lkotlin/m0;", "name", "targetIndex", "laneCount", "fillIndices", "<init>", "([I[ILyh/p;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final yh.p<Integer, Integer, int[]> f7389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 indices;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 offsets;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean hadFirstNotEmptyLayout;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Object lastKnownFirstItemKey;

    /* JADX WARN: Multi-variable type inference failed */
    public q(@dl.d int[] initialIndices, @dl.d int[] initialOffsets, @dl.d yh.p<? super Integer, ? super Integer, int[]> fillIndices) {
        f0.p(initialIndices, "initialIndices");
        f0.p(initialOffsets, "initialOffsets");
        f0.p(fillIndices, "fillIndices");
        this.f7389a = fillIndices;
        this.indices = h2.g(initialIndices, null, 2, null);
        this.offsets = h2.g(initialOffsets, null, 2, null);
    }

    private final void f(int[] iArr, int[] iArr2) {
        if (!Arrays.equals(iArr, a())) {
            d(iArr);
        }
        if (Arrays.equals(iArr2, b())) {
            return;
        }
        e(iArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public final int[] a() {
        return (int[]) this.indices.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public final int[] b() {
        return (int[]) this.offsets.getValue();
    }

    public final void c(int i10, int i11) {
        int[] iArrInvoke = this.f7389a.invoke(Integer.valueOf(i10), Integer.valueOf(a().length));
        int length = iArrInvoke.length;
        int[] iArr = new int[length];
        for (int i12 = 0; i12 < length; i12++) {
            iArr[i12] = i11;
        }
        f(iArrInvoke, iArr);
        this.lastKnownFirstItemKey = null;
    }

    public final void d(@dl.d int[] iArr) {
        f0.p(iArr, "<set-?>");
        this.indices.setValue(iArr);
    }

    public final void e(@dl.d int[] iArr) {
        f0.p(iArr, "<set-?>");
        this.offsets.setValue(iArr);
    }

    public final void g(@dl.d k measureResult) {
        f0.p(measureResult, "measureResult");
        e eVar = (e) CollectionsKt___CollectionsKt.B2(measureResult.f());
        this.lastKnownFirstItemKey = eVar != null ? eVar.getKey() : null;
        if (this.hadFirstNotEmptyLayout || measureResult.getTotalItemsCount() > 0) {
            this.hadFirstNotEmptyLayout = true;
            androidx.compose.runtime.snapshots.f fVarA = androidx.compose.runtime.snapshots.f.INSTANCE.a();
            try {
                androidx.compose.runtime.snapshots.f fVarP = fVarA.p();
                try {
                    f(measureResult.getFirstVisibleItemIndices(), measureResult.getFirstVisibleItemScrollOffsets());
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
    public final void h(@dl.d androidx.compose.foundation.lazy.layout.i itemProvider) {
        f0.p(itemProvider, "itemProvider");
        androidx.compose.runtime.snapshots.f fVarA = androidx.compose.runtime.snapshots.f.INSTANCE.a();
        try {
            androidx.compose.runtime.snapshots.f fVarP = fVarA.p();
            try {
                Object obj = this.lastKnownFirstItemKey;
                Integer numOf = ArraysKt___ArraysKt.of(a(), 0);
                int iC = androidx.compose.foundation.lazy.layout.j.c(itemProvider, obj, numOf != null ? numOf.intValue() : 0);
                if (!ArraysKt___ArraysKt.R8(a(), iC)) {
                    f(this.f7389a.invoke(Integer.valueOf(iC), Integer.valueOf(a().length)), b());
                }
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
