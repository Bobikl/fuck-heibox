package com.umeng.message.component;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.LruCache;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.tencent.open.SocialConstants;
import com.umeng.analytics.pro.d;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.message.MessageSharedPrefs;
import com.umeng.message.api.UPushMessageHandler;
import com.umeng.message.api.UPushRegisterCallback;
import com.umeng.message.api.UPushSettingCallback;
import com.umeng.message.api.UPushThirdTokenCallback;
import com.umeng.message.common.UPLog;
import com.umeng.message.entity.UMessage;
import com.umeng.message.proguard.b;
import com.umeng.message.proguard.f;
import com.umeng.message.proguard.h;
import com.umeng.message.proguard.j;
import com.umeng.message.proguard.n;
import com.umeng.message.proguard.q;
import com.umeng.message.proguard.u;
import com.umeng.message.proguard.v;
import com.umeng.message.proguard.x;
import com.umeng.message.proguard.y;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class UmengMessageHandlerService extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final LruCache<String, String> f105572a = new LruCache<>(3);

    @Override // com.umeng.message.proguard.q
    public final void onHandleWork(Intent intent) {
        UPushMessageHandler messageHandler;
        super.onHandleWork(intent);
        final Application applicationA = x.a();
        if (applicationA == null) {
            UPLog.i("MsgHandlerService", "context null!");
        }
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        String stringExtra = intent.getStringExtra("um_command");
        UPLog.i("MsgHandlerService", "action:", action, stringExtra);
        if (TextUtils.equals("com.umeng.message.action", action)) {
            if (stringExtra == null || stringExtra.length() == 0) {
                return;
            }
            switch (stringExtra) {
                case "enable":
                    try {
                        boolean booleanExtra = intent.getBooleanExtra("status", false);
                        UPushSettingCallback settingCallback = u.a().getSettingCallback();
                        UPLog.i("MsgHandlerService", "push open status:".concat(String.valueOf(booleanExtra)));
                        if (!booleanExtra) {
                            if (settingCallback != null) {
                                settingCallback.onFailure(intent.getStringExtra("code"), intent.getStringExtra(SocialConstants.PARAM_APP_DESC));
                            }
                        } else if (settingCallback != null) {
                            settingCallback.onSuccess();
                        }
                        break;
                    } catch (Throwable th2) {
                        UPLog.e("MsgHandlerService", th2);
                        return;
                    }
                    break;
                case "handle":
                    try {
                        String stringExtra2 = intent.getStringExtra("body");
                        if (stringExtra2 != null) {
                            UMessage uMessage = new UMessage(new JSONObject(stringExtra2));
                            if ((!"notification".equals(uMessage.getDisplayType()) || !uMessage.hasResourceFromInternet() || !j.a().a(intent)) && (messageHandler = u.a().getMessageHandler()) != null) {
                                messageHandler.handleMessage(applicationA, uMessage);
                            }
                            break;
                        }
                    } catch (Throwable th3) {
                        UPLog.e("MsgHandlerService", th3);
                        return;
                    }
                    break;
                case "register":
                    try {
                        final String stringExtra3 = intent.getStringExtra("registration_id");
                        boolean booleanExtra2 = intent.getBooleanExtra("status", false);
                        UPLog.i("MsgHandlerService", "deviceToken:", stringExtra3, "status:", Boolean.valueOf(booleanExtra2));
                        final UPushRegisterCallback registerCallback = u.a().getRegisterCallback();
                        try {
                            if (booleanExtra2) {
                                b.c(new Runnable() { // from class: com.umeng.message.component.UmengMessageHandlerService.1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        final String strK = "";
                                        try {
                                            MessageSharedPrefs messageSharedPrefs = MessageSharedPrefs.getInstance(applicationA);
                                            strK = messageSharedPrefs.k();
                                            String str = stringExtra3;
                                            if (str != null && strK != null && !str.equals(strK)) {
                                                String str2 = stringExtra3;
                                                if (str2 == null) {
                                                    messageSharedPrefs.f105562b.a(RemoteMessageConst.DEVICE_TOKEN);
                                                } else {
                                                    messageSharedPrefs.f105562b.a(RemoteMessageConst.DEVICE_TOKEN, str2);
                                                }
                                                Context context = applicationA;
                                                messageSharedPrefs.f105562b.a("has_register");
                                                messageSharedPrefs.f105562b.a(d.f104709p);
                                                messageSharedPrefs.f105562b.a("re_pop_times");
                                                messageSharedPrefs.f105562b.a("re_pop_cfg");
                                                messageSharedPrefs.f105562b.a("tags");
                                                messageSharedPrefs.f105562b.a("tag_remain");
                                                messageSharedPrefs.b("tag_add_");
                                                messageSharedPrefs.b("tag_del_");
                                                messageSharedPrefs.b("tag_get_");
                                                messageSharedPrefs.b("alias_del_");
                                                messageSharedPrefs.b("alias_set_");
                                                messageSharedPrefs.b("alias_add_");
                                                try {
                                                    context.getContentResolver().delete(h.b(context), null, null);
                                                } catch (Throwable th4) {
                                                    UPLog.e("Prefs", th4);
                                                }
                                            }
                                        } catch (Throwable th5) {
                                            UPLog.e("MsgHandlerService", th5);
                                        }
                                        try {
                                            UPushRegisterCallback uPushRegisterCallback = registerCallback;
                                            if (uPushRegisterCallback != null) {
                                                uPushRegisterCallback.onSuccess(stringExtra3);
                                            }
                                        } catch (Throwable th6) {
                                            UPLog.e("MsgHandlerService", th6);
                                        }
                                        final y yVarA = y.a();
                                        if (!y.c()) {
                                            final MessageSharedPrefs messageSharedPrefs2 = MessageSharedPrefs.getInstance(x.a());
                                            if (!messageSharedPrefs2.f105562b.b("has_register", false) && !y.f105909b) {
                                                y.f105909b = true;
                                                b.c(new Runnable() { // from class: com.umeng.message.proguard.y.3

                                                    /* JADX INFO: renamed from: a */
                                                    final /* synthetic */ String f105918a;

                                                    /* JADX INFO: renamed from: b */
                                                    final /* synthetic */ MessageSharedPrefs f105919b;

                                                    public AnonymousClass3() {
                                                        str = strK;
                                                        messageSharedPrefs = messageSharedPrefs2;
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        try {
                                                            y.this.f105911d.a(str);
                                                            UPLog.d("Track", "trackRegister deviceToken:", messageSharedPrefs.k());
                                                        } catch (Throwable th7) {
                                                            UPLog.e("Track", th7);
                                                            y.f105909b = false;
                                                        }
                                                    }
                                                });
                                            }
                                        }
                                        u.a().onAppStart();
                                        n.a();
                                    }
                                });
                            } else if (registerCallback != null) {
                                registerCallback.onFailure(intent.getStringExtra("code"), intent.getStringExtra(SocialConstants.PARAM_APP_DESC));
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                        break;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                    UPLog.e("MsgHandlerService", th);
                    break;
                case "send":
                    try {
                        String stringExtra4 = intent.getStringExtra("send_message");
                        if (stringExtra4 != null) {
                            String stringExtra5 = intent.getStringExtra("um_px_path");
                            JSONObject jSONObject = new JSONObject(stringExtra4);
                            jSONObject.put("um_px_path", stringExtra5);
                            UMWorkDispatch.sendEvent(applicationA, 16388, v.a(), jSONObject.toString());
                            break;
                        }
                    } catch (Throwable th6) {
                        UPLog.e("MsgHandlerService", th6);
                        return;
                    }
                    break;
                case "third_token":
                    try {
                        String stringExtra6 = intent.getStringExtra("third_token");
                        String strA = f.a(intent.getStringExtra("type"));
                        if (!TextUtils.isEmpty(strA) && !TextUtils.isEmpty(stringExtra6)) {
                            LruCache<String, String> lruCache = f105572a;
                            if (!TextUtils.equals(lruCache.get(strA), stringExtra6)) {
                                UPLog.i("MsgHandlerService", "third push type:", strA, "token:", stringExtra6);
                                UPushThirdTokenCallback thirdTokenCallback = u.a().getThirdTokenCallback();
                                if (thirdTokenCallback != null) {
                                    thirdTokenCallback.onToken(strA, stringExtra6);
                                } else {
                                    String pushIntentServiceClass = u.a().getPushIntentServiceClass();
                                    if (!TextUtils.isEmpty(pushIntentServiceClass)) {
                                        Class<?> cls = Class.forName(pushIntentServiceClass);
                                        Intent intent2 = new Intent();
                                        intent2.setPackage(applicationA.getPackageName());
                                        intent2.putExtra("um_command", "third_token");
                                        intent2.putExtra("third_token", stringExtra6);
                                        intent2.putExtra("type", strA);
                                        intent2.setClass(applicationA, cls);
                                        q.enqueueWork(applicationA, cls, intent2);
                                    }
                                }
                                lruCache.put(strA, stringExtra6);
                            } else {
                                UPLog.i("MsgHandlerService", "third push callback skipped! already called.");
                            }
                            break;
                        }
                        UPLog.i("MsgHandlerService", "third push skipped! type:", strA, "token:", stringExtra6);
                        break;
                    } catch (Throwable th7) {
                        UPLog.e("MsgHandlerService", th7);
                        return;
                    }
                    break;
                case "disable":
                    try {
                        boolean booleanExtra3 = intent.getBooleanExtra("status", false);
                        UPushSettingCallback settingCallback2 = u.a().getSettingCallback();
                        UPLog.i("MsgHandlerService", "push close status:".concat(String.valueOf(booleanExtra3)));
                        if (!booleanExtra3) {
                            if (settingCallback2 != null) {
                                settingCallback2.onFailure(intent.getStringExtra("code"), intent.getStringExtra(SocialConstants.PARAM_APP_DESC));
                            }
                        } else if (settingCallback2 != null) {
                            settingCallback2.onSuccess();
                        }
                        break;
                    } catch (Throwable th8) {
                        UPLog.e("MsgHandlerService", th8);
                        return;
                    }
                    break;
            }
        }
    }
}
