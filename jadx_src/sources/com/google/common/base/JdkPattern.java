package com.google.common.base;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
@o9.c
@g
public final class JdkPattern extends e implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Pattern f56617b;

    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Matcher f56618a;

        a(Matcher matcher) {
            this.f56618a = (Matcher) w.E(matcher);
        }

        @Override // com.google.common.base.d
        public int a() {
            return this.f56618a.end();
        }

        @Override // com.google.common.base.d
        public boolean b() {
            return this.f56618a.find();
        }

        @Override // com.google.common.base.d
        public boolean c(int i10) {
            return this.f56618a.find(i10);
        }

        @Override // com.google.common.base.d
        public boolean d() {
            return this.f56618a.matches();
        }

        @Override // com.google.common.base.d
        public String e(String str) {
            return this.f56618a.replaceAll(str);
        }

        @Override // com.google.common.base.d
        public int f() {
            return this.f56618a.start();
        }
    }

    JdkPattern(Pattern pattern) {
        this.f56617b = (Pattern) w.E(pattern);
    }

    @Override // com.google.common.base.e
    public int b() {
        return this.f56617b.flags();
    }

    @Override // com.google.common.base.e
    public d d(CharSequence charSequence) {
        return new a(this.f56617b.matcher(charSequence));
    }

    @Override // com.google.common.base.e
    public String e() {
        return this.f56617b.pattern();
    }

    @Override // com.google.common.base.e
    public String toString() {
        return this.f56617b.toString();
    }
}
