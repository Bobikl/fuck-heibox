package androidx.activity.result;

import androidx.annotation.n0;

/* JADX INFO: compiled from: ActivityResultCaller.java */
/* JADX INFO: loaded from: classes.dex */
public interface b {
    @n0
    <I, O> g<I> registerForActivityResult(@n0 z.a<I, O> aVar, @n0 ActivityResultRegistry activityResultRegistry, @n0 a<O> aVar2);

    @n0
    <I, O> g<I> registerForActivityResult(@n0 z.a<I, O> aVar, @n0 a<O> aVar2);
}
