package com.tencent.thumbplayer.tcmedia.core.downloadproxy.drm;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDLProxyLogListener;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils.TPDLProxyLog;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public class TPDownloadMediaDrm {
    private static final String FILE_NAME = "TPDownloadMediaDrm";
    private static final int MAX_LICENSE_DURATION_TO_RENEW_SECONDS = 60;
    public static final String PROPERTY_LICENSE_DURATION_REMAINING = "LicenseDurationRemaining";
    public static final String PROPERTY_PLAYBACK_DURATION_REMAINING = "PlaybackDurationRemaining";
    private MediaDrm mMediaDrm;
    private OnEventListener mOnEventListener;
    private OnExpirationUpdateListener mOnExpirationUpdateListener;
    private OnKeyStatusChangeListener mOnKeyStatusChangeListener;

    public static final class DownloadDrmSession {
        byte[] mSessionId;
        int mStatus;

        DownloadDrmSession(int i10, byte[] bArr) {
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

    public interface OnEventListener {
        void onEvent(TPDownloadMediaDrm tPDownloadMediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2);
    }

    public interface OnExpirationUpdateListener {
        void onExpirationUpdate(TPDownloadMediaDrm tPDownloadMediaDrm, byte[] bArr, long j10);
    }

    public interface OnKeyStatusChangeListener {
        void onKeyStatusChange(TPDownloadMediaDrm tPDownloadMediaDrm, byte[] bArr, List<MediaDrm.KeyStatus> list, boolean z10);
    }

    public static final class ProvisionRequest {
        byte[] mData;
        String mDefaultUrl;

        ProvisionRequest(String str, byte[] bArr) {
            this.mDefaultUrl = str;
            this.mData = bArr;
        }
    }

    private TPDownloadMediaDrm(UUID uuid) throws UnsupportedSchemeException {
        this.mMediaDrm = new MediaDrm(uuid);
    }

    public static synchronized TPDownloadMediaDrm createDownloadMediaDrm(String str) {
        TPDownloadMediaDrm tPDownloadMediaDrm = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            tPDownloadMediaDrm = new TPDownloadMediaDrm(UUID.fromString(str));
        } catch (Exception e10) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "createDownloadMediaDrm exception : " + e10.getMessage());
        }
        return tPDownloadMediaDrm;
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
            TPDLProxyLog.w(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "queryKeyStatus failed, error:" + th2.toString());
        }
        return 0L;
    }

    public static synchronized int getSdkIntVersion() {
        return Build.VERSION.SDK_INT;
    }

    public static synchronized boolean isCryptoSchemeSupported(String str) {
        return MediaDrm.isCryptoSchemeSupported(UUID.fromString(str));
    }

    public void close() {
        MediaDrm mediaDrm = this.mMediaDrm;
        if (mediaDrm == null) {
            return;
        }
        mediaDrm.setOnEventListener(null);
        this.mOnEventListener = null;
        this.mMediaDrm.setOnExpirationUpdateListener((MediaDrm.OnExpirationUpdateListener) null, (Handler) null);
        this.mOnExpirationUpdateListener = null;
        this.mMediaDrm.setOnKeyStatusChangeListener((MediaDrm.OnKeyStatusChangeListener) null, (Handler) null);
        this.mOnKeyStatusChangeListener = null;
        this.mMediaDrm.release();
        this.mMediaDrm = null;
    }

    public void closeSession(byte[] bArr) {
        this.mMediaDrm.closeSession(bArr);
    }

    public KeyRequest getKeyRequest(byte[] bArr, byte[] bArr2, String str, int i10) {
        try {
            MediaDrm.KeyRequest keyRequest = this.mMediaDrm.getKeyRequest(bArr, bArr2, str, i10, null);
            return new KeyRequest(keyRequest.getRequestType(), keyRequest.getData(), 0);
        } catch (NotProvisionedException unused) {
            return new KeyRequest(-1, null, -1);
        }
    }

    public byte[] getPropertyByteArray(String str) {
        return this.mMediaDrm.getPropertyByteArray(str);
    }

    public String getPropertyString(String str) {
        return this.mMediaDrm.getPropertyString(str);
    }

    public ProvisionRequest getProvisionRequest() {
        try {
            MediaDrm.ProvisionRequest provisionRequest = this.mMediaDrm.getProvisionRequest();
            return new ProvisionRequest(provisionRequest.getDefaultUrl(), provisionRequest.getData());
        } catch (Exception unused) {
            return new ProvisionRequest("", new byte[0]);
        }
    }

    public DownloadDrmSession openSession() {
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
        return new DownloadDrmSession(i10, bArrOpenSession);
    }

    public byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        try {
            return this.mMediaDrm.provideKeyResponse(bArr, bArr2);
        } catch (DeniedByServerException e10) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "provideKeyResponse DeniedByServerException : " + e10.getMessage());
            return new byte[]{-2};
        } catch (NotProvisionedException e11) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "provideKeyResponse NotProvisionedException : " + e11.getMessage());
            return new byte[]{-1};
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

    public int removeKeys(byte[] bArr) {
        try {
            this.mMediaDrm.removeKeys(bArr);
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    public int restoreKeys(byte[] bArr, byte[] bArr2) {
        try {
            this.mMediaDrm.restoreKeys(bArr, bArr2);
            long licenseDurationRemainingSec = getLicenseDurationRemainingSec(bArr);
            if (licenseDurationRemainingSec > 60) {
                return 0;
            }
            TPDLProxyLog.w(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "Offline license has expired or will expire soon, Remaining seconds: ".concat(String.valueOf(licenseDurationRemainingSec)));
            this.mMediaDrm.removeKeys(bArr);
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public void setOnEventListener(OnEventListener onEventListener) {
        this.mMediaDrm.setOnEventListener(new MediaDrm.OnEventListener() { // from class: com.tencent.thumbplayer.tcmedia.core.downloadproxy.drm.TPDownloadMediaDrm.1
            @Override // android.media.MediaDrm.OnEventListener
            public void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                if (TPDownloadMediaDrm.this.mOnEventListener != null) {
                    TPDownloadMediaDrm.this.mOnEventListener.onEvent(TPDownloadMediaDrm.this, bArr, i10, i11, bArr2);
                }
            }
        });
    }

    public void setOnExpirationUpdateListener(OnExpirationUpdateListener onExpirationUpdateListener, Handler handler) {
        this.mOnExpirationUpdateListener = onExpirationUpdateListener;
        this.mMediaDrm.setOnExpirationUpdateListener(new MediaDrm.OnExpirationUpdateListener() { // from class: com.tencent.thumbplayer.tcmedia.core.downloadproxy.drm.TPDownloadMediaDrm.3
            @Override // android.media.MediaDrm.OnExpirationUpdateListener
            public void onExpirationUpdate(MediaDrm mediaDrm, byte[] bArr, long j10) {
                if (TPDownloadMediaDrm.this.mOnExpirationUpdateListener != null) {
                    TPDownloadMediaDrm.this.mOnExpirationUpdateListener.onExpirationUpdate(TPDownloadMediaDrm.this, bArr, j10);
                }
            }
        }, handler);
    }

    public synchronized void setOnKeyStatusChangeListener(OnKeyStatusChangeListener onKeyStatusChangeListener, Handler handler) {
        this.mOnKeyStatusChangeListener = onKeyStatusChangeListener;
        this.mMediaDrm.setOnKeyStatusChangeListener(new MediaDrm.OnKeyStatusChangeListener() { // from class: com.tencent.thumbplayer.tcmedia.core.downloadproxy.drm.TPDownloadMediaDrm.2
            @Override // android.media.MediaDrm.OnKeyStatusChangeListener
            public void onKeyStatusChange(MediaDrm mediaDrm, byte[] bArr, List<MediaDrm.KeyStatus> list, boolean z10) {
                if (TPDownloadMediaDrm.this.mOnKeyStatusChangeListener != null) {
                    TPDownloadMediaDrm.this.mOnKeyStatusChangeListener.onKeyStatusChange(TPDownloadMediaDrm.this, bArr, list, z10);
                }
            }
        }, handler);
    }

    public void setPropertyByteArray(String str, byte[] bArr) {
        this.mMediaDrm.setPropertyByteArray(str, bArr);
    }

    public void setPropertyString(String str, String str2) {
        this.mMediaDrm.setPropertyString(str, str2);
    }
}
