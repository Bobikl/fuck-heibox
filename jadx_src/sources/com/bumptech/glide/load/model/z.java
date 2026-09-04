package com.bumptech.glide.load.model;

import android.net.Uri;
import androidx.annotation.n0;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: UrlUriLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public class z<Data> implements o<Uri, Data> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<String> f41454b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o<h, Data> f41455a;

    /* JADX INFO: compiled from: UrlUriLoader.java */
    public static class a implements p<Uri, InputStream> {
        @Override // com.bumptech.glide.load.model.p
        public void c() {
        }

        @Override // com.bumptech.glide.load.model.p
        @n0
        public o<Uri, InputStream> d(s sVar) {
            return new z(sVar.d(h.class, InputStream.class));
        }
    }

    public z(o<h, Data> oVar) {
        this.f41455a = oVar;
    }

    @Override // com.bumptech.glide.load.model.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> a(@n0 Uri uri, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) {
        return this.f41455a.a(new h(uri.toString()), i10, i11, fVar);
    }

    @Override // com.bumptech.glide.load.model.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@n0 Uri uri) {
        return f41454b.contains(uri.getScheme());
    }
}
