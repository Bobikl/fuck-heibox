package com.tencent.trtcplugin.util;

import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.trtcplugin.TRTCCloudPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* JADX INFO: loaded from: classes4.dex */
public class CommonUtil {
    public static <T> T getParam(MethodCall methodCall, MethodChannel.Result result, String str) {
        T t10 = (T) methodCall.argument(str);
        if (t10 == null) {
            result.error("Missing parameter", "Cannot find parameter `" + str + "` or `" + str + "` is null!", 5);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CommonUtil|method=");
            sb2.append(methodCall.method);
            sb2.append("|arguments=null");
            TXCLog.e(TRTCCloudPlugin.TAG, sb2.toString());
        }
        return t10;
    }

    public static <T> T getParamCanBeNull(MethodCall methodCall, MethodChannel.Result result, String str) {
        return (T) methodCall.argument(str);
    }
}
