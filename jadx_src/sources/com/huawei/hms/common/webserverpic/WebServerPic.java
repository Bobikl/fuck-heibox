package com.huawei.hms.common.webserverpic;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class WebServerPic {
    public static final Parcelable.Creator<WebServerPic> CREATOR = new WebServerPicCreator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f60594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f60595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f60596c;

    public WebServerPic(Uri uri) throws IllegalArgumentException {
        this(uri, 0, 0);
    }

    public WebServerPic(Uri uri, int i10, int i11) throws IllegalArgumentException {
        this.f60594a = uri;
        this.f60595b = i10;
        this.f60596c = i11;
        if (uri == null) {
            throw new IllegalArgumentException("url is not able to be null");
        }
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("width and height should be positive or 0");
        }
    }

    public final int getHeight() {
        return this.f60596c;
    }

    public final Uri getUrl() {
        return this.f60594a;
    }

    public final int getWidth() {
        return this.f60595b;
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "Image %dx%d %s", Integer.valueOf(this.f60595b), Integer.valueOf(this.f60596c), this.f60594a.toString());
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getUrl(), i10, false);
        SafeParcelWriter.writeInt(parcel, 2, getWidth());
        SafeParcelWriter.writeInt(parcel, 3, getHeight());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
