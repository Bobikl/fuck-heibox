package androidx.compose.runtime;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: compiled from: Composition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00032\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0016\u0010\r\u001a\u00020\f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0016\u0010\u000f\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\tH&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\tH&J\b\u0010\u0013\u001a\u00020\fH&J$\u0010\u0018\u001a\u00020\u00032\u001a\u0010\u0017\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00150\u0014H'J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019H'J\b\u0010\u001c\u001a\u00020\u0003H&J\b\u0010\u001d\u001a\u00020\u0003H&J\b\u0010\u001e\u001a\u00020\u0003H&J\b\u0010\u001f\u001a\u00020\u0003H&J\b\u0010 \u001a\u00020\u0003H'J5\u0010%\u001a\u00028\u0000\"\u0004\b\u0000\u0010!2\b\u0010\"\u001a\u0004\u0018\u00010\u00002\u0006\u0010$\u001a\u00020#2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H&¢\u0006\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(\u0082\u0001\u0001,ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006-À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/z;", "Landroidx/compose/runtime/q;", "Lkotlin/Function0;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "content", androidx.exifinterface.media.a.W4, "(Lyh/p;)V", "", "", "values", "I", "", "y", "block", "B", "value", "H", "L", "F", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/z0;", "references", "D", "Landroidx/compose/runtime/y0;", "state", "x", "J", "C", ak.aD, RXScreenCaptureService.KEY_WIDTH, "G", "R", "to", "", "groupIndex", "M", "(Landroidx/compose/runtime/z;ILyh/a;)Ljava/lang/Object;", "K", "()Z", "isComposing", androidx.exifinterface.media.a.S4, "hasPendingChanges", "Landroidx/compose/runtime/t;", "runtime_release"}, k = 1, mv = {1, 7, 1})
public interface z extends q {
    void A(@dl.d yh.p<? super p, ? super Integer, kotlin.b2> content);

    void B(@dl.d yh.a<kotlin.b2> aVar);

    void C();

    @o0
    void D(@dl.d List<Pair<z0, z0>> list);

    boolean E();

    boolean F();

    @o0
    void G();

    void H(@dl.d Object obj);

    void I(@dl.d Set<? extends Object> set);

    void J();

    boolean K();

    void L(@dl.d Object obj);

    <R> R M(@dl.e z to, int groupIndex, @dl.d yh.a<? extends R> block);

    void w();

    @o0
    void x(@dl.d y0 y0Var);

    boolean y(@dl.d Set<? extends Object> values);

    void z();
}
