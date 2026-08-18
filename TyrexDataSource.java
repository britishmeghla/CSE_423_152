package generated;

import generated.GenericEntityConfException;
import generated.EntityStoreOptions;

/** LLM-generated reconstruction from the supplied description. */
public class TyrexDataSource {
    private final GenericEntityConfException configError;
    private final EntityStoreOptions options;
    public TyrexDataSource(EntityStoreOptions options) { this.options=options; this.configError=new GenericEntityConfException(); }
    public String getUrl() { return "jdbc:tyrex"; }

}
