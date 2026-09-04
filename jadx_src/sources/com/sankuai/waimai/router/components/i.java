package com.sankuai.waimai.router.components;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.n0;

/* JADX INFO: compiled from: UriSourceTools.java */
/* JADX INFO: loaded from: classes8.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f96470a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f96471b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f96472c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f96473d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f96474e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f96475f = "com.sankuai.waimai.router.from";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f96476g = "com.sankuai.waimai.router.from";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f96477h = false;

    private static int a(Intent intent, String str, int i10) {
        if (intent == null) {
            return i10;
        }
        try {
            return intent.getIntExtra(str, i10);
        } catch (Exception e10) {
            com.sankuai.waimai.router.core.c.e(e10);
            return i10;
        }
    }

    public static int b(Intent intent, int i10) {
        return a(intent, "com.sankuai.waimai.router.from", i10);
    }

    public static int c(Bundle bundle, int i10) {
        return bundle == null ? i10 : bundle.getInt("com.sankuai.waimai.router.from", i10);
    }

    public static int d(@n0 com.sankuai.waimai.router.core.i iVar) {
        return e(iVar, 2);
    }

    public static int e(@n0 com.sankuai.waimai.router.core.i iVar, int i10) {
        return iVar.g("com.sankuai.waimai.router.from", i10);
    }

    public static void f(boolean z10) {
        f96477h = z10;
    }

    public static void g(Intent intent, com.sankuai.waimai.router.core.i iVar) {
        Integer num;
        if (intent == null || iVar == null || (num = (Integer) iVar.d(Integer.class, "com.sankuai.waimai.router.from")) == null) {
            return;
        }
        h(intent, num.intValue());
    }

    public static void h(Intent intent, int i10) {
        if (intent != null) {
            intent.putExtra("com.sankuai.waimai.router.from", i10);
        }
    }

    public static void i(com.sankuai.waimai.router.core.i iVar, int i10) {
        if (iVar != null) {
            iVar.s("com.sankuai.waimai.router.from", Integer.valueOf(i10));
        }
    }

    public static boolean j(com.sankuai.waimai.router.core.i iVar, boolean z10) {
        return f96477h || z10 || d(iVar) != 1;
    }
}
