package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.internal.common.p;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class h extends Fragment implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final WeakHashMap f52389e = new WeakHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f52390b = Collections.synchronizedMap(new androidx.collection.a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f52391c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private Bundle f52392d;

    public static h N3(FragmentActivity fragmentActivity) {
        h hVar;
        WeakHashMap weakHashMap = f52389e;
        WeakReference weakReference = (WeakReference) weakHashMap.get(fragmentActivity);
        if (weakReference != null && (hVar = (h) weakReference.get()) != null) {
            return hVar;
        }
        try {
            h hVar2 = (h) fragmentActivity.getSupportFragmentManager().s0("SupportLifecycleFragmentImpl");
            if (hVar2 == null || hVar2.isRemoving()) {
                hVar2 = new h();
                fragmentActivity.getSupportFragmentManager().u().g(hVar2, "SupportLifecycleFragmentImpl").n();
            }
            weakHashMap.put(fragmentActivity, new WeakReference(hVar2));
            return hVar2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final boolean A2() {
        return this.f52391c >= 2;
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final void K1(String str, @n0 LifecycleCallback lifecycleCallback) {
        if (this.f52390b.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f52390b.put(str, lifecycleCallback);
        if (this.f52391c > 0) {
            new p(Looper.getMainLooper()).post(new g(this, lifecycleCallback, str));
        }
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final boolean L0() {
        return this.f52391c > 0;
    }

    @Override // com.google.android.gms.common.api.internal.d
    @p0
    public final <T extends LifecycleCallback> T V(String str, Class<T> cls) {
        return cls.cast(this.f52390b.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.d
    @p0
    public final /* synthetic */ Activity a1() {
        return getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, @p0 FileDescriptor fileDescriptor, PrintWriter printWriter, @p0 String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f52390b.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i10, int i11, @p0 Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Iterator it = this.f52390b.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).f(i10, i11, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@p0 Bundle bundle) {
        super.onCreate(bundle);
        this.f52391c = 1;
        this.f52392d = bundle;
        for (Map.Entry entry : this.f52390b.entrySet()) {
            ((LifecycleCallback) entry.getValue()).g(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f52391c = 5;
        Iterator it = this.f52390b.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f52391c = 3;
        Iterator it = this.f52390b.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).i();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f52390b.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).j(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f52391c = 2;
        Iterator it = this.f52390b.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).k();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f52391c = 4;
        Iterator it = this.f52390b.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).l();
        }
    }
}
