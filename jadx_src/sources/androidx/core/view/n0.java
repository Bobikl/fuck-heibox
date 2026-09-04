package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;

/* JADX INFO: compiled from: Menu.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
public final class n0 {

    /* JADX INFO: compiled from: Menu.kt */
    public static final class a implements kotlin.sequences.m<MenuItem> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Menu f21704a;

        a(Menu menu) {
            this.f21704a = menu;
        }

        @Override // kotlin.sequences.m
        @dl.d
        public Iterator<MenuItem> iterator() {
            return n0.i(this.f21704a);
        }
    }

    /* JADX INFO: compiled from: Menu.kt */
    @kotlin.jvm.internal.t0({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt$iterator$1\n+ 2 Menu.kt\nandroidx/core/view/MenuKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n83#2:91\n1#3:92\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt$iterator$1\n*L\n74#1:91\n74#1:92\n*E\n"})
    public static final class b implements Iterator<MenuItem>, zh.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f21705b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Menu f21706c;

        b(Menu menu) {
            this.f21706c = menu;
        }

        @Override // java.util.Iterator
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MenuItem next() {
            Menu menu = this.f21706c;
            int i10 = this.f21705b;
            this.f21705b = i10 + 1;
            MenuItem item = menu.getItem(i10);
            if (item != null) {
                return item;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21705b < this.f21706c.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            kotlin.b2 b2Var;
            Menu menu = this.f21706c;
            int i10 = this.f21705b - 1;
            this.f21705b = i10;
            MenuItem item = menu.getItem(i10);
            if (item != null) {
                kotlin.jvm.internal.f0.o(item, "getItem(index)");
                menu.removeItem(item.getItemId());
                b2Var = kotlin.b2.f124493a;
            } else {
                b2Var = null;
            }
            if (b2Var == null) {
                throw new IndexOutOfBoundsException();
            }
        }
    }

    public static final boolean a(@dl.d Menu menu, @dl.d MenuItem item) {
        kotlin.jvm.internal.f0.p(menu, "<this>");
        kotlin.jvm.internal.f0.p(item, "item");
        int size = menu.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (kotlin.jvm.internal.f0.g(menu.getItem(i10), item)) {
                return true;
            }
        }
        return false;
    }

    public static final void b(@dl.d Menu menu, @dl.d yh.l<? super MenuItem, kotlin.b2> action) {
        kotlin.jvm.internal.f0.p(menu, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        int size = menu.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = menu.getItem(i10);
            kotlin.jvm.internal.f0.o(item, "getItem(index)");
            action.invoke(item);
        }
    }

    public static final void c(@dl.d Menu menu, @dl.d yh.p<? super Integer, ? super MenuItem, kotlin.b2> action) {
        kotlin.jvm.internal.f0.p(menu, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        int size = menu.size();
        for (int i10 = 0; i10 < size; i10++) {
            Integer numValueOf = Integer.valueOf(i10);
            MenuItem item = menu.getItem(i10);
            kotlin.jvm.internal.f0.o(item, "getItem(index)");
            action.invoke(numValueOf, item);
        }
    }

    @dl.d
    public static final MenuItem d(@dl.d Menu menu, int i10) {
        kotlin.jvm.internal.f0.p(menu, "<this>");
        MenuItem item = menu.getItem(i10);
        kotlin.jvm.internal.f0.o(item, "getItem(index)");
        return item;
    }

    @dl.d
    public static final kotlin.sequences.m<MenuItem> e(@dl.d Menu menu) {
        kotlin.jvm.internal.f0.p(menu, "<this>");
        return new a(menu);
    }

    public static final int f(@dl.d Menu menu) {
        kotlin.jvm.internal.f0.p(menu, "<this>");
        return menu.size();
    }

    public static final boolean g(@dl.d Menu menu) {
        kotlin.jvm.internal.f0.p(menu, "<this>");
        return menu.size() == 0;
    }

    public static final boolean h(@dl.d Menu menu) {
        kotlin.jvm.internal.f0.p(menu, "<this>");
        return menu.size() != 0;
    }

    @dl.d
    public static final Iterator<MenuItem> i(@dl.d Menu menu) {
        kotlin.jvm.internal.f0.p(menu, "<this>");
        return new b(menu);
    }

    public static final void j(@dl.d Menu menu, @dl.d MenuItem item) {
        kotlin.jvm.internal.f0.p(menu, "<this>");
        kotlin.jvm.internal.f0.p(item, "item");
        menu.removeItem(item.getItemId());
    }

    public static final void k(@dl.d Menu menu, int i10) {
        kotlin.b2 b2Var;
        kotlin.jvm.internal.f0.p(menu, "<this>");
        MenuItem item = menu.getItem(i10);
        if (item != null) {
            menu.removeItem(item.getItemId());
            b2Var = kotlin.b2.f124493a;
        } else {
            b2Var = null;
        }
        if (b2Var == null) {
            throw new IndexOutOfBoundsException();
        }
    }
}
