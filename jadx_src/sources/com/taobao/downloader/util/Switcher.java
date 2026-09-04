package com.taobao.downloader.util;

import android.text.TextUtils;
import com.taobao.downloader.Configuration;
import com.taobao.downloader.adpater.CloundConfigAdapter;
import com.taobao.downloader.download.protocol.DLConfig;
import com.taobao.downloader.download.protocol.DLConnection;
import com.taobao.downloader.download.protocol.huc.HUCConnection;
import com.taobao.downloader.request.Item;

/* JADX INFO: loaded from: classes4.dex */
public class Switcher {
    private static boolean canUseAnetConnection(long j10, DLConfig dLConfig) {
        CloundConfigAdapter cloundConfigAdapter = Configuration.cloundConfigAdapter;
        if (cloundConfigAdapter == null) {
            return true;
        }
        boolean zEquals = "".equals(cloundConfigAdapter.getConfig("dlconnection_anet"));
        String config = Configuration.cloundConfigAdapter.getConfig("sizeSwitch_anet");
        boolean z10 = !"".equals(Configuration.cloundConfigAdapter.getConfig("lastUseHuc_anet"));
        int iIntValue = (TextUtils.isEmpty(config) || !TextUtils.isDigitsOnly(config)) ? 0 : Integer.valueOf(config).intValue();
        if (zEquals && (0 == j10 || j10 > iIntValue)) {
            if (!z10) {
                return true;
            }
            if (!dLConfig.isLastConnect() && !dLConfig.isLastRead()) {
                return true;
            }
        }
        return false;
    }

    public static DLConnection getConnection(Item item, DLConfig dLConfig) {
        if (Configuration.dlConnectionClazz == null) {
            return new HUCConnection();
        }
        if (canUseAnetConnection(item.size, dLConfig)) {
            try {
                return Configuration.dlConnectionClazz.newInstance();
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            } catch (InstantiationException e11) {
                e11.printStackTrace();
            }
        }
        return new HUCConnection();
    }

    public static int getDLReadBufferSize() {
        CloundConfigAdapter cloundConfigAdapter = Configuration.cloundConfigAdapter;
        if (cloundConfigAdapter == null) {
            return DLConfig.LARGE_BUFFER_SIZE;
        }
        String config = cloundConfigAdapter.getConfig("dl_buffersize");
        return (TextUtils.isEmpty(config) || !TextUtils.isDigitsOnly(config)) ? DLConfig.LARGE_BUFFER_SIZE : Integer.valueOf(config).intValue();
    }
}
