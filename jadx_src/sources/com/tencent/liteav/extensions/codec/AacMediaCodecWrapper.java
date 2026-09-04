package com.tencent.liteav.extensions.codec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.google.android.exoplayer2.util.y;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class AacMediaCodecWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    MediaFormat f99744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f99745b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f99746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f99747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MediaCodec f99748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final MediaCodec.BufferInfo f99749f;

    public static final class a extends Enum<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f99750a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f99751b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ int[] f99752c = {1, 2};
    }

    public AacMediaCodecWrapper(int i10) {
        this.f99747d = i10;
        this.f99746c = i10 == a.f99750a ? "HardwareAacEncoder" : "HardwareAacDecoder";
        this.f99749f = new MediaCodec.BufferInfo();
    }

    private ByteBuffer b() {
        try {
            int iDequeueOutputBuffer = this.f99748e.dequeueOutputBuffer(this.f99749f, TimeUnit.MILLISECONDS.toMicros(5L));
            if (iDequeueOutputBuffer == -1) {
                return null;
            }
            if (iDequeueOutputBuffer == -3) {
                Log.i(this.f99746c, "codec output buffers changed.", new Object[0]);
                return null;
            }
            if (iDequeueOutputBuffer == -2) {
                this.f99744a = this.f99748e.getOutputFormat();
                Log.i(this.f99746c, "codec output format changed: " + this.f99744a, new Object[0]);
                return null;
            }
            if (iDequeueOutputBuffer < 0) {
                Log.e(this.f99746c, "unexpected result from dequeueOutputBuffer: ".concat(String.valueOf(iDequeueOutputBuffer)), new Object[0]);
                return null;
            }
            ByteBuffer outputBuffer = LiteavSystemInfo.getSystemOSVersionInt() >= 21 ? this.f99748e.getOutputBuffer(iDequeueOutputBuffer) : this.f99748e.getOutputBuffers()[iDequeueOutputBuffer];
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.f99749f.size);
            byteBufferAllocateDirect.put(outputBuffer);
            this.f99748e.releaseOutputBuffer(iDequeueOutputBuffer, false);
            int i10 = this.f99745b;
            if (i10 > 0) {
                this.f99745b = i10 - 1;
            }
            return byteBufferAllocateDirect;
        } catch (Exception e10) {
            Log.e(this.f99746c, "dequeueOutputBuffer failed. ".concat(String.valueOf(e10)), new Object[0]);
            return null;
        }
    }

    public final void a() {
        MediaCodec mediaCodec = this.f99748e;
        if (mediaCodec == null) {
            return;
        }
        try {
            mediaCodec.stop();
        } catch (Exception e10) {
            Log.e(this.f99746c, "codec stop failed.".concat(String.valueOf(e10)), new Object[0]);
        }
        try {
            this.f99748e.release();
        } catch (Exception e11) {
            Log.e(this.f99746c, "codec release failed.".concat(String.valueOf(e11)), new Object[0]);
        }
        this.f99748e = null;
        this.f99745b = 0;
    }

    public final boolean a(MediaFormat mediaFormat) {
        if (this.f99748e == null && mediaFormat != null) {
            try {
                boolean z10 = this.f99747d == a.f99750a;
                if (z10) {
                    this.f99748e = MediaCodec.createEncoderByType(y.A);
                } else {
                    this.f99748e = MediaCodec.createDecoderByType(y.A);
                }
                this.f99748e.configure(mediaFormat, (Surface) null, (MediaCrypto) null, z10 ? 1 : 0);
                this.f99748e.start();
                return true;
            } catch (IOException e10) {
                Log.e(this.f99746c, "create codec failed. ".concat(String.valueOf(e10)), new Object[0]);
                a();
            }
        }
        return false;
    }

    public ByteBuffer processFrame(ByteBuffer byteBuffer) {
        MediaCodec mediaCodec = this.f99748e;
        if (mediaCodec != null && byteBuffer != null) {
            try {
                ByteBuffer[] inputBuffers = mediaCodec.getInputBuffers();
                if (inputBuffers == null || inputBuffers.length <= 0) {
                    Log.e(this.f99746c, "get invalid input buffers.", new Object[0]);
                } else {
                    int iDequeueInputBuffer = this.f99748e.dequeueInputBuffer(TimeUnit.MILLISECONDS.toMicros(5L));
                    if (iDequeueInputBuffer >= 0) {
                        int iRemaining = byteBuffer.remaining();
                        inputBuffers[iDequeueInputBuffer].put(byteBuffer);
                        this.f99748e.queueInputBuffer(iDequeueInputBuffer, 0, iRemaining, 0L, 0);
                        this.f99745b++;
                    }
                }
            } catch (Exception e10) {
                Log.e(this.f99746c, "feedData failed. ".concat(String.valueOf(e10)), new Object[0]);
            }
            for (int i10 = 0; i10 < 3; i10++) {
                ByteBuffer byteBufferB = b();
                if (byteBufferB != null) {
                    return byteBufferB;
                }
            }
        }
        return null;
    }
}
