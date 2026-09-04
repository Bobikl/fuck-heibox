package com.tencent.cos.xml.model.tag;

import com.tencent.cos.xml.crypto.Headers;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class COSMetaData {
    private Map<String, String> metaData = new HashMap();

    public String get(String str) {
        return this.metaData.get(str);
    }

    public Set<String> keySet() {
        return this.metaData.keySet();
    }

    public void put(String str, String str2) {
        if (!str.startsWith(Headers.COS_USER_METADATA_PREFIX)) {
            str = Headers.COS_USER_METADATA_PREFIX + str;
        }
        this.metaData.put(str, str2);
    }
}
