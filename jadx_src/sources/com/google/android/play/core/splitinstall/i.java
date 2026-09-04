package com.google.android.play.core.splitinstall;

import android.app.Activity;
import android.content.IntentSender;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.IntentSenderRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class i implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l0 f56251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k1 f56252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f1 f56253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n0 f56254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f56255e = new Handler(Looper.getMainLooper());

    i(l0 l0Var, k1 k1Var, f1 f1Var, n0 n0Var) {
        this.f56251a = l0Var;
        this.f56252b = k1Var;
        this.f56253c = f1Var;
        this.f56254d = n0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List t(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Locale) it.next()).toLanguageTag());
        }
        return arrayList;
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final com.google.android.gms.tasks.k<Void> a(List<Locale> list) {
        return this.f56251a.f(t(list));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0047  */
    @Override // com.google.android.play.core.splitinstall.c
    public final com.google.android.gms.tasks.k<Integer> b(e eVar) {
        Set setD;
        com.google.android.play.core.splitinstall.internal.i1 i1Var = new com.google.android.play.core.splitinstall.internal.i1();
        i1Var.b(1);
        eVar.a().isEmpty();
        List<Locale> listA = eVar.a();
        if (!listA.isEmpty() && (setD = this.f56253c.d()) != null) {
            HashSet hashSet = new HashSet();
            Iterator<Locale> it = listA.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getLanguage());
            }
            if (setD.containsAll(hashSet)) {
                if (this.f56253c.c().containsAll(eVar.b()) && Collections.disjoint(eVar.b(), this.f56254d.a())) {
                    this.f56255e.post(new l1(this, eVar));
                    return com.google.android.gms.tasks.n.g(0);
                }
            }
        } else if (this.f56253c.c().containsAll(eVar.b())) {
            this.f56255e.post(new l1(this, eVar));
            return com.google.android.gms.tasks.n.g(0);
        }
        this.f56254d.d(eVar.b());
        return this.f56251a.j(eVar.b(), t(eVar.a()), i1Var);
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final com.google.android.gms.tasks.k<Void> c(List<String> list) {
        this.f56254d.c(list);
        return this.f56251a.g(list);
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final boolean d(f fVar, androidx.activity.result.g<IntentSenderRequest> gVar) {
        if (fVar.i() != 8 || fVar.g() == null) {
            return false;
        }
        gVar.b(new IntentSenderRequest.a(fVar.g().getIntentSender()).a());
        return true;
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final synchronized void e(g gVar) {
        this.f56252b.j(gVar);
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final com.google.android.gms.tasks.k<Void> f(List<String> list) {
        return this.f56251a.d(list);
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final synchronized void g(g gVar) {
        this.f56252b.k(gVar);
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final synchronized void h(g gVar) {
        this.f56252b.d(gVar);
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final synchronized void i(g gVar) {
        this.f56252b.b(gVar);
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final Set<String> j() {
        Set<String> setD = this.f56253c.d();
        return setD == null ? Collections.emptySet() : setD;
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final boolean k(f fVar, Activity activity, int i10) throws IntentSender.SendIntentException {
        return o(fVar, new m1(this, activity), i10);
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final com.google.android.gms.tasks.k<Void> l(List<Locale> list) {
        return this.f56251a.e(t(list));
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final com.google.android.gms.tasks.k<Void> m(int i10) {
        return this.f56251a.c(i10);
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final com.google.android.gms.tasks.k<List<f>> n() {
        return this.f56251a.i();
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final boolean o(f fVar, com.google.android.play.core.common.a aVar, int i10) throws IntentSender.SendIntentException {
        if (fVar.i() != 8 || fVar.g() == null) {
            return false;
        }
        aVar.a(fVar.g().getIntentSender(), i10, null, 0, 0, 0, null);
        return true;
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final com.google.android.gms.tasks.k<f> p(int i10) {
        return this.f56251a.h(i10);
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final Set<String> q() {
        return this.f56253c.c();
    }
}
