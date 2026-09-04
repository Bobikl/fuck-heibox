package com.huawei.hms.opendevice;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.TokenReq;
import com.huawei.hms.aaid.entity.TokenResp;
import com.huawei.hms.aaid.entity.TokenResult;
import com.huawei.hms.aaid.task.PushClient;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;

/* JADX INFO: compiled from: GetTokenTask.java */
/* JADX INFO: loaded from: classes7.dex */
public class f extends TaskApiCall<PushClient, TokenResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f61147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TokenReq f61148b;

    public f(String str, TokenReq tokenReq, Context context, String str2) {
        super(str, JsonUtil.createJsonString(tokenReq), str2);
        this.f61147a = context;
        this.f61148b = tokenReq;
    }

    private void a(ResponseErrorCode responseErrorCode, TaskCompletionSource<TokenResult> taskCompletionSource) {
        ErrorEnum errorEnumFromCode = ErrorEnum.fromCode(responseErrorCode.getErrorCode());
        if (errorEnumFromCode != ErrorEnum.ERROR_UNKNOWN) {
            taskCompletionSource.setException(errorEnumFromCode.toApiException());
        } else {
            taskCompletionSource.setException(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        }
    }

    private void a(String str, String str2) {
        if (i.a(this.f61147a).b(str2).equals(str)) {
            return;
        }
        HMSLog.i(HmsInstanceId.TAG, "receive a new token, refresh the local token");
        i.a(this.f61147a).b(str2, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(PushClient pushClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<TokenResult> taskCompletionSource) {
        if (responseErrorCode.getErrorCode() != 0) {
            HMSLog.e(HmsInstanceId.TAG, "TokenTask failed, ErrorCode:" + responseErrorCode.getErrorCode());
            a(responseErrorCode, taskCompletionSource);
        } else {
            TokenResp tokenResp = (TokenResp) JsonUtil.jsonToEntity(str, new TokenResp());
            ErrorEnum errorEnumFromCode = ErrorEnum.fromCode(tokenResp.getRetCode());
            if (errorEnumFromCode != ErrorEnum.SUCCESS) {
                taskCompletionSource.setException(errorEnumFromCode.toApiException());
                HMSLog.e(HmsInstanceId.TAG, "TokenTask failed, StatusCode:" + errorEnumFromCode.getExternalCode());
            } else {
                TokenResult tokenResult = new TokenResult();
                tokenResult.setToken(tokenResp.getToken());
                tokenResult.setBelongId(tokenResp.getBelongId());
                tokenResult.setRetCode(ErrorEnum.fromCode(tokenResp.getRetCode()).getExternalCode());
                taskCompletionSource.setResult(tokenResult);
                String token = tokenResp.getToken();
                if (TextUtils.isEmpty(token)) {
                    HMSLog.i(HmsInstanceId.TAG, "GetTokenTask receive an empty token, please check onNewToken callback method.");
                    h.a(pushClient.getContext(), getUri(), responseErrorCode);
                    return;
                } else {
                    a(token, this.f61148b.getSubjectId());
                    if (TextUtils.isEmpty(this.f61148b.getSubjectId())) {
                        m.a(this.f61147a, token);
                    }
                }
            }
        }
        h.a(pushClient.getContext(), getUri(), responseErrorCode);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return this.f61148b.isMultiSender() ? 50004300 : 30000000;
    }
}
