package com.alipay.bis.common.service.facade.gw.zim;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class ZimValidateJsonGwRequest {
    public Map<String, String> externParam;
    public String zimData;
    public String zimId;

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("com.alipay.bis.common.service.facade.gw.zim.ZimValidateJsonGwRequest{zimId='");
        sb2.append(this.zimId);
        sb2.append("', data='");
        if (this.zimData == null) {
            str = "null";
        } else {
            str = "[length=" + this.zimData.length() + "]";
        }
        sb2.append(str);
        sb2.append("', bizData='");
        sb2.append(this.externParam);
        sb2.append("'");
        sb2.append('}');
        return sb2.toString();
    }
}
