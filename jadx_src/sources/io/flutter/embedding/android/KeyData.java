package io.flutter.embedding.android;

import androidx.annotation.n0;
import androidx.annotation.p0;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public class KeyData {
    private static final int BYTES_PER_FIELD = 8;
    public static final String CHANNEL = "flutter/keydata";
    private static final int FIELD_COUNT = 6;
    private static final String TAG = "KeyData";

    @p0
    String character;
    DeviceType deviceType;
    long logicalKey;
    long physicalKey;
    boolean synthesized;
    long timestamp;
    Type type;

    public enum DeviceType {
        kKeyboard(0),
        kDirectionalPad(1),
        kGamepad(2),
        kJoystick(3),
        kHdmi(4);

        private final long value;

        DeviceType(long j10) {
            this.value = j10;
        }

        static DeviceType fromLong(long j10) {
            int i10 = (int) j10;
            if (i10 == 0) {
                return kKeyboard;
            }
            if (i10 == 1) {
                return kDirectionalPad;
            }
            if (i10 == 2) {
                return kGamepad;
            }
            if (i10 == 3) {
                return kJoystick;
            }
            if (i10 == 4) {
                return kHdmi;
            }
            throw new AssertionError("Unexpected DeviceType value");
        }

        public long getValue() {
            return this.value;
        }
    }

    public enum Type {
        kDown(0),
        kUp(1),
        kRepeat(2);

        private long value;

        Type(long j10) {
            this.value = j10;
        }

        static Type fromLong(long j10) {
            int i10 = (int) j10;
            if (i10 == 0) {
                return kDown;
            }
            if (i10 == 1) {
                return kUp;
            }
            if (i10 == 2) {
                return kRepeat;
            }
            throw new AssertionError("Unexpected Type value");
        }

        public long getValue() {
            return this.value;
        }
    }

    public KeyData() {
    }

    public KeyData(@n0 ByteBuffer byteBuffer) {
        long j10 = byteBuffer.getLong();
        this.timestamp = byteBuffer.getLong();
        this.type = Type.fromLong(byteBuffer.getLong());
        this.physicalKey = byteBuffer.getLong();
        this.logicalKey = byteBuffer.getLong();
        this.synthesized = byteBuffer.getLong() != 0;
        this.deviceType = DeviceType.fromLong(byteBuffer.getLong());
        if (byteBuffer.remaining() != j10) {
            throw new AssertionError(String.format("Unexpected char length: charSize is %d while buffer has position %d, capacity %d, limit %d", Long.valueOf(j10), Integer.valueOf(byteBuffer.position()), Integer.valueOf(byteBuffer.capacity()), Integer.valueOf(byteBuffer.limit())));
        }
        this.character = null;
        if (j10 != 0) {
            int i10 = (int) j10;
            byte[] bArr = new byte[i10];
            byteBuffer.get(bArr, 0, i10);
            try {
                this.character = new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                throw new AssertionError("UTF-8 unsupported");
            }
        }
    }

    ByteBuffer toBytes() {
        try {
            String str = this.character;
            byte[] bytes = str == null ? null : str.getBytes("UTF-8");
            int length = bytes == null ? 0 : bytes.length;
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(length + 56);
            byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocateDirect.putLong(length);
            byteBufferAllocateDirect.putLong(this.timestamp);
            byteBufferAllocateDirect.putLong(this.type.getValue());
            byteBufferAllocateDirect.putLong(this.physicalKey);
            byteBufferAllocateDirect.putLong(this.logicalKey);
            byteBufferAllocateDirect.putLong(this.synthesized ? 1L : 0L);
            byteBufferAllocateDirect.putLong(this.deviceType.getValue());
            if (bytes != null) {
                byteBufferAllocateDirect.put(bytes);
            }
            return byteBufferAllocateDirect;
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }
}
