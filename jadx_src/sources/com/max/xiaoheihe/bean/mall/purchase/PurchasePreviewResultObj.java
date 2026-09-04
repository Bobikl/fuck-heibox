package com.max.xiaoheihe.bean.mall.purchase;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbpay.bean.PayTypeInfoObj;
import com.max.xiaoheihe.bean.mall.MallPayExtraInfo;
import com.max.xiaoheihe.bean.mall.cart.SuggestDiscountInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PurchasePreviewResultObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PurchasePreviewResultObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String agreement_title;

    @e
    private SuggestDiscountInfo choose_discount_info;

    @e
    private DeductInfoObj deduct_info;

    @e
    private MallPayExtraInfo pay_info;

    @e
    private KeyDescObj pay_protocol;

    @e
    private List<PayTypeInfoObj> payment_list;

    @e
    private PurchaseWalletObj wallet;

    public PurchasePreviewResultObj(@e String str, @e MallPayExtraInfo mallPayExtraInfo, @e KeyDescObj keyDescObj, @e SuggestDiscountInfo suggestDiscountInfo, @e PurchaseWalletObj purchaseWalletObj, @e List<PayTypeInfoObj> list, @e DeductInfoObj deductInfoObj) {
        this.agreement_title = str;
        this.pay_info = mallPayExtraInfo;
        this.pay_protocol = keyDescObj;
        this.choose_discount_info = suggestDiscountInfo;
        this.wallet = purchaseWalletObj;
        this.payment_list = list;
        this.deduct_info = deductInfoObj;
    }

    public static /* synthetic */ PurchasePreviewResultObj copy$default(PurchasePreviewResultObj purchasePreviewResultObj, String str, MallPayExtraInfo mallPayExtraInfo, KeyDescObj keyDescObj, SuggestDiscountInfo suggestDiscountInfo, PurchaseWalletObj purchaseWalletObj, List list, DeductInfoObj deductInfoObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{purchasePreviewResultObj, str, mallPayExtraInfo, keyDescObj, suggestDiscountInfo, purchaseWalletObj, list, deductInfoObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 15710, new Class[]{PurchasePreviewResultObj.class, String.class, MallPayExtraInfo.class, KeyDescObj.class, SuggestDiscountInfo.class, PurchaseWalletObj.class, List.class, DeductInfoObj.class, Integer.TYPE, Object.class}, PurchasePreviewResultObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PurchasePreviewResultObj) patchProxyResultProxy.result;
        }
        return purchasePreviewResultObj.copy((i10 & 1) != 0 ? purchasePreviewResultObj.agreement_title : str, (i10 & 2) != 0 ? purchasePreviewResultObj.pay_info : mallPayExtraInfo, (i10 & 4) != 0 ? purchasePreviewResultObj.pay_protocol : keyDescObj, (i10 & 8) != 0 ? purchasePreviewResultObj.choose_discount_info : suggestDiscountInfo, (i10 & 16) != 0 ? purchasePreviewResultObj.wallet : purchaseWalletObj, (i10 & 32) != 0 ? purchasePreviewResultObj.payment_list : list, (i10 & 64) != 0 ? purchasePreviewResultObj.deduct_info : deductInfoObj);
    }

    @e
    public final String component1() {
        return this.agreement_title;
    }

    @e
    public final MallPayExtraInfo component2() {
        return this.pay_info;
    }

    @e
    public final KeyDescObj component3() {
        return this.pay_protocol;
    }

    @e
    public final SuggestDiscountInfo component4() {
        return this.choose_discount_info;
    }

    @e
    public final PurchaseWalletObj component5() {
        return this.wallet;
    }

    @e
    public final List<PayTypeInfoObj> component6() {
        return this.payment_list;
    }

    @e
    public final DeductInfoObj component7() {
        return this.deduct_info;
    }

    @d
    public final PurchasePreviewResultObj copy(@e String str, @e MallPayExtraInfo mallPayExtraInfo, @e KeyDescObj keyDescObj, @e SuggestDiscountInfo suggestDiscountInfo, @e PurchaseWalletObj purchaseWalletObj, @e List<PayTypeInfoObj> list, @e DeductInfoObj deductInfoObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, mallPayExtraInfo, keyDescObj, suggestDiscountInfo, purchaseWalletObj, list, deductInfoObj}, this, changeQuickRedirect, false, 15709, new Class[]{String.class, MallPayExtraInfo.class, KeyDescObj.class, SuggestDiscountInfo.class, PurchaseWalletObj.class, List.class, DeductInfoObj.class}, PurchasePreviewResultObj.class);
        return patchProxyResultProxy.isSupported ? (PurchasePreviewResultObj) patchProxyResultProxy.result : new PurchasePreviewResultObj(str, mallPayExtraInfo, keyDescObj, suggestDiscountInfo, purchaseWalletObj, list, deductInfoObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15713, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchasePreviewResultObj)) {
            return false;
        }
        PurchasePreviewResultObj purchasePreviewResultObj = (PurchasePreviewResultObj) obj;
        return f0.g(this.agreement_title, purchasePreviewResultObj.agreement_title) && f0.g(this.pay_info, purchasePreviewResultObj.pay_info) && f0.g(this.pay_protocol, purchasePreviewResultObj.pay_protocol) && f0.g(this.choose_discount_info, purchasePreviewResultObj.choose_discount_info) && f0.g(this.wallet, purchasePreviewResultObj.wallet) && f0.g(this.payment_list, purchasePreviewResultObj.payment_list) && f0.g(this.deduct_info, purchasePreviewResultObj.deduct_info);
    }

    @e
    public final String getAgreement_title() {
        return this.agreement_title;
    }

    @e
    public final SuggestDiscountInfo getChoose_discount_info() {
        return this.choose_discount_info;
    }

    @e
    public final DeductInfoObj getDeduct_info() {
        return this.deduct_info;
    }

    @e
    public final MallPayExtraInfo getPay_info() {
        return this.pay_info;
    }

    @e
    public final KeyDescObj getPay_protocol() {
        return this.pay_protocol;
    }

    @e
    public final List<PayTypeInfoObj> getPayment_list() {
        return this.payment_list;
    }

    @e
    public final PurchaseWalletObj getWallet() {
        return this.wallet;
    }

    public final boolean hasPaymentType(@e String str) {
        List<PayTypeInfoObj> list;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 15708, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (str != null && (list = this.payment_list) != null) {
            Iterator<PayTypeInfoObj> it = list.iterator();
            while (it.hasNext()) {
                if (f0.g(str, it.next().getPay_type())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15712, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.agreement_title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        MallPayExtraInfo mallPayExtraInfo = this.pay_info;
        int iHashCode2 = (iHashCode + (mallPayExtraInfo == null ? 0 : mallPayExtraInfo.hashCode())) * 31;
        KeyDescObj keyDescObj = this.pay_protocol;
        int iHashCode3 = (iHashCode2 + (keyDescObj == null ? 0 : keyDescObj.hashCode())) * 31;
        SuggestDiscountInfo suggestDiscountInfo = this.choose_discount_info;
        int iHashCode4 = (iHashCode3 + (suggestDiscountInfo == null ? 0 : suggestDiscountInfo.hashCode())) * 31;
        PurchaseWalletObj purchaseWalletObj = this.wallet;
        int iHashCode5 = (iHashCode4 + (purchaseWalletObj == null ? 0 : purchaseWalletObj.hashCode())) * 31;
        List<PayTypeInfoObj> list = this.payment_list;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        DeductInfoObj deductInfoObj = this.deduct_info;
        return iHashCode6 + (deductInfoObj != null ? deductInfoObj.hashCode() : 0);
    }

    public final void setAgreement_title(@e String str) {
        this.agreement_title = str;
    }

    public final void setChoose_discount_info(@e SuggestDiscountInfo suggestDiscountInfo) {
        this.choose_discount_info = suggestDiscountInfo;
    }

    public final void setDeduct_info(@e DeductInfoObj deductInfoObj) {
        this.deduct_info = deductInfoObj;
    }

    public final void setPay_info(@e MallPayExtraInfo mallPayExtraInfo) {
        this.pay_info = mallPayExtraInfo;
    }

    public final void setPay_protocol(@e KeyDescObj keyDescObj) {
        this.pay_protocol = keyDescObj;
    }

    public final void setPayment_list(@e List<PayTypeInfoObj> list) {
        this.payment_list = list;
    }

    public final void setWallet(@e PurchaseWalletObj purchaseWalletObj) {
        this.wallet = purchaseWalletObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15711, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PurchasePreviewResultObj(agreement_title=" + this.agreement_title + ", pay_info=" + this.pay_info + ", pay_protocol=" + this.pay_protocol + ", choose_discount_info=" + this.choose_discount_info + ", wallet=" + this.wallet + ", payment_list=" + this.payment_list + ", deduct_info=" + this.deduct_info + ')';
    }
}
