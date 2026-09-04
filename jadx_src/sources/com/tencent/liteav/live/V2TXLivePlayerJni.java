package com.tencent.liteav.live;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.l;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.live2.V2TXLiveDef;
import com.tencent.live2.V2TXLivePlayer;
import com.tencent.live2.V2TXLivePlayerObserver;
import com.tencent.live2.impl.V2TXLiveDefInner;
import com.tencent.live2.impl.V2TXLivePlayerImpl;
import com.tencent.live2.impl.V2TXLiveProperty;
import com.tencent.rtmp.ui.TXCloudVideoView;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav")
public class V2TXLivePlayerJni extends V2TXLivePlayer {
    private static final String TAG = "V2TXLivePlayerJni";
    private boolean mClearLastImage = true;
    protected long mNativeV2TXLivePlayerJni;
    private V2TXLivePlayerObserver mObserver;
    private V2TXLivePlayerImpl mProxy;

    /* JADX INFO: renamed from: com.tencent.liteav.live.V2TXLivePlayerJni$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f99755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f99756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f99757c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f99758d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f99759e;

        static {
            int[] iArr = new int[l.values().length];
            f99759e = iArr;
            try {
                iArr[l.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f99759e[l.ROTATION_90.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f99759e[l.ROTATION_180.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f99759e[l.ROTATION_270.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[GLConstants.a.values().length];
            f99758d = iArr2;
            try {
                iArr2[GLConstants.a.BYTE_BUFFER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f99758d[GLConstants.a.BYTE_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f99758d[GLConstants.a.TEXTURE_2D.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[GLConstants.PixelFormatType.values().length];
            f99757c = iArr3;
            try {
                iArr3[GLConstants.PixelFormatType.I420.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f99757c[GLConstants.PixelFormatType.RGBA.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[V2TXLiveDef.V2TXLiveFillMode.values().length];
            f99756b = iArr4;
            try {
                iArr4[V2TXLiveDef.V2TXLiveFillMode.V2TXLiveFillModeFill.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f99756b[V2TXLiveDef.V2TXLiveFillMode.V2TXLiveFillModeScaleFill.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr5 = new int[V2TXLiveDef.V2TXLiveRotation.values().length];
            f99755a = iArr5;
            try {
                iArr5[V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation90.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f99755a[V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation180.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f99755a[V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation270.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public V2TXLivePlayerJni(Context context, V2TXLivePlayerImpl v2TXLivePlayerImpl) {
        this.mNativeV2TXLivePlayerJni = 0L;
        this.mProxy = v2TXLivePlayerImpl;
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix("liteav");
        this.mNativeV2TXLivePlayerJni = nativeCreate(new WeakReference(this));
    }

    private void enableExtensionCallback(boolean z10) {
        synchronized (this) {
            nativeEnableExtensionCallback(this.mNativeV2TXLivePlayerJni, z10);
        }
    }

    public static V2TXLiveDef.V2TXLivePlayerStatistics getJavaV2TXLivePlayerStatistics(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25) {
        V2TXLiveDef.V2TXLivePlayerStatistics v2TXLivePlayerStatistics = new V2TXLiveDef.V2TXLivePlayerStatistics();
        v2TXLivePlayerStatistics.appCpu = i10;
        v2TXLivePlayerStatistics.systemCpu = i11;
        v2TXLivePlayerStatistics.rtt = i12;
        v2TXLivePlayerStatistics.width = i13;
        v2TXLivePlayerStatistics.height = i14;
        v2TXLivePlayerStatistics.fps = i15;
        v2TXLivePlayerStatistics.videoBitrate = i16;
        v2TXLivePlayerStatistics.audioBitrate = i17;
        v2TXLivePlayerStatistics.audioPacketLoss = i18;
        v2TXLivePlayerStatistics.videoPacketLoss = i19;
        v2TXLivePlayerStatistics.jitterBufferDelay = i20;
        v2TXLivePlayerStatistics.audioTotalBlockTime = i21;
        v2TXLivePlayerStatistics.audioBlockRate = i22;
        v2TXLivePlayerStatistics.videoTotalBlockTime = i23;
        v2TXLivePlayerStatistics.videoBlockRate = i24;
        v2TXLivePlayerStatistics.netSpeed = i25;
        return v2TXLivePlayerStatistics;
    }

    private static ArrayList<V2TXLiveDef.V2TXLiveStreamInfo> getStreamListFormJsonString(String str) {
        ArrayList<V2TXLiveDef.V2TXLiveStreamInfo> arrayList = new ArrayList<>();
        if (str != null && !str.isEmpty()) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    arrayList.add(new V2TXLiveDef.V2TXLiveStreamInfo(jSONObject.getInt("width"), jSONObject.getInt("height"), jSONObject.getInt("bitrate"), (float) jSONObject.getDouble("framerate"), jSONObject.getString("url")));
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return arrayList;
    }

    private static native long nativeCreate(WeakReference<V2TXLivePlayerJni> weakReference);

    private static native void nativeDestroy(long j10);

    private static native int nativeEnableCustomRendering(long j10, boolean z10, int i10, int i11);

    private static native void nativeEnableExtensionCallback(long j10, boolean z10);

    private static native int nativeEnableObserveAudioFrame(long j10, boolean z10);

    private static native int nativeEnableReceiveSeiMessage(long j10, boolean z10, int i10);

    private static native int nativeEnableVolumeEvaluation(long j10, int i10);

    private static native String nativeGetStreamList(long j10);

    private static native int nativeIsPlaying(long j10);

    private static native int nativePauseAudio(long j10);

    private static native int nativePauseVideo(long j10);

    private static native int nativeResumeAudio(long j10);

    private static native int nativeResumeVideo(long j10);

    private static native int nativeSetCacheParams(long j10, float f10, float f11);

    private static native int nativeSetPlayoutVolume(long j10, int i10);

    private static native int nativeSetProperty(long j10, String str, Object obj);

    private static native int nativeSetRenderFillMode(long j10, int i10);

    private static native int nativeSetRenderRotation(long j10, int i10);

    private static native int nativeSetRenderView(long j10, DisplayTarget displayTarget);

    private static native void nativeSetSharedEGLContext(long j10, Object obj);

    private static native void nativeShowDebugView(long j10, boolean z10);

    private static native int nativeSnapshot(long j10);

    private static native int nativeStartPlay(long j10, String str);

    private static native int nativeStartRecord(long j10, String str, int i10, int i11);

    private static native int nativeStopPlay(long j10, boolean z10);

    private static native void nativeStopRecord(long j10);

    private static native int nativeSwitchStream(long j10, String str);

    public static V2TXLivePlayerJni weakToStrongReference(WeakReference<V2TXLivePlayerJni> weakReference) {
        return weakReference.get();
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int enableObserveAudioFrame(boolean z10) {
        return nativeEnableObserveAudioFrame(this.mNativeV2TXLivePlayerJni, z10);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int enableObserveVideoFrame(boolean z10, V2TXLiveDef.V2TXLivePixelFormat v2TXLivePixelFormat, V2TXLiveDef.V2TXLiveBufferType v2TXLiveBufferType) {
        GLConstants.PixelFormatType pixelFormatType;
        GLConstants.a aVar;
        V2TXLiveDef.V2TXLivePixelFormat v2TXLivePixelFormat2 = V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatI420;
        if (v2TXLivePixelFormat == v2TXLivePixelFormat2 && v2TXLiveBufferType == V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray) {
            pixelFormatType = GLConstants.PixelFormatType.I420;
            aVar = GLConstants.a.BYTE_ARRAY;
        } else if (v2TXLivePixelFormat == V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D && v2TXLiveBufferType == V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeTexture) {
            pixelFormatType = GLConstants.PixelFormatType.RGBA;
            aVar = GLConstants.a.TEXTURE_2D;
        } else {
            if (v2TXLivePixelFormat != v2TXLivePixelFormat2 || v2TXLiveBufferType != V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer) {
                LiteavLog.e(TAG, "Enable custom render failed, invalid params. format:" + v2TXLivePixelFormat + " type:" + v2TXLiveBufferType);
                return -4;
            }
            pixelFormatType = GLConstants.PixelFormatType.I420;
            aVar = GLConstants.a.BYTE_BUFFER;
        }
        return nativeEnableCustomRendering(this.mNativeV2TXLivePlayerJni, z10, pixelFormatType.getValue(), aVar.ordinal());
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int enableReceiveSeiMessage(boolean z10, int i10) {
        return nativeEnableReceiveSeiMessage(this.mNativeV2TXLivePlayerJni, z10, i10);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int enableVolumeEvaluation(int i10) {
        return nativeEnableVolumeEvaluation(this.mNativeV2TXLivePlayerJni, i10);
    }

    protected void finalize() {
        nativeDestroy(this.mNativeV2TXLivePlayerJni);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public ArrayList<V2TXLiveDef.V2TXLiveStreamInfo> getStreamList() {
        return getStreamListFormJsonString(nativeGetStreamList(this.mNativeV2TXLivePlayerJni));
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int isPlaying() {
        return nativeIsPlaying(this.mNativeV2TXLivePlayerJni);
    }

    public void onAudioLoading(Bundle bundle) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onAudioLoading(this.mProxy, bundle);
        }
    }

    public void onAudioPlaying(boolean z10, Bundle bundle) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onAudioPlaying(this.mProxy, z10, bundle);
        }
    }

    public void onConnected(Bundle bundle) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onConnected(this.mProxy, bundle);
        }
    }

    public void onError(int i10, String str, Bundle bundle) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onError(this.mProxy, i10, str, bundle);
        }
    }

    public void onNetworkQuality(int i10) {
    }

    public void onPlayEvent(int i10, Bundle bundle) {
    }

    public void onPlayNetStatus(Bundle bundle) {
    }

    public void onPlayoutAudioFrame(byte[] bArr, int i10, int i11) {
        V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame = new V2TXLiveDef.V2TXLiveAudioFrame();
        v2TXLiveAudioFrame.data = bArr;
        v2TXLiveAudioFrame.sampleRate = i10;
        v2TXLiveAudioFrame.channel = i11;
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onPlayoutAudioFrame(this.mProxy, v2TXLiveAudioFrame);
        }
    }

    public void onPlayoutVolumeUpdate(int i10) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onPlayoutVolumeUpdate(this.mProxy, i10);
        }
    }

    public void onReceiveSeiMessage(int i10, byte[] bArr) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onReceiveSeiMessage(this.mProxy, i10, bArr);
        }
    }

    public void onRecordBegin(int i10, String str) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onLocalRecordBegin(this.mProxy, i10, str);
        }
    }

    public void onRecordComplete(int i10, String str) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onLocalRecordComplete(this.mProxy, i10, str);
        }
    }

    public void onRecordProgress(long j10, String str) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onLocalRecording(this.mProxy, j10, str);
        }
    }

    public void onRenderVideoFrame(int i10, int i11, Object obj, int i12, int i13, int i14, int i15, long j10, byte[] bArr, ByteBuffer byteBuffer) {
        V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame = new V2TXLiveDef.V2TXLiveVideoFrame();
        GLConstants.PixelFormatType pixelFormatTypeA = GLConstants.PixelFormatType.a(i10);
        int i16 = AnonymousClass1.f99757c[pixelFormatTypeA.ordinal()];
        if (i16 == 1) {
            v2TXLiveVideoFrame.pixelFormat = V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatI420;
        } else if (i16 != 2) {
            LiteavLog.e(TAG, "Invalid pixelFormat. pixelFormat:" + pixelFormatTypeA + ".");
        } else {
            v2TXLiveVideoFrame.pixelFormat = V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D;
        }
        GLConstants.a aVarA = GLConstants.a.a(i11);
        int i17 = AnonymousClass1.f99758d[aVarA.ordinal()];
        if (i17 == 1) {
            v2TXLiveVideoFrame.bufferType = V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer;
        } else if (i17 == 2) {
            v2TXLiveVideoFrame.bufferType = V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray;
        } else if (i17 != 3) {
            LiteavLog.e(TAG, "Invalid bufferType. bufferType:" + aVarA + ".");
        } else {
            v2TXLiveVideoFrame.bufferType = V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeTexture;
        }
        V2TXLiveDef.V2TXLiveTexture v2TXLiveTexture = new V2TXLiveDef.V2TXLiveTexture();
        v2TXLiveTexture.textureId = i12;
        if (obj instanceof EGLContext) {
            v2TXLiveTexture.eglContext10 = (EGLContext) obj;
        } else if (obj instanceof android.opengl.EGLContext) {
            v2TXLiveTexture.eglContext14 = (android.opengl.EGLContext) obj;
        }
        v2TXLiveVideoFrame.texture = v2TXLiveTexture;
        v2TXLiveVideoFrame.data = bArr;
        v2TXLiveVideoFrame.buffer = byteBuffer;
        v2TXLiveVideoFrame.width = i13;
        v2TXLiveVideoFrame.height = i14;
        int i18 = AnonymousClass1.f99759e[l.a(i15).ordinal()];
        if (i18 == 1) {
            v2TXLiveVideoFrame.rotation = 0;
        } else if (i18 == 2) {
            v2TXLiveVideoFrame.rotation = 90;
        } else if (i18 == 3) {
            v2TXLiveVideoFrame.rotation = 180;
        } else if (i18 != 4) {
            v2TXLiveVideoFrame.rotation = 0;
        } else {
            v2TXLiveVideoFrame.rotation = 270;
        }
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onRenderVideoFrame(this.mProxy, v2TXLiveVideoFrame);
        }
    }

    public void onSnapshotComplete(Bitmap bitmap) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onSnapshotComplete(this.mProxy, bitmap);
        }
    }

    public void onStatisticsUpdate(V2TXLiveDef.V2TXLivePlayerStatistics v2TXLivePlayerStatistics) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onStatisticsUpdate(this.mProxy, v2TXLivePlayerStatistics);
        }
    }

    public void onStreamSwitched(int i10, String str) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onStreamSwitched(this.mProxy, str, i10);
        }
    }

    public void onVideoLoading(Bundle bundle) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onVideoLoading(this.mProxy, bundle);
        }
    }

    public void onVideoPlaying(boolean z10, Bundle bundle) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onVideoPlaying(this.mProxy, z10, bundle);
        }
    }

    public void onVideoResolutionChanged(int i10, int i11) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onVideoResolutionChanged(this.mProxy, i10, i11);
        }
    }

    public void onWarning(int i10, String str, Bundle bundle) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onWarning(this.mProxy, i10, str, bundle);
        }
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int pauseAudio() {
        return nativePauseAudio(this.mNativeV2TXLivePlayerJni);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int pauseVideo() {
        return nativePauseVideo(this.mNativeV2TXLivePlayerJni);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int resumeAudio() {
        return nativeResumeAudio(this.mNativeV2TXLivePlayerJni);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int resumeVideo() {
        return nativeResumeVideo(this.mNativeV2TXLivePlayerJni);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setCacheParams(float f10, float f11) {
        if (f10 < 0.0f || f11 < 0.0f) {
            return -2;
        }
        return nativeSetCacheParams(this.mNativeV2TXLivePlayerJni, f10, f11);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public void setObserver(V2TXLivePlayerObserver v2TXLivePlayerObserver) {
        this.mObserver = v2TXLivePlayerObserver;
        if (v2TXLivePlayerObserver == null || !(v2TXLivePlayerObserver instanceof com.tencent.live2.impl.a.a)) {
            return;
        }
        enableExtensionCallback(true);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setPlayoutVolume(int i10) {
        return nativeSetPlayoutVolume(this.mNativeV2TXLivePlayerJni, i10);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.tencent.live2.V2TXLivePlayer
    public int setProperty(String str, Object obj) {
        synchronized (this) {
            byte b10 = -1;
            switch (str.hashCode()) {
                case 480042124:
                    if (str.equals(V2TXLiveDefInner.TXLivePropertyKey.kV2SetSurfaceSize)) {
                        b10 = 2;
                    }
                    break;
                case 582452376:
                    if (str.equals(V2TXLiveProperty.kV2ClearLastImage)) {
                        b10 = 0;
                    }
                    break;
                case 1120433643:
                    if (str.equals(V2TXLiveDefInner.TXLivePropertyKey.kV2SetSurface)) {
                        b10 = 1;
                    }
                    break;
                case 1615550654:
                    if (str.equals(V2TXLiveDefInner.TXLivePropertyKey.kV2SetOpenGLContext)) {
                        b10 = 3;
                    }
                    break;
            }
            if (b10 != 0) {
                if (b10 == 1) {
                    if (obj == null) {
                        return nativeSetRenderView(this.mNativeV2TXLivePlayerJni, null);
                    }
                    if (obj instanceof Surface) {
                        return nativeSetRenderView(this.mNativeV2TXLivePlayerJni, new DisplayTarget((Surface) obj));
                    }
                    LiteavLog.e(TAG, "setProperty error, key:" + str + ", value:" + obj);
                    return -2;
                }
                if (b10 == 2) {
                    LiteavLog.i(TAG, "set surface size is unnecessary");
                } else {
                    if (b10 != 3) {
                        return nativeSetProperty(this.mNativeV2TXLivePlayerJni, str, obj);
                    }
                    if (!(obj instanceof EGLContext) && !(obj instanceof android.opengl.EGLContext)) {
                        LiteavLog.e(TAG, "setProperty error, key:" + str + ", value:" + obj);
                        return -2;
                    }
                    nativeSetSharedEGLContext(this.mNativeV2TXLivePlayerJni, obj);
                }
            } else {
                if (!(obj instanceof Boolean)) {
                    LiteavLog.e(TAG, "setProperty error, key:" + str + ", value:" + obj);
                    return -2;
                }
                this.mClearLastImage = ((Boolean) obj).booleanValue();
            }
            return 0;
        }
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setRenderFillMode(V2TXLiveDef.V2TXLiveFillMode v2TXLiveFillMode) {
        GLConstants.GLScaleType gLScaleType;
        int i10 = AnonymousClass1.f99756b[v2TXLiveFillMode.ordinal()];
        if (i10 != 1) {
            gLScaleType = i10 != 2 ? GLConstants.GLScaleType.FIT_CENTER : GLConstants.GLScaleType.FILL;
        } else {
            gLScaleType = GLConstants.GLScaleType.CENTER_CROP;
        }
        return nativeSetRenderFillMode(this.mNativeV2TXLivePlayerJni, gLScaleType.mValue);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setRenderRotation(V2TXLiveDef.V2TXLiveRotation v2TXLiveRotation) {
        l lVar;
        int i10 = AnonymousClass1.f99755a[v2TXLiveRotation.ordinal()];
        if (i10 == 1) {
            lVar = l.ROTATION_90;
        } else if (i10 != 2) {
            lVar = i10 != 3 ? l.NORMAL : l.ROTATION_270;
        } else {
            lVar = l.ROTATION_180;
        }
        return nativeSetRenderRotation(this.mNativeV2TXLivePlayerJni, lVar.mValue);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setRenderView(SurfaceView surfaceView) {
        return nativeSetRenderView(this.mNativeV2TXLivePlayerJni, surfaceView != null ? new DisplayTarget(surfaceView) : null);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setRenderView(TextureView textureView) {
        return nativeSetRenderView(this.mNativeV2TXLivePlayerJni, textureView != null ? new DisplayTarget(textureView) : null);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setRenderView(TXCloudVideoView tXCloudVideoView) {
        return nativeSetRenderView(this.mNativeV2TXLivePlayerJni, tXCloudVideoView != null ? new DisplayTarget(tXCloudVideoView) : null);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public void showDebugView(boolean z10) {
        nativeShowDebugView(this.mNativeV2TXLivePlayerJni, z10);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int snapshot() {
        return nativeSnapshot(this.mNativeV2TXLivePlayerJni);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int startLivePlay(String str) {
        return nativeStartPlay(this.mNativeV2TXLivePlayerJni, str);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int startLocalRecording(V2TXLiveDef.V2TXLiveLocalRecordingParams v2TXLiveLocalRecordingParams) {
        if (v2TXLiveLocalRecordingParams == null || TextUtils.isEmpty(v2TXLiveLocalRecordingParams.filePath)) {
            return -2;
        }
        return nativeStartRecord(this.mNativeV2TXLivePlayerJni, v2TXLiveLocalRecordingParams.filePath, v2TXLiveLocalRecordingParams.recordMode.ordinal(), v2TXLiveLocalRecordingParams.interval);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public void stopLocalRecording() {
        nativeStopRecord(this.mNativeV2TXLivePlayerJni);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int stopPlay() {
        return nativeStopPlay(this.mNativeV2TXLivePlayerJni, this.mClearLastImage);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int switchStream(String str) {
        if (!TextUtils.isEmpty(str)) {
            return nativeSwitchStream(this.mNativeV2TXLivePlayerJni, str);
        }
        LiteavLog.e(TAG, "Invalid params.");
        return -2;
    }
}
