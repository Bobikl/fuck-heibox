package com.max.xiaoheihe.view.popuplist;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.core.view.j1;
import com.max.component.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PopupListComponent.kt */
/* JADX INFO: loaded from: classes13.dex */
@o(parameters = 0)
@n9.a({g.class})
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f96041a = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: PopupListComponent.kt */
    public static final class a implements com.max.xiaoheihe.view.popuplist.a.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.xiaoheihe.view.popuplist.a.h
        public boolean a(@e View view, @e View view2, int i10) {
            return true;
        }

        @Override // com.max.xiaoheihe.view.popuplist.a.h
        public void b(@e View view, int i10, int i11) {
            Object[] objArr = {view, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49606, new Class[]{View.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.f("点击了" + (i11 + 1));
        }

        @Override // com.max.xiaoheihe.view.popuplist.a.h
        public /* synthetic */ void onDismiss() {
            b.a(this);
        }
    }

    @Override // com.max.component.g
    @d
    public View a(@d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 49605, new Class[]{Context.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        TextView textView = new TextView(context);
        textView.setText("长按展示");
        textView.setGravity(17);
        textView.setTextSize(1, 16.0f);
        textView.setPadding(30, 20, 30, 20);
        textView.setTextColor(-1);
        textView.setBackgroundColor(j1.f21601t);
        ArrayList arrayList = new ArrayList();
        arrayList.add("测试1");
        arrayList.add("测试2");
        arrayList.add("测试3");
        arrayList.add("测试4");
        arrayList.add("测试5");
        arrayList.add("测试6");
        arrayList.add("测试7");
        arrayList.add("测试8");
        arrayList.add("测试9");
        new com.max.xiaoheihe.view.popuplist.a(context).q(textView, arrayList, new a());
        return textView;
    }

    @Override // com.max.component.g
    @e
    public String b() {
        return "https://imgheybox.max-c.com/oa/2024/10/18/f7b82535e0254d5cd2c4bb2832553112.png";
    }

    @Override // com.max.component.g
    @d
    public String c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49604, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String simpleName = com.max.xiaoheihe.view.popuplist.a.class.getSimpleName();
        f0.o(simpleName, "PopupList::class.java.simpleName");
        return simpleName;
    }

    @Override // com.max.component.g
    @d
    public String d() {
        return "common";
    }

    @Override // com.max.component.g
    @d
    public String e() {
        return "Popover";
    }
}
