package com.huawei.hms.adapter;

import android.content.Context;
import com.huawei.hms.support.log.HMSLog;

/* JADX INFO: loaded from: classes7.dex */
public class InnerBinderAdapter extends BinderAdapter {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Object f60316j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static BinderAdapter f60317k;

    private InnerBinderAdapter(Context context, String str, String str2) {
        super(context, str, str2);
    }

    public static BinderAdapter getInstance(Context context, String str, String str2) {
        BinderAdapter binderAdapter;
        HMSLog.i("InnerBinderAdapter", "InnerBinderAdapter getInstance.");
        synchronized (f60316j) {
            if (f60317k == null) {
                f60317k = new InnerBinderAdapter(context, str, str2);
            }
            binderAdapter = f60317k;
        }
        return binderAdapter;
    }

    @Override // com.huawei.hms.adapter.BinderAdapter
    protected int getConnTimeOut() {
        return 2001;
    }

    @Override // com.huawei.hms.adapter.BinderAdapter
    protected int getMsgDelayDisconnect() {
        return 2002;
    }
}
