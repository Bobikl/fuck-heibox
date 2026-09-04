package androidx.navigation.fragment;

import android.util.Log;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.v;
import androidx.lifecycle.y;
import androidx.navigation.NavBackStackEntry;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FragmentNavigator.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class FragmentNavigator$fragmentViewObserver$1 extends Lambda implements yh.l<NavBackStackEntry, v> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ FragmentNavigator f25112b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FragmentNavigator$fragmentViewObserver$1(FragmentNavigator fragmentNavigator) {
        super(1);
        this.f25112b = fragmentNavigator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(FragmentNavigator this$0, NavBackStackEntry entry, y owner, Lifecycle.Event event) {
        f0.p(this$0, "this$0");
        f0.p(entry, "$entry");
        f0.p(owner, "owner");
        f0.p(event, "event");
        if (event == Lifecycle.Event.ON_RESUME && this$0.b().b().getValue().contains(entry)) {
            if (this$0.A(2)) {
                Log.v("FragmentNavigator", "Marking transition complete for entry " + entry + " due to fragment " + owner + " view lifecycle reaching RESUMED");
            }
            this$0.b().e(entry);
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            if (this$0.A(2)) {
                Log.v("FragmentNavigator", "Marking transition complete for entry " + entry + " due to fragment " + owner + " view lifecycle reaching DESTROYED");
            }
            this$0.b().e(entry);
        }
    }

    @Override // yh.l
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final v invoke(final NavBackStackEntry entry) {
        f0.p(entry, "entry");
        final FragmentNavigator fragmentNavigator = this.f25112b;
        return new v() { // from class: androidx.navigation.fragment.h
            @Override // androidx.lifecycle.v
            public final void d(y yVar, Lifecycle.Event event) {
                FragmentNavigator$fragmentViewObserver$1.c(fragmentNavigator, entry, yVar, event);
            }
        };
    }
}
