package com.google.common.escape;

import com.google.common.base.w;
import java.util.Map;
import javax.annotation.CheckForNull;
import kotlin.jvm.internal.p;

/* JADX INFO: compiled from: ArrayBasedCharEscaper.java */
/* JADX INFO: loaded from: classes7.dex */
@f
@o9.b
public abstract class a extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final char[][] f58243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f58244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final char f58245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final char f58246f;

    protected a(b bVar, char c10, char c11) {
        w.E(bVar);
        char[][] cArrC = bVar.c();
        this.f58243c = cArrC;
        this.f58244d = cArrC.length;
        if (c11 < c10) {
            c11 = 0;
            c10 = p.f124952c;
        }
        this.f58245e = c10;
        this.f58246f = c11;
    }

    protected a(Map<Character, String> map, char c10, char c11) {
        this(b.a(map), c10, c11);
    }

    @Override // com.google.common.escape.d, com.google.common.escape.h
    public final String b(String str) {
        w.E(str);
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if ((cCharAt < this.f58244d && this.f58243c[cCharAt] != null) || cCharAt > this.f58246f || cCharAt < this.f58245e) {
                return d(str, i10);
            }
        }
        return str;
    }

    @Override // com.google.common.escape.d
    @CheckForNull
    protected final char[] c(char c10) {
        char[] cArr;
        if (c10 < this.f58244d && (cArr = this.f58243c[c10]) != null) {
            return cArr;
        }
        if (c10 < this.f58245e || c10 > this.f58246f) {
            return f(c10);
        }
        return null;
    }

    @CheckForNull
    protected abstract char[] f(char c10);
}
