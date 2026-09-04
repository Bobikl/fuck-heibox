package com.umeng.commonsdk.config;

import com.umeng.commonsdk.debug.UMRTLog;
import org.android.agoo.common.Config;

/* JADX INFO: compiled from: SensitiveFieldHandler.java */
/* JADX INFO: loaded from: classes4.dex */
public class g implements e {
    @Override // com.umeng.commonsdk.config.e
    public void a(String str, Object obj, String[] strArr) {
        if (str == null || str.length() <= 0) {
            return;
        }
        try {
            long j10 = Long.parseLong(str);
            if (j10 == -1) {
                UMRTLog.e(Config.TAG, "--->>> SensitiveFieldHandler: handleConfigItem: invalid config value.");
                return;
            }
            UMRTLog.i(Config.TAG, "--->>> CollectFieldJudgment: handleConfigItem: item : " + str);
            if (obj == null || !(obj instanceof b)) {
                return;
            }
            for (int i10 = 0; i10 < strArr.length; i10++) {
                try {
                    String str2 = strArr[i10];
                    if (d.a(str2)) {
                        ((b) obj).a(str2, Boolean.valueOf(a.a(j10, i10)));
                    }
                } catch (Throwable unused) {
                    return;
                }
            }
        } catch (Throwable unused2) {
            UMRTLog.e(Config.TAG, "--->>> SensitiveFieldHandler: handleConfigItem: parseLong exception.");
        }
    }
}
