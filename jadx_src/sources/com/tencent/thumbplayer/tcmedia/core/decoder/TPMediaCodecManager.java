package com.tencent.thumbplayer.tcmedia.core.decoder;

import android.os.Build;
import android.util.SparseArray;
import android.view.Surface;
import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLog;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class TPMediaCodecManager {
    private static final String TAG = "TPMediaCodecManager";
    private static SparseArray<ITPMediaCodecDecoder> mCodecList = new SparseArray<>();
    private static AtomicInteger codecNum = new AtomicInteger(0);

    private static native void _onMediaCodecException(int i10, String str);

    private static native void _onMediaCodecReady(int i10, String str);

    private static native void _onMediaCodecReportEvent(int i10, int i11);

    private static native void _onMediaDrmInfo(int i10, Object obj);

    private static void addCodecToList(int i10, ITPMediaCodecDecoder iTPMediaCodecDecoder) {
        synchronized (TPMediaCodecManager.class) {
            mCodecList.put(i10, iTPMediaCodecDecoder);
        }
    }

    public static int createMediaCodec(boolean z10) {
        if (codecNum.get() >= Integer.MAX_VALUE) {
            codecNum.set(0);
        }
        int andIncrement = codecNum.getAndIncrement();
        addCodecToList(andIncrement, z10 ? new TPMediaCodecAudioDecoder(andIncrement) : new TPMediaCodecVideoDecoder(andIncrement));
        return andIncrement;
    }

    public static int flushMediaCodec(int i10) {
        ITPMediaCodecDecoder codecById = getCodecById(i10);
        if (codecById != null) {
            return codecById.flush();
        }
        TPNativeLog.printLog(3, TAG, "flushMediaCodec failed!");
        return 3;
    }

    private static ITPMediaCodecDecoder getCodecById(int i10) {
        ITPMediaCodecDecoder iTPMediaCodecDecoder;
        synchronized (TPMediaCodecManager.class) {
            iTPMediaCodecDecoder = mCodecList.get(i10);
        }
        if (iTPMediaCodecDecoder != null) {
            return iTPMediaCodecDecoder;
        }
        TPNativeLog.printLog(3, TAG, "No such codec by id:".concat(String.valueOf(i10)));
        return null;
    }

    public static int getSDKVersion() {
        return Build.VERSION.SDK_INT;
    }

    public static boolean initAudioMediaCodec(int i10, String str, int i11, int i12, int i13, int i14) {
        ITPMediaCodecDecoder codecById = getCodecById(i10);
        if (codecById == null) {
            TPNativeLog.printLog(3, TAG, "initAudioMediaCodec failed!");
            return false;
        }
        if (codecById.initDecoder(str, i11, i12, i13, i14)) {
            return codecById.startDecoder();
        }
        return false;
    }

    public static boolean initVideoMediaCodec(int i10, String str, int i11, int i12, int i13, Surface surface, int i14, int i15, int i16) {
        ITPMediaCodecDecoder codecById = getCodecById(i10);
        if (codecById == null) {
            TPNativeLog.printLog(3, TAG, "initVideoMediaCodec failed!");
            return false;
        }
        if (codecById.initDecoder(str, i11, i12, i13, surface, i14, i15, i16)) {
            return codecById.startDecoder();
        }
        return false;
    }

    public static void onMediaCodecException(int i10, String str) {
        _onMediaCodecException(i10, str);
    }

    public static void onMediaCodecReady(int i10, String str) {
        _onMediaCodecReady(i10, str);
    }

    public static void onMediaCodecReportEvent(int i10, int i11) {
        _onMediaCodecReportEvent(i10, i11);
    }

    public static void onMediaDrmInfo(int i10, Object obj) {
        _onMediaDrmInfo(i10, obj);
    }

    public static TPFrameInfo receiveOneFrame(int i10) {
        ITPMediaCodecDecoder codecById = getCodecById(i10);
        if (codecById != null) {
            return codecById.dequeueOutputBuffer();
        }
        TPNativeLog.printLog(3, TAG, "receiveOneFrame failed!");
        return null;
    }

    public static int releaseMediaCodec(int i10) {
        ITPMediaCodecDecoder codecById = getCodecById(i10);
        if (codecById == null) {
            TPNativeLog.printLog(3, TAG, "releaseMediaCodec failed!");
            return 3;
        }
        removeCodecFromList(i10);
        return codecById.release();
    }

    public static int releaseVideoFrame(int i10, int i11, boolean z10) {
        ITPMediaCodecDecoder codecById = getCodecById(i10);
        if (codecById != null) {
            return codecById.releaseOutputBuffer(i11, z10);
        }
        TPNativeLog.printLog(3, TAG, "releaseVideoFrame failed!");
        return 3;
    }

    private static void removeCodecFromList(int i10) {
        synchronized (TPMediaCodecManager.class) {
            mCodecList.remove(i10);
        }
    }

    public static int sendOnePacket(int i10, byte[] bArr, boolean z10, long j10, boolean z11) {
        ITPMediaCodecDecoder codecById = getCodecById(i10);
        if (codecById != null) {
            return codecById.decode(bArr, z10, j10, z11);
        }
        TPNativeLog.printLog(3, TAG, "sendOnePacket failed!");
        return 3;
    }

    public static void setCryptoInfo(int i10, int i11, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i12) {
        ITPMediaCodecDecoder codecById = getCodecById(i10);
        if (codecById == null) {
            TPNativeLog.printLog(3, TAG, "setMediaCodecParamObject failed!");
        } else {
            codecById.setCryptoInfo(i11, iArr, iArr2, bArr, bArr2, i12);
        }
    }

    public static int setMediaCodecOperateRate(int i10, float f10) {
        ITPMediaCodecDecoder codecById = getCodecById(i10);
        if (codecById != null) {
            return codecById.setOperateRate(f10);
        }
        TPNativeLog.printLog(3, TAG, "setMediaCodecOperateRate failed!");
        return 3;
    }

    public static boolean setMediaCodecParamBool(int i10, int i11, boolean z10) {
        ITPMediaCodecDecoder codecById = getCodecById(i10);
        if (codecById != null) {
            return codecById.setParamBool(i11, z10);
        }
        TPNativeLog.printLog(3, TAG, "setMediaCodecParamBool failed!");
        return false;
    }

    public static boolean setMediaCodecParamBytes(int i10, int i11, byte[] bArr) {
        ITPMediaCodecDecoder codecById = getCodecById(i10);
        if (codecById != null) {
            return codecById.setParamBytes(i11, bArr);
        }
        TPNativeLog.printLog(3, TAG, "setMediaCodecParamBytes failed!");
        return false;
    }

    public static boolean setMediaCodecParamInt(int i10, int i11, int i12) {
        ITPMediaCodecDecoder codecById = getCodecById(i10);
        if (codecById != null) {
            return codecById.setParamInt(i11, i12);
        }
        TPNativeLog.printLog(3, TAG, "setMediaCodecParamInt failed!");
        return false;
    }

    public static boolean setMediaCodecParamLong(int i10, int i11, long j10) {
        ITPMediaCodecDecoder codecById = getCodecById(i10);
        if (codecById != null) {
            return codecById.setParamLong(i11, j10);
        }
        TPNativeLog.printLog(3, TAG, "setMediaCodecParamLong failed!");
        return false;
    }

    public static boolean setMediaCodecParamObject(int i10, int i11, Object obj) {
        ITPMediaCodecDecoder codecById = getCodecById(i10);
        if (codecById != null) {
            return codecById.setParamObject(i11, obj);
        }
        TPNativeLog.printLog(3, TAG, "setMediaCodecParamObject failed!");
        return false;
    }

    public static boolean setMediaCodecParamString(int i10, int i11, String str) {
        ITPMediaCodecDecoder codecById = getCodecById(i10);
        if (codecById != null) {
            return codecById.setParamString(i11, str);
        }
        TPNativeLog.printLog(3, TAG, "setMediaCodecParamString failed!");
        return false;
    }

    public static int setMediaCodecSurface(int i10, Surface surface) {
        ITPMediaCodecDecoder codecById = getCodecById(i10);
        if (codecById != null) {
            return codecById.setOutputSurface(surface);
        }
        TPNativeLog.printLog(3, TAG, "setMediaCodecSurface failed!");
        return 3;
    }

    public static int signalEndOfStream(int i10) {
        ITPMediaCodecDecoder codecById = getCodecById(i10);
        if (codecById != null) {
            return codecById.signalEndOfStream();
        }
        TPNativeLog.printLog(3, TAG, "signalEndOfStream failed!");
        return 3;
    }
}
