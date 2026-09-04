package kotlinx.coroutines.channels;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlinx.coroutines.internal.o0;

/* JADX INFO: compiled from: AbstractChannel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u0004\u0018\u00010\u0001H\u0082\bø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u0006\u0012\u0002\b\u00030\u0005H\u0082\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\u000b\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0014\u0010\r\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\n\"\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0016\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u0012\u0004\b\u0015\u0010\u0012\"\u001a\u0010\u0019\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u0012\u0004\b\u0018\u0010\u0012\"\u001a\u0010\u001c\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u0012\u0004\b\u001b\u0010\u0012\"\u001a\u0010\u001e\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u0012\u0004\b\u001d\u0010\u0012\"\u001a\u0010 \u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u0012\u0004\b\u001f\u0010\u0012*(\b\u0000\u0010$\"\u0010\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0004\u0012\u00020#0!2\u0010\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0004\u0012\u00020#0!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {androidx.exifinterface.media.a.S4, "", "Lkotlinx/coroutines/channels/n;", "g", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/p;", RXScreenCaptureService.KEY_HEIGHT, "(Lkotlinx/coroutines/channels/p;)Ljava/lang/Object;", "", ak.av, "I", "RECEIVE_THROWS_ON_CLOSE", "b", "RECEIVE_RESULT", "Lkotlinx/coroutines/internal/o0;", ak.aF, "Lkotlinx/coroutines/internal/o0;", "getEMPTY$annotations", "()V", "EMPTY", "d", "getOFFER_SUCCESS$annotations", "OFFER_SUCCESS", "e", "getOFFER_FAILED$annotations", "OFFER_FAILED", "f", "getPOLL_FAILED$annotations", "POLL_FAILED", "getENQUEUE_FAILED$annotations", "ENQUEUE_FAILED", "getHANDLER_INVOKED$annotations", "HANDLER_INVOKED", "Lkotlin/Function1;", "", "Lkotlin/b2;", "Handler", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f129021a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f129022b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final o0 f129023c = new o0("EMPTY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final o0 f129024d = new o0("OFFER_SUCCESS");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final o0 f129025e = new o0("OFFER_FAILED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final o0 f129026f = new o0("POLL_FAILED");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final o0 f129027g = new o0("ENQUEUE_FAILED");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final o0 f129028h = new o0("ON_CLOSE_HANDLER_INVOKED");

    public static /* synthetic */ void a() {
    }

    public static /* synthetic */ void b() {
    }

    public static /* synthetic */ void c() {
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void e() {
    }

    public static /* synthetic */ void f() {
    }

    private static final <E> Object g(Object obj) {
        return obj instanceof p ? n.INSTANCE.a(((p) obj).closeCause) : n.INSTANCE.c(obj);
    }

    private static final <E> Object h(p<?> pVar) {
        return n.INSTANCE.a(pVar.closeCause);
    }
}
