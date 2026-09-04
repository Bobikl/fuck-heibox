package w6;

import androidx.annotation.n0;
import com.bumptech.glide.load.data.e;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: ByteBufferRewinder.java */
/* JADX INFO: loaded from: classes6.dex */
public class a implements e<ByteBuffer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f140999a;

    /* JADX INFO: renamed from: w6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ByteBufferRewinder.java */
    public static class C1275a implements e.a<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.e.a
        @n0
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        @n0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public e<ByteBuffer> b(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.f140999a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
    }

    @Override // com.bumptech.glide.load.data.e
    @n0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ByteBuffer a() {
        this.f140999a.position(0);
        return this.f140999a;
    }
}
