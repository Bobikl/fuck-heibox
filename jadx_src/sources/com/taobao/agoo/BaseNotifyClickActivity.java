package com.taobao.agoo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.taobao.accs.utl.ALog;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class BaseNotifyClickActivity extends Activity {
    private static final String TAG = "Naccs.BaseNotifyClickActivity";
    public static Set<INotifyListener> notifyListeners;
    private BaseNotifyClick baseNotifyClick = new BaseNotifyClick() { // from class: com.taobao.agoo.BaseNotifyClickActivity.1
        @Override // com.taobao.agoo.BaseNotifyClick
        public void onMessage(Intent intent) {
            BaseNotifyClickActivity.this.onMessage(intent);
        }
    };

    /* JADX INFO: compiled from: Taobao */
    public interface INotifyListener {
        String getMsgSource();

        String parseMsgFromIntent(Intent intent);
    }

    public static void addNotifyListener(INotifyListener iNotifyListener) {
        if (notifyListeners == null) {
            notifyListeners = new HashSet();
        }
        notifyListeners.add(iNotifyListener);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ALog.i(TAG, "onCreate", new Object[0]);
        this.baseNotifyClick.onCreate(this, getIntent());
    }

    public void onMessage(Intent intent) {
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        ALog.i(TAG, "onNewIntent", new Object[0]);
        this.baseNotifyClick.onNewIntent(intent);
    }
}
