package androidx.paging;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: SimpleChannelFlow.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003J!\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Landroidx/paging/b1;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/q0;", "Lkotlinx/coroutines/channels/b0;", "Lkotlin/Function0;", "Lkotlin/b2;", "block", "r", "(Lyh/a;Lkotlin/coroutines/c;)Ljava/lang/Object;", ak.aF, "()Lkotlinx/coroutines/channels/b0;", "channel", "paging-common"}, k = 1, mv = {1, 4, 2})
public interface b1<T> extends kotlinx.coroutines.q0, kotlinx.coroutines.channels.b0<T> {
    @dl.d
    kotlinx.coroutines.channels.b0<T> c();

    @dl.e
    Object r(@dl.d yh.a<b2> aVar, @dl.d kotlin.coroutines.c<? super b2> cVar);
}
