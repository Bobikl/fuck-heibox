package com.starlightc.ucropplus.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes4.dex */
public class AspectRatio implements Parcelable {
    public static final Parcelable.Creator<AspectRatio> CREATOR = new Parcelable.Creator<AspectRatio>() { // from class: com.starlightc.ucropplus.model.AspectRatio.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AspectRatio createFromParcel(Parcel parcel) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, 50043, new Class[]{Parcel.class}, AspectRatio.class);
            return patchProxyResultProxy.isSupported ? (AspectRatio) patchProxyResultProxy.result : new AspectRatio(parcel);
        }

        /* JADX WARN: Type inference failed for: r9v2, types: [com.starlightc.ucropplus.model.AspectRatio, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ AspectRatio createFromParcel(Parcel parcel) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, 50045, new Class[]{Parcel.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : createFromParcel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AspectRatio[] newArray(int i10) {
            return new AspectRatio[i10];
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [com.starlightc.ucropplus.model.AspectRatio[], java.lang.Object[]] */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ AspectRatio[] newArray(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 50044, new Class[]{Integer.TYPE}, Object[].class);
            return patchProxyResultProxy.isSupported ? (Object[]) patchProxyResultProxy.result : newArray(i10);
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;

    @p0
    private final String mAspectRatioTitle;
    private final float mAspectRatioX;
    private final float mAspectRatioY;

    public AspectRatio(Parcel parcel) {
        this.mAspectRatioTitle = parcel.readString();
        this.mAspectRatioX = parcel.readFloat();
        this.mAspectRatioY = parcel.readFloat();
    }

    public AspectRatio(@p0 String str, float f10, float f11) {
        this.mAspectRatioTitle = str;
        this.mAspectRatioX = f10;
        this.mAspectRatioY = f11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @p0
    public String getAspectRatioTitle() {
        return this.mAspectRatioTitle;
    }

    public float getAspectRatioX() {
        return this.mAspectRatioX;
    }

    public float getAspectRatioY() {
        return this.mAspectRatioY;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        if (PatchProxy.proxy(new Object[]{parcel, new Integer(i10)}, this, changeQuickRedirect, false, 50042, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        parcel.writeString(this.mAspectRatioTitle);
        parcel.writeFloat(this.mAspectRatioX);
        parcel.writeFloat(this.mAspectRatioY);
    }
}
