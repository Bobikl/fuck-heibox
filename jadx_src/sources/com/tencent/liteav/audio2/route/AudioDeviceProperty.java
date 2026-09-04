package com.tencent.liteav.audio2.route;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::audio")
public class AudioDeviceProperty implements a.InterfaceC0958a {
    private static final String TAG = "AudioDeviceProperty";
    private AudioDeviceCallback mAudioDeviceCallback;
    private boolean mAudioDeviceCallbackAvailable = false;
    private a mAudioEventBroadcastReceiver;
    private final AudioManager mAudioManager;
    private b mBluetoothHeadsetListener;
    private final Context mContext;
    private long mNativeAudioDeviceProperty;

    public static class UsbAudioDeviceInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f99548a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f99549b = "";

        public String getName() {
            return this.f99548a;
        }

        public String getVidPid() {
            return this.f99549b;
        }
    }

    public AudioDeviceProperty(long j10) {
        this.mNativeAudioDeviceProperty = j10;
        Context applicationContext = ContextUtils.getApplicationContext();
        this.mContext = applicationContext;
        this.mAudioManager = (AudioManager) applicationContext.getSystemService("audio");
    }

    private void buildAudioDeviceCallback() {
        if (this.mAudioDeviceCallback != null) {
            return;
        }
        this.mAudioDeviceCallback = new AudioDeviceCallback() { // from class: com.tencent.liteav.audio2.route.AudioDeviceProperty.1
            @Override // android.media.AudioDeviceCallback
            public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                if (audioDeviceInfoArr.length == 0) {
                    return;
                }
                AudioDeviceProperty.this.mAudioDeviceCallbackAvailable = true;
                for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                    Log.i(AudioDeviceProperty.TAG, "added device type is " + audioDeviceInfo.getType() + " sink: " + audioDeviceInfo.isSink() + " product name: " + ((Object) audioDeviceInfo.getProductName()), new Object[0]);
                    if (audioDeviceInfo.getType() == 8 && LiteavSystemInfo.getSystemOSVersionInt() > 30) {
                        AudioDeviceProperty.nativeNotifyBluetoothConnectionChangedFromJava(AudioDeviceProperty.this.mNativeAudioDeviceProperty, true);
                    } else if (audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 12 || audioDeviceInfo.getType() == 22) {
                        AudioDeviceProperty.nativeNotifyUsbConnectionChangedFromJava(AudioDeviceProperty.this.mNativeAudioDeviceProperty, audioDeviceInfo.getProductName().toString(), AudioDeviceProperty.this.isUsbHeadsetAvailable());
                    } else if (audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 4) {
                        AudioDeviceProperty.nativeNotifyWiredHeadsetConnectionChangedFromJava(AudioDeviceProperty.this.mNativeAudioDeviceProperty, true);
                    }
                }
            }

            @Override // android.media.AudioDeviceCallback
            public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                if (audioDeviceInfoArr.length == 0) {
                    return;
                }
                for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                    Log.i(AudioDeviceProperty.TAG, "removed device type is " + audioDeviceInfo.getType() + " sink: " + audioDeviceInfo.isSink() + " product name: " + ((Object) audioDeviceInfo.getProductName()), new Object[0]);
                    if (audioDeviceInfo.getType() == 8 && LiteavSystemInfo.getSystemOSVersionInt() > 30) {
                        AudioDeviceProperty.nativeNotifyBluetoothConnectionChangedFromJava(AudioDeviceProperty.this.mNativeAudioDeviceProperty, false);
                    } else if (audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 12 || audioDeviceInfo.getType() == 22) {
                        AudioDeviceProperty.nativeNotifyUsbConnectionChangedFromJava(AudioDeviceProperty.this.mNativeAudioDeviceProperty, audioDeviceInfo.getProductName().toString(), AudioDeviceProperty.this.isUsbHeadsetAvailable());
                    } else if (audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 4) {
                        AudioDeviceProperty.nativeNotifyWiredHeadsetConnectionChangedFromJava(AudioDeviceProperty.this.mNativeAudioDeviceProperty, false);
                    }
                }
            }
        };
    }

    public static boolean isUsbHeadsetDevice(UsbDevice usbDevice) {
        if (usbDevice == null) {
            return false;
        }
        for (int i10 = 0; i10 < usbDevice.getInterfaceCount(); i10++) {
            try {
                if (usbDevice.getInterface(i10).getInterfaceClass() == 1) {
                    return true;
                }
            } catch (Throwable th2) {
                Log.e(TAG, "Get interface exception " + th2.getMessage(), new Object[0]);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeNotifyBluetoothConnectionChangedFromJava(long j10, boolean z10);

    private static native void nativeNotifyBluetoothScoConnectedFromJava(long j10, boolean z10);

    private static native void nativeNotifySystemVolumeChangedFromJava(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeNotifyUsbConnectionChangedFromJava(long j10, String str, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeNotifyWiredHeadsetConnectionChangedFromJava(long j10, boolean z10);

    private void registerAudioDeviceCallback() {
        if (LiteavSystemInfo.getSystemOSVersionInt() < 23) {
            return;
        }
        if (this.mAudioDeviceCallback == null) {
            buildAudioDeviceCallback();
        }
        AudioDeviceCallback audioDeviceCallback = this.mAudioDeviceCallback;
        if (audioDeviceCallback == null) {
            return;
        }
        try {
            this.mAudioManager.registerAudioDeviceCallback(audioDeviceCallback, null);
            Log.i(TAG, "register audio device callback", new Object[0]);
        } catch (Throwable th2) {
            Log.e(TAG, "registerAudioDeviceCallback exception " + th2.getMessage(), new Object[0]);
        }
    }

    private void unregisterAudioDeviceCallback() {
        AudioDeviceCallback audioDeviceCallback;
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 23 && (audioDeviceCallback = this.mAudioDeviceCallback) != null) {
            try {
                this.mAudioManager.unregisterAudioDeviceCallback(audioDeviceCallback);
                Log.i(TAG, "unregister audio device callback", new Object[0]);
            } catch (Throwable th2) {
                Log.e(TAG, "unregisterAudioDeviceCallback exception " + th2.getMessage(), new Object[0]);
            }
        }
    }

    public UsbAudioDeviceInfo GetUsbAudioDeviceInfo(String str) {
        UsbAudioDeviceInfo usbAudioDeviceInfo = new UsbAudioDeviceInfo();
        try {
            UsbManager usbManager = (UsbManager) this.mContext.getSystemService("usb");
            if (usbManager != null && LiteavSystemInfo.getSystemOSVersionInt() >= 21) {
                for (UsbDevice usbDevice : usbManager.getDeviceList().values()) {
                    if (str.contains(usbDevice.getProductName()) || isUsbHeadsetDevice(usbDevice)) {
                        usbAudioDeviceInfo.f99548a = usbDevice.getProductName();
                        usbAudioDeviceInfo.f99549b = String.valueOf(usbDevice.getVendorId()) + usbDevice.getProductId();
                    }
                }
                return usbAudioDeviceInfo;
            }
            return usbAudioDeviceInfo;
        } catch (Throwable th2) {
            Log.i(TAG, "getDeviceList exception " + th2.getMessage(), new Object[0]);
        }
    }

    public boolean checkBluetoothPermission() {
        return b.a(this.mContext);
    }

    public int getMode() {
        try {
            return this.mAudioManager.getMode();
        } catch (Throwable th2) {
            Log.i(TAG, "Get mode exception " + th2.getMessage(), new Object[0]);
            return 0;
        }
    }

    public int getSystemVolume() {
        try {
            int i10 = this.mAudioManager.getMode() == 0 ? 3 : 0;
            int streamMaxVolume = this.mAudioManager.getStreamMaxVolume(i10);
            if (streamMaxVolume <= 0) {
                return -1;
            }
            return (int) ((this.mAudioManager.getStreamVolume(i10) / streamMaxVolume) * 100.0f);
        } catch (Throwable th2) {
            Log.e(TAG, "getStreamVolume exception " + th2.getMessage(), new Object[0]);
            return -1;
        }
    }

    public boolean isBluetoothHeadsetConnected() {
        b bVar = this.mBluetoothHeadsetListener;
        if (bVar != null) {
            return bVar.a();
        }
        Log.e(TAG, "mBluetoothHeadsetListener is null", new Object[0]);
        return false;
    }

    public boolean isBluetoothScoConnected() {
        try {
            new IntentFilter();
            Intent intentRegisterReceiver = ContextUtils.getApplicationContext().registerReceiver(null, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
            return intentRegisterReceiver != null && intentRegisterReceiver.getIntExtra("android.media.extra.SCO_AUDIO_STATE", 0) == 1;
        } catch (Throwable th2) {
            Log.i(TAG, "isBluetoothScoConnected exception " + th2.getMessage(), new Object[0]);
            return false;
        }
    }

    public boolean isBluetoothScoOn() {
        try {
            return this.mAudioManager.isBluetoothScoOn();
        } catch (Throwable th2) {
            Log.i(TAG, "isBluetoothScoOn exception " + th2.getMessage(), new Object[0]);
            return false;
        }
    }

    public boolean isSpeakerphoneOn() {
        try {
            return this.mAudioManager.isSpeakerphoneOn();
        } catch (Throwable th2) {
            Log.i(TAG, "isSpeakerphoneOn exception " + th2.getMessage(), new Object[0]);
            return false;
        }
    }

    public boolean isUsbHeadsetAvailable() {
        try {
            UsbManager usbManager = (UsbManager) this.mContext.getSystemService("usb");
            if (usbManager == null) {
                return false;
            }
            Iterator<UsbDevice> it = usbManager.getDeviceList().values().iterator();
            while (it.hasNext()) {
                if (isUsbHeadsetDevice(it.next())) {
                    return true;
                }
            }
        } catch (Throwable th2) {
            Log.i(TAG, "getDeviceList exception " + th2.getMessage(), new Object[0]);
        }
        return false;
    }

    public boolean isWiredHeadsetOn() {
        try {
            return this.mAudioManager.isWiredHeadsetOn();
        } catch (Throwable th2) {
            Log.i(TAG, "isWiredHeadsetOn exception " + th2.getMessage(), new Object[0]);
            return false;
        }
    }

    @Override // com.tencent.liteav.audio2.route.a.InterfaceC0958a
    public void onBluetoothConnectionChanged(boolean z10) {
        nativeNotifyBluetoothConnectionChangedFromJava(this.mNativeAudioDeviceProperty, z10);
    }

    @Override // com.tencent.liteav.audio2.route.a.InterfaceC0958a
    public void onBluetoothScoConnected(boolean z10) {
        nativeNotifyBluetoothScoConnectedFromJava(this.mNativeAudioDeviceProperty, z10);
    }

    @Override // com.tencent.liteav.audio2.route.a.InterfaceC0958a
    public void onSystemVolumeChanged() {
        nativeNotifySystemVolumeChangedFromJava(this.mNativeAudioDeviceProperty);
    }

    @Override // com.tencent.liteav.audio2.route.a.InterfaceC0958a
    public void onUsbConnectionChanged(String str, boolean z10) {
        if (this.mAudioDeviceCallbackAvailable) {
            return;
        }
        nativeNotifyUsbConnectionChangedFromJava(this.mNativeAudioDeviceProperty, str, z10);
    }

    @Override // com.tencent.liteav.audio2.route.a.InterfaceC0958a
    public void onWiredHeadsetConnectionChanged(boolean z10) {
        if (this.mAudioDeviceCallbackAvailable) {
            return;
        }
        nativeNotifyWiredHeadsetConnectionChangedFromJava(this.mNativeAudioDeviceProperty, z10);
    }

    public void setBluetoothScoOn(boolean z10) {
        try {
            this.mAudioManager.setBluetoothScoOn(z10);
            Log.i(TAG, "setBluetoothScoOn ".concat(String.valueOf(z10)), new Object[0]);
        } catch (Throwable th2) {
            Log.i(TAG, "setBluetoothScoOn exception " + th2.getMessage(), new Object[0]);
        }
    }

    public void setSpeakerphoneOn(boolean z10) {
        try {
            this.mAudioManager.setSpeakerphoneOn(z10);
            Log.i(TAG, "setSpeakerphoneOn ".concat(String.valueOf(z10)), new Object[0]);
        } catch (Throwable th2) {
            Log.i(TAG, "setSpeakerphoneOn exception " + th2.getMessage(), new Object[0]);
        }
    }

    public void setVoip(boolean z10) {
        int i10 = z10 ? 3 : 0;
        try {
            this.mAudioManager.setMode(i10);
            Log.i(TAG, "setMode ".concat(String.valueOf(i10)), new Object[0]);
        } catch (Throwable th2) {
            Log.i(TAG, "Set mode exception " + th2.getMessage(), new Object[0]);
        }
    }

    public void setWiredHeadsetOn(boolean z10) {
        try {
            this.mAudioManager.setWiredHeadsetOn(z10);
            Log.i(TAG, "setWiredHeadsetOn ".concat(String.valueOf(z10)), new Object[0]);
        } catch (Throwable th2) {
            Log.i(TAG, "setWiredHeadsetOn exception " + th2.getMessage(), new Object[0]);
        }
    }

    public void start() {
        registerAudioDeviceCallback();
        a aVar = new a(this.mContext, this);
        this.mAudioEventBroadcastReceiver = aVar;
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
            intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            aVar.f99550a.registerReceiver(aVar, intentFilter);
        } catch (Throwable unused) {
            Log.e("AudioEventBroadcastReceiver", "register broadcast exception", new Object[0]);
        }
        this.mBluetoothHeadsetListener = new b(this.mContext);
    }

    public void startBluetoothSco() {
        try {
            this.mAudioManager.startBluetoothSco();
            Log.i(TAG, "startBluetoothSco", new Object[0]);
        } catch (Throwable th2) {
            Log.i(TAG, "startBluetoothSco exception " + th2.getMessage(), new Object[0]);
        }
    }

    public void stop() {
        Context context;
        a aVar = this.mAudioEventBroadcastReceiver;
        if (aVar != null && (context = aVar.f99550a) != null) {
            try {
                context.unregisterReceiver(aVar);
            } catch (Exception unused) {
            }
        }
        this.mAudioEventBroadcastReceiver = null;
        b bVar = this.mBluetoothHeadsetListener;
        if (bVar != null) {
            synchronized (bVar.f99554c) {
                if (bVar.f99552a != null && bVar.f99553b != null) {
                    bVar.b();
                    bVar.f99553b = null;
                }
            }
        }
        this.mBluetoothHeadsetListener = null;
        unregisterAudioDeviceCallback();
    }

    public void stopBluetoothSco() {
        try {
            this.mAudioManager.stopBluetoothSco();
            Log.i(TAG, "stopBluetoothSco", new Object[0]);
        } catch (Throwable th2) {
            Log.i(TAG, "stopBluetoothSco exception " + th2.getMessage(), new Object[0]);
        }
    }
}
