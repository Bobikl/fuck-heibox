package com.tencent.cos.xml.utils;

import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.URLUtil;
import com.google.common.net.c;
import com.tencent.cos.xml.common.Range;
import com.tencent.cos.xml.model.tag.UrlUploadPolicy;
import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.common.QCloudServiceException;
import com.tencent.qcloud.core.http.HttpRequest;
import com.tencent.qcloud.core.http.HttpResult;
import com.tencent.qcloud.core.http.QCloudHttpClient;
import com.tencent.qcloud.core.util.QCloudHttpUtils;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes4.dex */
public class UrlUtil {
    public static UrlUploadPolicy getUrlUploadPolicy(String str) {
        if (!isUrl(str)) {
            return new UrlUploadPolicy(UrlUploadPolicy.Type.NOTSUPPORT, 0L);
        }
        try {
            URL url = new URL(str);
            try {
                HttpResult httpResultExecuteNow = QCloudHttpClient.getDefault().resolveRequest(new HttpRequest.Builder().url(url).method("GET").addHeader("Range", new Range(0L, 1L).getRange()).build()).executeNow();
                if (httpResultExecuteNow != null && httpResultExecuteNow.isSuccessful() && httpResultExecuteNow.headers() != null && httpResultExecuteNow.headers().size() > 0) {
                    String strHeader = httpResultExecuteNow.header(c.Q);
                    String strHeader2 = httpResultExecuteNow.header("Content-Range");
                    if (!"bytes".equals(strHeader) || TextUtils.isEmpty(strHeader2)) {
                        String strHeader3 = httpResultExecuteNow.header("Content-Length");
                        if (!TextUtils.isEmpty(strHeader3)) {
                            return new UrlUploadPolicy(UrlUploadPolicy.Type.ENTIRETY, Long.parseLong(strHeader3));
                        }
                    } else {
                        long[] contentRange = QCloudHttpUtils.parseContentRange(strHeader2);
                        if (contentRange != null) {
                            return new UrlUploadPolicy(UrlUploadPolicy.Type.RANGE, contentRange[2]);
                        }
                    }
                }
                return new UrlUploadPolicy(UrlUploadPolicy.Type.NOTSUPPORT, 0L);
            } catch (QCloudClientException | QCloudServiceException unused) {
                return new UrlUploadPolicy(UrlUploadPolicy.Type.NOTSUPPORT, 0L);
            }
        } catch (MalformedURLException unused2) {
            return new UrlUploadPolicy(UrlUploadPolicy.Type.NOTSUPPORT, 0L);
        }
    }

    public static boolean isUrl(String str) {
        if (!TextUtils.isEmpty(str) && Patterns.WEB_URL.matcher(str).matches()) {
            return URLUtil.isHttpsUrl(str) || URLUtil.isHttpUrl(str);
        }
        return false;
    }
}
