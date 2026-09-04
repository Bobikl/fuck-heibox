package pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.view.Surface;
import androidx.annotation.f0;
import androidx.annotation.w0;
import androidx.annotation.x;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.text.y;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
public final class GifInfoHandle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile long f138317a;

    static {
        m.c();
    }

    GifInfoHandle() {
    }

    GifInfoHandle(AssetFileDescriptor assetFileDescriptor) throws IOException {
        try {
            this.f138317a = x(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), false);
        } finally {
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    GifInfoHandle(FileDescriptor fileDescriptor) throws GifIOException {
        this.f138317a = x(fileDescriptor, 0L, true);
    }

    GifInfoHandle(InputStream inputStream) throws GifIOException {
        if (!inputStream.markSupported()) {
            throw new IllegalArgumentException("InputStream does not support marking");
        }
        this.f138317a = openStream(inputStream);
    }

    GifInfoHandle(String str) throws GifIOException {
        this.f138317a = openFile(str);
    }

    GifInfoHandle(ByteBuffer byteBuffer) throws GifIOException {
        this.f138317a = openDirectByteBuffer(byteBuffer);
    }

    GifInfoHandle(byte[] bArr) throws GifIOException {
        this.f138317a = openByteArray(bArr);
    }

    private void O(@f0(from = 0) int i10) {
        int numberOfFrames = getNumberOfFrames(this.f138317a);
        if (i10 < 0 || i10 >= numberOfFrames) {
            throw new IndexOutOfBoundsException("Frame index is not in range <0;" + numberOfFrames + y.f128597f);
        }
    }

    private static native void bindSurface(long j10, Surface surface, long[] jArr);

    static native int createTempNativeFileDescriptor() throws GifIOException;

    static native int extractNativeFileDescriptor(FileDescriptor fileDescriptor, boolean z10) throws GifIOException;

    private static native void free(long j10);

    private static native long getAllocationByteCount(long j10);

    private static native String getComment(long j10);

    private static native int getCurrentFrameIndex(long j10);

    private static native int getCurrentLoop(long j10);

    private static native int getCurrentPosition(long j10);

    private static native int getDuration(long j10);

    private static native int getFrameDuration(long j10, int i10);

    private static native int getHeight(long j10);

    private static native int getLoopCount(long j10);

    private static native long getMetadataByteCount(long j10);

    private static native int getNativeErrorCode(long j10);

    private static native int getNumberOfFrames(long j10);

    private static native long[] getSavedState(long j10);

    private static native long getSourceLength(long j10);

    private static native int getWidth(long j10);

    private static native void glTexImage2D(long j10, int i10, int i11);

    private static native void glTexSubImage2D(long j10, int i10, int i11);

    private static native void initTexImageDescriptor(long j10);

    private static native boolean isAnimationCompleted(long j10);

    private static native boolean isOpaque(long j10);

    @w0(21)
    private static int m(FileDescriptor fileDescriptor, boolean z10) throws GifIOException, ErrnoException {
        try {
            int iCreateTempNativeFileDescriptor = createTempNativeFileDescriptor();
            Os.dup2(fileDescriptor, iCreateTempNativeFileDescriptor);
            return iCreateTempNativeFileDescriptor;
        } finally {
            if (z10) {
                Os.close(fileDescriptor);
            }
        }
    }

    static native long openByteArray(byte[] bArr) throws GifIOException;

    static native long openDirectByteBuffer(ByteBuffer byteBuffer) throws GifIOException;

    static native long openFile(String str) throws GifIOException;

    static native long openNativeFileDescriptor(int i10, long j10) throws GifIOException;

    static native long openStream(InputStream inputStream) throws GifIOException;

    private static native void postUnbindSurface(long j10);

    private static native long renderFrame(long j10, Bitmap bitmap);

    private static native boolean reset(long j10);

    private static native long restoreRemainder(long j10);

    private static native int restoreSavedState(long j10, long[] jArr, Bitmap bitmap);

    private static native void saveRemainder(long j10);

    private static native void seekToFrame(long j10, int i10, Bitmap bitmap);

    private static native void seekToFrameGL(long j10, int i10);

    private static native void seekToTime(long j10, int i10, Bitmap bitmap);

    private static native void setLoopCount(long j10, char c10);

    private static native void setOptions(long j10, char c10, boolean z10);

    private static native void setSpeedFactor(long j10, float f10);

    private static native void startDecoderThread(long j10);

    private static native void stopDecoderThread(long j10);

    private static long x(FileDescriptor fileDescriptor, long j10, boolean z10) throws GifIOException {
        int iM;
        if (Build.VERSION.SDK_INT > 27) {
            try {
                iM = m(fileDescriptor, z10);
            } catch (Exception e10) {
                throw new GifIOException(GifError.OPEN_FAILED.errorCode, e10.getMessage());
            }
        } else {
            iM = extractNativeFileDescriptor(fileDescriptor, z10);
        }
        return openNativeFileDescriptor(iM, j10);
    }

    static GifInfoHandle y(ContentResolver contentResolver, Uri uri) throws IOException {
        if ("file".equals(uri.getScheme())) {
            return new GifInfoHandle(uri.getPath());
        }
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            return new GifInfoHandle(assetFileDescriptorOpenAssetFileDescriptor);
        }
        throw new IOException("Could not open AssetFileDescriptor for " + uri);
    }

    synchronized void A() {
        free(this.f138317a);
        this.f138317a = 0L;
    }

    synchronized long B(Bitmap bitmap) {
        return renderFrame(this.f138317a, bitmap);
    }

    synchronized boolean C() {
        return reset(this.f138317a);
    }

    synchronized long D() {
        return restoreRemainder(this.f138317a);
    }

    synchronized int E(long[] jArr, Bitmap bitmap) {
        return restoreSavedState(this.f138317a, jArr, bitmap);
    }

    synchronized void F() {
        saveRemainder(this.f138317a);
    }

    synchronized void G(@f0(from = 0, to = 2147483647L) int i10, Bitmap bitmap) {
        seekToFrame(this.f138317a, i10, bitmap);
    }

    void H(@f0(from = 0) int i10) {
        O(i10);
        seekToFrameGL(this.f138317a, i10);
    }

    synchronized void I(@f0(from = 0, to = 2147483647L) int i10, Bitmap bitmap) {
        seekToTime(this.f138317a, i10, bitmap);
    }

    void J(@f0(from = 0, to = WebSocketProtocol.PAYLOAD_SHORT_MAX) int i10) {
        if (i10 < 0 || i10 > 65535) {
            throw new IllegalArgumentException("Loop count of range <0, 65535>");
        }
        synchronized (this) {
            setLoopCount(this.f138317a, (char) i10);
        }
    }

    void K(char c10, boolean z10) {
        setOptions(this.f138317a, c10, z10);
    }

    void L(@x(from = 0.0d, fromInclusive = false) float f10) {
        if (f10 <= 0.0f || Float.isNaN(f10)) {
            throw new IllegalArgumentException("Speed factor is not positive");
        }
        if (f10 < 4.656613E-10f) {
            f10 = 4.656613E-10f;
        }
        synchronized (this) {
            setSpeedFactor(this.f138317a, f10);
        }
    }

    void M() {
        startDecoderThread(this.f138317a);
    }

    void N() {
        stopDecoderThread(this.f138317a);
    }

    void a(Surface surface, long[] jArr) {
        bindSurface(this.f138317a, surface, jArr);
    }

    synchronized long b() {
        return getAllocationByteCount(this.f138317a);
    }

    synchronized String c() {
        return getComment(this.f138317a);
    }

    synchronized int d() {
        return getCurrentFrameIndex(this.f138317a);
    }

    synchronized int e() {
        return getCurrentLoop(this.f138317a);
    }

    synchronized int f() {
        return getCurrentPosition(this.f138317a);
    }

    protected void finalize() throws Throwable {
        try {
            A();
        } finally {
            super.finalize();
        }
    }

    synchronized int g() {
        return getDuration(this.f138317a);
    }

    synchronized int h(@f0(from = 0) int i10) {
        O(i10);
        return getFrameDuration(this.f138317a, i10);
    }

    synchronized int i() {
        return getHeight(this.f138317a);
    }

    synchronized int j() {
        return getLoopCount(this.f138317a);
    }

    synchronized long k() {
        return getMetadataByteCount(this.f138317a);
    }

    synchronized int l() {
        return getNativeErrorCode(this.f138317a);
    }

    synchronized int n() {
        return getNumberOfFrames(this.f138317a);
    }

    synchronized long[] o() {
        return getSavedState(this.f138317a);
    }

    synchronized long p() {
        return getSourceLength(this.f138317a);
    }

    synchronized int q() {
        return getWidth(this.f138317a);
    }

    void r(int i10, int i11) {
        glTexImage2D(this.f138317a, i10, i11);
    }

    void s(int i10, int i11) {
        glTexSubImage2D(this.f138317a, i10, i11);
    }

    void t() {
        initTexImageDescriptor(this.f138317a);
    }

    synchronized boolean u() {
        return isAnimationCompleted(this.f138317a);
    }

    synchronized boolean v() {
        return isOpaque(this.f138317a);
    }

    synchronized boolean w() {
        return this.f138317a == 0;
    }

    synchronized void z() {
        postUnbindSurface(this.f138317a);
    }
}
