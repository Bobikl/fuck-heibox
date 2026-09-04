package com.tencent.thumbplayer.tcmedia.core.drm;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLog;
import com.tencent.thumbplayer.tcmedia.core.utils.TPThreadPool;
import java.util.HashMap;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public class TPMediaDrmProxy {
    private static final long CREATE_MEDIA_DRM_SLICE_WAIT_TIME_MS = 100;
    private static final long CREATE_MEDIA_DRM_TIMEOUT_MS = 5000;
    private static final int ERR_API_LOW_LEVEL = 2;
    private static final int ERR_CREATE_MEDIA_DRM_FAILED = 5;
    private static final int ERR_ILLEGAL_ARGUMENT = 1;
    private static final int ERR_INTERRUPT = 3;
    private static final int ERR_NONE = 0;
    private static final int ERR_UNSUPPORTED_SCHEME = 4;
    private static final int MAX_LICENSE_DURATION_TO_RENEW_SECONDS = 60;
    public static final String PROPERTY_LICENSE_DURATION_REMAINING = "LicenseDurationRemaining";
    public static final String PROPERTY_PLAYBACK_DURATION_REMAINING = "PlaybackDurationRemaining";
    private static final String TAG = "[PlayerCore][TPMediaDrmProxy]";
    private ITPMediaDrm mMediaDrm;
    private long mNativeContext;
    private UUID mUUID;

    public static final class DrmSessionId {
        byte[] mSessionId;
        int mStatus;

        DrmSessionId(int i10, byte[] bArr) {
            this.mStatus = i10;
            this.mSessionId = bArr;
        }
    }

    public static final class KeyRequest {
        byte[] mData;
        int mRequestType;
        int mStatus;

        KeyRequest(int i10, byte[] bArr, int i11) {
            this.mRequestType = i10;
            this.mData = bArr;
            this.mStatus = i11;
        }
    }

    public static final class MediaDrmProxyCreateResult {
        int mErrorCode;
        TPMediaDrmProxy mMediaDrmProxy;

        MediaDrmProxyCreateResult(TPMediaDrmProxy tPMediaDrmProxy, int i10) {
            this.mMediaDrmProxy = tPMediaDrmProxy;
            this.mErrorCode = i10;
        }
    }

    public static final class ProvisionRequest {
        byte[] mData;
        String mDefaultUrl;

        ProvisionRequest(String str, byte[] bArr) {
            this.mDefaultUrl = str;
            this.mData = bArr;
        }
    }

    private TPMediaDrmProxy(UUID uuid, boolean z10) {
        ITPMediaDrm iTPMediaDrmCreateTPMediaDrm = z10 ? TPMediaDrmPool.getInstance().createTPMediaDrm(uuid) : TPMediaDrmPool.getInstance().createTPDirectMediaDrm(uuid);
        new ITPMediaDrm.OnEventListener() { // from class: com.tencent.thumbplayer.tcmedia.core.drm.TPMediaDrmProxy.1
            @Override // com.tencent.thumbplayer.tcmedia.core.drm.ITPMediaDrm.OnEventListener
            public void onEvent(ITPMediaDrm iTPMediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                if (iTPMediaDrm == TPMediaDrmProxy.this.mMediaDrm) {
                    TPMediaDrmProxy.this.native_mediaDrmOnEvent(bArr, i10, i11, bArr2);
                }
            }
        };
        this.mMediaDrm = iTPMediaDrmCreateTPMediaDrm;
        this.mUUID = uuid;
    }

    private static void checkInterrupt(ITPDrmInterruptCallback iTPDrmInterruptCallback) throws InterruptedException {
        if (iTPDrmInterruptCallback != null && iTPDrmInterruptCallback.isInterrupted()) {
            throw new InterruptedException();
        }
    }

    private static MediaDrmProxyCreateResult createMediaDrmProxyByUUID(String str, boolean z10, TPDrmInterruptCallbackProxy tPDrmInterruptCallbackProxy) {
        if (str == null) {
            TPNativeLog.printLog(4, "illegal argument.");
            return new MediaDrmProxyCreateResult(null, 1);
        }
        try {
            try {
                TPMediaDrmProxy tPMediaDrmProxyCreateMediaDrmProxyWithAsyncTimeout = createMediaDrmProxyWithAsyncTimeout(UUID.fromString(str), z10, tPDrmInterruptCallbackProxy);
                return new MediaDrmProxyCreateResult(tPMediaDrmProxyCreateMediaDrmProxyWithAsyncTimeout, tPMediaDrmProxyCreateMediaDrmProxyWithAsyncTimeout != null ? 0 : 5);
            } catch (UnsupportedSchemeException e10) {
                TPNativeLog.printLog(4, e10.getMessage());
                return new MediaDrmProxyCreateResult(null, 4);
            } catch (InterruptedException e11) {
                TPNativeLog.printLog(4, e11.getMessage());
                return new MediaDrmProxyCreateResult(null, 3);
            }
        } catch (IllegalArgumentException e12) {
            TPNativeLog.printLog(4, e12.getMessage());
            return new MediaDrmProxyCreateResult(null, 1);
        }
    }

    private static TPMediaDrmProxy createMediaDrmProxyWithAsyncTimeout(final UUID uuid, final boolean z10, ITPDrmInterruptCallback iTPDrmInterruptCallback) throws UnsupportedSchemeException {
        TPMediaDrmProxy tPMediaDrmProxy;
        final Object obj = new Object();
        final TPMediaDrmProxy[] tPMediaDrmProxyArr = {null};
        final UnsupportedSchemeException[] unsupportedSchemeExceptionArr = {null};
        final boolean[] zArr = {false};
        TPNativeLog.printLog(2, "async create mediaDrm proxy start.");
        TPThreadPool.getInstance().obtainThreadExecutor().execute(new Runnable() { // from class: com.tencent.thumbplayer.tcmedia.core.drm.TPMediaDrmProxy.2
            @Override // java.lang.Runnable
            public final void run() {
                boolean z11;
                TPMediaDrmProxy tPMediaDrmProxy2;
                TPNativeLog.printLog(2, "create system mediaDrm proxy start.");
                try {
                    tPMediaDrmProxyArr[0] = new TPMediaDrmProxy(uuid, z10);
                } catch (UnsupportedSchemeException e10) {
                    unsupportedSchemeExceptionArr[0] = e10;
                }
                TPNativeLog.printLog(2, "create system mediaDrm proxy end.");
                synchronized (obj) {
                    z11 = zArr[0];
                    obj.notify();
                }
                if (!z11 || (tPMediaDrmProxy2 = tPMediaDrmProxyArr[0]) == null) {
                    return;
                }
                tPMediaDrmProxy2.release();
            }
        });
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (tPMediaDrmProxyArr[0] == null) {
            synchronized (obj) {
                try {
                    checkInterrupt(iTPDrmInterruptCallback);
                } catch (InterruptedException e10) {
                    zArr[0] = true;
                    throw e10;
                }
            }
            long jElapsedRealtime2 = 5000 - (SystemClock.elapsedRealtime() - jElapsedRealtime);
            if (jElapsedRealtime2 <= 0) {
                break;
            }
            synchronized (obj) {
                try {
                    try {
                        obj.wait(Math.min(jElapsedRealtime2, 100L));
                    } catch (InterruptedException e11) {
                        zArr[0] = true;
                        throw e11;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        UnsupportedSchemeException unsupportedSchemeException = unsupportedSchemeExceptionArr[0];
        if (unsupportedSchemeException != null) {
            throw unsupportedSchemeException;
        }
        synchronized (obj) {
            TPMediaDrmProxy tPMediaDrmProxy2 = tPMediaDrmProxyArr[0];
            if (tPMediaDrmProxy2 == null) {
                zArr[0] = true;
                tPMediaDrmProxy = null;
            } else {
                tPMediaDrmProxy = tPMediaDrmProxy2;
            }
        }
        TPNativeLog.printLog(2, "async create mediaDrm proxy end.");
        return tPMediaDrmProxy;
    }

    private long getLicenseDurationRemainingSec(byte[] bArr) {
        try {
            HashMap<String, String> mapQueryKeyStatus = this.mMediaDrm.queryKeyStatus(bArr);
            if (mapQueryKeyStatus != null && mapQueryKeyStatus.size() > 0) {
                String str = mapQueryKeyStatus.get("LicenseDurationRemaining");
                long j10 = !TextUtils.isEmpty(str) ? Long.parseLong(str) : 0L;
                String str2 = mapQueryKeyStatus.get("PlaybackDurationRemaining");
                return Math.min(j10, !TextUtils.isEmpty(str2) ? Long.parseLong(str2) : 0L);
            }
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, "queryKeyStatus failed, error:" + th2.toString());
        }
        return 0L;
    }

    public static boolean isCryptoSchemeSupported(String str) {
        if (str == null) {
            TPNativeLog.printLog(2, "isCryptoSchemeSupported, illegal argument.");
            return false;
        }
        try {
            UUID uuidFromString = UUID.fromString(str);
            TPNativeLog.printLog(2, "isCryptoSchemeSupported, MediaDrm create start.");
            try {
                TPMediaDrmPool.getInstance().createTPMediaDrm(uuidFromString).close();
                TPNativeLog.printLog(2, "isCryptoSchemeSupported, MediaDrm release finished.");
                boolean zIsCryptoSchemeSupported = MediaDrm.isCryptoSchemeSupported(uuidFromString);
                TPNativeLog.printLog(2, "isCryptoSchemeSupported, supported:".concat(String.valueOf(zIsCryptoSchemeSupported)));
                return zIsCryptoSchemeSupported;
            } catch (UnsupportedSchemeException e10) {
                TPNativeLog.printLog(4, e10.getMessage());
                return false;
            }
        } catch (IllegalArgumentException e11) {
            TPNativeLog.printLog(4, e11.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void native_mediaDrmOnEvent(byte[] bArr, int i10, int i11, byte[] bArr2);

    public static void setMediaDrmReuseEnable(boolean z10) {
        TPMediaDrmPool.getInstance().setMediaDrmReuseEnable(z10);
        StringBuilder sb2 = new StringBuilder("setMediaDrmReuseEnable, reuse:");
        sb2.append(z10 ? "true" : "false");
        TPNativeLog.printLog(2, TAG, sb2.toString());
    }

    public void closeSession(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        this.mMediaDrm.closeSession(bArr);
    }

    public KeyRequest getKeyRequest(byte[] bArr, byte[] bArr2, String str, int i10) {
        try {
            MediaDrm.KeyRequest keyRequest = this.mMediaDrm.getKeyRequest(bArr, bArr2, str, i10, null);
            return new KeyRequest(keyRequest.getRequestType(), keyRequest.getData(), 0);
        } catch (NotProvisionedException | TPMediaDrmFatalException unused) {
            return new KeyRequest(-1, null, -1);
        }
    }

    public MediaCrypto getMediaCrypto(byte[] bArr) {
        try {
            return new MediaCrypto(this.mUUID, bArr);
        } catch (MediaCryptoException unused) {
            return null;
        }
    }

    public String getPropertyString(String str) {
        return this.mMediaDrm.getPropertyString(str);
    }

    public ProvisionRequest getProvisionRequest() {
        try {
            MediaDrm.ProvisionRequest provisionRequest = this.mMediaDrm.getProvisionRequest();
            return new ProvisionRequest(provisionRequest.getDefaultUrl(), provisionRequest.getData());
        } catch (TPMediaDrmFatalException unused) {
            return new ProvisionRequest("", new byte[0]);
        }
    }

    public DrmSessionId openSession() {
        int i10;
        byte[] bArrOpenSession = null;
        try {
            bArrOpenSession = this.mMediaDrm.openSession();
            i10 = 0;
        } catch (NotProvisionedException unused) {
            i10 = -1;
        } catch (Exception unused2) {
            i10 = -2;
        }
        return new DrmSessionId(i10, bArrOpenSession);
    }

    public int provideKeyResponse(byte[] bArr, byte[] bArr2) {
        try {
            this.mMediaDrm.provideKeyResponse(bArr, bArr2);
            return 0;
        } catch (DeniedByServerException | TPMediaDrmFatalException unused) {
            return -2;
        } catch (NotProvisionedException unused2) {
            return -1;
        }
    }

    public int provideProvisionResponse(byte[] bArr) {
        try {
            this.mMediaDrm.provideProvisionResponse(bArr);
            return 0;
        } catch (DeniedByServerException unused) {
            return -1;
        }
    }

    public void release() {
        this.mMediaDrm.close();
    }

    public int restoreKeys(byte[] bArr, String str) {
        try {
            this.mMediaDrm.restoreKeys(bArr, Base64.decode(str, 2));
            long licenseDurationRemainingSec = getLicenseDurationRemainingSec(bArr);
            if (licenseDurationRemainingSec > 60) {
                return 0;
            }
            TPNativeLog.printLog(3, "Offline license has expired or will expire soon, Remaining seconds: ".concat(String.valueOf(licenseDurationRemainingSec)));
            this.mMediaDrm.removeKeys(bArr);
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public void setPropertyString(String str, String str2) {
        this.mMediaDrm.setPropertyString(str, str2);
    }
}
