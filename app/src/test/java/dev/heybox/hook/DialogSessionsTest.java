package dev.heybox.hook;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class DialogSessionsTest {
    private static final class Owner { boolean destroyed; }
    private static final class Window {
        final Owner owner;
        final Runnable dismissed;
        boolean closed;
        Window(Owner owner, Runnable dismissed) {
            this.owner = owner;
            this.dismissed = dismissed;
        }
    }
    private static final class Host implements DialogSessions.Host<Owner, Window> {
        final List<Window> windows = new ArrayList<>();
        int registered, unregistered;
        boolean failShow, failObserve;
        public boolean usable(Owner owner) { return !owner.destroyed; }
        public Window create(Owner owner, Runnable dismissed) {
            Window window = new Window(owner, dismissed);
            windows.add(window);
            return window;
        }
        public void show(Window window) {
            if (failShow) throw new IllegalStateException("show");
        }
        public void dismiss(Window window) {
            window.closed = true;
            window.dismissed.run();
        }
        public void observe() {
            if (failObserve) throw new IllegalStateException("observe");
            registered++;
        }
        public void stopObserving() { unregistered++; }
    }

    @Test public void repeatedOpenUsesSingleWindow() {
        Host host = new Host();
        DialogSessions<Owner, Window> sessions = new DialogSessions<>(host);
        Owner owner = new Owner();
        for (int i = 0; i < 50; i++) sessions.open(owner);
        assertEquals(1, host.windows.size());
        assertEquals(1, host.registered);
        host.dismiss(host.windows.get(0));
        assertEquals(1, host.unregistered);
    }

    @Test public void destroyingOneOwnerDoesNotCloseAnother() {
        Host host = new Host();
        DialogSessions<Owner, Window> sessions = new DialogSessions<>(host);
        Owner first = new Owner(), second = new Owner();
        sessions.open(first);
        sessions.open(second);
        first.destroyed = true;
        sessions.destroyed(first);
        assertTrue(host.windows.get(0).closed);
        assertFalse(host.windows.get(1).closed);
        assertEquals(0, host.unregistered);
        sessions.destroyed(second);
        assertTrue(host.windows.get(1).closed);
        assertEquals(1, host.unregistered);
        sessions.open(first);
        assertEquals(2, host.windows.size());
    }

    @Test public void staleDismissCannotRemoveNewWindow() {
        Host host = new Host();
        DialogSessions<Owner, Window> sessions = new DialogSessions<>(host);
        Owner owner = new Owner();
        sessions.open(owner);
        Window old = host.windows.get(0);
        host.dismiss(old);
        sessions.open(owner);
        old.dismissed.run();
        sessions.open(owner);
        assertEquals(2, host.windows.size());
        assertEquals(1, host.unregistered);
        host.dismiss(host.windows.get(1));
        assertEquals(2, host.unregistered);
    }

    @Test public void failedShowCleansUpAndAllowsRetry() {
        Host host = new Host();
        DialogSessions<Owner, Window> sessions = new DialogSessions<>(host);
        Owner owner = new Owner();
        host.failShow = true;
        assertThrows(IllegalStateException.class, () -> sessions.open(owner));
        assertTrue(host.windows.get(0).closed);
        assertEquals(1, host.unregistered);
        host.failShow = false;
        sessions.open(owner);
        assertEquals(2, host.windows.size());
        assertEquals(2, host.registered);
        host.dismiss(host.windows.get(1));
        assertEquals(2, host.unregistered);
    }

    @Test public void failedObserverRegistrationCleansWindowAndAllowsRetry() {
        Host host = new Host();
        DialogSessions<Owner, Window> sessions = new DialogSessions<>(host);
        Owner owner = new Owner();
        host.failObserve = true;
        assertThrows(IllegalStateException.class, () -> sessions.open(owner));
        assertTrue(host.windows.get(0).closed);
        assertEquals(0, host.unregistered);
        host.failObserve = false;
        sessions.open(owner);
        assertEquals(1, host.registered);
    }

    @Test public void newOwnerAfterDestructionIsSeparateSession() {
        Host host = new Host();
        DialogSessions<Owner, Window> sessions = new DialogSessions<>(host);
        Owner old = new Owner(), replacement = new Owner();
        sessions.open(old);
        sessions.destroyed(old);
        sessions.open(replacement);
        host.windows.get(0).dismissed.run();
        sessions.open(replacement);
        assertEquals(2, host.windows.size());
        assertEquals(2, host.registered);
        assertEquals(1, host.unregistered);
    }
}
