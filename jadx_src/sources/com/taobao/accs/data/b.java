package com.taobao.accs.data;

import java.util.Comparator;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class b implements Comparator<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f98241a;

    b(a aVar) {
        this.f98241a = aVar;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Integer num, Integer num2) {
        return num.intValue() - num2.intValue();
    }
}
