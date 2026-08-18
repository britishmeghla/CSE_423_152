package generated;

import generated.ServiceConfigListener;

/** LLM-generated reconstruction from the supplied description. */
public class ResourceLoader {
    private final ServiceConfigListener listener;
    public ResourceLoader(ServiceConfigListener listener) { this.listener=listener; }
public String load(String resource) { listener.onChange(resource); return resource; }
}
