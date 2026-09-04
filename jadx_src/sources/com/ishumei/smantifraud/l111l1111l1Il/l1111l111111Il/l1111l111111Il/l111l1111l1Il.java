package com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il;

import android.text.TextUtils;
import com.ishumei.smantifraud.l1111l111111Il.l11l111l11Il;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class l111l1111l1Il extends l1111l111111Il {
    private static final int l1111l111111Il = 4096;
    private l111l11111I1l l111l11111lIl = new l111l11111I1l(4096);

    private static String l1111l111111Il(int i10) {
        if (i10 == 0) {
            return "GET";
        }
        if (i10 == 1) {
            return "POST";
        }
        throw new IllegalStateException("Unknown method type.");
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d0 A[Catch: Exception -> 0x00d3, TRY_LEAVE, TryCatch #3 {Exception -> 0x00d3, blocks: (B:41:0x00cb, B:43:0x00d0), top: B:54:0x00cb }] */
    @Override // com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il.l1111l111111Il
    public final l11l111l11Il l1111l111111Il(com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lI1l<?> l111l1111li1l, Map<String, String> map) throws Throwable {
        String str;
        byte[] bArrL1111l111111Il = l111l1111li1l.l1111l111111Il();
        if ((l111l1111li1l.l111l11111I1l() == 1 && bArrL1111l111111Il == null) || com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l111l1111l1Il) {
            throw new IllegalArgumentException("body is null");
        }
        String strL111l1111lI1l = l111l1111li1l.l111l1111lI1l();
        if (l111l1111li1l.l111l1111llIl() && !TextUtils.isEmpty(l111l1111li1l.l111l1111lIl())) {
            strL111l1111lI1l = l111l1111li1l.l111l1111lIl();
        }
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(l111l1111li1l.l111l11111lIl());
        HttpURLConnection httpURLConnection = null;
        OutputStream outputStream = null;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(strL111l1111lI1l).openConnection();
            try {
                for (String str2 : map2.keySet()) {
                    httpURLConnection2.setRequestProperty(str2, (String) map2.get(str2));
                }
                int iL11l1111Il1l = l111l1111li1l.l11l1111Il1l();
                httpURLConnection2.setConnectTimeout(iL11l1111Il1l);
                httpURLConnection2.setReadTimeout(iL11l1111Il1l);
                httpURLConnection2.setDoInput(true);
                httpURLConnection2.setDoOutput(true);
                httpURLConnection2.setUseCaches(false);
                int iL111l11111I1l = l111l1111li1l.l111l11111I1l();
                if (iL111l11111I1l == 0) {
                    str = "GET";
                } else {
                    if (iL111l11111I1l != 1) {
                        throw new IllegalStateException("Unknown method type.");
                    }
                    str = "POST";
                }
                httpURLConnection2.setRequestMethod(str);
                if (bArrL1111l111111Il != null) {
                    httpURLConnection2.setFixedLengthStreamingMode(bArrL1111l111111Il.length);
                }
                httpURLConnection2.connect();
                if (bArrL1111l111111Il != null) {
                    outputStream = httpURLConnection2.getOutputStream();
                    outputStream.write(bArrL1111l111111Il);
                    outputStream.flush();
                }
                l11l111l11Il l11l111l11il = new l11l111l11Il(httpURLConnection2.getResponseCode(), l111l1111lI1l.l1111l111111Il(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength(), this.l111l11111lIl));
                try {
                    httpURLConnection2.disconnect();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } catch (Exception unused) {
                }
                return l11l111l11il;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = httpURLConnection2;
                if (httpURLConnection != null) {
                    try {
                        httpURLConnection.disconnect();
                        if (httpURLConnection != 0) {
                            httpURLConnection.close();
                        }
                    } catch (Exception unused2) {
                        throw th;
                    }
                } else if (httpURLConnection != 0) {
                    httpURLConnection.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
