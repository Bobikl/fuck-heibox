package com.tencent.thumbplayer.tcmedia.core.downloadproxy.client;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import bb.c;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPreLoadListenerAidl;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.TPDownloadParamAidl;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDLProxyLogListener;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPOfflineDownloadListener;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPreLoadListener;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDLProxyInitParam;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDLProxyMsg;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadParam;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils.TPDLProxyLog;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils.TPDLProxyUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class TPDownloadProxyClient implements ITPDownloadProxy {
    private static final String FILE_NAME = "TPDownloadProxyClient";
    private ITPDownloadProxyAidl downloadProxyAidl;

    public TPDownloadProxyClient(ITPDownloadProxyAidl iTPDownloadProxyAidl) {
        this.downloadProxyAidl = iTPDownloadProxyAidl;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public boolean checkResourceExist(String str, String str2, long j10) {
        try {
            return this.downloadProxyAidl.checkResourceExist(str, str2, j10);
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "checkResourceExist failed, error:" + th2.toString());
            return false;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int checkResourceStatus(String str, String str2, int i10) {
        try {
            return this.downloadProxyAidl.checkResourceStatus(str, str2, i10);
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "checkResourceStatus failed, error:" + th2.toString());
            return -1;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int clearCache(String str, String str2, int i10) {
        return clearCache(str, str2, i10, -1L);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int clearCache(String str, String str2, int i10, long j10) {
        try {
            return this.downloadProxyAidl.clearCache(str, str2, i10, j10);
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "clearCache failed, error:" + th2.toString());
            return -1;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int deinit() {
        return 0;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int deleteOfflineLicenseKeySetId(String str, String str2, String str3) {
        try {
            return this.downloadProxyAidl.deleteOfflineLicenseKeySetId(str, str2, str3);
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "deleteOfflineLicenseKeySetId failed, error:" + th2.toString());
            return -1;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public String getClipPlayUrl(int i10, int i11, int i12) {
        try {
            return this.downloadProxyAidl.getClipPlayUrl(i10, i11, i12);
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getClipPlayUrl failed, error:" + th2.toString());
            return null;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public String getNativeInfo(int i10) {
        try {
            return this.downloadProxyAidl.getNativeInfo(i10);
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getNativeInfo failed, error:" + th2.toString());
            return null;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public byte[] getOfflineLicenseKeySetId(String str, String str2, String str3) {
        try {
            return this.downloadProxyAidl.getOfflineLicenseKeySetId(str, str2, str3);
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getOfflineLicenseKeySetId failed, error:" + th2.toString());
            return null;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public TPDLProxyMsg.TPPDTInfo[] getPDTInfos(int i10) {
        return new TPDLProxyMsg.TPPDTInfo[0];
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public String getPlayErrorCodeStr(int i10) {
        try {
            return this.downloadProxyAidl.getPlayErrorCodeStr(i10);
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getPlayErrorCodeStr failed, error:" + th2.toString());
            return null;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public String getPlayUrl(int i10, int i11) {
        try {
            return this.downloadProxyAidl.getPlayUrl(i10, i11);
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getPlayUrl failed, error:" + th2.toString());
            return null;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public float getResourceDownloadProgress(String str, String str2, long j10) {
        try {
            return this.downloadProxyAidl.getResourceDownloadProgress(str, str2, j10);
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getResourceDownloadProgress failed, error:" + th2.toString());
            return -1.0f;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public long getResourceSize(String str, String str2) {
        try {
            return this.downloadProxyAidl.getResourceSize(str, str2);
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getResourceSize failed, error:" + th2.toString());
            return -1L;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int init(Context context, TPDLProxyInitParam tPDLProxyInitParam) {
        String strSerialize = TPDLProxyUtils.serialize(tPDLProxyInitParam);
        if (TextUtils.isEmpty(strSerialize)) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "param is null");
            return -1;
        }
        try {
            return this.downloadProxyAidl.init(strSerialize);
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "init failed, error:" + th2.toString());
            return -2;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int pauseDownload(int i10) {
        try {
            return this.downloadProxyAidl.pauseDownload(i10);
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "pauseDownload failed, error:" + th2.toString());
            return -1;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public void pushEvent(int i10) {
        try {
            this.downloadProxyAidl.pushEvent(i10);
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "pushEvent failed, error:" + th2.toString());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int removeStorageCache(String str) {
        return removeStorageCache(str, -1L);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int removeStorageCache(String str, long j10) {
        try {
            return this.downloadProxyAidl.removeStorageCache(str, j10);
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "removeStorageCache failed, error:" + th2.toString());
            return -1;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int resumeDownload(int i10) {
        try {
            return this.downloadProxyAidl.resumeDownload(i10);
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "resumeDownload failed, error:" + th2.toString());
            return -1;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public boolean setClipInfo(int i10, int i11, String str, TPDownloadParam tPDownloadParam) {
        try {
            return this.downloadProxyAidl.setClipInfo(i10, i11, str, new TPDownloadParamAidl(tPDownloadParam.getUrlList(), tPDownloadParam.getDlType(), tPDownloadParam.getExtInfoMap()));
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "setClipInfo failed, error:" + th2.toString());
            return false;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public void setLogListener(ITPDLProxyLogListener iTPDLProxyLogListener) {
        TPDLProxyLog.setLogListener(c.l.N6, iTPDLProxyLogListener);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public void setMaxStorageSizeMB(long j10) {
        try {
            this.downloadProxyAidl.setMaxStorageSizeMB(j10);
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "setMaxStorageSizeMB failed, error:" + th2.toString());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public void setPlayState(int i10, int i11) {
        try {
            this.downloadProxyAidl.setPlayState(i10, i11);
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "setPlayState failed, error:" + th2.toString());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public void setUserData(String str, Object obj) {
        HashMap map = new HashMap();
        map.put(str, obj);
        try {
            this.downloadProxyAidl.setUserData(map);
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "setUserData failed, error:" + th2.toString());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int startClipOfflineDownload(String str, int i10, ITPOfflineDownloadListener iTPOfflineDownloadListener) {
        return -1;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int startClipPlay(String str, int i10, final ITPPlayListener iTPPlayListener) {
        try {
            if (iTPPlayListener == null) {
                return this.downloadProxyAidl.startClipPlay(str, i10, null);
            }
            return this.downloadProxyAidl.startClipPlay(str, i10, new ITPPlayListenerAidl.Stub() { // from class: com.tencent.thumbplayer.tcmedia.core.downloadproxy.client.TPDownloadProxyClient.2
                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                public long getAdvRemainTime() {
                    return iTPPlayListener.getAdvRemainTime();
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                public String getContentType(int i11, String str2) throws RemoteException {
                    return null;
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                public int getCurrentPlayClipNo() {
                    return iTPPlayListener.getCurrentPlayClipNo();
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                public long[] getCurrentPlayOffset() {
                    return iTPPlayListener.getCurrentPlayOffset();
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                public long getCurrentPosition() {
                    return iTPPlayListener.getCurrentPosition();
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                public String getDataFilePath(int i11, String str2) throws RemoteException {
                    return null;
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                public long getDataTotalSize(int i11, String str2) throws RemoteException {
                    return 0L;
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                public String getPlayInfo(String str2) {
                    Object playInfo = iTPPlayListener.getPlayInfo(str2);
                    if (playInfo == null || playInfo.getClass() != String.class) {
                        return null;
                    }
                    if (playInfo.getClass() == String.class) {
                        return (String) playInfo;
                    }
                    if (playInfo.getClass() == Integer.class) {
                        return Integer.toString(((Integer) playInfo).intValue());
                    }
                    return null;
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                public long getPlayerBufferLength() {
                    return iTPPlayListener.getPlayerBufferLength();
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                public void onDownloadCdnUrlExpired(Map map) {
                    iTPPlayListener.onDownloadCdnUrlExpired(map);
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                public void onDownloadCdnUrlInfoUpdate(String str2, String str3, String str4, String str5) {
                    iTPPlayListener.onDownloadCdnUrlInfoUpdate(str2, str3, str4, str5);
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                public void onDownloadCdnUrlUpdate(String str2) {
                    iTPPlayListener.onDownloadCdnUrlUpdate(str2);
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                public void onDownloadError(int i11, int i12, String str2) {
                    iTPPlayListener.onDownloadError(i11, i12, str2);
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                public void onDownloadFinish() {
                    iTPPlayListener.onDownloadFinish();
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                public void onDownloadProgressUpdate(int i11, int i12, long j10, long j11, String str2) {
                    iTPPlayListener.onDownloadProgressUpdate(i11, i12, j10, j11, str2);
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                public void onDownloadProtocolUpdate(String str2, String str3) {
                    iTPPlayListener.onDownloadProtocolUpdate(str2, str3);
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                public void onDownloadStatusUpdate(int i11) {
                    iTPPlayListener.onDownloadStatusUpdate(i11);
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                public int onPlayCallback(int i11, List list) {
                    Object objOnPlayCallback = 0;
                    if (list != null && !list.isEmpty()) {
                        if (list.size() == 1) {
                            objOnPlayCallback = iTPPlayListener.onPlayCallback(i11, list.get(0), null, null, null);
                        } else if (list.size() == 2) {
                            objOnPlayCallback = iTPPlayListener.onPlayCallback(i11, list.get(0), list.get(1), null, null);
                        } else if (list.size() == 3) {
                            objOnPlayCallback = iTPPlayListener.onPlayCallback(i11, list.get(0), list.get(1), list.get(2), null);
                        }
                    }
                    if (objOnPlayCallback == null || objOnPlayCallback.getClass() != Integer.class) {
                        return -1;
                    }
                    return ((Integer) objOnPlayCallback).intValue();
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                public int onReadData(int i11, String str2, long j10, long j11) throws RemoteException {
                    return 0;
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                public int onStartReadData(int i11, String str2, long j10, long j11) throws RemoteException {
                    return 0;
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                public int onStopReadData(int i11, String str2, int i12) throws RemoteException {
                    return 0;
                }
            });
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "startClipPlay failed, error:" + th2.toString());
            return -1;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int startClipPreload(String str, int i10, final ITPPreLoadListener iTPPreLoadListener) {
        try {
            return this.downloadProxyAidl.startClipPreload(str, i10, new ITPPreLoadListenerAidl.Stub() { // from class: com.tencent.thumbplayer.tcmedia.core.downloadproxy.client.TPDownloadProxyClient.4
                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPreLoadListenerAidl
                public void onPrepareDownloadProgressUpdate(int i11, int i12, long j10, long j11, String str2) {
                    iTPPreLoadListener.onPrepareDownloadProgressUpdate(i11, i12, j10, j11, str2);
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPreLoadListenerAidl
                public void onPrepareError(int i11, int i12, String str2) {
                    iTPPreLoadListener.onPrepareError(i11, i12, str2);
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPreLoadListenerAidl
                public void onPrepareOK() {
                    iTPPreLoadListener.onPrepareOK();
                }
            });
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "startClipPreload failed, error:" + th2.toString());
            return -1;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int startOfflineDownload(String str, TPDownloadParam tPDownloadParam, ITPOfflineDownloadListener iTPOfflineDownloadListener) {
        return -1;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int startPlay(String str, TPDownloadParam tPDownloadParam, final ITPPlayListener iTPPlayListener) {
        if (this.downloadProxyAidl != null && tPDownloadParam != null) {
            TPDownloadParamAidl tPDownloadParamAidl = new TPDownloadParamAidl(tPDownloadParam.getUrlList(), tPDownloadParam.getDlType(), tPDownloadParam.getExtInfoMap());
            try {
                if (iTPPlayListener == null) {
                    return this.downloadProxyAidl.startPlay(str, tPDownloadParamAidl, null);
                }
                return this.downloadProxyAidl.startPlay(str, tPDownloadParamAidl, new ITPPlayListenerAidl.Stub() { // from class: com.tencent.thumbplayer.tcmedia.core.downloadproxy.client.TPDownloadProxyClient.1
                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public long getAdvRemainTime() {
                        return iTPPlayListener.getAdvRemainTime();
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public String getContentType(int i10, String str2) throws RemoteException {
                        return iTPPlayListener.getContentType(i10, str2);
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public int getCurrentPlayClipNo() {
                        return iTPPlayListener.getCurrentPlayClipNo();
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public long[] getCurrentPlayOffset() {
                        return iTPPlayListener.getCurrentPlayOffset();
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public long getCurrentPosition() {
                        return iTPPlayListener.getCurrentPosition();
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public String getDataFilePath(int i10, String str2) throws RemoteException {
                        return iTPPlayListener.getDataFilePath(i10, str2);
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public long getDataTotalSize(int i10, String str2) throws RemoteException {
                        return iTPPlayListener.getDataTotalSize(i10, str2);
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public String getPlayInfo(String str2) {
                        Object playInfo = iTPPlayListener.getPlayInfo(str2);
                        if (playInfo == null || playInfo.getClass() != String.class) {
                            return null;
                        }
                        if (playInfo.getClass() == String.class) {
                            return (String) playInfo;
                        }
                        if (playInfo.getClass() == Integer.class) {
                            return Integer.toString(((Integer) playInfo).intValue());
                        }
                        return null;
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public long getPlayerBufferLength() {
                        return iTPPlayListener.getPlayerBufferLength();
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public void onDownloadCdnUrlExpired(Map map) {
                        iTPPlayListener.onDownloadCdnUrlExpired(map);
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public void onDownloadCdnUrlInfoUpdate(String str2, String str3, String str4, String str5) {
                        iTPPlayListener.onDownloadCdnUrlInfoUpdate(str2, str3, str4, str5);
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public void onDownloadCdnUrlUpdate(String str2) {
                        iTPPlayListener.onDownloadCdnUrlUpdate(str2);
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public void onDownloadError(int i10, int i11, String str2) {
                        iTPPlayListener.onDownloadError(i10, i11, str2);
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public void onDownloadFinish() {
                        iTPPlayListener.onDownloadFinish();
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public void onDownloadProgressUpdate(int i10, int i11, long j10, long j11, String str2) {
                        iTPPlayListener.onDownloadProgressUpdate(i10, i11, j10, j11, str2);
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public void onDownloadProtocolUpdate(String str2, String str3) {
                        iTPPlayListener.onDownloadProtocolUpdate(str2, str3);
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public void onDownloadStatusUpdate(int i10) {
                        iTPPlayListener.onDownloadStatusUpdate(i10);
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public int onPlayCallback(int i10, List list) {
                        Object objOnPlayCallback = 0;
                        if (list != null && !list.isEmpty()) {
                            if (list.size() == 1) {
                                objOnPlayCallback = iTPPlayListener.onPlayCallback(i10, list.get(0), null, null, null);
                            } else if (list.size() == 2) {
                                objOnPlayCallback = iTPPlayListener.onPlayCallback(i10, list.get(0), list.get(1), null, null);
                            } else if (list.size() == 3) {
                                objOnPlayCallback = iTPPlayListener.onPlayCallback(i10, list.get(0), list.get(1), list.get(2), null);
                            }
                        }
                        if (objOnPlayCallback == null || objOnPlayCallback.getClass() != Integer.class) {
                            return -1;
                        }
                        return ((Integer) objOnPlayCallback).intValue();
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public int onReadData(int i10, String str2, long j10, long j11) throws RemoteException {
                        return iTPPlayListener.onReadData(i10, str2, j10, j11);
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public int onStartReadData(int i10, String str2, long j10, long j11) throws RemoteException {
                        return iTPPlayListener.onStartReadData(i10, str2, j10, j11);
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public int onStopReadData(int i10, String str2, int i11) throws RemoteException {
                        return iTPPlayListener.onStopReadData(i10, str2, i11);
                    }
                });
            } catch (Throwable th2) {
                TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "startPlay failed, error:" + th2.toString());
            }
        }
        return -1;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public int startPreload(String str, TPDownloadParam tPDownloadParam, final ITPPreLoadListener iTPPreLoadListener) {
        try {
            return this.downloadProxyAidl.startPreload(str, new TPDownloadParamAidl(tPDownloadParam.getUrlList(), tPDownloadParam.getDlType(), tPDownloadParam.getExtInfoMap()), new ITPPreLoadListenerAidl.Stub() { // from class: com.tencent.thumbplayer.tcmedia.core.downloadproxy.client.TPDownloadProxyClient.3
                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPreLoadListenerAidl
                public void onPrepareDownloadProgressUpdate(int i10, int i11, long j10, long j11, String str2) {
                    iTPPreLoadListener.onPrepareDownloadProgressUpdate(i10, i11, j10, j11, str2);
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPreLoadListenerAidl
                public void onPrepareError(int i10, int i11, String str2) {
                    iTPPreLoadListener.onPrepareError(i10, i11, str2);
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPreLoadListenerAidl
                public void onPrepareOK() {
                    iTPPreLoadListener.onPrepareOK();
                }
            });
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "startPreload failed, error:" + th2.toString());
            return -1;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public void startTask(int i10) {
        try {
            this.downloadProxyAidl.startTask(i10);
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "startTask failed, error:" + th2.toString());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public void stopOfflineDownload(int i10) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public void stopPlay(int i10) {
        try {
            this.downloadProxyAidl.stopPlay(i10);
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "stopPlay failed, error:" + th2.toString());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public void stopPreload(int i10) {
        try {
            this.downloadProxyAidl.stopPreload(i10);
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "stopPreload failed, error:" + th2.toString());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public void switchToResolution(int i10, int i11, int i12) {
    }

    public void updateAidl(ITPDownloadProxyAidl iTPDownloadProxyAidl) {
        this.downloadProxyAidl = iTPDownloadProxyAidl;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public void updateStoragePath(String str) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy
    public void updateTaskInfo(int i10, String str, Object obj) {
        HashMap map = new HashMap();
        map.put(str, obj);
        try {
            this.downloadProxyAidl.updateTaskInfo(i10, map);
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "updateTaskInfo failed, error:" + th2.toString());
        }
    }
}
