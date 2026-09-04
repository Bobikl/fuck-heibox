package com.google.android.exoplayer2.util;

import android.annotation.SuppressLint;
import android.media.MediaFormat;
import com.google.android.exoplayer2.a2;
import com.umeng.analytics.pro.ak;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: MediaFormatUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f51557a = "exo-pixel-width-height-ratio-float";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f51558b = "exo-pcm-encoding-int";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f51559c = 1073741824;

    private x() {
    }

    @SuppressLint({"InlinedApi"})
    public static MediaFormat a(a2 a2Var) {
        MediaFormat mediaFormat = new MediaFormat();
        e(mediaFormat, "bitrate", a2Var.f43589i);
        e(mediaFormat, "channel-count", a2Var.f43606z);
        c(mediaFormat, a2Var.f43605y);
        h(mediaFormat, org.apache.tools.ant.taskdefs.email.b.I, a2Var.f43593m);
        h(mediaFormat, "codecs-string", a2Var.f43590j);
        d(mediaFormat, "frame-rate", a2Var.f43600t);
        e(mediaFormat, "width", a2Var.f43598r);
        e(mediaFormat, "height", a2Var.f43599s);
        j(mediaFormat, a2Var.f43595o);
        f(mediaFormat, a2Var.B);
        h(mediaFormat, ak.N, a2Var.f43584d);
        e(mediaFormat, "max-input-size", a2Var.f43594n);
        e(mediaFormat, "sample-rate", a2Var.A);
        e(mediaFormat, "caption-service-number", a2Var.E);
        mediaFormat.setInteger("rotation-degrees", a2Var.f43601u);
        int i10 = a2Var.f43585e;
        i(mediaFormat, "is-autoselect", i10 & 4);
        i(mediaFormat, "is-default", i10 & 1);
        i(mediaFormat, "is-forced-subtitle", i10 & 2);
        mediaFormat.setInteger("encoder-delay", a2Var.C);
        mediaFormat.setInteger("encoder-padding", a2Var.D);
        g(mediaFormat, a2Var.f43602v);
        return mediaFormat;
    }

    public static void b(MediaFormat mediaFormat, String str, @androidx.annotation.p0 byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void c(MediaFormat mediaFormat, @androidx.annotation.p0 com.google.android.exoplayer2.video.c cVar) {
        if (cVar != null) {
            e(mediaFormat, "color-transfer", cVar.f51723d);
            e(mediaFormat, "color-standard", cVar.f51721b);
            e(mediaFormat, "color-range", cVar.f51722c);
            b(mediaFormat, "hdr-static-info", cVar.f51724e);
        }
    }

    public static void d(MediaFormat mediaFormat, String str, float f10) {
        if (f10 != -1.0f) {
            mediaFormat.setFloat(str, f10);
        }
    }

    public static void e(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    @SuppressLint({"InlinedApi"})
    private static void f(MediaFormat mediaFormat, int i10) {
        if (i10 == -1) {
            return;
        }
        e(mediaFormat, f51558b, i10);
        int i11 = 4;
        if (i10 == 2) {
            i11 = 2;
        } else if (i10 == 3) {
            i11 = 3;
        } else if (i10 != 4) {
            return;
        }
        mediaFormat.setInteger("pcm-encoding", i11);
    }

    @SuppressLint({"InlinedApi"})
    private static void g(MediaFormat mediaFormat, float f10) {
        int i10;
        mediaFormat.setFloat(f51557a, f10);
        int i11 = 1073741824;
        if (f10 < 1.0f) {
            i11 = (int) (f10 * 1073741824);
            i10 = 1073741824;
        } else if (f10 > 1.0f) {
            i10 = (int) (1073741824 / f10);
        } else {
            i10 = 1;
            i11 = 1;
        }
        mediaFormat.setInteger("sar-width", i11);
        mediaFormat.setInteger("sar-height", i10);
    }

    public static void h(MediaFormat mediaFormat, String str, @androidx.annotation.p0 String str2) {
        if (str2 != null) {
            mediaFormat.setString(str, str2);
        }
    }

    private static void i(MediaFormat mediaFormat, String str, int i10) {
        mediaFormat.setInteger(str, i10 != 0 ? 1 : 0);
    }

    public static void j(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            StringBuilder sb2 = new StringBuilder(15);
            sb2.append("csd-");
            sb2.append(i10);
            mediaFormat.setByteBuffer(sb2.toString(), ByteBuffer.wrap(list.get(i10)));
        }
    }
}
