package androidx.p001datastore.core;

import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import kotlin.Metadata;
import kotlin.coroutines.c;

/* JADX INFO: compiled from: CorruptionHandler.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001b\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Landroidx/datastore/core/a;", androidx.exifinterface.media.a.f23244d5, "", "Landroidx/datastore/core/CorruptionException;", "ex", ak.av, "(Landroidx/datastore/core/CorruptionException;Lkotlin/coroutines/c;)Ljava/lang/Object;", "datastore-core"}, k = 1, mv = {1, 5, 1})
public interface a<T> {
    @e
    Object a(@d CorruptionException corruptionException, @d c<? super T> cVar);
}
