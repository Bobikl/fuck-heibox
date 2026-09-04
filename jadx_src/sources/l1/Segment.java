package l1;

import androidx.compose.runtime.internal.o;
import androidx.compose.ui.text.android.g;
import com.google.android.exoplayer2.text.ttml.d;
import com.umeng.analytics.pro.ak;
import dl.e;
import kotlin.Metadata;

/* JADX INFO: renamed from: l1.a, reason: from toString */
/* JADX INFO: compiled from: SegmentBreaker.kt */
/* JADX INFO: loaded from: classes.dex */
@o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003JE\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018¨\u0006 "}, d2 = {"Ll1/a;", "", "", ak.av, "b", ak.aF, "d", "e", "f", "startOffset", "endOffset", d.f49793l0, "top", d.f49796n0, "bottom", "g", "", "toString", "hashCode", "other", "", "equals", "I", "m", "()I", "j", "k", "n", "l", "i", "<init>", "(IIIIII)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
@g
public final /* data */ class Segment {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f130819g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    private final int startOffset;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    private final int endOffset;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from toString */
    private final int left;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from toString */
    private final int top;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from toString */
    private final int right;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from toString */
    private final int bottom;

    public Segment(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.startOffset = i10;
        this.endOffset = i11;
        this.left = i12;
        this.top = i13;
        this.right = i14;
        this.bottom = i15;
    }

    public static /* synthetic */ Segment h(Segment segment, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i10 = segment.startOffset;
        }
        if ((i16 & 2) != 0) {
            i11 = segment.endOffset;
        }
        int i17 = i11;
        if ((i16 & 4) != 0) {
            i12 = segment.left;
        }
        int i18 = i12;
        if ((i16 & 8) != 0) {
            i13 = segment.top;
        }
        int i19 = i13;
        if ((i16 & 16) != 0) {
            i14 = segment.right;
        }
        int i20 = i14;
        if ((i16 & 32) != 0) {
            i15 = segment.bottom;
        }
        return segment.g(i10, i17, i18, i19, i20, i15);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getStartOffset() {
        return this.startOffset;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getEndOffset() {
        return this.endOffset;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getRight() {
        return this.right;
    }

    public boolean equals(@e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Segment)) {
            return false;
        }
        Segment segment = (Segment) other;
        return this.startOffset == segment.startOffset && this.endOffset == segment.endOffset && this.left == segment.left && this.top == segment.top && this.right == segment.right && this.bottom == segment.bottom;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getBottom() {
        return this.bottom;
    }

    @dl.d
    public final Segment g(int startOffset, int endOffset, int left, int top, int right, int bottom) {
        return new Segment(startOffset, endOffset, left, top, right, bottom);
    }

    public int hashCode() {
        return (((((((((this.startOffset * 31) + this.endOffset) * 31) + this.left) * 31) + this.top) * 31) + this.right) * 31) + this.bottom;
    }

    public final int i() {
        return this.bottom;
    }

    public final int j() {
        return this.endOffset;
    }

    public final int k() {
        return this.left;
    }

    public final int l() {
        return this.right;
    }

    public final int m() {
        return this.startOffset;
    }

    public final int n() {
        return this.top;
    }

    @dl.d
    public String toString() {
        return "Segment(startOffset=" + this.startOffset + ", endOffset=" + this.endOffset + ", left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ')';
    }
}
