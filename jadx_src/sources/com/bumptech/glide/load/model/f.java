package com.bumptech.glide.load.model;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: DirectResourceLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public final class f<DataT> implements o<Integer, DataT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f41331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e<DataT> f41332b;

    /* JADX INFO: compiled from: DirectResourceLoader.java */
    public static final class a implements p<Integer, AssetFileDescriptor>, e<AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f41333a;

        a(Context context) {
            this.f41333a = context;
        }

        @Override // com.bumptech.glide.load.model.f.e
        public Class<AssetFileDescriptor> a() {
            return AssetFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.model.p
        public void c() {
        }

        @Override // com.bumptech.glide.load.model.p
        @n0
        public o<Integer, AssetFileDescriptor> d(@n0 s sVar) {
            return new f(this.f41333a, this);
        }

        @Override // com.bumptech.glide.load.model.f.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void close(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // com.bumptech.glide.load.model.f.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public AssetFileDescriptor b(@p0 Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResourceFd(i10);
        }
    }

    /* JADX INFO: compiled from: DirectResourceLoader.java */
    public static final class b implements p<Integer, Drawable>, e<Drawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f41334a;

        b(Context context) {
            this.f41334a = context;
        }

        @Override // com.bumptech.glide.load.model.f.e
        public Class<Drawable> a() {
            return Drawable.class;
        }

        @Override // com.bumptech.glide.load.model.p
        public void c() {
        }

        @Override // com.bumptech.glide.load.model.p
        @n0
        public o<Integer, Drawable> d(@n0 s sVar) {
            return new f(this.f41334a, this);
        }

        @Override // com.bumptech.glide.load.model.f.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void close(Drawable drawable) throws IOException {
        }

        @Override // com.bumptech.glide.load.model.f.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Drawable b(@p0 Resources.Theme theme, Resources resources, int i10) {
            return com.bumptech.glide.load.resource.drawable.c.a(this.f41334a, i10, theme);
        }
    }

    /* JADX INFO: compiled from: DirectResourceLoader.java */
    public static final class c implements p<Integer, InputStream>, e<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f41335a;

        c(Context context) {
            this.f41335a = context;
        }

        @Override // com.bumptech.glide.load.model.f.e
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.model.p
        public void c() {
        }

        @Override // com.bumptech.glide.load.model.p
        @n0
        public o<Integer, InputStream> d(@n0 s sVar) {
            return new f(this.f41335a, this);
        }

        @Override // com.bumptech.glide.load.model.f.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void close(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // com.bumptech.glide.load.model.f.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public InputStream b(@p0 Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResource(i10);
        }
    }

    /* JADX INFO: compiled from: DirectResourceLoader.java */
    public static final class d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private final Resources.Theme f41336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Resources f41337c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final e<DataT> f41338d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f41339e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        private DataT f41340f;

        d(@p0 Resources.Theme theme, Resources resources, e<DataT> eVar, int i10) {
            this.f41336b = theme;
            this.f41337c = resources;
            this.f41338d = eVar;
            this.f41339e = i10;
        }

        @Override // com.bumptech.glide.load.data.d
        @n0
        public Class<DataT> a() {
            return this.f41338d.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            DataT datat = this.f41340f;
            if (datat != null) {
                try {
                    this.f41338d.close(datat);
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

        /* JADX WARN: Type inference failed for: r4v3, types: [DataT, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public void d(@n0 Priority priority, @n0 com.bumptech.glide.load.data.d.a<? super DataT> aVar) {
            try {
                DataT datatB = this.f41338d.b(this.f41336b, this.f41337c, this.f41339e);
                this.f41340f = datatB;
                aVar.e(datatB);
            } catch (Resources.NotFoundException e10) {
                aVar.f(e10);
            }
        }
    }

    /* JADX INFO: compiled from: DirectResourceLoader.java */
    public interface e<DataT> {
        Class<DataT> a();

        DataT b(@p0 Resources.Theme theme, Resources resources, int i10);

        void close(DataT datat) throws IOException;
    }

    f(Context context, e<DataT> eVar) {
        this.f41331a = context.getApplicationContext();
        this.f41332b = eVar;
    }

    public static p<Integer, AssetFileDescriptor> c(Context context) {
        return new a(context);
    }

    public static p<Integer, Drawable> e(Context context) {
        return new b(context);
    }

    public static p<Integer, InputStream> g(Context context) {
        return new c(context);
    }

    @Override // com.bumptech.glide.load.model.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public o.a<DataT> a(@n0 Integer num, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) {
        Resources.Theme theme = (Resources.Theme) fVar.c(com.bumptech.glide.load.resource.drawable.g.f41650b);
        return new o.a<>(new com.bumptech.glide.signature.e(num), new d(theme, theme != null ? theme.getResources() : this.f41331a.getResources(), this.f41332b, num.intValue()));
    }

    @Override // com.bumptech.glide.load.model.o
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean b(@n0 Integer num) {
        return true;
    }
}
