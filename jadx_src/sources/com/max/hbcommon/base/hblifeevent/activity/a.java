package com.max.hbcommon.base.hblifeevent.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.util.Log;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.full.KClasses;
import yh.l;

/* JADX INFO: compiled from: AccelWorldHBActivityLifeEvent.kt */
/* JADX INFO: loaded from: classes9.dex */
@t0({"SMAP\nAccelWorldHBActivityLifeEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccelWorldHBActivityLifeEvent.kt\ncom/max/hbcommon/base/hblifeevent/activity/AccelWorldHBActivityLifeEventKt\n+ 2 KAnnotatedElements.kt\nkotlin/reflect/full/KAnnotatedElements\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,63:1\n20#2:64\n288#3,2:65\n13309#4,2:67\n*S KotlinDebug\n*F\n+ 1 AccelWorldHBActivityLifeEvent.kt\ncom/max/hbcommon/base/hblifeevent/activity/AccelWorldHBActivityLifeEventKt\n*L\n16#1:64\n16#1:65,2\n21#1:67,2\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private static final String f66886a = "AccelWorldHBActivityLifeEvent";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    public static final String f66887b = "AccelWorldHBActivityLifeEvent__proxy__manager__success";
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    public static final List<Application.ActivityLifecycleCallbacks> a(@e Activity activity) {
        Object next;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, c.d.N1, new Class[]{Activity.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        if (activity != null) {
            Iterator<T> it = n0.d(activity.getClass()).getAnnotations().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((Annotation) next) instanceof b));
            b bVar = (b) next;
            if (bVar != null) {
                for (kotlin.reflect.d dVar : n0.f(bVar.lifeEvents())) {
                    if (Application.ActivityLifecycleCallbacks.class.isAssignableFrom(xh.a.e(dVar))) {
                        try {
                            arrayList.add((Application.ActivityLifecycleCallbacks) KClasses.e(dVar));
                            Log.d(f66886a, "Created instance of " + dVar.F());
                        } catch (Exception e10) {
                            Log.e(f66886a, "无法创建 " + dVar.F() + " 的实例：" + e10.getMessage());
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static final void b(@e Activity activity, @d l<? super Application.ActivityLifecycleCallbacks, b2> callBack) {
        List<Application.ActivityLifecycleCallbacks> listA;
        if (PatchProxy.proxy(new Object[]{activity, callBack}, null, changeQuickRedirect, true, c.d.O1, new Class[]{Activity.class, l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(callBack, "callBack");
        if (activity == null || (listA = a(activity)) == null) {
            return;
        }
        if (!(!listA.isEmpty())) {
            listA = null;
        }
        if (listA != null) {
            Iterator<Application.ActivityLifecycleCallbacks> it = listA.iterator();
            while (it.hasNext()) {
                callBack.invoke(it.next());
            }
        }
    }

    public static final boolean c(@e Activity activity) {
        Intent intent;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, c.d.Q1, new Class[]{Activity.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (activity == null || (intent = activity.getIntent()) == null) {
            return false;
        }
        return intent.getBooleanExtra(f66887b, false);
    }

    public static final void d(@e Activity activity, boolean z10) {
        if (PatchProxy.proxy(new Object[]{activity, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, c.d.P1, new Class[]{Activity.class, Boolean.TYPE}, Void.TYPE).isSupported || activity == null) {
            return;
        }
        if (activity.getIntent() == null) {
            activity.setIntent(new Intent());
        }
        Intent intent = activity.getIntent();
        if (intent != null) {
            f0.m(intent);
            intent.putExtra(f66887b, z10);
        }
    }

    @d
    public static final String e() {
        return f66886a;
    }
}
