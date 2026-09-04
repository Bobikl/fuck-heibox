package androidx.window.core;

import android.graphics.Rect;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Bounds.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fB\u0011\b\u0016\u0012\u0006\u0010 \u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010!J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u000b\u0010\u000eR\u0011\u0010\u0017\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000eR\u0011\u0010\u0018\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u001b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006\""}, d2 = {"Landroidx/window/core/b;", "", "Landroid/graphics/Rect;", "i", "", "toString", "other", "", "equals", "", "hashCode", ak.av, "I", ak.aF, "()I", com.google.android.exoplayer2.text.ttml.d.f49793l0, "b", "e", "top", "d", com.google.android.exoplayer2.text.ttml.d.f49796n0, "bottom", "f", "width", "height", "g", "()Z", "isEmpty", RXScreenCaptureService.KEY_HEIGHT, "isZero", "<init>", "(IIII)V", "rect", "(Landroid/graphics/Rect;)V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int left;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int top;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int right;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int bottom;

    public b(int i10, int i11, int i12, int i13) {
        this.left = i10;
        this.top = i11;
        this.right = i12;
        this.bottom = i13;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(@dl.d Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        f0.p(rect, "rect");
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getBottom() {
        return this.bottom;
    }

    public final int b() {
        return this.bottom - this.top;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getTop() {
        return this.top;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!f0.g(b.class, other == null ? null : other.getClass())) {
            return false;
        }
        if (other == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.core.Bounds");
        }
        b bVar = (b) other;
        return this.left == bVar.left && this.top == bVar.top && this.right == bVar.right && this.bottom == bVar.bottom;
    }

    public final int f() {
        return this.right - this.left;
    }

    public final boolean g() {
        return b() == 0 || f() == 0;
    }

    public final boolean h() {
        return b() == 0 && f() == 0;
    }

    public int hashCode() {
        return (((((this.left * 31) + this.top) * 31) + this.right) * 31) + this.bottom;
    }

    @dl.d
    public final Rect i() {
        return new Rect(this.left, this.top, this.right, this.bottom);
    }

    @dl.d
    public String toString() {
        return ((Object) b.class.getSimpleName()) + " { [" + this.left + ',' + this.top + ',' + this.right + ',' + this.bottom + "] }";
    }
}
