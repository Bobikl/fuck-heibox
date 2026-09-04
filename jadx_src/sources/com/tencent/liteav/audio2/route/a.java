package com.tencent.liteav.audio2.route;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.system.LiteavSystemInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f99550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0958a f99551b;

    /* JADX INFO: renamed from: com.tencent.liteav.audio2.route.a$a, reason: collision with other inner class name */
    public interface InterfaceC0958a {
        void onBluetoothConnectionChanged(boolean z10);

        void onBluetoothScoConnected(boolean z10);

        void onSystemVolumeChanged();

        void onUsbConnectionChanged(String str, boolean z10);

        void onWiredHeadsetConnectionChanged(boolean z10);
    }

    public a(Context context, InterfaceC0958a interfaceC0958a) {
        this.f99550a = context;
        this.f99551b = interfaceC0958a;
    }

    private static int a(Intent intent, String str, int i10) {
        try {
            return intent.getIntExtra(str, i10);
        } catch (Exception e10) {
            Log.e("AudioEventBroadcastReceiver", "getIntentIntExtra ".concat(String.valueOf(e10)), new Object[0]);
            return i10;
        }
    }

    private static String a(int i10) {
        switch (i10) {
            case 10:
                return "STATE_OFF";
            case 11:
                return "STATE_TURNING_ON";
            case 12:
                return "STATE_ON";
            case 13:
                return "STATE_TURNING_OFF";
            default:
                return "unknown";
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        if (intent == null || context == null) {
            Log.e("AudioEventBroadcastReceiver", "Receive intent or context is null", new Object[0]);
            return;
        }
        String action = intent.getAction();
        if (action == null) {
        }
        switch (action) {
            case "android.hardware.usb.action.USB_DEVICE_ATTACHED":
            case "android.hardware.usb.action.USB_DEVICE_DETACHED":
                UsbDevice usbDevice = (UsbDevice) intent.getParcelableExtra("device");
                if (usbDevice != null) {
                    if (LiteavSystemInfo.getSystemOSVersionInt() >= 21) {
                        Log.i("AudioEventBroadcastReceiver", "Usb device attached " + usbDevice.getProductName() + " manufacture " + usbDevice.getManufacturerName(), new Object[0]);
                    }
                    if (!AudioDeviceProperty.isUsbHeadsetDevice(usbDevice)) {
                        Log.i("AudioEventBroadcastReceiver", "The attached usb device doesn't seem to support audio, ignore it", new Object[0]);
                    } else if ("android.hardware.usb.action.USB_DEVICE_ATTACHED".equals(intent.getAction())) {
                        this.f99551b.onUsbConnectionChanged(usbDevice.getProductName(), true);
                    } else if (!"android.hardware.usb.action.USB_DEVICE_DETACHED".equals(intent.getAction())) {
                        Log.i("AudioEventBroadcastReceiver", "Unknown action, ignore it " + intent.getAction(), new Object[0]);
                    } else {
                        this.f99551b.onUsbConnectionChanged(usbDevice.getProductName(), false);
                    }
                    break;
                }
                break;
            case "android.media.VOLUME_CHANGED_ACTION":
                InterfaceC0958a interfaceC0958a = this.f99551b;
                if (interfaceC0958a != null) {
                    interfaceC0958a.onSystemVolumeChanged();
                    break;
                }
                break;
            case "android.intent.action.HEADSET_PLUG":
                int iA = a(intent, "state", -1);
                Log.i("AudioEventBroadcastReceiver", "Receive ACTION_HEADSET_PLUG, EXTRA_STATE:".concat(String.valueOf(iA)), new Object[0]);
                if (iA == -1) {
                    Log.e("AudioEventBroadcastReceiver", "Unknown headset state, ignore...", new Object[0]);
                    break;
                } else {
                    this.f99551b.onWiredHeadsetConnectionChanged(iA != 0);
                    break;
                }
                break;
            case "android.bluetooth.adapter.action.STATE_CHANGED":
                int iA2 = a(intent, "android.bluetooth.adapter.extra.STATE", 0);
                Log.i("AudioEventBroadcastReceiver", "Receive ACTION_STATE_CHANGED, EXTRA_STATE:" + a(iA2) + " EXTRA_PREVIOUS_STATE: " + a(a(intent, "android.bluetooth.adapter.extra.PREVIOUS_STATE", 0)), new Object[0]);
                if (iA2 == 10) {
                    this.f99551b.onBluetoothConnectionChanged(false);
                    break;
                }
                break;
            case "android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED":
                int iA3 = a(intent, "android.bluetooth.profile.extra.STATE", 10);
                if (iA3 == 12) {
                    Log.i("AudioEventBroadcastReceiver", "Receive bluetooth audio state changed to STATE_AUDIO_CONNECTED", new Object[0]);
                    this.f99551b.onBluetoothScoConnected(true);
                    break;
                } else {
                    if (iA3 == 10) {
                        Log.i("AudioEventBroadcastReceiver", "Receive bluetooth audio state changed to STATE_AUDIO_DISCONNECTED", new Object[0]);
                        this.f99551b.onBluetoothScoConnected(false);
                    }
                    break;
                }
                break;
            case "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED":
                int iA4 = a(intent, "android.bluetooth.profile.extra.STATE", -1);
                Object[] objArr = new Object[1];
                if (iA4 == 0) {
                    str = "STATE_DISCONNECTED";
                } else if (iA4 == 1) {
                    str = "STATE_CONNECTING";
                } else if (iA4 != 2) {
                    str = iA4 != 3 ? "unknown" : "STATE_DISCONNECTING";
                } else {
                    str = "STATE_CONNECTED";
                }
                objArr[0] = str;
                Log.i("AudioEventBroadcastReceiver", "Receive bluetooth headset connection state changed: %s", objArr);
                if (iA4 == 0) {
                    this.f99551b.onBluetoothConnectionChanged(false);
                    break;
                } else if (iA4 == 2) {
                    this.f99551b.onBluetoothConnectionChanged(true);
                    break;
                }
                break;
            default:
                Log.w("AudioEventBroadcastReceiver", "Ignore unknown Action:".concat(action), new Object[0]);
                break;
        }
    }
}
