package com.max.xiaoheihe.view;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: CustomDialog.java */
/* JADX INFO: loaded from: classes13.dex */
public class d extends Dialog {

    /* JADX INFO: compiled from: CustomDialog.java */
    public static class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f95932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private View f95933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private d f95934c;

        public a(Context context) {
            this.f95932a = context;
        }

        @SuppressLint({"WrongViewCast"})
        public d a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49421, new Class[0], d.class);
            if (patchProxyResultProxy.isSupported) {
                return (d) patchProxyResultProxy.result;
            }
            d dVar = new d(this.f95932a, R.style.Dialog);
            this.f95934c = dVar;
            return dVar;
        }

        public d b() {
            return this.f95934c;
        }

        public a c(View view) {
            this.f95933b = view;
            return this;
        }
    }

    public d(Context context) {
        super(context);
    }

    public d(Context context, int i10) {
        super(context, i10);
    }
}
