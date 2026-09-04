package com.bumptech.glide.provider;

import androidx.annotation.n0;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ImageHeaderParserRegistry.java */
/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ImageHeaderParser> f41793a = new ArrayList();

    public synchronized void a(@n0 ImageHeaderParser imageHeaderParser) {
        this.f41793a.add(imageHeaderParser);
    }

    @n0
    public synchronized List<ImageHeaderParser> b() {
        return this.f41793a;
    }
}
