package kotlinx.coroutines.channels;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.s0;
import kotlinx.coroutines.internal.q0;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/channels/k;", androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/channels/b0;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "C1", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface k<E> extends b0<E>, ReceiveChannel<E> {

    /* JADX INFO: renamed from: C1, reason: from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f129056a;
    public static final int D1 = Integer.MAX_VALUE;
    public static final int E1 = 0;
    public static final int F1 = -1;
    public static final int G1 = -2;
    public static final int H1 = -3;

    @dl.d
    public static final String I1 = "kotlinx.coroutines.channels.defaultBuffer";

    /* JADX INFO: compiled from: Channel.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        @dl.d
        public static <E> kotlinx.coroutines.selects.d<E> b(@dl.d k<E> kVar) {
            return ReceiveChannel.DefaultImpls.d(kVar);
        }

        @kotlin.k(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @s0(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@dl.d k<E> kVar, E e10) {
            return b0.a.c(kVar, e10);
        }

        @kotlin.k(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @s0(expression = "tryReceive().getOrNull()", imports = {}))
        @dl.e
        public static <E> E d(@dl.d k<E> kVar) {
            return (E) ReceiveChannel.DefaultImpls.h(kVar);
        }

        @kotlin.k(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @s0(expression = "receiveCatching().getOrNull()", imports = {}))
        @sh.h
        @dl.e
        public static <E> Object e(@dl.d k<E> kVar, @dl.d kotlin.coroutines.c<? super E> cVar) {
            return ReceiveChannel.DefaultImpls.i(kVar, cVar);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.k$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Channel.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/channels/k$b;", "", "", "b", "I", "UNLIMITED", ak.aF, "RENDEZVOUS", "d", "CONFLATED", "e", "BUFFERED", "f", "OPTIONAL_CHANNEL", "", "g", "Ljava/lang/String;", "DEFAULT_BUFFER_PROPERTY_NAME", RXScreenCaptureService.KEY_HEIGHT, ak.av, "()I", "CHANNEL_DEFAULT_CAPACITY", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final int UNLIMITED = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final int RENDEZVOUS = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public static final int CONFLATED = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public static final int BUFFERED = -2;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public static final int OPTIONAL_CHANNEL = -3;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @dl.d
        public static final String DEFAULT_BUFFER_PROPERTY_NAME = "kotlinx.coroutines.channels.defaultBuffer";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f129056a = new Companion();

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private static final int CHANNEL_DEFAULT_CAPACITY = q0.b("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);

        private Companion() {
        }

        public final int a() {
            return CHANNEL_DEFAULT_CAPACITY;
        }
    }
}
