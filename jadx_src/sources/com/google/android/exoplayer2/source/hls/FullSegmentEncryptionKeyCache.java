package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import androidx.annotation.p0;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class FullSegmentEncryptionKeyCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<Uri, byte[]> f48047a;

    public FullSegmentEncryptionKeyCache(final int i10) {
        this.f48047a = new LinkedHashMap<Uri, byte[]>(this, i10 + 1, 1.0f, false) { // from class: com.google.android.exoplayer2.source.hls.FullSegmentEncryptionKeyCache.1
            @Override // java.util.LinkedHashMap
            protected boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
                return size() > i10;
            }
        };
    }

    public boolean a(Uri uri) {
        return this.f48047a.containsKey(com.google.android.exoplayer2.util.a.g(uri));
    }

    @p0
    public byte[] b(@p0 Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.f48047a.get(uri);
    }

    @p0
    public byte[] c(Uri uri, byte[] bArr) {
        return this.f48047a.put((Uri) com.google.android.exoplayer2.util.a.g(uri), (byte[]) com.google.android.exoplayer2.util.a.g(bArr));
    }

    @p0
    public byte[] d(Uri uri) {
        return this.f48047a.remove(com.google.android.exoplayer2.util.a.g(uri));
    }
}
