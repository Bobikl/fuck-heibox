package androidx.compose.foundation.text.selection;

import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AndroidSelectionHandles.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\tø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J5\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR\u001d\u0010\u0011\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/text/selection/d;", "Landroidx/compose/ui/window/g;", "Ls1/p;", "anchorBounds", "Ls1/r;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "Ls1/n;", ak.av, "(Ls1/p;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "Landroidx/compose/foundation/text/selection/HandleReferencePoint;", "Landroidx/compose/foundation/text/selection/HandleReferencePoint;", "handleReferencePoint", "b", "J", androidx.constraintlayout.core.motion.utils.w.c.R, "<init>", "(Landroidx/compose/foundation/text/selection/HandleReferencePoint;JLkotlin/jvm/internal/u;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class d implements androidx.compose.ui.window.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final HandleReferencePoint handleReferencePoint;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long offset;

    /* JADX INFO: compiled from: AndroidSelectionHandles.android.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8359a;

        static {
            int[] iArr = new int[HandleReferencePoint.values().length];
            iArr[HandleReferencePoint.TopLeft.ordinal()] = 1;
            iArr[HandleReferencePoint.TopRight.ordinal()] = 2;
            iArr[HandleReferencePoint.TopMiddle.ordinal()] = 3;
            f8359a = iArr;
        }
    }

    private d(HandleReferencePoint handleReferencePoint, long j10) {
        this.handleReferencePoint = handleReferencePoint;
        this.offset = j10;
    }

    public /* synthetic */ d(HandleReferencePoint handleReferencePoint, long j10, kotlin.jvm.internal.u uVar) {
        this(handleReferencePoint, j10);
    }

    @Override // androidx.compose.ui.window.g
    public long a(@dl.d s1.p anchorBounds, long windowSize, @dl.d LayoutDirection layoutDirection, long popupContentSize) {
        f0.p(anchorBounds, "anchorBounds");
        f0.p(layoutDirection, "layoutDirection");
        int i10 = a.f8359a[this.handleReferencePoint.ordinal()];
        if (i10 == 1) {
            return s1.o.a(anchorBounds.t() + s1.n.m(this.offset), anchorBounds.getF139243b() + s1.n.o(this.offset));
        }
        if (i10 == 2) {
            return s1.o.a((anchorBounds.t() + s1.n.m(this.offset)) - s1.r.m(popupContentSize), anchorBounds.getF139243b() + s1.n.o(this.offset));
        }
        if (i10 == 3) {
            return s1.o.a((anchorBounds.t() + s1.n.m(this.offset)) - (s1.r.m(popupContentSize) / 2), anchorBounds.getF139243b() + s1.n.o(this.offset));
        }
        throw new NoWhenBranchMatchedException();
    }
}
