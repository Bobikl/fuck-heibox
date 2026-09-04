package androidx.compose.ui.input.pointer;

import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.f, reason: from toString */
/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.ui.g
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000b\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/input/pointer/f;", "", "", "toString", "", ak.av, "J", "b", "()J", "uptimeMillis", "Lb1/f;", CommonNetImpl.POSITION, "<init>", "(JJLkotlin/jvm/internal/u;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class HistoricalChange {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long uptimeMillis;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long position;

    private HistoricalChange(long j10, long j11) {
        this.uptimeMillis = j10;
        this.position = j11;
    }

    public /* synthetic */ HistoricalChange(long j10, long j11, kotlin.jvm.internal.u uVar) {
        this(j10, j11);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    @dl.d
    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) b1.f.y(this.position)) + ')';
    }
}
