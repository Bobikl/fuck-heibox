package com.hihonor.push.sdk;

import com.hihonor.push.framework.aidl.IMessageEntity;
import com.hihonor.push.sdk.common.data.ApiException;
import com.hihonor.push.sdk.internal.HonorPushErrorEnum;

/* JADX INFO: loaded from: classes7.dex */
public class g1 extends f1<Void> {
    public g1(String str, IMessageEntity iMessageEntity) {
        super(str, iMessageEntity);
    }

    @Override // com.hihonor.push.sdk.f1
    public void a(ApiException apiException, Object obj) {
        if (apiException == null) {
            apiException = HonorPushErrorEnum.ERROR_UNKNOWN.toApiException();
        }
        if (apiException.getErrorCode() == HonorPushErrorEnum.SUCCESS.getErrorCode()) {
            this.f60027a.a((Object) null);
        } else {
            apiException.getErrorCode();
            this.f60027a.a((Exception) apiException);
        }
    }
}
