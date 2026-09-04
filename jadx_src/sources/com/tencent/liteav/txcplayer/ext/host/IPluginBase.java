package com.tencent.liteav.txcplayer.ext.host;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface IPluginBase {
    PluginInfo getPluginInfo();

    void handleAsyncRequest(int i10, int i11, Map<String, Object> map, PluginCallback pluginCallback);

    void handleSyncRequest(int i10, int i11, Map<String, Object> map, Map<String, Object> map2);

    void onCreate(Context context);

    void onDestroy();
}
