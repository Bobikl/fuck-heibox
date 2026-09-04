package com.max.hbutils.utils;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.d1;
import com.max.hbutils.R;
import com.max.hbutils.core.BaseApplication;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: compiled from: ToastUtil.java */
/* JADX INFO: loaded from: classes13.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Toast f73607a;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: ToastUtil.java */
    public class a implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f73608b;

        a(String str) {
            this.f73608b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Vt, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            x.a(this.f73608b);
        }
    }

    /* JADX INFO: compiled from: ToastUtil.java */
    public class b implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f73609b;

        b(String str) {
            this.f73609b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Wt, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            x.b(this.f73609b);
        }
    }

    /* JADX INFO: compiled from: ToastUtil.java */
    public class c implements InvocationHandler {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f73610b;

        c(Object obj) {
            this.f73610b = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, method, objArr}, this, changeQuickRedirect, false, bb.c.k.Xt, new Class[]{Object.class, Method.class, Object[].class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            if ("enqueueToast".equals(method.getName()) || "enqueueToastEx".equals(method.getName())) {
                objArr[0] = "android";
            }
            return method.invoke(this.f73610b, objArr);
        }
    }

    /* JADX INFO: compiled from: ToastUtil.java */
    public class d implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f73611b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f73612c;

        d(String str, String str2) {
            this.f73611b = str;
            this.f73612c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Yt, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            x.o(this.f73611b, this.f73612c);
        }
    }

    /* JADX INFO: compiled from: ToastUtil.java */
    public class e implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f73613b;

        e(int i10) {
            this.f73613b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Zt, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            x.c(this.f73613b);
        }
    }

    /* JADX INFO: compiled from: ToastUtil.java */
    public class f implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f73614b;

        f(String str) {
            this.f73614b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.au, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            x.d(this.f73614b);
        }
    }

    static /* synthetic */ void a(String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.Rt, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        s(str);
    }

    static /* synthetic */ void b(String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.St, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        r(str);
    }

    static /* synthetic */ void c(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.Tt, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        k(i10);
    }

    static /* synthetic */ void d(String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.Ut, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        l(str);
    }

    public static void e() {
        Toast toast;
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.k.Gt, new Class[0], Void.TYPE).isSupported || (toast = f73607a) == null) {
            return;
        }
        toast.cancel();
    }

    private static Toast f(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.k.Ht, new Class[]{Context.class}, Toast.class);
        if (patchProxyResultProxy.isSupported) {
            return (Toast) patchProxyResultProxy.result;
        }
        if (Build.VERSION.SDK_INT >= 28 || f73607a == null) {
            f73607a = new Toast(context.getApplicationContext());
            f73607a.setView(((LayoutInflater) context.getApplicationContext().getSystemService("layout_inflater")).inflate(R.layout.toast_main, (ViewGroup) null));
        }
        f73607a.setDuration(0);
        return f73607a;
    }

    public static boolean g() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.k.Ct, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return Looper.myLooper() == Looper.getMainLooper();
    }

    private static boolean h() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.k.Jt, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return Build.VERSION.SDK_INT < 29 && !u.c(BaseApplication.a());
    }

    public static void i(@d1 int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.Nt, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (g()) {
            k(i10);
        } else {
            new Handler(Looper.getMainLooper()).post(new e(i10));
        }
    }

    public static void j(String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.Pt, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (g()) {
            l(str);
        } else {
            new Handler(Looper.getMainLooper()).post(new f(str));
        }
    }

    private static void k(@d1 int i10) {
        BaseApplication baseApplicationA;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.Ot, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (baseApplicationA = BaseApplication.a()) == null) {
            return;
        }
        j(baseApplicationA.getResources().getString(i10));
    }

    private static void l(String str) {
        BaseApplication baseApplicationA;
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.Qt, new Class[]{String.class}, Void.TYPE).isSupported || (baseApplicationA = BaseApplication.a()) == null || str == null) {
            return;
        }
        Toast toast = new Toast(baseApplicationA);
        View viewInflate = ((LayoutInflater) baseApplicationA.getSystemService("layout_inflater")).inflate(R.layout.toast_bottom_hint, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_toast_text);
        textView.setText(str);
        textView.setMaxWidth(ViewUtils.L(baseApplicationA) - ViewUtils.f(baseApplicationA, 80.0f));
        toast.setView(viewInflate);
        pb.m mVarH = ob.a.h();
        toast.setGravity(80, 0, (mVarH == null || mVarH.c() <= 0) ? ViewUtils.f(baseApplicationA, 70.0f) : mVarH.c());
        toast.setDuration(1);
        toast.show();
    }

    public static void m(Object obj) {
        Context applicationContext;
        String string;
        if (PatchProxy.proxy(new Object[]{obj}, null, changeQuickRedirect, true, bb.c.k.Dt, new Class[]{Object.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.x("ToastUtil, showLongToast" + Log.getStackTraceString(new Throwable()));
        if (obj == null || (applicationContext = BaseApplication.a().getApplicationContext()) == null) {
            return;
        }
        if (obj instanceof String) {
            string = (String) obj;
        } else if (!(obj instanceof Integer)) {
            return;
        } else {
            string = applicationContext.getString(((Integer) obj).intValue());
        }
        if (g()) {
            r(string);
        } else {
            new Handler(Looper.getMainLooper()).post(new b(string));
        }
    }

    public static void n(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.k.Lt, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (g()) {
            o(str, str2);
        } else {
            new Handler(Looper.getMainLooper()).post(new d(str, str2));
        }
    }

    public static void o(String str, String str2) {
        BaseApplication baseApplicationA;
        if (PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.k.Mt, new Class[]{String.class, String.class}, Void.TYPE).isSupported || (baseApplicationA = BaseApplication.a()) == null) {
            return;
        }
        td.e eVarD = td.e.d((LayoutInflater) baseApplicationA.getSystemService("layout_inflater"), null, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(ViewUtils.L(baseApplicationA) - ViewUtils.f(baseApplicationA, 30.0f), ViewUtils.f(baseApplicationA, 67.0f));
        eVarD.b().setBackgroundDrawable(q.o(baseApplicationA, R.color.divider_secondary_2_color, 16.0f));
        eVarD.f140716c.setText(str);
        eVarD.f140717d.setLayoutParams(layoutParams);
        eVarD.f140715b.setText(str2);
        Toast toast = new Toast(baseApplicationA);
        toast.setDuration(1);
        toast.setGravity(48, 0, 0);
        toast.setView(eVarD.b());
        toast.show();
    }

    public static void p(Object obj) {
        Context applicationContext;
        if (PatchProxy.proxy(new Object[]{obj}, null, changeQuickRedirect, true, bb.c.k.Bt, new Class[]{Object.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.x("ToastUtil, showShortToast" + Log.getStackTraceString(new Throwable()));
        if (obj == null || (applicationContext = BaseApplication.a().getApplicationContext()) == null) {
            return;
        }
        String string = obj instanceof String ? (String) obj : applicationContext.getString(((Integer) obj).intValue());
        if (g()) {
            s(string);
        } else {
            new Handler(Looper.getMainLooper()).post(new a(string));
        }
    }

    private static boolean q(Toast toast) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{toast}, null, changeQuickRedirect, true, bb.c.k.Kt, new Class[]{Toast.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        try {
            Method declaredMethod = Toast.class.getDeclaredMethod("getService", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            Object objNewProxyInstance = Proxy.newProxyInstance(toast.getClass().getClassLoader(), new Class[]{Class.forName("android.app.INotificationManager")}, new c(objInvoke));
            Field declaredField = Toast.class.getDeclaredField("sService");
            declaredField.setAccessible(true);
            declaredField.set(null, objNewProxyInstance);
            toast.show();
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    private static void r(String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.Ft, new Class[]{String.class}, Void.TYPE).isSupported || BaseApplication.a() == null) {
            return;
        }
        t(str, 1);
    }

    private static void s(String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.Et, new Class[]{String.class}, Void.TYPE).isSupported || BaseApplication.a() == null) {
            return;
        }
        t(str, 0);
    }

    private static void t(String str, int i10) {
        if (PatchProxy.proxy(new Object[]{str, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.It, new Class[]{String.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.x("ToastUtil, showToastText" + Log.getStackTraceString(new Throwable()));
        Context applicationContext = BaseApplication.a().getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        Toast toastF = f(applicationContext);
        f73607a = toastF;
        TextView textView = (TextView) toastF.getView().findViewById(R.id.tv_toast);
        ImageView imageView = (ImageView) f73607a.getView().findViewById(R.id.iv_icon);
        if (textView != null) {
            textView.setText(str);
            textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
        }
        if (imageView != null) {
            if ((TextUtils.isEmpty(str) || !str.contains("未完成")) && !TextUtils.isEmpty(str) && (str.contains("成功") || str.contains("完成") || str.contains("已点赞") || str.contains("已取消") || str.contains("正在下载"))) {
                imageView.setImageResource(R.drawable.common_toast_success_filled_24x24);
            } else {
                imageView.setImageResource(R.drawable.common_toast_notice_filled_24x24);
            }
        }
        f73607a.setDuration(i10);
        f73607a.setGravity(17, 0, 0);
        if (!h()) {
            f73607a.show();
        } else {
            if (q(f73607a)) {
                return;
            }
            f73607a.show();
        }
    }
}
