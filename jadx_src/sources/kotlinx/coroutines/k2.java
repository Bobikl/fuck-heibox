package kotlinx.coroutines;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000\u001a\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000\"\u001a\u0010\b\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007\"\u001a\u0010\u000b\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u0012\u0004\b\n\u0010\u0007\"\u001a\u0010\u000e\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\f\u0010\u0005\u0012\u0004\b\r\u0010\u0007\"\u001a\u0010\u0011\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u0012\u0004\b\u0010\u0010\u0007\"\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0014\"\u001a\u0010\u001b\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0005\u0012\u0004\b\u001a\u0010\u0007\"\u001a\u0010 \u001a\u00020\u001c8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010\u0007\"\u001a\u0010#\u001a\u00020\u001c8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u0012\u0004\b\"\u0010\u0007¨\u0006$"}, d2 = {"", "g", "o", "Lkotlinx/coroutines/internal/o0;", ak.av, "Lkotlinx/coroutines/internal/o0;", "getCOMPLETING_ALREADY$annotations", "()V", "COMPLETING_ALREADY", "b", "getCOMPLETING_WAITING_CHILDREN$annotations", "COMPLETING_WAITING_CHILDREN", ak.aF, "getCOMPLETING_RETRY$annotations", "COMPLETING_RETRY", "d", "getTOO_LATE_TO_CANCEL$annotations", "TOO_LATE_TO_CANCEL", "", "e", "I", "RETRY", "f", "FALSE", "TRUE", RXScreenCaptureService.KEY_HEIGHT, "getSEALED$annotations", "SEALED", "Lkotlinx/coroutines/k1;", "i", "Lkotlinx/coroutines/k1;", "getEMPTY_NEW$annotations", "EMPTY_NEW", "j", "getEMPTY_ACTIVE$annotations", "EMPTY_ACTIVE", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class k2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f130254e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f130255f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f130256g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final kotlinx.coroutines.internal.o0 f130250a = new kotlinx.coroutines.internal.o0("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final kotlinx.coroutines.internal.o0 f130251b = new kotlinx.coroutines.internal.o0("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final kotlinx.coroutines.internal.o0 f130252c = new kotlinx.coroutines.internal.o0("COMPLETING_RETRY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final kotlinx.coroutines.internal.o0 f130253d = new kotlinx.coroutines.internal.o0("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final kotlinx.coroutines.internal.o0 f130257h = new kotlinx.coroutines.internal.o0("SEALED");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final k1 f130258i = new k1(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final k1 f130259j = new k1(true);

    @dl.e
    public static final Object g(@dl.e Object obj) {
        return obj instanceof x1 ? new y1((x1) obj) : obj;
    }

    private static /* synthetic */ void h() {
    }

    private static /* synthetic */ void i() {
    }

    public static /* synthetic */ void j() {
    }

    private static /* synthetic */ void k() {
    }

    private static /* synthetic */ void l() {
    }

    private static /* synthetic */ void m() {
    }

    private static /* synthetic */ void n() {
    }

    @dl.e
    public static final Object o(@dl.e Object obj) {
        x1 x1Var;
        y1 y1Var = obj instanceof y1 ? (y1) obj : null;
        return (y1Var == null || (x1Var = y1Var.state) == null) ? obj : x1Var;
    }
}
