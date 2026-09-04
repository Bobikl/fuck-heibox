package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MultiDimensionRadarObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class MultiDimensionScore implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private String dimension_name;

    @d
    private String score;

    public MultiDimensionScore(@d String dimension_name, @d String score) {
        f0.p(dimension_name, "dimension_name");
        f0.p(score, "score");
        this.dimension_name = dimension_name;
        this.score = score;
    }

    public static /* synthetic */ MultiDimensionScore copy$default(MultiDimensionScore multiDimensionScore, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{multiDimensionScore, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 14941, new Class[]{MultiDimensionScore.class, String.class, String.class, Integer.TYPE, Object.class}, MultiDimensionScore.class);
        if (patchProxyResultProxy.isSupported) {
            return (MultiDimensionScore) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = multiDimensionScore.dimension_name;
        }
        if ((i10 & 2) != 0) {
            str2 = multiDimensionScore.score;
        }
        return multiDimensionScore.copy(str, str2);
    }

    @d
    public final String component1() {
        return this.dimension_name;
    }

    @d
    public final String component2() {
        return this.score;
    }

    @d
    public final MultiDimensionScore copy(@d String dimension_name, @d String score) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dimension_name, score}, this, changeQuickRedirect, false, 14940, new Class[]{String.class, String.class}, MultiDimensionScore.class);
        if (patchProxyResultProxy.isSupported) {
            return (MultiDimensionScore) patchProxyResultProxy.result;
        }
        f0.p(dimension_name, "dimension_name");
        f0.p(score, "score");
        return new MultiDimensionScore(dimension_name, score);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14944, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiDimensionScore)) {
            return false;
        }
        MultiDimensionScore multiDimensionScore = (MultiDimensionScore) obj;
        return f0.g(this.dimension_name, multiDimensionScore.dimension_name) && f0.g(this.score, multiDimensionScore.score);
    }

    @d
    public final String getDimension_name() {
        return this.dimension_name;
    }

    @d
    public final String getScore() {
        return this.score;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14943, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (this.dimension_name.hashCode() * 31) + this.score.hashCode();
    }

    public final void setDimension_name(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 14938, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.dimension_name = str;
    }

    public final void setScore(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 14939, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.score = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14942, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MultiDimensionScore(dimension_name=" + this.dimension_name + ", score=" + this.score + ')';
    }
}
