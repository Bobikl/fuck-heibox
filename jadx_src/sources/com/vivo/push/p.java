package com.vivo.push;

import android.net.Uri;

/* JADX INFO: compiled from: PushConstants.java */
/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uri f106626a = Uri.parse("content://com.vivo.push.sdk.service.SystemPushConfig/config");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Uri f106627b = Uri.parse("content://com.vivo.push.sdk.service.SystemPushConfig/permission");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Uri f106628c = Uri.parse("content://com.vivo.push.sdk.service.SystemPushConfig/clientState");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Uri f106629d = Uri.parse("content://com.vivo.push.sdk.service.SystemPushConfig/debugInfo");

    public static String a(int i10) {
        switch (i10) {
            case 2002:
                return "method_alias_bind";
            case 2003:
                return "method_alias_unbind";
            case 2004:
                return "method_tag_bind";
            case 2005:
                return "method_tag_unbind";
            case 2006:
                return "method_sdk_bind";
            case 2007:
                return "method_sdk_unbind";
            case 2008:
                return "method_stop";
            default:
                return null;
        }
    }
}
