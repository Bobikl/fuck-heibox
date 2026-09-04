package androidx.work;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: OneTimeWorkRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0002\u0007\bB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Landroidx/work/o;", "Landroidx/work/y;", "Landroidx/work/o$a;", "builder", "<init>", "(Landroidx/work/o$a;)V", RXScreenCaptureService.KEY_HEIGHT, ak.av, "b", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class o extends y {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: OneTimeWorkRequest.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0006\u001a\u00020\u00002\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003J\u000f\u0010\u0007\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00008PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Landroidx/work/o$a;", "Landroidx/work/y$a;", "Landroidx/work/o;", "Ljava/lang/Class;", "Landroidx/work/k;", "inputMerger", "C", androidx.exifinterface.media.a.W4, "()Landroidx/work/o;", "B", "()Landroidx/work/o$a;", "thisObject", "Landroidx/work/m;", "workerClass", "<init>", "(Ljava/lang/Class;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends y.a<a, o> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@dl.d Class<? extends m> workerClass) {
            super(workerClass);
            f0.p(workerClass, "workerClass");
            getWorkSpec().inputMergerClassName = OverwritingInputMerger.class.getName();
        }

        @Override // androidx.work.y.a
        @dl.d
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public o c() {
            if ((getBackoffCriteriaSet() && getWorkSpec().constraints.getRequiresDeviceIdle()) ? false : true) {
                return new o(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
        }

        @Override // androidx.work.y.a
        @dl.d
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public a g() {
            return this;
        }

        @dl.d
        public final a C(@dl.d Class<? extends k> inputMerger) {
            f0.p(inputMerger, "inputMerger");
            getWorkSpec().inputMergerClassName = inputMerger.getName();
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.work.o$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: OneTimeWorkRequest.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0007J$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0014\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\u0007H\u0007¨\u0006\f"}, d2 = {"Landroidx/work/o$b;", "", "Ljava/lang/Class;", "Landroidx/work/m;", "workerClass", "Landroidx/work/o;", ak.av, "", "workerClasses", "b", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final o a(@dl.d Class<? extends m> workerClass) {
            f0.p(workerClass, "workerClass");
            return new a(workerClass).b();
        }

        @dl.d
        @xh.m
        public final List<o> b(@dl.d List<? extends Class<? extends m>> workerClasses) {
            f0.p(workerClasses, "workerClasses");
            ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(workerClasses, 10));
            Iterator<T> it = workerClasses.iterator();
            while (it.hasNext()) {
                arrayList.add(new a((Class) it.next()).b());
            }
            return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(@dl.d a builder) {
        super(builder.getId(), builder.getWorkSpec(), builder.f());
        f0.p(builder, "builder");
    }

    @dl.d
    @xh.m
    public static final o e(@dl.d Class<? extends m> cls) {
        return INSTANCE.a(cls);
    }

    @dl.d
    @xh.m
    public static final List<o> f(@dl.d List<? extends Class<? extends m>> list) {
        return INSTANCE.b(list);
    }
}
