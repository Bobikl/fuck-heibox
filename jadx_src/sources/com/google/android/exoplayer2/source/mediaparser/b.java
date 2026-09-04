package com.google.android.exoplayer2.source.mediaparser;

import android.media.MediaFormat;
import com.google.android.exoplayer2.a2;

/* JADX INFO: compiled from: MediaParserUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f48552a = "android.media.mediaparser.inBandCryptoInfo";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f48553b = "android.media.mediaparser.includeSupplementalData";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f48554c = "android.media.mediaparser.eagerlyExposeTrackType";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f48555d = "android.media.mediaparser.exposeDummySeekMap";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f48556e = "android.media.mediaParser.exposeChunkIndexAsMediaFormat";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f48557f = "android.media.mediaParser.overrideInBandCaptionDeclarations";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f48558g = "android.media.mediaParser.exposeCaptionFormats";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f48559h = "android.media.mediaparser.ignoreTimestampOffset";

    private b() {
    }

    public static MediaFormat a(a2 a2Var) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(org.apache.tools.ant.taskdefs.email.b.I, a2Var.f43593m);
        int i10 = a2Var.E;
        if (i10 != -1) {
            mediaFormat.setInteger("caption-service-number", i10);
        }
        return mediaFormat;
    }
}
