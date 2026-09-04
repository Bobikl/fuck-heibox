package com.umeng.analytics.filter;

import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;

/* JADX INFO: compiled from: EventWhiteList.java */
/* JADX INFO: loaded from: classes4.dex */
public class b extends EventList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f104374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f104375b;

    public b(String str, String str2) {
        super(str, str2);
        this.f104375b = new Object();
    }

    @Override // com.umeng.analytics.filter.EventList
    protected void eventListChange() {
        if (TextUtils.isEmpty(this.mEventList)) {
            return;
        }
        synchronized (this.f104375b) {
            this.f104374a = null;
            this.f104374a = new d(true, this.mEventList);
        }
    }

    @Override // com.umeng.analytics.filter.EventList
    public boolean matchHit(String str) {
        boolean zA;
        if (TextUtils.isEmpty(this.mEventList)) {
            return true;
        }
        synchronized (this.f104375b) {
            if (this.f104374a == null) {
                this.f104374a = new d(true, this.mEventList);
            }
            zA = this.f104374a.a(str);
        }
        return zA;
    }

    @Override // com.umeng.analytics.filter.EventList
    public void setMD5ClearFlag(boolean z10) {
        AnalyticsConfig.CLEAR_EKV_WL = z10;
    }
}
