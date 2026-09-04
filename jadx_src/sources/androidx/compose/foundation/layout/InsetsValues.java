package androidx.compose.foundation.layout;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.a0, reason: from toString */
/* JADX INFO: compiled from: WindowInsets.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\t\u0010\f¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/layout/a0;", "", "other", "", "equals", "", "hashCode", "", "toString", ak.av, "I", "b", "()I", com.google.android.exoplayer2.text.ttml.d.f49793l0, "d", "top", ak.aF, com.google.android.exoplayer2.text.ttml.d.f49796n0, "bottom", "<init>", "(IIII)V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public final class InsetsValues {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int left;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int top;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int right;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int bottom;

    public InsetsValues(int i10, int i11, int i12, int i13) {
        this.left = i10;
        this.top = i11;
        this.right = i12;
        this.bottom = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getTop() {
        return this.top;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsetsValues)) {
            return false;
        }
        InsetsValues insetsValues = (InsetsValues) other;
        return this.left == insetsValues.left && this.top == insetsValues.top && this.right == insetsValues.right && this.bottom == insetsValues.bottom;
    }

    public int hashCode() {
        return (((((this.left * 31) + this.top) * 31) + this.right) * 31) + this.bottom;
    }

    @dl.d
    public String toString() {
        return "InsetsValues(left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ')';
    }
}
