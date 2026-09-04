package com.alipay.bis.common.service.facade.gw.zim;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class ZimInitGwResponse {
    public Map<String, String> extParams;
    public String message;
    public String protocol;
    public int retCode = 0;
    public String retCodeSub;
    public String retMessageSub;
    public String zimId;

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("com.alipay.bis.common.service.facade.gw.zim.ZimInitGwResponse{retCode=");
        sb2.append(this.retCode);
        sb2.append(", message='");
        sb2.append(this.message);
        sb2.append('\'');
        sb2.append(", zimId='");
        sb2.append(this.zimId);
        sb2.append('\'');
        sb2.append(", protocol='");
        sb2.append(this.protocol);
        sb2.append('\'');
        sb2.append(", extParams=");
        Object obj = this.extParams;
        if (obj == null) {
            obj = "null";
        }
        sb2.append(obj);
        sb2.append(", retCodeSub='");
        sb2.append(this.retCodeSub);
        sb2.append('\'');
        sb2.append(", retMessageSub='");
        sb2.append(this.retMessageSub);
        sb2.append('\'');
        sb2.append('}');
        return sb2.toString();
    }
}
