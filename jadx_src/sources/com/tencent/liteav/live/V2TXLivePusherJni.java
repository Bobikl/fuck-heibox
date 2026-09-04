package com.tencent.liteav.live;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.text.ttml.d;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.audio.TXAudioEffectManagerImpl;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.j;
import com.tencent.liteav.base.util.l;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.beauty.TXBeautyManagerImpl;
import com.tencent.liteav.device.TXDeviceManager;
import com.tencent.liteav.device.TXDeviceManagerImpl;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.live2.V2TXLiveDef;
import com.tencent.live2.V2TXLivePusher;
import com.tencent.live2.V2TXLivePusherObserver;
import com.tencent.live2.impl.V2TXLiveDefInner;
import com.tencent.live2.impl.a.b;
import com.tencent.rtmp.ui.TXCloudVideoView;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav")
public class V2TXLivePusherJni extends V2TXLivePusher {
    private static final String TAG = "V2TXLivePusherJni";
    private TXAudioEffectManager mAudioEffectManager;
    private TXBeautyManagerImpl mBeautyManager;
    private TXDeviceManager mDeviceManager;
    private long mNativeV2TXLivePusherJni;
    private V2TXLivePusherObserver mObserver;

    /* JADX INFO: renamed from: com.tencent.liteav.live.V2TXLivePusherJni$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f99760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f99761b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f99762c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f99763d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f99764e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final /* synthetic */ int[] f99765f;

        static {
            int[] iArr = new int[GLConstants.a.values().length];
            f99765f = iArr;
            try {
                iArr[GLConstants.a.TEXTURE_2D.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f99765f[GLConstants.a.BYTE_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f99765f[GLConstants.a.BYTE_BUFFER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[GLConstants.PixelFormatType.values().length];
            f99764e = iArr2;
            try {
                iArr2[GLConstants.PixelFormatType.I420.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f99764e[GLConstants.PixelFormatType.RGBA.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[V2TXLiveDef.V2TXLiveBufferType.values().length];
            f99763d = iArr3;
            try {
                iArr3[V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeTexture.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f99763d[V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f99763d[V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr4 = new int[V2TXLiveDef.V2TXLivePixelFormat.values().length];
            f99762c = iArr4;
            try {
                iArr4[V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatI420.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f99762c[V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr5 = new int[V2TXLiveDef.V2TXLiveFillMode.values().length];
            f99761b = iArr5;
            try {
                iArr5[V2TXLiveDef.V2TXLiveFillMode.V2TXLiveFillModeFill.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f99761b[V2TXLiveDef.V2TXLiveFillMode.V2TXLiveFillModeFit.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f99761b[V2TXLiveDef.V2TXLiveFillMode.V2TXLiveFillModeScaleFill.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr6 = new int[V2TXLiveDef.V2TXLiveRotation.values().length];
            f99760a = iArr6;
            try {
                iArr6[V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation90.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f99760a[V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation180.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f99760a[V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation270.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public V2TXLivePusherJni(Context context, int i10) {
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix("liteav");
        long jNativeCreate = nativeCreate(new WeakReference(this), i10);
        this.mNativeV2TXLivePusherJni = jNativeCreate;
        this.mAudioEffectManager = new TXAudioEffectManagerImpl(nativeCreateAudioEffectManager(jNativeCreate));
        this.mBeautyManager = new TXBeautyManagerImpl(nativeCreateBeautyManager(this.mNativeV2TXLivePusherJni));
        this.mDeviceManager = new TXDeviceManagerImpl(nativeCreateDeviceManager(this.mNativeV2TXLivePusherJni));
        if (context instanceof Activity) {
            j.a().a((Activity) context);
        }
    }

    private static Object getEglContextFromLiveVideoFrame(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        V2TXLiveDef.V2TXLiveTexture v2TXLiveTexture = v2TXLiveVideoFrame.texture;
        Object obj = v2TXLiveTexture.eglContext10;
        if (obj == null) {
            obj = null;
        }
        EGLContext eGLContext = v2TXLiveTexture.eglContext14;
        if (eGLContext != null) {
            obj = eGLContext;
        }
        return obj == null ? EGL14.eglGetCurrentContext() : obj;
    }

    private static native long nativeCreate(WeakReference<V2TXLivePusherJni> weakReference, int i10);

    private static native long nativeCreateAudioEffectManager(long j10);

    private static native long nativeCreateBeautyManager(long j10);

    private static native long nativeCreateDeviceManager(long j10);

    private static native void nativeDestroy(long j10);

    private static native int nativeEnableAudioProcessObserver(long j10, boolean z10, int i10, int i11, int i12, int i13);

    private static native int nativeEnableCustomAudioCapture(long j10, boolean z10);

    private static native int nativeEnableCustomVideoCapture(long j10, boolean z10);

    private static native int nativeEnableCustomVideoProcess(long j10, boolean z10, int i10, int i11);

    private static native void nativeEnableExtensionCallback(long j10, boolean z10);

    private static native void nativeEnableVoiceActivityDetection(long j10, boolean z10);

    private static native int nativeEnableVolumeEvaluation(long j10, int i10);

    private static native int nativeIsPushing(long j10);

    private static native int nativePauseAudio(long j10);

    private static native int nativePauseVideo(long j10);

    private static native int nativeResumeAudio(long j10);

    private static native int nativeResumeVideo(long j10);

    private static native int nativeSendCustomAudioFrame(long j10, byte[] bArr, int i10, int i11, long j11);

    private static native int nativeSendCustomVideoFrame(long j10, int i10, int i11, int i12, int i13, int i14, int i15, Object obj, byte[] bArr, ByteBuffer byteBuffer);

    private static native int nativeSendSeiMessage(long j10, int i10, byte[] bArr);

    private static native int nativeSetAudioQuality(long j10, int i10);

    private static native int nativeSetEncoderMirror(long j10, boolean z10);

    private static native int nativeSetMixTranscodingConfig(long j10, String str);

    private static native int nativeSetProperty(long j10, String str, Object obj);

    private static native int nativeSetRenderFillMode(long j10, int i10);

    private static native int nativeSetRenderMirror(long j10, int i10);

    private static native int nativeSetRenderRotation(long j10, int i10);

    private static native int nativeSetRenderView(long j10, DisplayTarget displayTarget);

    private static native int nativeSetVideoQuality(long j10, int i10, int i11, int i12, int i13, int i14);

    private static native int nativeSetWatermark(long j10, Bitmap bitmap, float f10, float f11, float f12);

    private static native void nativeShowDebugView(long j10, boolean z10);

    private static native int nativeSnapshot(long j10);

    private static native int nativeStartCamera(long j10, boolean z10);

    private static native int nativeStartMicrophone(long j10);

    private static native int nativeStartPush(long j10, String str);

    private static native int nativeStartRecord(long j10, String str, int i10, int i11);

    private static native int nativeStartScreenCapture(long j10);

    private static native int nativeStartSystemAudioLoopback(long j10);

    private static native int nativeStartVirtualCamera(long j10, Bitmap bitmap);

    private static native int nativeStopCamera(long j10);

    private static native int nativeStopMicrophone(long j10);

    private static native int nativeStopPush(long j10);

    private static native void nativeStopRecord(long j10);

    private static native int nativeStopScreenCapture(long j10);

    private static native int nativeStopSystemAudioLoopback(long j10);

    private static native int nativeStopVirtualCamera(long j10);

    public static V2TXLivePusherJni weakToStrongReference(WeakReference<V2TXLivePusherJni> weakReference) {
        return weakReference.get();
    }

    public V2TXLiveDef.V2TXLiveVideoFrame createV2TXLiveVideoFrame(int i10, int i11, int i12, int i13, int i14, int i15, Object obj, byte[] bArr, ByteBuffer byteBuffer) {
        V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame = new V2TXLiveDef.V2TXLiveVideoFrame();
        int i16 = AnonymousClass1.f99764e[GLConstants.PixelFormatType.a(i13).ordinal()];
        if (i16 == 1) {
            v2TXLiveVideoFrame.pixelFormat = V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatI420;
        } else {
            if (i16 != 2) {
                return null;
            }
            v2TXLiveVideoFrame.pixelFormat = V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D;
        }
        int i17 = AnonymousClass1.f99765f[GLConstants.a.a(i12).ordinal()];
        if (i17 == 1) {
            v2TXLiveVideoFrame.bufferType = V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeTexture;
            V2TXLiveDef.V2TXLiveTexture v2TXLiveTexture = new V2TXLiveDef.V2TXLiveTexture();
            v2TXLiveVideoFrame.texture = v2TXLiveTexture;
            v2TXLiveTexture.textureId = i15;
            if (obj instanceof javax.microedition.khronos.egl.EGLContext) {
                v2TXLiveTexture.eglContext10 = (javax.microedition.khronos.egl.EGLContext) obj;
            } else if (obj instanceof EGLContext) {
                v2TXLiveTexture.eglContext14 = (EGLContext) obj;
            }
        } else if (i17 == 2) {
            v2TXLiveVideoFrame.bufferType = V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray;
            v2TXLiveVideoFrame.data = bArr;
        } else {
            if (i17 != 3) {
                return null;
            }
            v2TXLiveVideoFrame.bufferType = V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer;
            v2TXLiveVideoFrame.buffer = byteBuffer;
        }
        v2TXLiveVideoFrame.width = i10;
        v2TXLiveVideoFrame.height = i11;
        v2TXLiveVideoFrame.rotation = i14;
        return v2TXLiveVideoFrame;
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int enableAudioProcessObserver(boolean z10, V2TXLiveDef.V2TXLiveAudioFrameObserverFormat v2TXLiveAudioFrameObserverFormat) {
        if (v2TXLiveAudioFrameObserverFormat == null) {
            return -2;
        }
        return nativeEnableAudioProcessObserver(this.mNativeV2TXLivePusherJni, z10, v2TXLiveAudioFrameObserverFormat.sampleRate, v2TXLiveAudioFrameObserverFormat.channel, v2TXLiveAudioFrameObserverFormat.samplesPerCall, v2TXLiveAudioFrameObserverFormat.mode.ordinal());
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int enableCustomAudioCapture(boolean z10) {
        return nativeEnableCustomAudioCapture(this.mNativeV2TXLivePusherJni, z10);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int enableCustomVideoCapture(boolean z10) {
        return nativeEnableCustomVideoCapture(this.mNativeV2TXLivePusherJni, z10);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int enableCustomVideoProcess(boolean z10, V2TXLiveDef.V2TXLivePixelFormat v2TXLivePixelFormat, V2TXLiveDef.V2TXLiveBufferType v2TXLiveBufferType) {
        if (!z10) {
            return nativeEnableCustomVideoProcess(this.mNativeV2TXLivePusherJni, z10, v2TXLivePixelFormat.ordinal(), v2TXLiveBufferType.ordinal());
        }
        boolean z11 = false;
        if ((v2TXLiveBufferType == V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer && v2TXLivePixelFormat == V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatI420) || (v2TXLiveBufferType == V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeTexture && v2TXLivePixelFormat == V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D)) {
            z11 = true;
        }
        if (z11) {
            return nativeEnableCustomVideoProcess(this.mNativeV2TXLivePusherJni, z10, v2TXLivePixelFormat.ordinal(), v2TXLiveBufferType.ordinal());
        }
        return -4;
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public void enableVoiceActivityDetection(boolean z10) {
        nativeEnableVoiceActivityDetection(this.mNativeV2TXLivePusherJni, z10);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int enableVolumeEvaluation(int i10) {
        return nativeEnableVolumeEvaluation(this.mNativeV2TXLivePusherJni, i10);
    }

    protected void finalize() throws Throwable {
        super.finalize();
        release();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public TXAudioEffectManager getAudioEffectManager() {
        return this.mAudioEffectManager;
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public TXBeautyManager getBeautyManager() {
        return this.mBeautyManager;
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public TXDeviceManager getDeviceManager() {
        return this.mDeviceManager;
    }

    public int getFrameBufferType(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        GLConstants.a aVar = GLConstants.a.BYTE_BUFFER;
        int i10 = AnonymousClass1.f99763d[v2TXLiveVideoFrame.bufferType.ordinal()];
        if (i10 == 1) {
            aVar = GLConstants.a.TEXTURE_2D;
        } else if (i10 == 2) {
            aVar = GLConstants.a.BYTE_ARRAY;
        }
        return aVar.mValue;
    }

    public byte[] getFrameByteArray(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        return v2TXLiveVideoFrame.data;
    }

    public ByteBuffer getFrameByteBuffer(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        return v2TXLiveVideoFrame.buffer;
    }

    public Object getFrameEglContext(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        V2TXLiveDef.V2TXLiveTexture v2TXLiveTexture;
        if (v2TXLiveVideoFrame == null || (v2TXLiveTexture = v2TXLiveVideoFrame.texture) == null) {
            return null;
        }
        javax.microedition.khronos.egl.EGLContext eGLContext = v2TXLiveTexture.eglContext10;
        javax.microedition.khronos.egl.EGLContext eGLContext2 = eGLContext != null ? eGLContext : null;
        EGLContext eGLContext3 = v2TXLiveTexture.eglContext14;
        return eGLContext3 != null ? eGLContext3 : eGLContext2;
    }

    public int getFrameHeight(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        return v2TXLiveVideoFrame.height;
    }

    public int getFramePixelFormat(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        GLConstants.PixelFormatType pixelFormatType = GLConstants.PixelFormatType.I420;
        int i10 = AnonymousClass1.f99762c[v2TXLiveVideoFrame.pixelFormat.ordinal()];
        if (i10 != 1 && i10 == 2) {
            pixelFormatType = GLConstants.PixelFormatType.RGBA;
        }
        return pixelFormatType.getValue();
    }

    public int getFrameRotation(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        return v2TXLiveVideoFrame.rotation;
    }

    public int getFrameTextureId(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        V2TXLiveDef.V2TXLiveTexture v2TXLiveTexture;
        if (v2TXLiveVideoFrame == null || (v2TXLiveTexture = v2TXLiveVideoFrame.texture) == null) {
            return -1;
        }
        return v2TXLiveTexture.textureId;
    }

    public int getFrameWidth(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        return v2TXLiveVideoFrame.width;
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int isPushing() {
        return nativeIsPushing(this.mNativeV2TXLivePusherJni);
    }

    public void onCaptureFirstAudioFrame() {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onCaptureFirstAudioFrame();
        }
    }

    public void onCaptureFirstVideoFrame() {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onCaptureFirstVideoFrame();
        }
    }

    public int onCustomPreprocessFrame(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame, V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame2) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            return v2TXLivePusherObserver.onProcessVideoFrame(v2TXLiveVideoFrame, v2TXLiveVideoFrame2);
        }
        return -1;
    }

    public void onEnterRoom(int i10, String str) {
    }

    public void onError(int i10, String str, Bundle bundle) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onError(i10, str, bundle);
        }
    }

    public void onExitRoom(int i10, String str) {
    }

    public void onGLContextCreated() {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onGLContextCreated();
        }
    }

    public void onGLContextDestroyed() {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onGLContextDestroyed();
        }
    }

    public void onMicrophoneVolumeUpdate(int i10) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onMicrophoneVolumeUpdate(i10);
        }
    }

    public void onNetworkQuality(int i10) {
    }

    public void onProcessAudioFrame(byte[] bArr, long j10, int i10, int i11) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver == null) {
            return;
        }
        V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame = new V2TXLiveDef.V2TXLiveAudioFrame();
        v2TXLiveAudioFrame.data = bArr;
        v2TXLiveAudioFrame.sampleRate = i10;
        v2TXLiveAudioFrame.channel = i11;
        v2TXLiveAudioFrame.timestamp = j10;
        v2TXLivePusherObserver.onProcessAudioFrame(v2TXLiveAudioFrame);
    }

    public void onPushEvent(int i10, Bundle bundle) {
    }

    public void onPushNetStatus(Bundle bundle) {
    }

    public void onPushStatusUpdate(int i10, String str, Bundle bundle) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        V2TXLiveDef.V2TXLivePushStatus v2TXLivePushStatus = V2TXLiveDef.V2TXLivePushStatus.V2TXLivePushStatusDisconnected;
        if (i10 == 0) {
            v2TXLivePushStatus = V2TXLiveDef.V2TXLivePushStatus.V2TXLivePushStatusConnecting;
            str = "connecting to the server.";
        } else if (i10 == 1) {
            v2TXLivePushStatus = V2TXLiveDef.V2TXLivePushStatus.V2TXLivePushStatusConnectSuccess;
            str = "connected to the server successfully.";
        } else if (i10 == 2) {
            v2TXLivePushStatus = V2TXLiveDef.V2TXLivePushStatus.V2TXLivePushStatusReconnecting;
            str = "reconnecting to the server.";
        } else if (i10 == 3) {
            str = "disconnected from the server.";
        }
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onPushStatusUpdate(v2TXLivePushStatus, str, bundle);
        }
    }

    public void onRecordBegin(int i10, String str) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onLocalRecordBegin(i10, str);
        }
    }

    public void onRecordComplete(int i10, String str) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onLocalRecordComplete(i10, str);
        }
    }

    public void onRecordProgress(long j10, String str) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onLocalRecording(j10, str);
        }
    }

    public void onScreenCaptureStarted() {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onScreenCaptureStarted();
        }
    }

    public void onScreenCaptureStoped(int i10) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onScreenCaptureStopped(i10);
        }
    }

    public void onSetMixTranscodingConfig(int i10, String str) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onSetMixTranscodingConfig(i10, str);
        }
    }

    public void onSnapshotComplete(Bitmap bitmap) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onSnapshotComplete(bitmap);
        }
    }

    public void onStatisticsUpdate(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            V2TXLiveDef.V2TXLivePusherStatistics v2TXLivePusherStatistics = new V2TXLiveDef.V2TXLivePusherStatistics();
            v2TXLivePusherStatistics.appCpu = i10;
            v2TXLivePusherStatistics.systemCpu = i11;
            v2TXLivePusherStatistics.width = i12;
            v2TXLivePusherStatistics.height = i13;
            v2TXLivePusherStatistics.fps = i14;
            v2TXLivePusherStatistics.videoBitrate = i15;
            v2TXLivePusherStatistics.audioBitrate = i16;
            v2TXLivePusherStatistics.rtt = i17;
            v2TXLivePusherStatistics.netSpeed = i18;
            v2TXLivePusherObserver.onStatisticsUpdate(v2TXLivePusherStatistics);
        }
    }

    public void onUserAudioAvailable(String str, boolean z10) {
    }

    public void onUserOffline(String str) {
    }

    public void onUserOnline(String str) {
    }

    public void onUserVideoAvailable(String str, int i10, boolean z10) {
    }

    public void onVoiceActivityDetectionUpdate(boolean z10) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onVoiceActivityDetectionUpdate(z10);
        }
    }

    public void onWarning(int i10, String str, Bundle bundle) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onWarning(i10, str, bundle);
        }
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int pauseAudio() {
        return nativePauseAudio(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int pauseVideo() {
        return nativePauseVideo(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public void release() {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.mBeautyManager;
        if (tXBeautyManagerImpl != null) {
            tXBeautyManagerImpl.clear();
        }
        long j10 = this.mNativeV2TXLivePusherJni;
        if (j10 != 0) {
            nativeDestroy(j10);
            this.mNativeV2TXLivePusherJni = 0L;
        }
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int resumeAudio() {
        return nativeResumeAudio(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int resumeVideo() {
        return nativeResumeVideo(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int sendCustomAudioFrame(V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame) {
        if (v2TXLiveAudioFrame == null) {
            return -2;
        }
        return nativeSendCustomAudioFrame(this.mNativeV2TXLivePusherJni, v2TXLiveAudioFrame.data, v2TXLiveAudioFrame.sampleRate, v2TXLiveAudioFrame.channel, v2TXLiveAudioFrame.timestamp);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int sendCustomVideoFrame(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        GLConstants.PixelFormatType pixelFormatType;
        GLConstants.a aVar;
        if (v2TXLiveVideoFrame == null) {
            return -2;
        }
        Object eglContextFromLiveVideoFrame = null;
        int i10 = AnonymousClass1.f99762c[v2TXLiveVideoFrame.pixelFormat.ordinal()];
        int i11 = -1;
        if (i10 == 1) {
            pixelFormatType = GLConstants.PixelFormatType.I420;
        } else {
            if (i10 != 2) {
                return -1;
            }
            pixelFormatType = GLConstants.PixelFormatType.RGBA;
        }
        int i12 = AnonymousClass1.f99763d[v2TXLiveVideoFrame.bufferType.ordinal()];
        if (i12 == 1) {
            aVar = GLConstants.a.TEXTURE_2D;
            V2TXLiveDef.V2TXLiveTexture v2TXLiveTexture = v2TXLiveVideoFrame.texture;
            if (v2TXLiveTexture == null) {
                return -1;
            }
            i11 = v2TXLiveTexture.textureId;
            eglContextFromLiveVideoFrame = getEglContextFromLiveVideoFrame(v2TXLiveVideoFrame);
        } else if (i12 == 2) {
            aVar = GLConstants.a.BYTE_ARRAY;
        } else {
            if (i12 != 3) {
                return -1;
            }
            aVar = GLConstants.a.BYTE_BUFFER;
        }
        return nativeSendCustomVideoFrame(this.mNativeV2TXLivePusherJni, v2TXLiveVideoFrame.width, v2TXLiveVideoFrame.height, aVar.mValue, pixelFormatType.getValue(), v2TXLiveVideoFrame.rotation, i11, eglContextFromLiveVideoFrame, v2TXLiveVideoFrame.data, v2TXLiveVideoFrame.buffer);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int sendSeiMessage(int i10, byte[] bArr) {
        return nativeSendSeiMessage(this.mNativeV2TXLivePusherJni, i10, bArr);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setAudioQuality(V2TXLiveDef.V2TXLiveAudioQuality v2TXLiveAudioQuality) {
        return nativeSetAudioQuality(this.mNativeV2TXLivePusherJni, v2TXLiveAudioQuality.ordinal());
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setEncoderMirror(boolean z10) {
        return nativeSetEncoderMirror(this.mNativeV2TXLivePusherJni, z10);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setMixTranscodingConfig(V2TXLiveDef.V2TXLiveTranscodingConfig v2TXLiveTranscodingConfig) {
        JSONObject jSONObject;
        String string = "";
        if (v2TXLiveTranscodingConfig != null) {
            JSONObject jSONObject2 = null;
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("videoWidth", v2TXLiveTranscodingConfig.videoWidth);
                    jSONObject3.put("videoHeight", v2TXLiveTranscodingConfig.videoHeight);
                    jSONObject3.put("videoBitrate", v2TXLiveTranscodingConfig.videoBitrate);
                    jSONObject3.put("videoFramerate", v2TXLiveTranscodingConfig.videoFramerate);
                    jSONObject3.put("videoGOP", v2TXLiveTranscodingConfig.videoGOP);
                    jSONObject3.put(d.H, v2TXLiveTranscodingConfig.backgroundColor);
                    jSONObject3.put("backgroundImage", TextUtils.isEmpty(v2TXLiveTranscodingConfig.backgroundImage) ? "" : v2TXLiveTranscodingConfig.backgroundImage);
                    jSONObject3.put("audioSampleRate", v2TXLiveTranscodingConfig.audioSampleRate);
                    jSONObject3.put("audioBitrate", v2TXLiveTranscodingConfig.audioBitrate);
                    jSONObject3.put("audioChannels", v2TXLiveTranscodingConfig.audioChannels);
                    jSONObject3.put("outputStreamId", TextUtils.isEmpty(v2TXLiveTranscodingConfig.outputStreamId) ? "" : v2TXLiveTranscodingConfig.outputStreamId);
                    JSONArray jSONArray = new JSONArray();
                    ArrayList<V2TXLiveDef.V2TXLiveMixStream> arrayList = v2TXLiveTranscodingConfig.mixStreams;
                    if (arrayList != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            V2TXLiveDef.V2TXLiveMixStream v2TXLiveMixStream = arrayList.get(i10);
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("userId", TextUtils.isEmpty(v2TXLiveMixStream.userId) ? "" : v2TXLiveMixStream.userId);
                            jSONObject4.put("streamId", TextUtils.isEmpty(v2TXLiveMixStream.streamId) ? "" : v2TXLiveMixStream.streamId);
                            jSONObject4.put("x", v2TXLiveMixStream.f100879x);
                            jSONObject4.put("y", v2TXLiveMixStream.f100880y);
                            jSONObject4.put("width", v2TXLiveMixStream.width);
                            jSONObject4.put("height", v2TXLiveMixStream.height);
                            jSONObject4.put("zOrder", v2TXLiveMixStream.zOrder);
                            jSONObject4.put(RemoteMessageConst.INPUT_TYPE, v2TXLiveMixStream.inputType.ordinal());
                            jSONArray.put(jSONObject4);
                        }
                    }
                    jSONObject3.put("mixStreamList", jSONArray);
                    jSONObject = jSONObject3;
                } catch (Exception e10) {
                    e = e10;
                    jSONObject2 = jSONObject3;
                    e.printStackTrace();
                    jSONObject = jSONObject2;
                }
            } catch (Exception e11) {
                e = e11;
            }
            if (jSONObject != null) {
                string = jSONObject.toString();
            }
        }
        return nativeSetMixTranscodingConfig(this.mNativeV2TXLivePusherJni, string);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public void setObserver(V2TXLivePusherObserver v2TXLivePusherObserver) {
        this.mObserver = v2TXLivePusherObserver;
        if (v2TXLivePusherObserver == null || !(v2TXLivePusherObserver instanceof b)) {
            return;
        }
        nativeEnableExtensionCallback(this.mNativeV2TXLivePusherJni, true);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setProperty(String str, Object obj) {
        str.hashCode();
        if (str.equals(V2TXLiveDefInner.TXLivePropertyKey.kV2SetSurfaceSize)) {
            LiteavLog.i(TAG, "set surface size is unnecessary");
            return 0;
        }
        if (!str.equals(V2TXLiveDefInner.TXLivePropertyKey.kV2SetSurface)) {
            return nativeSetProperty(this.mNativeV2TXLivePusherJni, str, obj);
        }
        if (obj == null) {
            nativeSetRenderView(this.mNativeV2TXLivePusherJni, null);
            return 0;
        }
        if (obj instanceof Surface) {
            nativeSetRenderView(this.mNativeV2TXLivePusherJni, new DisplayTarget((Surface) obj));
            return 0;
        }
        LiteavLog.e(TAG, "setProperty error, key:" + str + ", value:" + obj);
        return -2;
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setRenderFillMode(V2TXLiveDef.V2TXLiveFillMode v2TXLiveFillMode) {
        GLConstants.GLScaleType gLScaleType = GLConstants.GLScaleType.CENTER_CROP;
        int i10 = AnonymousClass1.f99761b[v2TXLiveFillMode.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                gLScaleType = GLConstants.GLScaleType.FIT_CENTER;
            } else if (i10 == 3) {
                gLScaleType = GLConstants.GLScaleType.FILL;
            }
        }
        return nativeSetRenderFillMode(this.mNativeV2TXLivePusherJni, gLScaleType.mValue);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setRenderMirror(V2TXLiveDef.V2TXLiveMirrorType v2TXLiveMirrorType) {
        return nativeSetRenderMirror(this.mNativeV2TXLivePusherJni, v2TXLiveMirrorType.ordinal());
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setRenderRotation(V2TXLiveDef.V2TXLiveRotation v2TXLiveRotation) {
        l lVar;
        int i10 = AnonymousClass1.f99760a[v2TXLiveRotation.ordinal()];
        if (i10 == 1) {
            lVar = l.ROTATION_90;
        } else if (i10 != 2) {
            lVar = i10 != 3 ? l.NORMAL : l.ROTATION_270;
        } else {
            lVar = l.ROTATION_180;
        }
        return nativeSetRenderRotation(this.mNativeV2TXLivePusherJni, lVar.mValue);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setRenderView(SurfaceView surfaceView) {
        return nativeSetRenderView(this.mNativeV2TXLivePusherJni, new DisplayTarget(surfaceView));
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setRenderView(TextureView textureView) {
        return nativeSetRenderView(this.mNativeV2TXLivePusherJni, new DisplayTarget(textureView));
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setRenderView(TXCloudVideoView tXCloudVideoView) {
        return nativeSetRenderView(this.mNativeV2TXLivePusherJni, new DisplayTarget(tXCloudVideoView));
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setVideoQuality(V2TXLiveDef.V2TXLiveVideoEncoderParam v2TXLiveVideoEncoderParam) {
        if (v2TXLiveVideoEncoderParam == null) {
            return -2;
        }
        return nativeSetVideoQuality(this.mNativeV2TXLivePusherJni, v2TXLiveVideoEncoderParam.videoResolution.ordinal(), v2TXLiveVideoEncoderParam.videoResolutionMode.ordinal(), v2TXLiveVideoEncoderParam.videoFps, v2TXLiveVideoEncoderParam.videoBitrate, v2TXLiveVideoEncoderParam.minVideoBitrate);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setWatermark(Bitmap bitmap, float f10, float f11, float f12) {
        return nativeSetWatermark(this.mNativeV2TXLivePusherJni, bitmap, f10, f11, f12);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public void showDebugView(boolean z10) {
        nativeShowDebugView(this.mNativeV2TXLivePusherJni, z10);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int snapshot() {
        return nativeSnapshot(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int startCamera(boolean z10) {
        return nativeStartCamera(this.mNativeV2TXLivePusherJni, z10);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int startLocalRecording(V2TXLiveDef.V2TXLiveLocalRecordingParams v2TXLiveLocalRecordingParams) {
        if (v2TXLiveLocalRecordingParams == null || TextUtils.isEmpty(v2TXLiveLocalRecordingParams.filePath)) {
            return -2;
        }
        return nativeStartRecord(this.mNativeV2TXLivePusherJni, v2TXLiveLocalRecordingParams.filePath, v2TXLiveLocalRecordingParams.recordMode.ordinal(), v2TXLiveLocalRecordingParams.interval);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int startMicrophone() {
        return nativeStartMicrophone(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int startPush(String str) {
        return nativeStartPush(this.mNativeV2TXLivePusherJni, str);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int startScreenCapture() {
        return nativeStartScreenCapture(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int startSystemAudioLoopback() {
        return nativeStartSystemAudioLoopback(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int startVirtualCamera(Bitmap bitmap) {
        return nativeStartVirtualCamera(this.mNativeV2TXLivePusherJni, bitmap);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int stopCamera() {
        return nativeStopCamera(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public void stopLocalRecording() {
        nativeStopRecord(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int stopMicrophone() {
        return nativeStopMicrophone(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int stopPush() {
        return nativeStopPush(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int stopScreenCapture() {
        return nativeStopScreenCapture(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int stopSystemAudioLoopback() {
        return nativeStopSystemAudioLoopback(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int stopVirtualCamera() {
        return nativeStopVirtualCamera(this.mNativeV2TXLivePusherJni);
    }
}
