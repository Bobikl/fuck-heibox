package androidx.compose.runtime;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Applier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0003H&J\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H&¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H&¢\u0006\u0004\b\u000f\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH&J \u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH&J\b\u0010\u0015\u001a\u00020\u0003H&R\u0014\u0010\u0018\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/e;", "N", "", "Lkotlin/b2;", "d", ak.aF, "node", RXScreenCaptureService.KEY_HEIGHT, "(Ljava/lang/Object;)V", ak.av, "", UCropPlusActivity.ARG_INDEX, "instance", "f", "(ILjava/lang/Object;)V", "g", "count", "b", "from", "to", "e", "clear", "getCurrent", "()Ljava/lang/Object;", org.apache.tools.ant.taskdefs.optional.vss.g.H2, "runtime_release"}, k = 1, mv = {1, 7, 1})
public interface e<N> {

    /* JADX INFO: compiled from: Applier.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @Deprecated
        public static <N> void a(@dl.d e<N> eVar) {
            d.a(eVar);
        }

        @Deprecated
        public static <N> void b(@dl.d e<N> eVar) {
            d.b(eVar);
        }
    }

    void a();

    void b(int i10, int i11);

    void c();

    void clear();

    void d();

    void e(int i10, int i11, int i12);

    void f(int index, N instance);

    void g(int index, N instance);

    N getCurrent();

    void h(N node);
}
