package com.alipay.android.fintech.log;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.core.app.o0;
import com.alipay.zoloz.toyger.ToygerLog;
import java.util.HashMap;
import org.apache.http.HttpResponse;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class BaseUploader {
    public static final String STATISTICS_URL_PATH = "/loggw/logUpload.do";
    public static String TAG = "BaseUploader";
    protected Context mContext;

    public BaseUploader(Context context) {
        this.mContext = context;
    }

    private String getLogHost() {
        Bundle bundle;
        try {
            Context context = this.mContext;
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            return (applicationInfo == null || (bundle = applicationInfo.metaData) == null) ? "" : bundle.getString("logging.gateway");
        } catch (Throwable th2) {
            Log.w(TAG, th2);
            return "";
        }
    }

    private String getProductVersion() {
        PackageInfo packageInfo;
        try {
            packageInfo = this.mContext.getPackageManager().getPackageInfo(this.mContext.getPackageName(), 0);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        return packageInfo != null ? packageInfo.versionName : "";
    }

    protected Pair<Long, Long> uploadFileByHttp(String str, String str2, String str3, String str4) throws IllegalStateException {
        String logHost = getLogHost();
        if (TextUtils.isEmpty(logHost)) {
            throw new IllegalStateException("log host is empty");
        }
        byte[] bArrGzipDataByString = LoggingUtil.gzipDataByString(str);
        HashMap map = new HashMap();
        map.put("Content-type", "text/xml");
        map.put("Content-Encoding", "gzip");
        map.put("ProcessName", "main");
        map.put("bizCode", str2);
        map.put("userId", "");
        map.put("productId", "8FA6890301632_ANDROID_product");
        map.put(o0.I0, str4);
        map.put("productVersion", getProductVersion());
        map.put("utdId", "");
        HttpClient httpClient = new HttpClient(logHost + STATISTICS_URL_PATH, this.mContext);
        HttpResponse httpResponseSynchronousRequestByPOST = null;
        try {
            httpResponseSynchronousRequestByPOST = httpClient.synchronousRequestByPOST(bArrGzipDataByString, map);
        } catch (Throwable th2) {
            ToygerLog.e(th2.getMessage());
        }
        if (httpResponseSynchronousRequestByPOST == null) {
            httpClient.closeStreamForNextExecute();
            return Pair.create(0L, 0L);
        }
        int responseCode = httpClient.getResponseCode();
        String responseContent = httpClient.getResponseContent();
        long requestLength = httpClient.getRequestLength();
        long responseLength = httpClient.getResponseLength();
        httpClient.closeStreamForNextExecute();
        if (responseCode != 200) {
            ToygerLog.e("response code is " + responseCode);
        }
        try {
            int i10 = new JSONObject(responseContent).getInt("code");
            if (i10 != 200) {
                ToygerLog.e("responseContent code is " + i10);
            }
        } catch (JSONException unused) {
            ToygerLog.e("get responseContent code error,JSONException");
        }
        return Pair.create(Long.valueOf(requestLength), Long.valueOf(responseLength));
    }
}
