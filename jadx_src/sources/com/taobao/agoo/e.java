package com.taobao.agoo;

import android.content.Intent;
import com.taobao.accs.utl.ALog;
import org.android.agoo.common.AgooConstants;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class e implements BaseNotifyClickActivity.INotifyListener {
    @Override // com.taobao.agoo.BaseNotifyClickActivity.INotifyListener
    public String getMsgSource() {
        return "vivo";
    }

    @Override // com.taobao.agoo.BaseNotifyClickActivity.INotifyListener
    public String parseMsgFromIntent(Intent intent) {
        String stringExtra = null;
        if (intent == null) {
            ALog.e("DefaultVivoMsgParseImpl", "parseMsgFromIntent null", new Object[0]);
            return null;
        }
        try {
            stringExtra = intent.getStringExtra(AgooConstants.MESSAGE_VIVO_PAYLOAD);
            ALog.i("DefaultVivoMsgParseImpl", "parseMsgFromIntent", "msg", stringExtra);
            return stringExtra;
        } catch (Throwable th2) {
            ALog.e("DefaultVivoMsgParseImpl", "parseMsgFromIntent", th2, new Object[0]);
            return stringExtra;
        }
    }
}
