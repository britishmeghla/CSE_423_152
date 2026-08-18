package generated;

import generated.CacheListener;

/** LLM-generated reconstruction from the supplied description. */
import java.lang.ref.SoftReference;
public class SoftRefCacheLine {
    private final SoftReference<Object> value;
    public SoftRefCacheLine(Object value) { this.value=new SoftReference<>(value); }
    public Object get() { return value.get(); }
}
