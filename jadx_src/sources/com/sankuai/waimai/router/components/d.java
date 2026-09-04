package com.sankuai.waimai.router.components;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import androidx.annotation.n0;
import java.util.List;

/* JADX INFO: compiled from: DefaultActivityLauncher.java */
/* JADX INFO: loaded from: classes8.dex */
public class d implements a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f96462m = new d();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f96463l = false;

    @Override // com.sankuai.waimai.router.components.a
    public int a(@n0 com.sankuai.waimai.router.core.i iVar, @n0 Intent intent) {
        if (iVar == null || intent == null) {
            return 500;
        }
        Context contextB = iVar.b();
        Bundle bundle = (Bundle) iVar.d(Bundle.class, a.f96452b);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        Integer num = (Integer) iVar.d(Integer.class, a.f96456f);
        if (num != null) {
            intent.setFlags(num.intValue());
        }
        Integer num2 = (Integer) iVar.d(Integer.class, a.f96453c);
        boolean zA = iVar.a(a.f96457g, false);
        intent.setPackage(contextB.getPackageName());
        int iG = g(iVar, intent, contextB, num2, true);
        if (zA || iG == 200) {
            return iG;
        }
        intent.setPackage(null);
        return g(iVar, intent, contextB, num2, false);
    }

    protected boolean b(Context context, Intent intent) {
        if (!this.f96463l) {
            return true;
        }
        try {
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
            return listQueryIntentActivities != null && listQueryIntentActivities.size() > 0;
        } catch (Exception e10) {
            com.sankuai.waimai.router.core.c.e(e10);
            return false;
        }
    }

    protected void c(com.sankuai.waimai.router.core.i iVar) {
        Context contextB = iVar.b();
        int[] iArr = (int[]) iVar.d(int[].class, a.f96454d);
        if ((contextB instanceof Activity) && iArr != null && iArr.length == 2) {
            ((Activity) contextB).overridePendingTransition(iArr[0], iArr[1]);
        }
    }

    public void d(boolean z10) {
        this.f96463l = z10;
    }

    protected int e(@n0 com.sankuai.waimai.router.core.i iVar, @n0 Intent intent, boolean z10) {
        try {
            com.sankuai.waimai.router.activity.d dVar = (com.sankuai.waimai.router.activity.d) iVar.d(com.sankuai.waimai.router.activity.d.class, a.f96458h);
            if (!(dVar != null && dVar.a(iVar, intent))) {
                return 500;
            }
            c(iVar);
            if (z10) {
                iVar.s(a.f96459i, 1);
                com.sankuai.waimai.router.core.c.f("    internal activity started by StartActivityAction, request = %s", iVar);
                return 200;
            }
            iVar.s(a.f96459i, 2);
            com.sankuai.waimai.router.core.c.f("    external activity started by StartActivityAction, request = %s", iVar);
            return 200;
        } catch (ActivityNotFoundException e10) {
            com.sankuai.waimai.router.core.c.n(e10);
            return 404;
        } catch (SecurityException e11) {
            com.sankuai.waimai.router.core.c.n(e11);
            return 403;
        }
    }

    protected int f(com.sankuai.waimai.router.core.i iVar, @n0 Context context, @n0 Intent intent, Integer num, boolean z10) {
        try {
            Bundle bundle = (Bundle) iVar.d(Bundle.class, a.f96455e);
            if (num == null || !(context instanceof Activity)) {
                androidx.core.content.d.w(context, intent, bundle);
            } else {
                androidx.core.app.b.Q((Activity) context, intent, num.intValue(), bundle);
            }
            c(iVar);
            if (z10) {
                iVar.s(a.f96459i, 1);
                com.sankuai.waimai.router.core.c.f("    internal activity started, request = %s", iVar);
                return 200;
            }
            iVar.s(a.f96459i, 2);
            com.sankuai.waimai.router.core.c.f("    external activity started, request = %s", iVar);
            return 200;
        } catch (ActivityNotFoundException e10) {
            com.sankuai.waimai.router.core.c.n(e10);
            return 404;
        } catch (SecurityException e11) {
            com.sankuai.waimai.router.core.c.n(e11);
            return 403;
        }
    }

    protected int g(@n0 com.sankuai.waimai.router.core.i iVar, @n0 Intent intent, Context context, Integer num, boolean z10) {
        if (!b(context, intent)) {
            return 404;
        }
        if (e(iVar, intent, z10) == 200) {
            return 200;
        }
        return f(iVar, context, intent, num, z10);
    }
}
