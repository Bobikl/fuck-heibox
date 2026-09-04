package pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import androidx.annotation.f0;
import androidx.annotation.p0;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import okhttp3.internal.ws.WebSocketProtocol;
import pl.droidsonroids.gif.f;

/* JADX INFO: compiled from: GifDrawableInit.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class f<T extends f<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k f138363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f138364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ScheduledThreadPoolExecutor f138365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f138366d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f138367e = new g();

    public d a() throws IOException {
        k kVar = this.f138363a;
        if (kVar != null) {
            return kVar.a(this.f138364b, this.f138365c, this.f138366d, this.f138367e);
        }
        throw new NullPointerException("Source is not set");
    }

    public T b(ContentResolver contentResolver, Uri uri) {
        this.f138363a = new k.j(contentResolver, uri);
        return (T) t();
    }

    public T c(AssetFileDescriptor assetFileDescriptor) {
        this.f138363a = new k.b(assetFileDescriptor);
        return (T) t();
    }

    public T d(AssetManager assetManager, String str) {
        this.f138363a = new k.c(assetManager, str);
        return (T) t();
    }

    public T e(Resources resources, int i10) {
        this.f138363a = new k.i(resources, i10);
        return (T) t();
    }

    public T f(File file) {
        this.f138363a = new k.g(file);
        return (T) t();
    }

    public T g(FileDescriptor fileDescriptor) {
        this.f138363a = new k.f(fileDescriptor);
        return (T) t();
    }

    public T h(InputStream inputStream) {
        this.f138363a = new k.h(inputStream);
        return (T) t();
    }

    public T i(String str) {
        this.f138363a = new k.g(str);
        return (T) t();
    }

    public T j(ByteBuffer byteBuffer) {
        this.f138363a = new k.e(byteBuffer);
        return (T) t();
    }

    public T k(byte[] bArr) {
        this.f138363a = new k.d(bArr);
        return (T) t();
    }

    public ScheduledThreadPoolExecutor l() {
        return this.f138365c;
    }

    public k m() {
        return this.f138363a;
    }

    public d n() {
        return this.f138364b;
    }

    public g o() {
        return this.f138367e;
    }

    public boolean p() {
        return this.f138366d;
    }

    @jl.a
    public T q(@p0 g gVar) {
        this.f138367e.b(gVar);
        return (T) t();
    }

    public T r(boolean z10) {
        this.f138366d = z10;
        return (T) t();
    }

    public T s(@f0(from = 1, to = WebSocketProtocol.PAYLOAD_SHORT_MAX) int i10) {
        this.f138367e.d(i10);
        return (T) t();
    }

    protected abstract T t();

    public T u(boolean z10) {
        return (T) r(z10);
    }

    public T v(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f138365c = scheduledThreadPoolExecutor;
        return (T) t();
    }

    public T w(int i10) {
        this.f138365c = new ScheduledThreadPoolExecutor(i10);
        return (T) t();
    }

    public T x(d dVar) {
        this.f138364b = dVar;
        return (T) t();
    }
}
