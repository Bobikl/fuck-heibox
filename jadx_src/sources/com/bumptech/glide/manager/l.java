package com.bumptech.glide.manager;

import android.content.Context;
import androidx.annotation.n0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bumptech.glide.Glide;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: LifecycleRequestManagerRetriever.java */
/* JADX INFO: loaded from: classes6.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map<Lifecycle, com.bumptech.glide.j> f41772a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final n.b f41773b;

    /* JADX INFO: compiled from: LifecycleRequestManagerRetriever.java */
    public class a implements k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Lifecycle f41774b;

        a(Lifecycle lifecycle) {
            this.f41774b = lifecycle;
        }

        @Override // com.bumptech.glide.manager.k
        public void onDestroy() {
            l.this.f41772a.remove(this.f41774b);
        }

        @Override // com.bumptech.glide.manager.k
        public void onStart() {
        }

        @Override // com.bumptech.glide.manager.k
        public void onStop() {
        }
    }

    /* JADX INFO: compiled from: LifecycleRequestManagerRetriever.java */
    public final class b implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FragmentManager f41776a;

        b(FragmentManager fragmentManager) {
            this.f41776a = fragmentManager;
        }

        private void b(FragmentManager fragmentManager, Set<com.bumptech.glide.j> set) {
            List<Fragment> listJ0 = fragmentManager.J0();
            int size = listJ0.size();
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment = listJ0.get(i10);
                b(fragment.getChildFragmentManager(), set);
                com.bumptech.glide.j jVarA = l.this.a(fragment.getLifecycle());
                if (jVarA != null) {
                    set.add(jVarA);
                }
            }
        }

        @Override // com.bumptech.glide.manager.o
        @n0
        public Set<com.bumptech.glide.j> a() {
            HashSet hashSet = new HashSet();
            b(this.f41776a, hashSet);
            return hashSet;
        }
    }

    l(@n0 n.b bVar) {
        this.f41773b = bVar;
    }

    com.bumptech.glide.j a(Lifecycle lifecycle) {
        com.bumptech.glide.util.o.b();
        return this.f41772a.get(lifecycle);
    }

    com.bumptech.glide.j b(Context context, Glide glide, Lifecycle lifecycle, FragmentManager fragmentManager, boolean z10) {
        com.bumptech.glide.util.o.b();
        com.bumptech.glide.j jVarA = a(lifecycle);
        if (jVarA != null) {
            return jVarA;
        }
        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(lifecycle);
        com.bumptech.glide.j jVarA2 = this.f41773b.a(glide, lifecycleLifecycle, new b(fragmentManager), context);
        this.f41772a.put(lifecycle, jVarA2);
        lifecycleLifecycle.c(new a(lifecycle));
        if (z10) {
            jVarA2.onStart();
        }
        return jVarA2;
    }
}
