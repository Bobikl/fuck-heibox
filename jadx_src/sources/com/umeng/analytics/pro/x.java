package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;

/* JADX INFO: compiled from: SessionIdGenerateServiceImpl.java */
/* JADX INFO: loaded from: classes4.dex */
public class x implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f104980a = AnalyticsConfig.kContinueSessionMillis;

    x() {
    }

    @Override // com.umeng.analytics.pro.w
    public long a() {
        return this.f104980a;
    }

    @Override // com.umeng.analytics.pro.w
    public String a(Context context) {
        String appkey = UMUtils.getAppkey(context);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (appkey == null) {
            throw new RuntimeException("Appkey is null or empty, Please check!");
        }
        return UMUtils.MD5(jCurrentTimeMillis + appkey + "02:00:00:00:00:00");
    }

    @Override // com.umeng.analytics.pro.w
    public void a(long j10) {
        this.f104980a = j10;
    }

    @Override // com.umeng.analytics.pro.w
    public void a(Context context, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            SharedPreferences.Editor editorEdit = PreferenceWrapper.getDefault(context).edit();
            editorEdit.putString("session_id", str);
            editorEdit.putLong(u.f104961b, 0L);
            editorEdit.putLong(u.f104964e, jCurrentTimeMillis);
            editorEdit.putLong(u.f104965f, 0L);
            editorEdit.commit();
        } catch (Exception unused) {
        }
    }

    @Override // com.umeng.analytics.pro.w
    public boolean a(long j10, long j11) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return (j10 == 0 || jCurrentTimeMillis - j10 >= this.f104980a) && j11 > 0 && jCurrentTimeMillis - j11 > this.f104980a;
    }
}
