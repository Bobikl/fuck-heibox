package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.n0;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;

/* JADX INFO: compiled from: AssetPathFetcher.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b<T> implements d<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f40837e = "AssetPathFetcher";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f40838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AssetManager f40839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private T f40840d;

    public b(AssetManager assetManager, String str) {
        this.f40839c = assetManager;
        this.f40838b = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        T t10 = this.f40840d;
        if (t10 == null) {
            return;
        }
        try {
            e(t10);
        } catch (IOException unused) {
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
    public void d(@n0 Priority priority, @n0 d.a<? super T> aVar) {
        try {
            T tF = f(this.f40839c, this.f40838b);
            this.f40840d = tF;
            aVar.e(tF);
        } catch (IOException e10) {
            if (Log.isLoggable(f40837e, 3)) {
                Log.d(f40837e, "Failed to load data from asset manager", e10);
            }
            aVar.f(e10);
        }
    }

    protected abstract void e(T t10) throws IOException;

    protected abstract T f(AssetManager assetManager, String str) throws IOException;
}
