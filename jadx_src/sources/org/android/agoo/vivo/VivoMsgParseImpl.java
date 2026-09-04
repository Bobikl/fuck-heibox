package org.android.agoo.vivo;

import android.content.Intent;
import com.taobao.accs.utl.ALog;
import com.taobao.agoo.BaseNotifyClickActivity;
import org.android.agoo.common.AgooConstants;

/* JADX INFO: loaded from: classes5.dex */
public class VivoMsgParseImpl implements BaseNotifyClickActivity.INotifyListener {
    public static final String TAG = "VivoMsgParseImpl";

    @Override // com.taobao.agoo.BaseNotifyClickActivity.INotifyListener
    public String getMsgSource() {
        return "vivo";
    }

    @Override // com.taobao.agoo.BaseNotifyClickActivity.INotifyListener
    public String parseMsgFromIntent(Intent intent) {
        String stringExtra = null;
        if (intent == null) {
            ALog.e(TAG, "parseMsgFromIntent null", new Object[0]);
            return null;
        }
        try {
            stringExtra = intent.getStringExtra(AgooConstants.MESSAGE_VIVO_PAYLOAD);
            ALog.i(TAG, "parseMsgFromIntent", "msg", stringExtra);
            return stringExtra;
        } catch (Throwable th2) {
            ALog.e(TAG, "parseMsgFromIntent", th2, new Object[0]);
            return stringExtra;
        }
    }
}
