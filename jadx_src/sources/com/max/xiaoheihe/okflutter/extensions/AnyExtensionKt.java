package com.max.xiaoheihe.okflutter.extensions;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AnyExtension.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"TAG", "", "", "getTAG", "(Ljava/lang/Object;)Ljava/lang/String;", "heybox_okflutter_android_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class AnyExtensionKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    public static final String getTAG(@d Object obj) {
        String name;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, null, changeQuickRedirect, true, 47934, new Class[]{Object.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        f0.p(obj, "<this>");
        if (obj.getClass().isAnonymousClass()) {
            name = obj.getClass().getName();
            if (name.length() > 23) {
                f0.o(name, "name");
                name = name.substring(name.length() - 23, name.length());
                f0.o(name, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            f0.o(name, "{\n            val name =…/ last 23 chars\n        }");
        } else {
            name = obj.getClass().getSimpleName();
            if (name.length() > 23) {
                f0.o(name, "name");
                name = name.substring(0, 23);
                f0.o(name, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            f0.o(name, "{\n            val name =… first 23 chars\n        }");
        }
        return name;
    }
}
