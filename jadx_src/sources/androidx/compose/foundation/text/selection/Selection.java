package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.m0;
import androidx.compose.ui.text.p0;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.j, reason: from toString */
/* JADX INFO: compiled from: Selection.kt */
/* JADX INFO: loaded from: classes.dex */
@m0
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\bB!\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000J\u0016\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0007HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\nHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\n2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/text/selection/j;", "", "other", "i", "Landroidx/compose/ui/text/o0;", "j", "()J", "Landroidx/compose/foundation/text/selection/j$a;", ak.av, "b", "", ak.aF, com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "handlesCrossed", "d", "", "toString", "", "hashCode", "equals", "Landroidx/compose/foundation/text/selection/j$a;", RXScreenCaptureService.KEY_HEIGHT, "()Landroidx/compose/foundation/text/selection/j$a;", "f", "Z", "g", "()Z", "<init>", "(Landroidx/compose/foundation/text/selection/j$a;Landroidx/compose/foundation/text/selection/j$a;Z)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class Selection {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final AnchorInfo start;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final AnchorInfo end;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean handlesCrossed;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.j$a, reason: from toString */
    /* JADX INFO: compiled from: Selection.kt */
    @m0
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/text/selection/j$a;", "", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", ak.av, "", "b", "", ak.aF, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, androidx.constraintlayout.core.motion.utils.w.c.R, "selectableId", "d", "", "toString", "hashCode", "other", "", "equals", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "f", "()Landroidx/compose/ui/text/style/ResolvedTextDirection;", "I", "g", "()I", "J", RXScreenCaptureService.KEY_HEIGHT, "()J", "<init>", "(Landroidx/compose/ui/text/style/ResolvedTextDirection;IJ)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class AnchorInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @dl.d
        private final ResolvedTextDirection direction;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int offset;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final long selectableId;

        public AnchorInfo(@dl.d ResolvedTextDirection direction, int i10, long j10) {
            f0.p(direction, "direction");
            this.direction = direction;
            this.offset = i10;
            this.selectableId = j10;
        }

        public static /* synthetic */ AnchorInfo e(AnchorInfo anchorInfo, ResolvedTextDirection resolvedTextDirection, int i10, long j10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                resolvedTextDirection = anchorInfo.direction;
            }
            if ((i11 & 2) != 0) {
                i10 = anchorInfo.offset;
            }
            if ((i11 & 4) != 0) {
                j10 = anchorInfo.selectableId;
            }
            return anchorInfo.d(resolvedTextDirection, i10, j10);
        }

        @dl.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ResolvedTextDirection getDirection() {
            return this.direction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getOffset() {
            return this.offset;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getSelectableId() {
            return this.selectableId;
        }

        @dl.d
        public final AnchorInfo d(@dl.d ResolvedTextDirection direction, int offset, long selectableId) {
            f0.p(direction, "direction");
            return new AnchorInfo(direction, offset, selectableId);
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnchorInfo)) {
                return false;
            }
            AnchorInfo anchorInfo = (AnchorInfo) other;
            return this.direction == anchorInfo.direction && this.offset == anchorInfo.offset && this.selectableId == anchorInfo.selectableId;
        }

        @dl.d
        public final ResolvedTextDirection f() {
            return this.direction;
        }

        public final int g() {
            return this.offset;
        }

        public final long h() {
            return this.selectableId;
        }

        public int hashCode() {
            return (((this.direction.hashCode() * 31) + this.offset) * 31) + androidx.collection.k.a(this.selectableId);
        }

        @dl.d
        public String toString() {
            return "AnchorInfo(direction=" + this.direction + ", offset=" + this.offset + ", selectableId=" + this.selectableId + ')';
        }
    }

    public Selection(@dl.d AnchorInfo start, @dl.d AnchorInfo end, boolean z10) {
        f0.p(start, "start");
        f0.p(end, "end");
        this.start = start;
        this.end = end;
        this.handlesCrossed = z10;
    }

    public /* synthetic */ Selection(AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z10, int i10, kotlin.jvm.internal.u uVar) {
        this(anchorInfo, anchorInfo2, (i10 & 4) != 0 ? false : z10);
    }

    public static /* synthetic */ Selection e(Selection selection, AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            anchorInfo = selection.start;
        }
        if ((i10 & 2) != 0) {
            anchorInfo2 = selection.end;
        }
        if ((i10 & 4) != 0) {
            z10 = selection.handlesCrossed;
        }
        return selection.d(anchorInfo, anchorInfo2, z10);
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final AnchorInfo getStart() {
        return this.start;
    }

    @dl.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final AnchorInfo getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getHandlesCrossed() {
        return this.handlesCrossed;
    }

    @dl.d
    public final Selection d(@dl.d AnchorInfo start, @dl.d AnchorInfo end, boolean handlesCrossed) {
        f0.p(start, "start");
        f0.p(end, "end");
        return new Selection(start, end, handlesCrossed);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Selection)) {
            return false;
        }
        Selection selection = (Selection) other;
        return f0.g(this.start, selection.start) && f0.g(this.end, selection.end) && this.handlesCrossed == selection.handlesCrossed;
    }

    @dl.d
    public final AnchorInfo f() {
        return this.end;
    }

    public final boolean g() {
        return this.handlesCrossed;
    }

    @dl.d
    public final AnchorInfo h() {
        return this.start;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int iHashCode = ((this.start.hashCode() * 31) + this.end.hashCode()) * 31;
        boolean z10 = this.handlesCrossed;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    @dl.d
    public final Selection i(@dl.e Selection other) {
        if (other == null) {
            return this;
        }
        return this.handlesCrossed ? e(this, other.start, null, false, 6, null) : e(this, null, other.end, false, 5, null);
    }

    public final long j() {
        return p0.b(this.start.g(), this.end.g());
    }

    @dl.d
    public String toString() {
        return "Selection(start=" + this.start + ", end=" + this.end + ", handlesCrossed=" + this.handlesCrossed + ')';
    }
}
