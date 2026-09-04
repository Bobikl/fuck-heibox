package com.google.android.exoplayer2.source.dash.manifest;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: AdaptationSet.java */
/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f47860g = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<j> f47863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<e> f47864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<e> f47865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<e> f47866f;

    public a(int i10, int i11, List<j> list, List<e> list2, List<e> list3, List<e> list4) {
        this.f47861a = i10;
        this.f47862b = i11;
        this.f47863c = Collections.unmodifiableList(list);
        this.f47864d = Collections.unmodifiableList(list2);
        this.f47865e = Collections.unmodifiableList(list3);
        this.f47866f = Collections.unmodifiableList(list4);
    }
}
