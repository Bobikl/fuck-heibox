package com.bumptech.glide.load.model;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.n0;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: UriLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public class y<Data> implements o<Uri, Data> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<String> f41449b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c<Data> f41450a;

    /* JADX INFO: compiled from: UriLoader.java */
    public static final class a implements p<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f41451a;

        public a(ContentResolver contentResolver) {
            this.f41451a = contentResolver;
        }

        @Override // com.bumptech.glide.load.model.y.c
        public com.bumptech.glide.load.data.d<AssetFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f41451a, uri);
        }

        @Override // com.bumptech.glide.load.model.p
        public void c() {
        }

        @Override // com.bumptech.glide.load.model.p
        public o<Uri, AssetFileDescriptor> d(s sVar) {
            return new y(this);
        }
    }

    /* JADX INFO: compiled from: UriLoader.java */
    public static class b implements p<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f41452a;

        public b(ContentResolver contentResolver) {
            this.f41452a = contentResolver;
        }

        @Override // com.bumptech.glide.load.model.y.c
        public com.bumptech.glide.load.data.d<ParcelFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.f41452a, uri);
        }

        @Override // com.bumptech.glide.load.model.p
        public void c() {
        }

        @Override // com.bumptech.glide.load.model.p
        @n0
        public o<Uri, ParcelFileDescriptor> d(s sVar) {
            return new y(this);
        }
    }

    /* JADX INFO: compiled from: UriLoader.java */
    public interface c<Data> {
        com.bumptech.glide.load.data.d<Data> a(Uri uri);
    }

    /* JADX INFO: compiled from: UriLoader.java */
    public static class d implements p<Uri, InputStream>, c<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f41453a;

        public d(ContentResolver contentResolver) {
            this.f41453a = contentResolver;
        }

        @Override // com.bumptech.glide.load.model.y.c
        public com.bumptech.glide.load.data.d<InputStream> a(Uri uri) {
            return new com.bumptech.glide.load.data.n(this.f41453a, uri);
        }

        @Override // com.bumptech.glide.load.model.p
        public void c() {
        }

        @Override // com.bumptech.glide.load.model.p
        @n0
        public o<Uri, InputStream> d(s sVar) {
            return new y(this);
        }
    }

    public y(c<Data> cVar) {
        this.f41450a = cVar;
    }

    @Override // com.bumptech.glide.load.model.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> a(@n0 Uri uri, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) {
        return new o.a<>(new com.bumptech.glide.signature.e(uri), this.f41450a.a(uri));
    }

    @Override // com.bumptech.glide.load.model.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@n0 Uri uri) {
        return f41449b.contains(uri.getScheme());
    }
}
