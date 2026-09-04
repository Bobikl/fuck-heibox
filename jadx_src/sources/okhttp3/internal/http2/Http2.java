package okhttp3.internal.http2;

import com.google.android.exoplayer2.source.rtsp.k0;
import com.max.xiaoheihe.bean.BizMessageObj;
import com.taobao.accs.common.Constants;
import dl.d;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.text.u;
import okhttp3.internal.Util;
import okio.ByteString;
import xh.e;

/* JADX INFO: compiled from: Http2.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000bJ\u0015\u0010\"\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u000bH\u0000¢\u0006\u0002\b#J.\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0014\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lokhttp3/internal/http2/Http2;", "", "()V", "BINARY", "", "", "[Ljava/lang/String;", "CONNECTION_PREFACE", "Lokio/ByteString;", "FLAGS", "FLAG_ACK", "", "FLAG_COMPRESSED", "FLAG_END_HEADERS", "FLAG_END_PUSH_PROMISE", "FLAG_END_STREAM", "FLAG_NONE", "FLAG_PADDED", "FLAG_PRIORITY", "FRAME_NAMES", "INITIAL_MAX_FRAME_SIZE", "TYPE_CONTINUATION", "TYPE_DATA", "TYPE_GOAWAY", "TYPE_HEADERS", "TYPE_PING", "TYPE_PRIORITY", "TYPE_PUSH_PROMISE", "TYPE_RST_STREAM", "TYPE_SETTINGS", "TYPE_WINDOW_UPDATE", "formatFlags", "type", Constants.KEY_FLAGS, "formattedType", "formattedType$okhttp", "frameLog", "inbound", "", "streamId", k0.f48801p, "okhttp"}, k = 1, mv = {1, 4, 0})
public final class Http2 {
    private static final String[] BINARY;
    public static final int FLAG_ACK = 1;
    public static final int FLAG_COMPRESSED = 32;
    public static final int FLAG_END_HEADERS = 4;
    public static final int FLAG_END_PUSH_PROMISE = 4;
    public static final int FLAG_END_STREAM = 1;
    public static final int FLAG_NONE = 0;
    public static final int FLAG_PADDED = 8;
    public static final int FLAG_PRIORITY = 32;
    public static final int INITIAL_MAX_FRAME_SIZE = 16384;
    public static final int TYPE_CONTINUATION = 9;
    public static final int TYPE_DATA = 0;
    public static final int TYPE_GOAWAY = 7;
    public static final int TYPE_HEADERS = 1;
    public static final int TYPE_PING = 6;
    public static final int TYPE_PRIORITY = 2;
    public static final int TYPE_PUSH_PROMISE = 5;
    public static final int TYPE_RST_STREAM = 3;
    public static final int TYPE_SETTINGS = 4;
    public static final int TYPE_WINDOW_UPDATE = 8;
    public static final Http2 INSTANCE = new Http2();

    @d
    @e
    public static final ByteString CONNECTION_PREFACE = ByteString.INSTANCE.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    private static final String[] FRAME_NAMES = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", BizMessageObj.TYPE_PING, "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    private static final String[] FLAGS = new String[64];

    static {
        String[] strArr = new String[256];
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            f0.o(binaryString, "Integer.toBinaryString(it)");
            strArr[i10] = u.k2(Util.format("%8s", binaryString), ' ', '0', false, 4, null);
        }
        BINARY = strArr;
        String[] strArr2 = FLAGS;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i11 = 0; i11 < 1; i11++) {
            int i12 = iArr[i11];
            String[] strArr3 = FLAGS;
            strArr3[i12 | 8] = f0.C(strArr3[i12], "|PADDED");
        }
        String[] strArr4 = FLAGS;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i13 = 0; i13 < 3; i13++) {
            int i14 = iArr2[i13];
            for (int i15 = 0; i15 < 1; i15++) {
                int i16 = iArr[i15];
                String[] strArr5 = FLAGS;
                int i17 = i16 | i14;
                strArr5[i17] = strArr5[i16] + "|" + strArr5[i14];
                strArr5[i17 | 8] = strArr5[i16] + "|" + strArr5[i14] + "|PADDED";
            }
        }
        int length = FLAGS.length;
        for (int i18 = 0; i18 < length; i18++) {
            String[] strArr6 = FLAGS;
            if (strArr6[i18] == null) {
                strArr6[i18] = BINARY[i18];
            }
        }
    }

    private Http2() {
    }

    @d
    public final String formatFlags(int type, int flags) {
        String str;
        if (flags == 0) {
            return "";
        }
        if (type != 2 && type != 3) {
            if (type == 4 || type == 6) {
                return flags == 1 ? "ACK" : BINARY[flags];
            }
            if (type != 7 && type != 8) {
                String[] strArr = FLAGS;
                if (flags < strArr.length) {
                    str = strArr[flags];
                    f0.m(str);
                } else {
                    str = BINARY[flags];
                }
                String str2 = str;
                if (type != 5 || (flags & 4) == 0) {
                    return (type != 0 || (flags & 32) == 0) ? str2 : u.l2(str2, "PRIORITY", "COMPRESSED", false, 4, null);
                }
                return u.l2(str2, "HEADERS", "PUSH_PROMISE", false, 4, null);
            }
        }
        return BINARY[flags];
    }

    @d
    public final String formattedType$okhttp(int type) {
        String[] strArr = FRAME_NAMES;
        return type < strArr.length ? strArr[type] : Util.format("0x%02x", Integer.valueOf(type));
    }

    @d
    public final String frameLog(boolean inbound, int streamId, int length, int type, int flags) {
        return Util.format("%s 0x%08x %5d %-13s %s", inbound ? "<<" : ">>", Integer.valueOf(streamId), Integer.valueOf(length), formattedType$okhttp(type), formatFlags(type, flags));
    }
}
