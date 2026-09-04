package com.google.common.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PatternFilenameFilter.java */
/* JADX INFO: loaded from: classes7.dex */
@p
@o9.a
@o9.c
public final class b0 implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Pattern f58646a;

    public b0(String str) {
        this(Pattern.compile(str));
    }

    public b0(Pattern pattern) {
        this.f58646a = (Pattern) com.google.common.base.w.E(pattern);
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return this.f58646a.matcher(str).matches();
    }
}
