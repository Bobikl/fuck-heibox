package com.bytedance.realx.video;

import androidx.annotation.p0;
import com.bytedance.realx.base.CalledByNative;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class EncodedImage {
    public final ByteBuffer buffer;
    public final long captureTimeMs;
    public final long captureTimeNs;
    public final boolean completeFrame;
    public final long compositionTimeUs;
    public final int encodedHeight;
    public final int encodedWidth;
    public final FrameType frameType;
    public final Integer qp;
    public final int rotation;
    public final int svcLayerNum;

    public static class Builder {
        private ByteBuffer buffer;
        private long captureTimeNs;
        private boolean completeFrame;
        private long compositionTimeUs;
        private int encodedHeight;
        private int encodedWidth;
        private FrameType frameType;
        private Integer qp;
        private int rotation;
        private int svcLayerNum;

        private Builder() {
        }

        public EncodedImage createEncodedImage() {
            return new EncodedImage(this.buffer, this.encodedWidth, this.encodedHeight, this.captureTimeNs, this.frameType, this.rotation, this.completeFrame, this.qp, this.svcLayerNum, this.compositionTimeUs);
        }

        public Builder setBuffer(ByteBuffer byteBuffer) {
            this.buffer = byteBuffer;
            return this;
        }

        @Deprecated
        public Builder setCaptureTimeMs(long j10) {
            this.captureTimeNs = TimeUnit.MILLISECONDS.toNanos(j10);
            return this;
        }

        public Builder setCaptureTimeNs(long j10) {
            this.captureTimeNs = j10;
            return this;
        }

        public Builder setCompleteFrame(boolean z10) {
            this.completeFrame = z10;
            return this;
        }

        public Builder setCompositionTimeUs(long j10) {
            this.compositionTimeUs = j10;
            return this;
        }

        public Builder setEncodedHeight(int i10) {
            this.encodedHeight = i10;
            return this;
        }

        public Builder setEncodedWidth(int i10) {
            this.encodedWidth = i10;
            return this;
        }

        public Builder setFrameType(FrameType frameType) {
            this.frameType = frameType;
            return this;
        }

        public Builder setQp(Integer num) {
            this.qp = num;
            return this;
        }

        public Builder setRotation(int i10) {
            this.rotation = i10;
            return this;
        }

        public Builder setSvcLayerNum(int i10) {
            this.svcLayerNum = i10;
            return this;
        }
    }

    public enum FrameType {
        kUnknow(0),
        kIntra(1),
        kPredicted(2),
        kBiPredicted(3),
        kEmpty(4),
        kLtrRecovery(5);

        private final int nativeIndex;

        FrameType(int i10) {
            this.nativeIndex = i10;
        }

        @CalledByNative("FrameType")
        static FrameType fromNativeIndex(int i10) {
            for (FrameType frameType : values()) {
                if (frameType.getNative() == i10) {
                    return frameType;
                }
            }
            throw new IllegalArgumentException("Unknown native frame type: " + i10);
        }

        public int getNative() {
            return this.nativeIndex;
        }
    }

    @CalledByNative
    private EncodedImage(ByteBuffer byteBuffer, int i10, int i11, long j10, FrameType frameType, int i12, boolean z10, Integer num, int i13, long j11) {
        this.buffer = byteBuffer;
        this.encodedWidth = i10;
        this.encodedHeight = i11;
        this.captureTimeMs = TimeUnit.NANOSECONDS.toMillis(j10);
        this.captureTimeNs = j10;
        this.frameType = frameType;
        this.rotation = i12;
        this.completeFrame = z10;
        this.qp = num;
        this.svcLayerNum = i13;
        this.compositionTimeUs = j11;
    }

    public static Builder builder() {
        return new Builder();
    }

    @CalledByNative
    private ByteBuffer getBuffer() {
        return this.buffer;
    }

    @CalledByNative
    private long getCaptureTimeNs() {
        return this.captureTimeNs;
    }

    @CalledByNative
    private boolean getCompleteFrame() {
        return this.completeFrame;
    }

    @CalledByNative
    private long getCompositionTimeUs() {
        return this.compositionTimeUs;
    }

    @CalledByNative
    private int getEncodedHeight() {
        return this.encodedHeight;
    }

    @CalledByNative
    private int getEncodedWidth() {
        return this.encodedWidth;
    }

    @CalledByNative
    private int getFrameType() {
        return this.frameType.getNative();
    }

    @CalledByNative
    @p0
    private Integer getQp() {
        return this.qp;
    }

    @CalledByNative
    private int getRotation() {
        return this.rotation;
    }

    @CalledByNative
    private int getSvcLayerNum() {
        return this.svcLayerNum;
    }
}
