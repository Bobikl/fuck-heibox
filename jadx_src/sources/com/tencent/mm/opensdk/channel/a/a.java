package com.tencent.mm.opensdk.channel.a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.opensdk.constants.Build;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: com.tencent.mm.opensdk.channel.a.a$a, reason: collision with other inner class name */
    public static class C0970a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f100887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f100888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f100889c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f100890d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Bundle f100891e;
    }

    public static int a(Bundle bundle, String str, int i10) {
        if (bundle == null) {
            return i10;
        }
        try {
            return bundle.getInt(str, i10);
        } catch (Exception e10) {
            Log.e("MicroMsg.IntentUtil", "getIntExtra exception:" + e10.getMessage());
            return i10;
        }
    }

    public static Object a(int i10, String str) {
        try {
            switch (i10) {
                case 1:
                    return Integer.valueOf(str);
                case 2:
                    return Long.valueOf(str);
                case 3:
                    return str;
                case 4:
                    return Boolean.valueOf(str);
                case 5:
                    return Float.valueOf(str);
                case 6:
                    return Double.valueOf(str);
                default:
                    Log.e("MicroMsg.SDK.PluginProvider.Resolver", "unknown type");
                    return null;
            }
        } catch (Exception e10) {
            Log.e("MicroMsg.SDK.PluginProvider.Resolver", "resolveObj exception:" + e10.getMessage());
            return null;
        }
    }

    public static String a(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        try {
            return bundle.getString(str);
        } catch (Exception e10) {
            Log.e("MicroMsg.IntentUtil", "getStringExtra exception:" + e10.getMessage());
            return null;
        }
    }

    public static boolean a(Context context, C0970a c0970a) {
        String str;
        if (context == null || c0970a == null) {
            str = "send fail, invalid argument";
        } else {
            if (!b.b(c0970a.f100888b)) {
                String str2 = null;
                if (!b.b(c0970a.f100887a)) {
                    str2 = c0970a.f100887a + ".permission.MM_MESSAGE";
                }
                Intent intent = new Intent(c0970a.f100888b);
                Bundle bundle = c0970a.f100891e;
                if (bundle != null) {
                    intent.putExtras(bundle);
                }
                String packageName = context.getPackageName();
                intent.putExtra(ConstantsAPI.SDK_VERSION, Build.SDK_INT);
                intent.putExtra(ConstantsAPI.APP_PACKAGE, packageName);
                intent.putExtra(ConstantsAPI.CONTENT, c0970a.f100889c);
                intent.putExtra(ConstantsAPI.APP_SUPORT_CONTENT_TYPE, c0970a.f100890d);
                intent.putExtra(ConstantsAPI.CHECK_SUM, a(c0970a.f100889c, Build.SDK_INT, packageName));
                context.sendBroadcast(intent, str2);
                Log.d("MicroMsg.SDK.MMessage", "send mm message, intent=" + intent + ", perm=" + str2);
                return true;
            }
            str = "send fail, action is null";
        }
        Log.e("MicroMsg.SDK.MMessage", str);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:132:0x015f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0120 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x00f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x0116 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x015a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x011b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0150: MOVE (r2 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:104:0x0150 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    public static byte[] a(String str, int i10) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        ?? r10;
        ByteArrayOutputStream byteArrayOutputStream3;
        Object obj;
        ?? r11;
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        Exception e10;
        HttpURLConnection httpURLConnection2;
        InputStream inputStream2;
        IOException e11;
        HttpURLConnection httpURLConnection3;
        InputStream inputStream3;
        MalformedURLException e12;
        HttpURLConnection httpURLConnection4;
        InputStream inputStream4;
        ByteArrayOutputStream byteArrayOutputStream4;
        ByteArrayOutputStream byteArrayOutputStream5;
        ByteArrayOutputStream byteArrayOutputStream6;
        HttpURLConnection httpURLConnection5;
        HttpURLConnection httpURLConnection6;
        HttpURLConnection httpURLConnection7;
        ?? r12 = 0;
        if (str != null) {
            int length = str.length();
            try {
                if (length != 0) {
                    try {
                        HttpURLConnection httpURLConnection8 = (HttpURLConnection) new URL(str).openConnection();
                        try {
                            if (httpURLConnection8 == null) {
                                Log.e("MicroMsg.SDK.NetUtil", "open connection failed.");
                                if (httpURLConnection8 != null) {
                                    try {
                                        httpURLConnection8.disconnect();
                                    } catch (Throwable unused) {
                                    }
                                }
                                return null;
                            }
                            try {
                                httpURLConnection8.setRequestMethod("GET");
                                httpURLConnection8.setConnectTimeout(i10);
                                httpURLConnection8.setReadTimeout(i10);
                                if (httpURLConnection8.getResponseCode() >= 300) {
                                    Log.e("MicroMsg.SDK.NetUtil", "httpURLConnectionGet 300");
                                    try {
                                        httpURLConnection8.disconnect();
                                    } catch (Throwable unused2) {
                                    }
                                    return null;
                                }
                                InputStream inputStream5 = httpURLConnection8.getInputStream();
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream7 = new ByteArrayOutputStream();
                                    try {
                                        byte[] bArr = new byte[1024];
                                        while (true) {
                                            int i11 = inputStream5.read(bArr);
                                            if (i11 == -1) {
                                                break;
                                            }
                                            byteArrayOutputStream7.write(bArr, 0, i11);
                                        }
                                        byte[] byteArray = byteArrayOutputStream7.toByteArray();
                                        Log.d("MicroMsg.SDK.NetUtil", "httpGet end");
                                        try {
                                            httpURLConnection8.disconnect();
                                        } catch (Throwable unused3) {
                                        }
                                        try {
                                            inputStream5.close();
                                        } catch (Throwable unused4) {
                                        }
                                        try {
                                            byteArrayOutputStream7.close();
                                        } catch (Throwable unused5) {
                                        }
                                        return byteArray;
                                    } catch (MalformedURLException e13) {
                                        inputStream4 = inputStream5;
                                        e12 = e13;
                                        byteArrayOutputStream6 = byteArrayOutputStream7;
                                        httpURLConnection7 = httpURLConnection8;
                                    } catch (IOException e14) {
                                        inputStream3 = inputStream5;
                                        e11 = e14;
                                        byteArrayOutputStream5 = byteArrayOutputStream7;
                                        httpURLConnection6 = httpURLConnection8;
                                        Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + e11.getMessage());
                                        if (httpURLConnection6 != null) {
                                            try {
                                                httpURLConnection6.disconnect();
                                            } catch (Throwable unused6) {
                                            }
                                        }
                                        if (inputStream3 != null) {
                                            try {
                                                inputStream3.close();
                                            } catch (Throwable unused7) {
                                            }
                                        }
                                        if (byteArrayOutputStream5 != null) {
                                            try {
                                                byteArrayOutputStream5.close();
                                            } catch (Throwable unused8) {
                                            }
                                        }
                                        return null;
                                    } catch (Exception e15) {
                                        inputStream2 = inputStream5;
                                        e10 = e15;
                                        byteArrayOutputStream4 = byteArrayOutputStream7;
                                        httpURLConnection5 = httpURLConnection8;
                                        Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + e10.getMessage());
                                        if (httpURLConnection5 != null) {
                                            try {
                                                httpURLConnection5.disconnect();
                                            } catch (Throwable unused9) {
                                            }
                                        }
                                        if (inputStream2 != null) {
                                            try {
                                                inputStream2.close();
                                            } catch (Throwable unused10) {
                                            }
                                        }
                                        if (byteArrayOutputStream4 != null) {
                                            try {
                                                byteArrayOutputStream4.close();
                                            } catch (Throwable unused11) {
                                            }
                                        }
                                        return null;
                                    } catch (Throwable th2) {
                                        byteArrayOutputStream2 = byteArrayOutputStream7;
                                        r11 = inputStream5;
                                        th = th2;
                                        obj = httpURLConnection8;
                                        byteArrayOutputStream3 = byteArrayOutputStream2;
                                        r12 = r11;
                                        r10 = obj;
                                        if (r10 != 0) {
                                            try {
                                                r10.disconnect();
                                            } catch (Throwable unused12) {
                                            }
                                        }
                                        if (r12 != 0) {
                                            try {
                                                r12.close();
                                            } catch (Throwable unused13) {
                                            }
                                        }
                                        if (byteArrayOutputStream3 == null) {
                                            throw th;
                                        }
                                        try {
                                            byteArrayOutputStream3.close();
                                            throw th;
                                        } catch (Throwable unused14) {
                                            throw th;
                                        }
                                    }
                                } catch (MalformedURLException e16) {
                                    inputStream4 = inputStream5;
                                    e12 = e16;
                                    httpURLConnection4 = httpURLConnection8;
                                    byteArrayOutputStream6 = null;
                                    httpURLConnection7 = httpURLConnection4;
                                } catch (IOException e17) {
                                    inputStream3 = inputStream5;
                                    e11 = e17;
                                    httpURLConnection3 = httpURLConnection8;
                                    byteArrayOutputStream5 = null;
                                    httpURLConnection6 = httpURLConnection3;
                                    Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + e11.getMessage());
                                    if (httpURLConnection6 != null) {
                                        httpURLConnection6.disconnect();
                                    }
                                    if (inputStream3 != null) {
                                        inputStream3.close();
                                    }
                                    if (byteArrayOutputStream5 != null) {
                                        byteArrayOutputStream5.close();
                                    }
                                    return null;
                                } catch (Exception e18) {
                                    inputStream2 = inputStream5;
                                    e10 = e18;
                                    httpURLConnection2 = httpURLConnection8;
                                    byteArrayOutputStream4 = null;
                                    httpURLConnection5 = httpURLConnection2;
                                    Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + e10.getMessage());
                                    if (httpURLConnection5 != null) {
                                        httpURLConnection5.disconnect();
                                    }
                                    if (inputStream2 != null) {
                                        inputStream2.close();
                                    }
                                    if (byteArrayOutputStream4 != null) {
                                        byteArrayOutputStream4.close();
                                    }
                                    return null;
                                } catch (Throwable th3) {
                                    inputStream = inputStream5;
                                    th = th3;
                                    httpURLConnection = httpURLConnection8;
                                    r12 = inputStream;
                                    byteArrayOutputStream3 = null;
                                    r10 = httpURLConnection;
                                    if (r10 != 0) {
                                        r10.disconnect();
                                    }
                                    if (r12 != 0) {
                                        r12.close();
                                    }
                                    if (byteArrayOutputStream3 == null) {
                                        throw th;
                                    }
                                    byteArrayOutputStream3.close();
                                    throw th;
                                }
                            } catch (MalformedURLException e19) {
                                e12 = e19;
                                inputStream4 = null;
                                httpURLConnection4 = httpURLConnection8;
                            } catch (IOException e20) {
                                e11 = e20;
                                inputStream3 = null;
                                httpURLConnection3 = httpURLConnection8;
                            } catch (Exception e21) {
                                e10 = e21;
                                inputStream2 = null;
                                httpURLConnection2 = httpURLConnection8;
                            } catch (Throwable th4) {
                                th = th4;
                                inputStream = null;
                                httpURLConnection = httpURLConnection8;
                            }
                            byteArrayOutputStream6 = null;
                            httpURLConnection7 = httpURLConnection4;
                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + e12.getMessage());
                            if (httpURLConnection7 != null) {
                                try {
                                    httpURLConnection7.disconnect();
                                } catch (Throwable unused15) {
                                }
                            }
                            if (inputStream4 != null) {
                                try {
                                    inputStream4.close();
                                } catch (Throwable unused16) {
                                }
                            }
                            if (byteArrayOutputStream6 != null) {
                                try {
                                    byteArrayOutputStream6.close();
                                } catch (Throwable unused17) {
                                }
                            }
                            return null;
                        } catch (MalformedURLException e22) {
                            e12 = e22;
                            inputStream4 = null;
                            byteArrayOutputStream6 = null;
                            httpURLConnection7 = httpURLConnection8;
                        } catch (IOException e23) {
                            e11 = e23;
                            inputStream3 = null;
                            byteArrayOutputStream5 = null;
                            httpURLConnection6 = httpURLConnection8;
                        } catch (Exception e24) {
                            e10 = e24;
                            inputStream2 = null;
                            byteArrayOutputStream4 = null;
                            httpURLConnection5 = httpURLConnection8;
                        } catch (Throwable th5) {
                            th = th5;
                            byteArrayOutputStream3 = null;
                            r10 = httpURLConnection8;
                            if (r10 != 0) {
                                r10.disconnect();
                            }
                            if (r12 != 0) {
                                r12.close();
                            }
                            if (byteArrayOutputStream3 == null) {
                                throw th;
                            }
                            byteArrayOutputStream3.close();
                            throw th;
                        }
                    } catch (MalformedURLException e25) {
                        e12 = e25;
                        httpURLConnection4 = null;
                        inputStream4 = null;
                    } catch (IOException e26) {
                        e11 = e26;
                        httpURLConnection3 = null;
                        inputStream3 = null;
                    } catch (Exception e27) {
                        e10 = e27;
                        httpURLConnection2 = null;
                        inputStream2 = null;
                    } catch (Throwable th6) {
                        th = th6;
                        httpURLConnection = null;
                        inputStream = null;
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                byteArrayOutputStream2 = byteArrayOutputStream;
                r11 = length;
                obj = str;
            }
        }
        Log.e("MicroMsg.SDK.NetUtil", "httpGet, url is null");
        return null;
    }

    public static byte[] a(String str, int i10, String str2) {
        String str3;
        StringBuffer stringBuffer = new StringBuffer();
        if (str != null) {
            stringBuffer.append(str);
        }
        stringBuffer.append(i10);
        stringBuffer.append(str2);
        stringBuffer.append("mMcShCsTr");
        byte[] bytes = stringBuffer.toString().substring(1, 9).getBytes();
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            char[] cArr2 = new char[bArrDigest.length * 2];
            int i11 = 0;
            for (byte b10 : bArrDigest) {
                int i12 = i11 + 1;
                cArr2[i11] = cArr[(b10 >>> 4) & 15];
                i11 = i12 + 1;
                cArr2[i12] = cArr[b10 & 15];
            }
            str3 = new String(cArr2);
        } catch (Exception unused) {
            str3 = null;
        }
        return str3.getBytes();
    }
}
