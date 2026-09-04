package com.huawei.hms.mlsdk.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Pair;
import com.huawei.hms.ml.common.utils.ImageConvertUtils;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class MLFrame {
    public static final int SCREEN_FIRST_QUADRANT = 0;
    public static final int SCREEN_FOURTH_QUADRANT = 3;
    public static final int SCREEN_SECOND_QUADRANT = 1;
    public static final int SCREEN_THIRD_QUADRANT = 2;
    private Bitmap bitmap;
    private ByteBuffer byteBuffer;
    private byte[] bytes;
    private volatile Boolean frameInit;
    private Property property;
    private int recMode;

    public static class Creator {
        private MLFrame frame = new MLFrame();

        public MLFrame create() {
            if (this.frame.byteBuffer == null && this.frame.bitmap == null) {
                throw new IllegalStateException("Failed to create image instance, both bitmap and byteBuffer data are not specified.");
            }
            return this.frame;
        }

        public Creator setBitmap(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            this.frame.bitmap = bitmap;
            Property propertyAcquireProperty = this.frame.acquireProperty();
            propertyAcquireProperty.width = width;
            propertyAcquireProperty.height = height;
            return this;
        }

        public Creator setFramePropertyExt(Property.Ext ext) {
            this.frame.acquireProperty().ext = ext;
            return this;
        }

        public Creator setItemIdentity(int i10) {
            this.frame.acquireProperty().itemIdentity = i10;
            return this;
        }

        public Creator setQuadrant(int i10) {
            this.frame.acquireProperty().quadrant = i10;
            return this;
        }

        public Creator setTimestamp(long j10) {
            this.frame.acquireProperty().timestamp = j10;
            return this;
        }

        public Creator writeByteBufferData(ByteBuffer byteBuffer, int i10, int i11, int i12) {
            if (byteBuffer == null) {
                throw new IllegalArgumentException("Parameter： data is not specified");
            }
            if (byteBuffer.capacity() < i10 * i11) {
                throw new IllegalArgumentException("Not enough capacity for image data size.");
            }
            if (i12 != 17 && i12 != 16 && i12 != 842094169) {
                throw new IllegalArgumentException("Parameter formatType:" + i12 + " is not supported");
            }
            this.frame.byteBuffer = byteBuffer;
            Property propertyAcquireProperty = this.frame.acquireProperty();
            if (propertyAcquireProperty != null) {
                propertyAcquireProperty.formatType = i12;
                propertyAcquireProperty.width = i10;
                propertyAcquireProperty.height = i11;
            }
            return this;
        }
    }

    public static class Property {
        public static final int IMAGE_FORMAT_NV21 = 17;
        public static final int IMAGE_FORMAT_YV12 = 842094169;
        public static final int SCREEN_FIRST_QUADRANT = 0;
        public static final int SCREEN_FOURTH_QUADRANT = 3;
        public static final int SCREEN_SECOND_QUADRANT = 1;
        public static final int SCREEN_THIRD_QUADRANT = 2;
        private Ext ext;
        private int formatType;
        private int height;
        private int itemIdentity;
        private int quadrant;
        private long timestamp;
        private int width;

        public static class Creator {
            private Ext ext;
            private int formatType;
            private int height;
            private int itemIdentity;
            private int quadrant;
            private long timestamp;
            private int width;

            public Property create() {
                return new Property(this.width, this.height, this.quadrant, this.formatType, this.itemIdentity, this.timestamp, this.ext);
            }

            public Creator setExt(Ext ext) {
                this.ext = ext;
                return this;
            }

            public Creator setFormatType(int i10) {
                this.formatType = i10;
                return this;
            }

            public Creator setHeight(int i10) {
                this.height = i10;
                return this;
            }

            public Creator setItemIdentity(int i10) {
                this.itemIdentity = i10;
                return this;
            }

            public Creator setQuadrant(int i10) {
                this.quadrant = i10;
                return this;
            }

            public Creator setTimestamp(int i10) {
                this.timestamp = i10;
                return this;
            }

            public Creator setWidth(int i10) {
                this.width = i10;
                return this;
            }
        }

        public static class Ext {
            private int lensId;
            private int maxZoom;
            private Rect rect;
            private int zoom;

            public static class Creator {
                private int maxZoom;
                private Rect rect;
                private int lensId = 0;
                private int zoom = 0;

                public Ext build() {
                    return new Ext(this.lensId, this.zoom, this.maxZoom, this.rect);
                }

                public Creator setLensId(int i10) {
                    this.lensId = i10;
                    return this;
                }

                public Creator setMaxZoom(int i10) {
                    this.maxZoom = i10;
                    return this;
                }

                public Creator setRect(Rect rect) {
                    this.rect = rect;
                    return this;
                }

                public Creator setZoom(int i10) {
                    this.zoom = i10;
                    return this;
                }
            }

            private Ext(int i10, int i11, int i12, Rect rect) {
                this.lensId = i10;
                this.zoom = i11;
                this.maxZoom = i12;
                this.rect = rect;
            }

            public int getLensId() {
                return this.lensId;
            }

            public int getMaxZoom() {
                return this.maxZoom;
            }

            public Rect getRect() {
                return this.rect;
            }

            public int getZoom() {
                return this.zoom;
            }
        }

        public Property() {
            this.quadrant = 0;
            this.formatType = -1;
            this.itemIdentity = -1;
            this.ext = new Ext.Creator().build();
        }

        private Property(int i10, int i11, int i12, int i13, int i14, long j10, Ext ext) {
            this.width = i10;
            this.height = i11;
            this.quadrant = i12;
            this.formatType = i13;
            this.itemIdentity = i14;
            this.timestamp = j10;
            this.ext = ext;
        }

        public Property(Property property) {
            this.quadrant = 0;
            this.formatType = -1;
            this.itemIdentity = -1;
            this.width = property.getWidth();
            this.height = property.getHeight();
            this.formatType = property.getFormatType();
            this.quadrant = property.getQuadrant();
            this.itemIdentity = property.getItemIdentity();
            this.timestamp = property.getTimestamp();
            this.ext = property.getExt();
        }

        public Ext getExt() {
            return this.ext;
        }

        public int getFormatType() {
            return this.formatType;
        }

        public int getHeight() {
            return this.height;
        }

        public int getItemIdentity() {
            return this.itemIdentity;
        }

        public int getQuadrant() {
            return this.quadrant;
        }

        public long getTimestamp() {
            return this.timestamp;
        }

        public int getWidth() {
            return this.width;
        }

        public void resetWidthAndHeight() {
            if (this.quadrant % 2 != 0) {
                int i10 = this.width;
                this.width = this.height;
                this.height = i10;
            }
            this.quadrant = 0;
        }
    }

    public MLFrame() {
        this.frameInit = Boolean.FALSE;
        this.property = new Property();
        this.byteBuffer = null;
        this.bitmap = null;
    }

    private MLFrame(Bitmap bitmap) {
        this.frameInit = Boolean.FALSE;
        this.bitmap = bitmap;
    }

    private MLFrame(Bitmap bitmap, Property property) {
        this.frameInit = Boolean.FALSE;
        this.bitmap = bitmap;
        this.property = property == null ? new Property() : property;
    }

    private MLFrame(ByteBuffer byteBuffer, Property property) {
        this.frameInit = Boolean.FALSE;
        this.byteBuffer = byteBuffer;
        this.property = property == null ? new Property() : property;
    }

    private MLFrame(byte[] bArr) {
        this.frameInit = Boolean.FALSE;
        this.bytes = bArr;
    }

    private MLFrame(byte[] bArr, Property property) {
        this(ByteBuffer.wrap(bArr), property);
    }

    public static MLFrame fromBitmap(Bitmap bitmap) {
        return new MLFrame(bitmap);
    }

    public static MLFrame fromByteArray(byte[] bArr, Property property) {
        return new MLFrame(bArr, property);
    }

    public static MLFrame fromByteBuffer(ByteBuffer byteBuffer, Property property) {
        return new MLFrame(byteBuffer, property);
    }

    public static MLFrame fromFilePath(Context context, Uri uri) throws IOException {
        if (context == null) {
            throw new IllegalArgumentException("Parameter context is mandatory");
        }
        if (uri == null) {
            throw new IllegalArgumentException("Parameter uri is mandatory");
        }
        Bitmap bitmap = MediaStore.Images.Media.getBitmap(context.getContentResolver(), uri);
        if (bitmap != null) {
            return new MLFrame(bitmap);
        }
        throw new NullPointerException("Failed to load bitmap from uri");
    }

    @TargetApi(19)
    public static MLFrame fromMediaImage(Image image, int i10) {
        Image.Plane plane;
        int format = image.getFormat();
        if (format != 256 && format != 35) {
            throw new IllegalArgumentException("Unsupported format: " + image.getFormat() + ", Only JPEG and YUV_420_888 are supported");
        }
        MLFrame mLFrame = null;
        if (format == 256) {
            Image.Plane[] planes = image.getPlanes();
            if (planes != null && planes.length == 1 && (plane = planes[0]) != null && plane.getBuffer() != null) {
                ByteBuffer buffer = planes[0].getBuffer();
                int iRemaining = buffer.remaining();
                byte[] bArr = new byte[iRemaining];
                buffer.get(bArr);
                mLFrame = i10 != 0 ? new MLFrame(rotate(BitmapFactory.decodeByteArray(bArr, 0, iRemaining), i10)) : new MLFrame(bArr);
            }
        } else {
            Property.Creator creator = new Property.Creator();
            creator.setFormatType(17).setWidth(image.getWidth()).setHeight(image.getHeight()).setQuadrant(i10);
            mLFrame = new MLFrame(ImageConvertUtils.getDataFromImage(image, 2), creator.create());
        }
        if (mLFrame != null) {
            return mLFrame;
        }
        throw new IllegalStateException("Failed to create frame from media image.");
    }

    private Pair<Integer, Integer> getPreviewSize() {
        Property property = this.property;
        if (property == null) {
            return null;
        }
        if (property.getItemIdentity() == -1) {
            return Pair.create(Integer.valueOf(wrapBitmap().getWidth()), Integer.valueOf(wrapBitmap().getHeight()));
        }
        boolean z10 = true;
        if (this.property.getQuadrant() != 1 && this.property.getQuadrant() != 3) {
            z10 = false;
        }
        Property property2 = this.property;
        return Pair.create(Integer.valueOf(z10 ? property2.getHeight() : property2.getWidth()), Integer.valueOf(z10 ? this.property.getWidth() : this.property.getHeight()));
    }

    private boolean isSupportedYuvFormat(int i10) {
        return i10 == 842094169 || i10 == 17;
    }

    public static Bitmap rotate(Bitmap bitmap, int i10) {
        if (i10 < 0 || i10 > 3) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Invalid quadrant: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i10 == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i10 * 90);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    private final Bitmap wrapBitmap() {
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            return bitmap;
        }
        if (this.property != null) {
            try {
                byte[] bArrWrapJpeg = wrapJpeg(false);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrWrapJpeg, 0, bArrWrapJpeg.length);
                if (this.property.getQuadrant() != 0) {
                    bitmapDecodeByteArray = rotate(bitmapDecodeByteArray, this.property.getQuadrant());
                }
                this.bitmap = bitmapDecodeByteArray;
            } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | Exception unused) {
                return null;
            }
        }
        return this.bitmap;
    }

    public ByteBuffer acquireGrayByteBuffer() {
        ByteBuffer byteBuffer = this.byteBuffer;
        if (byteBuffer != null && this.property != null) {
            ImageConvertUtils.nv21ToGray(byteBuffer.array(), this.property.width, this.property.height);
        }
        return this.byteBuffer;
    }

    public Property acquireProperty() {
        return this.property;
    }

    public final Pair<byte[], Float> create(int i10, int i11) {
        byte[] bArrBitmap2Jpeg;
        if (getPreviewSize() == null) {
            return null;
        }
        int iIntValue = ((Integer) getPreviewSize().first).intValue();
        int iIntValue2 = ((Integer) getPreviewSize().second).intValue();
        float fMin = Math.min(i10 / iIntValue, i11 / iIntValue2);
        float f10 = 1.0f;
        if (fMin >= 1.0f) {
            bArrBitmap2Jpeg = wrapJpeg(true);
        } else {
            Matrix matrix = new Matrix();
            matrix.postScale(fMin, fMin);
            f10 = fMin;
            bArrBitmap2Jpeg = ImageConvertUtils.bitmap2Jpeg(Bitmap.createBitmap(wrapBitmap(), 0, 0, iIntValue, iIntValue2, matrix, true), 100);
        }
        return Pair.create(bArrBitmap2Jpeg, Float.valueOf(f10));
    }

    public ByteBuffer getByteBuffer() {
        return this.byteBuffer;
    }

    public final synchronized MLFrame getFrame(boolean z10, boolean z11) {
        if (this.frameInit.booleanValue()) {
            return this;
        }
        if (!z10 && this.byteBuffer != null) {
            int formatType = this.property.getFormatType();
            if (z11 && formatType != 17) {
                if (formatType == 842094169) {
                    this.byteBuffer = ByteBuffer.wrap(ImageConvertUtils.byteToNv21(ImageConvertUtils.buffer2Byte(this.byteBuffer)));
                }
                Property.Creator creator = new Property.Creator();
                creator.setFormatType(17).setWidth(this.property.getWidth()).setHeight(this.property.getHeight()).setQuadrant(this.property.getQuadrant());
                this.property = creator.create();
                this.frameInit = Boolean.TRUE;
                return this;
            }
            this.frameInit = Boolean.TRUE;
            return this;
        }
        this.bitmap = getPreviewBitmap();
        this.property = new Creator().setBitmap(readBitmap()).create().property;
        this.frameInit = Boolean.TRUE;
        return this;
    }

    public Bitmap getPreviewBitmap() {
        if (this.bytes == null && this.byteBuffer == null && this.bitmap == null) {
            throw new IllegalStateException("At least one of bytes, byteBuffer or bitmap should be not null");
        }
        return wrapBitmap();
    }

    public int getRecMode() {
        return this.recMode;
    }

    public final void initialize() {
        ByteBuffer byteBuffer = this.byteBuffer;
        if (byteBuffer != null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.capacity());
            byteBuffer.rewind();
            byteBufferAllocate.put(byteBuffer);
            byteBuffer.rewind();
            byteBufferAllocate.flip();
            this.byteBuffer = byteBufferAllocate;
        }
    }

    public Bitmap readBitmap() {
        return this.bitmap;
    }

    public void setRecMode(int i10) {
        this.recMode = i10;
    }

    public final byte[] wrapJpeg(boolean z10) {
        byte[] bArr = this.bytes;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArrNv21ToJpeg = null;
        if (this.byteBuffer != null) {
            int formatType = this.property.getFormatType();
            if (!isSupportedYuvFormat(formatType)) {
                throw new IllegalStateException("Only support NV21 or YV12");
            }
            if (!z10 || this.property.getQuadrant() == 0) {
                byte[] bArrBuffer2Byte = ImageConvertUtils.buffer2Byte(this.byteBuffer);
                if (842094169 == formatType) {
                    bArrBuffer2Byte = ImageConvertUtils.byteToNv21(bArrBuffer2Byte);
                }
                bArrNv21ToJpeg = ImageConvertUtils.nv21ToJpeg(bArrBuffer2Byte, this.property.getWidth(), this.property.getHeight());
                if (this.property.getQuadrant() == 0) {
                    this.bytes = bArrNv21ToJpeg;
                }
            }
        }
        if (bArrNv21ToJpeg != null) {
            return bArrNv21ToJpeg;
        }
        byte[] bArrBitmap2Jpeg = ImageConvertUtils.bitmap2Jpeg(wrapBitmap(), 100);
        this.bytes = bArrBitmap2Jpeg;
        return bArrBitmap2Jpeg;
    }
}
