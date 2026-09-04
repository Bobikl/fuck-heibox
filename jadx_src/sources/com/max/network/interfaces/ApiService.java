package com.max.network.interfaces;

import dl.d;
import dl.e;
import kotlin.coroutines.c;
import ll.f;
import ll.w;
import ll.y;
import okhttp3.d0;

/* JADX INFO: compiled from: ApiService.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface ApiService {
    @f
    @e
    Object downloadFile(@d @y String str, @d c<? super d0> cVar);

    @f
    @e
    @w
    Object downloadLargeFile(@d @y String str, @d c<? super d0> cVar);
}
