package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import androidx.annotation.p0;
import com.google.android.exoplayer2.source.n0;
import com.google.android.exoplayer2.upstream.g0;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public interface HlsPlaylistTracker {

    public static final class PlaylistResetException extends IOException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f48254b;

        public PlaylistResetException(Uri uri) {
            this.f48254b = uri;
        }
    }

    public static final class PlaylistStuckException extends IOException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f48255b;

        public PlaylistStuckException(Uri uri) {
            this.f48255b = uri;
        }
    }

    public interface a {
        HlsPlaylistTracker a(com.google.android.exoplayer2.source.hls.g gVar, g0 g0Var, i iVar);
    }

    public interface b {
        void b();

        boolean m(Uri uri, g0.d dVar, boolean z10);
    }

    public interface c {
        void i(g gVar);
    }

    void a(b bVar);

    long b();

    @p0
    f c();

    void d(Uri uri, n0.a aVar, c cVar);

    void e(Uri uri) throws IOException;

    void f(Uri uri);

    void g(b bVar);

    boolean h(Uri uri);

    boolean i();

    boolean j(Uri uri, long j10);

    void k() throws IOException;

    @p0
    g l(Uri uri, boolean z10);

    void stop();
}
