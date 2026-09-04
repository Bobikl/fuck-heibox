package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Composition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\"\u0010\u0007\u001a\u00020\u00022\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\b\u0005H&¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/q;", "", "Lkotlin/b2;", "dispose", "Lkotlin/Function0;", "Landroidx/compose/runtime/h;", "content", ak.aF, "(Lyh/p;)V", "", "b", "()Z", "hasInvalidations", "isDisposed", "runtime_release"}, k = 1, mv = {1, 7, 1})
public interface q {
    boolean b();

    void c(@dl.d yh.p<? super p, ? super Integer, kotlin.b2> content);

    void dispose();

    boolean isDisposed();
}
