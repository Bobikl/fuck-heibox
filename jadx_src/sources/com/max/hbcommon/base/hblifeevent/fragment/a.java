package com.max.hbcommon.base.hblifeevent.fragment;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
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

/* JADX INFO: compiled from: AccelWorldHBFragmentLifeEvent.kt */
/* JADX INFO: loaded from: classes9.dex */
@t0({"SMAP\nAccelWorldHBFragmentLifeEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccelWorldHBFragmentLifeEvent.kt\ncom/max/hbcommon/base/hblifeevent/fragment/AccelWorldHBFragmentLifeEventKt\n+ 2 KAnnotatedElements.kt\nkotlin/reflect/full/KAnnotatedElements\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,63:1\n20#2:64\n288#3,2:65\n13309#4,2:67\n*S KotlinDebug\n*F\n+ 1 AccelWorldHBFragmentLifeEvent.kt\ncom/max/hbcommon/base/hblifeevent/fragment/AccelWorldHBFragmentLifeEventKt\n*L\n16#1:64\n16#1:65,2\n21#1:67,2\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private static final String f66914a = "AccelWorldHBFragmentLifeEvent";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    public static final String f66915b = "AccelWorldHBFragmentLifeEvent__proxy__manager__success";
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    public static final List<FragmentManager.m> a(@e Fragment fragment) {
        Object next;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fragment}, null, changeQuickRedirect, true, c.d.f31383m2, new Class[]{Fragment.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Iterator<T> it = n0.d(fragment.getClass()).getAnnotations().iterator();
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
                    if (FragmentManager.m.class.isAssignableFrom(xh.a.e(dVar))) {
                        try {
                            arrayList.add((FragmentManager.m) KClasses.e(dVar));
                            Log.d(f66914a, "Created instance of " + dVar.F());
                        } catch (Exception e10) {
                            Log.e(f66914a, "无法创建 " + dVar.F() + " 的实例：" + e10.getMessage());
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static final void b(@e Fragment fragment, @d l<? super FragmentManager.m, b2> callBack) {
        List<FragmentManager.m> listA;
        if (PatchProxy.proxy(new Object[]{fragment, callBack}, null, changeQuickRedirect, true, c.d.f31406n2, new Class[]{Fragment.class, l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(callBack, "callBack");
        if (fragment == null || (listA = a(fragment)) == null) {
            return;
        }
        if (!(!listA.isEmpty())) {
            listA = null;
        }
        if (listA != null) {
            Iterator<FragmentManager.m> it = listA.iterator();
            while (it.hasNext()) {
                callBack.invoke(it.next());
            }
        }
    }

    public static final boolean c(@e Fragment fragment) {
        Bundle arguments;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fragment}, null, changeQuickRedirect, true, c.d.f31452p2, new Class[]{Fragment.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (fragment == null || (arguments = fragment.getArguments()) == null) {
            return false;
        }
        return arguments.getBoolean(f66915b, false);
    }

    public static final void d(@e Fragment fragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{fragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, c.d.f31429o2, new Class[]{Fragment.class, Boolean.TYPE}, Void.TYPE).isSupported || fragment == null) {
            return;
        }
        if (fragment.getArguments() == null) {
            fragment.setArguments(new Bundle());
        }
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            arguments.putBoolean(f66915b, z10);
        }
    }

    @d
    public static final String e() {
        return f66914a;
    }
}
