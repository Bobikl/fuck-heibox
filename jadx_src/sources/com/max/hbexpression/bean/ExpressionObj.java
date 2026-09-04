package com.max.hbexpression.bean;

import androidx.annotation.p0;
import bb.c;
import com.max.hbexpression.ExpressionAssetManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public class ExpressionObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -2846441225615352550L;
    private String emoji_key;
    private final String name;
    private int resId;
    private int type;
    private String url;

    public ExpressionObj(String str, int i10) {
        this.emoji_key = str;
        this.resId = i10;
        this.type = 1;
        this.name = ExpressionAssetManager.f69919a.p(str);
    }

    public ExpressionObj(String str, int i10, String str2) {
        this.emoji_key = str;
        this.resId = i10;
        this.url = str2;
        this.name = ExpressionAssetManager.f69919a.p(str);
    }

    public String getEmoji_key() {
        return this.emoji_key;
    }

    @p0
    public String getFilePath() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.g.f33024p2, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : ExpressionAssetManager.f69919a.k(this.emoji_key);
    }

    public String getName() {
        return this.name;
    }

    public int getResId() {
        return this.resId;
    }

    public int getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public void setEmoji_key(String str) {
        this.emoji_key = str;
    }

    public void setResId(int i10) {
        this.resId = i10;
    }

    public void setType(int i10) {
        this.type = i10;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
