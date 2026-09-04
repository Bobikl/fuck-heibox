package androidx.window.embedding;

import androidx.compose.foundation.b0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SplitPairRule.kt */
/* JADX INFO: loaded from: classes6.dex */
@androidx.window.core.d
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B[\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\n\u0012\b\b\u0002\u0010\u001b\u001a\u00020\n\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018¨\u0006!"}, d2 = {"Landroidx/window/embedding/v;", "Landroidx/window/embedding/x;", "Landroidx/window/embedding/u;", "filter", "j", "(Landroidx/window/embedding/u;)Landroidx/window/embedding/v;", "", "other", "", "equals", "", "hashCode", "e", "Z", RXScreenCaptureService.KEY_HEIGHT, "()Z", "finishPrimaryWithSecondary", "f", "i", "finishSecondaryWithPrimary", "g", "clearTop", "", "Ljava/util/Set;", "()Ljava/util/Set;", "filters", "minWidth", "minSmallestWidth", "", "splitRatio", "layoutDir", "<init>", "(Ljava/util/Set;ZZZIIFI)V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class v extends x {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean finishPrimaryWithSecondary;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean finishSecondaryWithPrimary;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean clearTop;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Set<u> filters;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(@dl.d Set<u> filters, boolean z10, boolean z11, boolean z12, int i10, int i11, float f10, int i12) {
        super(i10, i11, f10, i12);
        f0.p(filters, "filters");
        this.finishPrimaryWithSecondary = z10;
        this.finishSecondaryWithPrimary = z11;
        this.clearTop = z12;
        this.filters = CollectionsKt___CollectionsKt.V5(filters);
    }

    public /* synthetic */ v(Set set, boolean z10, boolean z11, boolean z12, int i10, int i11, float f10, int i12, int i13, kotlin.jvm.internal.u uVar) {
        this(set, (i13 & 2) != 0 ? false : z10, (i13 & 4) != 0 ? true : z11, (i13 & 8) != 0 ? false : z12, (i13 & 16) != 0 ? 0 : i10, (i13 & 32) == 0 ? i11 : 0, (i13 & 64) != 0 ? 0.5f : f10, (i13 & 128) != 0 ? 3 : i12);
    }

    @Override // androidx.window.embedding.x
    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof v) || !super.equals(other)) {
            return false;
        }
        v vVar = (v) other;
        return f0.g(this.filters, vVar.filters) && this.finishPrimaryWithSecondary == vVar.finishPrimaryWithSecondary && this.finishSecondaryWithPrimary == vVar.finishSecondaryWithPrimary && this.clearTop == vVar.clearTop;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getClearTop() {
        return this.clearTop;
    }

    @dl.d
    public final Set<u> g() {
        return this.filters;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getFinishPrimaryWithSecondary() {
        return this.finishPrimaryWithSecondary;
    }

    @Override // androidx.window.embedding.x
    public int hashCode() {
        return (((((((super.hashCode() * 31) + this.filters.hashCode()) * 31) + b0.a(this.finishPrimaryWithSecondary)) * 31) + b0.a(this.finishSecondaryWithPrimary)) * 31) + b0.a(this.clearTop);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getFinishSecondaryWithPrimary() {
        return this.finishSecondaryWithPrimary;
    }

    @dl.d
    public final v j(@dl.d u filter) {
        f0.p(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(filter);
        return new v(CollectionsKt___CollectionsKt.V5(linkedHashSet), this.finishPrimaryWithSecondary, this.finishSecondaryWithPrimary, this.clearTop, getMinWidth(), getMinSmallestWidth(), getSplitRatio(), getLayoutDirection());
    }
}
