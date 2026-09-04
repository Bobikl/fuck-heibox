package z0;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import dl.e;
import kotlin.Metadata;

/* JADX INFO: renamed from: z0.a, reason: from toString */
/* JADX INFO: compiled from: ComposableMethod.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001c"}, d2 = {"Lz0/a;", "", "", ak.av, "", "b", ak.aF, "d", "isComposable", "realParamsCount", "changedParams", "defaultParams", "e", "", "toString", "hashCode", "other", "equals", "Z", "j", "()Z", "I", "i", "()I", "g", RXScreenCaptureService.KEY_HEIGHT, "<init>", "(ZIII)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class ComposableInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    private final boolean isComposable;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    private final int realParamsCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from toString */
    private final int changedParams;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from toString */
    private final int defaultParams;

    public ComposableInfo(boolean z10, int i10, int i11, int i12) {
        this.isComposable = z10;
        this.realParamsCount = i10;
        this.changedParams = i11;
        this.defaultParams = i12;
    }

    public static /* synthetic */ ComposableInfo f(ComposableInfo composableInfo, boolean z10, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z10 = composableInfo.isComposable;
        }
        if ((i13 & 2) != 0) {
            i10 = composableInfo.realParamsCount;
        }
        if ((i13 & 4) != 0) {
            i11 = composableInfo.changedParams;
        }
        if ((i13 & 8) != 0) {
            i12 = composableInfo.defaultParams;
        }
        return composableInfo.e(z10, i10, i11, i12);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getIsComposable() {
        return this.isComposable;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getRealParamsCount() {
        return this.realParamsCount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getChangedParams() {
        return this.changedParams;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getDefaultParams() {
        return this.defaultParams;
    }

    @dl.d
    public final ComposableInfo e(boolean isComposable, int realParamsCount, int changedParams, int defaultParams) {
        return new ComposableInfo(isComposable, realParamsCount, changedParams, defaultParams);
    }

    public boolean equals(@e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComposableInfo)) {
            return false;
        }
        ComposableInfo composableInfo = (ComposableInfo) other;
        return this.isComposable == composableInfo.isComposable && this.realParamsCount == composableInfo.realParamsCount && this.changedParams == composableInfo.changedParams && this.defaultParams == composableInfo.defaultParams;
    }

    public final int g() {
        return this.changedParams;
    }

    public final int h() {
        return this.defaultParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z10 = this.isComposable;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return (((((r10 * 31) + this.realParamsCount) * 31) + this.changedParams) * 31) + this.defaultParams;
    }

    public final int i() {
        return this.realParamsCount;
    }

    public final boolean j() {
        return this.isComposable;
    }

    @dl.d
    public String toString() {
        return "ComposableInfo(isComposable=" + this.isComposable + ", realParamsCount=" + this.realParamsCount + ", changedParams=" + this.changedParams + ", defaultParams=" + this.defaultParams + ')';
    }
}
