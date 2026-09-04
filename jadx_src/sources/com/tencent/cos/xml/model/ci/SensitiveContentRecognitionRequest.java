package com.tencent.cos.xml.model.ci;

import com.xiaomi.mipush.sdk.Constants;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class SensitiveContentRecognitionRequest extends ImageCloudProcessRequest {
    private Set<String> types;

    public SensitiveContentRecognitionRequest(String str, String str2) {
        super(str, str2);
        this.types = new HashSet();
    }

    @Override // com.tencent.cos.xml.model.ci.ImageCloudProcessRequest
    protected void addCiParams() {
        if (this.types.isEmpty()) {
            this.types.add("porn");
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        Iterator<String> it = this.types.iterator();
        while (it.hasNext()) {
            i10++;
            sb2.append(it.next());
            if (i10 < this.types.size()) {
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
        }
        this.queryParameters.put("ci-process", "sensitive-content-recognition");
        this.queryParameters.put("detect-type", sb2.toString());
    }

    public void addType(String str) {
        this.types.add(str);
    }
}
