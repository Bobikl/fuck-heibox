package com.taobao.aranger.utils;

import android.net.Uri;
import android.os.IBinder;
import com.taobao.aranger.core.ipc.ChannelManager;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.logs.IPCLog;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class IPCRecycle {
    private static final String TAG = "IPCRecycle";
    private static volatile IPCRecycle sInstance;
    private final ReferenceQueue<Object> mReferenceQueue = new ReferenceQueue<>();
    private final ConcurrentHashMap<PhantomReference<Object>, String> mKeyMap = new ConcurrentHashMap<>();

    private IPCRecycle() {
    }

    public static IPCRecycle getInstance() {
        if (sInstance == null) {
            synchronized (IPCRecycle.class) {
                if (sInstance == null) {
                    sInstance = new IPCRecycle();
                }
            }
        }
        return sInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recycle(Object obj) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.mReferenceQueue) {
            while (true) {
                PhantomReference phantomReference = (PhantomReference) this.mReferenceQueue.poll();
                if (phantomReference == null) {
                    break;
                }
                String strRemove = this.mKeyMap.remove(phantomReference);
                if (strRemove != null) {
                    arrayList.add(strRemove);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        try {
            if (obj instanceof IBinder) {
                ChannelManager.getClientChannel((IBinder) obj).recycleClient(arrayList);
            } else if (obj instanceof Uri) {
                ChannelManager.getRemoteChannel((Uri) obj).recycleRemote(arrayList);
            }
        } catch (IPCException e10) {
            IPCLog.e(TAG, "[recycle][recycleClient]", e10, new Object[0]);
        }
    }

    public void register(final Object obj, Object obj2, String str) {
        this.mKeyMap.put(new PhantomReference<>(obj2, this.mReferenceQueue), str);
        IPCThreadCaller.post(false, new Runnable() { // from class: com.taobao.aranger.utils.IPCRecycle.1
            @Override // java.lang.Runnable
            public void run() {
                IPCRecycle.this.recycle(obj);
            }
        });
    }
}
