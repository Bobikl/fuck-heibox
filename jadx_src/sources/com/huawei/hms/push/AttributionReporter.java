package com.huawei.hms.push;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.task.AttributionReportTask;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.AttributionReportReq;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.ui.SafeBundle;
import com.huawei.hms.utils.JsonUtil;

/* JADX INFO: loaded from: classes7.dex */
public class AttributionReporter {
    public static final String APP_VERSION = "appVersion";
    public static final String SYSTEM_PERMISSION = "permission";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HuaweiApi<Api.ApiOptions.NoOptions> f61190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f61191b;

    private AttributionReporter(Context context) {
        Preconditions.checkNotNull(context);
        this.f61191b = context;
        Api api = new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH);
        if (context instanceof Activity) {
            this.f61190a = new HuaweiApi<>((Activity) context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
        } else {
            this.f61190a = new HuaweiApi<>(context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, new PushClientBuilder());
        }
        this.f61190a.setKitSdkVersion(60900300);
    }

    private Task<Void> a(AttributionEvent attributionEvent, Bundle bundle) {
        TaskCompletionSource taskCompletionSource;
        int externalCode;
        String strReportEntry = PushBiUtil.reportEntry(this.f61191b, PushNaming.PUSH_ANALYSIS_REPORT);
        if (bundle == null || attributionEvent == null) {
            PushBiUtil.reportExit(this.f61191b, PushNaming.PUSH_ANALYSIS_REPORT, strReportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
            HMSLog.e("AttributionReporter", "Invalid argument: argument should not be null");
            throw new IllegalArgumentException("Invalid argument: argument should not be null");
        }
        try {
            if (!c.d(this.f61191b)) {
                throw ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.toApiException();
            }
            long j10 = new PushPreferences(this.f61191b, "hwpush_local_config").getLong("analysis_last_failed_time");
            if (j10 > 0 && System.currentTimeMillis() - j10 < 86400000) {
                throw ErrorEnum.ERROR_NOT_IN_SERVICE.toApiException();
            }
            return this.f61190a.doWrite(new AttributionReportTask(PushNaming.PUSH_ANALYSIS_REPORT, JsonUtil.createJsonString(a(attributionEvent, new SafeBundle(bundle))), strReportEntry));
        } catch (ApiException e10) {
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            taskCompletionSource2.setException(e10);
            externalCode = e10.getStatusCode();
            taskCompletionSource = taskCompletionSource2;
            PushBiUtil.reportExit(this.f61191b, PushNaming.PUSH_ANALYSIS_REPORT, strReportEntry, externalCode);
            return taskCompletionSource.getTask();
        } catch (Exception unused) {
            taskCompletionSource = new TaskCompletionSource();
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            taskCompletionSource.setException(errorEnum.toApiException());
            externalCode = errorEnum.getExternalCode();
            PushBiUtil.reportExit(this.f61191b, PushNaming.PUSH_ANALYSIS_REPORT, strReportEntry, externalCode);
            return taskCompletionSource.getTask();
        }
    }

    private AttributionReportReq a(AttributionEvent attributionEvent, SafeBundle safeBundle) throws ApiException {
        Bundle bundle = safeBundle.getBundle().getBundle("analysisExt");
        if (bundle == null || bundle.isEmpty()) {
            throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
        }
        String string = bundle.getString(RemoteMessageConst.MSGID);
        if (TextUtils.isEmpty(string)) {
            throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
        }
        String string2 = bundle.getString("hsId");
        if (TextUtils.isEmpty(string2)) {
            throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
        }
        AttributionReportReq attributionReportReq = new AttributionReportReq();
        attributionReportReq.setCampaignId(bundle.getString("cid"));
        attributionReportReq.setMsgId(string);
        attributionReportReq.setHaStorageId(string2);
        attributionReportReq.setEventId(attributionEvent.getEventId());
        attributionReportReq.setPkgName(this.f61191b.getPackageName());
        if (attributionEvent.equals(AttributionEvent.PERMISSION_GRANTED) || attributionEvent.equals(AttributionEvent.PERMISSION_DENIED)) {
            String string3 = safeBundle.getString(SYSTEM_PERMISSION);
            if (TextUtils.isEmpty(string3) || !string3.startsWith("android.permission")) {
                throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
            }
            attributionReportReq.setReqPermission(string3);
        }
        attributionReportReq.setTimeStamp(System.currentTimeMillis());
        attributionReportReq.setAppVersion(safeBundle.getString("appVersion"));
        return attributionReportReq;
    }

    public static AttributionReporter getInstance(Context context) {
        return new AttributionReporter(context);
    }

    public Task<Void> report(AttributionEvent attributionEvent, Bundle bundle) {
        return a(attributionEvent, bundle);
    }
}
