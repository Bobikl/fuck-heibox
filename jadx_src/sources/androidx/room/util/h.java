package androidx.room.util;

import androidx.annotation.RestrictTo;
import com.umeng.analytics.pro.ak;
import java.nio.ByteBuffer;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: UUIDUtil.kt */
/* JADX INFO: loaded from: classes6.dex */
@xh.h(name = "UUIDUtil")
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"", "bytes", "Ljava/util/UUID;", ak.av, "uuid", "b", "room-runtime_release"}, k = 2, mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class h {
    @dl.d
    public static final UUID a(@dl.d byte[] bytes) {
        f0.p(bytes, "bytes");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bytes);
        return new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong());
    }

    @dl.d
    public static final byte[] b(@dl.d UUID uuid) {
        f0.p(uuid, "uuid");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[16]);
        byteBufferWrap.putLong(uuid.getMostSignificantBits());
        byteBufferWrap.putLong(uuid.getLeastSignificantBits());
        byte[] bArrArray = byteBufferWrap.array();
        f0.o(bArrArray, "buffer.array()");
        return bArrArray;
    }
}
