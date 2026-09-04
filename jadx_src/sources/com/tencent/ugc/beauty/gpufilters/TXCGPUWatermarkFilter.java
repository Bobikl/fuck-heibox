package com.tencent.ugc.beauty.gpufilters;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class TXCGPUWatermarkFilter extends TXCGPUImageFilter {
    protected static final short[] DRAW_ORDER;
    protected static final ShortBuffer DRAW_ORDER_BUFFER;
    private static final String TAG = "TXCGPUWatermarkFilter";
    private static final float[] TEXTURE_COORDS;
    protected static final FloatBuffer TEXTURE_COORDS_BUFFER;
    private static final float[] VERTICES_COORDS = new float[8];
    private int mBaseMarkOffset;
    private WatermarkRenderObject mBaseWaterMark;
    protected boolean mDrawWaterMarkEnabled;
    public WatermarkRenderObject[] mRenderObjects;
    protected int mSrcBlendMode;
    protected List<WatermarkItem> mWaterMarkList;
    private WatermarkItem mWatermark;

    public static class WatermarkRenderObject {
        public Bitmap bitmap;
        public FloatBuffer vertexCoordsBuffer = null;
        public int textureId = -1;

        public void releaseResource() {
            this.bitmap = null;
            OpenGlUtils.deleteTexture(this.textureId);
            this.textureId = -1;
        }
    }

    static {
        short[] sArr = {1, 2, 0, 2, 0, 3};
        DRAW_ORDER = sArr;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f};
        TEXTURE_COORDS = fArr;
        TEXTURE_COORDS_BUFFER = (FloatBuffer) ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).asReadOnlyBuffer().position(0);
        DRAW_ORDER_BUFFER = (ShortBuffer) ByteBuffer.allocateDirect(sArr.length * 2).order(ByteOrder.nativeOrder()).asShortBuffer().put(sArr).asReadOnlyBuffer().position(0);
    }

    public TXCGPUWatermarkFilter() {
        this(TXCGPUImageFilter.NO_FILTER_VERTEX_SHADER, "varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
    }

    public TXCGPUWatermarkFilter(String str, String str2) {
        super(str, str2);
        this.mRenderObjects = null;
        this.mBaseWaterMark = null;
        this.mWaterMarkList = null;
        this.mDrawWaterMarkEnabled = false;
        this.mSrcBlendMode = 1;
        this.mBaseMarkOffset = 1;
        this.mWatermark = null;
    }

    private boolean compareWaterMarkList(List<WatermarkItem> list, List<WatermarkItem> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            WatermarkItem watermarkItem = list.get(i10);
            WatermarkItem watermarkItem2 = list2.get(i10);
            if (!watermarkItem.bitmap.equals(watermarkItem2.bitmap) || watermarkItem.xOffset != watermarkItem2.xOffset || watermarkItem.yOffset != watermarkItem2.yOffset || watermarkItem.fWidth != watermarkItem2.fWidth) {
                return false;
            }
        }
        return true;
    }

    private void releaseWaterMark() {
        WatermarkRenderObject[] watermarkRenderObjectArr = this.mRenderObjects;
        if (watermarkRenderObjectArr == null || watermarkRenderObjectArr.length == 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            WatermarkRenderObject[] watermarkRenderObjectArr2 = this.mRenderObjects;
            if (i10 >= watermarkRenderObjectArr2.length) {
                this.mRenderObjects = null;
                return;
            }
            WatermarkRenderObject watermarkRenderObject = watermarkRenderObjectArr2[i10];
            if (watermarkRenderObject != null) {
                watermarkRenderObject.releaseResource();
                this.mRenderObjects[i10] = null;
            }
            i10++;
        }
    }

    private void setWatermark(Bitmap bitmap, float f10, float f11, float f12, int i10) {
        Bitmap bitmap2;
        WatermarkRenderObject[] watermarkRenderObjectArr = this.mRenderObjects;
        if (watermarkRenderObjectArr == null || i10 >= watermarkRenderObjectArr.length || watermarkRenderObjectArr[i10] == null) {
            LiteavLog.e(TAG, "index is too large for mRenderObjects!");
            return;
        }
        if (bitmap == null) {
            LiteavLog.i(TAG, "release %d watermark!", Integer.valueOf(i10));
            this.mRenderObjects[i10].releaseResource();
            this.mRenderObjects[i10] = null;
            return;
        }
        calculateOffsetMatrix(bitmap.getWidth(), bitmap.getHeight(), f10, f11, f12, i10);
        WatermarkRenderObject watermarkRenderObject = this.mRenderObjects[i10];
        Bitmap bitmap3 = watermarkRenderObject.bitmap;
        if (bitmap3 == null || !bitmap3.equals(bitmap)) {
            if (watermarkRenderObject.textureId != -1 && (bitmap2 = watermarkRenderObject.bitmap) != null && (bitmap2.getWidth() != bitmap.getWidth() || watermarkRenderObject.bitmap.getHeight() != bitmap.getHeight())) {
                OpenGlUtils.deleteTexture(watermarkRenderObject.textureId);
                watermarkRenderObject.textureId = -1;
            }
            watermarkRenderObject.textureId = OpenGlUtils.loadTexture(bitmap, watermarkRenderObject.textureId, false);
        }
        watermarkRenderObject.bitmap = bitmap;
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void afterDrawArrays() {
        super.afterDrawArrays();
        if (!this.mDrawWaterMarkEnabled) {
            return;
        }
        GLES20.glEnable(bb.c.d.f31689zi);
        GLES20.glBlendFunc(this.mSrcBlendMode, bb.c.b.Rb);
        int i10 = 0;
        while (true) {
            WatermarkRenderObject[] watermarkRenderObjectArr = this.mRenderObjects;
            if (i10 >= watermarkRenderObjectArr.length) {
                GLES20.glDisable(bb.c.d.f31689zi);
                return;
            }
            if (watermarkRenderObjectArr[i10] != null) {
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(bb.c.e.F, this.mRenderObjects[i10].textureId);
                GLES20.glUniform1i(this.mGLUniformTexture, 0);
                GLES20.glVertexAttribPointer(this.mGLAttribPosition, 2, bb.c.f.f32240ed, false, 8, (Buffer) this.mRenderObjects[i10].vertexCoordsBuffer);
                GLES20.glEnableVertexAttribArray(this.mGLAttribPosition);
                GLES20.glVertexAttribPointer(this.mGLAttribTextureCoord, 2, bb.c.f.f32240ed, false, 0, (Buffer) TEXTURE_COORDS_BUFFER);
                GLES20.glEnableVertexAttribArray(this.mGLAttribTextureCoord);
                GLES20.glDrawElements(4, DRAW_ORDER.length, bb.c.f.f32170bd, DRAW_ORDER_BUFFER);
                GLES20.glDisableVertexAttribArray(this.mGLAttribPosition);
                GLES20.glDisableVertexAttribArray(this.mGLAttribTextureCoord);
            }
            i10++;
        }
    }

    public void calculateOffsetMatrix(int i10, int i11, float f10, float f11, float f12, int i12) {
        WatermarkRenderObject watermarkRenderObject;
        WatermarkRenderObject[] watermarkRenderObjectArr = this.mRenderObjects;
        if (watermarkRenderObjectArr == null || i12 >= watermarkRenderObjectArr.length || (watermarkRenderObject = watermarkRenderObjectArr[i12]) == null) {
            LiteavLog.e(TAG, "calculateOffsetMatrix,index[%d],mRenderObjects=%s", Integer.valueOf(i12), Arrays.toString(this.mRenderObjects));
            return;
        }
        float[] fArr = VERTICES_COORDS;
        watermarkRenderObject.vertexCoordsBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        float[] fArr2 = new float[fArr.length];
        float f13 = (f10 * 2.0f) - 1.0f;
        fArr2[0] = f13;
        float f14 = 1.0f - (f11 * 2.0f);
        fArr2[1] = f14;
        fArr2[2] = f13;
        float f15 = (i11 / i10) * f12;
        Size size = this.mOutputSize;
        float f16 = f14 - (((f15 * size.width) / size.height) * 2.0f);
        fArr2[3] = f16;
        float f17 = f13 + (f12 * 2.0f);
        fArr2[4] = f17;
        fArr2[5] = f16;
        fArr2[6] = f17;
        fArr2[7] = f14;
        for (int i13 = 1; i13 <= 7; i13 += 2) {
            fArr2[i13] = fArr2[i13] * (-1.0f);
        }
        this.mRenderObjects[i12].vertexCoordsBuffer.put(fArr2).position(0);
    }

    public void enableWatermark(boolean z10) {
        this.mDrawWaterMarkEnabled = z10;
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        WatermarkItem watermarkItem = this.mWatermark;
        if (watermarkItem != null) {
            setWatermark(watermarkItem.bitmap, watermarkItem.xOffset, watermarkItem.yOffset, watermarkItem.fWidth);
        }
        List<WatermarkItem> list = this.mWaterMarkList;
        if (list != null) {
            setWaterMarkList(list);
        }
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onOutputSizeChanged(int i10, int i11) {
        Bitmap bitmap;
        Bitmap bitmap2;
        super.onOutputSizeChanged(i10, i11);
        if (this.mRenderObjects == null) {
            return;
        }
        WatermarkItem watermarkItem = this.mWatermark;
        if (watermarkItem != null && (bitmap2 = watermarkItem.bitmap) != null) {
            int width = bitmap2.getWidth();
            int height = this.mWatermark.bitmap.getHeight();
            WatermarkItem watermarkItem2 = this.mWatermark;
            calculateOffsetMatrix(width, height, watermarkItem2.xOffset, watermarkItem2.yOffset, watermarkItem2.fWidth, 0);
        }
        if (this.mWaterMarkList == null) {
            return;
        }
        for (int i12 = 0; i12 < this.mWaterMarkList.size(); i12++) {
            WatermarkItem watermarkItem3 = this.mWaterMarkList.get(i12);
            if (watermarkItem3 != null && (bitmap = watermarkItem3.bitmap) != null) {
                calculateOffsetMatrix(bitmap.getWidth(), watermarkItem3.bitmap.getHeight(), watermarkItem3.xOffset, watermarkItem3.yOffset, watermarkItem3.fWidth, i12 + this.mBaseMarkOffset);
            }
        }
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onUninit() {
        super.onUninit();
        releaseWaterMark();
    }

    public void setWaterMarkList(List<WatermarkItem> list) {
        List<WatermarkItem> list2 = this.mWaterMarkList;
        if (list2 != null && compareWaterMarkList(list2, list)) {
            LiteavLog.i(TAG, "Same markList");
            return;
        }
        this.mWaterMarkList = list;
        if (this.mRenderObjects != null) {
            int i10 = this.mBaseMarkOffset;
            while (true) {
                WatermarkRenderObject[] watermarkRenderObjectArr = this.mRenderObjects;
                if (i10 >= watermarkRenderObjectArr.length) {
                    break;
                }
                OpenGlUtils.deleteTexture(watermarkRenderObjectArr[i10].textureId);
                this.mRenderObjects[i10].textureId = -1;
                i10++;
            }
        }
        WatermarkRenderObject[] watermarkRenderObjectArr2 = new WatermarkRenderObject[list.size() + this.mBaseMarkOffset];
        this.mRenderObjects = watermarkRenderObjectArr2;
        watermarkRenderObjectArr2[0] = this.mBaseWaterMark;
        for (int i11 = 0; i11 < list.size(); i11++) {
            WatermarkItem watermarkItem = list.get(i11);
            if (watermarkItem != null) {
                this.mRenderObjects[this.mBaseMarkOffset + i11] = new WatermarkRenderObject();
                setWatermark(watermarkItem.bitmap, watermarkItem.xOffset, watermarkItem.yOffset, watermarkItem.fWidth, i11 + this.mBaseMarkOffset);
            }
        }
    }

    public void setWatermark(Bitmap bitmap, float f10, float f11, float f12) {
        if (this.mRenderObjects == null) {
            this.mRenderObjects = new WatermarkRenderObject[1];
        }
        WatermarkRenderObject[] watermarkRenderObjectArr = this.mRenderObjects;
        if (watermarkRenderObjectArr[0] == null) {
            watermarkRenderObjectArr[0] = new WatermarkRenderObject();
        }
        setWatermark(bitmap, f10, f11, f12, 0);
        this.mBaseWaterMark = this.mRenderObjects[0];
        if (bitmap == null) {
            this.mWatermark = null;
            return;
        }
        if (this.mWatermark == null) {
            this.mWatermark = new WatermarkItem();
        }
        WatermarkItem watermarkItem = this.mWatermark;
        watermarkItem.bitmap = bitmap;
        watermarkItem.xOffset = f10;
        watermarkItem.yOffset = f11;
        watermarkItem.fWidth = f12;
    }
}
