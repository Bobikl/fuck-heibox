package com.huawei.hmf.tasks.a;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.util.Log;
import com.huawei.hmf.tasks.ExecuteResult;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final WeakHashMap<Activity, WeakReference<g>> f60210b = new WeakHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<WeakReference<ExecuteResult<?>>> f60211a = new ArrayList();

    private static g a(Activity activity) {
        g gVarA;
        WeakHashMap<Activity, WeakReference<g>> weakHashMap = f60210b;
        WeakReference<g> weakReference = weakHashMap.get(activity);
        if (weakReference != null && weakReference.get() != null) {
            return weakReference.get();
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        try {
            g gVar = (g) fragmentManager.findFragmentByTag("com.huawei.hmf.tasks.lifecycle_fragment_tag");
            if (gVar == null) {
                try {
                    gVarA = a(fragmentManager);
                } catch (ClassCastException e10) {
                    e = e10;
                    gVarA = gVar;
                    Log.e("LifecycleCallbackFrg", "found LifecycleCallbackFragment but the type do not match. " + e.getMessage());
                    return gVarA;
                }
            } else {
                gVarA = gVar;
            }
            try {
                weakHashMap.put(activity, new WeakReference<>(gVarA));
            } catch (ClassCastException e11) {
                e = e11;
                Log.e("LifecycleCallbackFrg", "found LifecycleCallbackFragment but the type do not match. " + e.getMessage());
            }
        } catch (ClassCastException e12) {
            e = e12;
            gVarA = null;
        }
        return gVarA;
    }

    private static g a(FragmentManager fragmentManager) {
        g gVar = null;
        try {
            g gVar2 = new g();
            try {
                fragmentManager.beginTransaction().add(gVar2, "com.huawei.hmf.tasks.lifecycle_fragment_tag").commitAllowingStateLoss();
                return gVar2;
            } catch (Exception e10) {
                e = e10;
                gVar = gVar2;
                Log.e("LifecycleCallbackFrg", "create fragment failed." + e.getMessage());
                return gVar;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public static void a(Activity activity, ExecuteResult executeResult) {
        g gVarA = a(activity);
        if (gVarA != null) {
            synchronized (gVarA.f60211a) {
                gVarA.f60211a.add(new WeakReference<>(executeResult));
            }
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        synchronized (this.f60211a) {
            Iterator<WeakReference<ExecuteResult<?>>> it = this.f60211a.iterator();
            while (it.hasNext()) {
                ExecuteResult<?> executeResult = it.next().get();
                if (executeResult != null) {
                    executeResult.cancel();
                }
            }
            this.f60211a.clear();
        }
    }
}
