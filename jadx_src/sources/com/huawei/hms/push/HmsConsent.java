package com.huawei.hms.push;

import android.app.Activity;
import android.content.Context;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.task.ConsentTask;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.EnableConsentReq;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.utils.JsonUtil;

/* JADX INFO: loaded from: classes7.dex */
public class HmsConsent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HuaweiApi<Api.ApiOptions.NoOptions> f61194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f61195b;

    private HmsConsent(Context context) {
        Preconditions.checkNotNull(context);
        this.f61195b = context;
        Api api = new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH);
        if (context instanceof Activity) {
            this.f61194a = new HuaweiApi<>((Activity) context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
        } else {
            this.f61194a = new HuaweiApi<>(context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, new PushClientBuilder());
        }
        this.f61194a.setKitSdkVersion(60900300);
    }

    private Task<Void> a(boolean z10) {
        TaskCompletionSource taskCompletionSource;
        int externalCode;
        String strReportEntry = PushBiUtil.reportEntry(this.f61195b, PushNaming.PUSH_CONSENT);
        try {
            if (!c.d(this.f61195b)) {
                throw ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.toApiException();
            }
            EnableConsentReq enableConsentReq = new EnableConsentReq();
            enableConsentReq.setPackageName(this.f61195b.getPackageName());
            enableConsentReq.setEnable(z10);
            return this.f61194a.doWrite(new ConsentTask(PushNaming.PUSH_CONSENT, JsonUtil.createJsonString(enableConsentReq), strReportEntry));
        } catch (ApiException e10) {
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            taskCompletionSource2.setException(e10);
            externalCode = e10.getStatusCode();
            taskCompletionSource = taskCompletionSource2;
            PushBiUtil.reportExit(this.f61195b, PushNaming.PUSH_CONSENT, strReportEntry, externalCode);
            return taskCompletionSource.getTask();
        } catch (Exception unused) {
            taskCompletionSource = new TaskCompletionSource();
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            taskCompletionSource.setException(errorEnum.toApiException());
            externalCode = errorEnum.getExternalCode();
            PushBiUtil.reportExit(this.f61195b, PushNaming.PUSH_CONSENT, strReportEntry, externalCode);
            return taskCompletionSource.getTask();
        }
    }

    public static HmsConsent getInstance(Context context) {
        return new HmsConsent(context);
    }

    public Task<Void> consentOff() {
        return a(false);
    }

    public Task<Void> consentOn() {
        return a(true);
    }
}
