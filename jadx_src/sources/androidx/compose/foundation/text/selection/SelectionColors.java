package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.m0;
import androidx.compose.ui.graphics.l0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.v, reason: from toString */
/* JADX INFO: compiled from: TextSelectionColors.kt */
/* JADX INFO: loaded from: classes.dex */
@m0
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R \u0010\u000e\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u000f\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/text/selection/v;", "", "other", "", "equals", "", "hashCode", "", "toString", "Landroidx/compose/ui/graphics/l0;", ak.av, "J", "b", "()J", "handleColor", com.google.android.exoplayer2.text.ttml.d.H, "<init>", "(JJLkotlin/jvm/internal/u;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class SelectionColors {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long selectionHandleColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long selectionBackgroundColor;

    private SelectionColors(long j10, long j11) {
        this.selectionHandleColor = j10;
        this.selectionBackgroundColor = j11;
    }

    public /* synthetic */ SelectionColors(long j10, long j11, kotlin.jvm.internal.u uVar) {
        this(j10, j11);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getSelectionBackgroundColor() {
        return this.selectionBackgroundColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getSelectionHandleColor() {
        return this.selectionHandleColor;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectionColors)) {
            return false;
        }
        SelectionColors selectionColors = (SelectionColors) other;
        return l0.y(this.selectionHandleColor, selectionColors.selectionHandleColor) && l0.y(this.selectionBackgroundColor, selectionColors.selectionBackgroundColor);
    }

    public int hashCode() {
        return (l0.K(this.selectionHandleColor) * 31) + l0.K(this.selectionBackgroundColor);
    }

    @dl.d
    public String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) l0.L(this.selectionHandleColor)) + ", selectionBackgroundColor=" + ((Object) l0.L(this.selectionBackgroundColor)) + ')';
    }
}
