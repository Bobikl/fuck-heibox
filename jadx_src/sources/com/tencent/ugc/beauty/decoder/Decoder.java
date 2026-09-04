package com.tencent.ugc.beauty.decoder;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.tools.ant.taskdefs.email.b;

/* JADX INFO: loaded from: classes4.dex */
public class Decoder extends ProvidedStage<Frame> {
    private static final String TAG = "Decoder";
    private final MediaCodec.BufferInfo mBufferInfo;
    private final Extractor mExtractor;
    private boolean mIsLooping;
    private MediaCodec mMediaCodec;
    private final Object mNativeWindow;
    private long mSkipFrameBeforeInThisLoop;

    public Decoder(Extractor extractor) {
        this(extractor, null);
    }

    public Decoder(Extractor extractor, SurfaceTexture surfaceTexture) {
        this.mIsLooping = false;
        this.mSkipFrameBeforeInThisLoop = 0L;
        this.mExtractor = extractor;
        this.mNativeWindow = surfaceTexture;
        this.mBufferInfo = new MediaCodec.BufferInfo();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void drainDecodedFrame() {
        synchronized (this) {
            if (this.mWaitOutBuffers.size() >= 3) {
                return;
            }
            int iDequeueOutputBuffer = this.mMediaCodec.dequeueOutputBuffer(this.mBufferInfo, 0L);
            if (iDequeueOutputBuffer == -1) {
                return;
            }
            if (iDequeueOutputBuffer == -3) {
                LiteavLog.i(TAG, "decoder output buffers changed");
                return;
            }
            if (iDequeueOutputBuffer == -2) {
                LiteavLog.i(TAG, "decoder output format changed: ".concat(String.valueOf(this.mMediaCodec.getOutputFormat())));
                return;
            }
            if (iDequeueOutputBuffer < 0) {
                throw new RuntimeException("unexpected result from decoder.dequeueOutputBuffer: ".concat(String.valueOf(iDequeueOutputBuffer)));
            }
            ByteBuffer outputBuffer = LiteavSystemInfo.getSystemOSVersionInt() >= 21 ? this.mMediaCodec.getOutputBuffer(iDequeueOutputBuffer) : this.mMediaCodec.getOutputBuffers()[iDequeueOutputBuffer];
            Frame frame = new Frame();
            frame.buffer = outputBuffer;
            frame.bufferIndex = iDequeueOutputBuffer;
            MediaCodec.BufferInfo bufferInfo = this.mBufferInfo;
            frame.offset = bufferInfo.offset;
            frame.size = bufferInfo.size;
            long j10 = bufferInfo.presentationTimeUs;
            frame.presentationTimeUs = j10;
            int i10 = bufferInfo.flags;
            frame.flags = i10;
            if (this.mSkipFrameBeforeInThisLoop <= j10 || MediaUtils.hasEosFlag(i10)) {
                synchronized (this) {
                    this.mWaitOutBuffers.add((T) frame);
                }
            } else {
                this.mMediaCodec.releaseOutputBuffer(frame.bufferIndex, false);
            }
            if (MediaUtils.hasEosFlag(frame.flags)) {
                setState(Stage.State.ALL_DATA_READY);
            }
        }
    }

    private void feedDataToMediaCodec() throws SetupException {
        int iDequeueInputBuffer;
        if (!isAllDataReady() && (iDequeueInputBuffer = this.mMediaCodec.dequeueInputBuffer(0L)) >= 0) {
            MediaCodec.BufferInfo sampleData = this.mExtractor.readSampleData(this.mMediaCodec.getInputBuffers()[iDequeueInputBuffer]);
            if (this.mIsLooping && MediaUtils.hasEosFlag(sampleData.flags)) {
                this.mExtractor.restart();
                sampleData.set(0, 0, 0L, 0);
                this.mSkipFrameBeforeInThisLoop = 0L;
            }
            this.mMediaCodec.queueInputBuffer(iDequeueInputBuffer, sampleData.offset, sampleData.size, sampleData.presentationTimeUs, sampleData.flags);
        }
    }

    private Surface getOutputSurface(Object obj) throws ExecutionException, InterruptedException {
        if (obj == null) {
            return null;
        }
        while (obj instanceof Future) {
            obj = ((Future) obj).get();
        }
        if (obj instanceof Surface) {
            return (Surface) obj;
        }
        if (obj instanceof SurfaceTexture) {
            return new Surface((SurfaceTexture) obj);
        }
        return null;
    }

    @Override // com.tencent.ugc.beauty.decoder.ProvidedStage, com.tencent.ugc.beauty.decoder.Stage
    public void processFrame() throws ProcessException {
        try {
            super.processFrame();
            feedDataToMediaCodec();
            drainDecodedFrame();
        } catch (Throwable th2) {
            throw new ProcessException("decode failed", th2);
        }
    }

    @Override // com.tencent.ugc.beauty.decoder.ProvidedStage
    protected void recycleBuffers(List<Frame> list) {
        for (Frame frame : list) {
            if (this.mNativeWindow == null || LiteavSystemInfo.getSystemOSVersionInt() < 21) {
                this.mMediaCodec.releaseOutputBuffer(frame.bufferIndex, this.mNativeWindow != null);
            } else {
                this.mMediaCodec.releaseOutputBuffer(frame.bufferIndex, TimeUnit.MICROSECONDS.toNanos(frame.presentationTimeUs));
            }
        }
    }

    @Override // com.tencent.ugc.beauty.decoder.Stage
    public void release() {
        LiteavLog.i(TAG, "released decoder");
        this.mExtractor.release();
        MediaCodec mediaCodec = this.mMediaCodec;
        if (mediaCodec == null) {
            return;
        }
        try {
            mediaCodec.stop();
        } catch (Throwable th2) {
            LiteavLog.e(TAG, "MediaCodec stop failed.".concat(String.valueOf(th2)));
        }
        try {
            this.mMediaCodec.release();
        } catch (Throwable th3) {
            LiteavLog.e(TAG, "MediaCodec release failed.".concat(String.valueOf(th3)));
        }
    }

    public void setLooping(boolean z10) {
        this.mIsLooping = z10;
    }

    @Override // com.tencent.ugc.beauty.decoder.Stage
    public void setup() throws SetupException {
        Surface outputSurface;
        try {
            outputSurface = getOutputSurface(this.mNativeWindow);
            try {
                LiteavLog.i(TAG, "output surface: ".concat(String.valueOf(outputSurface)));
            } catch (Throwable th2) {
                th = th2;
                LiteavLog.e(TAG, "get output surface failed.", th);
            }
        } catch (Throwable th3) {
            th = th3;
            outputSurface = null;
        }
        this.mExtractor.setup();
        MediaFormat mediaFormat = this.mExtractor.getMediaFormat();
        String string = mediaFormat.getString(b.I);
        LiteavLog.i(TAG, "Decoder[%d] for %s", Integer.valueOf(this.mExtractor.getTraceIndex()), string);
        try {
            MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(string);
            this.mMediaCodec = mediaCodecCreateDecoderByType;
            mediaCodecCreateDecoderByType.configure(mediaFormat, outputSurface, (MediaCrypto) null, 0);
            this.mMediaCodec.start();
            setState(Stage.State.SETUPED);
        } catch (IOException e10) {
            throw new SetupException("configure MediaCodec failed.", e10);
        }
    }
}
