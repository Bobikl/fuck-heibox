package com.taobao.agoo;

import android.content.Intent;
import com.taobao.accs.utl.ALog;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class b implements BaseNotifyClickActivity.INotifyListener {
    @Override // com.taobao.agoo.BaseNotifyClickActivity.INotifyListener
    public String getMsgSource() {
        return "huawei";
    }

    @Override // com.taobao.agoo.BaseNotifyClickActivity.INotifyListener
    public String parseMsgFromIntent(Intent intent) {
        if (intent == null) {
            ALog.e("DefaultHuaweiMsgParseImpl", "parseMsgFromIntent null", new Object[0]);
            return null;
        }
        try {
            return intent.getStringExtra("extras");
        } catch (Throwable th2) {
            ALog.e("DefaultHuaweiMsgParseImpl", "parseMsgFromIntent", th2, new Object[0]);
            return null;
        }
    }
}
