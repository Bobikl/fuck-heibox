package xyz.luan.audioplayers;

import android.media.MediaDataSource;
import androidx.annotation.w0;
import androidx.constraintlayout.core.motion.utils.w;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ByteDataSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@w0(23)
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J(\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lxyz/luan/audioplayers/f;", "Landroid/media/MediaDataSource;", "", UiKitSpanObj.TYPE_SIZE, "", CommonNetImpl.POSITION, ak.av, "getSize", "Lkotlin/b2;", "close", "", "buffer", w.c.R, "readAt", "b", "[B", "data", "<init>", "([B)V", "audioplayers_android_release"}, k = 1, mv = {1, 7, 1})
public final class f extends MediaDataSource {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final byte[] data;

    public f(@dl.d byte[] data) {
        f0.p(data, "data");
        this.data = data;
    }

    private final int a(int size, long position) {
        long length = size;
        long j10 = position + length;
        byte[] bArr = this.data;
        if (j10 > bArr.length) {
            length -= j10 - ((long) bArr.length);
        }
        return (int) length;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
    }

    @Override // android.media.MediaDataSource
    public synchronized long getSize() {
        return this.data.length;
    }

    @Override // android.media.MediaDataSource
    public synchronized int readAt(long position, @dl.d byte[] buffer, int offset, int size) {
        f0.p(buffer, "buffer");
        if (position >= this.data.length) {
            return -1;
        }
        int iA = a(size, position);
        System.arraycopy(this.data, (int) position, buffer, offset, iA);
        return iA;
    }
}
