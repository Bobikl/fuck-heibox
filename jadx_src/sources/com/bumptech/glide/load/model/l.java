package com.bumptech.glide.load.model;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.n0;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: compiled from: MediaStoreFileLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public final class l implements o<Uri, File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f41366a;

    /* JADX INFO: compiled from: MediaStoreFileLoader.java */
    public static final class a implements p<Uri, File> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f41367a;

        public a(Context context) {
            this.f41367a = context;
        }

        @Override // com.bumptech.glide.load.model.p
        public void c() {
        }

        @Override // com.bumptech.glide.load.model.p
        @n0
        public o<Uri, File> d(s sVar) {
            return new l(this.f41367a);
        }
    }

    /* JADX INFO: compiled from: MediaStoreFileLoader.java */
    public static class b implements com.bumptech.glide.load.data.d<File> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String[] f41368d = {"_data"};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f41369b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Uri f41370c;

        b(Context context, Uri uri) {
            this.f41369b = context;
            this.f41370c = uri;
        }

        @Override // com.bumptech.glide.load.data.d
        @n0
        public Class<File> a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
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
        public void d(@n0 Priority priority, @n0 com.bumptech.glide.load.data.d.a<? super File> aVar) {
            Cursor cursorQuery = this.f41369b.getContentResolver().query(this.f41370c, f41368d, null, null, null);
            String string = null;
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    cursorQuery.close();
                } catch (Throwable th2) {
                    cursorQuery.close();
                    throw th2;
                }
            }
            if (!TextUtils.isEmpty(string)) {
                aVar.e(new File(string));
                return;
            }
            aVar.f(new FileNotFoundException("Failed to find file path for: " + this.f41370c));
        }
    }

    public l(Context context) {
        this.f41366a = context;
    }

    @Override // com.bumptech.glide.load.model.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<File> a(@n0 Uri uri, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) {
        return new o.a<>(new com.bumptech.glide.signature.e(uri), new b(this.f41366a, uri));
    }

    @Override // com.bumptech.glide.load.model.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@n0 Uri uri) {
        return com.bumptech.glide.load.data.mediastore.b.c(uri);
    }
}
