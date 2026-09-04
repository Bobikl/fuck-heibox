package com.max.xiaoheihe.router.serviceimpl;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.n0;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.ShareImageObj;
import com.max.hbminiprogram.bean.ScreenStyleInfoObj;
import com.max.hbpermission.PermissionManager;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.AccelWorldShareKt;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.share.DouYinConfig;
import com.max.xiaoheihe.bean.share.PostConfigObj;
import com.max.xiaoheihe.bean.share.ScreenReportObj;
import com.max.xiaoheihe.bean.share.ScreenShareInfoObj;
import com.max.xiaoheihe.module.account.ShareImageDialogFragment;
import com.max.xiaoheihe.module.bbs.post.utils.PostUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.router.annotation.RouterService;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ShareImpl.java */
/* JADX INFO: loaded from: classes13.dex */
@RouterService(interfaces = {pb.l.class}, key = {"share"})
public class l implements pb.l {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: ShareImpl.java */
    public class a implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(SHARE_MEDIA share_media, Throwable th2) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(SHARE_MEDIA share_media) {
        }
    }

    /* JADX INFO: compiled from: ShareImpl.java */
    public class b implements com.max.hbpermission.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f95184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f95185b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FragmentActivity f95186c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f95187d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f95188e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f95189f;

        b(List list, boolean z10, FragmentActivity fragmentActivity, String str, List list2, List list3) {
            this.f95184a = list;
            this.f95185b = z10;
            this.f95186c = fragmentActivity;
            this.f95187d = str;
            this.f95188e = list2;
            this.f95189f = list3;
        }

        @Override // com.max.hbpermission.c
        public void onResult() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48401, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Bitmap bitmap : this.f95184a) {
                File fileQ0 = com.max.hbimage.b.q0(bitmap, this.f95185b ? com.max.xiaoheihe.utils.d.T() : com.max.xiaoheihe.utils.d.Q());
                if (fileQ0 != null) {
                    com.max.hbimage.b.l0(this.f95186c, fileQ0.getAbsolutePath());
                    if (fileQ0.exists()) {
                        arrayList.add(fileQ0);
                        arrayList2.add(bitmap);
                    }
                }
            }
            if (com.max.hbcommon.utils.c.w(arrayList)) {
                com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.save_fail));
                return;
            }
            if (this.f95185b) {
                com.max.hbutils.utils.c.f("保存成功");
            }
            FragmentActivity fragmentActivity = this.f95186c;
            PostUtils.u(fragmentActivity, arrayList, arrayList2, this.f95187d, this.f95188e, this.f95189f, null, AccelWorldShareKt.e(fragmentActivity));
        }
    }

    private void b(FragmentActivity fragmentActivity, List<Bitmap> list, boolean z10, String str, List<BBSTopicObj> list2, List<String> list3) {
        if (PatchProxy.proxy(new Object[]{fragmentActivity, list, new Byte(z10 ? (byte) 1 : (byte) 0), str, list2, list3}, this, changeQuickRedirect, false, 48400, new Class[]{FragmentActivity.class, List.class, Boolean.TYPE, String.class, List.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        PermissionManager.f71603a.T(fragmentActivity, new b(list, z10, fragmentActivity, str, list2, list3));
    }

    @Override // pb.l
    public void a(@n0 FragmentActivity fragmentActivity, @n0 FragmentManager fragmentManager, @n0 ShareImageObj shareImageObj) {
        String str;
        String str2;
        List<BBSTopicObj> list;
        String default_content;
        List<String> hashtags;
        String douyin_bg_url;
        String str3;
        JsonObject extra;
        boolean zEquals;
        boolean z10;
        String tips;
        List<BBSTopicObj> topic_infos;
        String string;
        String douyin_hashtag;
        if (PatchProxy.proxy(new Object[]{fragmentActivity, fragmentManager, shareImageObj}, this, changeQuickRedirect, false, 48399, new Class[]{FragmentActivity.class, FragmentManager.class, ShareImageObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (shareImageObj.getBitmap() != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(shareImageObj.getBitmap());
            Log.d("ShareImpl", "getShare_info: " + shareImageObj.getShare_info());
            Log.d("ShareImpl", "getStyle_info: " + shareImageObj.getStyle_info());
            ScreenShareInfoObj screenShareInfoObj = (ScreenShareInfoObj) com.max.hbutils.utils.k.a(shareImageObj.getShare_info(), ScreenShareInfoObj.class);
            ScreenStyleInfoObj screenStyleInfoObj = (ScreenStyleInfoObj) com.max.hbutils.utils.k.a(shareImageObj.getStyle_info(), ScreenStyleInfoObj.class);
            String str4 = null;
            if (screenShareInfoObj != null) {
                PostConfigObj post_config = screenShareInfoObj.getPost_config();
                if (post_config != null) {
                    topic_infos = post_config.getTopic_infos();
                    zEquals = Boolean.TRUE.equals(post_config.getPost_now());
                    string = post_config.getImage_extra() != null ? post_config.getImage_extra().toString() : null;
                    default_content = post_config.getDefault_content();
                    hashtags = post_config.getHashtags();
                    tips = post_config.getTips();
                } else {
                    tips = null;
                    topic_infos = null;
                    string = null;
                    default_content = null;
                    hashtags = null;
                    zEquals = false;
                }
                DouYinConfig douyin_config = screenShareInfoObj.getDouyin_config();
                if (douyin_config != null) {
                    douyin_hashtag = douyin_config.getDouyin_hashtag();
                    douyin_bg_url = douyin_config.getDouyin_bg_url();
                } else {
                    douyin_bg_url = null;
                    douyin_hashtag = null;
                }
                boolean zX = com.max.hbcommon.utils.c.x(screenShareInfoObj.getSave_to_disk());
                ScreenReportObj report = screenShareInfoObj.getReport();
                if (report != null) {
                    String src = report.getSrc();
                    extra = report.getExtra();
                    String str5 = tips;
                    str = src;
                    str4 = douyin_hashtag;
                    z10 = zX;
                    str3 = string;
                    list = topic_infos;
                    str2 = str5;
                } else {
                    extra = null;
                    str4 = douyin_hashtag;
                    z10 = zX;
                    str3 = string;
                    list = topic_infos;
                    str2 = tips;
                    str = null;
                }
            } else {
                str = null;
                str2 = null;
                list = null;
                default_content = null;
                hashtags = null;
                douyin_bg_url = null;
                str3 = null;
                extra = null;
                zEquals = false;
                z10 = false;
            }
            if (!zEquals) {
                List<String> list2 = hashtags;
                ShareImageDialogFragment shareImageDialogFragmentX4 = ShareImageDialogFragment.x4();
                shareImageDialogFragmentX4.B4(arrayList);
                shareImageDialogFragmentX4.V4(false);
                if (screenShareInfoObj != null) {
                    shareImageDialogFragmentX4.Z4(list);
                    shareImageDialogFragmentX4.J4(str3);
                    shareImageDialogFragmentX4.G4(str4);
                    shareImageDialogFragmentX4.F4(douyin_bg_url);
                    shareImageDialogFragmentX4.S4(new com.max.hbshare.c.b(str, new a(), extra));
                    shareImageDialogFragmentX4.I4(list2);
                    shareImageDialogFragmentX4.E4(default_content);
                    shareImageDialogFragmentX4.M4(str2);
                }
                shareImageDialogFragmentX4.R4(screenStyleInfoObj);
                try {
                    shareImageDialogFragmentX4.show(fragmentManager, "TAG_SHARE_IMAGE");
                    return;
                } catch (Exception e10) {
                    com.max.heybox.hblog.g.G("ShareImpl " + e10.getMessage());
                    return;
                }
            }
            b(fragmentActivity, arrayList, z10, str3, list, hashtags);
        }
    }
}
