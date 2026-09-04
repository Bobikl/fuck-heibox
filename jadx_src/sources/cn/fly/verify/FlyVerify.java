package cn.fly.verify;

import android.content.Context;
import cn.fly.verify.common.callback.OperationCallback;
import cn.fly.verify.pure.entity.PreVerifyResult;
import cn.fly.verify.pure.entity.VerifyResult;

/* JADX INFO: loaded from: classes6.dex */
public class FlyVerify {
    public static final int SDK_VERSION_CODE;
    private static final String SDK_VERSION_NAME = "13.6.2";
    public static final p instance = p.a();
    public static String sdkTag = "FLYVERIFY";

    static {
        int i10 = 0;
        for (String str : "13.6.2".split("\\.")) {
            i10 = (i10 * 100) + Integer.parseInt(str);
        }
        SDK_VERSION_CODE = i10;
    }

    public static String getVersion() {
        return "13.6.2";
    }

    public static void init(Context context, String str, String str2) {
        ax.a(context, str, str2);
    }

    public static void preVerify(OperationCallback<PreVerifyResult> operationCallback) {
        instance.a(operationCallback);
    }

    public static void preVerify(OperationCallback<PreVerifyResult> operationCallback, boolean z10) {
        instance.a(operationCallback, z10);
    }

    public static void setPreVerifyTimeout(long j10) {
        ak.f35737a = Long.valueOf(j10);
    }

    public static void submitPolicyGrantResult(CustomController customController, boolean z10) {
        ax.a(customController, z10);
    }

    public static void submitPolicyGrantResult(boolean z10) {
        ax.a(z10);
    }

    public static void updateCustomController(CustomController customController) {
        ax.a(customController);
    }

    public static void verify(OperationCallback<VerifyResult> operationCallback) {
        instance.b(operationCallback);
    }
}
