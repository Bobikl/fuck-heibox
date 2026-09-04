package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.n0;
import androidx.annotation.p0;
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
public final class zzb extends Fragment implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final WeakHashMap f52393e = new WeakHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f52394b = Collections.synchronizedMap(new androidx.collection.a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f52395c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private Bundle f52396d;

    public static zzb c(Activity activity) {
        zzb zzbVar;
        WeakHashMap weakHashMap = f52393e;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (zzbVar = (zzb) weakReference.get()) != null) {
            return zzbVar;
        }
        try {
            zzb zzbVar2 = (zzb) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (zzbVar2 == null || zzbVar2.isRemoving()) {
                zzbVar2 = new zzb();
                activity.getFragmentManager().beginTransaction().add(zzbVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(zzbVar2));
            return zzbVar2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final boolean A2() {
        return this.f52395c >= 2;
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final void K1(String str, @n0 LifecycleCallback lifecycleCallback) {
        if (this.f52394b.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f52394b.put(str, lifecycleCallback);
        if (this.f52395c > 0) {
            new p(Looper.getMainLooper()).post(new f(this, lifecycleCallback, str));
        }
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final boolean L0() {
        return this.f52395c > 0;
    }

    @Override // com.google.android.gms.common.api.internal.d
    @p0
    public final <T extends LifecycleCallback> T V(String str, Class<T> cls) {
        return cls.cast(this.f52394b.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.d
    @p0
    public final Activity a1() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, @p0 FileDescriptor fileDescriptor, PrintWriter printWriter, @p0 String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f52394b.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, @p0 Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Iterator it = this.f52394b.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).f(i10, i11, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(@p0 Bundle bundle) {
        super.onCreate(bundle);
        this.f52395c = 1;
        this.f52396d = bundle;
        for (Map.Entry entry : this.f52394b.entrySet()) {
            ((LifecycleCallback) entry.getValue()).g(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f52395c = 5;
        Iterator it = this.f52394b.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).h();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f52395c = 3;
        Iterator it = this.f52394b.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).i();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f52394b.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).j(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f52395c = 2;
        Iterator it = this.f52394b.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).k();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f52395c = 4;
        Iterator it = this.f52394b.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).l();
        }
    }
}
