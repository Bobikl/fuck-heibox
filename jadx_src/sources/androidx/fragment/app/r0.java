package androidx.fragment.app;

import android.view.View;
import androidx.core.app.p3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: FragmentTransition.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nFragmentTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentTransition.kt\nandroidx/fragment/app/FragmentTransition\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n515#2:123\n500#2,6:124\n125#3:130\n152#3,3:131\n125#3:134\n152#3,3:135\n125#3:138\n152#3,3:139\n1855#4,2:142\n*S KotlinDebug\n*F\n+ 1 FragmentTransition.kt\nandroidx/fragment/app/FragmentTransition\n*L\n50#1:123\n50#1:124,6\n53#1:130\n53#1:131,3\n98#1:134\n98#1:135,3\n99#1:138\n99#1:139,3\n113#1:142,2\n*E\n"})
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final r0 f23810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    @xh.e
    public static final t0 f23811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    @xh.e
    public static final t0 f23812c;

    static {
        r0 r0Var = new r0();
        f23810a = r0Var;
        f23811b = new s0();
        f23812c = r0Var.c();
    }

    private r0() {
    }

    @xh.m
    public static final void a(@dl.d Fragment inFragment, @dl.d Fragment outFragment, boolean z10, @dl.d androidx.collection.a<String, View> sharedElements, boolean z11) {
        kotlin.jvm.internal.f0.p(inFragment, "inFragment");
        kotlin.jvm.internal.f0.p(outFragment, "outFragment");
        kotlin.jvm.internal.f0.p(sharedElements, "sharedElements");
        p3 enterTransitionCallback = z10 ? outFragment.getEnterTransitionCallback() : inFragment.getEnterTransitionCallback();
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList(sharedElements.size());
            Iterator<Map.Entry<String, View>> it = sharedElements.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getValue());
            }
            ArrayList arrayList2 = new ArrayList(sharedElements.size());
            Iterator<Map.Entry<String, View>> it2 = sharedElements.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().getKey());
            }
            if (z11) {
                enterTransitionCallback.g(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.f(arrayList2, arrayList, null);
            }
        }
    }

    @dl.e
    @xh.m
    public static final String b(@dl.d androidx.collection.a<String, String> aVar, @dl.d String value) {
        kotlin.jvm.internal.f0.p(aVar, "<this>");
        kotlin.jvm.internal.f0.p(value, "value");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : aVar.entrySet()) {
            if (kotlin.jvm.internal.f0.g(entry.getValue(), value)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return (String) CollectionsKt___CollectionsKt.B2(arrayList);
    }

    private final t0 c() {
        try {
            kotlin.jvm.internal.f0.n(androidx.transition.e.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return (t0) androidx.transition.e.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    @xh.m
    public static final void d(@dl.d androidx.collection.a<String, String> aVar, @dl.d androidx.collection.a<String, View> namedViews) {
        kotlin.jvm.internal.f0.p(aVar, "<this>");
        kotlin.jvm.internal.f0.p(namedViews, "namedViews");
        int size = aVar.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (!namedViews.containsKey(aVar.k(size))) {
                aVar.i(size);
            }
        }
    }

    @xh.m
    public static final void e(@dl.d List<? extends View> views, int i10) {
        kotlin.jvm.internal.f0.p(views, "views");
        Iterator<T> it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i10);
        }
    }

    @xh.m
    public static final boolean f() {
        return (f23811b == null && f23812c == null) ? false : true;
    }
}
