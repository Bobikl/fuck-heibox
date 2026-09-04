package com.taobao.agoo;

import android.content.Intent;
import com.taobao.accs.utl.ALog;
import org.android.agoo.common.AgooConstants;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class d implements BaseNotifyClickActivity.INotifyListener {
    @Override // com.taobao.agoo.BaseNotifyClickActivity.INotifyListener
    public String getMsgSource() {
        return "oppo";
    }

    @Override // com.taobao.agoo.BaseNotifyClickActivity.INotifyListener
    public String parseMsgFromIntent(Intent intent) {
        String stringExtra = null;
        if (intent == null) {
            ALog.e("DefaultOppoMsgParseImpl", "parseMsgFromIntent null", new Object[0]);
            return null;
        }
        try {
            stringExtra = intent.getStringExtra(AgooConstants.MESSAGE_OPPO_PAYLOAD);
            ALog.i("DefaultOppoMsgParseImpl", "parseMsgFromIntent", "msg", stringExtra);
            return stringExtra;
        } catch (Throwable th2) {
            ALog.e("DefaultOppoMsgParseImpl", "parseMsgFromIntent", th2, new Object[0]);
            return stringExtra;
        }
    }
}
