package com.alipay.face.network.model;

import d4.e;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class ZimValidateRequest {
    public Map<String, String> bizData;
    public String zimData;
    public String zimId;

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ZimValidateRequest{zimId='");
        sb2.append(this.zimId);
        sb2.append("', data='");
        if (this.zimData == null) {
            str = "null";
        } else {
            str = "[length=" + this.zimData.length() + "]";
        }
        sb2.append(str);
        sb2.append("', bizData='");
        sb2.append(e.j(this.bizData));
        sb2.append("'");
        sb2.append('}');
        return sb2.toString();
    }
}
