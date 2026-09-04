package com.max.xiaoheihe.bean;

import androidx.compose.runtime.internal.o;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AnimationResultList.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class AnimationResultList implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<AnimationResultObj> animations;

    public AnimationResultList(@e List<AnimationResultObj> list) {
        this.animations = list;
    }

    public static /* synthetic */ AnimationResultList copy$default(AnimationResultList animationResultList, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{animationResultList, list, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.qL, new Class[]{AnimationResultList.class, List.class, Integer.TYPE, Object.class}, AnimationResultList.class);
        if (patchProxyResultProxy.isSupported) {
            return (AnimationResultList) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = animationResultList.animations;
        }
        return animationResultList.copy(list);
    }

    @e
    public final List<AnimationResultObj> component1() {
        return this.animations;
    }

    @d
    public final AnimationResultList copy(@e List<AnimationResultObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, c.m.pL, new Class[]{List.class}, AnimationResultList.class);
        return patchProxyResultProxy.isSupported ? (AnimationResultList) patchProxyResultProxy.result : new AnimationResultList(list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.tL, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnimationResultList) && f0.g(this.animations, ((AnimationResultList) obj).animations);
    }

    @e
    public final List<AnimationResultObj> getAnimations() {
        return this.animations;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.sL, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<AnimationResultObj> list = this.animations;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setAnimations(@e List<AnimationResultObj> list) {
        this.animations = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.rL, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "AnimationResultList(animations=" + this.animations + ')';
    }
}
