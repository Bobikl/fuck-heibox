package com.alipay.zoloz.toyger;

import android.graphics.Bitmap;
import android.graphics.PointF;
import com.alipay.zoloz.toyger.ToygerAttr;
import com.alipay.zoloz.toyger.ToygerState;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface ToygerCallback<State extends ToygerState, Attr extends ToygerAttr> {
    public static final int EVENT_CODE_Code_Select_Face_End = -17;
    public static final int EVENT_CODE_DARK_SCREEN = -1;
    public static final int EVENT_CODE_DOC_PARM_ERROR = -5;
    public static final int EVENT_CODE_Dragonfly_Liveness_Failed = -15;
    public static final int EVENT_CODE_Dragonfly_Liveness_Success = -16;
    public static final int EVENT_CODE_INIT_FAIL = -4;
    public static final int EVENT_CODE_INIT_SUCCESS = -100;
    public static final int EVENT_CODE_LIVENESS_FAILED = -3;
    public static final int EVENT_CODE_LOCAL_MATCHING_ERROR = -7;
    public static final int EVENT_CODE_LOCAL_MATCHING_ERROR_NOT_MATCH = -11;
    public static final int EVENT_CODE_LOCAL_MATCHING_ERROR_RETRY = -12;
    public static final int EVENT_CODE_LOG = -8;
    public static final int EVENT_CODE_MODEL_ERROR = -2;
    public static final int EVENT_CODE_MONITOR_LOG = -9;
    public static final int EVENT_CODE_Nano_Generate_Fail = -13;
    public static final int EVENT_CODE_Nano_Generate_Success = -14;
    public static final int EVENT_CODE_PARAM_USERID_ERROR_ = -6;
    public static final int EVENT_CODE_START_SENSOR = -10;

    PointF onAlignDepthPoint(PointF pointF);

    void onAsyncUpload(int i10, byte[] bArr, byte[] bArr2, boolean z10);

    boolean onComplete(int i10, byte[] bArr, byte[] bArr2, boolean z10);

    boolean onEvent(int i10, Map<String, Object> map);

    boolean onHighQualityFrame(Bitmap bitmap, Attr attr);

    boolean onStateUpdated(State state, Attr attr, Map<String, Object> map);
}
