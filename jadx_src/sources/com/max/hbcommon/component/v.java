package com.max.hbcommon.component;

import android.content.Context;
import android.view.View;
import com.max.hbcommon.R;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.bean.segmentfilter.FilterGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;

/* JADX INFO: compiled from: HBSecondaryMenuWindowTabLayout.kt */
/* JADX INFO: loaded from: classes9.dex */
@n9.a({com.max.component.g.class})
public final class v implements com.max.component.g {
    public static ChangeQuickRedirect changeQuickRedirect;

    private final ArrayList<KeyDescObj> f() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31525s8, new Class[0], ArrayList.class);
        if (patchProxyResultProxy.isSupported) {
            return (ArrayList) patchProxyResultProxy.result;
        }
        ArrayList<KeyDescObj> arrayList = new ArrayList<>();
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setKey("1");
        keyDescObj.setDesc("热门");
        arrayList.add(keyDescObj);
        KeyDescObj keyDescObj2 = new KeyDescObj();
        keyDescObj2.setKey("2");
        keyDescObj2.setDesc("在线人数");
        arrayList.add(keyDescObj2);
        KeyDescObj keyDescObj3 = new KeyDescObj();
        keyDescObj3.setKey("3");
        keyDescObj3.setDesc("测试");
        arrayList.add(keyDescObj3);
        KeyDescObj keyDescObj4 = new KeyDescObj();
        keyDescObj4.setKey("4");
        keyDescObj4.setDesc("啦啦啦啦");
        arrayList.add(keyDescObj4);
        return arrayList;
    }

    @Override // com.max.component.g
    @dl.d
    public View a(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.d.f31503r8, new Class[]{Context.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        View viewInflate = View.inflate(context, R.layout.layout_hb_secondery_menu_window, null);
        kotlin.jvm.internal.f0.n(viewInflate, "null cannot be cast to non-null type com.max.hbcommon.component.HBSecondaryMenuWindowTabLayout");
        HBSecondaryMenuWindowTabLayout hBSecondaryMenuWindowTabLayout = (HBSecondaryMenuWindowTabLayout) viewInflate;
        ArrayList<KeyDescObj> arrayListF = f();
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setKey(FilterGroup.TYPE_MULTI);
        keyDescObj.setMulti("1");
        keyDescObj.setDesc("多选");
        keyDescObj.setData(f());
        arrayListF.add(1, keyDescObj);
        for (KeyDescObj keyDescObj2 : arrayListF) {
            hBSecondaryMenuWindowTabLayout.i(hBSecondaryMenuWindowTabLayout.I());
        }
        hBSecondaryMenuWindowTabLayout.l0(arrayListF);
        return hBSecondaryMenuWindowTabLayout;
    }

    @Override // com.max.component.g
    @dl.e
    public String b() {
        return "https://imgheybox.max-c.com/oa/2024/10/18/e3bd7e40c94211931e30780e37c32133.png";
    }

    @Override // com.max.component.g
    @dl.d
    public String c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31481q8, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String simpleName = HBSecondaryMenuWindowTabLayout.class.getSimpleName();
        kotlin.jvm.internal.f0.o(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    @Override // com.max.component.g
    @dl.d
    public String d() {
        return com.max.component.b.f65476c;
    }

    @Override // com.max.component.g
    @dl.d
    public String e() {
        return "SegmentFilter2";
    }
}
