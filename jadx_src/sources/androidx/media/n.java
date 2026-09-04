package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager;
import android.media.session.MediaSessionManager$RemoteUserInfo;
import androidx.annotation.w0;

/* JADX INFO: compiled from: MediaSessionManagerImplApi28.java */
/* JADX INFO: loaded from: classes6.dex */
@w0(28)
public class n extends m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    MediaSessionManager f24627h;

    /* JADX INFO: compiled from: MediaSessionManagerImplApi28.java */
    @w0(28)
    public static final class a extends o.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final MediaSessionManager$RemoteUserInfo f24628d;

        a(MediaSessionManager$RemoteUserInfo mediaSessionManager$RemoteUserInfo) {
            super(mediaSessionManager$RemoteUserInfo.getPackageName(), mediaSessionManager$RemoteUserInfo.getPid(), mediaSessionManager$RemoteUserInfo.getUid());
            this.f24628d = mediaSessionManager$RemoteUserInfo;
        }

        a(String str, int i10, int i11) {
            super(str, i10, i11);
            this.f24628d = new MediaSessionManager$RemoteUserInfo(str, i10, i11);
        }

        static String b(MediaSessionManager$RemoteUserInfo mediaSessionManager$RemoteUserInfo) {
            return mediaSessionManager$RemoteUserInfo.getPackageName();
        }
    }

    n(Context context) {
        super(context);
        this.f24627h = (MediaSessionManager) context.getSystemService("media_session");
    }

    @Override // androidx.media.m, androidx.media.o, androidx.media.l.a
    public boolean a(l.c cVar) {
        return super.a(cVar);
    }
}
