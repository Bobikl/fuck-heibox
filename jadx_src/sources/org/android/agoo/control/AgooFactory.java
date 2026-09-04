package org.android.agoo.control;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Base64;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;
import com.tencent.cos.xml.crypto.JceEncryptionConstants;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import javax.crypto.spec.SecretKeySpec;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.Config;
import org.android.agoo.common.MsgDO;
import org.android.agoo.message.MessageService;
import org.android.agoo.service.SendMessage;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes5.dex */
public class AgooFactory {
    private static final String DEAL_MESSAGE = "accs.msgRecevie";
    private static final String TAG = "AgooFactory";
    private static Context mContext;
    protected NotifManager notifyManager = null;
    private MessageService messageService = null;

    /* JADX INFO: compiled from: Taobao */
    public static class a implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Intent f132814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f132815b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private SendMessage f132816c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ServiceConnection f132817d = this;

        public a(String str, Intent intent) {
            this.f132815b = str;
            this.f132814a = intent;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            ALog.d(AgooFactory.TAG, "MessageConnection conneted:" + componentName, new Object[0]);
            this.f132816c = SendMessage.Stub.asInterface(iBinder);
            ALog.d(AgooFactory.TAG, "onConnected current tid:" + Thread.currentThread().getId(), new Object[0]);
            ALog.d(AgooFactory.TAG, "MessageConnection sent:" + this.f132814a, new Object[0]);
            if (this.f132816c != null) {
                ThreadPoolExecutorFactory.execute(new f(this));
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            ALog.d(AgooFactory.TAG, "MessageConnection disConnected", new Object[0]);
        }
    }

    /* JADX INFO: compiled from: Taobao */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f132819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Intent f132820c;

        public b(String str, Intent intent) {
            this.f132819b = str;
            this.f132820c = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ALog.d(AgooFactory.TAG, "running tid:" + Thread.currentThread().getId() + ",pack=" + this.f132819b, new Object[0]);
                AgooFactory.mContext.sendBroadcast(this.f132820c);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SendMessageRunnable for accs,pack=");
                sb2.append(this.f132819b);
                ALog.d(AgooFactory.TAG, sb2.toString(), new Object[0]);
                try {
                    this.f132820c.setPackage(this.f132819b);
                    this.f132820c.setAction(AgooConstants.INTENT_FROM_AGOO_MESSAGE);
                    com.taobao.accs.a.a.a(AgooFactory.mContext, this.f132820c);
                } catch (Throwable unused) {
                }
                Intent intent = new Intent(AgooConstants.BINDER_MSGRECEIVER_ACTION);
                intent.setPackage(this.f132819b);
                ALog.d(AgooFactory.TAG, "this message pack:" + this.f132819b, new Object[0]);
                ALog.d(AgooFactory.TAG, "start to service...", new Object[0]);
                boolean zBindService = AgooFactory.mContext.bindService(intent, new a(this.f132820c.getStringExtra("id"), this.f132820c), 17);
                ALog.d(AgooFactory.TAG, "start service ret:" + zBindService, new Object[0]);
                if (zBindService) {
                    return;
                }
                ALog.d(AgooFactory.TAG, "SendMessageRunnable is error", new Object[0]);
            } catch (Throwable th2) {
                ALog.e(AgooFactory.TAG, "SendMessageRunnable is error,e=" + th2.toString(), new Object[0]);
            }
        }
    }

    private static final boolean checkPackage(Context context, String str) {
        try {
            return context.getPackageManager().getApplicationInfo(str, 0) != null;
        } catch (Throwable unused) {
        }
    }

    private static Bundle getFlag(long j10, MsgDO msgDO) {
        Bundle bundle = new Bundle();
        try {
            char[] charArray = Long.toBinaryString(j10).toCharArray();
            if (charArray != null && 8 <= charArray.length) {
                if (8 <= charArray.length) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("");
                    sb2.append(Integer.parseInt("" + charArray[1] + charArray[2] + charArray[3] + charArray[4], 2));
                    bundle.putString(AgooConstants.MESSAGE_ENCRYPTED, sb2.toString());
                    if (charArray[6] == '1') {
                        bundle.putString("report", "1");
                        msgDO.reportStr = "1";
                    }
                    if (charArray[7] == '1') {
                        bundle.putString("notify", "1");
                    }
                }
                if (9 <= charArray.length && charArray[8] == '1') {
                    bundle.putString(AgooConstants.MESSAGE_HAS_TEST, "1");
                }
                if (10 <= charArray.length && charArray[9] == '1') {
                    bundle.putString(AgooConstants.MESSAGE_DUPLICATE, "1");
                }
                if (11 <= charArray.length && charArray[10] == '1') {
                    bundle.putInt(AgooConstants.MESSAGE_POPUP, 1);
                }
            }
        } catch (Throwable unused) {
        }
        return bundle;
    }

    public static String parseEncryptedMsg(String str) {
        byte[] bArrA;
        String str2 = null;
        try {
            String strA = Config.a(mContext);
            String strB = Config.b(mContext);
            String strJ = UtilityImpl.j(mContext);
            if (TextUtils.isEmpty(strB)) {
                ALog.e(TAG, "getAppsign secret null", new Object[0]);
                bArrA = null;
            } else {
                bArrA = org.android.agoo.common.a.a(strB.getBytes("utf-8"), (strA + strJ).getBytes("utf-8"));
            }
            if (bArrA == null || bArrA.length <= 0) {
                ALog.e(TAG, "aesDecrypt key is null!", new Object[0]);
            } else {
                str2 = new String(org.android.agoo.common.a.a(Base64.decode(str, 8), new SecretKeySpec(org.android.agoo.common.a.a(bArrA), JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM), org.android.agoo.common.a.a(strA.getBytes("utf-8"))), "utf-8");
            }
        } catch (Throwable th2) {
            ALog.e(TAG, "parseEncryptedMsg failure: ", th2, new Object[0]);
        }
        return TextUtils.isEmpty(str2) ? parseEncryptedMsgByOldDid(str) : str2;
    }

    private static String parseEncryptedMsgByOldDid(String str) {
        byte[] bArrA;
        try {
            String strD = UtilityImpl.d(Constants.SP_FILE_NAME, mContext);
            if (TextUtils.isEmpty(strD) || TextUtils.equals(strD, UtilityImpl.j(mContext))) {
                return null;
            }
            String strA = Config.a(mContext);
            String strB = Config.b(mContext);
            if (TextUtils.isEmpty(strB)) {
                ALog.e(TAG, "oldDid getAppsign secret null", new Object[0]);
                bArrA = null;
            } else {
                bArrA = org.android.agoo.common.a.a(strB.getBytes("utf-8"), (strA + strD).getBytes("utf-8"));
            }
            if (bArrA != null && bArrA.length > 0) {
                return new String(org.android.agoo.common.a.a(Base64.decode(str, 8), new SecretKeySpec(org.android.agoo.common.a.a(bArrA), JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM), org.android.agoo.common.a.a(strA.getBytes("utf-8"))), "utf-8");
            }
            ALog.e(TAG, "oldDid aesDecrypt key is null!", new Object[0]);
            return null;
        } catch (Throwable th2) {
            ALog.e(TAG, "oldDid parseEncryptedMsg failure: ", th2, new Object[0]);
            return null;
        }
    }

    private void sendMsgByBindService(String str, Intent intent) {
        try {
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.d(TAG, "onHandleMessage current tid:" + Thread.currentThread().getId(), new Object[0]);
            }
            ThreadPoolExecutorFactory.execute(new b(str, intent));
        } catch (Throwable th2) {
            ALog.e(TAG, "sendMsgByBindService error >>", th2, new Object[0]);
        }
    }

    private void sendMsgToBussiness(Context context, String str, Bundle bundle, boolean z10, String str2, TaoBaseService.ExtraInfo extraInfo) {
        Intent intent = new Intent();
        intent.setAction(AgooConstants.INTENT_FROM_AGOO_MESSAGE);
        intent.setPackage(str);
        intent.putExtras(bundle);
        intent.putExtra("type", "common-push");
        intent.putExtra(AgooConstants.MESSAGE_SOURCE, str2);
        intent.addFlags(32);
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable(AgooConstants.MESSAGE_ACCS_EXTRA, extraInfo);
            intent.putExtra(AgooConstants.MESSAGE_AGOO_BUNDLE, bundle2);
        } catch (Throwable th2) {
            ALog.e(TAG, "sendMsgToBussiness", th2, new Object[0]);
        }
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.i(TAG, "sendMsgToBussiness intent:" + bundle.toString() + ",utdid=" + com.taobao.accs.utl.j.b(context) + ",pack=" + str + ",agooFlag=" + z10, new Object[0]);
        }
        if (z10) {
            UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, DEAL_MESSAGE, com.taobao.accs.utl.j.b(context), "agooMsg", "15");
            sendMsgByBindService(str, intent);
        } else {
            intent.setClassName(str, com.taobao.accs.client.a.b());
            com.taobao.accs.a.a.a(context, intent);
        }
    }

    public void init(Context context, NotifManager notifManager, MessageService messageService) {
        mContext = context.getApplicationContext();
        this.notifyManager = notifManager;
        if (notifManager == null) {
            this.notifyManager = new NotifManager();
        }
        this.notifyManager.init(mContext);
        this.messageService = messageService;
        if (messageService == null) {
            this.messageService = new MessageService();
        }
        this.messageService.a(mContext);
    }

    public Bundle msgReceiverPreHandler(byte[] bArr, String str, TaoBaseService.ExtraInfo extraInfo, boolean z10) {
        StringBuilder sb2;
        boolean z11;
        Bundle bundle;
        StringBuilder sb3;
        String str2;
        int i10;
        int i11;
        String str3 = com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP;
        String str4 = SocializeProtocolConstants.PROTOCOL_KEY_EXTEND;
        if (bArr != null) {
            try {
                if (bArr.length > 0) {
                    String str5 = new String(bArr, "utf-8");
                    if (ALog.isPrintLog(ALog.Level.I)) {
                        ALog.i(TAG, "msgRecevie,message--->[" + str5 + "],utdid=" + com.taobao.accs.utl.j.b(mContext), new Object[0]);
                    }
                    if (TextUtils.isEmpty(str5)) {
                        UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, DEAL_MESSAGE, com.taobao.accs.utl.j.b(mContext), "message==null");
                        ALog.i(TAG, "handleMessage message==null,utdid=" + com.taobao.accs.utl.j.b(mContext), new Object[0]);
                        return null;
                    }
                    JSONArray jSONArray = new JSONArray(str5);
                    int length = jSONArray.length();
                    StringBuilder sb4 = new StringBuilder();
                    StringBuilder sb5 = new StringBuilder();
                    Bundle bundle2 = null;
                    String str6 = null;
                    int i12 = 0;
                    while (i12 < length) {
                        Bundle bundle3 = new Bundle();
                        JSONObject jSONObject = jSONArray.getJSONObject(i12);
                        if (jSONObject == null) {
                            i10 = i12;
                            sb3 = sb5;
                            i11 = length;
                            str2 = str5;
                            str3 = str3;
                            bundle = bundle3;
                            sb2 = sb4;
                        } else {
                            MsgDO msgDO = new MsgDO();
                            String string = jSONObject.getString("p");
                            String str7 = str6;
                            String string2 = jSONObject.getString("i");
                            String str8 = str5;
                            String string3 = jSONObject.getString("b");
                            StringBuilder sb6 = sb5;
                            StringBuilder sb7 = sb4;
                            long j10 = jSONObject.getLong("f");
                            String string4 = !jSONObject.isNull(str4) ? jSONObject.getString(str4) : str7;
                            int i13 = length - 1;
                            msgDO.msgIds = string2;
                            msgDO.extData = string4;
                            msgDO.removePacks = string;
                            msgDO.messageSource = str;
                            if (TextUtils.isEmpty(string3)) {
                                msgDO.errorCode = "11";
                                this.notifyManager.handlerACKMessage(msgDO, extraInfo);
                            } else if (TextUtils.isEmpty(string)) {
                                msgDO.errorCode = "12";
                                this.notifyManager.handlerACKMessage(msgDO, extraInfo);
                            } else {
                                if (j10 == -1) {
                                    msgDO.errorCode = "13";
                                    this.notifyManager.handlerACKMessage(msgDO, extraInfo);
                                } else {
                                    int i14 = length;
                                    if (checkPackage(mContext, string)) {
                                        sb2 = sb7;
                                        Bundle flag = getFlag(j10, msgDO);
                                        String string5 = flag.getString(AgooConstants.MESSAGE_ENCRYPTED);
                                        int i15 = i12;
                                        if (!mContext.getPackageName().equals(string)) {
                                            z11 = true;
                                        } else if (TextUtils.equals(string5, Integer.toString(4))) {
                                            z11 = false;
                                        } else {
                                            ALog.e(TAG, "msgRecevie msg encrypted flag not exist, cannot prase!!!", new Object[0]);
                                            UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, DEAL_MESSAGE, com.taobao.accs.utl.j.b(mContext), "encrypted!=4", "15");
                                            msgDO.errorCode = "24";
                                            this.notifyManager.handlerACKMessage(msgDO, extraInfo);
                                            sb3 = sb6;
                                            i10 = i15;
                                        }
                                        bundle3.putAll(flag);
                                        try {
                                            String string6 = jSONObject.getString("t");
                                            if (!TextUtils.isEmpty(string6)) {
                                                bundle3.putString("time", string6);
                                            }
                                        } catch (Throwable unused) {
                                            if (ALog.isPrintLog(ALog.Level.I)) {
                                                ALog.i(TAG, "agoo msg has no time", new Object[0]);
                                            }
                                        }
                                        str3 = str3;
                                        bundle3.putLong(AgooConstants.MESSAGE_TRACE, System.currentTimeMillis());
                                        bundle3.putString("id", string2);
                                        bundle3.putString("body", string3);
                                        bundle3.putString("source", string);
                                        bundle3.putString(AgooConstants.MESSAGE_FROM_APPKEY, Config.a(mContext));
                                        bundle3.putString(AgooConstants.MESSAGE_EXT, string4);
                                        bundle3.putString(AgooConstants.MESSAGE_ORI, str8);
                                        if (z10) {
                                            string4 = string4;
                                            bundle = bundle3;
                                            i10 = i15;
                                            sb3 = sb6;
                                            sb2 = sb2;
                                            i11 = i14;
                                            str2 = str8;
                                            sendMsgToBussiness(mContext, string, bundle, z11, str, extraInfo);
                                        } else {
                                            string4 = string4;
                                            bundle = bundle3;
                                            sb3 = sb6;
                                            str2 = str8;
                                            i10 = i15;
                                            sb2 = sb2;
                                            i11 = i14;
                                            bundle.putString("type", "common-push");
                                            bundle.putString(AgooConstants.MESSAGE_SOURCE, str);
                                        }
                                    } else {
                                        ALog.d(TAG, "msgRecevie checkpackage is del,pack=" + string, new Object[0]);
                                        UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, DEAL_MESSAGE, com.taobao.accs.utl.j.b(mContext), "deletePack", string);
                                        sb6.append(string);
                                        sb7.append(string2);
                                        if (i12 < i13) {
                                            sb6.append(str3);
                                            sb7.append(str3);
                                        }
                                        sb2 = sb7;
                                        i10 = i12;
                                        sb3 = sb6;
                                    }
                                    str2 = str8;
                                    bundle = bundle3;
                                    i11 = i14;
                                }
                                str6 = string4;
                            }
                            string4 = string4;
                            i10 = i12;
                            i11 = length;
                            str3 = str3;
                            str2 = str8;
                            bundle = bundle3;
                            sb2 = sb7;
                            sb3 = sb6;
                            str6 = string4;
                        }
                        i12 = i10 + 1;
                        sb5 = sb3;
                        bundle2 = bundle;
                        sb4 = sb2;
                        str3 = str3;
                        length = i11;
                        str5 = str2;
                        str4 = str4;
                        jSONArray = jSONArray;
                    }
                    StringBuilder sb8 = sb5;
                    StringBuilder sb9 = sb4;
                    if (sb8.length() > 0) {
                        MsgDO msgDO2 = new MsgDO();
                        msgDO2.msgIds = sb9.toString();
                        msgDO2.removePacks = sb8.toString();
                        msgDO2.errorCode = "10";
                        msgDO2.messageSource = str;
                        this.notifyManager.handlerACKMessage(msgDO2, extraInfo);
                    }
                    return bundle2;
                }
            } catch (Throwable th2) {
                if (!ALog.isPrintLog(ALog.Level.E)) {
                    return null;
                }
                ALog.e(TAG, "msgRecevie is error,e=" + th2, new Object[0]);
                return null;
            }
        }
        UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, DEAL_MESSAGE, com.taobao.accs.utl.j.b(mContext), "data==null");
        ALog.i(TAG, "handleMessage data==null,utdid=" + com.taobao.accs.utl.j.b(mContext), new Object[0]);
        return null;
    }

    public void msgRecevie(byte[] bArr, String str) {
        msgRecevie(bArr, str, null);
    }

    public void msgRecevie(byte[] bArr, String str, TaoBaseService.ExtraInfo extraInfo) {
        try {
            if (ALog.isPrintLog(ALog.Level.I)) {
                ALog.i(TAG, "into--[AgooFactory,msgRecevie]:messageSource=" + str, new Object[0]);
            }
            ThreadPoolExecutorFactory.execute(new org.android.agoo.control.b(this, bArr, str, extraInfo));
        } catch (Throwable th2) {
            ALog.e(TAG, "serviceImpl init task fail:" + th2.toString(), new Object[0]);
        }
    }

    public void reportCacheMsg() {
        try {
            ThreadPoolExecutorFactory.execute(new c(this));
        } catch (Throwable th2) {
            ALog.e(TAG, "reportCacheMsg fail:" + th2.toString(), new Object[0]);
        }
    }

    public void saveMsg(byte[] bArr) {
        saveMsg(bArr, null);
    }

    public void saveMsg(byte[] bArr, String str) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        ThreadPoolExecutorFactory.execute(new org.android.agoo.control.a(this, bArr, str));
    }

    public void updateMsg(byte[] bArr, boolean z10) {
        ThreadPoolExecutorFactory.execute(new d(this, bArr, z10));
    }

    public void updateMsgStatus(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                if (ALog.isPrintLog(ALog.Level.I)) {
                    ALog.i(TAG, "updateNotifyMsg begin,messageId=" + str + ",status=" + str2 + ",reportTimes=" + Config.f(mContext), new Object[0]);
                }
                if (TextUtils.equals(str2, "8")) {
                    this.messageService.a(str, "2");
                } else if (TextUtils.equals(str2, "9")) {
                    this.messageService.a(str, "3");
                }
            }
        } catch (Throwable th2) {
            ALog.e(TAG, "updateNotifyMsg e=" + th2.toString(), new Object[0]);
        }
    }

    public void updateNotifyMsg(String str, String str2) {
        ThreadPoolExecutorFactory.execute(new e(this, str, str2));
    }
}
