package com.ss.bytertc.base.media.camera;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbDevice;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.RXLogging;

/* JADX INFO: loaded from: classes10.dex */
public class VideoDeviceMonitorAndroid {
    private static final String TAG = "VideoDeviceMonitorAndroid";
    private long mNativeHandle;
    private final BroadcastReceiver mUsbReceiver = new BroadcastReceiver() { // from class: com.ss.bytertc.base.media.camera.VideoDeviceMonitorAndroid.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            UsbDevice usbDevice = (UsbDevice) intent.getParcelableExtra("device");
            if ("android.hardware.usb.action.USB_DEVICE_ATTACHED".equals(action)) {
                VideoDeviceMonitorAndroid.this.processorAttached(usbDevice);
            } else if ("android.hardware.usb.action.USB_DEVICE_DETACHED".equals(action)) {
                VideoDeviceMonitorAndroid.this.processorDetached(usbDevice);
            }
        }
    };
    private final Context mContext = ContextUtils.getApplicationContext();

    @CalledByNative
    VideoDeviceMonitorAndroid(long j10) {
        this.mNativeHandle = j10;
    }

    private Boolean isUsbCamera(UsbDevice usbDevice) {
        RXLogging.w(TAG, "isUsbCamera");
        Boolean bool = Boolean.FALSE;
        if (usbDevice.getDeviceClass() == 14) {
            bool = Boolean.TRUE;
        } else if (usbDevice.getDeviceClass() == 239) {
            for (int i10 = 0; i10 < usbDevice.getInterfaceCount(); i10++) {
                if (usbDevice.getInterface(i10).getInterfaceClass() == 14) {
                    bool = Boolean.TRUE;
                    break;
                }
            }
        }
        RXLogging.w(TAG, "DeviceClass: " + usbDevice.getDeviceClass() + " result: " + bool);
        return bool;
    }

    private static native void nativeOnUsbCameraChanged(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public void processorAttached(UsbDevice usbDevice) {
        if (isUsbCamera(usbDevice).booleanValue()) {
            nativeOnUsbCameraChanged(this.mNativeHandle, true);
        } else {
            RXLogging.w(TAG, "processorAttached, is not Usb camera");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processorDetached(UsbDevice usbDevice) {
        if (isUsbCamera(usbDevice).booleanValue()) {
            nativeOnUsbCameraChanged(this.mNativeHandle, false);
        } else {
            RXLogging.w(TAG, "processorDetached, is not Usb camera");
        }
    }

    @CalledByNative
    public void registerUsbAction() {
        RXLogging.w(TAG, "registerUsbAction");
        if (this.mUsbReceiver == null || this.mContext == null) {
            RXLogging.w(TAG, "registerUsbAction fail");
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
        this.mContext.registerReceiver(this.mUsbReceiver, intentFilter);
    }

    @CalledByNative
    public void unregisterUsbAction() {
        Context context;
        RXLogging.w(TAG, "unregisterUsbAction");
        BroadcastReceiver broadcastReceiver = this.mUsbReceiver;
        if (broadcastReceiver == null || (context = this.mContext) == null) {
            RXLogging.w(TAG, "unregisterUsbAction fail");
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}
