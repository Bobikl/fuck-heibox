package com.igexin.a.a.b.a.a;

import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public class j implements Comparator<m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f63163a;

    j(f fVar) {
        this.f63163a = fVar;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(m mVar, m mVar2) {
        if (mVar == null) {
            return 1;
        }
        if (mVar2 == null) {
            return -1;
        }
        int i10 = mVar.f63245x;
        long j10 = mVar.f63243v;
        long j11 = ((long) i10) + j10;
        int i11 = mVar2.f63245x;
        long j12 = mVar2.f63243v;
        if (j11 > ((long) i11) + j12) {
            return 1;
        }
        return ((long) i10) + j10 < ((long) i11) + j12 ? -1 : 0;
    }
}
