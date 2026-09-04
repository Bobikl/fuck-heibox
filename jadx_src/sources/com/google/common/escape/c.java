package com.google.common.escape;

import com.google.common.base.w;
import java.util.Map;
import javax.annotation.CheckForNull;
import kotlin.jvm.internal.p;

/* JADX INFO: compiled from: ArrayBasedUnicodeEscaper.java */
/* JADX INFO: loaded from: classes7.dex */
@f
@o9.b
public abstract class c extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final char[][] f58249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f58250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f58251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f58252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final char f58253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final char f58254h;

    protected c(b bVar, int i10, int i11, String str) {
        w.E(bVar);
        char[][] cArrC = bVar.c();
        this.f58249c = cArrC;
        this.f58250d = cArrC.length;
        if (i11 < i10) {
            i11 = -1;
            i10 = Integer.MAX_VALUE;
        }
        this.f58251e = i10;
        this.f58252f = i11;
        if (i10 >= 55296) {
            this.f58253g = p.f124952c;
            this.f58254h = (char) 0;
        } else {
            this.f58253g = (char) i10;
            this.f58254h = (char) Math.min(i11, 55295);
        }
    }

    protected c(Map<Character, String> map, int i10, int i11, String str) {
        this(b.a(map), i10, i11, str);
    }

    @Override // com.google.common.escape.l, com.google.common.escape.h
    public final String b(String str) {
        w.E(str);
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if ((cCharAt < this.f58250d && this.f58249c[cCharAt] != null) || cCharAt > this.f58254h || cCharAt < this.f58253g) {
                return e(str, i10);
            }
        }
        return str;
    }

    @Override // com.google.common.escape.l
    @CheckForNull
    protected final char[] d(int i10) {
        char[] cArr;
        if (i10 < this.f58250d && (cArr = this.f58249c[i10]) != null) {
            return cArr;
        }
        if (i10 < this.f58251e || i10 > this.f58252f) {
            return h(i10);
        }
        return null;
    }

    @Override // com.google.common.escape.l
    protected final int g(CharSequence charSequence, int i10, int i11) {
        while (i10 < i11) {
            char cCharAt = charSequence.charAt(i10);
            if ((cCharAt < this.f58250d && this.f58249c[cCharAt] != null) || cCharAt > this.f58254h || cCharAt < this.f58253g) {
                break;
            }
            i10++;
        }
        return i10;
    }

    @CheckForNull
    protected abstract char[] h(int i10);
}
