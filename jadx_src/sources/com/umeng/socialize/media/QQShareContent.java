package com.umeng.socialize.media;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.connect.share.QQShare;
import com.umeng.socialize.ShareContent;
import com.umeng.socialize.utils.UmengText;

/* JADX INFO: loaded from: classes4.dex */
public class QQShareContent extends SimpleShareContent {
    public int mShareType;
    private String mediaTitle;
    private String mediades;

    public QQShareContent(ShareContent shareContent) {
        super(shareContent);
        this.mShareType = 1;
        this.mediaTitle = "";
        this.mediades = "";
        UMediaObject uMediaObject = shareContent.mMedia;
        if (uMediaObject != null && (uMediaObject instanceof UMusic)) {
            setMusic((UMusic) uMediaObject);
        }
        UMediaObject uMediaObject2 = shareContent.mMedia;
        if (uMediaObject2 == null || !(uMediaObject2 instanceof UMVideo)) {
            return;
        }
        setVideo((UMVideo) uMediaObject2);
    }

    private void buildAudioParams(Bundle bundle) {
        bundle.putString("title", objectSetTitle(getMusic()));
        bundle.putString("summary", objectSetDescription(getMusic()));
        UMImage thumbImage = getMusic().getThumbImage();
        if (thumbImage != null) {
            if (thumbImage.isUrlMedia()) {
                bundle.putString("imageUrl", thumbImage.toUrl());
            } else if (thumbImage.asFileImage() == null) {
                bundle.putString("error", UmengText.QQ.QQ_PERMISSION);
            } else if (Build.VERSION.SDK_INT >= 30) {
                bundle.putString("imageUrl", thumbImage.asFileImage().toString());
            } else {
                bundle.putString("imageLocalUrl", thumbImage.asFileImage().toString());
            }
        }
        if (TextUtils.isEmpty(getMusic().getmTargetUrl())) {
            bundle.putString("targetUrl", getMusic().toUrl());
        } else {
            bundle.putString("targetUrl", getMusic().getmTargetUrl());
        }
        bundle.putString("audio_url", getMusic().toUrl());
    }

    private void buildImageParams(Bundle bundle) {
        if (getImage() != null) {
            if (getImage().asFileImage() == null) {
                bundle.putString("error", UmengText.QQ.QQ_PERMISSION);
                return;
            }
            try {
                bundle.putString("imageLocalUrl", getImage().asFileImage().toString());
            } catch (Exception unused) {
                bundle.putString("error", UmengText.QQ.QQ_PERMISSION);
            }
        }
    }

    private void buildMiniApp(Bundle bundle) {
        UMQQMini qQMini = getQQMini();
        String miniAppId = qQMini.getMiniAppId();
        String path = qQMini.getPath();
        String type = qQMini.getType();
        bundle.putString("title", objectSetTitle(qQMini));
        bundle.putString("summary", objectSetDescription(qQMini));
        UMImage thumbImage = qQMini.getThumbImage();
        if (thumbImage != null) {
            if (thumbImage.isUrlMedia()) {
                bundle.putString("imageUrl", thumbImage.toUrl());
            } else if (thumbImage.asFileImage() == null) {
                bundle.putString("error", UmengText.QQ.QQ_PERMISSION);
            } else if (Build.VERSION.SDK_INT >= 30) {
                bundle.putString("imageUrl", thumbImage.asFileImage().toString());
            } else {
                bundle.putString("imageLocalUrl", thumbImage.asFileImage().toString());
            }
        }
        if (!TextUtils.isEmpty(qQMini.toUrl())) {
            bundle.putString("targetUrl", qQMini.toUrl());
        }
        if (TextUtils.isEmpty(miniAppId)) {
            return;
        }
        bundle.putString(QQShare.SHARE_TO_QQ_MINI_PROGRAM_APPID, miniAppId);
        if (!TextUtils.isEmpty(path)) {
            bundle.putString(QQShare.SHARE_TO_QQ_MINI_PROGRAM_PATH, path);
        }
        if (TextUtils.isEmpty(type)) {
            return;
        }
        bundle.putString(QQShare.SHARE_TO_QQ_MINI_PROGRAM_TYPE, type);
    }

    private void buildText(Bundle bundle) {
        bundle.putString("summary", getText());
    }

    private void buildVideoParams(Bundle bundle) {
        bundle.putString("title", objectSetTitle(getVideo()));
        bundle.putString("summary", objectSetDescription(getVideo()));
        UMImage thumbImage = getVideo().getThumbImage();
        if (thumbImage != null) {
            if (thumbImage.isUrlMedia()) {
                bundle.putString("imageUrl", thumbImage.toUrl());
            } else if (thumbImage.asFileImage() == null) {
                bundle.putString("error", UmengText.QQ.QQ_PERMISSION);
            } else if (Build.VERSION.SDK_INT >= 30) {
                bundle.putString("imageUrl", thumbImage.asFileImage().toString());
            } else {
                bundle.putString("imageLocalUrl", thumbImage.asFileImage().toString());
            }
        }
        bundle.putString("targetUrl", getVideo().toUrl());
    }

    private void buildWebParams(Bundle bundle) {
        bundle.putString("title", objectSetTitle(getUmWeb()));
        bundle.putString("summary", objectSetDescription(getUmWeb()));
        UMImage thumbImage = getUmWeb().getThumbImage();
        if (thumbImage != null) {
            if (thumbImage.isUrlMedia()) {
                bundle.putString("imageUrl", thumbImage.toUrl());
            } else if (thumbImage.asFileImage() == null) {
                bundle.putString("error", UmengText.QQ.QQ_PERMISSION);
            } else if (Build.VERSION.SDK_INT >= 30) {
                bundle.putString("imageUrl", thumbImage.asFileImage().toString());
            } else {
                bundle.putString("imageLocalUrl", thumbImage.asFileImage().toString());
            }
        }
        if (TextUtils.isEmpty(getUmWeb().toUrl())) {
            bundle.putString("error", UmengText.SHARE.EMPTY_WEB_URL);
        }
        bundle.putString("targetUrl", getUmWeb().toUrl());
    }

    public Bundle buildParams(boolean z10, String str) {
        Bundle bundle = new Bundle();
        if (getmStyle() == 2 || getmStyle() == 3) {
            this.mShareType = 5;
            buildImageParams(bundle);
        } else if (getmStyle() == 4) {
            if (getMusic() != null) {
                this.mShareType = 2;
            }
            buildAudioParams(bundle);
        } else if (getmStyle() == 16) {
            buildWebParams(bundle);
        } else if (getmStyle() == 8) {
            buildVideoParams(bundle);
        } else if (getmStyle() == 256) {
            buildMiniApp(bundle);
        } else {
            bundle.putString("error", UmengText.supportStyle(false, "text"));
        }
        bundle.putInt("req_type", this.mShareType);
        if (z10) {
            bundle.putInt("cflag", 2);
        } else {
            bundle.putInt("cflag", 1);
        }
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("appName", str);
        }
        return bundle;
    }
}
