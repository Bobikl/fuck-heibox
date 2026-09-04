package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import java.util.List;

/* JADX INFO: compiled from: MediaSourceFactory.java */
/* JADX INFO: loaded from: classes7.dex */
public interface p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p0 f48605a = new a();

    /* JADX INFO: compiled from: MediaSourceFactory.java */
    public class a implements p0 {
        a() {
        }

        @Override // com.google.android.exoplayer2.source.p0
        @Deprecated
        public p0 a(@androidx.annotation.p0 String str) {
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p0
        public int[] b() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.source.p0
        public p0 c(@androidx.annotation.p0 com.google.android.exoplayer2.drm.x xVar) {
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p0
        public /* synthetic */ f0 d(Uri uri) {
            return o0.a(this, uri);
        }

        @Override // com.google.android.exoplayer2.source.p0
        public p0 e(@androidx.annotation.p0 com.google.android.exoplayer2.upstream.g0 g0Var) {
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p0
        public /* synthetic */ p0 f(List list) {
            return o0.b(this, list);
        }

        @Override // com.google.android.exoplayer2.source.p0
        public f0 g(i2 i2Var) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.source.p0
        @Deprecated
        public p0 h(@androidx.annotation.p0 HttpDataSource.b bVar) {
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p0
        @Deprecated
        public p0 i(@androidx.annotation.p0 com.google.android.exoplayer2.drm.u uVar) {
            return this;
        }
    }

    @Deprecated
    p0 a(@androidx.annotation.p0 String str);

    int[] b();

    p0 c(@androidx.annotation.p0 com.google.android.exoplayer2.drm.x xVar);

    @Deprecated
    f0 d(Uri uri);

    p0 e(@androidx.annotation.p0 com.google.android.exoplayer2.upstream.g0 g0Var);

    @Deprecated
    p0 f(@androidx.annotation.p0 List<StreamKey> list);

    f0 g(i2 i2Var);

    @Deprecated
    p0 h(@androidx.annotation.p0 HttpDataSource.b bVar);

    @Deprecated
    p0 i(@androidx.annotation.p0 com.google.android.exoplayer2.drm.u uVar);
}
