package com.ss.bytertc.engine.utils;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.opengl.EGLContext;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.FilterType;
import com.bytedance.realx.video.RendererCommon;
import com.bytedance.realx.video.VideoFrame;
import com.bytedance.realx.video.f0;
import com.bytedance.realx.video.i0;
import com.ss.bytertc.engine.video.ITextureBuffer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class TextureBufferImpl implements VideoFrame.TextureBuffer, EglContextCarrier, ITextureBuffer {
    private final int height;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f98004id;
    private EglBase.Context mEglBaseContext;
    private int refCount;
    private final Object refCountLock;
    private final Runnable releaseCallback;
    private FilterType scaleFilter;
    private final TextureHelper textureHelper;
    private final Matrix transformMatrix;
    private final VideoFrame.TextureBuffer.Type type;
    private final int width;
    private YuvImage yuvImage;

    @CalledByNative
    public TextureBufferImpl(int i10, int i11, int i12, final int i13, final TextureHelper textureHelper) {
        this.refCountLock = new Object();
        this.width = i10;
        this.height = i11;
        VideoFrame.TextureBuffer.Type type = VideoFrame.TextureBuffer.Type.OES;
        if (i12 == type.getGlTarget()) {
            this.type = type;
        } else {
            this.type = VideoFrame.TextureBuffer.Type.RGB;
        }
        this.f98004id = i13;
        Matrix matrix = new Matrix();
        this.transformMatrix = matrix;
        matrix.reset();
        this.textureHelper = textureHelper;
        this.releaseCallback = new Runnable() { // from class: com.ss.bytertc.engine.utils.TextureBufferImpl.1
            @Override // java.lang.Runnable
            public void run() {
                textureHelper.releaseTextureID(i13);
            }
        };
        this.refCount = 1;
    }

    public TextureBufferImpl(int i10, int i11, VideoFrame.TextureBuffer.Type type, int i12, Matrix matrix, TextureHelper textureHelper, Runnable runnable) {
        this.refCountLock = new Object();
        this.width = i10;
        this.height = i11;
        this.type = type;
        this.f98004id = i12;
        this.transformMatrix = matrix;
        this.textureHelper = textureHelper;
        this.releaseCallback = runnable;
        this.refCount = 1;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    @CalledByNative
    public VideoFrame.Buffer copyData() {
        int i10;
        final int iDequeueTexture = this.textureHelper.dequeueTexture();
        if (iDequeueTexture == 0) {
            return null;
        }
        VideoFrame.TextureBuffer.Type type = this.type;
        if (type == VideoFrame.TextureBuffer.Type.RGB) {
            i10 = 10;
        } else {
            if (type != VideoFrame.TextureBuffer.Type.OES) {
                return null;
            }
            i10 = 11;
        }
        this.textureHelper.drawTexture(i10, this.f98004id, iDequeueTexture);
        return new TextureBufferImpl(this.width, this.height, this.type, this.f98004id, this.transformMatrix, this.textureHelper, new Runnable() { // from class: com.ss.bytertc.engine.utils.TextureBufferImpl.2
            @Override // java.lang.Runnable
            public void run() {
                TextureBufferImpl.this.textureHelper.queueTexture(iDequeueTexture);
            }
        });
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    @CalledByNative
    public VideoFrame.Buffer cropAndScale(int i10, int i11, int i12, int i13, int i14, int i15) {
        retain();
        Matrix matrix = new Matrix();
        int i16 = this.height;
        matrix.preTranslate(i10 / this.width, (i16 - (i11 + i13)) / i16);
        matrix.preScale(i12 / this.width, i13 / this.height);
        this.scaleFilter = null;
        Matrix matrix2 = new Matrix(this.transformMatrix);
        matrix2.preConcat(matrix);
        return new TextureBufferImpl(i14, i15, this.type, this.f98004id, matrix2, this.textureHelper, new Runnable() { // from class: com.ss.bytertc.engine.utils.TextureBufferImpl.3
            @Override // java.lang.Runnable
            public void run() {
                TextureBufferImpl.this.release();
            }
        });
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public VideoFrame.Buffer cropAndScaleWithFilter(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        Matrix matrix = new Matrix();
        int i17 = this.height;
        matrix.preTranslate(i10 / this.width, (i17 - (i11 + i13)) / i17);
        matrix.preScale(i12 / this.width, i13 / this.height);
        this.scaleFilter = FilterType.fromValue(i16);
        Matrix matrix2 = new Matrix(this.transformMatrix);
        matrix2.preConcat(matrix);
        return new TextureBufferImpl(i14, i15, this.type, this.f98004id, matrix2, this.textureHelper, new Runnable() { // from class: com.ss.bytertc.engine.utils.TextureBufferImpl.4
            @Override // java.lang.Runnable
            public void run() {
                TextureBufferImpl.this.release();
            }
        });
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer, com.bytedance.realx.video.VideoFrame.Buffer
    public /* synthetic */ int getBufferType() {
        return i0.a(this);
    }

    @Override // com.ss.bytertc.engine.utils.EglContextCarrier
    public EglBase.Context getEglBaseContext() {
        return this.mEglBaseContext;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public EGLContext getEglContext() {
        TextureHelper textureHelper = this.textureHelper;
        if (textureHelper != null) {
            return textureHelper.getEglBaseContext().getEgl14Context();
        }
        return null;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    @CalledByNative
    public long getNativeEglContext() {
        TextureHelper textureHelper = this.textureHelper;
        if (textureHelper != null) {
            return textureHelper.getNativeEglContext();
        }
        return 0L;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    @CalledByNative
    public FilterType getScaleFilter() {
        return FilterType.Origin;
    }

    @CalledByNative
    public TextureHelper getTextureHelper() {
        return this.textureHelper;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    @CalledByNative
    public int getTextureId() {
        return this.f98004id;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public Matrix getTransformMatrix() {
        return this.transformMatrix;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public VideoFrame.TextureBuffer.Type getType() {
        return this.type;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    @CalledByNative
    public int getTypeGlTarget() {
        return this.type.getGlTarget();
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    @CalledByNative
    public int getUnscaledHeight() {
        return this.height;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    @CalledByNative
    public int getUnscaledWidth() {
        return this.width;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    @CalledByNative
    public float[] nativeGetTransFormMatrix() {
        return RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.transformMatrix);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer, com.bytedance.realx.base.RefCounted
    @CalledByNative
    public void release() {
        Runnable runnable;
        synchronized (this.refCountLock) {
            int i10 = this.refCount - 1;
            this.refCount = i10;
            if (i10 == 0 && (runnable = this.releaseCallback) != null) {
                runnable.run();
            }
        }
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer, com.bytedance.realx.base.RefCounted
    @CalledByNative
    public void retain() {
        synchronized (this.refCountLock) {
            this.refCount++;
        }
    }

    public void saveMyBitmap(String str, byte[] bArr, int i10, int i11) {
        LogUtil.i("texturebuffer", "saveMyBitmap");
        File file = new File(str);
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (FileNotFoundException e10) {
            e10.printStackTrace();
        }
        try {
            new YuvImage(bArr, 17, this.width, this.height, null).compressToJpeg(new Rect(0, 0, this.width, this.height), 50, fileOutputStream);
        } catch (Exception unused2) {
        }
        try {
            fileOutputStream.flush();
        } catch (IOException e11) {
            e11.printStackTrace();
        }
        try {
            fileOutputStream.close();
        } catch (IOException e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer scaleAndFill(int i10, int i11, int i12, int i13) {
        Matrix matrix = new Matrix();
        int iMin = Math.min(i10, (getWidth() * i11) / getHeight());
        int iMin2 = Math.min(i11, (getHeight() * i10) / getWidth());
        matrix.preScale(iMin / getWidth(), iMin2 / getHeight());
        matrix.preTranslate(i12 / i10, (i11 - (i13 + iMin2)) / i11);
        return new TextureBufferImpl(i10, i11, this.type, this.f98004id, matrix, this.textureHelper, new Runnable() { // from class: com.ss.bytertc.engine.utils.TextureBufferImpl.5
            @Override // java.lang.Runnable
            public void run() {
                TextureBufferImpl.this.release();
            }
        });
    }

    @Override // com.ss.bytertc.engine.utils.EglContextCarrier
    public void setEglBaseContext(EglBase.Context context) {
        this.mEglBaseContext = context;
    }

    @CalledByNative
    public void setTransFormMatrix(float[] fArr) {
        RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        return this.textureHelper.textureToYuv(this);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public /* synthetic */ VideoFrame.NV12Buffer toNV12() {
        return f0.a(this);
    }
}
