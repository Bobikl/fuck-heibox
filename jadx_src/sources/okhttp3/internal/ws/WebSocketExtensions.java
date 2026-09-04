package okhttp3.internal.ws;

import dl.d;
import dl.e;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.t;
import n5.a;
import okhttp3.internal.Util;
import okhttp3.s;

/* JADX INFO: compiled from: WebSocketExtensions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cBE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003JN\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\u000e\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lokhttp3/internal/ws/WebSocketExtensions;", "", "perMessageDeflate", "", "clientMaxWindowBits", "", "clientNoContextTakeover", "serverMaxWindowBits", "serverNoContextTakeover", "unknownValues", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)V", "Ljava/lang/Integer;", "component1", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "component6", "copy", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)Lokhttp3/internal/ws/WebSocketExtensions;", "equals", "other", "hashCode", "noContextTakeover", "clientOriginated", "toString", "", "Companion", "okhttp"}, k = 1, mv = {1, 4, 0})
public final /* data */ class WebSocketExtensions {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String HEADER_WEB_SOCKET_EXTENSION = "Sec-WebSocket-Extensions";

    @e
    @xh.e
    public final Integer clientMaxWindowBits;

    @xh.e
    public final boolean clientNoContextTakeover;

    @xh.e
    public final boolean perMessageDeflate;

    @e
    @xh.e
    public final Integer serverMaxWindowBits;

    @xh.e
    public final boolean serverNoContextTakeover;

    @xh.e
    public final boolean unknownValues;

    /* JADX INFO: compiled from: WebSocketExtensions.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/ws/WebSocketExtensions$Companion;", "", "Lokhttp3/s;", "responseHeaders", "Lokhttp3/internal/ws/WebSocketExtensions;", "parse", "", "HEADER_WEB_SOCKET_EXTENSION", "Ljava/lang/String;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:51:0x00c3 A[PHI: r7 r9
  0x00c3: PHI (r7v6 java.lang.Integer) = (r7v4 java.lang.Integer), (r7v4 java.lang.Integer), (r7v8 java.lang.Integer) binds: [B:45:0x00b9, B:42:0x00b0, B:26:0x0089] A[DONT_GENERATE, DONT_INLINE]
  0x00c3: PHI (r9v9 java.lang.Integer) = (r9v4 java.lang.Integer), (r9v6 java.lang.Integer), (r9v4 java.lang.Integer) binds: [B:45:0x00b9, B:42:0x00b0, B:26:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
        @d
        public final WebSocketExtensions parse(@d s responseHeaders) throws IOException {
            f0.p(responseHeaders, "responseHeaders");
            int size = responseHeaders.size();
            boolean z10 = false;
            Integer numY0 = null;
            boolean z11 = false;
            Integer numY1 = null;
            boolean z12 = false;
            boolean z13 = false;
            for (int i10 = 0; i10 < size; i10++) {
                if (kotlin.text.u.L1(responseHeaders.i(i10), "Sec-WebSocket-Extensions", true)) {
                    String strV = responseHeaders.v(i10);
                    int i11 = 0;
                    while (i11 < strV.length()) {
                        int iDelimiterOffset$default = Util.delimiterOffset$default(strV, ',', i11, 0, 4, (Object) null);
                        int iDelimiterOffset = Util.delimiterOffset(strV, ';', i11, iDelimiterOffset$default);
                        String strTrimSubstring = Util.trimSubstring(strV, i11, iDelimiterOffset);
                        int i12 = iDelimiterOffset + 1;
                        if (kotlin.text.u.L1(strTrimSubstring, "permessage-deflate", true)) {
                            if (z10) {
                                z13 = true;
                            }
                            while (i12 < iDelimiterOffset$default) {
                                int iDelimiterOffset2 = Util.delimiterOffset(strV, ';', i12, iDelimiterOffset$default);
                                int iDelimiterOffset3 = Util.delimiterOffset(strV, a.f132013h, i12, iDelimiterOffset2);
                                String strTrimSubstring2 = Util.trimSubstring(strV, i12, iDelimiterOffset3);
                                String strM4 = iDelimiterOffset3 < iDelimiterOffset2 ? StringsKt__StringsKt.m4(Util.trimSubstring(strV, iDelimiterOffset3 + 1, iDelimiterOffset2), "\"") : null;
                                int i13 = iDelimiterOffset2 + 1;
                                if (kotlin.text.u.L1(strTrimSubstring2, "client_max_window_bits", true)) {
                                    if (numY0 != null) {
                                        z13 = true;
                                    }
                                    numY0 = strM4 != null ? t.Y0(strM4) : null;
                                    if (numY0 == null) {
                                        z13 = true;
                                    }
                                } else if (kotlin.text.u.L1(strTrimSubstring2, "client_no_context_takeover", true)) {
                                    if (z11) {
                                        z13 = true;
                                    }
                                    if (strM4 != null) {
                                        z13 = true;
                                    }
                                    z11 = true;
                                } else if (kotlin.text.u.L1(strTrimSubstring2, "server_max_window_bits", true)) {
                                    if (numY1 != null) {
                                        z13 = true;
                                    }
                                    numY1 = strM4 != null ? t.Y0(strM4) : null;
                                    if (numY1 == null) {
                                        z13 = true;
                                    }
                                } else if (kotlin.text.u.L1(strTrimSubstring2, "server_no_context_takeover", true)) {
                                    if (z12) {
                                        z13 = true;
                                    }
                                    if (strM4 != null) {
                                        z13 = true;
                                    }
                                    z12 = true;
                                } else {
                                    z13 = true;
                                }
                                i12 = i13;
                            }
                            i11 = i12;
                            z10 = true;
                        } else {
                            i11 = i12;
                            z13 = true;
                        }
                    }
                }
            }
            return new WebSocketExtensions(z10, numY0, z11, numY1, z12, z13);
        }
    }

    public WebSocketExtensions() {
        this(false, null, false, null, false, false, 63, null);
    }

    public WebSocketExtensions(boolean z10, @e Integer num, boolean z11, @e Integer num2, boolean z12, boolean z13) {
        this.perMessageDeflate = z10;
        this.clientMaxWindowBits = num;
        this.clientNoContextTakeover = z11;
        this.serverMaxWindowBits = num2;
        this.serverNoContextTakeover = z12;
        this.unknownValues = z13;
    }

    public /* synthetic */ WebSocketExtensions(boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13, int i10, u uVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? false : z11, (i10 & 8) == 0 ? num2 : null, (i10 & 16) != 0 ? false : z12, (i10 & 32) != 0 ? false : z13);
    }

    public static /* synthetic */ WebSocketExtensions copy$default(WebSocketExtensions webSocketExtensions, boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = webSocketExtensions.perMessageDeflate;
        }
        if ((i10 & 2) != 0) {
            num = webSocketExtensions.clientMaxWindowBits;
        }
        Integer num3 = num;
        if ((i10 & 4) != 0) {
            z11 = webSocketExtensions.clientNoContextTakeover;
        }
        boolean z14 = z11;
        if ((i10 & 8) != 0) {
            num2 = webSocketExtensions.serverMaxWindowBits;
        }
        Integer num4 = num2;
        if ((i10 & 16) != 0) {
            z12 = webSocketExtensions.serverNoContextTakeover;
        }
        boolean z15 = z12;
        if ((i10 & 32) != 0) {
            z13 = webSocketExtensions.unknownValues;
        }
        return webSocketExtensions.copy(z10, num3, z14, num4, z15, z13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getPerMessageDeflate() {
        return this.perMessageDeflate;
    }

    @e
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getClientMaxWindowBits() {
        return this.clientMaxWindowBits;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getClientNoContextTakeover() {
        return this.clientNoContextTakeover;
    }

    @e
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getServerMaxWindowBits() {
        return this.serverMaxWindowBits;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getServerNoContextTakeover() {
        return this.serverNoContextTakeover;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getUnknownValues() {
        return this.unknownValues;
    }

    @d
    public final WebSocketExtensions copy(boolean perMessageDeflate, @e Integer clientMaxWindowBits, boolean clientNoContextTakeover, @e Integer serverMaxWindowBits, boolean serverNoContextTakeover, boolean unknownValues) {
        return new WebSocketExtensions(perMessageDeflate, clientMaxWindowBits, clientNoContextTakeover, serverMaxWindowBits, serverNoContextTakeover, unknownValues);
    }

    public boolean equals(@e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) other;
        return this.perMessageDeflate == webSocketExtensions.perMessageDeflate && f0.g(this.clientMaxWindowBits, webSocketExtensions.clientMaxWindowBits) && this.clientNoContextTakeover == webSocketExtensions.clientNoContextTakeover && f0.g(this.serverMaxWindowBits, webSocketExtensions.serverMaxWindowBits) && this.serverNoContextTakeover == webSocketExtensions.serverNoContextTakeover && this.unknownValues == webSocketExtensions.unknownValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public int hashCode() {
        boolean z10 = this.perMessageDeflate;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = r10 * 31;
        Integer num = this.clientMaxWindowBits;
        int iHashCode = (i10 + (num != null ? num.hashCode() : 0)) * 31;
        boolean z11 = this.clientNoContextTakeover;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (iHashCode + r11) * 31;
        Integer num2 = this.serverMaxWindowBits;
        int iHashCode2 = (i11 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z12 = this.serverNoContextTakeover;
        ?? r12 = z12;
        if (z12) {
            r12 = 1;
        }
        int i12 = (iHashCode2 + r12) * 31;
        boolean z13 = this.unknownValues;
        return i12 + (z13 ? 1 : z13);
    }

    public final boolean noContextTakeover(boolean clientOriginated) {
        return clientOriginated ? this.clientNoContextTakeover : this.serverNoContextTakeover;
    }

    @d
    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.perMessageDeflate + ", clientMaxWindowBits=" + this.clientMaxWindowBits + ", clientNoContextTakeover=" + this.clientNoContextTakeover + ", serverMaxWindowBits=" + this.serverMaxWindowBits + ", serverNoContextTakeover=" + this.serverNoContextTakeover + ", unknownValues=" + this.unknownValues + ")";
    }
}
