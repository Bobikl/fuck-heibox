package com.umeng.socialize.weixin.net;

import com.umeng.socialize.utils.SLog;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes4.dex */
public class WXAuthUtils {
    public static String convertStreamToString(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                try {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb2.append(line);
                        sb2.append("/n");
                    } catch (IOException e10) {
                        SLog.error(e10);
                        inputStream.close();
                    }
                } catch (Throwable th2) {
                    try {
                        inputStream.close();
                    } catch (IOException e11) {
                        SLog.error(e11);
                    }
                    throw th2;
                }
            } catch (IOException e12) {
                SLog.error(e12);
            }
        }
        inputStream.close();
        return sb2.toString();
    }

    public static String request(String str) {
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            if (uRLConnectionOpenConnection == null) {
                return "";
            }
            uRLConnectionOpenConnection.connect();
            InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
            return inputStream == null ? "" : convertStreamToString(inputStream);
        } catch (Exception e10) {
            SLog.error(e10);
            return "";
        }
    }
}
