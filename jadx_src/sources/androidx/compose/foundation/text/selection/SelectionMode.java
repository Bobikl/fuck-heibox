package androidx.compose.foundation.text.selection;

import com.umeng.socialize.net.dplus.CommonNetImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SelectionMode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000ej\u0002\b\u0012j\u0002\b\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionMode;", "", "Lb1/f;", CommonNetImpl.POSITION, "Lb1/i;", "bounds", "", "compare-3MmeM6k$foundation_release", "(JLb1/i;)I", "compare", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "", "isSelected-2x9bVx0$foundation_release", "(Lb1/i;JJ)Z", "isSelected", "<init>", "(Ljava/lang/String;I)V", "Vertical", "Horizontal", "foundation_release"}, k = 1, mv = {1, 7, 1})
public enum SelectionMode {
    Vertical { // from class: androidx.compose.foundation.text.selection.SelectionMode.Vertical
        @Override // androidx.compose.foundation.text.selection.SelectionMode
        /* JADX INFO: renamed from: compare-3MmeM6k$foundation_release */
        public int mo0compare3MmeM6k$foundation_release(long position, @dl.d b1.i bounds) {
            f0.p(bounds, "bounds");
            if (bounds.f(position)) {
                return 0;
            }
            if (b1.f.r(position) < bounds.getF30372b()) {
                return -1;
            }
            return (b1.f.p(position) >= bounds.t() || b1.f.r(position) >= bounds.j()) ? 1 : -1;
        }
    },
    Horizontal { // from class: androidx.compose.foundation.text.selection.SelectionMode.Horizontal
        @Override // androidx.compose.foundation.text.selection.SelectionMode
        /* JADX INFO: renamed from: compare-3MmeM6k$foundation_release */
        public int mo0compare3MmeM6k$foundation_release(long position, @dl.d b1.i bounds) {
            f0.p(bounds, "bounds");
            if (bounds.f(position)) {
                return 0;
            }
            if (b1.f.p(position) < bounds.t()) {
                return -1;
            }
            return (b1.f.r(position) >= bounds.getF30372b() || b1.f.p(position) >= bounds.x()) ? 1 : -1;
        }
    };

    /* synthetic */ SelectionMode(kotlin.jvm.internal.u uVar) {
        this();
    }

    /* JADX INFO: renamed from: compare-3MmeM6k$foundation_release, reason: not valid java name */
    public abstract int mo0compare3MmeM6k$foundation_release(long position, @dl.d b1.i bounds);

    /* JADX INFO: renamed from: isSelected-2x9bVx0$foundation_release, reason: not valid java name */
    public final boolean m1isSelected2x9bVx0$foundation_release(@dl.d b1.i bounds, long start, long end) {
        f0.p(bounds, "bounds");
        if (bounds.f(start) || bounds.f(end)) {
            return true;
        }
        return (mo0compare3MmeM6k$foundation_release(start, bounds) > 0) ^ (mo0compare3MmeM6k$foundation_release(end, bounds) > 0);
    }
}
