package com.max.xiaoheihe.module.video;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.utils.c;
import com.max.hbutils.utils.t;
import com.max.video.AbsVideoView;
import com.max.video.player.VideoPlayerManager;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes12.dex */
public class VideoActivity extends BaseActivity {
    private static final String N = "url";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String L;
    private NetworkStateReceiver M;

    @BindView(R.id.video_view)
    AbsVideoView mVideoView;

    public class NetworkStateReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        NetworkStateReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 46223, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported) {
                return;
            }
            VideoPlayerManager.f76079a.d(((BaseActivity) VideoActivity.this).f66601b);
        }
    }

    public static Intent N1(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 46219, new Class[]{Context.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) VideoActivity.class);
        intent.putExtra("url", str);
        return intent;
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46220, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_video);
        getWindow().setFormat(-3);
        ButterKnife.a(this);
        t.Z(this.f66601b, 0, null);
        String stringExtra = getIntent().getStringExtra("url");
        this.L = stringExtra;
        if (c.u(stringExtra)) {
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(getString(R.string.fail));
            finish();
        } else {
            NetworkStateReceiver networkStateReceiver = new NetworkStateReceiver();
            this.M = networkStateReceiver;
            t1(networkStateReceiver, "android.net.conn.CONNECTIVITY_CHANGE");
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46222, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        NetworkStateReceiver networkStateReceiver = this.M;
        if (networkStateReceiver != null) {
            this.f66601b.unregisterReceiver(networkStateReceiver);
        }
        super.onDestroy();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46221, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStop();
    }
}
