package com.max.xiaoheihe.network.gson;

import androidx.compose.runtime.internal.o;
import com.max.hbuikit.bean.UiKitTextObj;
import com.max.hbuikit.bean.UiKitViewObj;
import com.max.hbuikit.gson.BaseUIKITDeserializer;
import com.max.hbutils.utils.k;
import com.max.xiaoheihe.bean.uikit.UiKitFeedsFeedbackObj;
import com.max.xiaoheihe.bean.uikit.UiKitRichTextObj;
import com.max.xiaoheihe.bean.uikit.UiKitUserLevelObj;
import com.max.xiaoheihe.bean.uikit.UiKitUserMedalObj;
import com.max.xiaoheihe.view.uikit.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: HBUIKITDeserializer.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public class HBUIKITDeserializer extends BaseUIKITDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f94849a = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.max.hbuikit.gson.BaseUIKITDeserializer
    @d
    public UiKitViewObj b(@e String str, @d String jsonStr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, jsonStr}, this, changeQuickRedirect, false, 47689, new Class[]{String.class, String.class}, UiKitViewObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (UiKitViewObj) patchProxyResultProxy.result;
        }
        f0.p(jsonStr, "jsonStr");
        if (str != null) {
            switch (str.hashCode()) {
                case -842613072:
                    if (str.equals(a.f96190b)) {
                        Object objA = k.a(jsonStr, UiKitRichTextObj.class);
                        f0.o(objA, "{\n                JsonUt…class.java)\n            }");
                        return (UiKitViewObj) objA;
                    }
                    break;
                case 705981641:
                    if (str.equals(a.f96194f)) {
                        Object objA2 = k.a(jsonStr, UiKitFeedsFeedbackObj.class);
                        f0.o(objA2, "{\n                JsonUt…class.java)\n            }");
                        return (UiKitViewObj) objA2;
                    }
                    break;
                case 1927915024:
                    if (str.equals(a.f96192d)) {
                        Object objA3 = k.a(jsonStr, UiKitUserLevelObj.class);
                        f0.o(objA3, "{\n                JsonUt…class.java)\n            }");
                        return (UiKitViewObj) objA3;
                    }
                    break;
                case 1928821123:
                    if (str.equals(a.f96193e)) {
                        Object objA4 = k.a(jsonStr, UiKitUserMedalObj.class);
                        f0.o(objA4, "{\n                JsonUt…class.java)\n            }");
                        return (UiKitViewObj) objA4;
                    }
                    break;
                case 2084653684:
                    if (str.equals(a.f96191c)) {
                        Object objA5 = k.a(jsonStr, UiKitTextObj.class);
                        f0.o(objA5, "{\n                JsonUt…class.java)\n            }");
                        return (UiKitViewObj) objA5;
                    }
                    break;
            }
        }
        return super.b(str, jsonStr);
    }
}
