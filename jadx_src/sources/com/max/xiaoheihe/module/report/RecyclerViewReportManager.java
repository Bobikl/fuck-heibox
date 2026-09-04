package com.max.xiaoheihe.module.report;

import android.view.View;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.JsonObject;
import com.max.hbcommon.utils.c;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.TaskInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: RecyclerViewReportManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class RecyclerViewReportManager<T> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f91565d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @e
    private b<T> f91566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final List<T> f91567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private final WeakReference<RecyclerView> f91568c;

    /* JADX INFO: compiled from: RecyclerViewReportManager.kt */
    public static final class a extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RecyclerViewReportManager<T> f91569b;

        a(RecyclerViewReportManager<T> recyclerViewReportManager) {
            this.f91569b = recyclerViewReportManager;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@d RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 42874, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i10, i11);
            this.f91569b.g();
        }
    }

    /* JADX INFO: compiled from: RecyclerViewReportManager.kt */
    public interface b<D> {
        void a(D d10);
    }

    public RecyclerViewReportManager(@d RecyclerView rv) {
        f0.p(rv, "rv");
        this.f91567b = new ArrayList();
        this.f91568c = new WeakReference<>(rv);
        rv.addOnScrollListener(new a(this));
    }

    private final void e(T t10) {
        JsonObject jsonObjectDeepCopy;
        if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 42871, new Class[]{Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!(t10 instanceof TaskInfoObj)) {
            b<T> bVar = this.f91566a;
            if (bVar != null) {
                bVar.a(t10);
                return;
            }
            return;
        }
        TaskInfoObj taskInfoObj = (TaskInfoObj) t10;
        JsonObject report_extra = taskInfoObj.getReport_extra();
        if (report_extra == null || (jsonObjectDeepCopy = report_extra.deepCopy()) == null) {
            return;
        }
        jsonObjectDeepCopy.addProperty("state", taskInfoObj.getState());
        com.max.hbcommon.analytics.d.d("3", lb.d.H1, null, jsonObjectDeepCopy);
    }

    public final void a(@e View view, T t10) {
        if (PatchProxy.proxy(new Object[]{view, t10}, this, changeQuickRedirect, false, 42868, new Class[]{View.class, Object.class}, Void.TYPE).isSupported || view == null) {
            return;
        }
        view.setTag(R.id.item_report_data, t10);
    }

    public final void b() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42873, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f91567b.clear();
    }

    @d
    public final WeakReference<RecyclerView> c() {
        return this.f91568c;
    }

    @d
    public final List<T> d() {
        return this.f91567b;
    }

    public final void f(long j10) {
        if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 42869, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        k.f(r0.a(e1.c()), null, null, new RecyclerViewReportManager$reportDelay$1(j10, this, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42870, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        RecyclerView recyclerView = this.f91568c.get();
        RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            try {
                ArrayList arrayList = new ArrayList();
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                if (iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition) {
                    while (true) {
                        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                        if (viewFindViewByPosition != null) {
                            Object tag = viewFindViewByPosition.getTag(R.id.item_report_data);
                            if (tag == null) {
                                tag = null;
                            }
                            if (tag != null) {
                                arrayList.add(tag);
                            }
                        }
                        if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                            break;
                        } else {
                            iFindFirstVisibleItemPosition++;
                        }
                    }
                }
                if (c.w(arrayList)) {
                    return;
                }
                for (Object obj : arrayList) {
                    if (!this.f91567b.contains(obj)) {
                        this.f91567b.add((T) obj);
                        e(obj);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void h(@d b<T> reporter) {
        if (PatchProxy.proxy(new Object[]{reporter}, this, changeQuickRedirect, false, 42872, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(reporter, "reporter");
        this.f91566a = reporter;
    }
}
