package com.google.common.net;

import com.google.common.base.q;
import com.google.common.base.w;
import com.google.common.hash.Hashing;
import com.google.common.primitives.Ints;
import com.meituan.robust.Constants;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import javax.annotation.CheckForNull;
import kotlin.x1;

/* JADX INFO: compiled from: InetAddresses.java */
/* JADX INFO: loaded from: classes7.dex */
@com.google.common.net.a
@o9.c
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f58891a = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f58892b = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char f58893c = '.';

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.google.common.base.b f58895e = com.google.common.base.b.q('.');

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char f58894d = ':';

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final com.google.common.base.b f58896f = com.google.common.base.b.q(f58894d);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Inet4Address f58897g = (Inet4Address) g("127.0.0.1");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Inet4Address f58898h = (Inet4Address) g("0.0.0.0");

    /* JADX INFO: compiled from: InetAddresses.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Inet4Address f58899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Inet4Address f58900b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f58901c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f58902d;

        public a(@CheckForNull Inet4Address inet4Address, @CheckForNull Inet4Address inet4Address2, int i10, int i11) {
            w.k(i10 >= 0 && i10 <= 65535, "port '%s' is out of range (0 <= port <= 0xffff)", i10);
            w.k(i11 >= 0 && i11 <= 65535, "flags '%s' is out of range (0 <= flags <= 0xffff)", i11);
            this.f58899a = (Inet4Address) q.a(inet4Address, d.f58898h);
            this.f58900b = (Inet4Address) q.a(inet4Address2, d.f58898h);
            this.f58901c = i10;
            this.f58902d = i11;
        }

        public Inet4Address a() {
            return this.f58900b;
        }

        public int b() {
            return this.f58902d;
        }

        public int c() {
            return this.f58901c;
        }

        public Inet4Address d() {
            return this.f58899a;
        }
    }

    private d() {
    }

    public static boolean A(Inet6Address inet6Address) {
        byte[] address = inet6Address.getAddress();
        return address[0] == 32 && address[1] == 2;
    }

    public static boolean B(Inet6Address inet6Address) {
        byte b10;
        if (!inet6Address.isIPv4CompatibleAddress()) {
            return false;
        }
        byte[] address = inet6Address.getAddress();
        return (address[12] == 0 && address[13] == 0 && address[14] == 0 && ((b10 = address[15]) == 0 || b10 == 1)) ? false : true;
    }

    public static boolean C(String str) {
        return z(str) != null;
    }

    public static boolean D(Inet6Address inet6Address) {
        if (G(inet6Address)) {
            return false;
        }
        byte[] address = inet6Address.getAddress();
        return (address[8] | 3) == 3 && address[9] == 0 && address[10] == 94 && address[11] == -2;
    }

    public static boolean E(String str) {
        byte[] bArrZ = z(str);
        if (bArrZ == null || bArrZ.length != 16) {
            return false;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= 10) {
                for (int i11 = 10; i11 < 12; i11++) {
                    if (bArrZ[i11] != -1) {
                        return false;
                    }
                }
                return true;
            }
            if (bArrZ[i10] != 0) {
                return false;
            }
            i10++;
        }
    }

    public static boolean F(InetAddress inetAddress) {
        for (byte b10 : inetAddress.getAddress()) {
            if (b10 != -1) {
                return false;
            }
        }
        return true;
    }

    public static boolean G(Inet6Address inet6Address) {
        byte[] address = inet6Address.getAddress();
        return address[0] == 32 && address[1] == 1 && address[2] == 0 && address[3] == 0;
    }

    public static boolean H(String str) {
        return i(str) != null;
    }

    private static short I(String str, int i10, int i11) {
        int i12 = i11 - i10;
        if (i12 <= 0 || i12 > 4) {
            throw new NumberFormatException();
        }
        int iDigit = 0;
        while (i10 < i11) {
            iDigit = (iDigit << 4) | Character.digit(str.charAt(i10), 16);
            i10++;
        }
        return (short) iDigit;
    }

    private static byte J(String str, int i10, int i11) {
        int i12 = i11 - i10;
        if (i12 <= 0 || i12 > 3) {
            throw new NumberFormatException();
        }
        if (i12 > 1 && str.charAt(i10) == '0') {
            throw new NumberFormatException();
        }
        int i13 = 0;
        while (i10 < i11) {
            int i14 = i13 * 10;
            int iDigit = Character.digit(str.charAt(i10), 10);
            if (iDigit < 0) {
                throw new NumberFormatException();
            }
            i13 = i14 + iDigit;
            i10++;
        }
        if (i13 <= 255) {
            return (byte) i13;
        }
        throw new NumberFormatException();
    }

    @CheckForNull
    private static byte[] K(String str) {
        if (f58895e.i(str) + 1 != 4) {
            return null;
        }
        byte[] bArr = new byte[4];
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            int iIndexOf = str.indexOf(46, i10);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            try {
                bArr[i11] = J(str, i10, iIndexOf);
                i10 = iIndexOf + 1;
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return bArr;
    }

    @CheckForNull
    private static byte[] L(String str) {
        int i10 = f58896f.i(str);
        if (i10 >= 2 && i10 <= 8) {
            int i11 = 1;
            int i12 = i10 + 1;
            int i13 = 8 - i12;
            boolean z10 = false;
            for (int i14 = 0; i14 < str.length() - 1; i14++) {
                if (str.charAt(i14) == ':' && str.charAt(i14 + 1) == ':') {
                    if (z10) {
                        return null;
                    }
                    i13++;
                    if (i14 == 0) {
                        i13++;
                    }
                    if (i14 == str.length() - 2) {
                        i13++;
                    }
                    z10 = true;
                }
            }
            if (str.charAt(0) == ':' && str.charAt(1) != ':') {
                return null;
            }
            if (str.charAt(str.length() - 1) == ':' && str.charAt(str.length() - 2) != ':') {
                return null;
            }
            if (z10 && i13 <= 0) {
                return null;
            }
            if (!z10 && i12 != 8) {
                return null;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            try {
                if (str.charAt(0) != ':') {
                    i11 = 0;
                }
                while (i11 < str.length()) {
                    int iIndexOf = str.indexOf(58, i11);
                    if (iIndexOf == -1) {
                        iIndexOf = str.length();
                    }
                    if (str.charAt(i11) == ':') {
                        for (int i15 = 0; i15 < i13; i15++) {
                            byteBufferAllocate.putShort((short) 0);
                        }
                    } else {
                        byteBufferAllocate.putShort(I(str, i11, iIndexOf));
                    }
                    i11 = iIndexOf + 1;
                }
                return byteBufferAllocate.array();
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public static String M(InetAddress inetAddress) {
        w.E(inetAddress);
        if (inetAddress instanceof Inet4Address) {
            return inetAddress.getHostAddress();
        }
        w.d(inetAddress instanceof Inet6Address);
        byte[] address = inetAddress.getAddress();
        int[] iArr = new int[8];
        for (int i10 = 0; i10 < 8; i10++) {
            int i11 = i10 * 2;
            iArr[i10] = Ints.k((byte) 0, (byte) 0, address[i11], address[i11 + 1]);
        }
        d(iArr);
        return x(iArr);
    }

    public static BigInteger N(InetAddress inetAddress) {
        return new BigInteger(1, inetAddress.getAddress());
    }

    public static String O(InetAddress inetAddress) {
        if (!(inetAddress instanceof Inet6Address)) {
            return M(inetAddress);
        }
        String strM = M(inetAddress);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strM).length() + 2);
        sb2.append(Constants.ARRAY_TYPE);
        sb2.append(strM);
        sb2.append("]");
        return sb2.toString();
    }

    private static InetAddress b(byte[] bArr) {
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e10) {
            throw new AssertionError(e10);
        }
    }

    public static int c(InetAddress inetAddress) {
        return com.google.common.io.g.h(q(inetAddress).getAddress()).readInt();
    }

    private static void d(int[] iArr) {
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < iArr.length + 1; i13++) {
            if (i13 >= iArr.length || iArr[i13] != 0) {
                if (i12 >= 0) {
                    int i14 = i13 - i12;
                    if (i14 > i10) {
                        i11 = i12;
                        i10 = i14;
                    }
                    i12 = -1;
                }
            } else if (i12 < 0) {
                i12 = i13;
            }
        }
        if (i10 >= 2) {
            Arrays.fill(iArr, i11, i10 + i11, -1);
        }
    }

    @CheckForNull
    private static String e(String str) {
        int iLastIndexOf = str.lastIndexOf(58) + 1;
        String strSubstring = str.substring(0, iLastIndexOf);
        byte[] bArrK = K(str.substring(iLastIndexOf));
        if (bArrK == null) {
            return null;
        }
        String hexString = Integer.toHexString(((bArrK[0] & 255) << 8) | (bArrK[1] & 255));
        String hexString2 = Integer.toHexString((bArrK[3] & 255) | ((bArrK[2] & 255) << 8));
        StringBuilder sb2 = new StringBuilder(String.valueOf(strSubstring).length() + 1 + String.valueOf(hexString).length() + String.valueOf(hexString2).length());
        sb2.append(strSubstring);
        sb2.append(hexString);
        sb2.append(":");
        sb2.append(hexString2);
        return sb2.toString();
    }

    public static InetAddress f(InetAddress inetAddress) {
        byte[] address = inetAddress.getAddress();
        int length = address.length - 1;
        while (length >= 0 && address[length] == 0) {
            address[length] = -1;
            length--;
        }
        w.u(length >= 0, "Decrementing %s would wrap.", inetAddress);
        address[length] = (byte) (address[length] - 1);
        return b(address);
    }

    @s9.a
    public static InetAddress g(String str) {
        byte[] bArrZ = z(str);
        if (bArrZ != null) {
            return b(bArrZ);
        }
        throw j("'%s' is not an IP string literal.", str);
    }

    public static InetAddress h(String str) {
        InetAddress inetAddressI = i(str);
        if (inetAddressI != null) {
            return inetAddressI;
        }
        throw j("Not a valid URI IP literal: '%s'", str);
    }

    @CheckForNull
    private static InetAddress i(String str) {
        int i10;
        w.E(str);
        if (str.startsWith(Constants.ARRAY_TYPE) && str.endsWith("]")) {
            str = str.substring(1, str.length() - 1);
            i10 = 16;
        } else {
            i10 = 4;
        }
        byte[] bArrZ = z(str);
        if (bArrZ == null || bArrZ.length != i10) {
            return null;
        }
        return b(bArrZ);
    }

    private static IllegalArgumentException j(String str, Object... objArr) {
        return new IllegalArgumentException(String.format(Locale.ROOT, str, objArr));
    }

    private static InetAddress k(BigInteger bigInteger, boolean z10) {
        w.e(bigInteger.signum() >= 0, "BigInteger must be greater than or equal to 0");
        int i10 = z10 ? 16 : 4;
        byte[] byteArray = bigInteger.toByteArray();
        byte[] bArr = new byte[i10];
        int iMax = Math.max(0, byteArray.length - i10);
        int length = byteArray.length - iMax;
        int i11 = i10 - length;
        for (int i12 = 0; i12 < iMax; i12++) {
            if (byteArray[i12] != 0) {
                throw j("BigInteger cannot be converted to InetAddress because it has more than %d bytes: %s", Integer.valueOf(i10), bigInteger);
            }
        }
        System.arraycopy(byteArray, iMax, bArr, i11, length);
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e10) {
            throw new AssertionError(e10);
        }
    }

    public static Inet4Address l(BigInteger bigInteger) {
        return (Inet4Address) k(bigInteger, false);
    }

    public static Inet6Address m(BigInteger bigInteger) {
        return (Inet6Address) k(bigInteger, true);
    }

    public static Inet4Address n(int i10) {
        return t(Ints.C(i10));
    }

    public static InetAddress o(byte[] bArr) throws UnknownHostException {
        byte[] bArr2 = new byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr2[i10] = bArr[(bArr.length - i10) - 1];
        }
        return InetAddress.getByAddress(bArr2);
    }

    public static Inet4Address p(Inet6Address inet6Address) {
        w.u(A(inet6Address), "Address '%s' is not a 6to4 address.", M(inet6Address));
        return t(Arrays.copyOfRange(inet6Address.getAddress(), 2, 6));
    }

    public static Inet4Address q(InetAddress inetAddress) {
        boolean z10;
        if (inetAddress instanceof Inet4Address) {
            return (Inet4Address) inetAddress;
        }
        byte[] address = inetAddress.getAddress();
        int i10 = 0;
        while (true) {
            if (i10 >= 15) {
                z10 = true;
                break;
            }
            if (address[i10] != 0) {
                z10 = false;
                break;
            }
            i10++;
        }
        if (z10 && address[15] == 1) {
            return f58897g;
        }
        if (z10 && address[15] == 0) {
            return f58898h;
        }
        Inet6Address inet6Address = (Inet6Address) inetAddress;
        int iB = Hashing.B().e(w(inet6Address) ? s(inet6Address).hashCode() : ByteBuffer.wrap(inet6Address.getAddress(), 0, 8).getLong()).b() | (-536870912);
        if (iB == -1) {
            iB = -2;
        }
        return t(Ints.C(iB));
    }

    public static Inet4Address r(Inet6Address inet6Address) {
        w.u(B(inet6Address), "Address '%s' is not IPv4-compatible.", M(inet6Address));
        return t(Arrays.copyOfRange(inet6Address.getAddress(), 12, 16));
    }

    public static Inet4Address s(Inet6Address inet6Address) {
        if (B(inet6Address)) {
            return r(inet6Address);
        }
        if (A(inet6Address)) {
            return p(inet6Address);
        }
        if (G(inet6Address)) {
            return v(inet6Address).a();
        }
        throw j("'%s' has no embedded IPv4 address.", M(inet6Address));
    }

    private static Inet4Address t(byte[] bArr) {
        w.k(bArr.length == 4, "Byte array has invalid length for an IPv4 address: %s != 4.", bArr.length);
        return (Inet4Address) b(bArr);
    }

    public static Inet4Address u(Inet6Address inet6Address) {
        w.u(D(inet6Address), "Address '%s' is not an ISATAP address.", M(inet6Address));
        return t(Arrays.copyOfRange(inet6Address.getAddress(), 12, 16));
    }

    public static a v(Inet6Address inet6Address) {
        w.u(G(inet6Address), "Address '%s' is not a Teredo address.", M(inet6Address));
        byte[] address = inet6Address.getAddress();
        Inet4Address inet4AddressT = t(Arrays.copyOfRange(address, 4, 8));
        int i10 = com.google.common.io.g.i(address, 8).readShort() & x1.f128661e;
        int i11 = 65535 & (~com.google.common.io.g.i(address, 10).readShort());
        byte[] bArrCopyOfRange = Arrays.copyOfRange(address, 12, 16);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) (~bArrCopyOfRange[i12]);
        }
        return new a(inet4AddressT, t(bArrCopyOfRange), i11, i10);
    }

    public static boolean w(Inet6Address inet6Address) {
        return B(inet6Address) || A(inet6Address) || G(inet6Address);
    }

    private static String x(int[] iArr) {
        StringBuilder sb2 = new StringBuilder(39);
        int i10 = 0;
        boolean z10 = false;
        while (i10 < iArr.length) {
            boolean z11 = iArr[i10] >= 0;
            if (z11) {
                if (z10) {
                    sb2.append(f58894d);
                }
                sb2.append(Integer.toHexString(iArr[i10]));
            } else if (i10 == 0 || z10) {
                sb2.append("::");
            }
            i10++;
            z10 = z11;
        }
        return sb2.toString();
    }

    public static InetAddress y(InetAddress inetAddress) {
        byte[] address = inetAddress.getAddress();
        int length = address.length - 1;
        while (true) {
            if (length < 0 || address[length] != -1) {
                break;
            }
            address[length] = 0;
            length--;
        }
        w.u(length >= 0, "Incrementing %s would wrap.", inetAddress);
        address[length] = (byte) (address[length] + 1);
        return b(address);
    }

    @CheckForNull
    private static byte[] z(String str) {
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            if (i10 >= str.length()) {
                i10 = -1;
                break;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt == '.') {
                z10 = true;
            } else if (cCharAt == ':') {
                if (z10) {
                    return null;
                }
                z11 = true;
            } else {
                if (cCharAt == '%') {
                    break;
                }
                if (Character.digit(cCharAt, 16) == -1) {
                    return null;
                }
            }
            i10++;
        }
        if (!z11) {
            if (z10 && i10 == -1) {
                return K(str);
            }
            return null;
        }
        if (z10 && (str = e(str)) == null) {
            return null;
        }
        if (i10 != -1) {
            str = str.substring(0, i10);
        }
        return L(str);
    }
}
