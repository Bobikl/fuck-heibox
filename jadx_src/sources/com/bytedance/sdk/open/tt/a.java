package com.bytedance.sdk.open.tt;

import android.os.Bundle;
import com.bytedance.sdk.open.aweme.base.MediaContent;
import com.bytedance.sdk.open.douyin.model.ContactHtmlObject;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: com.bytedance.sdk.open.tt.a$a, reason: collision with other inner class name */
    public static class C0351a extends k7.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f42265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public MediaContent f42266b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ContactHtmlObject f42267c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f42268d;

        public C0351a() {
        }

        public C0351a(Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // k7.a
        public void fromBundle(Bundle bundle) {
            this.callerPackage = bundle.getString(com.bytedance.sdk.open.tt.b.a.f42280k);
            this.extras = bundle.getBundle(com.bytedance.sdk.open.tt.b.a.f42274e);
            this.callerLocalEntry = bundle.getString(com.bytedance.sdk.open.tt.b.a.f42281l);
            this.f42265a = bundle.getString(com.bytedance.sdk.open.tt.b.a.f42272c);
            this.f42266b = MediaContent.Builder.fromBundle(bundle);
            this.f42267c = ContactHtmlObject.unserialize(bundle);
            this.f42268d = bundle.getString(com.bytedance.sdk.open.tt.b.a.f42273d, "");
        }

        @Override // k7.a
        public int getType() {
            return 5;
        }

        @Override // k7.a
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putInt(com.bytedance.sdk.open.tt.b.a.f42278i, getType());
            bundle.putBundle(com.bytedance.sdk.open.tt.b.a.f42274e, this.extras);
            bundle.putString(com.bytedance.sdk.open.tt.b.a.f42281l, this.callerLocalEntry);
            bundle.putString(com.bytedance.sdk.open.tt.b.a.f42273d, this.f42268d);
            bundle.putString(com.bytedance.sdk.open.tt.b.a.f42272c, this.f42265a);
            MediaContent mediaContent = this.f42266b;
            if (mediaContent != null) {
                bundle.putAll(MediaContent.Builder.toBundle(mediaContent));
            }
            ContactHtmlObject contactHtmlObject = this.f42267c;
            if (contactHtmlObject != null) {
                contactHtmlObject.serialize(bundle);
            }
        }
    }

    public static class b extends k7.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f42269a;

        public b() {
        }

        public b(Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // k7.b
        public void fromBundle(Bundle bundle) {
            this.errorCode = bundle.getInt(com.bytedance.sdk.open.tt.b.a.f42276g);
            this.errorMsg = bundle.getString(com.bytedance.sdk.open.tt.b.a.f42277h);
            this.extras = bundle.getBundle(com.bytedance.sdk.open.tt.b.a.f42274e);
            this.f42269a = bundle.getString(com.bytedance.sdk.open.tt.b.a.f42273d);
        }

        @Override // k7.b
        public int getType() {
            return 6;
        }

        @Override // k7.b
        public void toBundle(Bundle bundle) {
            bundle.putInt(com.bytedance.sdk.open.tt.b.a.f42276g, this.errorCode);
            bundle.putString(com.bytedance.sdk.open.tt.b.a.f42277h, this.errorMsg);
            bundle.putInt(com.bytedance.sdk.open.tt.b.a.f42278i, getType());
            bundle.putBundle(com.bytedance.sdk.open.tt.b.a.f42274e, this.extras);
        }
    }
}
