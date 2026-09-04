package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.util.u0;

/* JADX INFO: loaded from: classes7.dex */
public class MediaCodecDecoderException extends DecoderException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final n f46644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    public final String f46645c;

    /* JADX WARN: Illegal instructions before constructor call */
    public MediaCodecDecoderException(Throwable th2, @p0 n nVar) {
        String strValueOf = String.valueOf(nVar == null ? null : nVar.f46797a);
        super(strValueOf.length() != 0 ? "Decoder failed: ".concat(strValueOf) : new String("Decoder failed: "), th2);
        this.f46644b = nVar;
        this.f46645c = u0.f51536a >= 21 ? a(th2) : null;
    }

    @w0(21)
    @p0
    private static String a(Throwable th2) {
        if (th2 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
        }
        return null;
    }
}
