package com.tencent.cos.xml.model.tag.eventstreaming;

import com.tencent.cos.xml.s3.Base64;
import com.tencent.cos.xml.s3.Base64Codec;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Date;
import java.util.UUID;
import kotlin.text.y;

/* JADX INFO: loaded from: classes4.dex */
public abstract class HeaderValue {

    /* JADX INFO: renamed from: com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$cos$xml$model$tag$eventstreaming$HeaderType;

        static {
            int[] iArr = new int[HeaderType.values().length];
            $SwitchMap$com$tencent$cos$xml$model$tag$eventstreaming$HeaderType = iArr;
            try {
                iArr[HeaderType.TRUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$model$tag$eventstreaming$HeaderType[HeaderType.FALSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$model$tag$eventstreaming$HeaderType[HeaderType.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$model$tag$eventstreaming$HeaderType[HeaderType.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$model$tag$eventstreaming$HeaderType[HeaderType.INTEGER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$model$tag$eventstreaming$HeaderType[HeaderType.LONG.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$model$tag$eventstreaming$HeaderType[HeaderType.BYTE_ARRAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$model$tag$eventstreaming$HeaderType[HeaderType.STRING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$model$tag$eventstreaming$HeaderType[HeaderType.TIMESTAMP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$model$tag$eventstreaming$HeaderType[HeaderType.UUID.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static final class BooleanValue extends HeaderValue {
        private final boolean value;

        private BooleanValue(boolean z10) {
            this.value = z10;
        }

        /* synthetic */ BooleanValue(boolean z10, AnonymousClass1 anonymousClass1) {
            this(z10);
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        void encodeValue(DataOutputStream dataOutputStream) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && BooleanValue.class == obj.getClass() && this.value == ((BooleanValue) obj).value;
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        public boolean getBoolean() {
            return this.value;
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        public HeaderType getType() {
            return this.value ? HeaderType.TRUE : HeaderType.FALSE;
        }

        public int hashCode() {
            return this.value ? 1 : 0;
        }

        public String toString() {
            return String.valueOf(this.value);
        }
    }

    public static final class ByteArrayValue extends HeaderValue {
        private Base64Codec codec;
        private final byte[] value;

        private ByteArrayValue(byte[] bArr) {
            this.value = (byte[]) ValidationUtils.assertNotNull(bArr, "value");
        }

        /* synthetic */ ByteArrayValue(byte[] bArr, AnonymousClass1 anonymousClass1) {
            this(bArr);
        }

        private String toStringDirect(byte[] bArr) {
            char[] cArr = new char[bArr.length];
            int length = bArr.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                cArr[i11] = (char) bArr[i10];
                i10++;
                i11++;
            }
            return new String(cArr);
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        void encodeValue(DataOutputStream dataOutputStream) throws IOException {
            Utils.writeBytes(dataOutputStream, this.value);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || ByteArrayValue.class != obj.getClass()) {
                return false;
            }
            return Arrays.equals(this.value, ((ByteArrayValue) obj).value);
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        public byte[] getByteArray() {
            return this.value;
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        public HeaderType getType() {
            return HeaderType.BYTE_ARRAY;
        }

        public int hashCode() {
            return Arrays.hashCode(this.value);
        }

        public String toString() {
            return Base64.encodeAsString(this.value);
        }
    }

    public static final class ByteValue extends HeaderValue {
        private final byte value;

        private ByteValue(byte b10) {
            this.value = b10;
        }

        /* synthetic */ ByteValue(byte b10, AnonymousClass1 anonymousClass1) {
            this(b10);
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        void encodeValue(DataOutputStream dataOutputStream) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && ByteValue.class == obj.getClass() && this.value == ((ByteValue) obj).value;
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        public byte getByte() {
            return this.value;
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        public HeaderType getType() {
            return HeaderType.BYTE;
        }

        public int hashCode() {
            return this.value;
        }

        public String toString() {
            return String.valueOf((int) this.value);
        }
    }

    public static final class IntegerValue extends HeaderValue {
        private final int value;

        private IntegerValue(int i10) {
            this.value = i10;
        }

        /* synthetic */ IntegerValue(int i10, AnonymousClass1 anonymousClass1) {
            this(i10);
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        void encodeValue(DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeInt(this.value);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && IntegerValue.class == obj.getClass() && this.value == ((IntegerValue) obj).value;
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        public int getInteger() {
            return this.value;
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        public HeaderType getType() {
            return HeaderType.INTEGER;
        }

        public int hashCode() {
            return this.value;
        }

        public String toString() {
            return String.valueOf(this.value);
        }
    }

    public static final class LongValue extends HeaderValue {
        private final long value;

        private LongValue(long j10) {
            this.value = j10;
        }

        /* synthetic */ LongValue(long j10, AnonymousClass1 anonymousClass1) {
            this(j10);
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        void encodeValue(DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeLong(this.value);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && LongValue.class == obj.getClass() && this.value == ((LongValue) obj).value;
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        public long getLong() {
            return this.value;
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        public HeaderType getType() {
            return HeaderType.LONG;
        }

        public int hashCode() {
            long j10 = this.value;
            return (int) (j10 ^ (j10 >>> 32));
        }

        public String toString() {
            return String.valueOf(this.value);
        }
    }

    public static final class ShortValue extends HeaderValue {
        private final short value;

        private ShortValue(short s10) {
            this.value = s10;
        }

        /* synthetic */ ShortValue(short s10, AnonymousClass1 anonymousClass1) {
            this(s10);
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        void encodeValue(DataOutputStream dataOutputStream) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && ShortValue.class == obj.getClass() && this.value == ((ShortValue) obj).value;
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        public short getShort() {
            return this.value;
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        public HeaderType getType() {
            return HeaderType.SHORT;
        }

        public int hashCode() {
            return this.value;
        }

        public String toString() {
            return String.valueOf((int) this.value);
        }
    }

    public static final class StringValue extends HeaderValue {
        private final String value;

        private StringValue(String str) {
            this.value = (String) ValidationUtils.assertNotNull(str, "value");
        }

        /* synthetic */ StringValue(String str, AnonymousClass1 anonymousClass1) {
            this(str);
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        void encodeValue(DataOutputStream dataOutputStream) throws IOException {
            Utils.writeString(dataOutputStream, this.value);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || StringValue.class != obj.getClass()) {
                return false;
            }
            return this.value.equals(((StringValue) obj).value);
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        public String getString() {
            return this.value;
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        public HeaderType getType() {
            return HeaderType.STRING;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return y.f128593b + this.value + y.f128593b;
        }
    }

    public static final class TimestampValue extends HeaderValue {
        private final Date value;

        private TimestampValue(Date date) {
            this.value = (Date) ValidationUtils.assertNotNull(date, "value");
        }

        /* synthetic */ TimestampValue(Date date, AnonymousClass1 anonymousClass1) {
            this(date);
        }

        static TimestampValue decode(ByteBuffer byteBuffer) {
            return new TimestampValue(new Date(byteBuffer.getLong()));
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        void encodeValue(DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeLong(this.value.getTime());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || TimestampValue.class != obj.getClass()) {
                return false;
            }
            return this.value.equals(((TimestampValue) obj).value);
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        public long getTimestamp() {
            return this.value.getTime();
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        public HeaderType getType() {
            return HeaderType.TIMESTAMP;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return this.value.toString();
        }
    }

    public static final class UuidValue extends HeaderValue {
        private final UUID value;

        private UuidValue(UUID uuid) {
            this.value = (UUID) ValidationUtils.assertNotNull(uuid, "value");
        }

        /* synthetic */ UuidValue(UUID uuid, AnonymousClass1 anonymousClass1) {
            this(uuid);
        }

        static UuidValue decode(ByteBuffer byteBuffer) {
            return new UuidValue(new UUID(byteBuffer.getLong(), byteBuffer.getLong()));
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        void encodeValue(DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeLong(this.value.getMostSignificantBits());
            dataOutputStream.writeLong(this.value.getLeastSignificantBits());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || UuidValue.class != obj.getClass()) {
                return false;
            }
            return this.value.equals(((UuidValue) obj).value);
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        public HeaderType getType() {
            return HeaderType.UUID;
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        public UUID getUuid() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return this.value.toString();
        }
    }

    protected HeaderValue() {
    }

    static HeaderValue decode(ByteBuffer byteBuffer) {
        AnonymousClass1 anonymousClass1 = null;
        switch (AnonymousClass1.$SwitchMap$com$tencent$cos$xml$model$tag$eventstreaming$HeaderType[HeaderType.fromTypeId(byteBuffer.get()).ordinal()]) {
            case 1:
                return new BooleanValue(true, anonymousClass1);
            case 2:
                return new BooleanValue(false, anonymousClass1);
            case 3:
                return new ByteValue(byteBuffer.get(), anonymousClass1);
            case 4:
                return new ShortValue(byteBuffer.getShort(), anonymousClass1);
            case 5:
                return fromInteger(byteBuffer.getInt());
            case 6:
                return new LongValue(byteBuffer.getLong(), anonymousClass1);
            case 7:
                return fromByteArray(Utils.readBytes(byteBuffer));
            case 8:
                try {
                    return fromString(Utils.readString(byteBuffer));
                } catch (UnsupportedEncodingException e10) {
                    e10.printStackTrace();
                    throw new IllegalStateException();
                }
            case 9:
                return TimestampValue.decode(byteBuffer);
            case 10:
                return UuidValue.decode(byteBuffer);
            default:
                throw new IllegalStateException();
        }
    }

    public static HeaderValue fromBoolean(boolean z10) {
        return new BooleanValue(z10, null);
    }

    public static HeaderValue fromByte(byte b10) {
        return new ByteValue(b10, null);
    }

    public static HeaderValue fromByteArray(byte[] bArr) {
        return new ByteArrayValue(bArr, null);
    }

    public static HeaderValue fromByteBuffer(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byte[] bArr = new byte[byteBufferDuplicate.remaining()];
        byteBufferDuplicate.get(bArr);
        return fromByteArray(bArr);
    }

    public static HeaderValue fromDate(Date date) {
        return new TimestampValue(date, null);
    }

    public static HeaderValue fromInteger(int i10) {
        return new IntegerValue(i10, null);
    }

    public static HeaderValue fromLong(long j10) {
        return new LongValue(j10, null);
    }

    public static HeaderValue fromShort(short s10) {
        return new ShortValue(s10, null);
    }

    public static HeaderValue fromString(String str) {
        return new StringValue(str, null);
    }

    public static HeaderValue fromTimestamp(long j10) {
        return new TimestampValue(new Date(j10), null);
    }

    public static HeaderValue fromUuid(UUID uuid) {
        return new UuidValue(uuid, null);
    }

    void encode(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(getType().headerTypeId);
        encodeValue(dataOutputStream);
    }

    abstract void encodeValue(DataOutputStream dataOutputStream) throws IOException;

    public boolean getBoolean() {
        throw new IllegalStateException();
    }

    public byte getByte() {
        throw new IllegalStateException("Expected byte, but type was " + getType().name());
    }

    public byte[] getByteArray() {
        throw new IllegalStateException();
    }

    public final ByteBuffer getByteBuffer() {
        return ByteBuffer.wrap(getByteArray());
    }

    public Date getDate() {
        return new Date(getTimestamp());
    }

    public int getInteger() {
        throw new IllegalStateException("Expected integer, but type was " + getType().name());
    }

    public long getLong() {
        throw new IllegalStateException("Expected long, but type was " + getType().name());
    }

    public short getShort() {
        throw new IllegalStateException("Expected short, but type was " + getType().name());
    }

    public String getString() {
        throw new IllegalStateException();
    }

    public long getTimestamp() {
        throw new IllegalStateException("Expected timestamp, but type was " + getType().name());
    }

    public abstract HeaderType getType();

    public UUID getUuid() {
        throw new IllegalStateException("Expected UUID, but type was " + getType().name());
    }
}
