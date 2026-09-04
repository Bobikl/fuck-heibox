package anet.channel.bytes;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.Arrays;
import java.util.Random;
import java.util.TreeSet;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class a {
    public static final int MAX_POOL_SIZE = 524288;
    public static final String TAG = "awcn.ByteArrayPool";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TreeSet<ByteArray> f29618a = new TreeSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ByteArray f29619b = ByteArray.create(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Random f29620c = new Random();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f29621d = 0;

    /* JADX INFO: renamed from: anet.channel.bytes.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Taobao */
    public static class C0240a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static a f29622a = new a();

        C0240a() {
        }
    }

    public synchronized ByteArray a(int i10) {
        try {
            if (i10 >= 524288) {
                return ByteArray.create(i10);
            }
            ByteArray byteArray = this.f29619b;
            byteArray.bufferLength = i10;
            ByteArray byteArrayCeiling = this.f29618a.ceiling(byteArray);
            if (byteArrayCeiling == null) {
                byteArrayCeiling = ByteArray.create(i10);
            } else {
                Arrays.fill(byteArrayCeiling.buffer, (byte) 0);
                byteArrayCeiling.dataLength = 0;
                this.f29618a.remove(byteArrayCeiling);
                this.f29621d -= (long) byteArrayCeiling.bufferLength;
            }
            return byteArrayCeiling;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public ByteArray a(byte[] bArr, int i10) {
        ByteArray byteArrayA = a(i10);
        System.arraycopy(bArr, 0, byteArrayA.buffer, 0, i10);
        byteArrayA.dataLength = i10;
        return byteArrayA;
    }

    public synchronized void a(ByteArray byteArray) {
        if (byteArray != null) {
            int i10 = byteArray.bufferLength;
            if (i10 < 524288) {
                this.f29621d += (long) i10;
                this.f29618a.add(byteArray);
                while (this.f29621d > PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                    this.f29621d -= (long) (this.f29620c.nextBoolean() ? this.f29618a.pollFirst() : this.f29618a.pollLast()).bufferLength;
                }
            }
        }
    }
}
