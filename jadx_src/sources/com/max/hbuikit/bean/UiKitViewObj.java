package com.max.hbuikit.bean;

import bb.c;
import com.max.hbuikit.bean.param.UiKitBackgroundObj;
import com.max.hbuikit.bean.param.UiKitMargin;
import com.max.hbuikit.bean.param.UiKitPadding;
import com.max.hbuikit.utils.UiKitUtil;
import com.max.hbutils.utils.k;
import com.max.hbutils.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: UiKitViewObj.kt */
/* JADX INFO: loaded from: classes13.dex */
public class UiKitViewObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String align_bottom_of;

    @e
    private String align_left_of;

    @e
    private String align_right_of;

    @e
    private String align_top_of;

    @e
    private String alpha;

    @e
    private UiKitBackgroundObj background;

    @e
    private String bottom_of;

    @e
    private List<String> click_action_list;

    @e
    private String click_delay;

    @e
    private String height;

    @e
    private String height_expression;
    private transient boolean is_merged;

    @e
    private String layout_gravity;

    @e
    private String left_of;

    @e
    private UiKitMargin margin;

    @e
    private UiKitPadding padding;

    @e
    private String parent_type;

    @e
    private String right_of;
    private transient boolean template_completed;

    @e
    private String template_id;

    @e
    private String top_of;

    @e
    private String type;

    @e
    private String view_id;

    @e
    private String visibility;

    @e
    private String weight;

    @e
    private String width;

    @e
    private String width_expression;

    @d
    public final UiKitViewObj deepCopy() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.f33695lk, new Class[0], UiKitViewObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (UiKitViewObj) patchProxyResultProxy.result;
        }
        Object objA = k.a(k.p(this), UiKitViewObj.class);
        f0.o(objA, "deserialize(...)");
        return (UiKitViewObj) objA;
    }

    @e
    public final String getAlign_bottom_of() {
        return this.align_bottom_of;
    }

    @e
    public final String getAlign_left_of() {
        return this.align_left_of;
    }

    @e
    public final String getAlign_right_of() {
        return this.align_right_of;
    }

    @e
    public final String getAlign_top_of() {
        return this.align_top_of;
    }

    @e
    public final String getAlpha() {
        return this.alpha;
    }

    @e
    public final UiKitBackgroundObj getBackground() {
        return this.background;
    }

    @e
    public final String getBottom_of() {
        return this.bottom_of;
    }

    @e
    public final List<String> getClick_action_list() {
        return this.click_action_list;
    }

    @e
    public final String getClick_delay() {
        return this.click_delay;
    }

    @e
    public final String getHeight() {
        return this.height;
    }

    public final int getHeightPx() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.f33741nk, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (com.max.hbcommon.utils.c.u(this.height_expression)) {
            String str = this.height;
            if (str != null) {
                return UiKitUtil.p(n.p(str));
            }
            return -2;
        }
        UiKitUtil uiKitUtil = UiKitUtil.f73232a;
        String str2 = this.height_expression;
        f0.m(str2);
        return uiKitUtil.c(str2);
    }

    @e
    public final String getHeight_expression() {
        return this.height_expression;
    }

    @e
    public final String getLayout_gravity() {
        return this.layout_gravity;
    }

    @e
    public final String getLeft_of() {
        return this.left_of;
    }

    @e
    public final UiKitMargin getMargin() {
        return this.margin;
    }

    @e
    public final UiKitPadding getPadding() {
        return this.padding;
    }

    @e
    public final String getParent_type() {
        return this.parent_type;
    }

    @e
    public final String getRight_of() {
        return this.right_of;
    }

    public final boolean getTemplate_completed() {
        return this.template_completed;
    }

    @e
    public final String getTemplate_id() {
        return this.template_id;
    }

    @e
    public final String getTop_of() {
        return this.top_of;
    }

    @e
    public final String getType() {
        return this.type;
    }

    @e
    public final String getView_id() {
        return this.view_id;
    }

    @e
    public final String getVisibility() {
        return this.visibility;
    }

    @e
    public final String getWeight() {
        return this.weight;
    }

    @e
    public final String getWidth() {
        return this.width;
    }

    public final int getWidthPx() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.f33718mk, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (com.max.hbcommon.utils.c.u(this.width_expression)) {
            String str = this.width;
            if (str != null) {
                return UiKitUtil.p(n.p(str));
            }
            return -2;
        }
        UiKitUtil uiKitUtil = UiKitUtil.f73232a;
        String str2 = this.width_expression;
        f0.m(str2);
        return uiKitUtil.c(str2);
    }

    @e
    public final String getWidth_expression() {
        return this.width_expression;
    }

    public final boolean isLayout() {
        return this instanceof UiKitLayoutObj;
    }

    public final boolean is_merged() {
        return this.is_merged;
    }

    public final void setAlign_bottom_of(@e String str) {
        this.align_bottom_of = str;
    }

    public final void setAlign_left_of(@e String str) {
        this.align_left_of = str;
    }

    public final void setAlign_right_of(@e String str) {
        this.align_right_of = str;
    }

    public final void setAlign_top_of(@e String str) {
        this.align_top_of = str;
    }

    public final void setAlpha(@e String str) {
        this.alpha = str;
    }

    public final void setBackground(@e UiKitBackgroundObj uiKitBackgroundObj) {
        this.background = uiKitBackgroundObj;
    }

    public final void setBottom_of(@e String str) {
        this.bottom_of = str;
    }

    public final void setClick_action_list(@e List<String> list) {
        this.click_action_list = list;
    }

    public final void setClick_delay(@e String str) {
        this.click_delay = str;
    }

    public final void setHeight(@e String str) {
        this.height = str;
    }

    public final void setHeight_expression(@e String str) {
        this.height_expression = str;
    }

    public final void setLayout_gravity(@e String str) {
        this.layout_gravity = str;
    }

    public final void setLeft_of(@e String str) {
        this.left_of = str;
    }

    public final void setMargin(@e UiKitMargin uiKitMargin) {
        this.margin = uiKitMargin;
    }

    public final void setPadding(@e UiKitPadding uiKitPadding) {
        this.padding = uiKitPadding;
    }

    public final void setParent_type(@e String str) {
        this.parent_type = str;
    }

    public final void setRight_of(@e String str) {
        this.right_of = str;
    }

    public final void setTemplate_completed(boolean z10) {
        this.template_completed = z10;
    }

    public final void setTemplate_id(@e String str) {
        this.template_id = str;
    }

    public final void setTop_of(@e String str) {
        this.top_of = str;
    }

    public final void setType(@e String str) {
        this.type = str;
    }

    public final void setView_id(@e String str) {
        this.view_id = str;
    }

    public final void setVisibility(@e String str) {
        this.visibility = str;
    }

    public final void setWeight(@e String str) {
        this.weight = str;
    }

    public final void setWidth(@e String str) {
        this.width = str;
    }

    public final void setWidth_expression(@e String str) {
        this.width_expression = str;
    }

    public final void set_merged(boolean z10) {
        this.is_merged = z10;
    }
}
