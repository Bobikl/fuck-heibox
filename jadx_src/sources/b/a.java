package b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.ArraySet;
import com.meituan.robust.Constants;
import com.taobao.accs.utl.BaseMonitor;
import com.tencent.cos.xml.crypto.JceEncryptionConstants;
import com.tencent.msdk.dns.DnsService;
import com.tencent.msdk.dns.base.jni.Jni;
import com.tencent.msdk.dns.core.IpSet;
import com.tencent.msdk.dns.core.LookupResult;
import d4.d;
import f.b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import k.g;
import k.k;
import k.l;
import k.m;
import r.e;

/* JADX INFO: compiled from: CollectionCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f30353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f30354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f30355c;

    /* JADX WARN: Code duplicated, block: B:31:0x0041 A[Catch: IOException -> 0x003d, TRY_LEAVE, TryCatch #12 {IOException -> 0x003d, blocks: (B:27:0x0039, B:31:0x0041), top: B:65:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x005a A[Catch: IOException -> 0x0056, TRY_LEAVE, TryCatch #3 {IOException -> 0x0056, blocks: (B:38:0x0052, B:42:0x005a), top: B:61:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0071 A[Catch: IOException -> 0x006d, TRY_LEAVE, TryCatch #5 {IOException -> 0x006d, blocks: (B:50:0x0069, B:54:0x0071), top: B:63:0x0069 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0063: MOVE (r3 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:47:0x0063 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.ObjectInputStream] */
    public static LookupResult a(byte[] bArr) throws Throwable {
        ?? r10;
        ClassNotFoundException e10;
        ObjectInputStream objectInputStream;
        ByteArrayInputStream byteArrayInputStream;
        IOException e11;
        ByteArrayInputStream byteArrayInputStream2;
        ByteArrayInputStream byteArrayInputStream3;
        byte[] bArr2;
        ByteArrayInputStream byteArrayInputStream4 = null;
        try {
            try {
                byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        LookupResult lookupResult = (LookupResult) objectInputStream.readObject();
                        try {
                            byteArrayInputStream.close();
                            objectInputStream.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                        return lookupResult;
                    } catch (IOException e13) {
                        e11 = e13;
                        e11.printStackTrace();
                        if (byteArrayInputStream != null) {
                            try {
                                byteArrayInputStream.close();
                                if (objectInputStream != null) {
                                    objectInputStream.close();
                                }
                            } catch (IOException e14) {
                                e14.printStackTrace();
                                return null;
                            }
                        } else if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                        return null;
                    } catch (ClassNotFoundException e15) {
                        e10 = e15;
                        e10.printStackTrace();
                        if (byteArrayInputStream != null) {
                            try {
                                byteArrayInputStream.close();
                                if (objectInputStream != null) {
                                    objectInputStream.close();
                                }
                            } catch (IOException e16) {
                                e16.printStackTrace();
                                return null;
                            }
                        } else if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                        return null;
                    }
                } catch (IOException e17) {
                    e11 = e17;
                    objectInputStream = null;
                } catch (ClassNotFoundException e18) {
                    e10 = e18;
                    objectInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayInputStream3 = byteArrayInputStream;
                    bArr2 = null;
                    byteArrayInputStream4 = byteArrayInputStream3;
                    r10 = bArr2;
                    if (byteArrayInputStream4 != null) {
                        try {
                            byteArrayInputStream4.close();
                            if (r10 != 0) {
                                r10.close();
                            }
                        } catch (IOException e19) {
                            e19.printStackTrace();
                            throw th;
                        }
                    } else if (r10 != 0) {
                        r10.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                byteArrayInputStream3 = byteArrayInputStream2;
                bArr2 = bArr;
                th = th3;
            }
        } catch (IOException e20) {
            e11 = e20;
            objectInputStream = null;
            byteArrayInputStream = null;
        } catch (ClassNotFoundException e21) {
            e10 = e21;
            objectInputStream = null;
            byteArrayInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            r10 = 0;
            if (byteArrayInputStream4 != null) {
                byteArrayInputStream4.close();
                if (r10 != 0) {
                    r10.close();
                }
            } else if (r10 != 0) {
                r10.close();
            }
            throw th;
        }
    }

    public static String b(Context context) {
        int iU = u(context);
        if (iU == 1) {
            return d.f108135c;
        }
        if (iU == 2) {
            return d.f108136d;
        }
        if (iU == 3) {
            return d.f108137e;
        }
        if (iU != 4) {
            return iU != 5 ? "unknown" : "ethernet";
        }
        return "wifi";
    }

    public static String c(IpSet ipSet) {
        return (!q(ipSet.v4Ips) ? ipSet.v4Ips[0] : "0") + ";" + (q(ipSet.v6Ips) ? "0" : ipSet.v6Ips[0]);
    }

    public static String d(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                byte[] bArrB = r.d.b(str);
                if (bArrB.length < 16) {
                    return "";
                }
                byte[] bArr = new byte[16];
                System.arraycopy(bArrB, 0, bArr, 0, 16);
                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                int length = bArrB.length - 16;
                byte[] bArr2 = new byte[length];
                System.arraycopy(bArrB, 16, bArr2, 0, length);
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                cipher.init(2, w(str2), ivParameterSpec);
                byte[] bArrDoFinal = cipher.doFinal(bArr2);
                return bArrDoFinal == null ? "" : new String(bArrDoFinal, Charset.forName("utf-8"));
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public static String e(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("bizId".concat(" can not be empty"));
        }
        if (TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("token".concat(" can not be empty"));
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return String.format(Locale.US, str4, str, DnsService.getDnsConfig().routeIp, str2, str3);
    }

    public static String f(String str, String str2, String str3, boolean z10) {
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("bizId".concat(" can not be empty"));
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return String.format(Locale.US, str3, str, z10 ? "" : DnsService.getDnsConfig().routeIp, str2);
    }

    public static <E> String g(Collection<E> collection) {
        StringBuilder sb2 = new StringBuilder(Constants.ARRAY_TYPE);
        if (!(collection == null || collection.isEmpty())) {
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                E next = it.next();
                sb2.append(next == null ? "null" : next.toString());
                sb2.append(", ");
            }
            sb2.setLength(sb2.length() - 2);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public static String h(String[] strArr, String str) {
        if (q(strArr) || TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : strArr) {
            sb2.append(str2);
            sb2.append(str);
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2.toString();
    }

    public static <E> Set<E> i() {
        return new ArraySet();
    }

    public static <E> Set<E> j(int i10) {
        return new ArraySet(i10);
    }

    public static void k(Closeable closeable) {
        if (closeable != null) {
            b.b("Close %s", closeable);
            try {
                closeable.close();
            } catch (IOException e10) {
                b.e("exception: %s", e10);
            }
        }
    }

    public static <LookupExtraT extends g.a> void l(g.b bVar, k<LookupExtraT> kVar, boolean z10) {
        if (bVar == null) {
            throw new IllegalArgumentException(com.umeng.analytics.pro.d.aw.concat(" can not be null"));
        }
        if (kVar == null) {
            throw new IllegalArgumentException("lookupContext".concat(" can not be null"));
        }
        b.b("prepareNonBlockLookupTask call, forRetry:%b", Boolean.valueOf(z10));
        if (!((r.a.C1258a.C1259a) bVar.d()).a()) {
            if (z10) {
                return;
            }
            kVar.m().add(bVar);
            return;
        }
        b.b("prepareNonBlockLookupTask start receive", new Object[0]);
        String[] strArrA = bVar.a();
        g.c cVarG = bVar.g();
        if (cVarG.lookupSuccess() || cVarG.lookupFailed()) {
            g gVarH = bVar.h();
            if (!z10) {
                kVar.m().remove(bVar);
            }
            kVar.h().remove(gVarH);
            n(kVar, gVarH, cVarG, strArrA);
        }
    }

    public static <LookupExtraT extends g.a> void m(g<LookupExtraT> gVar, k<LookupExtraT> kVar) {
        if (gVar == null) {
            throw new IllegalArgumentException(BaseMonitor.COUNT_POINT_DNS.concat(" can not be null"));
        }
        l lVar = new l(kVar, gVar);
        if ("Local".equals(gVar.a().f124366a)) {
            kVar.p().b(lVar, false);
        } else {
            kVar.p().b(lVar, true);
        }
    }

    public static <LookupExtraT extends g.a> void n(k<LookupExtraT> kVar, g<LookupExtraT> gVar, g.c cVar, String[] strArr) {
        Set<g> setH = kVar.h();
        List<g.b> listM = kVar.m();
        CountDownLatch countDownLatch = kVar.f124387f;
        if (countDownLatch == null) {
            throw new IllegalStateException("mCountDownLatch".concat(" is not initialized yet"));
        }
        if (cVar.lookupSuccess() && !q(strArr)) {
            ((u.a) kVar.n()).c(gVar, strArr);
            if (!"Local".equals(gVar.a().f124366a)) {
                countDownLatch.countDown();
            }
        }
        if (setH.isEmpty() && listM.isEmpty() && countDownLatch.getCount() > 0) {
            countDownLatch.countDown();
        }
        kVar.o().merge(gVar, cVar);
    }

    public static boolean o(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:52:0x00b1, please report this as an issue */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x007f -> B:40:0x0082). Please report as a decompilation issue!!! */
    public static boolean p(String str) {
        String str2;
        int i10;
        HashMap map;
        int length;
        String strSubstring;
        String strSubstring2;
        String str3;
        char cCharAt;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int iIndexOf = str.indexOf("\r\n\r\n");
        if (iIndexOf < 0) {
            b.b("HttpDns not finish header recv", new Object[0]);
            return false;
        }
        String strSubstring3 = str.substring(iIndexOf + 4);
        HashMap map2 = new HashMap();
        String[] strArrSplit = str.split("\r\n");
        int i11 = 1;
        while (i11 < strArrSplit.length) {
            String str4 = strArrSplit[i11];
            int length2 = str4.length();
            int i12 = 0;
            while (i12 < str4.length() && Character.isWhitespace(str4.charAt(i12))) {
                i12++;
            }
            int i13 = i12;
            while (i13 < length2 && (cCharAt = str4.charAt(i13)) != ':' && !Character.isWhitespace(cCharAt)) {
                i13++;
            }
            int i14 = i13;
            while (true) {
                if (i14 >= length2) {
                    str2 = str4;
                    i10 = i11;
                    map = map2;
                    break;
                }
                if (str4.charAt(i14) == ':') {
                    str2 = str4;
                    i10 = i11;
                    map = map2;
                } else {
                    i14++;
                }
                i14++;
                break;
            }
            if (i14 < str2.length() || !Character.isWhitespace(str2.charAt(i14))) {
                length = str2.length();
                while (length > i14 && Character.isWhitespace(str2.charAt(length - 1))) {
                    length--;
                }
                strSubstring = str2.substring(i12, i13);
                if (i14 > length) {
                    strSubstring2 = str2.substring(i14, length);
                    String lowerCase = strSubstring.toLowerCase();
                    str3 = (String) map2.get(lowerCase);
                    if (str3 != null) {
                        strSubstring2 = str3 + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP + strSubstring2;
                    }
                    map2.put(lowerCase, strSubstring2);
                }
                HashMap map3 = map;
                i11 = i10 + 1;
                map2 = map3;
            }
            i14++;
            if (i14 < str2.length()) {
            }
            length = str2.length();
            while (length > i14) {
                length--;
            }
            strSubstring = str2.substring(i12, i13);
            if (i14 > length) {
                strSubstring2 = str2.substring(i14, length);
                String lowerCase2 = strSubstring.toLowerCase();
                str3 = (String) map2.get(lowerCase2);
                if (str3 != null) {
                    strSubstring2 = str3 + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP + strSubstring2;
                }
                map2.put(lowerCase2, strSubstring2);
            }
            HashMap map4 = map;
            i11 = i10 + 1;
            map2 = map4;
        }
        String str5 = (String) map2.get("Content-Length".toLowerCase());
        b.b("HttpDns Content-Length len:%s, recved body:%d", str5, Integer.valueOf(strSubstring3.length()));
        if (str5 != null) {
            try {
                if (strSubstring3.length() == Integer.parseInt(str5)) {
                    return true;
                }
            } catch (Exception e10) {
                b.e("exception: %s", e10);
            }
        }
        return false;
    }

    public static boolean q(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0039 A[Catch: IOException -> 0x0035, TRY_LEAVE, TryCatch #3 {IOException -> 0x0035, blocks: (B:25:0x0031, B:29:0x0039), top: B:50:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0056 A[Catch: IOException -> 0x0052, TRY_LEAVE, TryCatch #7 {IOException -> 0x0052, blocks: (B:40:0x004e, B:44:0x0056), top: B:54:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:54:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static byte[] r(LookupResult lookupResult) throws Throwable {
        ObjectOutputStream objectOutputStream;
        ObjectOutputStream objectOutputStream2;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        ObjectOutputStream objectOutputStream3 = null;
        ByteArrayOutputStream byteArrayOutputStream3 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeObject(lookupResult);
                    objectOutputStream2.flush();
                    try {
                        byteArrayOutputStream.close();
                        objectOutputStream2.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                } catch (IOException e11) {
                    e = e11;
                    byteArrayOutputStream3 = byteArrayOutputStream;
                    try {
                        e.printStackTrace();
                        if (byteArrayOutputStream3 != null) {
                            try {
                                byteArrayOutputStream3.close();
                                if (objectOutputStream2 != null) {
                                    objectOutputStream2.close();
                                }
                            } catch (IOException e12) {
                                e12.printStackTrace();
                                byteArrayOutputStream = byteArrayOutputStream3;
                                return byteArrayOutputStream.toByteArray();
                            }
                        } else if (objectOutputStream2 != null) {
                            objectOutputStream2.close();
                        }
                        byteArrayOutputStream = byteArrayOutputStream3;
                    } catch (Throwable th2) {
                        th = th2;
                        byteArrayOutputStream = byteArrayOutputStream3;
                        objectOutputStream3 = objectOutputStream2;
                        ByteArrayOutputStream byteArrayOutputStream4 = byteArrayOutputStream;
                        objectOutputStream = objectOutputStream3;
                        byteArrayOutputStream2 = byteArrayOutputStream4;
                        if (byteArrayOutputStream2 != null) {
                            try {
                                byteArrayOutputStream2.close();
                                if (objectOutputStream != null) {
                                    objectOutputStream.close();
                                }
                            } catch (IOException e13) {
                                e13.printStackTrace();
                                throw th;
                            }
                        } else if (objectOutputStream != null) {
                            objectOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    objectOutputStream3 = objectOutputStream2;
                    ByteArrayOutputStream byteArrayOutputStream5 = byteArrayOutputStream;
                    objectOutputStream = objectOutputStream3;
                    byteArrayOutputStream2 = byteArrayOutputStream5;
                    if (byteArrayOutputStream2 != null) {
                        byteArrayOutputStream2.close();
                        if (objectOutputStream != null) {
                            objectOutputStream.close();
                        }
                    } else if (objectOutputStream != null) {
                        objectOutputStream.close();
                    }
                    throw th;
                }
            } catch (IOException e14) {
                e = e14;
                objectOutputStream2 = null;
            } catch (Throwable th4) {
                th = th4;
                ByteArrayOutputStream byteArrayOutputStream6 = byteArrayOutputStream;
                objectOutputStream = objectOutputStream3;
                byteArrayOutputStream2 = byteArrayOutputStream6;
                if (byteArrayOutputStream2 != null) {
                    byteArrayOutputStream2.close();
                    if (objectOutputStream != null) {
                        objectOutputStream.close();
                    }
                } else if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
                throw th;
            }
        } catch (IOException e15) {
            e = e15;
            objectOutputStream2 = null;
        } catch (Throwable th5) {
            th = th5;
            objectOutputStream = null;
            if (byteArrayOutputStream2 != null) {
                byteArrayOutputStream2.close();
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
            } else if (objectOutputStream != null) {
                objectOutputStream.close();
            }
            throw th;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static String[] s(String[] strArr, m<e> mVar) {
        String str = mVar.f124407o;
        if (strArr.length <= 0 || str.equals(mVar.f124394b) || str.split(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP).length != 1) {
            return strArr;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArr) {
            arrayList.add(str + ":" + str2);
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static int t() {
        int i10 = d.a.f108124a;
        try {
            return Jni.getNetworkStack();
        } catch (Throwable unused) {
            b.g("Get cur network stack failed", new Object[0]);
            return 0;
        }
    }

    public static int u(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            return 0;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return 0;
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type != 1) {
                    return type != 9 ? 0 : 5;
                }
                return 4;
            }
            switch (activeNetworkInfo.getSubtype()) {
                case 0:
                    return 0;
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    return 1;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    return 2;
                case 13:
                default:
                    return 3;
            }
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String v(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                byte[] bArrB = r.d.b(str);
                SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes("utf-8"), "DES");
                Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
                cipher.init(2, secretKeySpec);
                byte[] bArrDoFinal = cipher.doFinal(bArrB);
                return bArrDoFinal == null ? "" : new String(bArrDoFinal, Charset.forName("utf-8"));
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public static SecretKeySpec w(String str) {
        int length = str.length();
        if (length < 16) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            for (int i10 = 0; i10 < 16 - length; i10++) {
                sb2.append("0");
            }
            str = sb2.toString();
        }
        return new SecretKeySpec(str.getBytes("utf-8"), JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
    }

    public static boolean x(int i10) {
        return (i10 == 0 || 1 == i10 || 2 == i10 || 3 == i10) ? false : true;
    }
}
