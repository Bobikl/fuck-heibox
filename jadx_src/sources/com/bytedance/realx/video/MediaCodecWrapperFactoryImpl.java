package com.bytedance.realx.video;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public class MediaCodecWrapperFactoryImpl implements MediaCodecWrapperFactory {

    public static class MediaCodecWrapperImpl implements MediaCodecWrapper {
        private final MediaCodec mediaCodec;

        public MediaCodecWrapperImpl(MediaCodec mediaCodec) {
            this.mediaCodec = mediaCodec;
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        public void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
            this.mediaCodec.configure(mediaFormat, surface, mediaCrypto, i10);
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        @TargetApi(18)
        public Surface createInputSurface() {
            return this.mediaCodec.createInputSurface();
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        public int dequeueInputBuffer(long j10) {
            return this.mediaCodec.dequeueInputBuffer(j10);
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        public int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j10) {
            return this.mediaCodec.dequeueOutputBuffer(bufferInfo, j10);
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        public void flush() {
            this.mediaCodec.flush();
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        public MediaCodecInfo getCodecInfo() {
            return this.mediaCodec.getCodecInfo();
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        public ByteBuffer[] getInputBuffers() {
            return this.mediaCodec.getInputBuffers();
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        public ByteBuffer[] getOutputBuffers() {
            return this.mediaCodec.getOutputBuffers();
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        public MediaFormat getOutputFormat() {
            return this.mediaCodec.getOutputFormat();
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        public MediaFormat getOutputFormat(int i10) {
            return this.mediaCodec.getOutputFormat(i10);
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        public void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) {
            this.mediaCodec.queueInputBuffer(i10, i11, i12, j10, i13);
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        public void release() {
            this.mediaCodec.release();
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        public void releaseOutputBuffer(int i10, boolean z10) {
            this.mediaCodec.releaseOutputBuffer(i10, z10);
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        @TargetApi(19)
        public void setParameters(Bundle bundle) {
            this.mediaCodec.setParameters(bundle);
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        public void start() {
            this.mediaCodec.start();
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        public void stop() {
            this.mediaCodec.stop();
        }
    }

    MediaCodecWrapperFactoryImpl() {
    }

    @Override // com.bytedance.realx.video.MediaCodecWrapperFactory
    public MediaCodecWrapper createByCodecName(String str) throws IOException {
        return new MediaCodecWrapperImpl(MediaCodec.createByCodecName(str));
    }
}
