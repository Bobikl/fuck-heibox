package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.PriorityTaskManager;

/* JADX INFO: compiled from: PriorityDataSourceFactory.java */
/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public final class k0 implements o.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o.a f51152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PriorityTaskManager f51153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f51154c;

    public k0(o.a aVar, PriorityTaskManager priorityTaskManager, int i10) {
        this.f51152a = aVar;
        this.f51153b = priorityTaskManager;
        this.f51154c = i10;
    }

    @Override // com.google.android.exoplayer2.upstream.o.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public j0 a() {
        return new j0(this.f51152a.a(), this.f51153b, this.f51154c);
    }
}
