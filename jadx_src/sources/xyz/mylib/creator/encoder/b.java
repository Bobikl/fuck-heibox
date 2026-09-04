package xyz.mylib.creator.encoder;

import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.util.Log;
import android.view.Surface;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: AvcEncoder.java */
/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f141433l = "MeidaCodec";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f141434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f141435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f141436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ol.b<Bitmap> f141437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ol.d f141438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MediaCodec f141439f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MediaMuxer f141441h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f141444k;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f141440g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f141442i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f141443j = false;

    public b(ol.b<Bitmap> bVar, int i10, File file, int i11, ol.d dVar) {
        this.f141434a = i10;
        this.f141435b = file;
        this.f141436c = i11;
        this.f141437d = bVar;
        this.f141438e = dVar;
    }

    private long a(long j10) {
        return ((j10 * 1000000) / ((long) this.f141434a)) + 132;
    }

    private void b(boolean z10, MediaCodec.BufferInfo bufferInfo) {
        if (z10) {
            try {
                this.f141439f.signalEndOfInputStream();
            } catch (Exception unused) {
            }
        }
        while (true) {
            int iDequeueOutputBuffer = this.f141439f.dequeueOutputBuffer(bufferInfo, 10000L);
            if (iDequeueOutputBuffer == -1) {
                if (!z10) {
                    return;
                } else {
                    Log.i(f141433l, "no output available, spinning to await EOS");
                }
            } else if (iDequeueOutputBuffer == -2) {
                if (this.f141443j) {
                    throw new RuntimeException("format changed twice");
                }
                this.f141442i = this.f141441h.addTrack(this.f141439f.getOutputFormat());
                this.f141441h.start();
                this.f141443j = true;
            } else if (iDequeueOutputBuffer < 0) {
                Log.i(f141433l, "unexpected result from encoder.dequeueOutputBuffer: " + iDequeueOutputBuffer);
            } else {
                ByteBuffer outputBuffer = this.f141439f.getOutputBuffer(iDequeueOutputBuffer);
                if (outputBuffer == null) {
                    throw new RuntimeException("encoderOutputBuffer " + iDequeueOutputBuffer + " was null");
                }
                if ((bufferInfo.flags & 2) != 0) {
                    Log.d(f141433l, "ignoring BUFFER_FLAG_CODEC_CONFIG");
                    bufferInfo.size = 0;
                }
                if (bufferInfo.size != 0) {
                    if (!this.f141443j) {
                        throw new RuntimeException("muxer hasn't started");
                    }
                    outputBuffer.position(bufferInfo.offset);
                    outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    Log.d(f141433l, "BufferInfo: " + bufferInfo.offset + Constants.ACCEPT_TIME_SEPARATOR_SP + bufferInfo.size + Constants.ACCEPT_TIME_SEPARATOR_SP + bufferInfo.presentationTimeUs);
                    try {
                        this.f141441h.writeSampleData(this.f141442i, outputBuffer, bufferInfo);
                    } catch (Exception unused2) {
                        Log.i(f141433l, "Too many frames");
                    }
                }
                this.f141439f.releaseOutputBuffer(iDequeueOutputBuffer, false);
                if ((bufferInfo.flags & 4) != 0) {
                    if (z10) {
                        Log.i(f141433l, "end of stream reached");
                        return;
                    } else {
                        Log.i(f141433l, "reached end of stream unexpectedly");
                        return;
                    }
                }
            }
        }
    }

    private void c(byte[] bArr, int[] iArr, int i10, int i11) {
        int i12 = i10 * i11;
        int i13 = (i12 / 4) + i12;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < i11; i16++) {
            int i17 = 0;
            while (i17 < i10) {
                int i18 = iArr[i14];
                int i19 = (16711680 & i18) >> 16;
                int i20 = (65280 & i18) >> 8;
                int i21 = 255;
                int i22 = (i18 & 255) >> 0;
                int i23 = (((((i19 * 66) + (i20 * 129)) + (i22 * 25)) + 128) >> 8) + 16;
                int i24 = (((((i19 * (-38)) - (i20 * 74)) + (i22 * 112)) + 128) >> 8) + 128;
                int i25 = (((((i19 * 112) - (i20 * 94)) - (i22 * 18)) + 128) >> 8) + 128;
                int i26 = i15 + 1;
                if (i23 < 0) {
                    i23 = 0;
                } else if (i23 > 255) {
                    i23 = 255;
                }
                bArr[i15] = (byte) i23;
                if (i16 % 2 == 0 && i14 % 2 == 0) {
                    int i27 = i13 + 1;
                    if (i25 < 0) {
                        i25 = 0;
                    } else if (i25 > 255) {
                        i25 = 255;
                    }
                    bArr[i13] = (byte) i25;
                    int i28 = i12 + 1;
                    if (i24 < 0) {
                        i21 = 0;
                    } else if (i24 <= 255) {
                        i21 = i24;
                    }
                    bArr[i12] = (byte) i21;
                    i12 = i28;
                    i13 = i27;
                }
                i14++;
                i17++;
                i15 = i26;
            }
        }
    }

    private void d(byte[] bArr, int[] iArr, int i10, int i11) {
        int length = bArr.length / 2;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            for (int i15 = 0; i15 < i10; i15++) {
                int i16 = iArr[i13];
                int i17 = (16711680 & i16) >> 16;
                int i18 = (65280 & i16) >> 8;
                int i19 = 255;
                int i20 = (i16 & 255) >> 0;
                int i21 = (((((i17 * 66) + (i18 * 129)) + (i20 * 25)) + 128) >> 8) + 16;
                int i22 = (((((i17 * (-38)) - (i18 * 74)) + (i20 * 112)) + 128) >> 8) + 128;
                int i23 = (((((i17 * 112) - (i18 * 94)) - (i20 * 18)) + 128) >> 8) + 128;
                int i24 = i14 % 2;
                if (i24 == 0 && i13 % 2 == 0) {
                    int i25 = i12 + 1;
                    if (i21 < 0) {
                        i21 = 0;
                    } else if (i21 > 255) {
                        i21 = 255;
                    }
                    bArr[i12] = (byte) i21;
                    int i26 = i25 + 1;
                    if (i22 < 0) {
                        i22 = 0;
                    } else if (i22 > 255) {
                        i22 = 255;
                    }
                    bArr[i26] = (byte) i22;
                    int i27 = length + 1;
                    if (i23 < 0) {
                        i19 = 0;
                    } else if (i23 <= 255) {
                        i19 = i23;
                    }
                    bArr[i27] = (byte) i19;
                    i12 = i26;
                } else if (i24 == 0 && i13 % 2 == 1) {
                    int i28 = i12 + 1;
                    if (i21 < 0) {
                        i19 = 0;
                    } else if (i21 <= 255) {
                        i19 = i21;
                    }
                    bArr[i12] = (byte) i19;
                    i12 = i28;
                } else if (i24 == 1 && i13 % 2 == 0) {
                    int i29 = length + 1;
                    if (i21 < 0) {
                        i19 = 0;
                    } else if (i21 <= 255) {
                        i19 = i21;
                    }
                    bArr[length] = (byte) i19;
                    length = i29 + 1;
                } else if (i24 == 1 && i13 % 2 == 1) {
                    int i30 = length + 1;
                    if (i21 < 0) {
                        i19 = 0;
                    } else if (i21 <= 255) {
                        i19 = i21;
                    }
                    bArr[length] = (byte) i19;
                    length = i30;
                }
                i13++;
            }
        }
    }

    private void e(byte[] bArr, int[] iArr, int i10, int i11) {
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            for (int i15 = 0; i15 < i10; i15++) {
                int i16 = iArr[i13];
                int i17 = (16711680 & i16) >> 16;
                int i18 = (65280 & i16) >> 8;
                int i19 = 255;
                int i20 = (i16 & 255) >> 0;
                int i21 = (((((i17 * 66) + (i18 * 129)) + (i20 * 25)) + 128) >> 8) + 16;
                int i22 = (((((i17 * (-38)) - (i18 * 74)) + (i20 * 112)) + 128) >> 8) + 128;
                int i23 = (((((i17 * 112) - (i18 * 94)) - (i20 * 18)) + 128) >> 8) + 128;
                int i24 = i12 + 1;
                if (i21 < 0) {
                    i21 = 0;
                } else if (i21 > 255) {
                    i21 = 255;
                }
                bArr[i12] = (byte) i21;
                if (i14 % 2 == 0 && i13 % 2 == 0) {
                    int i25 = i24 + 1;
                    if (i22 < 0) {
                        i22 = 0;
                    } else if (i22 > 255) {
                        i22 = 255;
                    }
                    bArr[i25] = (byte) i22;
                    int i26 = i24 + 3;
                    if (i23 < 0) {
                        i19 = 0;
                    } else if (i23 <= 255) {
                        i19 = i23;
                    }
                    bArr[i26] = (byte) i19;
                }
                if (i13 % 2 == 0) {
                    i24++;
                }
                i12 = i24;
                i13++;
            }
        }
    }

    private void f(byte[] bArr, int[] iArr, int i10, int i11) {
        int i12 = i10 * i11;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = 0;
            while (i16 < i10) {
                int i17 = iArr[i14];
                int i18 = (16711680 & i17) >> 16;
                int i19 = (65280 & i17) >> 8;
                int i20 = 255;
                int i21 = (i17 & 255) >> 0;
                int i22 = (((((i18 * 66) + (i19 * 129)) + (i21 * 25)) + 128) >> 8) + 16;
                int i23 = (((((i18 * (-38)) - (i19 * 74)) + (i21 * 112)) + 128) >> 8) + 128;
                int i24 = (((((i18 * 112) - (i19 * 94)) - (i21 * 18)) + 128) >> 8) + 128;
                int i25 = i13 + 1;
                if (i22 < 0) {
                    i22 = 0;
                } else if (i22 > 255) {
                    i22 = 255;
                }
                bArr[i13] = (byte) i22;
                if (i15 % 2 == 0 && i14 % 2 == 0) {
                    int i26 = i12 + 1;
                    if (i23 < 0) {
                        i23 = 0;
                    } else if (i23 > 255) {
                        i23 = 255;
                    }
                    bArr[i12] = (byte) i23;
                    i12 = i26 + 1;
                    if (i24 < 0) {
                        i20 = 0;
                    } else if (i24 <= 255) {
                        i20 = i24;
                    }
                    bArr[i26] = (byte) i20;
                }
                i14++;
                i16++;
                i13 = i25;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private byte[] i(int i10, int i11, Bitmap bitmap) {
        int i12 = i10 * i11;
        int[] iArr = new int[i12];
        bitmap.getPixels(iArr, 0, i10, 0, 0, i10, i11);
        byte[] bArr = new byte[(i12 * 3) / 2];
        int i13 = this.f141444k;
        if (i13 != 39) {
            switch (i13) {
                case 19:
                    c(bArr, iArr, i10, i11);
                    break;
                case 20:
                    d(bArr, iArr, i10, i11);
                    break;
                case 21:
                    f(bArr, iArr, i10, i11);
                    break;
            }
        } else {
            e(bArr, iArr, i10, i11);
        }
        return bArr;
    }

    private int j(int i10) {
        return (i10 / 4) * 4;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002a  */
    private void k(int i10, int i11) {
        int i12 = this.f141436c;
        if (i12 == 0) {
            i12 = i10 * i11;
        }
        try {
            for (int i13 : h()) {
                if (i13 != 39) {
                    switch (i13) {
                        case 19:
                            this.f141444k = i13;
                            break;
                        case 20:
                            this.f141444k = i13;
                            break;
                        case 21:
                            this.f141444k = i13;
                            break;
                        default:
                            break;
                    }
                } else {
                    this.f141444k = i13;
                }
                if (this.f141444k <= 0) {
                    this.f141444k = 21;
                }
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", i10, i11);
                mediaFormatCreateVideoFormat.setInteger("color-format", this.f141444k);
                mediaFormatCreateVideoFormat.setInteger("bitrate", i12);
                mediaFormatCreateVideoFormat.setInteger("frame-rate", this.f141434a);
                mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 10);
                this.f141439f = MediaCodec.createEncoderByType("video/avc");
                this.f141441h = new MediaMuxer(this.f141435b.getAbsolutePath(), 0);
                this.f141439f.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                this.f141439f.start();
                this.f141440g = true;
            }
            this.f141439f = MediaCodec.createEncoderByType("video/avc");
            this.f141441h = new MediaMuxer(this.f141435b.getAbsolutePath(), 0);
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        if (this.f141444k <= 0) {
            this.f141444k = 21;
        }
        MediaFormat mediaFormatCreateVideoFormat2 = MediaFormat.createVideoFormat("video/avc", i10, i11);
        mediaFormatCreateVideoFormat2.setInteger("color-format", this.f141444k);
        mediaFormatCreateVideoFormat2.setInteger("bitrate", i12);
        mediaFormatCreateVideoFormat2.setInteger("frame-rate", this.f141434a);
        mediaFormatCreateVideoFormat2.setInteger("i-frame-interval", 10);
        this.f141439f.configure(mediaFormatCreateVideoFormat2, (Surface) null, (MediaCrypto) null, 1);
        this.f141439f.start();
        this.f141440g = true;
    }

    public void g() {
        this.f141440g = false;
        MediaCodec mediaCodec = this.f141439f;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.f141439f.release();
        }
        MediaMuxer mediaMuxer = this.f141441h;
        if (mediaMuxer != null) {
            try {
                if (this.f141443j) {
                    mediaMuxer.stop();
                    this.f141441h.release();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        ol.b<Bitmap> bVar = this.f141437d;
        if (bVar instanceof ol.c) {
            ((ol.c) bVar).finish();
        }
    }

    public int[] h() {
        int codecCount = MediaCodecList.getCodecCount();
        MediaCodecInfo mediaCodecInfo = null;
        for (int i10 = 0; i10 < codecCount && mediaCodecInfo == null; i10++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
            if (codecInfoAt.isEncoder()) {
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                boolean z10 = false;
                for (int i11 = 0; i11 < supportedTypes.length && !z10; i11++) {
                    if (supportedTypes[i11].equals("video/avc")) {
                        z10 = true;
                    }
                }
                if (z10) {
                    mediaCodecInfo = codecInfoAt;
                }
            }
        }
        Log.d(f141433l, "found" + mediaCodecInfo.getName() + "supporting video/avc");
        return mediaCodecInfo.getCapabilitiesForType("video/avc").colorFormats;
    }

    public void l(Bitmap bitmap) {
        this.f141440g = true;
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        long j10 = 0;
        while (this.f141440g) {
            int iDequeueInputBuffer = this.f141439f.dequeueInputBuffer(10000L);
            if (iDequeueInputBuffer >= 0) {
                long jA = a(j10);
                if (j10 >= this.f141437d.size()) {
                    this.f141439f.queueInputBuffer(iDequeueInputBuffer, 0, 0, jA, 4);
                    this.f141440g = false;
                    b(true, bufferInfo);
                } else {
                    if (bitmap == null) {
                        bitmap = this.f141437d.next();
                    }
                    byte[] bArrI = i(j(bitmap.getWidth()), j(bitmap.getHeight()), bitmap);
                    ol.b<Bitmap> bVar = this.f141437d;
                    if (bVar instanceof ol.c) {
                        ((ol.c) bVar).a(bitmap);
                    }
                    bitmap = null;
                    ByteBuffer inputBuffer = this.f141439f.getInputBuffer(iDequeueInputBuffer);
                    inputBuffer.clear();
                    inputBuffer.put(bArrI);
                    this.f141439f.queueInputBuffer(iDequeueInputBuffer, 0, bArrI.length, jA, 0);
                    b(false, bufferInfo);
                }
                this.f141438e.a(((int) ((96 * j10) / ((long) this.f141437d.size()))) + 2);
                j10++;
            } else {
                Log.i(f141433l, "input buffer not available");
                try {
                    Thread.sleep(50L);
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public void m() {
        try {
            try {
                ol.b<Bitmap> bVar = this.f141437d;
                if (bVar instanceof ol.c) {
                    ((ol.c) bVar).prepare();
                }
                if (this.f141437d.size() > 0) {
                    this.f141438e.a(1);
                    Bitmap next = this.f141437d.next();
                    if (next != null) {
                        k(j(next.getWidth()), j(next.getHeight()));
                        this.f141438e.a(2);
                        l(next);
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } finally {
            g();
            this.f141438e.a(100);
        }
    }
}
