package com.alipay.face.config;

import com.alibaba.fastjson.JSON;

/* JADX INFO: loaded from: classes6.dex */
public class Protocol {
    public String content;
    public ProtocolContent protocolContent;
    public String sign;

    public boolean isValid() {
        return this.protocolContent.isValid();
    }

    public void parse(String str) {
        ProtocolContent protocolContent = (ProtocolContent) JSON.parseObject(str, ProtocolContent.class);
        this.protocolContent = protocolContent;
        if (protocolContent != null) {
            protocolContent.parse(protocolContent.androidcfg);
        }
    }
}
