package com.google.android.exoplayer2.offline;

import android.net.Uri;
import androidx.annotation.p0;
import com.google.android.exoplayer2.offline.z;
import com.google.android.exoplayer2.upstream.i0;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: compiled from: FilteringManifestParser.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a0<T extends z<T>> implements i0.a<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i0.a<? extends T> f47156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private final List<StreamKey> f47157c;

    public a0(i0.a<? extends T> aVar, @p0 List<StreamKey> list) {
        this.f47156b = aVar;
        this.f47157c = list;
    }

    @Override // com.google.android.exoplayer2.upstream.i0.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T a(Uri uri, InputStream inputStream) throws IOException {
        T tA = this.f47156b.a(uri, inputStream);
        List<StreamKey> list = this.f47157c;
        return (list == null || list.isEmpty()) ? tA : (T) tA.a(this.f47157c);
    }
}
