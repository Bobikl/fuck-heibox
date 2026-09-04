package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.n0;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: LocalUriFetcher.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class l<T> implements d<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f40868e = "LocalUriFetcher";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f40869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ContentResolver f40870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private T f40871d;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f40870c = contentResolver;
        this.f40869b = uri;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        T t10 = this.f40871d;
        if (t10 != null) {
            try {
                e(t10);
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
    public final void d(@n0 Priority priority, @n0 d.a<? super T> aVar) {
        try {
            T tF = f(this.f40869b, this.f40870c);
            this.f40871d = tF;
            aVar.e(tF);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable(f40868e, 3)) {
                Log.d(f40868e, "Failed to open Uri", e10);
            }
            aVar.f(e10);
        }
    }

    protected abstract void e(T t10) throws IOException;

    protected abstract T f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;
}
