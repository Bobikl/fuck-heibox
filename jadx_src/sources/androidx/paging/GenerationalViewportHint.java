package androidx.paging;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: androidx.paging.k, reason: from toString */
/* JADX INFO: compiled from: PageFetcherSnapshot.kt */
/* JADX INFO: loaded from: classes6.dex */
@androidx.annotation.j1
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/paging/k;", "", "Landroidx/paging/LoadType;", "loadType", "", "g", "(Landroidx/paging/LoadType;)I", ak.av, "Landroidx/paging/f1;", "b", "generationId", "hint", ak.aF, "", "toString", "hashCode", "other", "", "equals", "I", "e", "()I", "Landroidx/paging/f1;", "f", "()Landroidx/paging/f1;", "<init>", "(ILandroidx/paging/f1;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
public final /* data */ class GenerationalViewportHint {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int generationId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final f1 hint;

    public GenerationalViewportHint(int i10, @dl.d f1 hint) {
        kotlin.jvm.internal.f0.p(hint, "hint");
        this.generationId = i10;
        this.hint = hint;
    }

    public static /* synthetic */ GenerationalViewportHint d(GenerationalViewportHint generationalViewportHint, int i10, f1 f1Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = generationalViewportHint.generationId;
        }
        if ((i11 & 2) != 0) {
            f1Var = generationalViewportHint.hint;
        }
        return generationalViewportHint.c(i10, f1Var);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getGenerationId() {
        return this.generationId;
    }

    @dl.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final f1 getHint() {
        return this.hint;
    }

    @dl.d
    public final GenerationalViewportHint c(int generationId, @dl.d f1 hint) {
        kotlin.jvm.internal.f0.p(hint, "hint");
        return new GenerationalViewportHint(generationId, hint);
    }

    public final int e() {
        return this.generationId;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenerationalViewportHint)) {
            return false;
        }
        GenerationalViewportHint generationalViewportHint = (GenerationalViewportHint) other;
        return this.generationId == generationalViewportHint.generationId && kotlin.jvm.internal.f0.g(this.hint, generationalViewportHint.hint);
    }

    @dl.d
    public final f1 f() {
        return this.hint;
    }

    public final int g(@dl.d LoadType loadType) {
        kotlin.jvm.internal.f0.p(loadType, "loadType");
        int i10 = j.f26453a[loadType.ordinal()];
        if (i10 == 1) {
            throw new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
        }
        if (i10 == 2) {
            return this.hint.getPresentedItemsBefore();
        }
        if (i10 == 3) {
            return this.hint.getPresentedItemsAfter();
        }
        throw new NoWhenBranchMatchedException();
    }

    public int hashCode() {
        int i10 = this.generationId * 31;
        f1 f1Var = this.hint;
        return i10 + (f1Var != null ? f1Var.hashCode() : 0);
    }

    @dl.d
    public String toString() {
        return "GenerationalViewportHint(generationId=" + this.generationId + ", hint=" + this.hint + ")";
    }
}
