package com.sina.weibo.sdk.net;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements a {
    private static void a(OutputStream outputStream, d dVar) {
        Bundle bundleD = dVar.d();
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (String str : bundleD.keySet()) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append("&");
            }
            String strValueOf = String.valueOf(bundleD.get(str));
            try {
                sb2.append(URLEncoder.encode(str, "UTF-8"));
                sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb2.append(URLEncoder.encode(strValueOf, "UTF-8"));
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.write(sb2.toString().getBytes("UTF-8"));
            dataOutputStream.close();
        } catch (IOException e11) {
            e11.printStackTrace();
        }
    }

    private static void a(HttpURLConnection httpURLConnection, Bundle bundle) {
        for (String str : bundle.keySet()) {
            httpURLConnection.addRequestProperty(str, String.valueOf(bundle.get(str)));
        }
    }

    @Override // com.sina.weibo.sdk.net.a
    public final f a(d dVar) {
        String url = dVar.getUrl();
        Bundle params = dVar.getParams();
        if (params != null && params.size() != 0 && !TextUtils.isEmpty(url)) {
            Uri uriBuild = Uri.parse(url);
            if (!params.isEmpty()) {
                Uri.Builder builderBuildUpon = uriBuild.buildUpon();
                for (String str : params.keySet()) {
                    builderBuildUpon.appendQueryParameter(str, String.valueOf(params.get(str)));
                }
                uriBuild = builderBuildUpon.build();
            }
            if (uriBuild != null) {
                url = uriBuild.toString();
            }
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(url).openConnection();
        try {
            try {
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Connection", com.google.common.net.c.f58866u0);
                httpURLConnection.setRequestProperty("Charset", "UTF-8");
                Bundle bundle = new Bundle();
                bundle.putString("Content-Type", "application/x-www-form-urlencoded");
                a(httpURLConnection, bundle);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setReadTimeout(dVar.getReadTimeout());
                httpURLConnection.setConnectTimeout(dVar.getConnectTimeout());
                httpURLConnection.connect();
                a(httpURLConnection.getOutputStream(), dVar);
                int responseCode = httpURLConnection.getResponseCode();
                g gVar = new g(responseCode, responseCode == 200 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream());
                httpURLConnection.disconnect();
                return gVar;
            } catch (Exception e10) {
                throw new Throwable(e10.getMessage());
            }
        } catch (Throwable th2) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th2;
        }
    }
}
