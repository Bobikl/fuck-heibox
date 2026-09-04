package androidx.compose.runtime;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: Applier.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0014\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0004\b\u001e\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0006\u0010\b\u001a\u00020\u0004J\b\u0010\t\u001a\u00020\u0004H$J\"\u0010\u000e\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0004J*\u0010\u0011\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0004R\u0017\u0010\u0015\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R*\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00028\u00008\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0006¨\u0006\u001f"}, d2 = {"Landroidx/compose/runtime/a;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/runtime/e;", "node", "Lkotlin/b2;", RXScreenCaptureService.KEY_HEIGHT, "(Ljava/lang/Object;)V", ak.av, "clear", "k", "", "", UCropPlusActivity.ARG_INDEX, "count", "l", "from", "to", "j", "Ljava/lang/Object;", "i", "()Ljava/lang/Object;", "root", "b", "Ljava/util/List;", "stack", "<set-?>", ak.aF, "getCurrent", "m", org.apache.tools.ant.taskdefs.optional.vss.g.H2, "<init>", "runtime_release"}, k = 1, mv = {1, 7, 1})
public abstract class a<T> implements e<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f12592d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final T root;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<T> stack = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private T current;

    public a(T t10) {
        this.root = t10;
        this.current = t10;
    }

    @Override // androidx.compose.runtime.e
    public void a() {
        if (!(!this.stack.isEmpty())) {
            throw new IllegalStateException("Check failed.".toString());
        }
        List<T> list = this.stack;
        m(list.remove(list.size() - 1));
    }

    @Override // androidx.compose.runtime.e
    public /* synthetic */ void c() {
        d.b(this);
    }

    @Override // androidx.compose.runtime.e
    public final void clear() {
        this.stack.clear();
        m(this.root);
        k();
    }

    @Override // androidx.compose.runtime.e
    public /* synthetic */ void d() {
        d.a(this);
    }

    @Override // androidx.compose.runtime.e
    public T getCurrent() {
        return this.current;
    }

    @Override // androidx.compose.runtime.e
    public void h(T node) {
        this.stack.add(getCurrent());
        m(node);
    }

    public final T i() {
        return this.root;
    }

    protected final void j(@dl.d List<T> list, int i10, int i11, int i12) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        int i13 = i10 > i11 ? i11 : i11 - i12;
        if (i12 != 1) {
            List<T> listSubList = list.subList(i10, i12 + i10);
            List listT5 = CollectionsKt___CollectionsKt.T5(listSubList);
            listSubList.clear();
            list.addAll(i13, listT5);
            return;
        }
        if (i10 == i11 + 1 || i10 == i11 - 1) {
            list.set(i10, list.set(i11, list.get(i10)));
        } else {
            list.add(i13, list.remove(i10));
        }
    }

    protected abstract void k();

    protected final void l(@dl.d List<T> list, int i10, int i11) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        if (i11 == 1) {
            list.remove(i10);
        } else {
            list.subList(i10, i11 + i10).clear();
        }
    }

    protected void m(T t10) {
        this.current = t10;
    }
}
