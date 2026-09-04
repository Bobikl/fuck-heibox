package anet.channel.strategy.dispatch;

import android.os.Build;
import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.ALog;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class d {
    public static final String TAG = "amdc.DispatchParamBuilder";

    d() {
    }

    private static int a() {
        int iC = anet.channel.util.c.c();
        if (iC != 2) {
            return iC != 3 ? 4 : 1;
        }
        return 2;
    }

    static String a(IAmdcSign iAmdcSign, Map<String, String> map) {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(anet.channel.strategy.utils.c.d(map.get("appkey")));
        sb2.append("&");
        sb2.append(anet.channel.strategy.utils.c.d(map.get("domain")));
        sb2.append("&");
        sb2.append(anet.channel.strategy.utils.c.d(map.get("appName")));
        sb2.append("&");
        sb2.append(anet.channel.strategy.utils.c.d(map.get("appVersion")));
        sb2.append("&");
        sb2.append(anet.channel.strategy.utils.c.d(map.get("bssid")));
        sb2.append("&");
        sb2.append(anet.channel.strategy.utils.c.d(map.get("channel")));
        sb2.append("&");
        sb2.append(anet.channel.strategy.utils.c.d(map.get("deviceId")));
        sb2.append("&");
        sb2.append(anet.channel.strategy.utils.c.d(map.get("lat")));
        sb2.append("&");
        sb2.append(anet.channel.strategy.utils.c.d(map.get("lng")));
        sb2.append("&");
        sb2.append(anet.channel.strategy.utils.c.d(map.get(DispatchConstants.MACHINE)));
        sb2.append("&");
        sb2.append(anet.channel.strategy.utils.c.d(map.get(DispatchConstants.NET_TYPE)));
        sb2.append("&");
        sb2.append(anet.channel.strategy.utils.c.d(map.get("other")));
        sb2.append("&");
        sb2.append(anet.channel.strategy.utils.c.d(map.get("platform")));
        sb2.append("&");
        sb2.append(anet.channel.strategy.utils.c.d(map.get(DispatchConstants.PLATFORM_VERSION)));
        sb2.append("&");
        sb2.append(anet.channel.strategy.utils.c.d(map.get(DispatchConstants.PRE_IP)));
        sb2.append("&");
        sb2.append(anet.channel.strategy.utils.c.d(map.get("sid")));
        sb2.append("&");
        sb2.append(anet.channel.strategy.utils.c.d(map.get("t")));
        sb2.append("&");
        sb2.append(anet.channel.strategy.utils.c.d(map.get("v")));
        sb2.append("&");
        sb2.append(anet.channel.strategy.utils.c.d(map.get(DispatchConstants.SIGNTYPE)));
        try {
            return iAmdcSign.sign(sb2.toString());
        } catch (Exception e10) {
            ALog.e(TAG, "get sign failed", null, e10, new Object[0]);
            return null;
        }
    }

    public static Map a(Map<String, Object> map) {
        IAmdcSign sign = AmdcRuntimeInfo.getSign();
        if (sign == null || TextUtils.isEmpty(sign.getAppkey())) {
            ALog.e(TAG, "amdc sign is null or appkey is empty", null, new Object[0]);
            return null;
        }
        NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
        if (!NetworkStatusHelper.isConnected()) {
            ALog.e(TAG, "no network, don't send amdc request", null, new Object[0]);
            return null;
        }
        map.put("appkey", sign.getAppkey());
        map.put("v", DispatchConstants.VER_CODE);
        map.put("platform", "android");
        map.put(DispatchConstants.PLATFORM_VERSION, Build.VERSION.RELEASE);
        if (!TextUtils.isEmpty(GlobalAppRuntimeInfo.getUserId())) {
            map.put("sid", GlobalAppRuntimeInfo.getUserId());
        }
        map.put(DispatchConstants.NET_TYPE, status.toString());
        map.put("carrier", NetworkStatusHelper.getCarrier());
        map.put(DispatchConstants.MNC, NetworkStatusHelper.getSimOp());
        if (AmdcRuntimeInfo.latitude != 0.0d) {
            map.put("lat", String.valueOf(AmdcRuntimeInfo.latitude));
        }
        if (AmdcRuntimeInfo.longitude != 0.0d) {
            map.put("lng", String.valueOf(AmdcRuntimeInfo.longitude));
        }
        map.putAll(AmdcRuntimeInfo.getParams());
        map.put("channel", AmdcRuntimeInfo.appChannel);
        map.put("appName", AmdcRuntimeInfo.appName);
        map.put("appVersion", AmdcRuntimeInfo.appVersion);
        map.put(DispatchConstants.STACK_TYPE, Integer.toString(a()));
        map.put("domain", b(map));
        map.put(DispatchConstants.SIGNTYPE, sign.useSecurityGuard() ? com.taobao.accs.antibrush.b.KEY_SEC : "noSec");
        map.put("t", String.valueOf(System.currentTimeMillis()));
        String strA = a(sign, map);
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        map.put("sign", strA);
        return map;
    }

    private static String b(Map map) {
        Set set = (Set) map.remove("hosts");
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            sb2.append(' ');
        }
        if (sb2.length() > 0) {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        return sb2.toString();
    }
}
