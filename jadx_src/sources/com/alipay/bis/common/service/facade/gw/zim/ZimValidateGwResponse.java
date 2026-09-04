package com.alipay.bis.common.service.facade.gw.zim;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class ZimValidateGwResponse {
    public Map<String, String> extParams;
    public String nextProtocol;
    public String retCodeSub;
    public String retMessageSub;
    public int validationRetCode = 0;
    public int productRetCode = 0;
    public boolean hasNext = false;

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("com.alipay.bis.common.service.facade.gw.zim.ZimValidateGwResponse{validationRetCode=");
        sb2.append(this.validationRetCode);
        sb2.append(", productRetCode=");
        sb2.append(this.productRetCode);
        sb2.append(", hasNext=");
        sb2.append(this.hasNext);
        sb2.append(", nextProtocol='");
        sb2.append(this.nextProtocol);
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
