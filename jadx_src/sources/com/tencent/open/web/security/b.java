package com.tencent.open.web.security;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.tencent.open.log.SLog;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class b extends com.tencent.open.b {
    @Override // com.tencent.open.b
    public void a(String str, String str2, List<String> list, com.tencent.open.b.a aVar) {
        SLog.v("openSDK_LOG.SecureJsBridge", "-->getResult, objectName: " + str + " | methodName: " + str2);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                list.set(i10, URLDecoder.decode(list.get(i10), "UTF-8"));
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        com.tencent.open.b.C0975b c0975b = this.f101029a.get(str);
        if (c0975b != null) {
            SLog.d("openSDK_LOG.SecureJsBridge", "-->handler != null");
            c0975b.call(str2, list, aVar);
            return;
        }
        SLog.e("openSDK_LOG.SecureJsBridge", "-->handler == null objName: " + str);
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.tencent.open.b
    public boolean a(WebView webView, String str) {
        SLog.i("openSDK_LOG.SecureJsBridge", "-->canHandleUrl---url = " + str);
        if (str == null || !Uri.parse(str).getScheme().equals("jsbridge")) {
            return false;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList((str + "/#").split("/")));
        if (arrayList.size() < 7) {
            return false;
        }
        String str2 = (String) arrayList.get(2);
        String str3 = (String) arrayList.get(3);
        String str4 = (String) arrayList.get(4);
        String str5 = (String) arrayList.get(5);
        SLog.i("openSDK_LOG.SecureJsBridge", "-->canHandleUrl, objectName: " + str2 + " | methodName: " + str3 + " | snStr: " + str4);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            try {
                a(str2, str3, arrayList.subList(6, arrayList.size() - 1), new c(webView, Long.parseLong(str4), str, str5));
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
