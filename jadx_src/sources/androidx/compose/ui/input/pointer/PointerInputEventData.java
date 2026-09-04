package androidx.compose.ui.input.pointer;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.b0, reason: from toString */
/* JADX INFO: compiled from: InternalPointerInput.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\b\u0080\b\u0018\u00002\u00020\u0001Bf\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\u0006\u0010\u001a\u001a\u00020\n\u0012\u0006\u0010\u001b\u001a\u00020\f\u0012\u0006\u0010\u001c\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001d\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0007ø\u0001\u0002¢\u0006\u0004\b:\u0010;J\u0019\u0010\u0003\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u0019\u0010\b\u001a\u00020\u0007HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\u0004J\u0019\u0010\t\u001a\u00020\u0007HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\u0004J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\u0019\u0010\u000f\u001a\u00020\u000eHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0011\u001a\u00020\nHÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003J\u0019\u0010\u0015\u001a\u00020\u0007HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0015\u0010\u0004J\u0080\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\n2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b \u0010!J\t\u0010#\u001a\u00020\"HÖ\u0001J\t\u0010%\u001a\u00020$HÖ\u0001J\u0013\u0010'\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u0016\u001a\u00020\u00028\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0004R\u0017\u0010\u0017\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010(\u001a\u0004\b*\u0010\u0004R \u0010\u0018\u001a\u00020\u00078\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b+\u0010\u0004R \u0010\u0019\u001a\u00020\u00078\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b,\u0010\u0004R\u0017\u0010\u001a\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u001b\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u00102R \u0010\u001c\u001a\u00020\u000e8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b4\u0010\u0010R\u0017\u0010\u001d\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b5\u0010/R\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\b7\u00108R \u0010\u001f\u001a\u00020\u00078\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0014\u0010(\u001a\u0004\b9\u0010\u0004\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006<"}, d2 = {"Landroidx/compose/ui/input/pointer/b0;", "", "Landroidx/compose/ui/input/pointer/x;", ak.av, "()J", "", ak.aF, "Lb1/f;", "d", "e", "", "f", "", "g", "Landroidx/compose/ui/input/pointer/m0;", RXScreenCaptureService.KEY_HEIGHT, "()I", "i", "", "Landroidx/compose/ui/input/pointer/f;", "j", "b", "id", "uptime", "positionOnScreen", CommonNetImpl.POSITION, "down", "pressure", "type", "issuesEnterExit", "historical", "scrollDelta", "k", "(JJJJZFIZLjava/util/List;J)Landroidx/compose/ui/input/pointer/b0;", "", "toString", "", "hashCode", "other", "equals", "J", "o", "v", "r", "q", "Z", "m", "()Z", "F", ak.aB, "()F", "I", ak.aG, "p", "Ljava/util/List;", "n", "()Ljava/util/List;", "t", "<init>", "(JJJJZFIZLjava/util/List;JLkotlin/jvm/internal/u;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class PointerInputEventData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long uptime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long positionOnScreen;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final long position;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean down;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final float pressure;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int type;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean issuesEnterExit;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final List<HistoricalChange> historical;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final long scrollDelta;

    private PointerInputEventData(long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, List<HistoricalChange> list, long j14) {
        this.id = j10;
        this.uptime = j11;
        this.positionOnScreen = j12;
        this.position = j13;
        this.down = z10;
        this.pressure = f10;
        this.type = i10;
        this.issuesEnterExit = z11;
        this.historical = list;
        this.scrollDelta = j14;
    }

    public /* synthetic */ PointerInputEventData(long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, List list, long j14, int i11, kotlin.jvm.internal.u uVar) {
        this(j10, j11, j12, j13, z10, f10, i10, (i11 & 128) != 0 ? false : z11, (i11 & 256) != 0 ? new ArrayList() : list, (i11 & 512) != 0 ? b1.f.f30364b.e() : j14, null);
    }

    public /* synthetic */ PointerInputEventData(long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, List list, long j14, kotlin.jvm.internal.u uVar) {
        this(j10, j11, j12, j13, z10, f10, i10, z11, list, j14);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getScrollDelta() {
        return this.scrollDelta;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getUptime() {
        return this.uptime;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getPositionOnScreen() {
        return this.positionOnScreen;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getPosition() {
        return this.position;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PointerInputEventData)) {
            return false;
        }
        PointerInputEventData pointerInputEventData = (PointerInputEventData) other;
        return x.d(this.id, pointerInputEventData.id) && this.uptime == pointerInputEventData.uptime && b1.f.l(this.positionOnScreen, pointerInputEventData.positionOnScreen) && b1.f.l(this.position, pointerInputEventData.position) && this.down == pointerInputEventData.down && kotlin.jvm.internal.f0.g(Float.valueOf(this.pressure), Float.valueOf(pointerInputEventData.pressure)) && m0.i(this.type, pointerInputEventData.type) && this.issuesEnterExit == pointerInputEventData.issuesEnterExit && kotlin.jvm.internal.f0.g(this.historical, pointerInputEventData.historical) && b1.f.l(this.scrollDelta, pointerInputEventData.scrollDelta);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getDown() {
        return this.down;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getPressure() {
        return this.pressure;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iF = ((((((x.f(this.id) * 31) + androidx.collection.k.a(this.uptime)) * 31) + b1.f.s(this.positionOnScreen)) * 31) + b1.f.s(this.position)) * 31;
        boolean z10 = this.down;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int iFloatToIntBits = (((((iF + r10) * 31) + Float.floatToIntBits(this.pressure)) * 31) + m0.j(this.type)) * 31;
        boolean z11 = this.issuesEnterExit;
        return ((((iFloatToIntBits + (z11 ? 1 : z11)) * 31) + this.historical.hashCode()) * 31) + b1.f.s(this.scrollDelta);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIssuesEnterExit() {
        return this.issuesEnterExit;
    }

    @dl.d
    public final List<HistoricalChange> j() {
        return this.historical;
    }

    @dl.d
    public final PointerInputEventData k(long id2, long uptime, long positionOnScreen, long position, boolean down, float pressure, int type, boolean issuesEnterExit, @dl.d List<HistoricalChange> historical, long scrollDelta) {
        kotlin.jvm.internal.f0.p(historical, "historical");
        return new PointerInputEventData(id2, uptime, positionOnScreen, position, down, pressure, type, issuesEnterExit, historical, scrollDelta, null);
    }

    public final boolean m() {
        return this.down;
    }

    @dl.d
    public final List<HistoricalChange> n() {
        return this.historical;
    }

    public final long o() {
        return this.id;
    }

    public final boolean p() {
        return this.issuesEnterExit;
    }

    public final long q() {
        return this.position;
    }

    public final long r() {
        return this.positionOnScreen;
    }

    public final float s() {
        return this.pressure;
    }

    public final long t() {
        return this.scrollDelta;
    }

    @dl.d
    public String toString() {
        return "PointerInputEventData(id=" + ((Object) x.g(this.id)) + ", uptime=" + this.uptime + ", positionOnScreen=" + ((Object) b1.f.y(this.positionOnScreen)) + ", position=" + ((Object) b1.f.y(this.position)) + ", down=" + this.down + ", pressure=" + this.pressure + ", type=" + ((Object) m0.k(this.type)) + ", issuesEnterExit=" + this.issuesEnterExit + ", historical=" + this.historical + ", scrollDelta=" + ((Object) b1.f.y(this.scrollDelta)) + ')';
    }

    public final int u() {
        return this.type;
    }

    public final long v() {
        return this.uptime;
    }
}
