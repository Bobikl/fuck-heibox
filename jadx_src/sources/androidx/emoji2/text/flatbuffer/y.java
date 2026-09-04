package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;

/* JADX INFO: compiled from: Utf8Old.java */
/* JADX INFO: loaded from: classes6.dex */
public class y extends Utf8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<a> f23101b = ThreadLocal.withInitial(new Supplier() { // from class: androidx.emoji2.text.flatbuffer.x
        @Override // java.util.function.Supplier
        public final Object get() {
            return y.g();
        }
    });

    /* JADX INFO: compiled from: Utf8Old.java */
    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        CharSequence f23104c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ByteBuffer f23105d = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final CharsetEncoder f23102a = StandardCharsets.UTF_8.newEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final CharsetDecoder f23103b = StandardCharsets.UTF_8.newDecoder();

        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a g() {
        return new a();
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public String a(ByteBuffer byteBuffer, int i10, int i11) {
        CharsetDecoder charsetDecoder = f23101b.get().f23103b;
        charsetDecoder.reset();
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(i10);
        byteBufferDuplicate.limit(i10 + i11);
        try {
            return charsetDecoder.decode(byteBufferDuplicate).toString();
        } catch (CharacterCodingException e10) {
            throw new IllegalArgumentException("Bad encoding", e10);
        }
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public void b(CharSequence charSequence, ByteBuffer byteBuffer) {
        a aVar = f23101b.get();
        if (aVar.f23104c != charSequence) {
            c(charSequence);
        }
        byteBuffer.put(aVar.f23105d);
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public int c(CharSequence charSequence) {
        a aVar = f23101b.get();
        int length = (int) (charSequence.length() * aVar.f23102a.maxBytesPerChar());
        ByteBuffer byteBuffer = aVar.f23105d;
        if (byteBuffer == null || byteBuffer.capacity() < length) {
            aVar.f23105d = ByteBuffer.allocate(Math.max(128, length));
        }
        aVar.f23105d.clear();
        aVar.f23104c = charSequence;
        CoderResult coderResultEncode = aVar.f23102a.encode(charSequence instanceof CharBuffer ? (CharBuffer) charSequence : CharBuffer.wrap(charSequence), aVar.f23105d, true);
        if (coderResultEncode.isError()) {
            try {
                coderResultEncode.throwException();
            } catch (CharacterCodingException e10) {
                throw new IllegalArgumentException("bad character encoding", e10);
            }
        }
        aVar.f23105d.flip();
        return aVar.f23105d.remaining();
    }
}
