package com.ss.bytertc.audio.device.router;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbConfiguration;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.core.content.d;
import com.bytedance.realx.base.RXLogging;
import com.efs.sdk.base.core.util.NetworkUtil;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public class AudioRouteDeviceManager extends BroadcastReceiver {
    private static final String ACTION_BT_A2DP_CONNECTION_STATE_CHANGED = "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED";
    private static final String ACTION_BT_HEADSET_CONNECTION_STATE_CHANGED = "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED";
    private static final String ACTION_BT_SCO_AUDIO_STATE_UPDATED = "android.media.ACTION_SCO_AUDIO_STATE_UPDATED";
    private static final String ACTION_BT_STATE_CHANGED = "android.bluetooth.adapter.action.STATE_CHANGED";
    private static final String ACTION_HEADSET_PLUG = "android.intent.action.HEADSET_PLUG";
    private static final String ACTION_USB_DEVICE_ATTACHED = "android.hardware.usb.action.USB_DEVICE_ATTACHED";
    private static final String ACTION_USB_DEVICE_DETACHED = "android.hardware.usb.action.USB_DEVICE_DETACHED";
    private static final int BLUETOOTH_SCO_CONNECT_CHECK_MAX_RETRY_TIMES = 3;
    private static final int BLUETOOTH_SCO_CONNECT_CHECK_TIME_GAP = 3000;
    private static final int BLUETOOTH_SCO_DISCONNECT_CHECK_TIME_GAP = 6000;
    private static final int BLUETOOTH_SCO_RESTART_MAX_TIMES = 3;
    private static final int BLUETOOTH_SCO_RESTART_TIME_GAP = 3000;
    private static final String TAG = "AudioRouteDeviceManager";
    private BluetoothAdapter mBluetoothAdapter;
    private MyBluetoothDevice mBluetoothDevice;
    private AudioDeviceCallback mBluetoothDeviceCallback;
    private IAudioRouteCallback mCallback;
    private Handler mHandler;
    private IntentFilter mIntentFilter;
    private UsbDevice mUsbHeadsetDevice;
    private String mWiredHeadsetDevice;
    private volatile boolean registered = false;
    private int mInitDeviceState = 0;
    private int mBluetoothScoConnectCheckTimes = -1;
    private int mBluetoothScoRestartTimes = 0;
    private boolean mScoHasStarted = false;
    private String mBluetoothPermissionDesp = "NULL";

    @RoutingDeviceType
    private int currentRouting = -1;
    private boolean mEnableSkipBluetoothConnectPermission = false;
    private boolean mSkipBluetoothConnectPermission = false;

    public class BluetoothConnectCallback extends AudioDeviceCallback {
        private BluetoothConnectCallback() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                if (!audioDeviceInfo.isSource()) {
                    int type = audioDeviceInfo.getType();
                    if (type == 7 && AudioRouteDeviceManager.this.mCallback != null) {
                        RXLogging.i(AudioRouteDeviceManager.TAG, "addedDevices: " + type + ", name: " + audioDeviceInfo.getProductName().toString());
                        if (AudioRouteDeviceManager.this.mBluetoothDevice == null) {
                            AudioRouteDeviceManager audioRouteDeviceManager = AudioRouteDeviceManager.this;
                            audioRouteDeviceManager.mBluetoothDevice = audioRouteDeviceManager.new MyBluetoothDevice("bluetooth-headset");
                        }
                        AudioRouteDeviceManager.this.mBluetoothDevice.setBluetoothConnected(1, true);
                        AudioRouteDeviceManager audioRouteDeviceManager2 = AudioRouteDeviceManager.this;
                        audioRouteDeviceManager2.mBluetoothDevice = audioRouteDeviceManager2.new MyBluetoothDevice("bluetooth-headset");
                        AudioRouteDeviceManager.this.mBluetoothScoRestartTimes = 0;
                        AudioRouteDeviceManager.this.mCallback.onDeviceEvent(8, true);
                    } else if (type == 8 && AudioRouteDeviceManager.this.mCallback != null) {
                        RXLogging.i(AudioRouteDeviceManager.TAG, "addedDevices: " + type + ", name: " + audioDeviceInfo.getProductName().toString());
                        if (AudioRouteDeviceManager.this.mBluetoothDevice == null) {
                            AudioRouteDeviceManager audioRouteDeviceManager3 = AudioRouteDeviceManager.this;
                            audioRouteDeviceManager3.mBluetoothDevice = audioRouteDeviceManager3.new MyBluetoothDevice("bluetooth-headset");
                        }
                        AudioRouteDeviceManager.this.mBluetoothDevice.setBluetoothConnected(2, true);
                        AudioRouteDeviceManager.this.mCallback.onDeviceEvent(16, true);
                    }
                }
            }
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                if (!audioDeviceInfo.isSource()) {
                    int type = audioDeviceInfo.getType();
                    if (type == 7 && AudioRouteDeviceManager.this.mCallback != null) {
                        RXLogging.i(AudioRouteDeviceManager.TAG, "removedDevices: " + type + ", name: " + ((Object) audioDeviceInfo.getProductName()));
                        if (AudioRouteDeviceManager.this.mBluetoothDevice != null) {
                            AudioRouteDeviceManager.this.mBluetoothDevice.setBluetoothConnected(1, false);
                            if (!AudioRouteDeviceManager.this.mBluetoothDevice.getBluetoothConnected(1) && !AudioRouteDeviceManager.this.mBluetoothDevice.getBluetoothConnected(2)) {
                                RXLogging.i(AudioRouteDeviceManager.TAG, "AudioRouteDeviceManager: destroy mBluetoothDevice due to headset & a2dp disconncected");
                                AudioRouteDeviceManager.this.mBluetoothDevice = null;
                            }
                        }
                        AudioRouteDeviceManager.this.mBluetoothDevice = null;
                        AudioRouteDeviceManager.this.mCallback.onDeviceEvent(8, false);
                        return;
                    }
                    if (type == 8 && AudioRouteDeviceManager.this.mCallback != null) {
                        RXLogging.i(AudioRouteDeviceManager.TAG, "removedDevices: " + type + ", name: " + ((Object) audioDeviceInfo.getProductName()));
                        if (AudioRouteDeviceManager.this.mBluetoothDevice != null) {
                            AudioRouteDeviceManager.this.mBluetoothDevice.setBluetoothConnected(2, false);
                            if (!AudioRouteDeviceManager.this.mBluetoothDevice.getBluetoothConnected(1) && !AudioRouteDeviceManager.this.mBluetoothDevice.getBluetoothConnected(2)) {
                                RXLogging.i(AudioRouteDeviceManager.TAG, "AudioRouteDeviceManager: destroy mBluetoothDevice due to headset & a2dp disconncected");
                                AudioRouteDeviceManager.this.mBluetoothDevice = null;
                            }
                        }
                        AudioRouteDeviceManager.this.mCallback.onDeviceEvent(16, false);
                        return;
                    }
                }
            }
        }
    }

    public class MyBluetoothDevice {
        private BluetoothDevice bluetoothDevice;
        private String name;
        private boolean headsetConnected = false;
        private boolean a2dpConnected = false;

        public MyBluetoothDevice(BluetoothDevice bluetoothDevice) {
            this.bluetoothDevice = bluetoothDevice;
        }

        public MyBluetoothDevice(String str) {
            this.name = str;
        }

        public boolean getBluetoothConnected(int i10) {
            if (i10 == 1) {
                return this.headsetConnected;
            }
            if (i10 == 2) {
                return this.a2dpConnected;
            }
            return false;
        }

        public String getName() {
            return this.bluetoothDevice == null ? this.name : "bluetooth-headset";
        }

        public void setBluetoothConnected(int i10, boolean z10) {
            if (i10 == 1) {
                this.headsetConnected = z10;
            } else if (i10 == 2) {
                this.a2dpConnected = z10;
            }
        }

        public String toString() {
            return getName();
        }
    }

    public @interface RoutingDeviceType {
        public static final int BLUETOOTH_A2DP = 16;
        public static final int BLUETOOTH_HEADSET = 8;
        public static final int BLUETOOTH_SCO = 64;
        public static final int BUILT_IN_EARPIECE = 1;
        public static final int BUILT_IN_SPEAKER = 2;
        public static final int UNKNOWN = -1;
        public static final int USB_HEADSET = 32;
        public static final int WIRED_HEADSET = 4;
    }

    public AudioRouteDeviceManager(IAudioRouteCallback iAudioRouteCallback) {
        this.mCallback = iAudioRouteCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bluetoothScoConnectionCheck() {
        if (this.mCallback == null) {
            return;
        }
        Context context = AudioRouteUtil.getContext();
        if (context == null) {
            RXLogging.e(TAG, "AudioRouteDeviceManager: bluetoothScoConnectionCheck failed. Context is null.");
            return;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            RXLogging.e(TAG, "AudioRouteDeviceManager: bluetoothScoConnectionCheck failed. AudioManager is null.");
            return;
        }
        if (this.mBluetoothScoConnectCheckTimes >= 3) {
            if (this.mScoHasStarted) {
                stopSystemBluetoothSco(audioManager);
            }
            RXLogging.e(TAG, "bluetoothScoConnectionCheck timeout, time: " + this.mBluetoothScoConnectCheckTimes);
            this.mBluetoothScoConnectCheckTimes = -1;
            this.mHandler.removeCallbacks(new b(this));
            this.mCallback.onError(AudioRouteController.EVENT_SCO_FAILED_FORCE_TO_MEDIA_MODE, "change to normal mode due to sco started timeout");
            return;
        }
        if (audioManager.isBluetoothScoOn()) {
            RXLogging.e(TAG, "AudioRouteDeviceManager: bluetoothScoConnectionCheck success.");
            this.mBluetoothScoConnectCheckTimes = -1;
            this.mHandler.removeCallbacks(new b(this));
            return;
        }
        this.mBluetoothScoConnectCheckTimes++;
        RXLogging.e(TAG, "AudioRouteDeviceManager: bluetoothScoConnectionCheck failed. retry again, time: " + this.mBluetoothScoConnectCheckTimes);
        startSystemBluetoothSco(audioManager);
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.postDelayed(new b(this), 3000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bluetoothScoDisconnectionForNormalMode() {
        Context context = AudioRouteUtil.getContext();
        if (context == null) {
            RXLogging.e(TAG, "AudioRouteDeviceManager: bluetoothScoDisconnectionForNormalMode failed. Context is null.");
            return;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            RXLogging.e(TAG, "AudioRouteDeviceManager: bluetoothScoDisconnectionForNormalMode failed. AudioManager is null.");
            return;
        }
        int mode = audioManager.getMode();
        boolean zIsBluetoothScoOn = audioManager.isBluetoothScoOn();
        RXLogging.e(TAG, "AudioRouteDeviceManager: bluetoothScoDisconnectionForNormalMode mode(" + mode + "), bluetoothScoOn(" + zIsBluetoothScoOn + ")");
        if (mode == 0) {
            if (zIsBluetoothScoOn || this.mScoHasStarted) {
                stopSystemBluetoothSco(audioManager);
            }
        }
    }

    private boolean bluetoothScoIsStarting() {
        return this.mHandler != null && this.mBluetoothScoConnectCheckTimes >= 0;
    }

    @SuppressLint({"WrongConstant"})
    private boolean checkPermission() {
        Context context = AudioRouteUtil.getContext();
        if (context == null) {
            return false;
        }
        int i10 = Build.VERSION.SDK_INT;
        int i11 = context.getApplicationInfo().targetSdkVersion;
        if (i10 < 31 || i11 < 31) {
            if (context.checkCallingOrSelfPermission("android.permission.BLUETOOTH") != 0) {
                String str = "[permission android.permission.BLUETOOTH not be granted. osVersion:" + i10 + ", targetVersion:" + i11 + " ]";
                this.mBluetoothPermissionDesp = str;
                RXLogging.e(TAG, str);
                return false;
            }
            String str2 = "[permission android.permission.BLUETOOTH granted. osVersion:" + i10 + ", targetVersion:" + i11 + " ]";
            this.mBluetoothPermissionDesp = str2;
            RXLogging.i(TAG, str2);
            return true;
        }
        if (context.checkCallingOrSelfPermission("android.permission.BLUETOOTH_CONNECT") == 0) {
            String str3 = "[permission android.permission.BLUETOOTH_CONNECT granted. osVersion:" + i10 + ", targetVersion:" + i11 + " ]";
            this.mBluetoothPermissionDesp = str3;
            RXLogging.i(TAG, str3);
            return true;
        }
        this.mSkipBluetoothConnectPermission = this.mEnableSkipBluetoothConnectPermission;
        String str4 = "[permission android.permission.BLUETOOTH_CONNECT not be granted. osVersion:" + i10 + ", targetVersion:" + i11 + ", EnableSkipBluetoothConnectBroadcast:" + this.mEnableSkipBluetoothConnectPermission + " ]";
        this.mBluetoothPermissionDesp = str4;
        RXLogging.e(TAG, str4);
        return false;
    }

    private boolean hasAudioForUsbDevice(UsbDevice usbDevice) {
        if (usbDevice == null) {
            return false;
        }
        for (int i10 = 0; i10 < usbDevice.getConfigurationCount(); i10++) {
            UsbConfiguration configuration = usbDevice.getConfiguration(i10);
            if (configuration != null) {
                for (int i11 = 0; i11 < configuration.getInterfaceCount(); i11++) {
                    UsbInterface usbInterface = configuration.getInterface(i11);
                    if (usbInterface != null && usbInterface.getInterfaceClass() == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean headsetPlugActionIsFromUsbHeadset(Intent intent) {
        String stringExtra = intent.getStringExtra("address");
        String stringExtra2 = intent.getStringExtra("portName");
        RXLogging.i(TAG, "ACTION_HEADSET_PLUG info, address: " + stringExtra + ", portName: " + stringExtra2 + ", connected: " + intent.getIntExtra("state", -99) + ", hasMic: " + intent.getIntExtra("microphone", -99));
        if ("".equals(stringExtra) || "".equals(stringExtra2) || stringExtra2 == null) {
            return false;
        }
        if (!stringExtra2.startsWith("USB") && !stringExtra2.startsWith("usb")) {
            return false;
        }
        RXLogging.e(TAG, "AudioRouteDeviceManager: received ACTION_HEADSET_PLUG, may be is a usb device");
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void initBluetooth() {
        boolean z10;
        this.mBluetoothDevice = null;
        boolean z11 = false;
        if (checkPermission()) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            this.mBluetoothAdapter = defaultAdapter;
            if (defaultAdapter == null) {
                Log.e(TAG, "AudioRouteDeviceManager: initBluetooth with permission failed. GetDefaultAdapter is null");
                return;
            }
            boolean z12 = 2 == defaultAdapter.getProfileConnectionState(1);
            boolean z13 = 2 == this.mBluetoothAdapter.getProfileConnectionState(2);
            Log.i(TAG, "initBluetooth() with bluetooth-connect broadcast. headset_connected:" + z12 + " a2dp_connected:" + z13);
            this.mIntentFilter.addAction(ACTION_BT_HEADSET_CONNECTION_STATE_CHANGED);
            this.mIntentFilter.addAction(ACTION_BT_A2DP_CONNECTION_STATE_CHANGED);
            this.mIntentFilter.addAction(ACTION_BT_SCO_AUDIO_STATE_UPDATED);
            z10 = z13;
            z11 = z12;
        } else if (this.mSkipBluetoothConnectPermission) {
            Context context = AudioRouteUtil.getContext();
            if (context == null) {
                Log.e(TAG, "AudioRouteDeviceManager: initBluetooth without permission failed. Context is null.");
                return;
            }
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                Log.e(TAG, "AudioRouteDeviceManager: initBluetooth without permission failed. AudioManager is null.");
                return;
            }
            Log.i(TAG, "initBluetooth() with no bluetooth-connect permision.");
            boolean z14 = false;
            z10 = false;
            for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
                if (!audioDeviceInfo.isSource()) {
                    if (7 == audioDeviceInfo.getType()) {
                        z14 = true;
                    } else if (8 == audioDeviceInfo.getType()) {
                        z10 = true;
                    }
                }
            }
            z11 = z14;
        } else {
            z10 = false;
        }
        if (z11 || z10) {
            MyBluetoothDevice myBluetoothDevice = new MyBluetoothDevice("bluetooth-headset[init]");
            this.mBluetoothDevice = myBluetoothDevice;
            myBluetoothDevice.setBluetoothConnected(1, z11);
            this.mBluetoothDevice.setBluetoothConnected(2, z10);
        }
    }

    private void initHandler() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null && (looperMyLooper = Looper.getMainLooper()) == null) {
            RXLogging.e(TAG, "AudioRouteDeviceManager: initHandler failed");
            return;
        }
        Handler handler = new Handler(looperMyLooper);
        this.mHandler = handler;
        handler.removeCallbacks(new b(this));
        RXLogging.e(TAG, "AudioRouteDeviceManager: initHandler success");
    }

    private boolean initHeadset() {
        Intent intentRegisterReceiver;
        Context context = AudioRouteUtil.getContext();
        return (context == null || (intentRegisterReceiver = context.registerReceiver(this, new IntentFilter(ACTION_HEADSET_PLUG))) == null || headsetPlugActionIsFromUsbHeadset(intentRegisterReceiver) || 1 != intentRegisterReceiver.getIntExtra("state", -99)) ? false : true;
    }

    private boolean initUsbHeadset() {
        try {
            Context context = AudioRouteUtil.getContext();
            if (context == null) {
                return false;
            }
            HashMap<String, UsbDevice> deviceList = ((UsbManager) context.getSystemService("usb")).getDeviceList();
            Iterator<String> it = deviceList.keySet().iterator();
            while (it.hasNext()) {
                UsbDevice usbDevice = deviceList.get(it.next());
                if (hasAudioForUsbDevice(usbDevice)) {
                    this.mUsbHeadsetDevice = usbDevice;
                    RXLogging.e(TAG, "AudioRouteDeviceManager: initUsbHeadset finished.");
                    return true;
                }
            }
        } catch (Throwable th2) {
            RXLogging.e(TAG, "AudioRouteDeviceManager: initUsbHeadset failed.", th2);
        }
        return false;
    }

    private int registerReceiver() {
        Context context = AudioRouteUtil.getContext();
        if (context == null) {
            return -1;
        }
        if (this.registered) {
            return 0;
        }
        this.registered = true;
        context.registerReceiver(this, this.mIntentFilter);
        if (this.mSkipBluetoothConnectPermission) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return -2;
            }
            BluetoothConnectCallback bluetoothConnectCallback = new BluetoothConnectCallback();
            this.mBluetoothDeviceCallback = bluetoothConnectCallback;
            audioManager.registerAudioDeviceCallback(bluetoothConnectCallback, null);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void restartBluetoothScoAsynTask() {
        RXLogging.w(TAG, "restartBluetoothScoAsynTask enter.");
        if (!(this.mBluetoothDevice != null)) {
            RXLogging.w(TAG, "restartBluetoothScoAsynTask skip, no bluetooth device now.");
            return;
        }
        if (bluetoothScoIsStarting()) {
            RXLogging.w(TAG, "restartBluetoothScoAsynTask skip. sco is starting.");
            return;
        }
        Context context = AudioRouteUtil.getContext();
        if (context == null) {
            RXLogging.e(TAG, "restartBluetoothScoAsynTask failed. Context is null.");
            return;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            RXLogging.e(TAG, "restartBluetoothScoAsynTask failed. AudioManager is null.");
        } else {
            startSystemBluetoothSco(audioManager);
            RXLogging.w(TAG, "restartBluetoothScoAsynTask has start bluetooth.");
        }
    }

    private void startSystemBluetoothSco(AudioManager audioManager) {
        if (audioManager == null) {
            RXLogging.e(TAG, "startSystemBluetoothSco skipped, audioManager is null");
            return;
        }
        try {
            audioManager.startBluetoothSco();
            this.mScoHasStarted = true;
        } catch (Exception e10) {
            RXLogging.e(TAG, "startSystemBluetoothSco failed, Exception: " + e10.toString());
        }
    }

    private void stopSystemBluetoothSco(AudioManager audioManager) {
        if (audioManager == null) {
            RXLogging.e(TAG, "stopSystemBluetoothSco skipped, audioManager is null");
            return;
        }
        try {
            audioManager.stopBluetoothSco();
            audioManager.setBluetoothScoOn(false);
            this.mScoHasStarted = false;
        } catch (Exception e10) {
            RXLogging.e(TAG, "stopSystemBluetoothSco failed, Exception: " + e10.toString());
        }
    }

    private int unregisterReceiver() {
        Context context = AudioRouteUtil.getContext();
        if (context == null) {
            return -1;
        }
        if (!this.registered) {
            return 0;
        }
        this.registered = false;
        context.unregisterReceiver(this);
        clearAbortBroadcast();
        if (this.mSkipBluetoothConnectPermission) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return -2;
            }
            audioManager.unregisterAudioDeviceCallback(this.mBluetoothDeviceCallback);
            this.mBluetoothDeviceCallback = null;
        }
        return 0;
    }

    public String getCaptureDeviceName() {
        return getRenderDeviceName();
    }

    public int getDeviceState() {
        return this.mInitDeviceState;
    }

    public String getRenderDeviceName() {
        int i10 = this.currentRouting;
        if (i10 == 1) {
            return "earpiece";
        }
        if (i10 == 2) {
            return "built-in speaker";
        }
        if (i10 == 4) {
            String str = this.mWiredHeadsetDevice;
            return str != null ? str : "failed_wired-headset";
        }
        if (i10 == 8) {
            MyBluetoothDevice myBluetoothDevice = this.mBluetoothDevice;
            return myBluetoothDevice != null ? myBluetoothDevice.getName() : "failed_bluetooth-headset";
        }
        if (i10 == 16) {
            MyBluetoothDevice myBluetoothDevice2 = this.mBluetoothDevice;
            return myBluetoothDevice2 != null ? myBluetoothDevice2.getName() : "failed_bluetooth-a2dp";
        }
        if (i10 != 32) {
            return "failed_device_name";
        }
        UsbDevice usbDevice = this.mUsbHeadsetDevice;
        return usbDevice != null ? usbDevice.getDeviceName() : "failed_usb-headset";
    }

    public String getSessionInfo() {
        Context context = AudioRouteUtil.getContext();
        if (context == null) {
            return "Context is null";
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return "AudioManager is null";
        }
        if (this.mCallback == null) {
            return "mCallback is null";
        }
        try {
            return "{ Audio State: audio_mode:" + AudioRouteUtil.modeString(audioManager.getMode()) + ", has_mic:" + context.getPackageManager().hasSystemFeature("android.hardware.microphone") + ", mic_muted:" + audioManager.isMicrophoneMute() + ", speakerphone:" + audioManager.isSpeakerphoneOn() + ", headset:" + audioManager.isWiredHeadsetOn() + ", bt_sco:" + audioManager.isBluetoothScoOn() + ", permission:" + (d.a(context, "android.permission.RECORD_AUDIO") == 0) + ", bluetoothPermission:" + this.mBluetoothPermissionDesp + " }";
        } catch (Exception e10) {
            String str = "getSessionInfo failed, exception: " + e10.toString();
            RXLogging.e(TAG, str);
            return str;
        }
    }

    public int init() {
        IntentFilter intentFilter = new IntentFilter();
        this.mIntentFilter = intentFilter;
        intentFilter.addAction(ACTION_BT_STATE_CHANGED);
        this.mIntentFilter.addAction(ACTION_USB_DEVICE_ATTACHED);
        this.mIntentFilter.addAction(ACTION_USB_DEVICE_DETACHED);
        initHandler();
        if (initHeadset()) {
            this.mInitDeviceState += 4;
        }
        if (initUsbHeadset()) {
            this.mInitDeviceState += 32;
        }
        initBluetooth();
        MyBluetoothDevice myBluetoothDevice = this.mBluetoothDevice;
        if (myBluetoothDevice != null) {
            if (myBluetoothDevice.getBluetoothConnected(1)) {
                this.mInitDeviceState += 8;
            }
            if (this.mBluetoothDevice.getBluetoothConnected(2)) {
                this.mInitDeviceState += 16;
            }
        }
        if (registerReceiver() == 0) {
            return 0;
        }
        Log.e(TAG, "AudioRouteDeviceManager: registerReceiver failed.");
        release();
        return -2;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x02d9  */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        boolean z10;
        boolean z11;
        int intExtra;
        int i10;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        IAudioRouteCallback iAudioRouteCallback;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            RXLogging.e(TAG, "AudioRouteDeviceManager: action is null");
            return;
        }
        if (!action.equals(ACTION_BT_STATE_CHANGED)) {
            if (action.equals(ACTION_BT_HEADSET_CONNECTION_STATE_CHANGED)) {
                int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -99);
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if (intExtra2 != 0) {
                    if (intExtra2 == 1) {
                        z10 = false;
                    } else {
                        if (intExtra2 == 2) {
                            RXLogging.i(TAG, "AudioRouteDeviceManager: ACTION_BT_HEADSET_CONNECTION_STATE_CHANGED:STATE_CONNECTED:" + bluetoothDevice);
                            if (bluetoothDevice != null) {
                                if (this.mBluetoothDevice == null) {
                                    this.mBluetoothDevice = new MyBluetoothDevice(bluetoothDevice);
                                }
                                this.mBluetoothDevice.setBluetoothConnected(1, true);
                                this.mBluetoothScoRestartTimes = 0;
                                z10 = true;
                            }
                        } else if (intExtra2 != 3) {
                            RXLogging.i(TAG, "AudioRouteDeviceManager: ACTION_BT_HEADSET_CONNECTION_STATE_CHANGED, unknown state: " + intExtra2);
                        }
                        z10 = false;
                    }
                    z15 = z10;
                } else {
                    RXLogging.i(TAG, "AudioRouteDeviceManager: ACTION_BT_HEADSET_CONNECTION_STATE_CHANGED:STATE_DISCONNECTED:" + bluetoothDevice);
                    MyBluetoothDevice myBluetoothDevice = this.mBluetoothDevice;
                    if (myBluetoothDevice != null) {
                        myBluetoothDevice.setBluetoothConnected(1, false);
                        if (!this.mBluetoothDevice.getBluetoothConnected(1) && !this.mBluetoothDevice.getBluetoothConnected(2)) {
                            RXLogging.i(TAG, "AudioRouteDeviceManager: destroy mBluetoothDevice due to headset & a2dp disconncected" + bluetoothDevice);
                            this.mBluetoothDevice = null;
                        }
                    }
                    z10 = false;
                    z15 = true;
                }
                z11 = z15;
                intExtra = intExtra2;
                i10 = 8;
            } else if (action.equals(ACTION_BT_A2DP_CONNECTION_STATE_CHANGED)) {
                int intExtra3 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -99);
                BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if (intExtra3 != 0) {
                    if (intExtra3 == 1) {
                        z10 = false;
                    } else {
                        if (intExtra3 == 2) {
                            RXLogging.i(TAG, "AudioRouteDeviceManager: ACTION_BT_A2DP_CONNECTION_STATE_CHANGED:STATE_CONNECTED:" + bluetoothDevice2);
                            if (bluetoothDevice2 != null) {
                                if (this.mBluetoothDevice == null) {
                                    this.mBluetoothDevice = new MyBluetoothDevice(bluetoothDevice2);
                                }
                                this.mBluetoothDevice.setBluetoothConnected(2, true);
                                this.mBluetoothScoRestartTimes = 0;
                                z10 = true;
                            }
                        } else if (intExtra3 != 3) {
                            RXLogging.i(TAG, "AudioRouteDeviceManager: ACTION_BT_A2DP_CONNECTION_STATE_CHANGED, unknown state: " + intExtra3);
                        }
                        z10 = false;
                    }
                    z14 = z10;
                } else {
                    RXLogging.i(TAG, "AudioRouteDeviceManager: ACTION_BT_A2DP_CONNECTION_STATE_CHANGED:STATE_DISCONNECTED:" + bluetoothDevice2);
                    MyBluetoothDevice myBluetoothDevice2 = this.mBluetoothDevice;
                    if (myBluetoothDevice2 != null) {
                        myBluetoothDevice2.setBluetoothConnected(2, false);
                        if (!this.mBluetoothDevice.getBluetoothConnected(1) && !this.mBluetoothDevice.getBluetoothConnected(2)) {
                            RXLogging.i(TAG, "AudioRouteDeviceManager: destroy mBluetoothDevice due to headset & a2dp disconncected" + bluetoothDevice2);
                            this.mBluetoothDevice = null;
                        }
                    }
                    z10 = false;
                    z14 = true;
                }
                z11 = z14;
                intExtra = intExtra3;
                i10 = 16;
            } else if (action.equals(ACTION_BT_SCO_AUDIO_STATE_UPDATED)) {
                i10 = 64;
                intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -99);
                if (intExtra != 0) {
                    if (intExtra == 1) {
                        RXLogging.i(TAG, "AudioRouteDeviceManager: SCO_AUDIO_STATE_CONNECTED");
                        z10 = true;
                    }
                    z11 = z10;
                } else {
                    RXLogging.i(TAG, "AudioRouteDeviceManager: SCO_AUDIO_STATE_DISCONNECTED");
                    z10 = false;
                    z11 = true;
                }
            } else {
                if (action.equals(ACTION_USB_DEVICE_ATTACHED)) {
                    UsbDevice usbDevice = (UsbDevice) intent.getParcelableExtra("device");
                    RXLogging.i(TAG, "AudioRouteDeviceManager: ACTION_USB_DEVICE_ATTACHED:" + usbDevice);
                    if (hasAudioForUsbDevice(usbDevice)) {
                        this.mUsbHeadsetDevice = usbDevice;
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z11 = z13;
                    z10 = true;
                } else if (action.equals(ACTION_USB_DEVICE_DETACHED)) {
                    UsbDevice usbDevice2 = (UsbDevice) intent.getParcelableExtra("device");
                    RXLogging.i(TAG, "AudioRouteDeviceManager: ACTION_USB_DEVICE_DETACHED:" + usbDevice2);
                    if (hasAudioForUsbDevice(usbDevice2)) {
                        this.mUsbHeadsetDevice = null;
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z11 = z12;
                    z10 = false;
                } else if (!action.equals(ACTION_HEADSET_PLUG)) {
                    z10 = false;
                    z11 = false;
                    intExtra = -1234;
                    i10 = -1;
                } else {
                    if (headsetPlugActionIsFromUsbHeadset(intent)) {
                        return;
                    }
                    i10 = 4;
                    z10 = intent.getIntExtra("state", -99) == 1;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("AudioRouteDeviceManager: ACTION_HEADSET_PLUG:");
                    sb2.append(z10 ? "connected" : NetworkUtil.NETWORK_CLASS_DISCONNECTED);
                    RXLogging.i(TAG, sb2.toString());
                    if (z10) {
                        this.mWiredHeadsetDevice = "wired-headset";
                    } else {
                        this.mWiredHeadsetDevice = null;
                    }
                    z11 = true;
                    intExtra = -1234;
                }
                intExtra = -1234;
                i10 = 32;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("AudioRouteDeviceManager:received action:");
            sb3.append(action);
            sb3.append(" state:");
            sb3.append(intExtra);
            sb3.append(" needReport:");
            sb3.append(z11);
            sb3.append(", mCallback:");
            sb3.append(this.mCallback != null);
            sb3.append(", deviceType:");
            sb3.append(i10);
            sb3.append(", connectedStatus:");
            sb3.append(z10);
            RXLogging.i(TAG, sb3.toString());
            if (z11 || (iAudioRouteCallback = this.mCallback) == null) {
            }
            iAudioRouteCallback.onDeviceEvent(i10, z10);
            return;
        }
        intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -99);
        BluetoothDevice bluetoothDevice3 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (intExtra == 10) {
            RXLogging.i(TAG, "AudioRouteDeviceManager: ACTION_BT_STATE_CHANGED:STATE_OFF:" + this.mBluetoothDevice);
            IAudioRouteCallback iAudioRouteCallback2 = this.mCallback;
            if (iAudioRouteCallback2 != null) {
                iAudioRouteCallback2.onDeviceEvent(8, false);
                this.mCallback.onDeviceEvent(16, false);
            }
            if (this.mBluetoothDevice != null) {
                RXLogging.i(TAG, "AudioRouteDeviceManager: destroy mBluetoothDevice due to bluetooth adapter is closed: " + bluetoothDevice3);
                this.mBluetoothDevice = null;
                return;
            }
            return;
        }
        if (intExtra == 12) {
            RXLogging.i(TAG, "AudioRouteDeviceManager: ACTION_BT_STATE_CHANGED:STATE_ON:" + bluetoothDevice3);
        }
        i10 = 8;
        z10 = false;
        z11 = z10;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("AudioRouteDeviceManager:received action:");
        sb4.append(action);
        sb4.append(" state:");
        sb4.append(intExtra);
        sb4.append(" needReport:");
        sb4.append(z11);
        sb4.append(", mCallback:");
        sb4.append(this.mCallback != null);
        sb4.append(", deviceType:");
        sb4.append(i10);
        sb4.append(", connectedStatus:");
        sb4.append(z10);
        RXLogging.i(TAG, sb4.toString());
        if (z11) {
        }
    }

    public int release() {
        int i10;
        AudioManager audioManager;
        this.mCallback = null;
        Context context = AudioRouteUtil.getContext();
        if (context != null && (audioManager = (AudioManager) context.getSystemService("audio")) != null && (audioManager.isBluetoothScoOn() || this.mScoHasStarted)) {
            stopSystemBluetoothSco(audioManager);
        }
        if (unregisterReceiver() != 0) {
            RXLogging.e(TAG, "AudioRouteDeviceManager: unregisterReceiver failed.");
            i10 = -1;
        } else {
            i10 = 0;
        }
        if (this.mHandler != null) {
            this.mHandler = null;
        }
        this.mBluetoothAdapter = null;
        this.mIntentFilter = null;
        this.mInitDeviceState = 0;
        this.mBluetoothDevice = null;
        this.mUsbHeadsetDevice = null;
        this.mWiredHeadsetDevice = null;
        this.currentRouting = -1;
        this.mEnableSkipBluetoothConnectPermission = false;
        this.mSkipBluetoothConnectPermission = false;
        return i10;
    }

    public void restartBluetoothSco() {
        Handler handler;
        if (Build.VERSION.SDK_INT >= 32) {
            RXLogging.w(TAG, "restartBluetoothSco ignored, since android 13 will start bluetooth sco itself after sco disconnected.");
            return;
        }
        RXLogging.w(TAG, "restartBluetoothSco enter.");
        if (!(this.mBluetoothDevice != null)) {
            RXLogging.w(TAG, "restartBluetoothSco skip, no bluetooth device now.");
            this.mHandler.removeCallbacks(new Runnable() { // from class: com.ss.bytertc.audio.device.router.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f97848b.restartBluetoothScoAsynTask();
                }
            });
            return;
        }
        Context context = AudioRouteUtil.getContext();
        if (context == null) {
            RXLogging.e(TAG, "restartBluetoothSco failed. Context is null.");
            return;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            RXLogging.e(TAG, "restartBluetoothSco failed. AudioManager is null.");
            return;
        }
        if (3 != audioManager.getMode()) {
            RXLogging.e(TAG, "restartBluetoothSco failed. Not in communication mode.");
            return;
        }
        if (bluetoothScoIsStarting()) {
            RXLogging.w(TAG, "restartBluetoothSco skip. sco is starting.");
            return;
        }
        int i10 = this.mBluetoothScoRestartTimes + 1;
        this.mBluetoothScoRestartTimes = i10;
        if (i10 <= 3) {
            RXLogging.w(TAG, "restartBluetoothScoAsynTask, restart time: " + this.mBluetoothScoRestartTimes);
            if (!audioManager.isBluetoothScoOn() && (handler = this.mHandler) != null) {
                handler.postDelayed(new Runnable() { // from class: com.ss.bytertc.audio.device.router.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f97848b.restartBluetoothScoAsynTask();
                    }
                }, 3000L);
            }
        } else {
            if (this.mScoHasStarted) {
                stopSystemBluetoothSco(audioManager);
            }
            IAudioRouteCallback iAudioRouteCallback = this.mCallback;
            if (iAudioRouteCallback != null) {
                iAudioRouteCallback.onError(AudioRouteController.EVENT_SCO_FAILED_FORCE_TO_MEDIA_MODE, "change to normal mode due to sco restart timeout");
            }
        }
        RXLogging.w(TAG, "restartBluetoothSco leave.");
    }

    public int setAudioRoute(@RoutingDeviceType int i10, boolean z10) {
        Context context = AudioRouteUtil.getContext();
        if (context == null) {
            RXLogging.e(TAG, "AudioRouteDeviceManager: setAudioRoute failed. Context is null.");
            return -1;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            RXLogging.e(TAG, "AudioRouteDeviceManager: setAudioRoute failed. AudioManager is null.");
            return -2;
        }
        if (this.mCallback == null) {
            RXLogging.e(TAG, "AudioRouteDeviceManager: setAudioRoute failed. mCallback is null.");
            return -6;
        }
        int mode = audioManager.getMode();
        int i11 = z10 ? 0 : 3;
        if (i11 != mode) {
            RXLogging.e(TAG, "AudioRouteDeviceManager: isMediaMode:" + z10 + ", cacheMode:" + i11 + ", systemMode: " + mode + " not matched with system!!!");
            audioManager.setMode(i11);
            mode = audioManager.getMode();
        }
        boolean zIsSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        boolean zIsBluetoothScoOn = audioManager.isBluetoothScoOn();
        RXLogging.e(TAG, "AudioRouteDeviceManager: setAudioRoute, deviceType: " + i10 + ", cacheMode:" + i11 + ", systemMode: " + mode + ", speakerPhoneOn: " + zIsSpeakerphoneOn + ", bluetoothScoOn: " + zIsBluetoothScoOn);
        if (mode != 3) {
            if (mode != 0) {
                RXLogging.e(TAG, "AudioRouteDeviceManager: mode(" + mode + ") is not support to setAudioRoute");
                return -4;
            }
            if (zIsBluetoothScoOn || this.mScoHasStarted) {
                RXLogging.w(TAG, "AudioRouteDeviceManager: MODE_NORMAL,but BluetoothScoOn is true, force to close sco.");
                stopSystemBluetoothSco(audioManager);
            }
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.removeCallbacks(new b(this));
                this.mHandler.postDelayed(new Runnable() { // from class: com.ss.bytertc.audio.device.router.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f97846b.bluetoothScoDisconnectionForNormalMode();
                    }
                }, 6000L);
            }
            if (i10 == 2) {
                if (!zIsSpeakerphoneOn) {
                    audioManager.setSpeakerphoneOn(true);
                }
            } else if (i10 == 1 && zIsSpeakerphoneOn) {
                audioManager.setSpeakerphoneOn(false);
            }
            return 0;
        }
        if (i10 == 8) {
            boolean zBluetoothScoIsStarting = bluetoothScoIsStarting();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("need to start bluetooth sco in communication mode, sco is starting: ");
            sb2.append(zBluetoothScoIsStarting);
            sb2.append(zBluetoothScoIsStarting ? ", skip start sco" : ", continue start sco");
            RXLogging.w(TAG, sb2.toString());
            if (!zIsBluetoothScoOn && !zBluetoothScoIsStarting) {
                RXLogging.w(TAG, "ready to start sco");
                this.mBluetoothScoConnectCheckTimes = 0;
                startSystemBluetoothSco(audioManager);
                Handler handler2 = this.mHandler;
                if (handler2 != null) {
                    handler2.removeCallbacks(new Runnable() { // from class: com.ss.bytertc.audio.device.router.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f97846b.bluetoothScoDisconnectionForNormalMode();
                        }
                    });
                    this.mHandler.postDelayed(new b(this), 3000L);
                }
            }
        } else {
            if (zIsBluetoothScoOn || this.mScoHasStarted) {
                stopSystemBluetoothSco(audioManager);
            }
            if (i10 == 2) {
                if (!zIsSpeakerphoneOn) {
                    audioManager.setSpeakerphoneOn(true);
                }
            } else {
                if (i10 != 1 && i10 != 4 && i10 != 32) {
                    if (i10 == 16) {
                        RXLogging.e(TAG, "AudioRouteDeviceManager: Error: setAudioRoute to a2dp in communication mode");
                        return -7;
                    }
                    RXLogging.e(TAG, "AudioRouteDeviceManager: setAudioRoute failed. deviceType(" + i10 + ") invalid.");
                    return -3;
                }
                if (zIsSpeakerphoneOn) {
                    audioManager.setSpeakerphoneOn(false);
                }
            }
        }
        this.currentRouting = i10;
        return 0;
    }

    public void setSkipBluetoothConnectPermissionAbility(boolean z10, IAudioRouteCallback iAudioRouteCallback) {
        this.mEnableSkipBluetoothConnectPermission = z10;
        this.mCallback = iAudioRouteCallback;
    }
}
