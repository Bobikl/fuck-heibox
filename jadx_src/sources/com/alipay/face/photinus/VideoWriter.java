package com.alipay.face.photinus;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.net.Uri;
import android.util.Log;
import android.view.Surface;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class VideoWriter {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f38863o = "ZOLOZ";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final boolean f38864p = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f38865q = "video/avc";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f38866r = 30;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f38867s = 10;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f38868t = 3000000;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final float f38869u = 0.25f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MediaCodec f38871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MediaMuxer f38872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f38873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f38874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f38875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f38876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f38877h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f38878i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private c f38881l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private File f38870a = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f38879j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f38880k = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList<d> f38883n = new ArrayList<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Thread f38882m = new Thread(new a(this));

    public enum RequestType {
        rStartNewMovie,
        rAddMovieFrame,
        rCloseMoveFile
    }

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VideoWriter f38884b;

        a(VideoWriter videoWriter) {
            this.f38884b = videoWriter;
        }

        @Override // java.lang.Runnable
        public void run() {
            Log.d(VideoWriter.f38863o, "Started request thread");
            while (VideoWriter.this.f38879j) {
                d dVarE = VideoWriter.this.E();
                if (dVarE == null) {
                    try {
                        Thread.sleep(10L);
                    } catch (Exception unused) {
                    }
                } else {
                    int i10 = b.f38886a[dVarE.f38887a.ordinal()];
                    if (i10 == 1) {
                        VideoWriter.this.f38877h = System.currentTimeMillis();
                        VideoWriter.this.f38870a = new File(dVarE.f38888b.getPath());
                        VideoWriter.this.y();
                        VideoWriter.this.f38878i = 0;
                    } else if (i10 == 2) {
                        try {
                            com.alipay.face.photinus.c cVar = dVarE.f38889c;
                            cVar.f38897a = VideoWriter.H(cVar.f38897a, VideoWriter.this.f38875f, VideoWriter.this.f38876g);
                            VideoWriter videoWriter = VideoWriter.this;
                            videoWriter.A(videoWriter.f38878i, dVarE.f38889c);
                            VideoWriter.n(VideoWriter.this);
                            Log.d(VideoWriter.f38863o, "VideoWriter encoded frame " + VideoWriter.this.f38878i);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    } else if (i10 != 3) {
                        continue;
                    } else {
                        try {
                            VideoWriter videoWriter2 = VideoWriter.this;
                            videoWriter2.A(videoWriter2.f38878i, null);
                            if (VideoWriter.this.f38871b != null) {
                                VideoWriter.this.f38871b.stop();
                                VideoWriter.this.f38871b.release();
                                VideoWriter.this.f38871b = null;
                            }
                            if (VideoWriter.this.f38872c != null) {
                                VideoWriter.this.f38872c.stop();
                                VideoWriter.this.f38872c.release();
                                VideoWriter.this.f38872c = null;
                                VideoWriter.this.f38874e = false;
                            }
                            if (VideoWriter.this.f38881l != null) {
                                VideoWriter.this.f38881l.a(this.f38884b);
                            }
                            Log.d(VideoWriter.f38863o, "rCloseMoveFile, took " + (System.currentTimeMillis() - VideoWriter.this.f38877h) + "ms");
                        } catch (Throwable th2) {
                            try {
                                th2.printStackTrace();
                            } catch (Throwable th3) {
                                VideoWriter.this.f38879j = false;
                                throw th3;
                            }
                        }
                        VideoWriter.this.f38879j = false;
                    }
                }
            }
            Log.d(VideoWriter.f38863o, "Finished request thread");
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f38886a;

        static {
            int[] iArr = new int[RequestType.values().length];
            f38886a = iArr;
            try {
                iArr[RequestType.rStartNewMovie.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38886a[RequestType.rAddMovieFrame.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38886a[RequestType.rCloseMoveFile.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public interface c {
        void a(VideoWriter videoWriter);
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        RequestType f38887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Uri f38888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        com.alipay.face.photinus.c f38889c;

        d() {
            this.f38887a = RequestType.rCloseMoveFile;
        }

        d(Uri uri) {
            this.f38888b = uri;
            this.f38887a = RequestType.rStartNewMovie;
        }

        d(com.alipay.face.photinus.c cVar) {
            this.f38889c = cVar;
            this.f38887a = RequestType.rAddMovieFrame;
        }
    }

    VideoWriter(c cVar) {
        this.f38881l = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(int i10, com.alipay.face.photinus.c cVar) {
        ByteBuffer[] inputBuffers = this.f38871b.getInputBuffers();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int iDequeueInputBuffer = this.f38871b.dequeueInputBuffer(10000L);
        if (iDequeueInputBuffer < 0) {
            Log.i(f38863o, "input buffer not available");
            return;
        }
        long jX = x(i10);
        if (cVar == null) {
            this.f38871b.queueInputBuffer(iDequeueInputBuffer, 0, 0, jX, 4);
            z(true, bufferInfo);
            return;
        }
        byte[] bArr = cVar.f38897a;
        ByteBuffer byteBuffer = inputBuffers[iDequeueInputBuffer];
        byteBuffer.clear();
        byteBuffer.put(bArr);
        this.f38871b.queueInputBuffer(iDequeueInputBuffer, 0, bArr.length, jX, 0);
        z(false, bufferInfo);
    }

    private static boolean B(int i10) {
        if (i10 == 39 || i10 == 2130706688) {
            return true;
        }
        switch (i10) {
            case 19:
            case 20:
            case 21:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d E() {
        synchronized (this.f38883n) {
            if (this.f38883n.isEmpty()) {
                return null;
            }
            return this.f38883n.remove(0);
        }
    }

    private void F(d dVar) {
        synchronized (this.f38883n) {
            if (this.f38880k) {
                if (dVar.f38887a == RequestType.rCloseMoveFile) {
                    this.f38880k = false;
                }
                this.f38883n.add(dVar);
            }
        }
    }

    private static byte[] G(byte[] bArr, int i10, int i11) {
        int i12 = i10 * i11;
        int i13 = (i12 * 3) / 2;
        byte[] bArr2 = new byte[i13];
        int i14 = 0;
        for (int i15 = i12 - 1; i15 >= 0; i15--) {
            bArr2[i14] = bArr[i15];
            i14++;
        }
        for (int i16 = i13 - 1; i16 >= i12; i16 -= 2) {
            int i17 = i14 + 1;
            bArr2[i14] = bArr[i16];
            i14 = i17 + 1;
            bArr2[i17] = bArr[i16 - 1];
        }
        return bArr2;
    }

    public static byte[] H(byte[] bArr, int i10, int i11) {
        int i12;
        int i13 = i10 * i11;
        int i14 = (i13 * 3) / 2;
        byte[] bArr2 = new byte[i14];
        if (i10 == 0 && i11 == 0) {
            i13 = 0;
            i12 = 0;
        } else {
            i12 = i11 >> 1;
        }
        int i15 = 0;
        for (int i16 = 0; i16 < i10; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                bArr2[i15] = bArr[i17 + i16];
                i15++;
                i17 += i10;
            }
        }
        for (int i19 = 0; i19 < i10; i19 += 2) {
            int i20 = i13;
            for (int i21 = 0; i21 < i12; i21++) {
                int i22 = i20 + i19;
                if (i22 >= i14 - 2) {
                    break;
                }
                bArr2[i15] = bArr[i22];
                bArr2[i15 + 1] = bArr[i22 + 1];
                i15 += 2;
                i20 += i10;
            }
        }
        return G(bArr2, i10, i11);
    }

    private static MediaCodecInfo I(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i10 = 0; i10 < codecCount; i10++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        return codecInfoAt;
                    }
                }
            }
        }
        return null;
    }

    private static int J(MediaCodecInfo mediaCodecInfo, String str) {
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
        int i10 = 0;
        while (true) {
            int[] iArr = capabilitiesForType.colorFormats;
            if (i10 >= iArr.length) {
                return 0;
            }
            int i11 = iArr[i10];
            if (B(i11)) {
                return i11;
            }
            i10++;
        }
    }

    static /* synthetic */ int n(VideoWriter videoWriter) {
        int i10 = videoWriter.f38878i;
        videoWriter.f38878i = i10 + 1;
        return i10;
    }

    private int u(int i10) {
        int i11 = (int) (i10 * f38869u * this.f38876g * this.f38875f);
        Log.i(f38863o, String.format("bitrate=%5.2f[Mbps]", Float.valueOf((i11 / 1024.0f) / 1024.0f)));
        return i11;
    }

    private static String w(int i10) {
        if (i10 == 39) {
            return "COLOR_FormatYUV420PackedSemiPlanar";
        }
        if (i10 == 2130706688) {
            return "COLOR_TI_FormatYUV420PackedSemiPlanar";
        }
        switch (i10) {
            case 19:
                return "COLOR_FormatYUV420Planar";
            case 20:
                return "COLOR_FormatYUV420PackedPlanar";
            case 21:
                return "COLOR_FormatYUV420SemiPlanar";
            default:
                return "Unknown color format";
        }
    }

    public static long x(int i10) {
        return ((i10 * 1000000) / 30) + 132;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        try {
            MediaCodecInfo mediaCodecInfoI = I("video/avc");
            if (mediaCodecInfoI == null) {
                Log.e(f38863o, "Unable to find an appropriate codec for video/avc");
                return;
            }
            Log.d(f38863o, "found codec: " + mediaCodecInfoI.getName());
            Log.d(f38863o, "found colorFormat: " + w(21));
            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", this.f38876g, this.f38875f);
            mediaFormatCreateVideoFormat.setInteger("color-format", 21);
            mediaFormatCreateVideoFormat.setInteger("bitrate", f38868t);
            mediaFormatCreateVideoFormat.setInteger("frame-rate", 30);
            mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 10);
            Log.d(f38863o, "format: " + mediaFormatCreateVideoFormat);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(mediaCodecInfoI.getName());
            this.f38871b = mediaCodecCreateByCodecName;
            mediaCodecCreateByCodecName.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            this.f38871b.start();
            this.f38872c = new MediaMuxer(this.f38870a.getAbsolutePath(), 0);
        } catch (Throwable th2) {
            th2.printStackTrace();
            this.f38879j = false;
            this.f38880k = false;
            this.f38883n.clear();
        }
    }

    private void z(boolean z10, MediaCodec.BufferInfo bufferInfo) {
        if (z10) {
            try {
                this.f38871b.signalEndOfInputStream();
            } catch (Exception unused) {
            }
        }
        ByteBuffer[] outputBuffers = this.f38871b.getOutputBuffers();
        while (true) {
            int iDequeueOutputBuffer = this.f38871b.dequeueOutputBuffer(bufferInfo, 10000L);
            if (iDequeueOutputBuffer == -1) {
                if (!z10) {
                    return;
                } else {
                    Log.i(f38863o, "no output available, spinning to await EOS");
                }
            } else if (iDequeueOutputBuffer == -3) {
                outputBuffers = this.f38871b.getOutputBuffers();
            } else if (iDequeueOutputBuffer == -2) {
                if (this.f38874e) {
                    throw new RuntimeException("format changed twice");
                }
                MediaFormat outputFormat = this.f38871b.getOutputFormat();
                Log.i(f38863o, "encoder output format changed: " + outputFormat);
                this.f38873d = this.f38872c.addTrack(outputFormat);
                this.f38872c.start();
                this.f38874e = true;
            } else if (iDequeueOutputBuffer < 0) {
                Log.i(f38863o, "unexpected result from encoder.dequeueOutputBuffer: " + iDequeueOutputBuffer);
            } else {
                ByteBuffer byteBuffer = outputBuffers[iDequeueOutputBuffer];
                if (byteBuffer == null) {
                    throw new RuntimeException("encoderOutputBuffer " + iDequeueOutputBuffer + " was null");
                }
                if ((bufferInfo.flags & 2) != 0) {
                    Log.d(f38863o, "ignoring BUFFER_FLAG_CODEC_CONFIG");
                    bufferInfo.size = 0;
                }
                if (bufferInfo.size != 0) {
                    if (!this.f38874e) {
                        throw new RuntimeException("muxer hasn't started");
                    }
                    byteBuffer.position(bufferInfo.offset);
                    byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    Log.d(f38863o, "BufferInfo: " + bufferInfo.offset + Constants.ACCEPT_TIME_SEPARATOR_SP + bufferInfo.size + Constants.ACCEPT_TIME_SEPARATOR_SP + bufferInfo.presentationTimeUs);
                    try {
                        this.f38872c.writeSampleData(this.f38873d, byteBuffer, bufferInfo);
                    } catch (Exception unused2) {
                        Log.i(f38863o, "Too many frames");
                    }
                }
                this.f38871b.releaseOutputBuffer(iDequeueOutputBuffer, false);
                if ((bufferInfo.flags & 4) != 0) {
                    if (z10) {
                        Log.i(f38863o, "end of stream reached");
                        return;
                    } else {
                        Log.i(f38863o, "reached end of stream unexpectedly");
                        return;
                    }
                }
            }
        }
    }

    boolean C() {
        return this.f38879j;
    }

    void D(Uri uri, int i10, int i11) {
        if (this.f38879j) {
            return;
        }
        this.f38879j = true;
        this.f38880k = true;
        this.f38875f = i10;
        this.f38876g = i11;
        F(new d(uri));
        this.f38882m.start();
    }

    void t(com.alipay.face.photinus.c cVar) {
        F(new d(cVar));
    }

    void v() {
        F(new d());
    }
}
