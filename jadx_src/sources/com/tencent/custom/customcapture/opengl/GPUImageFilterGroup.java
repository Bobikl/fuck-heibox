package com.tencent.custom.customcapture.opengl;

import android.opengl.GLES20;
import com.tencent.custom.customcapture.structs.FrameBuffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class GPUImageFilterGroup extends GPUImageFilter {
    protected final List<GPUImageFilter> mFilters;
    private final FrameBuffer[] mFrameBuffers = new FrameBuffer[2];
    private final FloatBuffer mGLCubeBuffer;
    private final FloatBuffer mGLTextureBuffer;
    private final FloatBuffer mGLTextureFlipBuffer;
    protected final List<GPUImageFilter> mMergedFilters;

    public GPUImageFilterGroup() {
        float[] fArr = OpenGlUtils.CUBE;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.mGLCubeBuffer = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        float[] fArr2 = TextureRotationUtils.TEXTURE_NO_ROTATION;
        FloatBuffer floatBufferAsFloatBuffer2 = ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.mGLTextureBuffer = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.put(fArr2).position(0);
        float[] rotation = TextureRotationUtils.getRotation(Rotation.NORMAL, false, true);
        FloatBuffer floatBufferAsFloatBuffer3 = ByteBuffer.allocateDirect(rotation.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.mGLTextureFlipBuffer = floatBufferAsFloatBuffer3;
        floatBufferAsFloatBuffer3.put(rotation).position(0);
        this.mFilters = new ArrayList();
        this.mMergedFilters = new ArrayList();
    }

    private void destroyFramebuffers() {
        int i10 = 0;
        while (true) {
            FrameBuffer[] frameBufferArr = this.mFrameBuffers;
            if (i10 >= frameBufferArr.length) {
                return;
            }
            FrameBuffer frameBuffer = frameBufferArr[i10];
            if (frameBuffer != null) {
                frameBuffer.uninitialize();
                this.mFrameBuffers[i10] = null;
            }
            i10++;
        }
    }

    public void addFilter(GPUImageFilter gPUImageFilter) {
        if (gPUImageFilter == null) {
            return;
        }
        this.mFilters.add(gPUImageFilter);
        updateMergedFilters();
    }

    public void draw(int i10, int i11, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        int textureId;
        runPendingOnDrawTasks();
        if (!isInitialized() || getRenderFilters() == null || (textureId = i10) == -1) {
            return;
        }
        List<GPUImageFilter> renderFilters = getRenderFilters();
        int size = renderFilters.size();
        int i12 = 0;
        while (i12 < size) {
            GPUImageFilter gPUImageFilter = renderFilters.get(i12);
            int i13 = size - 1;
            boolean z10 = i12 < i13;
            if (z10) {
                GLES20.glBindFramebuffer(36160, this.mFrameBuffers[i12 % 2].getFrameBufferId());
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            } else if (-1 != i11) {
                GLES20.glBindFramebuffer(36160, i11);
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            }
            if (i12 == 0) {
                gPUImageFilter.onDraw(textureId, floatBuffer, floatBuffer2);
            } else if (i12 == i13) {
                gPUImageFilter.onDraw(textureId, this.mGLCubeBuffer, size % 2 == 0 ? this.mGLTextureFlipBuffer : this.mGLTextureBuffer);
            } else {
                gPUImageFilter.onDraw(textureId, this.mGLCubeBuffer, this.mGLTextureBuffer);
            }
            if (z10) {
                GLES20.glBindFramebuffer(36160, 0);
                textureId = this.mFrameBuffers[i12 % 2].getTextureId();
            } else {
                GLES20.glBindFramebuffer(36160, 0);
            }
            i12++;
        }
    }

    public List<GPUImageFilter> getMergedFilters() {
        return this.mMergedFilters;
    }

    public List<GPUImageFilter> getRenderFilters() {
        return this.mMergedFilters;
    }

    @Override // com.tencent.custom.customcapture.opengl.GPUImageFilter
    public void onDraw(int i10, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        throw new RuntimeException("this method should not been call!");
    }

    @Override // com.tencent.custom.customcapture.opengl.GPUImageFilter
    protected void onInit() {
        super.onInit();
        for (int i10 = 0; i10 < this.mMergedFilters.size(); i10++) {
            this.mMergedFilters.get(i10).init();
        }
    }

    @Override // com.tencent.custom.customcapture.opengl.GPUImageFilter
    public void onOutputSizeChanged(int i10, int i11) {
        super.onOutputSizeChanged(i10, i11);
        destroyFramebuffers();
        List<GPUImageFilter> renderFilters = getRenderFilters();
        int size = renderFilters.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            renderFilters.get(i13).onOutputSizeChanged(i10, i11);
        }
        if (size <= 0) {
            return;
        }
        while (true) {
            FrameBuffer[] frameBufferArr = this.mFrameBuffers;
            if (i12 >= frameBufferArr.length) {
                return;
            }
            frameBufferArr[i12] = new FrameBuffer(i10, i11);
            this.mFrameBuffers[i12].initialize();
            i12++;
        }
    }

    @Override // com.tencent.custom.customcapture.opengl.GPUImageFilter
    protected void onUninit() {
        destroyFramebuffers();
        Iterator<GPUImageFilter> it = this.mMergedFilters.iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
        super.onUninit();
    }

    public void updateMergedFilters() {
        if (this.mFilters == null) {
            return;
        }
        this.mMergedFilters.clear();
        for (GPUImageFilter gPUImageFilter : this.mFilters) {
            if (gPUImageFilter instanceof GPUImageFilterGroup) {
                GPUImageFilterGroup gPUImageFilterGroup = (GPUImageFilterGroup) gPUImageFilter;
                gPUImageFilterGroup.updateMergedFilters();
                List<GPUImageFilter> mergedFilters = gPUImageFilterGroup.getMergedFilters();
                if (mergedFilters != null && !mergedFilters.isEmpty()) {
                    this.mMergedFilters.addAll(mergedFilters);
                }
            } else {
                this.mMergedFilters.add(gPUImageFilter);
            }
        }
    }
}
