package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.p;
import com.bumptech.glide.load.model.s;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* JADX INFO: compiled from: QMediaStoreUriLoader.java */
/* JADX INFO: loaded from: classes6.dex */
@w0(29)
public final class f<DataT> implements o<Uri, DataT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f41412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o<File, DataT> f41413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o<Uri, DataT> f41414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Class<DataT> f41415d;

    /* JADX INFO: compiled from: QMediaStoreUriLoader.java */
    public static abstract class a<DataT> implements p<Uri, DataT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f41416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class<DataT> f41417b;

        a(Context context, Class<DataT> cls) {
            this.f41416a = context;
            this.f41417b = cls;
        }

        @Override // com.bumptech.glide.load.model.p
        public final void c() {
        }

        @Override // com.bumptech.glide.load.model.p
        @n0
        public final o<Uri, DataT> d(@n0 s sVar) {
            return new f(this.f41416a, sVar.d(File.class, this.f41417b), sVar.d(Uri.class, this.f41417b), this.f41417b);
        }
    }

    /* JADX INFO: compiled from: QMediaStoreUriLoader.java */
    @w0(29)
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* JADX INFO: compiled from: QMediaStoreUriLoader.java */
    @w0(29)
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* JADX INFO: compiled from: QMediaStoreUriLoader.java */
    public static final class d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String[] f41418l = {"_data"};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f41419b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final o<File, DataT> f41420c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final o<Uri, DataT> f41421d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Uri f41422e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f41423f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f41424g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final com.bumptech.glide.load.f f41425h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final Class<DataT> f41426i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private volatile boolean f41427j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @p0
        private volatile com.bumptech.glide.load.data.d<DataT> f41428k;

        d(Context context, o<File, DataT> oVar, o<Uri, DataT> oVar2, Uri uri, int i10, int i11, com.bumptech.glide.load.f fVar, Class<DataT> cls) {
            this.f41419b = context.getApplicationContext();
            this.f41420c = oVar;
            this.f41421d = oVar2;
            this.f41422e = uri;
            this.f41423f = i10;
            this.f41424g = i11;
            this.f41425h = fVar;
            this.f41426i = cls;
        }

        @p0
        private o.a<DataT> e() throws FileNotFoundException {
            if (Environment.isExternalStorageLegacy()) {
                return this.f41420c.a(h(this.f41422e), this.f41423f, this.f41424g, this.f41425h);
            }
            if (com.bumptech.glide.load.data.mediastore.b.a(this.f41422e)) {
                return this.f41421d.a(this.f41422e, this.f41423f, this.f41424g, this.f41425h);
            }
            return this.f41421d.a(g() ? MediaStore.setRequireOriginal(this.f41422e) : this.f41422e, this.f41423f, this.f41424g, this.f41425h);
        }

        @p0
        private com.bumptech.glide.load.data.d<DataT> f() throws FileNotFoundException {
            o.a<DataT> aVarE = e();
            if (aVarE != null) {
                return aVarE.f41380c;
            }
            return null;
        }

        private boolean g() {
            return this.f41419b.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        @n0
        private File h(Uri uri) throws FileNotFoundException {
            Cursor cursor = null;
            try {
                Cursor cursorQuery = this.f41419b.getContentResolver().query(uri, f41418l, null, null, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    cursorQuery.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } catch (Throwable th2) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th2;
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @n0
        public Class<DataT> a() {
            return this.f41426i;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            com.bumptech.glide.load.data.d<DataT> dVar = this.f41428k;
            if (dVar != null) {
                dVar.b();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @n0
        public DataSource c() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f41427j = true;
            com.bumptech.glide.load.data.d<DataT> dVar = this.f41428k;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void d(@n0 Priority priority, @n0 com.bumptech.glide.load.data.d.a<? super DataT> aVar) {
            try {
                com.bumptech.glide.load.data.d<DataT> dVarF = f();
                if (dVarF == null) {
                    aVar.f(new IllegalArgumentException("Failed to build fetcher for: " + this.f41422e));
                    return;
                }
                this.f41428k = dVarF;
                if (this.f41427j) {
                    cancel();
                } else {
                    dVarF.d(priority, aVar);
                }
            } catch (FileNotFoundException e10) {
                aVar.f(e10);
            }
        }
    }

    f(Context context, o<File, DataT> oVar, o<Uri, DataT> oVar2, Class<DataT> cls) {
        this.f41412a = context.getApplicationContext();
        this.f41413b = oVar;
        this.f41414c = oVar2;
        this.f41415d = cls;
    }

    @Override // com.bumptech.glide.load.model.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<DataT> a(@n0 Uri uri, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) {
        return new o.a<>(new com.bumptech.glide.signature.e(uri), new d(this.f41412a, this.f41413b, this.f41414c, uri, i10, i11, fVar, this.f41415d));
    }

    @Override // com.bumptech.glide.load.model.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@n0 Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && com.bumptech.glide.load.data.mediastore.b.c(uri);
    }
}
