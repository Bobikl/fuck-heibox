package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.e0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class TagPayloadReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final e0 f44927a;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str, null, false, 1);
        }
    }

    protected TagPayloadReader(e0 e0Var) {
        this.f44927a = e0Var;
    }

    public final boolean a(com.google.android.exoplayer2.util.e0 e0Var, long j10) throws ParserException {
        return b(e0Var) && c(e0Var, j10);
    }

    protected abstract boolean b(com.google.android.exoplayer2.util.e0 e0Var) throws ParserException;

    protected abstract boolean c(com.google.android.exoplayer2.util.e0 e0Var, long j10) throws ParserException;

    public abstract void d();
}
