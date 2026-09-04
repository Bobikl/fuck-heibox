package cn.fly.verify.pure.entity;

import cn.fly.verify.f;
import cn.fly.verify.gd;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class UiElement extends a {
    private String privacyName;
    private String privacyUrl;
    private String slogan;

    public String getPrivacyName() {
        return this.privacyName;
    }

    public String getPrivacyUrl() {
        return this.privacyUrl;
    }

    public String getSlogan() {
        return this.slogan;
    }

    protected void setPrivacyName(String str) {
        this.privacyName = str;
    }

    protected void setPrivacyUrl(String str) {
        this.privacyUrl = str;
    }

    protected void setSlogan(String str) {
        this.slogan = str;
    }

    @Override // cn.fly.verify.pure.entity.a
    public String toJson() {
        try {
            gd gdVar = new gd();
            HashMap map = new HashMap();
            map.put("privacyName", this.privacyName);
            map.put("privacyUrl", this.privacyUrl);
            map.put("slogan", this.slogan);
            return gdVar.a(map);
        } catch (Throwable th2) {
            f.a().a(th2, "[FlyVerify][%s][%s] ==>%s", this.tag, "toJson", "Error parse entity to json");
            return "";
        }
    }
}
