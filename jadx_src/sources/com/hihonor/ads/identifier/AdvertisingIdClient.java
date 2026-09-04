package com.hihonor.ads.identifier;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public class AdvertisingIdClient {

    public static final class Info {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public String f59982id;
        public boolean isLimit;
    }

    public static native Info getAdvertisingIdInfo(Context context);

    public static native boolean isAdvertisingIdAvailable(Context context);
}
