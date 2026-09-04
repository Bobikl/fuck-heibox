package com.tencent.thumbplayer.tcmedia.api.proxy;

import android.content.Context;
import com.tencent.thumbplayer.tcmedia.c.g;

/* JADX INFO: loaded from: classes4.dex */
public class TPP2PProxyFactory {
    public static ITPPreloadProxy createPreloadManager(Context context, int i10) {
        return new g(context, i10);
    }
}
