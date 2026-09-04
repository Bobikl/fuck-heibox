package org.android.agoo.xiaomi;

import android.content.Intent;
import com.taobao.accs.utl.ALog;
import com.taobao.agoo.BaseNotifyClickActivity;
import com.xiaomi.mipush.sdk.MiPushMessage;
import com.xiaomi.mipush.sdk.PushMessageHelper;

/* JADX INFO: loaded from: classes5.dex */
public class MiMsgParseImpl implements BaseNotifyClickActivity.INotifyListener {
    @Override // com.taobao.agoo.BaseNotifyClickActivity.INotifyListener
    public String getMsgSource() {
        return "xiaomi";
    }

    @Override // com.taobao.agoo.BaseNotifyClickActivity.INotifyListener
    public String parseMsgFromIntent(Intent intent) {
        String content;
        try {
            MiPushMessage miPushMessage = (MiPushMessage) intent.getSerializableExtra(PushMessageHelper.KEY_MESSAGE);
            content = miPushMessage != null ? miPushMessage.getContent() : null;
        } catch (Throwable unused) {
        }
        ALog.i(MiPushRegistar.TAG, "parseMsgFromIntent", "msg", content);
        return content;
    }

    public String toString() {
        return "INotifyListener: " + getMsgSource();
    }
}
