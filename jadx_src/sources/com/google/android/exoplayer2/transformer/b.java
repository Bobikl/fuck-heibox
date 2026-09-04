package com.google.android.exoplayer2.transformer;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.ParcelFileDescriptor;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.util.x;
import com.google.android.exoplayer2.util.y;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: FrameworkMuxer.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(18)
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaMuxer f50204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MediaCodec.BufferInfo f50205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f50206c;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.transformer.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FrameworkMuxer.java */
    public static final class C0400b implements d.a {
        @Override // com.google.android.exoplayer2.transformer.d.a
        public boolean b(String str) {
            try {
                b.e(str);
                return true;
            } catch (IllegalStateException unused) {
                return false;
            }
        }

        @Override // com.google.android.exoplayer2.transformer.d.a
        public boolean c(@p0 String str, String str2) {
            int i10;
            boolean zP = y.p(str);
            boolean zT = y.t(str);
            if (str2.equals("video/mp4")) {
                if (zT) {
                    if (y.f51576i.equals(str) || "video/avc".equals(str) || y.f51590p.equals(str)) {
                        return true;
                    }
                    return u0.f51536a >= 24 && "video/hevc".equals(str);
                }
                if (zP) {
                    return y.A.equals(str) || y.X.equals(str) || y.Y.equals(str);
                }
            } else if (str2.equals(y.f51574h) && (i10 = u0.f51536a) >= 21) {
                if (zT) {
                    if ("video/x-vnd.on2.vp8".equals(str)) {
                        return true;
                    }
                    return i10 >= 24 && "video/x-vnd.on2.vp9".equals(str);
                }
                if (zP) {
                    return y.U.equals(str);
                }
            }
            return false;
        }

        @Override // com.google.android.exoplayer2.transformer.d.a
        @w0(26)
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public b a(ParcelFileDescriptor parcelFileDescriptor, String str) throws IOException {
            return new b(new MediaMuxer(parcelFileDescriptor.getFileDescriptor(), b.e(str)));
        }

        @Override // com.google.android.exoplayer2.transformer.d.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public b d(String str, String str2) throws IOException {
            return new b(new MediaMuxer(str, b.e(str2)));
        }
    }

    private b(MediaMuxer mediaMuxer) {
        this.f50204a = mediaMuxer;
        this.f50205b = new MediaCodec.BufferInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int e(String str) {
        if (str.equals("video/mp4")) {
            return 0;
        }
        if (u0.f51536a < 21 || !str.equals(y.f51574h)) {
            throw new IllegalArgumentException(str.length() != 0 ? "Unsupported output MIME type: ".concat(str) : new String("Unsupported output MIME type: "));
        }
        return 1;
    }

    @Override // com.google.android.exoplayer2.transformer.d
    public void a(boolean z10) {
        if (!this.f50206c) {
            this.f50204a.release();
            return;
        }
        this.f50206c = false;
        try {
            try {
                this.f50204a.stop();
            } catch (IllegalStateException e10) {
                if (u0.f51536a < 30) {
                    try {
                        Field declaredField = MediaMuxer.class.getDeclaredField("MUXER_STATE_STOPPED");
                        declaredField.setAccessible(true);
                        int iIntValue = ((Integer) u0.k((Integer) declaredField.get(this.f50204a))).intValue();
                        Field declaredField2 = MediaMuxer.class.getDeclaredField("mState");
                        declaredField2.setAccessible(true);
                        declaredField2.set(this.f50204a, Integer.valueOf(iIntValue));
                    } catch (Exception unused) {
                    }
                }
                if (!z10) {
                    throw e10;
                }
            }
            this.f50204a.release();
        } catch (Throwable th2) {
            this.f50204a.release();
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.transformer.d
    @SuppressLint({"WrongConstant"})
    public void b(int i10, ByteBuffer byteBuffer, boolean z10, long j10) {
        if (!this.f50206c) {
            this.f50206c = true;
            this.f50204a.start();
        }
        int iPosition = byteBuffer.position();
        this.f50205b.set(iPosition, byteBuffer.limit() - iPosition, j10, z10 ? 1 : 0);
        this.f50204a.writeSampleData(i10, byteBuffer, this.f50205b);
    }

    @Override // com.google.android.exoplayer2.transformer.d
    public int c(a2 a2Var) {
        MediaFormat mediaFormatCreateVideoFormat;
        String str = (String) com.google.android.exoplayer2.util.a.g(a2Var.f43593m);
        if (y.p(str)) {
            mediaFormatCreateVideoFormat = MediaFormat.createAudioFormat((String) u0.k(str), a2Var.A, a2Var.f43606z);
        } else {
            mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat((String) u0.k(str), a2Var.f43598r, a2Var.f43599s);
            this.f50204a.setOrientationHint(a2Var.f43601u);
        }
        x.j(mediaFormatCreateVideoFormat, a2Var.f43595o);
        return this.f50204a.addTrack(mediaFormatCreateVideoFormat);
    }
}
