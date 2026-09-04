package okio;

import dl.d;
import dl.e;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import xh.h;

/* JADX INFO: renamed from: okio.-Base64, reason: invalid class name */
/* JADX INFO: compiled from: -Base64.kt */
/* JADX INFO: loaded from: classes5.dex */
@h(name = "-Base64")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0000\u001a\u0016\u0010\b\u001a\u00020\u0007*\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003¨\u0006\n"}, d2 = {"BASE64", "", "getBASE64", "()[B", "BASE64_URL_SAFE", "getBASE64_URL_SAFE", "decodeBase64ToArray", "", "encodeBase64", "map", "okio"}, k = 2, mv = {1, 4, 0})
public final class Base64 {

    @d
    private static final byte[] BASE64;

    @d
    private static final byte[] BASE64_URL_SAFE;

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        BASE64 = companion.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").getData();
        BASE64_URL_SAFE = companion.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").getData();
    }

    @e
    public static final byte[] decodeBase64ToArray(@d String decodeBase64ToArray) {
        int i10;
        char cCharAt;
        f0.p(decodeBase64ToArray, "$this$decodeBase64ToArray");
        int length = decodeBase64ToArray.length();
        while (length > 0 && ((cCharAt = decodeBase64ToArray.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i11 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[i11];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15++) {
            char cCharAt2 = decodeBase64ToArray.charAt(i15);
            if ('A' <= cCharAt2 && 'Z' >= cCharAt2) {
                i10 = cCharAt2 - 'A';
            } else if ('a' <= cCharAt2 && 'z' >= cCharAt2) {
                i10 = cCharAt2 - 'G';
            } else if ('0' <= cCharAt2 && '9' >= cCharAt2) {
                i10 = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i10 = 62;
            } else {
                if (cCharAt2 == '/' || cCharAt2 == '_') {
                    i10 = 63;
                } else if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                    return null;
                }
            }
            i13 = (i13 << 6) | i10;
            i12++;
            if (i12 % 4 == 0) {
                int i16 = i14 + 1;
                bArr[i14] = (byte) (i13 >> 16);
                int i17 = i16 + 1;
                bArr[i16] = (byte) (i13 >> 8);
                bArr[i17] = (byte) i13;
                i14 = i17 + 1;
            }
        }
        int i18 = i12 % 4;
        if (i18 == 1) {
            return null;
        }
        if (i18 == 2) {
            bArr[i14] = (byte) ((i13 << 12) >> 16);
            i14++;
        } else if (i18 == 3) {
            int i19 = i13 << 6;
            int i20 = i14 + 1;
            bArr[i14] = (byte) (i19 >> 16);
            i14 = i20 + 1;
            bArr[i20] = (byte) (i19 >> 8);
        }
        if (i14 == i11) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i14);
        f0.o(bArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
        return bArrCopyOf;
    }

    @d
    public static final String encodeBase64(@d byte[] encodeBase64, @d byte[] map) {
        f0.p(encodeBase64, "$this$encodeBase64");
        f0.p(map, "map");
        byte[] bArr = new byte[((encodeBase64.length + 2) / 3) * 4];
        int length = encodeBase64.length - (encodeBase64.length % 3);
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i10 + 1;
            byte b10 = encodeBase64[i10];
            int i13 = i12 + 1;
            byte b11 = encodeBase64[i12];
            int i14 = i13 + 1;
            byte b12 = encodeBase64[i13];
            int i15 = i11 + 1;
            bArr[i11] = map[(b10 & 255) >> 2];
            int i16 = i15 + 1;
            bArr[i15] = map[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            int i17 = i16 + 1;
            bArr[i16] = map[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i11 = i17 + 1;
            bArr[i17] = map[b12 & Utf8.REPLACEMENT_BYTE];
            i10 = i14;
        }
        int length2 = encodeBase64.length - length;
        if (length2 == 1) {
            byte b13 = encodeBase64[i10];
            int i18 = i11 + 1;
            bArr[i11] = map[(b13 & 255) >> 2];
            int i19 = i18 + 1;
            bArr[i18] = map[(b13 & 3) << 4];
            byte b14 = (byte) 61;
            bArr[i19] = b14;
            bArr[i19 + 1] = b14;
        } else if (length2 == 2) {
            int i20 = i10 + 1;
            byte b15 = encodeBase64[i10];
            byte b16 = encodeBase64[i20];
            int i21 = i11 + 1;
            bArr[i11] = map[(b15 & 255) >> 2];
            int i22 = i21 + 1;
            bArr[i21] = map[((b15 & 3) << 4) | ((b16 & 255) >> 4)];
            bArr[i22] = map[(b16 & 15) << 2];
            bArr[i22 + 1] = (byte) 61;
        }
        return Platform.toUtf8String(bArr);
    }

    public static /* synthetic */ String encodeBase64$default(byte[] bArr, byte[] bArr2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bArr2 = BASE64;
        }
        return encodeBase64(bArr, bArr2);
    }

    @d
    public static final byte[] getBASE64() {
        return BASE64;
    }

    @d
    public static final byte[] getBASE64_URL_SAFE() {
        return BASE64_URL_SAFE;
    }
}
