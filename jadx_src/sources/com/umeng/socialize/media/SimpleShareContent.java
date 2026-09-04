package com.umeng.socialize.media;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.umeng.socialize.ShareContent;
import com.umeng.socialize.c.a.a;
import com.umeng.socialize.interfaces.CompressListener;
import com.umeng.socialize.utils.ContextUtil;
import com.umeng.socialize.utils.DefaultClass;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.UmengText;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class SimpleShareContent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private UMImage f106228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private UMImage[] f106229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f106230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private UMVideo f106231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private UMVideo[] f106232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private UMEmoji f106233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private UMusic f106234g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private UMMin f106235h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private UMQQMini f106236i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private UMWeb f106237j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private File f106238k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private BaseMediaObject f106239l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f106240m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f106241n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f106242o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CompressListener f106243p;
    public int THUMB_LIMIT = 24576;
    public int WX_THUMB_LIMIT = 18432;
    public int WX_MIN_LIMIT = 131072;
    public final int IMAGE_LIMIT = 491520;
    public final String DEFAULT_TITLE = "这里是标题";
    public final String DEFAULT_DESCRIPTION = "这里是描述";

    public SimpleShareContent(ShareContent shareContent) {
        UMVideo[] uMVideoArr;
        this.f106230c = shareContent.mText;
        UMediaObject uMediaObject = shareContent.mMedia;
        if (uMediaObject == null || !(uMediaObject instanceof UMImage) || (uMVideoArr = shareContent.Video_mMedias) == null) {
            if (uMediaObject != null && (uMediaObject instanceof UMImage)) {
                UMImage uMImage = (UMImage) uMediaObject;
                this.f106228a = uMImage;
                this.f106239l = uMImage;
                UMImage[] uMImageArr = shareContent.mMedias;
                if (uMImageArr != null && uMImageArr.length > 0) {
                    this.f106229b = uMImageArr;
                }
            }
            if (uMediaObject != null && (uMediaObject instanceof UMusic)) {
                UMusic uMusic = (UMusic) uMediaObject;
                this.f106234g = uMusic;
                this.f106239l = uMusic;
            }
            if (uMediaObject != null && (uMediaObject instanceof UMVideo)) {
                UMVideo uMVideo = (UMVideo) uMediaObject;
                this.f106231d = uMVideo;
                this.f106239l = uMVideo;
                UMVideo[] uMVideoArr2 = shareContent.Video_mMedias;
                if (uMVideoArr2 != null && uMVideoArr2.length > 0) {
                    this.f106232e = uMVideoArr2;
                }
            }
            if (uMediaObject != null && (uMediaObject instanceof UMEmoji)) {
                UMEmoji uMEmoji = (UMEmoji) uMediaObject;
                this.f106233f = uMEmoji;
                this.f106239l = uMEmoji;
            }
            if (uMediaObject != null && (uMediaObject instanceof UMWeb)) {
                UMWeb uMWeb = (UMWeb) uMediaObject;
                this.f106237j = uMWeb;
                this.f106239l = uMWeb;
            }
            if (uMediaObject != null && (uMediaObject instanceof UMMin)) {
                this.f106235h = (UMMin) uMediaObject;
                this.f106239l = this.f106237j;
            }
            if (uMediaObject != null && (uMediaObject instanceof UMQQMini)) {
                this.f106236i = (UMQQMini) uMediaObject;
                this.f106239l = this.f106237j;
            }
            File file = shareContent.file;
            if (file != null) {
                this.f106238k = file;
            }
        } else {
            UMImage uMImage2 = (UMImage) uMediaObject;
            this.f106228a = uMImage2;
            this.f106239l = uMImage2;
            UMImage[] uMImageArr2 = shareContent.mMedias;
            if (uMImageArr2 != null && uMImageArr2.length > 0) {
                this.f106229b = uMImageArr2;
            }
            this.f106239l = this.f106231d;
            if (uMVideoArr != null && uMVideoArr.length > 0) {
                this.f106232e = uMVideoArr;
            }
        }
        this.f106242o = shareContent.subject;
        this.f106240m = shareContent.getShareType();
        this.f106241n = a();
    }

    private String a() {
        int i10 = this.f106240m;
        if (i10 == 1) {
            return "text";
        }
        if (i10 == 2) {
            return "image";
        }
        if (i10 == 3) {
            return "textandimage";
        }
        if (i10 == 4) {
            return "music";
        }
        if (i10 == 8) {
            return "video";
        }
        if (i10 == 16) {
            return "web";
        }
        if (i10 == 32) {
            return "file";
        }
        if (i10 == 64) {
            return "emoji";
        }
        if (i10 != 128) {
            return i10 != 256 ? "error" : "qqMini";
        }
        return "minapp";
    }

    private byte[] b() {
        byte[] bytes = DefaultClass.getBytes();
        if (ContextUtil.getIcon() != 0 && ((bytes = a.a(new UMImage(ContextUtil.getContext(), ContextUtil.getIcon()), this.WX_THUMB_LIMIT)) == null || bytes.length <= 0)) {
            SLog.E(UmengText.IMAGE.SHARECONTENT_THUMB_ERROR);
        }
        return bytes;
    }

    public boolean canFileValid(UMImage uMImage) {
        return uMImage.asFileImage() != null;
    }

    public String getAssertSubject() {
        return TextUtils.isEmpty(this.f106242o) ? "umengshare" : this.f106242o;
    }

    public BaseMediaObject getBaseMediaObject() {
        return this.f106239l;
    }

    public File getFile() {
        return this.f106238k;
    }

    public UMImage getImage() {
        return this.f106228a;
    }

    public byte[] getImageData(UMImage uMImage) {
        return uMImage.asBinImage();
    }

    public byte[] getImageThumb(UMImage uMImage) {
        if (uMImage.getThumbImage() == null) {
            return b();
        }
        byte[] bArrA = a.a(uMImage.getThumbImage(), this.WX_THUMB_LIMIT);
        if (bArrA != null && bArrA.length > 0) {
            return bArrA;
        }
        SLog.E(UmengText.IMAGE.SHARECONTENT_THUMB_ERROR);
        return b();
    }

    public UMusic getMusic() {
        return this.f106234g;
    }

    public String getMusicTargetUrl(UMusic uMusic) {
        return TextUtils.isEmpty(uMusic.getmTargetUrl()) ? uMusic.toUrl() : uMusic.getmTargetUrl();
    }

    public UMQQMini getQQMini() {
        return this.f106236i;
    }

    public String getStrStyle() {
        return this.f106241n;
    }

    public byte[] getStrictImageData(UMImage uMImage) {
        if (getUMImageScale(uMImage) <= 491520) {
            return getImageData(uMImage);
        }
        byte[] bArrA = a.a(getImage(), 491520);
        if (bArrA != null && bArrA.length > 0) {
            return bArrA;
        }
        SLog.E(UmengText.IMAGE.SHARECONTENT_THUMB_ERROR);
        return null;
    }

    public String getSubject() {
        return this.f106242o;
    }

    public String getText() {
        return this.f106230c;
    }

    public int getUMImageScale(UMImage uMImage) {
        return a.a(uMImage);
    }

    public UMEmoji getUmEmoji() {
        return this.f106233f;
    }

    public UMMin getUmMin() {
        return this.f106235h;
    }

    public UMVideo[] getUmVideos() {
        return this.f106232e;
    }

    public UMWeb getUmWeb() {
        return this.f106237j;
    }

    public UMVideo getVideo() {
        return this.f106231d;
    }

    public UMImage[] getmImages() {
        return this.f106229b;
    }

    public int getmStyle() {
        return this.f106240m;
    }

    public String objectSetDescription(BaseMediaObject baseMediaObject) {
        if (TextUtils.isEmpty(baseMediaObject.getDescription())) {
            return "这里是描述";
        }
        String description = baseMediaObject.getDescription();
        return description.length() > 1024 ? description.substring(0, 1024) : description;
    }

    public byte[] objectSetMInAppThumb(BaseMediaObject baseMediaObject) {
        if (baseMediaObject.getThumbImage() == null) {
            return DefaultClass.getBytes();
        }
        if (this.f106243p != null) {
            UMImage thumbImage = baseMediaObject.getThumbImage();
            if (thumbImage == null) {
                return DefaultClass.getBytes();
            }
            byte[] bArrAsBinImage = thumbImage.asBinImage();
            return (bArrAsBinImage == null || a.a(thumbImage) > this.WX_MIN_LIMIT) ? this.f106243p.compressThumb(bArrAsBinImage) : bArrAsBinImage;
        }
        byte[] bArrA = a.a(baseMediaObject.getThumbImage().asBinImage(), this.WX_MIN_LIMIT, Bitmap.CompressFormat.JPEG);
        if (bArrA != null && bArrA.length > 0) {
            return bArrA;
        }
        SLog.E(UmengText.IMAGE.SHARECONTENT_THUMB_ERROR);
        return bArrA;
    }

    public String objectSetText(String str) {
        return objectSetText(str, 10240);
    }

    public String objectSetText(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return "这里是描述";
        }
        return str.length() > i10 ? str.substring(0, i10) : str;
    }

    public byte[] objectSetThumb(BaseMediaObject baseMediaObject) {
        if (baseMediaObject.getThumbImage() == null) {
            return b();
        }
        if (this.f106243p != null) {
            UMImage thumbImage = baseMediaObject.getThumbImage();
            if (thumbImage == null) {
                return DefaultClass.getBytes();
            }
            byte[] bArrAsBinImage = thumbImage.asBinImage();
            return (bArrAsBinImage == null || a.a(thumbImage) > this.THUMB_LIMIT) ? this.f106243p.compressThumb(bArrAsBinImage) : bArrAsBinImage;
        }
        byte[] bArrA = a.a(baseMediaObject.getThumbImage(), this.THUMB_LIMIT);
        if (bArrA != null && bArrA.length > 0) {
            return bArrA;
        }
        SLog.E(UmengText.IMAGE.SHARECONTENT_THUMB_ERROR);
        return b();
    }

    public String objectSetTitle(BaseMediaObject baseMediaObject) {
        if (TextUtils.isEmpty(baseMediaObject.getTitle())) {
            return "这里是标题";
        }
        String title = baseMediaObject.getTitle();
        return title.length() > 512 ? title.substring(0, 512) : title;
    }

    public void setCompressListener(CompressListener compressListener) {
        this.f106243p = compressListener;
    }

    public void setImage(UMImage uMImage) {
        this.f106228a = uMImage;
    }

    public void setMusic(UMusic uMusic) {
        this.f106234g = uMusic;
    }

    public void setText(String str) {
        this.f106230c = str;
    }

    public void setVideo(UMVideo uMVideo) {
        this.f106231d = uMVideo;
    }

    public String subString(String str, int i10) {
        return (!TextUtils.isEmpty(str) || str.length() <= i10) ? str : str.substring(0, i10);
    }
}
