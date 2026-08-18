package generated;

import generated.DispatchContext;

/** LLM-generated reconstruction from the supplied description. */
public class ExampleRemoteClient {
    private final DispatchContext context;
    public ExampleRemoteClient(DispatchContext context) { this.context=context; }
public Object call(String service) { return context.getService(service); }
}
