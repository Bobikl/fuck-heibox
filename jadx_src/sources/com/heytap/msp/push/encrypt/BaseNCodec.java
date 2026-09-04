package com.heytap.msp.push.encrypt;

import mj.a;
import mj.b;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.binary.l;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseNCodec implements b, a {
    private static final int DEFAULT_BUFFER_RESIZE_FACTOR = 2;
    private static final int DEFAULT_BUFFER_SIZE = 8192;
    protected static final int MASK_8BITS = 255;
    public static final int MIME_CHUNK_SIZE = 76;
    protected static final byte PAD_DEFAULT = 61;
    public static final int PEM_CHUNK_SIZE = 64;
    protected final byte PAD = PAD_DEFAULT;
    protected byte[] buffer;
    private final int chunkSeparatorLength;
    protected int currentLinePos;
    private final int encodedBlockSize;
    protected boolean eof;
    protected final int lineLength;
    protected int modulus;
    protected int pos;
    private int readPos;
    private final int unencodedBlockSize;

    protected BaseNCodec(int i10, int i11, int i12, int i13) {
        this.unencodedBlockSize = i10;
        this.encodedBlockSize = i11;
        this.lineLength = (i12 <= 0 || i13 <= 0) ? 0 : (i12 / i11) * i11;
        this.chunkSeparatorLength = i13;
    }

    protected static boolean isWhiteSpace(byte b10) {
        return b10 == 9 || b10 == 10 || b10 == 13 || b10 == 32;
    }

    private void reset() {
        this.buffer = null;
        this.pos = 0;
        this.readPos = 0;
        this.currentLinePos = 0;
        this.modulus = 0;
        this.eof = false;
    }

    private void resizeBuffer() {
        byte[] bArr = this.buffer;
        if (bArr == null) {
            this.buffer = new byte[getDefaultBufferSize()];
            this.pos = 0;
            this.readPos = 0;
        } else {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.buffer = bArr2;
        }
    }

    int available() {
        if (this.buffer != null) {
            return this.pos - this.readPos;
        }
        return 0;
    }

    protected boolean containsAlphabetOrPad(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b10 : bArr) {
            if (61 == b10 || isInAlphabet(b10)) {
                return true;
            }
        }
        return false;
    }

    @Override // mj.d
    public Object decode(Object obj) throws DecoderException {
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        if (obj instanceof String) {
            return decode((String) obj);
        }
        throw new DecoderException("Parameter supplied to Base-N decode is not a byte[] or a String");
    }

    abstract void decode(byte[] bArr, int i10, int i11);

    public byte[] decode(String str) {
        return decode(l.g(str));
    }

    @Override // mj.a
    public byte[] decode(byte[] bArr) {
        reset();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        decode(bArr, 0, bArr.length);
        decode(bArr, 0, -1);
        int i10 = this.pos;
        byte[] bArr2 = new byte[i10];
        readResults(bArr2, 0, i10);
        return bArr2;
    }

    @Override // mj.e
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof byte[]) {
            return encode((byte[]) obj);
        }
        throw new EncoderException("Parameter supplied to Base-N encode is not a byte[]");
    }

    abstract void encode(byte[] bArr, int i10, int i11);

    @Override // mj.b
    public byte[] encode(byte[] bArr) {
        reset();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        encode(bArr, 0, bArr.length);
        encode(bArr, 0, -1);
        int i10 = this.pos - this.readPos;
        byte[] bArr2 = new byte[i10];
        readResults(bArr2, 0, i10);
        return bArr2;
    }

    public String encodeAsString(byte[] bArr) {
        return l.o(encode(bArr));
    }

    public String encodeToString(byte[] bArr) {
        return l.o(encode(bArr));
    }

    protected void ensureBufferSize(int i10) {
        byte[] bArr = this.buffer;
        if (bArr == null || bArr.length < this.pos + i10) {
            resizeBuffer();
        }
    }

    protected int getDefaultBufferSize() {
        return 8192;
    }

    public long getEncodedLength(byte[] bArr) {
        int length = bArr.length;
        int i10 = this.unencodedBlockSize;
        long j10 = ((long) (((length + i10) - 1) / i10)) * ((long) this.encodedBlockSize);
        int i11 = this.lineLength;
        return i11 > 0 ? j10 + ((((((long) i11) + j10) - 1) / ((long) i11)) * ((long) this.chunkSeparatorLength)) : j10;
    }

    boolean hasData() {
        return this.buffer != null;
    }

    protected abstract boolean isInAlphabet(byte b10);

    public boolean isInAlphabet(String str) {
        return isInAlphabet(l.g(str), true);
    }

    public boolean isInAlphabet(byte[] bArr, boolean z10) {
        byte b10;
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (!isInAlphabet(bArr[i10]) && (!z10 || ((b10 = bArr[i10]) != 61 && !isWhiteSpace(b10)))) {
                return false;
            }
        }
        return true;
    }

    int readResults(byte[] bArr, int i10, int i11) {
        if (this.buffer == null) {
            return this.eof ? -1 : 0;
        }
        int iMin = Math.min(available(), i11);
        System.arraycopy(this.buffer, this.readPos, bArr, i10, iMin);
        int i12 = this.readPos + iMin;
        this.readPos = i12;
        if (i12 >= this.pos) {
            this.buffer = null;
        }
        return iMin;
    }
}
