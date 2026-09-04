package com.google.android.exoplayer2.video;

import android.view.Surface;
import androidx.annotation.p0;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;

/* JADX INFO: loaded from: classes7.dex */
public class MediaCodecVideoDecoderException extends MediaCodecDecoderException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f51676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f51677e;

    public MediaCodecVideoDecoderException(Throwable th2, @p0 com.google.android.exoplayer2.mediacodec.n nVar, @p0 Surface surface) {
        super(th2, nVar);
        this.f51676d = System.identityHashCode(surface);
        this.f51677e = surface == null || surface.isValid();
    }
}
