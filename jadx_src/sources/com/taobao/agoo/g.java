package com.taobao.agoo;

import android.content.Context;
import android.text.TextUtils;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.IAgooAppReceiver;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.l;
import java.util.Map;
import org.android.agoo.common.Config;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class g implements IAgooAppReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f98555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f98556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ IRegister f98557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f98558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f98559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ com.taobao.accs.b f98560f;

    g(Context context, Context context2, IRegister iRegister, String str, String str2, com.taobao.accs.b bVar) {
        this.f98555a = context;
        this.f98556b = context2;
        this.f98557c = iRegister;
        this.f98558d = str;
        this.f98559e = str2;
        this.f98560f = bVar;
    }

    @Override // com.taobao.accs.IAppReceiver
    public Map<String, String> getAllServices() {
        return null;
    }

    @Override // com.taobao.accs.IAgooAppReceiver
    public String getAppkey() {
        return this.f98558d;
    }

    @Override // com.taobao.accs.IAppReceiver
    public String getService(String str) {
        return null;
    }

    @Override // com.taobao.accs.IAppReceiver
    public void onBindApp(int i10) {
    }

    @Override // com.taobao.accs.IAppReceiverV1
    public void onBindApp(int i10, String str) {
        try {
            ALog.i("TaobaoRegister", "onBindApp", Constants.KEY_ERROR_CODE, Integer.valueOf(i10));
            if (i10 != 200) {
                IRegister iRegister = this.f98557c;
                if (iRegister != null) {
                    iRegister.onFailure(String.valueOf(i10), "accs bindapp error!");
                    return;
                }
                return;
            }
            if (TaobaoRegister.mRequestListener == null) {
                com.taobao.agoo.a.b unused = TaobaoRegister.mRequestListener = new com.taobao.agoo.a.b(this.f98555a);
            }
            GlobalClientInfo.getInstance(this.f98556b).registerListener("AgooDeviceCmd", TaobaoRegister.mRequestListener);
            if (com.taobao.agoo.a.b.f98553b.b(this.f98555a.getPackageName()) && !UtilityImpl.b(Constants.SP_CHANNEL_FILE_NAME, this.f98556b)) {
                String strG = Config.g(this.f98555a);
                if (!TextUtils.isEmpty(strG)) {
                    boolean unused2 = TaobaoRegister.isRegisterSuccess = true;
                    l.a().b();
                    ALog.i("TaobaoRegister", "agoo already Registered return ", new Object[0]);
                    IRegister iRegister2 = this.f98557c;
                    if (iRegister2 != null) {
                        iRegister2.onSuccess(strG);
                        return;
                    }
                    return;
                }
            }
            byte[] bArrA = com.taobao.agoo.a.a.c.a(this.f98555a, this.f98558d, this.f98559e);
            if (bArrA == null) {
                IRegister iRegister3 = this.f98557c;
                if (iRegister3 != null) {
                    iRegister3.onFailure("503.1", "req data null");
                    return;
                }
                return;
            }
            String strB = this.f98560f.b(this.f98555a, new ACCSManager.AccsRequest(null, "AgooDeviceCmd", bArrA, null));
            if (!TextUtils.isEmpty(strB)) {
                if (this.f98557c != null) {
                    TaobaoRegister.mRequestListener.f98554a.put(strB, this.f98557c);
                }
            } else {
                IRegister iRegister4 = this.f98557c;
                if (iRegister4 != null) {
                    iRegister4.onFailure("503.1", "accs channel disabled!");
                }
            }
        } catch (Throwable th2) {
            ALog.e("TaobaoRegister", "register onBindApp", th2, new Object[0]);
        }
    }

    @Override // com.taobao.accs.IAppReceiver
    public void onBindUser(String str, int i10) {
    }

    @Override // com.taobao.accs.IAppReceiver
    public void onData(String str, String str2, byte[] bArr) {
    }

    @Override // com.taobao.accs.IAppReceiver
    public void onSendData(String str, int i10) {
    }

    @Override // com.taobao.accs.IAppReceiver
    public void onUnbindApp(int i10) {
    }

    @Override // com.taobao.accs.IAppReceiver
    public void onUnbindUser(int i10) {
    }
}
