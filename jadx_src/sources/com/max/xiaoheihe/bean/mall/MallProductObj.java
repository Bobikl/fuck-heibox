package com.max.xiaoheihe.bean.mall;

import com.max.hbcommon.bean.AdsBannerObj;
import com.max.hbcommon.network.b;
import com.max.hbwallet.bean.MallOrderStackCouponObj;
import com.max.xiaoheihe.bean.mall.purchase.FlagsV2Obj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class MallProductObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -2081298241025968858L;
    private List<AdsBannerObj> banners;
    private String cat_id;
    private String custom_index;
    private String custom_suggested_from;
    private List<String> flags;
    private List<FlagsV2Obj> flags_v2;
    private MallGameInfoObj game_info;
    private String h_src;
    private String head_image;
    private String is_large_image;
    private String item_type;
    private String layout_style;
    private String name;
    private MallPriceObj price;
    private String protocol;
    private String report_id;
    private transient boolean reported_exposure;
    private String sale_desc;
    private String sale_prefix;
    private String sale_state;
    private String show_default_background_img = "1";
    private String sku_id;
    private String spu_id;
    private MallOrderStackCouponObj stack_coupons;
    private String support_platform_waring;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15504, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallProductObj)) {
            return false;
        }
        MallProductObj mallProductObj = (MallProductObj) obj;
        return Objects.equals(getGame_info(), mallProductObj.getGame_info()) && Objects.equals(getHead_image(), mallProductObj.getHead_image()) && Objects.equals(getName(), mallProductObj.getName()) && Objects.equals(getPrice(), mallProductObj.getPrice()) && Objects.equals(getSale_desc(), mallProductObj.getSale_desc()) && Objects.equals(getSale_state(), mallProductObj.getSale_state()) && Objects.equals(getSku_id(), mallProductObj.getSku_id()) && Objects.equals(getSpu_id(), mallProductObj.getSpu_id()) && Objects.equals(getH_src(), mallProductObj.getH_src()) && Objects.equals(getFlags(), mallProductObj.getFlags()) && Objects.equals(getSale_prefix(), mallProductObj.getSale_prefix()) && Objects.equals(getIs_large_image(), mallProductObj.getIs_large_image()) && Objects.equals(getReport_id(), mallProductObj.getReport_id()) && Objects.equals(getCustom_index(), mallProductObj.getCustom_index()) && Objects.equals(getCustom_suggested_from(), mallProductObj.getCustom_suggested_from()) && Objects.equals(getCat_id(), mallProductObj.getCat_id()) && Objects.equals(getSupport_platform_waring(), mallProductObj.getSupport_platform_waring()) && Objects.equals(getShow_default_background_img(), mallProductObj.getShow_default_background_img());
    }

    public List<AdsBannerObj> getBanners() {
        return this.banners;
    }

    public String getCat_id() {
        return this.cat_id;
    }

    public String getCustom_index() {
        return this.custom_index;
    }

    public String getCustom_suggested_from() {
        return this.custom_suggested_from;
    }

    public List<String> getFlags() {
        return this.flags;
    }

    public List<FlagsV2Obj> getFlags_v2() {
        return this.flags_v2;
    }

    @e
    public MallGameInfoObj getGame_info() {
        return this.game_info;
    }

    public String getH_src() {
        return this.h_src;
    }

    public String getHead_image() {
        return this.head_image;
    }

    public String getIs_large_image() {
        return this.is_large_image;
    }

    public String getItem_type() {
        return this.item_type;
    }

    public String getLayout_style() {
        return this.layout_style;
    }

    public String getName() {
        return this.name;
    }

    public MallPriceObj getPrice() {
        return this.price;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public String getReport_id() {
        return this.report_id;
    }

    public String getSale_desc() {
        return this.sale_desc;
    }

    public String getSale_prefix() {
        return this.sale_prefix;
    }

    public String getSale_state() {
        return this.sale_state;
    }

    public String getShow_default_background_img() {
        return this.show_default_background_img;
    }

    public String getSku_id() {
        return this.sku_id;
    }

    public String getSpu_id() {
        return this.spu_id;
    }

    public MallOrderStackCouponObj getStack_coupons() {
        return this.stack_coupons;
    }

    public String getSupport_platform_waring() {
        return this.support_platform_waring;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15505, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : Objects.hash(getGame_info(), getHead_image(), getName(), getPrice(), getSale_desc(), getSale_state(), getSku_id(), getSpu_id(), getH_src(), getFlags(), getSale_prefix(), getIs_large_image(), getReport_id(), getCustom_index(), getCustom_suggested_from(), getCat_id(), getSupport_platform_waring(), getShow_default_background_img());
    }

    public boolean isBanner() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15502, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        String str = this.item_type;
        if (str == null) {
            return false;
        }
        return "banner".equals(str);
    }

    public boolean isBundle() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15503, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return b.f68052i ? "14".equals(this.cat_id) : "9".equals(this.cat_id);
    }

    public boolean isReported_exposure() {
        return this.reported_exposure;
    }

    public void setBanners(List<AdsBannerObj> list) {
        this.banners = list;
    }

    public void setCat_id(String str) {
        this.cat_id = str;
    }

    public void setCustom_index(String str) {
        this.custom_index = str;
    }

    public void setCustom_suggested_from(String str) {
        this.custom_suggested_from = str;
    }

    public void setFlags(List<String> list) {
        this.flags = list;
    }

    public void setFlags_v2(List<FlagsV2Obj> list) {
        this.flags_v2 = list;
    }

    public void setGame_info(MallGameInfoObj mallGameInfoObj) {
        this.game_info = mallGameInfoObj;
    }

    public void setH_src(String str) {
        this.h_src = str;
    }

    public void setHead_image(String str) {
        this.head_image = str;
    }

    public void setIs_large_image(String str) {
        this.is_large_image = str;
    }

    public void setItem_type(String str) {
        this.item_type = str;
    }

    public void setLayout_style(String str) {
        this.layout_style = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPrice(MallPriceObj mallPriceObj) {
        this.price = mallPriceObj;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setReport_id(String str) {
        this.report_id = str;
    }

    public void setReported_exposure(boolean z10) {
        this.reported_exposure = z10;
    }

    public void setSale_desc(String str) {
        this.sale_desc = str;
    }

    public void setSale_prefix(String str) {
        this.sale_prefix = str;
    }

    public void setSale_state(String str) {
        this.sale_state = str;
    }

    public void setShow_default_background_img(String str) {
        this.show_default_background_img = str;
    }

    public void setSku_id(String str) {
        this.sku_id = str;
    }

    public void setSpu_id(String str) {
        this.spu_id = str;
    }

    public void setStack_coupons(MallOrderStackCouponObj mallOrderStackCouponObj) {
        this.stack_coupons = mallOrderStackCouponObj;
    }

    public void setSupport_platform_waring(String str) {
        this.support_platform_waring = str;
    }
}
