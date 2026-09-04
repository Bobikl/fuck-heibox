package com.tencent.thumbplayer.tcmedia.core.drm;

import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import android.os.Handler;
import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLog;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public class TPDirectMediaDrm implements ITPMediaDrm {
    private static final String TAG = "TPDirectMediaDrm";
    private MediaDrm mMediaDrm;
    private ITPMediaDrm.OnEventListener mOnEventListener;
    private ITPMediaDrm.OnExpirationUpdateListener mOnExpirationUpdateListener;
    private ITPMediaDrm.OnKeyStatusChangeListener mOnKeyStatusChangeListener;
    private boolean mReleased;

    public TPDirectMediaDrm(UUID uuid) throws UnsupportedSchemeException {
        this.mReleased = false;
        try {
            this.mMediaDrm = new MediaDrm(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw e10;
        } catch (Throwable th2) {
            this.mReleased = true;
            TPNativeLog.printLog(4, TAG, "new MediaDrm failed, e:".concat(String.valueOf(th2)));
        }
        TPNativeLog.printLog(2, TAG, "TPDirectMediaDrm constructor");
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.drm.ITPMediaDrm
    public synchronized void close() {
        if (this.mReleased) {
            return;
        }
        this.mMediaDrm.setOnEventListener(null);
        this.mOnEventListener = null;
        int i10 = Build.VERSION.SDK_INT;
        this.mMediaDrm.setOnExpirationUpdateListener((MediaDrm.OnExpirationUpdateListener) null, (Handler) null);
        this.mOnExpirationUpdateListener = null;
        this.mMediaDrm.setOnKeyStatusChangeListener((MediaDrm.OnKeyStatusChangeListener) null, (Handler) null);
        this.mOnKeyStatusChangeListener = null;
        try {
            if (i10 >= 28) {
                this.mMediaDrm.close();
            } else {
                this.mMediaDrm.release();
            }
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, TAG, th2.toString());
        }
        this.mMediaDrm = null;
        this.mReleased = true;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.drm.ITPMediaDrm
    public synchronized void closeSession(byte[] bArr) {
        if (this.mReleased) {
            return;
        }
        try {
            this.mMediaDrm.closeSession(bArr);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, TAG, th2.toString());
            close();
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.drm.ITPMediaDrm
    public synchronized MediaDrm.KeyRequest getKeyRequest(byte[] bArr, byte[] bArr2, String str, int i10, HashMap<String, String> map) {
        if (this.mReleased) {
            throw new TPMediaDrmFatalException("released");
        }
        try {
        } catch (MediaDrmException e10) {
            throw e10;
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, TAG, th2.toString());
            close();
            throw new TPMediaDrmFatalException(th2.getMessage());
        }
        return this.mMediaDrm.getKeyRequest(bArr, bArr2, str, i10, map);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.drm.ITPMediaDrm
    public synchronized String getPropertyString(String str) {
        if (this.mReleased) {
            return "";
        }
        try {
            return this.mMediaDrm.getPropertyString(str);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, TAG, th2.toString());
            close();
            return "";
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.drm.ITPMediaDrm
    public synchronized MediaDrm.ProvisionRequest getProvisionRequest() {
        if (this.mReleased) {
            throw new TPMediaDrmFatalException("released");
        }
        try {
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, TAG, th2.toString());
            close();
            throw new TPMediaDrmFatalException(th2.getMessage());
        }
        return this.mMediaDrm.getProvisionRequest();
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.drm.ITPMediaDrm
    public synchronized byte[] openSession() {
        if (this.mReleased) {
            throw new TPMediaDrmFatalException("released");
        }
        try {
            try {
            } catch (MediaDrmException e10) {
                throw e10;
            }
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, TAG, th2.toString());
            close();
            throw new TPMediaDrmFatalException(th2.getMessage());
        }
        return this.mMediaDrm.openSession();
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.drm.ITPMediaDrm
    public synchronized byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        if (this.mReleased) {
            throw new TPMediaDrmFatalException("released");
        }
        try {
            try {
            } catch (MediaDrmException e10) {
                throw e10;
            }
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, TAG, th2.toString());
            close();
            throw new TPMediaDrmFatalException(th2.getMessage());
        }
        return this.mMediaDrm.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.drm.ITPMediaDrm
    public synchronized void provideProvisionResponse(byte[] bArr) {
        if (this.mReleased) {
            return;
        }
        try {
            try {
                this.mMediaDrm.provideProvisionResponse(bArr);
            } catch (MediaDrmException e10) {
                throw e10;
            }
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, TAG, th2.toString());
            close();
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.drm.ITPMediaDrm
    public synchronized HashMap<String, String> queryKeyStatus(byte[] bArr) {
        if (this.mReleased) {
            return new HashMap<>();
        }
        try {
            return this.mMediaDrm.queryKeyStatus(bArr);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, TAG, th2.toString());
            close();
            return new HashMap<>();
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.drm.ITPMediaDrm
    public synchronized void removeKeys(byte[] bArr) {
        if (this.mReleased) {
            return;
        }
        try {
            this.mMediaDrm.removeKeys(bArr);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, TAG, th2.toString());
            close();
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.drm.ITPMediaDrm
    public synchronized void restoreKeys(byte[] bArr, byte[] bArr2) {
        if (this.mReleased) {
            return;
        }
        try {
            this.mMediaDrm.restoreKeys(bArr, bArr2);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, TAG, th2.toString());
            close();
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.drm.ITPMediaDrm
    public synchronized void setOnExpirationUpdateListener(ITPMediaDrm.OnExpirationUpdateListener onExpirationUpdateListener, Handler handler) {
        if (this.mReleased) {
            return;
        }
        this.mOnExpirationUpdateListener = onExpirationUpdateListener;
        this.mMediaDrm.setOnExpirationUpdateListener(new MediaDrm.OnExpirationUpdateListener() { // from class: com.tencent.thumbplayer.tcmedia.core.drm.TPDirectMediaDrm.2
            @Override // android.media.MediaDrm.OnExpirationUpdateListener
            public void onExpirationUpdate(MediaDrm mediaDrm, byte[] bArr, long j10) {
                ITPMediaDrm.OnExpirationUpdateListener onExpirationUpdateListener2 = TPDirectMediaDrm.this.mOnExpirationUpdateListener;
                if (onExpirationUpdateListener2 != null) {
                    onExpirationUpdateListener2.onExpirationUpdate(TPDirectMediaDrm.this, bArr, j10);
                }
            }
        }, handler);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.drm.ITPMediaDrm
    public synchronized void setOnKeyStatusChangeListener(ITPMediaDrm.OnKeyStatusChangeListener onKeyStatusChangeListener, Handler handler) {
        if (this.mReleased) {
            return;
        }
        this.mOnKeyStatusChangeListener = onKeyStatusChangeListener;
        this.mMediaDrm.setOnKeyStatusChangeListener(new MediaDrm.OnKeyStatusChangeListener() { // from class: com.tencent.thumbplayer.tcmedia.core.drm.TPDirectMediaDrm.1
            @Override // android.media.MediaDrm.OnKeyStatusChangeListener
            public void onKeyStatusChange(MediaDrm mediaDrm, byte[] bArr, List<MediaDrm.KeyStatus> list, boolean z10) {
                ITPMediaDrm.OnKeyStatusChangeListener onKeyStatusChangeListener2 = TPDirectMediaDrm.this.mOnKeyStatusChangeListener;
                if (onKeyStatusChangeListener2 != null) {
                    onKeyStatusChangeListener2.onKeyStatusChange(TPDirectMediaDrm.this, bArr, list, z10);
                }
            }
        }, handler);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.drm.ITPMediaDrm
    public synchronized void setPropertyString(String str, String str2) {
        if (this.mReleased) {
            return;
        }
        try {
            this.mMediaDrm.setPropertyString(str, str2);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, TAG, th2.toString());
            close();
        }
    }
}
