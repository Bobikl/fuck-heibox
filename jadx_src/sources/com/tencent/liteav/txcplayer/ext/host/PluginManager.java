package com.tencent.liteav.txcplayer.ext.host;

import android.text.TextUtils;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.txcplayer.ext.config.PluginConfigCenter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class PluginManager {
    private static final String TAG = "HostEngine-PluginManager";
    private static PluginManager mInstance;
    private List<PluginInfo> mPluginConfigList;
    private ConcurrentHashMap<Integer, IPluginBase> mPluginMap = new ConcurrentHashMap<>();

    private PluginManager() {
    }

    private boolean _doLoadPlugin(PluginInfo pluginInfo) {
        int i10 = pluginInfo.mPluginId;
        if (this.mPluginMap.containsKey(Integer.valueOf(i10))) {
            LiteavLog.w(TAG, "[loadPlugin], pluginId has been loaded!!, pluginId=".concat(String.valueOf(i10)));
            return true;
        }
        IPluginBase iPluginBaseCreatePluginInstance = createPluginInstance(i10, pluginInfo.mPluginClazzName);
        if (iPluginBaseCreatePluginInstance == null) {
            LiteavLog.w(TAG, "[loadPlugin], pluginId=" + i10 + " is not exist, do not load!!");
            return false;
        }
        iPluginBaseCreatePluginInstance.onCreate(HostEngine.getInstance().getAppContext());
        this.mPluginMap.put(Integer.valueOf(i10), iPluginBaseCreatePluginInstance);
        LiteavLog.d(TAG, "[loadPlugin], succeed loading pluginId=" + i10 + " ,pluginClazzName=" + pluginInfo.mPluginClazzName);
        return true;
    }

    private IPluginBase createPluginInstance(int i10, String str) {
        LiteavLog.i(TAG, "[createPluginInstance],pluginId|" + i10 + "|clazzName|" + str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (IPluginBase) Class.forName(str).newInstance();
        } catch (Exception unused) {
            LiteavLog.w(TAG, "create pluginInstance exception, pluginId|" + i10 + "|clazzName|" + str + " is not install in dex!!");
            return null;
        }
    }

    private void doLoadPlugin() {
        for (PluginInfo pluginInfo : this.mPluginConfigList) {
            LiteavLog.d(TAG, "[loadPlugin], pluginId=" + pluginInfo.mPluginId + " ,pluginClazzName=" + pluginInfo.mPluginClazzName);
            if (pluginInfo.mIsCorePlugin) {
                _doLoadPlugin(pluginInfo);
            } else {
                LiteavLog.d(TAG, "[loadPlugin], pluginId=" + pluginInfo.mPluginId + " is not core plugin, do not load by default");
            }
        }
    }

    public static PluginManager getInstance() {
        if (mInstance == null) {
            synchronized (PluginManager.class) {
                if (mInstance == null) {
                    mInstance = new PluginManager();
                }
            }
        }
        return mInstance;
    }

    private void loadPluginConfig() {
        if (this.mPluginConfigList == null) {
            this.mPluginConfigList = new ArrayList();
        }
        PluginConfigCenter.loadPluginConfig(this.mPluginConfigList);
    }

    public boolean checkAndLoadPlugin(int i10) {
        if (this.mPluginMap.containsKey(Integer.valueOf(i10))) {
            return true;
        }
        PluginInfo pluginInfo = null;
        for (PluginInfo pluginInfo2 : this.mPluginConfigList) {
            if (pluginInfo2.mPluginId == i10) {
                pluginInfo = pluginInfo2;
                break;
            }
        }
        if (pluginInfo != null) {
            return _doLoadPlugin(pluginInfo);
        }
        return false;
    }

    public IPluginBase getPluginInstance(int i10) {
        return this.mPluginMap.get(Integer.valueOf(i10));
    }

    public void loadPlugin() {
        loadPluginConfig();
        doLoadPlugin();
    }

    public void unLoadPlugin() {
        Iterator<PluginInfo> it = this.mPluginConfigList.iterator();
        while (it.hasNext()) {
            int i10 = it.next().mPluginId;
            LiteavLog.w(TAG, "[unLoadPlugin], unLoadPlugin=".concat(String.valueOf(i10)));
            IPluginBase iPluginBase = this.mPluginMap.get(Integer.valueOf(i10));
            if (iPluginBase != null) {
                iPluginBase.onDestroy();
                this.mPluginMap.remove(Integer.valueOf(i10));
            }
        }
    }
}
