package org.android.agoo.control;

import android.text.TextUtils;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import java.util.HashMap;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.Config;
import org.json.JSONObject;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes5.dex */
public class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f132843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f132844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f132845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f132846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ NotifManager f132847e;

    l(NotifManager notifManager, String str, String str2, String str3, boolean z10) {
        this.f132847e = notifManager;
        this.f132843a = str;
        this.f132844b = str2;
        this.f132845c = str3;
        this.f132846d = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            HashMap map = new HashMap();
            map.put("thirdTokenType", this.f132843a);
            map.put("token", this.f132844b);
            map.put("appkey", Config.a(this.f132847e.mContext));
            map.put("utdid", com.taobao.accs.utl.j.b(this.f132847e.mContext));
            if (!TextUtils.isEmpty(this.f132845c)) {
                map.put("vendorSdkVersion", this.f132845c);
            }
            ALog.d("NotifManager", "report,utdid=" + com.taobao.accs.utl.j.b(this.f132847e.mContext) + ",regId=" + this.f132844b + ",type=" + this.f132843a, new Object[0]);
            ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, "agooTokenReport", new JSONObject(map).toString().getBytes("UTF-8"), null, null, null, null);
            com.taobao.accs.b accsInstance = ACCSManager.getAccsInstance(this.f132847e.mContext, Config.a(this.f132847e.mContext), Config.c(this.f132847e.mContext));
            String strA = this.f132846d ? accsInstance.a(this.f132847e.mContext, accsRequest) : accsInstance.a(this.f132847e.mContext, accsRequest, new TaoBaseService.ExtraInfo());
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.i("NotifManager", "reportThirdPushToken,dataId=" + strA + ",regId=" + this.f132844b + ",type=" + this.f132843a, new Object[0]);
            }
        } catch (Throwable th2) {
            UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "reportThirdPushToken", com.taobao.accs.utl.j.b(this.f132847e.mContext), th2.toString());
            if (ALog.isPrintLog(ALog.Level.E)) {
                ALog.e("NotifManager", "[report] is error", th2, new Object[0]);
            }
        }
    }
}
