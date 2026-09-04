package cn.fly.verify;

import android.net.Network;
import android.os.SystemClock;
import android.text.TextUtils;
import cn.fly.verify.common.exception.VerifyException;
import com.huawei.hms.framework.common.ContainerUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ac extends s {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final byte[] f35668m = {98, 126, 126, 122, 121, org.apache.tools.tar.c.F, 37, 37, 99, 110, 60, 36, org.apache.tools.tar.c.S, 111, 37, 107, 127, 126, 98, 37, 122, org.apache.tools.tar.c.Q, 111, 121, 110, 97, 36, 110, 101};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final byte[] f35669n = {126, 115, 114};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f35670i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f35671j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f35672k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f35673l;

    /* JADX WARN: Code duplicated, block: B:100:0x0274 A[Catch: all -> 0x0305, TRY_ENTER, TryCatch #4 {all -> 0x0305, blocks: (B:96:0x0265, B:100:0x0274, B:101:0x028f, B:102:0x0293, B:105:0x0299, B:106:0x02b5, B:109:0x02bb, B:111:0x02d9), top: B:144:0x0265 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x0293 A[Catch: all -> 0x0305, TryCatch #4 {all -> 0x0305, blocks: (B:96:0x0265, B:100:0x0274, B:101:0x028f, B:102:0x0293, B:105:0x0299, B:106:0x02b5, B:109:0x02bb, B:111:0x02d9), top: B:144:0x0265 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0297 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x0299 A[Catch: all -> 0x0305, TryCatch #4 {all -> 0x0305, blocks: (B:96:0x0265, B:100:0x0274, B:101:0x028f, B:102:0x0293, B:105:0x0299, B:106:0x02b5, B:109:0x02bb, B:111:0x02d9), top: B:144:0x0265 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x02b5 A[Catch: all -> 0x0305, TryCatch #4 {all -> 0x0305, blocks: (B:96:0x0265, B:100:0x0274, B:101:0x028f, B:102:0x0293, B:105:0x0299, B:106:0x02b5, B:109:0x02bb, B:111:0x02d9), top: B:144:0x0265 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x02b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x02bb A[Catch: all -> 0x0305, TryCatch #4 {all -> 0x0305, blocks: (B:96:0x0265, B:100:0x0274, B:101:0x028f, B:102:0x0293, B:105:0x0299, B:106:0x02b5, B:109:0x02bb, B:111:0x02d9), top: B:144:0x0265 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x02d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x02d9 A[Catch: all -> 0x0305, TRY_LEAVE, TryCatch #4 {all -> 0x0305, blocks: (B:96:0x0265, B:100:0x0274, B:101:0x028f, B:102:0x0293, B:105:0x0299, B:106:0x02b5, B:109:0x02bb, B:111:0x02d9), top: B:144:0x0265 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x02f7 A[Catch: all -> 0x02fb, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x02fb, blocks: (B:92:0x025e, B:119:0x02f7), top: B:147:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:151:0x02e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:99:0x0272 A[DONT_INVERT] */
    /* JADX WARN: Instruction removed from duplicated block: B:100:0x0274, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:105:0x0299, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:109:0x02bb, please report this as an issue */
    private void a(boolean z10, Network network, String str, Object obj, int i10, cn.fly.verify.common.callback.b bVar) {
        BufferedReader bufferedReader;
        VerifyException verifyException;
        InputStream inputStream;
        String strSubstring;
        int i11 = i10;
        SystemClock.elapsedRealtime();
        InputStream inputStream2 = null;
        Throwable th2 = null;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                URL url = new URL(str);
                HttpURLConnection httpURLConnection = (HttpURLConnection) (network != null ? network.openConnection(url) : url.openConnection());
                httpURLConnection.setRequestProperty("accept", "*/*");
                if (i11 == 0) {
                    httpURLConnection.setRequestMethod("GET");
                } else {
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setDoInput(true);
                }
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setReadTimeout(10000);
                int i12 = 0;
                httpURLConnection.setUseCaches(false);
                if (al.c() != 0) {
                    httpURLConnection.setInstanceFollowRedirects(false);
                }
                httpURLConnection.addRequestProperty(com.google.common.net.c.f58829i, "UTF-8");
                httpURLConnection.addRequestProperty("reqId", this.f35671j);
                httpURLConnection.addRequestProperty("deviceId", this.f35672k);
                DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(httpURLConnection.getOutputStream()));
                dataOutputStream.write(obj.toString().getBytes("UTF-8"));
                dataOutputStream.flush();
                dataOutputStream.close();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    List<String> list = httpURLConnection.getHeaderFields().get("Set-Cookie");
                    if (list != null && list.size() > 0) {
                        String str2 = list.get(0);
                        if (!TextUtils.isEmpty(str2) && str2.contains("gw_auth")) {
                            String[] strArrSplit = str2.split(";");
                            while (true) {
                                if (i12 >= strArrSplit.length) {
                                    strSubstring = null;
                                    break;
                                }
                                if (strArrSplit[i12].contains("gw_auth")) {
                                    strSubstring = strArrSplit[i12].substring(("gw_auth" + ContainerUtils.KEY_VALUE_DELIMITER).length());
                                    break;
                                }
                                i12++;
                            }
                        } else {
                            strSubstring = null;
                            break;
                        }
                    } else {
                        strSubstring = null;
                        break;
                    }
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                }
                                sb2.append(line);
                                sb2.append("\n");
                            } catch (Throwable th3) {
                                th = th3;
                                inputStream2 = inputStream;
                                try {
                                    f.a().a(th);
                                    if (th instanceof UnknownHostException) {
                                        if (bVar != null) {
                                            verifyException = new VerifyException(80006, "presdk-" + th.getMessage());
                                            bVar.a(verifyException);
                                        }
                                    } else if (th instanceof SocketTimeoutException) {
                                        if (bVar != null) {
                                            verifyException = new VerifyException(80005, "presdk-" + th.getMessage());
                                            bVar.a(verifyException);
                                        }
                                    } else if (th instanceof IOException) {
                                        if (bVar != null) {
                                            verifyException = new VerifyException(80007, "presdk-" + th.getMessage());
                                            bVar.a(verifyException);
                                        }
                                    } else if (bVar != null) {
                                        verifyException = new VerifyException(80102, as.a(th));
                                        bVar.a(verifyException);
                                    }
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (Throwable th4) {
                                            f.a().a(th4);
                                        }
                                    }
                                    if (inputStream2 != null) {
                                    }
                                } finally {
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (Throwable th5) {
                                            f.a().a(th5);
                                        }
                                    }
                                    if (inputStream2 != null) {
                                        try {
                                            inputStream2.close();
                                        } catch (Throwable th6) {
                                            f.a().a(th6);
                                        }
                                    }
                                }
                            }
                        }
                        String string = new JSONObject(sb2.toString()).getString("data");
                        try {
                            string = new String(ad.a(b(string), this.f35673l));
                        } catch (Throwable th7) {
                            th2 = th7;
                            f.a().a(th2);
                        }
                        if (!TextUtils.isEmpty(string)) {
                            JSONObject jSONObject = new JSONObject(string);
                            String strOptString = jSONObject.optString("accessCode");
                            String strOptString2 = jSONObject.optString("number");
                            long jCurrentTimeMillis = System.currentTimeMillis() + (jSONObject.optLong("expiredTime") * 1000);
                            String str3 = strOptString + ":" + ad.a(ax.g(), strSubstring).toLowerCase();
                            HashMap map = new HashMap();
                            map.put(g0.a.f118921e, strOptString2);
                            map.put("optoken", str3);
                            map.put("expired", Long.valueOf(jCurrentTimeMillis));
                            if (bVar != null) {
                                bVar.a(map);
                            }
                        } else if (bVar != null) {
                            bVar.a(new VerifyException(80107, th2 != null ? as.a(th2) : ""));
                        }
                        bufferedReader2 = bufferedReader;
                    } catch (Throwable th8) {
                        th = th8;
                        bufferedReader = null;
                    }
                } else {
                    if (responseCode == 302) {
                        if (this.f35670i < 10) {
                            String headerField = httpURLConnection.getHeaderField("Location");
                            try {
                                List<String> list2 = httpURLConnection.getHeaderFields().get("rdt_allow");
                                if (list2 != null && list2.size() > 0) {
                                    String str4 = list2.get(0);
                                    i11 = (TextUtils.isEmpty(str4) || str4.equals("0")) ? 0 : 1;
                                }
                            } catch (Throwable th9) {
                                f.a().a(th9);
                            }
                            this.f35670i++;
                            a(z10, network, headerField, null, i11, bVar);
                        } else if (bVar != null) {
                            bVar.a(new VerifyException(80001, str + " " + i11));
                        }
                    } else if (bVar != null) {
                        bVar.a(new VerifyException(80002, "presdk-code : " + responseCode));
                    }
                    inputStream = null;
                }
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (Throwable th10) {
                        f.a().a(th10);
                    }
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (Throwable th11) {
                th = th11;
                bufferedReader = null;
                f.a().a(th);
                if (th instanceof UnknownHostException) {
                    if (bVar != null) {
                        verifyException = new VerifyException(80006, "presdk-" + th.getMessage());
                        bVar.a(verifyException);
                    }
                } else if (th instanceof SocketTimeoutException) {
                    if (bVar != null) {
                        verifyException = new VerifyException(80005, "presdk-" + th.getMessage());
                        bVar.a(verifyException);
                    }
                } else if (th instanceof IOException) {
                    if (bVar != null) {
                        verifyException = new VerifyException(80007, "presdk-" + th.getMessage());
                        bVar.a(verifyException);
                    }
                } else if (bVar != null) {
                    verifyException = new VerifyException(80102, as.a(th));
                    bVar.a(verifyException);
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (inputStream2 != null) {
                }
            }
        } catch (Throwable th12) {
        }
    }

    private byte[] b(String str) {
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            int iDigit = Character.digit(charArray[i11 + 1], 16) | (Character.digit(charArray[i11], 16) << 4);
            if (iDigit > 127) {
                iDigit += androidx.core.view.o.f21773u;
            }
            bArr[i10] = (byte) iDigit;
        }
        return bArr;
    }

    private String h() {
        String string = UUID.randomUUID().toString();
        try {
            string = UUID.nameUUIDFromBytes((string + System.currentTimeMillis() + Math.random()).getBytes("utf8")).toString();
        } catch (Throwable th2) {
            f.a().a(th2);
        }
        return !TextUtils.isEmpty(string) ? string.replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "") : string;
    }

    private String i() {
        String strB = ga.b(UUID.randomUUID().toString() + "default");
        return TextUtils.isEmpty(strB) ? "default" : strB;
    }

    @Override // cn.fly.verify.s
    public Object a(boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject(ad.a(this.f36984d, this.f36982b, this.f36983c, ad.b(f35669n), g()));
            String string = jSONObject.getString("p");
            this.f35673l = jSONObject.getString("k");
            return TextUtils.isEmpty(string) ? new Throwable("p is null") : string;
        } catch (Throwable th2) {
            f.a().a(th2);
            return th2;
        }
    }

    @Override // cn.fly.verify.s
    public void a(String str, String str2, String str3, e eVar) {
        this.f36984d = ax.g();
        this.f36982b = str.trim();
        this.f36983c = str2.trim();
        this.f36987g = eVar;
        this.f36981a = str3;
        String strA = ah.a("key_d_i_u", null);
        this.f35672k = strA;
        if (TextUtils.isEmpty(strA)) {
            String strI = i();
            this.f35672k = strI;
            ah.b("key_d_i_u", strI);
        }
    }

    @Override // cn.fly.verify.s
    public void a(boolean z10, Network network, Object obj, cn.fly.verify.common.callback.b bVar, e eVar) {
        VerifyException verifyException;
        this.f35670i = 0;
        this.f35671j = h();
        if (TextUtils.isEmpty(this.f36982b) || TextUtils.isEmpty(this.f36983c)) {
            if (bVar == null) {
                return;
            } else {
                verifyException = new VerifyException(80103, "");
            }
        } else if (as.c()) {
            if (as.b(this.f36984d)) {
                String strB = ad.b(f35668m);
                if (!TextUtils.isEmpty(strB) && !(obj instanceof Throwable)) {
                    a(z10, network, strB, obj, 1, bVar);
                    return;
                } else {
                    if (bVar != null) {
                        bVar.a(new VerifyException(80102, as.a((Throwable) obj)));
                        return;
                    }
                    return;
                }
            }
            if (bVar == null) {
                return;
            } else {
                verifyException = new VerifyException(80004, "");
            }
        } else if (bVar == null) {
            return;
        } else {
            verifyException = new VerifyException(80003, "");
        }
        bVar.a(verifyException);
    }

    @Override // cn.fly.verify.s
    protected boolean a(VerifyException verifyException, cn.fly.verify.common.callback.b bVar) {
        String message;
        int i10 = 80800;
        if (verifyException != null) {
            message = verifyException.getMessage();
            if ("switch_timeout".equals(message)) {
                i10 = 80801;
            }
        } else {
            message = "";
        }
        if (bVar == null) {
            return true;
        }
        bVar.a(new VerifyException(i10, message));
        return true;
    }

    public String g() {
        return "SDK-HY-v4.5.9";
    }
}
