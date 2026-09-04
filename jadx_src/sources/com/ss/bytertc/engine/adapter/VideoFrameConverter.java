package com.ss.bytertc.engine.adapter;

import androidx.annotation.p0;
import com.bytedance.realx.video.JavaI420Buffer;
import com.bytedance.realx.video.VideoFrame;
import com.ss.bytertc.engine.mediaio.CountDownLatchI420Buffer;
import com.ss.bytertc.engine.utils.LogUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class VideoFrameConverter {
    private static int MAX_BYTE_BUFFER_POOL_SIZE = 2;
    private static final String TAG = "VideoFrameConverter";
    private int abandonFrameCount;
    private ArrayList<ByteBufferHolder> byteBufferPool;
    private ByteBuffer[] byteBuffers;
    private boolean isBufferDirect;
    final int[] steps;
    final int[] strides;

    public static class ByteBufferHolder {
        private ByteBuffer byteBuffer;
        private volatile boolean isPending = false;

        protected ByteBufferHolder() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setByteBuffer(ByteBuffer byteBuffer) {
            this.byteBuffer = byteBuffer;
        }

        public byte[] getArray() {
            ByteBuffer byteBuffer = this.byteBuffer;
            if (byteBuffer == null) {
                return null;
            }
            byteBuffer.clear();
            if (this.byteBuffer.hasArray() && this.byteBuffer.arrayOffset() == 0) {
                return this.byteBuffer.array();
            }
            int iRemaining = this.byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            this.byteBuffer.get(bArr, 0, iRemaining);
            return bArr;
        }

        public ByteBuffer getByteBuffer() {
            ByteBuffer byteBuffer = this.byteBuffer;
            if (byteBuffer != null) {
                byteBuffer.clear();
            }
            return this.byteBuffer;
        }

        public boolean isPending() {
            return this.isPending;
        }

        public void setPending(boolean z10) {
            this.isPending = z10;
        }
    }

    public static class I420BufferWrapper {
        private VideoFrame.I420Buffer i420Buffer;
        private boolean needManualRelease;

        public I420BufferWrapper(VideoFrame videoFrame) {
            if (videoFrame.getBuffer() instanceof JavaI420Buffer) {
                this.i420Buffer = (JavaI420Buffer) videoFrame.getBuffer();
                this.needManualRelease = false;
            } else {
                this.i420Buffer = videoFrame.getBuffer().toI420();
                this.needManualRelease = true;
                videoFrame.getBuffer().release();
            }
        }

        public VideoFrame.I420Buffer getBuffer() {
            return this.i420Buffer;
        }

        public void release() {
            VideoFrame.I420Buffer i420Buffer = this.i420Buffer;
            if ((i420Buffer instanceof JavaI420Buffer) && this.needManualRelease) {
                i420Buffer.release();
            }
        }
    }

    public VideoFrameConverter() {
        this(false);
    }

    public VideoFrameConverter(boolean z10) {
        this.byteBuffers = new ByteBuffer[3];
        this.strides = new int[3];
        this.steps = new int[2];
        this.byteBufferPool = new ArrayList<>();
        this.abandonFrameCount = 0;
        for (int i10 = 0; i10 < MAX_BYTE_BUFFER_POOL_SIZE; i10++) {
            this.byteBufferPool.add(new ByteBufferHolder());
        }
        this.isBufferDirect = z10;
    }

    private boolean convertRawYUV2ByteArray(@p0 byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10, int i11, int i12, int i13, int i14) {
        int[] iArr = this.strides;
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = i12;
        int[] iArr2 = this.steps;
        iArr2[0] = i13;
        int i15 = (i13 + 1) / 2;
        iArr2[1] = i15;
        int i16 = (i13 * i14) + (i15 * 2 * i14);
        byteBuffer.clear();
        byteBuffer2.clear();
        byteBuffer3.clear();
        if (bArr == null || i16 > bArr.length) {
            return false;
        }
        ByteBuffer[] byteBufferArr = this.byteBuffers;
        byteBufferArr[0] = byteBuffer;
        byteBufferArr[1] = byteBuffer2;
        byteBufferArr[2] = byteBuffer3;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            ByteBuffer[] byteBufferArr2 = this.byteBuffers;
            if (i17 >= byteBufferArr2.length) {
                byteBufferArr2[0] = null;
                byteBufferArr2[1] = null;
                byteBufferArr2[2] = null;
                return true;
            }
            ByteBuffer byteBuffer4 = byteBufferArr2[i17];
            int i19 = this.strides[i17];
            int[] iArr3 = this.steps;
            int i20 = i17 == 0 ? iArr3[0] : iArr3[1];
            int i21 = i19 - i20;
            if (i19 == i20) {
                int iRemaining = byteBuffer4.remaining();
                byteBuffer4.get(bArr, i18, iRemaining);
                i18 += iRemaining;
            } else {
                while (byteBuffer4.hasRemaining() && byteBuffer4.position() + i20 <= byteBuffer4.capacity()) {
                    byteBuffer4.get(bArr, i18, i20);
                    i18 += i20;
                    int iPosition = byteBuffer4.position() + i21;
                    if (!byteBuffer4.hasRemaining() || iPosition > byteBuffer4.capacity()) {
                        break;
                    }
                    byteBuffer4.position(iPosition);
                }
            }
            i17++;
        }
    }

    private boolean convertRawYUV2ByteBuffer(@p0 ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, int i10, int i11, int i12, int i13, int i14) {
        int[] iArr = this.strides;
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = i12;
        int[] iArr2 = this.steps;
        iArr2[0] = i13;
        int i15 = (i13 + 1) / 2;
        iArr2[1] = i15;
        int i16 = (i13 * i14) + (i15 * 2 * i14);
        byteBuffer2.clear();
        byteBuffer3.clear();
        byteBuffer4.clear();
        if (byteBuffer == null || i16 > byteBuffer.capacity()) {
            return false;
        }
        byteBuffer.clear();
        ByteBuffer[] byteBufferArr = this.byteBuffers;
        byteBufferArr[0] = byteBuffer2;
        byteBufferArr[1] = byteBuffer3;
        byteBufferArr[2] = byteBuffer4;
        int i17 = 0;
        while (true) {
            ByteBuffer[] byteBufferArr2 = this.byteBuffers;
            if (i17 >= byteBufferArr2.length) {
                byteBufferArr2[0] = null;
                byteBufferArr2[1] = null;
                byteBufferArr2[2] = null;
                return true;
            }
            ByteBuffer byteBuffer5 = byteBufferArr2[i17];
            int i18 = this.strides[i17];
            int[] iArr3 = this.steps;
            int i19 = i17 == 0 ? iArr3[0] : iArr3[1];
            int i20 = i18 - i19;
            if (i18 != i19) {
                while (byteBuffer5.hasRemaining() && byteBuffer5.position() + i19 <= byteBuffer5.capacity()) {
                    byteBuffer5.limit(byteBuffer5.position() + i19);
                    byteBuffer.put(byteBuffer5);
                    int iPosition = byteBuffer5.position() + i20;
                    if (iPosition > byteBuffer5.capacity()) {
                        break;
                    }
                    byteBuffer5.limit(byteBuffer5.capacity());
                    byteBuffer5.position(iPosition);
                }
            } else {
                byteBuffer.put(byteBuffer5);
            }
            i17++;
        }
    }

    private ByteBufferHolder getPendingBuffer() {
        for (ByteBufferHolder byteBufferHolder : this.byteBufferPool) {
            if (!byteBufferHolder.isPending) {
                byteBufferHolder.setPending(true);
                return byteBufferHolder;
            }
        }
        return null;
    }

    public void checkReuseByteBuffer(int i10, ByteBufferHolder byteBufferHolder) {
        if (byteBufferHolder.getByteBuffer() == null || byteBufferHolder.getByteBuffer().capacity() < i10) {
            ByteBuffer byteBufferAllocateDirect = this.isBufferDirect ? ByteBuffer.allocateDirect(i10) : ByteBuffer.allocate(i10);
            byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
            byteBufferHolder.setByteBuffer(byteBufferAllocateDirect);
        }
    }

    public ByteBufferHolder convert2YUV(VideoFrame videoFrame) {
        ByteBufferHolder pendingBuffer = getPendingBuffer();
        if (pendingBuffer == null) {
            return null;
        }
        int width = videoFrame.getBuffer().getWidth();
        int height = videoFrame.getBuffer().getHeight();
        I420BufferWrapper i420BufferWrapper = new I420BufferWrapper(videoFrame);
        VideoFrame.I420Buffer buffer = i420BufferWrapper.getBuffer();
        boolean zConvertRawYUV2ByteHolder = convertRawYUV2ByteHolder(pendingBuffer, buffer.getDataY(), buffer.getDataU(), buffer.getDataV(), buffer.getStrideY(), buffer.getStrideU(), buffer.getStrideV(), width, height);
        i420BufferWrapper.release();
        if (zConvertRawYUV2ByteHolder) {
            return pendingBuffer;
        }
        return null;
    }

    public ByteBuffer convertRawYUV2ByteArray(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, int i11, int i12, int i13, int i14) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArr.length);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        byteBufferAllocateDirect.put(bArr);
        byteBufferAllocateDirect.position(0);
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(bArr2.length);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        byteBufferAllocateDirect2.put(bArr2);
        byteBufferAllocateDirect2.position(0);
        ByteBuffer byteBufferAllocateDirect3 = ByteBuffer.allocateDirect(bArr3.length);
        byteBufferAllocateDirect3.order(ByteOrder.nativeOrder());
        byteBufferAllocateDirect3.put(bArr3);
        byteBufferAllocateDirect3.position(0);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((i13 * i14) + (((i13 + 1) / 2) * 2 * i13));
        byteBufferAllocate.clear();
        convertRawYUV2ByteArray(byteBufferAllocate.array(), byteBufferAllocateDirect, byteBufferAllocateDirect2, byteBufferAllocateDirect3, i10, i11, i12, i13, i14);
        return byteBufferAllocate;
    }

    public boolean convertRawYUV2ByteHolder(ByteBufferHolder byteBufferHolder, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10, int i11, int i12, int i13, int i14) {
        checkReuseByteBuffer((i13 * i14) + (((i13 + 1) / 2) * 2 * i14), byteBufferHolder);
        return convertRawYUV2ByteBuffer(byteBufferHolder.byteBuffer, byteBuffer, byteBuffer2, byteBuffer3, i10, i11, i12, i13, i14);
    }

    public VideoFrame.I420Buffer convertToJavaI420Buffer(ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        if (byteBuffer == null) {
            return null;
        }
        final ByteBufferHolder pendingBuffer = getPendingBuffer();
        if (pendingBuffer == null) {
            int i12 = this.abandonFrameCount + 1;
            this.abandonFrameCount = i12;
            if (i12 >= 60) {
                LogUtil.e(TAG, "drop frame > 60 !!! please check Buffer for release");
                this.abandonFrameCount = 0;
            }
            return null;
        }
        this.abandonFrameCount = 0;
        int i13 = (i11 + 1) / 2;
        int i14 = (i10 + 1) / 2;
        int i15 = i10 * i11;
        int i16 = (i14 * 2 * i13) + i15;
        checkReuseByteBuffer(i16, pendingBuffer);
        ByteBuffer byteBuffer2 = pendingBuffer.getByteBuffer();
        byteBuffer.position(0);
        byteBuffer2.position(0);
        if (byteBuffer.limit() > i16) {
            byteBuffer.limit(i16);
        }
        byteBuffer2.limit(i16);
        byteBuffer2.put(byteBuffer);
        int i17 = i15 + 0;
        int i18 = i13 * i14;
        int i19 = i17 + i18;
        byteBuffer2.position(0);
        byteBuffer2.limit(i17);
        ByteBuffer byteBufferSlice = byteBuffer2.slice();
        byteBuffer2.position(i17);
        byteBuffer2.limit(i19);
        ByteBuffer byteBufferSlice2 = byteBuffer2.slice();
        byteBuffer2.position(i19);
        byteBuffer2.limit(i19 + i18);
        ByteBuffer byteBufferSlice3 = byteBuffer2.slice();
        return z10 ? CountDownLatchI420Buffer.wrap(i10, i11, byteBufferSlice, i10, byteBufferSlice2, i14, byteBufferSlice3, i14, new Runnable() { // from class: com.ss.bytertc.engine.adapter.a
            @Override // java.lang.Runnable
            public final void run() {
                pendingBuffer.setPending(false);
            }
        }) : JavaI420Buffer.wrap(i10, i11, byteBufferSlice, i10, byteBufferSlice2, i14, byteBufferSlice3, i14, new Runnable() { // from class: com.ss.bytertc.engine.adapter.b
            @Override // java.lang.Runnable
            public final void run() {
                pendingBuffer.setPending(false);
            }
        });
    }

    public VideoFrame.I420Buffer convertToJavaI420Buffer(byte[] bArr, int i10, int i11, boolean z10) {
        if (bArr == null) {
            return null;
        }
        final ByteBufferHolder pendingBuffer = getPendingBuffer();
        if (pendingBuffer == null) {
            int i12 = this.abandonFrameCount + 1;
            this.abandonFrameCount = i12;
            if (i12 >= 60) {
                LogUtil.e(TAG, "drop frame > 60 !!! please check Buffer for release ");
                this.abandonFrameCount = 0;
            }
            return null;
        }
        this.abandonFrameCount = 0;
        int i13 = (i11 + 1) / 2;
        int i14 = (i10 + 1) / 2;
        int i15 = i10 * i11;
        int i16 = (i14 * 2 * i13) + i15;
        checkReuseByteBuffer(i16, pendingBuffer);
        ByteBuffer byteBuffer = pendingBuffer.getByteBuffer();
        byteBuffer.position(0);
        byteBuffer.limit(i16);
        byteBuffer.put(bArr, 0, Math.min(bArr.length, i16));
        int i17 = i15 + 0;
        int i18 = i13 * i14;
        int i19 = i17 + i18;
        byteBuffer.position(0);
        byteBuffer.limit(i17);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBuffer.position(i17);
        byteBuffer.limit(i19);
        ByteBuffer byteBufferSlice2 = byteBuffer.slice();
        byteBuffer.position(i19);
        byteBuffer.limit(i19 + i18);
        ByteBuffer byteBufferSlice3 = byteBuffer.slice();
        return z10 ? CountDownLatchI420Buffer.wrap(i10, i11, byteBufferSlice, i10, byteBufferSlice2, i14, byteBufferSlice3, i14, new Runnable() { // from class: com.ss.bytertc.engine.adapter.c
            @Override // java.lang.Runnable
            public final void run() {
                pendingBuffer.setPending(false);
            }
        }) : JavaI420Buffer.wrap(i10, i11, byteBufferSlice, i10, byteBufferSlice2, i14, byteBufferSlice3, i14, new Runnable() { // from class: com.ss.bytertc.engine.adapter.d
            @Override // java.lang.Runnable
            public final void run() {
                pendingBuffer.setPending(false);
            }
        });
    }
}
