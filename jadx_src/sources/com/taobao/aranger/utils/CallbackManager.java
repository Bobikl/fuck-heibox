package com.taobao.aranger.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.util.k;
import com.taobao.aranger.ARanger;
import com.taobao.aranger.constant.Constants;
import com.taobao.aranger.intf.ProcessStateListener;
import com.taobao.aranger.logs.IPCLog;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class CallbackManager {
    private static final String TAG = "CallbackManager";
    private static volatile CallbackManager sInstance;
    private final IntentFilter intentFilter;
    private final ConcurrentHashMap<String, CallbackWrapper> mCallbackWrapperMap;
    private final CopyOnWriteArrayList<ProcessStateListener> mProcessStateListeners;
    private final BroadcastReceiver processStateReceiver = new BroadcastReceiver() { // from class: com.taobao.aranger.utils.CallbackManager.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String stringExtra = intent.getStringExtra(Constants.PARAM_PROCESS_NAME);
            if (Constants.ACTION_DISCONNECT.equals(intent.getAction())) {
                Iterator it = CallbackManager.this.mProcessStateListeners.iterator();
                while (it.hasNext()) {
                    try {
                        ((ProcessStateListener) it.next()).onProcessStop(stringExtra);
                    } catch (Throwable th2) {
                        IPCLog.e(CallbackManager.TAG, "[onReceive][onProcessStop]", th2, new Object[0]);
                    }
                }
                return;
            }
            Iterator it2 = CallbackManager.this.mProcessStateListeners.iterator();
            while (it2.hasNext()) {
                try {
                    ((ProcessStateListener) it2.next()).onProcessStart(stringExtra);
                } catch (Throwable th3) {
                    IPCLog.e(CallbackManager.TAG, "[onReceive][onProcessStart]", th3, new Object[0]);
                }
            }
        }
    };

    public static class CallbackWrapper {
        private final Object mCallback;
        private final boolean mUiThread;

        CallbackWrapper(boolean z10, Object obj, boolean z11) {
            if (z10) {
                this.mCallback = new WeakReference(obj);
            } else {
                this.mCallback = obj;
            }
            this.mUiThread = z11;
        }

        k<Boolean, Object> get() {
            Object obj = this.mCallback;
            if (obj instanceof WeakReference) {
                obj = ((WeakReference) obj).get();
            }
            return new k<>(Boolean.valueOf(this.mUiThread), obj);
        }
    }

    private CallbackManager() {
        IntentFilter intentFilter = new IntentFilter();
        this.intentFilter = intentFilter;
        this.mCallbackWrapperMap = new ConcurrentHashMap<>();
        this.mProcessStateListeners = new CopyOnWriteArrayList<>();
        intentFilter.addAction(Constants.ACTION_CONNECT);
        intentFilter.addAction(Constants.ACTION_DISCONNECT);
    }

    public static CallbackManager getInstance() {
        if (sInstance == null) {
            synchronized (CallbackManager.class) {
                if (sInstance == null) {
                    sInstance = new CallbackManager();
                }
            }
        }
        return sInstance;
    }

    void addCallback(String str, Object obj, boolean z10, boolean z11) {
        this.mCallbackWrapperMap.putIfAbsent(str, new CallbackWrapper(z10, obj, z11));
    }

    public k<Boolean, Object> getCallback(String str) {
        CallbackWrapper callbackWrapper = this.mCallbackWrapperMap.get(str);
        if (callbackWrapper == null) {
            return null;
        }
        k<Boolean, Object> kVar = callbackWrapper.get();
        if (kVar.f21264b == null) {
            this.mCallbackWrapperMap.remove(str);
        }
        return kVar;
    }

    public void registerProcessStateListener(ProcessStateListener processStateListener) {
        synchronized (this.mProcessStateListeners) {
            if (this.mProcessStateListeners.isEmpty()) {
                ARanger.getContext().registerReceiver(this.processStateReceiver, this.intentFilter);
            }
            this.mProcessStateListeners.add(processStateListener);
        }
    }

    public void removeCallback(String str) {
        this.mCallbackWrapperMap.remove(str);
    }

    public void unRegisterProcessStateListener(ProcessStateListener processStateListener) {
        synchronized (this.mProcessStateListeners) {
            this.mProcessStateListeners.remove(processStateListener);
            if (this.mProcessStateListeners.isEmpty()) {
                ARanger.getContext().unregisterReceiver(this.processStateReceiver);
            }
        }
    }
}
