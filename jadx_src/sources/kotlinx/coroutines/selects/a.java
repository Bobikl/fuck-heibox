package kotlinx.coroutines.selects;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlinx.coroutines.t1;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J5\u0010\b\u001a\u00020\u0007*\u00020\u00032\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004H¦\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJG\u0010\r\u001a\u00020\u0007\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00010\u000b2\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH¦\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ[\u0010\u0012\u001a\u00020\u0007\"\u0004\b\u0001\u0010\u000f\"\u0004\b\u0002\u0010\n*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00102\u0006\u0010\u0011\u001a\u00028\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH¦\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013JU\u0010\u0014\u001a\u00020\u0007\"\u0004\b\u0001\u0010\u000f\"\u0004\b\u0002\u0010\n*\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0004\u0012\u00028\u00020\u00102\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J8\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004H'ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/selects/a;", "R", "", "Lkotlinx/coroutines/selects/c;", "Lkotlin/Function1;", "Lkotlin/coroutines/c;", "block", "Lkotlin/b2;", "f", "(Lkotlinx/coroutines/selects/c;Lyh/l;)V", "Q", "Lkotlinx/coroutines/selects/d;", "Lkotlin/Function2;", RXScreenCaptureService.KEY_HEIGHT, "(Lkotlinx/coroutines/selects/d;Lyh/p;)V", "P", "Lkotlinx/coroutines/selects/e;", RemoteMessageConst.MessageBody.PARAM, "l", "(Lkotlinx/coroutines/selects/e;Ljava/lang/Object;Lyh/p;)V", "k", "(Lkotlinx/coroutines/selects/e;Lyh/p;)V", "", "timeMillis", "t", "(JLyh/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface a<R> {

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Select.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class C1192a {
        /* JADX WARN: Multi-variable type inference failed */
        public static <R, P, Q> void a(@dl.d a<? super R> aVar, @dl.d e<? super P, ? extends Q> eVar, @dl.d p<? super Q, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
            aVar.l(eVar, null, pVar);
        }
    }

    void f(@dl.d c cVar, @dl.d l<? super kotlin.coroutines.c<? super R>, ? extends Object> lVar);

    <Q> void h(@dl.d d<? extends Q> dVar, @dl.d p<? super Q, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar);

    <P, Q> void k(@dl.d e<? super P, ? extends Q> eVar, @dl.d p<? super Q, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar);

    <P, Q> void l(@dl.d e<? super P, ? extends Q> eVar, P p10, @dl.d p<? super Q, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar);

    @t1
    void t(long timeMillis, @dl.d l<? super kotlin.coroutines.c<? super R>, ? extends Object> block);
}
