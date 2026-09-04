package c2;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewKt;
import androidx.customview.poolingcontainer.R;
import com.google.android.gms.common.internal.s;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import dl.d;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import xh.h;

/* JADX INFO: compiled from: PoolingContainer.kt */
/* JADX INFO: loaded from: classes.dex */
@h(name = "PoolingContainer")
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\n\u0010\u0006\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\b\u001a\u00020\u0003*\u00020\u0007\"(\u0010\u000f\u001a\u00020\t*\u00020\u00002\u0006\u0010\n\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\"\u0015\u0010\u0011\u001a\u00020\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\f\"\u0018\u0010\u0015\u001a\u00020\u0012*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroid/view/View;", "Lc2/b;", s.a.f52543a, "Lkotlin/b2;", ak.av, "g", "b", "Landroid/view/ViewGroup;", ak.aF, "", "value", "e", "(Landroid/view/View;)Z", RXScreenCaptureService.KEY_HEIGHT, "(Landroid/view/View;Z)V", "isPoolingContainer", "f", "isWithinPoolingContainer", "Lc2/c;", "d", "(Landroid/view/View;)Lc2/c;", "poolingContainerListenerHolder", "customview-poolingcontainer_release"}, k = 2, mv = {1, 6, 0})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f35566a = R.id.pooling_container_listener_holder_tag;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f35567b = R.id.is_pooling_container_tag;

    @SuppressLint({"ExecutorRegistration"})
    public static final void a(@d View view, @d b listener) {
        f0.p(view, "<this>");
        f0.p(listener, "listener");
        d(view).a(listener);
    }

    public static final void b(@d View view) {
        f0.p(view, "<this>");
        Iterator<View> it = ViewKt.i(view).iterator();
        while (it.hasNext()) {
            d(it.next()).b();
        }
    }

    public static final void c(@d ViewGroup viewGroup) {
        f0.p(viewGroup, "<this>");
        Iterator<View> it = ViewGroupKt.e(viewGroup).iterator();
        while (it.hasNext()) {
            d(it.next()).b();
        }
    }

    private static final c d(View view) {
        int i10 = f35566a;
        c cVar = (c) view.getTag(i10);
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        view.setTag(i10, cVar2);
        return cVar2;
    }

    public static final boolean e(@d View view) {
        f0.p(view, "<this>");
        Object tag = view.getTag(f35567b);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean f(@d View view) {
        f0.p(view, "<this>");
        for (Object obj : ViewKt.j(view)) {
            if ((obj instanceof View) && e((View) obj)) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"ExecutorRegistration"})
    public static final void g(@d View view, @d b listener) {
        f0.p(view, "<this>");
        f0.p(listener, "listener");
        d(view).c(listener);
    }

    public static final void h(@d View view, boolean z10) {
        f0.p(view, "<this>");
        view.setTag(f35567b, Boolean.valueOf(z10));
    }
}
