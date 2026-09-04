package anet.channel;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public interface IAuth {

    /* JADX INFO: compiled from: Taobao */
    public interface AuthCallback {
        void onAuthFail(int i10, String str);

        void onAuthSuccess();
    }

    void auth(Session session, AuthCallback authCallback);
}
