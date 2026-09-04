package pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.u0;
import androidx.annotation.v;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: compiled from: InputSource.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class k {

    /* JADX INFO: compiled from: InputSource.java */
    public static class b extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AssetFileDescriptor f138378a;

        public b(@n0 AssetFileDescriptor assetFileDescriptor) {
            super();
            this.f138378a = assetFileDescriptor;
        }

        @Override // pl.droidsonroids.gif.k
        GifInfoHandle c() throws IOException {
            return new GifInfoHandle(this.f138378a);
        }
    }

    /* JADX INFO: compiled from: InputSource.java */
    public static final class c extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AssetManager f138379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f138380b;

        public c(@n0 AssetManager assetManager, @n0 String str) {
            super();
            this.f138379a = assetManager;
            this.f138380b = str;
        }

        @Override // pl.droidsonroids.gif.k
        GifInfoHandle c() throws IOException {
            return new GifInfoHandle(this.f138379a.openFd(this.f138380b));
        }
    }

    /* JADX INFO: compiled from: InputSource.java */
    public static final class d extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f138381a;

        public d(@n0 byte[] bArr) {
            super();
            this.f138381a = bArr;
        }

        @Override // pl.droidsonroids.gif.k
        GifInfoHandle c() throws GifIOException {
            return new GifInfoHandle(this.f138381a);
        }
    }

    /* JADX INFO: compiled from: InputSource.java */
    public static final class e extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f138382a;

        public e(@n0 ByteBuffer byteBuffer) {
            super();
            this.f138382a = byteBuffer;
        }

        @Override // pl.droidsonroids.gif.k
        GifInfoHandle c() throws GifIOException {
            return new GifInfoHandle(this.f138382a);
        }
    }

    /* JADX INFO: compiled from: InputSource.java */
    public static final class f extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FileDescriptor f138383a;

        public f(@n0 FileDescriptor fileDescriptor) {
            super();
            this.f138383a = fileDescriptor;
        }

        @Override // pl.droidsonroids.gif.k
        GifInfoHandle c() throws IOException {
            return new GifInfoHandle(this.f138383a);
        }
    }

    /* JADX INFO: compiled from: InputSource.java */
    public static final class g extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f138384a;

        public g(@n0 File file) {
            super();
            this.f138384a = file.getPath();
        }

        public g(@n0 String str) {
            super();
            this.f138384a = str;
        }

        @Override // pl.droidsonroids.gif.k
        GifInfoHandle c() throws GifIOException {
            return new GifInfoHandle(this.f138384a);
        }
    }

    /* JADX INFO: compiled from: InputSource.java */
    public static final class h extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InputStream f138385a;

        public h(@n0 InputStream inputStream) {
            super();
            this.f138385a = inputStream;
        }

        @Override // pl.droidsonroids.gif.k
        GifInfoHandle c() throws IOException {
            return new GifInfoHandle(this.f138385a);
        }
    }

    /* JADX INFO: compiled from: InputSource.java */
    public static class i extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources f138386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f138387b;

        public i(@n0 Resources resources, @u0 @v int i10) {
            super();
            this.f138386a = resources;
            this.f138387b = i10;
        }

        @Override // pl.droidsonroids.gif.k
        GifInfoHandle c() throws IOException {
            return new GifInfoHandle(this.f138386a.openRawResourceFd(this.f138387b));
        }
    }

    /* JADX INFO: compiled from: InputSource.java */
    public static final class j extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f138388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f138389b;

        public j(@p0 ContentResolver contentResolver, @n0 Uri uri) {
            super();
            this.f138388a = contentResolver;
            this.f138389b = uri;
        }

        @Override // pl.droidsonroids.gif.k
        GifInfoHandle c() throws IOException {
            return GifInfoHandle.y(this.f138388a, this.f138389b);
        }
    }

    private k() {
    }

    final pl.droidsonroids.gif.d a(pl.droidsonroids.gif.d dVar, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, boolean z10, pl.droidsonroids.gif.g gVar) throws IOException {
        return new pl.droidsonroids.gif.d(b(gVar), dVar, scheduledThreadPoolExecutor, z10);
    }

    final GifInfoHandle b(@n0 pl.droidsonroids.gif.g gVar) throws IOException {
        GifInfoHandle gifInfoHandleC = c();
        gifInfoHandleC.K(gVar.f138368a, gVar.f138369b);
        return gifInfoHandleC;
    }

    abstract GifInfoHandle c() throws IOException;
}
