package com.tencent.ugc.videobase.frame;

import android.graphics.Bitmap;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.l;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.videobase.utils.MemoryAllocator;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import java.nio.ByteBuffer;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::ugc")
public class PixelFrame extends RefCounted {
    protected ByteBuffer mBuffer;
    protected GLConstants.ColorRange mColorRange;
    protected GLConstants.ColorSpace mColorSpace;
    protected byte[] mData;
    protected Object mGLContext;
    protected int mHeight;
    private boolean mIsMirrorHorizontal;
    private boolean mIsMirrorVertical;
    private float[] mMatrix;
    protected FrameMetaData mMetaData;
    protected GLConstants.a mPixelBufferType;
    protected GLConstants.PixelFormatType mPixelFormatType;
    private l mRotation;
    protected int mTextureId;
    private long mTimestamp;
    protected int mWidth;

    public PixelFrame() {
        super(null);
        this.mTimestamp = 0L;
        this.mWidth = -1;
        this.mHeight = -1;
        this.mRotation = l.NORMAL;
        this.mIsMirrorHorizontal = false;
        this.mIsMirrorVertical = false;
        this.mMatrix = null;
        this.mData = null;
        this.mBuffer = null;
        this.mTextureId = -1;
        this.mGLContext = null;
    }

    public PixelFrame(int i10, int i11, int i12, int i13, int i14) {
        this(null, i10, i11, i12, GLConstants.a.a(i13), GLConstants.PixelFormatType.a(i14));
    }

    protected PixelFrame(IRecycler<? extends PixelFrame> iRecycler) {
        super(iRecycler);
        this.mTimestamp = 0L;
        this.mWidth = -1;
        this.mHeight = -1;
        this.mRotation = l.NORMAL;
        this.mIsMirrorHorizontal = false;
        this.mIsMirrorVertical = false;
        this.mMatrix = null;
        this.mData = null;
        this.mBuffer = null;
        this.mTextureId = -1;
        this.mGLContext = null;
    }

    public PixelFrame(IRecycler<PixelFrame> iRecycler, int i10, int i11, int i12, GLConstants.a aVar, GLConstants.PixelFormatType pixelFormatType) {
        super(iRecycler);
        this.mTimestamp = 0L;
        this.mWidth = -1;
        this.mHeight = -1;
        this.mRotation = l.NORMAL;
        this.mIsMirrorHorizontal = false;
        this.mIsMirrorVertical = false;
        this.mMatrix = null;
        this.mData = null;
        this.mBuffer = null;
        this.mTextureId = -1;
        this.mGLContext = null;
        this.mWidth = i10;
        this.mHeight = i11;
        this.mPixelFormatType = pixelFormatType;
        this.mPixelBufferType = aVar;
        if (aVar == GLConstants.a.BYTE_ARRAY) {
            this.mData = MemoryAllocator.allocateByteArray(i12);
        } else {
            this.mBuffer = MemoryAllocator.allocateDirectBuffer(i12);
        }
    }

    public PixelFrame(IRecycler<PixelFrame> iRecycler, int i10, int i11, GLConstants.a aVar, GLConstants.PixelFormatType pixelFormatType) {
        this(iRecycler, i10, i11, pixelFormatType == GLConstants.PixelFormatType.RGBA ? i10 * i11 * 4 : ((i10 * i11) * 3) / 2, aVar, pixelFormatType);
    }

    public PixelFrame(PixelFrame pixelFrame) {
        super(null);
        this.mTimestamp = 0L;
        this.mWidth = -1;
        this.mHeight = -1;
        this.mRotation = l.NORMAL;
        this.mIsMirrorHorizontal = false;
        this.mIsMirrorVertical = false;
        this.mMatrix = null;
        this.mData = null;
        this.mBuffer = null;
        this.mTextureId = -1;
        this.mGLContext = null;
        copy(pixelFrame);
    }

    public static PixelFrame createFromBitmap(Bitmap bitmap) {
        int width = (bitmap.getWidth() / 2) * 2;
        int height = (bitmap.getHeight() / 2) * 2;
        if (width != 0 && height != 0 && (bitmap.getWidth() % 2 != 0 || bitmap.getHeight() % 2 != 0)) {
            bitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height);
        }
        ByteBuffer byteBufferAllocateDirectBuffer = MemoryAllocator.allocateDirectBuffer(bitmap.getWidth() * 4 * bitmap.getHeight());
        if (byteBufferAllocateDirectBuffer == null) {
            return null;
        }
        bitmap.copyPixelsToBuffer(byteBufferAllocateDirectBuffer);
        byteBufferAllocateDirectBuffer.position(0);
        PixelFrame pixelFrame = new PixelFrame();
        pixelFrame.setBuffer(byteBufferAllocateDirectBuffer);
        pixelFrame.setWidth(bitmap.getWidth());
        pixelFrame.setHeight(bitmap.getHeight());
        pixelFrame.setPixelBufferType(GLConstants.a.BYTE_BUFFER);
        pixelFrame.setPixelFormatType(GLConstants.PixelFormatType.RGBA);
        return pixelFrame;
    }

    private int getColorRangeValue() {
        return this.mColorRange.getValue();
    }

    private int getColorSpaceValue() {
        return this.mColorSpace.getValue();
    }

    private int getPixelBufferTypeValue() {
        return this.mPixelBufferType.mValue;
    }

    private int getPixelFormatTypeValue() {
        return this.mPixelFormatType.getValue();
    }

    private int getRotationValue() {
        return this.mRotation.mValue;
    }

    public static void releasePixelFrames(Collection<PixelFrame> collection) {
        if (collection == null) {
            return;
        }
        for (PixelFrame pixelFrame : collection) {
            if (pixelFrame != null) {
                pixelFrame.release();
            }
        }
        collection.clear();
    }

    public void copy(PixelFrame pixelFrame) {
        this.mTimestamp = pixelFrame.mTimestamp;
        this.mWidth = pixelFrame.mWidth;
        this.mHeight = pixelFrame.mHeight;
        this.mPixelBufferType = pixelFrame.mPixelBufferType;
        this.mPixelFormatType = pixelFrame.mPixelFormatType;
        this.mRotation = pixelFrame.mRotation;
        this.mIsMirrorHorizontal = pixelFrame.mIsMirrorHorizontal;
        this.mIsMirrorVertical = pixelFrame.mIsMirrorVertical;
        if (pixelFrame.mMatrix != null) {
            this.mMatrix = new float[16];
            float[] matrix = pixelFrame.getMatrix();
            float[] fArr = this.mMatrix;
            System.arraycopy(matrix, 0, fArr, 0, fArr.length);
        }
        this.mMatrix = pixelFrame.mMatrix;
        this.mData = pixelFrame.mData;
        this.mBuffer = pixelFrame.mBuffer;
        this.mTextureId = pixelFrame.mTextureId;
        this.mGLContext = pixelFrame.mGLContext;
        this.mMetaData = pixelFrame.mMetaData;
        this.mColorSpace = pixelFrame.mColorSpace;
        this.mColorRange = pixelFrame.mColorRange;
    }

    public ByteBuffer getBuffer() {
        return this.mBuffer;
    }

    public GLConstants.ColorRange getColorRange() {
        return this.mColorRange;
    }

    public GLConstants.ColorSpace getColorSpace() {
        return this.mColorSpace;
    }

    public byte[] getData() {
        return this.mData;
    }

    public Object getGLContext() {
        return this.mGLContext;
    }

    public long getGLContextNativeHandle() {
        return OpenGlUtils.getGLContextNativeHandle(this.mGLContext);
    }

    public int getHeight() {
        return this.mHeight;
    }

    public float[] getMatrix() {
        return this.mMatrix;
    }

    public FrameMetaData getMetaData() {
        return this.mMetaData;
    }

    public GLConstants.a getPixelBufferType() {
        return this.mPixelBufferType;
    }

    public GLConstants.PixelFormatType getPixelFormatType() {
        return this.mPixelFormatType;
    }

    public l getRotation() {
        return this.mRotation;
    }

    public int getTextureId() {
        return this.mTextureId;
    }

    public long getTimestamp() {
        return this.mTimestamp;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public boolean hasTransformParams() {
        return this.mRotation != l.NORMAL || this.mIsMirrorHorizontal || this.mIsMirrorVertical || this.mMatrix != null;
    }

    public boolean isFrameDataValid() {
        GLConstants.a aVar = this.mPixelBufferType;
        if (aVar == GLConstants.a.TEXTURE_2D && this.mTextureId == -1) {
            return false;
        }
        if (aVar == GLConstants.a.BYTE_BUFFER && this.mBuffer == null) {
            return false;
        }
        return (aVar == GLConstants.a.BYTE_ARRAY && this.mData == null) ? false : true;
    }

    public boolean isMirrorHorizontal() {
        return this.mIsMirrorHorizontal;
    }

    public boolean isMirrorVertical() {
        return this.mIsMirrorVertical;
    }

    public void postRotate(l lVar) {
        if (lVar == l.ROTATION_90 || lVar == l.ROTATION_270) {
            swapWidthHeight();
        }
        setRotation(l.a((this.mRotation.mValue + lVar.mValue) % 360));
    }

    @Override // com.tencent.ugc.videobase.frame.RefCounted
    public void release() {
        super.release();
    }

    protected void reset() {
        this.mTimestamp = 0L;
        this.mRotation = l.NORMAL;
        this.mIsMirrorHorizontal = false;
        this.mIsMirrorVertical = false;
        this.mMatrix = null;
        this.mTextureId = -1;
        this.mGLContext = null;
        this.mMetaData = null;
        this.mColorRange = GLConstants.ColorRange.UNKNOWN;
        this.mColorSpace = GLConstants.ColorSpace.UNKNOWN;
    }

    @Override // com.tencent.ugc.videobase.frame.RefCounted
    public int retain() {
        return super.retain();
    }

    public void setBuffer(ByteBuffer byteBuffer) {
        this.mBuffer = byteBuffer;
    }

    public void setColorFormat(GLConstants.ColorRange colorRange, GLConstants.ColorSpace colorSpace) {
        this.mColorRange = colorRange;
        this.mColorSpace = colorSpace;
    }

    public void setData(byte[] bArr) {
        this.mData = bArr;
    }

    public void setGLContext(Object obj) {
        this.mGLContext = obj;
    }

    public void setHeight(int i10) {
        this.mHeight = i10;
    }

    public void setMatrix(float[] fArr) {
        this.mMatrix = fArr;
    }

    public void setMetaData(FrameMetaData frameMetaData) {
        this.mMetaData = frameMetaData;
    }

    public void setMirrorHorizontal(boolean z10) {
        this.mIsMirrorHorizontal = z10;
    }

    public void setMirrorVertical(boolean z10) {
        this.mIsMirrorVertical = z10;
    }

    public void setPixelBufferType(GLConstants.a aVar) {
        this.mPixelBufferType = aVar;
    }

    public void setPixelFormatType(GLConstants.PixelFormatType pixelFormatType) {
        this.mPixelFormatType = pixelFormatType;
    }

    public void setRotation(l lVar) {
        this.mRotation = lVar;
    }

    public void setTextureId(int i10) {
        this.mTextureId = i10;
    }

    public void setTimestamp(long j10) {
        this.mTimestamp = j10;
    }

    public void setWidth(int i10) {
        this.mWidth = i10;
    }

    public void swapWidthHeight() {
        int i10 = this.mWidth;
        this.mWidth = this.mHeight;
        this.mHeight = i10;
    }
}
