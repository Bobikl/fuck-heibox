package pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.f0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.u0;
import androidx.annotation.v;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Locale;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
public class GifAnimationMetaData implements Serializable, Parcelable {
    public static final Parcelable.Creator<GifAnimationMetaData> CREATOR = new a();
    private static final long serialVersionUID = 5692363926580237325L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f138306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f138307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f138308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f138309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f138310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f138311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f138312h;

    public class a implements Parcelable.Creator<GifAnimationMetaData> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GifAnimationMetaData createFromParcel(Parcel parcel) {
            return new GifAnimationMetaData(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GifAnimationMetaData[] newArray(int i10) {
            return new GifAnimationMetaData[i10];
        }
    }

    public GifAnimationMetaData(@p0 ContentResolver contentResolver, @n0 Uri uri) throws IOException {
        this(GifInfoHandle.y(contentResolver, uri));
    }

    public GifAnimationMetaData(@n0 AssetFileDescriptor assetFileDescriptor) throws IOException {
        this(new GifInfoHandle(assetFileDescriptor));
    }

    public GifAnimationMetaData(@n0 AssetManager assetManager, @n0 String str) throws IOException {
        this(assetManager.openFd(str));
    }

    public GifAnimationMetaData(@n0 Resources resources, @u0 @v int i10) throws Resources.NotFoundException, IOException {
        this(resources.openRawResourceFd(i10));
    }

    private GifAnimationMetaData(Parcel parcel) {
        this.f138306b = parcel.readInt();
        this.f138307c = parcel.readInt();
        this.f138308d = parcel.readInt();
        this.f138309e = parcel.readInt();
        this.f138310f = parcel.readInt();
        this.f138312h = parcel.readLong();
        this.f138311g = parcel.readLong();
    }

    /* synthetic */ GifAnimationMetaData(Parcel parcel, a aVar) {
        this(parcel);
    }

    public GifAnimationMetaData(@n0 File file) throws IOException {
        this(file.getPath());
    }

    public GifAnimationMetaData(@n0 FileDescriptor fileDescriptor) throws IOException {
        this(new GifInfoHandle(fileDescriptor));
    }

    public GifAnimationMetaData(@n0 InputStream inputStream) throws IOException {
        this(new GifInfoHandle(inputStream));
    }

    public GifAnimationMetaData(@n0 String str) throws IOException {
        this(new GifInfoHandle(str));
    }

    public GifAnimationMetaData(@n0 ByteBuffer byteBuffer) throws IOException {
        this(new GifInfoHandle(byteBuffer));
    }

    private GifAnimationMetaData(GifInfoHandle gifInfoHandle) {
        this.f138306b = gifInfoHandle.j();
        this.f138307c = gifInfoHandle.g();
        this.f138309e = gifInfoHandle.q();
        this.f138308d = gifInfoHandle.i();
        this.f138310f = gifInfoHandle.n();
        this.f138312h = gifInfoHandle.k();
        this.f138311g = gifInfoHandle.b();
        gifInfoHandle.A();
    }

    public GifAnimationMetaData(@n0 byte[] bArr) throws IOException {
        this(new GifInfoHandle(bArr));
    }

    public long a() {
        return this.f138311g;
    }

    @jl.a
    public long b(@p0 d dVar, @f0(from = 1, to = WebSocketProtocol.PAYLOAD_SHORT_MAX) int i10) {
        if (i10 >= 1 && i10 <= 65535) {
            int i11 = i10 * i10;
            return (this.f138311g / ((long) i11)) + ((long) ((dVar == null || dVar.f138344g.isRecycled()) ? ((this.f138309e * this.f138308d) * 4) / i11 : dVar.f138344g.getAllocationByteCount()));
        }
        throw new IllegalStateException("Sample size " + i10 + " out of range <1, " + kotlin.jvm.internal.p.f124952c + ">");
    }

    public int c() {
        return this.f138307c;
    }

    public int d() {
        return this.f138306b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long f() {
        return this.f138312h;
    }

    public int getHeight() {
        return this.f138308d;
    }

    public int getWidth() {
        return this.f138309e;
    }

    public int h() {
        return this.f138310f;
    }

    public boolean j() {
        return this.f138310f > 1 && this.f138307c > 0;
    }

    @n0
    public String toString() {
        int i10 = this.f138306b;
        String str = String.format(Locale.ENGLISH, "GIF: size: %dx%d, frames: %d, loops: %s, duration: %d", Integer.valueOf(this.f138309e), Integer.valueOf(this.f138308d), Integer.valueOf(this.f138310f), i10 == 0 ? "Infinity" : Integer.toString(i10), Integer.valueOf(this.f138307c));
        if (!j()) {
            return str;
        }
        return "Animated " + str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f138306b);
        parcel.writeInt(this.f138307c);
        parcel.writeInt(this.f138308d);
        parcel.writeInt(this.f138309e);
        parcel.writeInt(this.f138310f);
        parcel.writeLong(this.f138312h);
        parcel.writeLong(this.f138311g);
    }
}
