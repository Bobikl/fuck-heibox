package com.bytedance.sdk.open.tt;

import android.os.Bundle;
import com.bytedance.sdk.open.douyin.model.OpenRecord;

/* JADX INFO: loaded from: classes6.dex */
public class c implements j7.b {
    @Override // j7.b
    public boolean a(int i10, Bundle bundle, j7.a aVar) {
        if (bundle != null && aVar != null) {
            if (i10 == 7) {
                OpenRecord.Request request = new OpenRecord.Request(bundle);
                if (!request.checkArgs()) {
                    return false;
                }
                aVar.a(request);
                return true;
            }
            if (i10 == 8) {
                OpenRecord.Response response = new OpenRecord.Response(bundle);
                if (response.checkArgs()) {
                    aVar.c(response);
                    return true;
                }
            }
        }
        return false;
    }
}
