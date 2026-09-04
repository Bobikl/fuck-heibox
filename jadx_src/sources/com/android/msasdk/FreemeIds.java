package com.android.msasdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.android.creator.IdsSupplier;

/* JADX INFO: loaded from: classes6.dex */
public class FreemeIds implements FreemeIdsSupplier {
    private static final String KEY_REMOTE_SERVICE_PACKAGE = "msa.service.package";
    private static String PKG_NAME_REMOTE_SERVICE = "com.android.creator";
    private static final String TAG = "FreemeIds";
    private Context context;
    private IConnect iConnect;
    private IdsSupplier idsSupplier;
    public ServiceConnection mServiceConnection = new ServiceConnection() { // from class: com.android.msasdk.FreemeIds.1
        @Override // android.content.ServiceConnection
        public native void onServiceConnected(ComponentName componentName, IBinder iBinder);

        @Override // android.content.ServiceConnection
        public native void onServiceDisconnected(ComponentName componentName);
    };

    public FreemeIds(Context context) {
        this.context = context;
    }

    @Override // com.android.msasdk.FreemeIdsSupplier
    public native void connect(IConnect iConnect);

    @Override // com.android.msasdk.FreemeIdsSupplier
    public native String getAAID(String str);

    @Override // com.android.msasdk.FreemeIdsSupplier
    public native String getOAID();

    @Override // com.android.msasdk.FreemeIdsSupplier
    public native String getUDID(String str);

    @Override // com.android.msasdk.FreemeIdsSupplier
    public native String getVAID(String str);

    @Override // com.android.msasdk.FreemeIdsSupplier
    public native boolean isSupported();

    @Override // com.android.msasdk.FreemeIdsSupplier
    public native void shutDown();
}
