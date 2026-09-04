package okhttp3;

import com.max.hbwallet.bean.MallCouponObj;
import com.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.s0;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http.HttpHeaders;
import okio.Buffer;
import okio.BufferedSource;
import okio.Source;

/* JADX INFO: compiled from: Response.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u001eB}\b\u0000\u0012\u0006\u00105\u001a\u00020\u0002\u0012\u0006\u00108\u001a\u00020\u0005\u0012\u0006\u0010;\u001a\u00020\u000b\u0012\u0006\u0010=\u001a\u00020\b\u0012\b\u0010@\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010D\u001a\u00020\u0016\u0012\b\u0010G\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010K\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010M\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010P\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010S\u001a\u00020\u001a\u0012\u0006\u0010U\u001a\u00020\u001a\u0012\b\u0010Z\u001a\u0004\u0018\u00010V¢\u0006\u0004\bc\u0010dJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00122\u0006\u0010\u0011\u001a\u00020\u000bJ\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000bH\u0007J\u000f\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u0016J\u000e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0006\u0010!\u001a\u00020 J\u0011\u0010\"\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\"\u0010#J\u0011\u0010$\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b$\u0010#J\u0011\u0010%\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b%\u0010#J\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0012J\u000f\u0010)\u001a\u00020(H\u0007¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u001aH\u0007¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u001aH\u0007¢\u0006\u0004\b-\u0010,J\b\u0010/\u001a\u00020.H\u0016J\b\u00100\u001a\u00020\u000bH\u0016R\u0018\u00102\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00101R\u0017\u00105\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b$\u00103\u001a\u0004\b4\u0010\u0004R\u0017\u00108\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010\u0007R\u0017\u0010;\u001a\u00020\u000b8\u0007¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b:\u0010\rR\u0017\u0010=\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b<\u0010\nR\u0019\u0010@\u001a\u0004\u0018\u00010\u000e8\u0007¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010\u0010R\u0017\u0010D\u001a\u00020\u00168\u0007¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010\u0018R\u0019\u0010G\u001a\u0004\u0018\u00010\u001c8\u0007¢\u0006\f\n\u0004\b\"\u0010E\u001a\u0004\bF\u0010\u001fR\u0019\u0010K\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010#R\u0019\u0010M\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b%\u0010I\u001a\u0004\bL\u0010#R\u0019\u0010P\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\bN\u0010I\u001a\u0004\bO\u0010#R\u0017\u0010S\u001a\u00020\u001a8\u0007¢\u0006\f\n\u0004\b\u0006\u0010Q\u001a\u0004\bR\u0010,R\u0017\u0010U\u001a\u00020\u001a8\u0007¢\u0006\f\n\u0004\b-\u0010Q\u001a\u0004\bT\u0010,R\u001c\u0010Z\u001a\u0004\u0018\u00010V8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010W\u001a\u0004\bX\u0010YR\u0011\u0010^\u001a\u00020[8F¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0011\u0010`\u001a\u00020[8F¢\u0006\u0006\u001a\u0004\b_\u0010]R\u0011\u0010b\u001a\u00020(8G¢\u0006\u0006\u001a\u0004\ba\u0010*¨\u0006e"}, d2 = {"Lokhttp3/c0;", "Ljava/io/Closeable;", "Lokhttp3/a0;", "o", "()Lokhttp3/a0;", "Lokhttp3/Protocol;", "m", "()Lokhttp3/Protocol;", "", "d", "()I", "", "g", "()Ljava/lang/String;", "Lokhttp3/Handshake;", "e", "()Lokhttp3/Handshake;", "name", "", "K", "defaultValue", "I", "Lokhttp3/s;", "f", "()Lokhttp3/s;", "Z", "", "byteCount", "Lokhttp3/d0;", "Q", ak.av, "()Lokhttp3/d0;", "Lokhttp3/c0$a;", "P", "i", "()Lokhttp3/c0;", ak.aF, "k", "Lokhttp3/g;", "t", "Lokhttp3/d;", "b", "()Lokhttp3/d;", "p", "()J", "n", "Lkotlin/b2;", "close", "toString", "Lokhttp3/d;", "lazyCacheControl", "Lokhttp3/a0;", androidx.exifinterface.media.a.T4, "request", "Lokhttp3/Protocol;", androidx.exifinterface.media.a.R4, SwitchDetailActivity.P, "Ljava/lang/String;", "N", "message", "x", "code", "Lokhttp3/Handshake;", androidx.exifinterface.media.a.W4, "handshake", RXScreenCaptureService.KEY_HEIGHT, "Lokhttp3/s;", "L", "headers", "Lokhttp3/d0;", "q", "body", "j", "Lokhttp3/c0;", "O", "networkResponse", ak.aB, "cacheResponse", "l", "R", "priorResponse", "J", "Y", "sentRequestAtMillis", androidx.exifinterface.media.a.X4, "receivedResponseAtMillis", "Lokhttp3/internal/connection/Exchange;", "Lokhttp3/internal/connection/Exchange;", ak.aD, "()Lokhttp3/internal/connection/Exchange;", MallCouponObj.TYPE_EXCHANGE, "", "c1", "()Z", "isSuccessful", "M", "isRedirect", "r", "cacheControl", "<init>", "(Lokhttp3/a0;Lokhttp3/Protocol;Ljava/lang/String;ILokhttp3/Handshake;Lokhttp3/s;Lokhttp3/d0;Lokhttp3/c0;Lokhttp3/c0;Lokhttp3/c0;JJLokhttp3/internal/connection/Exchange;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class c0 implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private d lazyCacheControl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a0 request;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Protocol protocol;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final String message;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final int code;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final Handshake handshake;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final s headers;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final d0 body;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final c0 networkResponse;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final c0 cacheResponse;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final c0 priorResponse;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final long sentRequestAtMillis;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long receivedResponseAtMillis;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final Exchange exchange;

    /* JADX INFO: compiled from: Response.kt */
    @Metadata(bv = {}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b!\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\bh\u0010iB\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bh\u0010XJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0012\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\u0010\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0012\u0010 \u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016J\u0012\u0010\"\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010$\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010&\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010)\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'H\u0016J\u0010\u0010+\u001a\u00020\u00002\u0006\u0010*\u001a\u00020'H\u0016J\u0017\u0010.\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,H\u0000¢\u0006\u0004\b.\u0010/J\b\u00100\u001a\u00020\u0004H\u0016R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u0010;\u001a\u0004\b<\u0010=\"\u0004\b;\u0010>R$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010\u001c\u001a\u00020I8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010!\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bP\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010#\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bY\u0010T\u001a\u0004\bY\u0010V\"\u0004\bZ\u0010XR$\u0010%\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010T\u001a\u0004\b[\u0010V\"\u0004\b\\\u0010XR\"\u0010(\u001a\u00020'8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010*\u001a\u00020'8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u0010^\u001a\u0004\bc\u0010`\"\u0004\bd\u0010bR$\u0010g\u001a\u0004\u0018\u00010,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010e\u001a\u0004\b]\u0010f\"\u0004\b^\u0010/¨\u0006j"}, d2 = {"Lokhttp3/c0$a;", "", "", "name", "Lokhttp3/c0;", "response", "Lkotlin/b2;", "f", "e", "Lokhttp3/a0;", "request", androidx.exifinterface.media.a.S4, "Lokhttp3/Protocol;", SwitchDetailActivity.P, "B", "", "code", "g", "message", "y", "Lokhttp3/Handshake;", "handshake", ak.aG, "value", "v", ak.av, "D", "Lokhttp3/s;", "headers", RXScreenCaptureService.KEY_WIDTH, "Lokhttp3/d0;", "body", "b", "networkResponse", ak.aD, "cacheResponse", "d", "priorResponse", androidx.exifinterface.media.a.W4, "", "sentRequestAtMillis", "F", "receivedResponseAtMillis", "C", "Lokhttp3/internal/connection/Exchange;", "deferredTrailers", "x", "(Lokhttp3/internal/connection/Exchange;)V", ak.aF, "Lokhttp3/a0;", ak.aB, "()Lokhttp3/a0;", "R", "(Lokhttp3/a0;)V", "Lokhttp3/Protocol;", "q", "()Lokhttp3/Protocol;", "P", "(Lokhttp3/Protocol;)V", "I", "j", "()I", "(I)V", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "M", "(Ljava/lang/String;)V", "Lokhttp3/Handshake;", "l", "()Lokhttp3/Handshake;", "K", "(Lokhttp3/Handshake;)V", "Lokhttp3/s$a;", "Lokhttp3/s$a;", "m", "()Lokhttp3/s$a;", "L", "(Lokhttp3/s$a;)V", "Lokhttp3/d0;", RXScreenCaptureService.KEY_HEIGHT, "()Lokhttp3/d0;", "G", "(Lokhttp3/d0;)V", "Lokhttp3/c0;", "o", "()Lokhttp3/c0;", "N", "(Lokhttp3/c0;)V", "i", "H", "p", "O", "k", "J", "t", "()J", androidx.exifinterface.media.a.R4, "(J)V", "r", "Q", "Lokhttp3/internal/connection/Exchange;", "()Lokhttp3/internal/connection/Exchange;", MallCouponObj.TYPE_EXCHANGE, "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private a0 request;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private Protocol protocol;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int code;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private String message;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private Handshake handshake;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private s.a headers;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private d0 body;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private c0 networkResponse;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private c0 cacheResponse;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private c0 priorResponse;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private long sentRequestAtMillis;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private long receivedResponseAtMillis;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private Exchange exchange;

        public a() {
            this.code = -1;
            this.headers = new s.a();
        }

        public a(@dl.d c0 response) {
            kotlin.jvm.internal.f0.p(response, "response");
            this.code = -1;
            this.request = response.getRequest();
            this.protocol = response.getProtocol();
            this.code = response.x();
            this.message = response.getMessage();
            this.handshake = response.getHandshake();
            this.headers = response.getHeaders().l();
            this.body = response.q();
            this.networkResponse = response.getNetworkResponse();
            this.cacheResponse = response.s();
            this.priorResponse = response.getPriorResponse();
            this.sentRequestAtMillis = response.getSentRequestAtMillis();
            this.receivedResponseAtMillis = response.getReceivedResponseAtMillis();
            this.exchange = response.getExchange();
        }

        private final void e(c0 c0Var) {
            if (c0Var != null) {
                if (!(c0Var.q() == null)) {
                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                }
            }
        }

        private final void f(String str, c0 c0Var) {
            if (c0Var != null) {
                if (!(c0Var.q() == null)) {
                    throw new IllegalArgumentException((str + ".body != null").toString());
                }
                if (!(c0Var.getNetworkResponse() == null)) {
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                if (!(c0Var.s() == null)) {
                    throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                }
                if (c0Var.getPriorResponse() == null) {
                    return;
                }
                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
            }
        }

        @dl.d
        public a A(@dl.e c0 priorResponse) {
            e(priorResponse);
            this.priorResponse = priorResponse;
            return this;
        }

        @dl.d
        public a B(@dl.d Protocol protocol) {
            kotlin.jvm.internal.f0.p(protocol, "protocol");
            this.protocol = protocol;
            return this;
        }

        @dl.d
        public a C(long receivedResponseAtMillis) {
            this.receivedResponseAtMillis = receivedResponseAtMillis;
            return this;
        }

        @dl.d
        public a D(@dl.d String name) {
            kotlin.jvm.internal.f0.p(name, "name");
            this.headers.l(name);
            return this;
        }

        @dl.d
        public a E(@dl.d a0 request) {
            kotlin.jvm.internal.f0.p(request, "request");
            this.request = request;
            return this;
        }

        @dl.d
        public a F(long sentRequestAtMillis) {
            this.sentRequestAtMillis = sentRequestAtMillis;
            return this;
        }

        public final void G(@dl.e d0 d0Var) {
            this.body = d0Var;
        }

        public final void H(@dl.e c0 c0Var) {
            this.cacheResponse = c0Var;
        }

        public final void I(int i10) {
            this.code = i10;
        }

        public final void J(@dl.e Exchange exchange) {
            this.exchange = exchange;
        }

        public final void K(@dl.e Handshake handshake) {
            this.handshake = handshake;
        }

        public final void L(@dl.d s.a aVar) {
            kotlin.jvm.internal.f0.p(aVar, "<set-?>");
            this.headers = aVar;
        }

        public final void M(@dl.e String str) {
            this.message = str;
        }

        public final void N(@dl.e c0 c0Var) {
            this.networkResponse = c0Var;
        }

        public final void O(@dl.e c0 c0Var) {
            this.priorResponse = c0Var;
        }

        public final void P(@dl.e Protocol protocol) {
            this.protocol = protocol;
        }

        public final void Q(long j10) {
            this.receivedResponseAtMillis = j10;
        }

        public final void R(@dl.e a0 a0Var) {
            this.request = a0Var;
        }

        public final void S(long j10) {
            this.sentRequestAtMillis = j10;
        }

        @dl.d
        public a a(@dl.d String name, @dl.d String value) {
            kotlin.jvm.internal.f0.p(name, "name");
            kotlin.jvm.internal.f0.p(value, "value");
            this.headers.b(name, value);
            return this;
        }

        @dl.d
        public a b(@dl.e d0 body) {
            this.body = body;
            return this;
        }

        @dl.d
        public c0 c() {
            int i10 = this.code;
            if (!(i10 >= 0)) {
                throw new IllegalStateException(("code < 0: " + this.code).toString());
            }
            a0 a0Var = this.request;
            if (a0Var == null) {
                throw new IllegalStateException("request == null".toString());
            }
            Protocol protocol = this.protocol;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null".toString());
            }
            String str = this.message;
            if (str != null) {
                return new c0(a0Var, protocol, str, i10, this.handshake, this.headers.i(), this.body, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange);
            }
            throw new IllegalStateException("message == null".toString());
        }

        @dl.d
        public a d(@dl.e c0 cacheResponse) {
            f("cacheResponse", cacheResponse);
            this.cacheResponse = cacheResponse;
            return this;
        }

        @dl.d
        public a g(int code) {
            this.code = code;
            return this;
        }

        @dl.e
        /* JADX INFO: renamed from: h, reason: from getter */
        public final d0 getBody() {
            return this.body;
        }

        @dl.e
        /* JADX INFO: renamed from: i, reason: from getter */
        public final c0 getCacheResponse() {
            return this.cacheResponse;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        @dl.e
        /* JADX INFO: renamed from: k, reason: from getter */
        public final Exchange getExchange() {
            return this.exchange;
        }

        @dl.e
        /* JADX INFO: renamed from: l, reason: from getter */
        public final Handshake getHandshake() {
            return this.handshake;
        }

        @dl.d
        /* JADX INFO: renamed from: m, reason: from getter */
        public final s.a getHeaders() {
            return this.headers;
        }

        @dl.e
        /* JADX INFO: renamed from: n, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @dl.e
        /* JADX INFO: renamed from: o, reason: from getter */
        public final c0 getNetworkResponse() {
            return this.networkResponse;
        }

        @dl.e
        /* JADX INFO: renamed from: p, reason: from getter */
        public final c0 getPriorResponse() {
            return this.priorResponse;
        }

        @dl.e
        /* JADX INFO: renamed from: q, reason: from getter */
        public final Protocol getProtocol() {
            return this.protocol;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final long getReceivedResponseAtMillis() {
            return this.receivedResponseAtMillis;
        }

        @dl.e
        /* JADX INFO: renamed from: s, reason: from getter */
        public final a0 getRequest() {
            return this.request;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final long getSentRequestAtMillis() {
            return this.sentRequestAtMillis;
        }

        @dl.d
        public a u(@dl.e Handshake handshake) {
            this.handshake = handshake;
            return this;
        }

        @dl.d
        public a v(@dl.d String name, @dl.d String value) {
            kotlin.jvm.internal.f0.p(name, "name");
            kotlin.jvm.internal.f0.p(value, "value");
            this.headers.m(name, value);
            return this;
        }

        @dl.d
        public a w(@dl.d s headers) {
            kotlin.jvm.internal.f0.p(headers, "headers");
            this.headers = headers.l();
            return this;
        }

        public final void x(@dl.d Exchange deferredTrailers) {
            kotlin.jvm.internal.f0.p(deferredTrailers, "deferredTrailers");
            this.exchange = deferredTrailers;
        }

        @dl.d
        public a y(@dl.d String message) {
            kotlin.jvm.internal.f0.p(message, "message");
            this.message = message;
            return this;
        }

        @dl.d
        public a z(@dl.e c0 networkResponse) {
            f("networkResponse", networkResponse);
            this.networkResponse = networkResponse;
            return this;
        }
    }

    public c0(@dl.d a0 request, @dl.d Protocol protocol, @dl.d String message, int i10, @dl.e Handshake handshake, @dl.d s headers, @dl.e d0 d0Var, @dl.e c0 c0Var, @dl.e c0 c0Var2, @dl.e c0 c0Var3, long j10, long j11, @dl.e Exchange exchange) {
        kotlin.jvm.internal.f0.p(request, "request");
        kotlin.jvm.internal.f0.p(protocol, "protocol");
        kotlin.jvm.internal.f0.p(message, "message");
        kotlin.jvm.internal.f0.p(headers, "headers");
        this.request = request;
        this.protocol = protocol;
        this.message = message;
        this.code = i10;
        this.handshake = handshake;
        this.headers = headers;
        this.body = d0Var;
        this.networkResponse = c0Var;
        this.cacheResponse = c0Var2;
        this.priorResponse = c0Var3;
        this.sentRequestAtMillis = j10;
        this.receivedResponseAtMillis = j11;
        this.exchange = exchange;
    }

    public static /* synthetic */ String J(c0 c0Var, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return c0Var.I(str, str2);
    }

    @xh.h(name = "handshake")
    @dl.e
    /* JADX INFO: renamed from: A, reason: from getter */
    public final Handshake getHandshake() {
        return this.handshake;
    }

    @dl.e
    @xh.i
    public final String C(@dl.d String str) {
        return J(this, str, null, 2, null);
    }

    @dl.e
    @xh.i
    public final String I(@dl.d String name, @dl.e String defaultValue) {
        kotlin.jvm.internal.f0.p(name, "name");
        String strE = this.headers.e(name);
        return strE != null ? strE : defaultValue;
    }

    @dl.d
    public final List<String> K(@dl.d String name) {
        kotlin.jvm.internal.f0.p(name, "name");
        return this.headers.w(name);
    }

    @dl.d
    @xh.h(name = "headers")
    /* JADX INFO: renamed from: L, reason: from getter */
    public final s getHeaders() {
        return this.headers;
    }

    public final boolean M() {
        int i10 = this.code;
        if (i10 != 307 && i10 != 308) {
            switch (i10) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    @dl.d
    @xh.h(name = "message")
    /* JADX INFO: renamed from: N, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @xh.h(name = "networkResponse")
    @dl.e
    /* JADX INFO: renamed from: O, reason: from getter */
    public final c0 getNetworkResponse() {
        return this.networkResponse;
    }

    @dl.d
    public final a P() {
        return new a(this);
    }

    @dl.d
    public final d0 Q(long byteCount) throws IOException {
        d0 d0Var = this.body;
        kotlin.jvm.internal.f0.m(d0Var);
        BufferedSource bufferedSourcePeek = d0Var.getF132479c().peek();
        Buffer buffer = new Buffer();
        bufferedSourcePeek.request(byteCount);
        buffer.write((Source) bufferedSourcePeek, Math.min(byteCount, bufferedSourcePeek.getBuffer().size()));
        return d0.INSTANCE.f(buffer, this.body.getF132480d(), buffer.size());
    }

    @xh.h(name = "priorResponse")
    @dl.e
    /* JADX INFO: renamed from: R, reason: from getter */
    public final c0 getPriorResponse() {
        return this.priorResponse;
    }

    @dl.d
    @xh.h(name = SwitchDetailActivity.P)
    /* JADX INFO: renamed from: S, reason: from getter */
    public final Protocol getProtocol() {
        return this.protocol;
    }

    @xh.h(name = "receivedResponseAtMillis")
    /* JADX INFO: renamed from: V, reason: from getter */
    public final long getReceivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @dl.d
    @xh.h(name = "request")
    /* JADX INFO: renamed from: W, reason: from getter */
    public final a0 getRequest() {
        return this.request;
    }

    @xh.h(name = "sentRequestAtMillis")
    /* JADX INFO: renamed from: Y, reason: from getter */
    public final long getSentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    @dl.d
    public final s Z() throws IOException {
        Exchange exchange = this.exchange;
        if (exchange != null) {
            return exchange.trailers();
        }
        throw new IllegalStateException("trailers not available".toString());
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "body", imports = {}))
    @xh.h(name = "-deprecated_body")
    @dl.e
    /* JADX INFO: renamed from: a, reason: from getter */
    public final d0 getBody() {
        return this.body;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "cacheControl", imports = {}))
    @xh.h(name = "-deprecated_cacheControl")
    public final d b() {
        return r();
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "cacheResponse", imports = {}))
    @xh.h(name = "-deprecated_cacheResponse")
    @dl.e
    /* JADX INFO: renamed from: c, reason: from getter */
    public final c0 getCacheResponse() {
        return this.cacheResponse;
    }

    public final boolean c1() {
        int i10 = this.code;
        return 200 <= i10 && 299 >= i10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        d0 d0Var = this.body;
        if (d0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        d0Var.close();
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "code", imports = {}))
    @xh.h(name = "-deprecated_code")
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "handshake", imports = {}))
    @xh.h(name = "-deprecated_handshake")
    @dl.e
    public final Handshake e() {
        return this.handshake;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "headers", imports = {}))
    @xh.h(name = "-deprecated_headers")
    public final s f() {
        return this.headers;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "message", imports = {}))
    @xh.h(name = "-deprecated_message")
    public final String g() {
        return this.message;
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "networkResponse", imports = {}))
    @xh.h(name = "-deprecated_networkResponse")
    @dl.e
    public final c0 i() {
        return this.networkResponse;
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "priorResponse", imports = {}))
    @xh.h(name = "-deprecated_priorResponse")
    @dl.e
    public final c0 k() {
        return this.priorResponse;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = SwitchDetailActivity.P, imports = {}))
    @xh.h(name = "-deprecated_protocol")
    public final Protocol m() {
        return this.protocol;
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "receivedResponseAtMillis", imports = {}))
    @xh.h(name = "-deprecated_receivedResponseAtMillis")
    public final long n() {
        return this.receivedResponseAtMillis;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "request", imports = {}))
    @xh.h(name = "-deprecated_request")
    public final a0 o() {
        return this.request;
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "sentRequestAtMillis", imports = {}))
    @xh.h(name = "-deprecated_sentRequestAtMillis")
    public final long p() {
        return this.sentRequestAtMillis;
    }

    @xh.h(name = "body")
    @dl.e
    public final d0 q() {
        return this.body;
    }

    @dl.d
    @xh.h(name = "cacheControl")
    public final d r() {
        d dVar = this.lazyCacheControl;
        if (dVar != null) {
            return dVar;
        }
        d dVarC = d.INSTANCE.c(this.headers);
        this.lazyCacheControl = dVarC;
        return dVarC;
    }

    @xh.h(name = "cacheResponse")
    @dl.e
    public final c0 s() {
        return this.cacheResponse;
    }

    @dl.d
    public final List<g> t() {
        String str;
        s sVar = this.headers;
        int i10 = this.code;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i10 != 407) {
                return CollectionsKt__CollectionsKt.E();
            }
            str = "Proxy-Authenticate";
        }
        return HttpHeaders.parseChallenges(sVar, str);
    }

    @dl.d
    public String toString() {
        return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.q() + '}';
    }

    @xh.h(name = "code")
    public final int x() {
        return this.code;
    }

    @xh.h(name = MallCouponObj.TYPE_EXCHANGE)
    @dl.e
    /* JADX INFO: renamed from: z, reason: from getter */
    public final Exchange getExchange() {
        return this.exchange;
    }
}
