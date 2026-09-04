package com.bytedance.sdk.open.aweme.base;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public interface IMediaObject {
    public static final int TYPE_CONTACT_HTML = 5;
    public static final int TYPE_CONTACT_IMAGE = 4;
    public static final int TYPE_IMAGE = 2;
    public static final int TYPE_MIX = 6;
    public static final int TYPE_TEXT = 1;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_VIDEO = 3;

    boolean checkArgs();

    void serialize(Bundle bundle);

    int type();

    void unserialize(Bundle bundle);
}
