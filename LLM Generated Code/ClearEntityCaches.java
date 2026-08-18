package generated;

import generated.MiniLangException;
import generated.CacheListener;

/** LLM-generated reconstruction from the supplied description. */
public class ClearEntityCaches {
    private final MiniLangException error = new MiniLangException("cache error");
    private final CacheListener listener;
    public ClearEntityCaches(CacheListener listener) { this.listener=listener; }
public void clear() { listener.onChange("all"); }
}
