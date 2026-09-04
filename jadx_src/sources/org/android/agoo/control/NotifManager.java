package org.android.agoo.control;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UTMini;
import com.umeng.message.component.UmengMessageHandlerService;
import com.umeng.message.proguard.q;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.Config;
import org.android.agoo.common.MsgDO;
import org.json.JSONObject;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes5.dex */
public class NotifManager {
    private static final String ACK_MESSAGE = "accs.ackMessage";
    private static final int EVENT_ID = 66001;
    private static final String TAG = "NotifManager";
    private Context mContext = null;

    private byte[] convertMsgToBytes(MsgDO msgDO) throws UnsupportedEncodingException {
        HashMap map = new HashMap();
        map.put("api", "agooReport");
        map.put("id", msgDO.msgIds + "@" + msgDO.messageSource);
        map.put(SocializeProtocolConstants.PROTOCOL_KEY_EXTEND, msgDO.extData);
        map.put("status", msgDO.msgStatus);
        if (!TextUtils.isEmpty(msgDO.errorCode)) {
            map.put("ec", msgDO.errorCode);
        }
        if (!TextUtils.isEmpty(msgDO.type)) {
            map.put("type", msgDO.type);
        }
        if (!TextUtils.isEmpty(msgDO.fromPkg)) {
            map.put("fromPkg", msgDO.fromPkg);
        }
        if (!TextUtils.isEmpty(msgDO.fromAppkey)) {
            map.put(AgooConstants.MESSAGE_FROM_APPKEY, msgDO.fromAppkey);
        }
        if (!TextUtils.isEmpty(msgDO.notifyEnable)) {
            map.put("notifyEnable", msgDO.notifyEnable);
        }
        if (!TextUtils.isEmpty(msgDO.extData)) {
            map.put(SocializeProtocolConstants.PROTOCOL_KEY_EXTEND, msgDO.extData);
        }
        map.put("isStartProc", Boolean.toString(msgDO.isStartProc));
        map.put("appkey", Config.a(this.mContext));
        map.put("utdid", com.taobao.accs.utl.j.b(this.mContext));
        map.put("evokeAppStatus", String.valueOf(msgDO.evokeAppStatus));
        map.put("lastActiveTime", String.valueOf(msgDO.lastActiveTime));
        map.put("isGlobalClick", String.valueOf(msgDO.isGlobalClick));
        return new JSONObject(map).toString().getBytes("UTF-8");
    }

    private void reportMethod(MsgDO msgDO, TaoBaseService.ExtraInfo extraInfo) {
        try {
            if (msgDO == null) {
                ALog.e(TAG, "reportMethod msg null", new Object[0]);
                return;
            }
            ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, AgooConstants.AGOO_SERVICE_AGOOACK, convertMsgToBytes(msgDO), null, null, null, null);
            accsRequest.setTag(msgDO.msgIds);
            Context context = this.mContext;
            String strA = ACCSManager.getAccsInstance(context, Config.a(context), Config.c(this.mContext)).a(this.mContext, accsRequest, extraInfo);
            if (ALog.isPrintLog(ALog.Level.E)) {
                ALog.e(TAG, "report", Constants.KEY_DATA_ID, strA, "status", msgDO.msgStatus, "errorcode", msgDO.errorCode);
            }
        } catch (Throwable th2) {
            com.taobao.accs.utl.k.a("accs", "error", th2.toString(), 0.0d);
        }
    }

    public void doUninstall(String str, boolean z10) {
        try {
            HashMap map = new HashMap();
            map.put("pack", str);
            map.put("appkey", Config.a(this.mContext));
            map.put("utdid", com.taobao.accs.utl.j.b(this.mContext));
            ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, "agooKick", new JSONObject(map).toString().getBytes("UTF-8"), null, null, null, null);
            Context context = this.mContext;
            ACCSManager.getAccsInstance(context, Config.a(context), Config.c(this.mContext)).a(this.mContext, accsRequest, new TaoBaseService.ExtraInfo());
        } catch (Throwable th2) {
            ALog.e(TAG, "[doUninstall] is error", th2, new Object[0]);
        }
    }

    public void handlerACKMessage(MsgDO msgDO, TaoBaseService.ExtraInfo extraInfo) {
        if (msgDO == null) {
            return;
        }
        if (TextUtils.isEmpty(msgDO.msgIds) && TextUtils.isEmpty(msgDO.removePacks) && TextUtils.isEmpty(msgDO.errorCode)) {
            UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, ACK_MESSAGE, com.taobao.accs.utl.j.b(this.mContext), "handlerACKMessageRetuen", "msgids=" + msgDO.msgIds + ",removePacks=" + msgDO.removePacks + ",errorCode=" + msgDO.errorCode);
            return;
        }
        try {
            HashMap map = new HashMap();
            map.put("api", AgooConstants.AGOO_SERVICE_AGOOACK);
            map.put("id", msgDO.msgIds + "@" + msgDO.messageSource);
            if (!TextUtils.isEmpty(msgDO.removePacks)) {
                map.put("del_pack", msgDO.removePacks);
            }
            if (!TextUtils.isEmpty(msgDO.errorCode)) {
                map.put("ec", msgDO.errorCode);
            }
            if (!TextUtils.isEmpty(msgDO.type)) {
                map.put("type", msgDO.type);
            }
            if (!TextUtils.isEmpty(msgDO.extData)) {
                map.put(SocializeProtocolConstants.PROTOCOL_KEY_EXTEND, msgDO.extData);
            }
            map.put("appkey", Config.a(this.mContext));
            map.put("utdid", com.taobao.accs.utl.j.b(this.mContext));
            byte[] bytes = new JSONObject(map).toString().getBytes("UTF-8");
            UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, ACK_MESSAGE, com.taobao.accs.utl.j.b(this.mContext), "handlerACKMessageSendData", msgDO.msgIds);
            com.taobao.accs.utl.k.a("accs", BaseMonitor.COUNT_AGOO_ACK, "handlerACKMessage", 0.0d);
            ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, AgooConstants.AGOO_SERVICE_AGOOACK, bytes, null, null, null, null);
            accsRequest.setTag(msgDO.msgIds);
            Context context = this.mContext;
            ALog.i(TAG, "handlerACKMessage,endRequest,dataId=" + ACCSManager.getAccsInstance(context, Config.a(context), Config.c(this.mContext)).a(this.mContext, accsRequest, extraInfo), new Object[0]);
        } catch (Throwable th2) {
            if (ALog.isPrintLog(ALog.Level.E)) {
                ALog.e(TAG, "handlerACKMessage Throwable,msgIds=" + msgDO.msgIds + ",type=" + msgDO.type + ",e=" + th2.toString(), new Object[0]);
            }
            UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, ACK_MESSAGE, com.taobao.accs.utl.j.b(this.mContext), "handlerACKMessageExceptionFailed", th2.toString());
        }
    }

    public void init(Context context) {
        this.mContext = context;
    }

    public void pingApp(String str, String str2, String str3, int i10) {
    }

    public void report(MsgDO msgDO, TaoBaseService.ExtraInfo extraInfo) {
        if (TextUtils.isEmpty(msgDO.reportStr)) {
            return;
        }
        try {
            if (Integer.parseInt(msgDO.reportStr) >= -1) {
                reportMethod(msgDO, extraInfo);
                if (msgDO.isFromCache) {
                    return;
                }
                com.taobao.accs.utl.k.a("accs", BaseMonitor.COUNT_AGOO_ACK, msgDO.msgStatus, 0.0d);
            }
        } catch (Throwable th2) {
            ALog.e(TAG, "[report] is error", th2, new Object[0]);
        }
    }

    public void reportNotifyMessage(MsgDO msgDO) {
        if (msgDO != null) {
            try {
                com.taobao.accs.utl.k.a("accs", BaseMonitor.COUNT_AGOO_REPORT_ID, msgDO.msgIds, 0.0d);
                ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, AgooConstants.AGOO_SERVICE_AGOOACK, convertMsgToBytes(msgDO), null, null, null, null);
                Context context = this.mContext;
                ACCSManager.getAccsInstance(context, Config.a(context), Config.c(this.mContext)).a(this.mContext, accsRequest, (TaoBaseService.ExtraInfo) null);
                if (ALog.isPrintLog(ALog.Level.E)) {
                    ALog.e(TAG, "reportNotifyMessage", Constants.KEY_DATA_ID, accsRequest.dataId, "status", msgDO.msgStatus);
                }
                com.taobao.accs.utl.k.a("accs", BaseMonitor.COUNT_AGOO_CLICK, msgDO.msgStatus, 0.0d);
                com.taobao.accs.utl.k.a("accs", BaseMonitor.COUNT_AGOO_ACK, msgDO.msgStatus, 0.0d);
            } catch (Throwable th2) {
                ALog.e(TAG, "[reportNotifyMessage] is error", th2, new Object[0]);
                com.taobao.accs.utl.k.a("accs", "error", th2.toString(), 0.0d);
            }
        }
    }

    public void reportThirdPushToken(String str, String str2) {
        reportThirdPushToken(str, str2, true);
    }

    public void reportThirdPushToken(String str, String str2, String str3, boolean z10) {
        ThreadPoolExecutorFactory.schedule(new l(this, str2, str, str3, z10), 10L, TimeUnit.SECONDS);
        try {
            Intent intent = new Intent("com.umeng.message.action");
            intent.setPackage(this.mContext.getPackageName());
            intent.setClass(this.mContext, UmengMessageHandlerService.class);
            intent.putExtra("um_command", "third_token");
            intent.putExtra("third_token", str);
            intent.putExtra("type", str2);
            q.enqueueWork(this.mContext, UmengMessageHandlerService.class, intent);
        } catch (Throwable th2) {
            ALog.e(TAG, "report push token error", th2, new Object[0]);
        }
    }

    public void reportThirdPushToken(String str, String str2, boolean z10) {
        reportThirdPushToken(str, str2, null, z10);
    }
}
