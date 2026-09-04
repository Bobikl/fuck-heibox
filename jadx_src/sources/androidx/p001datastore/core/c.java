package androidx.p001datastore.core;

import androidx.exifinterface.media.a;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: DataMigration.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0006J\u0013\u0010\t\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Landroidx/datastore/core/c;", a.f23244d5, "", "currentData", "", ak.av, "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", ak.aF, "Lkotlin/b2;", "b", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "datastore-core"}, k = 1, mv = {1, 5, 1})
public interface c<T> {
    @e
    Object a(T t10, @d kotlin.coroutines.c<? super Boolean> cVar);

    @e
    Object b(@d kotlin.coroutines.c<? super b2> cVar);

    @e
    Object c(T t10, @d kotlin.coroutines.c<? super T> cVar);
}
