package com.huawei.hms.push;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.config.AGConnectServicesConfig;
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
import com.huawei.hms.mlsdk.common.AgConnectInfo;
import com.huawei.hms.push.task.ProfileTask;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.ProfileReq;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import com.huawei.secure.android.common.encrypt.hash.SHA;

/* JADX INFO: loaded from: classes7.dex */
public class HmsProfile {
    public static final int CUSTOM_PROFILE = 2;
    public static final int HUAWEI_PROFILE = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f61201c = "HmsProfile";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f61202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HuaweiApi<Api.ApiOptions.NoOptions> f61203b;

    private HmsProfile(Context context) {
        this.f61202a = null;
        Preconditions.checkNotNull(context);
        this.f61202a = context;
        Api api = new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH);
        if (context instanceof Activity) {
            this.f61203b = new HuaweiApi<>((Activity) context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
        } else {
            this.f61203b = new HuaweiApi<>(context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, new PushClientBuilder());
        }
        this.f61203b.setKitSdkVersion(60900300);
    }

    private Task<Void> a(int i10, String str, int i11, String str2) {
        if (!isSupportProfile()) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            taskCompletionSource.setException(ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.toApiException());
            return taskCompletionSource.getTask();
        }
        if (!TextUtils.isEmpty(str)) {
            String strA = a(this.f61202a);
            if (TextUtils.isEmpty(strA)) {
                HMSLog.i(f61201c, "agc connect services config missing project id.");
                TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                taskCompletionSource2.setException(ErrorEnum.ERROR_MISSING_PROJECT_ID.toApiException());
                return taskCompletionSource2.getTask();
            }
            if (str.equals(strA)) {
                str = "";
            }
        }
        ProfileReq profileReq = new ProfileReq();
        if (i10 == 0) {
            profileReq.setOperation(0);
            profileReq.setType(i11);
        } else {
            profileReq.setOperation(1);
        }
        String strReportEntry = PushBiUtil.reportEntry(this.f61202a, PushNaming.PUSH_PROFILE);
        try {
            profileReq.setSubjectId(str);
            profileReq.setProfileId(SHA.sha256Encrypt(str2));
            profileReq.setPkgName(this.f61202a.getPackageName());
            return this.f61203b.doWrite(new ProfileTask(PushNaming.PUSH_PROFILE, JsonUtil.createJsonString(profileReq), strReportEntry));
        } catch (Exception e10) {
            if (e10.getCause() instanceof ApiException) {
                TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                ApiException apiException = (ApiException) e10.getCause();
                taskCompletionSource3.setException(apiException);
                PushBiUtil.reportExit(this.f61202a, PushNaming.PUSH_PROFILE, strReportEntry, apiException.getStatusCode());
                return taskCompletionSource3.getTask();
            }
            TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
            Context context = this.f61202a;
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            PushBiUtil.reportExit(context, PushNaming.PUSH_PROFILE, strReportEntry, errorEnum);
            taskCompletionSource4.setException(errorEnum.toApiException());
            return taskCompletionSource4.getTask();
        }
    }

    private static String a(Context context) {
        return AGConnectServicesConfig.fromContext(context).getString(AgConnectInfo.AgConnectKey.PROJECT_ID);
    }

    private boolean b(Context context) {
        return c.b(context) >= 110001400;
    }

    public static HmsProfile getInstance(Context context) {
        return new HmsProfile(context);
    }

    public Task<Void> addProfile(int i10, String str) {
        return addProfile("", i10, str);
    }

    public Task<Void> addProfile(String str, int i10, String str2) {
        if (i10 != 1 && i10 != 2) {
            HMSLog.i(f61201c, "add profile type undefined.");
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            taskCompletionSource.setException(ErrorEnum.ERROR_PUSH_ARGUMENTS_INVALID.toApiException());
            return taskCompletionSource.getTask();
        }
        if (!TextUtils.isEmpty(str2)) {
            return a(0, str, i10, str2);
        }
        HMSLog.i(f61201c, "add profile params is empty.");
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        taskCompletionSource2.setException(ErrorEnum.ERROR_PUSH_ARGUMENTS_INVALID.toApiException());
        return taskCompletionSource2.getTask();
    }

    public Task<Void> deleteProfile(String str) {
        return deleteProfile("", str);
    }

    public Task<Void> deleteProfile(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return a(1, str, -1, str2);
        }
        HMSLog.e(f61201c, "del profile params is empty.");
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setException(ErrorEnum.ERROR_PUSH_ARGUMENTS_INVALID.toApiException());
        return taskCompletionSource.getTask();
    }

    public boolean isSupportProfile() {
        if (!c.d(this.f61202a)) {
            return true;
        }
        if (c.c()) {
            HMSLog.i(f61201c, "current EMUI version below 9.1, not support profile operation.");
            return false;
        }
        if (b(this.f61202a)) {
            return true;
        }
        HMSLog.i(f61201c, "current HwPushService.apk version below 11.0.1.400,please upgrade your HwPushService.apk version.");
        return false;
    }
}
