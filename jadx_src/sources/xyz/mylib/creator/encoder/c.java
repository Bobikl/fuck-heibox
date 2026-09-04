package xyz.mylib.creator.encoder;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.util.Log;
import android.view.Surface;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: EncodeDecode.java */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f141445k = "EncodeDecode";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final boolean f141446l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f141447m = "video/avc";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f141448n = 10;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f141449o = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f141450a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f141451b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f141452c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f141453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private File f141454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MediaCodec f141455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MediaMuxer f141456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f141457h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f141458i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList<File> f141459j;

    public c(ArrayList<File> arrayList, File file) {
        this.f141459j = arrayList;
        this.f141454e = file;
    }

    private static long a(int i10) {
        return ((((long) i10) * 1000000) / 10) + 132;
    }

    @SuppressLint({"InlinedApi"})
    private boolean b(MediaCodec mediaCodec, int i10) {
        ByteBuffer[] inputBuffers = mediaCodec.getInputBuffers();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int i11 = ((this.f141450a * this.f141451b) * 3) / 2;
        byte[] bArr = new byte[i11];
        boolean z10 = false;
        int i12 = 0;
        while (!z10) {
            int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(10000L);
            if (iDequeueInputBuffer >= 0) {
                long jA = a(i12);
                if (i12 >= this.f141459j.size()) {
                    mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, 0, jA, 4);
                    c(true, bufferInfo);
                    z10 = true;
                } else {
                    try {
                        f(i12, i10, bArr);
                    } catch (Exception unused) {
                        Log.i(f141445k, "meet a different type of image");
                        Arrays.fill(bArr, (byte) 0);
                    }
                    ByteBuffer byteBuffer = inputBuffers[iDequeueInputBuffer];
                    byteBuffer.clear();
                    byteBuffer.put(bArr);
                    mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, i11, jA, 0);
                    c(false, bufferInfo);
                }
                i12++;
            }
        }
        return true;
    }

    private void c(boolean z10, MediaCodec.BufferInfo bufferInfo) {
        if (z10) {
            try {
                this.f141455f.signalEndOfInputStream();
            } catch (Exception unused) {
            }
        }
        ByteBuffer[] outputBuffers = this.f141455f.getOutputBuffers();
        while (true) {
            int iDequeueOutputBuffer = this.f141455f.dequeueOutputBuffer(bufferInfo, 10000L);
            if (iDequeueOutputBuffer == -1) {
                if (!z10) {
                    return;
                }
            } else if (iDequeueOutputBuffer == -3) {
                outputBuffers = this.f141455f.getOutputBuffers();
            } else if (iDequeueOutputBuffer == -2) {
                if (this.f141458i) {
                    throw new RuntimeException("format changed twice");
                }
                this.f141457h = this.f141456g.addTrack(this.f141455f.getOutputFormat());
                this.f141456g.start();
                this.f141458i = true;
            } else if (iDequeueOutputBuffer >= 0) {
                ByteBuffer byteBuffer = outputBuffers[iDequeueOutputBuffer];
                if (byteBuffer == null) {
                    throw new RuntimeException("encoderOutputBuffer " + iDequeueOutputBuffer + " was null");
                }
                if ((bufferInfo.flags & 2) != 0) {
                    bufferInfo.size = 0;
                }
                if (bufferInfo.size != 0) {
                    if (!this.f141458i) {
                        throw new RuntimeException("muxer hasn't started");
                    }
                    byteBuffer.position(bufferInfo.offset);
                    byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    try {
                        this.f141456g.writeSampleData(this.f141457h, byteBuffer, bufferInfo);
                    } catch (Exception unused2) {
                        Log.i(f141445k, "Too many frames");
                    }
                }
                this.f141455f.releaseOutputBuffer(iDequeueOutputBuffer, false);
                if ((bufferInfo.flags & 4) != 0) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    private void f(int i10, int i11, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        byte[] bArr2 = (byte[]) bArr.clone();
        int i12 = this.f141451b;
        int i13 = i12 / 4;
        int i14 = 0;
        int i15 = i12;
        while (i12 < this.f141451b + i13) {
            int i16 = 0;
            while (true) {
                int i17 = this.f141450a;
                if (i16 < i17) {
                    byte b10 = bArr2[(i12 * i17) + i16];
                    byte b11 = bArr2[((i12 + i13) * i17) + i16];
                    bArr[(i15 * i17) + i14] = b10;
                    bArr[(i15 * i17) + i14 + 1] = b11;
                    i14 += 2;
                    if (i14 >= i17) {
                        i15++;
                        i14 = 0;
                    }
                    i16++;
                }
            }
            i12++;
        }
    }

    private static boolean g(int i10) {
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

    private static MediaCodecInfo h(String str) {
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

    private static int i(MediaCodecInfo mediaCodecInfo, String str) {
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
        int i10 = 0;
        while (true) {
            int[] iArr = capabilitiesForType.colorFormats;
            if (i10 >= iArr.length) {
                return 0;
            }
            int i11 = iArr[i10];
            if (g(i11)) {
                return i11;
            }
            i10++;
        }
    }

    private void j(int i10, int i11, int i12) {
        if (i10 % 16 != 0 || i11 % 16 != 0) {
            Log.w(f141445k, "WARNING: width or height not multiple of 16");
        }
        this.f141450a = i10;
        this.f141451b = i11;
        this.f141452c = i12;
    }

    @SuppressLint({"InlinedApi"})
    public boolean d() throws Exception {
        int i10;
        this.f141453d = -1;
        try {
            MediaCodecInfo mediaCodecInfoH = h("video/avc");
            if (mediaCodecInfoH == null) {
                Log.e(f141445k, "Unable to find an appropriate codec for video/avc");
                MediaCodec mediaCodec = this.f141455f;
                if (mediaCodec != null) {
                    mediaCodec.stop();
                    this.f141455f.release();
                }
                MediaMuxer mediaMuxer = this.f141456g;
                if (mediaMuxer != null) {
                    mediaMuxer.stop();
                    this.f141456g.release();
                }
                return false;
            }
            try {
                i10 = i(mediaCodecInfoH, "video/avc");
            } catch (Exception unused) {
                i10 = 21;
            }
            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", this.f141450a, this.f141451b);
            mediaFormatCreateVideoFormat.setInteger("color-format", i10);
            mediaFormatCreateVideoFormat.setInteger("bitrate", this.f141452c);
            mediaFormatCreateVideoFormat.setInteger("frame-rate", 10);
            mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 10);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(mediaCodecInfoH.getName());
            this.f141455f = mediaCodecCreateByCodecName;
            mediaCodecCreateByCodecName.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            this.f141455f.start();
            try {
                this.f141456g = new MediaMuxer(this.f141454e.getAbsolutePath(), 0);
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            boolean zB = b(this.f141455f, i10);
            MediaCodec mediaCodec2 = this.f141455f;
            if (mediaCodec2 != null) {
                mediaCodec2.stop();
                this.f141455f.release();
            }
            MediaMuxer mediaMuxer2 = this.f141456g;
            if (mediaMuxer2 != null) {
                mediaMuxer2.stop();
                this.f141456g.release();
            }
            return zB;
        } catch (Throwable th2) {
            MediaCodec mediaCodec3 = this.f141455f;
            if (mediaCodec3 != null) {
                mediaCodec3.stop();
                this.f141455f.release();
            }
            MediaMuxer mediaMuxer3 = this.f141456g;
            if (mediaMuxer3 != null) {
                mediaMuxer3.stop();
                this.f141456g.release();
            }
            throw th2;
        }
    }

    public boolean e(int i10, int i11, int i12) throws Throwable {
        j(i10, i11, i12);
        return d();
    }
}
