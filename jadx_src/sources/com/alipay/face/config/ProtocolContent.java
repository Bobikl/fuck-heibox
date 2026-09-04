package com.alipay.face.config;

import com.alibaba.fastjson.JSON;

/* JADX INFO: loaded from: classes6.dex */
public class ProtocolContent {
    public AndroidClientConfig androidClientConfig;
    public String androidcfg;
    public String expireTime;
    public int sampleMode;
    public String token;
    public int type;

    public boolean isValid() {
        return this.androidClientConfig != null;
    }

    public void parse(String str) {
        this.androidClientConfig = (AndroidClientConfig) JSON.parseObject(str, AndroidClientConfig.class);
    }
}
