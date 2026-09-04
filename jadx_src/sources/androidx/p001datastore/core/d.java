package androidx.p001datastore.core;

import androidx.exifinterface.media.a;
import com.umeng.analytics.pro.ak;
import dl.e;
import kotlin.Metadata;
import kotlin.coroutines.c;
import yh.p;

/* JADX INFO: compiled from: DataStore.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002JF\u0010\t\u001a\u00028\u000021\u0010\b\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Landroidx/datastore/core/d;", a.f23244d5, "", "Lkotlin/Function2;", "Lkotlin/m0;", "name", "t", "Lkotlin/coroutines/c;", "transform", ak.av, "(Lyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/e;", "getData", "()Lkotlinx/coroutines/flow/e;", "data", "datastore-core"}, k = 1, mv = {1, 5, 1})
public interface d<T> {
    @e
    Object a(@dl.d p<? super T, ? super c<? super T>, ? extends Object> pVar, @dl.d c<? super T> cVar);

    @dl.d
    kotlinx.coroutines.flow.e<T> getData();
}
