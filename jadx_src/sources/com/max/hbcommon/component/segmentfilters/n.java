package com.max.hbcommon.component.segmentfilters;

import android.content.Context;
import android.view.View;
import com.max.hbcommon.bean.segmentfilter.FilterGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SecondaryWindowSegmentFilterView.kt */
/* JADX INFO: loaded from: classes9.dex */
@n9.a({com.max.component.g.class})
public final class n implements com.max.component.g {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.max.component.g
    @dl.d
    public View a(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.e.D3, new Class[]{Context.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        SecondaryWindowSegmentFilterView secondaryWindowSegmentFilterView = new SecondaryWindowSegmentFilterView(context);
        List<FilterGroup> listB = com.max.hbutils.utils.k.b("[\n      {\n        \"filters\": [\n          {\n            \"key\": \"0\",\n            \"desc\": \"0\\u5206\"\n          },\n          {\n            \"key\": \"1\",\n            \"desc\": \"1\\u5206\"\n          },\n          {\n            \"key\": \"2\",\n            \"desc\": \"2\\u5206\"\n          },\n          {\n            \"key\": \"3\",\n            \"desc\": \"3\\u5206\"\n          },\n          {\n            \"key\": \"4\",\n            \"desc\": \"4\\u5206\"\n          },\n          {\n            \"key\": \"5\",\n            \"desc\": \"5\\u5206\"\n          },\n          {\n            \"key\": \"6\",\n            \"desc\": \"6\\u5206\"\n          },\n          {\n            \"key\": \"7\",\n            \"desc\": \"7\\u5206\"\n          },\n          {\n            \"key\": \"8\",\n            \"desc\": \"8\\u5206\"\n          },\n          {\n            \"key\": \"9\",\n            \"desc\": \"9\\u5206\"\n          },\n          {\n            \"key\": \"10\",\n            \"desc\": \"10\\u5206\"\n          }\n        ],\n        \"type\": \"slider\",\n        \"pin\": \"none\",\n        \"key\": \"filter_score\",\n        \"desc\": \"\\u8bc4\\u5206\"\n      },\n      {\n        \"show_sort_type\": [\n          \"discount\",\n          \"peakuser\",\n          \"sold\",\n          \"peakuser_max\",\n          \"cut_off\",\n          \"score\",\n          \"peakuser_fall\",\n          \"discount_percent\",\n          \"popular\",\n          \"peakuser_rise\",\n          \"heybox_wish\",\n          \"newly_discount\"\n        ],\n        \"filters\": [\n          {\n            \"key\": \"all\",\n            \"desc\": \"\\u5168\\u90e8\"\n          },\n          {\n            \"key\": \"coming_soon\",\n            \"desc\": \"\\u5373\\u5c06\\u63a8\\u51fa\"\n          }\n        ],\n        \"key\": \"filter_release\",\n        \"desc\": \"\\u53d1\\u5e03\\u65f6\\u95f4\"\n      },\n      {\n        \"filters\": [\n          {\n            \"key\": \"all\",\n            \"desc\": \"\\u5168\\u90e8\"\n          },\n          {\n            \"key\": \"ea\",\n            \"desc\": \"\\u62a2\\u5148\\u4f53\\u9a8c\"\n          }\n        ],\n        \"key\": \"filter_version\",\n        \"desc\": \"\\u7248\\u672c\"\n      },\n      {\n        \"filters\": [\n          {\n            \"key\": \"0\",\n            \"desc\": \"\\u4e0d\\u663e\\u793aDLC\"\n          },\n          {\n            \"key\": \"1\",\n            \"desc\": \"\\u663e\\u793aDLC\"\n          }\n        ],\n        \"key\": \"show_dlc\",\n        \"desc\": \"\\u662f\\u5426\\u663e\\u793aDLC\"\n      },\n      {\n        \"filters\": [\n          {\n            \"key\": \"0\",\n            \"desc\": \"\\u5168\\u90e8\"\n          },\n          {\n            \"key\": \"1\",\n            \"desc\": \"\\u4e2d\\u6587\"\n          }\n        ],\n        \"key\": \"only_chinese\",\n        \"desc\": \"\\u8bed\\u8a00\"\n      }\n    ]", FilterGroup.class);
        f0.o(listB, "deserializeList(...)");
        secondaryWindowSegmentFilterView.setList(listB);
        return secondaryWindowSegmentFilterView;
    }

    @Override // com.max.component.g
    @dl.e
    public String b() {
        return "https://imgheybox.max-c.com/oa/2024/10/18/96588cd2bda88f42a866ed61badca2fa.png";
    }

    @Override // com.max.component.g
    @dl.d
    public String c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.C3, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String simpleName = SecondaryWindowSegmentFilterView.class.getSimpleName();
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
        return "SegmentFilter3";
    }
}
