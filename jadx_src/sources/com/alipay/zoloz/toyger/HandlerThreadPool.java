package com.alipay.zoloz.toyger;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class HandlerThreadPool {
    private static final String TAG = "HandlerThreadPool";
    private static long sKeepAliveTime;
    private static Object sLock = new Object();
    private static HashMap<String, HandlerThreadItem> sThreads = new HashMap<>();

    public static class HandlerThreadItem extends Handler {
        static final int QUIT = 0;
        String name;
        int refCount;
        ManagedHandlerThread thread;

        HandlerThreadItem(String str, ManagedHandlerThread managedHandlerThread) {
            super(managedHandlerThread.getLooper());
            this.name = str;
            this.thread = managedHandlerThread;
        }

        int decRef() {
            int i10 = this.refCount - 1;
            this.refCount = i10;
            if (i10 >= 0) {
                return i10;
            }
            throw new IllegalStateException("defRef called on dead thread");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 0) {
                boolean z10 = false;
                synchronized (HandlerThreadPool.sLock) {
                    if (this.refCount == 0) {
                        HandlerThreadPool.sThreads.remove(this.name);
                        z10 = true;
                    }
                }
                if (z10) {
                    this.thread.doQuitSafely();
                    this.thread = null;
                }
            }
        }

        int incRef() {
            int i10 = this.refCount + 1;
            this.refCount = i10;
            return i10;
        }
    }

    public static class ManagedHandlerThread extends HandlerThread {
        private boolean isValidCall;

        ManagedHandlerThread(String str) {
            super(str);
            this.isValidCall = false;
        }

        void doQuit() {
            this.isValidCall = true;
            quit();
            this.isValidCall = false;
        }

        void doQuitSafely() {
            this.isValidCall = true;
            quitSafely();
            this.isValidCall = false;
        }

        @Override // android.os.HandlerThread
        public boolean quit() {
            if (this.isValidCall) {
                return super.quit();
            }
            throw new IllegalStateException("HandlerThread borrowed from HandlerThreadPool cannot call quit directory, use HandlerThreadPool.returnThread() instead");
        }

        @Override // android.os.HandlerThread
        public boolean quitSafely() {
            if (this.isValidCall) {
                return super.quitSafely();
            }
            throw new IllegalStateException("HandlerThread borrowed from HandlerThreadPool cannot call quitSafely directly, use HandlerThreadPool.returnThread() instead");
        }
    }

    public static HandlerThread borrowHandlerThread(String str) {
        HandlerThreadItem handlerThreadItem;
        synchronized (sLock) {
            handlerThreadItem = sThreads.get(str);
            if (handlerThreadItem == null || handlerThreadItem.thread == null) {
                ManagedHandlerThread managedHandlerThread = new ManagedHandlerThread(str);
                managedHandlerThread.start();
                HandlerThreadItem handlerThreadItem2 = new HandlerThreadItem(str, managedHandlerThread);
                sThreads.put(str, handlerThreadItem2);
                handlerThreadItem = handlerThreadItem2;
            }
            handlerThreadItem.removeMessages(0);
            handlerThreadItem.incRef();
        }
        return handlerThreadItem.thread;
    }

    public static void returnHandlerThread(HandlerThread handlerThread) {
        Log.d(TAG, "returnHandlerThread() called with: thread = [" + handlerThread + "]");
        if (handlerThread == null) {
            return;
        }
        String name = handlerThread.getName();
        synchronized (sLock) {
            HandlerThreadItem handlerThreadItem = sThreads.get(name);
            if (handlerThreadItem == null) {
                return;
            }
            if (handlerThreadItem.decRef() == 0) {
                Log.d(TAG, "returnHandlerThread() need quit for thread = [" + handlerThread + "]");
                handlerThreadItem.sendEmptyMessageDelayed(0, sKeepAliveTime);
            }
        }
    }

    public static void setKeepAliveTime(long j10) {
        sKeepAliveTime = j10;
    }
}
