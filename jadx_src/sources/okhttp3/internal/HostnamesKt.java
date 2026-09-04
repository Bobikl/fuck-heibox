package okhttp3.internal;

import com.meituan.robust.Constants;
import dl.d;
import dl.e;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.u;
import okio.Buffer;

/* JADX INFO: compiled from: hostnames.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0002\u001a\"\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\f\u0010\r\u001a\u00020\u0001*\u00020\u0003H\u0002\u001a\f\u0010\u000e\u001a\u0004\u0018\u00010\u0003*\u00020\u0003¨\u0006\u000f"}, d2 = {"decodeIpv4Suffix", "", "input", "", "pos", "", "limit", "address", "", "addressOffset", "decodeIpv6", "Ljava/net/InetAddress;", "inet6AddressToAscii", "containsInvalidHostnameAsciiCodes", "toCanonicalHost", "okhttp"}, k = 2, mv = {1, 4, 0})
public final class HostnamesKt {
    private static final boolean containsInvalidHostnameAsciiCodes(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (f0.t(cCharAt, 31) <= 0 || f0.t(cCharAt, 127) >= 0 || StringsKt__StringsKt.r3(" #%/:?@[\\]", cCharAt, 0, false, 6, null) != -1) {
                return true;
            }
        }
        return false;
    }

    private static final boolean decodeIpv4Suffix(String str, int i10, int i11, byte[] bArr, int i12) {
        int i13 = i12;
        while (i10 < i11) {
            if (i13 == bArr.length) {
                return false;
            }
            if (i13 != i12) {
                if (str.charAt(i10) != '.') {
                    return false;
                }
                i10++;
            }
            int i14 = i10;
            int i15 = 0;
            while (i14 < i11) {
                char cCharAt = str.charAt(i14);
                if (f0.t(cCharAt, 48) < 0 || f0.t(cCharAt, 57) > 0) {
                    break;
                }
                if ((i15 == 0 && i10 != i14) || (i15 = ((i15 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i14++;
            }
            if (i14 - i10 == 0) {
                return false;
            }
            bArr[i13] = (byte) i15;
            i13++;
            i10 = i14;
        }
        return i13 == i12 + 4;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0076 A[LOOP:1: B:30:0x0069->B:34:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x007c A[EDGE_INSN: B:55:0x007c->B:35:0x007c BREAK  A[LOOP:1: B:30:0x0069->B:34:0x0076], SYNTHETIC] */
    private static final InetAddress decodeIpv6(String str, int i10, int i11) {
        int i12;
        int i13;
        int hexDigit;
        byte[] bArr = new byte[16];
        int i14 = i10;
        int i15 = -1;
        int i16 = -1;
        int i17 = 0;
        while (i14 < i11) {
            if (i17 == 16) {
                return null;
            }
            int i18 = i14 + 2;
            if (i18 <= i11 && u.u2(str, "::", i14, false, 4, null)) {
                if (i15 != -1) {
                    return null;
                }
                i17 += 2;
                if (i18 == i11) {
                    i15 = i17;
                    break;
                }
                i16 = i18;
                i15 = i17;
                i14 = i16;
                i12 = 0;
                while (i14 < i11) {
                    hexDigit = Util.parseHexDigit(str.charAt(i14));
                    if (hexDigit == -1) {
                        break;
                        break;
                    }
                    i12 = (i12 << 4) + hexDigit;
                    i14++;
                }
                i13 = i14 - i16;
                if (i13 != 0) {
                }
                return null;
            }
            if (i17 != 0) {
                if (!u.u2(str, ":", i14, false, 4, null)) {
                    if (!u.u2(str, ".", i14, false, 4, null) || !decodeIpv4Suffix(str, i16, i11, bArr, i17 - 2)) {
                        return null;
                    }
                    i17 += 2;
                    break;
                }
                i14++;
            }
            i16 = i14;
            i14 = i16;
            i12 = 0;
            while (i14 < i11) {
                hexDigit = Util.parseHexDigit(str.charAt(i14));
                if (hexDigit == -1) {
                    break;
                }
                i12 = (i12 << 4) + hexDigit;
                i14++;
            }
            i13 = i14 - i16;
            if (i13 != 0 || i13 > 4) {
                return null;
            }
            int i19 = i17 + 1;
            bArr[i17] = (byte) ((i12 >>> 8) & 255);
            i17 = i19 + 1;
            bArr[i19] = (byte) (i12 & 255);
        }
        if (i17 != 16) {
            if (i15 == -1) {
                return null;
            }
            int i20 = i17 - i15;
            System.arraycopy(bArr, i15, bArr, 16 - i20, i20);
            Arrays.fill(bArr, i15, (16 - i17) + i15, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    private static final String inet6AddressToAscii(byte[] bArr) {
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < bArr.length) {
            int i14 = i12;
            while (i14 < 16 && bArr[i14] == 0 && bArr[i14 + 1] == 0) {
                i14 += 2;
            }
            int i15 = i14 - i12;
            if (i15 > i13 && i15 >= 4) {
                i11 = i12;
                i13 = i15;
            }
            i12 = i14 + 2;
        }
        Buffer buffer = new Buffer();
        while (i10 < bArr.length) {
            if (i10 == i11) {
                buffer.writeByte(58);
                i10 += i13;
                if (i10 == 16) {
                    buffer.writeByte(58);
                }
            } else {
                if (i10 > 0) {
                    buffer.writeByte(58);
                }
                buffer.writeHexadecimalUnsignedLong((Util.and(bArr[i10], 255) << 8) | Util.and(bArr[i10 + 1], 255));
                i10 += 2;
            }
        }
        return buffer.readUtf8();
    }

    @e
    public static final String toCanonicalHost(@d String toCanonicalHost) {
        f0.p(toCanonicalHost, "$this$toCanonicalHost");
        if (!StringsKt__StringsKt.W2(toCanonicalHost, ":", false, 2, null)) {
            try {
                String ascii = IDN.toASCII(toCanonicalHost);
                f0.o(ascii, "IDN.toASCII(host)");
                Locale locale = Locale.US;
                f0.o(locale, "Locale.US");
                if (ascii == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String lowerCase = ascii.toLowerCase(locale);
                f0.o(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (!(lowerCase.length() == 0) && !containsInvalidHostnameAsciiCodes(lowerCase)) {
                    return lowerCase;
                }
                return null;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressDecodeIpv6 = (u.v2(toCanonicalHost, Constants.ARRAY_TYPE, false, 2, null) && u.K1(toCanonicalHost, "]", false, 2, null)) ? decodeIpv6(toCanonicalHost, 1, toCanonicalHost.length() - 1) : decodeIpv6(toCanonicalHost, 0, toCanonicalHost.length());
        if (inetAddressDecodeIpv6 == null) {
            return null;
        }
        byte[] address = inetAddressDecodeIpv6.getAddress();
        if (address.length == 16) {
            f0.o(address, "address");
            return inet6AddressToAscii(address);
        }
        if (address.length == 4) {
            return inetAddressDecodeIpv6.getHostAddress();
        }
        throw new AssertionError("Invalid IPv6 address: '" + toCanonicalHost + '\'');
    }
}
