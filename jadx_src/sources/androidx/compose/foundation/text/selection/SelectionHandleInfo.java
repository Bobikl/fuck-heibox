package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.l, reason: from toString */
/* JADX INFO: compiled from: SelectionHandles.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0019\u0010\u0005\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\b\u001a\u00020\u00048\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0006\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/text/selection/l;", "", "Landroidx/compose/foundation/text/Handle;", ak.av, "Lb1/f;", "b", "()J", "handle", CommonNetImpl.POSITION, ak.aF, "(Landroidx/compose/foundation/text/Handle;J)Landroidx/compose/foundation/text/selection/l;", "", "toString", "", "hashCode", "other", "", "equals", "Landroidx/compose/foundation/text/Handle;", "e", "()Landroidx/compose/foundation/text/Handle;", "J", "f", "<init>", "(Landroidx/compose/foundation/text/Handle;JLkotlin/jvm/internal/u;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class SelectionHandleInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final Handle handle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long position;

    private SelectionHandleInfo(Handle handle, long j10) {
        this.handle = handle;
        this.position = j10;
    }

    public /* synthetic */ SelectionHandleInfo(Handle handle, long j10, kotlin.jvm.internal.u uVar) {
        this(handle, j10);
    }

    public static /* synthetic */ SelectionHandleInfo d(SelectionHandleInfo selectionHandleInfo, Handle handle, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            handle = selectionHandleInfo.handle;
        }
        if ((i10 & 2) != 0) {
            j10 = selectionHandleInfo.position;
        }
        return selectionHandleInfo.c(handle, j10);
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Handle getHandle() {
        return this.handle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getPosition() {
        return this.position;
    }

    @dl.d
    public final SelectionHandleInfo c(@dl.d Handle handle, long position) {
        f0.p(handle, "handle");
        return new SelectionHandleInfo(handle, position, null);
    }

    @dl.d
    public final Handle e() {
        return this.handle;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectionHandleInfo)) {
            return false;
        }
        SelectionHandleInfo selectionHandleInfo = (SelectionHandleInfo) other;
        return this.handle == selectionHandleInfo.handle && b1.f.l(this.position, selectionHandleInfo.position);
    }

    public final long f() {
        return this.position;
    }

    public int hashCode() {
        return (this.handle.hashCode() * 31) + b1.f.s(this.position);
    }

    @dl.d
    public String toString() {
        return "SelectionHandleInfo(handle=" + this.handle + ", position=" + ((Object) b1.f.y(this.position)) + ')';
    }
}
