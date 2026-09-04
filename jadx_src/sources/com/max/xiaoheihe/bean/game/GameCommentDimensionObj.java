package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MultiDimensionListResult.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameCommentDimensionObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private HashMap<String, String> default_label_map;

    @d
    private String dimension_id;

    @d
    private String dimension_name;

    public GameCommentDimensionObj(@d String dimension_id, @d String dimension_name, @d HashMap<String, String> default_label_map) {
        f0.p(dimension_id, "dimension_id");
        f0.p(dimension_name, "dimension_name");
        f0.p(default_label_map, "default_label_map");
        this.dimension_id = dimension_id;
        this.dimension_name = dimension_name;
        this.default_label_map = default_label_map;
    }

    public static /* synthetic */ GameCommentDimensionObj copy$default(GameCommentDimensionObj gameCommentDimensionObj, String str, String str2, HashMap map, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameCommentDimensionObj, str, str2, map, new Integer(i10), obj}, null, changeQuickRedirect, true, 14697, new Class[]{GameCommentDimensionObj.class, String.class, String.class, HashMap.class, Integer.TYPE, Object.class}, GameCommentDimensionObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameCommentDimensionObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = gameCommentDimensionObj.dimension_id;
        }
        if ((i10 & 2) != 0) {
            str2 = gameCommentDimensionObj.dimension_name;
        }
        if ((i10 & 4) != 0) {
            map = gameCommentDimensionObj.default_label_map;
        }
        return gameCommentDimensionObj.copy(str, str2, map);
    }

    @d
    public final String component1() {
        return this.dimension_id;
    }

    @d
    public final String component2() {
        return this.dimension_name;
    }

    @d
    public final HashMap<String, String> component3() {
        return this.default_label_map;
    }

    @d
    public final GameCommentDimensionObj copy(@d String dimension_id, @d String dimension_name, @d HashMap<String, String> default_label_map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dimension_id, dimension_name, default_label_map}, this, changeQuickRedirect, false, 14696, new Class[]{String.class, String.class, HashMap.class}, GameCommentDimensionObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameCommentDimensionObj) patchProxyResultProxy.result;
        }
        f0.p(dimension_id, "dimension_id");
        f0.p(dimension_name, "dimension_name");
        f0.p(default_label_map, "default_label_map");
        return new GameCommentDimensionObj(dimension_id, dimension_name, default_label_map);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14700, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameCommentDimensionObj)) {
            return false;
        }
        GameCommentDimensionObj gameCommentDimensionObj = (GameCommentDimensionObj) obj;
        return f0.g(this.dimension_id, gameCommentDimensionObj.dimension_id) && f0.g(this.dimension_name, gameCommentDimensionObj.dimension_name) && f0.g(this.default_label_map, gameCommentDimensionObj.default_label_map);
    }

    @d
    public final HashMap<String, String> getDefault_label_map() {
        return this.default_label_map;
    }

    @d
    public final String getDimension_id() {
        return this.dimension_id;
    }

    @d
    public final String getDimension_name() {
        return this.dimension_name;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14699, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (((this.dimension_id.hashCode() * 31) + this.dimension_name.hashCode()) * 31) + this.default_label_map.hashCode();
    }

    public final void setDefault_label_map(@d HashMap<String, String> map) {
        if (PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 14695, new Class[]{HashMap.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(map, "<set-?>");
        this.default_label_map = map;
    }

    public final void setDimension_id(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 14693, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.dimension_id = str;
    }

    public final void setDimension_name(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 14694, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.dimension_name = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14698, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GameCommentDimensionObj(dimension_id=" + this.dimension_id + ", dimension_name=" + this.dimension_name + ", default_label_map=" + this.default_label_map + ')';
    }
}
