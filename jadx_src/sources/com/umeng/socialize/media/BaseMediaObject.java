package com.umeng.socialize.media;

import android.os.Parcel;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseMediaObject implements UMediaObject {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f106223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f106224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Map<String, Object> f106225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected String f106226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected UMImage f106227e;
    public String mText;

    public BaseMediaObject() {
        this.mText = null;
        this.f106223a = "";
        this.f106224b = "";
        this.f106225c = new HashMap();
        this.f106226d = "";
    }

    protected BaseMediaObject(Parcel parcel) {
        this.mText = null;
        this.f106223a = "";
        this.f106224b = "";
        this.f106225c = new HashMap();
        this.f106226d = "";
        if (parcel != null) {
            this.f106223a = parcel.readString();
            this.f106224b = parcel.readString();
        }
    }

    public BaseMediaObject(String str) {
        this.mText = null;
        this.f106223a = "";
        this.f106224b = "";
        this.f106225c = new HashMap();
        this.f106226d = "";
        this.f106223a = str;
    }

    public String getDescription() {
        return this.f106226d;
    }

    public UMImage getThumbImage() {
        return this.f106227e;
    }

    public String getTitle() {
        return this.f106224b;
    }

    public Map<String, Object> getmExtra() {
        return this.f106225c;
    }

    @Override // com.umeng.socialize.media.UMediaObject
    public boolean isUrlMedia() {
        return !TextUtils.isEmpty(this.f106223a);
    }

    public void setDescription(String str) {
        this.f106226d = str;
    }

    public void setThumb(UMImage uMImage) {
        this.f106227e = uMImage;
    }

    public void setTitle(String str) {
        this.f106224b = str;
    }

    public void setmExtra(String str, Object obj) {
        this.f106225c.put(str, obj);
    }

    public String toString() {
        return "BaseMediaObject [media_url=" + this.f106223a + ", qzone_title=" + this.f106224b + ", qzone_thumb=]";
    }

    @Override // com.umeng.socialize.media.UMediaObject
    public String toUrl() {
        return this.f106223a;
    }
}
