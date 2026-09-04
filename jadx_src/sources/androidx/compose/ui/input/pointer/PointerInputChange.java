package androidx.compose.ui.input.pointer;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.s0;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.y, reason: from toString */
/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b4\b\u0007\u0018\u00002\u00020\u0001B^\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010)\u001a\u00020\u0006\u0012\u0006\u0010,\u001a\u00020\b\u0012\u0006\u00100\u001a\u00020\n\u0012\u0006\u00103\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010P\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\bø\u0001\u0001¢\u0006\u0004\bQ\u0010RBV\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010)\u001a\u00020\u0006\u0012\u0006\u0010,\u001a\u00020\b\u0012\u0006\u00100\u001a\u00020\n\u0012\u0006\u00103\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011ø\u0001\u0001¢\u0006\u0004\bQ\u0010SBj\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010)\u001a\u00020\u0006\u0012\u0006\u0010,\u001a\u00020\b\u0012\u0006\u00100\u001a\u00020\n\u0012\u0006\u00103\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010P\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0006\u0010\u0015\u001a\u00020\bø\u0001\u0001¢\u0006\u0004\bQ\u0010TBr\b\u0011\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010)\u001a\u00020\u0006\u0012\u0006\u0010,\u001a\u00020\b\u0012\u0006\u00100\u001a\u00020\n\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u00103\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010P\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0006\u0010\u0015\u001a\u00020\bø\u0001\u0001¢\u0006\u0004\bQ\u0010UBh\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010)\u001a\u00020\u0006\u0012\u0006\u0010,\u001a\u00020\b\u0012\u0006\u00100\u001a\u00020\n\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u00103\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010P\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\bø\u0001\u0001¢\u0006\u0004\bQ\u0010VJ\u0006\u0010\u0003\u001a\u00020\u0002Jo\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014Jm\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017Jw\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J}\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\b\b\u0002\u0010\u0015\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0087\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\b\b\u0002\u0010\u0015\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J\b\u0010$\u001a\u00020#H\u0016R \u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010)\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010%\u001a\u0004\b(\u0010'R \u0010,\u001a\u00020\b8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'R\u0017\u00100\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b.\u0010/R\u0017\u00103\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b1\u0010%\u001a\u0004\b2\u0010'R \u0010\r\u001a\u00020\b8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0016\u0010%\u001a\u0004\b4\u0010'R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b5\u0010-\u001a\u0004\b6\u0010/R \u0010\u0012\u001a\u00020\u00118\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u001d\u00107\u001a\u0004\b8\u00109R \u0010\u0015\u001a\u00020\b8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b:\u0010%\u001a\u0004\b;\u0010'R\u0018\u0010=\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010<R\u001e\u0010@\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R*\u0010\u0010\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u000f8\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u0012\u0004\bE\u0010F\u001a\u0004\bB\u0010DR\u001a\u0010 \u001a\u00020\u001f8GX\u0087\u0004¢\u0006\f\u0012\u0004\bI\u0010F\u001a\u0004\bG\u0010HR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8GX\u0087\u0004¢\u0006\f\u0012\u0004\bL\u0010F\u001a\u0004\bJ\u0010KR\u0017\u0010O\u001a\u00020\n8F¢\u0006\f\u0012\u0004\bN\u0010F\u001a\u0004\bM\u0010/\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006W"}, d2 = {"Landroidx/compose/ui/input/pointer/y;", "", "Lkotlin/b2;", ak.av, "Landroidx/compose/ui/input/pointer/x;", "id", "", "currentTime", "Lb1/f;", "currentPosition", "", "currentPressed", "previousTime", "previousPosition", "previousPressed", "Landroidx/compose/ui/input/pointer/e;", "consumed", "Landroidx/compose/ui/input/pointer/m0;", "type", "d", "(JJJZJJZLandroidx/compose/ui/input/pointer/e;I)Landroidx/compose/ui/input/pointer/y;", "scrollDelta", "f", "(JJJZJJZIJ)Landroidx/compose/ui/input/pointer/y;", "b", "(JJJZJJZLandroidx/compose/ui/input/pointer/e;IJ)Landroidx/compose/ui/input/pointer/y;", "", "Landroidx/compose/ui/input/pointer/f;", "historical", RXScreenCaptureService.KEY_HEIGHT, "(JJJZJJZILjava/util/List;J)Landroidx/compose/ui/input/pointer/y;", "", "pressure", "j", "(JJJZFJJZILjava/util/List;J)Landroidx/compose/ui/input/pointer/y;", "", "toString", "J", "p", "()J", ak.aD, "uptimeMillis", ak.aF, "q", CommonNetImpl.POSITION, "Z", "r", "()Z", "pressed", "e", RXScreenCaptureService.KEY_WIDTH, "previousUptimeMillis", ak.aG, "g", "v", "I", "y", "()I", "i", "x", "Ljava/lang/Float;", "_pressure", "k", "Ljava/util/List;", "_historical", "<set-?>", "l", "Landroidx/compose/ui/input/pointer/e;", "()Landroidx/compose/ui/input/pointer/e;", "getConsumed$annotations", "()V", ak.aB, "()F", "getPressure$annotations", "n", "()Ljava/util/List;", "getHistorical$annotations", androidx.exifinterface.media.a.W4, "isConsumed$annotations", "isConsumed", "isInitiallyConsumed", "<init>", "(JJJZJJZZIJLkotlin/jvm/internal/u;)V", "(JJJZJJZLandroidx/compose/ui/input/pointer/e;ILkotlin/jvm/internal/u;)V", "(JJJZJJZZILjava/util/List;JLkotlin/jvm/internal/u;)V", "(JJJZFJJZZILjava/util/List;JLkotlin/jvm/internal/u;)V", "(JJJZFJJZZIJLkotlin/jvm/internal/u;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class PointerInputChange {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long uptimeMillis;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long position;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean pressed;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final long previousUptimeMillis;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final long previousPosition;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean previousPressed;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final int type;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long scrollDelta;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Float _pressure;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private List<HistoricalChange> _historical;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private e consumed;

    private PointerInputChange(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15) {
        this(j10, j11, j12, z10, j13, j14, z11, z12, i10, j15, (kotlin.jvm.internal.u) null);
        this._pressure = Float.valueOf(f10);
    }

    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, int i11, kotlin.jvm.internal.u uVar) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, (i11 & 512) != 0 ? m0.INSTANCE.d() : i10, (i11 & 1024) != 0 ? b1.f.f30364b.e() : j15, (kotlin.jvm.internal.u) null);
    }

    @androidx.compose.ui.g
    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, kotlin.jvm.internal.u uVar) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, j15);
    }

    private PointerInputChange(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, List<HistoricalChange> list, long j15) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, j15, (kotlin.jvm.internal.u) null);
        this._historical = list;
    }

    @androidx.compose.ui.g
    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, List list, long j15, kotlin.jvm.internal.u uVar) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, (List<HistoricalChange>) list, j15);
    }

    private PointerInputChange(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, e eVar, int i10) {
        this(j10, j11, j12, z10, 1.0f, j13, j14, z11, eVar.getDownChange() || eVar.getPositionChange(), i10, b1.f.f30364b.e(), (kotlin.jvm.internal.u) null);
    }

    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, e eVar, int i10, int i11, kotlin.jvm.internal.u uVar) {
        this(j10, j11, j12, z10, j13, j14, z11, eVar, (i11 & 256) != 0 ? m0.INSTANCE.d() : i10, (kotlin.jvm.internal.u) null);
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Use another constructor with `scrollDelta` and without `ConsumedData` instead", replaceWith = @s0(expression = "this(id, uptimeMillis, position, pressed, previousUptimeMillis, previousPosition, previousPressed, consumed.downChange || consumed.positionChange, type, Offset.Zero)", imports = {}))
    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, e eVar, int i10, kotlin.jvm.internal.u uVar) {
        this(j10, j11, j12, z10, j13, j14, z11, eVar, i10);
    }

    private PointerInputChange(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, boolean z12, int i10, long j15) {
        this.id = j10;
        this.uptimeMillis = j11;
        this.position = j12;
        this.pressed = z10;
        this.previousUptimeMillis = j13;
        this.previousPosition = j14;
        this.previousPressed = z11;
        this.type = i10;
        this.scrollDelta = j15;
        this.consumed = new e(z12, z12);
    }

    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, int i11, kotlin.jvm.internal.u uVar) {
        this(j10, j11, j12, z10, j13, j14, z11, z12, (i11 & 256) != 0 ? m0.INSTANCE.d() : i10, (i11 & 512) != 0 ? b1.f.f30364b.e() : j15, (kotlin.jvm.internal.u) null);
    }

    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, kotlin.jvm.internal.u uVar) {
        this(j10, j11, j12, z10, j13, j14, z11, z12, i10, j15);
    }

    private PointerInputChange(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, boolean z12, int i10, List<HistoricalChange> list, long j15) {
        this(j10, j11, j12, z10, 1.0f, j13, j14, z11, z12, i10, list, j15, (kotlin.jvm.internal.u) null);
        this._historical = list;
    }

    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, boolean z12, int i10, List list, long j15, kotlin.jvm.internal.u uVar) {
        this(j10, j11, j12, z10, j13, j14, z11, z12, i10, (List<HistoricalChange>) list, j15);
    }

    public static /* synthetic */ void B() {
    }

    @kotlin.k(message = "use isConsumed and consume() pair of methods instead")
    public static /* synthetic */ void m() {
    }

    @androidx.compose.ui.g
    public static /* synthetic */ void o() {
    }

    @androidx.compose.ui.g
    public static /* synthetic */ void t() {
    }

    public final boolean A() {
        return this.consumed.getDownChange() || this.consumed.getPositionChange();
    }

    public final void a() {
        this.consumed.e(true);
        this.consumed.f(true);
    }

    @dl.d
    @kotlin.k(message = "Partial consumption has been deprecated. Use copy() instead without `consumed` parameter to create a shallow copy or a constructor to create a new PointerInputChange", replaceWith = @s0(expression = "copy(id, currentTime, currentPosition, currentPressed, previousTime, previousPosition, previousPressed, type, scrollDelta)", imports = {}))
    public final PointerInputChange b(long id2, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, @dl.d e consumed, int type, long scrollDelta) {
        kotlin.jvm.internal.f0.p(consumed, "consumed");
        PointerInputChange pointerInputChange = new PointerInputChange(id2, currentTime, currentPosition, currentPressed, s(), previousTime, previousPosition, previousPressed, consumed.getDownChange() || consumed.getPositionChange(), type, n(), scrollDelta, (kotlin.jvm.internal.u) null);
        this.consumed = consumed;
        return pointerInputChange;
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Use another copy() method with scrollDelta parameter instead", replaceWith = @s0(expression = "copy(id,currentTime, currentPosition, currentPressed, previousTime,previousPosition, previousPressed, consumed, type, this.scrollDelta)", imports = {}))
    public final /* synthetic */ PointerInputChange d(long id2, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, e consumed, int type) {
        kotlin.jvm.internal.f0.p(consumed, "consumed");
        PointerInputChange pointerInputChange = new PointerInputChange(id2, currentTime, currentPosition, currentPressed, s(), previousTime, previousPosition, previousPressed, consumed.getDownChange() || consumed.getPositionChange(), type, n(), this.scrollDelta, (kotlin.jvm.internal.u) null);
        this.consumed = consumed;
        return pointerInputChange;
    }

    @dl.d
    public final PointerInputChange f(long id2, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, int type, long scrollDelta) {
        PointerInputChange pointerInputChange = new PointerInputChange(id2, currentTime, currentPosition, currentPressed, s(), previousTime, previousPosition, previousPressed, false, type, (List) n(), scrollDelta, (kotlin.jvm.internal.u) null);
        pointerInputChange.consumed = this.consumed;
        return pointerInputChange;
    }

    @androidx.compose.ui.g
    @dl.d
    public final PointerInputChange h(long id2, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, int type, @dl.d List<HistoricalChange> historical, long scrollDelta) {
        kotlin.jvm.internal.f0.p(historical, "historical");
        PointerInputChange pointerInputChange = new PointerInputChange(id2, currentTime, currentPosition, currentPressed, s(), previousTime, previousPosition, previousPressed, false, type, (List) historical, scrollDelta, (kotlin.jvm.internal.u) null);
        pointerInputChange.consumed = this.consumed;
        return pointerInputChange;
    }

    @androidx.compose.ui.g
    @dl.d
    public final PointerInputChange j(long id2, long currentTime, long currentPosition, boolean currentPressed, float pressure, long previousTime, long previousPosition, boolean previousPressed, int type, @dl.d List<HistoricalChange> historical, long scrollDelta) {
        kotlin.jvm.internal.f0.p(historical, "historical");
        PointerInputChange pointerInputChange = new PointerInputChange(id2, currentTime, currentPosition, currentPressed, pressure, previousTime, previousPosition, previousPressed, false, type, (List) historical, scrollDelta, (kotlin.jvm.internal.u) null);
        pointerInputChange.consumed = this.consumed;
        return pointerInputChange;
    }

    @dl.d
    /* JADX INFO: renamed from: l, reason: from getter */
    public final e getConsumed() {
        return this.consumed;
    }

    @androidx.compose.ui.g
    @dl.d
    public final List<HistoricalChange> n() {
        List<HistoricalChange> list = this._historical;
        return list == null ? CollectionsKt__CollectionsKt.E() : list;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final long getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getPressed() {
        return this.pressed;
    }

    @androidx.compose.ui.g
    public final float s() {
        Float f10 = this._pressure;
        if (f10 != null) {
            return f10.floatValue();
        }
        return 0.0f;
    }

    @dl.d
    public String toString() {
        return "PointerInputChange(id=" + ((Object) x.g(this.id)) + ", uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) b1.f.y(this.position)) + ", pressed=" + this.pressed + ", pressure=" + s() + ", previousUptimeMillis=" + this.previousUptimeMillis + ", previousPosition=" + ((Object) b1.f.y(this.previousPosition)) + ", previousPressed=" + this.previousPressed + ", isConsumed=" + A() + ", type=" + ((Object) m0.k(this.type)) + ", historical=" + n() + ",scrollDelta=" + ((Object) b1.f.y(this.scrollDelta)) + ')';
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final long getPreviousPosition() {
        return this.previousPosition;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final long getPreviousUptimeMillis() {
        return this.previousUptimeMillis;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final long getScrollDelta() {
        return this.scrollDelta;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }
}
