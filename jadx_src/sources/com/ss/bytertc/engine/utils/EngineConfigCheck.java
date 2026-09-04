package com.ss.bytertc.engine.utils;

import android.text.TextUtils;
import com.ss.bytertc.engine.data.EngineConfig;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class EngineConfigCheck {
    public static final int ENGINE_CONFIG_INVALID_APP_ID = 1;
    public static final int ENGINE_CONFIG_INVALID_NATIVE_LIB_PATH = 2;
    public static final int ENGINE_CONFIG_VALID = 0;

    public static int checkValid(EngineConfig engineConfig) {
        if (TextUtils.isEmpty(engineConfig.appID)) {
            return 1;
        }
        if (TextUtils.isEmpty(engineConfig.nativeLoadPath)) {
            return 0;
        }
        File file = new File(engineConfig.nativeLoadPath);
        return (file.exists() && file.isDirectory()) ? 0 : 2;
    }
}
