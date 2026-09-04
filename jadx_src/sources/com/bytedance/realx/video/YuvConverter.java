package com.bytedance.realx.video;

import android.graphics.Matrix;
import android.opengl.GLES20;
import android.util.Log;
import com.bytedance.realx.base.JniCommon;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.base.ThreadUtils;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class YuvConverter {
    public static final int FORMAT_TEXTURE_2D = 10;
    public static final int FORMAT_TEXTURE_OES = 11;
    private static final String FRAGMENT_SHADER = "uniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 1.5 * xUnit).rgb);\n}\n";
    private static final int TEXTURE_MAX_COUNT = 45;
    private static float[] TEX_MATRIX = new float[16];
    private final GlGenericDrawer drawer;
    private final GlTextureFrameBuffer i420TextureFrameBuffer;
    private GlRectDrawer mTextureDrawer;
    private final ShaderCallbacks shaderCallbacks;
    private final ThreadUtils.ThreadChecker threadChecker;
    private List<Integer> mTextureFreeQueue = new LinkedList();
    private List<Integer> mTextureUsedQueue = new LinkedList();
    private HashMap<Integer, Integer> mTextureWidthMap = new HashMap<>();
    private HashMap<Integer, Integer> mTextureHeightMap = new HashMap<>();
    private int mTextureCnt = 0;
    private int mFrameBufferId = 0;

    public static class ShaderCallbacks implements GlGenericDrawer.ShaderCallbacks {
        private float[] coeffs;
        private int coeffsLoc;
        private float stepSize;
        private int xUnitLoc;
        private static final float[] yCoeffs = {0.256788f, 0.504129f, 0.0979059f, 0.0627451f};
        private static final float[] uCoeffs = {-0.148223f, -0.290993f, 0.439216f, 0.501961f};
        private static final float[] vCoeffs = {0.439216f, -0.367788f, -0.0714274f, 0.501961f};

        private ShaderCallbacks() {
        }

        @Override // com.bytedance.realx.video.GlGenericDrawer.ShaderCallbacks
        public void onNewShader(GlShader glShader) {
            this.xUnitLoc = glShader.getUniformLocation("xUnit");
            this.coeffsLoc = glShader.getUniformLocation("coeffs");
        }

        @Override // com.bytedance.realx.video.GlGenericDrawer.ShaderCallbacks
        public void onPrepareShader(GlShader glShader, float[] fArr, int i10, int i11, int i12, int i13) {
            GLES20.glUniform4fv(this.coeffsLoc, 1, this.coeffs, 0);
            int i14 = this.xUnitLoc;
            float f10 = this.stepSize;
            float f11 = i10;
            GLES20.glUniform2f(i14, (fArr[0] * f10) / f11, (f10 * fArr[1]) / f11);
        }

        public void setPlaneU() {
            this.coeffs = uCoeffs;
            this.stepSize = 2.0f;
        }

        public void setPlaneV() {
            this.coeffs = vCoeffs;
            this.stepSize = 2.0f;
        }

        public void setPlaneY() {
            this.coeffs = yCoeffs;
            this.stepSize = 1.0f;
        }
    }

    public YuvConverter() {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        this.i420TextureFrameBuffer = new GlTextureFrameBuffer(bb.c.f.OB);
        ShaderCallbacks shaderCallbacks = new ShaderCallbacks();
        this.shaderCallbacks = shaderCallbacks;
        this.drawer = new GlGenericDrawer(FRAGMENT_SHADER, shaderCallbacks);
        threadChecker.detachThread();
    }

    private int generateTexture(int i10, int i11, int i12) {
        if (this.mTextureCnt == 45) {
            return 0;
        }
        int iGenerateTexture = GlUtil.generateTexture(i10);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(bb.c.e.F, iGenerateTexture);
        GLES20.glTexImage2D(bb.c.e.F, 0, bb.c.f.OB, i11, i12, 0, bb.c.f.OB, bb.c.f.Zc, null);
        GLES20.glBindTexture(bb.c.e.F, 0);
        if (GLES20.glGetError() != 0) {
            return 0;
        }
        this.mTextureCnt++;
        return iGenerateTexture;
    }

    public VideoFrame.I420Buffer convert(VideoFrame.TextureBuffer textureBuffer) {
        return convert(textureBuffer, FilterType.Origin, 0, 0);
    }

    public VideoFrame.I420Buffer convert(VideoFrame.TextureBuffer textureBuffer, FilterType filterType, int i10, int i11) {
        this.threadChecker.checkIsOnValidThread();
        GlUtil.clearGLES2Error("YUVConverter");
        int width = textureBuffer.getWidth();
        int height = textureBuffer.getHeight();
        int i12 = ((width + 63) / 64) * 64;
        int i13 = ((width + 7) / 8) * 8;
        int i14 = (height + 1) / 2;
        int i15 = height + i14;
        final ByteBuffer byteBufferNativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer((i12 * i15) + i12);
        if (byteBufferNativeAllocateByteBuffer == null) {
            return null;
        }
        int i16 = i12 / 4;
        int i17 = i13 / 4;
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preScale(1.0f, -1.0f);
        matrix.preTranslate(-0.5f, -0.5f);
        if (i13 != width) {
            matrix.preScale((i13 * 1.0f) / width, 1.0f);
        }
        this.i420TextureFrameBuffer.setSize(i16, i15);
        GLES20.glBindFramebuffer(36160, this.i420TextureFrameBuffer.getFrameBufferId());
        GlUtil.checkNoGLES2Error("glBindFramebuffer");
        this.shaderCallbacks.setPlaneY();
        RTCVideoFrameDrawer.drawTexture(this.drawer, textureBuffer, matrix, width, height, 0, 0, i17, height, filterType, i10, i11);
        this.shaderCallbacks.setPlaneU();
        int i18 = i17 / 2;
        RTCVideoFrameDrawer.drawTexture(this.drawer, textureBuffer, matrix, width, height, 0, height, i18, i14, filterType, i10, i11);
        this.shaderCallbacks.setPlaneV();
        RTCVideoFrameDrawer.drawTexture(this.drawer, textureBuffer, matrix, width, height, i16 / 2, height, i18, i14, filterType, i10, i11);
        GLES20.glReadPixels(0, 0, this.i420TextureFrameBuffer.getWidth(), this.i420TextureFrameBuffer.getHeight(), bb.c.f.OB, bb.c.f.Zc, byteBufferNativeAllocateByteBuffer);
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            GLES20.glBindFramebuffer(36160, 0);
            int i19 = (i12 * height) + 0;
            int i20 = i12 / 2;
            int i21 = i19 + i20;
            byteBufferNativeAllocateByteBuffer.position(0);
            byteBufferNativeAllocateByteBuffer.limit(i19);
            ByteBuffer byteBufferSlice = byteBufferNativeAllocateByteBuffer.slice();
            byteBufferNativeAllocateByteBuffer.position(i19);
            int i22 = ((i14 - 1) * i12) + i20;
            byteBufferNativeAllocateByteBuffer.limit(i19 + i22);
            ByteBuffer byteBufferSlice2 = byteBufferNativeAllocateByteBuffer.slice();
            byteBufferNativeAllocateByteBuffer.position(i21);
            byteBufferNativeAllocateByteBuffer.limit(i21 + i22);
            return JavaI420Buffer.wrap(width, height, byteBufferSlice, i12, byteBufferSlice2, i12, byteBufferNativeAllocateByteBuffer.slice(), i12, new Runnable() { // from class: com.bytedance.realx.video.j0
                @Override // java.lang.Runnable
                public final void run() {
                    JniCommon.nativeFreeByteBuffer(byteBufferNativeAllocateByteBuffer);
                }
            });
        }
        Log.e("YUVConverter", "error: " + iGlGetError);
        RXLogging.e("YUVConverter", "convert i420 failed as opengl error " + iGlGetError);
        if (1285 == iGlGetError || 1282 == iGlGetError) {
            JniCommon.nativeFreeByteBuffer(byteBufferNativeAllocateByteBuffer);
            return null;
        }
        throw new RuntimeException("YuvConverter.convert: GLES20 error: " + iGlGetError);
    }

    public int dequeueTexture(int i10, int i11) {
        int[] iArr = new int[1];
        List<Integer> list = this.mTextureFreeQueue;
        if (list != null) {
            if (list.size() == 0) {
                int iGenerateTexture = generateTexture(bb.c.e.F, i10, i11);
                iArr[0] = iGenerateTexture;
                if (iGenerateTexture > 0) {
                    this.mTextureUsedQueue.add(Integer.valueOf(iGenerateTexture));
                    this.mTextureWidthMap.put(Integer.valueOf(iArr[0]), Integer.valueOf(i10));
                    this.mTextureHeightMap.put(Integer.valueOf(iArr[0]), Integer.valueOf(i11));
                }
            } else {
                int i12 = -1;
                for (int i13 = 0; i13 < this.mTextureFreeQueue.size(); i13++) {
                    int iIntValue = this.mTextureFreeQueue.get(i13).intValue();
                    if (this.mTextureWidthMap.get(Integer.valueOf(iIntValue)).intValue() == i10 && this.mTextureHeightMap.get(Integer.valueOf(iIntValue)).intValue() == i11) {
                        i12 = i13;
                        break;
                    }
                }
                if (i12 >= 0) {
                    iArr[0] = this.mTextureFreeQueue.get(i12).intValue();
                    this.mTextureFreeQueue.remove(0);
                    this.mTextureUsedQueue.add(Integer.valueOf(iArr[0]));
                } else {
                    int iGenerateTexture2 = generateTexture(bb.c.e.F, i10, i11);
                    iArr[0] = iGenerateTexture2;
                    if (iGenerateTexture2 > 0) {
                        this.mTextureUsedQueue.add(Integer.valueOf(iGenerateTexture2));
                        this.mTextureWidthMap.put(Integer.valueOf(iArr[0]), Integer.valueOf(i10));
                        this.mTextureHeightMap.put(Integer.valueOf(iArr[0]), Integer.valueOf(i11));
                    }
                }
            }
        }
        return iArr[0];
    }

    public void drawTexture(int i10, int i11, int i12, int i13, int i14) {
        if (this.mTextureDrawer == null) {
            this.mTextureDrawer = new GlRectDrawer();
        }
        GlUtil.checkNoGLES2Error("TextureHelper construct");
        android.opengl.Matrix.setIdentityM(TEX_MATRIX, 0);
        if (this.mFrameBufferId == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.mFrameBufferId = iArr[0];
        }
        GLES20.glBindFramebuffer(36160, this.mFrameBufferId);
        GLES20.glFramebufferTexture2D(36160, 36064, bb.c.e.F, i12, 0);
        if (i10 == 10) {
            this.mTextureDrawer.drawRgb(i11, TEX_MATRIX, i13, i14, 0, 0, i13, i14);
        } else if (i10 == 11) {
            this.mTextureDrawer.drawOes(i11, TEX_MATRIX, i13, i14, 0, 0, i13, i14);
        }
        GLES20.glBindTexture(bb.c.e.F, 0);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glFinish();
        GlUtil.checkNoGLES2Error("TextureHelper drawTexture");
    }

    public void queueTexture(int i10) {
        List<Integer> list = this.mTextureUsedQueue;
        if (list == null || !list.contains(Integer.valueOf(i10))) {
            return;
        }
        this.mTextureUsedQueue.remove(new Integer(i10));
        List<Integer> list2 = this.mTextureFreeQueue;
        if (list2 != null) {
            list2.add(Integer.valueOf(i10));
        }
    }

    public void release() {
        this.threadChecker.checkIsOnValidThread();
        this.drawer.release();
        this.i420TextureFrameBuffer.release();
        GlRectDrawer glRectDrawer = this.mTextureDrawer;
        if (glRectDrawer != null) {
            glRectDrawer.release();
            this.mTextureDrawer = null;
        }
        int i10 = this.mFrameBufferId;
        if (i10 > 0) {
            GLES20.glDeleteFramebuffers(1, new int[]{i10}, 0);
            this.mFrameBufferId = 0;
        }
        List<Integer> list = this.mTextureFreeQueue;
        if (list != null && list.size() > 0) {
            Iterator<Integer> it = this.mTextureFreeQueue.iterator();
            while (it.hasNext()) {
                GLES20.glDeleteTextures(1, new int[]{it.next().intValue()}, 0);
            }
            this.mTextureFreeQueue.clear();
        }
        List<Integer> list2 = this.mTextureUsedQueue;
        if (list2 != null && list2.size() > 0) {
            Iterator<Integer> it2 = this.mTextureUsedQueue.iterator();
            while (it2.hasNext()) {
                GLES20.glDeleteTextures(1, new int[]{it2.next().intValue()}, 0);
            }
            this.mTextureUsedQueue.clear();
        }
        this.threadChecker.detachThread();
    }
}
