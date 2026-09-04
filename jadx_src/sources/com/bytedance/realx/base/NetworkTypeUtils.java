package com.bytedance.realx.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.Pair;
import androidx.core.content.d;
import com.bytedance.bpea.basics.Cert;
import com.efs.sdk.base.core.util.NetworkUtil;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class NetworkTypeUtils {
    private static final boolean DEBUG_MOBILE = false;
    private static final String DEFAULT_CONTENT_CHARSET = "ISO-8859-1";
    private static final String NAME_VALUE_SEPARATOR = "=";
    private static final String PARAMETER_SEPARATOR = "&";
    private static final String TAG = "NetworkTypeUtils";
    private static String debugInfo = "";
    private static NetworkTypeInterceptor sNetworkTypeInterceptor;

    /* JADX INFO: renamed from: com.bytedance.realx.base.NetworkTypeUtils$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType;

        static {
            int[] iArr = new int[NetworkType.values().length];
            $SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType = iArr;
            try {
                iArr[NetworkType.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType[NetworkType.MOBILE_2G.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType[NetworkType.MOBILE_3G.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType[NetworkType.MOBILE_4G.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType[NetworkType.MOBILE_5G.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType[NetworkType.MOBILE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum CompressType {
        NONE(0),
        GZIP(1),
        DEFLATER(2);

        final int nativeInt;

        CompressType(int i10) {
            this.nativeInt = i10;
        }
    }

    public enum NetworkType {
        UNKNOWN(-1),
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5),
        MOBILE_5G(6);

        final int nativeInt;

        NetworkType(int i10) {
            this.nativeInt = i10;
        }

        public int getValue() {
            return this.nativeInt;
        }

        public boolean isAvailable() {
            return this != NONE;
        }
    }

    public interface NetworkTypeInterceptor {
        NetworkType getNetworkType();
    }

    private static String encode(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static String format(List<Pair<String, String>> list, String str) {
        StringBuilder sb2 = new StringBuilder();
        for (Pair<String, String> pair : list) {
            String strEncode = encode((String) pair.first, str);
            String str2 = (String) pair.second;
            String strEncode2 = str2 != null ? encode(str2, str) : "";
            if (sb2.length() > 0) {
                sb2.append("&");
            }
            sb2.append(strEncode);
            sb2.append("=");
            sb2.append(strEncode2);
        }
        return sb2.toString();
    }

    public static String getDebugInfo() {
        return debugInfo;
    }

    private static int getNetWorkTypeThroughBPEA(Context context) {
        int iIntValue;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(g0.a.f118921e);
        try {
            Class<?> cls = Class.forName("com.bytedance.bpea.entry.api.device.info.TelephonyManagerEntry");
            Class<?> cls2 = Class.forName("com.bytedance.bpea.cert.token.TokenCert");
            Method declaredMethod = cls.getDeclaredMethod("getNetworkType", TelephonyManager.class, Cert.class);
            Method declaredMethod2 = cls2.getDeclaredMethod("with", String.class);
            if (declaredMethod == null || declaredMethod2 == null) {
                iIntValue = -1;
            } else {
                iIntValue = ((Integer) declaredMethod.invoke(null, telephonyManager, declaredMethod2.invoke(null, "bpea-rtc_generic_device_info"))).intValue();
                try {
                    debugInfo += " getNetworkType through BPEA;";
                } catch (Exception unused) {
                    RXLogging.i(TAG, "BPEA not exist");
                }
            }
        } catch (Exception unused2) {
            iIntValue = -1;
        }
        if (iIntValue != -1) {
            return iIntValue;
        }
        int iIntValue2 = Integer.valueOf(telephonyManager.getDataNetworkType()).intValue();
        debugInfo += " getNetworkType through system;";
        return iIntValue2;
    }

    public static String getNetworkAccessType(Context context) {
        return getNetworkAccessType(getNetworkType(context, null));
    }

    public static String getNetworkAccessType(NetworkType networkType) {
        String str;
        try {
            switch (AnonymousClass1.$SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType[networkType.ordinal()]) {
                case 1:
                    str = "wifi";
                    break;
                case 2:
                    str = "2g";
                    break;
                case 3:
                    str = "3g";
                    break;
                case 4:
                    str = "4g";
                    break;
                case 5:
                    str = NetworkUtil.NETWORK_CLASS_5G;
                    break;
                case 6:
                    str = "mobile";
                    break;
                default:
                    return "";
            }
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    public static NetworkType getNetworkType(Context context, Intent intent) {
        int subtype;
        NetworkTypeInterceptor networkTypeInterceptor = sNetworkTypeInterceptor;
        if (networkTypeInterceptor != null && networkTypeInterceptor.getNetworkType() != NetworkType.NONE) {
            return sNetworkTypeInterceptor.getNetworkType();
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if ((activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) && activeNetworkInfo == null && intent != null && ((activeNetworkInfo = isNetWorkConnected(context, intent)) == null || !activeNetworkInfo.isAvailable())) {
                RXLogging.i(TAG, "-----------info is null");
                return NetworkType.NONE;
            }
            int type = activeNetworkInfo.getType();
            debugInfo = "NetworkInfo type:" + type;
            if (1 == type) {
                return NetworkType.WIFI;
            }
            if (type != 0) {
                return NetworkType.MOBILE;
            }
            if (d.a(context, "android.permission.READ_PHONE_STATE") == 0) {
                debugInfo += " getNetworkType through TelephoneManager;";
                subtype = getNetWorkTypeThroughBPEA(context);
            } else {
                subtype = activeNetworkInfo.getSubtype();
                debugInfo += " getNetworkType through ConnectivityManager;";
            }
            debugInfo += " TelephonyManager type:" + subtype;
            switch (subtype) {
                case 0:
                    return NetworkType.UNKNOWN;
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    return NetworkType.MOBILE_2G;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    return NetworkType.MOBILE_3G;
                case 13:
                case 18:
                    return NetworkType.MOBILE_4G;
                case 19:
                default:
                    return NetworkType.UNKNOWN;
                case 20:
                    return NetworkType.MOBILE_5G;
            }
        } catch (Throwable th2) {
            debugInfo = th2.toString();
            return NetworkType.UNKNOWN;
        }
    }

    public static boolean is2G(Context context) {
        NetworkType networkType = getNetworkType(context, null);
        return networkType == NetworkType.MOBILE || networkType == NetworkType.MOBILE_2G;
    }

    public static boolean isIpv4(String str) {
        return Pattern.matches("^(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5]).(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5]).(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5]).(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5])$", str);
    }

    public static boolean isIpv6(String str) {
        return Pattern.matches("^\\s*((([0-9A-Fa-f]{1,4}:){7}([0-9A-Fa-f]{1,4}|:))|(([0-9A-Fa-f]{1,4}:){6}(:[0-9A-Fa-f]{1,4}|((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){5}(((:[0-9A-Fa-f]{1,4}){1,2})|:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){4}(((:[0-9A-Fa-f]{1,4}){1,3})|((:[0-9A-Fa-f]{1,4})?:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){3}(((:[0-9A-Fa-f]{1,4}){1,4})|((:[0-9A-Fa-f]{1,4}){0,2}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){2}(((:[0-9A-Fa-f]{1,4}){1,5})|((:[0-9A-Fa-f]{1,4}){0,3}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){1}(((:[0-9A-Fa-f]{1,4}){1,6})|((:[0-9A-Fa-f]{1,4}){0,4}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(:(((:[0-9A-Fa-f]{1,4}){1,7})|((:[0-9A-Fa-f]{1,4}){0,5}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:)))(%.+)?\\s*$", str);
    }

    public static NetworkInfo isNetWorkConnected(Context context, Intent intent) {
        NetworkInfo networkInfo;
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) && (networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo")) != null) {
            if (NetworkInfo.State.CONNECTED == networkInfo.getState() && networkInfo.isAvailable()) {
                if (networkInfo.getType() == 1 || networkInfo.getType() == 0) {
                    RXLogging.i(TAG, "-------networkInfo wifi or mobile is connected");
                }
                return networkInfo;
            }
            RXLogging.i(TAG, "------networkInfo is discconnected");
        }
        return null;
    }

    public static boolean isNetworkAvailable(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isWifi(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                NetworkTypeInterceptor networkTypeInterceptor = sNetworkTypeInterceptor;
                if (networkTypeInterceptor == null || networkTypeInterceptor.getNetworkType() == NetworkType.NONE) {
                    return 1 == activeNetworkInfo.getType();
                }
                return sNetworkTypeInterceptor.getNetworkType() == NetworkType.WIFI;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void registerReceiver(Context context, BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver == null || context == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        context.getApplicationContext().registerReceiver(broadcastReceiver, intentFilter);
    }

    public static void setNetworkTypeInterceptor(NetworkTypeInterceptor networkTypeInterceptor) {
        sNetworkTypeInterceptor = networkTypeInterceptor;
    }

    public static void unregisterReceiver(Context context, BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver == null || context == null) {
            return;
        }
        context.getApplicationContext().unregisterReceiver(broadcastReceiver);
    }
}
