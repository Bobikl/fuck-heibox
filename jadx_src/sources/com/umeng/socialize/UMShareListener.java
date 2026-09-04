package com.umeng.socialize;

import com.umeng.socialize.bean.SHARE_MEDIA;

/* JADX INFO: loaded from: classes4.dex */
public interface UMShareListener {
    void onCancel(SHARE_MEDIA share_media);

    void onError(SHARE_MEDIA share_media, Throwable th2);

    void onResult(SHARE_MEDIA share_media);

    void onStart(SHARE_MEDIA share_media);
}
