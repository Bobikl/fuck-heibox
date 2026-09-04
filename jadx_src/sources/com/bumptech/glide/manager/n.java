package com.bumptech.glide.manager;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.u;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: RequestManagerRetriever.java */
/* JADX INFO: loaded from: classes6.dex */
public class n implements Handler.Callback {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @j1
    static final String f41778g = "com.bumptech.glide.manager";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b f41779h = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile com.bumptech.glide.j f41780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f41781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.collection.a<View, Fragment> f41782d = new androidx.collection.a<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f41783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final l f41784f;

    /* JADX INFO: compiled from: RequestManagerRetriever.java */
    public class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.manager.n.b
        @n0
        public com.bumptech.glide.j a(@n0 Glide glide, @n0 j jVar, @n0 o oVar, @n0 Context context) {
            return new com.bumptech.glide.j(glide, jVar, oVar, context);
        }
    }

    /* JADX INFO: compiled from: RequestManagerRetriever.java */
    public interface b {
        @n0
        com.bumptech.glide.j a(@n0 Glide glide, @n0 j jVar, @n0 o oVar, @n0 Context context);
    }

    public n(@p0 b bVar) {
        bVar = bVar == null ? f41779h : bVar;
        this.f41781c = bVar;
        this.f41784f = new l(bVar);
        this.f41783e = b();
    }

    @TargetApi(17)
    private static void a(@n0 Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static i b() {
        return (u.f41602g && u.f41601f) ? new h() : new f();
    }

    @p0
    private static Activity c(@n0 Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private static void d(@p0 Collection<Fragment> collection, @n0 Map<View, Fragment> map) {
        if (collection == null) {
            return;
        }
        for (Fragment fragment : collection) {
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                d(fragment.getChildFragmentManager().J0(), map);
            }
        }
    }

    @p0
    private Fragment e(@n0 View view, @n0 FragmentActivity fragmentActivity) {
        this.f41782d.clear();
        d(fragmentActivity.getSupportFragmentManager().J0(), this.f41782d);
        View viewFindViewById = fragmentActivity.findViewById(R.id.content);
        Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = this.f41782d.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f41782d.clear();
        return fragment;
    }

    @n0
    private com.bumptech.glide.j l(@n0 Context context) {
        if (this.f41780b == null) {
            synchronized (this) {
                if (this.f41780b == null) {
                    this.f41780b = this.f41781c.a(Glide.e(context.getApplicationContext()), new com.bumptech.glide.manager.a(), new g(), context.getApplicationContext());
                }
            }
        }
        return this.f41780b;
    }

    private static boolean m(Context context) {
        Activity activityC = c(context);
        return activityC == null || !activityC.isFinishing();
    }

    @n0
    @Deprecated
    public com.bumptech.glide.j f(@n0 Activity activity) {
        return h(activity.getApplicationContext());
    }

    @n0
    @TargetApi(17)
    @Deprecated
    public com.bumptech.glide.j g(@n0 android.app.Fragment fragment) {
        if (fragment.getActivity() != null) {
            return h(fragment.getActivity().getApplicationContext());
        }
        throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
    }

    @n0
    public com.bumptech.glide.j h(@n0 Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (com.bumptech.glide.util.o.v() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return k((FragmentActivity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return h(contextWrapper.getBaseContext());
                }
            }
        }
        return l(context);
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public boolean handleMessage(Message message) {
        return false;
    }

    @n0
    public com.bumptech.glide.j i(@n0 View view) {
        if (com.bumptech.glide.util.o.u()) {
            return h(view.getContext().getApplicationContext());
        }
        com.bumptech.glide.util.m.e(view);
        com.bumptech.glide.util.m.f(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityC = c(view.getContext());
        if (activityC != null && (activityC instanceof FragmentActivity)) {
            FragmentActivity fragmentActivity = (FragmentActivity) activityC;
            Fragment fragmentE = e(view, fragmentActivity);
            return fragmentE != null ? j(fragmentE) : k(fragmentActivity);
        }
        return h(view.getContext().getApplicationContext());
    }

    @n0
    public com.bumptech.glide.j j(@n0 Fragment fragment) {
        com.bumptech.glide.util.m.f(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (com.bumptech.glide.util.o.u()) {
            return h(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.f41783e.a(fragment.getActivity());
        }
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Context context = fragment.getContext();
        return this.f41784f.b(context, Glide.e(context.getApplicationContext()), fragment.getLifecycle(), childFragmentManager, fragment.isVisible());
    }

    @n0
    public com.bumptech.glide.j k(@n0 FragmentActivity fragmentActivity) {
        if (com.bumptech.glide.util.o.u()) {
            return h(fragmentActivity.getApplicationContext());
        }
        a(fragmentActivity);
        this.f41783e.a(fragmentActivity);
        boolean zM = m(fragmentActivity);
        return this.f41784f.b(fragmentActivity, Glide.e(fragmentActivity.getApplicationContext()), fragmentActivity.getLifecycle(), fragmentActivity.getSupportFragmentManager(), zM);
    }
}
