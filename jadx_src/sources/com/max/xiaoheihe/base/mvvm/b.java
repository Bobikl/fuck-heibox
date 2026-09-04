package com.max.xiaoheihe.base.mvvm;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.y0;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: MVVMUtils.kt */
/* JADX INFO: loaded from: classes3.dex */
@t0({"SMAP\nMVVMUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MVVMUtils.kt\ncom/max/xiaoheihe/base/mvvm/MVVMUtilsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,25:1\n4098#2,11:26\n4098#2,11:37\n1#3:48\n*S KotlinDebug\n*F\n+ 1 MVVMUtils.kt\ncom/max/xiaoheihe/base/mvvm/MVVMUtilsKt\n*L\n11#1:26,11\n20#1:37,11\n*E\n"})
public final class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    public static final <VM extends BaseViewModel> VM a(@d ComponentActivity componentActivity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{componentActivity}, null, changeQuickRedirect, true, c.m.qJ, new Class[]{ComponentActivity.class}, BaseViewModel.class);
        if (patchProxyResultProxy.isSupported) {
            return (VM) patchProxyResultProxy.result;
        }
        f0.p(componentActivity, "<this>");
        Type genericSuperclass = componentActivity.getClass().getGenericSuperclass();
        f0.n(genericSuperclass, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
        Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        f0.o(actualTypeArguments, "javaClass.genericSupercl…Type).actualTypeArguments");
        ArrayList arrayList = new ArrayList();
        for (Type type : actualTypeArguments) {
            if (type instanceof Class) {
                arrayList.add(type);
            }
        }
        Object obj = arrayList.get(0);
        f0.n(obj, "null cannot be cast to non-null type java.lang.Class<VM of com.max.xiaoheihe.base.mvvm.MVVMUtilsKt.createViewModel>");
        VM vm = (VM) new y0(componentActivity).a((Class) obj);
        vm.n(componentActivity);
        return vm;
    }

    @d
    public static final <VM extends BaseViewModel> VM b(@d Fragment fragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fragment}, null, changeQuickRedirect, true, c.m.rJ, new Class[]{Fragment.class}, BaseViewModel.class);
        if (patchProxyResultProxy.isSupported) {
            return (VM) patchProxyResultProxy.result;
        }
        f0.p(fragment, "<this>");
        Type genericSuperclass = fragment.getClass().getGenericSuperclass();
        f0.n(genericSuperclass, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
        Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        f0.o(actualTypeArguments, "javaClass.genericSupercl…Type).actualTypeArguments");
        ArrayList arrayList = new ArrayList();
        for (Type type : actualTypeArguments) {
            if (type instanceof Class) {
                arrayList.add(type);
            }
        }
        Object obj = arrayList.get(0);
        f0.n(obj, "null cannot be cast to non-null type java.lang.Class<VM of com.max.xiaoheihe.base.mvvm.MVVMUtilsKt.createViewModel>");
        VM vm = (VM) new y0(fragment).a((Class) obj);
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            vm.n(activity);
        }
        return vm;
    }
}
