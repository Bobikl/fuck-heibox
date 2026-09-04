package com.tencent.thumbplayer.tcmedia.core.drm.reuse;

import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.os.Handler;
import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLog;
import com.tencent.thumbplayer.tcmedia.core.drm.ITPMediaDrm;
import com.tencent.thumbplayer.tcmedia.core.drm.TPDirectMediaDrm;
import com.tencent.thumbplayer.tcmedia.core.drm.TPMediaDrmFatalException;
import com.tencent.thumbplayer.tcmedia.core.utils.TPThreadPool;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public class TPReuseMediaDrm implements ITPMediaDrm {
    private static final int INIT_POOL_SIZE = 1;
    private static final int KEEP_POOL_SIZE = 2;
    private static final String TAG = "[PlayerCore][TPReuseMediaDrm]";
    private static final UUID WIDEVINE_UUID = new UUID(-1301668207276963122L, -6645017420763422227L);
    private static HashMap<UUID, TPDoubleQueueCachedPool<TPMediaDrmInfo>> mMediaDrmCachedPoolMap = null;
    private final boolean mCanReUse;
    private ITPMediaDrm.OnExpirationUpdateListener mOnExpirationUpdateListener;
    private ITPMediaDrm.OnKeyStatusChangeListener mOnKeyStatusChangeListener;
    private final ITPMediaDrm mTPMediaDrm;
    private boolean mTPMediaDrmError = false;
    private final TPMediaDrmInfo mTPMediaDrmInfo;
    private final UUID mUUID;

    public static class TPMediaDrmInfo {
        byte[] sessionId;
        final ITPMediaDrm tpMediaDrm;

        public TPMediaDrmInfo(ITPMediaDrm iTPMediaDrm, byte[] bArr) {
            this.tpMediaDrm = iTPMediaDrm;
            this.sessionId = bArr;
        }
    }

    public static class TPObjectLifecycleMgr implements TPDoubleQueueCachedPool.ITPObjectLifecycleMgr<TPMediaDrmInfo> {
        private final UUID mUUID;

        public TPObjectLifecycleMgr(UUID uuid) {
            this.mUUID = uuid;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.tencent.thumbplayer.tcmedia.core.drm.reuse.TPDoubleQueueCachedPool.ITPObjectLifecycleMgr
        public TPMediaDrmInfo create(TPDoubleQueueCachedPool<TPMediaDrmInfo> tPDoubleQueueCachedPool) {
            try {
                TPDirectMediaDrm tPDirectMediaDrm = new TPDirectMediaDrm(this.mUUID);
                return new TPMediaDrmInfo(tPDirectMediaDrm, tPDirectMediaDrm.openSession());
            } catch (MediaDrmException | TPMediaDrmFatalException e10) {
                TPNativeLog.printLog(4, TPReuseMediaDrm.TAG, "createObject error:".concat(String.valueOf(e10)));
                return null;
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.drm.reuse.TPDoubleQueueCachedPool.ITPObjectLifecycleMgr
        public void release(TPDoubleQueueCachedPool<TPMediaDrmInfo> tPDoubleQueueCachedPool, TPMediaDrmInfo tPMediaDrmInfo) {
            tPMediaDrmInfo.tpMediaDrm.close();
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.drm.reuse.TPDoubleQueueCachedPool.ITPObjectLifecycleMgr
        public boolean reset(TPDoubleQueueCachedPool<TPMediaDrmInfo> tPDoubleQueueCachedPool, TPMediaDrmInfo tPMediaDrmInfo) {
            tPMediaDrmInfo.tpMediaDrm.closeSession(tPMediaDrmInfo.sessionId);
            try {
                tPMediaDrmInfo.sessionId = tPMediaDrmInfo.tpMediaDrm.openSession();
                return true;
            } catch (MediaDrmException | TPMediaDrmFatalException e10) {
                TPNativeLog.printLog(4, TPReuseMediaDrm.TAG, "reset error:".concat(String.valueOf(e10)));
                return false;
            }
        }
    }

    public TPReuseMediaDrm(UUID uuid) {
        preload();
        TPMediaDrmInfo tPMediaDrmInfoAllocTPMediaDrm = allocTPMediaDrm(uuid);
        this.mCanReUse = tPMediaDrmInfoAllocTPMediaDrm != null;
        if (tPMediaDrmInfoAllocTPMediaDrm == null) {
            TPDirectMediaDrm tPDirectMediaDrm = new TPDirectMediaDrm(uuid);
            tPMediaDrmInfoAllocTPMediaDrm = new TPMediaDrmInfo(tPDirectMediaDrm, tPDirectMediaDrm.openSession());
        }
        this.mTPMediaDrmInfo = tPMediaDrmInfoAllocTPMediaDrm;
        this.mTPMediaDrm = tPMediaDrmInfoAllocTPMediaDrm.tpMediaDrm;
        this.mUUID = uuid;
        TPNativeLog.printLog(2, TAG, "TPReuseMediaDrm constructor");
    }

    private TPMediaDrmInfo allocTPMediaDrm(UUID uuid) {
        TPDoubleQueueCachedPool<TPMediaDrmInfo> tPDoubleQueueCachedPool = mMediaDrmCachedPoolMap.get(uuid);
        if (tPDoubleQueueCachedPool != null) {
            return tPDoubleQueueCachedPool.allocObject();
        }
        TPNativeLog.printLog(4, TAG, "allocTPMediaDrm error, this UUID DRM is not cached");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void freeTPMediaDrm(UUID uuid, TPMediaDrmInfo tPMediaDrmInfo, boolean z10) {
        TPDoubleQueueCachedPool<TPMediaDrmInfo> tPDoubleQueueCachedPool = mMediaDrmCachedPoolMap.get(uuid);
        if (tPDoubleQueueCachedPool == null) {
            tPMediaDrmInfo.tpMediaDrm.close();
        } else if (z10) {
            tPDoubleQueueCachedPool.freeObject(tPMediaDrmInfo);
        } else {
            tPDoubleQueueCachedPool.recycleObject(tPMediaDrmInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void preload() {
        if (mMediaDrmCachedPoolMap != null) {
            return;
        }
        UUID uuid = WIDEVINE_UUID;
        TPDoubleQueueCachedPool<TPMediaDrmInfo> tPDoubleQueueCachedPool = new TPDoubleQueueCachedPool<>(1, 2, new TPObjectLifecycleMgr(uuid));
        synchronized (TPReuseMediaDrm.class) {
            if (mMediaDrmCachedPoolMap == null) {
                HashMap<UUID, TPDoubleQueueCachedPool<TPMediaDrmInfo>> map = new HashMap<>();
                mMediaDrmCachedPoolMap = map;
                map.put(uuid, tPDoubleQueueCachedPool);
                tPDoubleQueueCachedPool = null;
            }
        }
        if (tPDoubleQueueCachedPool != null) {
            tPDoubleQueueCachedPool.release();
        }
    }

    public static void preloadAsync() {
        TPThreadPool.getInstance().obtainThreadExecutor().execute(new Runnable() { // from class: com.tencent.thumbplayer.tcmedia.core.drm.reuse.TPReuseMediaDrm.1
            @Override // java.lang.Runnable
            public final void run() {
                TPReuseMediaDrm.preload();
            }
        });
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.drm.ITPMediaDrm
    public void close() {
        this.mTPMediaDrm.setOnExpirationUpdateListener(null, null);
        this.mOnExpirationUpdateListener = null;
        this.mTPMediaDrm.setOnKeyStatusChangeListener(null, null);
        this.mOnKeyStatusChangeListener = null;
        if (this.mCanReUse) {
            TPThreadPool.getInstance().obtainThreadExecutor().execute(new Runnable() { // from class: com.tencent.thumbplayer.tcmedia.core.drm.reuse.TPReuseMediaDrm.4
                @Override // java.lang.Runnable
                public void run() {
                    TPReuseMediaDrm tPReuseMediaDrm = TPReuseMediaDrm.this;
                    tPReuseMediaDrm.freeTPMediaDrm(tPReuseMediaDrm.mUUID, TPReuseMediaDrm.this.mTPMediaDrmInfo, TPReuseMediaDrm.this.mTPMediaDrmError);
                }
            });
        } else {
            this.mTPMediaDrm.close();
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.drm.ITPMediaDrm
    public synchronized void closeSession(byte[] bArr) {
        if (!Arrays.equals(bArr, this.mTPMediaDrmInfo.sessionId)) {
            this.mTPMediaDrmError = true;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.drm.ITPMediaDrm
    public MediaDrm.KeyRequest getKeyRequest(byte[] bArr, byte[] bArr2, String str, int i10, HashMap<String, String> map) {
        return this.mTPMediaDrm.getKeyRequest(bArr, bArr2, str, i10, map);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.drm.ITPMediaDrm
    public String getPropertyString(String str) {
        return this.mTPMediaDrm.getPropertyString(str);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.drm.ITPMediaDrm
    public MediaDrm.ProvisionRequest getProvisionRequest() {
        return this.mTPMediaDrm.getProvisionRequest();
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.drm.ITPMediaDrm
    public synchronized byte[] openSession() {
        return this.mTPMediaDrmInfo.sessionId;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.drm.ITPMediaDrm
    public byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        return this.mTPMediaDrm.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.drm.ITPMediaDrm
    public void provideProvisionResponse(byte[] bArr) {
        this.mTPMediaDrm.provideProvisionResponse(bArr);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.drm.ITPMediaDrm
    public HashMap<String, String> queryKeyStatus(byte[] bArr) {
        return this.mTPMediaDrm.queryKeyStatus(bArr);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.drm.ITPMediaDrm
    public void removeKeys(byte[] bArr) {
        this.mTPMediaDrm.removeKeys(bArr);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.drm.ITPMediaDrm
    public void restoreKeys(byte[] bArr, byte[] bArr2) {
        this.mTPMediaDrm.restoreKeys(bArr, bArr2);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.drm.ITPMediaDrm
    public void setOnExpirationUpdateListener(ITPMediaDrm.OnExpirationUpdateListener onExpirationUpdateListener, Handler handler) {
        this.mOnExpirationUpdateListener = onExpirationUpdateListener;
        this.mTPMediaDrm.setOnExpirationUpdateListener(new ITPMediaDrm.OnExpirationUpdateListener() { // from class: com.tencent.thumbplayer.tcmedia.core.drm.reuse.TPReuseMediaDrm.3
            @Override // com.tencent.thumbplayer.tcmedia.core.drm.ITPMediaDrm.OnExpirationUpdateListener
            public void onExpirationUpdate(ITPMediaDrm iTPMediaDrm, byte[] bArr, long j10) {
                ITPMediaDrm.OnExpirationUpdateListener onExpirationUpdateListener2 = TPReuseMediaDrm.this.mOnExpirationUpdateListener;
                if (onExpirationUpdateListener2 != null) {
                    onExpirationUpdateListener2.onExpirationUpdate(TPReuseMediaDrm.this, bArr, j10);
                }
            }
        }, handler);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.drm.ITPMediaDrm
    public void setOnKeyStatusChangeListener(ITPMediaDrm.OnKeyStatusChangeListener onKeyStatusChangeListener, Handler handler) {
        this.mOnKeyStatusChangeListener = onKeyStatusChangeListener;
        this.mTPMediaDrm.setOnKeyStatusChangeListener(new ITPMediaDrm.OnKeyStatusChangeListener() { // from class: com.tencent.thumbplayer.tcmedia.core.drm.reuse.TPReuseMediaDrm.2
            @Override // com.tencent.thumbplayer.tcmedia.core.drm.ITPMediaDrm.OnKeyStatusChangeListener
            public void onKeyStatusChange(ITPMediaDrm iTPMediaDrm, byte[] bArr, List<MediaDrm.KeyStatus> list, boolean z10) {
                ITPMediaDrm.OnKeyStatusChangeListener onKeyStatusChangeListener2 = TPReuseMediaDrm.this.mOnKeyStatusChangeListener;
                if (onKeyStatusChangeListener2 != null) {
                    onKeyStatusChangeListener2.onKeyStatusChange(TPReuseMediaDrm.this, bArr, list, z10);
                }
            }
        }, handler);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.drm.ITPMediaDrm
    public void setPropertyString(String str, String str2) {
        this.mTPMediaDrm.setPropertyString(str, str2);
    }
}
