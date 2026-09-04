package com.taobao.accs.net;

import android.content.Intent;
import anet.channel.ISessionListener;
import com.taobao.accs.base.AccsConnectStateListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import java.util.Iterator;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class m implements ISessionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f98348a;

    m(k kVar) {
        this.f98348a = kVar;
    }

    @Override // anet.channel.ISessionListener
    public void onConnectionChanged(Intent intent) {
        if (intent != null) {
            boolean booleanExtra = intent.getBooleanExtra(Constants.KEY_CONNECT_AVAILABLE, false);
            String stringExtra = intent.getStringExtra("host");
            ALog.e(this.f98348a.d(), "onConnectionChanged", "currentHost", "https://" + this.f98348a.f98305i.getInappHost(), "changeHost", stringExtra, "state", Boolean.valueOf(booleanExtra));
            if (("https://" + this.f98348a.f98305i.getInappHost()).equals(stringExtra)) {
                g.a(GlobalClientInfo.getContext()).a();
                int intExtra = intent.getIntExtra(Constants.KEY_ERROR_CODE, -1);
                String stringExtra2 = intent.getStringExtra(Constants.KEY_ERROR_DETAIL);
                boolean booleanExtra2 = intent.getBooleanExtra(Constants.KEY_TYPE_INAPP, false);
                boolean booleanExtra3 = intent.getBooleanExtra(Constants.KEY_CENTER_HOST, false);
                TaoBaseService.ConnectInfo connectInfo = booleanExtra ? new TaoBaseService.ConnectInfo(stringExtra, booleanExtra2, booleanExtra3) : new TaoBaseService.ConnectInfo(stringExtra, booleanExtra2, booleanExtra3, intExtra, stringExtra2);
                connectInfo.connected = booleanExtra;
                Iterator<AccsConnectStateListener> it = this.f98348a.n().iterator();
                while (it.hasNext()) {
                    this.f98348a.f98338r.post(new n(this, connectInfo, it.next()));
                }
            }
        }
    }
}
