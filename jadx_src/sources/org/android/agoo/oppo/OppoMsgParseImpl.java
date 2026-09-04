package org.android.agoo.oppo;

import android.content.Intent;
import com.taobao.accs.utl.ALog;
import com.taobao.agoo.BaseNotifyClickActivity;
import org.android.agoo.common.AgooConstants;

/* JADX INFO: loaded from: classes5.dex */
public class OppoMsgParseImpl implements BaseNotifyClickActivity.INotifyListener {
    public static final String TAG = "OppoMsgParseImpl";

    @Override // com.taobao.agoo.BaseNotifyClickActivity.INotifyListener
    public String getMsgSource() {
        return "oppo";
    }

    @Override // com.taobao.agoo.BaseNotifyClickActivity.INotifyListener
    public String parseMsgFromIntent(Intent intent) {
        String stringExtra = null;
        if (intent == null) {
            ALog.e(TAG, "parseMsgFromIntent null", new Object[0]);
            return null;
        }
        try {
            stringExtra = intent.getStringExtra(AgooConstants.MESSAGE_OPPO_PAYLOAD);
            ALog.i(TAG, "parseMsgFromIntent", "msg", stringExtra);
            return stringExtra;
        } catch (Throwable th2) {
            ALog.e(TAG, "parseMsgFromIntent", th2, new Object[0]);
            return stringExtra;
        }
    }
}
