package com.umeng.message.component;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.taobao.agoo.TaobaoBaseIntentService;
import com.umeng.analytics.pro.ak;
import com.umeng.message.UTrack;
import com.umeng.message.common.UPLog;
import com.umeng.message.entity.UMessage;
import com.umeng.message.proguard.ao;
import com.umeng.message.proguard.f;
import com.umeng.message.proguard.q;
import com.umeng.message.proguard.u;
import org.android.agoo.common.AgooConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class UmengIntentService extends TaobaoBaseIntentService {
    @Override // org.android.agoo.control.BaseIntentService, android.app.Service
    public final IBinder onBind(Intent intent) {
        try {
            return super.onBind(intent);
        } catch (Throwable th2) {
            UPLog.e("UmengIntentService", th2);
            return null;
        }
    }

    @Override // com.taobao.agoo.TaobaoBaseIntentService, org.android.agoo.control.BaseIntentService
    protected final void onError(Context context, String str) {
        UPLog.e("UmengIntentService", "onError msg:", str);
    }

    @Override // com.taobao.agoo.TaobaoBaseIntentService, org.android.agoo.control.BaseIntentService
    protected final void onMessage(Context context, Intent intent) {
        JSONObject jSONObjectOptJSONObject;
        try {
            UPLog.i("UmengIntentService", "onMessage");
            String stringExtra = intent.getStringExtra("body");
            String stringExtra2 = intent.getStringExtra("id");
            String stringExtra3 = intent.getStringExtra(AgooConstants.MESSAGE_TASK_ID);
            if (stringExtra == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject(stringExtra);
            jSONObject.put("agoo_msg_id", stringExtra2);
            jSONObject.put("agoo_task_id", stringExtra3);
            UMessage uMessage = new UMessage(jSONObject);
            ao.a(context).a(uMessage.getMsgId(), 0, System.currentTimeMillis());
            UTrack.getInstance().trackMsgArrival(uMessage);
            if (TextUtils.equals(ak.aw, uMessage.getDisplayType())) {
                try {
                    String custom = uMessage.getCustom();
                    if (custom == null || custom.length() <= 0 || (jSONObjectOptJSONObject = new JSONObject(custom).optJSONObject("id_res")) == null) {
                        return;
                    }
                    f.a(context, jSONObjectOptJSONObject.optString("id"), jSONObjectOptJSONObject.optLong("d_ts", 0L));
                    return;
                } catch (Throwable th2) {
                    UPLog.e("UmengIntentService", th2);
                    return;
                }
            }
            UPLog.i("UmengIntentService", "message:", jSONObject);
            Intent intent2 = new Intent("com.umeng.message.action");
            intent2.setPackage(context.getPackageName());
            intent2.putExtra("um_command", "handle");
            intent2.putExtra("body", uMessage.getRaw().toString());
            String pushIntentServiceClass = u.a().getPushIntentServiceClass();
            Class<?> cls = null;
            if (!TextUtils.isEmpty(pushIntentServiceClass)) {
                try {
                    cls = Class.forName(pushIntentServiceClass);
                } catch (Throwable th3) {
                    UPLog.e("UmengIntentService", th3);
                }
            }
            if (cls == null) {
                cls = UmengMessageHandlerService.class;
            }
            intent2.setClass(context, cls);
            q.enqueueWork(context, cls, intent2);
            return;
            UPLog.e("UmengIntentService", th);
        } catch (Throwable th4) {
            UPLog.e("UmengIntentService", th4);
        }
    }

    @Override // com.taobao.agoo.TaobaoBaseIntentService, org.android.agoo.control.BaseIntentService
    protected final void onRegistered(Context context, String str) {
    }

    @Override // com.taobao.agoo.TaobaoBaseIntentService
    protected final void onUnregistered(Context context, String str) {
    }
}
