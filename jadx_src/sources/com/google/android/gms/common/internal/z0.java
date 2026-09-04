package com.google.android.gms.common.internal;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Uri f52576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Uri f52577b;

    static {
        Uri uri = Uri.parse("https://plus.google.com/");
        f52576a = uri;
        f52577b = uri.buildUpon().appendPath("circles").appendPath("find").build();
    }

    public static Intent a() {
        Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }

    public static Intent b(String str, @androidx.annotation.p0 String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(str2)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", str2);
        }
        intent.setData(builderAppendQueryParameter.build());
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }

    public static Intent c(String str) {
        Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(uriFromParts);
        return intent;
    }
}
