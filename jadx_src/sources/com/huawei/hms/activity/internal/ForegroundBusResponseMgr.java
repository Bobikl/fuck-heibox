package com.huawei.hms.activity.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class ForegroundBusResponseMgr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ForegroundBusResponseMgr f60273b = new ForegroundBusResponseMgr();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, BusResponseCallback> f60274a = new HashMap();

    public static ForegroundBusResponseMgr getInstance() {
        return f60273b;
    }

    public BusResponseCallback get(String str) {
        BusResponseCallback busResponseCallback;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f60274a) {
            busResponseCallback = this.f60274a.get(str);
        }
        return busResponseCallback;
    }

    public void registerObserver(String str, BusResponseCallback busResponseCallback) {
        if (TextUtils.isEmpty(str) || busResponseCallback == null) {
            return;
        }
        synchronized (this.f60274a) {
            if (!this.f60274a.containsKey(str)) {
                this.f60274a.put(str, busResponseCallback);
            }
        }
    }

    public void unRegisterObserver(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f60274a) {
            this.f60274a.remove(str);
        }
    }
}
