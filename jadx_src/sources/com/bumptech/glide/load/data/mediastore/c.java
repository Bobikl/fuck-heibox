package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import androidx.annotation.j1;
import androidx.annotation.n0;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: ThumbFetcher.java */
/* JADX INFO: loaded from: classes6.dex */
public class c implements com.bumptech.glide.load.data.d<InputStream> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f40874e = "MediaStoreThumbFetcher";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f40875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f40876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InputStream f40877d;

    /* JADX INFO: compiled from: ThumbFetcher.java */
    public static class a implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String[] f40878b = {"_data"};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f40879c = "kind = 1 AND image_id = ?";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f40880a;

        a(ContentResolver contentResolver) {
            this.f40880a = contentResolver;
        }

        @Override // com.bumptech.glide.load.data.mediastore.d
        public Cursor a(Uri uri) {
            return this.f40880a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f40878b, f40879c, new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* JADX INFO: compiled from: ThumbFetcher.java */
    public static class b implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String[] f40881b = {"_data"};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f40882c = "kind = 1 AND video_id = ?";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f40883a;

        b(ContentResolver contentResolver) {
            this.f40883a = contentResolver;
        }

        @Override // com.bumptech.glide.load.data.mediastore.d
        public Cursor a(Uri uri) {
            return this.f40883a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f40881b, f40882c, new String[]{uri.getLastPathSegment()}, null);
        }
    }

    @j1
    c(Uri uri, e eVar) {
        this.f40875b = uri;
        this.f40876c = eVar;
    }

    private static c e(Context context, Uri uri, d dVar) {
        return new c(uri, new e(Glide.e(context).n().g(), dVar, Glide.e(context).g(), context.getContentResolver()));
    }

    public static c f(Context context, Uri uri) {
        return e(context, uri, new a(context.getContentResolver()));
    }

    public static c g(Context context, Uri uri) {
        return e(context, uri, new b(context.getContentResolver()));
    }

    private InputStream h() throws Throwable {
        InputStream inputStreamD = this.f40876c.d(this.f40875b);
        int iA = inputStreamD != null ? this.f40876c.a(this.f40875b) : -1;
        return iA != -1 ? new g(inputStreamD, iA) : inputStreamD;
    }

    @Override // com.bumptech.glide.load.data.d
    @n0
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f40877d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    @n0
    public DataSource c() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public void d(@n0 Priority priority, @n0 com.bumptech.glide.load.data.d.a<? super InputStream> aVar) throws Throwable {
        try {
            InputStream inputStreamH = h();
            this.f40877d = inputStreamH;
            aVar.e(inputStreamH);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable(f40874e, 3)) {
                Log.d(f40874e, "Failed to find thumbnail file", e10);
            }
            aVar.f(e10);
        }
    }
}
