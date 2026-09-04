package com.efs.sdk.net.a.a;

import com.efs.sdk.base.core.util.Log;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Map<String, Long> f42699a = new HashMap();

    static long a(f.a aVar) {
        try {
            byte[] bArrD = aVar.d();
            if (bArrD != null) {
                return bArrD.length;
            }
            return 0L;
        } catch (IOException | OutOfMemoryError e10) {
            e10.printStackTrace();
            return 0L;
        }
    }

    private static ByteArrayOutputStream a(InputStream inputStream, com.efs.sdk.net.a.b bVar, String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int i10 = inputStream.read(bArr);
                if (i10 < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            } catch (IOException e10) {
                Log.e("NetTrace-Interceptor", "parse and save body, e is ".concat(String.valueOf(e10)));
            }
        }
        byteArrayOutputStream.flush();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        BufferedReader bufferedReader = "gzip".equals(str) ? new BufferedReader(new InputStreamReader(new GZIPInputStream(byteArrayInputStream))) : new BufferedReader(new InputStreamReader(byteArrayInputStream));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb2.append(line + '\n');
        }
        bVar.f42723i = sb2.toString().getBytes().length;
        return byteArrayOutputStream;
    }

    public static InputStream a(String str, String str2, String str3, InputStream inputStream) {
        Log.i("NetTrace-Interceptor", "save interpret response stream");
        com.efs.sdk.net.a.b bVarA = com.efs.sdk.net.a.a.a().a(str);
        bVarA.f42722h = str2;
        if (str2 != null) {
            if (str2.contains("text") || str2.contains("json")) {
                ByteArrayOutputStream byteArrayOutputStreamA = a(inputStream, bVarA, str3);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStreamA.toByteArray());
                try {
                    byteArrayOutputStreamA.close();
                } catch (IOException e10) {
                    Log.e("NetTrace-Interceptor", "save interpret response stream, e is ".concat(String.valueOf(e10)));
                }
                return byteArrayInputStream;
            }
        }
        bVarA.f42723i = 0L;
        return inputStream;
    }
}
