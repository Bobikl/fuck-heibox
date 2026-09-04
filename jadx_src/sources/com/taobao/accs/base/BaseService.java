package com.taobao.accs.base;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.internal.ServiceImpl;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.v;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class BaseService extends Service {
    private static final String TAG = "BaseService";
    private static boolean isBinded = false;
    IBaseService mBaseService = null;
    private Messenger messenger = new Messenger(new Handler() { // from class: com.taobao.accs.base.BaseService.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message != null) {
                ALog.i(BaseService.TAG, "handleMessage on receive msg", "msg", message.toString());
                Intent intent = (Intent) message.getData().getParcelable(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                if (intent != null) {
                    ALog.i(BaseService.TAG, "handleMessage get intent success", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, intent.toString());
                    BaseService.this.onStartCommand(intent, 0, 0);
                }
            }
        }
    });

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        ALog.d(TAG, "onBind", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, intent);
        try {
            if (v.a(this) && !isBinded) {
                isBinded = true;
                ALog.i(TAG, "onBind bind service", new Object[0]);
                getApplicationContext().bindService(new Intent(this, getClass()), new ServiceConnection() { // from class: com.taobao.accs.base.BaseService.4
                    @Override // android.content.ServiceConnection
                    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    }

                    @Override // android.content.ServiceConnection
                    public void onServiceDisconnected(ComponentName componentName) {
                    }
                }, 1);
            }
        } catch (Throwable th2) {
            ALog.i(TAG, "onBind bind service with exception", th2.toString());
        }
        return this.messenger.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        ThreadPoolExecutorFactory.execute(new Runnable() { // from class: com.taobao.accs.base.BaseService.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    BaseService.this.mBaseService = new ServiceImpl(BaseService.this);
                    BaseService.this.mBaseService.onCreate();
                } catch (Exception e10) {
                    ALog.e(BaseService.TAG, "create ServiceImpl error", e10.getMessage());
                }
            }
        });
    }

    @Override // android.app.Service
    public void onDestroy() {
        ThreadPoolExecutorFactory.execute(new Runnable() { // from class: com.taobao.accs.base.BaseService.5
            @Override // java.lang.Runnable
            public void run() {
                IBaseService iBaseService = BaseService.this.mBaseService;
                if (iBaseService != null) {
                    iBaseService.onDestroy();
                    BaseService.this.mBaseService = null;
                }
            }
        });
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(final Intent intent, final int i10, final int i11) {
        ThreadPoolExecutorFactory.execute(new Runnable() { // from class: com.taobao.accs.base.BaseService.3
            @Override // java.lang.Runnable
            public void run() {
                BaseService baseService = BaseService.this;
                IBaseService iBaseService = baseService.mBaseService;
                if (iBaseService != null) {
                    iBaseService.onStartCommand(intent, i10, i11);
                } else {
                    baseService.onCreate();
                    BaseService.this.onStartCommand(intent, i10, i11);
                }
            }
        });
        return 2;
    }
}
