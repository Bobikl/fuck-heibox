package com.tencent.liteav.audio2.route;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Process;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements BluetoothProfile.ServiceListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final BluetoothAdapter f99552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    BluetoothProfile f99553b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Object f99554c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f99555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AudioManager f99556e;

    public b(Context context) {
        this.f99555d = context;
        BluetoothAdapter bluetoothAdapterC = c();
        this.f99552a = bluetoothAdapterC;
        if (bluetoothAdapterC != null) {
            try {
                bluetoothAdapterC.getProfileProxy(context, this, 1);
            } catch (Throwable th2) {
                Log.w("BluetoothHeadsetListener", "Get profile proxy exception " + th2.getMessage(), new Object[0]);
            }
        } else {
            Log.i("BluetoothHeadsetListener", "Bluetooth adapter is null", new Object[0]);
        }
        this.f99556e = (AudioManager) this.f99555d.getSystemService("audio");
    }

    public static boolean a(Context context) {
        if (context == null || LiteavSystemInfo.getSystemOSVersionInt() < 31) {
            return true;
        }
        try {
            return context.checkPermission("android.permission.BLUETOOTH_CONNECT", Process.myPid(), Process.myUid()) == 0;
        } catch (Throwable th2) {
            Log.w("BluetoothHeadsetListener", "checkPermission exception " + th2.getMessage(), new Object[0]);
            return true;
        }
    }

    private static BluetoothAdapter c() {
        try {
            return BluetoothAdapter.getDefaultAdapter();
        } catch (Throwable th2) {
            Log.w("BluetoothHeadsetListener", "Get default adapter exception " + th2.getMessage(), new Object[0]);
            return null;
        }
    }

    private List<BluetoothDevice> d() {
        try {
            return this.f99553b.getConnectedDevices();
        } catch (Throwable th2) {
            Log.w("BluetoothHeadsetListener", "Get connected devices exception " + th2.getMessage(), new Object[0]);
            return null;
        }
    }

    private boolean e() {
        try {
            return this.f99552a.isEnabled();
        } catch (Throwable th2) {
            Log.w("BluetoothHeadsetListener", "Get bluetooth adapter status exception " + th2.getMessage(), new Object[0]);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005f A[Catch: all -> 0x0094, TryCatch #1 {all -> 0x0094, blocks: (B:20:0x0057, B:22:0x005f, B:24:0x006a, B:26:0x0074, B:29:0x007c, B:30:0x007f, B:32:0x0087, B:34:0x008d), top: B:49:0x0057, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[Catch: all -> 0x0094, TryCatch #1 {all -> 0x0094, blocks: (B:20:0x0057, B:22:0x005f, B:24:0x006a, B:26:0x0074, B:29:0x007c, B:30:0x007f, B:32:0x0087, B:34:0x008d), top: B:49:0x0057, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x007f A[Catch: all -> 0x0094, TryCatch #1 {all -> 0x0094, blocks: (B:20:0x0057, B:22:0x005f, B:24:0x006a, B:26:0x0074, B:29:0x007c, B:30:0x007f, B:32:0x0087, B:34:0x008d), top: B:49:0x0057, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ae A[EDGE_INSN: B:39:0x00ae->B:40:0x00af BREAK  A[LOOP:0: B:23:0x0068->B:29:0x007c]] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ae A[SYNTHETIC] */
    public final boolean a() {
        boolean z10;
        List<BluetoothDevice> listD;
        AudioDeviceInfo[] devices;
        int length;
        int i10;
        AudioDeviceInfo audioDeviceInfo;
        if (this.f99552a == null || !e()) {
            return false;
        }
        synchronized (this.f99554c) {
            if (this.f99553b != null) {
                z10 = true;
                if (LiteavSystemInfo.getSystemOSVersionInt() > 30) {
                    if (!a(this.f99555d)) {
                        z10 = false;
                        break;
                    }
                    z10 = false;
                    break;
                }
                devices = this.f99556e.getDevices(2);
                length = devices.length;
                i10 = 0;
                while (true) {
                    if (i10 < length) {
                        z10 = false;
                        break;
                    }
                    audioDeviceInfo = devices[i10];
                    if (audioDeviceInfo.getType() != 8) {
                        break;
                    }
                    i10++;
                }
            } else {
                try {
                    Log.i("BluetoothHeadsetListener", "mBluetoothHeadsetProfile is null ,wait for 1000ms", new Object[0]);
                    this.f99554c.wait(1000L);
                } catch (Throwable th2) {
                    Log.w("BluetoothHeadsetListener", "Wait exception " + th2.getMessage(), new Object[0]);
                }
                if (this.f99553b == null) {
                    Log.i("BluetoothHeadsetListener", "mBluetoothHeadsetProfile is still null", new Object[0]);
                } else {
                    Log.i("BluetoothHeadsetListener", "mBluetoothHeadsetProfile service is connected now", new Object[0]);
                }
                z10 = true;
                try {
                    if (LiteavSystemInfo.getSystemOSVersionInt() > 30) {
                        if (!a(this.f99555d) || (listD = d()) == null || listD.size() <= 0) {
                            z10 = false;
                            break;
                        }
                    } else {
                        devices = this.f99556e.getDevices(2);
                        length = devices.length;
                        i10 = 0;
                        while (true) {
                            if (i10 < length) {
                                z10 = false;
                                break;
                            }
                            audioDeviceInfo = devices[i10];
                            if (audioDeviceInfo.getType() != 8 || audioDeviceInfo.getType() == 7) {
                                break;
                                break;
                            }
                            i10++;
                        }
                    }
                } catch (Throwable th3) {
                    Log.e("BluetoothHeadsetListener", "get connected bluetooth devices failed." + th3.getMessage(), new Object[0]);
                }
            }
            throw th;
        }
        Log.i("BluetoothHeadsetListener", "find bluetooth device ".concat(String.valueOf(z10)), new Object[0]);
        return z10;
    }

    final void b() {
        try {
            this.f99552a.closeProfileProxy(1, this.f99553b);
        } catch (Throwable th2) {
            Log.w("BluetoothHeadsetListener", "Close profile proxy exception " + th2.getMessage(), new Object[0]);
        }
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceConnected(int i10, BluetoothProfile bluetoothProfile) {
        BluetoothProfile bluetoothProfile2;
        if (i10 != 1) {
            return;
        }
        synchronized (this.f99554c) {
            if (this.f99552a != null && (bluetoothProfile2 = this.f99553b) != null) {
                Log.i("BluetoothHeadsetListener", "Bluetooth Headset proxy changed from %s to %s", bluetoothProfile2, bluetoothProfile);
                b();
            }
            this.f99553b = bluetoothProfile;
            this.f99554c.notifyAll();
        }
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceDisconnected(int i10) {
        if (i10 != 1) {
            return;
        }
        synchronized (this.f99554c) {
            if (this.f99552a != null && this.f99553b != null) {
                b();
                this.f99553b = null;
            }
        }
    }
}
