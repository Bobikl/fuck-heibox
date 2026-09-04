package com.tencent.liteav.txcplayer.ext.config;

import com.tencent.liteav.txcplayer.ext.host.EngineConst;
import com.tencent.liteav.txcplayer.ext.host.PluginInfo;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class PluginConfigCenter {
    private static final int[] sPluginIds = {2};
    private static final String[] sPluginName = {EngineConst.PluginName.MONET_PLUGIN_NAME};
    private static final int[] sPluginVersion = {1};
    private static final String[] sPluginClazzName = {EngineConst.PluginClazzName.MONET_PLUGIN_CLAZZ_NAME};
    private static final boolean[] sIsCorePlugin = {true};

    public static void loadPluginConfig(List<PluginInfo> list) {
        int i10 = 0;
        while (true) {
            int[] iArr = sPluginIds;
            if (i10 >= iArr.length) {
                return;
            }
            PluginInfo pluginInfo = new PluginInfo();
            pluginInfo.mPluginId = iArr[i10];
            pluginInfo.mPluginName = sPluginName[i10];
            pluginInfo.mPluginVersion = sPluginVersion[i10];
            pluginInfo.mPluginClazzName = sPluginClazzName[i10];
            pluginInfo.mIsCorePlugin = sIsCorePlugin[i10];
            list.add(pluginInfo);
            i10++;
        }
    }
}
