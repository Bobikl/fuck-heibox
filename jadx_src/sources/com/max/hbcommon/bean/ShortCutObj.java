package com.max.hbcommon.bean;

import android.content.Intent;
import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class ShortCutObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -2569452701869141185L;
    private Bitmap iconBitmap;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f66941id;
    private Intent[] intents;
    private String label;

    public ShortCutObj() {
    }

    public ShortCutObj(String str, String str2, Bitmap bitmap, Intent[] intentArr) {
        this.f66941id = str;
        this.label = str2;
        this.iconBitmap = bitmap;
        this.intents = intentArr;
    }

    public Bitmap getIconBitmap() {
        return this.iconBitmap;
    }

    public String getId() {
        return this.f66941id;
    }

    public Intent[] getIntents() {
        return this.intents;
    }

    public String getLabel() {
        return this.label;
    }

    public void setIconBitmap(Bitmap bitmap) {
        this.iconBitmap = bitmap;
    }

    public void setId(String str) {
        this.f66941id = str;
    }

    public void setIntents(Intent[] intentArr) {
        this.intents = intentArr;
    }

    public void setLabel(String str) {
        this.label = str;
    }
}
