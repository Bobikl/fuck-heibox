package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.p0;
import com.google.android.exoplayer2.util.u0;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: SimpleCacheSpan.java */
/* JADX INFO: loaded from: classes7.dex */
public final class u extends h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f51088h = ".exo";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f51089i = ".v3.exo";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f51090j = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f51091k = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f51092l = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    private u(String str, long j10, long j11, long j12, @p0 File file) {
        super(str, j10, j11, j12, file);
    }

    @p0
    public static u e(File file, long j10, long j11, k kVar) {
        File file2;
        String strL;
        String name = file.getName();
        if (name.endsWith(f51089i)) {
            file2 = file;
        } else {
            File fileJ = j(file, kVar);
            if (fileJ == null) {
                return null;
            }
            file2 = fileJ;
            name = fileJ.getName();
        }
        Matcher matcher = f51092l.matcher(name);
        if (!matcher.matches() || (strL = kVar.l(Integer.parseInt((String) com.google.android.exoplayer2.util.a.g(matcher.group(1))))) == null) {
            return null;
        }
        long length = j10 == -1 ? file2.length() : j10;
        if (length == 0) {
            return null;
        }
        return new u(strL, Long.parseLong((String) com.google.android.exoplayer2.util.a.g(matcher.group(2))), length, j11 == com.google.android.exoplayer2.j.f46377b ? Long.parseLong((String) com.google.android.exoplayer2.util.a.g(matcher.group(3))) : j11, file2);
    }

    @p0
    public static u f(File file, long j10, k kVar) {
        return e(file, j10, com.google.android.exoplayer2.j.f46377b, kVar);
    }

    public static u g(String str, long j10, long j11) {
        return new u(str, j10, j11, com.google.android.exoplayer2.j.f46377b, null);
    }

    public static u h(String str, long j10) {
        return new u(str, j10, -1L, com.google.android.exoplayer2.j.f46377b, null);
    }

    public static File i(File file, int i10, long j10, long j11) {
        StringBuilder sb2 = new StringBuilder(60);
        sb2.append(i10);
        sb2.append(".");
        sb2.append(j10);
        sb2.append(".");
        sb2.append(j11);
        sb2.append(f51089i);
        return new File(file, sb2.toString());
    }

    @p0
    private static File j(File file, k kVar) {
        String strA1;
        String name = file.getName();
        Matcher matcher = f51091k.matcher(name);
        if (matcher.matches()) {
            strA1 = u0.A1((String) com.google.android.exoplayer2.util.a.g(matcher.group(1)));
        } else {
            matcher = f51090j.matcher(name);
            strA1 = matcher.matches() ? (String) com.google.android.exoplayer2.util.a.g(matcher.group(1)) : null;
        }
        if (strA1 == null) {
            return null;
        }
        File fileI = i((File) com.google.android.exoplayer2.util.a.k(file.getParentFile()), kVar.f(strA1), Long.parseLong((String) com.google.android.exoplayer2.util.a.g(matcher.group(2))), Long.parseLong((String) com.google.android.exoplayer2.util.a.g(matcher.group(3))));
        if (file.renameTo(fileI)) {
            return fileI;
        }
        return null;
    }

    public u d(File file, long j10) {
        com.google.android.exoplayer2.util.a.i(this.f51004e);
        return new u(this.f51001b, this.f51002c, this.f51003d, j10, file);
    }
}
