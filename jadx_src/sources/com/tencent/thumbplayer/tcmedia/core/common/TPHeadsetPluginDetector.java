package com.tencent.thumbplayer.tcmedia.core.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class TPHeadsetPluginDetector {
    private static final int AUDIO_TYPE_BLUETOOTH_A2DP = 2;
    private static final int AUDIO_TYPE_BUILTIN_OTHERS = 99;
    private static final int AUDIO_TYPE_BUILTIN_SPEAKER = 0;
    private static final int AUDIO_TYPE_HEADPHONES = 1;
    private static final String TAG = "TPHeadsetPluginDetector";
    private static boolean hasRegisterReceiver = false;
    private static boolean isInitted = false;
    private static WeakReference<Context> mContextRef;
    private static BroadcastReceiver mReceiver;
    private static List<HeadsetPluginListener> listeners = new LinkedList();
    private static Set<Integer> mCurOutputs = null;

    public interface HeadsetPluginListener {
        void onHeadsetPlugin(Set<Integer> set, Set<Integer> set2);
    }

    public static class HeadsetPluginReceiver extends BroadcastReceiver {
        private HeadsetPluginReceiver() {
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0044  */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            TPNativeLog.printLog(2, TPHeadsetPluginDetector.TAG, "onReceive: " + intent.getAction());
            Set audioOutputs = TPHeadsetPluginDetector.getAudioOutputs();
            if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                int intExtra = intent.hasExtra("state") ? intent.getIntExtra("state", 0) : 0;
                if (audioOutputs != null) {
                    if (intExtra == 0) {
                        audioOutputs.remove(1);
                    } else if (intExtra == 1) {
                        audioOutputs.add(1);
                    }
                }
            } else {
                if (!"android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    if ("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                        int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
                        if (audioOutputs != null) {
                            if (intExtra2 == 2) {
                                audioOutputs.add(2);
                            } else if (intExtra2 == 0) {
                                audioOutputs.remove(2);
                            }
                        }
                        TPHeadsetPluginDetector.notifyAudioOutputStateChange(TPHeadsetPluginDetector.mCurOutputs, audioOutputs);
                        return;
                    }
                    return;
                }
                if (audioOutputs != null) {
                    audioOutputs.remove(1);
                }
            }
            TPHeadsetPluginDetector.notifyAudioOutputStateChange(TPHeadsetPluginDetector.mCurOutputs, audioOutputs);
        }
    }

    public static void addHeadsetPluginListener(HeadsetPluginListener headsetPluginListener) {
        synchronized (TPHeadsetPluginDetector.class) {
            if (listeners.add(headsetPluginListener) && !hasRegisterReceiver) {
                registerReceiver();
                hasRegisterReceiver = true;
            }
        }
    }

    public static void deinit() {
        WeakReference<Context> weakReference;
        synchronized (TPHeadsetPluginDetector.class) {
            if (isInitted && (weakReference = mContextRef) != null) {
                weakReference.clear();
                isInitted = false;
                TPNativeLog.printLog(2, TAG, "HeadsetPluginDetector deinit succeed!");
            }
        }
    }

    private static AudioManager getAudioManager() {
        String str;
        WeakReference<Context> weakReference;
        if (!isInitted || (weakReference = mContextRef) == null) {
            str = "getAudioManager failed, HeadsetPluginDetector is not init yet!";
        } else {
            Context context = weakReference.get();
            if (context == null) {
                str = "getAudioManager failed, context is null, maybe is invalid!";
            } else {
                AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                if (audioManager != null) {
                    return audioManager;
                }
                str = "getAudioManager failed, audioMgr is null!";
            }
        }
        TPNativeLog.printLog(4, TAG, str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Set<Integer> getAudioOutputs() {
        AudioDeviceInfo[] devices;
        int i10;
        HashSet hashSet = new HashSet();
        AudioManager audioManager = getAudioManager();
        if (audioManager != null && (devices = audioManager.getDevices(2)) != null) {
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (audioDeviceInfo.getType() == 2) {
                    i10 = 0;
                } else if (audioDeviceInfo.getType() == 8) {
                    i10 = 2;
                } else {
                    if (audioDeviceInfo.getType() == 3) {
                        i10 = 1;
                    }
                }
                hashSet.add(i10);
            }
        }
        return hashSet;
    }

    public static Set<Integer> getCurrentRoutes() {
        return mCurOutputs;
    }

    public static void init(Context context) {
        synchronized (TPHeadsetPluginDetector.class) {
            if (isInitted) {
                return;
            }
            mContextRef = new WeakReference<>(context.getApplicationContext());
            isInitted = true;
            initCurrentOutputs();
            TPNativeLog.printLog(2, TAG, "HeadsetPluginDetector init succeed!");
        }
    }

    private static void initCurrentOutputs() {
        mCurOutputs = getAudioOutputs();
    }

    public static boolean isAudioRouteTypeOn(int i10) {
        Set<Integer> set = mCurOutputs;
        if (set == null) {
            return false;
        }
        return set.contains(Integer.valueOf(i10));
    }

    public static boolean isBluetoothPlugin() {
        AudioManager audioManager = getAudioManager();
        if (audioManager == null) {
            return false;
        }
        return audioManager.isBluetoothA2dpOn();
    }

    public static boolean isHeadsetPlugin() {
        AudioManager audioManager = getAudioManager();
        if (audioManager == null) {
            return false;
        }
        return audioManager.isWiredHeadsetOn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void notifyAudioOutputStateChange(Set<Integer> set, Set<Integer> set2) {
        if (set == null || set2 == null || set.size() != set2.size() || !set2.containsAll(set)) {
            mCurOutputs = set2;
            synchronized (TPHeadsetPluginDetector.class) {
                Iterator<HeadsetPluginListener> it = listeners.iterator();
                while (it.hasNext()) {
                    it.next().onHeadsetPlugin(set, set2);
                }
            }
        }
    }

    private static boolean registerDeviceCallback() {
        AudioManager audioManager = getAudioManager();
        if (audioManager == null) {
            return false;
        }
        audioManager.registerAudioDeviceCallback(new AudioDeviceCallback() { // from class: com.tencent.thumbplayer.tcmedia.core.common.TPHeadsetPluginDetector.1
            @Override // android.media.AudioDeviceCallback
            public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                TPNativeLog.printLog(2, TPHeadsetPluginDetector.TAG, "onAudioDevicesAdded!");
                TPHeadsetPluginDetector.notifyAudioOutputStateChange(TPHeadsetPluginDetector.mCurOutputs, TPHeadsetPluginDetector.getAudioOutputs());
            }

            @Override // android.media.AudioDeviceCallback
            public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                TPNativeLog.printLog(2, TPHeadsetPluginDetector.TAG, "onAudioDevicesRemoved!");
                TPHeadsetPluginDetector.notifyAudioOutputStateChange(TPHeadsetPluginDetector.mCurOutputs, TPHeadsetPluginDetector.getAudioOutputs());
            }
        }, null);
        return true;
    }

    private static void registerReceiver() {
        WeakReference<Context> weakReference;
        if (registerDeviceCallback()) {
            return;
        }
        if (mReceiver == null) {
            mReceiver = new HeadsetPluginReceiver();
        }
        if (!isInitted || (weakReference = mContextRef) == null) {
            TPNativeLog.printLog(4, TAG, "registerReceiver failed, TPHeadsetPluginDetector is not init yet!");
            return;
        }
        Context context = weakReference.get();
        if (context == null) {
            TPNativeLog.printLog(4, TAG, "registerReceiver failed, context is null, maybe is invalid!");
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        intentFilter.addAction("android.media.AUDIO_BECOMING_NOISY");
        intentFilter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        context.registerReceiver(mReceiver, intentFilter);
    }

    public static void removeHeadsetPluginListener(HeadsetPluginListener headsetPluginListener) {
        synchronized (TPHeadsetPluginDetector.class) {
            listeners.remove(headsetPluginListener);
            if (listeners.isEmpty() && hasRegisterReceiver) {
                unregisterReceiver();
                hasRegisterReceiver = false;
            }
        }
    }

    private static void unregisterReceiver() {
        WeakReference<Context> weakReference;
        if (!isInitted || (weakReference = mContextRef) == null) {
            TPNativeLog.printLog(4, TAG, "registerReceiver failed, HeadsetPluginDetector is not init yet!");
            return;
        }
        Context context = weakReference.get();
        if (context == null) {
            TPNativeLog.printLog(4, TAG, "registerReceiver failed, context is null, maybe is invalid!");
        } else {
            context.unregisterReceiver(mReceiver);
        }
    }
}
