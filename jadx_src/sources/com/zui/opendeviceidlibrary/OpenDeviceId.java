package com.zui.opendeviceidlibrary;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.zui.deviceidservice.IDeviceidInterface;

/* JADX INFO: loaded from: classes4.dex */
public class OpenDeviceId {
    private static boolean DBG = false;
    private static String TAG = "OpenDeviceId library";
    private ServiceConnection mConnection;
    private IDeviceidInterface mDeviceidInterface;
    private Context mContext = null;
    private CallBack mCallerCallBack = null;

    public interface CallBack<T> {
        void serviceConnected(T t10, OpenDeviceId openDeviceId);
    }

    private native void logPrintE(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native void logPrintI(String str);

    public native String getAAID();

    public native String getOAID();

    public native String getUDID();

    public native String getVAID();

    public int init(Context context, CallBack<String> callBack) {
        if (context == null) {
            throw new NullPointerException("Context can not be null.");
        }
        this.mContext = context;
        this.mCallerCallBack = callBack;
        this.mConnection = new ServiceConnection() { // from class: com.zui.opendeviceidlibrary.OpenDeviceId.1
            @Override // android.content.ServiceConnection
            public native synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder);

            @Override // android.content.ServiceConnection
            public native void onServiceDisconnected(ComponentName componentName);
        };
        Intent intent = new Intent();
        intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
        if (this.mContext.bindService(intent, this.mConnection, 1)) {
            logPrintI("bindService Successful!");
            return 1;
        }
        logPrintI("bindService Failed!");
        return -1;
    }

    public native boolean isSupported();

    public native void setLogEnable(boolean z10);

    public native void shutdown();
}
