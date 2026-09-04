package com.tencent.qcloud.core.util;

import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.NoRouteToHostException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLHandshakeException;

/* JADX INFO: loaded from: classes4.dex */
public class QCloudHttpUtils {
    public static Map<String, List<String>> getDecodedQueryPair(URL url) {
        int i10;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (url.getQuery() != null) {
            for (String str : url.getQuery().split("&")) {
                int iIndexOf = str.indexOf(ContainerUtils.KEY_VALUE_DELIMITER);
                String strUrlDecodeString = iIndexOf > 0 ? urlDecodeString(str.substring(0, iIndexOf)) : str;
                if (!linkedHashMap.containsKey(strUrlDecodeString)) {
                    linkedHashMap.put(strUrlDecodeString, new LinkedList());
                }
                ((List) linkedHashMap.get(strUrlDecodeString)).add((iIndexOf <= 0 || str.length() <= (i10 = iIndexOf + 1)) ? null : urlDecodeString(str.substring(i10)));
            }
        }
        return linkedHashMap;
    }

    public static Map<String, List<String>> getQueryPair(URL url) {
        int i10;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (url.getQuery() != null) {
            for (String str : url.getQuery().split("&")) {
                int iIndexOf = str.indexOf(ContainerUtils.KEY_VALUE_DELIMITER);
                String strSubstring = iIndexOf > 0 ? str.substring(0, iIndexOf) : str;
                if (!linkedHashMap.containsKey(strSubstring)) {
                    linkedHashMap.put(strSubstring, new LinkedList());
                }
                ((List) linkedHashMap.get(strSubstring)).add((iIndexOf <= 0 || str.length() <= (i10 = iIndexOf + 1)) ? null : str.substring(i10));
            }
        }
        return linkedHashMap;
    }

    public static boolean isNetworkConditionException(Throwable th2) {
        return (th2 instanceof UnknownHostException) || (th2 instanceof SocketTimeoutException) || (th2 instanceof ConnectException) || (th2 instanceof HttpRetryException) || (th2 instanceof NoRouteToHostException) || ((th2 instanceof SSLHandshakeException) && !(th2.getCause() instanceof CertificateException));
    }

    public static long[] parseContentRange(String str) {
        if (QCloudStringUtils.isEmpty(str)) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf(" ");
        int iIndexOf = str.indexOf(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        int iIndexOf2 = str.indexOf("/");
        if (iLastIndexOf == -1 || iIndexOf == -1 || iIndexOf2 == -1) {
            return null;
        }
        return new long[]{Long.parseLong(str.substring(iLastIndexOf + 1, iIndexOf)), Long.parseLong(str.substring(iIndexOf + 1, iIndexOf2)), Long.parseLong(str.substring(iIndexOf2 + 1))};
    }

    public static String queryParametersString(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!z10) {
                sb2.append("&");
            }
            sb2.append(entry.getKey() + ContainerUtils.KEY_VALUE_DELIMITER + entry.getValue());
            z10 = false;
        }
        return sb2.toString();
    }

    public static Map<String, List<String>> transformToMultiMap(Map<String, String> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(entry.getValue());
            map2.put(entry.getKey(), arrayList);
        }
        return map2;
    }

    public static String urlDecodeString(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static String urlEncodeString(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder();
            String[] strArrSplit = str.split(" ", -1);
            int length = strArrSplit.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (i10 == 0 && "".equals(strArrSplit[i10])) {
                    sb2.append("%20");
                } else {
                    if (length > 1 && i10 == length - 1 && "".equals(strArrSplit[i10])) {
                        break;
                    }
                    sb2.append(URLEncoder.encode(strArrSplit[i10], "UTF-8"));
                    if (i10 != length - 1) {
                        sb2.append("%20");
                    }
                }
            }
            return sb2.toString().replaceAll("\\*", "%2A");
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static String urlEncodeWithSlash(String str) {
        if (str == null || str.length() <= 0 || str.equals("/")) {
            return str;
        }
        String[] strArrSplit = str.split("/");
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            strArrSplit[i10] = urlEncodeString(strArrSplit[i10]);
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : strArrSplit) {
            sb2.append(str2);
            sb2.append("/");
        }
        if (!str.endsWith("/")) {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        return sb2.toString();
    }
}
