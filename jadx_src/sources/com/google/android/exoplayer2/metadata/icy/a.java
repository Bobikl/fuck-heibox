package com.google.android.exoplayer2.metadata.icy;

import androidx.annotation.p0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.d;
import com.google.android.exoplayer2.metadata.g;
import com.google.common.base.c;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: IcyDecoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f46881c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f46882d = "streamtitle";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f46883e = "streamurl";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharsetDecoder f46884a = c.f56721c.newDecoder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharsetDecoder f46885b = c.f56720b.newDecoder();

    @p0
    private String c(ByteBuffer byteBuffer) {
        try {
            String string = this.f46884a.decode(byteBuffer).toString();
            this.f46884a.reset();
            byteBuffer.rewind();
            return string;
        } catch (CharacterCodingException unused) {
            this.f46884a.reset();
            byteBuffer.rewind();
            try {
                return this.f46885b.decode(byteBuffer).toString();
            } catch (CharacterCodingException unused2) {
                return null;
            } finally {
                this.f46885b.reset();
                byteBuffer.rewind();
            }
        } catch (Throwable th2) {
            this.f46884a.reset();
            byteBuffer.rewind();
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.metadata.g
    protected Metadata b(d dVar, ByteBuffer byteBuffer) {
        String strC = c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (strC == null) {
            return new Metadata(new IcyInfo(bArr, null, null));
        }
        Matcher matcher = f46881c.matcher(strC);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strG = com.google.common.base.a.g(strGroup);
                strG.hashCode();
                if (strG.equals(f46883e)) {
                    str2 = strGroup2;
                } else if (strG.equals(f46882d)) {
                    str = strGroup2;
                }
            }
        }
        return new Metadata(new IcyInfo(bArr, str, str2));
    }
}
