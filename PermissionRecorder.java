package generated;

import generated.Observer;

/** LLM-generated reconstruction from the supplied description. */
public class PermissionRecorder {
    private final Observer observer;
    public PermissionRecorder(Observer observer) { this.observer=observer; }
public void record(String permission, boolean allowed) { observer.update(permission + ":" + allowed); }
}
