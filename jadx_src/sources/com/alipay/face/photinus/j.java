package com.alipay.face.photinus;

import android.content.Context;
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
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: VideoEncoderHelper.java */
/* JADX INFO: loaded from: classes6.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f38911a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f38912b = "video/avc";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f38913c = 10;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f38914d = "VideoEncoderHelper";

    /* JADX INFO: compiled from: VideoEncoderHelper.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        MediaCodec f38915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        MediaMuxer f38916b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        File f38917c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f38918d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38919e;

        a() {
        }

        boolean a() {
            return (this.f38915a == null || this.f38916b == null || this.f38917c == null) ? false : true;
        }
    }

    private static void a(boolean z10, MediaCodec.BufferInfo bufferInfo, a aVar) throws Exception {
        if (z10) {
            try {
                aVar.f38915a.signalEndOfInputStream();
            } catch (Exception unused) {
            }
        }
        ByteBuffer[] outputBuffers = aVar.f38915a.getOutputBuffers();
        while (true) {
            int iDequeueOutputBuffer = aVar.f38915a.dequeueOutputBuffer(bufferInfo, 10000L);
            if (iDequeueOutputBuffer == -1) {
                if (!z10) {
                    return;
                } else {
                    Log.i(f38914d, "no output available, spinning to await EOS");
                }
            } else if (iDequeueOutputBuffer == -3) {
                outputBuffers = aVar.f38915a.getOutputBuffers();
            } else if (iDequeueOutputBuffer == -2) {
                if (aVar.f38918d) {
                    throw new Exception("format changed twice");
                }
                MediaFormat outputFormat = aVar.f38915a.getOutputFormat();
                Log.i(f38914d, "encoder output format changed: " + outputFormat);
                aVar.f38919e = aVar.f38916b.addTrack(outputFormat);
                aVar.f38916b.start();
                aVar.f38918d = true;
            } else if (iDequeueOutputBuffer < 0) {
                Log.i(f38914d, "unexpected result from encoder.dequeueOutputBuffer: " + iDequeueOutputBuffer);
            } else {
                ByteBuffer byteBuffer = outputBuffers[iDequeueOutputBuffer];
                if (byteBuffer == null) {
                    throw new Exception("encoderOutputBuffer " + iDequeueOutputBuffer + " was null");
                }
                if ((bufferInfo.flags & 2) != 0) {
                    Log.d(f38914d, "ignoring BUFFER_FLAG_CODEC_CONFIG");
                    bufferInfo.size = 0;
                }
                if (bufferInfo.size != 0) {
                    if (!aVar.f38918d) {
                        throw new Exception("muxer hasn't started");
                    }
                    byteBuffer.position(bufferInfo.offset);
                    byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    Log.d(f38914d, "BufferInfo: " + bufferInfo.offset + Constants.ACCEPT_TIME_SEPARATOR_SP + bufferInfo.size + Constants.ACCEPT_TIME_SEPARATOR_SP + bufferInfo.presentationTimeUs);
                    try {
                        aVar.f38916b.writeSampleData(aVar.f38919e, byteBuffer, bufferInfo);
                    } catch (Exception unused2) {
                        Log.i(f38914d, "Too many frames");
                    }
                }
                aVar.f38915a.releaseOutputBuffer(iDequeueOutputBuffer, false);
                if ((bufferInfo.flags & 4) != 0) {
                    if (z10) {
                        Log.i(f38914d, "end of stream reached");
                        return;
                    } else {
                        Log.i(f38914d, "reached end of stream unexpectedly");
                        return;
                    }
                }
            }
        }
    }

    public static void b(Context context, List<ByteBuffer> list, int i10, int i11, int i12, String str, VideoFormatConfig videoFormatConfig, f fVar) {
        a aVarD;
        try {
            aVarD = d(context, i11, i12, str, videoFormatConfig);
        } catch (Exception e10) {
            fVar.b(e10.getMessage());
            aVarD = null;
        }
        if (aVarD == null || !aVarD.a()) {
            return;
        }
        try {
            Iterator<ByteBuffer> it = list.iterator();
            int i13 = 0;
            while (it.hasNext()) {
                c(i13, VideoWriter.H(it.next().array(), i11, i12), aVarD);
                i13++;
            }
            c(i13, null, aVarD);
            MediaCodec mediaCodec = aVarD.f38915a;
            if (mediaCodec != null) {
                mediaCodec.stop();
                aVarD.f38915a.release();
                aVarD.f38915a = null;
            }
            MediaMuxer mediaMuxer = aVarD.f38916b;
            if (mediaMuxer != null) {
                mediaMuxer.stop();
                aVarD.f38916b.release();
                aVarD.f38916b = null;
                aVarD.f38918d = false;
            }
            fVar.a(Uri.fromFile(aVarD.f38917c));
        } catch (Exception e11) {
            fVar.b(e11.getMessage());
        }
    }

    private static void c(int i10, byte[] bArr, a aVar) throws Exception {
        ByteBuffer[] inputBuffers = aVar.f38915a.getInputBuffers();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int iDequeueInputBuffer = aVar.f38915a.dequeueInputBuffer(10000L);
        if (iDequeueInputBuffer < 0) {
            Log.i(f38914d, "input buffer not available");
            return;
        }
        long jX = VideoWriter.x(i10);
        if (bArr == null) {
            aVar.f38915a.queueInputBuffer(iDequeueInputBuffer, 0, 0, jX, 4);
            a(true, bufferInfo, aVar);
            return;
        }
        ByteBuffer byteBuffer = inputBuffers[iDequeueInputBuffer];
        byteBuffer.clear();
        byteBuffer.put(bArr);
        aVar.f38915a.queueInputBuffer(iDequeueInputBuffer, 0, bArr.length, jX, 0);
        a(false, bufferInfo, aVar);
    }

    private static a d(Context context, int i10, int i11, String str, VideoFormatConfig videoFormatConfig) throws Exception {
        MediaCodecInfo mediaCodecInfoE = e("video/avc");
        a aVar = new a();
        Uri uriWithAppendedPath = Uri.withAppendedPath(Uri.fromFile(context.getCacheDir()), "ZLZPhontinus");
        File file = new File(uriWithAppendedPath.getPath());
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(Uri.withAppendedPath(uriWithAppendedPath, str + ".mp4").getPath());
        aVar.f38917c = file2;
        if (file2.exists()) {
            aVar.f38917c.delete();
        }
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", i11, i10);
        mediaFormatCreateVideoFormat.setInteger("color-format", 21);
        mediaFormatCreateVideoFormat.setInteger("bitrate", videoFormatConfig.getBitRate());
        mediaFormatCreateVideoFormat.setInteger("frame-rate", videoFormatConfig.getFrameRate());
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 10);
        Log.d(f38914d, "format: " + mediaFormatCreateVideoFormat);
        try {
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(mediaCodecInfoE.getName());
            aVar.f38915a = mediaCodecCreateByCodecName;
            mediaCodecCreateByCodecName.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            aVar.f38915a.start();
            try {
                aVar.f38916b = new MediaMuxer(aVar.f38917c.getAbsolutePath(), 0);
                return aVar;
            } catch (IOException e10) {
                throw new Exception("create muxer error, msg = " + e10.getMessage());
            }
        } catch (IOException e11) {
            throw new Exception("create codec by name error, msg = " + e11.getMessage());
        }
    }

    private static MediaCodecInfo e(String str) throws Exception {
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
        throw new Exception("not support mimeType");
    }
}
