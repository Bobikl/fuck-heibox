package androidx.compose.foundation.lazy.staggeredgrid;

import com.max.xiaoheihe.module.bbs.ChannelListActivity;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: LazyStaggeredGridSpans.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0002J\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\u0005J\u0016\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002J\u0016\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002J\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0002R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/r;", "", "", "capacity", "newOffset", "Lkotlin/b2;", ak.av, ChannelListActivity.q.f79586f, com.google.android.exoplayer2.text.ttml.d.f49805s, "i", "f", "j", "g", RXScreenCaptureService.KEY_HEIGHT, "target", "e", "d", "requestedIndex", ak.aF, "I", "anchor", "", "b", "[I", "spans", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f7395d = 131072;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f7396e = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int anchor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private int[] spans = new int[16];

    private final void a(int i10, int i11) {
        if (!(i10 <= 131072)) {
            throw new IllegalArgumentException(("Requested span capacity " + i10 + " is larger than max supported: 131072!").toString());
        }
        int[] iArr = this.spans;
        if (iArr.length < i10) {
            int length = iArr.length;
            while (length < i10) {
                length *= 2;
            }
            this.spans = kotlin.collections.m.j1(this.spans, new int[length], i11, 0, 0, 12, null);
        }
    }

    static /* synthetic */ void b(r rVar, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        rVar.a(i10, i11);
    }

    public final void c(int i10) {
        int i11 = this.anchor;
        int i12 = i10 - i11;
        if (i12 >= 0 && i12 < 131072) {
            b(this, i12 + 1, 0, 2, null);
            return;
        }
        int iMax = Math.max(i10 - (this.spans.length / 2), 0);
        this.anchor = iMax;
        int i13 = iMax - i11;
        if (i13 >= 0) {
            int[] iArr = this.spans;
            if (i13 < iArr.length) {
                kotlin.collections.m.a1(iArr, iArr, 0, i13, iArr.length);
            }
            int[] iArr2 = this.spans;
            kotlin.collections.m.l2(iArr2, 0, Math.max(0, iArr2.length - i13), this.spans.length);
            return;
        }
        int i14 = -i13;
        int[] iArr3 = this.spans;
        if (iArr3.length + i14 < 131072) {
            a(iArr3.length + i14 + 1, i14);
            return;
        }
        if (i14 < iArr3.length) {
            kotlin.collections.m.a1(iArr3, iArr3, i14, 0, iArr3.length - i14);
        }
        int[] iArr4 = this.spans;
        kotlin.collections.m.l2(iArr4, 0, 0, Math.min(iArr4.length, i14));
    }

    public final int d(int item, int target) {
        int iJ = j();
        for (int i10 = item + 1; i10 < iJ; i10++) {
            int iF = f(i10);
            if (iF == target || iF == -1) {
                return i10;
            }
        }
        return j();
    }

    public final int e(int item, int target) {
        int iF;
        do {
            item--;
            if (-1 >= item) {
                return -1;
            }
            iF = f(item);
            if (iF == target) {
                break;
            }
        } while (iF != -1);
        return item;
    }

    public final int f(int item) {
        if (item < getAnchor() || item >= j()) {
            return -1;
        }
        return this.spans[item - this.anchor] - 1;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getAnchor() {
        return this.anchor;
    }

    public final void h() {
        kotlin.collections.m.u2(this.spans, 0, 0, 0, 6, null);
    }

    public final void i(int i10, int i11) {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException("Negative spans are not supported".toString());
        }
        c(i10);
        this.spans[i10 - this.anchor] = i11 + 1;
    }

    public final int j() {
        return this.anchor + this.spans.length;
    }
}
