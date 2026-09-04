package com.tencent.thumbplayer.tcmedia.core.common;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Display;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class TPScreenRefreshRateDetector {
    public static final int DISPLAY_CHANGE = 10001;
    private static String TAG = "TPScreenRefreshRateDetector";
    private static boolean isInitted = false;
    private static WeakReference<Context> mContext;
    private static Handler mHandler;
    private static WindowManager mWindowManager;
    private static List<ScreenRefreshRateChangedListener> listeners = new LinkedList();
    private static float mCurScreenRefreshRate = 60.0f;
    private static DisplayManager mDisplayManager = null;
    private static DisplayManager.DisplayListener mDisplayListener = new DisplayManager.DisplayListener() { // from class: com.tencent.thumbplayer.tcmedia.core.common.TPScreenRefreshRateDetector.2
        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i10) {
            if (i10 == 0) {
                TPScreenRefreshRateDetector.mHandler.sendEmptyMessage(10001);
            }
            TPNativeLog.printLog(2, TPScreenRefreshRateDetector.TAG, "onDisplayChanged displayId:".concat(String.valueOf(i10)));
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i10) {
        }
    };

    public interface ScreenRefreshRateChangedListener {
        void onScreenRefreshRateChanged(float f10);
    }

    public static void addListener(ScreenRefreshRateChangedListener screenRefreshRateChangedListener) {
        synchronized (TPScreenRefreshRateDetector.class) {
            listeners.add(screenRefreshRateChangedListener);
        }
    }

    public static void deinit() {
        WeakReference<Context> weakReference;
        synchronized (TPScreenRefreshRateDetector.class) {
            if (isInitted && (weakReference = mContext) != null) {
                weakReference.clear();
                isInitted = false;
                TPNativeLog.printLog(2, TAG, "TPScreenRefreshRateDetector deinit succeed!");
            }
        }
    }

    private static Looper getLooper() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static float getScreenRefreshRate() {
        WeakReference<Context> weakReference = mContext;
        if (weakReference == null) {
            TPNativeLog.printLog(4, TAG, "Current mContext is null, set default.");
            return mCurScreenRefreshRate;
        }
        Context context = weakReference.get();
        if (context != null) {
            if (mWindowManager == null) {
                mWindowManager = (WindowManager) context.getSystemService("window");
            }
            if (mDisplayManager == null) {
                DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
                mDisplayManager = displayManager;
                displayManager.registerDisplayListener(mDisplayListener, mHandler);
            }
            WindowManager windowManager = mWindowManager;
            if (windowManager != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Display.Mode[] supportedModes = defaultDisplay.getSupportedModes();
                Display.Mode mode = defaultDisplay.getMode();
                TPNativeLog.printLog(2, TAG, "getMode width:" + mode.getPhysicalWidth() + " height:" + mode.getPhysicalHeight() + " refreshRate:" + mode.getRefreshRate() + " ModeId:" + mode.getModeId());
                String str = TAG;
                StringBuilder sb2 = new StringBuilder("getSupportedModes length:");
                sb2.append(supportedModes.length);
                TPNativeLog.printLog(2, str, sb2.toString());
                for (int i10 = 0; i10 < supportedModes.length; i10++) {
                    TPNativeLog.printLog(2, TAG, "getSupportedModes width:" + supportedModes[i10].getPhysicalWidth() + " height:" + supportedModes[i10].getPhysicalHeight() + " refreshRate:" + supportedModes[i10].getRefreshRate() + " ModeId:" + supportedModes[i10].getModeId());
                }
                mCurScreenRefreshRate = mode.getRefreshRate();
            }
        }
        return mCurScreenRefreshRate;
    }

    public static void init(Context context) {
        synchronized (TPScreenRefreshRateDetector.class) {
            TPNativeLog.printLog(2, TAG, "TPScreenRefreshRateDetector init enter!");
            if (isInitted) {
                return;
            }
            mContext = new WeakReference<>(context.getApplicationContext());
            isInitted = true;
            initHandleMsg();
            TPNativeLog.printLog(2, TAG, "TPScreenRefreshRateDetector init succeed!");
        }
    }

    public static void initHandleMsg() {
        mHandler = new Handler(getLooper()) { // from class: com.tencent.thumbplayer.tcmedia.core.common.TPScreenRefreshRateDetector.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (message.what == 10001 && TPScreenRefreshRateDetector.mDisplayManager != null) {
                    Display display = TPScreenRefreshRateDetector.mDisplayManager.getDisplay(0);
                    String string = display.getMode().toString();
                    TPNativeLog.printLog(2, TPScreenRefreshRateDetector.TAG, "handleMessage DISPLAY_CHANGE, mode:" + string.toString());
                    TPScreenRefreshRateDetector.notifyScreenRefreshRateChange(display.getMode().getRefreshRate());
                }
                super.handleMessage(message);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void notifyScreenRefreshRateChange(float f10) {
        boolean z10;
        if (Math.abs(f10 - mCurScreenRefreshRate) >= 1.0f) {
            TPNativeLog.printLog(2, TAG, "notifyScreenRefreshRateChange Change From " + mCurScreenRefreshRate + " to " + f10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            mCurScreenRefreshRate = f10;
            synchronized (TPScreenRefreshRateDetector.class) {
                Iterator<ScreenRefreshRateChangedListener> it = listeners.iterator();
                while (it.hasNext()) {
                    it.next().onScreenRefreshRateChanged(f10);
                }
            }
        }
    }

    public static void removeListener(ScreenRefreshRateChangedListener screenRefreshRateChangedListener) {
        synchronized (TPScreenRefreshRateDetector.class) {
            listeners.remove(screenRefreshRateChangedListener);
        }
    }
}
