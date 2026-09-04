package kotlinx.coroutines.selects;

import com.max.hblogistics.AddressListActivity;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlinx.coroutines.z1;
import yh.l;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JD\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005H'ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/selects/c;", "", "R", "Lkotlinx/coroutines/selects/f;", AddressListActivity.N, "Lkotlin/Function1;", "Lkotlin/coroutines/c;", "block", "Lkotlin/b2;", RXScreenCaptureService.KEY_WIDTH, "(Lkotlinx/coroutines/selects/f;Lyh/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface c {
    @z1
    <R> void w(@dl.d f<? super R> select, @dl.d l<? super kotlin.coroutines.c<? super R>, ? extends Object> block);
}
