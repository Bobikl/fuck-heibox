package com.huawei.multimedia.audiokit.interfaces;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import com.huawei.multimedia.audiokit.utils.LogUtils;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class EnhancedDeviceInfo {
    private static final int BLUETOOTH_A2DP_FB_RECORDING = 10005;
    private static final String TAG = "HwAudioKit.EnhancedDeviceInfo";
    private static BluetoothAdapter mBluetoothAdapter;
    private static BluetoothDevice mBluetoothDevice;
    private AudioManager mAudioManager = null;
    private Context mContext;
    private int mDeviceType;
    private static final Object LOCK_ISKARAOKE_SUPPORTED = new Object();
    private static final Object LOCK_ISFULLBAND_RECORD_SUPPORTED = new Object();

    public EnhancedDeviceInfo(Context context, int i10) {
        this.mContext = context;
        this.mDeviceType = i10;
    }

    private void createAudioManager() {
        if (this.mAudioManager == null) {
            Object systemService = this.mContext.getSystemService("audio");
            if (systemService instanceof AudioManager) {
                this.mAudioManager = (AudioManager) systemService;
            }
        }
    }

    public static boolean getBluetoothFBEnable(AudioManager audioManager) {
        mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        AudioDeviceInfo[] devices = new AudioDeviceInfo[0];
        if (audioManager != null) {
            devices = audioManager.getDevices(2);
        }
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (audioDeviceInfo.getType() == 8) {
                mBluetoothDevice = mBluetoothAdapter.getRemoteDevice(audioDeviceInfo.getAddress());
            }
        }
        if (mBluetoothDevice == null) {
            return false;
        }
        return isBluetoothFBRecording();
    }

    private static boolean isBluetoothFBRecording() {
        boolean z10 = false;
        try {
            Object objInvoke = BluetoothDevice.class.getMethod("getMetadata", Integer.TYPE).invoke(mBluetoothDevice, 10005);
            if (!(objInvoke instanceof byte[])) {
                return false;
            }
            byte[] bArr = (byte[]) objInvoke;
            if (bArr.length <= 0) {
                return false;
            }
            boolean z11 = bArr[0] != 0;
            try {
                LogUtils.info(TAG, "isBluetoothFBRecording byteArray[0]=" + ((int) bArr[0]));
                return z11;
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                z10 = z11;
            } catch (NoSuchMethodException unused2) {
                z10 = z11;
                LogUtils.error(TAG, "No Such Method getMetadata");
                return z10;
            }
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused3) {
        } catch (NoSuchMethodException unused4) {
        }
        LogUtils.error(TAG, "isBluetoothFBRecording Exception");
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0023  */
    public boolean isFullbandRecordSupported() {
        boolean bluetoothFBEnable;
        synchronized (LOCK_ISFULLBAND_RECORD_SUPPORTED) {
            int i10 = this.mDeviceType;
            bluetoothFBEnable = false;
            if (i10 == 3) {
                bluetoothFBEnable = true;
            } else if (i10 != 4) {
                if (i10 == 8) {
                    createAudioManager();
                    bluetoothFBEnable = getBluetoothFBEnable(this.mAudioManager);
                } else if (i10 == 11 || i10 == 22) {
                    bluetoothFBEnable = true;
                }
            }
            LogUtils.info(TAG, "mDeviceType=" + this.mDeviceType + ",isFbRecordSupported=" + bluetoothFBEnable);
        }
        return bluetoothFBEnable;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0023  */
    public boolean isKaraokeSupported() {
        boolean bluetoothFBEnable;
        synchronized (LOCK_ISKARAOKE_SUPPORTED) {
            bluetoothFBEnable = false;
            int i10 = this.mDeviceType;
            if (i10 == 3 || i10 == 4) {
                bluetoothFBEnable = true;
            } else if (i10 == 8) {
                createAudioManager();
                bluetoothFBEnable = getBluetoothFBEnable(this.mAudioManager);
            } else if (i10 == 11 || i10 == 22) {
                bluetoothFBEnable = true;
            }
            LogUtils.info(TAG, "mDeviceType=" + this.mDeviceType + ",isDeviceSupported=" + bluetoothFBEnable);
        }
        return bluetoothFBEnable;
    }
}
