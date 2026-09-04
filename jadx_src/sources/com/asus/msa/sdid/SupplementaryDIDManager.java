package com.asus.msa.sdid;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.Keep;
import com.asus.msa.SupplementaryDID.IDidAidlInterface;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class SupplementaryDIDManager {
    public static boolean DEBUG = false;
    public static final String TAG = "SupplementaryDIDManager";
    public Context mContext;
    public IDidAidlInterface mDidService;
    public IDIDBinderStatusListener mListener;
    public boolean isBinded = false;
    public ServiceConnection mServiceConnection = new ServiceConnection() { // from class: com.asus.msa.sdid.SupplementaryDIDManager.1
        @Override // android.content.ServiceConnection
        public native void onServiceConnected(ComponentName componentName, IBinder iBinder);

        @Override // android.content.ServiceConnection
        public native void onServiceDisconnected(ComponentName componentName);
    };

    public SupplementaryDIDManager(Context context) {
        this.mContext = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void notifyAllListeners(boolean z10);

    public native void deInit();

    public native void init(IDIDBinderStatusListener iDIDBinderStatusListener);

    public native void showLog(boolean z10);
}
