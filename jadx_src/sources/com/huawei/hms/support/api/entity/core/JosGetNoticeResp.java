package com.huawei.hms.support.api.entity.core;

import android.content.Intent;
import com.huawei.hms.core.aidl.annotation.Packed;

/* JADX INFO: loaded from: classes7.dex */
public class JosGetNoticeResp extends JosBaseResp {

    @Packed
    private Intent noticeIntent;

    private static <T> T get(T t10) {
        return t10;
    }

    public Intent getNoticeIntent() {
        return (Intent) get(this.noticeIntent);
    }

    public void setNoticeIntent(Intent intent) {
        this.noticeIntent = intent;
    }
}
