package com.tencent.thumbplayer.tcmedia.core.downloadproxy.apiinner;

import android.net.Network;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDLProxyLogListener;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadListener;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPOfflineDownloadListener;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPreLoadListener;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.jni.TPDownloadProxyNative;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils.TPCGIRequester;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils.TPDLProxyLog;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils.TPDLProxyUtils;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils.TVKThreadUtil;
import java.io.FileDescriptor;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import org.apache.tools.ant.taskdefs.optional.ejb.g;

/* JADX INFO: loaded from: classes4.dex */
public class TPListenerManager {
    private static final String FILE_NAME = "TPListenerManager";
    private static final int MSG_CONFIG_URL = 2011;
    private static final int MSG_CURRENT_CDN_URL = 5;
    private static final int MSG_CURRENT_CDN_URL_INFO = 6;
    private static final int MSG_DID_RELEASE_MEMORY = 2016;
    private static final int MSG_DOWNLOAD_PROTOCOL = 9;
    private static final int MSG_DOWNLOAD_STATUS = 8;
    private static final int MSG_ERROR = 4;
    private static final int MSG_FINISH = 3;
    private static final int MSG_M3U8_REFRESH = 2017;
    private static final int MSG_MULTI_NETWORK_LOW_SPEED = 2020;
    private static final int MSG_MULTI_NETWORK_STATUS = 2021;
    private static final int MSG_NOTIFY_FLV_PRELOAD_STATUS = 2009;
    private static final int MSG_NOTIFY_HIT_CACHE = 3201;
    private static final int MSG_NOTIFY_HTTP_HEADER = 2006;
    private static final int MSG_NOTIFY_LOSE_PACKAGE_CEHCK = 2004;
    private static final int MSG_NOTIFY_M3U8_CONTENT = 2007;
    private static final int MSG_NOTIFY_PLAYER_SWITCH_DEFINITION = 2003;
    private static final int MSG_NOTIFY_SOCKET_FD = 2008;
    private static final int MSG_PLAY_VIDEO_NOT_FOUND = 101;
    private static final int MSG_PREPARE_FINISH = 50;
    private static final int MSG_PROGRESS = 2;
    private static final int MSG_PROXY_CANCEL_READ_DATA = 202;
    private static final int MSG_PROXY_GET_CONTENT_TYPE = 205;
    private static final int MSG_PROXY_GET_DATA_FILE_PATH = 204;
    private static final int MSG_PROXY_GET_DATA_TOTAL_SIZE = 203;
    private static final int MSG_PROXY_READ_DATA = 201;
    private static final int MSG_PROXY_START_READ_DATA = 200;
    private static final int MSG_QUIC_DOWNLOAD_STATUS = 3001;
    private static final int MSG_REPORT_QUIC_QUALITY = 3002;
    private static final int MSG_REPORT_URL = 2010;
    private static final int MSG_TAB_TESTID = 2014;
    private static final int MSG_URL_EXPIRED = 7;
    private static final int MSG_WILL_RELEASE_MEMORY = 2015;
    private static final int MSG_WUJI_CONFIG_URL = 2013;
    private static final String THREAD_NAME = "TVKDL-Listener";
    private ITPDownloadListener mITPDownloadListener;
    private Handler mMsgHandler;
    private HandlerThread mMsgHandlerThread;
    private Network mNetwork;
    private Map<Integer, ITPOfflineDownloadListener> mOfflineDownloadListenerMap;
    private Map<Integer, ITPPlayListener> mPlayListenerMap;
    private Map<Integer, ITPPreLoadListener> mPreLoadListenerMap;
    private Runnable updatePlayerInfo;
    private static final Object PLAY_LISTENER_MAP_MUTEX = new Object();
    private static final Object PRELOAD_LISTENER_MAP_MUTEX = new Object();
    private static final Object OFFLINE_LISTENER_MAP_MUTEX = new Object();

    public static class SingletonHolder {
        private static final TPListenerManager INSTANCE = new TPListenerManager();

        private SingletonHolder() {
        }
    }

    private TPListenerManager() {
        this.mNetwork = null;
        this.mITPDownloadListener = null;
        this.mPlayListenerMap = new HashMap();
        this.mPreLoadListenerMap = new HashMap();
        this.mOfflineDownloadListenerMap = new HashMap();
        this.updatePlayerInfo = new Runnable() { // from class: com.tencent.thumbplayer.tcmedia.core.downloadproxy.apiinner.TPListenerManager.1
            @Override // java.lang.Runnable
            public void run() {
                Map map;
                synchronized (TPListenerManager.PLAY_LISTENER_MAP_MUTEX) {
                    map = TPListenerManager.this.mPlayListenerMap;
                }
                try {
                    for (Map.Entry entry : map.entrySet()) {
                        int iIntValue = ((Integer) entry.getKey()).intValue();
                        ITPPlayListener iTPPlayListener = (ITPPlayListener) entry.getValue();
                        int currentPosition = (int) (iTPPlayListener.getCurrentPosition() / 1000);
                        int playerBufferLength = (int) (iTPPlayListener.getPlayerBufferLength() / 1000);
                        int advRemainTime = (int) (iTPPlayListener.getAdvRemainTime() / 1000);
                        long[] currentPlayOffset = iTPPlayListener.getCurrentPlayOffset();
                        if (currentPlayOffset != null && currentPlayOffset.length == 2) {
                            TPDownloadProxyNative.getInstance().updateTaskInfo(iIntValue, TPDownloadProxyEnum.TASKINFO_PLAY_OFFSET, currentPlayOffset[0] + ";" + currentPlayOffset[1]);
                        }
                        TPDownloadProxyNative.getInstance().updatePlayerPlayMsg(iIntValue, currentPosition, playerBufferLength, advRemainTime);
                    }
                } catch (Throwable th2) {
                    try {
                        TPDLProxyLog.e(TPListenerManager.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "updatePlayerInfo failed, error:" + th2.toString());
                    } finally {
                        TPListenerManager.this.mMsgHandler.postDelayed(TPListenerManager.this.updatePlayerInfo, 1000L);
                    }
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchCallbackMessage(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ITPPlayListener playlistener = getPlaylistener(i11);
        if (playlistener != null) {
            dispatchPlayMessage(playlistener, i10, i11, obj, obj2, obj3, obj4, obj5);
            return;
        }
        ITPPreLoadListener preLoadListener = getPreLoadListener(i11);
        if (preLoadListener != null) {
            dispatchPreLoadMessage(preLoadListener, i10, i11, obj, obj2, obj3, obj4, obj5);
            return;
        }
        ITPOfflineDownloadListener offlineDownloadListener = getOfflineDownloadListener(i11);
        if (offlineDownloadListener != null) {
            dispatchOfflineDownloadMessage(offlineDownloadListener, i10, i11, obj, obj2, obj3, obj4, obj5);
            return;
        }
        if (this.mITPDownloadListener != null) {
            if (i10 == 2015) {
                this.mITPDownloadListener.willReleaseMemory(TPDLProxyUtils.byteArrayToString((byte[]) obj));
            } else if (i10 == 2016) {
                this.mITPDownloadListener.didReleaseMemory(TPDLProxyUtils.byteArrayToString((byte[]) obj));
            } else {
                if (i10 != 3002) {
                    return;
                }
                this.mITPDownloadListener.onQuicQualityReportUpdate(TPDLProxyUtils.byteArrayToString((byte[]) obj));
            }
        }
    }

    private void dispatchOfflineDownloadMessage(ITPOfflineDownloadListener iTPOfflineDownloadListener, int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (iTPOfflineDownloadListener == null) {
        }
        switch (i10) {
            case 2:
                iTPOfflineDownloadListener.onDownloadProgressUpdate(TPDLProxyUtils.objectToInt(obj, 0), TPDLProxyUtils.objectToInt(obj2, 0), TPDLProxyUtils.objectToLong(obj3, 0L), TPDLProxyUtils.objectToLong(obj4, 0L), TPDLProxyUtils.byteArrayToString((byte[]) obj5));
                break;
            case 3:
                iTPOfflineDownloadListener.onDownloadFinish();
                break;
            case 4:
                iTPOfflineDownloadListener.onDownloadError(((Integer) obj).intValue(), ((Integer) obj2).intValue(), TPDLProxyUtils.byteArrayToString((byte[]) obj3));
                break;
            case 5:
                iTPOfflineDownloadListener.onDownloadCdnUrlUpdate(TPDLProxyUtils.byteArrayToString((byte[]) obj));
                break;
            case 6:
                iTPOfflineDownloadListener.onDownloadCdnUrlInfoUpdate(TPDLProxyUtils.byteArrayToString((byte[]) obj), TPDLProxyUtils.byteArrayToString((byte[]) obj2), TPDLProxyUtils.byteArrayToString((byte[]) obj3), TPDLProxyUtils.byteArrayToString((byte[]) obj4));
                break;
            case 7:
                String strByteArrayToString = TPDLProxyUtils.byteArrayToString((byte[]) obj);
                long jObjectToLong = TPDLProxyUtils.objectToLong(obj2, 0L);
                HashMap map = new HashMap();
                if (!TextUtils.isEmpty(strByteArrayToString)) {
                    map.put("exttag", strByteArrayToString);
                    map.put("randnum", String.valueOf(jObjectToLong));
                }
                iTPOfflineDownloadListener.onDownloadCdnUrlExpired(map);
                break;
            case 8:
                iTPOfflineDownloadListener.onDownloadStatusUpdate(TPDLProxyUtils.objectToInt(obj, 0));
                break;
            case 9:
                iTPOfflineDownloadListener.onDownloadProtocolUpdate(TPDLProxyUtils.byteArrayToString((byte[]) obj), TPDLProxyUtils.byteArrayToString((byte[]) obj2));
                break;
        }
    }

    private void dispatchPlayMessage(ITPPlayListener iTPPlayListener, int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (iTPPlayListener == null) {
        }
        if (i10 == 2) {
            iTPPlayListener.onDownloadProgressUpdate(TPDLProxyUtils.objectToInt(obj, 0), TPDLProxyUtils.objectToInt(obj2, 0), TPDLProxyUtils.objectToLong(obj3, 0L), TPDLProxyUtils.objectToLong(obj4, 0L), TPDLProxyUtils.byteArrayToString((byte[]) obj5));
            return;
        }
        if (i10 == 3) {
            iTPPlayListener.onDownloadFinish();
            return;
        }
        if (i10 == 101) {
            String strByteArrayToString = TPDLProxyUtils.byteArrayToString((byte[]) obj);
            long jObjectToLong = TPDLProxyUtils.objectToLong(obj2, 0L);
            HashMap map = new HashMap();
            if (!TextUtils.isEmpty(strByteArrayToString)) {
                map.put("exttag", strByteArrayToString);
                map.put("randnum", String.valueOf(jObjectToLong));
            }
            iTPPlayListener.onPlayCallback(1, map, null, null, null);
            return;
        }
        if (i10 == 2009) {
            iTPPlayListener.onPlayCallback(5, Integer.valueOf(TPDLProxyUtils.objectToInt(obj, 0)), obj2 == null ? null : (byte[]) obj2, TPDLProxyUtils.byteArrayToString((byte[]) obj3), Integer.valueOf(TPDLProxyUtils.objectToInt(obj4, 0)));
            return;
        }
        if (i10 == 2014) {
            Object objByteArrayToString = TPDLProxyUtils.byteArrayToString((byte[]) obj);
            Object objByteArrayToString2 = TPDLProxyUtils.byteArrayToString((byte[]) obj2);
            iTPPlayListener.onPlayCallback(8, objByteArrayToString, objByteArrayToString2, null, null);
            TPDLProxyLog.i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "MSG_TAB_TESTID: ".concat(String.valueOf(objByteArrayToString2)));
            return;
        }
        if (i10 == 2017) {
            iTPPlayListener.onPlayCallback(9, null, null, null, null);
            return;
        }
        if (i10 == 3001) {
            iTPPlayListener.onPlayCallback(6, TPDLProxyUtils.byteArrayToString((byte[]) obj), null, null, null);
            return;
        }
        if (i10 == 3201) {
            iTPPlayListener.onPlayCallback(12, null, null, null, null);
            return;
        }
        if (i10 == 2003) {
            iTPPlayListener.onPlayCallback(2, TPDLProxyUtils.byteArrayToString((byte[]) obj), TPDLProxyUtils.byteArrayToString((byte[]) obj2), Integer.valueOf(TPDLProxyUtils.objectToInt(obj3, 0)), null);
            return;
        }
        if (i10 == 2004) {
            final int iObjectToInt = TPDLProxyUtils.objectToInt(obj2, 0);
            TVKThreadUtil.getScheduledExecutorServiceInstance().execute(new Runnable() { // from class: com.tencent.thumbplayer.tcmedia.core.downloadproxy.apiinner.TPListenerManager.3
                @Override // java.lang.Runnable
                public void run() {
                    TPDownloadProxyNative.getInstance().setUserData(TPDownloadProxyEnum.USER_LOSS_PACKAGE_INFO, TPDLProxyUtils.losePackageCheck(iObjectToInt));
                }
            });
            return;
        }
        if (i10 == 2006) {
            iTPPlayListener.onPlayCallback(3, TPDLProxyUtils.byteArrayToString((byte[]) obj), null, null, null);
            return;
        }
        if (i10 == 2007) {
            iTPPlayListener.onPlayCallback(4, TPDLProxyUtils.byteArrayToString((byte[]) obj), null, null, null);
            return;
        }
        if (i10 == 2020) {
            String strByteArrayToString2 = TPDLProxyUtils.byteArrayToString((byte[]) obj);
            iTPPlayListener.onPlayCallback(10, strByteArrayToString2, null, null, null);
            TPDLProxyLog.i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "MULTI_NETWORK msg: " + i10 + ", info: " + strByteArrayToString2);
            return;
        }
        if (i10 == 2021) {
            String strByteArrayToString3 = TPDLProxyUtils.byteArrayToString((byte[]) obj);
            iTPPlayListener.onPlayCallback(11, strByteArrayToString3, null, null, null);
            TPDLProxyLog.i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "MULTI_NETWORK msg: " + i10 + ", info: " + strByteArrayToString3);
            return;
        }
        switch (i10) {
            case 5:
                iTPPlayListener.onDownloadCdnUrlUpdate(TPDLProxyUtils.byteArrayToString((byte[]) obj));
                break;
            case 6:
                iTPPlayListener.onDownloadCdnUrlInfoUpdate(TPDLProxyUtils.byteArrayToString((byte[]) obj), TPDLProxyUtils.byteArrayToString((byte[]) obj2), TPDLProxyUtils.byteArrayToString((byte[]) obj3), TPDLProxyUtils.byteArrayToString((byte[]) obj4));
                break;
            case 7:
                String strByteArrayToString4 = TPDLProxyUtils.byteArrayToString((byte[]) obj);
                long jObjectToLong2 = TPDLProxyUtils.objectToLong(obj2, 0L);
                Map<String, String> map2 = new HashMap<>();
                if (!TextUtils.isEmpty(strByteArrayToString4)) {
                    map2.put("exttag", strByteArrayToString4);
                    map2.put("randnum", String.valueOf(jObjectToLong2));
                }
                iTPPlayListener.onDownloadCdnUrlExpired(map2);
                break;
            case 8:
                iTPPlayListener.onDownloadStatusUpdate(TPDLProxyUtils.objectToInt(obj, 0));
                break;
            case 9:
                iTPPlayListener.onDownloadProtocolUpdate(TPDLProxyUtils.byteArrayToString((byte[]) obj), TPDLProxyUtils.byteArrayToString((byte[]) obj2));
                break;
            default:
                break;
        }
    }

    private void dispatchPreLoadMessage(ITPPreLoadListener iTPPreLoadListener, int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (iTPPreLoadListener == null) {
            return;
        }
        if (i10 == 2) {
            iTPPreLoadListener.onPrepareDownloadProgressUpdate(TPDLProxyUtils.objectToInt(obj, 0), TPDLProxyUtils.objectToInt(obj2, 0), TPDLProxyUtils.objectToLong(obj3, 0L), TPDLProxyUtils.objectToLong(obj4, 0L), TPDLProxyUtils.byteArrayToString((byte[]) obj5));
        } else if (i10 == 4) {
            iTPPreLoadListener.onPrepareError(((Integer) obj).intValue(), ((Integer) obj2).intValue(), TPDLProxyUtils.byteArrayToString((byte[]) obj3));
        } else {
            if (i10 != 50) {
                return;
            }
            iTPPreLoadListener.onPrepareOK();
        }
    }

    public static TPListenerManager getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public ITPOfflineDownloadListener getOfflineDownloadListener(int i10) {
        ITPOfflineDownloadListener iTPOfflineDownloadListener;
        synchronized (OFFLINE_LISTENER_MAP_MUTEX) {
            iTPOfflineDownloadListener = this.mOfflineDownloadListenerMap.get(Integer.valueOf(i10));
        }
        return iTPOfflineDownloadListener;
    }

    public ITPPlayListener getPlaylistener(int i10) {
        ITPPlayListener iTPPlayListener;
        synchronized (PLAY_LISTENER_MAP_MUTEX) {
            iTPPlayListener = this.mPlayListenerMap.get(Integer.valueOf(i10));
        }
        return iTPPlayListener;
    }

    public ITPPreLoadListener getPreLoadListener(int i10) {
        ITPPreLoadListener iTPPreLoadListener;
        synchronized (PRELOAD_LISTENER_MAP_MUTEX) {
            iTPPreLoadListener = this.mPreLoadListenerMap.get(Integer.valueOf(i10));
        }
        return iTPPreLoadListener;
    }

    public synchronized void handleCallbackMessage(final int i10, final int i11, final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5) {
        if (2008 != i10) {
            if (i10 != 2010 && i10 != 2011 && i10 != 2013) {
                this.mMsgHandler.post(new Runnable() { // from class: com.tencent.thumbplayer.tcmedia.core.downloadproxy.apiinner.TPListenerManager.2
                    @Override // java.lang.Runnable
                    public void run() {
                        TPListenerManager.this.dispatchCallbackMessage(i10, i11, obj, obj2, obj3, obj4, obj5);
                    }
                });
                return;
            } else {
                TPCGIRequester.getInstance().addRequestItem(TPDLProxyUtils.byteArrayToString((byte[]) obj), i10);
                return;
            }
        }
        if (this.mNetwork == null) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "cellular_network, network is null");
            return;
        }
        String strByteArrayToString = TPDLProxyUtils.byteArrayToString((byte[]) obj);
        int i12 = Integer.parseInt(strByteArrayToString);
        try {
            FileDescriptor fileDescriptor = new FileDescriptor();
            Field declaredField = FileDescriptor.class.getDeclaredField(g.d.f134964e);
            declaredField.setAccessible(true);
            declaredField.setInt(fileDescriptor, i12);
            TPDLProxyLog.i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "cellular_network, bind begin, sock fd: ".concat(String.valueOf(i12)));
            this.mNetwork.bindSocket(fileDescriptor);
            TPDLProxyLog.i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "cellular_network, bind socket success, sock fd: ".concat(String.valueOf(i12)));
        } catch (Throwable th2) {
            TPDownloadProxyNative.getInstance().setUserData(TPDownloadProxyEnum.CELLULAR_NETWORK_INTERFACE_ID, "-1");
            TPDLProxyLog.i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "cellular_network, bind socket failed: " + th2.toString());
        }
        TPDLProxyLog.i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "cellular_network, sock call back end, sock fd: " + i12 + ", str_sock: " + strByteArrayToString);
    }

    public int handleIntCallbackMessage(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ITPPlayListener playlistener = getPlaylistener(i11);
        if (playlistener == null) {
            return 0;
        }
        if (i10 == 200) {
            return playlistener.onStartReadData(i11, TPDLProxyUtils.byteArrayToString((byte[]) obj), TPDLProxyUtils.objectToLong(obj2, 0L), TPDLProxyUtils.objectToLong(obj3, -1L));
        }
        if (i10 == 202) {
            return playlistener.onStopReadData(i11, TPDLProxyUtils.byteArrayToString((byte[]) obj), TPDLProxyUtils.objectToInt(obj2, 0));
        }
        if (i10 == 201) {
            return playlistener.onReadData(i11, TPDLProxyUtils.byteArrayToString((byte[]) obj), TPDLProxyUtils.objectToLong(obj2, 0L), TPDLProxyUtils.objectToInt(obj3, 0));
        }
        return 0;
    }

    public String handleStringCallbackMessage(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ITPPlayListener playlistener = getPlaylistener(i11);
        if (playlistener != null) {
            if (i10 == 205) {
                return playlistener.getContentType(i11, TPDLProxyUtils.byteArrayToString((byte[]) obj));
            }
            if (i10 == 203) {
                return String.valueOf(playlistener.getDataTotalSize(i11, TPDLProxyUtils.byteArrayToString((byte[]) obj)));
            }
            if (i10 == 204) {
                return playlistener.getDataFilePath(i11, TPDLProxyUtils.byteArrayToString((byte[]) obj));
            }
        }
        return "";
    }

    public void initHandler() {
        if (this.mMsgHandlerThread == null) {
            HandlerThread handlerThread = new HandlerThread(THREAD_NAME);
            this.mMsgHandlerThread = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(this.mMsgHandlerThread.getLooper());
            this.mMsgHandler = handler;
            handler.postDelayed(this.updatePlayerInfo, 1000L);
        }
    }

    public void removeAllPlayListener() {
        synchronized (PLAY_LISTENER_MAP_MUTEX) {
            this.mPlayListenerMap.clear();
        }
    }

    public void removeAllPreLoadListener() {
        synchronized (PRELOAD_LISTENER_MAP_MUTEX) {
            this.mPreLoadListenerMap.clear();
        }
    }

    public void removeOfflineDownloadListener(int i10) {
        if (i10 > 0) {
            synchronized (OFFLINE_LISTENER_MAP_MUTEX) {
                this.mOfflineDownloadListenerMap.remove(Integer.valueOf(i10));
            }
        }
    }

    public void removePlayListener(int i10) {
        if (i10 > 0) {
            synchronized (PLAY_LISTENER_MAP_MUTEX) {
                this.mPlayListenerMap.remove(Integer.valueOf(i10));
            }
        }
    }

    public void removePreLoadListener(int i10) {
        if (i10 > 0) {
            synchronized (PRELOAD_LISTENER_MAP_MUTEX) {
                this.mPreLoadListenerMap.remove(Integer.valueOf(i10));
            }
        }
    }

    public void setITPDownloadListener(ITPDownloadListener iTPDownloadListener) {
        this.mITPDownloadListener = iTPDownloadListener;
    }

    public void setNetwork(Network network) {
        TPDLProxyLog.i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "cellular_network, set network");
        this.mNetwork = network;
    }

    public void setOfflineDownloadListener(int i10, ITPOfflineDownloadListener iTPOfflineDownloadListener) {
        if (i10 <= 0 || iTPOfflineDownloadListener == null) {
            return;
        }
        synchronized (OFFLINE_LISTENER_MAP_MUTEX) {
            this.mOfflineDownloadListenerMap.put(Integer.valueOf(i10), iTPOfflineDownloadListener);
        }
    }

    public void setPlayListener(int i10, ITPPlayListener iTPPlayListener) {
        if (i10 <= 0 || iTPPlayListener == null) {
            return;
        }
        synchronized (PLAY_LISTENER_MAP_MUTEX) {
            this.mPlayListenerMap.put(Integer.valueOf(i10), iTPPlayListener);
        }
    }

    public void setPreLoadListener(int i10, ITPPreLoadListener iTPPreLoadListener) {
        if (i10 <= 0 || iTPPreLoadListener == null) {
            return;
        }
        synchronized (PRELOAD_LISTENER_MAP_MUTEX) {
            this.mPreLoadListenerMap.put(Integer.valueOf(i10), iTPPreLoadListener);
        }
    }
}
