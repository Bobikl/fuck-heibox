package com.huawei.hms.aaid;

import android.app.Activity;
import android.content.Context;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.TokenReq;
import com.huawei.hms.aaid.entity.TokenResult;
import com.huawei.hms.aaid.plugin.ProxyCenter;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.opendevice.b;
import com.huawei.hms.opendevice.f;
import com.huawei.hms.opendevice.h;
import com.huawei.hms.support.log.HMSLog;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class HmsInstanceIdEx {
    public static final String TAG = "HmsInstanceIdEx";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f60247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PushPreferences f60248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HuaweiApi<Api.ApiOptions.NoOptions> f60249c;

    private HmsInstanceIdEx(Context context) {
        this.f60248b = null;
        this.f60247a = context;
        this.f60248b = new PushPreferences(context, "aaid");
        Api api = new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH);
        if (context instanceof Activity) {
            this.f60249c = new HuaweiApi<>((Activity) context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
        } else {
            this.f60249c = new HuaweiApi<>(context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, new PushClientBuilder());
        }
        this.f60249c.setKitSdkVersion(60900300);
    }

    private Task<TokenResult> a(Exception exc) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setException(exc);
        return taskCompletionSource.getTask();
    }

    private String a(String str) {
        return "creationTime" + str;
    }

    public static HmsInstanceIdEx getInstance(Context context) {
        Preconditions.checkNotNull(context);
        return new HmsInstanceIdEx(context);
    }

    public void deleteAAID(String str) throws ApiException {
        if (str == null) {
            throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
        }
        try {
            if (this.f60248b.containsKey(str)) {
                this.f60248b.removeKey(str);
                this.f60248b.removeKey(a(str));
            }
        } catch (RuntimeException unused) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        } catch (Exception unused2) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        }
    }

    public String getAAId(String str) throws ApiException {
        if (str == null) {
            throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
        }
        try {
            if (this.f60248b.containsKey(str)) {
                return this.f60248b.getString(str);
            }
            String string = UUID.randomUUID().toString();
            this.f60248b.saveString(str, string);
            this.f60248b.saveLong(a(str), Long.valueOf(System.currentTimeMillis()));
            return string;
        } catch (RuntimeException unused) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        } catch (Exception unused2) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        }
    }

    public long getCreationTime(String str) throws ApiException {
        if (str == null) {
            throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
        }
        try {
            if (!this.f60248b.containsKey(a(str))) {
                getAAId(str);
            }
            return this.f60248b.getLong(a(str));
        } catch (RuntimeException unused) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        } catch (Exception unused2) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        }
    }

    public Task<TokenResult> getToken() {
        if (ProxyCenter.getProxy() != null) {
            try {
                HMSLog.i(TAG, "use proxy get token, please check HmsMessageService.onNewToken receive result.");
                ProxyCenter.getProxy().getToken(this.f60247a, null, null);
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                taskCompletionSource.setResult(new TokenResult());
                return taskCompletionSource.getTask();
            } catch (ApiException e10) {
                return a(e10);
            } catch (Exception unused) {
                return a(ErrorEnum.ERROR_INTERNAL_ERROR.toApiException());
            }
        }
        String strA = h.a(this.f60247a, "push.gettoken");
        try {
            TokenReq tokenReqB = b.b(this.f60247a, null, null);
            tokenReqB.setAaid(HmsInstanceId.getInstance(this.f60247a).getId());
            return this.f60249c.doWrite(new f("push.gettoken", tokenReqB, this.f60247a, strA));
        } catch (RuntimeException unused2) {
            Context context = this.f60247a;
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            h.a(context, "push.gettoken", strA, errorEnum);
            return a(errorEnum.toApiException());
        } catch (Exception unused3) {
            Context context2 = this.f60247a;
            ErrorEnum errorEnum2 = ErrorEnum.ERROR_INTERNAL_ERROR;
            h.a(context2, "push.gettoken", strA, errorEnum2);
            return a(errorEnum2.toApiException());
        }
    }
}
