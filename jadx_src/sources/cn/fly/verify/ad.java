package cn.fly.verify;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.google.common.primitives.SignedBytes;
import com.umeng.socialize.common.SocializeConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okio.Utf8;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, String> f35674a = new HashMap(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, String> f35675b = new HashMap(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f35676c = {58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f35677d = {71, 67, 77, 108, 71, org.apache.tools.tar.c.N, 58, 77, 73, 89, 123, 77, 89, 67, 104, 57, 78, 91, 79, 72, org.apache.tools.tar.c.N, 91, 95, org.apache.tools.tar.c.N, org.apache.tools.tar.c.N, 62, 77, 68, org.apache.tools.tar.c.N, 78, 73, 72, 99, 91, 65, 72, 109, 91, 73, Utf8.REPLACEMENT_BYTE, 121, 111, 58, 61, org.apache.tools.tar.c.S, 97, 68, 61, 59, 123, 121, 89, SignedBytes.f59068a, 66, 96, 80, 56, 80, 58, 33, 80, 33, 62, 70, 102, 70, 124, 108, 56, 121, 112, 61, 71, 110, 57, org.apache.tools.tar.c.H, 92, org.apache.tools.tar.c.N, 107, 57, 79, org.apache.tools.tar.c.S, org.apache.tools.tar.c.N, 69, 124, 67, 61, 124, 80, 122, 57, 98, 104, org.apache.tools.tar.c.N, 114, 99, 105, 70, 61, 56, 62, 115, 102, 105, org.apache.tools.tar.c.S, 99, 121, 94, 90, 126, 80, 91, 98, 94, 37, org.apache.tools.tar.c.I, 73, 33, 56, Utf8.REPLACEMENT_BYTE, org.apache.tools.tar.c.N, 79, 70, 123, 115, org.apache.tools.tar.c.I, 90, 68, org.apache.tools.tar.c.I, SignedBytes.f59068a, org.apache.tools.tar.c.S, 112, 65, 122, 125, 101, 92, 94, 95, 101, SignedBytes.f59068a, 124, 114, 77, 62, 72, 101, 115, 94, 62, org.apache.tools.tar.c.I, 33, 109, 77, 92, 102, 60, 121, 60, 112, 101, 59, 104, 115, 68, 101, 66, 95, 112, 94, 108, 97, org.apache.tools.tar.c.S, org.apache.tools.tar.c.R, 108, org.apache.tools.tar.c.S, 73, org.apache.tools.tar.c.I, 71, 73, Utf8.REPLACEMENT_BYTE, 57, 66, 124, 77, org.apache.tools.tar.c.H, 77, 125, 65, 90, Utf8.REPLACEMENT_BYTE, 114, 126, 105, 110, 122, 126, org.apache.tools.tar.c.O, 96, org.apache.tools.tar.c.N, 67, 105, 109, 67, org.apache.tools.tar.c.R, 61, 101, org.apache.tools.tar.c.N, 93, 91, 67, 78, org.apache.tools.tar.c.N, 91, org.apache.tools.tar.c.N, 72};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f35678e = {org.apache.tools.tar.c.S, 101, 110, 111, 102, org.apache.tools.tar.c.M};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte[] f35679f = {44, 121, 115, 121, 126, 111, org.apache.tools.tar.c.S, org.apache.tools.tar.c.M};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f35680g = {44, 124, 111, org.apache.tools.tar.c.Q, 121, 99, 101, 100, org.apache.tools.tar.c.M};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f35681h = {44, 99, 121, 89, 110, 97, 70, 101, 109, 99, 100, org.apache.tools.tar.c.M, 59};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte[] f35682i = {44, 100, 111, 126, 125, 101, org.apache.tools.tar.c.Q, 97, 94, 115, 122, 111, org.apache.tools.tar.c.M};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final byte[] f35683j = {44, 101, 100, 102, 99, 100, 111, 94, 115, 122, 111, org.apache.tools.tar.c.M};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final byte[] f35684k = {44, 126, 99, org.apache.tools.tar.c.S, 111, 89, 126, 107, org.apache.tools.tar.c.S, 122, org.apache.tools.tar.c.M};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final byte[] f35685l = {44, 104, 126, org.apache.tools.tar.c.M};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final byte[] f35686m = {44, 107, 127, 126, 98, 94, 115, 122, 111, org.apache.tools.tar.c.M, 56};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final byte[] f35687n = {44, org.apache.tools.tar.c.Q, 102, org.apache.tools.tar.c.M, 58, 59, 58, 58, 59};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final byte[] f35688o = {44, 122, 99, 122, 102, org.apache.tools.tar.c.M};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final byte[] f35689p = {44, 101, 122, 111, org.apache.tools.tar.c.Q, 107, 126, 101, org.apache.tools.tar.c.Q, 94, 115, 122, 111, org.apache.tools.tar.c.M};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final byte[] f35690q = {44, 107, 122, 122, 68, 107, org.apache.tools.tar.c.S, 111, org.apache.tools.tar.c.M};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final byte[] f35691r = {107, 122, 122, 67, 110, org.apache.tools.tar.c.M};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final byte[] f35692s = {44, 105, 102, 99, 111, 100, 126, 94, 115, 122, 111, org.apache.tools.tar.c.M};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final byte[] f35693t = {44, 122, 97, org.apache.tools.tar.c.M};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final byte[] f35694u = {44, 122, 121, org.apache.tools.tar.c.M};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final byte[] f35695v = {44, 108, 101, org.apache.tools.tar.c.Q, org.apache.tools.tar.c.S, 107, 126, org.apache.tools.tar.c.M};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final byte[] f35696w = {44, 121, 99, 109, 100, org.apache.tools.tar.c.M};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final byte[] f35697x = {122};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final byte[] f35698y = {97};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final byte[] f35699z = {105, 61, 62, 104, org.apache.tools.tar.c.H, 107, org.apache.tools.tar.c.I, Utf8.REPLACEMENT_BYTE, org.apache.tools.tar.c.I, 111, 62, 61, 107, 110, 58, org.apache.tools.tar.c.I};
    private static final byte[] A = {85, 58, 59, 56, 57, 62, Utf8.REPLACEMENT_BYTE, 60, 61, org.apache.tools.tar.c.H, org.apache.tools.tar.c.I, 107, 104, 105, 110, 111, 108, 109, 98, 99, 96, 97, 102, org.apache.tools.tar.c.S, 100, 101, 122, 123, org.apache.tools.tar.c.Q, 121, 126, 127, 124, 125, 114, 115, 112, org.apache.tools.tar.c.N, 72, 73, 78, 79, org.apache.tools.tar.c.O, 77, 66, 67, SignedBytes.f59068a, 65, 70, 71, 68, 69, 90, 91, org.apache.tools.tar.c.R, 89, 94, 95, 92, 93, 82, org.apache.tools.tar.c.P, 80, 85};
    private static final byte[] B = {57, 58, 58, 56, 58};
    private static final byte[] C = {96, 121, 101, 100};
    private static final byte[] D = {org.apache.tools.tar.c.N, 79, 89};
    private static final byte[] E = {org.apache.tools.tar.c.N, 79, 89, 37, 73, 72, 73, 37, 90, 65, 73, 89, 61, 90, 107, 110, 110, 99, 100, 109};
    private static final byte[] F = {66, org.apache.tools.tar.c.S, 107, 105, 89, 66, org.apache.tools.tar.c.N, 59};
    private static byte[] G = {68, SignedBytes.f59068a, 94, org.apache.tools.tar.c.G, org.apache.tools.tar.c.H, org.apache.tools.tar.c.P};

    public static String a() {
        String strSubstring = "";
        try {
            String str = Thread.currentThread().getId() + "" + Process.myPid();
            if (str.length() <= 6) {
                return "ctacco";
            }
            strSubstring = str.substring(0, 6);
            return strSubstring;
        } catch (Throwable unused) {
            return strSubstring;
        }
    }

    public static String a(int i10) {
        byte[] bytes = b(A).getBytes(StandardCharsets.UTF_8);
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[i10];
        int length = bytes.length;
        int i11 = 0;
        while (true) {
            int i12 = i11 + 1;
            bArr[i11] = bytes[secureRandom.nextInt(length)];
            if (i12 >= i10) {
                return new String(bArr, StandardCharsets.UTF_8);
            }
            i11 = i12;
        }
    }

    public static String a(Context context) {
        if (context == null) {
            return "null";
        }
        String strJ = al.j();
        if ("wifi".equalsIgnoreCase(strJ) && as.b(context)) {
            return "BOTH";
        }
        if ("2g".equalsIgnoreCase(strJ) || "3g".equalsIgnoreCase(strJ) || "4g".equalsIgnoreCase(strJ) || NetworkUtil.NETWORK_CLASS_5G.equalsIgnoreCase(strJ) || "wifi".equalsIgnoreCase(strJ)) {
            return strJ.toUpperCase();
        }
        return "none".equalsIgnoreCase(strJ) ? "null" : String.valueOf(al.c());
    }

    public static String a(Context context, String str) throws Throwable {
        String strB = b(f35699z);
        String lowerCase = ga.b(a(10)).toLowerCase();
        if (lowerCase.length() > 16) {
            lowerCase = lowerCase.substring(0, 16);
        }
        byte[] bytes = lowerCase.getBytes();
        byte b10 = bytes[2];
        if (b10 != bytes[13]) {
            bytes[13] = b10;
        }
        return ga.b(b(strB, (str + Constants.ACCEPT_TIME_SEPARATOR_SP + new String(bytes)).getBytes(), b(f35676c))).toUpperCase();
    }

    public static String a(Context context, String str, String str2, String str3, String str4) throws Throwable {
        String str5 = a() + System.currentTimeMillis();
        String str6 = a() + a(10);
        f35674a.put(str5, str6);
        String strA = a(str6);
        StringBuilder sb2 = new StringBuilder();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strI = al.i();
        sb2.append(b(f35678e));
        sb2.append(fz.d.j());
        sb2.append(b(f35679f));
        sb2.append(fz.d.l() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + fz.d.j() + "-A:" + Build.VERSION.RELEASE);
        byte[] bArr = f35680g;
        sb2.append(b(bArr));
        sb2.append(str4);
        sb2.append(b(f35681h));
        sb2.append(b(f35682i));
        sb2.append(a(context));
        sb2.append(b(f35683j));
        sb2.append(b(context));
        byte[] bArr2 = f35684k;
        sb2.append(b(bArr2));
        sb2.append(jCurrentTimeMillis);
        sb2.append(b(f35685l));
        sb2.append(str3);
        sb2.append(b(f35686m));
        sb2.append(b(f35687n));
        sb2.append(b(f35688o));
        sb2.append(b());
        sb2.append(b(f35689p));
        sb2.append(c(context));
        sb2.append(b(f35690q));
        if (strI == null) {
            strI = "";
        }
        sb2.append(strI);
        try {
            String upperCase = ga.b(b(str6, sb2.toString().getBytes(), b(f35676c))).toUpperCase();
            String strB = b(B);
            String strB2 = b(C);
            String strA2 = a(ga.b(str2 + jCurrentTimeMillis + fz.d.c() + al.a().toUpperCase()).toUpperCase(), str + strB + strB2 + strA + upperCase + jCurrentTimeMillis + SocializeConstants.PROTOCOL_VERSON);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(b(f35697x), b(f35691r) + str + b(f35692s) + strB + b(bArr2) + jCurrentTimeMillis + b(f35693t) + strA + b(f35694u) + upperCase + b(f35695v) + strB2 + b(bArr) + SocializeConstants.PROTOCOL_VERSON + b(f35696w) + strA2);
            jSONObject.put(b(f35698y), str5);
            return jSONObject.toString();
        } catch (Throwable th2) {
            f.a().a(th2);
            throw th2;
        }
    }

    public static String a(String str) throws Throwable {
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(n5.d.f132016a).generatePublic(new X509EncodedKeySpec(b(b(f35677d))));
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, publicKeyGeneratePublic);
            return a(cipher.doFinal(str.getBytes()));
        } catch (Throwable th2) {
            f.a().a(th2);
            throw th2;
        }
    }

    public static String a(String str, String str2) throws Throwable {
        try {
            String strB = b(F);
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), strB);
            Mac mac = Mac.getInstance(strB);
            mac.init(secretKeySpec);
            return ga.b(mac.doFinal(str2.getBytes())).toUpperCase();
        } catch (Throwable th2) {
            f.a().a(th2);
            throw th2;
        }
    }

    public static String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < bArr.length; i10++) {
            sb2.append(cArr[(bArr[i10] >> 4) & 15]);
            sb2.append(cArr[bArr[i10] & 15]);
        }
        return sb2.toString();
    }

    private static byte[] a(String str, byte[] bArr, String str2) throws Throwable {
        return a(str, bArr, str2, false);
    }

    private static byte[] a(String str, byte[] bArr, String str2, boolean z10) throws Throwable {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(StandardCharsets.UTF_8), b(D));
            Cipher cipher = Cipher.getInstance(b(E));
            cipher.init(z10 ? 1 : 2, secretKeySpec, new IvParameterSpec(str2.getBytes(StandardCharsets.UTF_8)));
            return cipher.doFinal(bArr);
        } catch (Throwable th2) {
            f.a().a(th2);
            throw th2;
        }
    }

    public static byte[] a(byte[] bArr, String str) throws Throwable {
        return a(f35674a.get(str), bArr, b(f35676c));
    }

    public static String b() {
        try {
            StringBuffer stringBuffer = new StringBuffer();
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                String name = networkInterfaceNextElement.getName();
                if (name == null || (!name.contains("wlan") && !name.equals("eth0"))) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddressNextElement = inetAddresses.nextElement();
                        if (!inetAddressNextElement.isLoopbackAddress() && !inetAddressNextElement.isLinkLocalAddress()) {
                            String hostAddress = inetAddressNextElement.getHostAddress();
                            if (!TextUtils.isEmpty(hostAddress)) {
                                if (stringBuffer.length() > 0) {
                                    stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                                }
                                stringBuffer.append(hostAddress);
                            }
                        }
                    }
                }
            }
            return stringBuffer.toString();
        } catch (Throwable th2) {
            f.a().a(th2);
            return "";
        }
    }

    public static String b(Context context) {
        String strA = a(context);
        if (TextUtils.isEmpty(strA) || strA.equals("null")) {
            return "15";
        }
        if (strA.equals(d4.d.f108135c)) {
            return "10";
        }
        if (strA.equals(d4.d.f108136d)) {
            return "11";
        }
        if (strA.equals(d4.d.f108137e)) {
            return "12";
        }
        if (strA.equals("5G")) {
            return "16";
        }
        if (strA.equals("WIFI")) {
            return "13";
        }
        return strA.equals("BOTH") ? "14" : "15";
    }

    public static String b(byte[] bArr) {
        try {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                bArr2[i10] = bArr[i10];
                for (byte b10 : G) {
                    bArr2[i10] = (byte) (b10 ^ bArr2[i10]);
                }
            }
            return new String(bArr2);
        } catch (Throwable th2) {
            f.a().a(th2);
            return "";
        }
    }

    private static byte[] b(String str) throws Throwable {
        int i10;
        byte b10;
        int i11;
        byte b11;
        int i12;
        byte b12;
        int i13;
        byte b13;
        try {
            int i14 = 0;
            byte[] bArr = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, Utf8.REPLACEMENT_BYTE, org.apache.tools.tar.c.J, org.apache.tools.tar.c.K, org.apache.tools.tar.c.L, org.apache.tools.tar.c.M, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, com.google.common.base.a.f56668u, 19, com.google.common.base.a.f56671x, com.google.common.base.a.f56672y, com.google.common.base.a.f56673z, com.google.common.base.a.A, com.google.common.base.a.B, com.google.common.base.a.C, -1, -1, -1, -1, -1, -1, com.google.common.base.a.D, com.google.common.base.a.E, com.google.common.base.a.F, com.google.common.base.a.G, com.google.common.base.a.H, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, org.apache.tools.tar.c.F, org.apache.tools.tar.c.G, org.apache.tools.tar.c.H, org.apache.tools.tar.c.I, -1, -1, -1, -1, -1};
            StringBuffer stringBuffer = new StringBuffer();
            byte[] bytes = str.getBytes("US-ASCII");
            int length = bytes.length;
            while (i14 < length) {
                while (true) {
                    i10 = i14 + 1;
                    b10 = bArr[bytes[i14]];
                    if (i10 >= length || b10 != -1) {
                        break;
                        break;
                    }
                    i14 = i10;
                }
                if (b10 == -1) {
                    break;
                }
                while (true) {
                    i11 = i10 + 1;
                    b11 = bArr[bytes[i10]];
                    if (i11 >= length || b11 != -1) {
                        break;
                        break;
                    }
                    i10 = i11;
                }
                if (b11 == -1) {
                    break;
                }
                stringBuffer.append((char) ((b10 << 2) | ((b11 & org.apache.tools.tar.c.F) >>> 4)));
                while (true) {
                    i12 = i11 + 1;
                    byte b14 = bytes[i11];
                    if (b14 != 61) {
                        b12 = bArr[b14];
                        if (i12 >= length || b12 != -1) {
                            break;
                            break;
                        }
                        i11 = i12;
                    } else {
                        return stringBuffer.toString().getBytes("iso8859-1");
                    }
                }
                if (b12 == -1) {
                    break;
                }
                stringBuffer.append((char) (((b11 & 15) << 4) | ((b12 & 60) >>> 2)));
                while (true) {
                    i13 = i12 + 1;
                    byte b15 = bytes[i12];
                    if (b15 != 61) {
                        b13 = bArr[b15];
                        if (i13 >= length || b13 != -1) {
                            break;
                            break;
                        }
                        i12 = i13;
                    } else {
                        return stringBuffer.toString().getBytes("iso8859-1");
                    }
                }
                if (b13 == -1) {
                    break;
                }
                stringBuffer.append((char) (b13 | ((b12 & 3) << 6)));
                i14 = i13;
            }
            return stringBuffer.toString().getBytes("iso8859-1");
        } catch (Throwable th2) {
            f.a().a(th2);
            throw th2;
        }
    }

    private static byte[] b(String str, byte[] bArr, String str2) throws Throwable {
        return a(str, bArr, str2, true);
    }

    public static String c(Context context) {
        String strD = al.d();
        return "-1".equals(strD) ? "00000" : strD;
    }
}
