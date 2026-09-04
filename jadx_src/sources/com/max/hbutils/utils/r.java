package com.max.hbutils.utils;

import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.Regex;

/* JADX INFO: compiled from: ShapeUtilsHelper.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class r {
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    public static final Pair<String, String> a(@dl.d String input) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{input}, null, changeQuickRedirect, true, bb.c.k.dr, new Class[]{String.class}, Pair.class);
        if (patchProxyResultProxy.isSupported) {
            return (Pair) patchProxyResultProxy.result;
        }
        f0.p(input, "input");
        List listC3 = SequencesKt___SequencesKt.c3(Regex.f(new Regex("#[0-9A-Fa-f]{6,8}"), input, 0, 2, null));
        if (listC3.size() == 2) {
            return new Pair<>(((kotlin.text.k) listC3.get(0)).getValue(), ((kotlin.text.k) listC3.get(1)).getValue());
        }
        return null;
    }
}
