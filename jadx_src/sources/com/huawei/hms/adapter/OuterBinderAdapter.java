package com.huawei.hms.adapter;

import android.content.Context;
import com.huawei.hms.common.internal.Objects;
import com.huawei.hms.support.log.HMSLog;

/* JADX INFO: loaded from: classes7.dex */
public class OuterBinderAdapter extends BinderAdapter {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Object f60318j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static BinderAdapter f60319k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static String f60320l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static String f60321m;

    private OuterBinderAdapter(Context context, String str, String str2) {
        super(context, str, str2);
    }

    public static BinderAdapter getInstance(Context context, String str, String str2) {
        BinderAdapter binderAdapter;
        HMSLog.i("OuterBinderAdapter", "OuterBinderAdapter getInstance.");
        synchronized (f60318j) {
            if (f60319k == null) {
                f60320l = str;
                f60321m = str2;
                f60319k = new OuterBinderAdapter(context, str, str2);
            } else {
                if ((Objects.equal(f60320l, str) && Objects.equal(f60321m, str2)) ? false : true) {
                    HMSLog.i("OuterBinderAdapter", "OuterBinderAdapter getInstance refresh adapter");
                    f60320l = str;
                    f60321m = str2;
                    f60319k.unBind();
                    f60319k = new OuterBinderAdapter(context, str, str2);
                }
            }
            binderAdapter = f60319k;
        }
        return binderAdapter;
    }

    @Override // com.huawei.hms.adapter.BinderAdapter
    protected int getConnTimeOut() {
        return 1001;
    }

    @Override // com.huawei.hms.adapter.BinderAdapter
    protected int getMsgDelayDisconnect() {
        return 1002;
    }
}
