package anet.channel;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import anet.channel.util.ALog;
import com.huawei.hms.support.api.entity.core.CommonCode;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class h implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f29718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f29719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ SessionRequest f29720c;

    h(SessionRequest sessionRequest, Intent intent, Context context) {
        this.f29720c = sessionRequest;
        this.f29718a = intent;
        this.f29719b = context;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ALog.d("awcn.SessionRequest", "onServiceConnected", null, new Object[0]);
        try {
            try {
                Messenger messenger = new Messenger(iBinder);
                Message message = new Message();
                message.getData().putParcelable(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, this.f29718a);
                messenger.send(message);
            } catch (Exception e10) {
                ALog.e("awcn.SessionRequest", "onServiceConnected sendMessage error.", null, e10, new Object[0]);
            }
        } finally {
            this.f29719b.unbindService(this);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        ALog.d("awcn.SessionRequest", "onServiceDisconnected", null, new Object[0]);
        this.f29719b.unbindService(this);
    }
}
