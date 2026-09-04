package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.offline.z;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: HlsPlaylist.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class h implements z<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f48362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f48363c;

    protected h(String str, List<String> list, boolean z10) {
        this.f48361a = str;
        this.f48362b = Collections.unmodifiableList(list);
        this.f48363c = z10;
    }
}
