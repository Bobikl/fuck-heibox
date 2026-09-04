package androidx.paging;

import androidx.recyclerview.widget.DiffUtil;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: NullPaddedListDiffHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000e"}, d2 = {"Landroidx/paging/a0;", "", "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", ak.av, "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "()Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "diff", "", "b", "Z", "()Z", "hasOverlap", "<init>", "(Landroidx/recyclerview/widget/DiffUtil$DiffResult;Z)V", "paging-runtime_release"}, k = 1, mv = {1, 4, 2})
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final DiffUtil.DiffResult diff;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean hasOverlap;

    public a0(@dl.d DiffUtil.DiffResult diff, boolean z10) {
        kotlin.jvm.internal.f0.p(diff, "diff");
        this.diff = diff;
        this.hasOverlap = z10;
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final DiffUtil.DiffResult getDiff() {
        return this.diff;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getHasOverlap() {
        return this.hasOverlap;
    }
}
