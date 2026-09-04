package com.huawei.hms.push;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hmf.tasks.Tasks;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.encrypt.PushEncrypter;
import com.huawei.hms.aaid.init.AutoInitHelper;
import com.huawei.hms.aaid.plugin.ProxyCenter;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.aaid.utils.BaseUtils;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.task.BaseVoidTask;
import com.huawei.hms.push.task.IntentCallable;
import com.huawei.hms.push.task.SendUpStreamTask;
import com.huawei.hms.push.task.SubscribeTask;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.EnableNotifyReq;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.support.api.entity.push.SubscribeReq;
import com.huawei.hms.support.api.entity.push.UpSendMsgReq;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import com.huawei.hms.utils.NetWorkUtil;
import com.vivo.push.PushClientConstants;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class HmsMessaging {
    public static final String DEFAULT_TOKEN_SCOPE = "HCM";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f61198c = Pattern.compile("[\\u4e00-\\u9fa5\\w-_.~%]{1,900}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f61199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HuaweiApi<Api.ApiOptions.NoOptions> f61200b;

    private HmsMessaging(Context context) {
        Preconditions.checkNotNull(context);
        this.f61199a = context;
        Api api = new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH);
        if (context instanceof Activity) {
            this.f61200b = new HuaweiApi<>((Activity) context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
        } else {
            this.f61200b = new HuaweiApi<>(context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, new PushClientBuilder());
        }
        this.f61200b.setKitSdkVersion(60900300);
    }

    private Task<Void> a(String str, String str2) {
        String strReportEntry = PushBiUtil.reportEntry(this.f61199a, PushNaming.SUBSCRIBE);
        if (str == null || !f61198c.matcher(str).matches()) {
            PushBiUtil.reportExit(this.f61199a, PushNaming.SUBSCRIBE, strReportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
            HMSLog.e("HmsMessaging", "Invalid topic: topic should match the format:[\\u4e00-\\u9fa5\\w-_.~%]{1,900}");
            throw new IllegalArgumentException("Invalid topic: topic should match the format:[\\u4e00-\\u9fa5\\w-_.~%]{1,900}");
        }
        if (ProxyCenter.getProxy() != null) {
            HMSLog.i("HmsMessaging", "use proxy subscribe.");
            return TextUtils.equals(str2, "Sub") ? ProxyCenter.getProxy().subscribe(this.f61199a, str, strReportEntry) : ProxyCenter.getProxy().unsubscribe(this.f61199a, str, strReportEntry);
        }
        try {
            ErrorEnum errorEnumA = t.a(this.f61199a);
            if (errorEnumA != ErrorEnum.SUCCESS) {
                throw errorEnumA.toApiException();
            }
            if (NetWorkUtil.getNetworkType(this.f61199a) == 0) {
                HMSLog.e("HmsMessaging", "no network");
                throw ErrorEnum.ERROR_NO_NETWORK.toApiException();
            }
            SubscribeReq subscribeReq = new SubscribeReq(this.f61199a, str2, str);
            subscribeReq.setToken(BaseUtils.getLocalToken(this.f61199a, null));
            return c.b() ? this.f61200b.doWrite(new BaseVoidTask(PushNaming.SUBSCRIBE, JsonUtil.createJsonString(subscribeReq), strReportEntry)) : this.f61200b.doWrite(new SubscribeTask(PushNaming.SUBSCRIBE, JsonUtil.createJsonString(subscribeReq), strReportEntry));
        } catch (ApiException e10) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            taskCompletionSource.setException(e10);
            PushBiUtil.reportExit(this.f61199a, PushNaming.SUBSCRIBE, strReportEntry, e10.getStatusCode());
            return taskCompletionSource.getTask();
        } catch (Exception unused) {
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            taskCompletionSource2.setException(errorEnum.toApiException());
            PushBiUtil.reportExit(this.f61199a, PushNaming.SUBSCRIBE, strReportEntry, errorEnum);
            return taskCompletionSource2.getTask();
        }
    }

    private Task<Void> a(boolean z10) {
        String strReportEntry = PushBiUtil.reportEntry(this.f61199a, PushNaming.SET_NOTIFY_FLAG);
        if (!c.d(this.f61199a) || c.b()) {
            HMSLog.i("HmsMessaging", "turn on/off with AIDL");
            EnableNotifyReq enableNotifyReq = new EnableNotifyReq();
            enableNotifyReq.setPackageName(this.f61199a.getPackageName());
            enableNotifyReq.setEnable(z10);
            return this.f61200b.doWrite(new BaseVoidTask(PushNaming.SET_NOTIFY_FLAG, JsonUtil.createJsonString(enableNotifyReq), strReportEntry));
        }
        if (HwBuildEx.VERSION.EMUI_SDK_INT < 12) {
            HMSLog.e("HmsMessaging", "operation not available on Huawei device with EMUI lower than 5.1");
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            ErrorEnum errorEnum = ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED;
            taskCompletionSource.setException(errorEnum.toApiException());
            PushBiUtil.reportExit(this.f61199a, PushNaming.SET_NOTIFY_FLAG, strReportEntry, errorEnum);
            return taskCompletionSource.getTask();
        }
        if (c.b(this.f61199a) < 90101310) {
            HMSLog.i("HmsMessaging", "turn on/off with broadcast v1");
            Intent intentPutExtra = new Intent("com.huawei.intent.action.SELF_SHOW_FLAG").putExtra("enalbeFlag", PushEncrypter.encrypterOld(this.f61199a, this.f61199a.getPackageName() + "#" + z10));
            intentPutExtra.setPackage("android");
            return Tasks.callInBackground(new IntentCallable(this.f61199a, intentPutExtra, strReportEntry));
        }
        HMSLog.i("HmsMessaging", "turn on/off with broadcast v2");
        new PushPreferences(this.f61199a, "push_notify_flag").saveBoolean("notify_msg_enable", !z10);
        Uri uri = Uri.parse("content://" + this.f61199a.getPackageName() + ".huawei.push.provider/push_notify_flag.xml");
        Intent intent = new Intent("com.huawei.android.push.intent.SDK_COMMAND");
        intent.putExtra("type", "enalbeFlag");
        intent.putExtra(PushClientConstants.TAG_PKG_NAME, this.f61199a.getPackageName());
        intent.putExtra("url", uri);
        intent.setPackage("android");
        return Tasks.callInBackground(new IntentCallable(this.f61199a, intent, strReportEntry));
    }

    private void a(RemoteMessage remoteMessage) {
        String strReportEntry = PushBiUtil.reportEntry(this.f61199a, PushNaming.UPSEND_MSG);
        ErrorEnum errorEnumA = t.a(this.f61199a);
        if (errorEnumA != ErrorEnum.SUCCESS) {
            HMSLog.e("HmsMessaging", "Message sent failed:" + errorEnumA.getExternalCode() + ':' + errorEnumA.getMessage());
            PushBiUtil.reportExit(this.f61199a, PushNaming.UPSEND_MSG, strReportEntry, errorEnumA);
            throw new UnsupportedOperationException(errorEnumA.getMessage());
        }
        if (TextUtils.isEmpty(remoteMessage.getTo())) {
            HMSLog.e("HmsMessaging", "Mandatory parameter 'to' missing");
            PushBiUtil.reportExit(this.f61199a, PushNaming.UPSEND_MSG, strReportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
            throw new IllegalArgumentException("Mandatory parameter 'to' missing");
        }
        if (TextUtils.isEmpty(remoteMessage.getMessageId())) {
            HMSLog.e("HmsMessaging", "Mandatory parameter 'message_id' missing");
            PushBiUtil.reportExit(this.f61199a, PushNaming.UPSEND_MSG, strReportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
            throw new IllegalArgumentException("Mandatory parameter 'message_id' missing");
        }
        if (TextUtils.isEmpty(remoteMessage.getData())) {
            HMSLog.e("HmsMessaging", "Mandatory parameter 'data' missing");
            PushBiUtil.reportExit(this.f61199a, PushNaming.UPSEND_MSG, strReportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
            throw new IllegalArgumentException("Mandatory parameter 'data' missing");
        }
        UpSendMsgReq upSendMsgReq = new UpSendMsgReq();
        upSendMsgReq.setPackageName(this.f61199a.getPackageName());
        upSendMsgReq.setMessageId(remoteMessage.getMessageId());
        upSendMsgReq.setTo(remoteMessage.getTo());
        upSendMsgReq.setData(remoteMessage.getData());
        upSendMsgReq.setMessageType(remoteMessage.getMessageType());
        upSendMsgReq.setTtl(remoteMessage.getTtl());
        upSendMsgReq.setCollapseKey(remoteMessage.getCollapseKey());
        upSendMsgReq.setSendMode(remoteMessage.getSendMode());
        upSendMsgReq.setReceiptMode(remoteMessage.getReceiptMode());
        if (c.b()) {
            this.f61200b.doWrite(new BaseVoidTask(PushNaming.UPSEND_MSG, JsonUtil.createJsonString(upSendMsgReq), strReportEntry));
        } else {
            a(upSendMsgReq, strReportEntry);
        }
    }

    private void a(UpSendMsgReq upSendMsgReq, String str) {
        upSendMsgReq.setToken(BaseUtils.getLocalToken(this.f61199a, null));
        try {
            this.f61200b.doWrite(new SendUpStreamTask(PushNaming.UPSEND_MSG, JsonUtil.createJsonString(upSendMsgReq), str, upSendMsgReq.getPackageName(), upSendMsgReq.getMessageId()));
        } catch (Exception e10) {
            if (!(e10.getCause() instanceof ApiException)) {
                PushBiUtil.reportExit(this.f61199a, PushNaming.UPSEND_MSG, str, ErrorEnum.ERROR_INTERNAL_ERROR);
            } else {
                PushBiUtil.reportExit(this.f61199a, PushNaming.UPSEND_MSG, str, ((ApiException) e10.getCause()).getStatusCode());
            }
        }
    }

    public static synchronized HmsMessaging getInstance(Context context) {
        return new HmsMessaging(context);
    }

    public boolean isAutoInitEnabled() {
        return AutoInitHelper.isAutoInitEnabled(this.f61199a);
    }

    public void send(RemoteMessage remoteMessage) {
        if (ProxyCenter.getProxy() != null) {
            HMSLog.e("HmsMessaging", "Operation(send) unsupported");
            throw new UnsupportedOperationException("Operation(send) unsupported");
        }
        HMSLog.i("HmsMessaging", "send upstream message");
        a(remoteMessage);
    }

    public void setAutoInitEnabled(boolean z10) {
        AutoInitHelper.setAutoInitEnabled(this.f61199a, z10);
    }

    public Task<Void> subscribe(String str) {
        HMSLog.i("HmsMessaging", "invoke subscribe");
        return a(str, "Sub");
    }

    public Task<Void> turnOffPush() {
        if (ProxyCenter.getProxy() != null) {
            HMSLog.i("HmsMessaging", "turn off for proxy");
            return ProxyCenter.getProxy().turnOff(this.f61199a, null);
        }
        HMSLog.i("HmsMessaging", "invoke turnOffPush");
        return a(false);
    }

    public Task<Void> turnOnPush() {
        if (ProxyCenter.getProxy() != null) {
            HMSLog.i("HmsMessaging", "turn on for proxy");
            return ProxyCenter.getProxy().turnOn(this.f61199a, null);
        }
        HMSLog.i("HmsMessaging", "invoke turnOnPush");
        return a(true);
    }

    public Task<Void> unsubscribe(String str) {
        HMSLog.i("HmsMessaging", "invoke unsubscribe");
        return a(str, "UnSub");
    }
}
