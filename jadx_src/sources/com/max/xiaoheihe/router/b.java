package com.max.xiaoheihe.router;

import android.content.Context;
import android.os.Parcelable;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.sankuai.waimai.router.core.i;
import com.tencent.qcloud.core.util.IOUtils;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.text.u;

/* JADX INFO: compiled from: RequestUtil.kt */
/* JADX INFO: loaded from: classes13.dex */
@o(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final b f94894a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f94895b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    private b() {
    }

    @d
    public final i a(@d Context context, @d String path, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, path, str}, this, changeQuickRedirect, false, 48104, new Class[]{Context.class, String.class, String.class}, i.class);
        if (patchProxyResultProxy.isSupported) {
            return (i) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        f0.p(path, "path");
        HashMap map = str != null ? (HashMap) k.a(str, HashMap.class) : null;
        com.sankuai.waimai.router.common.c cVarF = u.v2(path, "/", false, 2, null) ? com.max.xiaoheihe.base.router.b.f(context, path) : com.max.xiaoheihe.base.router.b.f(context, IOUtils.DIR_SEPARATOR_UNIX + path);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof String) {
                    String str2 = (String) entry.getKey();
                    Object value2 = entry.getValue();
                    f0.n(value2, "null cannot be cast to non-null type kotlin.String");
                    cVarF.U(str2, (String) value2);
                } else if (value instanceof Character) {
                    String str3 = (String) entry.getKey();
                    Object value3 = entry.getValue();
                    f0.n(value3, "null cannot be cast to non-null type kotlin.Char");
                    cVarF.L(str3, ((Character) value3).charValue());
                } else if (value instanceof CharSequence) {
                    String str4 = (String) entry.getKey();
                    Object value4 = entry.getValue();
                    f0.n(value4, "null cannot be cast to non-null type kotlin.CharSequence");
                    cVarF.T(str4, (CharSequence) value4);
                } else if (value instanceof Integer) {
                    String str5 = (String) entry.getKey();
                    Object value5 = entry.getValue();
                    f0.n(value5, "null cannot be cast to non-null type kotlin.Int");
                    cVarF.O(str5, ((Integer) value5).intValue());
                } else if (value instanceof Short) {
                    String str6 = (String) entry.getKey();
                    Object value6 = entry.getValue();
                    f0.n(value6, "null cannot be cast to non-null type kotlin.Short");
                    cVarF.V(str6, ((Short) value6).shortValue());
                } else if (value instanceof Long) {
                    String str7 = (String) entry.getKey();
                    Object value7 = entry.getValue();
                    f0.n(value7, "null cannot be cast to non-null type kotlin.Long");
                    cVarF.P(str7, ((Long) value7).longValue());
                } else if (value instanceof Double) {
                    String str8 = (String) entry.getKey();
                    Object value8 = entry.getValue();
                    f0.n(value8, "null cannot be cast to non-null type kotlin.Double");
                    cVarF.O(str8, (int) ((Double) value8).doubleValue());
                } else if (value instanceof Boolean) {
                    String str9 = (String) entry.getKey();
                    Object value9 = entry.getValue();
                    f0.n(value9, "null cannot be cast to non-null type kotlin.Boolean");
                    cVarF.W(str9, ((Boolean) value9).booleanValue());
                } else if (value instanceof Byte) {
                    String str10 = (String) entry.getKey();
                    Object value10 = entry.getValue();
                    f0.n(value10, "null cannot be cast to non-null type kotlin.Byte");
                    cVarF.K(str10, ((Byte) value10).byteValue());
                } else if (value instanceof Float) {
                    String str11 = (String) entry.getKey();
                    Object value11 = entry.getValue();
                    f0.n(value11, "null cannot be cast to non-null type kotlin.Float");
                    cVarF.O(str11, (int) ((Float) value11).floatValue());
                } else if (value instanceof Parcelable) {
                    String str12 = (String) entry.getKey();
                    Object value12 = entry.getValue();
                    f0.n(value12, "null cannot be cast to non-null type android.os.Parcelable");
                    cVarF.R(str12, (Parcelable) value12);
                } else if (value instanceof Serializable) {
                    String str13 = (String) entry.getKey();
                    Object value13 = entry.getValue();
                    f0.n(value13, "null cannot be cast to non-null type java.io.Serializable");
                    cVarF.S(str13, (Serializable) value13);
                }
            }
        }
        return cVarF;
    }
}
