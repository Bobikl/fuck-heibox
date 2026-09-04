package org.apache.tools.zip;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/* JADX INFO: compiled from: NioZipEncoding.java */
/* JADX INFO: loaded from: classes5.dex */
public class h implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Charset f137414a;

    public h(Charset charset) {
        this.f137414a = charset;
    }

    @Override // org.apache.tools.zip.r
    public ByteBuffer a(String str) {
        CharsetEncoder charsetEncoderNewEncoder = this.f137414a.newEncoder();
        charsetEncoderNewEncoder.onMalformedInput(CodingErrorAction.REPORT);
        charsetEncoderNewEncoder.onUnmappableCharacter(CodingErrorAction.REPORT);
        CharBuffer charBufferWrap = CharBuffer.wrap(str);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(str.length() + ((str.length() + 1) / 2));
        while (charBufferWrap.remaining() > 0) {
            CoderResult coderResultEncode = charsetEncoderNewEncoder.encode(charBufferWrap, byteBufferAllocate, true);
            if (!coderResultEncode.isUnmappable() && !coderResultEncode.isMalformed()) {
                if (!coderResultEncode.isOverflow()) {
                    if (coderResultEncode.isUnderflow()) {
                        charsetEncoderNewEncoder.flush(byteBufferAllocate);
                        break;
                    }
                } else {
                    byteBufferAllocate = s.c(byteBufferAllocate, 0);
                }
            } else {
                if (coderResultEncode.length() * 6 > byteBufferAllocate.remaining()) {
                    byteBufferAllocate = s.c(byteBufferAllocate, byteBufferAllocate.position() + (coderResultEncode.length() * 6));
                }
                for (int i10 = 0; i10 < coderResultEncode.length(); i10++) {
                    s.a(byteBufferAllocate, charBufferWrap.get());
                }
            }
        }
        s.e(byteBufferAllocate);
        return byteBufferAllocate;
    }

    @Override // org.apache.tools.zip.r
    public boolean b(String str) {
        CharsetEncoder charsetEncoderNewEncoder = this.f137414a.newEncoder();
        charsetEncoderNewEncoder.onMalformedInput(CodingErrorAction.REPORT);
        charsetEncoderNewEncoder.onUnmappableCharacter(CodingErrorAction.REPORT);
        return charsetEncoderNewEncoder.canEncode(str);
    }

    @Override // org.apache.tools.zip.r
    public String decode(byte[] bArr) throws IOException {
        return this.f137414a.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(bArr)).toString();
    }
}
