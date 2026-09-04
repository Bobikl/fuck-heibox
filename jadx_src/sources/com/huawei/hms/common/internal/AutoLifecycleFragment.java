package com.huawei.hms.common.internal;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.util.SparseArray;
import com.huawei.hms.api.HuaweiApiClient;

/* JADX INFO: loaded from: classes7.dex */
public class AutoLifecycleFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray<a> f60497a = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f60498b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HuaweiApiClient f60499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final int f60500b;

        public a(int i10, HuaweiApiClient huaweiApiClient) {
            this.f60499a = huaweiApiClient;
            this.f60500b = i10;
        }

        public void a() {
            this.f60499a.disconnect();
        }
    }

    public static AutoLifecycleFragment getInstance(Activity activity) {
        Preconditions.checkMainThread("Must be called on the main thread");
        try {
            AutoLifecycleFragment autoLifecycleFragment = (AutoLifecycleFragment) activity.getFragmentManager().findFragmentByTag("HmsAutoLifecycleFrag");
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (autoLifecycleFragment != null) {
                return autoLifecycleFragment;
            }
            AutoLifecycleFragment autoLifecycleFragment2 = new AutoLifecycleFragment();
            fragmentManager.beginTransaction().add(autoLifecycleFragment2, "HmsAutoLifecycleFrag").commitAllowingStateLoss();
            fragmentManager.executePendingTransactions();
            return autoLifecycleFragment2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag HmsAutoLifecycleFrag is not a AutoLifecycleFragment", e10);
        }
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f60498b = true;
        for (int i10 = 0; i10 < this.f60497a.size(); i10++) {
            this.f60497a.valueAt(i10).f60499a.connect((Activity) null);
        }
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f60498b = false;
        for (int i10 = 0; i10 < this.f60497a.size(); i10++) {
            this.f60497a.valueAt(i10).f60499a.disconnect();
        }
    }

    public void startAutoMange(int i10, HuaweiApiClient huaweiApiClient) {
        Preconditions.checkNotNull(huaweiApiClient, "HuaweiApiClient instance cannot be null");
        Preconditions.checkState(this.f60497a.indexOfKey(i10) < 0, "Already managing a HuaweiApiClient with this clientId: " + i10);
        this.f60497a.put(i10, new a(i10, huaweiApiClient));
        if (this.f60498b) {
            huaweiApiClient.connect((Activity) null);
        }
    }

    public void stopAutoManage(int i10) {
        a aVar = this.f60497a.get(i10);
        this.f60497a.remove(i10);
        if (aVar != null) {
            aVar.a();
        }
    }
}
