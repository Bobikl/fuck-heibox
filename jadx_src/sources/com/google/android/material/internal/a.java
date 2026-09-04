package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.annotation.i1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.google.android.material.internal.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: CheckableGroup.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@i1
public class a<T extends m<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Integer, T> f54422a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<Integer> f54423b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f54424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f54425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f54426e;

    /* JADX INFO: renamed from: com.google.android.material.internal.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CheckableGroup.java */
    public class C0425a implements m.a<T> {
        C0425a() {
        }

        @Override // com.google.android.material.internal.m.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(T t10, boolean z10) {
            if (!z10) {
                a aVar = a.this;
                if (!aVar.t(t10, aVar.f54426e)) {
                    return;
                }
            } else if (!a.this.g(t10)) {
                return;
            }
            a.this.n();
        }
    }

    /* JADX INFO: compiled from: CheckableGroup.java */
    public interface b {
        void a(@n0 Set<Integer> set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(@n0 m<T> mVar) {
        int id2 = mVar.getId();
        if (this.f54423b.contains(Integer.valueOf(id2))) {
            return false;
        }
        T t10 = this.f54422a.get(Integer.valueOf(k()));
        if (t10 != null) {
            t(t10, false);
        }
        boolean zAdd = this.f54423b.add(Integer.valueOf(id2));
        if (!mVar.isChecked()) {
            mVar.setChecked(true);
        }
        return zAdd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        b bVar = this.f54424c;
        if (bVar != null) {
            bVar.a(i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean t(@n0 m<T> mVar, boolean z10) {
        int id2 = mVar.getId();
        if (!this.f54423b.contains(Integer.valueOf(id2))) {
            return false;
        }
        if (z10 && this.f54423b.size() == 1 && this.f54423b.contains(Integer.valueOf(id2))) {
            mVar.setChecked(true);
            return false;
        }
        boolean zRemove = this.f54423b.remove(Integer.valueOf(id2));
        if (mVar.isChecked()) {
            mVar.setChecked(false);
        }
        return zRemove;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(T t10) {
        this.f54422a.put(Integer.valueOf(t10.getId()), t10);
        if (t10.isChecked()) {
            g(t10);
        }
        t10.setInternalOnCheckedChangeListener(new C0425a());
    }

    public void f(@androidx.annotation.d0 int i10) {
        T t10 = this.f54422a.get(Integer.valueOf(i10));
        if (t10 != null && g(t10)) {
            n();
        }
    }

    public void h() {
        boolean z10 = !this.f54423b.isEmpty();
        Iterator<T> it = this.f54422a.values().iterator();
        while (it.hasNext()) {
            t(it.next(), false);
        }
        if (z10) {
            n();
        }
    }

    @n0
    public Set<Integer> i() {
        return new HashSet(this.f54423b);
    }

    @n0
    public List<Integer> j(@n0 ViewGroup viewGroup) {
        Set<Integer> setI = i();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof m) && setI.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    @androidx.annotation.d0
    public int k() {
        if (!this.f54425d || this.f54423b.isEmpty()) {
            return -1;
        }
        return this.f54423b.iterator().next().intValue();
    }

    public boolean l() {
        return this.f54426e;
    }

    public boolean m() {
        return this.f54425d;
    }

    public void o(T t10) {
        t10.setInternalOnCheckedChangeListener(null);
        this.f54422a.remove(Integer.valueOf(t10.getId()));
        this.f54423b.remove(Integer.valueOf(t10.getId()));
    }

    public void p(@p0 b bVar) {
        this.f54424c = bVar;
    }

    public void q(boolean z10) {
        this.f54426e = z10;
    }

    public void r(boolean z10) {
        if (this.f54425d != z10) {
            this.f54425d = z10;
            h();
        }
    }

    public void s(@androidx.annotation.d0 int i10) {
        T t10 = this.f54422a.get(Integer.valueOf(i10));
        if (t10 != null && t(t10, this.f54426e)) {
            n();
        }
    }
}
