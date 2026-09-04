package com.tencent.thumbplayer.tcmedia.core.downloadproxy.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.text.TextUtils;
import com.igexin.sdk.PushConsts;
import com.max.xiaoheihe.module.bbs.ChannelsDetailActivity;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.apiinner.TPListenerManager;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.jni.TPDownloadProxyNative;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils.TPDLFileSystem;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils.TPDLProxyLog;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils.TPDLProxyUtils;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class TPDownloadProxy implements ITPDownloadProxy {
    private static final String FILE_NAME = "TPDownloadProxy";
    private int mServiceType;
    private String mCurrentStoragePath = "";
    private boolean mIsInit = false;
    private Context mContext = null;

    public TPDownloadProxy(int i10) {
        this.mServiceType = i10;
    }

    private void getCellularNetwork(Context context) {
        if (context == null) {
            TPDLProxyLog.i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "cellular_network, context is null, can not set interface 4g");
            return;
        }
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        builder.addCapability(12);
        builder.addTransportType(0);
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            TPDLProxyLog.i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "cellular_network, connectivityManager is null, can not set interface 4g");
        } else {
            connectivityManager.requestNetwork(builder.build(), new ConnectivityManager.NetworkCallback() { // from class: com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxy.1
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network) {
                    super.onAvailable(network);
                    TPListenerManager.getInstance().setNetwork(network);
                    long networkHandle = network.getNetworkHandle();
                    TPDLProxyLog.i(TPDownloadProxy.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "cellular_network, net_id_t: ".concat(String.valueOf(networkHandle)));
                    TPDownloadProxy.this.setUserData(TPDownloadProxyEnum.CELLULAR_NETWORK_INTERFACE_ID, Long.valueOf(networkHandle));
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network) {
                    super.onLost(network);
                    TPDownloadProxy.this.setUserData(TPDownloadProxyEnum.CELLULAR_NETWORK_INTERFACE_ID, 0);
                    TPDLProxyLog.i(TPDownloadProxy.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "cellular_network failed");
                }
            });
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public boolean checkResourceExist(String str, String str2, long j10) {
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                return TPDownloadProxyNative.getInstance().checkResourceExist(str, str2, j10);
            } catch (Throwable th2) {
                TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "checkResourceExist failed, error:" + th2.toString());
            }
        }
        return false;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int checkResourceStatus(String str, String str2, int i10) {
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                return TPDownloadProxyNative.getInstance().checkResourceStatus(str, str2, i10);
            } catch (Throwable th2) {
                TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "checkResourceStatus failed, error:" + th2.toString());
            }
        }
        return -1;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int clearCache(String str, String str2, int i10) {
        return clearCache(str, str2, i10, -1L);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int clearCache(String str, String str2, int i10, long j10) {
        if (!TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            return -1;
        }
        try {
            return TPDownloadProxyNative.getInstance().clearCache(str, str2, i10, j10);
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "clearCache failed, error:" + th2.toString());
            return -1;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int deinit() {
        if (!TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            return -1;
        }
        try {
            this.mIsInit = false;
            return TPDownloadProxyNative.getInstance().deInitService(this.mServiceType);
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "deinit failed, error:" + th2.toString());
            return -1;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int deleteOfflineLicenseKeySetId(String str, String str2, String str3) {
        if (!TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            return -1;
        }
        try {
            return TPDownloadProxyNative.getInstance().deleteOfflineLicenseKeySetId(str, str2, str3);
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "deleteOfflineLicenseKeySetId failed, error:" + th2.toString());
            return -1;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public String getClipPlayUrl(int i10, int i11, int i12) {
        String strByteArrayToString = "";
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                strByteArrayToString = TPDLProxyUtils.byteArrayToString(TPDownloadProxyNative.getInstance().getClipPlayUrl(i10, i11, i12));
                if (i12 != 2) {
                    TPDownloadProxyNative.getInstance().startDownload(i10);
                }
            } catch (Throwable th2) {
                TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getClipPlayUrl failed, error:" + th2.toString());
            }
        }
        return strByteArrayToString;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public String getNativeInfo(int i10) {
        if (!TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            return null;
        }
        try {
            return TPDLProxyUtils.byteArrayToString(TPDownloadProxyNative.getInstance().getNativeInfo(i10));
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getNativeInfo failed, error:" + th2.toString());
            return null;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public byte[] getOfflineLicenseKeySetId(String str, String str2, String str3) {
        if (!TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            return null;
        }
        try {
            return TPDownloadProxyNative.getInstance().getOfflineLicenseKeySetId(str, str2, str3);
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getOfflineLicenseKeySetId failed, error:" + th2.toString());
            return null;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public TPDLProxyMsg.TPPDTInfo[] getPDTInfos(int i10) {
        if (i10 > 0 && TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                return TPDownloadProxyNative.getInstance().getPDTInfos(i10);
            } catch (Throwable th2) {
                TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getPDTInfos failed, error:" + th2.toString());
            }
        }
        return null;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public String getPlayErrorCodeStr(int i10) {
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                return TPDLProxyUtils.byteArrayToString(TPDownloadProxyNative.getInstance().getErrorCodeStr(i10));
            } catch (Throwable th2) {
                TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getPlayErrorCodeStr failed, error:" + th2.toString());
            }
        }
        return "";
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public String getPlayUrl(int i10, int i11) {
        String strByteArrayToString = "";
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                strByteArrayToString = TPDLProxyUtils.byteArrayToString(TPDownloadProxyNative.getInstance().getClipPlayUrl(i10, 1, i11));
                if (i11 != 2) {
                    TPDownloadProxyNative.getInstance().startDownload(i10);
                }
            } catch (Throwable th2) {
                TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getPlayUrl failed, error:" + th2.toString());
            }
        }
        return strByteArrayToString;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public float getResourceDownloadProgress(String str, String str2, long j10) {
        if (!TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            return 0.0f;
        }
        try {
            return TPDownloadProxyNative.getInstance().getResourceDownloadProgress(str, str2, j10);
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getResourceDownloadProgress failed, error:" + th2.toString());
            return 0.0f;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public long getResourceSize(String str, String str2) {
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                return TPDownloadProxyNative.getInstance().getResourceSize(str, str2);
            } catch (Throwable th2) {
                TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getResourceSize failed, error:" + th2.toString());
            }
        }
        return -1L;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00bb A[Catch: all -> 0x0104, TryCatch #1 {all -> 0x0104, blocks: (B:10:0x0023, B:12:0x002d, B:13:0x0036, B:15:0x003c, B:16:0x004a, B:18:0x0054, B:19:0x005d, B:27:0x0077, B:28:0x0091, B:30:0x00a2, B:32:0x00aa, B:37:0x00dd, B:39:0x00f8, B:41:0x00fd, B:42:0x0100, B:33:0x00bb, B:35:0x00c5, B:36:0x00cb, B:22:0x0069, B:24:0x0071), top: B:54:0x0023, outer: #0, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c5 A[Catch: all -> 0x0104, TryCatch #1 {all -> 0x0104, blocks: (B:10:0x0023, B:12:0x002d, B:13:0x0036, B:15:0x003c, B:16:0x004a, B:18:0x0054, B:19:0x005d, B:27:0x0077, B:28:0x0091, B:30:0x00a2, B:32:0x00aa, B:37:0x00dd, B:39:0x00f8, B:41:0x00fd, B:42:0x0100, B:33:0x00bb, B:35:0x00c5, B:36:0x00cb, B:22:0x0069, B:24:0x0071), top: B:54:0x0023, outer: #0, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00f8 A[Catch: all -> 0x0104, TryCatch #1 {all -> 0x0104, blocks: (B:10:0x0023, B:12:0x002d, B:13:0x0036, B:15:0x003c, B:16:0x004a, B:18:0x0054, B:19:0x005d, B:27:0x0077, B:28:0x0091, B:30:0x00a2, B:32:0x00aa, B:37:0x00dd, B:39:0x00f8, B:41:0x00fd, B:42:0x0100, B:33:0x00bb, B:35:0x00c5, B:36:0x00cb, B:22:0x0069, B:24:0x0071), top: B:54:0x0023, outer: #0, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00fd A[Catch: all -> 0x0104, TryCatch #1 {all -> 0x0104, blocks: (B:10:0x0023, B:12:0x002d, B:13:0x0036, B:15:0x003c, B:16:0x004a, B:18:0x0054, B:19:0x005d, B:27:0x0077, B:28:0x0091, B:30:0x00a2, B:32:0x00aa, B:37:0x00dd, B:39:0x00f8, B:41:0x00fd, B:42:0x0100, B:33:0x00bb, B:35:0x00c5, B:36:0x00cb, B:22:0x0069, B:24:0x0071), top: B:54:0x0023, outer: #0, inners: #2 }] */
    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public synchronized int init(Context context, TPDLProxyInitParam tPDLProxyInitParam) {
        int iInitService;
        IntentFilter intentFilter;
        BroadcastReceiver broadcastReceiver;
        if (this.mIsInit) {
            TPDLProxyLog.i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "download already init");
            return 0;
        }
        TPDownloadProxyNative.getInstance().setAppContext(context);
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                if (!TextUtils.isEmpty(tPDLProxyInitParam.getAppVer())) {
                    setUserData(TPDownloadProxyEnum.USER_APP_VERSION, tPDLProxyInitParam.getAppVer());
                }
                if (tPDLProxyInitParam.getPlatform() > 0) {
                    setUserData("platform", Integer.valueOf(tPDLProxyInitParam.getPlatform()));
                }
                if (!TextUtils.isEmpty(tPDLProxyInitParam.getGuid())) {
                    setUserData(TPDownloadProxyEnum.USER_GUID, tPDLProxyInitParam.getGuid());
                }
                String cacheDir = tPDLProxyInitParam.getCacheDir();
                if (!TextUtils.isEmpty(cacheDir) || context == null) {
                    TPListenerManager.getInstance().initHandler();
                    if (TextUtils.isEmpty(tPDLProxyInitParam.getDataDir()) || TextUtils.isEmpty(this.mCurrentStoragePath)) {
                        if (!TextUtils.isEmpty(tPDLProxyInitParam.getDataDir())) {
                            this.mCurrentStoragePath = tPDLProxyInitParam.getDataDir();
                        }
                        iInitService = TPDownloadProxyNative.getInstance().initService(this.mServiceType, cacheDir, tPDLProxyInitParam.getDataDir(), tPDLProxyInitParam.getConfigStr());
                    } else {
                        iInitService = TPDownloadProxyNative.getInstance().initService(this.mServiceType, cacheDir, this.mCurrentStoragePath, tPDLProxyInitParam.getConfigStr());
                    }
                    intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.SCREEN_OFF");
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    intentFilter.addAction(PushConsts.ACTION_BROADCAST_USER_PRESENT);
                    broadcastReceiver = new BroadcastReceiver() { // from class: com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxy.2
                        @Override // android.content.BroadcastReceiver
                        public void onReceive(Context context2, Intent intent) {
                            String action = intent.getAction();
                            if ("android.intent.action.SCREEN_OFF".equals(action)) {
                                TPDownloadProxy.this.pushEvent(20);
                            } else if ("android.intent.action.SCREEN_ON".equals(action)) {
                                TPDownloadProxy.this.pushEvent(19);
                            }
                        }
                    };
                    if (context != null) {
                        context.registerReceiver(broadcastReceiver, intentFilter);
                    }
                    if (iInitService == 0) {
                        this.mIsInit = true;
                    }
                    this.mContext = context;
                    return iInitService;
                }
                try {
                    File properCacheDirectory = TPDLFileSystem.getProperCacheDirectory(context, ChannelsDetailActivity.f79595e4);
                    if (properCacheDirectory != null) {
                        cacheDir = properCacheDirectory.getAbsolutePath();
                    }
                } catch (Throwable th2) {
                    TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "init get cache dir failed, error:" + th2.toString());
                }
                TPListenerManager.getInstance().initHandler();
                if (TextUtils.isEmpty(tPDLProxyInitParam.getDataDir())) {
                    if (!TextUtils.isEmpty(tPDLProxyInitParam.getDataDir())) {
                        this.mCurrentStoragePath = tPDLProxyInitParam.getDataDir();
                    }
                    iInitService = TPDownloadProxyNative.getInstance().initService(this.mServiceType, cacheDir, tPDLProxyInitParam.getDataDir(), tPDLProxyInitParam.getConfigStr());
                } else {
                    if (!TextUtils.isEmpty(tPDLProxyInitParam.getDataDir())) {
                        this.mCurrentStoragePath = tPDLProxyInitParam.getDataDir();
                    }
                    iInitService = TPDownloadProxyNative.getInstance().initService(this.mServiceType, cacheDir, tPDLProxyInitParam.getDataDir(), tPDLProxyInitParam.getConfigStr());
                }
                intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction(PushConsts.ACTION_BROADCAST_USER_PRESENT);
                broadcastReceiver = new BroadcastReceiver() { // from class: com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxy.2
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context2, Intent intent) {
                        String action = intent.getAction();
                        if ("android.intent.action.SCREEN_OFF".equals(action)) {
                            TPDownloadProxy.this.pushEvent(20);
                        } else if ("android.intent.action.SCREEN_ON".equals(action)) {
                            TPDownloadProxy.this.pushEvent(19);
                        }
                    }
                };
                if (context != null) {
                    context.registerReceiver(broadcastReceiver, intentFilter);
                }
                if (iInitService == 0) {
                    this.mIsInit = true;
                }
                this.mContext = context;
                return iInitService;
            } catch (Throwable th3) {
                TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "init failed, error:" + th3.toString());
            }
            throw th;
        }
        return -1;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int pauseDownload(int i10) {
        if (i10 > 0 && TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                return TPDownloadProxyNative.getInstance().pauseDownload(i10);
            } catch (Throwable th2) {
                TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "pauseDownload failed, error:" + th2.toString());
            }
        }
        return -1;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public void pushEvent(int i10) {
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                TPDownloadProxyNative.getInstance().pushEvent(i10);
                if (9 == i10) {
                    TPDLProxyLog.i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "cellular_network, update net interface info");
                    getCellularNetwork(this.mContext);
                }
            } catch (Throwable th2) {
                TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "cellular_network pushEvent failed, error:" + th2.toString());
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int removeStorageCache(String str) {
        return removeStorageCache(str, -1L);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int removeStorageCache(String str, long j10) {
        if (!TextUtils.isEmpty(str) && TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                return TPDownloadProxyNative.getInstance().deleteCache(this.mCurrentStoragePath, str, j10);
            } catch (Throwable th2) {
                TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "deleteCache failed, error:" + th2.toString());
            }
        }
        return -1;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int resumeDownload(int i10) {
        if (i10 > 0 && TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                return TPDownloadProxyNative.getInstance().resumeDownload(i10);
            } catch (Throwable th2) {
                TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "resumeDownload failed, error:" + th2.toString());
            }
        }
        return -1;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public boolean setClipInfo(int i10, int i11, String str, TPDownloadParam tPDownloadParam) {
        int dlType = tPDownloadParam.getDlType();
        if (tPDownloadParam.isOffline()) {
            dlType += 300;
        }
        int i12 = dlType;
        if (!TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            return false;
        }
        try {
            return TPDownloadProxyNative.getInstance().setClipInfo(i10, i11, str, i12, tPDownloadParam.getCdnUrls(), tPDownloadParam.getSavaPath(), tPDownloadParam.getExtraJsonInfo()) >= 0;
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "setClipInfo failed, error:" + th2.toString());
            return false;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public void setLogListener(ITPDLProxyLogListener iTPDLProxyLogListener) {
        TPDLProxyLog.setLogListener(this.mServiceType, iTPDLProxyLogListener);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public void setMaxStorageSizeMB(long j10) {
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                TPDownloadProxyNative.getInstance().setMaxStorageSizeMB(this.mServiceType, j10);
            } catch (Throwable th2) {
                TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "setMaxStorageSizeMB failed, error:" + th2.toString());
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public void setPlayState(int i10, int i11) {
        if (i10 > 0 && TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                TPDownloadProxyNative.getInstance().setPlayerState(i10, i11);
                if (i11 == 1) {
                    long[] currentPlayOffset = TPListenerManager.getInstance().getPlaylistener(i10).getCurrentPlayOffset();
                    int currentPosition = (int) (TPListenerManager.getInstance().getPlaylistener(i10).getCurrentPosition() / 1000);
                    int playerBufferLength = (int) (TPListenerManager.getInstance().getPlaylistener(i10).getPlayerBufferLength() / 1000);
                    int advRemainTime = (int) (TPListenerManager.getInstance().getPlaylistener(i10).getAdvRemainTime() / 1000);
                    if (currentPlayOffset != null && currentPlayOffset.length == 2) {
                        TPDownloadProxyNative.getInstance().updateTaskInfo(i10, TPDownloadProxyEnum.TASKINFO_PLAY_OFFSET, currentPlayOffset[0] + ";" + currentPlayOffset[1]);
                    }
                    TPDownloadProxyNative.getInstance().updatePlayerPlayMsg(i10, currentPosition, playerBufferLength, advRemainTime);
                }
            } catch (Throwable th2) {
                TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "setPlayState failed, error:" + th2.toString());
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public void setUserData(String str, Object obj) {
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                if (str.equalsIgnoreCase(TPDownloadProxyEnum.USER_APP_VERSION)) {
                    TPDownloadProxyNative.getInstance().setUserData(TPDownloadProxyEnum.USER_APP_VERSION, (String) obj);
                    return;
                }
                if (str.equalsIgnoreCase("platform")) {
                    TPDownloadProxyNative.getInstance().setUserData("platform", obj.toString());
                    return;
                }
                if (str.equalsIgnoreCase(TPDownloadProxyEnum.USER_GUID)) {
                    TPDownloadProxyNative.getInstance().setUserData(TPDownloadProxyEnum.USER_GUID, (String) obj);
                    return;
                }
                if (str.equalsIgnoreCase(TPDownloadProxyEnum.USER_IS_VIP)) {
                    TPDownloadProxyNative.getInstance().setUserData(TPDownloadProxyEnum.USER_IS_VIP, ((Boolean) obj).booleanValue() ? "1" : "0");
                    return;
                }
                if (str.equalsIgnoreCase(TPDownloadProxyEnum.USER_UPC)) {
                    TPDownloadProxyNative.getInstance().setUserData(TPDownloadProxyEnum.USER_UPC, (String) obj);
                    return;
                }
                if (str.equalsIgnoreCase(TPDownloadProxyEnum.USER_UPC_STATE)) {
                    TPDownloadProxyNative.getInstance().setUserData(TPDownloadProxyEnum.USER_UPC_STATE, obj.toString());
                } else if (str.equalsIgnoreCase(TPDownloadProxyEnum.USER_PROXY_CONFIG)) {
                    TPDownloadProxyNative.getInstance().setUserData(TPDownloadProxyEnum.USER_PROXY_CONFIG, obj.toString());
                } else {
                    TPDownloadProxyNative.getInstance().setUserData(str, obj.toString());
                }
            } catch (Throwable th2) {
                TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "setUserData failed, error:" + th2.toString());
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int startClipOfflineDownload(String str, int i10, ITPOfflineDownloadListener iTPOfflineDownloadListener) {
        int iCreateDownloadTask = -1;
        if (!TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            return -1;
        }
        try {
            iCreateDownloadTask = TPDownloadProxyNative.getInstance().createDownloadTask(this.mServiceType, str, 102, i10);
            TPListenerManager.getInstance().setOfflineDownloadListener(iCreateDownloadTask, iTPOfflineDownloadListener);
            return iCreateDownloadTask;
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "startClipOfflineDownload failed, error:" + th2.toString());
            return iCreateDownloadTask;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int startClipPlay(String str, int i10, ITPPlayListener iTPPlayListener) {
        int iCreateDownloadTask = -1;
        if (!TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            return -1;
        }
        try {
            iCreateDownloadTask = TPDownloadProxyNative.getInstance().createDownloadTask(this.mServiceType, str, 2, i10);
            TPListenerManager.getInstance().setPlayListener(iCreateDownloadTask, iTPPlayListener);
            return iCreateDownloadTask;
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "startClipPlay failed, error:" + th2.toString());
            return iCreateDownloadTask;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int startClipPreload(String str, int i10, ITPPreLoadListener iTPPreLoadListener) {
        int iCreateDownloadTask = -1;
        if (!TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            return -1;
        }
        try {
            iCreateDownloadTask = TPDownloadProxyNative.getInstance().createDownloadTask(this.mServiceType, str, 202, i10);
            TPListenerManager.getInstance().setPreLoadListener(iCreateDownloadTask, iTPPreLoadListener);
            return iCreateDownloadTask;
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "startClipPreload failed, error:" + th2.toString());
            return iCreateDownloadTask;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int startOfflineDownload(String str, TPDownloadParam tPDownloadParam, ITPOfflineDownloadListener iTPOfflineDownloadListener) {
        int iCreateDownloadTask = -1;
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                int dlType = tPDownloadParam.getDlType() + 100;
                iCreateDownloadTask = TPDownloadProxyNative.getInstance().createDownloadTask(this.mServiceType, str, dlType, tPDownloadParam.getClipCount());
                TPListenerManager.getInstance().setOfflineDownloadListener(iCreateDownloadTask, iTPOfflineDownloadListener);
                if (!TextUtils.isEmpty(tPDownloadParam.getKeyid())) {
                    str = tPDownloadParam.getKeyid();
                }
                TPDownloadProxyNative.getInstance().setClipInfo(iCreateDownloadTask, tPDownloadParam.getClipNo(), str, dlType, tPDownloadParam.getCdnUrls(), tPDownloadParam.getSavaPath(), tPDownloadParam.getExtraJsonInfo());
                TPDownloadProxyNative.getInstance().startDownload(iCreateDownloadTask);
            } catch (Throwable th2) {
                TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "stopOfflineDownload failed, error:" + th2.toString());
            }
        }
        return iCreateDownloadTask;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int startPlay(String str, TPDownloadParam tPDownloadParam, ITPPlayListener iTPPlayListener) {
        int dlType = tPDownloadParam.getDlType();
        if (iTPPlayListener != null) {
            tPDownloadParam.getExtInfoMap().put(TPDownloadProxyEnum.DLPARAM_ADV_REMAIN_TIME, Long.valueOf(iTPPlayListener.getAdvRemainTime() / 1000));
        }
        if (tPDownloadParam.isOffline()) {
            dlType += 300;
        }
        int iCreateDownloadTask = -1;
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                if (tPDownloadParam.isAdaptive() && (dlType == 3 || dlType == 5)) {
                    dlType += 400;
                }
                int i10 = dlType;
                iCreateDownloadTask = TPDownloadProxyNative.getInstance().createDownloadTask(this.mServiceType, str, i10, tPDownloadParam.getClipCount());
                TPListenerManager.getInstance().setPlayListener(iCreateDownloadTask, iTPPlayListener);
                if (!TextUtils.isEmpty(tPDownloadParam.getKeyid())) {
                    str = tPDownloadParam.getKeyid();
                }
                TPDownloadProxyNative.getInstance().setClipInfo(iCreateDownloadTask, tPDownloadParam.getClipNo(), str, i10, tPDownloadParam.getCdnUrls(), tPDownloadParam.getSavaPath(), tPDownloadParam.getExtraJsonInfo());
            } catch (Throwable th2) {
                TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "startPlay failed, error:" + th2.toString());
            }
        }
        return iCreateDownloadTask;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int startPreload(String str, TPDownloadParam tPDownloadParam, ITPPreLoadListener iTPPreLoadListener) {
        int iCreateDownloadTask = -1;
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                int dlType = tPDownloadParam.getDlType() + 200;
                iCreateDownloadTask = TPDownloadProxyNative.getInstance().createDownloadTask(this.mServiceType, str, dlType, tPDownloadParam.getClipCount());
                TPListenerManager.getInstance().setPreLoadListener(iCreateDownloadTask, iTPPreLoadListener);
                if (!TextUtils.isEmpty(tPDownloadParam.getKeyid())) {
                    str = tPDownloadParam.getKeyid();
                }
                TPDownloadProxyNative.getInstance().setClipInfo(iCreateDownloadTask, tPDownloadParam.getClipNo(), str, dlType, tPDownloadParam.getCdnUrls(), tPDownloadParam.getSavaPath(), tPDownloadParam.getExtraJsonInfo());
                TPDownloadProxyNative.getInstance().startDownload(iCreateDownloadTask);
            } catch (Throwable th2) {
                TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "startPreload failed, error:" + th2.toString());
            }
        }
        return iCreateDownloadTask;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public void startTask(int i10) {
        if (i10 > 0 && TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                TPDownloadProxyNative.getInstance().startDownload(i10);
            } catch (Throwable th2) {
                TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "startTask failed, error:" + th2.toString());
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public void stopOfflineDownload(int i10) {
        if (i10 > 0 && TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                TPDownloadProxyNative.getInstance().stopDownload(i10);
                TPListenerManager.getInstance().removeOfflineDownloadListener(i10);
            } catch (Throwable th2) {
                TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "stopOfflineDownload failed, error:" + th2.toString());
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public void stopPlay(int i10) {
        if (i10 > 0 && TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                TPDownloadProxyNative.getInstance().stopDownload(i10);
                TPListenerManager.getInstance().removePlayListener(i10);
            } catch (Throwable th2) {
                TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "stopPlay failed, error:" + th2.toString());
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public void stopPreload(int i10) {
        if (i10 > 0 && TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                TPDownloadProxyNative.getInstance().stopDownload(i10);
                TPListenerManager.getInstance().removePreLoadListener(i10);
            } catch (Throwable th2) {
                TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "stopPreload failed, error:" + th2.toString());
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public void switchToResolution(int i10, int i11, int i12) {
        if (i11 == 0 || i12 == 0 || !TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            return;
        }
        try {
            TPDownloadProxyNative.getInstance().switchToResolution(i10, i11, i12);
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "switchToResolution failed, error:" + th2.toString());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public void updateStoragePath(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.mCurrentStoragePath = str;
            TPDownloadProxyNative.getInstance().updateStoragePath(this.mServiceType, str);
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "updateStoragePath failed, error:" + th2.toString());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public void updateTaskInfo(int i10, String str, Object obj) {
        if (i10 > 0 && TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                TPDownloadProxyNative.getInstance().updateTaskInfo(i10, str, obj.toString());
            } catch (Throwable th2) {
                TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "updateTaskInfo failed, error:" + th2.toString());
            }
        }
    }
}
