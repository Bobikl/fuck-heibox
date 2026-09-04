package com.xiaomi.push;

import android.net.Uri;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.InvalidParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public class bn {
    public static String a(String str) {
        try {
            return String.valueOf(bm.a(MessageDigest.getInstance("SHA1").digest(str.getBytes("UTF-8"))));
        } catch (UnsupportedEncodingException e10) {
            com.xiaomi.channel.commonutils.logger.b.a("CloudCoder.hash4SHA1 ", e10);
            throw new IllegalStateException("failed to SHA1");
        } catch (NoSuchAlgorithmException e11) {
            com.xiaomi.channel.commonutils.logger.b.a("CloudCoder.hash4SHA1 ", e11);
            throw new IllegalStateException("failed to SHA1");
        } catch (Exception e12) {
            com.xiaomi.channel.commonutils.logger.b.a("CloudCoder.hash4SHA1 ", e12);
            throw new IllegalStateException("failed to SHA1");
        }
    }

    public static String a(String str, String str2, Map<String, String> map, String str3) {
        if (TextUtils.isEmpty(str3)) {
            throw new InvalidParameterException("security is not nullable");
        }
        ArrayList<String> arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str.toUpperCase());
        }
        if (str2 != null) {
            arrayList.add(Uri.parse(str2).getEncodedPath());
        }
        boolean z10 = true;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : new TreeMap(map).entrySet()) {
                arrayList.add(String.format("%s=%s", entry.getKey(), entry.getValue()));
            }
        }
        arrayList.add(str3);
        StringBuilder sb2 = new StringBuilder();
        for (String str4 : arrayList) {
            if (!z10) {
                sb2.append(kotlin.text.y.f128595d);
            }
            sb2.append(str4);
            z10 = false;
        }
        return a(sb2.toString());
    }
}
