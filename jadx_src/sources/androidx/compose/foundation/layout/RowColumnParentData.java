package androidx.compose.foundation.layout;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.v0, reason: from toString */
/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Landroidx/compose/foundation/layout/v0;", "", "", ak.av, "", "b", "Landroidx/compose/foundation/layout/q;", ak.aF, "weight", "fill", "crossAxisAlignment", "d", "", "toString", "", "hashCode", "other", "equals", "F", RXScreenCaptureService.KEY_HEIGHT, "()F", "k", "(F)V", "Z", "g", "()Z", "j", "(Z)V", "Landroidx/compose/foundation/layout/q;", "f", "()Landroidx/compose/foundation/layout/q;", "i", "(Landroidx/compose/foundation/layout/q;)V", "<init>", "(FZLandroidx/compose/foundation/layout/q;)V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class RowColumnParentData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private float weight;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean fill;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private q crossAxisAlignment;

    public RowColumnParentData() {
        this(0.0f, false, null, 7, null);
    }

    public RowColumnParentData(float f10, boolean z10, @dl.e q qVar) {
        this.weight = f10;
        this.fill = z10;
        this.crossAxisAlignment = qVar;
    }

    public /* synthetic */ RowColumnParentData(float f10, boolean z10, q qVar, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? null : qVar);
    }

    public static /* synthetic */ RowColumnParentData e(RowColumnParentData rowColumnParentData, float f10, boolean z10, q qVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = rowColumnParentData.weight;
        }
        if ((i10 & 2) != 0) {
            z10 = rowColumnParentData.fill;
        }
        if ((i10 & 4) != 0) {
            qVar = rowColumnParentData.crossAxisAlignment;
        }
        return rowColumnParentData.d(f10, z10, qVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getFill() {
        return this.fill;
    }

    @dl.e
    /* JADX INFO: renamed from: c, reason: from getter */
    public final q getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    @dl.d
    public final RowColumnParentData d(float weight, boolean fill, @dl.e q crossAxisAlignment) {
        return new RowColumnParentData(weight, fill, crossAxisAlignment);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RowColumnParentData)) {
            return false;
        }
        RowColumnParentData rowColumnParentData = (RowColumnParentData) other;
        return kotlin.jvm.internal.f0.g(Float.valueOf(this.weight), Float.valueOf(rowColumnParentData.weight)) && this.fill == rowColumnParentData.fill && kotlin.jvm.internal.f0.g(this.crossAxisAlignment, rowColumnParentData.crossAxisAlignment);
    }

    @dl.e
    public final q f() {
        return this.crossAxisAlignment;
    }

    public final boolean g() {
        return this.fill;
    }

    public final float h() {
        return this.weight;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.weight) * 31;
        boolean z10 = this.fill;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iFloatToIntBits + r10) * 31;
        q qVar = this.crossAxisAlignment;
        return i10 + (qVar == null ? 0 : qVar.hashCode());
    }

    public final void i(@dl.e q qVar) {
        this.crossAxisAlignment = qVar;
    }

    public final void j(boolean z10) {
        this.fill = z10;
    }

    public final void k(float f10) {
        this.weight = f10;
    }

    @dl.d
    public String toString() {
        return "RowColumnParentData(weight=" + this.weight + ", fill=" + this.fill + ", crossAxisAlignment=" + this.crossAxisAlignment + ')';
    }
}
