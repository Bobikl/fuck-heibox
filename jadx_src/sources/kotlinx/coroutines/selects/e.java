package kotlinx.coroutines.selects;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.max.hblogistics.AddressListActivity;
import kotlin.Metadata;
import kotlinx.coroutines.z1;
import yh.p;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003JR\u0010\f\u001a\u00020\u000b\"\u0004\b\u0002\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00030\bH'ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/selects/e;", "P", "Q", "", "R", "Lkotlinx/coroutines/selects/f;", AddressListActivity.N, RemoteMessageConst.MessageBody.PARAM, "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "block", "Lkotlin/b2;", "N", "(Lkotlinx/coroutines/selects/f;Ljava/lang/Object;Lyh/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface e<P, Q> {
    @z1
    <R> void N(@dl.d f<? super R> select, P param, @dl.d p<? super Q, ? super kotlin.coroutines.c<? super R>, ? extends Object> block);
}
