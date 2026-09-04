package com.max.xiaoheihe.bean.bbs;

import com.max.xiaoheihe.module.bbs.post_edit.PostType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.Result;
import kotlin.jvm.internal.f0;
import kotlin.t0;

/* JADX INFO: compiled from: AutoSavaDataObj.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AutoSavaDataObjKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final boolean checkIsValid(@e PostEditAutoSaveDataWrapper<?> postEditAutoSaveDataWrapper) {
        Object objB;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{postEditAutoSaveDataWrapper}, null, changeQuickRedirect, true, 14166, new Class[]{PostEditAutoSaveDataWrapper.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (postEditAutoSaveDataWrapper == null) {
            return false;
        }
        try {
            Result.a aVar = Result.f124476c;
            if (postEditAutoSaveDataWrapper.getPostTypeName() == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            String postTypeName = postEditAutoSaveDataWrapper.getPostTypeName();
            f0.m(postTypeName);
            if (PostType.valueOf(postTypeName) == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Object postEditAutoSaveData = postEditAutoSaveDataWrapper.getPostEditAutoSaveData();
            if (postEditAutoSaveData == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            objB = Result.b(postEditAutoSaveData);
            return Result.j(objB);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            objB = Result.b(t0.a(th2));
        }
    }
}
