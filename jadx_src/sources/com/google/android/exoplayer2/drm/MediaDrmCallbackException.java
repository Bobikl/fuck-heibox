package com.google.android.exoplayer2.drm;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class MediaDrmCallbackException extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.r f44665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f44666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, List<String>> f44667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f44668e;

    public MediaDrmCallbackException(com.google.android.exoplayer2.upstream.r rVar, Uri uri, Map<String, List<String>> map, long j10, Throwable th2) {
        super(th2);
        this.f44665b = rVar;
        this.f44666c = uri;
        this.f44667d = map;
        this.f44668e = j10;
    }
}
