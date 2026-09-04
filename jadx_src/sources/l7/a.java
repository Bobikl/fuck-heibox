package l7;

import android.annotation.SuppressLint;
import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f130899a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f130900b = 2;

    /* JADX INFO: renamed from: l7.a$a, reason: collision with other inner class name */
    public static class C1198a extends k7.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f130901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f130902b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f130903c;

        public C1198a() {
        }

        public C1198a(Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // k7.a
        public boolean checkArgs() {
            if (this.f130902b <= 0) {
                return false;
            }
            return super.checkArgs();
        }

        @Override // k7.a
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.f130901a = bundle.getString(i7.a.c.f119265c);
            this.f130902b = bundle.getInt(i7.a.c.f119263a);
            this.f130903c = bundle.getString(i7.a.c.f119267e);
        }

        @Override // k7.a
        public int getType() {
            return 9;
        }

        @Override // k7.a
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString(i7.a.b.f119257f, this.callerPackage);
            bundle.putString(i7.a.c.f119265c, this.f130901a);
            bundle.putInt(i7.a.c.f119263a, this.f130902b);
            bundle.putString(i7.a.c.f119267e, this.f130903c);
        }
    }

    public static class b extends k7.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f130904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f130905b;

        public b() {
        }

        public b(Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // k7.b
        @SuppressLint({"MissingSuperCall"})
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.f130904a = bundle.getString(i7.a.c.f119265c);
            this.f130905b = bundle.getInt(i7.a.c.f119263a);
        }

        @Override // k7.b
        public int getType() {
            return 10;
        }

        @Override // k7.b
        @SuppressLint({"MissingSuperCall"})
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString(i7.a.c.f119265c, this.f130904a);
            bundle.putInt(i7.a.c.f119263a, this.f130905b);
        }
    }

    public static int a(int i10) {
        return (i10 == 1 || i10 == 2) ? 1 : Integer.MAX_VALUE;
    }
}
