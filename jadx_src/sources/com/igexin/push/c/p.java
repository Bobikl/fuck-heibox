package com.igexin.push.c;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class p implements Comparator<Map.Entry<String, j>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ o f63401a;

    p(o oVar) {
        this.f63401a = oVar;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Map.Entry<String, j> entry, Map.Entry<String, j> entry2) {
        return (int) (entry.getValue().e() - entry2.getValue().e());
    }
}
