package androidx.activity;

import androidx.annotation.k0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: OnBackPressedCallback.kt */
/* JADX INFO: loaded from: classes.dex */
@t0({"SMAP\nOnBackPressedCallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackPressedCallback.kt\nandroidx/activity/OnBackPressedCallback\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,85:1\n1855#2,2:86\n*S KotlinDebug\n*F\n+ 1 OnBackPressedCallback.kt\nandroidx/activity/OnBackPressedCallback\n*L\n67#1:86,2\n*E\n"})
public abstract class o {

    @dl.d
    private final CopyOnWriteArrayList<d> cancellables = new CopyOnWriteArrayList<>();

    @dl.e
    private yh.a<b2> enabledChangedCallback;
    private boolean isEnabled;

    public o(boolean z10) {
        this.isEnabled = z10;
    }

    @xh.h(name = "addCancellable")
    public final void addCancellable(@dl.d d cancellable) {
        f0.p(cancellable, "cancellable");
        this.cancellables.add(cancellable);
    }

    @dl.e
    public final yh.a<b2> getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    @k0
    public abstract void handleOnBackPressed();

    @k0
    public final boolean isEnabled() {
        return this.isEnabled;
    }

    @k0
    public final void remove() {
        Iterator<T> it = this.cancellables.iterator();
        while (it.hasNext()) {
            ((d) it.next()).cancel();
        }
    }

    @xh.h(name = "removeCancellable")
    public final void removeCancellable(@dl.d d cancellable) {
        f0.p(cancellable, "cancellable");
        this.cancellables.remove(cancellable);
    }

    @k0
    public final void setEnabled(boolean z10) {
        this.isEnabled = z10;
        yh.a<b2> aVar = this.enabledChangedCallback;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(@dl.e yh.a<b2> aVar) {
        this.enabledChangedCallback = aVar;
    }
}
