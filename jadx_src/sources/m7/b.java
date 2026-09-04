package m7;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import com.bytedance.sdk.open.aweme.base.AnchorObject;
import com.bytedance.sdk.open.aweme.base.MediaContent;
import com.bytedance.sdk.open.aweme.base.MicroAppInfo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f131448a = "Aweme.OpenSDK.Share";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f131449b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f131450c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f131451d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f131452e = 2;

    public static class a extends k7.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f131453a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f131454b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList<String> f131455c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public MediaContent f131456d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public MicroAppInfo f131457e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public AnchorObject f131458f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f131459g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f131460h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f131461i;

        public a() {
        }

        public a(Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // k7.a
        @SuppressLint({"MissingSuperCall"})
        public boolean checkArgs() {
            MediaContent mediaContent = this.f131456d;
            if (mediaContent != null) {
                return mediaContent.checkArgs();
            }
            Log.e(b.f131448a, "checkArgs fail ,mediaContent is null");
            return false;
        }

        @Override // k7.a
        @SuppressLint({"MissingSuperCall"})
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.f131459g = bundle.getString(i7.a.f.f119286c);
            this.callerLocalEntry = bundle.getString(i7.a.f.f119288e);
            this.f131461i = bundle.getString(i7.a.f.f119284a);
            this.f131460h = bundle.getString(i7.a.f.f119285b);
            this.f131453a = bundle.getInt(i7.a.f.f119289f, 0);
            this.f131455c = bundle.getStringArrayList(i7.a.f.f119291h);
            this.f131456d = MediaContent.Builder.fromBundle(bundle);
            this.f131457e = MicroAppInfo.unserialize(bundle);
            this.f131458f = AnchorObject.unserialize(bundle);
        }

        @Override // k7.a
        public int getType() {
            return 3;
        }

        @Override // k7.a
        @SuppressLint({"MissingSuperCall"})
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString(i7.a.f.f119288e, this.callerLocalEntry);
            bundle.putString(i7.a.f.f119285b, this.f131460h);
            bundle.putString(i7.a.f.f119286c, this.f131459g);
            if (this.f131454b) {
                bundle.putInt(i7.a.f.f119289f, 2);
            } else {
                bundle.putInt(i7.a.f.f119289f, 0);
            }
            bundle.putString(i7.a.f.f119284a, this.f131461i);
            MediaContent mediaContent = this.f131456d;
            if (mediaContent != null) {
                bundle.putAll(MediaContent.Builder.toBundle(mediaContent));
            }
            ArrayList<String> arrayList = this.f131455c;
            if (arrayList != null && arrayList.size() > 0) {
                bundle.putString(i7.a.f.f119290g, this.f131455c.get(0));
                bundle.putStringArrayList(i7.a.f.f119291h, this.f131455c);
            }
            MicroAppInfo microAppInfo = this.f131457e;
            if (microAppInfo != null) {
                microAppInfo.serialize(bundle);
            }
            AnchorObject anchorObject = this.f131458f;
            if (anchorObject != null) {
                anchorObject.serialize(bundle);
            }
        }
    }

    /* JADX INFO: renamed from: m7.b$b, reason: collision with other inner class name */
    public static class C1201b extends k7.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f131462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f131463b;

        public C1201b() {
        }

        public C1201b(Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // k7.b
        @SuppressLint({"MissingSuperCall"})
        public void fromBundle(Bundle bundle) {
            this.errorCode = bundle.getInt(i7.a.f.f119294k);
            this.errorMsg = bundle.getString(i7.a.f.f119295l);
            this.extras = bundle.getBundle(i7.a.b.f119253b);
            this.f131462a = bundle.getString(i7.a.f.f119284a);
            this.f131463b = bundle.getInt(i7.a.f.f119296m, -1000);
        }

        @Override // k7.b
        public int getType() {
            return 4;
        }

        @Override // k7.b
        @SuppressLint({"MissingSuperCall"})
        public void toBundle(Bundle bundle) {
            bundle.putInt(i7.a.f.f119294k, this.errorCode);
            bundle.putString(i7.a.f.f119295l, this.errorMsg);
            bundle.putInt(i7.a.f.f119293j, getType());
            bundle.putBundle(i7.a.b.f119253b, this.extras);
            bundle.putString(i7.a.f.f119284a, this.f131462a);
            bundle.putInt(i7.a.f.f119296m, this.f131463b);
        }
    }
}
