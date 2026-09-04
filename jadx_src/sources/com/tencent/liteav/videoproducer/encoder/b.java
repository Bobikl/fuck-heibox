package com.tencent.liteav.videoproducer.encoder;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Surface;
import com.tencent.liteav.base.storage.PersistStorage;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.x;
import com.tencent.liteav.videobase.common.CodecType;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.videobase.f;
import com.tencent.liteav.videoconsumer.decoder.SpsInfo;
import com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig;
import com.tencent.ugc.videobase.base.VideoPersistStorageKey;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f100829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f100830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CustomHandler f100831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MediaCodec f100832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e.a f100833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public VideoEncodeParams f100834f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.tencent.liteav.videobase.videobase.c f100840l;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private ServerVideoProducerConfig f100853y;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte[] f100842n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f100843o = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f100835g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x f100836h = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f100844p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f100845q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f100846r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f100847s = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Deque<Long> f100837i = new LinkedList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f100848t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f100849u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f100850v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f100851w = Long.MIN_VALUE;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f100852x = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private double f100854z = 0.0d;
    private long A = 0;
    private long B = 0;
    private long C = 0;
    private long D = 0;
    private long E = 0;
    private final Deque<Long> F = new LinkedList();
    private int G = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicLong f100838j = new AtomicLong(0);
    private final List<Long> H = new ArrayList();
    private final AtomicLong I = new AtomicLong(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Runnable f100839k = c.a(this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.tencent.liteav.videoproducer.producer.a.EnumC0968a f100841m = com.tencent.liteav.videoproducer.producer.a.EnumC0968a.STREAM_TYPE_BIG_VIDEO;

    public b(Bundle bundle, com.tencent.liteav.videobase.videobase.c cVar, String str) {
        this.f100840l = cVar;
        this.f100830b = bundle;
        this.f100829a = str + "SurfaceInputVideoEncoder_" + hashCode();
    }

    private void a(MediaCodec mediaCodec) {
        if (mediaCodec == null) {
            return;
        }
        try {
            mediaCodec.stop();
        } catch (Throwable th2) {
            LiteavLog.e(this.f100829a, "destroy mediaCodec stop failed.", th2);
        }
        try {
            mediaCodec.release();
        } catch (Throwable th3) {
            LiteavLog.e(this.f100829a, "destroy mediaCodec release failed.", th3);
        }
        LiteavLog.i(this.f100829a, "destroy mediaCodec");
    }

    private void a(String str) {
        LiteavLog.e(this.f100829a, "notifyEncodeError message = ".concat(String.valueOf(str)));
        e.a aVar = this.f100833e;
        if (aVar != null) {
            aVar.onEncodedFail(com.tencent.liteav.videobase.videobase.e.a.ERR_VIDEO_ENCODE_FAIL);
        }
    }

    private boolean a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            return false;
        }
        try {
            LiteavLog.i(this.f100829a, "configure format: %s", mediaFormat);
            mediaCodec.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            return true;
        } catch (Throwable th2) {
            LiteavLog.e(this.f100829a, "configure failed.", th2);
            return false;
        }
    }

    private static byte[] a(byte[] bArr) {
        byte[] bArrA;
        if (bArr.length > 5 && bArr[0] == 0 && bArr[1] == 0 && bArr[2] == 0 && bArr[3] == 0 && bArr[4] == 0 && bArr[5] == 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 3;
                if (i11 >= bArr.length) {
                    i10 = 0;
                    break;
                }
                byte b10 = bArr[i10];
                if ((b10 == 0 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 0 && bArr[i11] == 1) || (b10 == 0 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 1)) {
                    break;
                }
                i10++;
            }
            if (i10 == 0 || (bArrA = com.tencent.liteav.videobase.utils.d.a(bArr.length - i10)) == null) {
                return bArr;
            }
            System.arraycopy(bArr, i10, bArrA, 0, bArrA.length);
            return bArrA;
        }
        return bArr;
    }

    private MediaCodec b(String str) throws Throwable {
        String name;
        MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(str);
        try {
            name = mediaCodecCreateEncoderByType.getName();
        } catch (Throwable th2) {
            LiteavLog.e(this.f100829a, "mediaCodec getName failed.", th2);
            name = null;
        }
        LiteavLog.i(this.f100829a, "codecName=".concat(String.valueOf(name)));
        if (name == null || !name.equals("OMX.google.h264.encoder")) {
            return mediaCodecCreateEncoderByType;
        }
        LiteavLog.w(this.f100829a, "will be destroyed codecName=".concat(name));
        a(mediaCodecCreateEncoderByType);
        throw new IOException("this is a Google H264 soft encoder. cancel use MediaCodec.");
    }

    private static byte[] b(byte[] bArr) {
        int i10;
        int length = bArr.length;
        ArrayList<int[]> arrayList = new ArrayList(20);
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 <= length) {
            int i14 = i11 + 2;
            if (i14 < length && bArr[i11] == 0 && bArr[i11 + 1] == 0 && bArr[i14] == 1) {
                i10 = 3;
            } else {
                int i15 = i11 + 3;
                i10 = (i15 < length && bArr[i11] == 0 && bArr[i11 + 1] == 0 && bArr[i14] == 0 && bArr[i15] == 1) ? 4 : 1;
            }
            if (i10 == 3 || i10 == 4 || i11 == length) {
                if (i13 != i11) {
                    arrayList.add(new int[]{i13, i11});
                    i12 += i11 - i13;
                }
                i13 = i11 + i10;
            }
            i11 += i10;
        }
        byte[] bArrA = com.tencent.liteav.videobase.utils.d.a(i12 + (arrayList.size() * 4));
        if (bArrA == null) {
            return bArr;
        }
        int i16 = 0;
        for (int[] iArr : arrayList) {
            int i17 = iArr[1] - iArr[0];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(new byte[4]).order(ByteOrder.BIG_ENDIAN);
            byteBufferOrder.putInt(i17);
            System.arraycopy(byteBufferOrder.array(), 0, bArrA, i16, 4);
            int i18 = i16 + 4;
            System.arraycopy(bArr, iArr[0], bArrA, i18, i17);
            i16 = i18 + i17;
        }
        return bArrA;
    }

    private void e() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime <= this.A + TimeUnit.SECONDS.toMillis(2L)) {
            this.B++;
            return;
        }
        this.f100854z = (this.B * 1000.0d) / (jElapsedRealtime - this.A);
        this.B = 1L;
        this.A = jElapsedRealtime;
        long j10 = -1;
        Iterator<Long> it = this.H.iterator();
        while (it.hasNext()) {
            long jLongValue = it.next().longValue();
            if (j10 < jLongValue) {
                j10 = jLongValue;
            }
        }
        this.I.set(j10);
        this.H.clear();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c9 A[PHI: r3
  0x00c9: PHI (r3v18 android.media.MediaFormat) = (r3v17 android.media.MediaFormat), (r3v22 android.media.MediaFormat) binds: [B:35:0x00bb, B:37:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    public final Surface a(VideoEncodeParams videoEncodeParams) {
        ServerVideoProducerConfig serverVideoProducerConfig;
        MediaCodec mediaCodecB;
        Surface surfaceCreateInputSurface;
        boolean z10;
        int integer;
        this.f100835g = SystemClock.elapsedRealtime();
        this.f100851w = Long.MIN_VALUE;
        if (videoEncodeParams.bitrate == 0) {
            int i10 = videoEncodeParams.width;
            int i11 = videoEncodeParams.height;
            videoEncodeParams.bitrate = (int) (Math.sqrt((i10 * i10) + (i11 * i11)) * 1.2d);
        }
        VideoEncodeParams videoEncodeParams2 = new VideoEncodeParams(videoEncodeParams);
        this.f100834f = videoEncodeParams2;
        this.f100844p = videoEncodeParams2.baseFrameIndex;
        this.f100845q = videoEncodeParams2.baseGopIndex;
        this.f100846r = 0L;
        String str = videoEncodeParams2.codecType == CodecType.H265 ? "video/hevc" : "video/avc";
        VideoEncoderDef.EncoderProfile encoderProfile = videoEncodeParams2.encoderProfile;
        VideoEncoderDef.EncoderProfile encoderProfile2 = VideoEncoderDef.EncoderProfile.PROFILE_MAIN;
        if (encoderProfile == encoderProfile2) {
            videoEncodeParams2.encoderProfile = VideoEncoderDef.EncoderProfile.PROFILE_HIGH;
        }
        VideoEncoderDef.EncoderProfile encoderProfile3 = videoEncodeParams2.encoderProfile;
        VideoEncoderDef.EncoderProfile encoderProfile4 = VideoEncoderDef.EncoderProfile.PROFILE_HIGH;
        if ((encoderProfile3 == encoderProfile4 || encoderProfile3 == encoderProfile2) && (serverVideoProducerConfig = this.f100853y) != null && !serverVideoProducerConfig.isHardwareEncoderHighProfileAllowed()) {
            this.f100834f.encoderProfile = VideoEncoderDef.EncoderProfile.PROFILE_BASELINE;
        }
        VideoEncodeParams videoEncodeParams3 = this.f100834f;
        VideoEncoderDef.EncoderProfile encoderProfile5 = videoEncodeParams3.encoderProfile;
        if ((encoderProfile5 == encoderProfile4 || encoderProfile5 == encoderProfile2) && !videoEncodeParams3.enableBFrame) {
            Integer num = new PersistStorage(PersistStorage.GLOBAL_DOMAIN).getInt(VideoPersistStorageKey.CONFIG_KEY_LOCAL_RTC_ENCODE_HIGH_PROFILE);
            LiteavLog.i(this.f100829a, "enable high profile from persist storage:".concat(String.valueOf(num)));
            if (num != null && num.intValue() == 0) {
                this.f100834f.encoderProfile = VideoEncoderDef.EncoderProfile.PROFILE_BASELINE;
            }
        }
        try {
            mediaCodecB = b(str);
            try {
                a aVar = new a(mediaCodecB, str, this.f100834f, this.f100853y.isHardwareEncoderBitrateModeCBRSupported());
                aVar.f100821a = true;
                MediaFormat mediaFormatA = aVar.a();
                if (!a(mediaCodecB, mediaFormatA)) {
                    aVar.f100822b = false;
                    mediaFormatA = aVar.a();
                    z10 = a(mediaCodecB, mediaFormatA);
                }
                if (!z10) {
                    throw new IOException("configure encoder failed.");
                }
                surfaceCreateInputSurface = mediaCodecB.createInputSurface();
                try {
                    mediaCodecB.start();
                    try {
                        this.f100834f.width = mediaFormatA.getInteger("width");
                        this.f100834f.height = mediaFormatA.getInteger("height");
                        this.f100834f.bitrate = mediaFormatA.getInteger("bitrate") / 1024;
                        int i12 = this.f100834f.bitrate;
                        if (LiteavSystemInfo.getSystemOSVersionInt() > 30) {
                            LiteavLog.i(this.f100829a, "resetBitrateAfterApiLevel30,bitrate=".concat(String.valueOf(i12)));
                            a(mediaCodecB, i12);
                        }
                        if (this.f100833e != null) {
                            VideoEncoderDef.BitrateMode bitrateMode = VideoEncoderDef.BitrateMode.UNKNOWN;
                            if (LiteavSystemInfo.getSystemOSVersionInt() >= 21 && (integer = mediaFormatA.getInteger("bitrate-mode", -1)) != -1) {
                                if (integer == 0) {
                                    bitrateMode = VideoEncoderDef.BitrateMode.CQ;
                                } else if (integer == 1) {
                                    bitrateMode = VideoEncoderDef.BitrateMode.VBR;
                                } else if (integer == 2) {
                                    bitrateMode = VideoEncoderDef.BitrateMode.CBR;
                                }
                            }
                            this.f100833e.onBitrateModeUpdated(bitrateMode);
                        }
                    } catch (Throwable th2) {
                        LiteavLog.e(this.f100829a, "MediaFormat get key fail", th2);
                    }
                    LiteavLog.i(this.f100829a, "start MediaCodec with format: ".concat(String.valueOf(mediaFormatA)));
                    this.f100832d = mediaCodecB;
                    return surfaceCreateInputSurface;
                } catch (Throwable th3) {
                    th = th3;
                    if (surfaceCreateInputSurface != null) {
                        surfaceCreateInputSurface.release();
                    }
                    a(mediaCodecB);
                    com.tencent.liteav.videobase.videobase.e.c cVar = com.tencent.liteav.videobase.videobase.e.c.WARNING_VIDEO_ENCODE_START_FAILED;
                    String str2 = "Start encoder failed:" + th.getMessage();
                    if (LiteavSystemInfo.getSystemOSVersionInt() >= 23 && (th instanceof MediaCodec.CodecException) && th.getErrorCode() == 1100) {
                        cVar = com.tencent.liteav.videobase.videobase.e.c.WARNING_VIDEO_ENCODE_START_FAILED_INSUFFICIENT_RESOURCE;
                        str2 = "Insufficient resource, Start encoder failed:" + th.getMessage();
                    }
                    this.f100840l.updateStatus(f.STATUS_VIDEO_HW_ENCODE_START_ERROR_TYPE, this.f100841m.mValue, Integer.valueOf(cVar.mValue));
                    this.f100840l.notifyWarning(cVar, str2);
                    LiteavLog.e(this.f100829a, "Start MediaCodec failed,encode params:" + this.f100834f, th);
                    return null;
                }
            } catch (Throwable th4) {
                th = th4;
                surfaceCreateInputSurface = null;
            }
        } catch (Throwable th5) {
            th = th5;
            mediaCodecB = null;
            surfaceCreateInputSurface = null;
        }
    }

    public final void a() {
        this.f100831c.removeMessages(10);
        a(this.f100832d);
        this.f100832d = null;
    }

    public final void a(int i10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i11 = 1; i11 <= 3; i11++) {
            this.F.addLast(Long.valueOf(((long) (i11 * 2000)) + jElapsedRealtime));
        }
        this.G = i10;
    }

    public final void a(MediaCodec mediaCodec, int i10) {
        if (mediaCodec == null || LiteavSystemInfo.getSystemOSVersionInt() < 19) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", i10 * 1024);
            mediaCodec.setParameters(bundle);
        } catch (Throwable th2) {
            LiteavLog.e(this.f100829a, "updateBitrateToMediaCodec failed.", th2);
        }
    }

    public final void a(ServerVideoProducerConfig serverVideoProducerConfig) {
        this.f100853y = serverVideoProducerConfig;
        LiteavLog.i(this.f100829a, "Set serverConfig: " + this.f100853y);
    }

    public final void b() {
        if (this.f100836h != null) {
            LiteavLog.i(this.f100829a, "stopEosTimer");
            this.f100836h.a();
            this.f100836h = null;
        }
    }

    public final void c() {
        int i10;
        byte[] bArrA;
        boolean z10;
        Long lPeekFirst;
        if (this.f100832d == null) {
            return;
        }
        while (true) {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            try {
                int iDequeueOutputBuffer = this.f100832d.dequeueOutputBuffer(bufferInfo, 0L);
                if (iDequeueOutputBuffer == -1) {
                    break;
                }
                if (iDequeueOutputBuffer == -3) {
                    LiteavLog.i(this.f100829a, "encoder output buffers changed");
                } else if (iDequeueOutputBuffer == -2) {
                    try {
                        MediaFormat outputFormat = this.f100832d.getOutputFormat();
                        e.a aVar = this.f100833e;
                        if (aVar != null) {
                            aVar.onOutputFormatChanged(outputFormat);
                        }
                        LiteavLog.i(this.f100829a, "encoder output format changed: %s", outputFormat);
                    } catch (Throwable th2) {
                        a("getOutputFormat failed." + th2.getMessage());
                    }
                } else {
                    if (iDequeueOutputBuffer < 0) {
                        a("dequeueOutputBuffer return ".concat(String.valueOf(iDequeueOutputBuffer)));
                        break;
                    }
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    this.H.add(Long.valueOf(jElapsedRealtime - this.f100838j.getAndSet(jElapsedRealtime)));
                    try {
                        ByteBuffer outputBuffer = LiteavSystemInfo.getSystemOSVersionInt() >= 21 ? this.f100832d.getOutputBuffer(iDequeueOutputBuffer) : this.f100832d.getOutputBuffers()[iDequeueOutputBuffer];
                        if (outputBuffer == null || ((i10 = bufferInfo.size) == 0 && (bufferInfo.flags & 4) == 0)) {
                            a("size is zero, but it isn't end of stream");
                        } else {
                            byte[] bArrA2 = com.tencent.liteav.videobase.utils.d.a(i10);
                            if (bArrA2 == null) {
                                bArrA = null;
                            } else {
                                outputBuffer.position(bufferInfo.offset);
                                outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                                outputBuffer.get(bArrA2);
                                bArrA = a(bArrA2);
                                VideoEncodeParams videoEncodeParams = this.f100834f;
                                if (videoEncodeParams != null && !videoEncodeParams.annexb) {
                                    bArrA = b(bArrA);
                                }
                            }
                            if (bArrA == null) {
                                a("modifyEncodedData return null byte array");
                            } else {
                                int i11 = bufferInfo.flags;
                                boolean z11 = (i11 & 2) > 0;
                                boolean z12 = (i11 & 1) > 0;
                                if (z11 && z12) {
                                    VideoEncodeParams videoEncodeParams2 = this.f100834f;
                                    this.f100842n = SpsInfo.nativeGetSpsPps(bArrA, videoEncodeParams2 == null || videoEncodeParams2.codecType == CodecType.H264, videoEncodeParams2 == null || videoEncodeParams2.annexb);
                                } else if (z11) {
                                    this.f100842n = (byte[]) bArrA.clone();
                                } else if (this.f100843o && z12) {
                                    byte[] bArr = this.f100842n;
                                    if (bArr != null) {
                                        byte[] bArrA3 = com.tencent.liteav.videobase.utils.d.a(bArr.length + bArrA.length);
                                        if (bArrA3 != null) {
                                            byte[] bArr2 = this.f100842n;
                                            System.arraycopy(bArr2, 0, bArrA3, 0, bArr2.length);
                                            System.arraycopy(bArrA, 0, bArrA3, this.f100842n.length, bArrA.length);
                                            bArrA = bArrA3;
                                        } else {
                                            a("add spspps for I frame, allocate buffer failed.");
                                        }
                                    } else {
                                        a("mSpsPps is null.");
                                    }
                                }
                                boolean z13 = (bufferInfo.flags & 1) > 0;
                                if (z13) {
                                    this.f100847s = -1;
                                }
                                VideoEncodeParams videoEncodeParams3 = this.f100834f;
                                if (videoEncodeParams3 != null && !videoEncodeParams3.fullIFrame) {
                                    int i12 = this.f100847s + 1;
                                    this.f100847s = i12;
                                    if (i12 == videoEncodeParams3.fps * videoEncodeParams3.gop) {
                                        d();
                                    }
                                }
                                long length = bArrA.length;
                                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                                if (z13) {
                                    long j10 = this.D;
                                    if (jElapsedRealtime2 > j10 + 1000) {
                                        this.C = (long) (((this.E * 8000.0d) / (jElapsedRealtime2 - j10)) / 1024.0d);
                                        this.E = 0L;
                                        this.D = jElapsedRealtime2;
                                        if (!this.F.isEmpty()) {
                                            int i13 = this.f100834f.fps;
                                            if (((float) (((double) i13) - this.f100854z)) <= Math.max(i13 / 2.0f, 5.0f) && (lPeekFirst = this.F.peekFirst()) != null && SystemClock.elapsedRealtime() > lPeekFirst.longValue()) {
                                                this.F.removeFirst();
                                                if (((long) this.G) - this.C > Math.max(this.f100834f.bitrate / 2, 100)) {
                                                    LiteavLog.w(this.f100829a, "restart hardware encoder because real bitrate is too low.expectBitrate: " + this.G + ", realBitrate=" + this.C);
                                                    this.f100830b.putBoolean("need_restart_when_down_bitrate", true);
                                                    this.f100839k.run();
                                                    this.F.clear();
                                                }
                                            }
                                        }
                                    }
                                }
                                this.E += length;
                                e();
                                if (z13) {
                                    this.f100845q++;
                                    this.f100846r = 0L;
                                } else {
                                    this.f100846r++;
                                }
                                this.f100844p++;
                                Long lPollFirst = this.f100837i.pollFirst();
                                long jLongValue = lPollFirst == null ? 0L : lPollFirst.longValue();
                                long millis = TimeUnit.MICROSECONDS.toMillis(bufferInfo.presentationTimeUs);
                                if (this.f100848t == 0) {
                                    this.f100848t = jLongValue;
                                }
                                if (this.f100849u == 0) {
                                    this.f100849u = millis;
                                }
                                long j11 = millis + (this.f100848t - this.f100849u);
                                long j12 = this.f100850v;
                                if (jLongValue <= j12) {
                                    jLongValue = j12 + 1;
                                }
                                if (jLongValue > j11) {
                                    jLongValue = j11;
                                }
                                this.f100850v = jLongValue;
                                EncodedVideoFrame encodedVideoFrame = new EncodedVideoFrame();
                                VideoEncodeParams videoEncodeParams4 = this.f100834f;
                                if (videoEncodeParams4 == null || !videoEncodeParams4.isEnablesUnlimitedGop()) {
                                    encodedVideoFrame.nalType = z13 ? com.tencent.liteav.videobase.common.c.IDR : com.tencent.liteav.videobase.common.c.P;
                                } else {
                                    encodedVideoFrame.nalType = z13 ? com.tencent.liteav.videobase.common.c.IDR : com.tencent.liteav.videobase.common.c.P_MULTI_REF;
                                }
                                ByteBuffer byteBufferB = com.tencent.liteav.videobase.utils.d.b(bArrA.length);
                                encodedVideoFrame.data = byteBufferB;
                                if (byteBufferB == null) {
                                    a("allocate direct buffer for nal failed");
                                } else {
                                    byteBufferB.put(bArrA);
                                    encodedVideoFrame.data.rewind();
                                    encodedVideoFrame.dts = jLongValue;
                                    encodedVideoFrame.pts = j11;
                                    encodedVideoFrame.info = bufferInfo;
                                    encodedVideoFrame.gopIndex = this.f100845q;
                                    long j13 = this.f100846r;
                                    encodedVideoFrame.frameIndex = j13;
                                    encodedVideoFrame.gopFrameIndex = j13;
                                    if (!z13) {
                                        j13--;
                                    }
                                    encodedVideoFrame.refFrameIndex = j13;
                                    encodedVideoFrame.profileType = com.tencent.liteav.videobase.common.d.BASELINE;
                                    VideoEncodeParams videoEncodeParams5 = this.f100834f;
                                    encodedVideoFrame.codecType = videoEncodeParams5.codecType;
                                    encodedVideoFrame.width = videoEncodeParams5.width;
                                    encodedVideoFrame.height = videoEncodeParams5.height;
                                    if ((bufferInfo.flags & 4) > 0) {
                                        b();
                                        z10 = true;
                                    } else {
                                        boolean z14 = videoEncodeParams5.enableBFrame;
                                        if (!z14 && !this.f100852x && j11 < this.f100851w) {
                                            LiteavLog.i(this.f100829a, "has B frame,isEnablesBframe=%b,mLastPresentationTimestamp=%d,packet.pts=%d", Boolean.valueOf(z14), Long.valueOf(this.f100851w), Long.valueOf(encodedVideoFrame.pts));
                                            this.f100852x = true;
                                            PersistStorage persistStorage = new PersistStorage(PersistStorage.GLOBAL_DOMAIN);
                                            persistStorage.put(VideoPersistStorageKey.CONFIG_KEY_LOCAL_RTC_ENCODE_HIGH_PROFILE, 0);
                                            persistStorage.commit();
                                            e.a aVar2 = this.f100833e;
                                            if (aVar2 != null) {
                                                aVar2.a();
                                            }
                                        }
                                        this.f100851w = encodedVideoFrame.pts;
                                        z10 = false;
                                    }
                                    e.a aVar3 = this.f100833e;
                                    if (aVar3 != null) {
                                        aVar3.onEncodedNAL(encodedVideoFrame, z10);
                                    }
                                }
                            }
                        }
                        MediaCodec mediaCodec = this.f100832d;
                        if (mediaCodec == null) {
                            return;
                        }
                        try {
                            mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                        } catch (Throwable th3) {
                            a("releaseOutputBuffer failed." + th3.getMessage());
                        }
                    } catch (Throwable th4) {
                        a("getOutputBuffer failed." + th4.getMessage());
                    }
                }
            } catch (Throwable th5) {
                a("dequeueOutputBuffer failed." + th5.getMessage());
            }
        }
        if (this.f100837i.isEmpty()) {
            return;
        }
        int i14 = this.f100834f.fps;
        int i15 = i14 != 0 ? 500 / i14 : 10;
        if (this.f100831c.hasMessages(10)) {
            return;
        }
        this.f100831c.sendEmptyMessageDelayed(10, i15);
    }

    public final void d() {
        if (LiteavSystemInfo.getSystemOSVersionInt() < 19 || this.f100832d == null) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.f100832d.setParameters(bundle);
        } catch (Throwable th2) {
            LiteavLog.e(this.f100829a, "requestSyncFrame failed.", th2);
        }
    }
}
