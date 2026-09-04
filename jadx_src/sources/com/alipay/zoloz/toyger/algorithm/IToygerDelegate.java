package com.alipay.zoloz.toyger.algorithm;

import android.graphics.PointF;
import com.alipay.zoloz.toyger.ToygerAttr;
import com.alipay.zoloz.toyger.ToygerBiometricInfo;
import com.alipay.zoloz.toyger.ToygerState;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface IToygerDelegate<State extends ToygerState, Attr extends ToygerAttr, Info extends ToygerBiometricInfo> {

    @Deprecated
    public static final int EVENT_CODE_DARK_SCREEN = -1;
    public static final int LOG_DEBUG = 1;
    public static final int LOG_DEVICE = 2;
    public static final int LOG_MONITOR = 3;

    PointF handleAlignDepthPoint(PointF pointF);

    void handleCaptureCompleted(int i10, List<Info> list, Map<String, Object> map);

    void handleEventTriggered(int i10, String str);

    void handleInfoReady(TGFrame tGFrame, Attr attr);

    void handleLog(int i10, HashMap<String, Object> map);

    void handleScanCompleted(int i10, List<Info> list, Map<String, Object> map);

    void handleStateUpdated(State state, Attr attr);
}
