package com.hihonor.push.sdk;

import com.hihonor.push.framework.aidl.IMessageEntity;
import com.hihonor.push.framework.aidl.entity.BooleanResult;
import com.hihonor.push.sdk.common.data.ApiException;
import com.hihonor.push.sdk.internal.HonorPushErrorEnum;

/* JADX INFO: loaded from: classes7.dex */
public class c1 extends f1<BooleanResult> {
    public c1(String str, IMessageEntity iMessageEntity) {
        super(str, iMessageEntity);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.hihonor.push.sdk.f1
    public void a(ApiException apiException, Object obj) {
        if (apiException == null) {
            apiException = HonorPushErrorEnum.ERROR_UNKNOWN.toApiException();
        }
        if (apiException.getErrorCode() == HonorPushErrorEnum.SUCCESS.getErrorCode()) {
            if (obj instanceof BooleanResult) {
                this.f60027a.a((TResult) ((BooleanResult) obj));
                return;
            }
            apiException = HonorPushErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        }
        apiException.getErrorCode();
        this.f60027a.a((Exception) apiException);
    }
}
