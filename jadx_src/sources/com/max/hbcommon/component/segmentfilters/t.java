package com.max.hbcommon.component.segmentfilters;

import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SegmentFilterSelected.kt */
/* JADX INFO: loaded from: classes9.dex */
@n9.a({com.max.component.g.class})
public final class t implements com.max.component.g {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(SegmentFilterSelected filterSelected, View view) {
        if (PatchProxy.proxy(new Object[]{filterSelected, view}, null, changeQuickRedirect, true, bb.c.e.U3, new Class[]{SegmentFilterSelected.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(filterSelected, "$filterSelected");
        filterSelected.i();
    }

    @Override // com.max.component.g
    @dl.d
    public View a(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.e.T3, new Class[]{Context.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        final SegmentFilterSelected segmentFilterSelected = new SegmentFilterSelected(context);
        segmentFilterSelected.e("测试1", null, true);
        segmentFilterSelected.e("测试2", null, true);
        segmentFilterSelected.e("测试3", null, false);
        segmentFilterSelected.e("测试4", null, true);
        segmentFilterSelected.setResetClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.segmentfilters.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t.g(segmentFilterSelected, view);
            }
        });
        return segmentFilterSelected;
    }

    @Override // com.max.component.g
    @dl.e
    public String b() {
        return "https://imgheybox.max-c.com/oa/2024/10/18/15fd0598c5f009c94124cdc63841106c.png";
    }

    @Override // com.max.component.g
    @dl.d
    public String c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.S3, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String simpleName = SegmentFilterSelected.class.getSimpleName();
        f0.o(simpleName, "getSimpleName(...)");
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
        return "SegmentFilterSelected";
    }
}
