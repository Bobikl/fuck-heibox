package com.google.common.io;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: LineReader.java */
/* JADX INFO: loaded from: classes7.dex */
@p
@o9.a
@o9.c
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Readable f58714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @CheckForNull
    private final Reader f58715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharBuffer f58716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final char[] f58717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Queue<String> f58718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t f58719f;

    /* JADX INFO: compiled from: LineReader.java */
    public class a extends t {
        a() {
        }

        @Override // com.google.common.io.t
        protected void d(String str, String str2) {
            v.this.f58718e.add(str);
        }
    }

    public v(Readable readable) {
        CharBuffer charBufferE = k.e();
        this.f58716c = charBufferE;
        this.f58717d = charBufferE.array();
        this.f58718e = new ArrayDeque();
        this.f58719f = new a();
        this.f58714a = (Readable) com.google.common.base.w.E(readable);
        this.f58715b = readable instanceof Reader ? (Reader) readable : null;
    }

    @s9.a
    @CheckForNull
    public String b() throws IOException {
        int i10;
        while (this.f58718e.peek() == null) {
            s.a(this.f58716c);
            Reader reader = this.f58715b;
            if (reader != null) {
                char[] cArr = this.f58717d;
                i10 = reader.read(cArr, 0, cArr.length);
            } else {
                i10 = this.f58714a.read(this.f58716c);
            }
            if (i10 == -1) {
                this.f58719f.b();
                break;
            }
            this.f58719f.a(this.f58717d, 0, i10);
        }
        return this.f58718e.poll();
    }
}
