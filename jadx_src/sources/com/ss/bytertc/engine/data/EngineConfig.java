package com.ss.bytertc.engine.data;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class EngineConfig {
    public static final int ENGINE_CONFIG_INVALID_APP_ID = 1;
    public static final int ENGINE_CONFIG_INVALID_NATIVE_LIB_PATH = 2;
    public static final int ENGINE_CONFIG_VALID = 0;
    private static final String TAG = "EngineConfig";
    public String appID;
    public Object eglContext = null;
    public String nativeLoadPath = null;
    public JSONObject parameters;

    public EngineConfig(String str) {
        this.parameters = null;
        this.appID = str;
        this.parameters = new JSONObject();
    }
}
