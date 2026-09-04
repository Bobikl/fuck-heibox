package com.bytedance.sdk.open.aweme.base;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import i7.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class MediaContent {
    private static final String TAG = "AWEME.SDK.MediaContent";
    public IMediaObject mMediaObject;

    public static class Builder {
        public static final String KEY_IDENTIFIER = "_dyobject_identifier_";

        @SuppressLint({"LongLogTag"})
        public static MediaContent fromBundle(Bundle bundle) {
            MediaContent mediaContent = new MediaContent();
            String string = bundle.getString(KEY_IDENTIFIER);
            if (string != null && string.length() > 0) {
                try {
                    if (string.contains("sdk")) {
                        string = string.replace("sdk", "sdk.account");
                    }
                    IMediaObject iMediaObject = (IMediaObject) Class.forName(string).newInstance();
                    mediaContent.mMediaObject = iMediaObject;
                    iMediaObject.unserialize(bundle);
                    return mediaContent;
                } catch (Exception e10) {
                    Log.e(MediaContent.TAG, "get media object from bundle failed: unknown ident " + string + ", ex = " + e10.getMessage());
                }
            }
            return mediaContent;
        }

        public static Bundle toBundle(MediaContent mediaContent) {
            Bundle bundle = new Bundle();
            IMediaObject iMediaObject = mediaContent.mMediaObject;
            if (iMediaObject != null) {
                iMediaObject.serialize(bundle);
                ArrayList<String> stringArrayList = bundle.getStringArrayList(a.f119229a);
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList(a.f119230b);
                String str = (stringArrayList2 == null || stringArrayList2.size() == 0) ? "" : "com.ss.android.ugc.aweme.opensdk.share.base.TikTokVideoObject";
                if (stringArrayList != null && stringArrayList.size() != 0) {
                    str = "com.ss.android.ugc.aweme.opensdk.share.base.TikTokImageObject";
                }
                bundle.putString(KEY_IDENTIFIER, str);
            }
            return bundle;
        }
    }

    public MediaContent() {
    }

    public MediaContent(IMediaObject iMediaObject) {
        this.mMediaObject = iMediaObject;
    }

    public final boolean checkArgs() {
        return this.mMediaObject.checkArgs();
    }

    public final int getType() {
        IMediaObject iMediaObject = this.mMediaObject;
        if (iMediaObject == null) {
            return 0;
        }
        return iMediaObject.type();
    }
}
