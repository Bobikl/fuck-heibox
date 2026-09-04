package com.alipay.android.fintech.log;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

/* JADX INFO: loaded from: classes6.dex */
public class NetUtil {
    private static final String TAG = "LogNetUtil";
    public static final String TYPE_GSM = "GSM";
    public static final String TYPE_TDS_HSDPSA = "TDS-HSDPSA";
    public static final String TYPE_TDS_HSUPA = "TDS-HSUPA";
    public static final String TYPE_TD_CDMA = "TD-CDMA";
    public static final String TYPE_WIFI = "WIFI";

    public static String formatParamStringForGET(Map<String, String> map) {
        if (map != null && map.size() != 0) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    arrayList.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
                }
                return URLEncodedUtils.format(arrayList, "utf-8");
            } catch (Throwable th2) {
                Log.e(TAG, "formatParamStringForGET", th2);
            }
        }
        return null;
    }

    @SuppressLint({"MissingPermission"})
    public static NetworkInfo getActiveNetworkInfo(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Throwable th2) {
            Log.w(TAG, th2);
            return null;
        }
    }

    public static String getNetworkType(Context context) {
        return getNetworkType(getActiveNetworkInfo(context));
    }

    public static String getNetworkType(NetworkInfo networkInfo) {
        String subtypeName = null;
        if (networkInfo == null) {
            return null;
        }
        if ("WIFI".equalsIgnoreCase(networkInfo.getTypeName())) {
            return "WIFI";
        }
        if (!TextUtils.isEmpty(networkInfo.getSubtypeName())) {
            subtypeName = networkInfo.getSubtypeName();
        } else if (networkInfo.getSubtype() == 16) {
            subtypeName = TYPE_GSM;
        } else if (networkInfo.getSubtype() == 17) {
            subtypeName = TYPE_TD_CDMA;
        } else if (networkInfo.getSubtype() == 18) {
            subtypeName = TYPE_TDS_HSDPSA;
        } else if (networkInfo.getSubtype() == 19) {
            subtypeName = TYPE_TDS_HSUPA;
        }
        if (subtypeName == null || TextUtils.isEmpty(networkInfo.getExtraInfo())) {
            return subtypeName;
        }
        return subtypeName + "|" + networkInfo.getExtraInfo();
    }
}
