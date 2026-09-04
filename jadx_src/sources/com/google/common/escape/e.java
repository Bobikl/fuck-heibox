package com.google.common.escape;

import com.google.common.base.w;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: CharEscaperBuilder.java */
/* JADX INFO: loaded from: classes7.dex */
@f
@o9.b
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f58257b = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Character, String> f58256a = new HashMap();

    /* JADX INFO: compiled from: CharEscaperBuilder.java */
    public static class a extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final char[][] f58258c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f58259d;

        a(char[][] cArr) {
            this.f58258c = cArr;
            this.f58259d = cArr.length;
        }

        @Override // com.google.common.escape.d, com.google.common.escape.h
        public String b(String str) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                char[][] cArr = this.f58258c;
                if (cCharAt < cArr.length && cArr[cCharAt] != null) {
                    return d(str, i10);
                }
            }
            return str;
        }

        @Override // com.google.common.escape.d
        @CheckForNull
        protected char[] c(char c10) {
            if (c10 < this.f58259d) {
                return this.f58258c[c10];
            }
            return null;
        }
    }

    @s9.a
    public e a(char c10, String str) {
        this.f58256a.put(Character.valueOf(c10), (String) w.E(str));
        if (c10 > this.f58257b) {
            this.f58257b = c10;
        }
        return this;
    }

    @s9.a
    public e b(char[] cArr, String str) {
        w.E(str);
        for (char c10 : cArr) {
            a(c10, str);
        }
        return this;
    }

    public char[][] c() {
        char[][] cArr = new char[this.f58257b + 1][];
        for (Map.Entry<Character, String> entry : this.f58256a.entrySet()) {
            cArr[entry.getKey().charValue()] = entry.getValue().toCharArray();
        }
        return cArr;
    }

    public h d() {
        return new a(c());
    }
}
