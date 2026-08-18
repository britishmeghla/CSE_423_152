package generated;

import generated.ServiceConfigListener;

/** LLM-generated reconstruction from the supplied description. */
public class ServiceEcas {
    private final ServiceConfigListener listener;
    public ServiceEcas(ServiceConfigListener listener) { this.listener=listener; }
public String describe() { listener.onChange("eca"); return "service-eca"; }
}
