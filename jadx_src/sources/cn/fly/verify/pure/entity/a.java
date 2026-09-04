package cn.fly.verify.pure.entity;

import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a implements Serializable {
    protected final String tag = getClass().getSimpleName();

    private void genCmUiElement(UiElement uiElement) {
        if (uiElement != null) {
            uiElement.setPrivacyUrl("https://wap.cmpassport.com/resources/html/contract.html");
            uiElement.setPrivacyName("中国移动认证服务条款");
            uiElement.setSlogan("中国移动提供认证服务");
        }
    }

    private void genCtUiElement(UiElement uiElement) {
        if (uiElement != null) {
            uiElement.setPrivacyUrl("https://e.189.cn/sdk/agreement/detail.do");
            uiElement.setPrivacyName("中国电信服务与隐私协议");
            uiElement.setSlogan("中国电信提供认证服务");
        }
    }

    private void genCuUiElement(UiElement uiElement) {
        if (uiElement != null) {
            uiElement.setPrivacyUrl("https://ms.zzx9.cn/html/oauth/protocol2.html");
            uiElement.setPrivacyName("中国联通认证服务协议");
            uiElement.setSlogan("中国联通提供认证服务");
        }
    }

    protected UiElement genUiElement(String str) {
        UiElement uiElement = new UiElement();
        if ("CMCC".equals(str)) {
            genCmUiElement(uiElement);
        }
        if ("CUCC".equals(str)) {
            genCuUiElement(uiElement);
        }
        if ("CTCC".equals(str)) {
            genCtUiElement(uiElement);
        }
        return uiElement;
    }

    public abstract String toJson();
}
