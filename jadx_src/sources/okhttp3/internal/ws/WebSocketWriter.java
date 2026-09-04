package okhttp3.internal.ws;

import com.igexin.assist.sdk.AssistPushConsts;
import dl.d;
import dl.e;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;

/* JADX INFO: compiled from: WebSocketWriter.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010!\u001a\u00020\u0015\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010,\u001a\u00020\u0015\u0012\u0006\u0010-\u001a\u00020\u0015\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b1\u00102J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004J\b\u0010\u0010\u001a\u00020\u0006H\u0016R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0017R\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010(\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0017R\u0014\u0010-\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0017R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00063"}, d2 = {"Lokhttp3/internal/ws/WebSocketWriter;", "Ljava/io/Closeable;", "", "opcode", "Lokio/ByteString;", AssistPushConsts.MSG_TYPE_PAYLOAD, "Lkotlin/b2;", "writeControlFrame", "writePing", "writePong", "code", "reason", "writeClose", "formatOpcode", "data", "writeMessageFrame", "close", "Lokio/Buffer;", "messageBuffer", "Lokio/Buffer;", "sinkBuffer", "", "writerClosed", "Z", "Lokhttp3/internal/ws/MessageDeflater;", "messageDeflater", "Lokhttp3/internal/ws/MessageDeflater;", "", "maskKey", "[B", "Lokio/Buffer$UnsafeCursor;", "maskCursor", "Lokio/Buffer$UnsafeCursor;", "isClient", "Lokio/BufferedSink;", "sink", "Lokio/BufferedSink;", "getSink", "()Lokio/BufferedSink;", "Ljava/util/Random;", "random", "Ljava/util/Random;", "getRandom", "()Ljava/util/Random;", "perMessageDeflate", "noContextTakeover", "", "minimumDeflateSize", "J", "<init>", "(ZLokio/BufferedSink;Ljava/util/Random;ZZJ)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class WebSocketWriter implements Closeable {
    private final boolean isClient;
    private final Buffer.UnsafeCursor maskCursor;
    private final byte[] maskKey;
    private final Buffer messageBuffer;
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;

    @d
    private final Random random;

    @d
    private final BufferedSink sink;
    private final Buffer sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean z10, @d BufferedSink sink, @d Random random, boolean z11, boolean z12, long j10) {
        f0.p(sink, "sink");
        f0.p(random, "random");
        this.isClient = z10;
        this.sink = sink;
        this.random = random;
        this.perMessageDeflate = z11;
        this.noContextTakeover = z12;
        this.minimumDeflateSize = j10;
        this.messageBuffer = new Buffer();
        this.sinkBuffer = sink.getBuffer();
        this.maskKey = z10 ? new byte[4] : null;
        this.maskCursor = z10 ? new Buffer.UnsafeCursor() : null;
    }

    private final void writeControlFrame(int i10, ByteString byteString) throws IOException {
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        int size = byteString.size();
        if (!(((long) size) <= 125)) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        this.sinkBuffer.writeByte(i10 | 128);
        if (this.isClient) {
            this.sinkBuffer.writeByte(size | 128);
            Random random = this.random;
            byte[] bArr = this.maskKey;
            f0.m(bArr);
            random.nextBytes(bArr);
            this.sinkBuffer.write(this.maskKey);
            if (size > 0) {
                long size2 = this.sinkBuffer.size();
                this.sinkBuffer.write(byteString);
                Buffer buffer = this.sinkBuffer;
                Buffer.UnsafeCursor unsafeCursor = this.maskCursor;
                f0.m(unsafeCursor);
                buffer.readAndWriteUnsafe(unsafeCursor);
                this.maskCursor.seek(size2);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        } else {
            this.sinkBuffer.writeByte(size);
            this.sinkBuffer.write(byteString);
        }
        this.sink.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        MessageDeflater messageDeflater = this.messageDeflater;
        if (messageDeflater != null) {
            messageDeflater.close();
        }
    }

    @d
    public final Random getRandom() {
        return this.random;
    }

    @d
    public final BufferedSink getSink() {
        return this.sink;
    }

    public final void writeClose(int i10, @e ByteString byteString) throws IOException {
        ByteString byteString2 = ByteString.EMPTY;
        if (i10 != 0 || byteString != null) {
            if (i10 != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(i10);
            }
            Buffer buffer = new Buffer();
            buffer.writeShort(i10);
            if (byteString != null) {
                buffer.write(byteString);
            }
            byteString2 = buffer.readByteString();
        }
        try {
            writeControlFrame(8, byteString2);
        } finally {
            this.writerClosed = true;
        }
    }

    public final void writeMessageFrame(int i10, @d ByteString data) throws IOException {
        f0.p(data, "data");
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        this.messageBuffer.write(data);
        int i11 = i10 | 128;
        if (this.perMessageDeflate && data.size() >= this.minimumDeflateSize) {
            MessageDeflater messageDeflater = this.messageDeflater;
            if (messageDeflater == null) {
                messageDeflater = new MessageDeflater(this.noContextTakeover);
                this.messageDeflater = messageDeflater;
            }
            messageDeflater.deflate(this.messageBuffer);
            i11 |= 64;
        }
        long size = this.messageBuffer.size();
        this.sinkBuffer.writeByte(i11);
        int i12 = this.isClient ? 128 : 0;
        if (size <= 125) {
            this.sinkBuffer.writeByte(((int) size) | i12);
        } else if (size <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            this.sinkBuffer.writeByte(i12 | 126);
            this.sinkBuffer.writeShort((int) size);
        } else {
            this.sinkBuffer.writeByte(i12 | 127);
            this.sinkBuffer.writeLong(size);
        }
        if (this.isClient) {
            Random random = this.random;
            byte[] bArr = this.maskKey;
            f0.m(bArr);
            random.nextBytes(bArr);
            this.sinkBuffer.write(this.maskKey);
            if (size > 0) {
                Buffer buffer = this.messageBuffer;
                Buffer.UnsafeCursor unsafeCursor = this.maskCursor;
                f0.m(unsafeCursor);
                buffer.readAndWriteUnsafe(unsafeCursor);
                this.maskCursor.seek(0L);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        this.sinkBuffer.write(this.messageBuffer, size);
        this.sink.emit();
    }

    public final void writePing(@d ByteString payload) throws IOException {
        f0.p(payload, "payload");
        writeControlFrame(9, payload);
    }

    public final void writePong(@d ByteString payload) throws IOException {
        f0.p(payload, "payload");
        writeControlFrame(10, payload);
    }
}
