package com.huawei.hms.feature.dynamic;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.huawei.hms.feature.dynamic.LifecycleDelegate;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes7.dex */
public abstract class DeferredLifecycleHelper<T extends LifecycleDelegate> {
    public static final int STATUS_ONCREATED = 1;
    public static final int STATUS_ONCREATEVIEW = 2;
    public static final int STATUS_ONINFLATE = 0;
    public static final int STATUS_ONRESUME = 5;
    public static final int STATUS_ONSTART = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f60608e = "DeferredLifecycleHelper";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f60609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bundle f60610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinkedList<g> f60611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public OnDelegateCreatedListener<T> f60612d = new a();

    public class a implements OnDelegateCreatedListener<T> {
        public a() {
        }

        @Override // com.huawei.hms.feature.dynamic.OnDelegateCreatedListener
        public void onDelegateCreated(T t10) {
            DeferredLifecycleHelper.this.f60609a = t10;
            Iterator it = DeferredLifecycleHelper.this.f60611c.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(DeferredLifecycleHelper.this.f60609a);
            }
            DeferredLifecycleHelper.this.f60611c.clear();
            DeferredLifecycleHelper.this.f60610b = null;
        }
    }

    public class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f60614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Bundle f60615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Bundle f60616c;

        public b(Activity activity, Bundle bundle, Bundle bundle2) {
            this.f60614a = activity;
            this.f60615b = bundle;
            this.f60616c = bundle2;
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g
        public int a() {
            return 0;
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g
        public void a(LifecycleDelegate lifecycleDelegate) {
            DeferredLifecycleHelper.this.f60609a.onInflate(this.f60614a, this.f60615b, this.f60616c);
        }
    }

    public class c implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bundle f60618a;

        public c(Bundle bundle) {
            this.f60618a = bundle;
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g
        public int a() {
            return 1;
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g
        public void a(LifecycleDelegate lifecycleDelegate) {
            Log.d(DeferredLifecycleHelper.f60608e, "IDelegateLifeCycleCall onCreate:");
            lifecycleDelegate.onCreate(this.f60618a);
        }
    }

    public class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FrameLayout f60620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LayoutInflater f60621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f60622c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Bundle f60623d;

        public d(FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            this.f60620a = frameLayout;
            this.f60621b = layoutInflater;
            this.f60622c = viewGroup;
            this.f60623d = bundle;
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g
        public int a() {
            return 2;
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g
        public void a(LifecycleDelegate lifecycleDelegate) {
            this.f60620a.removeAllViews();
            this.f60620a.addView(DeferredLifecycleHelper.this.f60609a.onCreateView(this.f60621b, this.f60622c, this.f60623d));
        }
    }

    public class e implements g {
        public e() {
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g
        public int a() {
            return 4;
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g
        public void a(LifecycleDelegate lifecycleDelegate) {
            Log.d(DeferredLifecycleHelper.f60608e, "IDelegateLifeCycleCall onStart:");
            lifecycleDelegate.onStart();
        }
    }

    public class f implements g {
        public f() {
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g
        public int a() {
            return 5;
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g
        public void a(LifecycleDelegate lifecycleDelegate) {
            Log.d(DeferredLifecycleHelper.f60608e, "IDelegateLifeCycleCall onResume:");
            lifecycleDelegate.onResume();
        }
    }

    public interface g {
        int a();

        void a(LifecycleDelegate lifecycleDelegate);
    }

    private void a(int i10) {
        while (!this.f60611c.isEmpty() && this.f60611c.getLast().a() >= i10) {
            this.f60611c.removeLast();
        }
    }

    private void a(Bundle bundle, g gVar) {
        T t10 = this.f60609a;
        if (t10 != null) {
            gVar.a(t10);
            return;
        }
        if (this.f60611c == null) {
            this.f60611c = new LinkedList<>();
        }
        this.f60611c.add(gVar);
        if (bundle != null) {
            Bundle bundle2 = this.f60610b;
            if (bundle2 == null) {
                Object objClone = bundle.clone();
                if (objClone != null && (objClone instanceof Bundle)) {
                    this.f60610b = (Bundle) objClone;
                }
            } else {
                bundle2.putAll(bundle);
            }
        }
        createDelegate(this.f60612d);
    }

    public abstract void createDelegate(OnDelegateCreatedListener<T> onDelegateCreatedListener);

    public T getDelegate() {
        return this.f60609a;
    }

    public void onCreate(Bundle bundle) {
        a(bundle, new c(bundle));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        a(bundle, new d(frameLayout, layoutInflater, viewGroup, bundle));
        return frameLayout;
    }

    public void onDestroy() {
        T t10 = this.f60609a;
        if (t10 != null) {
            t10.onDestroy();
        } else {
            a(0);
        }
    }

    public void onDestroyView() {
        T t10 = this.f60609a;
        if (t10 != null) {
            t10.onDestroyView();
        } else {
            a(1);
        }
    }

    public void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
        a(bundle2, new b(activity, bundle, bundle2));
    }

    public void onLowMemory() {
        T t10 = this.f60609a;
        if (t10 != null) {
            t10.onLowMemory();
        }
    }

    public void onPause() {
        T t10 = this.f60609a;
        if (t10 != null) {
            t10.onPause();
        } else {
            a(5);
        }
    }

    public void onResume() {
        a((Bundle) null, new f());
    }

    public void onSaveInstanceState(Bundle bundle) {
        T t10 = this.f60609a;
        if (t10 != null) {
            t10.onSaveInstanceState(bundle);
            return;
        }
        Bundle bundle2 = this.f60610b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    public void onStart() {
        a((Bundle) null, new e());
    }

    public void onStop() {
        T t10 = this.f60609a;
        if (t10 != null) {
            t10.onStop();
        } else {
            a(4);
        }
    }
}
