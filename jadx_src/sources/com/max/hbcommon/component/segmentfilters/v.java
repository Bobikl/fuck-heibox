package com.max.hbcommon.component.segmentfilters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.max.hbcommon.R;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;

/* JADX INFO: compiled from: SegmentFilterView.kt */
/* JADX INFO: loaded from: classes9.dex */
@n9.a({com.max.component.g.class})
public final class v implements com.max.component.g {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.max.component.g
    @dl.d
    public View a(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.e.f32019t4, new Class[]{Context.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        SegmentFilterView segmentFilterView = new SegmentFilterView(context);
        ArrayList arrayList = new ArrayList();
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setDesc(context.getResources().getString(R.string.followed_games));
        keyDescObj.setKey("0");
        keyDescObj.setChecked(true);
        arrayList.add(keyDescObj);
        KeyDescObj keyDescObj2 = new KeyDescObj();
        keyDescObj2.setDesc(context.getResources().getString(R.string.owned_games));
        keyDescObj2.setKey("1");
        keyDescObj2.setShowIcon(true);
        keyDescObj2.setIconId(R.drawable.rb_platform_switch);
        arrayList.add(keyDescObj2);
        KeyDescObj keyDescObj3 = new KeyDescObj();
        keyDescObj3.setDesc("完美通关");
        keyDescObj3.setKey("2");
        arrayList.add(keyDescObj3);
        KeyDescObj keyDescObj4 = new KeyDescObj();
        keyDescObj4.setDesc(context.getResources().getString(R.string.my_comment));
        keyDescObj4.setKey("3");
        arrayList.add(keyDescObj4);
        segmentFilterView.setData(arrayList);
        segmentFilterView.d();
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, ViewUtils.f(context, 34.0f));
        marginLayoutParams.setMarginStart(ViewUtils.f(context, 10.0f));
        marginLayoutParams.setMarginEnd(ViewUtils.f(context, 10.0f));
        segmentFilterView.setLayoutParams(marginLayoutParams);
        return segmentFilterView;
    }

    @Override // com.max.component.g
    @dl.e
    public String b() {
        return "https://imgheybox.max-c.com/bbs/2022/11/15/515fff334189b5a8d993286dec6b36a9.png?imageMogr2/thumbnail/!80p/format/jpg";
    }

    @Override // com.max.component.g
    @dl.d
    public String c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f32002s4, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String strF = n0.d(SegmentFilterView.class).F();
        return strF == null ? "javaClass" : strF;
    }

    @Override // com.max.component.g
    @dl.d
    public String d() {
        return com.max.component.b.f65476c;
    }

    @Override // com.max.component.g
    @dl.d
    public String e() {
        return "SegmentFilter_1";
    }
}
