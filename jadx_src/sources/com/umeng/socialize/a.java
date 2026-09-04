package com.umeng.socialize;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.common.QueuedWork;
import com.umeng.socialize.common.SocializeConstants;
import com.umeng.socialize.handler.UMSSOHandler;
import com.umeng.socialize.uploadlog.UMLog;
import com.umeng.socialize.utils.ContextUtil;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.SocializeSpUtils;
import com.umeng.socialize.utils.SocializeUtils;
import com.umeng.socialize.utils.UmengText;
import com.umeng.socialize.utils.UrlUtil;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: UMShareImpl.java */
/* JADX INFO: loaded from: classes4.dex */
public class a extends UMShareAPI {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.umeng.socialize.b.a f106048a;

    /* JADX INFO: renamed from: com.umeng.socialize.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: UMShareImpl.java */
    public static class C1054a extends QueuedWork.UMAsyncTask<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f106065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f106066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f106067c = SocializeUtils.isHasDplusCache();

        public C1054a(Context context) {
            this.f106065a = context;
            this.f106066b = SocializeUtils.isToday(SocializeSpUtils.getTime(context));
        }

        private boolean b() {
            return this.f106065a.getSharedPreferences(SocializeConstants.SOCIAL_PREFERENCE_NAME, 0).getBoolean("newinstall", false);
        }

        private void c() {
            SharedPreferences.Editor editorEdit = this.f106065a.getSharedPreferences(SocializeConstants.SOCIAL_PREFERENCE_NAME, 0).edit();
            editorEdit.putBoolean("newinstall", true);
            editorEdit.commit();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.umeng.socialize.common.QueuedWork.UMAsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground() {
            return null;
        }
    }

    protected a(Context context) {
        ContextUtil.setContext(context.getApplicationContext());
        this.f106048a = new com.umeng.socialize.b.a(context.getApplicationContext());
        String currentProcessName = UMFrUtils.getCurrentProcessName(context);
        if (TextUtils.isEmpty(currentProcessName) || !currentProcessName.equals(ContextUtil.getPackageName())) {
            return;
        }
        new C1054a(context.getApplicationContext()).execute();
    }

    private boolean a(Activity activity, SHARE_MEDIA share_media) {
        boolean z10 = false;
        for (Method method : activity.getClass().getDeclaredMethods()) {
            if (method.getName().equals("onActivityResult")) {
                z10 = true;
            }
        }
        if (!z10) {
            SLog.mutlE(UmengText.CHECK.ALL_NO_ONACTIVITY, UrlUtil.ALL_NO_ONACTIVITY);
        }
        if (share_media == SHARE_MEDIA.QQ) {
            SLog.E(UmengTool.checkQQByself(activity));
            return true;
        }
        if (share_media == SHARE_MEDIA.WEIXIN) {
            SLog.E(UmengTool.checkWxBySelf(activity));
            return true;
        }
        if (share_media == SHARE_MEDIA.SINA) {
            SLog.E(UmengTool.checkSinaBySelf(activity));
            return true;
        }
        if (share_media == SHARE_MEDIA.FACEBOOK) {
            SLog.E(UmengTool.checkFBByself(activity));
            return true;
        }
        if (share_media == SHARE_MEDIA.VKONTAKTE) {
            SLog.E(UmengTool.checkVKByself(activity));
        }
        if (share_media == SHARE_MEDIA.LINKEDIN) {
            SLog.E(UmengTool.checkLinkin(activity));
        }
        if (share_media == SHARE_MEDIA.KAKAO) {
            SLog.E(UmengTool.checkKakao(activity));
        }
        return true;
    }

    @Override // com.umeng.socialize.UMShareAPI
    public void deleteOauth(final Activity activity, final SHARE_MEDIA share_media, final UMAuthListener uMAuthListener) {
        if (activity != null) {
            new QueuedWork.DialogThread<Void>(activity) { // from class: com.umeng.socialize.a.2
                @Override // com.umeng.socialize.common.QueuedWork.UMAsyncTask
                protected Object doInBackground() {
                    a.this.f106048a.a(activity, share_media, uMAuthListener);
                    return null;
                }
            }.execute();
        } else {
            SLog.E(UmengText.CHECK.ACTIVITYNULL);
        }
    }

    @Override // com.umeng.socialize.UMShareAPI
    public void doOauthVerify(final Activity activity, final SHARE_MEDIA share_media, final UMAuthListener uMAuthListener) {
        UMLog.putAuth();
        if (!UMConfigure.getInitStatus()) {
            SLog.selfLog(UmengText.CHECK.NOINT);
            return;
        }
        if (!SLog.isDebug() || a(activity, share_media)) {
            if (activity != null) {
                new QueuedWork.DialogThread<Void>(activity) { // from class: com.umeng.socialize.a.1
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.umeng.socialize.common.QueuedWork.UMAsyncTask
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public Void doInBackground() {
                        a.this.f106048a.c(activity, share_media, uMAuthListener);
                        return null;
                    }
                }.execute();
            } else {
                SLog.E(UmengText.CHECK.ACTIVITYNULL);
            }
        }
    }

    @Override // com.umeng.socialize.UMShareAPI
    public void doShare(Activity activity, final ShareAction shareAction, final UMShareListener uMShareListener) {
        UMLog.putShare();
        if (!UMConfigure.getInitStatus()) {
            SLog.selfLog(UmengText.CHECK.NOINT);
            return;
        }
        final WeakReference weakReference = new WeakReference(activity);
        if (SLog.isDebug()) {
            if (!a(activity, shareAction.getPlatform())) {
                return;
            } else {
                UrlUtil.sharePrint(shareAction.getPlatform());
            }
        }
        if (weakReference.get() == null || ((Activity) weakReference.get()).isFinishing()) {
            SLog.E(UmengText.CHECK.ACTIVITYNULL);
        } else {
            new QueuedWork.DialogThread<Void>((Context) weakReference.get()) { // from class: com.umeng.socialize.a.4
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.umeng.socialize.common.QueuedWork.UMAsyncTask
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Void doInBackground() {
                    if (weakReference.get() != null && !((Activity) weakReference.get()).isFinishing()) {
                        a.this.f106048a.a((Activity) weakReference.get(), shareAction, uMShareListener);
                    }
                    return null;
                }
            }.execute();
        }
    }

    @Override // com.umeng.socialize.UMShareAPI
    public void fetchAuthResultWithBundle(Activity activity, Bundle bundle, UMAuthListener uMAuthListener) {
        this.f106048a.a(activity, bundle, uMAuthListener);
    }

    @Override // com.umeng.socialize.UMShareAPI
    public UMSSOHandler getHandler(SHARE_MEDIA share_media) {
        com.umeng.socialize.b.a aVar = this.f106048a;
        if (aVar != null) {
            return aVar.a(share_media);
        }
        return null;
    }

    @Override // com.umeng.socialize.UMShareAPI
    public void getPlatformInfo(final Activity activity, final SHARE_MEDIA share_media, final UMAuthListener uMAuthListener) {
        if (activity == null) {
            SLog.E(UmengText.CHECK.ACTIVITYNULL);
            return;
        }
        if (!UMConfigure.getInitStatus()) {
            SLog.selfLog(UmengText.CHECK.NOINT);
            return;
        }
        UMLog.putAuth();
        if (SLog.isDebug()) {
            if (!a(activity, share_media)) {
                return;
            } else {
                UrlUtil.getInfoPrint(share_media);
            }
        }
        new QueuedWork.DialogThread<Void>(activity) { // from class: com.umeng.socialize.a.3
            @Override // com.umeng.socialize.common.QueuedWork.UMAsyncTask
            protected Object doInBackground() {
                a.this.f106048a.b(activity, share_media, uMAuthListener);
                return null;
            }
        }.execute();
    }

    @Override // com.umeng.socialize.UMShareAPI
    public String getversion(Activity activity, SHARE_MEDIA share_media) {
        return this.f106048a.c(activity, share_media);
    }

    @Override // com.umeng.socialize.UMShareAPI
    public boolean isAuthorize(Activity activity, SHARE_MEDIA share_media) {
        return this.f106048a.d(activity, share_media);
    }

    @Override // com.umeng.socialize.UMShareAPI
    public boolean isInstall(Activity activity, SHARE_MEDIA share_media) {
        return this.f106048a.a(activity, share_media);
    }

    @Override // com.umeng.socialize.UMShareAPI
    public boolean isSupport(Activity activity, SHARE_MEDIA share_media) {
        return this.f106048a.b(activity, share_media);
    }

    @Override // com.umeng.socialize.UMShareAPI
    public void onActivityResult(int i10, int i11, Intent intent) {
        com.umeng.socialize.b.a aVar = this.f106048a;
        if (aVar != null) {
            aVar.a(i10, i11, intent);
        } else {
            SLog.E(UmengText.CHECK.ROUTERNULL);
        }
        SLog.I(UmengText.CHECK.getActivityResult(i10, i11));
    }

    @Override // com.umeng.socialize.UMShareAPI
    public void onSaveInstanceState(Bundle bundle) {
        this.f106048a.a(bundle);
    }

    @Override // com.umeng.socialize.UMShareAPI
    public void release() {
        this.f106048a.a();
    }

    @Override // com.umeng.socialize.UMShareAPI
    public void setShareConfig(UMShareConfig uMShareConfig) {
        this.f106048a.a(uMShareConfig);
    }
}
