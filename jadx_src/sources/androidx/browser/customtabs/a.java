package androidx.browser.customtabs;

import android.os.Bundle;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.view.j1;

/* JADX INFO: compiled from: CustomTabColorSchemeParams.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    @p0
    public final Integer f3151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    @p0
    public final Integer f3152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l
    @p0
    public final Integer f3153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @l
    @p0
    public final Integer f3154d;

    /* JADX INFO: renamed from: androidx.browser.customtabs.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CustomTabColorSchemeParams.java */
    public static final class C0023a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @l
        @p0
        private Integer f3155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @l
        @p0
        private Integer f3156b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @l
        @p0
        private Integer f3157c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @l
        @p0
        private Integer f3158d;

        @n0
        public a a() {
            return new a(this.f3155a, this.f3156b, this.f3157c, this.f3158d);
        }

        @n0
        public C0023a b(@l int i10) {
            this.f3157c = Integer.valueOf(i10 | j1.f21601t);
            return this;
        }

        @n0
        public C0023a c(@l int i10) {
            this.f3158d = Integer.valueOf(i10);
            return this;
        }

        @n0
        public C0023a d(@l int i10) {
            this.f3156b = Integer.valueOf(i10);
            return this;
        }

        @n0
        public C0023a e(@l int i10) {
            this.f3155a = Integer.valueOf(i10 | j1.f21601t);
            return this;
        }
    }

    a(@l @p0 Integer num, @l @p0 Integer num2, @l @p0 Integer num3, @l @p0 Integer num4) {
        this.f3151a = num;
        this.f3152b = num2;
        this.f3153c = num3;
        this.f3154d = num4;
    }

    @n0
    static a a(@p0 Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle(0);
        }
        return new a((Integer) bundle.get(d.f3207k), (Integer) bundle.get(d.f3215s), (Integer) bundle.get(d.M), (Integer) bundle.get(d.Z));
    }

    @n0
    Bundle b() {
        Bundle bundle = new Bundle();
        Integer num = this.f3151a;
        if (num != null) {
            bundle.putInt(d.f3207k, num.intValue());
        }
        Integer num2 = this.f3152b;
        if (num2 != null) {
            bundle.putInt(d.f3215s, num2.intValue());
        }
        Integer num3 = this.f3153c;
        if (num3 != null) {
            bundle.putInt(d.M, num3.intValue());
        }
        Integer num4 = this.f3154d;
        if (num4 != null) {
            bundle.putInt(d.Z, num4.intValue());
        }
        return bundle;
    }

    @n0
    a c(@n0 a aVar) {
        Integer num = this.f3151a;
        if (num == null) {
            num = aVar.f3151a;
        }
        Integer num2 = this.f3152b;
        if (num2 == null) {
            num2 = aVar.f3152b;
        }
        Integer num3 = this.f3153c;
        if (num3 == null) {
            num3 = aVar.f3153c;
        }
        Integer num4 = this.f3154d;
        if (num4 == null) {
            num4 = aVar.f3154d;
        }
        return new a(num, num2, num3, num4);
    }
}
