package p3;

import androidx.work.impl.model.u;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ConstraintController.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0018B\u0017\b\u0000\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f¢\u0006\u0004\b!\u0010\"J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&J\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0000H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0012\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0010J\u0006\u0010\u0013\u001a\u00020\u0006J\u000e\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R.\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lp3/c;", androidx.exifinterface.media.a.f23244d5, "Lo3/a;", "Lp3/c$a;", "callback", "currentValue", "Lkotlin/b2;", "i", "(Lp3/c$a;Ljava/lang/Object;)V", "Landroidx/work/impl/model/u;", "workSpec", "", ak.aF, "value", "d", "(Ljava/lang/Object;)Z", "", "workSpecs", "f", "g", "", "workSpecId", "e", "newValue", ak.av, "(Ljava/lang/Object;)V", "Lp3/c$a;", "b", "()Lp3/c$a;", RXScreenCaptureService.KEY_HEIGHT, "(Lp3/c$a;)V", "Landroidx/work/impl/constraints/trackers/g;", "tracker", "<init>", "(Landroidx/work/impl/constraints/trackers/g;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public abstract class c<T> implements o3.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final androidx.work.impl.constraints.trackers.g<T> f138141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final List<u> f138142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final List<String> f138143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private T f138144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private a f138145e;

    /* JADX INFO: compiled from: ConstraintController.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0016\u0010\u0007\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\b"}, d2 = {"Lp3/c$a;", "", "", "Landroidx/work/impl/model/u;", "workSpecs", "Lkotlin/b2;", "b", ak.aF, "work-runtime_release"}, k = 1, mv = {1, 7, 1})
    public interface a {
        void b(@dl.d List<u> list);

        void c(@dl.d List<u> list);
    }

    public c(@dl.d androidx.work.impl.constraints.trackers.g<T> tracker) {
        f0.p(tracker, "tracker");
        this.f138141a = tracker;
        this.f138142b = new ArrayList();
        this.f138143c = new ArrayList();
    }

    private final void i(a callback, T currentValue) {
        if (this.f138142b.isEmpty() || callback == null) {
            return;
        }
        if (currentValue == null || d(currentValue)) {
            callback.c(this.f138142b);
        } else {
            callback.b(this.f138142b);
        }
    }

    @Override // o3.a
    public void a(T newValue) {
        this.f138144d = newValue;
        i(this.f138145e, newValue);
    }

    @dl.e
    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getF138145e() {
        return this.f138145e;
    }

    public abstract boolean c(@dl.d u workSpec);

    public abstract boolean d(T value);

    public final boolean e(@dl.d String workSpecId) {
        f0.p(workSpecId, "workSpecId");
        T t10 = this.f138144d;
        return t10 != null && d(t10) && this.f138143c.contains(workSpecId);
    }

    public final void f(@dl.d Iterable<u> workSpecs) {
        f0.p(workSpecs, "workSpecs");
        this.f138142b.clear();
        this.f138143c.clear();
        List<u> list = this.f138142b;
        for (u uVar : workSpecs) {
            if (c(uVar)) {
                list.add(uVar);
            }
        }
        List<u> list2 = this.f138142b;
        List<String> list3 = this.f138143c;
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            list3.add(((u) it.next()).id);
        }
        if (this.f138142b.isEmpty()) {
            this.f138141a.g(this);
        } else {
            this.f138141a.c(this);
        }
        i(this.f138145e, this.f138144d);
    }

    public final void g() {
        if (!this.f138142b.isEmpty()) {
            this.f138142b.clear();
            this.f138141a.g(this);
        }
    }

    public final void h(@dl.e a aVar) {
        if (this.f138145e != aVar) {
            this.f138145e = aVar;
            i(aVar, this.f138144d);
        }
    }
}
