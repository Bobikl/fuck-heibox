package com.umeng.socialize.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.sina.weibo.BuildConfig;
import com.sina.weibo.sdk.api.ImageObject;
import com.sina.weibo.sdk.api.MultiImageObject;
import com.sina.weibo.sdk.api.TextObject;
import com.sina.weibo.sdk.api.WebpageObject;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import com.umeng.socialize.ShareContent;
import com.umeng.socialize.net.LinkCardResponse;
import com.umeng.socialize.net.LinkcardRequest;
import com.umeng.socialize.net.RestAPI;
import com.umeng.socialize.utils.ContextUtil;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.UmengText;
import java.io.File;
import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public class SinaShareContent extends SimpleShareContent {
    private boolean isSupport;

    public SinaShareContent(ShareContent shareContent) {
        super(shareContent);
        this.isSupport = false;
    }

    private WeiboMultiMessage addText(WeiboMultiMessage weiboMultiMessage) {
        if (TextUtils.isEmpty(getText())) {
            TextObject textObject = new TextObject();
            if (getBaseMediaObject() != null && !TextUtils.isEmpty(getBaseMediaObject().getDescription())) {
                textObject.text = getBaseMediaObject().getDescription();
            }
            weiboMultiMessage.textObject = textObject;
        } else {
            weiboMultiMessage.textObject = getTextObj();
        }
        return weiboMultiMessage;
    }

    private ImageObject getImageObj() {
        ImageObject imageObject = new ImageObject();
        if (canFileValid(getImage())) {
            imageObject.imagePath = getImage().asFileImage().toString();
        } else {
            imageObject.imageData = getImageData(getImage());
        }
        imageObject.thumbData = objectSetThumb(getImage());
        imageObject.description = getText();
        return imageObject;
    }

    private ImageObject getImageObjWithBitmap() {
        Bitmap bitmapAsBitmap;
        ImageObject imageObject = new ImageObject();
        if (canFileValid(getImage()) && (bitmapAsBitmap = getImage().asBitmap()) != null) {
            imageObject.setImageData(bitmapAsBitmap);
        }
        return imageObject;
    }

    private WebpageObject getMusicObj() {
        WebpageObject webpageObject = new WebpageObject();
        webpageObject.identify = UUID.randomUUID().toString();
        webpageObject.title = objectSetTitle(getMusic());
        webpageObject.description = objectSetDescription(getMusic());
        if (getMusic().getThumbImage() != null) {
            webpageObject.thumbData = objectSetThumb(getMusic());
        } else {
            SLog.E(UmengText.SINA.SINA_THUMB_ERROR);
        }
        webpageObject.actionUrl = getMusic().getmTargetUrl();
        if (!TextUtils.isEmpty(getText())) {
            webpageObject.defaultText = getText();
        }
        return webpageObject;
    }

    private MultiImageObject getMutiImageObject() {
        File fileAsFileImage;
        MultiImageObject multiImageObject = new MultiImageObject();
        UMImage[] uMImageArr = getmImages();
        ArrayList<Uri> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < uMImageArr.length; i10++) {
            UMImage uMImage = uMImageArr[i10];
            if (uMImage != null && (fileAsFileImage = uMImage.asFileImage()) != null) {
                SLog.E(i10 + ":" + Uri.fromFile(fileAsFileImage));
                arrayList.add(Uri.fromFile(fileAsFileImage));
            }
        }
        multiImageObject.imageList = arrayList;
        return multiImageObject;
    }

    private MultiImageObject getMutiImageObjectWithFileProvider(Context context, String str) {
        File fileAsFileImage;
        MultiImageObject multiImageObject = new MultiImageObject();
        UMImage[] uMImageArr = getmImages();
        ArrayList<Uri> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < uMImageArr.length; i10++) {
            UMImage uMImage = uMImageArr[i10];
            if (uMImage != null && (fileAsFileImage = uMImage.asFileImage()) != null) {
                SLog.E(i10 + ":" + Uri.fromFile(fileAsFileImage));
                Uri fileUri = getFileUri(context, fileAsFileImage, str);
                if (fileUri != null) {
                    arrayList.add(fileUri);
                }
            }
        }
        multiImageObject.imageList = arrayList;
        return multiImageObject;
    }

    private TextObject getTextObj() {
        TextObject textObject = new TextObject();
        textObject.text = getText();
        return textObject;
    }

    private TextObject getTextObjMul() {
        TextObject textObject = new TextObject();
        textObject.text = "default text";
        SLog.E(UmengText.SINA.SINA_MUL_IMAGE);
        return textObject;
    }

    private WebpageObject getVideoObj() {
        WebpageObject webpageObject = new WebpageObject();
        webpageObject.identify = UUID.randomUUID().toString();
        webpageObject.title = objectSetTitle(getVideo());
        webpageObject.description = objectSetDescription(getVideo());
        if (getVideo().getThumbImage() != null) {
            webpageObject.thumbData = objectSetThumb(getVideo());
        } else {
            SLog.E(UmengText.SINA.SINA_THUMB_ERROR);
        }
        webpageObject.actionUrl = getVideo().toUrl();
        if (!TextUtils.isEmpty(getVideo().getDescription())) {
            webpageObject.description = getVideo().getDescription();
        }
        webpageObject.defaultText = getText();
        return webpageObject;
    }

    private WebpageObject getWebpageObj() {
        LinkcardRequest linkcardRequest = new LinkcardRequest(ContextUtil.getContext());
        linkcardRequest.setMedia(getUmWeb());
        LinkCardResponse linkCardResponseConvertLinkCard = RestAPI.convertLinkCard(linkcardRequest);
        WebpageObject webpageObject = new WebpageObject();
        webpageObject.identify = UUID.randomUUID().toString();
        webpageObject.title = objectSetTitle(getUmWeb());
        webpageObject.description = objectSetDescription(getUmWeb());
        if (getUmWeb().getThumbImage() != null) {
            webpageObject.thumbData = objectSetThumb(getUmWeb());
        } else {
            SLog.E(UmengText.SINA.SINA_THUMB_ERROR);
        }
        if (linkCardResponseConvertLinkCard == null || TextUtils.isEmpty(linkCardResponseConvertLinkCard.url)) {
            webpageObject.actionUrl = getUmWeb().toUrl();
        } else {
            webpageObject.actionUrl = linkCardResponseConvertLinkCard.url;
        }
        webpageObject.defaultText = getText();
        return webpageObject;
    }

    public Uri getFileUri(Context context, File file, String str) {
        if (file == null || !file.exists()) {
            return null;
        }
        Uri uriF = FileProvider.f(context, str, file);
        context.grantUriPermission(BuildConfig.APPLICATION_ID, uriF, 1);
        return uriF;
    }

    public WeiboMultiMessage getMessage(Context context, boolean z10, String str) {
        WeiboMultiMessage weiboMultiMessage = new WeiboMultiMessage();
        if (getmStyle() == 2 || getmStyle() == 3) {
            if (getmImages() == null || getmImages().length <= 0 || !this.isSupport) {
                if (z10) {
                    weiboMultiMessage.imageObject = getImageObjWithBitmap();
                } else {
                    weiboMultiMessage.imageObject = getImageObj();
                }
                if (!TextUtils.isEmpty(getText())) {
                    weiboMultiMessage.textObject = getTextObj();
                }
            } else {
                if (z10) {
                    weiboMultiMessage.multiImageObject = getMutiImageObjectWithFileProvider(context, str);
                } else {
                    weiboMultiMessage.multiImageObject = getMutiImageObject();
                }
                if (TextUtils.isEmpty(getText())) {
                    weiboMultiMessage.textObject = getTextObjMul();
                } else {
                    weiboMultiMessage.textObject = getTextObj();
                }
            }
        } else if (getmStyle() == 16) {
            weiboMultiMessage.mediaObject = getWebpageObj();
            addText(weiboMultiMessage);
        } else if (getmStyle() == 4) {
            weiboMultiMessage.mediaObject = getMusicObj();
            addText(weiboMultiMessage);
        } else if (getmStyle() == 8) {
            weiboMultiMessage.mediaObject = getVideoObj();
            addText(weiboMultiMessage);
        } else {
            weiboMultiMessage.textObject = getTextObj();
        }
        return weiboMultiMessage;
    }

    public void setSupport(boolean z10) {
        this.isSupport = z10;
    }
}
