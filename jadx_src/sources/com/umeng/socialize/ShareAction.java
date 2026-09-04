package com.umeng.socialize;

import android.app.Activity;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import com.google.android.gms.common.internal.s;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMEmoji;
import com.umeng.socialize.media.UMImage;
import com.umeng.socialize.media.UMMin;
import com.umeng.socialize.media.UMQQMini;
import com.umeng.socialize.media.UMVideo;
import com.umeng.socialize.media.UMWeb;
import com.umeng.socialize.media.UMediaObject;
import com.umeng.socialize.media.UMusic;
import com.umeng.socialize.shareboard.ShareBoard;
import com.umeng.socialize.shareboard.ShareBoardConfig;
import com.umeng.socialize.shareboard.SnsPlatform;
import com.umeng.socialize.utils.CommonUtil;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.ShareBoardlistener;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ShareAction {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SHARE_MEDIA f106026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private UMShareListener f106027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ShareBoardlistener f106028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Activity f106029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<SHARE_MEDIA> f106030f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View f106035k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f106036l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ShareBoard f106037m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ShareContent f106025a = new ShareContent();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<SnsPlatform> f106031g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<ShareContent> f106032h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<UMShareListener> f106033i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f106034j = 80;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ShareBoardlistener f106038n = new ShareBoardlistener() { // from class: com.umeng.socialize.ShareAction.1
        @Override // com.umeng.socialize.utils.ShareBoardlistener
        public void onclick(SnsPlatform snsPlatform, SHARE_MEDIA share_media) {
            ShareAction.this.setPlatform(share_media);
            ShareAction.this.share();
        }
    };

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ShareBoardlistener f106039o = new ShareBoardlistener() { // from class: com.umeng.socialize.ShareAction.2
        @Override // com.umeng.socialize.utils.ShareBoardlistener
        public void onclick(SnsPlatform snsPlatform, SHARE_MEDIA share_media) {
            int iIndexOf = ShareAction.this.f106030f.indexOf(share_media);
            int size = ShareAction.this.f106032h.size();
            if (size != 0) {
                ShareAction.this.f106025a = iIndexOf < size ? (ShareContent) ShareAction.this.f106032h.get(iIndexOf) : (ShareContent) ShareAction.this.f106032h.get(size - 1);
            }
            int size2 = ShareAction.this.f106033i.size();
            if (size2 != 0) {
                if (iIndexOf < size2) {
                    ShareAction shareAction = ShareAction.this;
                    shareAction.f106027c = (UMShareListener) shareAction.f106033i.get(iIndexOf);
                } else {
                    ShareAction shareAction2 = ShareAction.this;
                    shareAction2.f106027c = (UMShareListener) shareAction2.f106033i.get(size2 - 1);
                }
            }
            ShareAction.this.setPlatform(share_media);
            ShareAction.this.share();
        }
    };

    public ShareAction(Activity activity) {
        if (activity != null) {
            this.f106029e = (Activity) new WeakReference(activity).get();
        }
    }

    public static Rect locateView(View view) {
        int[] iArr = new int[2];
        if (view == null) {
            return null;
        }
        try {
            view.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            int i10 = iArr[0];
            rect.left = i10;
            rect.top = iArr[1];
            rect.right = i10 + view.getWidth();
            rect.bottom = rect.top + view.getHeight();
            return rect;
        } catch (NullPointerException e10) {
            SLog.error(e10);
            return null;
        }
    }

    public ShareAction addButton(String str, String str2, String str3, String str4) {
        this.f106031g.add(SHARE_MEDIA.createSnsPlatform(str, str2, str3, str4, 0));
        return this;
    }

    public ShareAction bySystem() {
        this.f106036l = true;
        return this;
    }

    public void close() {
        ShareBoard shareBoard = this.f106037m;
        if (shareBoard != null) {
            shareBoard.dismiss();
            this.f106037m = null;
        }
    }

    public SHARE_MEDIA getPlatform() {
        return this.f106026b;
    }

    public ShareContent getShareContent() {
        return this.f106025a;
    }

    public boolean getUrlValid() {
        UMediaObject uMediaObject;
        ShareContent shareContent = this.f106025a;
        return shareContent == null || (uMediaObject = shareContent.mMedia) == null || !(uMediaObject instanceof UMWeb) || uMediaObject.toUrl() == null || this.f106025a.mMedia.toUrl().startsWith("http");
    }

    public void open() {
        open(null);
    }

    public void open(ShareBoardConfig shareBoardConfig) {
        if (CommonUtil.isSilentMode(this.f106029e)) {
            return;
        }
        if (this.f106031g.size() != 0) {
            HashMap map = new HashMap();
            map.put(s.a.f52543a, this.f106027c);
            map.put("content", this.f106025a);
            try {
                ShareBoard shareBoard = new ShareBoard(this.f106029e, this.f106031g, shareBoardConfig);
                this.f106037m = shareBoard;
                ShareBoardlistener shareBoardlistener = this.f106028d;
                if (shareBoardlistener == null) {
                    shareBoard.setShareBoardlistener(this.f106039o);
                } else {
                    shareBoard.setShareBoardlistener(shareBoardlistener);
                }
                this.f106037m.setFocusable(true);
                this.f106037m.setBackgroundDrawable(new BitmapDrawable());
                if (this.f106035k == null) {
                    this.f106035k = this.f106029e.getWindow().getDecorView();
                }
                this.f106037m.showAtLocation(this.f106035k, this.f106034j, 0, 0);
                return;
            } catch (Exception e10) {
                SLog.error(e10);
                return;
            }
        }
        this.f106031g.add(SHARE_MEDIA.WEIXIN.toSnsPlatform());
        this.f106031g.add(SHARE_MEDIA.WEIXIN_CIRCLE.toSnsPlatform());
        this.f106031g.add(SHARE_MEDIA.SINA.toSnsPlatform());
        this.f106031g.add(SHARE_MEDIA.QQ.toSnsPlatform());
        this.f106031g.add(SHARE_MEDIA.DINGTALK.toSnsPlatform());
        HashMap map2 = new HashMap();
        map2.put(s.a.f52543a, this.f106027c);
        map2.put("content", this.f106025a);
        ShareBoard shareBoard2 = new ShareBoard(this.f106029e, this.f106031g, shareBoardConfig);
        this.f106037m = shareBoard2;
        ShareBoardlistener shareBoardlistener2 = this.f106028d;
        if (shareBoardlistener2 == null) {
            shareBoard2.setShareBoardlistener(this.f106038n);
        } else {
            shareBoard2.setShareBoardlistener(shareBoardlistener2);
        }
        this.f106037m.setFocusable(true);
        this.f106037m.setBackgroundDrawable(new BitmapDrawable());
        if (this.f106035k == null) {
            this.f106035k = this.f106029e.getWindow().getDecorView();
        }
        this.f106037m.showAtLocation(this.f106035k, 80, 0, 0);
    }

    public ShareAction setCallback(UMShareListener uMShareListener) {
        this.f106027c = uMShareListener;
        return this;
    }

    @Deprecated
    public ShareAction setContentList(ShareContent... shareContentArr) {
        if (shareContentArr == null || Arrays.asList(shareContentArr).size() == 0) {
            ShareContent shareContent = new ShareContent();
            shareContent.mText = "empty";
            this.f106032h.add(shareContent);
        } else {
            this.f106032h = Arrays.asList(shareContentArr);
        }
        return this;
    }

    public ShareAction setDisplayList(SHARE_MEDIA... share_mediaArr) {
        this.f106030f = Arrays.asList(share_mediaArr);
        this.f106031g.clear();
        Iterator<SHARE_MEDIA> it = this.f106030f.iterator();
        while (it.hasNext()) {
            this.f106031g.add(it.next().toSnsPlatform());
        }
        return this;
    }

    @Deprecated
    public ShareAction setListenerList(UMShareListener... uMShareListenerArr) {
        this.f106033i = Arrays.asList(uMShareListenerArr);
        return this;
    }

    public ShareAction setPlatform(SHARE_MEDIA share_media) {
        this.f106026b = share_media;
        return this;
    }

    public ShareAction setShareContent(ShareContent shareContent) {
        this.f106025a = shareContent;
        return this;
    }

    public ShareAction setShareboardclickCallback(ShareBoardlistener shareBoardlistener) {
        this.f106028d = shareBoardlistener;
        return this;
    }

    public void share() {
        UMShareAPI uMShareAPI = UMShareAPI.get(this.f106029e);
        if (uMShareAPI != null) {
            ShareContent shareContent = getShareContent();
            if (shareContent != null) {
                shareContent.bySystem = this.f106036l;
            }
            uMShareAPI.doShare(this.f106029e, this, this.f106027c);
        }
    }

    public ShareAction withApp(File file) {
        this.f106025a.app = file;
        return this;
    }

    public ShareAction withExtra(UMImage uMImage) {
        this.f106025a.mExtra = uMImage;
        return this;
    }

    public ShareAction withFile(File file) {
        this.f106025a.file = file;
        return this;
    }

    public ShareAction withFollow(String str) {
        this.f106025a.mFollow = str;
        return this;
    }

    public ShareAction withMedia(UMEmoji uMEmoji) {
        this.f106025a.mMedia = uMEmoji;
        return this;
    }

    public ShareAction withMedia(UMImage uMImage) {
        this.f106025a.mMedia = uMImage;
        return this;
    }

    public ShareAction withMedia(UMMin uMMin) {
        this.f106025a.mMedia = uMMin;
        return this;
    }

    public ShareAction withMedia(UMQQMini uMQQMini) {
        this.f106025a.mMedia = uMQQMini;
        return this;
    }

    public ShareAction withMedia(UMVideo uMVideo) {
        this.f106025a.mMedia = uMVideo;
        return this;
    }

    public ShareAction withMedia(UMWeb uMWeb) {
        this.f106025a.mMedia = uMWeb;
        return this;
    }

    public ShareAction withMedia(UMusic uMusic) {
        this.f106025a.mMedia = uMusic;
        return this;
    }

    public ShareAction withMedias(UMImage... uMImageArr) {
        if (uMImageArr != null && uMImageArr.length > 0) {
            this.f106025a.mMedia = uMImageArr[0];
        }
        this.f106025a.mMedias = uMImageArr;
        return this;
    }

    public ShareAction withMedias(UMVideo... uMVideoArr) {
        if (uMVideoArr != null && uMVideoArr.length > 0) {
            this.f106025a.mMedia = uMVideoArr[0];
        }
        this.f106025a.Video_mMedias = uMVideoArr;
        return this;
    }

    public ShareAction withShareBoardDirection(View view, int i10) {
        this.f106034j = i10;
        this.f106035k = view;
        return this;
    }

    public ShareAction withSubject(String str) {
        this.f106025a.subject = str;
        return this;
    }

    public ShareAction withText(String str) {
        this.f106025a.mText = str;
        return this;
    }
}
